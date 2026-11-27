package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.ImageReceiver;
public abstract class eq0 extends View {
    public int E;
    public final ImageReceiver F;
    public boolean G;
    public boolean H;
    public final int I;
    public boolean J;
    public final hf0 K;
    public int L;
    public StaticLayout a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int h;
    public int n;
    public q66 r;
    public final m66 s;
    public cq0 w;
    public final int x;
    public final vnb y;

    public eq0(int i, vnb vnbVar, Context context) {
        super(context);
        this.s = new m66(this);
        this.I = hl.L(4.0f);
        this.x = i;
        this.y = vnbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.K0 = true;
        imageReceiver.B0 = true;
        imageReceiver.t1 = (short) 300;
        int v0 = aob.v0(aob.i6, vnbVar);
        int i2 = xea.U0;
        this.L = i2;
        hf0 Y = aob.Y(v0, i2, i2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
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
        int L = hl.L(2.0f) + this.E;
        Drawable k = aob.q3.k();
        if (k != null) {
            k.setBounds(width, L, this.e + width, this.f + L);
            k.draw(canvas);
        }
        Point point = hl.q;
        int i = point.x;
        int i2 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i = view.getMeasuredWidth();
            i2 = view.getMeasuredHeight();
        }
        vnb vnbVar = this.y;
        if (vnbVar != null) {
            drawable = vnbVar.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = aob.P0("drawableMsgInMedia");
        }
        t37 t37Var = (t37) drawable;
        t37Var.o((int) getY(), i, i2);
        t37Var.setBounds(width, 0, this.e + width, this.f);
        t37Var.draw(canvas);
        hf0 hf0Var = this.K;
        if (hf0Var != null) {
            int i3 = this.L;
            int i4 = xea.U0;
            if (i3 != i4) {
                this.L = i4;
                aob.E1(hf0Var, i4, i4);
            }
            hf0Var.setBounds(hl.L(2.0f) + width, hl.L(2.0f), (this.e + width) - hl.L(2.0f), this.f - hl.L(2.0f));
            hf0Var.draw(canvas);
        }
        int i5 = this.I;
        float f2 = this.E - i5;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.i0(width + i5, i5, this.e - (i5 << 1), f2);
        imageReceiver.h(canvas, null);
        aob.o2.setColor(aob.v0(aob.Vc, vnbVar));
        aob.o2.linkColor = aob.v0(aob.Xc, vnbVar);
        canvas.save();
        if (this.G) {
            f = 14.0f;
        } else {
            f = 11.0f;
        }
        int L2 = hl.L(f) + width;
        this.h = L2;
        float f3 = L2;
        int L3 = hl.L(11.0f) + L;
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
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), hl.L(8.0f) + this.f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z) {
        this.J = z;
    }

    public void setDelegate(cq0 cq0Var) {
        this.w = cq0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.K && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
