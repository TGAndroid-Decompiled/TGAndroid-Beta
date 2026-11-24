package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.d;
public class p1c extends fx0 {
    public final int l1;
    public final GradientDrawable m1;
    public final d2c n1;
    public int o1;

    public p1c(Context context, d dVar, d2c d2cVar, wjb wjbVar) {
        super(1, wjbVar, context, true);
        this.l1 = gl.L(12.0f);
        this.m1 = new GradientDrawable();
        o1c o1cVar = new o1c(this, context);
        o1cVar.addView(d2cVar, nme.c(-1.0f, -1));
        this.b = o1cVar;
        this.n1 = d2cVar;
        d2cVar.setParentFragment(dVar);
        d2cVar.setOnScrollListener(new m1c(this));
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.yj));
        hashSet.add(Integer.valueOf(bkb.g5));
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final ArrayList S() {
        ArrayList arrayList = new ArrayList();
        d2c d2cVar = this.n1;
        Objects.requireNonNull(d2cVar);
        t00 t00Var = new t00(d2cVar, (byte) 24);
        s1c s1cVar = d2cVar.h;
        arrayList.add(new blb(s1cVar.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.N5));
        arrayList.add(new blb(s1cVar.b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.P5));
        c2c c2cVar = d2cVar.s;
        t1c t1cVar = d2cVar.n;
        c2cVar.getClass();
        m84.a(arrayList, t00Var);
        arrayList.add(new blb(t1cVar, 4, new Class[]{j84.class}, new String[]{"delButton"}, (Drawable[]) null, (alb) null, bkb.Hi));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.Di));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.Gi));
        c1b c1bVar = d2cVar.w;
        c1bVar.getClass();
        m84.a(arrayList, t00Var);
        int i = bkb.Kf;
        arrayList.add(new blb(t1cVar, 4, new Class[]{vza.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(t1cVar, 4, new Class[]{vza.class}, new String[]{"urlTextView"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(t1cVar, 8, new Class[]{vza.class}, new String[]{"buttonView"}, (Drawable[]) null, (alb) null, bkb.Mf));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.Lf));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, i));
        ImageView imageView = c1bVar.M;
        int i2 = bkb.Cf;
        arrayList.add(new blb(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(c1bVar.N, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(d2cVar.f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.U5));
        arrayList.add(new blb(d2cVar.x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g5));
        return arrayList;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        d2c d2cVar = this.n1;
        kk7 f = kk7.f(d2cVar.a);
        f.n(d2cVar, kk7.w0);
        f.n(d2cVar, kk7.y0);
        kk7.e().k(kk7.j1, 2);
    }

    @Override
    public final void r0(boolean z) {
        this.r0 = true;
    }

    @Override
    public final void show() {
        super.show();
        kk7.e().k(kk7.i1, 2);
    }
}
