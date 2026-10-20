package org.telegram.messenger;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
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
public final class g5 implements Runnable {
    public final int f18418a;
    public final Object f18419b;
    public final Object f18420c;
    public final Object d;
    public final Object e;
    public final Object f18421f;

    public g5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f18418a = i10;
        this.e = obj;
        this.f18421f = obj2;
        this.f18420c = obj3;
        this.d = obj4;
        this.f18419b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f18418a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f18421f, (ArrayList) this.f18420c, (ArrayList) this.d, (String) this.f18419b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f18419b, (ArrayList) this.f18420c, (BitmapDrawable) this.f18421f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f18421f, (String) this.f18419b, (TranslateController.MessageKey) this.f18420c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f18421f, (ArrayList) this.f18420c, (ArrayList) this.d, (ResultCallback) this.f18419b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f18421f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f18420c, (HashMap) this.f18419b);
                return;
            case 5:
                ((MediaController) this.e).lambda$prepareResumedRecording$25((File) this.f18421f, (TLRPC.TL_document) this.f18420c, (byte[]) this.d, (MediaDataController.DraftVoice) this.f18419b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f18421f, (TLObject) this.f18420c, (Long) this.d, (Utilities.Callback) this.f18419b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$setUserAdminRole$99((TLRPC.User) this.f18421f, (TLRPC.Chat) this.f18420c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f18419b);
                return;
            case 8:
                ((MessagesController) this.e).lambda$saveThemeToServer$118((String) this.f18419b, (String) this.f18421f, (org.telegram.ui.ActionBar.f6) this.f18420c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 9:
                ((MessagesController) this.e).lambda$getDifference$357((TLRPC.updates_Difference) this.f18421f, (ArrayList) this.f18420c, (a0.h) this.d, (a0.h) this.f18419b);
                return;
            case 10:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f18419b, (File) this.f18421f, (org.telegram.ui.ActionBar.f6) this.f18420c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 11:
                ((MessagesController) this.e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f18421f, (a0.h) this.f18420c, (a0.h) this.d, (a0.h) this.f18419b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f18420c, (ArrayList) this.d, (ArrayList) this.f18421f, (a0.h) this.f18419b);
                return;
            case 13:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f18421f, (LongSparseIntArray) this.f18420c, (a0.h) this.d, (LongSparseIntArray) this.f18419b);
                return;
            case 14:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f18420c, (ArrayList) this.d, (ArrayList) this.f18421f, (ArrayList) this.f18419b);
                return;
            case 15:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f18420c, (a0.h) this.f18421f, (ArrayList) this.d, (Collection) this.f18419b);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f18421f, (HashMap) this.f18420c, (String) this.f18419b, (MessagesStorage.StringCallback) this.d);
                return;
            case 17:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f18421f, (MessageObject) this.f18420c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f18419b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f18421f, (File) this.f18420c, (TLRPC.Document) this.d, (MessageObject) this.f18419b);
                return;
        }
    }

    public g5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f18418a = i10;
        this.e = obj;
        this.f18420c = arrayList;
        this.d = arrayList2;
        this.f18421f = arrayList3;
        this.f18419b = cloneable;
    }

    public g5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f18418a = 2;
        this.e = translateController;
        this.f18421f = messageObject;
        this.f18419b = str;
        this.f18420c = messageKey;
        this.d = callback;
    }

    public g5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f18418a = 4;
        this.e = factCheckController;
        this.f18421f = tLObject;
        this.d = tL_getFactCheck;
        this.f18420c = arrayList;
        this.f18419b = hashMap;
    }

    public g5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f18418a = 1;
        this.e = thumbGenerateTask;
        this.f18419b = str;
        this.f18420c = arrayList;
        this.f18421f = bitmapDrawable;
        this.d = arrayList2;
    }

    public g5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f18418a = i10;
        this.e = messagesController;
        this.f18419b = str;
        this.f18421f = obj;
        this.f18420c = f6Var;
        this.d = g6Var;
    }

    public g5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f18418a = 15;
        this.e = notificationsController;
        this.f18420c = arrayList;
        this.f18421f = hVar;
        this.d = arrayList2;
        this.f18419b = collection;
    }

    public g5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f18418a = 16;
        this.e = sendMessagesHelper;
        this.f18421f = importingStickers;
        this.f18420c = hashMap;
        this.f18419b = str;
        this.d = stringCallback;
    }
}
