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
import org.telegram.ui.Components.eo0;
import org.telegram.ui.zn;
import p2.r;
public final class d0 implements ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, ph.r6, TelegramMediaSession.BrowseChildrenCallback, ImageReceiver.ImageReceiverDelegate, RequestTimeDelegate, OnCompleteListener, eo0, org.telegram.ui.ActionBar.c2 {
    public final int f16996a;
    public final Object f16997b;

    public d0(Object obj, int i10) {
        this.f16996a = i10;
        this.f16997b = obj;
    }

    public void a(p2.h hVar, r rVar) {
        BillingController.lambda$queryProductDetails$0((BillingController.ProductDetailsResponseListenerLegacy) this.f16997b, hVar, rVar);
    }

    @Override
    public void b(float f10) {
        ((RichMessageLayout.RichAudioBlock) this.f16997b).lambda$new$0(f10);
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        Bitmap lambda$rebuildPhoto$0;
        lambda$rebuildPhoto$0 = ((MediaController.PhotoEntry) this.f16997b).lambda$rebuildPhoto$0(options);
        return lambda$rebuildPhoto$0;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        MusicPlayerService.a((MusicPlayerService) this.f16997b, imageReceiver, z4, z10, z11);
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        SendMessagesHelper.lambda$sendCallback$42((zn) this.f16997b, d2Var, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        ((PushListenerController.GooglePushListenerServiceProvider) this.f16997b).lambda$onRequestPushToken$0(task);
    }

    @Override
    public void onError(Throwable th2) {
        int i10 = this.f16996a;
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        LanguageDetector.lambda$detectLanguage$1((LanguageDetector.ExceptionCallback) this.f16997b, exc);
    }

    @Override
    public void onResult(List list) {
        ((MediaBrowserService.Result) this.f16997b).sendResult(list);
    }

    @Override
    public void onSuccess(Object obj) {
        LanguageDetector.lambda$detectLanguage$0((LanguageDetector.StringCallback) this.f16997b, (String) obj);
    }

    @Override
    public void run() {
        ((FileUploadOperation) this.f16997b).lambda$startUploadRequest$8();
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f16996a) {
            case 1:
                ChatThemeController.h((Utilities.Callback) this.f16997b, (Bitmap) obj);
                return;
            default:
                ChatThemeController.c((ChatThemeController) this.f16997b, (Pair) obj);
                return;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i10 = this.f16996a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        ProxyRotationController.c((SharedConfig.ProxyInfo) this.f16997b, j10);
    }

    @Override
    public void d(float f10) {
    }
}
