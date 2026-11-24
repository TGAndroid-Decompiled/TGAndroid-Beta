package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tza extends Drawable {
    public final int a;
    public final int b;
    public final vl[] c;
    public final boolean e;
    public int d = 255;
    public final RectF f = new RectF();
    public boolean g = false;

    public tza(int i, ArrayList arrayList, boolean z) {
        int i2;
        this.e = z;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.a = max;
        int min = Math.min(max * max, arrayList.size());
        this.b = min;
        this.c = new vl[min];
        if (!arrayList.isEmpty()) {
            k27.H2((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < this.b; i3++) {
            this.c[i3] = vl.l(i, i2, (TLRPC.Document) arrayList.get(i3));
        }
    }

    public final void a(gb2 gb2Var) {
        for (int i = 0; i < this.b; i++) {
            this.c[i].o(gb2Var);
        }
    }

    public final boolean b(ArrayList arrayList) {
        long j;
        vl[] vlVarArr = this.c;
        if (vlVarArr.length == arrayList.size()) {
            for (int i = 0; i < vlVarArr.length; i++) {
                TLRPC.Document document = vlVarArr[i].e;
                if (document == null) {
                    j = 0;
                } else {
                    j = document.id;
                }
                if (j == ((TLRPC.Document) arrayList.get(i)).id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void c() {
        this.g = false;
    }

    public final void d() {
        this.g = true;
    }

    @Override
    public final void draw(Canvas canvas) {
        vl vlVar;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (gl.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (gl.L(48.0f) / 2.0f);
        int L = gl.L(48.0f);
        int i = this.a;
        float f = L / i;
        float L2 = gl.L(48.0f) / i;
        canvas.save();
        canvas.clipRect(centerX, centerY, gl.L(48.0f) + centerX, gl.L(48.0f) + centerY);
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (i2 * i) + i3;
                if (i4 >= 0) {
                    vl[] vlVarArr = this.c;
                    if (i4 < vlVarArr.length && (vlVar = vlVarArr[i4]) != null) {
                        vlVar.setBounds((int) ((i3 * f) + centerX), (int) ((i2 * L2) + centerY), (int) (((i3 + 1) * f) + centerX), (int) (((i2 + 1) * L2) + centerY));
                        vlVarArr[i4].setAlpha(this.d);
                        vl vlVar2 = vlVarArr[i4];
                        if (this.e) {
                            porterDuffColorFilter = bkb.v3;
                        } else {
                            porterDuffColorFilter = bkb.u3;
                        }
                        vlVar2.setColorFilter(porterDuffColorFilter);
                        vlVarArr[i4].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return gl.L(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gl.L(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.d = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
