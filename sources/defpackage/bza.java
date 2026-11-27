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
public final class bza extends FrameLayout {
    public final vnb a;
    public final Drawable b;
    public final Drawable c;
    public final TextView d;
    public final in e;
    public SpannableString f;
    public boolean h;
    public int n;
    public final mm r;

    public bza(Context context, vnb vnbVar) {
        super(context);
        int i;
        this.r = new mm(this, 0L, 500L, k43.h);
        this.a = vnbVar;
        Drawable e = c00.e(context, 2131232776);
        this.b = e;
        yob.x(this, e, aob.h5, vnbVar, PorterDuff.Mode.SRC_IN);
        this.c = c00.e(context, 2131232775);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        ik8.v(textView, 1, 15.0f);
        yob.X(textView, aob.G6, vnbVar);
        addView(textView, tre.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        in inVar = new in(context, false, false, false);
        this.e = inVar;
        inVar.setTextSize(hl.L(15.0f));
        yob.U(inVar, aob.z6, vnbVar);
        if (ob6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        inVar.setGravity(i);
        addView(inVar, tre.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
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
        if (ob6.a0) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        float L2 = hl.L(24.0f);
        float L3 = hl.L(24.0f);
        float L4 = hl.L(2.5f);
        if (ob6.a0) {
            L = (getWidth() - hl.L(19.0f)) - L2;
        } else {
            L = hl.L(19.0f);
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
            vnb vnbVar = this.a;
            if (vnbVar != null) {
                paint = vnbVar.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = aob.j0;
            }
            Paint paint2 = paint;
            if (!ob6.a0) {
                f2 = hl.L(22.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(22.0f);
            } else {
                i = 0;
            }
            canvas.drawRect(f2, measuredHeight2, measuredWidth - i, getMeasuredHeight(), paint2);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
    }
}
