package org.telegram.messenger.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.dynamite.zzk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.TopicsSubscriber;
import com.google.firebase.messaging.WakeLockHolder;
import com.google.firebase.messaging.WithinAppServiceConnection;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionEvents;
import com.google.mlkit.vision.label.ImageLabel;
import com.google.mlkit.vision.segmentation.subject.Subject;
import com.google.mlkit.vision.segmentation.subject.SubjectSegmentationResult;
import com.stripe.android.Stripe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.OpeningHoursDayActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Business.QuickRepliesController$$ExternalSyntheticLambda22;
import org.telegram.ui.Business.TimezoneSelector;
import org.telegram.ui.Cells.ActiveGiftAuctionsHintCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.Paint.ObjectDetectionEmojis;
import org.telegram.ui.Components.Paint.PaintTypeface$LazyTypeface$LazyTypefaceLoader;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.StealthModeAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda2;
import org.telegram.ui.web.MHTML;

public final class WindowVisibilityManager$$ExternalSyntheticLambda0 implements Continuation, ComponentFactory, OnSuccessListener, OnCompleteListener, Transformer, FactorAnimator.Target, Vector.TLDeserializer, Utilities.Callback5, AlertDialog.OnButtonClickListener, CountdownTimer.Callback, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, CheckBoxBase.ProgressDelegate, Utilities.Callback2Return, RecyclerListView.OnItemLongClickListener, PaintTypeface$LazyTypeface$LazyTypefaceLoader, StoryEntry.DecodeBitmap {
    public final int $r8$classId;
    public final Object f$0;

