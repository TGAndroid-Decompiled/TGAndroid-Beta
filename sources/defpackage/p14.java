package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class p14 extends yr3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final r14 S;

    public p14(r14 r14Var) {
        this.S = r14Var;
    }

    @Override
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        boolean z;
        boolean z2;
        int i3;
        r14 r14Var = this.S;
        e34 e34Var = r14Var.n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z3 = true;
        if (arrayList.size() > 4 && gda.o() != 0 && e86.e(16388)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (e34Var.v2 > 0 && SystemClock.elapsedRealtime() - e34Var.v2 < r14Var.z1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            for (int i4 = 0; i4 < this.P.size(); i4++) {
                n24 n24Var = (n24) this.P.get(i4);
                if (n24Var.h != 0.0f || n24Var.n != null || ((i3 = n24Var.a) > e34Var.t2 && i3 < e34Var.u2 && z2)) {
                    break;
                }
            }
        }
        z3 = z;
        if (z3) {
            i(System.currentTimeMillis());
            d(canvas, 1.0f);
            k();
            return;
        }
        super.a(canvas, j, i, i2, 1.0f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i < arrayList.size()) {
                n24 n24Var = (n24) arrayList.get(i);
                vm vmVar = n24Var.b;
                if (vmVar != null) {
                    in5 in5Var = n24Var.f[this.L];
                    mm mmVar = vmVar.k;
                    if (mmVar != null) {
                        mmVar.setAlpha(vmVar.l);
                        vmVar.k.h(canvas, in5Var);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f) {
        int i;
        float f2;
        vm vmVar;
        float f3;
        int i2;
        r14 r14Var = this.S;
        e34 e34Var = r14Var.n3;
        if (this.P != null) {
            canvas.save();
            float f4 = 0.0f;
            canvas.translate(-this.O, 0.0f);
            int i3 = 0;
            float f5 = f;
            while (i3 < this.P.size()) {
                n24 n24Var = (n24) this.P.get(i3);
                if (n24Var.getSpan() == null || (vmVar = (vm) e34Var.e2.get(n24Var.d.getDocumentId())) == null) {
                    i = i3;
                    f2 = f4;
                } else {
                    int height = (int) (n24Var.getHeight() * 0.03f);
                    Rect rect = gm.Q;
                    rect.set(n24Var.getPaddingLeft() + n24Var.getLeft(), height, n24Var.getRight() - n24Var.getPaddingRight(), ((n24Var.getMeasuredHeight() + height) - n24Var.getPaddingBottom()) - n24Var.getPaddingTop());
                    float f6 = n24Var.h;
                    if (f6 != f4) {
                        f3 = (((1.0f - f6) * 0.2f) + 0.8f) * 1.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    if (e34Var.v2 > 0) {
                        i = i3;
                        if (SystemClock.elapsedRealtime() - e34Var.v2 < r14Var.z1() && e34Var.t2 >= 0 && e34Var.u2 >= 0 && e34Var.v2 > 0) {
                            int R = RecyclerView.R(n24Var);
                            int i4 = e34Var.t2;
                            int i5 = R - i4;
                            int i6 = e34Var.u2 - i4;
                            if (i5 >= 0 && i5 < i6) {
                                SystemClock.elapsedRealtime();
                                d53 d53Var = d53.g;
                                float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - e34Var.v2)) / ((float) Math.max(600L, Math.min(55, i2 - i4) * 40));
                                f2 = 0.0f;
                                float interpolation = d53Var.getInterpolation(pqe.a(elapsedRealtime, 0.0f, 1.0f));
                                float f7 = i6;
                                float f8 = f7 / 4.0f;
                                float s = gm.s(interpolation, i5, f7, f8);
                                int i7 = i6 / 4;
                                f3 *= (this.R.getInterpolation(gm.s(interpolation, i5 + i7, i6 + i7, f8)) * 0.5f) + 0.5f;
                                f5 *= s;
                            }
                        }
                        f2 = 0.0f;
                    } else {
                        i = i3;
                        f2 = f4;
                    }
                    vmVar.setAlpha((int) (255.0f * f5));
                    vmVar.setBounds(rect);
                    vmVar.setColorFilter(e34Var.f2);
                    if (f3 != 1.0f) {
                        canvas.save();
                        canvas.scale(f3, f3, rect.centerX(), rect.centerY());
                        vmVar.draw(canvas);
                        canvas.restore();
                    } else {
                        vmVar.draw(canvas);
                    }
                }
                float f9 = f2;
                i3 = i + 1;
                f4 = f9;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i < arrayList.size()) {
                in5[] in5VarArr = ((n24) arrayList.get(i)).f;
                if (in5VarArr != null) {
                    in5VarArr[this.L].a();
                }
                i++;
            } else {
                this.S.n3.Q.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j) {
        vm vmVar;
        PorterDuffColorFilter porterDuffColorFilter;
        e34 e34Var = this.S.n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i = 0; i < this.P.size(); i++) {
            n24 n24Var = (n24) this.P.get(i);
            gn span = n24Var.getSpan();
            in5[] in5VarArr = n24Var.f;
            if (span != null && (vmVar = (vm) e34Var.e2.get(n24Var.d.getDocumentId())) != null && vmVar.k != null) {
                vmVar.s(j);
                mm mmVar = vmVar.k;
                int i2 = this.L;
                in5 Q = mmVar.Q(in5VarArr[i2], i2);
                in5VarArr[i2] = Q;
                Q.c = j;
                Q.b = 1.0f;
                vmVar.setAlpha(255);
                int height = (int) (n24Var.getHeight() * 0.03f);
                Rect rect = gm.Q;
                rect.set((n24Var.getPaddingLeft() + n24Var.getLeft()) - this.O, height, (n24Var.getRight() - n24Var.getPaddingRight()) - this.O, ((n24Var.getMeasuredHeight() + height) - n24Var.getPaddingTop()) - n24Var.getPaddingBottom());
                in5VarArr[i2].b(rect);
                n24Var.b = vmVar;
                in5 in5Var = in5VarArr[i2];
                if (vmVar.c()) {
                    porterDuffColorFilter = e34Var.f2;
                } else {
                    porterDuffColorFilter = null;
                }
                in5Var.z = porterDuffColorFilter;
                arrayList.add(n24Var);
            }
        }
    }
}
