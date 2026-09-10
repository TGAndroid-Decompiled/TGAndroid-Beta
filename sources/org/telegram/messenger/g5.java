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
public final class g5 implements Runnable {
    public final int f15243a;
    public final Object f15244b;
    public final Object f15245c;
    public final Object d;
    public final Object e;
    public final Object f15246f;

    public g5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f15243a = i10;
        this.e = obj;
        this.f15246f = obj2;
        this.f15245c = obj3;
        this.d = obj4;
        this.f15244b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f15243a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f15246f, (ArrayList) this.f15245c, (ArrayList) this.d, (String) this.f15244b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f15244b, (ArrayList) this.f15245c, (BitmapDrawable) this.f15246f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f15246f, (String) this.f15244b, (TranslateController.MessageKey) this.f15245c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f15246f, (ArrayList) this.f15245c, (ArrayList) this.d, (ResultCallback) this.f15244b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f15246f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f15245c, (HashMap) this.f15244b);
                return;
            case 5:
                ((MessagesController) this.e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f15246f, (TLObject) this.f15245c, (Long) this.d, (Utilities.Callback) this.f15244b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$getDifference$358((TLRPC.updates_Difference) this.f15246f, (ArrayList) this.f15245c, (a0.i) this.d, (a0.i) this.f15244b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f15244b, (String) this.f15246f, (org.telegram.ui.ActionBar.h6) this.f15245c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 8:
                ((MessagesController) this.e).lambda$setUserAdminRole$100((TLRPC.User) this.f15246f, (TLRPC.Chat) this.f15245c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f15244b);
                return;
            case 9:
                ((MessagesController) this.e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f15246f, (a0.i) this.f15245c, (a0.i) this.d, (a0.i) this.f15244b);
                return;
            case 10:
                ((MessagesController) this.e).lambda$saveThemeToServer$120((String) this.f15244b, (File) this.f15246f, (org.telegram.ui.ActionBar.h6) this.f15245c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f15245c, (ArrayList) this.d, (ArrayList) this.f15246f, (a0.i) this.f15244b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f15246f, (LongSparseIntArray) this.f15245c, (a0.i) this.d, (LongSparseIntArray) this.f15244b);
                return;
            case 13:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f15245c, (ArrayList) this.d, (ArrayList) this.f15246f, (ArrayList) this.f15244b);
                return;
            case 14:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f15245c, (a0.i) this.f15246f, (ArrayList) this.d, (Collection) this.f15244b);
                return;
            case 15:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f15246f, (HashMap) this.f15245c, (String) this.f15244b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f15246f, (MessageObject) this.f15245c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f15244b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f15246f, (File) this.f15245c, (TLRPC.Document) this.d, (MessageObject) this.f15244b);
                return;
        }
    }

    public g5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f15243a = i10;
        this.e = obj;
        this.f15245c = arrayList;
        this.d = arrayList2;
        this.f15246f = arrayList3;
        this.f15244b = cloneable;
    }

    public g5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f15243a = 2;
        this.e = translateController;
        this.f15246f = messageObject;
        this.f15244b = str;
        this.f15245c = messageKey;
        this.d = callback;
    }

    public g5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f15243a = 4;
        this.e = factCheckController;
        this.f15246f = tLObject;
        this.d = tL_getFactCheck;
        this.f15245c = arrayList;
        this.f15244b = hashMap;
    }

    public g5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f15243a = 1;
        this.e = thumbGenerateTask;
        this.f15244b = str;
        this.f15245c = arrayList;
        this.f15246f = bitmapDrawable;
        this.d = arrayList2;
    }

    public g5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this.f15243a = i10;
        this.e = messagesController;
        this.f15244b = str;
        this.f15246f = obj;
        this.f15245c = h6Var;
        this.d = i6Var;
    }

    public g5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f15243a = 14;
        this.e = notificationsController;
        this.f15245c = arrayList;
        this.f15246f = iVar;
        this.d = arrayList2;
        this.f15244b = collection;
    }

    public g5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f15243a = 15;
        this.e = sendMessagesHelper;
        this.f15246f = importingStickers;
        this.f15245c = hashMap;
        this.f15244b = str;
        this.d = stringCallback;
    }
}
