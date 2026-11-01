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
import org.telegram.ui.Components.kn0;
import org.telegram.ui.rc1;
public final class s1 implements ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, vh.l5, nc, RequestTimeDelegate, kn0, org.telegram.ui.ActionBar.u1 {
    public final int f18055a;
    public final Object f18056b;

    public s1(Object obj, int i10) {
        this.f18055a = i10;
        this.f18056b = obj;
    }

    @Override
    public void c(float f7) {
        kj kjVar = ((pu) this.f18056b).W;
        if (kjVar == null) {
            return;
        }
        kjVar.f16652b0 = f7;
        MediaController.B().i0(kjVar, f7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ((org.telegram.ui.un) this.f18056b).presentFragment(new rc1(6, null));
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        ff ffVar = (ff) this.f18056b;
        String str = ffVar.f14607i;
        if (str == null) {
            str = ffVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f18055a) {
            case 1:
                g4 g4Var = (g4) this.f18056b;
                Pair pair = (Pair) obj;
                if (pair != null) {
                    g4Var.f15855a.put((Long) pair.first, (Bitmap) pair.second);
                    return;
                } else {
                    g4Var.getClass();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.v3 v3Var = (org.telegram.ui.ActionBar.v3) this.f18056b;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    v3Var.a(new wf.a(bitmap, 0, null));
                    return;
                } else {
                    v3Var.a(null);
                    return;
                }
        }
    }

    @Override
    public void onError(Throwable th2) {
        int i10 = this.f18055a;
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        ((qc) this.f18056b).p(exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ((rc) this.f18056b).a((String) obj);
    }

    @Override
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.f18056b;
        if (z10) {
            if (!TextUtils.isEmpty(musicPlayerService.f14504r)) {
                kj kjVar = MediaController.B().f14483u0;
                if (kjVar != null) {
                    musicPlayerService.a(kjVar, true);
                }
                musicPlayerService.f14504r = null;
                return;
            }
            return;
        }
        boolean z13 = MusicPlayerService.f14498w;
    }

    @Override
    public void run(long j10) {
        i0.g3(new ld((tz) this.f18056b, j10, 1));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i10 = this.f18055a;
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run() {
        Utilities.d.c(new z8((d9) this.f18056b, 3));
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void s(int i10, Drawable drawable) {
    }
}
