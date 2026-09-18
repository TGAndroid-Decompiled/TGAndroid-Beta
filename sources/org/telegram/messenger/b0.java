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
    public final int f15886a;
    public final Object f15887b;
    public final Object f15888c;
    public final Object d;
    public final Object e;
    public final Object f15889f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f15886a = i10;
        this.f15887b = obj;
        this.f15888c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f15889f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f15886a) {
            case 0:
                ((BillingController) this.f15887b).lambda$launchBillingFlow$1((Activity) this.f15888c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f15889f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f15887b, (String) this.f15888c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f15889f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f15887b, (File) this.f15888c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.b2) this.f15889f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f15887b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f15888c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.b6) this.e, (File) this.f15889f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f15887b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.b2) this.f15888c, (nf.e) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.n2) this.f15889f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f15887b).lambda$loadCache$6((ArrayList) this.f15888c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15889f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f15887b).lambda$updateDialogsLastMessage$8((ArrayList) this.f15888c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15889f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f15887b).lambda$startSecretChat$26((Context) this.f15888c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.e, (byte[]) this.f15889f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f15887b).lambda$processUnsentMessages$104((ArrayList) this.f15888c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15889f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f15887b).lambda$performSendDelayedMessage$55((TLObject) this.f15888c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f15889f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f15887b).lambda$prepareImportStickers$113((String) this.f15888c, (String) this.d, (String) this.e, (ArrayList) this.f15889f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f15887b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f15888c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f15889f, (String) this.h);
                return;
        }
    }
}
