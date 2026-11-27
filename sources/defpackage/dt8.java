package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class dt8 extends gi2 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public de0 g;
    public final et8 h;

    public dt8(et8 et8Var, Context context, iq8 iq8Var) {
        this.h = et8Var;
        this.e = context;
        this.g = iq8Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(fic ficVar, Object obj) {
        bt8 bt8Var = (bt8) obj;
        View view = bt8Var.b;
        if (view != null) {
            ficVar.removeView(view);
        }
        if (bt8Var.a) {
            return;
        }
        zs8 zs8Var = bt8Var.c;
        if (zs8Var.getImageReceiver().n0 != null) {
            Drawable t = zs8Var.getImageReceiver().t();
            if (t instanceof lm) {
                ((lm) t).w(zs8Var);
            }
        }
        zs8Var.setRoundRadius(0);
        ficVar.removeView(zs8Var);
        zs8Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((bt8) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override
    public final CharSequence d(int i) {
        return (k(i) + 1) + "/" + this.h.getRealCount();
    }

    @Override
    public final java.lang.Object e(defpackage.fic r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt8.e(fic, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        bt8 bt8Var = (bt8) obj;
        if (bt8Var.a) {
            if (view == bt8Var.b) {
                return true;
            }
            return false;
        } else if (view == bt8Var.c) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void g() {
        ArrayList arrayList;
        int size;
        int i = 0;
        while (true) {
            arrayList = this.d;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((de0) arrayList.get(i)).getImageReceiver().c();
            }
            i++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        et8 et8Var = this.h;
        int size2 = et8Var.Y0.size();
        if (et8Var.j1) {
            size2++;
        }
        dc7 dc7Var = et8Var.T0;
        if (dc7Var == null) {
            size = 0;
        } else {
            size = dc7Var.b.size();
        }
        int max = Math.max(size, size2) + (j() << 1);
        for (int i2 = 0; i2 < max; i2++) {
            arrayList2.add(new Object());
            arrayList.add(null);
        }
        super.g();
    }

    @Override
    public final int j() {
        et8 et8Var = this.h;
        int size = et8Var.Y0.size();
        if (et8Var.j1) {
            size++;
        }
        if (size >= 2) {
            return et8Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
