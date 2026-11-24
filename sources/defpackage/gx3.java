package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;
public final class gx3 extends oq3 {
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final hx3 Q;

    public gx3(hx3 hx3Var) {
        this.Q = hx3Var;
    }

    @Override
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        boolean z;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z2 = true;
        if (arrayList.size() > 3 && gba.o() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            for (int i3 = 0; i3 < this.O.size(); i3++) {
                ix3 ix3Var = (ix3) this.O.get(i3);
                if (ix3Var.e != 0.0f || ix3Var.d != null || ix3Var.getTranslationX() != 0.0f || ix3Var.getTranslationY() != 0.0f || ix3Var.getAlpha() != 1.0f) {
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
                ix3 ix3Var = (ix3) arrayList.get(i);
                ix3Var.b.h(canvas, ix3Var.a[this.L]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f) {
        vl vlVar;
        if (this.O != null) {
            for (int i = 0; i < this.O.size(); i++) {
                ix3 ix3Var = (ix3) this.O.get(i);
                gm gmVar = ix3Var.c;
                if (gmVar != null && (vlVar = (vl) this.Q.E.l1.get(gmVar.getDocumentId())) != null && vlVar.k != null && ix3Var.b != null) {
                    vlVar.setAlpha((int) (ix3Var.getAlpha() * 255.0f * f));
                    float width = ((ix3Var.getWidth() - ix3Var.getPaddingLeft()) - ix3Var.getPaddingRight()) / 2.0f;
                    float height = ((ix3Var.getHeight() - ix3Var.getPaddingTop()) - ix3Var.getPaddingBottom()) / 2.0f;
                    float right = (ix3Var.getRight() + ix3Var.getLeft()) / 2.0f;
                    float paddingTop = ix3Var.getPaddingTop() + height;
                    float f2 = ix3Var.e;
                    float f3 = 1.0f;
                    if (f2 != 0.0f) {
                        f3 = 1.0f * (((1.0f - f2) * 0.2f) + 0.8f);
                    }
                    vlVar.setBounds((int) (right - ((ix3Var.getScaleX() * width) * f3)), (int) (paddingTop - ((ix3Var.getScaleY() * height) * f3)), (int) ((ix3Var.getScaleX() * width * f3) + right), (int) ((ix3Var.getScaleY() * height * f3) + paddingTop));
                    vlVar.draw(canvas);
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
                ((ix3) arrayList.get(i)).a[this.L].a();
                i++;
            } else {
                qx3 qx3Var = this.Q.E;
                Pattern pattern = qx3.P1;
                qx3Var.b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j) {
        vl vlVar;
        PorterDuffColorFilter porterDuffColorFilter;
        qx3 qx3Var = this.Q.E;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i = 0; i < this.O.size(); i++) {
            ix3 ix3Var = (ix3) this.O.get(i);
            gm gmVar = ix3Var.c;
            il5[] il5VarArr = ix3Var.a;
            if (gmVar != null && (vlVar = (vl) qx3Var.l1.get(gmVar.getDocumentId())) != null && vlVar.k != null) {
                vlVar.s(j);
                ml mlVar = vlVar.k;
                int i2 = this.L;
                il5 Q = mlVar.Q(il5VarArr[i2], i2);
                il5VarArr[i2] = Q;
                Q.c = j;
                vlVar.setAlpha(255);
                Rect rect = gl.Q;
                rect.set(ix3Var.getPaddingLeft() + ix3Var.getLeft(), ix3Var.getPaddingTop(), ix3Var.getRight() - ix3Var.getPaddingRight(), ix3Var.getMeasuredHeight() - ix3Var.getPaddingBottom());
                il5VarArr[i2].b(rect);
                int v0 = bkb.v0(bkb.F6, qx3Var.J0);
                if (v0 != qx3Var.O1 || (porterDuffColorFilter = qx3Var.N1) == null) {
                    qx3Var.O1 = v0;
                    porterDuffColorFilter = new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN);
                    qx3Var.N1 = porterDuffColorFilter;
                }
                vlVar.setColorFilter(porterDuffColorFilter);
                ix3Var.b = vlVar.k;
                arrayList.add(ix3Var);
            }
        }
    }
}
