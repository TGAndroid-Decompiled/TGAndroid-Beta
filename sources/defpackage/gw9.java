package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
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
public final class gw9 extends FrameLayout {
    public final byte a;
    public Object b;
    public Object c;

    public gw9(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 2:
                super(context);
                ImageView imageView = new ImageView(context);
                this.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, nme.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(gl.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, nme.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                return;
            default:
                return;
        }
    }

    public final void a(int i, CharSequence charSequence, boolean z) {
        ImageView imageView = (ImageView) this.b;
        if (z) {
            gl.M3(imageView, i);
        } else {
            imageView.setImageResource(i);
        }
        ((TextView) this.c).setText(charSequence);
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 6:
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
                if (view == ((tx9) this.c).i0 && pg5.b && pg5.f) {
                    for (int i = 0; i < ((tx9) this.c).i0.getChildCount(); i++) {
                        View childAt = ((tx9) this.c).i0.getChildAt(i);
                        if (childAt instanceof dx9) {
                            dx9 dx9Var = (dx9) childAt;
                            if (dx9Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.b);
                                super.drawChild(canvas, view, j);
                                canvas.restore();
                            } else if (dx9Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.b).set((int) (rect.centerX() - (dx9Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (dx9Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((dx9Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((dx9Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.b);
                                canvas.scale(dx9Var.getAnimatedScale(), dx9Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                                super.drawChild(canvas, view, j);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof yw9) || (childAt instanceof xw9) || (childAt instanceof zw9)) {
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
            case 6:
                hmc hmcVar = (hmc) this.c;
                if (view == hmcVar.v0 && hmcVar.G) {
                    int save = canvas.save();
                    canvas.concat(hmcVar.J);
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restoreToCount(save);
                    return drawChild;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void invalidate() {
        switch (this.a) {
            case 4:
                super.invalidate();
                k7 k7Var = ((qmb) this.c).v0;
                if (k7Var != null) {
                    k7Var.invalidate();
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
            case 6:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((qr1) this.b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 6:
                getViewTreeObserver().removeOnPreDrawListener((qr1) this.b);
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
            case 3:
                int intrinsicHeight = bkb.h3.getIntrinsicHeight();
                bkb.h3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                bkb.h3.draw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(((qmb) this.c).getThemedColor(bkb.Ie));
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                return;
            case 4:
                int[] iArr = (int[]) this.b;
                qmb qmbVar = (qmb) this.c;
                if (!gl.D) {
                    getLocationInWindow(iArr);
                    float translationY = qmbVar.u0.getTranslationY();
                    int i = iArr[1];
                    if (translationY != i) {
                        qmbVar.u0.setTranslationY(-i);
                        qmbVar.v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < qmbVar.R) {
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                canvas.save();
                wgc wgcVar = ((xgc) this.c).b;
                canvas.scale(wgcVar.getScaleX(), wgcVar.getScaleY(), wgcVar.getPivotX() + wgcVar.getLeft(), wgcVar.getPivotY() + wgcVar.getTop());
                Drawable drawable = (Drawable) this.b;
                drawable.setBounds(wgcVar.getLeft() - gl.L(2.0f), wgcVar.getTop() - gl.L(2.0f), gl.L(2.0f) + wgcVar.getRight(), gl.L(2.0f) + wgcVar.getBottom());
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
            case 2:
                float f5 = 8.0f;
                int size = View.MeasureSpec.getSize(i) - gl.L(8.0f);
                TextView textView = (TextView) this.c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(gl.L(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f6 = size;
                    if (measureText > f6) {
                        textPaint.setTextSize(gl.L(11.0f));
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
                    layoutParams.topMargin = gl.L(f3);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ImageView) this.b).getLayoutParams();
                    if (i4 == i3) {
                        f5 = 4.0f;
                    }
                    layoutParams2.topMargin = gl.L(f5);
                }
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public gw9(hmc hmcVar, Context context) {
        super(context);
        this.a = (byte) 6;
        this.c = hmcVar;
        this.b = new qr1(this, (byte) 7);
    }

    public gw9(tx9 tx9Var, Context context) {
        super(context);
        this.a = (byte) 0;
        this.c = tx9Var;
        this.b = new Rect();
    }

    public gw9(qmb qmbVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 4:
                this.c = qmbVar;
                super(context);
                this.b = new int[2];
                return;
            default:
                this.c = qmbVar;
                this.b = new Paint();
                return;
        }
    }

    public gw9(xgc xgcVar, Context context, Drawable drawable) {
        super(context);
        this.a = (byte) 5;
        this.c = xgcVar;
        this.b = drawable;
    }
}
