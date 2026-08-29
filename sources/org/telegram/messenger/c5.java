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
    public final int f19872a;
    public final Object f19873b;
    public final Object f19874c;
    public final Object d;
    public final Object f19875e;
    public final Object f19876f;

    public c5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f19872a = i10;
        this.f19875e = obj;
        this.f19876f = obj2;
        this.f19874c = obj3;
        this.d = obj4;
        this.f19873b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f19872a) {
            case 0:
                ((ImageLoader.CacheImage) this.f19875e).lambda$setImageAndClear$0((Drawable) this.f19876f, (ArrayList) this.f19874c, (ArrayList) this.d, (String) this.f19873b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f19875e).lambda$run$1((String) this.f19873b, (ArrayList) this.f19874c, (BitmapDrawable) this.f19876f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f19875e).lambda$detectPhotoLanguage$39((MessageObject) this.f19876f, (String) this.f19873b, (TranslateController.MessageKey) this.f19874c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f19875e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f19876f, (ArrayList) this.f19874c, (ArrayList) this.d, (ResultCallback) this.f19873b);
                return;
            case 4:
                ((FactCheckController) this.f19875e).lambda$loadMissing$1((TLObject) this.f19876f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f19874c, (HashMap) this.f19873b);
                return;
            case 5:
                ((MessagesController) this.f19875e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f19876f, (TLObject) this.f19874c, (Long) this.d, (Utilities.Callback) this.f19873b);
                return;
            case 6:
                ((MessagesController) this.f19875e).lambda$getDifference$358((TLRPC.updates_Difference) this.f19876f, (ArrayList) this.f19874c, (a0.h) this.d, (a0.h) this.f19873b);
                return;
            case 7:
                ((MessagesController) this.f19875e).lambda$saveThemeToServer$119((String) this.f19873b, (String) this.f19876f, (org.telegram.ui.ActionBar.e6) this.f19874c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 8:
                ((MessagesController) this.f19875e).lambda$setUserAdminRole$100((TLRPC.User) this.f19876f, (TLRPC.Chat) this.f19874c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f19873b);
                return;
            case 9:
                ((MessagesController) this.f19875e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f19876f, (a0.h) this.f19874c, (a0.h) this.d, (a0.h) this.f19873b);
                return;
            case 10:
                ((MessagesController) this.f19875e).lambda$saveThemeToServer$120((String) this.f19873b, (File) this.f19876f, (org.telegram.ui.ActionBar.e6) this.f19874c, (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.f19875e).lambda$readAllDialogs$64((ArrayList) this.f19874c, (ArrayList) this.d, (ArrayList) this.f19876f, (a0.h) this.f19873b);
                return;
            case 12:
                ((MessagesStorage) this.f19875e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f19876f, (LongSparseIntArray) this.f19874c, (a0.h) this.d, (LongSparseIntArray) this.f19873b);
                return;
            case 13:
                ((Utilities.Callback4) this.f19875e).run((ArrayList) this.f19874c, (ArrayList) this.d, (ArrayList) this.f19876f, (ArrayList) this.f19873b);
                return;
            case 14:
                ((NotificationsController) this.f19875e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f19874c, (a0.h) this.f19876f, (ArrayList) this.d, (Collection) this.f19873b);
                return;
            case 15:
                ((SendMessagesHelper) this.f19875e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f19876f, (HashMap) this.f19874c, (String) this.f19873b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f19875e).lambda$didReceivedNotification$2((File) this.f19876f, (MessageObject) this.f19874c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19873b);
                return;
            default:
                ((SendMessagesHelper) this.f19875e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f19876f, (File) this.f19874c, (TLRPC.Document) this.d, (MessageObject) this.f19873b);
                return;
        }
    }

    public c5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f19872a = i10;
        this.f19875e = obj;
        this.f19874c = arrayList;
        this.d = arrayList2;
        this.f19876f = arrayList3;
        this.f19873b = cloneable;
    }

    public c5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f19872a = 2;
        this.f19875e = translateController;
        this.f19876f = messageObject;
        this.f19873b = str;
        this.f19874c = messageKey;
        this.d = callback;
    }

    public c5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f19872a = 4;
        this.f19875e = factCheckController;
        this.f19876f = tLObject;
        this.d = tL_getFactCheck;
        this.f19874c = arrayList;
        this.f19873b = hashMap;
    }

    public c5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f19872a = 1;
        this.f19875e = thumbGenerateTask;
        this.f19873b = str;
        this.f19874c = arrayList;
        this.f19876f = bitmapDrawable;
        this.d = arrayList2;
    }

    public c5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f19872a = i10;
        this.f19875e = messagesController;
        this.f19873b = str;
        this.f19876f = obj;
        this.f19874c = e6Var;
        this.d = f6Var;
    }

    public c5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f19872a = 14;
        this.f19875e = notificationsController;
        this.f19874c = arrayList;
        this.f19876f = hVar;
        this.d = arrayList2;
        this.f19873b = collection;
    }

    public c5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f19872a = 15;
        this.f19875e = sendMessagesHelper;
        this.f19876f = importingStickers;
        this.f19874c = hashMap;
        this.f19873b = str;
        this.d = stringCallback;
    }
}
