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
public final class b5 implements Runnable {
    public final int f15715a;
    public final Object f15716b;
    public final Object f15717c;
    public final Object d;
    public final Object e;
    public final Object f15718f;

    public b5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f15715a = i10;
        this.e = obj;
        this.f15718f = obj2;
        this.f15717c = obj3;
        this.d = obj4;
        this.f15716b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f15715a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f15718f, (ArrayList) this.f15717c, (ArrayList) this.d, (String) this.f15716b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f15716b, (ArrayList) this.f15717c, (BitmapDrawable) this.f15718f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f15718f, (String) this.f15716b, (TranslateController.MessageKey) this.f15717c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f15718f, (ArrayList) this.f15717c, (ArrayList) this.d, (ResultCallback) this.f15716b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f15718f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f15717c, (HashMap) this.f15716b);
                return;
            case 5:
                ((MessagesController) this.e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f15718f, (TLObject) this.f15717c, (Long) this.d, (Utilities.Callback) this.f15716b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$getDifference$358((TLRPC.updates_Difference) this.f15718f, (ArrayList) this.f15717c, (a0.i) this.d, (a0.i) this.f15716b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f15716b, (String) this.f15718f, (org.telegram.ui.ActionBar.g6) this.f15717c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 8:
                ((MessagesController) this.e).lambda$setUserAdminRole$100((TLRPC.User) this.f15718f, (TLRPC.Chat) this.f15717c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f15716b);
                return;
            case 9:
                ((MessagesController) this.e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f15718f, (a0.i) this.f15717c, (a0.i) this.d, (a0.i) this.f15716b);
                return;
            case 10:
                ((MessagesController) this.e).lambda$saveThemeToServer$120((String) this.f15716b, (File) this.f15718f, (org.telegram.ui.ActionBar.g6) this.f15717c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f15717c, (ArrayList) this.d, (ArrayList) this.f15718f, (a0.i) this.f15716b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f15718f, (LongSparseIntArray) this.f15717c, (a0.i) this.d, (LongSparseIntArray) this.f15716b);
                return;
            case 13:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f15717c, (ArrayList) this.d, (ArrayList) this.f15718f, (ArrayList) this.f15716b);
                return;
            case 14:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f15717c, (a0.i) this.f15718f, (ArrayList) this.d, (Collection) this.f15716b);
                return;
            case 15:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f15718f, (HashMap) this.f15717c, (String) this.f15716b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f15718f, (MessageObject) this.f15717c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f15716b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f15718f, (File) this.f15717c, (TLRPC.Document) this.d, (MessageObject) this.f15716b);
                return;
        }
    }

    public b5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f15715a = i10;
        this.e = obj;
        this.f15717c = arrayList;
        this.d = arrayList2;
        this.f15718f = arrayList3;
        this.f15716b = cloneable;
    }

    public b5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f15715a = 2;
        this.e = translateController;
        this.f15718f = messageObject;
        this.f15716b = str;
        this.f15717c = messageKey;
        this.d = callback;
    }

    public b5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f15715a = 4;
        this.e = factCheckController;
        this.f15718f = tLObject;
        this.d = tL_getFactCheck;
        this.f15717c = arrayList;
        this.f15716b = hashMap;
    }

    public b5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f15715a = 1;
        this.e = thumbGenerateTask;
        this.f15716b = str;
        this.f15717c = arrayList;
        this.f15718f = bitmapDrawable;
        this.d = arrayList2;
    }

    public b5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f15715a = i10;
        this.e = messagesController;
        this.f15716b = str;
        this.f15718f = obj;
        this.f15717c = g6Var;
        this.d = h6Var;
    }

    public b5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f15715a = 14;
        this.e = notificationsController;
        this.f15717c = arrayList;
        this.f15718f = iVar;
        this.d = arrayList2;
        this.f15716b = collection;
    }

    public b5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f15715a = 15;
        this.e = sendMessagesHelper;
        this.f15718f = importingStickers;
        this.f15717c = hashMap;
        this.f15716b = str;
        this.d = stringCallback;
    }
}
