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
public final class c5 implements Runnable {
    public final int f17524a;
    public final Object f17525b;
    public final Object f17526c;
    public final Object d;
    public final Object f17527e;
    public final Object f17528f;

    public c5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17524a = i10;
        this.f17527e = obj;
        this.f17528f = obj2;
        this.f17526c = obj3;
        this.d = obj4;
        this.f17525b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17524a) {
            case 0:
                ((ImageLoader.CacheImage) this.f17527e).lambda$setImageAndClear$0((Drawable) this.f17528f, (ArrayList) this.f17526c, (ArrayList) this.d, (String) this.f17525b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f17527e).lambda$run$1((String) this.f17525b, (ArrayList) this.f17526c, (BitmapDrawable) this.f17528f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f17527e).lambda$detectPhotoLanguage$39((MessageObject) this.f17528f, (String) this.f17525b, (TranslateController.MessageKey) this.f17526c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f17527e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17528f, (ArrayList) this.f17526c, (ArrayList) this.d, (ResultCallback) this.f17525b);
                return;
            case 4:
                ((FactCheckController) this.f17527e).lambda$loadMissing$1((TLObject) this.f17528f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17526c, (HashMap) this.f17525b);
                return;
            case 5:
                ((MessagesController) this.f17527e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f17528f, (TLObject) this.f17526c, (Long) this.d, (Utilities.Callback) this.f17525b);
                return;
            case 6:
                ((MessagesController) this.f17527e).lambda$setUserAdminRole$99((TLRPC.User) this.f17528f, (TLRPC.Chat) this.f17526c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17525b);
                return;
            case 7:
                ((MessagesController) this.f17527e).lambda$saveThemeToServer$118((String) this.f17525b, (String) this.f17528f, (org.telegram.ui.ActionBar.f6) this.f17526c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 8:
                ((MessagesController) this.f17527e).lambda$getDifference$357((TLRPC.updates_Difference) this.f17528f, (ArrayList) this.f17526c, (a0.i) this.d, (a0.i) this.f17525b);
                return;
            case 9:
                ((MessagesController) this.f17527e).lambda$saveThemeToServer$119((String) this.f17525b, (File) this.f17528f, (org.telegram.ui.ActionBar.f6) this.f17526c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 10:
                ((MessagesController) this.f17527e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f17528f, (a0.i) this.f17526c, (a0.i) this.d, (a0.i) this.f17525b);
                return;
            case 11:
                ((MessagesStorage) this.f17527e).lambda$readAllDialogs$64((ArrayList) this.f17526c, (ArrayList) this.d, (ArrayList) this.f17528f, (a0.i) this.f17525b);
                return;
            case 12:
                ((MessagesStorage) this.f17527e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17528f, (LongSparseIntArray) this.f17526c, (a0.i) this.d, (LongSparseIntArray) this.f17525b);
                return;
            case 13:
                ((Utilities.Callback4) this.f17527e).run((ArrayList) this.f17526c, (ArrayList) this.d, (ArrayList) this.f17528f, (ArrayList) this.f17525b);
                return;
            case 14:
                ((NotificationsController) this.f17527e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f17526c, (a0.i) this.f17528f, (ArrayList) this.d, (Collection) this.f17525b);
                return;
            case 15:
                ((SendMessagesHelper) this.f17527e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f17528f, (HashMap) this.f17526c, (String) this.f17525b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f17527e).lambda$didReceivedNotification$2((File) this.f17528f, (MessageObject) this.f17526c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17525b);
                return;
            default:
                ((SendMessagesHelper) this.f17527e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17528f, (File) this.f17526c, (TLRPC.Document) this.d, (MessageObject) this.f17525b);
                return;
        }
    }

    public c5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17524a = i10;
        this.f17527e = obj;
        this.f17526c = arrayList;
        this.d = arrayList2;
        this.f17528f = arrayList3;
        this.f17525b = cloneable;
    }

    public c5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17524a = 2;
        this.f17527e = translateController;
        this.f17528f = messageObject;
        this.f17525b = str;
        this.f17526c = messageKey;
        this.d = callback;
    }

    public c5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17524a = 4;
        this.f17527e = factCheckController;
        this.f17528f = tLObject;
        this.d = tL_getFactCheck;
        this.f17526c = arrayList;
        this.f17525b = hashMap;
    }

    public c5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17524a = 1;
        this.f17527e = thumbGenerateTask;
        this.f17525b = str;
        this.f17526c = arrayList;
        this.f17528f = bitmapDrawable;
        this.d = arrayList2;
    }

    public c5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f17524a = i10;
        this.f17527e = messagesController;
        this.f17525b = str;
        this.f17528f = obj;
        this.f17526c = f6Var;
        this.d = g6Var;
    }

    public c5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f17524a = 14;
        this.f17527e = notificationsController;
        this.f17526c = arrayList;
        this.f17528f = iVar;
        this.d = arrayList2;
        this.f17525b = collection;
    }

    public c5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17524a = 15;
        this.f17527e = sendMessagesHelper;
        this.f17528f = importingStickers;
        this.f17526c = hashMap;
        this.f17525b = str;
        this.d = stringCallback;
    }
}
