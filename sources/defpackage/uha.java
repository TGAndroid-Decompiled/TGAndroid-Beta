package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class uha extends c79 {
    public final Context c;
    public final eja d;

    public uha(eja ejaVar, Context context) {
        this.d = ejaVar;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        tia[] tiaVarArr = this.d.w1;
        if (tiaVarArr[5].a.size() == 0 && !tiaVarArr[5].g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        tia[] tiaVarArr = this.d.w1;
        if (tiaVarArr[5].a.size() == 0 && !tiaVarArr[5].g) {
            return 1;
        }
        return tiaVarArr[5].a.size();
    }

    @Override
    public final long c(int i) {
        return i;
    }

    @Override
    public final int d(int i) {
        tia[] tiaVarArr = this.d.w1;
        if (tiaVarArr[5].a.size() == 0 && !tiaVarArr[5].g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        char c;
        if (f89Var.f == 12) {
            eja ejaVar = this.d;
            r47 r47Var = (r47) ejaVar.w1[5].a.get(i);
            TLRPC.Document F0 = r47Var.F0();
            if (F0 != null) {
                View view = f89Var.a;
                if (view instanceof vw2) {
                    vw2 vw2Var = (vw2) view;
                    vw2Var.d(r47Var.k.date, r47Var, F0);
                    boolean z = false;
                    if (ejaVar.F1) {
                        SparseArray[] sparseArrayArr = ejaVar.c1;
                        if (r47.B0(r47Var.k) == ejaVar.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                            z = true;
                        }
                        vw2Var.c(z, !ejaVar.e1);
                        return;
                    }
                    vw2Var.c(false, !ejaVar.e1);
                }
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        eja ejaVar = this.d;
        vnb vnbVar = ejaVar.I1;
        Context context = this.c;
        if (i == 11) {
            ci G = eja.G(5, ejaVar.m1, vnbVar, context);
            G.setLayoutParams(new r79(-1, -1));
            return new f89(G);
        }
        vw2 vw2Var = new vw2(vnbVar, context, true);
        vw2Var.setCanPreviewGif(true);
        return new f89(vw2Var);
    }

    @Override
    public final void y(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof vw2) {
            ImageReceiver photoImage = ((vw2) view).getPhotoImage();
            if (this.d.n0[0].F == 5) {
                photoImage.u0 = true;
                photoImage.w0(false);
                return;
            }
            photoImage.u0 = false;
            photoImage.x0();
        }
    }
}
