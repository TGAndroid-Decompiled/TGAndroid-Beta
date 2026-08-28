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
public final class a5 implements Runnable {
    public final int f19693a;
    public final Object f19694b;
    public final Object f19695c;
    public final Object d;
    public final Object f19696e;
    public final Object f19697f;

    public a5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f19693a = i9;
        this.f19696e = obj;
        this.f19697f = obj2;
        this.f19695c = obj3;
        this.d = obj4;
        this.f19694b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f19693a) {
            case 0:
                ((ImageLoader.CacheImage) this.f19696e).lambda$setImageAndClear$0((Drawable) this.f19697f, (ArrayList) this.f19695c, (ArrayList) this.d, (String) this.f19694b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f19696e).lambda$run$1((String) this.f19694b, (ArrayList) this.f19695c, (BitmapDrawable) this.f19697f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f19696e).lambda$detectPhotoLanguage$39((MessageObject) this.f19697f, (String) this.f19694b, (TranslateController.MessageKey) this.f19695c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f19696e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f19697f, (ArrayList) this.f19695c, (ArrayList) this.d, (ResultCallback) this.f19694b);
                return;
            case 4:
                ((FactCheckController) this.f19696e).lambda$loadMissing$1((TLObject) this.f19697f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f19695c, (HashMap) this.f19694b);
                return;
            case 5:
                ((MessagesController) this.f19696e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f19697f, (TLObject) this.f19695c, (Long) this.d, (Utilities.Callback) this.f19694b);
                return;
            case 6:
                ((MessagesController) this.f19696e).lambda$getDifference$358((TLRPC.updates_Difference) this.f19697f, (ArrayList) this.f19695c, (a0.h) this.d, (a0.h) this.f19694b);
                return;
            case 7:
                ((MessagesController) this.f19696e).lambda$saveThemeToServer$119((String) this.f19694b, (String) this.f19697f, (org.telegram.ui.ActionBar.d6) this.f19695c, (org.telegram.ui.ActionBar.e6) this.d);
                return;
            case 8:
                ((MessagesController) this.f19696e).lambda$setUserAdminRole$100((TLRPC.User) this.f19697f, (TLRPC.Chat) this.f19695c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f19694b);
                return;
            case 9:
                ((MessagesController) this.f19696e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f19697f, (a0.h) this.f19695c, (a0.h) this.d, (a0.h) this.f19694b);
                return;
            case 10:
                ((MessagesController) this.f19696e).lambda$saveThemeToServer$120((String) this.f19694b, (File) this.f19697f, (org.telegram.ui.ActionBar.d6) this.f19695c, (org.telegram.ui.ActionBar.e6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.f19696e).lambda$readAllDialogs$64((ArrayList) this.f19695c, (ArrayList) this.d, (ArrayList) this.f19697f, (a0.h) this.f19694b);
                return;
            case 12:
                ((MessagesStorage) this.f19696e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f19697f, (LongSparseIntArray) this.f19695c, (a0.h) this.d, (LongSparseIntArray) this.f19694b);
                return;
            case 13:
                ((Utilities.Callback4) this.f19696e).run((ArrayList) this.f19695c, (ArrayList) this.d, (ArrayList) this.f19697f, (ArrayList) this.f19694b);
                return;
            case 14:
                ((NotificationsController) this.f19696e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f19695c, (a0.h) this.f19697f, (ArrayList) this.d, (Collection) this.f19694b);
                return;
            case 15:
                ((SendMessagesHelper) this.f19696e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f19697f, (HashMap) this.f19695c, (String) this.f19694b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f19696e).lambda$didReceivedNotification$2((File) this.f19697f, (MessageObject) this.f19695c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19694b);
                return;
            default:
                ((SendMessagesHelper) this.f19696e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f19697f, (File) this.f19695c, (TLRPC.Document) this.d, (MessageObject) this.f19694b);
                return;
        }
    }

    public a5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i9) {
        this.f19693a = i9;
        this.f19696e = obj;
        this.f19695c = arrayList;
        this.d = arrayList2;
        this.f19697f = arrayList3;
        this.f19694b = cloneable;
    }

    public a5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f19693a = 2;
        this.f19696e = translateController;
        this.f19697f = messageObject;
        this.f19694b = str;
        this.f19695c = messageKey;
        this.d = callback;
    }

    public a5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f19693a = 4;
        this.f19696e = factCheckController;
        this.f19697f = tLObject;
        this.d = tL_getFactCheck;
        this.f19695c = arrayList;
        this.f19694b = hashMap;
    }

    public a5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f19693a = 1;
        this.f19696e = thumbGenerateTask;
        this.f19694b = str;
        this.f19695c = arrayList;
        this.f19697f = bitmapDrawable;
        this.d = arrayList2;
    }

    public a5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.e6 e6Var, int i9) {
        this.f19693a = i9;
        this.f19696e = messagesController;
        this.f19694b = str;
        this.f19697f = obj;
        this.f19695c = d6Var;
        this.d = e6Var;
    }

    public a5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f19693a = 14;
        this.f19696e = notificationsController;
        this.f19695c = arrayList;
        this.f19697f = hVar;
        this.d = arrayList2;
        this.f19694b = collection;
    }

    public a5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f19693a = 15;
        this.f19696e = sendMessagesHelper;
        this.f19697f = importingStickers;
        this.f19695c = hashMap;
        this.f19694b = str;
        this.d = stringCallback;
    }
}
