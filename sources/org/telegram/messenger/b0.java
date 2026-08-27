package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class b0 implements Runnable {

    public final int f19747a;

    public final Object f19748b;

    public final Object f19749c;
    public final Object d;

    public final Object f19750e;

    public final Object f19751f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f19747a = i10;
        this.f19748b = obj;
        this.f19749c = obj2;
        this.d = obj3;
        this.f19750e = obj4;
        this.f19751f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f19747a) {
            case 0:
                ((BillingController) this.f19748b).lambda$launchBillingFlow$1((Activity) this.f19749c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f19750e, (List) this.f19751f, (n2.e) this.h);
                break;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f19748b, (String) this.f19749c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f19750e, (TLRPC.TL_messageMediaVenue) this.f19751f, (Location) this.h);
                break;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f19748b, (File) this.f19749c, (boolean[]) this.d, (Utilities.Callback) this.f19750e, (org.telegram.ui.ActionBar.b2) this.f19751f, (boolean[]) this.h);
                break;
            case 3:
                ((MessagesController) this.f19748b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f19749c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.z5) this.f19750e, (File) this.f19751f, (String) this.h);
                break;
            case 4:
                ((MessagesController) this.f19748b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.b2) this.f19749c, (we.d) this.d, (TLObject) this.f19750e, (org.telegram.ui.ActionBar.n2) this.f19751f, (Bundle) this.h);
                break;
            case 5:
                ((SavedMessagesController) this.f19748b).lambda$loadCache$6((ArrayList) this.f19749c, (ArrayList) this.d, (ArrayList) this.f19750e, (ArrayList) this.f19751f, (Runnable) this.h);
                break;
            case 6:
                ((SavedMessagesController) this.f19748b).lambda$updateDialogsLastMessage$8((ArrayList) this.f19749c, (ArrayList) this.d, (ArrayList) this.f19750e, (ArrayList) this.f19751f, (a0.h) this.h);
                break;
            case 7:
                ((SecretChatHelper) this.f19748b).lambda$startSecretChat$26((Context) this.f19749c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.f19750e, (byte[]) this.f19751f, (TLRPC.User) this.h);
                break;
            case 8:
                ((SendMessagesHelper) this.f19748b).lambda$processUnsentMessages$104((ArrayList) this.f19749c, (ArrayList) this.d, (ArrayList) this.f19750e, (ArrayList) this.f19751f, (ArrayList) this.h);
                break;
            case 9:
                ((SendMessagesHelper) this.f19748b).lambda$performSendDelayedMessage$55((TLObject) this.f19749c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f19750e, (String) this.f19751f, (MessageObject) this.h);
                break;
            case 10:
                ((SendMessagesHelper) this.f19748b).lambda$prepareImportStickers$113((String) this.f19749c, (String) this.d, (String) this.f19750e, (ArrayList) this.f19751f, (MessagesStorage.StringCallback) this.h);
                break;
            default:
                ((SendMessagesHelper) this.f19748b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f19749c, (MessageObject) this.d, (File) this.f19750e, (SendMessagesHelper.DelayedMessage) this.f19751f, (String) this.h);
                break;
        }
    }
}
