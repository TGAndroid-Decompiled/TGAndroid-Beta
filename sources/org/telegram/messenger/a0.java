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
    public final int f15848a;
    public final Object f15849b;
    public final Object f15850c;
    public final Object d;
    public final Object e;
    public final Object f15851f;
    public final Object h;

    public a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f15848a = i10;
        this.f15849b = obj;
        this.f15850c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f15851f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f15848a) {
            case 0:
                ((BillingController) this.f15849b).lambda$launchBillingFlow$1((Activity) this.f15850c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f15851f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f15849b, (String) this.f15850c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f15851f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f15849b, (File) this.f15850c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.b2) this.f15851f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f15849b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f15850c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.b6) this.e, (File) this.f15851f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f15849b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.b2) this.f15850c, (nf.e) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.n2) this.f15851f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f15849b).lambda$loadCache$6((ArrayList) this.f15850c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15851f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f15849b).lambda$updateDialogsLastMessage$8((ArrayList) this.f15850c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15851f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f15849b).lambda$startSecretChat$26((Context) this.f15850c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.e, (byte[]) this.f15851f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f15849b).lambda$processUnsentMessages$104((ArrayList) this.f15850c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15851f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f15849b).lambda$performSendDelayedMessage$55((TLObject) this.f15850c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f15851f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f15849b).lambda$prepareImportStickers$113((String) this.f15850c, (String) this.d, (String) this.e, (ArrayList) this.f15851f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f15849b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f15850c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f15851f, (String) this.h);
                return;
        }
    }
}
