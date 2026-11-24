package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_agent;
public final class jc extends el7 implements jm7 {
    public final mc W1;
    public final ao8 X1;
    public final boolean Y1;
    public final ic Z1;
    public final q7c a2;
    public final q7c b2;
    public final FrameLayout c2;
    public final FrameLayout d2;
    public final FrameLayout e2;
    public final TextView f2;
    public final su3 g2;
    public final TextView h2;
    public final FrameLayout i2;
    public final b61 j2;
    public TL_agent.agentProvider k2;
    public boolean l2;

    public jc(android.app.Activity r25, int r26, defpackage.ao8 r27, defpackage.ylb r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc.<init>(android.app.Activity, int, ao8, ylb):void");
    }

    public final void Z0() {
        if (this.k2 != null && !this.l2) {
            String trim = this.g2.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                this.l2 = true;
                String M0 = jb6.M0(2131754293, null);
                b61 b61Var = this.j2;
                b61Var.i(M0, true, true);
                b61Var.setLoading(true);
                d1();
                String str = this.k2.id;
                x0 x0Var = new x0(this, str, (byte) 1);
                mc mcVar = this.W1;
                mcVar.getClass();
                TL_agent.connect connectVar = new TL_agent.connect();
                connectVar.provider = str;
                connectVar.key = trim;
                ConnectionsManager.getInstance(mcVar.a).sendRequestTyped(connectVar, new kc((byte) 0), new lf2(mcVar, x0Var, (byte) 1));
            }
        }
    }

    public final FrameLayout a1(Activity activity, String str, ec ecVar) {
        float f;
        int i;
        FrameLayout frameLayout = new FrameLayout(activity);
        if (ecVar != null) {
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(2131231244);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.F6, this.J0), PorterDuff.Mode.SRC_IN));
            imageView.setBackground(cmb.f0(cmb.v0(cmb.h6, this.J0), 1, -1));
            imageView.setOnClickListener(ecVar);
            rve.a(imageView);
            if (jb6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            frameLayout.addView(imageView, qoe.d(48, 48.0f, i | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        }
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setTextColor(cmb.v0(cmb.F6, this.J0));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        if (ecVar != null) {
            f = 60.0f;
        } else {
            f = 22.0f;
        }
        frameLayout.addView(textView, qoe.d(-1, -2.0f, 23, f, 0.0f, 22.0f, 0.0f));
        frameLayout.setMinimumHeight(gm.L(56.0f));
        return frameLayout;
    }

    public final q7c b1(Activity activity, jac jacVar, l0 l0Var) {
        q7c q7cVar = new q7c(activity, this.a, 0, true, jacVar, l0Var, null, this.J0);
        q7cVar.g3.r = false;
        q7cVar.r1();
        q7cVar.setNestedScrollingEnabled(false);
        q7cVar.setOverScrollMode(2);
        q7cVar.setItemAnimator(null);
        return q7cVar;
    }

    public final void c1(boolean z) {
        float f;
        ViewPropertyAnimator animate = this.f2.animate();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        wi8.s(animate, f, 220L);
    }

    public final void d1() {
        boolean z;
        if (!this.l2 && !TextUtils.isEmpty(this.g2.getText().toString().trim())) {
            z = true;
        } else {
            z = false;
        }
        this.j2.setEnabled(z);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.c4) {
            this.a2.g3.O(false);
        }
    }

    @Override
    public final void dismiss() {
        nm7.f(this.a).n(this, nm7.c4);
        gm.t1(this.g2.d);
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        ic icVar = this.Z1;
        if (icVar.b && !this.Y1) {
            if (this.l2) {
                return;
            }
            gm.t1(this.g2.d);
            icVar.b(0, true);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void show() {
        super.show();
        nm7.f(this.a).b(this, nm7.c4);
    }
}
