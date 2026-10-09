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
    public final int f17382a;
    public final Object f17383b;
    public final Object f17384c;
    public final Object d;
    public final Object f17385e;
    public final Object f17386f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17382a = i10;
        this.f17383b = obj;
        this.f17384c = obj2;
        this.d = obj3;
        this.f17385e = obj4;
        this.f17386f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17382a) {
            case 0:
                ((BillingController) this.f17383b).lambda$launchBillingFlow$1((Activity) this.f17384c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f17385e, (List) this.f17386f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17383b, (String) this.f17384c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f17385e, (TLRPC.TL_messageMediaVenue) this.f17386f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f17383b, (File) this.f17384c, (boolean[]) this.d, (Utilities.Callback) this.f17385e, (org.telegram.ui.ActionBar.b2) this.f17386f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17383b).lambda$checkCanOpenChat$454((org.telegram.ui.ActionBar.b2) this.f17384c, (of.e) this.d, (TLObject) this.f17385e, (org.telegram.ui.ActionBar.n2) this.f17386f, (Bundle) this.h);
                return;
            case 4:
                ((MessagesController) this.f17383b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f17384c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.b6) this.f17385e, (File) this.f17386f, (String) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17383b).lambda$loadCache$6((ArrayList) this.f17384c, (ArrayList) this.d, (ArrayList) this.f17385e, (ArrayList) this.f17386f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17383b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17384c, (ArrayList) this.d, (ArrayList) this.f17385e, (ArrayList) this.f17386f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17383b).lambda$startSecretChat$26((Context) this.f17384c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.f17385e, (byte[]) this.f17386f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17383b).lambda$processUnsentMessages$107((ArrayList) this.f17384c, (ArrayList) this.d, (ArrayList) this.f17385e, (ArrayList) this.f17386f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17383b).lambda$performSendDelayedMessage$58((TLObject) this.f17384c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f17385e, (String) this.f17386f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17383b).lambda$prepareImportStickers$116((String) this.f17384c, (String) this.d, (String) this.f17385e, (ArrayList) this.f17386f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17383b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17384c, (MessageObject) this.d, (File) this.f17385e, (SendMessagesHelper.DelayedMessage) this.f17386f, (String) this.h);
                return;
        }
    }
}
