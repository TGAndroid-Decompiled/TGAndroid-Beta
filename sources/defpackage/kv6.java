package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
public final class kv6 extends j79 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public final lv6 r;

    public kv6(lv6 lv6Var) {
        this.r = lv6Var;
        Context context = lv6Var.n;
        this.d = LayoutInflater.from(context);
        this.e = nte.d(context, 2130968868);
        this.f = nte.d(context, 2130968877);
        this.h = nte.d(context, 2130968874);
        this.n = nte.d(context, 2130968873);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        lv6 lv6Var = this.r;
        arrayList.add(new iv6(lv6Var.n.getString(2131689641)));
        ArrayList arrayList2 = lv6Var.s;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(new iv6((jw6) obj));
        }
        f();
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final int d(int i) {
        return ((iv6) this.c.get(i)).b;
    }

    @Override
    public final void t(defpackage.f89 r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv6.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i != 1) {
            if (i == 2) {
                return new jv6(this, layoutInflater.inflate(2131492934, viewGroup, false));
            }
            grb.g();
            return null;
        }
        View inflate = layoutInflater.inflate(2131492933, viewGroup, false);
        ?? f89Var = new f89(inflate);
        f89Var.v = (TextView) inflate.findViewById(2131296568);
        return f89Var;
    }
}
