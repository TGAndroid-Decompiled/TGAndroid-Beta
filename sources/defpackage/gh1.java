package defpackage;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class gh1 extends FrameLayout implements tjb {
    public final e08 a;
    public final fh1 b;
    public final jia c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final nh1 h;

    public gh1(nh1 nh1Var, Activity activity) {
        super(activity);
        wjb wjbVar;
        int i;
        wjb wjbVar2;
        float f;
        float f2;
        int i2;
        int i3;
        this.h = nh1Var;
        Context context = getContext();
        wjbVar = ((d) nh1Var).resourceProvider;
        e08 e08Var = new e08(context, wjbVar);
        this.a = e08Var;
        e08Var.setProgressToGradient(1.0f);
        e08Var.G = true;
        addView(e08Var, nme.e(-1, -1, 119));
        Context context2 = getContext();
        i = ((d) nh1Var).currentAccount;
        long j = nh1Var.a;
        wjbVar2 = ((d) nh1Var).resourceProvider;
        fh1 fh1Var = new fh1(this, context2, i, j, wjbVar2);
        this.b = fh1Var;
        boolean z = nh1Var.d;
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
        addView(fh1Var, nme.d(-1, f3, 80, 0.0f, 0.0f, 0.0f, f2));
        if (nh1Var instanceof ca5) {
            jia jiaVar = new jia(getContext());
            this.c = jiaVar;
            jiaVar.setGravity(19);
            int i4 = bkb.z8;
            jiaVar.setTextColor(nh1Var.getThemedColor(i4));
            jiaVar.setTypeface(gl.o());
            jiaVar.l(k96.M0(2131752539, null), false);
            jiaVar.setAlpha(0.0f);
            a();
            addView(jiaVar, nme.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(bkb.g0(bkb.p1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(fh1Var.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (nh1Var.d && nh1Var.s == -1) {
                i2 = nh1Var.getThemedColor(i4);
            } else {
                i2 = -1;
            }
            textView2.setTextColor(i2);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = nh1Var.c;
            if (tL_premium_boostsStatus != null) {
                i3 = tL_premium_boostsStatus.boosts;
            } else {
                i3 = 0;
            }
            textView.setText(gl.T2(k96.G(i3, "BoostingGroupBoostCount", new Object[0])));
            textView2.setText(k96.M0(2131753350, null));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, nme.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, nme.e(-1, -2, 80));
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
        if (!gl.O1() && z) {
            i = 18;
        } else {
            i = 20;
        }
        jia jiaVar = this.c;
        jiaVar.setTextSize(i);
        if (gl.O1()) {
            f = -2.0f;
        } else {
            if (z) {
                i2 = 4;
            }
            f = i2;
        }
        jiaVar.setTranslationY(gl.L(f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.z8));
    }

    @Override
    public final void updateColors() {
        int themedColor;
        jia jiaVar = this.c;
        if (jiaVar != null) {
            nh1 nh1Var = this.h;
            int i = -1;
            if (nh1Var.d && nh1Var.s != -1) {
                themedColor = -1;
            } else {
                themedColor = nh1Var.getThemedColor(bkb.z8);
            }
            jiaVar.setTextColor(themedColor);
            if (nh1Var.d && nh1Var.s == -1) {
                i = nh1Var.getThemedColor(bkb.z8);
            }
            this.e.setTextColor(i);
        }
    }
}
