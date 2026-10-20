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
    public final int f17914a;
    public final Object f17915b;
    public final Object f17916c;
    public final Object d;
    public final Object e;
    public final Object f17917f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17914a = i10;
        this.f17915b = obj;
        this.f17916c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f17917f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17914a) {
            case 0:
                ((BillingController) this.f17915b).lambda$launchBillingFlow$1((Activity) this.f17916c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f17917f, (c5.g) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17915b, (String) this.f17916c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f17917f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$56((File) this.f17915b, (File) this.f17916c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.b2) this.f17917f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17915b).lambda$checkCanOpenChat$454((org.telegram.ui.ActionBar.b2) this.f17916c, (pf.c) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.n2) this.f17917f, (Bundle) this.h);
                return;
            case 4:
                ((MessagesController) this.f17915b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f17916c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.a6) this.e, (File) this.f17917f, (String) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17915b).lambda$loadCache$6((ArrayList) this.f17916c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17917f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17915b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17916c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17917f, (a0.h) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17915b).lambda$startSecretChat$26((Context) this.f17916c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.e, (byte[]) this.f17917f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17915b).lambda$processUnsentMessages$107((ArrayList) this.f17916c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17917f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17915b).lambda$performSendDelayedMessage$58((TLObject) this.f17916c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f17917f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17915b).lambda$prepareImportStickers$116((String) this.f17916c, (String) this.d, (String) this.e, (ArrayList) this.f17917f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17915b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17916c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f17917f, (String) this.h);
                return;
        }
    }
}
