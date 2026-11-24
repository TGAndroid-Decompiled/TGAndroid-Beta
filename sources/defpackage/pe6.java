package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.HashSet;
public class pe6 extends TextView implements vlb {
    public final fg0 a;
    public final qa6 b;
    public int c;
    public final mh6 d;

    public pe6(mh6 mh6Var, Context context) {
        super(context);
        this.d = mh6Var;
        int i = cmb.H6;
        fg0 f0 = cmb.f0(cmb.p1(0.1f, cmb.w0(null, i, false)), 7, -1);
        this.a = f0;
        qa6 qa6Var = new qa6();
        this.b = qa6Var;
        zmb zmbVar = anb.a;
        this.c = cmb.p1(0.1f, cmb.w0(null, i, false));
        f0.setCallback(this);
        qa6Var.D = true;
        qa6Var.u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.Be));
    }

    public boolean b() {
        return true;
    }

    public final void c() {
        CharSequence text;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        b66 b66Var = new b66(0);
        b66Var.q = gm.L(3.0f);
        b66Var.r = gm.L(6.0f);
        int length = text.length();
        b66Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, b66Var);
        RectF rectF = gm.P;
        rectF.set(b66Var.s, b66Var.u, b66Var.t, b66Var.v);
        this.a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        qa6 qa6Var = this.b;
        qa6Var.y = b66Var;
        qa6Var.j(4.0f);
        int themedColor = this.d.getThemedColor(cmb.Be);
        qa6Var.g(cmb.p1(0.85f, themedColor), cmb.p1(2.0f, themedColor), cmb.p1(3.5f, themedColor), cmb.p1(6.0f, themedColor));
        qa6Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        canvas.save();
        if ((getGravity() & 16) != 0 && getLayout() != null) {
            paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        } else {
            paddingTop = getPaddingTop();
        }
        canvas.translate(getPaddingLeft(), paddingTop);
        this.a.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        boolean a = a();
        qa6 qa6Var = this.b;
        if (!a && !qa6Var.d()) {
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), paddingTop);
        qa6Var.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean b = b();
        fg0 fg0Var = this.a;
        if (b && motionEvent.getAction() == 0) {
            fg0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
            fg0Var.setState(new int[]{16842910, 16842919});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
            fg0Var.setState(new int[0]);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        c();
    }

    @Override
    public final void updateColors() {
        try {
            int p1 = cmb.p1(0.1f, cmb.w0(null, cmb.H6, false));
            fg0 fg0Var = this.a;
            if (fg0Var != null && p1 != this.c) {
                cmb.F1(fg0Var, p1, true);
            }
            this.c = p1;
            qa6 qa6Var = this.b;
            if (qa6Var != null) {
                int themedColor = this.d.getThemedColor(cmb.Be);
                qa6Var.g(cmb.p1(0.85f, themedColor), cmb.p1(2.0f, themedColor), cmb.p1(3.5f, themedColor), cmb.p1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
