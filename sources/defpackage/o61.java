package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public class o61 extends FrameLayout implements snb {
    public final zc a;
    public final hn b;
    public final hn c;

    public o61(Context context) {
        super(context);
        zc zcVar = new zc((byte) 6, context, this);
        this.a = zcVar;
        int i = aob.Fi;
        zcVar.setBackground(rnb.f(i, 24.0f));
        zcVar.setImportantForAccessibility(1);
        iye.b(zcVar, 0.02f, 1.2f);
        if (ob6.a0) {
            TextView textView = new TextView(context);
            textView.setText(ob6.M0(2131752063, null));
            textView.setGravity(17);
            bs2.t(textView, 1, 14.0f);
            yob.X(textView, aob.Ji, null);
            zcVar.addView(textView, tre.e(-2, -1, 17));
        }
        hn hnVar = new hn(true, true, true);
        this.b = hnVar;
        k43 k43Var = k43.h;
        hnVar.n(0.25f, 300L, k43Var);
        hnVar.setCallback(zcVar);
        hnVar.w(hl.L(14.0f));
        hnVar.t(ob6.M0(2131752063, null), true, true);
        hnVar.b = 5;
        hnVar.x(hl.o());
        int i2 = aob.Ji;
        hnVar.u(aob.w0(null, i2, false));
        hn hnVar2 = new hn(true, true, true);
        this.c = hnVar2;
        hnVar2.n(0.25f, 300L, k43Var);
        hnVar2.setCallback(zcVar);
        hnVar2.w(hl.L(14.0f));
        hnVar2.x(hl.o());
        hnVar2.u(aob.v(aob.w0(null, i, false), aob.p1(0.7f, aob.w0(null, i2, false))));
        hnVar2.t("", true, true);
        zcVar.setContentDescription(TextUtils.concat(hnVar.i, "\t", hnVar2.i));
        addView(zcVar, tre.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j, boolean z) {
        String M0;
        String i0;
        boolean z2;
        if (z) {
            M0 = ob6.M0(2131752063, null);
        } else {
            M0 = ob6.M0(2131752015, null);
        }
        hn hnVar = this.b;
        hnVar.t(M0, true, true);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i <= 0) {
            i0 = "";
        } else {
            i0 = hl.i0(j, false, false);
        }
        hn hnVar2 = this.c;
        hnVar2.t(i0, true, true);
        if (i <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        setDisabled(z2);
        zc zcVar = this.a;
        zcVar.invalidate();
        zcVar.setContentDescription(TextUtils.concat(hnVar.i, "\t", hnVar2.i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Fi));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setDisabled(boolean z) {
        float f;
        zc zcVar = this.a;
        zcVar.animate().cancel();
        ViewPropertyAnimator animate = zcVar.animate();
        if (z) {
            f = 0.65f;
        } else {
            f = 1.0f;
        }
        animate.alpha(f).start();
        zcVar.setClickable(!z);
    }

    @Override
    public final void updateColors() {
        try {
            hn hnVar = this.b;
            if (hnVar != null) {
                hnVar.u(aob.w0(null, aob.Ji, false));
            }
            hn hnVar2 = this.c;
            if (hnVar2 != null) {
                hnVar2.u(aob.v(aob.w0(null, aob.Fi, false), aob.p1(0.7f, aob.w0(null, aob.Ji, false))));
            }
            zc zcVar = this.a;
            if (zcVar != null) {
                zcVar.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
