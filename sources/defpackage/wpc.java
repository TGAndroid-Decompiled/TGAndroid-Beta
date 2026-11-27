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
public final class wpc extends nic {
    public final ArrayList a;
    public final Context b;
    public final vnb c;
    public final Rect d;
    public final int e;
    public final kl7[] f;

    public wpc(ArrayList arrayList, Context context, vnb vnbVar, Rect rect, int i, kl7[] kl7VarArr) {
        this.a = arrayList;
        this.b = context;
        this.c = vnbVar;
        this.d = rect;
        this.e = i;
        this.f = kl7VarArr;
    }

    @Override
    public final void b(View view, int i, int i2) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        kl7[] kl7VarArr = this.f;
        frameLayout.addView(uqc.j0(this.b, this.e, (TL_wallet.walletTransaction) this.a.get(i), null, null, null, null, this.c, kl7VarArr, true), tre.c(-2.0f, -1));
    }

    @Override
    public final View d(int i) {
        FrameLayout frameLayout = new FrameLayout(this.b);
        int L = hl.L(20.0f);
        int i2 = aob.d6;
        vnb vnbVar = this.c;
        ShapeDrawable c0 = aob.c0(L, 0, aob.v0(i2, vnbVar));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) c0, rect.left, 0, rect.right, 0);
        uob M = yob.M(i2);
        frameLayout.setBackground(insetDrawable);
        yob.j(frameLayout, insetDrawable, M, null, vnbVar);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.a.size();
    }
}
