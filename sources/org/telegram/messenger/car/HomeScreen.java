package org.telegram.messenger.car;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.messaging.model.CarMessage;
import androidx.car.app.messaging.model.ConversationCallback;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Tab;
import androidx.car.app.model.TabContents;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.model.Template;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public class HomeScreen extends Screen implements DefaultLifecycleObserver, NotificationCenter.NotificationCenterDelegate {
    private String activeTabId;
    private int currentAccount;
    private boolean musicLoadKicked;
    private final long sessionStartMillis;

    @Override
    public void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override
    public void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override
    public void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    public HomeScreen(CarContext carContext) {
        super(carContext);
        this.activeTabId = "tab_notifications";
        this.sessionStartMillis = System.currentTimeMillis();
        this.currentAccount = UserConfig.selectedAccount;
        getLifecycle().addObserver(this);
    }

    @Override
    public void onResume(LifecycleOwner lifecycleOwner) {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.activeAccountChanged);
    }

    @Override
    public void onPause(LifecycleOwner lifecycleOwner) {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.activeAccountChanged);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.activeAccountChanged) {
            this.currentAccount = UserConfig.selectedAccount;
            this.musicLoadKicked = false;
            invalidate();
        } else if ((i == NotificationCenter.pushMessagesUpdated || i == NotificationCenter.notificationsCountUpdated) && "tab_notifications".equals(this.activeTabId)) {
            invalidate();
        }
    }

    @Override
    public Template onGetTemplate() {
        TabTemplate.Builder builder = new TabTemplate.Builder(new TabTemplate.TabCallback() {
            @Override
            public void onTabSelected(String str) {
                HomeScreen.this.activeTabId = str;
                HomeScreen.this.invalidate();
            }
        });
        builder.setHeaderAction(Action.APP_ICON);
        builder.addTab(new Tab.Builder().setContentId("tab_notifications").setIcon(iconResource(R.drawable.msg_notifications)).setTitle(LocaleController.getString(R.string.Notifications)).build());
        builder.addTab(new Tab.Builder().setContentId("tab_music").setIcon(iconResource(R.drawable.filled_widget_music)).setTitle(LocaleController.getString(R.string.Music)).build());
        builder.setActiveTabContentId(this.activeTabId);
        builder.setTabContents(new TabContents.Builder(buildTabContent(this.activeTabId)).build());
        return builder.build();
    }

    private Template buildTabContent(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -2006925890) {
            str.equals("tab_notifications");
        } else if (iHashCode == 1942637819 && str.equals("tab_music")) {
            return buildMusicTemplate();
        }
        return buildNotificationsTemplate();
    }

    private Template buildNotificationsTemplate() {
        Map mapCollectUnreadDuringDrive = collectUnreadDuringDrive();
        if (mapCollectUnreadDuringDrive.isEmpty()) {
            return new MessageTemplate.Builder(LocaleController.getString(R.string.NoNewCarMessages)).build();
        }
        ItemList.Builder builder = new ItemList.Builder();
        int i = 0;
        for (Map.Entry entry : mapCollectUnreadDuringDrive.entrySet()) {
            int i2 = i + 1;
            if (i >= 6) {
                break;
            }
            ConversationItem conversationItemBuildConversationItem = buildConversationItem(((Long) entry.getKey()).longValue(), (ArrayList) entry.getValue());
            if (conversationItemBuildConversationItem != null) {
                builder.addItem(conversationItemBuildConversationItem);
            }
            i = i2;
        }
        return new ListTemplate.Builder().setSingleList(builder.build()).build();
    }

    private Map collectUnreadDuringDrive() {
        TLRPC.Message message;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<MessageObject> pushMessagesSnapshot = NotificationsController.getInstance(this.currentAccount).getPushMessagesSnapshot();
        long j = this.sessionStartMillis / 1000;
        Iterator<MessageObject> it = pushMessagesSnapshot.iterator();
        while (it.hasNext()) {
            MessageObject next = it.next();
            if (next != null && (message = next.messageOwner) != null && message.date >= j) {
                long dialogId = next.getDialogId();
                if (!DialogObject.isEncryptedDialog(dialogId) && !UserObject.isReplyUser(dialogId)) {
                    ArrayList arrayList = (ArrayList) linkedHashMap.get(Long.valueOf(dialogId));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(Long.valueOf(dialogId), arrayList);
                    }
                    arrayList.add(next);
                }
            }
        }
        return linkedHashMap;
    }

    private androidx.car.app.messaging.model.ConversationItem buildConversationItem(long r20, java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.car.HomeScreen.buildConversationItem(long, java.util.ArrayList):androidx.car.app.messaging.model.ConversationItem");
    }

    private CarMessage buildCarMessage(MessageObject messageObject, long j, boolean z, TLRPC.User user, TLRPC.Chat chat) {
        String string;
        String[] strArr = new String[1];
        try {
            string = NotificationsController.getInstance(this.currentAccount).getShortStringForMessage(messageObject, strArr, new boolean[1]);
        } catch (Throwable unused) {
            CharSequence charSequence = messageObject.messageText;
            string = charSequence != null ? charSequence.toString() : "";
        }
        if (string == null) {
            return null;
        }
        Person.Builder builder = new Person.Builder();
        String str = strArr[0];
        if (str != null) {
            builder.setName(str).setKey("u" + messageObject.getSenderId());
        } else if (DialogObject.isUserDialog(j) && user != null) {
            builder.setName(ContactsController.formatName(user.first_name, user.last_name)).setKey("u" + user.id);
        } else if (chat != null) {
            String str2 = chat.title;
            builder.setName(str2 != null ? str2 : "").setKey("c" + chat.id);
        } else {
            builder.setName("");
        }
        return new CarMessage.Builder().setBody(CarText.create(string)).setReceivedTimeEpochMillis(messageObject.messageOwner.date * 1000).setSender(builder.build()).setRead(false).build();
    }

    private androidx.car.app.model.Template buildMusicTemplate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.car.HomeScreen.buildMusicTemplate():androidx.car.app.model.Template");
    }

    public void lambda$buildMusicTemplate$0(long j, String str) {
        getScreenManager().push(new MusicSongsScreen(getCarContext(), j, str));
    }

    private CarIcon iconResource(int i) {
        return new CarIcon.Builder(IconCompat.createWithResource(getCarContext(), i)).build();
    }

    private IconCompat loadAvatarIcon(TLRPC.User user, TLRPC.Chat chat) {
        TLRPC.FileLocation fileLocation;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (user != null && (userProfilePhoto = user.photo) != null) {
            fileLocation = userProfilePhoto.photo_small;
        } else {
            fileLocation = (chat == null || (chatPhoto = chat.photo) == null) ? null : chatPhoto.photo_small;
        }
        return iconFromAvatar(fileLocation);
    }

    private IconCompat loadUserAvatarIcon(TLRPC.User user) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (user == null || (userProfilePhoto = user.photo) == null) {
            return null;
        }
        return iconFromAvatar(userProfilePhoto.photo_small);
    }

    private IconCompat iconFromAvatar(TLRPC.FileLocation fileLocation) {
        if (fileLocation != null && !(fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(fileLocation, true);
                if (!pathToAttach.exists()) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options);
                if (bitmapDecodeFile == null) {
                    return null;
                }
                Bitmap bitmapMakeRound = makeRound(bitmapDecodeFile);
                if (bitmapMakeRound != null) {
                    bitmapDecodeFile = bitmapMakeRound;
                }
                return IconCompat.createWithBitmap(bitmapDecodeFile);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private Bitmap makeRound(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), paint);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    static final class TelegramConversationCallback implements ConversationCallback {
        private final int currentAccount;
        private final long dialogId;
        private final int maxId;

        TelegramConversationCallback(int i, long j, int i2) {
            this.currentAccount = i;
            this.dialogId = j;
            this.maxId = i2;
        }

        @Override
        public void onMarkAsRead() {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onMarkAsRead$0();
                }
            });
        }

        public void lambda$onMarkAsRead$0() {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j = this.dialogId;
            int i = this.maxId;
            messagesController.markDialogAsRead(j, i, i, 0, false, 0L, 0, true, 0);
            MessagesController.getInstance(this.currentAccount).markReactionsAsRead(this.dialogId, 0L);
        }

        @Override
        public void onTextReply(final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onTextReply$1(str);
                }
            });
        }

        public void lambda$onTextReply$1(String str) {
            AccountInstance.getInstance(this.currentAccount).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, this.dialogId, null, null, null, true, null, null, null, true, 0, 0, null, false));
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j = this.dialogId;
            int i = this.maxId;
            messagesController.markDialogAsRead(j, i, i, 0, false, 0L, 0, true, 0);
        }
    }
}
