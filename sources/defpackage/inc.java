package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_wallet;
public final class inc extends ogc {
    public final ArrayList a;
    public final Context b;
    public final ylb c;
    public final Rect d;
    public final int e;
    public final el7[] f;

    public inc(ArrayList arrayList, Context context, ylb ylbVar, Rect rect, int i, el7[] el7VarArr) {
        this.a = arrayList;
        this.b = context;
        this.c = ylbVar;
        this.d = rect;
        this.e = i;
        this.f = el7VarArr;
    }

    @Override
    public final void b(View view, int i, int i2) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        el7[] el7VarArr = this.f;
        frameLayout.addView(goc.k0(this.b, this.e, (TL_wallet.walletTransaction) this.a.get(i), null, null, null, null, this.c, el7VarArr, true), qoe.c(-2.0f, -1));
    }

    @Override
    public final View d(int i) {
        FrameLayout frameLayout = new FrameLayout(this.b);
        int L = gm.L(20.0f);
        int i2 = cmb.c6;
        ylb ylbVar = this.c;
        ShapeDrawable c0 = cmb.c0(L, 0, cmb.v0(i2, ylbVar));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) c0, rect.left, 0, rect.right, 0);
        wmb M = anb.M(i2);
        frameLayout.setBackground(insetDrawable);
        anb.j(frameLayout, insetDrawable, M, null, ylbVar);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.a.size();
    }
}
