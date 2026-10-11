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
    public final int f17379a;
    public final Object f17380b;
    public final Object f17381c;
    public final Object d;
    public final Object f17382e;
    public final Object f17383f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17379a = i10;
        this.f17380b = obj;
        this.f17381c = obj2;
        this.d = obj3;
        this.f17382e = obj4;
        this.f17383f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17379a) {
            case 0:
                ((BillingController) this.f17380b).lambda$launchBillingFlow$1((Activity) this.f17381c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f17382e, (List) this.f17383f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17380b, (String) this.f17381c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f17382e, (TLRPC.TL_messageMediaVenue) this.f17383f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f17380b, (File) this.f17381c, (boolean[]) this.d, (Utilities.Callback) this.f17382e, (org.telegram.ui.ActionBar.a2) this.f17383f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17380b).lambda$checkCanOpenChat$454((org.telegram.ui.ActionBar.a2) this.f17381c, (of.e) this.d, (TLObject) this.f17382e, (org.telegram.ui.ActionBar.m2) this.f17383f, (Bundle) this.h);
                return;
            case 4:
                ((MessagesController) this.f17380b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f17381c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.z5) this.f17382e, (File) this.f17383f, (String) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17380b).lambda$loadCache$6((ArrayList) this.f17381c, (ArrayList) this.d, (ArrayList) this.f17382e, (ArrayList) this.f17383f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17380b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17381c, (ArrayList) this.d, (ArrayList) this.f17382e, (ArrayList) this.f17383f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17380b).lambda$startSecretChat$26((Context) this.f17381c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.f17382e, (byte[]) this.f17383f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17380b).lambda$processUnsentMessages$107((ArrayList) this.f17381c, (ArrayList) this.d, (ArrayList) this.f17382e, (ArrayList) this.f17383f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17380b).lambda$performSendDelayedMessage$58((TLObject) this.f17381c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f17382e, (String) this.f17383f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17380b).lambda$prepareImportStickers$116((String) this.f17381c, (String) this.d, (String) this.f17382e, (ArrayList) this.f17383f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17380b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17381c, (MessageObject) this.d, (File) this.f17382e, (SendMessagesHelper.DelayedMessage) this.f17383f, (String) this.h);
                return;
        }
    }
}
