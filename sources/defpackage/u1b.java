package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u1b extends Drawable {
    public final int a;
    public final int b;
    public final vm[] c;
    public final boolean e;
    public int d = 255;
    public final RectF f = new RectF();
    public boolean g = false;

    public u1b(int i, ArrayList arrayList, boolean z) {
        int i2;
        this.e = z;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.a = max;
        int min = Math.min(max * max, arrayList.size());
        this.b = min;
        this.c = new vm[min];
        if (!arrayList.isEmpty()) {
            k47.H2((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < this.b; i3++) {
            this.c[i3] = vm.l(i, i2, (TLRPC.Document) arrayList.get(i3));
        }
    }

    public final void a(rc2 rc2Var) {
        for (int i = 0; i < this.b; i++) {
            this.c[i].o(rc2Var);
        }
    }

    public final boolean b(ArrayList arrayList) {
        long j;
        vm[] vmVarArr = this.c;
        if (vmVarArr.length == arrayList.size()) {
            for (int i = 0; i < vmVarArr.length; i++) {
                TLRPC.Document document = vmVarArr[i].e;
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
        vm vmVar;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (gm.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (gm.L(48.0f) / 2.0f);
        int L = gm.L(48.0f);
        int i = this.a;
        float f = L / i;
        float L2 = gm.L(48.0f) / i;
        canvas.save();
        canvas.clipRect(centerX, centerY, gm.L(48.0f) + centerX, gm.L(48.0f) + centerY);
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (i2 * i) + i3;
                if (i4 >= 0) {
                    vm[] vmVarArr = this.c;
                    if (i4 < vmVarArr.length && (vmVar = vmVarArr[i4]) != null) {
                        vmVar.setBounds((int) ((i3 * f) + centerX), (int) ((i2 * L2) + centerY), (int) (((i3 + 1) * f) + centerX), (int) (((i2 + 1) * L2) + centerY));
                        vmVarArr[i4].setAlpha(this.d);
                        vm vmVar2 = vmVarArr[i4];
                        if (this.e) {
                            porterDuffColorFilter = cmb.v3;
                        } else {
                            porterDuffColorFilter = cmb.u3;
                        }
                        vmVar2.setColorFilter(porterDuffColorFilter);
                        vmVarArr[i4].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(48.0f);
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
