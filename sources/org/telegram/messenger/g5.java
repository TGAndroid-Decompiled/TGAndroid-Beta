package org.telegram.messenger;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
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
    public final int f18411a;
    public final Object f18412b;
    public final Object f18413c;
    public final Object d;
    public final Object e;
    public final Object f18414f;

    public g5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f18411a = i10;
        this.e = obj;
        this.f18414f = obj2;
        this.f18413c = obj3;
        this.d = obj4;
        this.f18412b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f18411a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f18414f, (ArrayList) this.f18413c, (ArrayList) this.d, (String) this.f18412b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f18412b, (ArrayList) this.f18413c, (BitmapDrawable) this.f18414f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f18414f, (String) this.f18412b, (TranslateController.MessageKey) this.f18413c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f18414f, (ArrayList) this.f18413c, (ArrayList) this.d, (ResultCallback) this.f18412b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f18414f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f18413c, (HashMap) this.f18412b);
                return;
            case 5:
                ((MediaController) this.e).lambda$prepareResumedRecording$25((File) this.f18414f, (TLRPC.TL_document) this.f18413c, (byte[]) this.d, (MediaDataController.DraftVoice) this.f18412b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f18414f, (TLObject) this.f18413c, (Long) this.d, (Utilities.Callback) this.f18412b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$setUserAdminRole$99((TLRPC.User) this.f18414f, (TLRPC.Chat) this.f18413c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f18412b);
                return;
            case 8:
                ((MessagesController) this.e).lambda$saveThemeToServer$118((String) this.f18412b, (String) this.f18414f, (org.telegram.ui.ActionBar.f6) this.f18413c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 9:
                ((MessagesController) this.e).lambda$getDifference$357((TLRPC.updates_Difference) this.f18414f, (ArrayList) this.f18413c, (a0.h) this.d, (a0.h) this.f18412b);
                return;
            case 10:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f18412b, (File) this.f18414f, (org.telegram.ui.ActionBar.f6) this.f18413c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 11:
                ((MessagesController) this.e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f18414f, (a0.h) this.f18413c, (a0.h) this.d, (a0.h) this.f18412b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f18413c, (ArrayList) this.d, (ArrayList) this.f18414f, (a0.h) this.f18412b);
                return;
            case 13:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f18414f, (LongSparseIntArray) this.f18413c, (a0.h) this.d, (LongSparseIntArray) this.f18412b);
                return;
            case 14:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f18413c, (ArrayList) this.d, (ArrayList) this.f18414f, (ArrayList) this.f18412b);
                return;
            case 15:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f18413c, (a0.h) this.f18414f, (ArrayList) this.d, (Collection) this.f18412b);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f18414f, (HashMap) this.f18413c, (String) this.f18412b, (MessagesStorage.StringCallback) this.d);
                return;
            case 17:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f18414f, (MessageObject) this.f18413c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f18412b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f18414f, (File) this.f18413c, (TLRPC.Document) this.d, (MessageObject) this.f18412b);
                return;
        }
    }

    public g5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f18411a = i10;
        this.e = obj;
        this.f18413c = arrayList;
        this.d = arrayList2;
        this.f18414f = arrayList3;
        this.f18412b = cloneable;
    }

    public g5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f18411a = 2;
        this.e = translateController;
        this.f18414f = messageObject;
        this.f18412b = str;
        this.f18413c = messageKey;
        this.d = callback;
    }

    public g5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f18411a = 4;
        this.e = factCheckController;
        this.f18414f = tLObject;
        this.d = tL_getFactCheck;
        this.f18413c = arrayList;
        this.f18412b = hashMap;
    }

    public g5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f18411a = 1;
        this.e = thumbGenerateTask;
        this.f18412b = str;
        this.f18413c = arrayList;
        this.f18414f = bitmapDrawable;
        this.d = arrayList2;
    }

    public g5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f18411a = i10;
        this.e = messagesController;
        this.f18412b = str;
        this.f18414f = obj;
        this.f18413c = f6Var;
        this.d = g6Var;
    }

    public g5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f18411a = 15;
        this.e = notificationsController;
        this.f18413c = arrayList;
        this.f18414f = hVar;
        this.d = arrayList2;
        this.f18412b = collection;
    }

    public g5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f18411a = 16;
        this.e = sendMessagesHelper;
        this.f18414f = importingStickers;
        this.f18413c = hashMap;
        this.f18412b = str;
        this.d = stringCallback;
    }
}
