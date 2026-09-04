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
    public final int f17203a;
    public final Object f17204b;
    public final Object f17205c;
    public final Object d;
    public final Object f17206e;
    public final Object f17207f;

    public b5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17203a = i10;
        this.f17206e = obj;
        this.f17207f = obj2;
        this.f17205c = obj3;
        this.d = obj4;
        this.f17204b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17203a) {
            case 0:
                ((ImageLoader.CacheImage) this.f17206e).lambda$setImageAndClear$0((Drawable) this.f17207f, (ArrayList) this.f17205c, (ArrayList) this.d, (String) this.f17204b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f17206e).lambda$run$1((String) this.f17204b, (ArrayList) this.f17205c, (BitmapDrawable) this.f17207f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f17206e).lambda$detectPhotoLanguage$39((MessageObject) this.f17207f, (String) this.f17204b, (TranslateController.MessageKey) this.f17205c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f17206e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17207f, (ArrayList) this.f17205c, (ArrayList) this.d, (ResultCallback) this.f17204b);
                return;
            case 4:
                ((FactCheckController) this.f17206e).lambda$loadMissing$1((TLObject) this.f17207f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17205c, (HashMap) this.f17204b);
                return;
            case 5:
                ((MessagesController) this.f17206e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f17207f, (TLObject) this.f17205c, (Long) this.d, (Utilities.Callback) this.f17204b);
                return;
            case 6:
                ((MessagesController) this.f17206e).lambda$getDifference$358((TLRPC.updates_Difference) this.f17207f, (ArrayList) this.f17205c, (a0.i) this.d, (a0.i) this.f17204b);
                return;
            case 7:
                ((MessagesController) this.f17206e).lambda$saveThemeToServer$119((String) this.f17204b, (String) this.f17207f, (org.telegram.ui.ActionBar.h6) this.f17205c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 8:
                ((MessagesController) this.f17206e).lambda$setUserAdminRole$100((TLRPC.User) this.f17207f, (TLRPC.Chat) this.f17205c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17204b);
                return;
            case 9:
                ((MessagesController) this.f17206e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f17207f, (a0.i) this.f17205c, (a0.i) this.d, (a0.i) this.f17204b);
                return;
            case 10:
                ((MessagesController) this.f17206e).lambda$saveThemeToServer$120((String) this.f17204b, (File) this.f17207f, (org.telegram.ui.ActionBar.h6) this.f17205c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.f17206e).lambda$readAllDialogs$64((ArrayList) this.f17205c, (ArrayList) this.d, (ArrayList) this.f17207f, (a0.i) this.f17204b);
                return;
            case 12:
                ((MessagesStorage) this.f17206e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17207f, (LongSparseIntArray) this.f17205c, (a0.i) this.d, (LongSparseIntArray) this.f17204b);
                return;
            case 13:
                ((Utilities.Callback4) this.f17206e).run((ArrayList) this.f17205c, (ArrayList) this.d, (ArrayList) this.f17207f, (ArrayList) this.f17204b);
                return;
            case 14:
                ((NotificationsController) this.f17206e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f17205c, (a0.i) this.f17207f, (ArrayList) this.d, (Collection) this.f17204b);
                return;
            case 15:
                ((SendMessagesHelper) this.f17206e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f17207f, (HashMap) this.f17205c, (String) this.f17204b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f17206e).lambda$didReceivedNotification$2((File) this.f17207f, (MessageObject) this.f17205c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17204b);
                return;
            default:
                ((SendMessagesHelper) this.f17206e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17207f, (File) this.f17205c, (TLRPC.Document) this.d, (MessageObject) this.f17204b);
                return;
        }
    }

    public b5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17203a = i10;
        this.f17206e = obj;
        this.f17205c = arrayList;
        this.d = arrayList2;
        this.f17207f = arrayList3;
        this.f17204b = cloneable;
    }

    public b5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17203a = 2;
        this.f17206e = translateController;
        this.f17207f = messageObject;
        this.f17204b = str;
        this.f17205c = messageKey;
        this.d = callback;
    }

    public b5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17203a = 4;
        this.f17206e = factCheckController;
        this.f17207f = tLObject;
        this.d = tL_getFactCheck;
        this.f17205c = arrayList;
        this.f17204b = hashMap;
    }

    public b5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17203a = 1;
        this.f17206e = thumbGenerateTask;
        this.f17204b = str;
        this.f17205c = arrayList;
        this.f17207f = bitmapDrawable;
        this.d = arrayList2;
    }

    public b5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this.f17203a = i10;
        this.f17206e = messagesController;
        this.f17204b = str;
        this.f17207f = obj;
        this.f17205c = h6Var;
        this.d = i6Var;
    }

    public b5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f17203a = 14;
        this.f17206e = notificationsController;
        this.f17205c = arrayList;
        this.f17207f = iVar;
        this.d = arrayList2;
        this.f17204b = collection;
    }

    public b5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17203a = 15;
        this.f17206e = sendMessagesHelper;
        this.f17207f = importingStickers;
        this.f17205c = hashMap;
        this.f17204b = str;
        this.d = stringCallback;
    }
}
