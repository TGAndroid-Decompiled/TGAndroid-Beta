package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;
public final class cy3 extends fr3 {
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final dy3 Q;

    public cy3(dy3 dy3Var) {
        this.Q = dy3Var;
    }

    @Override
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        boolean z;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z2 = true;
        if (arrayList.size() > 3 && xea.o() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            for (int i3 = 0; i3 < this.O.size(); i3++) {
                ey3 ey3Var = (ey3) this.O.get(i3);
                if (ey3Var.e != 0.0f || ey3Var.d != null || ey3Var.getTranslationX() != 0.0f || ey3Var.getTranslationY() != 0.0f || ey3Var.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z2 = z;
        if (z2) {
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
            ArrayList arrayList = this.P;
            if (i < arrayList.size()) {
                ey3 ey3Var = (ey3) arrayList.get(i);
                ey3Var.b.h(canvas, ey3Var.a[this.L]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f) {
        wl wlVar;
        if (this.O != null) {
            for (int i = 0; i < this.O.size(); i++) {
                ey3 ey3Var = (ey3) this.O.get(i);
                hm hmVar = ey3Var.c;
                if (hmVar != null && (wlVar = (wl) this.Q.E.l1.get(hmVar.getDocumentId())) != null && wlVar.k != null && ey3Var.b != null) {
                    wlVar.setAlpha((int) (ey3Var.getAlpha() * 255.0f * f));
                    float width = ((ey3Var.getWidth() - ey3Var.getPaddingLeft()) - ey3Var.getPaddingRight()) / 2.0f;
                    float height = ((ey3Var.getHeight() - ey3Var.getPaddingTop()) - ey3Var.getPaddingBottom()) / 2.0f;
                    float right = (ey3Var.getRight() + ey3Var.getLeft()) / 2.0f;
                    float paddingTop = ey3Var.getPaddingTop() + height;
                    float f2 = ey3Var.e;
                    float f3 = 1.0f;
                    if (f2 != 0.0f) {
                        f3 = 1.0f * (((1.0f - f2) * 0.2f) + 0.8f);
                    }
                    wlVar.setBounds((int) (right - ((ey3Var.getScaleX() * width) * f3)), (int) (paddingTop - ((ey3Var.getScaleY() * height) * f3)), (int) ((ey3Var.getScaleX() * width * f3) + right), (int) ((ey3Var.getScaleY() * height * f3) + paddingTop));
                    wlVar.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i < arrayList.size()) {
                ((ey3) arrayList.get(i)).a[this.L].a();
                i++;
            } else {
                ly3 ly3Var = this.Q.E;
                Pattern pattern = ly3.P1;
                ly3Var.b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j) {
        wl wlVar;
        PorterDuffColorFilter porterDuffColorFilter;
        ly3 ly3Var = this.Q.E;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i = 0; i < this.O.size(); i++) {
            ey3 ey3Var = (ey3) this.O.get(i);
            hm hmVar = ey3Var.c;
            ln5[] ln5VarArr = ey3Var.a;
            if (hmVar != null && (wlVar = (wl) ly3Var.l1.get(hmVar.getDocumentId())) != null && wlVar.k != null) {
                wlVar.s(j);
                nl nlVar = wlVar.k;
                int i2 = this.L;
                ln5 Q = nlVar.Q(ln5VarArr[i2], i2);
                ln5VarArr[i2] = Q;
                Q.c = j;
                wlVar.setAlpha(255);
                Rect rect = hl.Q;
                rect.set(ey3Var.getPaddingLeft() + ey3Var.getLeft(), ey3Var.getPaddingTop(), ey3Var.getRight() - ey3Var.getPaddingRight(), ey3Var.getMeasuredHeight() - ey3Var.getPaddingBottom());
                ln5VarArr[i2].b(rect);
                int v0 = aob.v0(aob.G6, ly3Var.J0);
                if (v0 != ly3Var.O1 || (porterDuffColorFilter = ly3Var.N1) == null) {
                    ly3Var.O1 = v0;
                    porterDuffColorFilter = new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN);
                    ly3Var.N1 = porterDuffColorFilter;
                }
                wlVar.setColorFilter(porterDuffColorFilter);
                ey3Var.b = wlVar.k;
                arrayList.add(ey3Var);
            }
        }
    }
}
