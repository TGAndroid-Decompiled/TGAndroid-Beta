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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.xa1;
public final class j1 implements ResultCallback, WriteToSocketDelegate, OnTokenCanceledListener, OnSuccessListener, OnFailureListener, hi.b7, kc, RequestTimeDelegate, mm0, org.telegram.ui.ActionBar.q1 {
    public final int f24499a;
    public final Object f24500b;

    public j1(Object obj, int i7) {
        this.f24499a = i7;
        this.f24500b = obj;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.f24500b;
        if (z10) {
            if (!TextUtils.isEmpty(musicPlayerService.f22397n)) {
                gj gjVar = MediaController.B().f22377v0;
                if (gjVar != null) {
                    musicPlayerService.a(gjVar, true);
                }
                musicPlayerService.f22397n = null;
                return;
            }
            return;
        }
        boolean z13 = MusicPlayerService.f22390s;
    }

    @Override
    public Bitmap d(BitmapFactory.Options options) {
        ff ffVar = (ff) this.f24500b;
        String str = ffVar.f27713i;
        if (str == null) {
            str = ffVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public void e(float f10) {
        gj gjVar = ((au) this.f24500b).X;
        if (gjVar == null) {
            return;
        }
        gjVar.f23777b0 = f10;
        MediaController.B().i0(gjVar, f10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ((org.telegram.ui.an) this.f24500b).presentFragment(new xa1(6, null));
    }

    @Override
    public void onCanceled() {
        Runnable runnable = ((Runnable[]) this.f24500b)[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f24499a) {
            case 1:
                d4 d4Var = (d4) this.f24500b;
                Pair pair = (Pair) obj;
                if (pair != null) {
                    d4Var.f23024a.put((Long) pair.first, (Bitmap) pair.second);
                    return;
                } else {
                    d4Var.getClass();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.f24500b;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    n3Var.a(new gg.a(bitmap, 0, null));
                    return;
                } else {
                    n3Var.a(null);
                    return;
                }
        }
    }

    @Override
    public void onError(Throwable th2) {
        int i7 = this.f24499a;
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        ((nc) this.f24500b).r(exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ((oc) this.f24500b).a((String) obj);
    }

    @Override
    public void run(long j3) {
        g0.h3(new od((fz) this.f24500b, j3, 1));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i7 = this.f24499a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run() {
        Utilities.d.c(new u8((y8) this.f24500b, 3));
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void g(float f10) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }
}
