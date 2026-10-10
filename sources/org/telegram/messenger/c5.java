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
public final class c5 implements Runnable {
    public final int f17490a;
    public final Object f17491b;
    public final Object f17492c;
    public final Object d;
    public final Object f17493e;
    public final Object f17494f;

    public c5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17490a = i10;
        this.f17493e = obj;
        this.f17494f = obj2;
        this.f17492c = obj3;
        this.d = obj4;
        this.f17491b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17490a) {
            case 0:
                ((ImageLoader.CacheImage) this.f17493e).lambda$setImageAndClear$0((Drawable) this.f17494f, (ArrayList) this.f17492c, (ArrayList) this.d, (String) this.f17491b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f17493e).lambda$run$1((String) this.f17491b, (ArrayList) this.f17492c, (BitmapDrawable) this.f17494f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f17493e).lambda$detectPhotoLanguage$39((MessageObject) this.f17494f, (String) this.f17491b, (TranslateController.MessageKey) this.f17492c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f17493e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17494f, (ArrayList) this.f17492c, (ArrayList) this.d, (ResultCallback) this.f17491b);
                return;
            case 4:
                ((FactCheckController) this.f17493e).lambda$loadMissing$1((TLObject) this.f17494f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17492c, (HashMap) this.f17491b);
                return;
            case 5:
                ((MessagesController) this.f17493e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f17494f, (TLObject) this.f17492c, (Long) this.d, (Utilities.Callback) this.f17491b);
                return;
            case 6:
                ((MessagesController) this.f17493e).lambda$setUserAdminRole$99((TLRPC.User) this.f17494f, (TLRPC.Chat) this.f17492c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17491b);
                return;
            case 7:
                ((MessagesController) this.f17493e).lambda$saveThemeToServer$118((String) this.f17491b, (String) this.f17494f, (org.telegram.ui.ActionBar.g6) this.f17492c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 8:
                ((MessagesController) this.f17493e).lambda$getDifference$357((TLRPC.updates_Difference) this.f17494f, (ArrayList) this.f17492c, (a0.i) this.d, (a0.i) this.f17491b);
                return;
            case 9:
                ((MessagesController) this.f17493e).lambda$saveThemeToServer$119((String) this.f17491b, (File) this.f17494f, (org.telegram.ui.ActionBar.g6) this.f17492c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 10:
                ((MessagesController) this.f17493e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f17494f, (a0.i) this.f17492c, (a0.i) this.d, (a0.i) this.f17491b);
                return;
            case 11:
                ((MessagesStorage) this.f17493e).lambda$readAllDialogs$64((ArrayList) this.f17492c, (ArrayList) this.d, (ArrayList) this.f17494f, (a0.i) this.f17491b);
                return;
            case 12:
                ((MessagesStorage) this.f17493e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17494f, (LongSparseIntArray) this.f17492c, (a0.i) this.d, (LongSparseIntArray) this.f17491b);
                return;
            case 13:
                ((Utilities.Callback4) this.f17493e).run((ArrayList) this.f17492c, (ArrayList) this.d, (ArrayList) this.f17494f, (ArrayList) this.f17491b);
                return;
            case 14:
                ((NotificationsController) this.f17493e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f17492c, (a0.i) this.f17494f, (ArrayList) this.d, (Collection) this.f17491b);
                return;
            case 15:
                ((SendMessagesHelper) this.f17493e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f17494f, (HashMap) this.f17492c, (String) this.f17491b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f17493e).lambda$didReceivedNotification$2((File) this.f17494f, (MessageObject) this.f17492c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17491b);
                return;
            default:
                ((SendMessagesHelper) this.f17493e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17494f, (File) this.f17492c, (TLRPC.Document) this.d, (MessageObject) this.f17491b);
                return;
        }
    }

    public c5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17490a = i10;
        this.f17493e = obj;
        this.f17492c = arrayList;
        this.d = arrayList2;
        this.f17494f = arrayList3;
        this.f17491b = cloneable;
    }

    public c5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17490a = 2;
        this.f17493e = translateController;
        this.f17494f = messageObject;
        this.f17491b = str;
        this.f17492c = messageKey;
        this.d = callback;
    }

    public c5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17490a = 4;
        this.f17493e = factCheckController;
        this.f17494f = tLObject;
        this.d = tL_getFactCheck;
        this.f17492c = arrayList;
        this.f17491b = hashMap;
    }

    public c5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17490a = 1;
        this.f17493e = thumbGenerateTask;
        this.f17491b = str;
        this.f17492c = arrayList;
        this.f17494f = bitmapDrawable;
        this.d = arrayList2;
    }

    public c5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f17490a = i10;
        this.f17493e = messagesController;
        this.f17491b = str;
        this.f17494f = obj;
        this.f17492c = g6Var;
        this.d = h6Var;
    }

    public c5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f17490a = 14;
        this.f17493e = notificationsController;
        this.f17492c = arrayList;
        this.f17494f = iVar;
        this.d = arrayList2;
        this.f17491b = collection;
    }

    public c5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17490a = 15;
        this.f17493e = sendMessagesHelper;
        this.f17494f = importingStickers;
        this.f17492c = hashMap;
        this.f17491b = str;
        this.d = stringCallback;
    }
}
