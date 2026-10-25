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
public final class i5 implements Runnable {
    public final int f20312a;
    public final Object f20313b;
    public final Object f20314c;
    public final Object d;
    public final Object e;
    public final Object f20315f;

    public i5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f20312a = i10;
        this.e = obj;
        this.f20315f = obj2;
        this.f20314c = obj3;
        this.d = obj4;
        this.f20313b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f20312a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f20315f, (ArrayList) this.f20314c, (ArrayList) this.d, (String) this.f20313b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f20313b, (ArrayList) this.f20314c, (BitmapDrawable) this.f20315f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f20315f, (String) this.f20313b, (TranslateController.MessageKey) this.f20314c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f20315f, (ArrayList) this.f20314c, (ArrayList) this.d, (ResultCallback) this.f20313b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f20315f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f20314c, (HashMap) this.f20313b);
                return;
            case 5:
                ((MediaController) this.e).lambda$prepareResumedRecording$26((File) this.f20315f, (TLRPC.TL_document) this.f20314c, (byte[]) this.d, (MediaDataController.DraftVoice) this.f20313b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f20315f, (TLObject) this.f20314c, (Long) this.d, (Utilities.Callback) this.f20313b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$setUserAdminRole$99((TLRPC.User) this.f20315f, (TLRPC.Chat) this.f20314c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f20313b);
                return;
            case 8:
                ((MessagesController) this.e).lambda$saveThemeToServer$118((String) this.f20313b, (String) this.f20315f, (org.telegram.ui.ActionBar.w6) this.f20314c, (org.telegram.ui.ActionBar.x6) this.d);
                return;
            case 9:
                ((MessagesController) this.e).lambda$getDifference$359((TLRPC.updates_Difference) this.f20315f, (ArrayList) this.f20314c, (a0.h) this.d, (a0.h) this.f20313b);
                return;
            case 10:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f20313b, (File) this.f20315f, (org.telegram.ui.ActionBar.w6) this.f20314c, (org.telegram.ui.ActionBar.x6) this.d);
                return;
            case 11:
                ((MessagesController) this.e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f20315f, (a0.h) this.f20314c, (a0.h) this.d, (a0.h) this.f20313b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$readAllDialogs$67((ArrayList) this.f20314c, (ArrayList) this.d, (ArrayList) this.f20315f, (a0.h) this.f20313b);
                return;
            case 13:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f20314c, (ArrayList) this.d, (ArrayList) this.f20315f, (ArrayList) this.f20313b);
                return;
            case 14:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$123((LongSparseIntArray) this.f20315f, (LongSparseIntArray) this.f20314c, (a0.h) this.d, (LongSparseIntArray) this.f20313b);
                return;
            case 15:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f20314c, (a0.h) this.f20315f, (ArrayList) this.d, (Collection) this.f20313b);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f20315f, (HashMap) this.f20314c, (String) this.f20313b, (MessagesStorage.StringCallback) this.d);
                return;
            case 17:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f20315f, (MessageObject) this.f20314c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f20313b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f20315f, (File) this.f20314c, (TLRPC.Document) this.d, (MessageObject) this.f20313b);
                return;
        }
    }

    public i5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f20312a = i10;
        this.e = obj;
        this.f20314c = arrayList;
        this.d = arrayList2;
        this.f20315f = arrayList3;
        this.f20313b = cloneable;
    }

    public i5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f20312a = 2;
        this.e = translateController;
        this.f20315f = messageObject;
        this.f20313b = str;
        this.f20314c = messageKey;
        this.d = callback;
    }

    public i5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f20312a = 4;
        this.e = factCheckController;
        this.f20315f = tLObject;
        this.d = tL_getFactCheck;
        this.f20314c = arrayList;
        this.f20313b = hashMap;
    }

    public i5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f20312a = 1;
        this.e = thumbGenerateTask;
        this.f20313b = str;
        this.f20314c = arrayList;
        this.f20315f = bitmapDrawable;
        this.d = arrayList2;
    }

    public i5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.w6 w6Var, org.telegram.ui.ActionBar.x6 x6Var, int i10) {
        this.f20312a = i10;
        this.e = messagesController;
        this.f20313b = str;
        this.f20315f = obj;
        this.f20314c = w6Var;
        this.d = x6Var;
    }

    public i5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f20312a = 15;
        this.e = notificationsController;
        this.f20314c = arrayList;
        this.f20315f = hVar;
        this.d = arrayList2;
        this.f20313b = collection;
    }

    public i5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f20312a = 16;
        this.e = sendMessagesHelper;
        this.f20315f = importingStickers;
        this.f20314c = hashMap;
        this.f20313b = str;
        this.d = stringCallback;
    }
}
