package defpackage;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class l2b extends c79 {
    public int c;
    public final t2b d;

    public l2b(t2b t2bVar) {
        this.d = t2bVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        t2b t2bVar = this.d;
        q2b[] q2bVarArr = t2bVar.g3;
        if (q2bVarArr == null) {
            length = 0;
        } else {
            length = q2bVarArr.length;
        }
        int i = length + 1;
        if (i != this.c) {
            nf9 nf9Var = t2bVar.t3;
            if (nf9Var != null) {
                nf9Var.requestLayout();
            }
            this.c = i;
        }
        return i;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        t2b t2bVar;
        q2b[] q2bVarArr;
        boolean z = true;
        if (f89Var.f == 1 && (q2bVarArr = (t2bVar = this.d).g3) != null) {
            int i2 = i - 1;
            q2b q2bVar = q2bVarArr[i2];
            final p2b p2bVar = (p2b) f89Var.a;
            if (t2bVar.u3 != i2) {
                z = false;
            }
            p2bVar.getClass();
            if (!TextUtils.isEmpty(q2bVar.d)) {
                p2bVar.setContentDescription(q2bVar.d);
            } else if (!TextUtils.isEmpty(q2bVar.a)) {
                p2bVar.setContentDescription(q2bVar.a);
            } else {
                p2bVar.setContentDescription(null);
            }
            ValueAnimator valueAnimator = p2bVar.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                p2bVar.H = null;
            }
            p2bVar.setImageResource(0);
            p2bVar.a();
            final boolean C1 = p2bVar.I.C1();
            p2bVar.x = false;
            p2bVar.E = 1.0f;
            wl.g(yac.t0).b(q2bVar.c, new tl() {
                @Override
                public final void a(TLRPC.Document document) {
                    p2b p2bVar2 = p2b.this;
                    p2bVar2.setOnlyLastFrame(!C1);
                    p2bVar2.g(24, 24, document);
                    p2bVar2.d();
                }
            });
            hl.d3(new uoa(p2bVar, (byte) 18), 60L);
            p2bVar.l(z, false);
            p2bVar.setAlpha(t2bVar.w3);
            p2bVar.setScaleX(t2bVar.w3);
            p2bVar.setScaleY(t2bVar.w3);
            p2bVar.j();
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        p2b p2bVar;
        t2b t2bVar = this.d;
        if (i == 0) {
            nf9 nf9Var = new nf9((byte) 10, t2bVar.getContext(), this);
            t2bVar.t3 = nf9Var;
            p2bVar = nf9Var;
        } else {
            p2bVar = new p2b(t2bVar, t2bVar.getContext());
        }
        return new f89(p2bVar);
    }

    @Override
    public final void y(f89 f89Var) {
        boolean z = true;
        if (f89Var.f == 1) {
            p2b p2bVar = (p2b) f89Var.a;
            if (this.d.u3 != f89Var.b() - 1) {
                z = false;
            }
            p2bVar.l(z, false);
            p2bVar.j();
        }
    }
}
