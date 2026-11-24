package defpackage;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class lya extends n39 {
    public int c;
    public final tya d;

    public lya(tya tyaVar) {
        this.d = tyaVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        tya tyaVar = this.d;
        qya[] qyaVarArr = tyaVar.g3;
        if (qyaVarArr == null) {
            length = 0;
        } else {
            length = qyaVarArr.length;
        }
        int i = length + 1;
        if (i != this.c) {
            si9 si9Var = tyaVar.t3;
            if (si9Var != null) {
                si9Var.requestLayout();
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
    public final void t(s49 s49Var, int i) {
        tya tyaVar;
        qya[] qyaVarArr;
        boolean z;
        if (s49Var.f == 1 && (qyaVarArr = (tyaVar = this.d).g3) != null) {
            int i2 = i - 1;
            qya qyaVar = qyaVarArr[i2];
            final pya pyaVar = (pya) s49Var.a;
            if (tyaVar.u3 == i2) {
                z = true;
            } else {
                z = false;
            }
            pyaVar.getClass();
            if (!TextUtils.isEmpty(qyaVar.d)) {
                pyaVar.setContentDescription(qyaVar.d);
            } else if (!TextUtils.isEmpty(qyaVar.a)) {
                pyaVar.setContentDescription(qyaVar.a);
            } else {
                pyaVar.setContentDescription(null);
            }
            ValueAnimator valueAnimator = pyaVar.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                pyaVar.H = null;
            }
            pyaVar.setImageResource(0);
            pyaVar.a();
            final boolean B1 = pyaVar.I.B1();
            pyaVar.x = false;
            pyaVar.E = 1.0f;
            vl.g(y6c.t0).b(qyaVar.c, new sl() {
                @Override
                public final void a(TLRPC.Document document) {
                    pya pyaVar2 = pya.this;
                    pyaVar2.setOnlyLastFrame(!B1);
                    pyaVar2.g(24, 24, document);
                    pyaVar2.d();
                }
            });
            gl.d3(new kya(pyaVar, (byte) 1), 60L);
            pyaVar.l(z, false);
            pyaVar.setAlpha(tyaVar.w3);
            pyaVar.setScaleX(tyaVar.w3);
            pyaVar.setScaleY(tyaVar.w3);
            pyaVar.j();
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        pya pyaVar;
        tya tyaVar = this.d;
        if (i == 0) {
            si9 si9Var = new si9((byte) 9, tyaVar.getContext(), this);
            tyaVar.t3 = si9Var;
            pyaVar = si9Var;
        } else {
            pyaVar = new pya(tyaVar, tyaVar.getContext());
        }
        return new s49(pyaVar);
    }

    @Override
    public final void y(s49 s49Var) {
        boolean z = true;
        if (s49Var.f == 1) {
            pya pyaVar = (pya) s49Var.a;
            if (this.d.u3 != s49Var.b() - 1) {
                z = false;
            }
            pyaVar.l(z, false);
            pyaVar.j();
        }
    }
}
