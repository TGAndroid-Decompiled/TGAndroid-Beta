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
import org.telegram.ui.Components.oo0;
import org.telegram.ui.xn;
public final class c0 implements ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, ci.i8, TelegramMediaSession.BrowseChildrenCallback, ImageReceiver.ImageReceiverDelegate, RequestTimeDelegate, OnCompleteListener, oo0, org.telegram.ui.ActionBar.b2 {
    public final int f16034a;
    public final Object f16035b;

    public c0(Object obj, int i10) {
        this.f16034a = i10;
        this.f16035b = obj;
    }

    public void a(c5.h hVar, c5.s sVar) {
        BillingController.lambda$queryProductDetails$0((BillingController.ProductDetailsResponseListenerLegacy) this.f16035b, hVar, sVar);
    }

    @Override
    public void b(float f7) {
        ((RichMessageLayout.RichAudioBlock) this.f16035b).lambda$new$0(f7);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService.a((MusicPlayerService) this.f16035b, imageReceiver, z10, z11, z12);
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        SendMessagesHelper.lambda$sendCallback$42((xn) this.f16035b, c2Var, i10);
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        Bitmap lambda$rebuildPhoto$0;
        lambda$rebuildPhoto$0 = ((MediaController.PhotoEntry) this.f16035b).lambda$rebuildPhoto$0(options);
        return lambda$rebuildPhoto$0;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        ((PushListenerController.GooglePushListenerServiceProvider) this.f16035b).lambda$onRequestPushToken$0(task);
    }

    @Override
    public void onError(Throwable th2) {
        int i10 = this.f16034a;
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        LanguageDetector.lambda$detectLanguage$1((LanguageDetector.ExceptionCallback) this.f16035b, exc);
    }

    @Override
    public void onResult(List list) {
        ((MediaBrowserService.Result) this.f16035b).sendResult(list);
    }

    @Override
    public void onSuccess(Object obj) {
        LanguageDetector.lambda$detectLanguage$0((LanguageDetector.StringCallback) this.f16035b, (String) obj);
    }

    @Override
    public void run() {
        ((FileUploadOperation) this.f16035b).lambda$startUploadRequest$8();
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f16034a) {
            case 1:
                ChatThemeController.h((Utilities.Callback) this.f16035b, (Bitmap) obj);
                return;
            default:
                ChatThemeController.c((ChatThemeController) this.f16035b, (Pair) obj);
                return;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i10 = this.f16034a;
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        ProxyRotationController.c((SharedConfig.ProxyInfo) this.f16035b, j3);
    }

    @Override
    public void d(float f7) {
    }
}
