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
    public final int f17979a;
    public final Object f17980b;
    public final Object f17981c;
    public final Object d;
    public final Object e;
    public final Object f17982f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17979a = i10;
        this.f17980b = obj;
        this.f17981c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f17982f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17979a) {
            case 0:
                ((BillingController) this.f17980b).lambda$launchBillingFlow$1((Activity) this.f17981c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f17982f, (c5.g) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17980b, (String) this.f17981c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f17982f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$58((File) this.f17980b, (File) this.f17981c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.c2) this.f17982f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17980b).lambda$checkCanOpenChat$454((org.telegram.ui.ActionBar.c2) this.f17981c, (pf.c) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.o2) this.f17982f, (Bundle) this.h);
                return;
            case 4:
                ((MessagesController) this.f17980b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f17981c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.d6) this.e, (File) this.f17982f, (String) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17980b).lambda$loadCache$6((ArrayList) this.f17981c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17982f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17980b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17981c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17982f, (a0.h) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17980b).lambda$startSecretChat$26((Context) this.f17981c, (org.telegram.ui.ActionBar.c2) this.d, (TLObject) this.e, (byte[]) this.f17982f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17980b).lambda$processUnsentMessages$107((ArrayList) this.f17981c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17982f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17980b).lambda$performSendDelayedMessage$58((TLObject) this.f17981c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f17982f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17980b).lambda$prepareImportStickers$116((String) this.f17981c, (String) this.d, (String) this.e, (ArrayList) this.f17982f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17980b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17981c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f17982f, (String) this.h);
                return;
        }
    }
}
