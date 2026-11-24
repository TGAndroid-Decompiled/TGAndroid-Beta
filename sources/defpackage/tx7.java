package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public final class tx7 extends FrameLayout implements sp3 {
    public final TextView a;
    public final TextView b;
    public final be0 c;
    public final ty8 d;
    public int e;
    public uu9 f;
    public final int h;
    public final vx7 n;

    public tx7(vx7 vx7Var, Activity activity) {
        super(activity);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.n = vx7Var;
        i = ((d) vx7Var).currentAccount;
        this.h = up3.q(i).k();
        this.d = new ty8(this);
        be0 be0Var = new be0(activity);
        this.c = be0Var;
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(be0Var, nme.d(48, 48.0f, i2 | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.a = textView;
        zkb.X(textView, bkb.F6, null);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        boolean z = k96.a0;
        if (z) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i9 = i4 | 48;
        if (z) {
            i5 = 21;
        } else {
            i5 = 81;
        }
        float f = i5;
        if (z) {
            i6 = 81;
        } else {
            i6 = 21;
        }
        addView(textView, nme.d(-2, -2.0f, i9, f, 10.0f, i6, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        zkb.X(textView2, bkb.y6, null);
        textView2.setTextSize(1, 13.0f);
        if (k96.a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView2.setGravity(i7);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z2 = k96.a0;
        int i10 = (z2 ? 5 : 3) | 48;
        if (z2) {
            i8 = 21;
        } else {
            i8 = 81;
        }
        addView(textView2, nme.d(-2, -2.0f, i10, i8, 35.0f, z2 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void B(boolean z) {
        a(false);
    }

    @Override
    public final void N(String str) {
        this.d.e(true, 1.0f);
        a(true);
    }

    public final void a(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        String r = ba4.r(null, this.f);
        ba4.G(y6c.t0);
        boolean exists = ba4.I(this.f).exists();
        boolean isEmpty = TextUtils.isEmpty(r);
        ty8 ty8Var = this.d;
        if (isEmpty) {
            ty8Var.d(null, false, false);
            return;
        }
        uu9 uu9Var = this.f;
        String str = uu9Var.c;
        float f = 0.0f;
        vx7 vx7Var = this.n;
        if (str != null) {
            if (uu9Var.d != null) {
                i4 = ((d) vx7Var).currentAccount;
                up3.q(i4).v(this);
                ty8Var.d(null, false, z);
                this.e = -1;
                return;
            }
            i3 = ((d) vx7Var).currentAccount;
            up3.q(i3).a(this.f.c, null, this);
            this.e = 1;
            Float s = fl5.z().s(this.f.c);
            ty8Var.d(getResources().getDrawable(2131231007), true, z);
            if (s != null) {
                f = s.floatValue();
            }
            ty8Var.e(false, f);
            invalidate();
        } else if (exists) {
            i2 = ((d) vx7Var).currentAccount;
            up3.q(i2).v(this);
            this.e = -1;
            ty8Var.d(null, false, z);
            invalidate();
        } else {
            i = ((d) vx7Var).currentAccount;
            up3.q(i).a(r, null, this);
            this.e = 1;
            Float s2 = fl5.z().s(r);
            ty8Var.d(getResources().getDrawable(2131231007), true, z);
            if (s2 != null) {
                f = s2.floatValue();
            }
            ty8Var.e(z, f);
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.c) {
            this.d.a(canvas);
        }
        return drawChild;
    }

    @Override
    public int getObserverTag() {
        return this.h;
    }

    @Override
    public final void i(long j, long j2) {
        this.d.e(true, Math.min(1.0f, ((float) j) / ((float) j2)));
        if (this.e != 1) {
            a(false);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public final void l(long j, long j2) {
        this.d.e(true, Math.min(1.0f, ((float) j) / ((float) j2)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (k96.a0) {
            L = 0.0f;
        } else {
            L = gl.L(20.0f);
        }
        float f = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (k96.a0) {
            i = gl.L(20.0f);
        } else {
            i = 0;
        }
        canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        be0 be0Var = this.c;
        int measuredWidth = ((be0Var.getMeasuredWidth() - gl.L(24.0f)) / 2) + be0Var.getLeft();
        int measuredHeight = ((be0Var.getMeasuredHeight() - gl.L(24.0f)) / 2) + be0Var.getTop();
        this.d.f(measuredWidth, measuredHeight, gl.L(24.0f) + measuredWidth, gl.L(24.0f) + measuredHeight);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), ug8.E(64.0f, 1, 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
