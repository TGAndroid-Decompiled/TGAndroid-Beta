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
    public final int f17488a;
    public final Object f17489b;
    public final Object f17490c;
    public final Object d;
    public final Object f17491e;
    public final Object f17492f;

    public c5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17488a = i10;
        this.f17491e = obj;
        this.f17492f = obj2;
        this.f17490c = obj3;
        this.d = obj4;
        this.f17489b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17488a) {
            case 0:
                ((ImageLoader.CacheImage) this.f17491e).lambda$setImageAndClear$0((Drawable) this.f17492f, (ArrayList) this.f17490c, (ArrayList) this.d, (String) this.f17489b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f17491e).lambda$run$1((String) this.f17489b, (ArrayList) this.f17490c, (BitmapDrawable) this.f17492f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f17491e).lambda$detectPhotoLanguage$39((MessageObject) this.f17492f, (String) this.f17489b, (TranslateController.MessageKey) this.f17490c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f17491e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17492f, (ArrayList) this.f17490c, (ArrayList) this.d, (ResultCallback) this.f17489b);
                return;
            case 4:
                ((FactCheckController) this.f17491e).lambda$loadMissing$1((TLObject) this.f17492f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17490c, (HashMap) this.f17489b);
                return;
            case 5:
                ((MessagesController) this.f17491e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f17492f, (TLObject) this.f17490c, (Long) this.d, (Utilities.Callback) this.f17489b);
                return;
            case 6:
                ((MessagesController) this.f17491e).lambda$setUserAdminRole$99((TLRPC.User) this.f17492f, (TLRPC.Chat) this.f17490c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17489b);
                return;
            case 7:
                ((MessagesController) this.f17491e).lambda$saveThemeToServer$118((String) this.f17489b, (String) this.f17492f, (org.telegram.ui.ActionBar.f6) this.f17490c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 8:
                ((MessagesController) this.f17491e).lambda$getDifference$357((TLRPC.updates_Difference) this.f17492f, (ArrayList) this.f17490c, (a0.i) this.d, (a0.i) this.f17489b);
                return;
            case 9:
                ((MessagesController) this.f17491e).lambda$saveThemeToServer$119((String) this.f17489b, (File) this.f17492f, (org.telegram.ui.ActionBar.f6) this.f17490c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 10:
                ((MessagesController) this.f17491e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f17492f, (a0.i) this.f17490c, (a0.i) this.d, (a0.i) this.f17489b);
                return;
            case 11:
                ((MessagesStorage) this.f17491e).lambda$readAllDialogs$64((ArrayList) this.f17490c, (ArrayList) this.d, (ArrayList) this.f17492f, (a0.i) this.f17489b);
                return;
            case 12:
                ((MessagesStorage) this.f17491e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17492f, (LongSparseIntArray) this.f17490c, (a0.i) this.d, (LongSparseIntArray) this.f17489b);
                return;
            case 13:
                ((Utilities.Callback4) this.f17491e).run((ArrayList) this.f17490c, (ArrayList) this.d, (ArrayList) this.f17492f, (ArrayList) this.f17489b);
                return;
            case 14:
                ((NotificationsController) this.f17491e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f17490c, (a0.i) this.f17492f, (ArrayList) this.d, (Collection) this.f17489b);
                return;
            case 15:
                ((SendMessagesHelper) this.f17491e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f17492f, (HashMap) this.f17490c, (String) this.f17489b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f17491e).lambda$didReceivedNotification$2((File) this.f17492f, (MessageObject) this.f17490c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17489b);
                return;
            default:
                ((SendMessagesHelper) this.f17491e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17492f, (File) this.f17490c, (TLRPC.Document) this.d, (MessageObject) this.f17489b);
                return;
        }
    }

    public c5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17488a = i10;
        this.f17491e = obj;
        this.f17490c = arrayList;
        this.d = arrayList2;
        this.f17492f = arrayList3;
        this.f17489b = cloneable;
    }

    public c5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17488a = 2;
        this.f17491e = translateController;
        this.f17492f = messageObject;
        this.f17489b = str;
        this.f17490c = messageKey;
        this.d = callback;
    }

    public c5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17488a = 4;
        this.f17491e = factCheckController;
        this.f17492f = tLObject;
        this.d = tL_getFactCheck;
        this.f17490c = arrayList;
        this.f17489b = hashMap;
    }

    public c5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17488a = 1;
        this.f17491e = thumbGenerateTask;
        this.f17489b = str;
        this.f17490c = arrayList;
        this.f17492f = bitmapDrawable;
        this.d = arrayList2;
    }

    public c5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f17488a = i10;
        this.f17491e = messagesController;
        this.f17489b = str;
        this.f17492f = obj;
        this.f17490c = f6Var;
        this.d = g6Var;
    }

    public c5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f17488a = 14;
        this.f17491e = notificationsController;
        this.f17490c = arrayList;
        this.f17492f = iVar;
        this.d = arrayList2;
        this.f17489b = collection;
    }

    public c5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17488a = 15;
        this.f17491e = sendMessagesHelper;
        this.f17492f = importingStickers;
        this.f17490c = hashMap;
        this.f17489b = str;
        this.d = stringCallback;
    }
}
