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
public final class jlc extends oec {
    public final ArrayList a;
    public final Context b;
    public final wjb c;
    public final Rect d;
    public final int e;
    public final cj7[] f;

    public jlc(ArrayList arrayList, Context context, wjb wjbVar, Rect rect, int i, cj7[] cj7VarArr) {
        this.a = arrayList;
        this.b = context;
        this.c = wjbVar;
        this.d = rect;
        this.e = i;
        this.f = cj7VarArr;
    }

    @Override
    public final void b(View view, int i, int i2) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        cj7[] cj7VarArr = this.f;
        frameLayout.addView(hmc.j0(this.b, this.e, (TL_wallet.walletTransaction) this.a.get(i), null, null, null, null, this.c, cj7VarArr, true), nme.c(-2.0f, -1));
    }

    @Override
    public final View d(int i) {
        FrameLayout frameLayout = new FrameLayout(this.b);
        int L = gl.L(20.0f);
        int i2 = bkb.c6;
        wjb wjbVar = this.c;
        ShapeDrawable c0 = bkb.c0(L, 0, bkb.v0(i2, wjbVar));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) c0, rect.left, 0, rect.right, 0);
        vkb M = zkb.M(i2);
        frameLayout.setBackground(insetDrawable);
        zkb.j(frameLayout, insetDrawable, M, null, wjbVar);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.a.size();
    }
}
