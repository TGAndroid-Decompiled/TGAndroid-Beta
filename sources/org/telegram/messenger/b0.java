package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f17376a;
    public final Object f17377b;
    public final Object f17378c;
    public final Object d;
    public final Object f17379e;
    public final Object f17380f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17376a = i10;
        this.f17377b = obj;
        this.f17378c = obj2;
        this.d = obj3;
        this.f17379e = obj4;
        this.f17380f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17376a) {
            case 0:
                ((BillingController) this.f17377b).lambda$launchBillingFlow$1((Activity) this.f17378c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f17379e, (List) this.f17380f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17377b, (String) this.f17378c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f17379e, (TLRPC.TL_messageMediaVenue) this.f17380f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f17377b, (File) this.f17378c, (boolean[]) this.d, (Utilities.Callback) this.f17379e, (org.telegram.ui.ActionBar.b2) this.f17380f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17377b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f17378c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.a6) this.f17379e, (File) this.f17380f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f17377b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.b2) this.f17378c, (nf.e) this.d, (TLObject) this.f17379e, (org.telegram.ui.ActionBar.n2) this.f17380f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17377b).lambda$loadCache$6((ArrayList) this.f17378c, (ArrayList) this.d, (ArrayList) this.f17379e, (ArrayList) this.f17380f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17377b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17378c, (ArrayList) this.d, (ArrayList) this.f17379e, (ArrayList) this.f17380f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17377b).lambda$startSecretChat$26((Context) this.f17378c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.f17379e, (byte[]) this.f17380f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17377b).lambda$processUnsentMessages$104((ArrayList) this.f17378c, (ArrayList) this.d, (ArrayList) this.f17379e, (ArrayList) this.f17380f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17377b).lambda$performSendDelayedMessage$55((TLObject) this.f17378c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f17379e, (String) this.f17380f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17377b).lambda$prepareImportStickers$113((String) this.f17378c, (String) this.d, (String) this.f17379e, (ArrayList) this.f17380f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17377b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17378c, (MessageObject) this.d, (File) this.f17379e, (SendMessagesHelper.DelayedMessage) this.f17380f, (String) this.h);
                return;
        }
    }
}
