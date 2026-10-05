package org.telegram.messenger;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class b5 implements Runnable {
    public final int f17398a;
    public final Object f17399b;
    public final Object f17400c;
    public final Object d;
    public final Object f17401e;
    public final Object f17402f;

    public b5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17398a = i10;
        this.f17401e = obj;
        this.f17402f = obj2;
        this.f17400c = obj3;
        this.d = obj4;
        this.f17399b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17398a) {
            case 0:
                ((ImageLoader.CacheImage) this.f17401e).lambda$setImageAndClear$0((Drawable) this.f17402f, (ArrayList) this.f17400c, (ArrayList) this.d, (String) this.f17399b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f17401e).lambda$run$1((String) this.f17399b, (ArrayList) this.f17400c, (BitmapDrawable) this.f17402f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f17401e).lambda$detectPhotoLanguage$39((MessageObject) this.f17402f, (String) this.f17399b, (TranslateController.MessageKey) this.f17400c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f17401e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17402f, (ArrayList) this.f17400c, (ArrayList) this.d, (ResultCallback) this.f17399b);
                return;
            case 4:
                ((FactCheckController) this.f17401e).lambda$loadMissing$1((TLObject) this.f17402f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17400c, (HashMap) this.f17399b);
                return;
            case 5:
                ((MessagesController) this.f17401e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f17402f, (TLObject) this.f17400c, (Long) this.d, (Utilities.Callback) this.f17399b);
                return;
            case 6:
                ((MessagesController) this.f17401e).lambda$getDifference$358((TLRPC.updates_Difference) this.f17402f, (ArrayList) this.f17400c, (a0.i) this.d, (a0.i) this.f17399b);
                return;
            case 7:
                ((MessagesController) this.f17401e).lambda$saveThemeToServer$119((String) this.f17399b, (String) this.f17402f, (org.telegram.ui.ActionBar.f6) this.f17400c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 8:
                ((MessagesController) this.f17401e).lambda$setUserAdminRole$100((TLRPC.User) this.f17402f, (TLRPC.Chat) this.f17400c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17399b);
                return;
            case 9:
                ((MessagesController) this.f17401e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f17402f, (a0.i) this.f17400c, (a0.i) this.d, (a0.i) this.f17399b);
                return;
            case 10:
                ((MessagesController) this.f17401e).lambda$saveThemeToServer$120((String) this.f17399b, (File) this.f17402f, (org.telegram.ui.ActionBar.f6) this.f17400c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.f17401e).lambda$readAllDialogs$64((ArrayList) this.f17400c, (ArrayList) this.d, (ArrayList) this.f17402f, (a0.i) this.f17399b);
                return;
            case 12:
                ((MessagesStorage) this.f17401e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17402f, (LongSparseIntArray) this.f17400c, (a0.i) this.d, (LongSparseIntArray) this.f17399b);
                return;
            case 13:
                ((Utilities.Callback4) this.f17401e).run((ArrayList) this.f17400c, (ArrayList) this.d, (ArrayList) this.f17402f, (ArrayList) this.f17399b);
                return;
            case 14:
                ((NotificationsController) this.f17401e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f17400c, (a0.i) this.f17402f, (ArrayList) this.d, (Collection) this.f17399b);
                return;
            case 15:
                ((SendMessagesHelper) this.f17401e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f17402f, (HashMap) this.f17400c, (String) this.f17399b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f17401e).lambda$didReceivedNotification$2((File) this.f17402f, (MessageObject) this.f17400c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17399b);
                return;
            default:
                ((SendMessagesHelper) this.f17401e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17402f, (File) this.f17400c, (TLRPC.Document) this.d, (MessageObject) this.f17399b);
                return;
        }
    }

    public b5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17398a = i10;
        this.f17401e = obj;
        this.f17400c = arrayList;
        this.d = arrayList2;
        this.f17402f = arrayList3;
        this.f17399b = cloneable;
    }

    public b5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17398a = 2;
        this.f17401e = translateController;
        this.f17402f = messageObject;
        this.f17399b = str;
        this.f17400c = messageKey;
        this.d = callback;
    }

    public b5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17398a = 4;
        this.f17401e = factCheckController;
        this.f17402f = tLObject;
        this.d = tL_getFactCheck;
        this.f17400c = arrayList;
        this.f17399b = hashMap;
    }

    public b5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17398a = 1;
        this.f17401e = thumbGenerateTask;
        this.f17399b = str;
        this.f17400c = arrayList;
        this.f17402f = bitmapDrawable;
        this.d = arrayList2;
    }

    public b5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f17398a = i10;
        this.f17401e = messagesController;
        this.f17399b = str;
        this.f17402f = obj;
        this.f17400c = f6Var;
        this.d = h6Var;
    }

    public b5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f17398a = 14;
        this.f17401e = notificationsController;
        this.f17400c = arrayList;
        this.f17402f = iVar;
        this.d = arrayList2;
        this.f17399b = collection;
    }

    public b5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17398a = 15;
        this.f17401e = sendMessagesHelper;
        this.f17402f = importingStickers;
        this.f17400c = hashMap;
        this.f17399b = str;
        this.d = stringCallback;
    }
}
