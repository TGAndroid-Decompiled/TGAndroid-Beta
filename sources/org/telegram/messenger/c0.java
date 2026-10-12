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
public final class c0 implements Runnable {
    public final int f17218a;
    public final Object f17219b;
    public final Object f17220c;
    public final Object d;
    public final Object f17221e;
    public final Object f17222f;
    public final Object h;

    public c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17218a = i10;
        this.f17219b = obj;
        this.f17220c = obj2;
        this.d = obj3;
        this.f17221e = obj4;
        this.f17222f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17218a) {
            case 0:
                ((BillingController) this.f17219b).lambda$launchBillingFlow$1((Activity) this.f17220c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f17221e, (List) this.f17222f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17219b, (String) this.f17220c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f17221e, (TLRPC.TL_messageMediaVenue) this.f17222f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$56((File) this.f17219b, (File) this.f17220c, (boolean[]) this.d, (Utilities.Callback) this.f17221e, (org.telegram.ui.ActionBar.a2) this.f17222f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17219b).lambda$checkCanOpenChat$454((org.telegram.ui.ActionBar.a2) this.f17220c, (of.e) this.d, (TLObject) this.f17221e, (org.telegram.ui.ActionBar.m2) this.f17222f, (Bundle) this.h);
                return;
            case 4:
                ((MessagesController) this.f17219b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f17220c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.z5) this.f17221e, (File) this.f17222f, (String) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17219b).lambda$loadCache$6((ArrayList) this.f17220c, (ArrayList) this.d, (ArrayList) this.f17221e, (ArrayList) this.f17222f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17219b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17220c, (ArrayList) this.d, (ArrayList) this.f17221e, (ArrayList) this.f17222f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17219b).lambda$startSecretChat$26((Context) this.f17220c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.f17221e, (byte[]) this.f17222f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17219b).lambda$processUnsentMessages$107((ArrayList) this.f17220c, (ArrayList) this.d, (ArrayList) this.f17221e, (ArrayList) this.f17222f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17219b).lambda$performSendDelayedMessage$58((TLObject) this.f17220c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f17221e, (String) this.f17222f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17219b).lambda$prepareImportStickers$116((String) this.f17220c, (String) this.d, (String) this.f17221e, (ArrayList) this.f17222f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17219b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17220c, (MessageObject) this.d, (File) this.f17221e, (SendMessagesHelper.DelayedMessage) this.f17222f, (String) this.h);
                return;
        }
    }
}
