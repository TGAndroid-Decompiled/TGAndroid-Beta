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
import org.telegram.ui.Components.jm0;
import org.telegram.ui.bb1;
public final class j1 implements ResultCallback, WriteToSocketDelegate, OnTokenCanceledListener, OnSuccessListener, OnFailureListener, fi.c7, lc, RequestTimeDelegate, jm0, org.telegram.ui.ActionBar.r1 {
    public final int f23464a;
    public final Object f23465b;

    public j1(Object obj, int i7) {
        this.f23464a = i7;
        this.f23465b = obj;
    }

    @Override
    public void a(float f10) {
        ij ijVar = ((du) this.f23465b).W;
        if (ijVar == null) {
            return;
        }
        ijVar.f23222b0 = f10;
        MediaController.B().i0(ijVar, f10);
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        gf gfVar = (gf) this.f23465b;
        String str = gfVar.f26850i;
        if (str == null) {
            str = gfVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.f23465b;
        if (z9) {
            if (!TextUtils.isEmpty(musicPlayerService.f21317r)) {
                ij ijVar = MediaController.B().f21295u0;
                if (ijVar != null) {
                    musicPlayerService.a(ijVar, true);
                }
                musicPlayerService.f21317r = null;
                return;
            }
            return;
        }
        boolean z12 = MusicPlayerService.f21310w;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ((org.telegram.ui.cn) this.f23465b).presentFragment(new bb1(6, null));
    }

    @Override
    public void onCanceled() {
        Runnable runnable = ((Runnable[]) this.f23465b)[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f23464a) {
            case 1:
                d4 d4Var = (d4) this.f23465b;
                Pair pair = (Pair) obj;
                if (pair != null) {
                    d4Var.f21979a.put((Long) pair.first, (Bitmap) pair.second);
                    return;
                } else {
                    d4Var.getClass();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) this.f23465b;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    p3Var.a(new gg.a(bitmap, 0, null));
                    return;
                } else {
                    p3Var.a(null);
                    return;
                }
        }
    }

    @Override
    public void onError(Throwable th2) {
        int i7 = this.f23464a;
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        ((oc) this.f23465b).r(exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ((pc) this.f23465b).a((String) obj);
    }

    @Override
    public void run(long j3) {
        g0.h3(new pd((hz) this.f23465b, j3, 1));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i7 = this.f23464a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run() {
        Utilities.d.c(new u8((y8) this.f23465b, 3));
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
