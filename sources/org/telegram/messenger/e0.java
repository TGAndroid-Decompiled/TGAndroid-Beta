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
public final class e0 implements Runnable {
    public final int f19944a;
    public final Object f19945b;
    public final Object f19946c;
    public final Object d;
    public final Object e;
    public final Object f19947f;
    public final Object h;

    public e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f19944a = i10;
        this.f19945b = obj;
        this.f19946c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f19947f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f19944a) {
            case 0:
                ((BillingController) this.f19945b).lambda$launchBillingFlow$1((Activity) this.f19946c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f19947f, (d5.g) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f19945b, (String) this.f19946c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f19947f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$58((File) this.f19945b, (File) this.f19946c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.e2) this.f19947f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f19945b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f19946c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.r6) this.e, (File) this.f19947f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f19945b).lambda$checkCanOpenChat$456((org.telegram.ui.ActionBar.e2) this.f19946c, (qf.c) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.r2) this.f19947f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f19945b).lambda$loadCache$6((ArrayList) this.f19946c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f19947f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f19945b).lambda$updateDialogsLastMessage$8((ArrayList) this.f19946c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f19947f, (a0.h) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f19945b).lambda$startSecretChat$26((Context) this.f19946c, (org.telegram.ui.ActionBar.e2) this.d, (TLObject) this.e, (byte[]) this.f19947f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f19945b).lambda$processUnsentMessages$107((ArrayList) this.f19946c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f19947f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f19945b).lambda$performSendDelayedMessage$58((TLObject) this.f19946c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f19947f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f19945b).lambda$prepareImportStickers$116((String) this.f19946c, (String) this.d, (String) this.e, (ArrayList) this.f19947f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f19945b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f19946c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f19947f, (String) this.h);
                return;
        }
    }
}
