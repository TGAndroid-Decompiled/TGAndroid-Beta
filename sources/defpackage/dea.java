package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class dea extends n39 {
    public final Context c;
    public final nfa d;

    public dea(nfa nfaVar, Context context) {
        this.d = nfaVar;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        cfa[] cfaVarArr = this.d.w1;
        if (cfaVarArr[5].a.size() == 0 && !cfaVarArr[5].g) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        cfa[] cfaVarArr = this.d.w1;
        if (cfaVarArr[5].a.size() == 0 && !cfaVarArr[5].g) {
            return 1;
        }
        return cfaVarArr[5].a.size();
    }

    @Override
    public final long c(int i) {
        return i;
    }

    @Override
    public final int d(int i) {
        cfa[] cfaVarArr = this.d.w1;
        if (cfaVarArr[5].a.size() == 0 && !cfaVarArr[5].g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        char c;
        if (s49Var.f == 12) {
            nfa nfaVar = this.d;
            k27 k27Var = (k27) nfaVar.w1[5].a.get(i);
            TLRPC.Document F0 = k27Var.F0();
            if (F0 != null) {
                View view = s49Var.a;
                if (view instanceof bw2) {
                    bw2 bw2Var = (bw2) view;
                    bw2Var.d(k27Var.k.date, k27Var, F0);
                    boolean z = false;
                    if (nfaVar.F1) {
                        SparseArray[] sparseArrayArr = nfaVar.c1;
                        if (k27.B0(k27Var.k) == nfaVar.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                            z = true;
                        }
                        bw2Var.c(z, !nfaVar.e1);
                        return;
                    }
                    bw2Var.c(false, !nfaVar.e1);
                }
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        nfa nfaVar = this.d;
        wjb wjbVar = nfaVar.I1;
        Context context = this.c;
        if (i == 11) {
            bi G = nfa.G(5, nfaVar.m1, wjbVar, context);
            G.setLayoutParams(new e49(-1, -1));
            return new s49(G);
        }
        bw2 bw2Var = new bw2(wjbVar, context, true);
        bw2Var.setCanPreviewGif(true);
        return new s49(bw2Var);
    }

    @Override
    public final void y(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof bw2) {
            ImageReceiver photoImage = ((bw2) view).getPhotoImage();
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
