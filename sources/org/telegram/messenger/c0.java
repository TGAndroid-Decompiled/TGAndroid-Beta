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
public final class c0 implements Runnable {
    public final int f16892a;
    public final Object f16893b;
    public final Object f16894c;
    public final Object d;
    public final Object e;
    public final Object f16895f;
    public final Object h;

    public c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f16892a = i10;
        this.f16893b = obj;
        this.f16894c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f16895f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f16892a) {
            case 0:
                ((BillingController) this.f16893b).lambda$launchBillingFlow$1((Activity) this.f16894c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f16895f, (p2.e) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f16893b, (String) this.f16894c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f16895f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f16893b, (File) this.f16894c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.d2) this.f16895f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f16893b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f16894c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.c6) this.e, (File) this.f16895f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f16893b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.d2) this.f16894c, (af.f) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.p2) this.f16895f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f16893b).lambda$loadCache$6((ArrayList) this.f16894c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16895f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f16893b).lambda$updateDialogsLastMessage$8((ArrayList) this.f16894c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16895f, (a0.h) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f16893b).lambda$startSecretChat$26((Context) this.f16894c, (org.telegram.ui.ActionBar.d2) this.d, (TLObject) this.e, (byte[]) this.f16895f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f16893b).lambda$processUnsentMessages$104((ArrayList) this.f16894c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16895f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f16893b).lambda$performSendDelayedMessage$55((TLObject) this.f16894c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f16895f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f16893b).lambda$prepareImportStickers$113((String) this.f16894c, (String) this.d, (String) this.e, (ArrayList) this.f16895f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f16893b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f16894c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f16895f, (String) this.h);
                return;
        }
    }
}
