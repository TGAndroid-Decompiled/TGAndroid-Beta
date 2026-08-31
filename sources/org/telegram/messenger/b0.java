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
    public final int f18205a;
    public final Object f18206b;
    public final Object f18207c;
    public final Object d;
    public final Object f18208e;
    public final Object f18209f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18205a = i10;
        this.f18206b = obj;
        this.f18207c = obj2;
        this.d = obj3;
        this.f18208e = obj4;
        this.f18209f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18205a) {
            case 0:
                ((BillingController) this.f18206b).lambda$launchBillingFlow$1((Activity) this.f18207c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f18208e, (List) this.f18209f, (p2.e) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f18206b, (String) this.f18207c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f18208e, (TLRPC.TL_messageMediaVenue) this.f18209f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f18206b, (File) this.f18207c, (boolean[]) this.d, (Utilities.Callback) this.f18208e, (org.telegram.ui.ActionBar.d2) this.f18209f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f18206b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f18207c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.d6) this.f18208e, (File) this.f18209f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f18206b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.d2) this.f18207c, (af.f) this.d, (TLObject) this.f18208e, (org.telegram.ui.ActionBar.p2) this.f18209f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f18206b).lambda$loadCache$6((ArrayList) this.f18207c, (ArrayList) this.d, (ArrayList) this.f18208e, (ArrayList) this.f18209f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f18206b).lambda$updateDialogsLastMessage$8((ArrayList) this.f18207c, (ArrayList) this.d, (ArrayList) this.f18208e, (ArrayList) this.f18209f, (a0.h) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f18206b).lambda$startSecretChat$26((Context) this.f18207c, (org.telegram.ui.ActionBar.d2) this.d, (TLObject) this.f18208e, (byte[]) this.f18209f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f18206b).lambda$processUnsentMessages$104((ArrayList) this.f18207c, (ArrayList) this.d, (ArrayList) this.f18208e, (ArrayList) this.f18209f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f18206b).lambda$performSendDelayedMessage$55((TLObject) this.f18207c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f18208e, (String) this.f18209f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f18206b).lambda$prepareImportStickers$113((String) this.f18207c, (String) this.d, (String) this.f18208e, (ArrayList) this.f18209f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f18206b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f18207c, (MessageObject) this.d, (File) this.f18208e, (SendMessagesHelper.DelayedMessage) this.f18209f, (String) this.h);
                return;
        }
    }
}
