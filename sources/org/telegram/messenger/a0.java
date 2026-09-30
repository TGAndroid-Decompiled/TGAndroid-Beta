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
    public final int f15875a;
    public final Object f15876b;
    public final Object f15877c;
    public final Object d;
    public final Object e;
    public final Object f15878f;
    public final Object h;

    public a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f15875a = i10;
        this.f15876b = obj;
        this.f15877c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f15878f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f15875a) {
            case 0:
                ((BillingController) this.f15876b).lambda$launchBillingFlow$1((Activity) this.f15877c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f15878f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f15876b, (String) this.f15877c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f15878f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f15876b, (File) this.f15877c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.a2) this.f15878f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f15876b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f15877c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.z5) this.e, (File) this.f15878f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f15876b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.a2) this.f15877c, (nf.e) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.m2) this.f15878f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f15876b).lambda$loadCache$6((ArrayList) this.f15877c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15878f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f15876b).lambda$updateDialogsLastMessage$8((ArrayList) this.f15877c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15878f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f15876b).lambda$startSecretChat$26((Context) this.f15877c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.e, (byte[]) this.f15878f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f15876b).lambda$processUnsentMessages$104((ArrayList) this.f15877c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15878f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f15876b).lambda$performSendDelayedMessage$55((TLObject) this.f15877c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f15878f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f15876b).lambda$prepareImportStickers$113((String) this.f15877c, (String) this.d, (String) this.e, (ArrayList) this.f15878f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f15876b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f15877c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f15878f, (String) this.h);
                return;
        }
    }
}