    public WindowVisibilityManager$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public Object apply(Object obj) {
        ((Stripe.AnonymousClass1) this.f$0).getClass();
        String strEncode = SessionEvents.SESSION_EVENT_ENCODER.encode((SessionEvent) obj);
        Intrinsics.checkNotNullExpressionValue(strEncode, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(strEncode));
        byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public Object create(MHTML mhtml) {
        return new DefaultHeartBeatController((Context) mhtml.get(Context.class), ((FirebaseApp) mhtml.get(FirebaseApp.class)).getPersistenceKey(), mhtml.setOf(zzk.class), mhtml.getProvider(DefaultUserAgentPublisher.class), (Executor) mhtml.get((Qualified) this.f$0));
    }

    @Override
    public Bitmap decode(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f$0, options);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.$r8$classId) {
            case 10:
                return ((TLRPC.TL_stickerSet) this.f$0).lambda$readParams$0(inputSerializedData, i, z);
            default:
                return ((TLRPC.TL_stickerSet_layer143) this.f$0).lambda$readParams$0(inputSerializedData, i, z);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        switch (this.$r8$classId) {
            case 17:
                ((ChatActionCell) this.f$0).lambda$new$0(imageReceiver, z, z2, z3);
                break;
            default:
                ((SharedPhotoVideoCell2) this.f$0).lambda$new$0(imageReceiver, z, z2, z3);
                break;
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        int i2 = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public Typeface load() {
        return Typeface.createFromFile(((Font) this.f$0).getFile());
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 14:
                QuickRepliesActivity quickRepliesActivity = QuickRepliesActivity.this;
                QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(((BaseFragment) quickRepliesActivity).currentAccount);
                ArrayList arrayList = quickRepliesActivity.selected;
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    if (quickRepliesController.findReply(((Integer) arrayList.get(i2)).intValue()) == null) {
                        arrayList.remove(i2);
                        i2--;
                    }
                    i2++;
                }
                if (!arrayList.isEmpty()) {
                    int i3 = 0;
                    while (true) {
                        int size = arrayList.size();
                        int i4 = quickRepliesController.currentAccount;
                        if (i3 < size) {
                            QuickRepliesController.QuickReply quickReplyFindReply = quickRepliesController.findReply(((Integer) arrayList.get(i3)).intValue());
                            quickRepliesController.replies.remove(quickReplyFindReply);
                            quickRepliesController.deleteLocalReply(quickReplyFindReply.name);
                            TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                            tL_messages_deleteQuickReplyShortcut.shortcut_id = quickReplyFindReply.id;
                            ConnectionsManager.getInstance(i4).sendRequest(tL_messages_deleteQuickReplyShortcut, new StealthModeAlert$$ExternalSyntheticLambda3(3));
                            if ("hello".equals(quickReplyFindReply.name)) {
                                ConnectionsManager.getInstance(i4).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                                TLRPC.UserFull userFull = MessagesController.getInstance(i4).getUserFull(UserConfig.getInstance(i4).getClientUserId());
                                if (userFull != null) {
                                    userFull.flags2 &= -5;
                                    userFull.business_greeting_message = null;
                                    MessagesStorage.getInstance(i4).updateUserInfo(userFull, true);
                                }
                            } else if ("away".equals(quickReplyFindReply.name)) {
                                ConnectionsManager.getInstance(i4).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                                TLRPC.UserFull userFull2 = MessagesController.getInstance(i4).getUserFull(UserConfig.getInstance(i4).getClientUserId());
                                if (userFull2 != null) {
                                    userFull2.flags2 &= -9;
                                    userFull2.business_away_message = null;
                                    MessagesStorage.getInstance(i4).updateUserInfo(userFull2, true);
                                }
                            }
                            i3++;
                        } else {
                            quickRepliesController.saveToCache();
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i4);
                            messagesStorage.getStorageQueue().postRunnable(new QuickRepliesController$$ExternalSyntheticLambda22(0, arrayList, messagesStorage));
                            NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                quickRepliesActivity.clearSelection();
                break;
            default:
                LPhotoPaintView.this.emojiView.clearRecentEmoji();
                break;
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.$r8$classId) {
            case 5:
                WakeLockHolder.completeWakefulIntent((Intent) this.f$0);
                break;
            case 6:
                ((WithinAppServiceConnection.BindRequest) this.f$0).taskCompletionSource.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.f$0).cancel(false);
                break;
        }
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        ((Switch) this.f$0).invalidate();
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return ((ThemesHorizontalListCell) this.f$0).lambda$new$1(view, i);
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z;
        String str = null;
        switch (this.$r8$classId) {
            case 3:
                TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
                if (!((FirebaseMessaging) this.f$0).autoInit.isEnabled() || topicsSubscriber.store.getNextTopicOperation() == null) {
                    return;
                }
                synchronized (topicsSubscriber) {
                    z = topicsSubscriber.syncScheduledOrRunning;
                }
                if (z) {
                    return;
                }
                topicsSubscriber.syncWithDelaySecondsInternal(0L);
                return;
            case 27:
                PhotoView photoView = (PhotoView) this.f$0;
                photoView.segmentingLoaded = true;
                photoView.segmentingLoading = false;
                return;
            case 28:
                SubjectSegmentationResult subjectSegmentationResult = (SubjectSegmentationResult) obj;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < subjectSegmentationResult.zza.size(); i++) {
                    Subject subject = (Subject) subjectSegmentationResult.zza.get(i);
                    StickerMakerView.SubjectMock subjectMock = new StickerMakerView.SubjectMock();
                    subjectMock.bitmap = subject.zzb;
                    subjectMock.startX = subject.zze;
                    subjectMock.startY = subject.zzf;
                    subjectMock.width = subject.zzc;
                    subjectMock.height = subject.zzd;
                    arrayList.add(subjectMock);
                }
                ((CommunityUtils$$ExternalSyntheticLambda2) this.f$0).run(arrayList);
                return;
            default:
                List list = (List) obj;
                StickerMakerView stickerMakerView = (StickerMakerView) this.f$0;
                stickerMakerView.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i2 = ((ImageLabel) list.get(0)).zzc;
                if (ObjectDetectionEmojis.labelEmojis == null) {
                    ObjectDetectionEmojis.labelEmojis = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i2 >= 0) {
                    String[] strArr = ObjectDetectionEmojis.labelEmojis;
                    if (i2 < strArr.length) {
                        str = strArr[i2];
                    }
                }
                stickerMakerView.detectedEmoji = str;
                FileLog.d("objimg: detected #" + ((ImageLabel) list.get(0)).zzc + " " + stickerMakerView.detectedEmoji + " " + ((ImageLabel) list.get(0)).zza);
                Emoji.getEmojiDrawable(stickerMakerView.detectedEmoji);
                return;
        }
    }

    @Override
    public void onTimerUpdate(long j) {
        ((ActiveGiftAuctionsHintCell.CountDown) this.f$0).updateTimer(j);
    }

    @Override
    public boolean run() {
        return ((ChatMessageCell) this.f$0).lambda$updateFlagSecure$11();
    }

