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
    public final int f17153a;
    public final Object f17154b;
    public final Object f17155c;
    public final Object d;
    public final Object f17156e;
    public final Object f17157f;

    public a5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17153a = i10;
        this.f17156e = obj;
        this.f17157f = obj2;
        this.f17155c = obj3;
        this.d = obj4;
        this.f17154b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17153a) {
            case 0:
                ((ImageLoader.CacheImage) this.f17156e).lambda$setImageAndClear$0((Drawable) this.f17157f, (ArrayList) this.f17155c, (ArrayList) this.d, (String) this.f17154b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f17156e).lambda$run$1((String) this.f17154b, (ArrayList) this.f17155c, (BitmapDrawable) this.f17157f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f17156e).lambda$detectPhotoLanguage$39((MessageObject) this.f17157f, (String) this.f17154b, (TranslateController.MessageKey) this.f17155c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f17156e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17157f, (ArrayList) this.f17155c, (ArrayList) this.d, (ResultCallback) this.f17154b);
                return;
            case 4:
                ((FactCheckController) this.f17156e).lambda$loadMissing$1((TLObject) this.f17157f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17155c, (HashMap) this.f17154b);
                return;
            case 5:
                ((MessagesController) this.f17156e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f17157f, (TLObject) this.f17155c, (Long) this.d, (Utilities.Callback) this.f17154b);
                return;
            case 6:
                ((MessagesController) this.f17156e).lambda$getDifference$358((TLRPC.updates_Difference) this.f17157f, (ArrayList) this.f17155c, (a0.i) this.d, (a0.i) this.f17154b);
                return;
            case 7:
                ((MessagesController) this.f17156e).lambda$saveThemeToServer$119((String) this.f17154b, (String) this.f17157f, (org.telegram.ui.ActionBar.h6) this.f17155c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 8:
                ((MessagesController) this.f17156e).lambda$setUserAdminRole$100((TLRPC.User) this.f17157f, (TLRPC.Chat) this.f17155c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17154b);
                return;
            case 9:
                ((MessagesController) this.f17156e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f17157f, (a0.i) this.f17155c, (a0.i) this.d, (a0.i) this.f17154b);
                return;
            case 10:
                ((MessagesController) this.f17156e).lambda$saveThemeToServer$120((String) this.f17154b, (File) this.f17157f, (org.telegram.ui.ActionBar.h6) this.f17155c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.f17156e).lambda$readAllDialogs$64((ArrayList) this.f17155c, (ArrayList) this.d, (ArrayList) this.f17157f, (a0.i) this.f17154b);
                return;
            case 12:
                ((MessagesStorage) this.f17156e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17157f, (LongSparseIntArray) this.f17155c, (a0.i) this.d, (LongSparseIntArray) this.f17154b);
                return;
            case 13:
                ((Utilities.Callback4) this.f17156e).run((ArrayList) this.f17155c, (ArrayList) this.d, (ArrayList) this.f17157f, (ArrayList) this.f17154b);
                return;
            case 14:
                ((NotificationsController) this.f17156e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f17155c, (a0.i) this.f17157f, (ArrayList) this.d, (Collection) this.f17154b);
                return;
            case 15:
                ((SendMessagesHelper) this.f17156e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f17157f, (HashMap) this.f17155c, (String) this.f17154b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f17156e).lambda$didReceivedNotification$2((File) this.f17157f, (MessageObject) this.f17155c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17154b);
                return;
            default:
                ((SendMessagesHelper) this.f17156e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17157f, (File) this.f17155c, (TLRPC.Document) this.d, (MessageObject) this.f17154b);
                return;
        }
    }

    public a5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17153a = i10;
        this.f17156e = obj;
        this.f17155c = arrayList;
        this.d = arrayList2;
        this.f17157f = arrayList3;
        this.f17154b = cloneable;
    }

    public a5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17153a = 2;
        this.f17156e = translateController;
        this.f17157f = messageObject;
        this.f17154b = str;
        this.f17155c = messageKey;
        this.d = callback;
    }

    public a5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17153a = 4;
        this.f17156e = factCheckController;
        this.f17157f = tLObject;
        this.d = tL_getFactCheck;
        this.f17155c = arrayList;
        this.f17154b = hashMap;
    }

    public a5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17153a = 1;
        this.f17156e = thumbGenerateTask;
        this.f17154b = str;
        this.f17155c = arrayList;
        this.f17157f = bitmapDrawable;
        this.d = arrayList2;
    }

    public a5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this.f17153a = i10;
        this.f17156e = messagesController;
        this.f17154b = str;
        this.f17157f = obj;
        this.f17155c = h6Var;
        this.d = i6Var;
    }

    public a5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f17153a = 14;
        this.f17156e = notificationsController;
        this.f17155c = arrayList;
        this.f17157f = iVar;
        this.d = arrayList2;
        this.f17154b = collection;
    }

    public a5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17153a = 15;
        this.f17156e = sendMessagesHelper;
        this.f17157f = importingStickers;
        this.f17155c = hashMap;
        this.f17154b = str;
        this.d = stringCallback;
    }
}
