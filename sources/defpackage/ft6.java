package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
public final class ft6 extends w39 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public final gt6 r;

    public ft6(gt6 gt6Var) {
        this.r = gt6Var;
        Context context = gt6Var.n;
        this.d = LayoutInflater.from(context);
        this.e = voe.d(context, 2130968868);
        this.f = voe.d(context, 2130968877);
        this.h = voe.d(context, 2130968874);
        this.n = voe.d(context, 2130968873);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        gt6 gt6Var = this.r;
        arrayList.add(new dt6(gt6Var.n.getString(2131689641)));
        ArrayList arrayList2 = gt6Var.s;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(new dt6((eu6) obj));
        }
        f();
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final int d(int i) {
        return ((dt6) this.c.get(i)).b;
    }

    @Override
    public final void t(defpackage.s49 r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft6.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i != 1) {
            if (i == 2) {
                return new et6(this, layoutInflater.inflate(2131492934, viewGroup, false));
            }
            sdb.a();
            return null;
        }
        View inflate = layoutInflater.inflate(2131492933, viewGroup, false);
        ?? s49Var = new s49(inflate);
        s49Var.v = (TextView) inflate.findViewById(2131296568);
        return s49Var;
    }
}
