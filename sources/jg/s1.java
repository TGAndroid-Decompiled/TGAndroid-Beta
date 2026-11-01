package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.j6;
public final class s1 extends TextView {
    public boolean f10212a;
    public Drawable f10213b;

    public s1(Context context) {
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
        canvas.translate(0.0f, org.telegram.messenger.i0.L(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.f10212a) {
            int y3 = a30.y(16.0f, getHeight(), 2);
            if (dd.X) {
                this.f10213b.setBounds(org.telegram.messenger.i0.L(7.0f), y3, org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(16.0f) + y3);
            } else {
                this.f10213b.setBounds(getWidth() - org.telegram.messenger.i0.L(23.0f), y3, getWidth() - org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(16.0f) + y3);
            }
            this.f10213b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        float f7;
        this.f10212a = z10;
        if (z10) {
            float f10 = 12.0f;
            if (dd.X) {
                f7 = 27.0f;
            } else {
                f7 = 12.0f;
            }
            int L = org.telegram.messenger.i0.L(f7);
            int L2 = org.telegram.messenger.i0.L(6.0f);
            if (!dd.X) {
                f10 = 27.0f;
            }
            setPadding(L, L2, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(6.0f));
            setBackground(j6.d(0, j6.b(1090519039), org.telegram.messenger.i0.L(32.0f)));
        } else {
            setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(14.0f));
            setBackground(j6.d(0, j6.b(-14145495), 0.0f));
        }
        if (this.f10212a && this.f10213b == null) {
            Drawable drawable = getContext().getDrawable(2131232521);
            this.f10213b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
