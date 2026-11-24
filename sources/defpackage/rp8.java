package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class rp8 extends kh2 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public be0 g;
    public final sp8 h;

    public rp8(sp8 sp8Var, Context context, xm8 xm8Var) {
        this.h = sp8Var;
        this.e = context;
        this.g = xm8Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(gec gecVar, Object obj) {
        pp8 pp8Var = (pp8) obj;
        View view = pp8Var.b;
        if (view != null) {
            gecVar.removeView(view);
        }
        if (pp8Var.a) {
            return;
        }
        np8 np8Var = pp8Var.c;
        if (np8Var.getImageReceiver().n0 != null) {
            Drawable t = np8Var.getImageReceiver().t();
            if (t instanceof km) {
                ((km) t).w(np8Var);
            }
        }
        np8Var.setRoundRadius(0);
        gecVar.removeView(np8Var);
        np8Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((pp8) obj);
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
    public final java.lang.Object e(defpackage.gec r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp8.e(gec, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        pp8 pp8Var = (pp8) obj;
        if (pp8Var.a) {
            if (view == pp8Var.b) {
                return true;
            }
            return false;
        } else if (view == pp8Var.c) {
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
                ((be0) arrayList.get(i)).getImageReceiver().c();
            }
            i++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        sp8 sp8Var = this.h;
        int size2 = sp8Var.Y0.size();
        if (sp8Var.j1) {
            size2++;
        }
        w97 w97Var = sp8Var.T0;
        if (w97Var == null) {
            size = 0;
        } else {
            size = w97Var.b.size();
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
        sp8 sp8Var = this.h;
        int size = sp8Var.Y0.size();
        if (sp8Var.j1) {
            size++;
        }
        if (size >= 2) {
            return sp8Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
