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
    public final int f18462a;
    public final Object f18463b;
    public final Object f18464c;
    public final Object d;
    public final Object f18465e;
    public final Object f18466f;

    public d5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f18462a = i10;
        this.f18465e = obj;
        this.f18466f = obj2;
        this.f18464c = obj3;
        this.d = obj4;
        this.f18463b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f18462a) {
            case 0:
                ((ImageLoader.CacheImage) this.f18465e).lambda$setImageAndClear$0((Drawable) this.f18466f, (ArrayList) this.f18464c, (ArrayList) this.d, (String) this.f18463b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.f18465e).lambda$run$1((String) this.f18463b, (ArrayList) this.f18464c, (BitmapDrawable) this.f18466f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.f18465e).lambda$detectPhotoLanguage$39((MessageObject) this.f18466f, (String) this.f18463b, (TranslateController.MessageKey) this.f18464c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f18465e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f18466f, (ArrayList) this.f18464c, (ArrayList) this.d, (ResultCallback) this.f18463b);
                return;
            case 4:
                ((FactCheckController) this.f18465e).lambda$loadMissing$1((TLObject) this.f18466f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f18464c, (HashMap) this.f18463b);
                return;
            case 5:
                ((MessagesController) this.f18465e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f18466f, (TLObject) this.f18464c, (Long) this.d, (Utilities.Callback) this.f18463b);
                return;
            case 6:
                ((MessagesController) this.f18465e).lambda$getDifference$358((TLRPC.updates_Difference) this.f18466f, (ArrayList) this.f18464c, (a0.h) this.d, (a0.h) this.f18463b);
                return;
            case 7:
                ((MessagesController) this.f18465e).lambda$saveThemeToServer$119((String) this.f18463b, (String) this.f18466f, (org.telegram.ui.ActionBar.i6) this.f18464c, (org.telegram.ui.ActionBar.j6) this.d);
                return;
            case 8:
                ((MessagesController) this.f18465e).lambda$setUserAdminRole$100((TLRPC.User) this.f18466f, (TLRPC.Chat) this.f18464c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f18463b);
                return;
            case 9:
                ((MessagesController) this.f18465e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f18466f, (a0.h) this.f18464c, (a0.h) this.d, (a0.h) this.f18463b);
                return;
            case 10:
                ((MessagesController) this.f18465e).lambda$saveThemeToServer$120((String) this.f18463b, (File) this.f18466f, (org.telegram.ui.ActionBar.i6) this.f18464c, (org.telegram.ui.ActionBar.j6) this.d);
                return;
            case 11:
                ((MessagesStorage) this.f18465e).lambda$readAllDialogs$64((ArrayList) this.f18464c, (ArrayList) this.d, (ArrayList) this.f18466f, (a0.h) this.f18463b);
                return;
            case 12:
                ((MessagesStorage) this.f18465e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f18466f, (LongSparseIntArray) this.f18464c, (a0.h) this.d, (LongSparseIntArray) this.f18463b);
                return;
            case 13:
                ((Utilities.Callback4) this.f18465e).run((ArrayList) this.f18464c, (ArrayList) this.d, (ArrayList) this.f18466f, (ArrayList) this.f18463b);
                return;
            case 14:
                ((NotificationsController) this.f18465e).lambda$processLoadedUnreadMessages$33((ArrayList) this.f18464c, (a0.h) this.f18466f, (ArrayList) this.d, (Collection) this.f18463b);
                return;
            case 15:
                ((SendMessagesHelper) this.f18465e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f18466f, (HashMap) this.f18464c, (String) this.f18463b, (MessagesStorage.StringCallback) this.d);
                return;
            case 16:
                ((SendMessagesHelper) this.f18465e).lambda$didReceivedNotification$2((File) this.f18466f, (MessageObject) this.f18464c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f18463b);
                return;
            default:
                ((SendMessagesHelper) this.f18465e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f18466f, (File) this.f18464c, (TLRPC.Document) this.d, (MessageObject) this.f18463b);
                return;
        }
    }

    public d5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f18462a = i10;
        this.f18465e = obj;
        this.f18464c = arrayList;
        this.d = arrayList2;
        this.f18466f = arrayList3;
        this.f18463b = cloneable;
    }

    public d5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f18462a = 2;
        this.f18465e = translateController;
        this.f18466f = messageObject;
        this.f18463b = str;
        this.f18464c = messageKey;
        this.d = callback;
    }

    public d5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f18462a = 4;
        this.f18465e = factCheckController;
        this.f18466f = tLObject;
        this.d = tL_getFactCheck;
        this.f18464c = arrayList;
        this.f18463b = hashMap;
    }

    public d5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f18462a = 1;
        this.f18465e = thumbGenerateTask;
        this.f18463b = str;
        this.f18464c = arrayList;
        this.f18466f = bitmapDrawable;
        this.d = arrayList2;
    }

    public d5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.j6 j6Var, int i10) {
        this.f18462a = i10;
        this.f18465e = messagesController;
        this.f18463b = str;
        this.f18466f = obj;
        this.f18464c = i6Var;
        this.d = j6Var;
    }

    public d5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f18462a = 14;
        this.f18465e = notificationsController;
        this.f18464c = arrayList;
        this.f18466f = hVar;
        this.d = arrayList2;
        this.f18463b = collection;
    }

    public d5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f18462a = 15;
        this.f18465e = sendMessagesHelper;
        this.f18466f = importingStickers;
        this.f18464c = hashMap;
        this.f18463b = str;
        this.d = stringCallback;
    }
}
