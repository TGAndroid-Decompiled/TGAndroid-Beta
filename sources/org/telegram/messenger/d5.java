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
    public final int f18460a;
    public final Object f18461b;
    public final Object f18462c;
    public final Object d;
    public final Object f18463e;
    public final Object f18464f;

    public d5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f18460a = i10;
        this.f18463e = obj;
        this.f18464f = obj2;
        this.f18462c = obj3;
        this.d = obj4;
        this.f18461b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f18460a) {
            case 0:
                ((ImageLoader.CacheImage) this.f18463e).lambda$setImageAndClear$0((Drawable) this.f18464f, (ArrayList) this.f18462c, (ArrayList) this.d, (String) this.f18461b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f18463e).lambda$run$1((String) this.f18461b, (ArrayList) this.f18462c, (BitmapDrawable) this.f18464f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f18463e).lambda$detectPhotoLanguage$39((MessageObject) this.f18464f, (String) this.f18461b, (TranslateController.MessageKey) this.f18462c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f18463e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f18464f, (ArrayList) this.f18462c, (ArrayList) this.d, (ResultCallback) this.f18461b);
                return;
            case 4:
                ((FactCheckController) this.f18463e).lambda$loadMissing$1((TLObject) this.f18464f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f18462c, (HashMap) this.f18461b);
                return;
            case 5:
                ((MessagesController) this.f18463e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f18464f, (TLObject) this.f18462c, (Long) this.d, (Utilities.Callback) this.f18461b);
                return;
            case 6:
                ((MessagesController) this.f18463e).lambda$getDifference$358((TLRPC.updates_Difference) this.f18464f, (ArrayList) this.f18462c, (a0.h) this.d, (a0.h) this.f18461b);
                return;
            case 7:
                ((MessagesController) this.f18463e).lambda$saveThemeToServer$119((String) this.f18461b, (String) this.f18464f, (org.telegram.ui.ActionBar.i6) this.f18462c, (org.telegram.ui.ActionBar.j6) this.d);
                return;
            case 8:
                ((MessagesController) this.f18463e).lambda$setUserAdminRole$100((TLRPC.User) this.f18464f, (TLRPC.Chat) this.f18462c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f18461b);
                return;
            case 9:
                ((MessagesController) this.f18463e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f18464f, (a0.h) this.f18462c, (a0.h) this.d, (a0.h) this.f18461b);
                return;
            case 10:
                ((MessagesController) this.f18463e).lambda$saveThemeToServer$120((String) this.f18461b, (File) this.f18464f, (org.telegram.ui.ActionBar.i6) this.f18462c, (org.telegram.ui.ActionBar.j6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.f18463e).lambda$readAllDialogs$64((ArrayList) this.f18462c, (ArrayList) this.d, (ArrayList) this.f18464f, (a0.h) this.f18461b);
                return;
            case 12:
                ((MessagesStorage) this.f18463e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f18464f, (LongSparseIntArray) this.f18462c, (a0.h) this.d, (LongSparseIntArray) this.f18461b);
                return;
            case 13:
                ((Utilities.Callback4) this.f18463e).run((ArrayList) this.f18462c, (ArrayList) this.d, (ArrayList) this.f18464f, (ArrayList) this.f18461b);
                return;
            case 14:
                ((NotificationsController) this.f18463e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f18462c, (a0.h) this.f18464f, (ArrayList) this.d, (Collection) this.f18461b);
                return;
            case 15:
                ((SendMessagesHelper) this.f18463e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f18464f, (HashMap) this.f18462c, (String) this.f18461b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f18463e).lambda$didReceivedNotification$2((File) this.f18464f, (MessageObject) this.f18462c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f18461b);
                return;
            default:
                ((SendMessagesHelper) this.f18463e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f18464f, (File) this.f18462c, (TLRPC.Document) this.d, (MessageObject) this.f18461b);
                return;
        }
    }

    public d5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f18460a = i10;
        this.f18463e = obj;
        this.f18462c = arrayList;
        this.d = arrayList2;
        this.f18464f = arrayList3;
        this.f18461b = cloneable;
    }

    public d5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f18460a = 2;
        this.f18463e = translateController;
        this.f18464f = messageObject;
        this.f18461b = str;
        this.f18462c = messageKey;
        this.d = callback;
    }

    public d5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f18460a = 4;
        this.f18463e = factCheckController;
        this.f18464f = tLObject;
        this.d = tL_getFactCheck;
        this.f18462c = arrayList;
        this.f18461b = hashMap;
    }

    public d5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f18460a = 1;
        this.f18463e = thumbGenerateTask;
        this.f18461b = str;
        this.f18462c = arrayList;
        this.f18464f = bitmapDrawable;
        this.d = arrayList2;
    }

    public d5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.j6 j6Var, int i10) {
        this.f18460a = i10;
        this.f18463e = messagesController;
        this.f18461b = str;
        this.f18464f = obj;
        this.f18462c = i6Var;
        this.d = j6Var;
    }

    public d5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f18460a = 14;
        this.f18463e = notificationsController;
        this.f18462c = arrayList;
        this.f18464f = hVar;
        this.d = arrayList2;
        this.f18461b = collection;
    }

    public d5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f18460a = 15;
        this.f18463e = sendMessagesHelper;
        this.f18464f = importingStickers;
        this.f18462c = hashMap;
        this.f18461b = str;
        this.d = stringCallback;
    }
}
