package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.collection.LongSparseArray;
import com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public final class MediaController$$ExternalSyntheticLambda44 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public MediaController$$ExternalSyntheticLambda44(File file, File file2, boolean[] zArr, Utilities.Callback callback, AlertDialog alertDialog, boolean[] zArr2) {
        this.$r8$classId = 0;
        this.f$0 = file;
        this.f$1 = file2;
        this.f$2 = zArr;
        this.f$3 = callback;
        this.f$4 = alertDialog;
        this.f$5 = zArr2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MediaController.lambda$saveFile$55((File) this.f$0, (File) this.f$1, (boolean[]) this.f$2, (Utilities.Callback) this.f$3, (AlertDialog) this.f$4, (boolean[]) this.f$5);
                break;
            case 1:
                ((BillingController) this.f$0).lambda$launchBillingFlow$1((Activity) this.f$1, (AccountInstance) this.f$2, (TLRPC.InputStorePaymentPurpose) this.f$5, (List) this.f$3, (BillingFlowParams$SubscriptionUpdateParams) this.f$4);
                break;
            case 2:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.f$0, (String) this.f$1, (String) this.f$2, (TLRPC.TL_messageMediaVenue) this.f$5, (TLRPC.TL_messageMediaVenue) this.f$3, (Location) this.f$4);
                break;
            case 3:
                File file = (File) this.f$0;
                ((MessagesController) this.f$1).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.f$2, (TLRPC.TL_wallPaperSettings) this.f$5, (Theme.OverrideWallpaperInfo) this.f$3, file, (String) this.f$4);
                break;
            case 4:
                ((MessagesController) this.f$0).lambda$checkCanOpenChat$451((AlertDialog) this.f$4, (Browser.Progress) this.f$1, (TLObject) this.f$2, (BaseFragment) this.f$5, (Bundle) this.f$3);
                break;
            case 5:
                ((SavedMessagesController) this.f$0).lambda$loadCache$6((ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$5, (ArrayList) this.f$3, (Runnable) this.f$4);
                break;
            case 6:
                ((SavedMessagesController) this.f$0).lambda$updateDialogsLastMessage$8((ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$5, (ArrayList) this.f$3, (LongSparseArray) this.f$4);
                break;
            case 7:
                ((SecretChatHelper) this.f$0).lambda$startSecretChat$26((Context) this.f$1, (AlertDialog) this.f$4, (TLObject) this.f$2, (byte[]) this.f$5, (TLRPC.User) this.f$3);
                break;
            case 8:
                ((SendMessagesHelper) this.f$0).lambda$processUnsentMessages$104((ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$5, (ArrayList) this.f$3, (ArrayList) this.f$4);
                break;
            case 9:
                ((SendMessagesHelper) this.f$0).lambda$performSendDelayedMessage$55((TLObject) this.f$1, (TLRPC.InputMedia) this.f$2, (SendMessagesHelper.DelayedMessage) this.f$5, (String) this.f$3, (MessageObject) this.f$4);
                break;
            case 10:
                ((SendMessagesHelper) this.f$0).lambda$prepareImportStickers$113((String) this.f$1, (String) this.f$2, (String) this.f$5, (ArrayList) this.f$3, (MessagesStorage.StringCallback) this.f$4);
                break;
            default:
                ((SendMessagesHelper) this.f$1).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.f$2, (MessageObject) this.f$5, (File) this.f$0, (SendMessagesHelper.DelayedMessage) this.f$3, (String) this.f$4);
                break;
        }
    }

    public MediaController$$ExternalSyntheticLambda44(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$5 = obj4;
        this.f$3 = obj5;
        this.f$4 = obj6;
    }

    public MediaController$$ExternalSyntheticLambda44(MessagesController messagesController, TLRPC.WallPaper wallPaper, TLRPC.TL_wallPaperSettings tL_wallPaperSettings, Theme.OverrideWallpaperInfo overrideWallpaperInfo, File file, String str) {
        this.$r8$classId = 3;
        this.f$1 = messagesController;
        this.f$2 = wallPaper;
        this.f$5 = tL_wallPaperSettings;
        this.f$3 = overrideWallpaperInfo;
        this.f$0 = file;
        this.f$4 = str;
    }

    public MediaController$$ExternalSyntheticLambda44(MessagesController messagesController, AlertDialog alertDialog, Browser.Progress progress, TLObject tLObject, BaseFragment baseFragment, Bundle bundle) {
        this.$r8$classId = 4;
        this.f$0 = messagesController;
        this.f$4 = alertDialog;
        this.f$1 = progress;
        this.f$2 = tLObject;
        this.f$5 = baseFragment;
        this.f$3 = bundle;
    }

    public MediaController$$ExternalSyntheticLambda44(SecretChatHelper secretChatHelper, Context context, AlertDialog alertDialog, TLObject tLObject, byte[] bArr, TLRPC.User user) {
        this.$r8$classId = 7;
        this.f$0 = secretChatHelper;
        this.f$1 = context;
        this.f$4 = alertDialog;
        this.f$2 = tLObject;
        this.f$5 = bArr;
        this.f$3 = user;
    }

    public MediaController$$ExternalSyntheticLambda44(SendMessagesHelper sendMessagesHelper, TLRPC.TL_photo tL_photo, MessageObject messageObject, File file, SendMessagesHelper.DelayedMessage delayedMessage, String str) {
        this.$r8$classId = 11;
        this.f$1 = sendMessagesHelper;
        this.f$2 = tL_photo;
        this.f$5 = messageObject;
        this.f$0 = file;
        this.f$3 = delayedMessage;
        this.f$4 = str;
    }
}
