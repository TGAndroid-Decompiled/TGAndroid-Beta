package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.WriteToSocketDelegate;
import org.telegram.ui.Components.im0;
import org.telegram.ui.cb1;
public final class j1 implements ResultCallback, WriteToSocketDelegate, OnTokenCanceledListener, OnSuccessListener, OnFailureListener, fi.c7, lc, RequestTimeDelegate, im0, org.telegram.ui.ActionBar.r1 {
    public final int f23468a;
    public final Object f23469b;

    public j1(Object obj, int i7) {
        this.f23468a = i7;
        this.f23469b = obj;
    }

    @Override
    public void a(float f10) {
        ij ijVar = ((du) this.f23469b).W;
        if (ijVar == null) {
            return;
        }
        ijVar.f23226b0 = f10;
        MediaController.B().i0(ijVar, f10);
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        gf gfVar = (gf) this.f23469b;
        String str = gfVar.f26854i;
        if (str == null) {
            str = gfVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.f23469b;
        if (z9) {
            if (!TextUtils.isEmpty(musicPlayerService.f21322r)) {
                ij ijVar = MediaController.B().f21300u0;
                if (ijVar != null) {
                    musicPlayerService.a(ijVar, true);
                }
                musicPlayerService.f21322r = null;
                return;
            }
            return;
        }
        boolean z12 = MusicPlayerService.f21315w;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ((org.telegram.ui.cn) this.f23469b).presentFragment(new cb1(6, null));
    }

    @Override
    public void onCanceled() {
        Runnable runnable = ((Runnable[]) this.f23469b)[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f23468a) {
            case 1:
                d4 d4Var = (d4) this.f23469b;
                Pair pair = (Pair) obj;
                if (pair != null) {
                    d4Var.f21983a.put((Long) pair.first, (Bitmap) pair.second);
                    return;
                } else {
                    d4Var.getClass();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) this.f23469b;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    q3Var.a(new gg.a(bitmap, 0, null));
                    return;
                } else {
                    q3Var.a(null);
                    return;
                }
        }
    }

    @Override
    public void onError(Throwable th2) {
        int i7 = this.f23468a;
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        ((oc) this.f23469b).r(exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ((pc) this.f23469b).a((String) obj);
    }

    @Override
    public void run(long j3) {
        g0.h3(new pd((hz) this.f23469b, j3, 1));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i7 = this.f23468a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run() {
        Utilities.d.c(new u8((y8) this.f23469b, 3));
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void d(float f10) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }
}
