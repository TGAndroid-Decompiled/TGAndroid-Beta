package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public final class vz7 extends FrameLayout implements cr3 {
    public final TextView a;
    public final TextView b;
    public final bf0 c;
    public final u09 d;
    public int e;
    public xw9 f;
    public final int h;
    public final xz7 n;

    public vz7(xz7 xz7Var, Activity activity) {
        super(activity);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.n = xz7Var;
        i = ((d) xz7Var).currentAccount;
        this.h = er3.q(i).k();
        this.d = new u09(this);
        bf0 bf0Var = new bf0(activity);
        this.c = bf0Var;
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(bf0Var, qoe.d(48, 48.0f, i2 | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.a = textView;
        anb.X(textView, cmb.F6, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        boolean z = jb6.a0;
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
        addView(textView, qoe.d(-2, -2.0f, i9, f, 10.0f, i6, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        anb.X(textView2, cmb.y6, null);
        textView2.setTextSize(1, 13.0f);
        if (jb6.a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView2.setGravity(i7);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z2 = jb6.a0;
        int i10 = (z2 ? 5 : 3) | 48;
        if (z2) {
            i8 = 21;
        } else {
            i8 = 81;
        }
        addView(textView2, qoe.d(-2, -2.0f, i10, i8, 35.0f, z2 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void A(boolean z) {
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
        String r = bc4.r(null, this.f);
        bc4.G(z8c.t0);
        boolean exists = bc4.I(this.f).exists();
        boolean isEmpty = TextUtils.isEmpty(r);
        u09 u09Var = this.d;
        if (isEmpty) {
            u09Var.d(null, false, false);
            return;
        }
        xw9 xw9Var = this.f;
        String str = xw9Var.c;
        float f = 0.0f;
        xz7 xz7Var = this.n;
        if (str != null) {
            if (xw9Var.d != null) {
                i4 = ((d) xz7Var).currentAccount;
                er3.q(i4).v(this);
                u09Var.d(null, false, z);
                this.e = -1;
                return;
            }
            i3 = ((d) xz7Var).currentAccount;
            er3.q(i3).a(this.f.c, null, this);
            this.e = 1;
            Float s = fn5.z().s(this.f.c);
            u09Var.d(getResources().getDrawable(2131231008), true, z);
            if (s != null) {
                f = s.floatValue();
            }
            u09Var.e(false, f);
            invalidate();
        } else if (exists) {
            i2 = ((d) xz7Var).currentAccount;
            er3.q(i2).v(this);
            this.e = -1;
            u09Var.d(null, false, z);
            invalidate();
        } else {
            i = ((d) xz7Var).currentAccount;
            er3.q(i).a(r, null, this);
            this.e = 1;
            Float s2 = fn5.z().s(r);
            u09Var.d(getResources().getDrawable(2131231008), true, z);
            if (s2 != null) {
                f = s2.floatValue();
            }
            u09Var.e(z, f);
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
        if (jb6.a0) {
            L = 0.0f;
        } else {
            L = gm.L(20.0f);
        }
        float f = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (jb6.a0) {
            i = gm.L(20.0f);
        } else {
            i = 0;
        }
        canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bf0 bf0Var = this.c;
        int measuredWidth = ((bf0Var.getMeasuredWidth() - gm.L(24.0f)) / 2) + bf0Var.getLeft();
        int measuredHeight = ((bf0Var.getMeasuredHeight() - gm.L(24.0f)) / 2) + bf0Var.getTop();
        this.d.f(measuredWidth, measuredHeight, gm.L(24.0f) + measuredWidth, gm.L(24.0f) + measuredHeight);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), wi8.E(64.0f, 1, 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
