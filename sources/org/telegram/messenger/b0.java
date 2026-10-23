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
    public final int f17915a;
    public final Object f17916b;
    public final Object f17917c;
    public final Object d;
    public final Object e;
    public final Object f17918f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17915a = i10;
        this.f17916b = obj;
        this.f17917c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f17918f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17915a) {
            case 0:
                ((BillingController) this.f17916b).lambda$launchBillingFlow$1((Activity) this.f17917c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f17918f, (c5.g) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17916b, (String) this.f17917c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f17918f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$58((File) this.f17916b, (File) this.f17917c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.b2) this.f17918f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17916b).lambda$checkCanOpenChat$454((org.telegram.ui.ActionBar.b2) this.f17917c, (pf.c) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.n2) this.f17918f, (Bundle) this.h);
                return;
            case 4:
                ((MessagesController) this.f17916b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f17917c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.a6) this.e, (File) this.f17918f, (String) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17916b).lambda$loadCache$6((ArrayList) this.f17917c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17918f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17916b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17917c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17918f, (a0.h) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17916b).lambda$startSecretChat$26((Context) this.f17917c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.e, (byte[]) this.f17918f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17916b).lambda$processUnsentMessages$107((ArrayList) this.f17917c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17918f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17916b).lambda$performSendDelayedMessage$58((TLObject) this.f17917c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f17918f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17916b).lambda$prepareImportStickers$116((String) this.f17917c, (String) this.d, (String) this.e, (ArrayList) this.f17918f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17916b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17917c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f17918f, (String) this.h);
                return;
        }
    }
}
