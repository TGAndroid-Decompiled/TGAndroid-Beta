package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.ImageReceiver;
public abstract class er0 extends View {
    public int E;
    public final ImageReceiver F;
    public boolean G;
    public boolean H;
    public final int I;
    public boolean J;
    public final fg0 K;
    public int L;
    public StaticLayout a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int h;
    public int n;
    public m66 r;
    public final i66 s;
    public cr0 w;
    public final int x;
    public final ylb y;

    public er0(int i, ylb ylbVar, Context context) {
        super(context);
        this.s = new i66(this);
        this.I = gm.L(4.0f);
        this.x = i;
        this.y = ylbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.K0 = true;
        imageReceiver.B0 = true;
        imageReceiver.t1 = (short) 300;
        int v0 = cmb.v0(cmb.h6, ylbVar);
        int i2 = gda.U0;
        this.L = i2;
        fg0 Y = cmb.Y(v0, i2, i2);
        this.K = Y;
        Y.setCallback(this);
    }

    public final void a() {
        if (this.r != null) {
            this.r = null;
        }
        this.s.e(true);
        invalidate();
    }

    public final void b(boolean r30, long r31, java.lang.String r33, org.telegram.tgnet.TLObject r34, org.telegram.tgnet.tl.TL_bots.BotInfo r35, java.lang.String r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.a;
        if (staticLayout == null) {
            return null;
        }
        return staticLayout.getText();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        float f;
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.e) / 2;
        int L = gm.L(2.0f) + this.E;
        Drawable k = cmb.p3.k();
        if (k != null) {
            k.setBounds(width, L, this.e + width, this.f + L);
            k.draw(canvas);
        }
        Point point = gm.q;
        int i = point.x;
        int i2 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i = view.getMeasuredWidth();
            i2 = view.getMeasuredHeight();
        }
        ylb ylbVar = this.y;
        if (ylbVar != null) {
            drawable = ylbVar.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = cmb.P0("drawableMsgInMedia");
        }
        m37 m37Var = (m37) drawable;
        m37Var.o((int) getY(), i, i2);
        m37Var.setBounds(width, 0, this.e + width, this.f);
        m37Var.draw(canvas);
        fg0 fg0Var = this.K;
        if (fg0Var != null) {
            int i3 = this.L;
            int i4 = gda.U0;
            if (i3 != i4) {
                this.L = i4;
                cmb.E1(fg0Var, i4, i4);
            }
            fg0Var.setBounds(gm.L(2.0f) + width, gm.L(2.0f), (this.e + width) - gm.L(2.0f), this.f - gm.L(2.0f));
            fg0Var.draw(canvas);
        }
        int i5 = this.I;
        float f2 = this.E - i5;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.i0(width + i5, i5, this.e - (i5 << 1), f2);
        imageReceiver.h(canvas, null);
        cmb.n2.setColor(cmb.v0(cmb.Uc, ylbVar));
        cmb.n2.linkColor = cmb.v0(cmb.Wc, ylbVar);
        canvas.save();
        if (this.G) {
            f = 14.0f;
        } else {
            f = 11.0f;
        }
        int L2 = gm.L(f) + width;
        this.h = L2;
        float f3 = L2;
        int L3 = gm.L(11.0f) + L;
        this.n = L3;
        canvas.translate(f3, L3);
        if (this.s.g(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), gm.L(8.0f) + this.f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z) {
        this.J = z;
    }

    public void setDelegate(cr0 cr0Var) {
        this.w = cr0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.K && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
