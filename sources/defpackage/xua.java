package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class xua extends FrameLayout {
    public final wjb a;
    public final Drawable b;
    public final Drawable c;
    public final TextView d;
    public final hn e;
    public SpannableString f;
    public boolean h;
    public int n;
    public final lm r;

    public xua(Context context, wjb wjbVar) {
        super(context);
        int i;
        this.r = new lm(this, 0L, 500L, s33.h);
        this.a = wjbVar;
        Drawable d = b00.d(context, 2131232758);
        this.b = d;
        zkb.x(this, d, bkb.g5, wjbVar, PorterDuff.Mode.SRC_IN);
        this.c = b00.d(context, 2131232757);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        ug8.v(textView, 1, 15.0f);
        zkb.X(textView, bkb.F6, wjbVar);
        addView(textView, nme.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        hn hnVar = new hn(context, false, false, false);
        this.e = hnVar;
        hnVar.setTextSize(gl.L(15.0f));
        zkb.U(hnVar, bkb.y6, wjbVar);
        if (k96.a0) {
            i = 3;
        } else {
            i = 5;
        }
        hnVar.setGravity(i);
        addView(hnVar, nme.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float L;
        float f2;
        Paint paint;
        int i;
        super.onDraw(canvas);
        float e = this.r.e(false, this.n);
        if (k96.a0) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        float L2 = gl.L(24.0f);
        float L3 = gl.L(24.0f);
        float L4 = gl.L(2.5f);
        if (k96.a0) {
            L = (getWidth() - gl.L(19.0f)) - L2;
        } else {
            L = gl.L(19.0f);
        }
        int ceil = (int) Math.ceil(e);
        while (true) {
            ceil--;
            f2 = 0.0f;
            if (ceil < 0) {
                break;
            }
            float i2 = Utilities.i(e - ceil, 1.0f, 0.0f);
            float f3 = (((ceil - 1) - (1.0f - i2)) * L4 * f) + L;
            float measuredHeight = (getMeasuredHeight() - L3) / 2.0f;
            int i3 = (int) f3;
            int i4 = (int) measuredHeight;
            int i5 = (int) (f3 + L2);
            int i6 = (int) (measuredHeight + L3);
            Drawable drawable = this.b;
            drawable.setBounds(i3, i4, i5, i6);
            int i7 = (int) (i2 * 255.0f);
            drawable.setAlpha(i7);
            drawable.draw(canvas);
            Drawable drawable2 = this.c;
            drawable2.setBounds(i3, i4, i5, i6);
            drawable2.setAlpha(i7);
            drawable2.draw(canvas);
        }
        if (this.h) {
            wjb wjbVar = this.a;
            if (wjbVar != null) {
                paint = wjbVar.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = bkb.j0;
            }
            Paint paint2 = paint;
            if (!k96.a0) {
                f2 = gl.L(22.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(22.0f);
            } else {
                i = 0;
            }
            canvas.drawRect(f2, measuredHeight2, measuredWidth - i, getMeasuredHeight(), paint2);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }
}
