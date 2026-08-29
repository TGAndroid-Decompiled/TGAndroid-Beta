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
    public final int f19757a;
    public final Object f19758b;
    public final Object f19759c;
    public final Object d;
    public final Object f19760e;
    public final Object f19761f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f19757a = i10;
        this.f19758b = obj;
        this.f19759c = obj2;
        this.d = obj3;
        this.f19760e = obj4;
        this.f19761f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f19757a) {
            case 0:
                ((BillingController) this.f19758b).lambda$launchBillingFlow$1((Activity) this.f19759c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f19760e, (List) this.f19761f, (p2.e) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f19758b, (String) this.f19759c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f19760e, (TLRPC.TL_messageMediaVenue) this.f19761f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f19758b, (File) this.f19759c, (boolean[]) this.d, (Utilities.Callback) this.f19760e, (org.telegram.ui.ActionBar.c2) this.f19761f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f19758b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f19759c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.z5) this.f19760e, (File) this.f19761f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f19758b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.c2) this.f19759c, (ye.c) this.d, (TLObject) this.f19760e, (org.telegram.ui.ActionBar.o2) this.f19761f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f19758b).lambda$loadCache$6((ArrayList) this.f19759c, (ArrayList) this.d, (ArrayList) this.f19760e, (ArrayList) this.f19761f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f19758b).lambda$updateDialogsLastMessage$8((ArrayList) this.f19759c, (ArrayList) this.d, (ArrayList) this.f19760e, (ArrayList) this.f19761f, (a0.h) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f19758b).lambda$startSecretChat$26((Context) this.f19759c, (org.telegram.ui.ActionBar.c2) this.d, (TLObject) this.f19760e, (byte[]) this.f19761f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f19758b).lambda$processUnsentMessages$104((ArrayList) this.f19759c, (ArrayList) this.d, (ArrayList) this.f19760e, (ArrayList) this.f19761f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f19758b).lambda$performSendDelayedMessage$55((TLObject) this.f19759c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f19760e, (String) this.f19761f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f19758b).lambda$prepareImportStickers$113((String) this.f19759c, (String) this.d, (String) this.f19760e, (ArrayList) this.f19761f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f19758b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f19759c, (MessageObject) this.d, (File) this.f19760e, (SendMessagesHelper.DelayedMessage) this.f19761f, (String) this.h);
                return;
        }
    }
}
