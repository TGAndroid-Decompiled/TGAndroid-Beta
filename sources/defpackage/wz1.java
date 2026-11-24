package defpackage;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wz1 extends View {
    public p09 E;
    public final float[] F;
    public boolean G;
    public long H;
    public final Paint I;
    public long J;
    public final ChatActivityEnterView K;
    public float a;
    public boolean b;
    public boolean c;
    public final p09 d;
    public boolean e;
    public boolean f;
    public long h;
    public boolean n;
    public long r;
    public float s;
    public float w;
    public float x;
    public float y;

    public wz1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.K = chatActivityEnterView;
        this.h = -1L;
        this.F = new float[3];
        this.H = -1L;
        this.I = new Paint(1);
        p09 p09Var = new p09(2131623975, gm.L(28.0f), gm.L(28.0f), false, null);
        this.d = p09Var;
        p09Var.p0 = true;
        f();
    }

    public static float a(long j) {
        return (((float) Math.cos((((float) (j % 1300)) / 1300.0f) * 3.141592653589793d * 2.0d)) * 0.5f) + 0.5f;
    }

    public final void b() {
        this.c = true;
        this.J = SystemClock.uptimeMillis();
        p09 p09Var = this.d;
        p09Var.O(true, 0.0f);
        if (this.b) {
            p09Var.start();
        }
    }

    public final void c() {
        ChatActivityEnterView chatActivityEnterView = this.K;
        chatActivityEnterView.m4.setColor(chatActivityEnterView.F0(cmb.Zf));
        this.a = 1.0f;
        System.currentTimeMillis();
        this.H = -1L;
        this.h = -1L;
        this.c = false;
        this.d.stop();
        this.n = false;
        this.y = 0.0f;
        this.x = 0.0f;
        this.w = 0.0f;
        invalidate();
    }

    public final void d(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        if (z) {
            g();
        }
        invalidate();
    }

    public final float e() {
        float i = (1.0f - Utilities.i(this.x / 0.8f, 1.0f, 0.0f)) * this.w;
        return mlb.B(i, 2.0f, 3.0f, 12.0f * i * i);
    }

    public final void f() {
        int i = cmb.Zf;
        int i2 = ChatActivityEnterView.z7;
        ChatActivityEnterView chatActivityEnterView = this.K;
        int F0 = chatActivityEnterView.F0(i);
        int F02 = chatActivityEnterView.F0(cmb.Ie);
        int F03 = chatActivityEnterView.F0(cmb.Uf);
        chatActivityEnterView.m4.setColor(F0);
        p09 p09Var = this.d;
        p09Var.a0 = true;
        p09Var.L(F03, "Cup Red");
        p09Var.L(F03, "Box Red");
        p09Var.L(F03, "Cup Grey");
        p09Var.L(F03, "Box Grey");
        p09Var.L(F03, "Box_Grey 2");
        p09Var.L(F03, "Line 1");
        p09Var.L(F03, "Line 2");
        p09Var.L(F03, "Line 3");
        p09Var.L(F02, "Line 1 Dup");
        p09Var.L(F02, "Line 2 Dup");
        p09Var.L(F02, "Line 3 Dup");
        p09Var.j();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        p09Var.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final p09 g() {
        if (this.E == null) {
            p09 p09Var = new p09(2131623977, gm.L(28.0f), gm.L(28.0f), false, null);
            this.E = p09Var;
            p09Var.E(true);
            this.E.p0 = false;
            int i = cmb.Uf;
            int i2 = ChatActivityEnterView.z7;
            int F0 = this.K.F0(i);
            p09 p09Var2 = this.E;
            p09Var2.a0 = true;
            p09Var2.L(F0, "Cup Grey");
            this.E.L(F0, "Box_Grey 2");
            this.E.L(F0, "Box Grey");
            this.E.j();
            this.E.M(this);
            this.E.O(true, 0.0f);
        }
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = true;
        boolean z = this.c;
        p09 p09Var = this.d;
        if (z) {
            p09Var.start();
        }
        p09Var.M(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        p09 p09Var = this.d;
        p09Var.stop();
        p09Var.M(null);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
