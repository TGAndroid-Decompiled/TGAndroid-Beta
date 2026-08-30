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
import org.telegram.ui.Components.fo0;
import org.telegram.ui.xn;
import p2.r;
public final class d implements RequestTimeDelegate, ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, ph.s6, TelegramMediaSession.BrowseChildrenCallback, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, fo0, org.telegram.ui.ActionBar.c2 {
    public final int f17010a;
    public final Object f17011b;

    public d(Object obj, int i10) {
        this.f17010a = i10;
        this.f17011b = obj;
    }

    public void a(p2.h hVar, r rVar) {
        BillingController.lambda$queryProductDetails$0((BillingController.ProductDetailsResponseListenerLegacy) this.f17011b, hVar, rVar);
    }

    @Override
    public void b(float f10) {
        ((RichMessageLayout.RichAudioBlock) this.f17011b).lambda$new$0(f10);
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        Bitmap lambda$rebuildPhoto$0;
        lambda$rebuildPhoto$0 = ((MediaController.PhotoEntry) this.f17011b).lambda$rebuildPhoto$0(options);
        return lambda$rebuildPhoto$0;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        MusicPlayerService.a((MusicPlayerService) this.f17011b, imageReceiver, z4, z10, z11);
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        SendMessagesHelper.lambda$sendCallback$42((xn) this.f17011b, d2Var, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        ((PushListenerController.GooglePushListenerServiceProvider) this.f17011b).lambda$onRequestPushToken$0(task);
    }

    @Override
    public void onError(Throwable th2) {
        int i10 = this.f17010a;
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        LanguageDetector.lambda$detectLanguage$1((LanguageDetector.ExceptionCallback) this.f17011b, exc);
    }

    @Override
    public void onResult(List list) {
        ((MediaBrowserService.Result) this.f17011b).sendResult(list);
    }

    @Override
    public void onSuccess(Object obj) {
        LanguageDetector.lambda$detectLanguage$0((LanguageDetector.StringCallback) this.f17011b, (String) obj);
    }

    @Override
    public void run() {
        ((FileUploadOperation) this.f17011b).lambda$startUploadRequest$8();
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f17010a) {
            case 2:
                ChatThemeController.h((Utilities.Callback) this.f17011b, (Bitmap) obj);
                return;
            default:
                ChatThemeController.c((ChatThemeController) this.f17011b, (Pair) obj);
                return;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i10 = this.f17010a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f17010a) {
            case 0:
                AndroidUtilities.lambda$showProxyAlert$18((org.telegram.ui.Components.sc[]) this.f17011b, j10);
                return;
            default:
                ProxyRotationController.c((SharedConfig.ProxyInfo) this.f17011b, j10);
                return;
        }
    }

    @Override
    public void d(float f10) {
    }
}
