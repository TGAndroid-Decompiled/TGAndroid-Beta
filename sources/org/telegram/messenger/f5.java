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
    public final int f16914a;
    public final Object f16915b;
    public final Object f16916c;
    public final Object d;
    public final Object e;
    public final Object f16917f;

    public f5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f16914a = i10;
        this.e = obj;
        this.f16917f = obj2;
        this.f16916c = obj3;
        this.d = obj4;
        this.f16915b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f16914a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f16917f, (ArrayList) this.f16916c, (ArrayList) this.d, (String) this.f16915b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f16915b, (ArrayList) this.f16916c, (BitmapDrawable) this.f16917f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f16917f, (String) this.f16915b, (TranslateController.MessageKey) this.f16916c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f16917f, (ArrayList) this.f16916c, (ArrayList) this.d, (ResultCallback) this.f16915b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f16917f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f16916c, (HashMap) this.f16915b);
                return;
            case 5:
                ((MessagesController) this.e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f16917f, (TLObject) this.f16916c, (Long) this.d, (Utilities.Callback) this.f16915b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$setUserAdminRole$99((TLRPC.User) this.f16917f, (TLRPC.Chat) this.f16916c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f16915b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$saveThemeToServer$118((String) this.f16915b, (String) this.f16917f, (org.telegram.ui.ActionBar.e6) this.f16916c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 8:
                ((MessagesController) this.e).lambda$getDifference$357((TLRPC.updates_Difference) this.f16917f, (ArrayList) this.f16916c, (a0.h) this.d, (a0.h) this.f16915b);
                return;
            case 9:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f16915b, (File) this.f16917f, (org.telegram.ui.ActionBar.e6) this.f16916c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 10:
                ((MessagesController) this.e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f16917f, (a0.h) this.f16916c, (a0.h) this.d, (a0.h) this.f16915b);
                return;
            case 11:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f16916c, (ArrayList) this.d, (ArrayList) this.f16917f, (a0.h) this.f16915b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f16917f, (LongSparseIntArray) this.f16916c, (a0.h) this.d, (LongSparseIntArray) this.f16915b);
                return;
            case 13:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f16916c, (ArrayList) this.d, (ArrayList) this.f16917f, (ArrayList) this.f16915b);
                return;
            case 14:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f16916c, (a0.h) this.f16917f, (ArrayList) this.d, (Collection) this.f16915b);
                return;
            case 15:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f16917f, (HashMap) this.f16916c, (String) this.f16915b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f16917f, (MessageObject) this.f16916c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f16915b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f16917f, (File) this.f16916c, (TLRPC.Document) this.d, (MessageObject) this.f16915b);
                return;
        }
    }

    public f5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f16914a = i10;
        this.e = obj;
        this.f16916c = arrayList;
        this.d = arrayList2;
        this.f16917f = arrayList3;
        this.f16915b = cloneable;
    }

    public f5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f16914a = 2;
        this.e = translateController;
        this.f16917f = messageObject;
        this.f16915b = str;
        this.f16916c = messageKey;
        this.d = callback;
    }

    public f5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f16914a = 4;
        this.e = factCheckController;
        this.f16917f = tLObject;
        this.d = tL_getFactCheck;
        this.f16916c = arrayList;
        this.f16915b = hashMap;
    }

    public f5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f16914a = 1;
        this.e = thumbGenerateTask;
        this.f16915b = str;
        this.f16916c = arrayList;
        this.f16917f = bitmapDrawable;
        this.d = arrayList2;
    }

    public f5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f16914a = i10;
        this.e = messagesController;
        this.f16915b = str;
        this.f16917f = obj;
        this.f16916c = e6Var;
        this.d = f6Var;
    }

    public f5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f16914a = 14;
        this.e = notificationsController;
        this.f16916c = arrayList;
        this.f16917f = hVar;
        this.d = arrayList2;
        this.f16915b = collection;
    }

    public f5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f16914a = 15;
        this.e = sendMessagesHelper;
        this.f16917f = importingStickers;
        this.f16916c = hashMap;
        this.f16915b = str;
        this.d = stringCallback;
    }
}
