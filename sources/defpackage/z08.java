package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;
public final class z08 extends FrameLayout implements jq3 {
    public final TextView a;
    public final TextView b;
    public final de0 c;
    public final g29 d;
    public int e;
    public oy9 f;
    public final int h;
    public final b18 n;

    public z08(b18 b18Var, Activity activity) {
        super(activity);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.n = b18Var;
        i = ((e) b18Var).currentAccount;
        this.h = lq3.q(i).k();
        this.d = new g29(this);
        de0 de0Var = new de0(activity);
        this.c = de0Var;
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(de0Var, tre.d(48, 48.0f, i2 | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.a = textView;
        yob.X(textView, aob.G6, null);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        boolean z = ob6.a0;
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
        addView(textView, tre.d(-2, -2.0f, i9, f, 10.0f, i6, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        yob.X(textView2, aob.z6, null);
        textView2.setTextSize(1, 13.0f);
        if (ob6.a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView2.setGravity(i7);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z2 = ob6.a0;
        int i10 = (z2 ? 5 : 3) | 48;
        if (z2) {
            i8 = 21;
        } else {
            i8 = 81;
        }
        addView(textView2, tre.d(-2, -2.0f, i10, i8, 35.0f, z2 ? 81 : 21, 0.0f));
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
        String r = xb4.r(null, this.f);
        xb4.G(yac.t0);
        boolean exists = xb4.I(this.f).exists();
        boolean isEmpty = TextUtils.isEmpty(r);
        g29 g29Var = this.d;
        if (isEmpty) {
            g29Var.d(null, false, false);
            return;
        }
        oy9 oy9Var = this.f;
        String str = oy9Var.c;
        float f = 0.0f;
        b18 b18Var = this.n;
        if (str != null) {
            if (oy9Var.d != null) {
                i4 = ((e) b18Var).currentAccount;
                lq3.q(i4).v(this);
                g29Var.d(null, false, z);
                this.e = -1;
                return;
            }
            i3 = ((e) b18Var).currentAccount;
            lq3.q(i3).a(this.f.c, null, this);
            this.e = 1;
            Float s = in5.z().s(this.f.c);
            g29Var.d(getResources().getDrawable(2131231007), true, z);
            if (s != null) {
                f = s.floatValue();
            }
            g29Var.e(false, f);
            invalidate();
        } else if (exists) {
            i2 = ((e) b18Var).currentAccount;
            lq3.q(i2).v(this);
            this.e = -1;
            g29Var.d(null, false, z);
            invalidate();
        } else {
            i = ((e) b18Var).currentAccount;
            lq3.q(i).a(r, null, this);
            this.e = 1;
            Float s2 = in5.z().s(r);
            g29Var.d(getResources().getDrawable(2131231007), true, z);
            if (s2 != null) {
                f = s2.floatValue();
            }
            g29Var.e(z, f);
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
        if (ob6.a0) {
            L = 0.0f;
        } else {
            L = hl.L(20.0f);
        }
        float f = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (ob6.a0) {
            i = hl.L(20.0f);
        } else {
            i = 0;
        }
        canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        de0 de0Var = this.c;
        int measuredWidth = ((de0Var.getMeasuredWidth() - hl.L(24.0f)) / 2) + de0Var.getLeft();
        int measuredHeight = ((de0Var.getMeasuredHeight() - hl.L(24.0f)) / 2) + de0Var.getTop();
        this.d.f(measuredWidth, measuredHeight, hl.L(24.0f) + measuredWidth, hl.L(24.0f) + measuredHeight);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), ik8.E(64.0f, 1, 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
