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
import org.telegram.ui.Components.xm0;
import org.telegram.ui.bb1;
public final class j1 implements ResultCallback, WriteToSocketDelegate, OnTokenCanceledListener, OnSuccessListener, OnFailureListener, hi.a7, jc, RequestTimeDelegate, xm0, org.telegram.ui.ActionBar.q1 {
    public final int f24796a;
    public final Object f24797b;

    public j1(Object obj, int i7) {
        this.f24796a = i7;
        this.f24797b = obj;
    }

    @Override
    public void a(float f10) {
        fj fjVar = ((xt) this.f24797b).X;
        if (fjVar == null) {
            return;
        }
        fjVar.f23953b0 = f10;
        MediaController.B().i0(fjVar, f10);
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        ef efVar = (ef) this.f24797b;
        String str = efVar.f27880i;
        if (str == null) {
            str = efVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ((org.telegram.ui.bn) this.f24797b).presentFragment(new bb1(6, null));
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.f24797b;
        if (z10) {
            if (!TextUtils.isEmpty(musicPlayerService.f22788n)) {
                fj fjVar = MediaController.B().f22768v0;
                if (fjVar != null) {
                    musicPlayerService.a(fjVar, true);
                }
                musicPlayerService.f22788n = null;
                return;
            }
            return;
        }
        boolean z13 = MusicPlayerService.f22781s;
    }

    @Override
    public void onCanceled() {
        Runnable runnable = ((Runnable[]) this.f24797b)[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f24796a) {
            case 1:
                f4 f4Var = (f4) this.f24797b;
                Pair pair = (Pair) obj;
                if (pair != null) {
                    f4Var.f23858a.put((Long) pair.first, (Bitmap) pair.second);
                    return;
                } else {
                    f4Var.getClass();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) this.f24797b;
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
        int i7 = this.f24796a;
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        ((mc) this.f24797b).q(exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ((nc) this.f24797b).a((String) obj);
    }

    @Override
    public void run(long j3) {
        g0.g3(new nd((az) this.f24797b, j3, 2));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i7 = this.f24796a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run() {
        Utilities.d.c(new u8((y8) this.f24797b, 3));
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void g(float f10) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }
}
