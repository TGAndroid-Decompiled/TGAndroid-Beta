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
    public final int f17282a;
    public final Object f17283b;
    public final Object f17284c;
    public final Object d;
    public final Object f17285e;
    public final Object f17286f;
    public final Object h;

    public a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17282a = i10;
        this.f17283b = obj;
        this.f17284c = obj2;
        this.d = obj3;
        this.f17285e = obj4;
        this.f17286f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17282a) {
            case 0:
                ((BillingController) this.f17283b).lambda$launchBillingFlow$1((Activity) this.f17284c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f17285e, (List) this.f17286f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17283b, (String) this.f17284c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f17285e, (TLRPC.TL_messageMediaVenue) this.f17286f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f17283b, (File) this.f17284c, (boolean[]) this.d, (Utilities.Callback) this.f17285e, (org.telegram.ui.ActionBar.b2) this.f17286f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17283b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f17284c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.a6) this.f17285e, (File) this.f17286f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f17283b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.b2) this.f17284c, (nf.e) this.d, (TLObject) this.f17285e, (org.telegram.ui.ActionBar.n2) this.f17286f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17283b).lambda$loadCache$6((ArrayList) this.f17284c, (ArrayList) this.d, (ArrayList) this.f17285e, (ArrayList) this.f17286f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17283b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17284c, (ArrayList) this.d, (ArrayList) this.f17285e, (ArrayList) this.f17286f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17283b).lambda$startSecretChat$26((Context) this.f17284c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.f17285e, (byte[]) this.f17286f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17283b).lambda$processUnsentMessages$104((ArrayList) this.f17284c, (ArrayList) this.d, (ArrayList) this.f17285e, (ArrayList) this.f17286f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17283b).lambda$performSendDelayedMessage$55((TLObject) this.f17284c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f17285e, (String) this.f17286f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17283b).lambda$prepareImportStickers$113((String) this.f17284c, (String) this.d, (String) this.f17285e, (ArrayList) this.f17286f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17283b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17284c, (MessageObject) this.d, (File) this.f17285e, (SendMessagesHelper.DelayedMessage) this.f17286f, (String) this.h);
                return;
        }
    }
}
