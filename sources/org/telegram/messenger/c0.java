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
    public final int f16912a;
    public final Object f16913b;
    public final Object f16914c;
    public final Object d;
    public final Object e;
    public final Object f16915f;
    public final Object h;

    public c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f16912a = i10;
        this.f16913b = obj;
        this.f16914c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f16915f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f16912a) {
            case 0:
                ((BillingController) this.f16913b).lambda$launchBillingFlow$1((Activity) this.f16914c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f16915f, (c5.g) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f16913b, (String) this.f16914c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f16915f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$56((File) this.f16913b, (File) this.f16914c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.a2) this.f16915f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f16913b).lambda$checkCanOpenChat$454((org.telegram.ui.ActionBar.a2) this.f16914c, (pf.c) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.m2) this.f16915f, (Bundle) this.h);
                return;
            case 4:
                ((MessagesController) this.f16913b).lambda$didReceivedNotification$43((TLRPC.WallPaper) this.f16914c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.z5) this.e, (File) this.f16915f, (String) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f16913b).lambda$loadCache$6((ArrayList) this.f16914c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16915f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f16913b).lambda$updateDialogsLastMessage$8((ArrayList) this.f16914c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16915f, (a0.h) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f16913b).lambda$startSecretChat$26((Context) this.f16914c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.e, (byte[]) this.f16915f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f16913b).lambda$processUnsentMessages$107((ArrayList) this.f16914c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16915f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f16913b).lambda$performSendDelayedMessage$58((TLObject) this.f16914c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f16915f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f16913b).lambda$prepareImportStickers$116((String) this.f16914c, (String) this.d, (String) this.e, (ArrayList) this.f16915f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f16913b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f16914c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f16915f, (String) this.h);
                return;
        }
    }
}
