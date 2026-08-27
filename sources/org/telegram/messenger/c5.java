package org.telegram.messenger;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class c5 implements Runnable {

    public final int f19881a;

    public final Object f19882b;

    public final Object f19883c;
    public final Object d;

    public final Object f19884e;

    public final Object f19885f;

    public c5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f19881a = i10;
        this.f19884e = obj;
        this.f19885f = obj2;
        this.f19883c = obj3;
        this.d = obj4;
        this.f19882b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f19881a) {
            case 0:
                ((ImageLoader.CacheImage) this.f19884e).lambda$setImageAndClear$0((Drawable) this.f19885f, (ArrayList) this.f19883c, (ArrayList) this.d, (String) this.f19882b);
                break;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f19884e).lambda$run$1((String) this.f19882b, (ArrayList) this.f19883c, (BitmapDrawable) this.f19885f, (ArrayList) this.d);
                break;
            case 2:
                ((TranslateController) this.f19884e).lambda$detectPhotoLanguage$39((MessageObject) this.f19885f, (String) this.f19882b, (TranslateController.MessageKey) this.f19883c, (Utilities.Callback) this.d);
                break;
            case 3:
                ((ChatThemeController) this.f19884e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f19885f, (ArrayList) this.f19883c, (ArrayList) this.d, (ResultCallback) this.f19882b);
                break;
            case 4:
                ((FactCheckController) this.f19884e).lambda$loadMissing$1((TLObject) this.f19885f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f19883c, (HashMap) this.f19882b);
                break;
            case 5:
                ((MessagesController) this.f19884e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f19885f, (TLObject) this.f19883c, (Long) this.d, (Utilities.Callback) this.f19882b);
                break;
            case 6:
                ((MessagesController) this.f19884e).lambda$getDifference$358((TLRPC.updates_Difference) this.f19885f, (ArrayList) this.f19883c, (a0.h) this.d, (a0.h) this.f19882b);
                break;
            case 7:
                ((MessagesController) this.f19884e).lambda$saveThemeToServer$119((String) this.f19882b, (String) this.f19885f, (org.telegram.ui.ActionBar.e6) this.f19883c, (org.telegram.ui.ActionBar.f6) this.d);
                break;
            case 8:
                ((MessagesController) this.f19884e).lambda$setUserAdminRole$100((TLRPC.User) this.f19885f, (TLRPC.Chat) this.f19883c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f19882b);
                break;
            case 9:
                ((MessagesController) this.f19884e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f19885f, (a0.h) this.f19883c, (a0.h) this.d, (a0.h) this.f19882b);
                break;
            case 10:
                ((MessagesController) this.f19884e).lambda$saveThemeToServer$120((String) this.f19882b, (File) this.f19885f, (org.telegram.ui.ActionBar.e6) this.f19883c, (org.telegram.ui.ActionBar.f6) this.d);
                break;
            case 11:
                ((MessagesStorage) this.f19884e).lambda$readAllDialogs$64((ArrayList) this.f19883c, (ArrayList) this.d, (ArrayList) this.f19885f, (a0.h) this.f19882b);
                break;
            case 12:
                ((MessagesStorage) this.f19884e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f19885f, (LongSparseIntArray) this.f19883c, (a0.h) this.d, (LongSparseIntArray) this.f19882b);
                break;
            case 13:
                ((Utilities.Callback4) this.f19884e).run((ArrayList) this.f19883c, (ArrayList) this.d, (ArrayList) this.f19885f, (ArrayList) this.f19882b);
                break;
            case 14:
                ((NotificationsController) this.f19884e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f19883c, (a0.h) this.f19885f, (ArrayList) this.d, (Collection) this.f19882b);
                break;
            case 15:
                ((SendMessagesHelper) this.f19884e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f19885f, (HashMap) this.f19883c, (String) this.f19882b, (MessagesStorage.StringCallback) this.d);
                break;
            case 16:
                ((SendMessagesHelper) this.f19884e).lambda$didReceivedNotification$2((File) this.f19885f, (MessageObject) this.f19883c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19882b);
                break;
            default:
                ((SendMessagesHelper) this.f19884e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f19885f, (File) this.f19883c, (TLRPC.Document) this.d, (MessageObject) this.f19882b);
                break;
        }
    }

    public c5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f19881a = i10;
        this.f19884e = obj;
        this.f19883c = arrayList;
        this.d = arrayList2;
        this.f19885f = arrayList3;
        this.f19882b = cloneable;
    }

    public c5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f19881a = 2;
        this.f19884e = translateController;
        this.f19885f = messageObject;
        this.f19882b = str;
        this.f19883c = messageKey;
        this.d = callback;
    }

    public c5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap map) {
        this.f19881a = 4;
        this.f19884e = factCheckController;
        this.f19885f = tLObject;
        this.d = tL_getFactCheck;
        this.f19883c = arrayList;
        this.f19882b = map;
    }

    public c5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f19881a = 1;
        this.f19884e = thumbGenerateTask;
        this.f19882b = str;
        this.f19883c = arrayList;
        this.f19885f = bitmapDrawable;
        this.d = arrayList2;
    }

    public c5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f19881a = i10;
        this.f19884e = messagesController;
        this.f19882b = str;
        this.f19885f = obj;
        this.f19883c = e6Var;
        this.d = f6Var;
    }

    public c5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f19881a = 14;
        this.f19884e = notificationsController;
        this.f19883c = arrayList;
        this.f19885f = hVar;
        this.d = arrayList2;
        this.f19882b = collection;
    }

    public c5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap map, String str, MessagesStorage.StringCallback stringCallback) {
        this.f19881a = 15;
        this.f19884e = sendMessagesHelper;
        this.f19885f = importingStickers;
        this.f19883c = map;
        this.f19882b = str;
        this.d = stringCallback;
    }
}
