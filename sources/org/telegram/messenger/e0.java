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
    public final int f19939a;
    public final Object f19940b;
    public final Object f19941c;
    public final Object d;
    public final Object e;
    public final Object f19942f;
    public final Object h;

    public e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f19939a = i10;
        this.f19940b = obj;
        this.f19941c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f19942f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f19939a) {
            case 0:
                ((BillingController) this.f19940b).lambda$launchBillingFlow$1((Activity) this.f19941c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f19942f, (d5.g) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f19940b, (String) this.f19941c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f19942f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$58((File) this.f19940b, (File) this.f19941c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.e2) this.f19942f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f19940b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f19941c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.r6) this.e, (File) this.f19942f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f19940b).lambda$checkCanOpenChat$457((org.telegram.ui.ActionBar.e2) this.f19941c, (qf.c) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.r2) this.f19942f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f19940b).lambda$loadCache$6((ArrayList) this.f19941c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f19942f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f19940b).lambda$updateDialogsLastMessage$8((ArrayList) this.f19941c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f19942f, (a0.h) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f19940b).lambda$startSecretChat$26((Context) this.f19941c, (org.telegram.ui.ActionBar.e2) this.d, (TLObject) this.e, (byte[]) this.f19942f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f19940b).lambda$processUnsentMessages$107((ArrayList) this.f19941c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f19942f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f19940b).lambda$performSendDelayedMessage$58((TLObject) this.f19941c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f19942f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f19940b).lambda$prepareImportStickers$116((String) this.f19941c, (String) this.d, (String) this.e, (ArrayList) this.f19942f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f19940b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f19941c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f19942f, (String) this.h);
                return;
        }
    }
}
