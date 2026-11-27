package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
public final class mv7 extends TextView {
    public boolean a;
    public Drawable b;

    public mv7(Context context) {
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
        canvas.translate(0.0f, hl.L(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.a) {
            int D = ik8.D(16.0f, getHeight(), 2);
            boolean z = ob6.a0;
            Drawable drawable = this.b;
            if (z) {
                drawable.setBounds(hl.L(7.0f), D, hl.L(23.0f), hl.L(16.0f) + D);
            } else {
                drawable.setBounds(getWidth() - hl.L(23.0f), D, getWidth() - hl.L(7.0f), hl.L(16.0f) + D);
            }
            this.b.draw(canvas);
        }
    }

    public void setCurrent(boolean z) {
        float f;
        this.a = z;
        if (z) {
            float f2 = 12.0f;
            if (ob6.a0) {
                f = 27.0f;
            } else {
                f = 12.0f;
            }
            int L = hl.L(f);
            int L2 = hl.L(6.0f);
            if (!ob6.a0) {
                f2 = 27.0f;
            }
            setPadding(L, L2, hl.L(f2), hl.L(6.0f));
            setBackground(rnb.d(0, rnb.b(1090519039), hl.L(32.0f)));
        } else {
            setPadding(hl.L(24.0f), hl.L(14.0f), hl.L(24.0f), hl.L(14.0f));
            setBackground(rnb.d(0, rnb.b(-14145495), 0.0f));
        }
        if (this.a && this.b == null) {
            Drawable drawable = getContext().getDrawable(2131232538);
            this.b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
