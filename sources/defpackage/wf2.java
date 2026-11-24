package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Components.CheckBoxBase;
public class wf2 extends View {
    public final CheckBoxBase a;
    public Drawable b;
    public int c;

    public wf2(int i, wjb wjbVar, Context context) {
        super(context);
        this.a = new CheckBoxBase(i, wjbVar, this);
    }

    public final void a(boolean z, boolean z2) {
        this.a.f(-1, z, z2);
    }

    public final void b(int i, int i2, int i3) {
        this.a.h(i, i2, i3);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.a;
    }

    public boolean getDrawUnchecked() {
        return this.a.z;
    }

    public float getProgress() {
        return this.a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.b;
            drawable.setBounds(oo1.A(2, measuredWidth, drawable), oo1.y(2, measuredHeight, this.b), oo1.w(2, measuredWidth, this.b), oo1.i(2, measuredHeight, this.b));
            this.b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gl.L(1.2f));
            paint.setColor(bkb.w0(null, bkb.T6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - gl.L(1.5f), paint);
            return;
        }
        this.a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.a.q);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.e(0, 0, i3 - i, i4 - i2);
    }

    public void setCirclePaintProvider(js4 js4Var) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.G == js4Var) {
            return;
        }
        checkBoxBase.G = js4Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i) {
        this.a.d(i);
    }

    public void setDrawUnchecked(boolean z) {
        this.a.k(z);
    }

    public void setDuration(long j) {
        this.a.H = j;
    }

    @Override
    public void setEnabled(boolean z) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.k != z) {
            checkBoxBase.k = z;
            checkBoxBase.b();
        }
        super.setEnabled(z);
    }

    public void setForbidden(boolean z) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.n == z) {
            return;
        }
        checkBoxBase.n = z;
        checkBoxBase.b();
    }

    public void setIcon(int i) {
        if (i != this.c) {
            this.c = i;
            if (i == 0) {
                this.b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i).mutate();
            this.b = mutate;
            zkb.x(this, mutate, bkb.T6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i) {
        String str;
        CheckBoxBase checkBoxBase = this.a;
        if (i >= 0) {
            checkBoxBase.getClass();
            str = String.valueOf(i + 1);
        } else if (checkBoxBase.p != null) {
            str = checkBoxBase.C;
        } else {
            str = null;
        }
        String str2 = checkBoxBase.C;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        checkBoxBase.C = str;
        checkBoxBase.b();
    }

    public void setProgressDelegate(xf2 xf2Var) {
        this.a.D = xf2Var;
    }
}
