package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class e04 extends oq3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final g04 S;

    public e04(g04 g04Var) {
        this.S = g04Var;
    }

    @Override
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        boolean z;
        boolean z2;
        int i3;
        g04 g04Var = this.S;
        t14 t14Var = g04Var.n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z3 = true;
        if (arrayList.size() > 4 && gba.o() != 0 && e66.e(16388)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (t14Var.v2 > 0 && SystemClock.elapsedRealtime() - t14Var.v2 < g04Var.z1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            for (int i4 = 0; i4 < this.P.size(); i4++) {
                c14 c14Var = (c14) this.P.get(i4);
                if (c14Var.h != 0.0f || c14Var.n != null || ((i3 = c14Var.a) > t14Var.t2 && i3 < t14Var.u2 && z2)) {
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
                c14 c14Var = (c14) arrayList.get(i);
                vl vlVar = c14Var.b;
                if (vlVar != null) {
                    il5 il5Var = c14Var.f[this.L];
                    ml mlVar = vlVar.k;
                    if (mlVar != null) {
                        mlVar.setAlpha(vlVar.l);
                        vlVar.k.h(canvas, il5Var);
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
        vl vlVar;
        float f3;
        int i2;
        g04 g04Var = this.S;
        t14 t14Var = g04Var.n3;
        if (this.P != null) {
            canvas.save();
            float f4 = 0.0f;
            canvas.translate(-this.O, 0.0f);
            int i3 = 0;
            float f5 = f;
            while (i3 < this.P.size()) {
                c14 c14Var = (c14) this.P.get(i3);
                if (c14Var.getSpan() == null || (vlVar = (vl) t14Var.e2.get(c14Var.d.getDocumentId())) == null) {
                    i = i3;
                    f2 = f4;
                } else {
                    int height = (int) (c14Var.getHeight() * 0.03f);
                    Rect rect = gl.Q;
                    rect.set(c14Var.getPaddingLeft() + c14Var.getLeft(), height, c14Var.getRight() - c14Var.getPaddingRight(), ((c14Var.getMeasuredHeight() + height) - c14Var.getPaddingBottom()) - c14Var.getPaddingTop());
                    float f6 = c14Var.h;
                    if (f6 != f4) {
                        f3 = (((1.0f - f6) * 0.2f) + 0.8f) * 1.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    if (t14Var.v2 > 0) {
                        i = i3;
                        if (SystemClock.elapsedRealtime() - t14Var.v2 < g04Var.z1() && t14Var.t2 >= 0 && t14Var.u2 >= 0 && t14Var.v2 > 0) {
                            int R = RecyclerView.R(c14Var);
                            int i4 = t14Var.t2;
                            int i5 = R - i4;
                            int i6 = t14Var.u2 - i4;
                            if (i5 >= 0 && i5 < i6) {
                                SystemClock.elapsedRealtime();
                                s33 s33Var = s33.g;
                                float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - t14Var.v2)) / ((float) Math.max(600L, Math.min(55, i2 - i4) * 40));
                                f2 = 0.0f;
                                float interpolation = s33Var.getInterpolation(moe.a(elapsedRealtime, 0.0f, 1.0f));
                                float f7 = i6;
                                float f8 = f7 / 4.0f;
                                float s = gl.s(interpolation, i5, f7, f8);
                                int i7 = i6 / 4;
                                f3 *= (this.R.getInterpolation(gl.s(interpolation, i5 + i7, i6 + i7, f8)) * 0.5f) + 0.5f;
                                f5 *= s;
                            }
                        }
                        f2 = 0.0f;
                    } else {
                        i = i3;
                        f2 = f4;
                    }
                    vlVar.setAlpha((int) (255.0f * f5));
                    vlVar.setBounds(rect);
                    vlVar.setColorFilter(t14Var.f2);
                    if (f3 != 1.0f) {
                        canvas.save();
                        canvas.scale(f3, f3, rect.centerX(), rect.centerY());
                        vlVar.draw(canvas);
                        canvas.restore();
                    } else {
                        vlVar.draw(canvas);
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
                il5[] il5VarArr = ((c14) arrayList.get(i)).f;
                if (il5VarArr != null) {
                    il5VarArr[this.L].a();
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
        vl vlVar;
        PorterDuffColorFilter porterDuffColorFilter;
        t14 t14Var = this.S.n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i = 0; i < this.P.size(); i++) {
            c14 c14Var = (c14) this.P.get(i);
            gm span = c14Var.getSpan();
            il5[] il5VarArr = c14Var.f;
            if (span != null && (vlVar = (vl) t14Var.e2.get(c14Var.d.getDocumentId())) != null && vlVar.k != null) {
                vlVar.s(j);
                ml mlVar = vlVar.k;
                int i2 = this.L;
                il5 Q = mlVar.Q(il5VarArr[i2], i2);
                il5VarArr[i2] = Q;
                Q.c = j;
                Q.b = 1.0f;
                vlVar.setAlpha(255);
                int height = (int) (c14Var.getHeight() * 0.03f);
                Rect rect = gl.Q;
                rect.set((c14Var.getPaddingLeft() + c14Var.getLeft()) - this.O, height, (c14Var.getRight() - c14Var.getPaddingRight()) - this.O, ((c14Var.getMeasuredHeight() + height) - c14Var.getPaddingTop()) - c14Var.getPaddingBottom());
                il5VarArr[i2].b(rect);
                c14Var.b = vlVar;
                il5 il5Var = il5VarArr[i2];
                if (vlVar.c()) {
                    porterDuffColorFilter = t14Var.f2;
                } else {
                    porterDuffColorFilter = null;
                }
                il5Var.z = porterDuffColorFilter;
                arrayList.add(c14Var);
            }
        }
    }
}
