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
    public final int f17126a;
    public final Object f17127b;
    public final Object f17128c;
    public final Object d;
    public final Object f17129e;
    public final Object f17130f;

    public a5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f17126a = i10;
        this.f17129e = obj;
        this.f17130f = obj2;
        this.f17128c = obj3;
        this.d = obj4;
        this.f17127b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f17126a) {
            case 0:
                ((ImageLoader.CacheImage) this.f17129e).lambda$setImageAndClear$0((Drawable) this.f17130f, (ArrayList) this.f17128c, (ArrayList) this.d, (String) this.f17127b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f17129e).lambda$run$1((String) this.f17127b, (ArrayList) this.f17128c, (BitmapDrawable) this.f17130f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f17129e).lambda$detectPhotoLanguage$39((MessageObject) this.f17130f, (String) this.f17127b, (TranslateController.MessageKey) this.f17128c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f17129e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f17130f, (ArrayList) this.f17128c, (ArrayList) this.d, (ResultCallback) this.f17127b);
                return;
            case 4:
                ((FactCheckController) this.f17129e).lambda$loadMissing$1((TLObject) this.f17130f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f17128c, (HashMap) this.f17127b);
                return;
            case 5:
                ((MessagesController) this.f17129e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f17130f, (TLObject) this.f17128c, (Long) this.d, (Utilities.Callback) this.f17127b);
                return;
            case 6:
                ((MessagesController) this.f17129e).lambda$getDifference$358((TLRPC.updates_Difference) this.f17130f, (ArrayList) this.f17128c, (a0.i) this.d, (a0.i) this.f17127b);
                return;
            case 7:
                ((MessagesController) this.f17129e).lambda$saveThemeToServer$119((String) this.f17127b, (String) this.f17130f, (org.telegram.ui.ActionBar.h6) this.f17128c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 8:
                ((MessagesController) this.f17129e).lambda$setUserAdminRole$100((TLRPC.User) this.f17130f, (TLRPC.Chat) this.f17128c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f17127b);
                return;
            case 9:
                ((MessagesController) this.f17129e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f17130f, (a0.i) this.f17128c, (a0.i) this.d, (a0.i) this.f17127b);
                return;
            case 10:
                ((MessagesController) this.f17129e).lambda$saveThemeToServer$120((String) this.f17127b, (File) this.f17130f, (org.telegram.ui.ActionBar.h6) this.f17128c, (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.f17129e).lambda$readAllDialogs$64((ArrayList) this.f17128c, (ArrayList) this.d, (ArrayList) this.f17130f, (a0.i) this.f17127b);
                return;
            case 12:
                ((MessagesStorage) this.f17129e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f17130f, (LongSparseIntArray) this.f17128c, (a0.i) this.d, (LongSparseIntArray) this.f17127b);
                return;
            case 13:
                ((Utilities.Callback4) this.f17129e).run((ArrayList) this.f17128c, (ArrayList) this.d, (ArrayList) this.f17130f, (ArrayList) this.f17127b);
                return;
            case 14:
                ((NotificationsController) this.f17129e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f17128c, (a0.i) this.f17130f, (ArrayList) this.d, (Collection) this.f17127b);
                return;
            case 15:
                ((SendMessagesHelper) this.f17129e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f17130f, (HashMap) this.f17128c, (String) this.f17127b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f17129e).lambda$didReceivedNotification$2((File) this.f17130f, (MessageObject) this.f17128c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f17127b);
                return;
            default:
                ((SendMessagesHelper) this.f17129e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f17130f, (File) this.f17128c, (TLRPC.Document) this.d, (MessageObject) this.f17127b);
                return;
        }
    }

    public a5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f17126a = i10;
        this.f17129e = obj;
        this.f17128c = arrayList;
        this.d = arrayList2;
        this.f17130f = arrayList3;
        this.f17127b = cloneable;
    }

    public a5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f17126a = 2;
        this.f17129e = translateController;
        this.f17130f = messageObject;
        this.f17127b = str;
        this.f17128c = messageKey;
        this.d = callback;
    }

    public a5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f17126a = 4;
        this.f17129e = factCheckController;
        this.f17130f = tLObject;
        this.d = tL_getFactCheck;
        this.f17128c = arrayList;
        this.f17127b = hashMap;
    }

    public a5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f17126a = 1;
        this.f17129e = thumbGenerateTask;
        this.f17127b = str;
        this.f17128c = arrayList;
        this.f17130f = bitmapDrawable;
        this.d = arrayList2;
    }

    public a5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this.f17126a = i10;
        this.f17129e = messagesController;
        this.f17127b = str;
        this.f17130f = obj;
        this.f17128c = h6Var;
        this.d = i6Var;
    }

    public a5(NotificationsController notificationsController, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        this.f17126a = 14;
        this.f17129e = notificationsController;
        this.f17128c = arrayList;
        this.f17130f = iVar;
        this.d = arrayList2;
        this.f17127b = collection;
    }

    public a5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f17126a = 15;
        this.f17129e = sendMessagesHelper;
        this.f17130f = importingStickers;
        this.f17128c = hashMap;
        this.f17127b = str;
        this.d = stringCallback;
    }
}
