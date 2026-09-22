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
    public final int f15627a;
    public final Object f15628b;
    public final Object f15629c;
    public final Object d;
    public final Object e;
    public final Object f15630f;
    public final Object h;

    public a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f15627a = i10;
        this.f15628b = obj;
        this.f15629c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f15630f = obj5;
        this.h = obj6;
    }

    @Override
    public final void run() {
        switch (this.f15627a) {
            case 0:
                ((BillingController) this.f15628b).lambda$launchBillingFlow$1((Activity) this.f15629c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f15630f, (c5.f) this.h);
                return;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f15628b, (String) this.f15629c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f15630f, (Location) this.h);
                return;
            case 2:
                MediaController.lambda$saveFile$55((File) this.f15628b, (File) this.f15629c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.b2) this.f15630f, (boolean[]) this.h);
                return;
            case 3:
                ((MessagesController) this.f15628b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f15629c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.b6) this.e, (File) this.f15630f, (String) this.h);
                return;
            case 4:
                ((MessagesController) this.f15628b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.b2) this.f15629c, (nf.e) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.n2) this.f15630f, (Bundle) this.h);
                return;
            case 5:
                ((SavedMessagesController) this.f15628b).lambda$loadCache$6((ArrayList) this.f15629c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15630f, (Runnable) this.h);
                return;
            case 6:
                ((SavedMessagesController) this.f15628b).lambda$updateDialogsLastMessage$8((ArrayList) this.f15629c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15630f, (a0.i) this.h);
                return;
            case 7:
                ((SecretChatHelper) this.f15628b).lambda$startSecretChat$26((Context) this.f15629c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.e, (byte[]) this.f15630f, (TLRPC.User) this.h);
                return;
            case 8:
                ((SendMessagesHelper) this.f15628b).lambda$processUnsentMessages$104((ArrayList) this.f15629c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f15630f, (ArrayList) this.h);
                return;
            case 9:
                ((SendMessagesHelper) this.f15628b).lambda$performSendDelayedMessage$55((TLObject) this.f15629c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f15630f, (MessageObject) this.h);
                return;
            case 10:
                ((SendMessagesHelper) this.f15628b).lambda$prepareImportStickers$113((String) this.f15629c, (String) this.d, (String) this.e, (ArrayList) this.f15630f, (MessagesStorage.StringCallback) this.h);
                return;
            default:
                ((SendMessagesHelper) this.f15628b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f15629c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f15630f, (String) this.h);
                return;
        }
    }
}
