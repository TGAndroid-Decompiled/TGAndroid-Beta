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
public final class hh4 extends FrameLayout implements vlb {
    public ValueAnimator E;
    public boolean F;
    public final ln G;
    public final Paint H;
    public final FiltersSetupActivity I;
    public final lka a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final gh4 n;
    public boolean r;
    public final qa6 s;
    public boolean w;
    public float x;
    public ub7 y;

    public hh4(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        ylb ylbVar;
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
        this.G = new ln(this, 0L, 420L, d53.h);
        this.H = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231632);
        int i9 = cmb.Ki;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i9, null, mode);
        imageView.setContentDescription(jb6.M0(2131750642, null));
        imageView.setClickable(true);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(imageView, qoe.d(48, 48.0f, i | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(view, qoe.d(20, 20.0f, i2 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        lkaVar.setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
        anb.W(lkaVar, cmb.F6, null);
        lkaVar.setTextSize(16);
        lkaVar.setMaxLines(1);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        lkaVar.setGravity(i3 | 16);
        Drawable drawable = getContext().getDrawable(2131232491);
        anb.x(this, drawable, i9, null, mode);
        lkaVar.i(drawable);
        int i10 = cmb.Ei;
        ylbVar = ((d) filtersSetupActivity).resourceProvider;
        lkaVar.setEmojiColor(cmb.v0(i10, ylbVar));
        boolean z = jb6.a0;
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
        addView(lkaVar, qoe.d(-1, -2.0f, i11, f, 10.0f, f2, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        anb.X(textView, cmb.y6, null);
        textView.setTextSize(1, 13.0f);
        if (jb6.a0) {
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
        boolean z2 = jb6.a0;
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
        addView(textView, qoe.d(-2, -2.0f, i12, f3, 35.0f, f4, 0.0f));
        textView.setVisibility(8);
        qa6 qa6Var = new qa6();
        this.s = qa6Var;
        qa6Var.D = true;
        qa6Var.t = 2.0f;
        int i13 = cmb.h6;
        int w0 = cmb.w0(null, i13, false);
        qa6Var.g(cmb.p1(0.4f, w0), cmb.p1(1.0f, w0), cmb.p1(0.9f, w0), cmb.p1(1.7f, w0));
        int L = gm.L(1.0f);
        qa6Var.x.setStrokeWidth(L);
        qa6Var.j(40.0f);
        gh4 gh4Var = new gh4(this, context, L, (byte) 0);
        this.n = gh4Var;
        qa6Var.setCallback(gh4Var);
        gh4Var.setFocusable(false);
        gh4Var.setScaleType(scaleType);
        fg0 f0 = cmb.f0(w0, 1, -1);
        wmb M = anb.M(i13);
        gh4Var.setBackground(f0);
        anb.j(gh4Var, f0, null, M, null);
        anb.s(gh4Var, i9, null, mode);
        gh4Var.setContentDescription(jb6.M0(2131750641, null));
        gh4Var.setVisibility(8);
        gh4Var.setImageResource(2131232213);
        anb.s(gh4Var, i9, null, mode);
        boolean z3 = jb6.a0;
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
        addView(gh4Var, qoe.d(40, 40.0f, i14, f5, 0.0f, f6, 0.0f));
        gh4Var.setOnClickListener(new sf3(this, (byte) 17));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        fg0 f02 = cmb.f0(cmb.w0(null, i13, false), 1, -1);
        wmb M2 = anb.M(i13);
        imageView2.setBackground(f02);
        anb.j(imageView2, f02, null, M2, null);
        anb.s(imageView2, i9, null, mode);
        imageView2.setImageResource(2131232047);
        imageView2.setContentDescription(jb6.M0(2131754838, null));
        if (jb6.a0) {
            i8 = 3;
        } else {
            i8 = 5;
        }
        addView(imageView2, qoe.d(40, 40.0f, i8 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public ub7 getCurrentFilter() {
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
            int w0 = cmb.w0(null, cmb.c6, false);
            Paint paint = this.H;
            paint.setColor(w0);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(gm.L(12.0f) * d, 0.0f, gm.L(3.0f), cmb.p1(d, 301989888));
            float L2 = gm.L(8.0f) * d;
            float L3 = gm.L(12.0f) * d;
            canvas.drawRoundRect(L2, 0.0f, getWidth() - L2, getHeight(), L3, L3, paint);
        }
        if (this.w && d < 1.0f) {
            int alpha = cmb.j0.getAlpha();
            cmb.j0.setAlpha((int) ((1.0f - d) * alpha));
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(62.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(62.0f);
            }
            canvas.drawLine(L, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
            cmb.j0.setAlpha(alpha);
        }
        ub7 ub7Var = this.y;
        if (ub7Var != null) {
            boolean z = ub7Var.p;
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
        lka lkaVar = this.a;
        lkaVar.setRightDrawableScale(i2);
        lkaVar.invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
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
        ylb ylbVar;
        try {
            lka lkaVar = this.a;
            if (lkaVar != null) {
                int i = cmb.Ei;
                ylbVar = ((d) this.I).resourceProvider;
                lkaVar.setEmojiColor(cmb.v0(i, ylbVar));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