    @Override
    public void setProgress(float f) {
        switch (this.$r8$classId) {
            case 19:
                HintDialogCell hintDialogCell = (HintDialogCell) this.f$0;
                float progress = 1.0f - (hintDialogCell.checkBox.getProgress() * 0.143f);
                BackupImageView backupImageView = hintDialogCell.imageView;
                backupImageView.setScaleX(progress);
                backupImageView.setScaleY(progress);
                hintDialogCell.invalidate();
                break;
            default:
                ((ShareDialogCell) this.f$0).lambda$new$0(f);
                break;
        }
    }

    @Override
    public Object then(Task task) throws IOException {
        switch (this.$r8$classId) {
            case 1:
                ((CountDownLatch) this.f$0).countDown();
                return null;
            default:
                ((GmsRpc) this.f$0).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        return (CharSequence) ((Utilities.CallbackReturn) this.f$0).run((Integer) obj2);
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        switch (this.$r8$classId) {
            case 12:
                UItem uItem = (UItem) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float fFloatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                OpeningHoursActivity openingHoursActivity = (OpeningHoursActivity) this.f$0;
                int i2 = uItem.id;
                if (i2 == -1) {
                    boolean z = !openingHoursActivity.enabled;
                    openingHoursActivity.enabled = z;
                    ((TextCheckCell) view).setChecked(z);
                    openingHoursActivity.listView.adapter.update(true);
                    openingHoursActivity.checkDone$3(true);
                    break;
                } else if (i2 == -2) {
                    TimezoneSelector timezoneSelector = new TimezoneSelector(null);
                    timezoneSelector.currentTimezone = openingHoursActivity.timezoneId;
                    timezoneSelector.whenTimezoneSelected = new GiftSheet$$ExternalSyntheticLambda4(7, openingHoursActivity, view);
                    openingHoursActivity.presentFragment(timezoneSelector);
                    break;
                } else if (uItem.viewType == 5 && i2 >= 0 && i2 < openingHoursActivity.value.length) {
                    if (!LocaleController.isRTL ? fFloatValue >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : fFloatValue <= AndroidUtilities.dp(76.0f)) {
                        if (openingHoursActivity.value[uItem.id].isEmpty()) {
                            ((NotificationsCheckCell) view).setChecked(true);
                            openingHoursActivity.value[uItem.id].add(new OpeningHoursActivity.Period(0, 1439));
                            openingHoursActivity.adaptPrevDay(uItem.id);
                        } else {
                            openingHoursActivity.value[uItem.id].clear();
                            ((NotificationsCheckCell) view).setChecked(false);
                        }
                        ((NotificationsCheckCell) view).setValue(OpeningHoursActivity.getPeriodsValue(openingHoursActivity.value[uItem.id]));
                        openingHoursActivity.checkDone$3(true);
                    } else {
                        int i3 = (uItem.id + 6) % 7;
                        int i4 = 0;
                        for (int i5 = 0; i5 < openingHoursActivity.value[i3].size(); i5++) {
                            if (((OpeningHoursActivity.Period) openingHoursActivity.value[i3].get(i5)).end > i4) {
                                i4 = ((OpeningHoursActivity.Period) openingHoursActivity.value[i3].get(i5)).end;
                            }
                        }
                        int iMax = Math.max(0, i4 - 1439);
                        int i6 = (uItem.id + 1) % 7;
                        int i7 = 1440;
                        for (int i8 = 0; i8 < openingHoursActivity.value[i6].size(); i8++) {
                            if (((OpeningHoursActivity.Period) openingHoursActivity.value[i6].get(i8)).start < i7) {
                                i7 = ((OpeningHoursActivity.Period) openingHoursActivity.value[i6].get(i8)).start;
                            }
                        }
                        int i9 = i7 + 1439;
                        CharSequence charSequence = uItem.text;
                        ArrayList arrayList = openingHoursActivity.value[uItem.id];
                        int iMax2 = 0;
                        for (int i10 = 0; i10 < 7; i10++) {
                            ArrayList arrayList2 = openingHoursActivity.value[i10];
                            if (arrayList2 != null) {
                                iMax2 = Math.max(1, arrayList2.size()) + iMax2;
                            }
                        }
                        OpeningHoursDayActivity openingHoursDayActivity = new OpeningHoursDayActivity(iMax, arrayList, charSequence, i9, 28 - iMax2);
                        openingHoursDayActivity.whenApplied = new ChatbotSheet$$ExternalSyntheticLambda0(openingHoursActivity, 3);
                        openingHoursDayActivity.whenDone = new ChatActionCell$$ExternalSyntheticLambda8(9, openingHoursActivity, uItem);
                        openingHoursActivity.presentFragment(openingHoursDayActivity);
                    }
                    break;
                }
                break;
            case 13:
                UItem uItem2 = (UItem) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                final OpeningHoursDayActivity openingHoursDayActivity2 = (OpeningHoursDayActivity) this.f$0;
                int i11 = uItem2.id;
                ArrayList arrayList3 = openingHoursDayActivity2.periods;
                if (i11 == -1) {
                    openingHoursDayActivity2.enabled = !openingHoursDayActivity2.enabled;
                    arrayList3.clear();
                    if (openingHoursDayActivity2.enabled) {
                        arrayList3.add(new OpeningHoursActivity.Period(0, 1439));
                    }
                    TextCheckCell textCheckCell = (TextCheckCell) view2;
                    boolean z2 = openingHoursDayActivity2.enabled;
                    uItem2.checked = z2;
                    textCheckCell.setChecked(z2);
                    boolean z3 = openingHoursDayActivity2.enabled;
                    textCheckCell.setBackgroundColorAnimated(z3, Theme.getColor(null, z3 ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false));
                    openingHoursDayActivity2.listView.adapter.update(true);
                    ChatbotSheet$$ExternalSyntheticLambda0 chatbotSheet$$ExternalSyntheticLambda0 = openingHoursDayActivity2.whenApplied;
                    if (chatbotSheet$$ExternalSyntheticLambda0 != null) {
                        chatbotSheet$$ExternalSyntheticLambda0.run();
                    }
                    break;
                } else {
                    int i12 = openingHoursDayActivity2.min;
                    int i13 = openingHoursDayActivity2.max;
                    if (i11 == -2) {
                        if (!arrayList3.isEmpty() && !openingHoursDayActivity2.is24()) {
                            int i14 = ((OpeningHoursActivity.Period) Fragment$$ExternalSyntheticOutline0.m(1, arrayList3)).end;
                            int iClamp = Utilities.clamp(i14 + 30, i13 - 1, i12);
                            arrayList3.add(new OpeningHoursActivity.Period(iClamp, Utilities.clamp((i14 + 1560) / 2, i13, iClamp + 1)));
                        } else {
                            if (openingHoursDayActivity2.is24()) {
                                arrayList3.clear();
                            }
                            int iClamp2 = Utilities.clamp(480, i13 - 1, i12);
                            arrayList3.add(new OpeningHoursActivity.Period(iClamp2, Utilities.clamp(1200, i13, iClamp2 + 1)));
                        }
                        ChatbotSheet$$ExternalSyntheticLambda0 chatbotSheet$$ExternalSyntheticLambda1 = openingHoursDayActivity2.whenApplied;
                        if (chatbotSheet$$ExternalSyntheticLambda1 != null) {
                            chatbotSheet$$ExternalSyntheticLambda1.run();
                        }
                        openingHoursDayActivity2.listView.adapter.update(true);
                        break;
                    } else if (uItem2.viewType == 3 && (i = i11 / 3) >= 0 && i < arrayList3.size()) {
                        int i15 = i - 1;
                        OpeningHoursActivity.Period period = i15 >= 0 ? (OpeningHoursActivity.Period) arrayList3.get(i15) : null;
                        final OpeningHoursActivity.Period period2 = (OpeningHoursActivity.Period) arrayList3.get(i);
                        int i16 = i + 1;
                        OpeningHoursActivity.Period period3 = i16 < arrayList3.size() ? (OpeningHoursActivity.Period) arrayList3.get(i16) : null;
                        int i17 = uItem2.id % 3;
                        if (i17 == 0) {
                            Context context = openingHoursDayActivity2.getContext();
                            String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                            int i18 = period2.start;
                            if (period != null) {
                                i12 = period.end + 1;
                            }
                            final int i19 = 0;
                            AlertsCreator.createTimePickerDialog(context, string, i18, i12, period2.end - 1, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj6) {
                                    Integer num = (Integer) obj6;
                                    switch (i19) {
                                        case 0:
                                            OpeningHoursDayActivity openingHoursDayActivity3 = openingHoursDayActivity2;
                                            boolean zShowAddButton = openingHoursDayActivity3.showAddButton();
                                            TextCell textCell = (TextCell) view2;
                                            int iIntValue = num.intValue();
                                            period2.start = iIntValue;
                                            textCell.setValue(OpeningHoursActivity.Period.timeToString(iIntValue), true);
                                            if (zShowAddButton != openingHoursDayActivity3.showAddButton()) {
                                                openingHoursDayActivity3.listView.adapter.update(true);
                                            }
                                            ChatbotSheet$$ExternalSyntheticLambda0 chatbotSheet$$ExternalSyntheticLambda2 = openingHoursDayActivity3.whenApplied;
                                            if (chatbotSheet$$ExternalSyntheticLambda2 != null) {
                                                chatbotSheet$$ExternalSyntheticLambda2.run();
                                            }
                                            break;
                                        default:
                                            OpeningHoursDayActivity openingHoursDayActivity4 = openingHoursDayActivity2;
                                            boolean zShowAddButton2 = openingHoursDayActivity4.showAddButton();
                                            TextCell textCell2 = (TextCell) view2;
                                            int iIntValue2 = num.intValue();
                                            period2.end = iIntValue2;
                                            textCell2.setValue(OpeningHoursActivity.Period.timeToString(iIntValue2), true);
                                            if (zShowAddButton2 != openingHoursDayActivity4.showAddButton()) {
                                                openingHoursDayActivity4.listView.adapter.update(true);
                                            }
                                            ChatbotSheet$$ExternalSyntheticLambda0 chatbotSheet$$ExternalSyntheticLambda3 = openingHoursDayActivity4.whenApplied;
                                            if (chatbotSheet$$ExternalSyntheticLambda3 != null) {
                                                chatbotSheet$$ExternalSyntheticLambda3.run();
                                            }
                                            break;
                                    }
                                }
                            });
                        } else if (i17 == 1) {
                            Context context2 = openingHoursDayActivity2.getContext();
                            String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                            int i20 = period2.end;
                            int i21 = period2.start + 1;
                            if (period3 != null) {
                                i13 = period3.start - 1;
                            }
                            final int i22 = 1;
                            AlertsCreator.createTimePickerDialog(context2, string2, i20, i21, i13, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj6) {
                                    Integer num = (Integer) obj6;
                                    switch (i22) {
                                        case 0:
                                            OpeningHoursDayActivity openingHoursDayActivity3 = openingHoursDayActivity2;
                                            boolean zShowAddButton = openingHoursDayActivity3.showAddButton();
                                            TextCell textCell = (TextCell) view2;
                                            int iIntValue = num.intValue();
                                            period2.start = iIntValue;
                                            textCell.setValue(OpeningHoursActivity.Period.timeToString(iIntValue), true);
                                            if (zShowAddButton != openingHoursDayActivity3.showAddButton()) {
                                                openingHoursDayActivity3.listView.adapter.update(true);
                                            }
                                            ChatbotSheet$$ExternalSyntheticLambda0 chatbotSheet$$ExternalSyntheticLambda2 = openingHoursDayActivity3.whenApplied;
                                            if (chatbotSheet$$ExternalSyntheticLambda2 != null) {
                                                chatbotSheet$$ExternalSyntheticLambda2.run();
                                            }
                                            break;
                                        default:
                                            OpeningHoursDayActivity openingHoursDayActivity4 = openingHoursDayActivity2;
                                            boolean zShowAddButton2 = openingHoursDayActivity4.showAddButton();
                                            TextCell textCell2 = (TextCell) view2;
                                            int iIntValue2 = num.intValue();
                                            period2.end = iIntValue2;
                                            textCell2.setValue(OpeningHoursActivity.Period.timeToString(iIntValue2), true);
                                            if (zShowAddButton2 != openingHoursDayActivity4.showAddButton()) {
                                                openingHoursDayActivity4.listView.adapter.update(true);
                                            }
                                            ChatbotSheet$$ExternalSyntheticLambda0 chatbotSheet$$ExternalSyntheticLambda3 = openingHoursDayActivity4.whenApplied;
                                            if (chatbotSheet$$ExternalSyntheticLambda3 != null) {
                                                chatbotSheet$$ExternalSyntheticLambda3.run();
                                            }
                                            break;
                                    }
                                }
                            });
                        } else if (i17 == 2) {
                            arrayList3.remove(i);
                            if (arrayList3.isEmpty()) {
                                arrayList3.add(new OpeningHoursActivity.Period(0, 1439));
                            }
                            openingHoursDayActivity2.listView.adapter.update(true);
                            ChatbotSheet$$ExternalSyntheticLambda0 chatbotSheet$$ExternalSyntheticLambda2 = openingHoursDayActivity2.whenApplied;
                            if (chatbotSheet$$ExternalSyntheticLambda2 != null) {
                                chatbotSheet$$ExternalSyntheticLambda2.run();
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((TimezoneSelector) this.f$0).onClick$6((UItem) obj, (View) obj2);
                break;
        }
    }
}
