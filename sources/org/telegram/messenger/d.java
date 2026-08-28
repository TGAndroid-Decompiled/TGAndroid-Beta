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
import org.telegram.ui.Components.kn0;
import org.telegram.ui.qn;
public final class d implements RequestTimeDelegate, ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, kh.y7, TelegramMediaSession.BrowseChildrenCallback, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, kn0, org.telegram.ui.ActionBar.b2 {
    public final int f20036a;
    public final Object f20037b;

    public d(Object obj, int i9) {
        this.f20036a = i9;
        this.f20037b = obj;
    }

    public void a(n2.g gVar, n2.q qVar) {
        BillingController.lambda$queryProductDetails$0((BillingController.ProductDetailsResponseListenerLegacy) this.f20037b, gVar, qVar);
    }

    @Override
    public void b(float f10) {
        ((RichMessageLayout.RichAudioBlock) this.f20037b).lambda$new$0(f10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService.a((MusicPlayerService) this.f20037b, imageReceiver, z10, z11, z12);
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        g5.a(this, i9, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        SendMessagesHelper.lambda$sendCallback$42((qn) this.f20037b, c2Var, i9);
    }

    @Override
    public Bitmap g(BitmapFactory.Options options) {
        Bitmap lambda$rebuildPhoto$0;
        lambda$rebuildPhoto$0 = ((MediaController.PhotoEntry) this.f20037b).lambda$rebuildPhoto$0(options);
        return lambda$rebuildPhoto$0;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        g5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        ((PushListenerController.GooglePushListenerServiceProvider) this.f20037b).lambda$onRequestPushToken$0(task);
    }

    @Override
    public void onError(Throwable th) {
        int i9 = this.f20036a;
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public void onFailure(Exception exc) {
        LanguageDetector.lambda$detectLanguage$1((LanguageDetector.ExceptionCallback) this.f20037b, exc);
    }

    @Override
    public void onResult(List list) {
        ((MediaBrowserService.Result) this.f20037b).sendResult(list);
    }

    @Override
    public void onSuccess(Object obj) {
        LanguageDetector.lambda$detectLanguage$0((LanguageDetector.StringCallback) this.f20037b, (String) obj);
    }

    @Override
    public void run() {
        ((FileUploadOperation) this.f20037b).lambda$startUploadRequest$8();
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f20036a) {
            case 2:
                ChatThemeController.h((Utilities.Callback) this.f20037b, (Bitmap) obj);
                return;
            default:
                ChatThemeController.c((ChatThemeController) this.f20037b, (Pair) obj);
                return;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i9 = this.f20036a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f20036a) {
            case 0:
                AndroidUtilities.lambda$showProxyAlert$18((org.telegram.ui.Components.qc[]) this.f20037b, j10);
                return;
            default:
                ProxyRotationController.c((SharedConfig.ProxyInfo) this.f20037b, j10);
                return;
        }
    }

    @Override
    public void e(float f10) {
    }
}
