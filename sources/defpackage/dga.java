package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class dga extends q59 {
    public final Context c;
    public final nha d;

    public dga(nha nhaVar, Context context) {
        this.d = nhaVar;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        cha[] chaVarArr = this.d.w1;
        if (chaVarArr[5].a.size() == 0 && !chaVarArr[5].g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        cha[] chaVarArr = this.d.w1;
        if (chaVarArr[5].a.size() == 0 && !chaVarArr[5].g) {
            return 1;
        }
        return chaVarArr[5].a.size();
    }

    @Override
    public final long c(int i) {
        return i;
    }

    @Override
    public final int d(int i) {
        cha[] chaVarArr = this.d.w1;
        if (chaVarArr[5].a.size() == 0 && !chaVarArr[5].g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        char c;
        if (u69Var.f == 12) {
            nha nhaVar = this.d;
            k47 k47Var = (k47) nhaVar.w1[5].a.get(i);
            TLRPC.Document F0 = k47Var.F0();
            if (F0 != null) {
                View view = u69Var.a;
                if (view instanceof lx2) {
                    lx2 lx2Var = (lx2) view;
                    lx2Var.d(k47Var.k.date, k47Var, F0);
                    boolean z = false;
                    if (nhaVar.F1) {
                        SparseArray[] sparseArrayArr = nhaVar.c1;
                        if (k47.B0(k47Var.k) == nhaVar.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                            z = true;
                        }
                        lx2Var.c(z, !nhaVar.e1);
                        return;
                    }
                    lx2Var.c(false, !nhaVar.e1);
                }
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        nha nhaVar = this.d;
        ylb ylbVar = nhaVar.I1;
        Context context = this.c;
        if (i == 11) {
            bj G = nha.G(5, nhaVar.m1, ylbVar, context);
            G.setLayoutParams(new g69(-1, -1));
            return new u69(G);
        }
        lx2 lx2Var = new lx2(ylbVar, context, true);
        lx2Var.setCanPreviewGif(true);
        return new u69(lx2Var);
    }

    @Override
    public final void y(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof lx2) {
            ImageReceiver photoImage = ((lx2) view).getPhotoImage();
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
