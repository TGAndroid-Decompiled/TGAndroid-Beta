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
    public final int f17215a;
    public final Object f17216b;
    public final Object f17217c;
    public final Object d;
    public final Object e;
    public final Object f17218f;

    public f5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17215a = i10;
        this.e = obj;
        this.f17218f = obj2;
        this.f17217c = obj3;
        this.d = obj4;
        this.f17216b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17215a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f17218f, (ArrayList) this.f17217c, (ArrayList) this.d, (String) this.f17216b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f17216b, (ArrayList) this.f17217c, (BitmapDrawable) this.f17218f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f17218f, (String) this.f17216b, (TranslateController.MessageKey) this.f17217c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17218f, (ArrayList) this.f17217c, (ArrayList) this.d, (ResultCallback) this.f17216b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f17218f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17217c, (HashMap) this.f17216b);
                return;
            case 5:
                ((MessagesController) this.e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f17218f, (TLObject) this.f17217c, (Long) this.d, (Utilities.Callback) this.f17216b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$setUserAdminRole$99((TLRPC.User) this.f17218f, (TLRPC.Chat) this.f17217c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17216b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$saveThemeToServer$118((String) this.f17216b, (String) this.f17218f, (org.telegram.ui.ActionBar.e6) this.f17217c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 8:
                ((MessagesController) this.e).lambda$getDifference$357((TLRPC.updates_Difference) this.f17218f, (ArrayList) this.f17217c, (a0.h) this.d, (a0.h) this.f17216b);
                return;
            case 9:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f17216b, (File) this.f17218f, (org.telegram.ui.ActionBar.e6) this.f17217c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 10:
                ((MessagesController) this.e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f17218f, (a0.h) this.f17217c, (a0.h) this.d, (a0.h) this.f17216b);
                return;
            case 11:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f17217c, (ArrayList) this.d, (ArrayList) this.f17218f, (a0.h) this.f17216b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17218f, (LongSparseIntArray) this.f17217c, (a0.h) this.d, (LongSparseIntArray) this.f17216b);
                return;
            case 13:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f17217c, (ArrayList) this.d, (ArrayList) this.f17218f, (ArrayList) this.f17216b);
                return;
            case 14:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f17217c, (a0.h) this.f17218f, (ArrayList) this.d, (Collection) this.f17216b);
                return;
            case 15:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f17218f, (HashMap) this.f17217c, (String) this.f17216b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f17218f, (MessageObject) this.f17217c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17216b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17218f, (File) this.f17217c, (TLRPC.Document) this.d, (MessageObject) this.f17216b);
                return;
        }
    }

    public f5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17215a = i10;
        this.e = obj;
        this.f17217c = arrayList;
        this.d = arrayList2;
        this.f17218f = arrayList3;
        this.f17216b = cloneable;
    }

    public f5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17215a = 2;
        this.e = translateController;
        this.f17218f = messageObject;
        this.f17216b = str;
        this.f17217c = messageKey;
        this.d = callback;
    }

    public f5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17215a = 4;
        this.e = factCheckController;
        this.f17218f = tLObject;
        this.d = tL_getFactCheck;
        this.f17217c = arrayList;
        this.f17216b = hashMap;
    }

    public f5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17215a = 1;
        this.e = thumbGenerateTask;
        this.f17216b = str;
        this.f17217c = arrayList;
        this.f17218f = bitmapDrawable;
        this.d = arrayList2;
    }

    public f5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f17215a = i10;
        this.e = messagesController;
        this.f17216b = str;
        this.f17218f = obj;
        this.f17217c = e6Var;
        this.d = f6Var;
    }

    public f5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f17215a = 14;
        this.e = notificationsController;
        this.f17217c = arrayList;
        this.f17218f = hVar;
        this.d = arrayList2;
        this.f17216b = collection;
    }

    public f5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17215a = 15;
        this.e = sendMessagesHelper;
        this.f17218f = importingStickers;
        this.f17217c = hashMap;
        this.f17216b = str;
        this.d = stringCallback;
    }
}
