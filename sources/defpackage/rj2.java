package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rj2 extends my0 {
    public final Drawable l1;
    public final ArrayList m1;
    public final oj2 n1;
    public final qj2 o1;
    public final boolean p1;
    public int q1;
    public final int[] r1;
    public final byte s1;
    public int t1;
    public boolean u1;
    public fg1 v1;
    public int w1;
    public int x1;
    public int y1;

    public rj2(Activity activity, TLRPC.Chat chat) {
        super(1, (ylb) null, (Context) activity, false);
        int i;
        ArrayList arrayList = new ArrayList();
        this.m1 = arrayList;
        int i2 = 2;
        this.r1 = new int[2];
        this.p1 = true;
        this.w0 = false;
        TLRPC.ChatFull M0 = oc7.r1(this.a).M0(chat.id);
        if (M0 != null) {
            i = M0.ttl_period;
        } else {
            i = 0;
        }
        if (i == 0) {
            this.s1 = (byte) 0;
            this.t1 = 0;
            i2 = 0;
        } else if (i == 86400) {
            this.s1 = (byte) 1;
            this.t1 = 1;
            i2 = 1;
        } else if (i == 604800) {
            this.s1 = (byte) 2;
            this.t1 = 2;
        } else {
            i2 = 3;
            this.s1 = (byte) 3;
            this.t1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(2131232745).mutate();
        this.l1 = mutate;
        int i3 = cmb.g5;
        mutate.setColorFilter(new PorterDuffColorFilter(cmb.v0(i3, this.J0), PorterDuff.Mode.MULTIPLY));
        nj2 nj2Var = new nj2(this, activity);
        nj2Var.setFillViewport(true);
        nj2Var.setWillNotDraw(false);
        nj2Var.setClipToPadding(false);
        int i4 = this.u0;
        nj2Var.setPadding(i4, 0, i4, 0);
        this.b = nj2Var;
        oj2 oj2Var = new oj2(this, activity);
        this.n1 = oj2Var;
        oj2Var.setOrientation(1);
        nj2Var.addView(oj2Var, qoe.x(-1, -2, 80));
        this.O = oj2Var;
        z8c.h(this.a).e();
        oc7.r1(this.a);
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(2131624321, 120, 120, null);
        imageView.setPadding(0, gm.L(20.0f), 0, 0);
        imageView.d();
        oj2Var.addView((View) imageView, qoe.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        wi8.v(textView, 1, 24.0f);
        wi8.x(textView, cmb.i5, null, null, 2131753834);
        oj2Var.addView(textView, qoe.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, cmb.q5, null);
        textView2.setGravity(1);
        if (sd2.T(chat) && !chat.megagroup) {
            textView2.setText(jb6.M0(2131753836, null));
        } else {
            textView2.setText(jb6.M0(2131753835, null));
        }
        oj2Var.addView(textView2, qoe.t(-2, -2, 49, 30, 22, 30, 20));
        hla hlaVar = new hla(activity, null);
        hlaVar.setCallback(new pj2(this, nj2Var));
        hlaVar.b(i2, null, jb6.M0(2131753814, null), jb6.M0(2131753844, null), jb6.M0(2131753843, null), jb6.M0(2131753845, null));
        oj2Var.addView(hlaVar, qoe.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        sn2 sn2Var = new sn2(new ColorDrawable(cmb.v0(cmb.Z6, this.J0)), cmb.W0(activity, 2131231234, cmb.a7));
        sn2Var.x = true;
        frameLayout.setBackgroundDrawable(sn2Var);
        arrayList.add(sn2Var);
        oj2Var.addView(frameLayout, qoe.o(-1, -2));
        njb njbVar = new njb(activity, null);
        njbVar.setText(jb6.M0(2131753817, null));
        frameLayout.addView(njbVar);
        qj2 qj2Var = new qj2(activity);
        this.o1 = qj2Var;
        anb.h(i3, null, qj2Var);
        qj2Var.setText(jb6.M0(2131753810, null));
        qj2Var.a.setOnClickListener(new k81(this, (byte) 16));
        frameLayout.addView(qj2Var);
        E0(false);
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void D0() {
        float f;
        View childAt = this.n1.getChildAt(0);
        int[] iArr = this.r1;
        childAt.getLocationInWindow(iArr);
        int i = iArr[1];
        if (this.p1) {
            f = 6.0f;
        } else {
            f = 19.0f;
        }
        int max = Math.max(i - gm.L(f), 0);
        if (this.q1 != max) {
            this.q1 = max;
            this.b.invalidate();
        }
    }

    public final void E0(boolean z) {
        byte b = this.s1;
        int i = this.t1;
        qj2 qj2Var = this.o1;
        if (b == i && !this.p1) {
            if (z) {
                qj2Var.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            qj2Var.setVisibility(4);
            qj2Var.setAlpha(0.0f);
            return;
        }
        qj2Var.setVisibility(0);
        if (z) {
            qj2Var.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            qj2Var.setAlpha(1.0f);
        }
    }

    @Override
    public final void p0() {
        ArrayList arrayList = this.m1;
        try {
            super.p0();
            int v0 = cmb.v0(cmb.Z6, this.J0);
            int v02 = cmb.v0(cmb.a7, this.J0);
            if (v0 != this.x1 || v02 != this.y1) {
                this.x1 = v0;
                this.y1 = v02;
                for (int i = 0; i < arrayList.size(); i++) {
                    sn2 sn2Var = (sn2) arrayList.get(i);
                    cmb.z1(sn2Var, v0, false);
                    if (sn2Var.b != null) {
                        cmb.z1(sn2Var, v02, true);
                    }
                    sn2Var.invalidateSelf();
                }
            }
            int v03 = cmb.v0(cmb.g5, this.J0);
            Drawable drawable = this.l1;
            if (drawable != null && v03 != this.w1) {
                this.w1 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
