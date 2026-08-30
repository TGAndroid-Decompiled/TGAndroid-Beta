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
public final class d5 implements Runnable {
    public final int f17031a;
    public final Object f17032b;
    public final Object f17033c;
    public final Object d;
    public final Object e;
    public final Object f17034f;

    public d5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17031a = i10;
        this.e = obj;
        this.f17034f = obj2;
        this.f17033c = obj3;
        this.d = obj4;
        this.f17032b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17031a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f17034f, (ArrayList) this.f17033c, (ArrayList) this.d, (String) this.f17032b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f17032b, (ArrayList) this.f17033c, (BitmapDrawable) this.f17034f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f17034f, (String) this.f17032b, (TranslateController.MessageKey) this.f17033c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17034f, (ArrayList) this.f17033c, (ArrayList) this.d, (ResultCallback) this.f17032b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f17034f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17033c, (HashMap) this.f17032b);
                return;
            case 5:
                ((MessagesController) this.e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f17034f, (TLObject) this.f17033c, (Long) this.d, (Utilities.Callback) this.f17032b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$getDifference$358((TLRPC.updates_Difference) this.f17034f, (ArrayList) this.f17033c, (a0.h) this.d, (a0.h) this.f17032b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f17032b, (String) this.f17034f, (org.telegram.ui.ActionBar.h6) this.f17033c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 8:
                ((MessagesController) this.e).lambda$setUserAdminRole$100((TLRPC.User) this.f17034f, (TLRPC.Chat) this.f17033c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17032b);
                return;
            case 9:
                ((MessagesController) this.e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f17034f, (a0.h) this.f17033c, (a0.h) this.d, (a0.h) this.f17032b);
                return;
            case 10:
                ((MessagesController) this.e).lambda$saveThemeToServer$120((String) this.f17032b, (File) this.f17034f, (org.telegram.ui.ActionBar.h6) this.f17033c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f17033c, (ArrayList) this.d, (ArrayList) this.f17034f, (a0.h) this.f17032b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17034f, (LongSparseIntArray) this.f17033c, (a0.h) this.d, (LongSparseIntArray) this.f17032b);
                return;
            case 13:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f17033c, (ArrayList) this.d, (ArrayList) this.f17034f, (ArrayList) this.f17032b);
                return;
            case 14:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f17033c, (a0.h) this.f17034f, (ArrayList) this.d, (Collection) this.f17032b);
                return;
            case 15:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f17034f, (HashMap) this.f17033c, (String) this.f17032b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f17034f, (MessageObject) this.f17033c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17032b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17034f, (File) this.f17033c, (TLRPC.Document) this.d, (MessageObject) this.f17032b);
                return;
        }
    }

    public d5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17031a = i10;
        this.e = obj;
        this.f17033c = arrayList;
        this.d = arrayList2;
        this.f17034f = arrayList3;
        this.f17032b = cloneable;
    }

    public d5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17031a = 2;
        this.e = translateController;
        this.f17034f = messageObject;
        this.f17032b = str;
        this.f17033c = messageKey;
        this.d = callback;
    }

    public d5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17031a = 4;
        this.e = factCheckController;
        this.f17034f = tLObject;
        this.d = tL_getFactCheck;
        this.f17033c = arrayList;
        this.f17032b = hashMap;
    }

    public d5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17031a = 1;
        this.e = thumbGenerateTask;
        this.f17032b = str;
        this.f17033c = arrayList;
        this.f17034f = bitmapDrawable;
        this.d = arrayList2;
    }

    public d5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this.f17031a = i10;
        this.e = messagesController;
        this.f17032b = str;
        this.f17034f = obj;
        this.f17033c = h6Var;
        this.d = i6Var;
    }

    public d5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f17031a = 14;
        this.e = notificationsController;
        this.f17033c = arrayList;
        this.f17034f = hVar;
        this.d = arrayList2;
        this.f17032b = collection;
    }

    public d5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17031a = 15;
        this.e = sendMessagesHelper;
        this.f17034f = importingStickers;
        this.f17033c = hashMap;
        this.f17032b = str;
        this.d = stringCallback;
    }
}
