package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
public final class jx5 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements vlb {
    public final l66 U;
    public final a8 V;
    public final a8 W;
    public final a8 a0;
    public final ArrayList b0;
    public final ix5 c0;
    public int d0;
    public final v61 e0;
    public gx5 f0;
    public ArrayList g0;
    public final d h0;
    public final FrameLayout i0;

    public jx5(d dVar, Context context) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.b0 = arrayList;
        this.h0 = dVar;
        this.e0 = dVar.getMessagesController().h4;
        setFitItems(true);
        a8 c = r7.c(false, false, this, 2131232067, jb6.G(1, "Days", new Object[0]), false, null);
        a8 c2 = r7.c(false, false, this, 2131232070, jb6.G(2, "Days", new Object[0]), false, null);
        this.a0 = c2;
        a8 c3 = r7.c(false, false, this, 2131232069, jb6.G(1, "Weeks", new Object[0]), false, null);
        a8 c4 = r7.c(false, false, this, 2131232068, jb6.G(1, "Months", new Object[0]), false, null);
        this.W = c4;
        a8 c5 = r7.c(false, false, this, 2131232093, jb6.M0(2131753816, null), false, null);
        a8 c6 = r7.c(false, false, this, 2131232114, jb6.M0(2131751479, null), false, null);
        this.V = c6;
        int i = cmb.o7;
        c6.d(cmb.w0(null, i, false), cmb.w0(null, i, false));
        arrayList.add(new hx5(c, 3));
        arrayList.add(new hx5(c2, 6));
        arrayList.add(new hx5(c3, 0));
        arrayList.add(new hx5(c4, 1));
        arrayList.add(new hx5(c5, 2));
        arrayList.add(new hx5(c6, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.i0 = frameLayout;
        anb.h(cmb.G8, null, frameLayout);
        View view = new View(context);
        anb.Z(view, context, 2131231233, cmb.a7);
        frameLayout.addView(view, qoe.c(-1.0f, -1));
        frameLayout.setTag(2131296439, 1);
        a(frameLayout, qoe.o(-1, 8));
        ix5 ix5Var = new ix5(this, context);
        this.c0 = ix5Var;
        a(ix5Var, qoe.o(-1, 48));
        ix5Var.setOnClickListener(new tf3(this, dVar, (byte) 29));
        for (int i2 = 0; i2 < this.b0.size(); i2++) {
            ((hx5) this.b0.get(i2)).a.setOnClickListener(new hb(this, ((hx5) this.b0.get(i2)).b, (byte) 3));
        }
        l66 l66Var = new l66(context, null);
        this.U = l66Var;
        l66Var.setTag(2131296439, 1);
        l66Var.setPadding(gm.L(13.0f), 0, gm.L(13.0f), gm.L(8.0f));
        l66Var.setTextSize(1, 13.0f);
        anb.X(l66Var, cmb.D8, null);
        l66Var.setMovementMethod(LinkMovementMethod.getInstance());
        anb.G(l66Var, cmb.I6, null);
        l66Var.setText(jb6.M0(2131748814, null));
        a(l66Var, qoe.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.g0 != null) {
            this.c0.b.setTranslationX((3 - Math.min(3, this.g0.size())) * gm.L(12.0f));
        }
    }

    public final void h(boolean z) {
        int i;
        this.d0 = -1;
        this.i0.setVisibility(0);
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        this.V.setVisibility(i);
        this.U.setVisibility(0);
        this.c0.setVisibility(8);
    }

    public void setCallback(gx5 gx5Var) {
        this.f0 = gx5Var;
    }

    @Override
    public final void updateColors() {
        try {
            a8 a8Var = this.V;
            if (a8Var != null) {
                int i = cmb.o7;
                a8Var.d(cmb.w0(null, i, false), cmb.w0(null, i, false));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
