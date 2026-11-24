package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
public final class jv5 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements tjb {
    public final l46 U;
    public final a8 V;
    public final a8 W;
    public final a8 a0;
    public final ArrayList b0;
    public final iv5 c0;
    public int d0;
    public final o51 e0;
    public gv5 f0;
    public ArrayList g0;
    public final d h0;
    public final FrameLayout i0;

    public jv5(d dVar, Context context) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.b0 = arrayList;
        this.h0 = dVar;
        this.e0 = dVar.getMessagesController().h4;
        setFitItems(true);
        a8 c = r7.c(false, false, this, 2131232066, k96.G(1, "Days", new Object[0]), false, null);
        a8 c2 = r7.c(false, false, this, 2131232069, k96.G(2, "Days", new Object[0]), false, null);
        this.a0 = c2;
        a8 c3 = r7.c(false, false, this, 2131232068, k96.G(1, "Weeks", new Object[0]), false, null);
        a8 c4 = r7.c(false, false, this, 2131232067, k96.G(1, "Months", new Object[0]), false, null);
        this.W = c4;
        a8 c5 = r7.c(false, false, this, 2131232092, k96.M0(2131753848, null), false, null);
        a8 c6 = r7.c(false, false, this, 2131232113, k96.M0(2131751530, null), false, null);
        this.V = c6;
        int i = bkb.o7;
        c6.d(bkb.w0(null, i, false), bkb.w0(null, i, false));
        arrayList.add(new hv5(c, 3));
        arrayList.add(new hv5(c2, 6));
        arrayList.add(new hv5(c3, 0));
        arrayList.add(new hv5(c4, 1));
        arrayList.add(new hv5(c5, 2));
        arrayList.add(new hv5(c6, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.i0 = frameLayout;
        zkb.h(bkb.G8, null, frameLayout);
        View view = new View(context);
        zkb.Z(view, context, 2131231232, bkb.a7);
        frameLayout.addView(view, nme.c(-1.0f, -1));
        frameLayout.setTag(2131296439, 1);
        a(frameLayout, nme.o(-1, 8));
        iv5 iv5Var = new iv5(this, context);
        this.c0 = iv5Var;
        a(iv5Var, nme.o(-1, 48));
        iv5Var.setOnClickListener(new xf3(this, dVar, (byte) 28));
        for (int i2 = 0; i2 < this.b0.size(); i2++) {
            ((hv5) this.b0.get(i2)).a.setOnClickListener(new hb(this, ((hv5) this.b0.get(i2)).b, (byte) 3));
        }
        l46 l46Var = new l46(context, null);
        this.U = l46Var;
        l46Var.setTag(2131296439, 1);
        l46Var.setPadding(gl.L(13.0f), 0, gl.L(13.0f), gl.L(8.0f));
        l46Var.setTextSize(1, 13.0f);
        zkb.X(l46Var, bkb.D8, null);
        l46Var.setMovementMethod(LinkMovementMethod.getInstance());
        zkb.G(l46Var, bkb.I6, null);
        l46Var.setText(k96.M0(2131748865, null));
        a(l46Var, nme.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.g0 != null) {
            this.c0.b.setTranslationX((3 - Math.min(3, this.g0.size())) * gl.L(12.0f));
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

    public void setCallback(gv5 gv5Var) {
        this.f0 = gv5Var;
    }

    @Override
    public final void updateColors() {
        try {
            a8 a8Var = this.V;
            if (a8Var != null) {
                int i = bkb.o7;
                a8Var.d(bkb.w0(null, i, false), bkb.w0(null, i, false));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
