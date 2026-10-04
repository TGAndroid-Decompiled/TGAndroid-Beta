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
public final class a0 implements Runnable {
    public final int f17283a;
    public final Object f17284b;
    public final Object f17285c;
    public final Object d;
    public final Object f17286e;
    public final Object f17287f;
    public final Object h;

    public a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17283a = i10;
        this.f17284b = obj;
        this.f17285c = obj2;
        this.d = obj3;
        this.f17286e = obj4;
        this.f17287f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17283a) {
            case 0:
                ((BillingController) this.f17284b).lambda$launchBillingFlow$1((Activity) this.f17285c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f17286e, (List) this.f17287f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17284b, (String) this.f17285c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f17286e, (TLRPC.TL_messageMediaVenue) this.f17287f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f17284b, (File) this.f17285c, (boolean[]) this.d, (Utilities.Callback) this.f17286e, (org.telegram.ui.ActionBar.b2) this.f17287f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17284b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f17285c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.a6) this.f17286e, (File) this.f17287f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f17284b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.b2) this.f17285c, (nf.e) this.d, (TLObject) this.f17286e, (org.telegram.ui.ActionBar.n2) this.f17287f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17284b).lambda$loadCache$6((ArrayList) this.f17285c, (ArrayList) this.d, (ArrayList) this.f17286e, (ArrayList) this.f17287f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17284b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17285c, (ArrayList) this.d, (ArrayList) this.f17286e, (ArrayList) this.f17287f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17284b).lambda$startSecretChat$26((Context) this.f17285c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.f17286e, (byte[]) this.f17287f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17284b).lambda$processUnsentMessages$104((ArrayList) this.f17285c, (ArrayList) this.d, (ArrayList) this.f17286e, (ArrayList) this.f17287f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17284b).lambda$performSendDelayedMessage$55((TLObject) this.f17285c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f17286e, (String) this.f17287f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17284b).lambda$prepareImportStickers$113((String) this.f17285c, (String) this.d, (String) this.f17286e, (ArrayList) this.f17287f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17284b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17285c, (MessageObject) this.d, (File) this.f17286e, (SendMessagesHelper.DelayedMessage) this.f17287f, (String) this.h);
                return;
        }
    }
}
