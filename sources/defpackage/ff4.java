package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.FiltersSetupActivity;
public final class ff4 extends FrameLayout implements tjb {
    public ValueAnimator E;
    public boolean F;
    public final lm G;
    public final Paint H;
    public final FiltersSetupActivity I;
    public final jia a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final ef4 n;
    public boolean r;
    public final r86 s;
    public boolean w;
    public float x;
    public t97 y;

    public ff4(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        wjb wjbVar;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        float f3;
        float f4;
        int i7;
        float f5;
        float f6;
        int i8;
        this.I = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.r = false;
        this.G = new lm(this, 0L, 420L, s33.h);
        this.H = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231631);
        int i9 = bkb.Ki;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i9, null, mode);
        imageView.setContentDescription(k96.M0(2131750693, null));
        imageView.setClickable(true);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(imageView, nme.d(48, 48.0f, i | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(view, nme.d(20, 20.0f, i2 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        jiaVar.setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setTextSize(16);
        jiaVar.setMaxLines(1);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        jiaVar.setGravity(i3 | 16);
        Drawable drawable = getContext().getDrawable(2131232479);
        zkb.x(this, drawable, i9, null, mode);
        jiaVar.i(drawable);
        int i10 = bkb.Ei;
        wjbVar = ((d) filtersSetupActivity).resourceProvider;
        jiaVar.setEmojiColor(bkb.v0(i10, wjbVar));
        boolean z = k96.a0;
        if (z) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i11 = i4 | 48;
        if (z) {
            f = 80.0f;
        } else {
            f = 64.0f;
        }
        if (z) {
            f2 = 64.0f;
        } else {
            f2 = 80.0f;
        }
        addView(jiaVar, nme.d(-1, -2.0f, i11, f, 10.0f, f2, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        zkb.X(textView, bkb.y6, null);
        textView.setTextSize(1, 13.0f);
        if (k96.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        textView.setGravity(i5);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z2 = k96.a0;
        if (z2) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        int i12 = i6 | 48;
        if (z2) {
            f3 = 80.0f;
        } else {
            f3 = 64.0f;
        }
        if (z2) {
            f4 = 64.0f;
        } else {
            f4 = 80.0f;
        }
        addView(textView, nme.d(-2, -2.0f, i12, f3, 35.0f, f4, 0.0f));
        textView.setVisibility(8);
        r86 r86Var = new r86();
        this.s = r86Var;
        r86Var.D = true;
        r86Var.t = 2.0f;
        int i13 = bkb.h6;
        int w0 = bkb.w0(null, i13, false);
        r86Var.g(bkb.p1(0.4f, w0), bkb.p1(1.0f, w0), bkb.p1(0.9f, w0), bkb.p1(1.7f, w0));
        int L = gl.L(1.0f);
        r86Var.x.setStrokeWidth(L);
        r86Var.j(40.0f);
        ef4 ef4Var = new ef4(this, context, L, (byte) 0);
        this.n = ef4Var;
        r86Var.setCallback(ef4Var);
        ef4Var.setFocusable(false);
        ef4Var.setScaleType(scaleType);
        ff0 f0 = bkb.f0(w0, 1, -1);
        vkb M = zkb.M(i13);
        ef4Var.setBackground(f0);
        zkb.j(ef4Var, f0, null, M, null);
        zkb.s(ef4Var, i9, null, mode);
        ef4Var.setContentDescription(k96.M0(2131750692, null));
        ef4Var.setVisibility(8);
        ef4Var.setImageResource(2131232212);
        zkb.s(ef4Var, i9, null, mode);
        boolean z3 = k96.a0;
        if (z3) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        int i14 = i7 | 16;
        if (z3) {
            f5 = 52.0f;
        } else {
            f5 = 6.0f;
        }
        if (z3) {
            f6 = 6.0f;
        } else {
            f6 = 52.0f;
        }
        addView(ef4Var, nme.d(40, 40.0f, i14, f5, 0.0f, f6, 0.0f));
        ef4Var.setOnClickListener(new yj3(this, (byte) 14));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        ff0 f02 = bkb.f0(bkb.w0(null, i13, false), 1, -1);
        vkb M2 = zkb.M(i13);
        imageView2.setBackground(f02);
        zkb.j(imageView2, f02, null, M2, null);
        zkb.s(imageView2, i9, null, mode);
        imageView2.setImageResource(2131232046);
        imageView2.setContentDescription(k96.M0(2131754838, null));
        if (k96.a0) {
            i8 = 3;
        } else {
            i8 = 5;
        }
        addView(imageView2, nme.d(40, 40.0f, i8 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public t97 getCurrentFilter() {
        return this.y;
    }

    public float getDraggingProgress() {
        return this.G.c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        float d = this.G.d(this.F);
        int i = 0;
        if (d > 0.0f) {
            int w0 = bkb.w0(null, bkb.c6, false);
            Paint paint = this.H;
            paint.setColor(w0);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(gl.L(12.0f) * d, 0.0f, gl.L(3.0f), bkb.p1(d, 301989888));
            float L2 = gl.L(8.0f) * d;
            float L3 = gl.L(12.0f) * d;
            canvas.drawRoundRect(L2, 0.0f, getWidth() - L2, getHeight(), L3, L3, paint);
        }
        if (this.w && d < 1.0f) {
            int alpha = bkb.j0.getAlpha();
            bkb.j0.setAlpha((int) ((1.0f - d) * alpha));
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(62.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(62.0f);
            }
            canvas.drawLine(L, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
            bkb.j0.setAlpha(alpha);
        }
        t97 t97Var = this.y;
        if (t97Var != null) {
            boolean z = t97Var.p;
            float f = this.x;
            if (z) {
                if (f != 1.0f) {
                    this.x = f + 0.10666667f;
                    invalidate();
                }
            } else if (f != 0.0f) {
                this.x = f - 0.10666667f;
                invalidate();
            }
        }
        float i2 = Utilities.i(this.x, 1.0f, 0.0f);
        this.x = i2;
        jia jiaVar = this.a;
        jiaVar.setRightDrawableScale(i2);
        jiaVar.invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
    }

    public void setDragging(boolean z) {
        if (this.F == z) {
            return;
        }
        this.F = z;
        invalidate();
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.c.setOnTouchListener(onTouchListener);
    }

    @Override
    public final void updateColors() {
        wjb wjbVar;
        try {
            jia jiaVar = this.a;
            if (jiaVar != null) {
                int i = bkb.Ei;
                wjbVar = ((d) this.I).resourceProvider;
                jiaVar.setEmojiColor(bkb.v0(i, wjbVar));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
