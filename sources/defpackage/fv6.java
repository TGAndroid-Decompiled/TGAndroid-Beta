package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
public final class fv6 extends y59 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public final gv6 r;

    public fv6(gv6 gv6Var) {
        this.r = gv6Var;
        Context context = gv6Var.n;
        this.d = LayoutInflater.from(context);
        this.e = yqe.d(context, 2130968868);
        this.f = yqe.d(context, 2130968877);
        this.h = yqe.d(context, 2130968874);
        this.n = yqe.d(context, 2130968873);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        gv6 gv6Var = this.r;
        arrayList.add(new dv6(gv6Var.n.getString(2131689641)));
        ArrayList arrayList2 = gv6Var.s;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(new dv6((ew6) obj));
        }
        f();
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final int d(int i) {
        return ((dv6) this.c.get(i)).b;
    }

    @Override
    public final void t(defpackage.u69 r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv6.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i != 1) {
            if (i == 2) {
                return new ev6(this, layoutInflater.inflate(2131492934, viewGroup, false));
            }
            rjb.h();
            return null;
        }
        View inflate = layoutInflater.inflate(2131492933, viewGroup, false);
        ?? u69Var = new u69(inflate);
        u69Var.v = (TextView) inflate.findViewById(2131296568);
        return u69Var;
    }
}
