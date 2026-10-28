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
public final class j5 implements Runnable {
    public final int f20406a;
    public final Object f20407b;
    public final Object f20408c;
    public final Object d;
    public final Object e;
    public final Object f20409f;

    public j5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f20406a = i10;
        this.e = obj;
        this.f20409f = obj2;
        this.f20408c = obj3;
        this.d = obj4;
        this.f20407b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f20406a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f20409f, (ArrayList) this.f20408c, (ArrayList) this.d, (String) this.f20407b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f20407b, (ArrayList) this.f20408c, (BitmapDrawable) this.f20409f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f20409f, (String) this.f20407b, (TranslateController.MessageKey) this.f20408c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f20409f, (ArrayList) this.f20408c, (ArrayList) this.d, (ResultCallback) this.f20407b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f20409f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f20408c, (HashMap) this.f20407b);
                return;
            case 5:
                ((MediaController) this.e).lambda$prepareResumedRecording$26((File) this.f20409f, (TLRPC.TL_document) this.f20408c, (byte[]) this.d, (MediaDataController.DraftVoice) this.f20407b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f20409f, (TLObject) this.f20408c, (Long) this.d, (Utilities.Callback) this.f20407b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$setUserAdminRole$99((TLRPC.User) this.f20409f, (TLRPC.Chat) this.f20408c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f20407b);
                return;
            case 8:
                ((MessagesController) this.e).lambda$saveThemeToServer$118((String) this.f20407b, (String) this.f20409f, (org.telegram.ui.ActionBar.w6) this.f20408c, (org.telegram.ui.ActionBar.x6) this.d);
                return;
            case 9:
                ((MessagesController) this.e).lambda$getDifference$359((TLRPC.updates_Difference) this.f20409f, (ArrayList) this.f20408c, (a0.h) this.d, (a0.h) this.f20407b);
                return;
            case 10:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f20407b, (File) this.f20409f, (org.telegram.ui.ActionBar.w6) this.f20408c, (org.telegram.ui.ActionBar.x6) this.d);
                return;
            case 11:
                ((MessagesController) this.e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f20409f, (a0.h) this.f20408c, (a0.h) this.d, (a0.h) this.f20407b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$readAllDialogs$67((ArrayList) this.f20408c, (ArrayList) this.d, (ArrayList) this.f20409f, (a0.h) this.f20407b);
                return;
            case 13:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f20408c, (ArrayList) this.d, (ArrayList) this.f20409f, (ArrayList) this.f20407b);
                return;
            case 14:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$124((LongSparseIntArray) this.f20409f, (LongSparseIntArray) this.f20408c, (a0.h) this.d, (LongSparseIntArray) this.f20407b);
                return;
            case 15:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f20408c, (a0.h) this.f20409f, (ArrayList) this.d, (Collection) this.f20407b);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f20409f, (HashMap) this.f20408c, (String) this.f20407b, (MessagesStorage.StringCallback) this.d);
                return;
            case 17:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f20409f, (MessageObject) this.f20408c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f20407b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f20409f, (File) this.f20408c, (TLRPC.Document) this.d, (MessageObject) this.f20407b);
                return;
        }
    }

    public j5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f20406a = i10;
        this.e = obj;
        this.f20408c = arrayList;
        this.d = arrayList2;
        this.f20409f = arrayList3;
        this.f20407b = cloneable;
    }

    public j5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f20406a = 2;
        this.e = translateController;
        this.f20409f = messageObject;
        this.f20407b = str;
        this.f20408c = messageKey;
        this.d = callback;
    }

    public j5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f20406a = 4;
        this.e = factCheckController;
        this.f20409f = tLObject;
        this.d = tL_getFactCheck;
        this.f20408c = arrayList;
        this.f20407b = hashMap;
    }

    public j5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f20406a = 1;
        this.e = thumbGenerateTask;
        this.f20407b = str;
        this.f20408c = arrayList;
        this.f20409f = bitmapDrawable;
        this.d = arrayList2;
    }

    public j5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.w6 w6Var, org.telegram.ui.ActionBar.x6 x6Var, int i10) {
        this.f20406a = i10;
        this.e = messagesController;
        this.f20407b = str;
        this.f20409f = obj;
        this.f20408c = w6Var;
        this.d = x6Var;
    }

    public j5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f20406a = 15;
        this.e = notificationsController;
        this.f20408c = arrayList;
        this.f20409f = hVar;
        this.d = arrayList2;
        this.f20407b = collection;
    }

    public j5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f20406a = 16;
        this.e = sendMessagesHelper;
        this.f20409f = importingStickers;
        this.f20408c = hashMap;
        this.f20407b = str;
        this.d = stringCallback;
    }
}
