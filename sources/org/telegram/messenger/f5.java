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
public final class f5 implements Runnable {
    public final int f17571a;
    public final Object f17572b;
    public final Object f17573c;
    public final Object d;
    public final Object f17574e;
    public final Object f17575f;

    public f5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17571a = i10;
        this.f17574e = obj;
        this.f17575f = obj2;
        this.f17573c = obj3;
        this.d = obj4;
        this.f17572b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17571a) {
            case 0:
                ((ImageLoader.CacheImage) this.f17574e).lambda$setImageAndClear$0((Drawable) this.f17575f, (ArrayList) this.f17573c, (ArrayList) this.d, (String) this.f17572b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f17574e).lambda$run$1((String) this.f17572b, (ArrayList) this.f17573c, (BitmapDrawable) this.f17575f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f17574e).lambda$detectPhotoLanguage$39((MessageObject) this.f17575f, (String) this.f17572b, (TranslateController.MessageKey) this.f17573c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f17574e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17575f, (ArrayList) this.f17573c, (ArrayList) this.d, (ResultCallback) this.f17572b);
                return;
            case 4:
                ((FactCheckController) this.f17574e).lambda$loadMissing$1((TLObject) this.f17575f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17573c, (HashMap) this.f17572b);
                return;
            case 5:
                ((MessagesController) this.f17574e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f17575f, (TLObject) this.f17573c, (Long) this.d, (Utilities.Callback) this.f17572b);
                return;
            case 6:
                ((MessagesController) this.f17574e).lambda$setUserAdminRole$99((TLRPC.User) this.f17575f, (TLRPC.Chat) this.f17573c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17572b);
                return;
            case 7:
                ((MessagesController) this.f17574e).lambda$saveThemeToServer$118((String) this.f17572b, (String) this.f17575f, (org.telegram.ui.ActionBar.e6) this.f17573c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 8:
                ((MessagesController) this.f17574e).lambda$getDifference$357((TLRPC.updates_Difference) this.f17575f, (ArrayList) this.f17573c, (a0.i) this.d, (a0.i) this.f17572b);
                return;
            case 9:
                ((MessagesController) this.f17574e).lambda$saveThemeToServer$119((String) this.f17572b, (File) this.f17575f, (org.telegram.ui.ActionBar.e6) this.f17573c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 10:
                ((MessagesController) this.f17574e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f17575f, (a0.i) this.f17573c, (a0.i) this.d, (a0.i) this.f17572b);
                return;
            case 11:
                ((MessagesStorage) this.f17574e).lambda$readAllDialogs$64((ArrayList) this.f17573c, (ArrayList) this.d, (ArrayList) this.f17575f, (a0.i) this.f17572b);
                return;
            case 12:
                ((MessagesStorage) this.f17574e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17575f, (LongSparseIntArray) this.f17573c, (a0.i) this.d, (LongSparseIntArray) this.f17572b);
                return;
            case 13:
                ((Utilities.Callback4) this.f17574e).run((ArrayList) this.f17573c, (ArrayList) this.d, (ArrayList) this.f17575f, (ArrayList) this.f17572b);
                return;
            case 14:
                ((NotificationsController) this.f17574e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f17573c, (a0.i) this.f17575f, (ArrayList) this.d, (Collection) this.f17572b);
                return;
            case 15:
                ((SendMessagesHelper) this.f17574e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f17575f, (HashMap) this.f17573c, (String) this.f17572b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f17574e).lambda$didReceivedNotification$2((File) this.f17575f, (MessageObject) this.f17573c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17572b);
                return;
            default:
                ((SendMessagesHelper) this.f17574e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17575f, (File) this.f17573c, (TLRPC.Document) this.d, (MessageObject) this.f17572b);
                return;
        }
    }

    public f5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17571a = i10;
        this.f17574e = obj;
        this.f17573c = arrayList;
        this.d = arrayList2;
        this.f17575f = arrayList3;
        this.f17572b = cloneable;
    }

    public f5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17571a = 2;
        this.f17574e = translateController;
        this.f17575f = messageObject;
        this.f17572b = str;
        this.f17573c = messageKey;
        this.d = callback;
    }

    public f5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17571a = 4;
        this.f17574e = factCheckController;
        this.f17575f = tLObject;
        this.d = tL_getFactCheck;
        this.f17573c = arrayList;
        this.f17572b = hashMap;
    }

    public f5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17571a = 1;
        this.f17574e = thumbGenerateTask;
        this.f17572b = str;
        this.f17573c = arrayList;
        this.f17575f = bitmapDrawable;
        this.d = arrayList2;
    }

    public f5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f17571a = i10;
        this.f17574e = messagesController;
        this.f17572b = str;
        this.f17575f = obj;
        this.f17573c = e6Var;
        this.d = g6Var;
    }

    public f5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f17571a = 14;
        this.f17574e = notificationsController;
        this.f17573c = arrayList;
        this.f17575f = iVar;
        this.d = arrayList2;
        this.f17572b = collection;
    }

    public f5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17571a = 15;
        this.f17574e = sendMessagesHelper;
        this.f17575f = importingStickers;
        this.f17573c = hashMap;
        this.f17572b = str;
        this.d = stringCallback;
    }
}
