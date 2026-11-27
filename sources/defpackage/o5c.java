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
import org.telegram.ui.ActionBar.e;
public class o5c extends nx0 {
    public final int l1;
    public final GradientDrawable m1;
    public final d6c n1;
    public int o1;

    public o5c(Context context, e eVar, d6c d6cVar, vnb vnbVar) {
        super(1, vnbVar, context, true);
        this.l1 = hl.L(12.0f);
        this.m1 = new GradientDrawable();
        n5c n5cVar = new n5c(this, context);
        n5cVar.addView(d6cVar, tre.c(-1.0f, -1));
        this.b = n5cVar;
        this.n1 = d6cVar;
        d6cVar.setParentFragment(eVar);
        d6cVar.setOnScrollListener(new l5c(this));
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.zj));
        hashSet.add(Integer.valueOf(aob.h5));
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final ArrayList S() {
        ArrayList arrayList = new ArrayList();
        d6c d6cVar = this.n1;
        Objects.requireNonNull(d6cVar);
        u00 u00Var = new u00(d6cVar, (byte) 24);
        r5c r5cVar = d6cVar.h;
        arrayList.add(new apb(r5cVar.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.O5));
        arrayList.add(new apb(r5cVar.b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Q5));
        c6c c6cVar = d6cVar.s;
        s5c s5cVar = d6cVar.n;
        c6cVar.getClass();
        h94.a(arrayList, u00Var);
        arrayList.add(new apb(s5cVar, 4, new Class[]{e94.class}, new String[]{"delButton"}, (Drawable[]) null, (zob) null, aob.Ii));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.Ei));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.Hi));
        z4b z4bVar = d6cVar.w;
        z4bVar.getClass();
        h94.a(arrayList, u00Var);
        int i = aob.Lf;
        arrayList.add(new apb(s5cVar, 4, new Class[]{t3b.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(s5cVar, 4, new Class[]{t3b.class}, new String[]{"urlTextView"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(s5cVar, 8, new Class[]{t3b.class}, new String[]{"buttonView"}, (Drawable[]) null, (zob) null, aob.Nf));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.Mf));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i));
        ImageView imageView = z4bVar.M;
        int i2 = aob.Df;
        arrayList.add(new apb(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(z4bVar.N, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(d6cVar.f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.V5));
        arrayList.add(new apb(d6cVar.x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h5));
        return arrayList;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        d6c d6cVar = this.n1;
        jn7 f = jn7.f(d6cVar.a);
        f.n(d6cVar, jn7.x0);
        f.n(d6cVar, jn7.z0);
        jn7.e().k(jn7.k1, 2);
    }

    @Override
    public final void r0(boolean z) {
        this.r0 = true;
    }

    @Override
    public final void show() {
        super.show();
        jn7.e().k(jn7.j1, 2);
    }
}
