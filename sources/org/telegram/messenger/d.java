package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.service.media.MediaBrowserService;
import android.util.Pair;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.List;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.WriteToSocketDelegate;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.rn;

public final class d implements RequestTimeDelegate, ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, lh.x7, TelegramMediaSession.BrowseChildrenCallback, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, ln0, org.telegram.ui.ActionBar.a2 {

    public final int f20002a;

    public final Object f20003b;

    public d(Object obj, int i10) {
        this.f20002a = i10;
        this.f20003b = obj;
    }

    public void a(n2.g gVar, n2.p pVar) {
        BillingController.lambda$queryProductDetails$0((BillingController.ProductDetailsResponseListenerLegacy) this.f20003b, gVar, pVar);
    }

    @Override
    public void b(float f10) {
        ((RichMessageLayout.RichAudioBlock) this.f20003b).lambda$new$0(f10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((MusicPlayerService) this.f20003b).lambda$onCreate$0(imageReceiver, z10, z11, z12);
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        SendMessagesHelper.lambda$sendCallback$42((rn) this.f20003b, b2Var, i10);
    }

    @Override
    public Bitmap h(BitmapFactory.Options options) {
        return ((MediaController.PhotoEntry) this.f20003b).lambda$rebuildPhoto$0(options);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        ((PushListenerController.GooglePushListenerServiceProvider) this.f20003b).lambda$onRequestPushToken$0(task);
    }

    @Override
    public void onError(Throwable th) {
        int i10 = this.f20002a;
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public void onFailure(Exception exc) {
        LanguageDetector.lambda$detectLanguage$1((LanguageDetector.ExceptionCallback) this.f20003b, exc);
    }

    @Override
    public void onResult(List list) {
        ((MediaBrowserService.Result) this.f20003b).sendResult(list);
    }

    @Override
    public void onSuccess(Object obj) {
        LanguageDetector.lambda$detectLanguage$0((LanguageDetector.StringCallback) this.f20003b, (String) obj);
    }

    @Override
    public void run() {
        ((FileUploadOperation) this.f20003b).lambda$startUploadRequest$8();
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f20002a) {
            case 2:
                ChatThemeController.lambda$loadWallpaperBitmap$9((Utilities.Callback) this.f20003b, (Bitmap) obj);
                break;
            default:
                ((ChatThemeController) this.f20003b).lambda$preloadAllWallpaperThumbs$5((Pair) obj);
                break;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i10 = this.f20002a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f20002a) {
            case 0:
                AndroidUtilities.lambda$showProxyAlert$18((org.telegram.ui.Components.oc[]) this.f20003b, j10);
                break;
            default:
                ProxyRotationController.lambda$new$1((SharedConfig.ProxyInfo) this.f20003b, j10);
                break;
        }
    }

    @Override
    public void e(float f10) {
    }
}
