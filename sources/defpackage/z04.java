package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class z04 extends fr3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final b14 S;

    public z04(b14 b14Var) {
        this.S = b14Var;
    }

    @Override
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        boolean z;
        boolean z2;
        int i3;
        b14 b14Var = this.S;
        o24 o24Var = b14Var.n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z3 = true;
        if (arrayList.size() > 4 && xea.o() != 0 && i86.e(16388)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (o24Var.v2 > 0 && SystemClock.elapsedRealtime() - o24Var.v2 < b14Var.A1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            for (int i4 = 0; i4 < this.P.size(); i4++) {
                x14 x14Var = (x14) this.P.get(i4);
                if (x14Var.h != 0.0f || x14Var.n != null || ((i3 = x14Var.a) > o24Var.t2 && i3 < o24Var.u2 && z2)) {
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
                x14 x14Var = (x14) arrayList.get(i);
                wl wlVar = x14Var.b;
                if (wlVar != null) {
                    ln5 ln5Var = x14Var.f[this.L];
                    nl nlVar = wlVar.k;
                    if (nlVar != null) {
                        nlVar.setAlpha(wlVar.l);
                        wlVar.k.h(canvas, ln5Var);
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
        wl wlVar;
        float f3;
        int i2;
        b14 b14Var = this.S;
        o24 o24Var = b14Var.n3;
        if (this.P != null) {
            canvas.save();
            float f4 = 0.0f;
            canvas.translate(-this.O, 0.0f);
            int i3 = 0;
            float f5 = f;
            while (i3 < this.P.size()) {
                x14 x14Var = (x14) this.P.get(i3);
                if (x14Var.getSpan() == null || (wlVar = (wl) o24Var.e2.get(x14Var.d.getDocumentId())) == null) {
                    i = i3;
                    f2 = f4;
                } else {
                    int height = (int) (x14Var.getHeight() * 0.03f);
                    Rect rect = hl.Q;
                    rect.set(x14Var.getPaddingLeft() + x14Var.getLeft(), height, x14Var.getRight() - x14Var.getPaddingRight(), ((x14Var.getMeasuredHeight() + height) - x14Var.getPaddingBottom()) - x14Var.getPaddingTop());
                    float f6 = x14Var.h;
                    if (f6 != f4) {
                        f3 = (((1.0f - f6) * 0.2f) + 0.8f) * 1.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    if (o24Var.v2 > 0) {
                        i = i3;
                        if (SystemClock.elapsedRealtime() - o24Var.v2 < b14Var.A1() && o24Var.t2 >= 0 && o24Var.u2 >= 0 && o24Var.v2 > 0) {
                            int S = RecyclerView.S(x14Var);
                            int i4 = o24Var.t2;
                            int i5 = S - i4;
                            int i6 = o24Var.u2 - i4;
                            if (i5 >= 0 && i5 < i6) {
                                SystemClock.elapsedRealtime();
                                k43 k43Var = k43.g;
                                float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - o24Var.v2)) / ((float) Math.max(600L, Math.min(55, i2 - i4) * 40));
                                f2 = 0.0f;
                                float interpolation = k43Var.getInterpolation(ete.a(elapsedRealtime, 0.0f, 1.0f));
                                float f7 = i6;
                                float f8 = f7 / 4.0f;
                                float s = hl.s(interpolation, i5, f7, f8);
                                int i7 = i6 / 4;
                                f3 *= (this.R.getInterpolation(hl.s(interpolation, i5 + i7, i6 + i7, f8)) * 0.5f) + 0.5f;
                                f5 *= s;
                            }
                        }
                        f2 = 0.0f;
                    } else {
                        i = i3;
                        f2 = f4;
                    }
                    wlVar.setAlpha((int) (255.0f * f5));
                    wlVar.setBounds(rect);
                    wlVar.setColorFilter(o24Var.f2);
                    if (f3 != 1.0f) {
                        canvas.save();
                        canvas.scale(f3, f3, rect.centerX(), rect.centerY());
                        wlVar.draw(canvas);
                        canvas.restore();
                    } else {
                        wlVar.draw(canvas);
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
                ln5[] ln5VarArr = ((x14) arrayList.get(i)).f;
                if (ln5VarArr != null) {
                    ln5VarArr[this.L].a();
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
        wl wlVar;
        PorterDuffColorFilter porterDuffColorFilter;
        o24 o24Var = this.S.n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i = 0; i < this.P.size(); i++) {
            x14 x14Var = (x14) this.P.get(i);
            hm span = x14Var.getSpan();
            ln5[] ln5VarArr = x14Var.f;
            if (span != null && (wlVar = (wl) o24Var.e2.get(x14Var.d.getDocumentId())) != null && wlVar.k != null) {
                wlVar.s(j);
                nl nlVar = wlVar.k;
                int i2 = this.L;
                ln5 Q = nlVar.Q(ln5VarArr[i2], i2);
                ln5VarArr[i2] = Q;
                Q.c = j;
                Q.b = 1.0f;
                wlVar.setAlpha(255);
                int height = (int) (x14Var.getHeight() * 0.03f);
                Rect rect = hl.Q;
                rect.set((x14Var.getPaddingLeft() + x14Var.getLeft()) - this.O, height, (x14Var.getRight() - x14Var.getPaddingRight()) - this.O, ((x14Var.getMeasuredHeight() + height) - x14Var.getPaddingTop()) - x14Var.getPaddingBottom());
                ln5VarArr[i2].b(rect);
                x14Var.b = wlVar;
                ln5 ln5Var = ln5VarArr[i2];
                if (wlVar.c()) {
                    porterDuffColorFilter = o24Var.f2;
                } else {
                    porterDuffColorFilter = null;
                }
                ln5Var.z = porterDuffColorFilter;
                arrayList.add(x14Var);
            }
        }
    }
}
