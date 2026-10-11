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
    public final int f17415a;
    public final Object f17416b;
    public final Object f17417c;
    public final Object d;
    public final Object f17418e;
    public final Object f17419f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17415a = i10;
        this.f17416b = obj;
        this.f17417c = obj2;
        this.d = obj3;
        this.f17418e = obj4;
        this.f17419f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17415a) {
            case 0:
                ((BillingController) this.f17416b).lambda$launchBillingFlow$1((Activity) this.f17417c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f17418e, (List) this.f17419f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17416b, (String) this.f17417c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f17418e, (TLRPC.TL_messageMediaVenue) this.f17419f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f17416b, (File) this.f17417c, (boolean[]) this.d, (Utilities.Callback) this.f17418e, (org.telegram.ui.ActionBar.a2) this.f17419f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17416b).lambda$checkCanOpenChat$454((org.telegram.ui.ActionBar.a2) this.f17417c, (of.e) this.d, (TLObject) this.f17418e, (org.telegram.ui.ActionBar.m2) this.f17419f, (Bundle) this.h);
                return;
            case 4:
                ((MessagesController) this.f17416b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f17417c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.z5) this.f17418e, (File) this.f17419f, (String) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17416b).lambda$loadCache$6((ArrayList) this.f17417c, (ArrayList) this.d, (ArrayList) this.f17418e, (ArrayList) this.f17419f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17416b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17417c, (ArrayList) this.d, (ArrayList) this.f17418e, (ArrayList) this.f17419f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17416b).lambda$startSecretChat$26((Context) this.f17417c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.f17418e, (byte[]) this.f17419f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17416b).lambda$processUnsentMessages$107((ArrayList) this.f17417c, (ArrayList) this.d, (ArrayList) this.f17418e, (ArrayList) this.f17419f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17416b).lambda$performSendDelayedMessage$58((TLObject) this.f17417c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f17418e, (String) this.f17419f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17416b).lambda$prepareImportStickers$116((String) this.f17417c, (String) this.d, (String) this.f17418e, (ArrayList) this.f17419f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17416b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17417c, (MessageObject) this.d, (File) this.f17418e, (SendMessagesHelper.DelayedMessage) this.f17419f, (String) this.h);
                return;
        }
    }
}
