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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.FiltersSetupActivity;
public final class eh4 extends FrameLayout implements snb {
    public ValueAnimator E;
    public boolean F;
    public final mm G;
    public final Paint H;
    public final FiltersSetupActivity I;
    public final ema a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final dh4 n;
    public boolean r;
    public final va6 s;
    public boolean w;
    public float x;
    public ac7 y;

    public eh4(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        vnb vnbVar;
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
        this.G = new mm(this, 0L, 420L, k43.h);
        this.H = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231631);
        int i9 = aob.Li;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i9, null, mode);
        imageView.setContentDescription(ob6.M0(2131750670, null));
        imageView.setClickable(true);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(imageView, tre.d(48, 48.0f, i | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(view, tre.d(20, 20.0f, i2 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        ema emaVar = new ema(context);
        this.a = emaVar;
        emaVar.setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
        yob.W(emaVar, aob.G6, null);
        emaVar.setTextSize(16);
        emaVar.setMaxLines(1);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        emaVar.setGravity(i3 | 16);
        Drawable drawable = getContext().getDrawable(2131232490);
        yob.x(this, drawable, i9, null, mode);
        emaVar.i(drawable);
        int i10 = aob.Fi;
        vnbVar = ((e) filtersSetupActivity).resourceProvider;
        emaVar.setEmojiColor(aob.v0(i10, vnbVar));
        boolean z = ob6.a0;
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
        addView(emaVar, tre.d(-1, -2.0f, i11, f, 10.0f, f2, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        yob.X(textView, aob.z6, null);
        textView.setTextSize(1, 13.0f);
        if (ob6.a0) {
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
        boolean z2 = ob6.a0;
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
        addView(textView, tre.d(-2, -2.0f, i12, f3, 35.0f, f4, 0.0f));
        textView.setVisibility(8);
        va6 va6Var = new va6();
        this.s = va6Var;
        va6Var.D = true;
        va6Var.t = 2.0f;
        int i13 = aob.i6;
        int w0 = aob.w0(null, i13, false);
        va6Var.g(aob.p1(0.4f, w0), aob.p1(1.0f, w0), aob.p1(0.9f, w0), aob.p1(1.7f, w0));
        int L = hl.L(1.0f);
        va6Var.x.setStrokeWidth(L);
        va6Var.j(40.0f);
        dh4 dh4Var = new dh4(this, context, L, (byte) 0);
        this.n = dh4Var;
        va6Var.setCallback(dh4Var);
        dh4Var.setFocusable(false);
        dh4Var.setScaleType(scaleType);
        hf0 f0 = aob.f0(w0, 1, -1);
        uob M = yob.M(i13);
        dh4Var.setBackground(f0);
        yob.j(dh4Var, f0, null, M, null);
        yob.s(dh4Var, i9, null, mode);
        dh4Var.setContentDescription(ob6.M0(2131750669, null));
        dh4Var.setVisibility(8);
        dh4Var.setImageResource(2131232212);
        yob.s(dh4Var, i9, null, mode);
        boolean z3 = ob6.a0;
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
        addView(dh4Var, tre.d(40, 40.0f, i14, f5, 0.0f, f6, 0.0f));
        dh4Var.setOnClickListener(new mh3(this, (byte) 16));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        hf0 f02 = aob.f0(aob.w0(null, i13, false), 1, -1);
        uob M2 = yob.M(i13);
        imageView2.setBackground(f02);
        yob.j(imageView2, f02, null, M2, null);
        yob.s(imageView2, i9, null, mode);
        imageView2.setImageResource(2131232046);
        imageView2.setContentDescription(ob6.M0(2131754834, null));
        if (ob6.a0) {
            i8 = 3;
        } else {
            i8 = 5;
        }
        addView(imageView2, tre.d(40, 40.0f, i8 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public ac7 getCurrentFilter() {
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
            int w0 = aob.w0(null, aob.d6, false);
            Paint paint = this.H;
            paint.setColor(w0);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(hl.L(12.0f) * d, 0.0f, hl.L(3.0f), aob.p1(d, 301989888));
            float L2 = hl.L(8.0f) * d;
            float L3 = hl.L(12.0f) * d;
            canvas.drawRoundRect(L2, 0.0f, getWidth() - L2, getHeight(), L3, L3, paint);
        }
        if (this.w && d < 1.0f) {
            int alpha = aob.j0.getAlpha();
            aob.j0.setAlpha((int) ((1.0f - d) * alpha));
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(62.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(62.0f);
            }
            canvas.drawLine(L, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
            aob.j0.setAlpha(alpha);
        }
        ac7 ac7Var = this.y;
        if (ac7Var != null) {
            boolean z = ac7Var.p;
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
        ema emaVar = this.a;
        emaVar.setRightDrawableScale(i2);
        emaVar.invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
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
        vnb vnbVar;
        try {
            ema emaVar = this.a;
            if (emaVar != null) {
                int i = aob.Fi;
                vnbVar = ((e) this.I).resourceProvider;
                emaVar.setEmojiColor(aob.v0(i, vnbVar));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
