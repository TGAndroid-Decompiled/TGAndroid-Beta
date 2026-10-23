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
    public final int f18416a;
    public final Object f18417b;
    public final Object f18418c;
    public final Object d;
    public final Object e;
    public final Object f18419f;

    public g5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f18416a = i10;
        this.e = obj;
        this.f18419f = obj2;
        this.f18418c = obj3;
        this.d = obj4;
        this.f18417b = obj5;
    }

    @Override
    public final void run() {
        switch (this.f18416a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f18419f, (ArrayList) this.f18418c, (ArrayList) this.d, (String) this.f18417b);
                return;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.f18417b, (ArrayList) this.f18418c, (BitmapDrawable) this.f18419f, (ArrayList) this.d);
                return;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f18419f, (String) this.f18417b, (TranslateController.MessageKey) this.f18418c, (Utilities.Callback) this.d);
                return;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f18419f, (ArrayList) this.f18418c, (ArrayList) this.d, (ResultCallback) this.f18417b);
                return;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f18419f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.f18418c, (HashMap) this.f18417b);
                return;
            case 5:
                ((MediaController) this.e).lambda$prepareResumedRecording$26((File) this.f18419f, (TLRPC.TL_document) this.f18418c, (byte[]) this.d, (MediaDataController.DraftVoice) this.f18417b);
                return;
            case 6:
                ((MessagesController) this.e).lambda$loadChannelParticipants$147((TLRPC.TL_error) this.f18419f, (TLObject) this.f18418c, (Long) this.d, (Utilities.Callback) this.f18417b);
                return;
            case 7:
                ((MessagesController) this.e).lambda$setUserAdminRole$99((TLRPC.User) this.f18419f, (TLRPC.Chat) this.f18418c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.f18417b);
                return;
            case 8:
                ((MessagesController) this.e).lambda$saveThemeToServer$118((String) this.f18417b, (String) this.f18419f, (org.telegram.ui.ActionBar.f6) this.f18418c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 9:
                ((MessagesController) this.e).lambda$getDifference$357((TLRPC.updates_Difference) this.f18419f, (ArrayList) this.f18418c, (a0.h) this.d, (a0.h) this.f18417b);
                return;
            case 10:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.f18417b, (File) this.f18419f, (org.telegram.ui.ActionBar.f6) this.f18418c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 11:
                ((MessagesController) this.e).lambda$updateTimerProc$153((TLRPC.TL_messages_messageViews) this.f18419f, (a0.h) this.f18418c, (a0.h) this.d, (a0.h) this.f18417b);
                return;
            case 12:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.f18418c, (ArrayList) this.d, (ArrayList) this.f18419f, (a0.h) this.f18417b);
                return;
            case 13:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f18419f, (LongSparseIntArray) this.f18418c, (a0.h) this.d, (LongSparseIntArray) this.f18417b);
                return;
            case 14:
                ((Utilities.Callback4) this.e).run((ArrayList) this.f18418c, (ArrayList) this.d, (ArrayList) this.f18419f, (ArrayList) this.f18417b);
                return;
            case 15:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$34((ArrayList) this.f18418c, (a0.h) this.f18419f, (ArrayList) this.d, (Collection) this.f18417b);
                return;
            case 16:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$115((SendMessagesHelper.ImportingStickers) this.f18419f, (HashMap) this.f18418c, (String) this.f18417b, (MessagesStorage.StringCallback) this.d);
                return;
            case 17:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f18419f, (MessageObject) this.f18418c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f18417b);
                return;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f18419f, (File) this.f18418c, (TLRPC.Document) this.d, (MessageObject) this.f18417b);
                return;
        }
    }

    public g5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.f18416a = i10;
        this.e = obj;
        this.f18418c = arrayList;
        this.d = arrayList2;
        this.f18419f = arrayList3;
        this.f18417b = cloneable;
    }

    public g5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.f18416a = 2;
        this.e = translateController;
        this.f18419f = messageObject;
        this.f18417b = str;
        this.f18418c = messageKey;
        this.d = callback;
    }

    public g5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.f18416a = 4;
        this.e = factCheckController;
        this.f18419f = tLObject;
        this.d = tL_getFactCheck;
        this.f18418c = arrayList;
        this.f18417b = hashMap;
    }

    public g5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.f18416a = 1;
        this.e = thumbGenerateTask;
        this.f18417b = str;
        this.f18418c = arrayList;
        this.f18419f = bitmapDrawable;
        this.d = arrayList2;
    }

    public g5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f18416a = i10;
        this.e = messagesController;
        this.f18417b = str;
        this.f18419f = obj;
        this.f18418c = f6Var;
        this.d = g6Var;
    }

    public g5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.f18416a = 15;
        this.e = notificationsController;
        this.f18418c = arrayList;
        this.f18419f = hVar;
        this.d = arrayList2;
        this.f18417b = collection;
    }

    public g5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.f18416a = 16;
        this.e = sendMessagesHelper;
        this.f18419f = importingStickers;
        this.f18418c = hashMap;
        this.f18417b = str;
        this.d = stringCallback;
    }
}
