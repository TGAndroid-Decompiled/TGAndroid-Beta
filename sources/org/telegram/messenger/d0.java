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
import org.telegram.ui.Components.fp0;
import org.telegram.ui.zn;
public final class d0 implements ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, ci.j8, TelegramMediaSession.BrowseChildrenCallback, ImageReceiver.ImageReceiverDelegate, RequestTimeDelegate, OnCompleteListener, fp0, org.telegram.ui.ActionBar.a2 {
    public final int f17607a;
    public final Object f17608b;

    public d0(Object obj, int i10) {
        this.f17607a = i10;
        this.f17608b = obj;
    }

    public void a(c5.h hVar, c5.s sVar) {
        BillingController.lambda$queryProductDetails$0((BillingController.ProductDetailsResponseListenerLegacy) this.f17608b, hVar, sVar);
    }

    @Override
    public void b(float f7) {
        ((RichMessageLayout.RichAudioBlock) this.f17608b).lambda$new$0(f7);
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        Bitmap lambda$rebuildPhoto$0;
        lambda$rebuildPhoto$0 = ((MediaController.PhotoEntry) this.f17608b).lambda$rebuildPhoto$0(options);
        return lambda$rebuildPhoto$0;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService.a((MusicPlayerService) this.f17608b, imageReceiver, z10, z11, z12);
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        SendMessagesHelper.lambda$sendCallback$45((zn) this.f17608b, b2Var, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        ((PushListenerController.GooglePushListenerServiceProvider) this.f17608b).lambda$onRequestPushToken$0(task);
    }

    @Override
    public void onError(Throwable th2) {
        int i10 = this.f17607a;
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        LanguageDetector.lambda$detectLanguage$1((LanguageDetector.ExceptionCallback) this.f17608b, exc);
    }

    @Override
    public void onResult(List list) {
        ((MediaBrowserService.Result) this.f17608b).sendResult(list);
    }

    @Override
    public void onSuccess(Object obj) {
        LanguageDetector.lambda$detectLanguage$0((LanguageDetector.StringCallback) this.f17608b, (String) obj);
    }

    @Override
    public void run() {
        ((FileUploadOperation) this.f17608b).lambda$startUploadRequest$8();
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f17607a) {
            case 1:
                ChatThemeController.h((Utilities.Callback) this.f17608b, (Bitmap) obj);
                return;
            default:
                ChatThemeController.c((ChatThemeController) this.f17608b, (Pair) obj);
                return;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i10 = this.f17607a;
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        ProxyRotationController.c((SharedConfig.ProxyInfo) this.f17608b, j3);
    }

    @Override
    public void d(float f7) {
    }
}
