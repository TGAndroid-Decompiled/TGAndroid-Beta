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
    public final int f16519a;
    public final Object f16520b;
    public final Object f16521c;
    public final Object d;
    public final Object e;
    public final Object f16522f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f16519a = i10;
        this.f16520b = obj;
        this.f16521c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f16522f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f16519a) {
            case 0:
                ((BillingController) this.f16520b).lambda$launchBillingFlow$1((Activity) this.f16521c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f16522f, (c5.g) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f16520b, (String) this.f16521c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f16522f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$56((File) this.f16520b, (File) this.f16521c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.a2) this.f16522f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f16520b).lambda$checkCanOpenChat$454((org.telegram.ui.ActionBar.a2) this.f16521c, (pf.c) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.m2) this.f16522f, (Bundle) this.h);
                return;
            case 4:
                ((MessagesController) this.f16520b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f16521c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.z5) this.e, (File) this.f16522f, (String) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f16520b).lambda$loadCache$6((ArrayList) this.f16521c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16522f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f16520b).lambda$updateDialogsLastMessage$8((ArrayList) this.f16521c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16522f, (a0.h) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f16520b).lambda$startSecretChat$26((Context) this.f16521c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.e, (byte[]) this.f16522f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f16520b).lambda$processUnsentMessages$107((ArrayList) this.f16521c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16522f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f16520b).lambda$performSendDelayedMessage$58((TLObject) this.f16521c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f16522f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f16520b).lambda$prepareImportStickers$116((String) this.f16521c, (String) this.d, (String) this.e, (ArrayList) this.f16522f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f16520b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f16521c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f16522f, (String) this.h);
                return;
        }
    }
}
