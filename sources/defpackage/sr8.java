package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class sr8 extends yi2 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public bf0 g;
    public final tr8 h;

    public sr8(tr8 tr8Var, Context context, yo8 yo8Var) {
        this.h = tr8Var;
        this.e = context;
        this.g = yo8Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(ggc ggcVar, Object obj) {
        qr8 qr8Var = (qr8) obj;
        View view = qr8Var.b;
        if (view != null) {
            ggcVar.removeView(view);
        }
        if (qr8Var.a) {
            return;
        }
        or8 or8Var = qr8Var.c;
        if (or8Var.getImageReceiver().n0 != null) {
            Drawable t = or8Var.getImageReceiver().t();
            if (t instanceof kn) {
                ((kn) t).w(or8Var);
            }
        }
        or8Var.setRoundRadius(0);
        ggcVar.removeView(or8Var);
        or8Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((qr8) obj);
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
    public final java.lang.Object e(defpackage.ggc r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr8.e(ggc, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        qr8 qr8Var = (qr8) obj;
        if (qr8Var.a) {
            if (view == qr8Var.b) {
                return true;
            }
            return false;
        } else if (view == qr8Var.c) {
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
                ((bf0) arrayList.get(i)).getImageReceiver().c();
            }
            i++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        tr8 tr8Var = this.h;
        int size2 = tr8Var.Y0.size();
        if (tr8Var.j1) {
            size2++;
        }
        xb7 xb7Var = tr8Var.T0;
        if (xb7Var == null) {
            size = 0;
        } else {
            size = xb7Var.b.size();
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
        tr8 tr8Var = this.h;
        int size = tr8Var.Y0.size();
        if (tr8Var.j1) {
            size++;
        }
        if (size >= 2) {
            return tr8Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
