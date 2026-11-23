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
import org.telegram.ui.Components.wm0;
import org.telegram.ui.za1;
public final class j1 implements ResultCallback, WriteToSocketDelegate, OnTokenCanceledListener, OnSuccessListener, OnFailureListener, hi.v7, jc, RequestTimeDelegate, wm0, org.telegram.ui.ActionBar.q1 {
    public final int f24905a;
    public final Object f24906b;

    public j1(Object obj, int i7) {
        this.f24905a = i7;
        this.f24906b = obj;
    }

    @Override
    public Bitmap b(BitmapFactory.Options options) {
        ef efVar = (ef) this.f24906b;
        String str = efVar.f27968i;
        if (str == null) {
            str = efVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public void e(float f10) {
        fj fjVar = ((xt) this.f24906b).X;
        if (fjVar == null) {
            return;
        }
        fjVar.f24033b0 = f10;
        MediaController.B().i0(fjVar, f10);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ((org.telegram.ui.bn) this.f24906b).presentFragment(new za1(6, null));
    }

    @Override
    public void onCanceled() {
        Runnable runnable = ((Runnable[]) this.f24906b)[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f24905a) {
            case 1:
                f4 f4Var = (f4) this.f24906b;
                Pair pair = (Pair) obj;
                if (pair != null) {
                    f4Var.f23941a.put((Long) pair.first, (Bitmap) pair.second);
                    return;
                } else {
                    f4Var.getClass();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) this.f24906b;
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
        int i7 = this.f24905a;
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        ((mc) this.f24906b).s(exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ((nc) this.f24906b).a((String) obj);
    }

    @Override
    public void run(long j3) {
        g0.g3(new nd((az) this.f24906b, j3, 2));
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.f24906b;
        if (z10) {
            if (!TextUtils.isEmpty(musicPlayerService.f22858n)) {
                fj fjVar = MediaController.B().f22838v0;
                if (fjVar != null) {
                    musicPlayerService.a(fjVar, true);
                }
                musicPlayerService.f22858n = null;
                return;
            }
            return;
        }
        boolean z13 = MusicPlayerService.f22851s;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i7 = this.f24905a;
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run() {
        Utilities.d.c(new t8((x8) this.f24906b, 3));
    }

    @Override
    public void h(float f10) {
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }
}
