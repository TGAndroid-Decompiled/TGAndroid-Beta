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
    public final int f17387a;
    public final Object f17388b;
    public final Object f17389c;
    public final Object d;
    public final Object f17390e;
    public final Object f17391f;

    public b5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17387a = i10;
        this.f17390e = obj;
        this.f17391f = obj2;
        this.f17389c = obj3;
        this.d = obj4;
        this.f17388b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17387a) {
            case 0:
                ((ImageLoader.CacheImage) this.f17390e).lambda$setImageAndClear$0((Drawable) this.f17391f, (ArrayList) this.f17389c, (ArrayList) this.d, (String) this.f17388b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f17390e).lambda$run$1((String) this.f17388b, (ArrayList) this.f17389c, (BitmapDrawable) this.f17391f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f17390e).lambda$detectPhotoLanguage$39((MessageObject) this.f17391f, (String) this.f17388b, (TranslateController.MessageKey) this.f17389c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f17390e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17391f, (ArrayList) this.f17389c, (ArrayList) this.d, (ResultCallback) this.f17388b);
                return;
            case 4:
                ((FactCheckController) this.f17390e).lambda$loadMissing$1((TLObject) this.f17391f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17389c, (HashMap) this.f17388b);
                return;
            case 5:
                ((MessagesController) this.f17390e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f17391f, (TLObject) this.f17389c, (Long) this.d, (Utilities.Callback) this.f17388b);
                return;
            case 6:
                ((MessagesController) this.f17390e).lambda$getDifference$358((TLRPC.updates_Difference) this.f17391f, (ArrayList) this.f17389c, (a0.i) this.d, (a0.i) this.f17388b);
                return;
            case 7:
                ((MessagesController) this.f17390e).lambda$saveThemeToServer$119((String) this.f17388b, (String) this.f17391f, (org.telegram.ui.ActionBar.f6) this.f17389c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 8:
                ((MessagesController) this.f17390e).lambda$setUserAdminRole$100((TLRPC.User) this.f17391f, (TLRPC.Chat) this.f17389c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17388b);
                return;
            case 9:
                ((MessagesController) this.f17390e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f17391f, (a0.i) this.f17389c, (a0.i) this.d, (a0.i) this.f17388b);
                return;
            case 10:
                ((MessagesController) this.f17390e).lambda$saveThemeToServer$120((String) this.f17388b, (File) this.f17391f, (org.telegram.ui.ActionBar.f6) this.f17389c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.f17390e).lambda$readAllDialogs$64((ArrayList) this.f17389c, (ArrayList) this.d, (ArrayList) this.f17391f, (a0.i) this.f17388b);
                return;
            case 12:
                ((MessagesStorage) this.f17390e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17391f, (LongSparseIntArray) this.f17389c, (a0.i) this.d, (LongSparseIntArray) this.f17388b);
                return;
            case 13:
                ((Utilities.Callback4) this.f17390e).run((ArrayList) this.f17389c, (ArrayList) this.d, (ArrayList) this.f17391f, (ArrayList) this.f17388b);
                return;
            case 14:
                ((NotificationsController) this.f17390e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f17389c, (a0.i) this.f17391f, (ArrayList) this.d, (Collection) this.f17388b);
                return;
            case 15:
                ((SendMessagesHelper) this.f17390e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f17391f, (HashMap) this.f17389c, (String) this.f17388b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f17390e).lambda$didReceivedNotification$2((File) this.f17391f, (MessageObject) this.f17389c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17388b);
                return;
            default:
                ((SendMessagesHelper) this.f17390e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17391f, (File) this.f17389c, (TLRPC.Document) this.d, (MessageObject) this.f17388b);
                return;
        }
    }

    public b5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17387a = i10;
        this.f17390e = obj;
        this.f17389c = arrayList;
        this.d = arrayList2;
        this.f17391f = arrayList3;
        this.f17388b = cloneable;
    }

    public b5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17387a = 2;
        this.f17390e = translateController;
        this.f17391f = messageObject;
        this.f17388b = str;
        this.f17389c = messageKey;
        this.d = callback;
    }

    public b5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17387a = 4;
        this.f17390e = factCheckController;
        this.f17391f = tLObject;
        this.d = tL_getFactCheck;
        this.f17389c = arrayList;
        this.f17388b = hashMap;
    }

    public b5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17387a = 1;
        this.f17390e = thumbGenerateTask;
        this.f17388b = str;
        this.f17389c = arrayList;
        this.f17391f = bitmapDrawable;
        this.d = arrayList2;
    }

    public b5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f17387a = i10;
        this.f17390e = messagesController;
        this.f17388b = str;
        this.f17391f = obj;
        this.f17389c = f6Var;
        this.d = h6Var;
    }

    public b5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f17387a = 14;
        this.f17390e = notificationsController;
        this.f17389c = arrayList;
        this.f17391f = iVar;
        this.d = arrayList2;
        this.f17388b = collection;
    }

    public b5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17387a = 15;
        this.f17390e = sendMessagesHelper;
        this.f17391f = importingStickers;
        this.f17389c = hashMap;
        this.f17388b = str;
        this.d = stringCallback;
    }
}
