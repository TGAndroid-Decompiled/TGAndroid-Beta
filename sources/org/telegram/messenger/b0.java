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
    public final int f17381a;
    public final Object f17382b;
    public final Object f17383c;
    public final Object d;
    public final Object f17384e;
    public final Object f17385f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17381a = i10;
        this.f17382b = obj;
        this.f17383c = obj2;
        this.d = obj3;
        this.f17384e = obj4;
        this.f17385f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17381a) {
            case 0:
                ((BillingController) this.f17382b).lambda$launchBillingFlow$1((Activity) this.f17383c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f17384e, (List) this.f17385f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f17382b, (String) this.f17383c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f17384e, (TLRPC.TL_messageMediaVenue) this.f17385f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f17382b, (File) this.f17383c, (boolean[]) this.d, (Utilities.Callback) this.f17384e, (org.telegram.ui.ActionBar.b2) this.f17385f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f17382b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f17383c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.a6) this.f17384e, (File) this.f17385f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f17382b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.b2) this.f17383c, (nf.e) this.d, (TLObject) this.f17384e, (org.telegram.ui.ActionBar.n2) this.f17385f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f17382b).lambda$loadCache$6((ArrayList) this.f17383c, (ArrayList) this.d, (ArrayList) this.f17384e, (ArrayList) this.f17385f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f17382b).lambda$updateDialogsLastMessage$8((ArrayList) this.f17383c, (ArrayList) this.d, (ArrayList) this.f17384e, (ArrayList) this.f17385f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f17382b).lambda$startSecretChat$26((Context) this.f17383c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.f17384e, (byte[]) this.f17385f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f17382b).lambda$processUnsentMessages$104((ArrayList) this.f17383c, (ArrayList) this.d, (ArrayList) this.f17384e, (ArrayList) this.f17385f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f17382b).lambda$performSendDelayedMessage$55((TLObject) this.f17383c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f17384e, (String) this.f17385f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f17382b).lambda$prepareImportStickers$113((String) this.f17383c, (String) this.d, (String) this.f17384e, (ArrayList) this.f17385f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f17382b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f17383c, (MessageObject) this.d, (File) this.f17384e, (SendMessagesHelper.DelayedMessage) this.f17385f, (String) this.h);
                return;
        }
    }
}
