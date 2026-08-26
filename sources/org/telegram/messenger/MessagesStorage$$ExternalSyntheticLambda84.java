package org.telegram.messenger;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.Theme;

public final class MessagesStorage$$ExternalSyntheticLambda84 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public MessagesStorage$$ExternalSyntheticLambda84(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f$3;
                ArrayList arrayList2 = (ArrayList) this.f$4;
                ((Utilities.Callback4) this.f$0).run((ArrayList) this.f$1, (ArrayList) this.f$2, arrayList, arrayList2);
                break;
            case 1:
                ((ImageLoader.CacheImage) this.f$0).lambda$setImageAndClear$0((Drawable) this.f$3, (ArrayList) this.f$1, (ArrayList) this.f$2, (String) this.f$4);
                break;
            case 2:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) this.f$4;
                ArrayList arrayList3 = (ArrayList) this.f$2;
                ((ImageLoader.ThumbGenerateTask) this.f$0).lambda$run$1((String) this.f$3, (ArrayList) this.f$1, bitmapDrawable, arrayList3);
                break;
            case 3:
                ((TranslateController) this.f$0).lambda$detectPhotoLanguage$39((MessageObject) this.f$1, (String) this.f$2, (TranslateController.MessageKey) this.f$3, (Utilities.Callback) this.f$4);
                break;
            case 4:
                ArrayList arrayList4 = (ArrayList) this.f$2;
                ((ChatThemeController) this.f$0).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f$3, (ArrayList) this.f$1, arrayList4, (ResultCallback) this.f$4);
                break;
            case 5:
                ((FactCheckController) this.f$0).lambda$loadMissing$1((TLObject) this.f$2, (TLRPC.TL_getFactCheck) this.f$3, (ArrayList) this.f$1, (HashMap) this.f$4);
                break;
            case 6:
                ((MessagesController) this.f$0).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (Long) this.f$3, (Utilities.Callback) this.f$4);
                break;
            case 7:
                LongSparseArray longSparseArray = (LongSparseArray) this.f$3;
                LongSparseArray longSparseArray2 = (LongSparseArray) this.f$4;
                ((MessagesController) this.f$0).lambda$getDifference$358((TLRPC.updates_Difference) this.f$2, (ArrayList) this.f$1, longSparseArray, longSparseArray2);
                break;
            case 8:
                ((MessagesController) this.f$0).lambda$saveThemeToServer$119((String) this.f$1, (String) this.f$2, (Theme.ThemeAccent) this.f$3, (Theme.ThemeInfo) this.f$4);
                break;
            case 9:
                ((MessagesController) this.f$0).lambda$setUserAdminRole$100((TLRPC.User) this.f$1, (TLRPC.Chat) this.f$2, (MessagesController.ErrorDelegate) this.f$3, (TLRPC.TL_error) this.f$4);
                break;
            case 10:
                LongSparseArray longSparseArray3 = (LongSparseArray) this.f$3;
                LongSparseArray longSparseArray4 = (LongSparseArray) this.f$4;
                ((MessagesController) this.f$0).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f$1, (LongSparseArray) this.f$2, longSparseArray3, longSparseArray4);
                break;
            case 11:
                ((MessagesController) this.f$0).lambda$saveThemeToServer$120((String) this.f$1, (File) this.f$2, (Theme.ThemeAccent) this.f$3, (Theme.ThemeInfo) this.f$4);
                break;
            case 12:
                ((MessagesStorage) this.f$0).lambda$readAllDialogs$64((ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, (LongSparseArray) this.f$4);
                break;
            case 13:
                ((MessagesStorage) this.f$0).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f$1, (LongSparseIntArray) this.f$2, (LongSparseArray) this.f$3, (LongSparseIntArray) this.f$4);
                break;
            case 14:
                ((NotificationsController) this.f$0).lambda$processLoadedUnreadMessages$33((ArrayList) this.f$1, (LongSparseArray) this.f$3, (ArrayList) this.f$2, (Collection) this.f$4);
                break;
            case 15:
                ((SendMessagesHelper) this.f$0).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f$1, (HashMap) this.f$2, (String) this.f$3, (MessagesStorage.StringCallback) this.f$4);
                break;
            case 16:
                ((SendMessagesHelper) this.f$0).lambda$didReceivedNotification$2((File) this.f$1, (MessageObject) this.f$2, (SendMessagesHelper.DelayedMessage) this.f$3, (String) this.f$4);
                break;
            default:
                ((SendMessagesHelper) this.f$0).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f$1, (File) this.f$2, (TLRPC.Document) this.f$3, (MessageObject) this.f$4);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda84(Object obj, Object obj2, ArrayList arrayList, ArrayList arrayList2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$1 = arrayList;
        this.f$2 = arrayList2;
        this.f$4 = obj3;
    }

    public MessagesStorage$$ExternalSyntheticLambda84(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap map) {
        this.$r8$classId = 5;
        this.f$0 = factCheckController;
        this.f$2 = tLObject;
        this.f$3 = tL_getFactCheck;
        this.f$1 = arrayList;
        this.f$4 = map;
    }

    public MessagesStorage$$ExternalSyntheticLambda84(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.$r8$classId = 2;
        this.f$0 = thumbGenerateTask;
        this.f$3 = str;
        this.f$1 = arrayList;
        this.f$4 = bitmapDrawable;
        this.f$2 = arrayList2;
    }

    public MessagesStorage$$ExternalSyntheticLambda84(MessagesController messagesController, TLRPC.updates_Difference updates_difference, ArrayList arrayList, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        this.$r8$classId = 7;
        this.f$0 = messagesController;
        this.f$2 = updates_difference;
        this.f$1 = arrayList;
        this.f$3 = longSparseArray;
        this.f$4 = longSparseArray2;
    }

    public MessagesStorage$$ExternalSyntheticLambda84(NotificationsController notificationsController, ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, Collection collection) {
        this.$r8$classId = 14;
        this.f$0 = notificationsController;
        this.f$1 = arrayList;
        this.f$3 = longSparseArray;
        this.f$2 = arrayList2;
        this.f$4 = collection;
    }
}
