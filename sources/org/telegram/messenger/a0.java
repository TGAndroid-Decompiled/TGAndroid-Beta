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
    public final int f15843a;
    public final Object f15844b;
    public final Object f15845c;
    public final Object d;
    public final Object e;
    public final Object f15846f;
    public final Object h;

    public a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f15843a = i10;
        this.f15844b = obj;
        this.f15845c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f15846f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f15843a) {
            case 0:
                ((BillingController) this.f15844b).lambda$launchBillingFlow$1((Activity) this.f15845c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f15846f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f15844b, (String) this.f15845c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f15846f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f15844b, (File) this.f15845c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.a2) this.f15846f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f15844b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f15845c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.z5) this.e, (File) this.f15846f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f15844b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.a2) this.f15845c, (nf.e) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.m2) this.f15846f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f15844b).lambda$loadCache$6((ArrayList) this.f15845c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15846f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f15844b).lambda$updateDialogsLastMessage$8((ArrayList) this.f15845c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15846f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f15844b).lambda$startSecretChat$26((Context) this.f15845c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.e, (byte[]) this.f15846f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f15844b).lambda$processUnsentMessages$104((ArrayList) this.f15845c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15846f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f15844b).lambda$performSendDelayedMessage$55((TLObject) this.f15845c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f15846f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f15844b).lambda$prepareImportStickers$113((String) this.f15845c, (String) this.d, (String) this.e, (ArrayList) this.f15846f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f15844b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f15845c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f15846f, (String) this.h);
                return;
        }
    }
}
