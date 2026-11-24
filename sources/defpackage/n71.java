package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public class n71 extends FrameLayout implements vlb {
    public final yd a;
    public final ho b;
    public final ho c;

    public n71(Context context) {
        super(context);
        yd ydVar = new yd((byte) 6, context, this);
        this.a = ydVar;
        int i = cmb.Ei;
        ydVar.setBackground(ulb.f(i, 24.0f));
        ydVar.setImportantForAccessibility(1);
        rve.b(ydVar, 0.02f, 1.2f);
        if (jb6.a0) {
            TextView textView = new TextView(context);
            textView.setText(jb6.M0(2131752035, null));
            textView.setGravity(17);
            ts2.s(textView, 1, 14.0f);
            anb.X(textView, cmb.Ii, null);
            ydVar.addView(textView, qoe.e(-2, -1, 17));
        }
        ho hoVar = new ho(true, true, true);
        this.b = hoVar;
        d53 d53Var = d53.h;
        hoVar.n(0.25f, 300L, d53Var);
        hoVar.setCallback(ydVar);
        hoVar.w(gm.L(14.0f));
        hoVar.t(jb6.M0(2131752035, null), true, true);
        hoVar.b = 5;
        hoVar.x(gm.o());
        int i2 = cmb.Ii;
        hoVar.u(cmb.w0(null, i2, false));
        ho hoVar2 = new ho(true, true, true);
        this.c = hoVar2;
        hoVar2.n(0.25f, 300L, d53Var);
        hoVar2.setCallback(ydVar);
        hoVar2.w(gm.L(14.0f));
        hoVar2.x(gm.o());
        hoVar2.u(cmb.v(cmb.w0(null, i, false), cmb.p1(0.7f, cmb.w0(null, i2, false))));
        hoVar2.t("", true, true);
        ydVar.setContentDescription(TextUtils.concat(hoVar.i, "\t", hoVar2.i));
        addView(ydVar, qoe.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j, boolean z) {
        String M0;
        String i0;
        boolean z2;
        if (z) {
            M0 = jb6.M0(2131752035, null);
        } else {
            M0 = jb6.M0(2131751987, null);
        }
        ho hoVar = this.b;
        hoVar.t(M0, true, true);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i <= 0) {
            i0 = "";
        } else {
            i0 = gm.i0(j, false, false);
        }
        ho hoVar2 = this.c;
        hoVar2.t(i0, true, true);
        if (i <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        setDisabled(z2);
        yd ydVar = this.a;
        ydVar.invalidate();
        ydVar.setContentDescription(TextUtils.concat(hoVar.i, "\t", hoVar2.i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Ei));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setDisabled(boolean z) {
        float f;
        yd ydVar = this.a;
        ydVar.animate().cancel();
        ViewPropertyAnimator animate = ydVar.animate();
        if (z) {
            f = 0.65f;
        } else {
            f = 1.0f;
        }
        animate.alpha(f).start();
        ydVar.setClickable(!z);
    }

    @Override
    public final void updateColors() {
        try {
            ho hoVar = this.b;
            if (hoVar != null) {
                hoVar.u(cmb.w0(null, cmb.Ii, false));
            }
            ho hoVar2 = this.c;
            if (hoVar2 != null) {
                hoVar2.u(cmb.v(cmb.w0(null, cmb.Ei, false), cmb.p1(0.7f, cmb.w0(null, cmb.Ii, false))));
            }
            yd ydVar = this.a;
            if (ydVar != null) {
                ydVar.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
