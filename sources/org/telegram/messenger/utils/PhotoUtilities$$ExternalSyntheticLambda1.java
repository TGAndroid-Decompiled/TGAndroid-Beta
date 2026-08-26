package org.telegram.messenger.utils;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticLambda12;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ChatActivity$21$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda21;
import org.telegram.ui.PhotoViewer;

public final class PhotoUtilities$$ExternalSyntheticLambda1 implements ListenerSet.Event, ImageUpdater.ImageUpdaterDelegate, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public PhotoUtilities$$ExternalSyntheticLambda1(int i, ChatActivity$21$$ExternalSyntheticLambda4 chatActivity$21$$ExternalSyntheticLambda4, INavigationLayout iNavigationLayout, ImageUpdater imageUpdater) {
        this.f$0 = i;
        this.f$1 = chatActivity$21$$ExternalSyntheticLambda4;
        this.f$2 = iNavigationLayout;
        this.f$3 = imageUpdater;
    }

    @Override
    public boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didStartUpload(this, z, z2);
    }

    @Override
    public void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        final ChatActivity$21$$ExternalSyntheticLambda4 chatActivity$21$$ExternalSyntheticLambda4 = (ChatActivity$21$$ExternalSyntheticLambda4) this.f$1;
        final ImageUpdater imageUpdater = (ImageUpdater) this.f$3;
        final int i = this.f$0;
        final INavigationLayout iNavigationLayout = (INavigationLayout) this.f$2;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                TLRPC.InputFile inputFile3 = inputFile;
                if (inputFile3 != null) {
                    tL_photos_uploadProfilePhoto.file = inputFile3;
                    tL_photos_uploadProfilePhoto.flags |= 1;
                }
                TLRPC.InputFile inputFile4 = inputFile2;
                if (inputFile4 != null) {
                    tL_photos_uploadProfilePhoto.video = inputFile4;
                    int i2 = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i2 | 6;
                }
                TLRPC.VideoSize videoSize2 = videoSize;
                if (videoSize2 != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                int i3 = i;
                ConnectionsManager.getInstance(i3).sendRequest(tL_photos_uploadProfilePhoto, new ChatObject$Call$$ExternalSyntheticLambda12(i3, photoSize2, photoSize, chatActivity$21$$ExternalSyntheticLambda4, iNavigationLayout));
                imageUpdater.onPause();
            }
        });
    }

    @Override
    public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public String getInitialSearchString() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
    }

    @Override
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.f$1;
        int i = this.f$0;
        analyticsListener.onPositionDiscontinuity(eventTime, i);
        analyticsListener.onPositionDiscontinuity(eventTime, (Player.PositionInfo) this.f$2, (Player.PositionInfo) this.f$3, i);
    }

    @Override
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = (ArrayList) this.f$1;
            if (!zHasNext) {
                AndroidUtilities.runOnUIThread(new BoostRepository$$ExternalSyntheticLambda21((TLRPC.Chat) this.f$2, this.f$0, arrayList, (Utilities.Callback) this.f$3, 1));
                return;
            }
            ProductDetails productDetails = (ProductDetails) it.next();
            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                String str = tL_premiumGiftCodeOption.store_product;
                if (str != null && str.equals(productDetails.zzc)) {
                    tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                    tL_premiumGiftCodeOption.currency = oneTimePurchaseOfferDetails.zzc;
                    break;
                }
            }
        }
    }

    @Override
    public void onUploadProgressChanged(float f) {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$onUploadProgressChanged(this, f);
    }

    @Override
    public boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }

    public PhotoUtilities$$ExternalSyntheticLambda1(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.f$1 = eventTime;
        this.f$0 = i;
        this.f$2 = positionInfo;
        this.f$3 = positionInfo2;
    }

    public PhotoUtilities$$ExternalSyntheticLambda1(ArrayList arrayList, TLRPC.Chat chat, int i, Utilities.Callback callback) {
        this.f$1 = arrayList;
        this.f$2 = chat;
        this.f$0 = i;
        this.f$3 = callback;
    }
}
