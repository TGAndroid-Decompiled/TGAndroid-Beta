package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
public final class pz implements Runnable {
    public final byte a;
    public final Object b;

    public pz(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        int i;
        String str;
        byte b = this.a;
        int i2 = -1;
        Object obj = this.b;
        switch (b) {
            case 0:
                qz qzVar = (qz) obj;
                if (qzVar.c.a) {
                    qzVar.a.a.v1(3, false);
                    return;
                }
                return;
            case 1:
                ((vz) obj).l();
                return;
            case 2:
                ((i20) obj).n.r1.setVisibility(8);
                return;
            case 3:
                e86 e86Var = (e86) obj;
                e86Var.getClass();
                if (Thread.currentThread() == e86Var.a) {
                    e86Var.e(-1, new xz((byte) 3));
                    return;
                }
                return;
            case 4:
                ((a70) ((guc) obj).d).N();
                return;
            case 5:
                dc0 dc0Var = (dc0) obj;
                if (!dc0Var.x) {
                    dc0Var.x = true;
                    mu9.d(new c(dc0Var, (byte) 13));
                    return;
                }
                return;
            case 6:
                dd0 dd0Var = (dd0) obj;
                dd0Var.b.g3.O(true);
                dd0Var.Y(true);
                return;
            case 7:
                ie0 ie0Var = (ie0) obj;
                new eza(ie0Var.getContext(), ie0Var.b).show();
                return;
            case 8:
                try {
                    ((Bitmap) obj).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 9:
                wk0 wk0Var = (wk0) obj;
                wk0Var.o = true;
                wk0Var.d.invalidate();
                return;
            case 10:
                vk0 vk0Var = (vk0) obj;
                if (!vk0Var.a) {
                    wk0 wk0Var2 = vk0Var.d;
                    Bitmap[] bitmapArr = wk0Var2.g;
                    Canvas[] canvasArr = wk0Var2.h;
                    wk0Var2.g = wk0Var2.f;
                    wk0Var2.h = wk0Var2.i;
                    wk0Var2.f = bitmapArr;
                    wk0Var2.i = canvasArr;
                    wk0Var2.k = false;
                    a81 a81Var = wk0Var2.d;
                    if (a81Var != null) {
                        a81Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                tl0 tl0Var = ((yl0) obj).t;
                if (tl0Var != null) {
                    tl0Var.d();
                    return;
                }
                return;
            case 12:
                tl0 tl0Var2 = (tl0) obj;
                tl0Var2.o = (Bitmap) tl0Var2.n.c;
                tl0Var2.d();
                return;
            case 13:
                dm0 dm0Var = (dm0) obj;
                int i3 = 0;
                while (true) {
                    if (i3 < dm0Var.a.getChildCount()) {
                        View childAt = dm0Var.a.getChildAt(i3);
                        dm0Var.a.getClass();
                        i2 = RecyclerView.S(childAt);
                        if (i2 < 0) {
                            i3++;
                        } else {
                            i = childAt.getTop();
                        }
                    } else {
                        i = 0;
                    }
                }
                dm0Var.a.g3.O(true);
                wa waVar = dm0Var.a;
                if (i2 >= 0) {
                    waVar.f3.g1(i2, i);
                    return;
                } else {
                    waVar.f3.g1(0, 0);
                    return;
                }
            case 14:
                db dbVar = ((dm0) ((cm0) obj).c).f;
                if (dbVar != null) {
                    dbVar.d();
                    return;
                }
                return;
            case 15:
                ((tn0) obj).a(null);
                return;
            case 16:
                ((wn0) obj).a(null);
                return;
            case 17:
                ((v35) obj).a(Collections.EMPTY_LIST);
                return;
            case 18:
                ((ip0) obj).invalidateSelf();
                return;
            case 19:
                ((jp0) obj).invalidateSelf();
                return;
            case 20:
                ((lp0) obj).d();
                return;
            case 21:
                yp0 yp0Var = (yp0) obj;
                hl.r(yp0Var.b0);
                yp0Var.N = false;
                yp0Var.invalidate();
                return;
            case 22:
                ((xp0) obj).invalidateSelf();
                return;
            case 23:
                gr0 gr0Var = (gr0) obj;
                bga bgaVar = gr0Var.a0;
                o5b o5bVar = gr0Var.a;
                if (o5bVar == null) {
                    str = "";
                } else {
                    str = o5bVar.E;
                }
                bgaVar.a(str);
                return;
            case 24:
                ((sr0) obj).e();
                return;
            case 25:
            case 26:
                ((tr0) obj).c();
                return;
            case 27:
                ((ur0) obj).a();
                return;
            case 28:
                ((vr0) obj).a();
                return;
            default:
                zs0 zs0Var = (zs0) obj;
                if (zs0Var.isAttachedToWindow() && !zs0Var.c.canScrollVertically(1)) {
                    zs0Var.a();
                    return;
                }
                return;
        }
    }
}
