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
    public final int f17134a;
    public final Object f17135b;
    public final Object f17136c;
    public final Object d;
    public final Object f17137e;
    public final Object f17138f;
    public final Object h;

    public a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17134a = i10;
        this.f17135b = obj;
        this.f17136c = obj2;
        this.d = obj3;
        this.f17137e = obj4;
        this.f17138f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17134a) {
            case 0:
                ((BillingController) this.f17135b).lambda$launchBillingFlow$1((Activity) this.f17136c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f17137e, (List) this.f17138f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17135b, (String) this.f17136c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f17137e, (TLRPC.TL_messageMediaVenue) this.f17138f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f17135b, (File) this.f17136c, (boolean[]) this.d, (Utilities.Callback) this.f17137e, (org.telegram.ui.ActionBar.b2) this.f17138f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17135b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f17136c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.b6) this.f17137e, (File) this.f17138f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f17135b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.b2) this.f17136c, (of.e) this.d, (TLObject) this.f17137e, (org.telegram.ui.ActionBar.n2) this.f17138f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17135b).lambda$loadCache$6((ArrayList) this.f17136c, (ArrayList) this.d, (ArrayList) this.f17137e, (ArrayList) this.f17138f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17135b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17136c, (ArrayList) this.d, (ArrayList) this.f17137e, (ArrayList) this.f17138f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17135b).lambda$startSecretChat$26((Context) this.f17136c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.f17137e, (byte[]) this.f17138f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17135b).lambda$processUnsentMessages$104((ArrayList) this.f17136c, (ArrayList) this.d, (ArrayList) this.f17137e, (ArrayList) this.f17138f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17135b).lambda$performSendDelayedMessage$55((TLObject) this.f17136c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f17137e, (String) this.f17138f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17135b).lambda$prepareImportStickers$113((String) this.f17136c, (String) this.d, (String) this.f17137e, (ArrayList) this.f17138f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17135b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17136c, (MessageObject) this.d, (File) this.f17137e, (SendMessagesHelper.DelayedMessage) this.f17138f, (String) this.h);
                return;
        }
    }
}
