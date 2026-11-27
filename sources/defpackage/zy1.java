package defpackage;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zy1 extends View {
    public b29 E;
    public final float[] F;
    public boolean G;
    public long H;
    public final Paint I;
    public long J;
    public final ChatActivityEnterView K;
    public float a;
    public boolean b;
    public boolean c;
    public final b29 d;
    public boolean e;
    public boolean f;
    public long h;
    public boolean n;
    public long r;
    public float s;
    public float w;
    public float x;
    public float y;

    public zy1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.K = chatActivityEnterView;
        this.h = -1L;
        this.F = new float[3];
        this.H = -1L;
        this.I = new Paint(1);
        b29 b29Var = new b29(2131623975, hl.L(28.0f), hl.L(28.0f), false, null);
        this.d = b29Var;
        b29Var.p0 = true;
        f();
    }

    public static float a(long j) {
        return (((float) Math.cos((((float) (j % 1300)) / 1300.0f) * 3.141592653589793d * 2.0d)) * 0.5f) + 0.5f;
    }

    public final void b() {
        this.c = true;
        this.J = SystemClock.uptimeMillis();
        b29 b29Var = this.d;
        b29Var.O(true, 0.0f);
        if (this.b) {
            b29Var.start();
        }
    }

    public final void c() {
        ChatActivityEnterView chatActivityEnterView = this.K;
        chatActivityEnterView.l4.setColor(chatActivityEnterView.J0(aob.ag));
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
        return xnb.B(i, 2.0f, 3.0f, 12.0f * i * i);
    }

    public final void f() {
        int i = aob.ag;
        int i2 = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.K;
        int J0 = chatActivityEnterView.J0(i);
        int J02 = chatActivityEnterView.J0(aob.Je);
        int J03 = chatActivityEnterView.J0(aob.Vf);
        chatActivityEnterView.l4.setColor(J0);
        b29 b29Var = this.d;
        b29Var.a0 = true;
        b29Var.L(J03, "Cup Red");
        b29Var.L(J03, "Box Red");
        b29Var.L(J03, "Cup Grey");
        b29Var.L(J03, "Box Grey");
        b29Var.L(J03, "Box_Grey 2");
        b29Var.L(J03, "Line 1");
        b29Var.L(J03, "Line 2");
        b29Var.L(J03, "Line 3");
        b29Var.L(J02, "Line 1 Dup");
        b29Var.L(J02, "Line 2 Dup");
        b29Var.L(J02, "Line 3 Dup");
        b29Var.j();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        b29Var.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final b29 g() {
        if (this.E == null) {
            b29 b29Var = new b29(2131623977, hl.L(28.0f), hl.L(28.0f), false, null);
            this.E = b29Var;
            b29Var.E(true);
            this.E.p0 = false;
            int i = aob.Vf;
            int i2 = ChatActivityEnterView.X7;
            int J0 = this.K.J0(i);
            b29 b29Var2 = this.E;
            b29Var2.a0 = true;
            b29Var2.L(J0, "Cup Grey");
            this.E.L(J0, "Box_Grey 2");
            this.E.L(J0, "Box Grey");
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
        b29 b29Var = this.d;
        if (z) {
            b29Var.start();
        }
        b29Var.M(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        b29 b29Var = this.d;
        b29Var.stop();
        b29Var.M(null);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
