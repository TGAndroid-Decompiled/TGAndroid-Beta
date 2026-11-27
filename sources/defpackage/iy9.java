package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class iy9 extends FrameLayout {
    public final byte a;
    public Object b;
    public Object c;

    public iy9(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 3:
                super(context);
                ImageView imageView = new ImageView(context);
                this.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, tre.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(hl.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, tre.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                return;
            default:
                return;
        }
    }

    public final void a(int i, CharSequence charSequence, boolean z) {
        ImageView imageView = (ImageView) this.b;
        if (z) {
            hl.L3(imageView, i);
        } else {
            imageView.setImageResource(i);
        }
        ((TextView) this.c).setText(charSequence);
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 7:
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Rect rect;
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                ky9 ky9Var = (ky9) this.c;
                RectF rectF = ky9Var.S;
                if (view != ky9Var.O && view != ky9Var.y) {
                    if (view == ky9Var.Q) {
                        canvas.save();
                        path.rewind();
                        path.addCircle(rectF.centerX() + ky9Var.O.getX(), rectF.centerY() + ky9Var.O.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path);
                        canvas.clipRect(0.0f, hl.R1(ky9Var.U, 0.0f, ky9Var.s), getWidth(), hl.R1(ky9Var.V, getHeight(), ky9Var.s));
                        canvas.translate(-ky9Var.Q.getX(), -ky9Var.Q.getY());
                        canvas.translate(ky9Var.O.getX() + rectF.left, ky9Var.O.getY() + rectF.top);
                        canvas.scale(rectF.width() / ky9Var.Q.getMeasuredWidth(), rectF.height() / ky9Var.Q.getMeasuredHeight(), ky9Var.Q.getX(), ky9Var.Q.getY());
                        boolean drawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return drawChild;
                    }
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, hl.R1(ky9Var.U, 0.0f, ky9Var.s), getWidth(), hl.R1(ky9Var.V, getHeight(), ky9Var.s));
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            case 1:
                if (view == ((n1a) this.c).i0 && ri5.b && ri5.f) {
                    for (int i = 0; i < ((n1a) this.c).i0.getChildCount(); i++) {
                        View childAt = ((n1a) this.c).i0.getChildAt(i);
                        if (childAt instanceof w0a) {
                            w0a w0aVar = (w0a) childAt;
                            if (w0aVar.getAnimatedScale() == 1.0f) {
                                ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.b);
                                super.drawChild(canvas, view, j);
                                canvas.restore();
                            } else if (w0aVar.getAnimatedScale() > 0.0f) {
                                ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.b).set((int) (rect.centerX() - (w0aVar.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (w0aVar.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((w0aVar.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((w0aVar.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.b);
                                canvas.scale(w0aVar.getAnimatedScale(), w0aVar.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                                super.drawChild(canvas, view, j);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof r0a) || (childAt instanceof q0a) || (childAt instanceof s0a)) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j);
            case 7:
                uqc uqcVar = (uqc) this.c;
                if (view == uqcVar.v0 && uqcVar.G) {
                    int save = canvas.save();
                    canvas.concat(uqcVar.J);
                    boolean drawChild3 = super.drawChild(canvas, view, j);
                    canvas.restoreToCount(save);
                    return drawChild3;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void invalidate() {
        switch (this.a) {
            case 5:
                super.invalidate();
                l7 l7Var = ((pqb) this.c).v0;
                if (l7Var != null) {
                    l7Var.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 7:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((es1) this.b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 7:
                getViewTreeObserver().removeOnPreDrawListener((es1) this.b);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                int intrinsicHeight = aob.i3.getIntrinsicHeight();
                aob.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                aob.i3.draw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(((pqb) this.c).getThemedColor(aob.Je));
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                return;
            case 5:
                int[] iArr = (int[]) this.b;
                pqb pqbVar = (pqb) this.c;
                if (!hl.D) {
                    getLocationInWindow(iArr);
                    float translationY = pqbVar.u0.getTranslationY();
                    int i = iArr[1];
                    if (translationY != i) {
                        pqbVar.u0.setTranslationY(-i);
                        pqbVar.v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < pqbVar.R) {
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                canvas.save();
                clc clcVar = ((dlc) this.c).b;
                canvas.scale(clcVar.getScaleX(), clcVar.getScaleY(), clcVar.getPivotX() + clcVar.getLeft(), clcVar.getPivotY() + clcVar.getTop());
                Drawable drawable = (Drawable) this.b;
                drawable.setBounds(clcVar.getLeft() - hl.L(2.0f), clcVar.getTop() - hl.L(2.0f), hl.L(2.0f) + clcVar.getRight(), hl.L(2.0f) + clcVar.getBottom());
                drawable.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float f;
        boolean z2;
        float f2;
        float f3;
        StaticLayout staticLayout;
        float f4;
        switch (this.a) {
            case 3:
                float f5 = 8.0f;
                int size = View.MeasureSpec.getSize(i) - hl.L(8.0f);
                TextView textView = (TextView) this.c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(hl.L(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f6 = size;
                    if (measureText > f6) {
                        textPaint.setTextSize(hl.L(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                if (textPaint.measureText(split[i5]) > f6) {
                                    staticLayout = null;
                                    z = true;
                                    f4 = 12.0f;
                                    i3 = 2;
                                } else {
                                    i5++;
                                }
                            } else {
                                f4 = 12.0f;
                                z = true;
                                i3 = 2;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                        }
                        if (staticLayout != null && staticLayout.getLineCount() <= i3) {
                            i4 = i3;
                            f = 11.0f;
                        } else {
                            f = Math.max(8.0f, (f6 * f4) / measureText);
                            i4 = z ? 1 : 0;
                        }
                    } else {
                        z = true;
                        i3 = 2;
                        i4 = 1;
                        f = 12.0f;
                    }
                    textView.setTextSize(z ? 1 : 0, f);
                    textView.setMaxLines(i4);
                    if (i4 == z) {
                        z2 = z ? 1 : 0;
                    } else {
                        z2 = false;
                    }
                    textView.setSingleLine(z2);
                    if (i4 == i3) {
                        f2 = 0.85f;
                    } else {
                        f2 = 1.0f;
                    }
                    textView.setLineSpacing(0.0f, f2);
                    if (i4 == i3) {
                        z = false;
                    }
                    textView.setIncludeFontPadding(z);
                    if (i4 == i3) {
                        f3 = 29.0f;
                    } else {
                        f3 = 35.0f;
                    }
                    layoutParams.topMargin = hl.L(f3);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ImageView) this.b).getLayoutParams();
                    if (i4 == i3) {
                        f5 = 4.0f;
                    }
                    layoutParams2.topMargin = hl.L(f5);
                }
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public iy9(dlc dlcVar, Context context, Drawable drawable) {
        super(context);
        this.a = (byte) 6;
        this.c = dlcVar;
        this.b = drawable;
    }

    public iy9(uqc uqcVar, Context context) {
        super(context);
        this.a = (byte) 7;
        this.c = uqcVar;
        this.b = new es1(this, (byte) 7);
    }

    public iy9(n1a n1aVar, Context context) {
        super(context);
        this.a = (byte) 1;
        this.c = n1aVar;
        this.b = new Rect();
    }

    public iy9(pqb pqbVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 5:
                this.c = pqbVar;
                super(context);
                this.b = new int[2];
                return;
            default:
                this.c = pqbVar;
                this.b = new Paint();
                return;
        }
    }

    public iy9(ky9 ky9Var, Activity activity) {
        super(activity);
        this.a = (byte) 0;
        this.c = ky9Var;
        this.b = new Path();
    }
}
