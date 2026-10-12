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
    public final int f17219a;
    public final Object f17220b;
    public final Object f17221c;
    public final Object d;
    public final Object f17222e;
    public final Object f17223f;
    public final Object h;

    public c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17219a = i10;
        this.f17220b = obj;
        this.f17221c = obj2;
        this.d = obj3;
        this.f17222e = obj4;
        this.f17223f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17219a) {
            case 0:
                ((BillingController) this.f17220b).lambda$launchBillingFlow$1((Activity) this.f17221c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f17222e, (List) this.f17223f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17220b, (String) this.f17221c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f17222e, (TLRPC.TL_messageMediaVenue) this.f17223f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$56((File) this.f17220b, (File) this.f17221c, (boolean[]) this.d, (Utilities.Callback) this.f17222e, (org.telegram.ui.ActionBar.a2) this.f17223f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17220b).lambda$checkCanOpenChat$454((org.telegram.ui.ActionBar.a2) this.f17221c, (of.e) this.d, (TLObject) this.f17222e, (org.telegram.ui.ActionBar.m2) this.f17223f, (Bundle) this.h);
                return;
            case 4:
                ((MessagesController) this.f17220b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f17221c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.z5) this.f17222e, (File) this.f17223f, (String) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17220b).lambda$loadCache$6((ArrayList) this.f17221c, (ArrayList) this.d, (ArrayList) this.f17222e, (ArrayList) this.f17223f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17220b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17221c, (ArrayList) this.d, (ArrayList) this.f17222e, (ArrayList) this.f17223f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17220b).lambda$startSecretChat$26((Context) this.f17221c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.f17222e, (byte[]) this.f17223f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17220b).lambda$processUnsentMessages$107((ArrayList) this.f17221c, (ArrayList) this.d, (ArrayList) this.f17222e, (ArrayList) this.f17223f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17220b).lambda$performSendDelayedMessage$58((TLObject) this.f17221c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f17222e, (String) this.f17223f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17220b).lambda$prepareImportStickers$116((String) this.f17221c, (String) this.d, (String) this.f17222e, (ArrayList) this.f17223f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17220b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17221c, (MessageObject) this.d, (File) this.f17222e, (SendMessagesHelper.DelayedMessage) this.f17223f, (String) this.h);
                return;
        }
    }
}
