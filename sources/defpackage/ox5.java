package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
public final class ox5 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements snb {
    public final p66 U;
    public final b8 V;
    public final b8 W;
    public final b8 a0;
    public final ArrayList b0;
    public final nx5 c0;
    public int d0;
    public final w51 e0;
    public lx5 f0;
    public ArrayList g0;
    public final e h0;
    public final FrameLayout i0;

    public ox5(e eVar, Context context) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.b0 = arrayList;
        this.h0 = eVar;
        this.e0 = eVar.getMessagesController().i4;
        setFitItems(true);
        b8 c = s7.c(false, false, this, 2131232066, ob6.G(1, "Days", new Object[0]), false, null);
        b8 c2 = s7.c(false, false, this, 2131232069, ob6.G(2, "Days", new Object[0]), false, null);
        this.a0 = c2;
        b8 c3 = s7.c(false, false, this, 2131232068, ob6.G(1, "Weeks", new Object[0]), false, null);
        b8 c4 = s7.c(false, false, this, 2131232067, ob6.G(1, "Months", new Object[0]), false, null);
        this.W = c4;
        b8 c5 = s7.c(false, false, this, 2131232092, ob6.M0(2131753844, null), false, null);
        b8 c6 = s7.c(false, false, this, 2131232113, ob6.M0(2131751507, null), false, null);
        this.V = c6;
        int i = aob.p7;
        c6.d(aob.w0(null, i, false), aob.w0(null, i, false));
        arrayList.add(new mx5(c, 3));
        arrayList.add(new mx5(c2, 6));
        arrayList.add(new mx5(c3, 0));
        arrayList.add(new mx5(c4, 1));
        arrayList.add(new mx5(c5, 2));
        arrayList.add(new mx5(c6, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.i0 = frameLayout;
        yob.h(aob.H8, null, frameLayout);
        View view = new View(context);
        yob.Z(view, context, 2131231232, aob.b7);
        frameLayout.addView(view, tre.c(-1.0f, -1));
        frameLayout.setTag(2131296439, 1);
        a(frameLayout, tre.o(-1, 8));
        nx5 nx5Var = new nx5(this, context);
        this.c0 = nx5Var;
        a(nx5Var, tre.o(-1, 48));
        nx5Var.setOnClickListener(new uv5(this, eVar, (byte) 1));
        for (int i2 = 0; i2 < this.b0.size(); i2++) {
            ((mx5) this.b0.get(i2)).a.setOnClickListener(new ib(this, ((mx5) this.b0.get(i2)).b, (byte) 3));
        }
        p66 p66Var = new p66(context, null);
        this.U = p66Var;
        p66Var.setTag(2131296439, 1);
        p66Var.setPadding(hl.L(13.0f), 0, hl.L(13.0f), hl.L(8.0f));
        p66Var.setTextSize(1, 13.0f);
        yob.X(p66Var, aob.E8, null);
        p66Var.setMovementMethod(LinkMovementMethod.getInstance());
        yob.G(p66Var, aob.J6, null);
        p66Var.setText(ob6.M0(2131748811, null));
        a(p66Var, tre.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.g0 != null) {
            this.c0.b.setTranslationX((3 - Math.min(3, this.g0.size())) * hl.L(12.0f));
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

    public void setCallback(lx5 lx5Var) {
        this.f0 = lx5Var;
    }

    @Override
    public final void updateColors() {
        try {
            b8 b8Var = this.V;
            if (b8Var != null) {
                int i = aob.p7;
                b8Var.d(aob.w0(null, i, false), aob.w0(null, i, false));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
