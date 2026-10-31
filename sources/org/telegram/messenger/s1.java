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
import org.telegram.ui.Components.jn0;
import org.telegram.ui.tc1;
public final class s1 implements ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, vh.l5, mc, RequestTimeDelegate, jn0, org.telegram.ui.ActionBar.u1 {
    public final int f17862a;
    public final Object f17863b;

    public s1(Object obj, int i10) {
        this.f17862a = i10;
        this.f17863b = obj;
    }

    @Override
    public void c(float f7) {
        jj jjVar = ((ou) this.f17863b).W;
        if (jjVar == null) {
            return;
        }
        jjVar.f16299b0 = f7;
        MediaController.B().i0(jjVar, f7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ((org.telegram.ui.un) this.f17863b).presentFragment(new tc1(6, null));
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        ef efVar = (ef) this.f17863b;
        String str = efVar.f19511i;
        if (str == null) {
            str = efVar.I;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        MusicPlayerService musicPlayerService = (MusicPlayerService) this.f17863b;
        if (z10) {
            if (!TextUtils.isEmpty(musicPlayerService.f14503r)) {
                jj jjVar = MediaController.B().f14482u0;
                if (jjVar != null) {
                    musicPlayerService.a(jjVar, true);
                }
                musicPlayerService.f14503r = null;
                return;
            }
            return;
        }
        boolean z13 = MusicPlayerService.f14497w;
    }

    @Override
    public void onComplete(Object obj) {
        switch (this.f17862a) {
            case 1:
                g4 g4Var = (g4) this.f17863b;
                Pair pair = (Pair) obj;
                if (pair != null) {
                    g4Var.f15670a.put((Long) pair.first, (Bitmap) pair.second);
                    return;
                } else {
                    g4Var.getClass();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.v3 v3Var = (org.telegram.ui.ActionBar.v3) this.f17863b;
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
        int i10 = this.f17862a;
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void onFailure(Exception exc) {
        ((pc) this.f17863b).q(exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ((qc) this.f17863b).a((String) obj);
    }

    @Override
    public void run(long j10) {
        i0.g3(new kd((sz) this.f17863b, j10, 1));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        int i10 = this.f17862a;
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run() {
        Utilities.d.c(new z8((d9) this.f17863b, 3));
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }
}
