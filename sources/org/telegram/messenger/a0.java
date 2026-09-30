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
    public final int f15859a;
    public final Object f15860b;
    public final Object f15861c;
    public final Object d;
    public final Object e;
    public final Object f15862f;
    public final Object h;

    public a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f15859a = i10;
        this.f15860b = obj;
        this.f15861c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f15862f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f15859a) {
            case 0:
                ((BillingController) this.f15860b).lambda$launchBillingFlow$1((Activity) this.f15861c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f15862f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f15860b, (String) this.f15861c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f15862f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f15860b, (File) this.f15861c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.a2) this.f15862f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f15860b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f15861c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.z5) this.e, (File) this.f15862f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f15860b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.a2) this.f15861c, (nf.e) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.m2) this.f15862f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f15860b).lambda$loadCache$6((ArrayList) this.f15861c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15862f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f15860b).lambda$updateDialogsLastMessage$8((ArrayList) this.f15861c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15862f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f15860b).lambda$startSecretChat$26((Context) this.f15861c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.e, (byte[]) this.f15862f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f15860b).lambda$processUnsentMessages$104((ArrayList) this.f15861c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15862f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f15860b).lambda$performSendDelayedMessage$55((TLObject) this.f15861c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f15862f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f15860b).lambda$prepareImportStickers$113((String) this.f15861c, (String) this.d, (String) this.e, (ArrayList) this.f15862f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f15860b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f15861c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f15862f, (String) this.h);
                return;
        }
    }
}
