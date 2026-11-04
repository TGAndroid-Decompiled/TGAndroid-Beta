package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.WriteToSocketDelegate;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.ra1;
public final class p1 implements ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, gi.d7, ec, RequestTimeDelegate, lm0, org.telegram.ui.ActionBar.p1 {
    public final int f24684a;
    public final Object f24685b;

    public p1(Object obj, int i3) {
        this.f24684a = i3;
        this.f24685b = obj;
    }

    @Override
    public void c(float f10) {
        zi ziVar = ((vt) this.f24685b).X;
        if (ziVar == null) {
            return;
        }
        ziVar.f26828b0 = f10;
        MediaController.B().i0(ziVar, f10);
    }

    @Override
    public Bitmap f(BitmapFactory.Options options) {
        ye yeVar = (ye) this.f24685b;
        String str = yeVar.f25315i;
        if (str == null) {
            str = yeVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ((org.telegram.ui.wm) this.f24685b).presentFragment(new ra1(6, null));
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.f24685b;
        if (z10) {
            if (!TextUtils.isEmpty(musicPlayerService.f21368r)) {
                zi ziVar = MediaController.B().f21348v0;
                if (ziVar != null) {
                    musicPlayerService.a(ziVar, true);
                }
                musicPlayerService.f21368r = null;
                return;
            }
            return;
        }
        boolean z13 = MusicPlayerService.f21361w;
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f24684a) {
            case 1:
                d4 d4Var = (d4) this.f24685b;
                Pair pair = (Pair) obj;
                if (pair != null) {
                    d4Var.f22140a.put((Long) pair.first, (Bitmap) pair.second);
                    return;
                } else {
                    d4Var.getClass();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.f24685b;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    n3Var.a(new hg.a(bitmap, 0, null));
                    return;
                } else {
                    n3Var.a(null);
                    return;
                }
        }
    }

    @Override
    public void onError(Throwable th2) {
        int i3 = this.f24684a;
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        ((ic) this.f24685b).s(exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ((jc) this.f24685b).a((String) obj);
    }

    @Override
    public void run(long j10) {
        g0.h3(new id((zy) this.f24685b, j10, 1));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i3 = this.f24684a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run() {
        Utilities.d.c(new u8((y8) this.f24685b, 3));
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    @Override
    public void d(float f10) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }
}
