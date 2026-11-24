package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
public final class gs7 extends TextView {
    public boolean a;
    public Drawable b;

    public gs7(Context context) {
        super(context);
        setTextColor(-1);
        setTextSize(1, 14.0f);
        setCurrent(false);
        setEllipsize(TextUtils.TruncateAt.END);
        setSingleLine();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, gl.L(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.a) {
            int D = ug8.D(16.0f, getHeight(), 2);
            boolean z = k96.a0;
            Drawable drawable = this.b;
            if (z) {
                drawable.setBounds(gl.L(7.0f), D, gl.L(23.0f), gl.L(16.0f) + D);
            } else {
                drawable.setBounds(getWidth() - gl.L(23.0f), D, getWidth() - gl.L(7.0f), gl.L(16.0f) + D);
            }
            this.b.draw(canvas);
        }
    }

    public void setCurrent(boolean z) {
        float f;
        this.a = z;
        if (z) {
            float f2 = 12.0f;
            if (k96.a0) {
                f = 27.0f;
            } else {
                f = 12.0f;
            }
            int L = gl.L(f);
            int L2 = gl.L(6.0f);
            if (!k96.a0) {
                f2 = 27.0f;
            }
            setPadding(L, L2, gl.L(f2), gl.L(6.0f));
            setBackground(sjb.d(0, sjb.b(1090519039), gl.L(32.0f)));
        } else {
            setPadding(gl.L(24.0f), gl.L(14.0f), gl.L(24.0f), gl.L(14.0f));
            setBackground(sjb.d(0, sjb.b(-14145495), 0.0f));
        }
        if (this.a && this.b == null) {
            Drawable drawable = getContext().getDrawable(2131232527);
            this.b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
