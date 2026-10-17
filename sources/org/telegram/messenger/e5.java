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
public final class e5 implements Runnable {
    public final int f18234a;
    public final Object f18235b;
    public final Object f18236c;
    public final Object d;
    public final Object e;
    public final Object f18237f;

    public e5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f18234a = i10;
        this.e = obj;
        this.f18237f = obj2;
        this.f18236c = obj3;
        this.d = obj4;
        this.f18235b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f18234a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f18237f, (ArrayList) this.f18236c, (ArrayList) this.d, (String) this.f18235b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f18235b, (ArrayList) this.f18236c, (BitmapDrawable) this.f18237f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f18237f, (String) this.f18235b, (TranslateController.MessageKey) this.f18236c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f18237f, (ArrayList) this.f18236c, (ArrayList) this.d, (ResultCallback) this.f18235b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f18237f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f18236c, (HashMap) this.f18235b);
                return;
            case 5:
                ((MessagesController) this.e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f18237f, (TLObject) this.f18236c, (Long) this.d, (Utilities.Callback) this.f18235b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$setUserAdminRole$99((TLRPC.User) this.f18237f, (TLRPC.Chat) this.f18236c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f18235b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$saveThemeToServer$118((String) this.f18235b, (String) this.f18237f, (org.telegram.ui.ActionBar.f6) this.f18236c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 8:
                ((MessagesController) this.e).lambda$getDifference$357((TLRPC.updates_Difference) this.f18237f, (ArrayList) this.f18236c, (a0.h) this.d, (a0.h) this.f18235b);
                return;
            case 9:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f18235b, (File) this.f18237f, (org.telegram.ui.ActionBar.f6) this.f18236c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 10:
                ((MessagesController) this.e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f18237f, (a0.h) this.f18236c, (a0.h) this.d, (a0.h) this.f18235b);
                return;
            case 11:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f18236c, (ArrayList) this.d, (ArrayList) this.f18237f, (a0.h) this.f18235b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f18237f, (LongSparseIntArray) this.f18236c, (a0.h) this.d, (LongSparseIntArray) this.f18235b);
                return;
            case 13:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f18236c, (ArrayList) this.d, (ArrayList) this.f18237f, (ArrayList) this.f18235b);
                return;
            case 14:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f18236c, (a0.h) this.f18237f, (ArrayList) this.d, (Collection) this.f18235b);
                return;
            case 15:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f18237f, (HashMap) this.f18236c, (String) this.f18235b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f18237f, (MessageObject) this.f18236c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f18235b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f18237f, (File) this.f18236c, (TLRPC.Document) this.d, (MessageObject) this.f18235b);
                return;
        }
    }

    public e5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f18234a = i10;
        this.e = obj;
        this.f18236c = arrayList;
        this.d = arrayList2;
        this.f18237f = arrayList3;
        this.f18235b = cloneable;
    }

    public e5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f18234a = 2;
        this.e = translateController;
        this.f18237f = messageObject;
        this.f18235b = str;
        this.f18236c = messageKey;
        this.d = callback;
    }

    public e5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f18234a = 4;
        this.e = factCheckController;
        this.f18237f = tLObject;
        this.d = tL_getFactCheck;
        this.f18236c = arrayList;
        this.f18235b = hashMap;
    }

    public e5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f18234a = 1;
        this.e = thumbGenerateTask;
        this.f18235b = str;
        this.f18236c = arrayList;
        this.f18237f = bitmapDrawable;
        this.d = arrayList2;
    }

    public e5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f18234a = i10;
        this.e = messagesController;
        this.f18235b = str;
        this.f18237f = obj;
        this.f18236c = f6Var;
        this.d = g6Var;
    }

    public e5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f18234a = 14;
        this.e = notificationsController;
        this.f18236c = arrayList;
        this.f18237f = hVar;
        this.d = arrayList2;
        this.f18235b = collection;
    }

    public e5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f18234a = 15;
        this.e = sendMessagesHelper;
        this.f18237f = importingStickers;
        this.f18236c = hashMap;
        this.f18235b = str;
        this.d = stringCallback;
    }
}
