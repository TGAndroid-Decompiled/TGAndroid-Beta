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
public final class di2 extends fx0 {
    public final Drawable l1;
    public final ArrayList m1;
    public final ai2 n1;
    public final ci2 o1;
    public final boolean p1;
    public int q1;
    public final int[] r1;
    public final byte s1;
    public int t1;
    public boolean u1;
    public xe1 v1;
    public int w1;
    public int x1;
    public int y1;

    public di2(Activity activity, TLRPC.Chat chat) {
        super(1, (wjb) null, (Context) activity, false);
        int i;
        ArrayList arrayList = new ArrayList();
        this.m1 = arrayList;
        int i2 = 2;
        this.r1 = new int[2];
        this.p1 = true;
        this.w0 = false;
        TLRPC.ChatFull L0 = na7.q1(this.a).L0(chat.id);
        if (L0 != null) {
            i = L0.ttl_period;
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
        Drawable mutate = activity.getResources().getDrawable(2131232733).mutate();
        this.l1 = mutate;
        int i3 = bkb.g5;
        mutate.setColorFilter(new PorterDuffColorFilter(bkb.v0(i3, this.J0), PorterDuff.Mode.MULTIPLY));
        zh2 zh2Var = new zh2(this, activity);
        zh2Var.setFillViewport(true);
        zh2Var.setWillNotDraw(false);
        zh2Var.setClipToPadding(false);
        int i4 = this.u0;
        zh2Var.setPadding(i4, 0, i4, 0);
        this.b = zh2Var;
        ai2 ai2Var = new ai2(this, activity);
        this.n1 = ai2Var;
        ai2Var.setOrientation(1);
        zh2Var.addView(ai2Var, nme.x(-1, -2, 80));
        this.O = ai2Var;
        y6c.h(this.a).e();
        na7.q1(this.a);
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(2131624321, 120, 120, null);
        imageView.setPadding(0, gl.L(20.0f), 0, 0);
        imageView.d();
        ai2Var.addView((View) imageView, nme.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        ug8.v(textView, 1, 24.0f);
        ug8.x(textView, bkb.i5, null, null, 2131753866);
        ai2Var.addView(textView, nme.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, bkb.q5, null);
        textView2.setGravity(1);
        if (hc2.T(chat) && !chat.megagroup) {
            textView2.setText(k96.M0(2131753868, null));
        } else {
            textView2.setText(k96.M0(2131753867, null));
        }
        ai2Var.addView(textView2, nme.t(-2, -2, 49, 30, 22, 30, 20));
        fja fjaVar = new fja(activity, null);
        fjaVar.setCallback(new bi2(this, zh2Var));
        fjaVar.b(i2, null, k96.M0(2131753846, null), k96.M0(2131753876, null), k96.M0(2131753875, null), k96.M0(2131753877, null));
        ai2Var.addView(fjaVar, nme.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        fm2 fm2Var = new fm2(new ColorDrawable(bkb.v0(bkb.Z6, this.J0)), bkb.W0(activity, 2131231233, bkb.a7));
        fm2Var.x = true;
        frameLayout.setBackgroundDrawable(fm2Var);
        arrayList.add(fm2Var);
        ai2Var.addView(frameLayout, nme.o(-1, -2));
        mhb mhbVar = new mhb(activity, null);
        mhbVar.setText(k96.M0(2131753849, null));
        frameLayout.addView(mhbVar);
        ci2 ci2Var = new ci2(activity);
        this.o1 = ci2Var;
        zkb.h(i3, null, ci2Var);
        ci2Var.setText(k96.M0(2131753842, null));
        ci2Var.a.setOnClickListener(new x91(this, (byte) 13));
        frameLayout.addView(ci2Var);
        E0(false);
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
        int max = Math.max(i - gl.L(f), 0);
        if (this.q1 != max) {
            this.q1 = max;
            this.b.invalidate();
        }
    }

    @Override
    public final boolean E() {
        return false;
    }

    public final void E0(boolean z) {
        byte b = this.s1;
        int i = this.t1;
        ci2 ci2Var = this.o1;
        if (b == i && !this.p1) {
            if (z) {
                ci2Var.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            ci2Var.setVisibility(4);
            ci2Var.setAlpha(0.0f);
            return;
        }
        ci2Var.setVisibility(0);
        if (z) {
            ci2Var.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            ci2Var.setAlpha(1.0f);
        }
    }

    @Override
    public final void p0() {
        ArrayList arrayList = this.m1;
        try {
            super.p0();
            int v0 = bkb.v0(bkb.Z6, this.J0);
            int v02 = bkb.v0(bkb.a7, this.J0);
            if (v0 != this.x1 || v02 != this.y1) {
                this.x1 = v0;
                this.y1 = v02;
                for (int i = 0; i < arrayList.size(); i++) {
                    fm2 fm2Var = (fm2) arrayList.get(i);
                    bkb.z1(fm2Var, v0, false);
                    if (fm2Var.b != null) {
                        bkb.z1(fm2Var, v02, true);
                    }
                    fm2Var.invalidateSelf();
                }
            }
            int v03 = bkb.v0(bkb.g5, this.J0);
            Drawable drawable = this.l1;
            if (drawable != null && v03 != this.w1) {
                this.w1 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
