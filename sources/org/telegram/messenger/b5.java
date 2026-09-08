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
    public final int f17230a;
    public final Object f17231b;
    public final Object f17232c;
    public final Object d;
    public final Object f17233e;
    public final Object f17234f;

    public b5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17230a = i10;
        this.f17233e = obj;
        this.f17234f = obj2;
        this.f17232c = obj3;
        this.d = obj4;
        this.f17231b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17230a) {
            case 0:
                ((ImageLoader.CacheImage) this.f17233e).lambda$setImageAndClear$0((Drawable) this.f17234f, (ArrayList) this.f17232c, (ArrayList) this.d, (String) this.f17231b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f17233e).lambda$run$1((String) this.f17231b, (ArrayList) this.f17232c, (BitmapDrawable) this.f17234f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f17233e).lambda$detectPhotoLanguage$39((MessageObject) this.f17234f, (String) this.f17231b, (TranslateController.MessageKey) this.f17232c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f17233e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17234f, (ArrayList) this.f17232c, (ArrayList) this.d, (ResultCallback) this.f17231b);
                return;
            case 4:
                ((FactCheckController) this.f17233e).lambda$loadMissing$1((TLObject) this.f17234f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17232c, (HashMap) this.f17231b);
                return;
            case 5:
                ((MessagesController) this.f17233e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f17234f, (TLObject) this.f17232c, (Long) this.d, (Utilities.Callback) this.f17231b);
                return;
            case 6:
                ((MessagesController) this.f17233e).lambda$getDifference$358((TLRPC.updates_Difference) this.f17234f, (ArrayList) this.f17232c, (a0.i) this.d, (a0.i) this.f17231b);
                return;
            case 7:
                ((MessagesController) this.f17233e).lambda$saveThemeToServer$119((String) this.f17231b, (String) this.f17234f, (org.telegram.ui.ActionBar.h6) this.f17232c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 8:
                ((MessagesController) this.f17233e).lambda$setUserAdminRole$100((TLRPC.User) this.f17234f, (TLRPC.Chat) this.f17232c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17231b);
                return;
            case 9:
                ((MessagesController) this.f17233e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f17234f, (a0.i) this.f17232c, (a0.i) this.d, (a0.i) this.f17231b);
                return;
            case 10:
                ((MessagesController) this.f17233e).lambda$saveThemeToServer$120((String) this.f17231b, (File) this.f17234f, (org.telegram.ui.ActionBar.h6) this.f17232c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.f17233e).lambda$readAllDialogs$64((ArrayList) this.f17232c, (ArrayList) this.d, (ArrayList) this.f17234f, (a0.i) this.f17231b);
                return;
            case 12:
                ((MessagesStorage) this.f17233e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17234f, (LongSparseIntArray) this.f17232c, (a0.i) this.d, (LongSparseIntArray) this.f17231b);
                return;
            case 13:
                ((Utilities.Callback4) this.f17233e).run((ArrayList) this.f17232c, (ArrayList) this.d, (ArrayList) this.f17234f, (ArrayList) this.f17231b);
                return;
            case 14:
                ((NotificationsController) this.f17233e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f17232c, (a0.i) this.f17234f, (ArrayList) this.d, (Collection) this.f17231b);
                return;
            case 15:
                ((SendMessagesHelper) this.f17233e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f17234f, (HashMap) this.f17232c, (String) this.f17231b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f17233e).lambda$didReceivedNotification$2((File) this.f17234f, (MessageObject) this.f17232c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17231b);
                return;
            default:
                ((SendMessagesHelper) this.f17233e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17234f, (File) this.f17232c, (TLRPC.Document) this.d, (MessageObject) this.f17231b);
                return;
        }
    }

    public b5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17230a = i10;
        this.f17233e = obj;
        this.f17232c = arrayList;
        this.d = arrayList2;
        this.f17234f = arrayList3;
        this.f17231b = cloneable;
    }

    public b5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17230a = 2;
        this.f17233e = translateController;
        this.f17234f = messageObject;
        this.f17231b = str;
        this.f17232c = messageKey;
        this.d = callback;
    }

    public b5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17230a = 4;
        this.f17233e = factCheckController;
        this.f17234f = tLObject;
        this.d = tL_getFactCheck;
        this.f17232c = arrayList;
        this.f17231b = hashMap;
    }

    public b5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17230a = 1;
        this.f17233e = thumbGenerateTask;
        this.f17231b = str;
        this.f17232c = arrayList;
        this.f17234f = bitmapDrawable;
        this.d = arrayList2;
    }

    public b5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this.f17230a = i10;
        this.f17233e = messagesController;
        this.f17231b = str;
        this.f17234f = obj;
        this.f17232c = h6Var;
        this.d = i6Var;
    }

    public b5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f17230a = 14;
        this.f17233e = notificationsController;
        this.f17232c = arrayList;
        this.f17234f = iVar;
        this.d = arrayList2;
        this.f17231b = collection;
    }

    public b5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17230a = 15;
        this.f17233e = sendMessagesHelper;
        this.f17234f = importingStickers;
        this.f17232c = hashMap;
        this.f17231b = str;
        this.d = stringCallback;
    }
}
