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
    public final int f19784a;
    public final Object f19785b;
    public final Object f19786c;
    public final Object d;
    public final Object f19787e;
    public final Object f19788f;
    public final Object h;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.f19784a = i9;
        this.f19785b = obj;
        this.f19786c = obj2;
        this.d = obj3;
        this.f19787e = obj4;
        this.f19788f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f19784a) {
            case 0:
                ((BillingController) this.f19785b).lambda$launchBillingFlow$1((Activity) this.f19786c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.f19787e, (List) this.f19788f, (n2.e) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f19785b, (String) this.f19786c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.f19787e, (TLRPC.TL_messageMediaVenue) this.f19788f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f19785b, (File) this.f19786c, (boolean[]) this.d, (Utilities.Callback) this.f19787e, (org.telegram.ui.ActionBar.c2) this.f19788f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f19785b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f19786c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.y5) this.f19787e, (File) this.f19788f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f19785b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.c2) this.f19786c, (ve.d) this.d, (TLObject) this.f19787e, (org.telegram.ui.ActionBar.o2) this.f19788f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f19785b).lambda$loadCache$6((ArrayList) this.f19786c, (ArrayList) this.d, (ArrayList) this.f19787e, (ArrayList) this.f19788f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f19785b).lambda$updateDialogsLastMessage$8((ArrayList) this.f19786c, (ArrayList) this.d, (ArrayList) this.f19787e, (ArrayList) this.f19788f, (a0.h) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f19785b).lambda$startSecretChat$26((Context) this.f19786c, (org.telegram.ui.ActionBar.c2) this.d, (TLObject) this.f19787e, (byte[]) this.f19788f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f19785b).lambda$processUnsentMessages$104((ArrayList) this.f19786c, (ArrayList) this.d, (ArrayList) this.f19787e, (ArrayList) this.f19788f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f19785b).lambda$performSendDelayedMessage$55((TLObject) this.f19786c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.f19787e, (String) this.f19788f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f19785b).lambda$prepareImportStickers$113((String) this.f19786c, (String) this.d, (String) this.f19787e, (ArrayList) this.f19788f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f19785b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f19786c, (MessageObject) this.d, (File) this.f19787e, (SendMessagesHelper.DelayedMessage) this.f19788f, (String) this.h);
                return;
        }
    }
}
