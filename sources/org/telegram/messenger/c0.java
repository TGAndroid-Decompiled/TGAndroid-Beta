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
import org.telegram.ui.Components.jo0;
import org.telegram.ui.eo;
public final class c0 implements ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, bi.p9, TelegramMediaSession.BrowseChildrenCallback, ImageReceiver.ImageReceiverDelegate, RequestTimeDelegate, OnCompleteListener, jo0, org.telegram.ui.ActionBar.c2 {
    public final int f14823a;
    public final Object f14824b;

    public c0(Object obj, int i10) {
        this.f14823a = i10;
        this.f14824b = obj;
    }

    public void a(c5.h hVar, c5.s sVar) {
        BillingController.lambda$queryProductDetails$0((BillingController.ProductDetailsResponseListenerLegacy) this.f14824b, hVar, sVar);
    }

    @Override
    public void b(float f7) {
        ((RichMessageLayout.RichAudioBlock) this.f14824b).lambda$new$0(f7);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService.a((MusicPlayerService) this.f14824b, imageReceiver, z10, z11, z12);
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        m5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        SendMessagesHelper.lambda$sendCallback$42((eo) this.f14824b, d2Var, i10);
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        Bitmap lambda$rebuildPhoto$0;
        lambda$rebuildPhoto$0 = ((MediaController.PhotoEntry) this.f14824b).lambda$rebuildPhoto$0(options);
        return lambda$rebuildPhoto$0;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        m5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        ((PushListenerController.GooglePushListenerServiceProvider) this.f14824b).lambda$onRequestPushToken$0(task);
    }

    @Override
    public void onError(Throwable th2) {
        int i10 = this.f14823a;
        org.telegram.tgnet.o.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        LanguageDetector.lambda$detectLanguage$1((LanguageDetector.ExceptionCallback) this.f14824b, exc);
    }

    @Override
    public void onResult(List list) {
        ((MediaBrowserService.Result) this.f14824b).sendResult(list);
    }

    @Override
    public void onSuccess(Object obj) {
        LanguageDetector.lambda$detectLanguage$0((LanguageDetector.StringCallback) this.f14824b, (String) obj);
    }

    @Override
    public void run() {
        ((FileUploadOperation) this.f14824b).lambda$startUploadRequest$8();
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f14823a) {
            case 1:
                ChatThemeController.h((Utilities.Callback) this.f14824b, (Bitmap) obj);
                return;
            default:
                ChatThemeController.c((ChatThemeController) this.f14824b, (Pair) obj);
                return;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i10 = this.f14823a;
        org.telegram.tgnet.o.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        ProxyRotationController.c((SharedConfig.ProxyInfo) this.f14824b, j3);
    }

    @Override
    public void d(float f7) {
    }
}
