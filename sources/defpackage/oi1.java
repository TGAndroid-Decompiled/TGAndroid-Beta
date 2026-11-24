package defpackage;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class oi1 extends FrameLayout implements vlb {
    public final h28 a;
    public final ni1 b;
    public final lka c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final vi1 h;

    public oi1(vi1 vi1Var, Activity activity) {
        super(activity);
        ylb ylbVar;
        int i;
        ylb ylbVar2;
        float f;
        float f2;
        int i2;
        int i3;
        this.h = vi1Var;
        Context context = getContext();
        ylbVar = ((d) vi1Var).resourceProvider;
        h28 h28Var = new h28(context, ylbVar);
        this.a = h28Var;
        h28Var.setProgressToGradient(1.0f);
        h28Var.G = true;
        addView(h28Var, qoe.e(-1, -1, 119));
        Context context2 = getContext();
        i = ((d) vi1Var).currentAccount;
        long j = vi1Var.a;
        ylbVar2 = ((d) vi1Var).resourceProvider;
        ni1 ni1Var = new ni1(this, context2, i, j, ylbVar2);
        this.b = ni1Var;
        boolean z = vi1Var.d;
        if (z) {
            f = 230.0f;
        } else {
            f = 190.0f;
        }
        float f3 = f;
        if (z) {
            f2 = 24.0f;
        } else {
            f2 = 0.0f;
        }
        addView(ni1Var, qoe.d(-1, f3, 80, 0.0f, 0.0f, 0.0f, f2));
        if (vi1Var instanceof ac5) {
            lka lkaVar = new lka(getContext());
            this.c = lkaVar;
            lkaVar.setGravity(19);
            int i4 = cmb.z8;
            lkaVar.setTextColor(vi1Var.getThemedColor(i4));
            lkaVar.setTypeface(gm.o());
            lkaVar.l(jb6.M0(2131752504, null), false);
            lkaVar.setAlpha(0.0f);
            a();
            addView(lkaVar, qoe.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(cmb.g0(cmb.p1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(ni1Var.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (vi1Var.d && vi1Var.s == -1) {
                i2 = vi1Var.getThemedColor(i4);
            } else {
                i2 = -1;
            }
            textView2.setTextColor(i2);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = vi1Var.c;
            if (tL_premium_boostsStatus != null) {
                i3 = tL_premium_boostsStatus.boosts;
            } else {
                i3 = 0;
            }
            textView.setText(gm.S2(jb6.G(i3, "BoostingGroupBoostCount", new Object[0])));
            textView2.setText(jb6.M0(2131753318, null));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, qoe.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, qoe.e(-1, -2, 80));
        }
    }

    public final void a() {
        boolean z;
        int i;
        float f;
        int i2 = 0;
        if (getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!gm.O1() && z) {
            i = 18;
        } else {
            i = 20;
        }
        lka lkaVar = this.c;
        lkaVar.setTextSize(i);
        if (gm.O1()) {
            f = -2.0f;
        } else {
            if (z) {
                i2 = 4;
            }
            f = i2;
        }
        lkaVar.setTranslationY(gm.L(f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.z8));
    }

    @Override
    public final void updateColors() {
        int themedColor;
        lka lkaVar = this.c;
        if (lkaVar != null) {
            vi1 vi1Var = this.h;
            int i = -1;
            if (vi1Var.d && vi1Var.s != -1) {
                themedColor = -1;
            } else {
                themedColor = vi1Var.getThemedColor(cmb.z8);
            }
            lkaVar.setTextColor(themedColor);
            if (vi1Var.d && vi1Var.s == -1) {
                i = vi1Var.getThemedColor(cmb.z8);
            }
            this.e.setTextColor(i);
        }
    }
}
