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
public class p3c extends my0 {
    public final int l1;
    public final GradientDrawable m1;
    public final d4c n1;
    public int o1;

    public p3c(Context context, d dVar, d4c d4cVar, ylb ylbVar) {
        super(1, ylbVar, context, true);
        this.l1 = gm.L(12.0f);
        this.m1 = new GradientDrawable();
        o3c o3cVar = new o3c(this, context);
        o3cVar.addView(d4cVar, qoe.c(-1.0f, -1));
        this.b = o3cVar;
        this.n1 = d4cVar;
        d4cVar.setParentFragment(dVar);
        d4cVar.setOnScrollListener(new m3c(this));
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final ArrayList R() {
        ArrayList arrayList = new ArrayList();
        d4c d4cVar = this.n1;
        Objects.requireNonNull(d4cVar);
        t10 t10Var = new t10(d4cVar, (byte) 24);
        s3c s3cVar = d4cVar.h;
        arrayList.add(new cnb(s3cVar.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.N5));
        arrayList.add(new cnb(s3cVar.b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.P5));
        c4c c4cVar = d4cVar.s;
        t3c t3cVar = d4cVar.n;
        c4cVar.getClass();
        v94.a(arrayList, t10Var);
        arrayList.add(new cnb(t3cVar, 4, new Class[]{s94.class}, new String[]{"delButton"}, (Drawable[]) null, (bnb) null, cmb.Hi));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.Di));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.Gi));
        e3b e3bVar = d4cVar.w;
        e3bVar.getClass();
        v94.a(arrayList, t10Var);
        int i = cmb.Kf;
        arrayList.add(new cnb(t3cVar, 4, new Class[]{w1b.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(t3cVar, 4, new Class[]{w1b.class}, new String[]{"urlTextView"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(t3cVar, 8, new Class[]{w1b.class}, new String[]{"buttonView"}, (Drawable[]) null, (bnb) null, cmb.Mf));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.Lf));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i));
        ImageView imageView = e3bVar.M;
        int i2 = cmb.Cf;
        arrayList.add(new cnb(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(e3bVar.N, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(d4cVar.f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.U5));
        arrayList.add(new cnb(d4cVar.x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g5));
        return arrayList;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        d4c d4cVar = this.n1;
        nm7 f = nm7.f(d4cVar.a);
        f.n(d4cVar, nm7.x0);
        f.n(d4cVar, nm7.z0);
        nm7.e().k(nm7.k1, 2);
    }

    @Override
    public final void r0(boolean z) {
        this.r0 = true;
    }

    @Override
    public final void show() {
        super.show();
        nm7.e().k(nm7.j1, 2);
    }

    @Override
    public final void z(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.yj));
        hashSet.add(Integer.valueOf(cmb.g5));
    }
}
