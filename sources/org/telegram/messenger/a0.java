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
public final class a0 implements Runnable {
    public final int f14672a;
    public final Object f14673b;
    public final Object f14674c;
    public final Object d;
    public final Object e;
    public final Object f14675f;
    public final Object h;

    public a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f14672a = i10;
        this.f14673b = obj;
        this.f14674c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f14675f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f14672a) {
            case 0:
                ((BillingController) this.f14673b).lambda$launchBillingFlow$1((Activity) this.f14674c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f14675f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f14673b, (String) this.f14674c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f14675f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f14673b, (File) this.f14674c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.d2) this.f14675f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f14673b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f14674c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.c6) this.e, (File) this.f14675f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f14673b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.d2) this.f14674c, (nf.e) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.p2) this.f14675f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f14673b).lambda$loadCache$6((ArrayList) this.f14674c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f14675f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f14673b).lambda$updateDialogsLastMessage$8((ArrayList) this.f14674c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f14675f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f14673b).lambda$startSecretChat$26((Context) this.f14674c, (org.telegram.ui.ActionBar.d2) this.d, (TLObject) this.e, (byte[]) this.f14675f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f14673b).lambda$processUnsentMessages$104((ArrayList) this.f14674c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f14675f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f14673b).lambda$performSendDelayedMessage$55((TLObject) this.f14674c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f14675f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f14673b).lambda$prepareImportStickers$113((String) this.f14674c, (String) this.d, (String) this.e, (ArrayList) this.f14675f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f14673b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f14674c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f14675f, (String) this.h);
                return;
        }
    }
}
