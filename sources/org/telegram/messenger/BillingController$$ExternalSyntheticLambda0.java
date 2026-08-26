package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.service.media.MediaBrowserService;
import android.util.Pair;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.List;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.WriteToSocketDelegate;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Stories.recorder.StoryEntry;

public final class BillingController$$ExternalSyntheticLambda0 implements RequestTimeDelegate, ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, StoryEntry.DecodeBitmap, TelegramMediaSession.BrowseChildrenCallback, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, SeekBar.SeekBarDelegate, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public BillingController$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public Bitmap decode(BitmapFactory.Options options) {
        return ((MediaController.PhotoEntry) this.f$0).lambda$rebuildPhoto$0(options);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ((MusicPlayerService) this.f$0).lambda$onCreate$0(imageReceiver, z, z2, z3);
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        SendMessagesHelper.lambda$sendCallback$42((ChatActivity) this.f$0, alertDialog, i);
    }

    @Override
    public void onComplete(Task task) {
        ((PushListenerController.GooglePushListenerServiceProvider) this.f$0).lambda$onRequestPushToken$0(task);
    }

    @Override
    public void onError(Throwable th) {
        int i = this.$r8$classId;
        ResultCallback.CC.$default$onError(this, th);
    }

    @Override
    public void onFailure(Exception exc) {
        LanguageDetector.lambda$detectLanguage$1((LanguageDetector.ExceptionCallback) this.f$0, exc);
    }

    public void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        BillingController.lambda$queryProductDetails$0((BillingController.ProductDetailsResponseListenerLegacy) this.f$0, billingResult, queryProductDetailsResult);
    }

    @Override
    public void onResult(List list) {
        ((MediaBrowserService.Result) this.f$0).sendResult(list);
    }

    @Override
    public void onSeekBarContinuousDrag(float f) {
    }

    @Override
    public void onSeekBarDrag(float f) {
        ((RichMessageLayout.RichAudioBlock) this.f$0).lambda$new$0(f);
    }

    @Override
    public void onSuccess(Object obj) {
        LanguageDetector.lambda$detectLanguage$0((LanguageDetector.StringCallback) this.f$0, (String) obj);
    }

    @Override
    public void run() {
        ((FileUploadOperation) this.f$0).lambda$startUploadRequest$8();
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.$r8$classId) {
            case 2:
                ChatThemeController.lambda$loadWallpaperBitmap$9((Utilities.Callback) this.f$0, (Bitmap) obj);
                break;
            default:
                ((ChatThemeController) this.f$0).lambda$preloadAllWallpaperThumbs$5((Pair) obj);
                break;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i = this.$r8$classId;
        ResultCallback.CC.$default$onError(this, tL_error);
    }

    @Override
    public void run(long j) {
        switch (this.$r8$classId) {
            case 1:
                AndroidUtilities.lambda$showProxyAlert$18((ButtonSpan.TextViewButtons[]) this.f$0, j);
                break;
            default:
                ProxyRotationController.lambda$new$1((SharedConfig.ProxyInfo) this.f$0, j);
                break;
        }
    }
}
