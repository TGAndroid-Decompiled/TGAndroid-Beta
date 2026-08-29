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
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.WriteToSocketDelegate;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.tn;
public final class d implements RequestTimeDelegate, ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, nh.m7, TelegramMediaSession.BrowseChildrenCallback, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, vn0, org.telegram.ui.ActionBar.b2 {
    public final int f19985a;
    public final Object f19986b;

    public d(Object obj, int i10) {
        this.f19985a = i10;
        this.f19986b = obj;
    }

    public void a(p2.g gVar, p2.p pVar) {
        BillingController.lambda$queryProductDetails$0((BillingController.ProductDetailsResponseListenerLegacy) this.f19986b, gVar, pVar);
    }

    @Override
    public void c(float f9) {
        ((RichMessageLayout.RichAudioBlock) this.f19986b).lambda$new$0(f9);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService.a((MusicPlayerService) this.f19986b, imageReceiver, z10, z11, z12);
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        SendMessagesHelper.lambda$sendCallback$42((tn) this.f19986b, c2Var, i10);
    }

    @Override
    public Bitmap h(BitmapFactory.Options options) {
        Bitmap lambda$rebuildPhoto$0;
        lambda$rebuildPhoto$0 = ((MediaController.PhotoEntry) this.f19986b).lambda$rebuildPhoto$0(options);
        return lambda$rebuildPhoto$0;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        ((PushListenerController.GooglePushListenerServiceProvider) this.f19986b).lambda$onRequestPushToken$0(task);
    }

    @Override
    public void onError(Throwable th2) {
        int i10 = this.f19985a;
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        LanguageDetector.lambda$detectLanguage$1((LanguageDetector.ExceptionCallback) this.f19986b, exc);
    }

    @Override
    public void onResult(List list) {
        ((MediaBrowserService.Result) this.f19986b).sendResult(list);
    }

    @Override
    public void onSuccess(Object obj) {
        LanguageDetector.lambda$detectLanguage$0((LanguageDetector.StringCallback) this.f19986b, (String) obj);
    }

    @Override
    public void run() {
        ((FileUploadOperation) this.f19986b).lambda$startUploadRequest$8();
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f19985a) {
            case 2:
                ChatThemeController.h((Utilities.Callback) this.f19986b, (Bitmap) obj);
                return;
            default:
                ChatThemeController.c((ChatThemeController) this.f19986b, (Pair) obj);
                return;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i10 = this.f19985a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f19985a) {
            case 0:
                AndroidUtilities.lambda$showProxyAlert$18((org.telegram.ui.Components.vc[]) this.f19986b, j10);
                return;
            default:
                ProxyRotationController.c((SharedConfig.ProxyInfo) this.f19986b, j10);
                return;
        }
    }

    @Override
    public void d(float f9) {
    }
}
