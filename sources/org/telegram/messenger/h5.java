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
public final class h5 implements Runnable {
    public final int f18493a;
    public final Object f18494b;
    public final Object f18495c;
    public final Object d;
    public final Object e;
    public final Object f18496f;

    public h5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f18493a = i10;
        this.e = obj;
        this.f18496f = obj2;
        this.f18495c = obj3;
        this.d = obj4;
        this.f18494b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f18493a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f18496f, (ArrayList) this.f18495c, (ArrayList) this.d, (String) this.f18494b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f18494b, (ArrayList) this.f18495c, (BitmapDrawable) this.f18496f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f18496f, (String) this.f18494b, (TranslateController.MessageKey) this.f18495c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f18496f, (ArrayList) this.f18495c, (ArrayList) this.d, (ResultCallback) this.f18494b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f18496f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f18495c, (HashMap) this.f18494b);
                return;
            case 5:
                ((MediaController) this.e).lambda$prepareResumedRecording$26((File) this.f18496f, (TLRPC.TL_document) this.f18495c, (byte[]) this.d, (MediaDataController.DraftVoice) this.f18494b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f18496f, (TLObject) this.f18495c, (Long) this.d, (Utilities.Callback) this.f18494b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$setUserAdminRole$99((TLRPC.User) this.f18496f, (TLRPC.Chat) this.f18495c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f18494b);
                return;
            case 8:
                ((MessagesController) this.e).lambda$saveThemeToServer$118((String) this.f18494b, (String) this.f18496f, (org.telegram.ui.ActionBar.f6) this.f18495c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 9:
                ((MessagesController) this.e).lambda$getDifference$357((TLRPC.updates_Difference) this.f18496f, (ArrayList) this.f18495c, (a0.h) this.d, (a0.h) this.f18494b);
                return;
            case 10:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f18494b, (File) this.f18496f, (org.telegram.ui.ActionBar.f6) this.f18495c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 11:
                ((MessagesController) this.e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f18496f, (a0.h) this.f18495c, (a0.h) this.d, (a0.h) this.f18494b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f18495c, (ArrayList) this.d, (ArrayList) this.f18496f, (a0.h) this.f18494b);
                return;
            case 13:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f18496f, (LongSparseIntArray) this.f18495c, (a0.h) this.d, (LongSparseIntArray) this.f18494b);
                return;
            case 14:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f18495c, (ArrayList) this.d, (ArrayList) this.f18496f, (ArrayList) this.f18494b);
                return;
            case 15:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f18495c, (a0.h) this.f18496f, (ArrayList) this.d, (Collection) this.f18494b);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f18496f, (HashMap) this.f18495c, (String) this.f18494b, (MessagesStorage.StringCallback) this.d);
                return;
            case 17:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f18496f, (MessageObject) this.f18495c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f18494b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f18496f, (File) this.f18495c, (TLRPC.Document) this.d, (MessageObject) this.f18494b);
                return;
        }
    }

    public h5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f18493a = i10;
        this.e = obj;
        this.f18495c = arrayList;
        this.d = arrayList2;
        this.f18496f = arrayList3;
        this.f18494b = cloneable;
    }

    public h5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f18493a = 2;
        this.e = translateController;
        this.f18496f = messageObject;
        this.f18494b = str;
        this.f18495c = messageKey;
        this.d = callback;
    }

    public h5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f18493a = 4;
        this.e = factCheckController;
        this.f18496f = tLObject;
        this.d = tL_getFactCheck;
        this.f18495c = arrayList;
        this.f18494b = hashMap;
    }

    public h5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f18493a = 1;
        this.e = thumbGenerateTask;
        this.f18494b = str;
        this.f18495c = arrayList;
        this.f18496f = bitmapDrawable;
        this.d = arrayList2;
    }

    public h5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f18493a = i10;
        this.e = messagesController;
        this.f18494b = str;
        this.f18496f = obj;
        this.f18495c = f6Var;
        this.d = g6Var;
    }

    public h5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f18493a = 15;
        this.e = notificationsController;
        this.f18495c = arrayList;
        this.f18496f = hVar;
        this.d = arrayList2;
        this.f18494b = collection;
    }

    public h5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f18493a = 16;
        this.e = sendMessagesHelper;
        this.f18496f = importingStickers;
        this.f18495c = hashMap;
        this.f18494b = str;
        this.d = stringCallback;
    }
}
