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
    public final int f18325a;
    public final Object f18326b;
    public final Object f18327c;
    public final Object d;
    public final Object e;
    public final Object f18328f;

    public f5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f18325a = i10;
        this.e = obj;
        this.f18328f = obj2;
        this.f18327c = obj3;
        this.d = obj4;
        this.f18326b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f18325a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f18328f, (ArrayList) this.f18327c, (ArrayList) this.d, (String) this.f18326b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f18326b, (ArrayList) this.f18327c, (BitmapDrawable) this.f18328f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f18328f, (String) this.f18326b, (TranslateController.MessageKey) this.f18327c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f18328f, (ArrayList) this.f18327c, (ArrayList) this.d, (ResultCallback) this.f18326b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f18328f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f18327c, (HashMap) this.f18326b);
                return;
            case 5:
                ((MessagesController) this.e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f18328f, (TLObject) this.f18327c, (Long) this.d, (Utilities.Callback) this.f18326b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$setUserAdminRole$99((TLRPC.User) this.f18328f, (TLRPC.Chat) this.f18327c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f18326b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$saveThemeToServer$118((String) this.f18326b, (String) this.f18328f, (org.telegram.ui.ActionBar.f6) this.f18327c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 8:
                ((MessagesController) this.e).lambda$getDifference$357((TLRPC.updates_Difference) this.f18328f, (ArrayList) this.f18327c, (a0.h) this.d, (a0.h) this.f18326b);
                return;
            case 9:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f18326b, (File) this.f18328f, (org.telegram.ui.ActionBar.f6) this.f18327c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 10:
                ((MessagesController) this.e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f18328f, (a0.h) this.f18327c, (a0.h) this.d, (a0.h) this.f18326b);
                return;
            case 11:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f18327c, (ArrayList) this.d, (ArrayList) this.f18328f, (a0.h) this.f18326b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f18328f, (LongSparseIntArray) this.f18327c, (a0.h) this.d, (LongSparseIntArray) this.f18326b);
                return;
            case 13:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f18327c, (ArrayList) this.d, (ArrayList) this.f18328f, (ArrayList) this.f18326b);
                return;
            case 14:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f18327c, (a0.h) this.f18328f, (ArrayList) this.d, (Collection) this.f18326b);
                return;
            case 15:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f18328f, (HashMap) this.f18327c, (String) this.f18326b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f18328f, (MessageObject) this.f18327c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f18326b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f18328f, (File) this.f18327c, (TLRPC.Document) this.d, (MessageObject) this.f18326b);
                return;
        }
    }

    public f5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f18325a = i10;
        this.e = obj;
        this.f18327c = arrayList;
        this.d = arrayList2;
        this.f18328f = arrayList3;
        this.f18326b = cloneable;
    }

    public f5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f18325a = 2;
        this.e = translateController;
        this.f18328f = messageObject;
        this.f18326b = str;
        this.f18327c = messageKey;
        this.d = callback;
    }

    public f5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f18325a = 4;
        this.e = factCheckController;
        this.f18328f = tLObject;
        this.d = tL_getFactCheck;
        this.f18327c = arrayList;
        this.f18326b = hashMap;
    }

    public f5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f18325a = 1;
        this.e = thumbGenerateTask;
        this.f18326b = str;
        this.f18327c = arrayList;
        this.f18328f = bitmapDrawable;
        this.d = arrayList2;
    }

    public f5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f18325a = i10;
        this.e = messagesController;
        this.f18326b = str;
        this.f18328f = obj;
        this.f18327c = f6Var;
        this.d = g6Var;
    }

    public f5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f18325a = 14;
        this.e = notificationsController;
        this.f18327c = arrayList;
        this.f18328f = hVar;
        this.d = arrayList2;
        this.f18326b = collection;
    }

    public f5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f18325a = 15;
        this.e = sendMessagesHelper;
        this.f18328f = importingStickers;
        this.f18327c = hashMap;
        this.f18326b = str;
        this.d = stringCallback;
    }
}
