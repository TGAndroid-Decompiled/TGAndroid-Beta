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
    public final int f15955a;
    public final Object f15956b;
    public final Object f15957c;
    public final Object d;
    public final Object e;
    public final Object f15958f;

    public b5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f15955a = i10;
        this.e = obj;
        this.f15958f = obj2;
        this.f15957c = obj3;
        this.d = obj4;
        this.f15956b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f15955a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f15958f, (ArrayList) this.f15957c, (ArrayList) this.d, (String) this.f15956b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f15956b, (ArrayList) this.f15957c, (BitmapDrawable) this.f15958f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f15958f, (String) this.f15956b, (TranslateController.MessageKey) this.f15957c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f15958f, (ArrayList) this.f15957c, (ArrayList) this.d, (ResultCallback) this.f15956b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f15958f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f15957c, (HashMap) this.f15956b);
                return;
            case 5:
                ((MessagesController) this.e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f15958f, (TLObject) this.f15957c, (Long) this.d, (Utilities.Callback) this.f15956b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$getDifference$358((TLRPC.updates_Difference) this.f15958f, (ArrayList) this.f15957c, (a0.i) this.d, (a0.i) this.f15956b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f15956b, (String) this.f15958f, (org.telegram.ui.ActionBar.f6) this.f15957c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 8:
                ((MessagesController) this.e).lambda$setUserAdminRole$100((TLRPC.User) this.f15958f, (TLRPC.Chat) this.f15957c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f15956b);
                return;
            case 9:
                ((MessagesController) this.e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f15958f, (a0.i) this.f15957c, (a0.i) this.d, (a0.i) this.f15956b);
                return;
            case 10:
                ((MessagesController) this.e).lambda$saveThemeToServer$120((String) this.f15956b, (File) this.f15958f, (org.telegram.ui.ActionBar.f6) this.f15957c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f15957c, (ArrayList) this.d, (ArrayList) this.f15958f, (a0.i) this.f15956b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f15958f, (LongSparseIntArray) this.f15957c, (a0.i) this.d, (LongSparseIntArray) this.f15956b);
                return;
            case 13:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f15957c, (ArrayList) this.d, (ArrayList) this.f15958f, (ArrayList) this.f15956b);
                return;
            case 14:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f15957c, (a0.i) this.f15958f, (ArrayList) this.d, (Collection) this.f15956b);
                return;
            case 15:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f15958f, (HashMap) this.f15957c, (String) this.f15956b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f15958f, (MessageObject) this.f15957c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f15956b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f15958f, (File) this.f15957c, (TLRPC.Document) this.d, (MessageObject) this.f15956b);
                return;
        }
    }

    public b5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f15955a = i10;
        this.e = obj;
        this.f15957c = arrayList;
        this.d = arrayList2;
        this.f15958f = arrayList3;
        this.f15956b = cloneable;
    }

    public b5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f15955a = 2;
        this.e = translateController;
        this.f15958f = messageObject;
        this.f15956b = str;
        this.f15957c = messageKey;
        this.d = callback;
    }

    public b5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f15955a = 4;
        this.e = factCheckController;
        this.f15958f = tLObject;
        this.d = tL_getFactCheck;
        this.f15957c = arrayList;
        this.f15956b = hashMap;
    }

    public b5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f15955a = 1;
        this.e = thumbGenerateTask;
        this.f15956b = str;
        this.f15957c = arrayList;
        this.f15958f = bitmapDrawable;
        this.d = arrayList2;
    }

    public b5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f15955a = i10;
        this.e = messagesController;
        this.f15956b = str;
        this.f15958f = obj;
        this.f15957c = f6Var;
        this.d = g6Var;
    }

    public b5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f15955a = 14;
        this.e = notificationsController;
        this.f15957c = arrayList;
        this.f15958f = iVar;
        this.d = arrayList2;
        this.f15956b = collection;
    }

    public b5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f15955a = 15;
        this.e = sendMessagesHelper;
        this.f15958f = importingStickers;
        this.f15957c = hashMap;
        this.f15956b = str;
        this.d = stringCallback;
    }
}
