package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.Switch;
public class wkb extends FrameLayout {
    public static final qm K = new qm("animationProgress", (byte) 16);
    public boolean E;
    public int F;
    public final vnb G;
    public e29 H;
    public boolean I;
    public boolean J;
    public boolean a;
    public int b;
    public final TextView c;
    public final TextView d;
    public final Switch e;
    public boolean f;
    public boolean h;
    public int n;
    public int r;
    public float s;
    public Paint w;
    public float x;
    public ObjectAnimator y;

    public wkb(int i, vnb vnbVar, Context context, boolean z) {
        super(context);
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        float f3;
        this.n = 50;
        this.G = vnbVar;
        this.F = i;
        TextView textView = new TextView(context);
        this.c = textView;
        if (z) {
            i2 = aob.j5;
        } else {
            i2 = aob.G6;
        }
        yob.X(textView, i2, vnbVar);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z2 = ob6.a0;
        if (z2) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i8 = i4 | 48;
        if (z2) {
            f = 70.0f;
        } else {
            f = i;
        }
        if (z2) {
            f2 = i;
        } else {
            f2 = 70.0f;
        }
        addView(textView, tre.d(-1, -1.0f, i8, f, 0.0f, f2, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        if (z) {
            i5 = aob.J5;
        } else {
            i5 = aob.z6;
        }
        yob.X(textView2, i5, vnbVar);
        textView2.setTextSize(1, 13.0f);
        if (ob6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        textView2.setGravity(i6);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z3 = ob6.a0;
        if (z3) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i9 = i7 | 48;
        if (z3) {
            f3 = 70.0f;
        } else {
            f3 = i;
        }
        addView(textView2, tre.d(-2, -2.0f, i9, f3, 35.0f, z3 ? i : 70.0f, 0.0f));
        Switch r1 = new Switch(context, vnbVar);
        this.e = r1;
        int i10 = aob.M6;
        int i11 = aob.N6;
        int i12 = aob.d6;
        r1.d(i10, i11, i12, i12);
        addView(r1, tre.d(37, 20.0f, (ob6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.I = ob6.a0;
    }

    private float getLastTouchX() {
        int measuredWidth;
        if (this.a) {
            if (ob6.a0) {
                measuredWidth = hl.L(22.0f);
            } else {
                measuredWidth = getMeasuredWidth() - hl.L(42.0f);
            }
            return measuredWidth;
        }
        return this.x;
    }

    public void setAnimationProgress(float f) {
        this.s = f;
        float lastTouchX = getLastTouchX();
        float max = Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + hl.L(40.0f);
        Switch r3 = this.e;
        r3.R = lastTouchX;
        r3.S = getMeasuredHeight() / 2;
        r3.T = max * this.s;
        r3.invalidate();
    }

    public final void b(int i, boolean z) {
        ObjectAnimator objectAnimator = this.y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.y = null;
        }
        int i2 = this.r;
        if (i2 != 0) {
            setBackgroundColor(i2);
        }
        int i3 = 1;
        if (this.w == null) {
            this.w = new Paint(1);
        }
        if (!z) {
            i3 = 2;
        }
        this.e.setOverrideColor(i3);
        this.r = i;
        this.w.setColor(i);
        this.s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, K, 0.0f, 1.0f);
        this.y = ofFloat;
        ofFloat.addListener(new ukb(this, i, (byte) 0));
        this.y.setInterpolator(k43.g);
        this.y.setDuration(240L).start();
    }

    public final void c(int i, int i2) {
        int i3;
        int i4;
        if (this.H == null) {
            ?? imageView = new ImageView(getContext());
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            e29 e29Var = this.H;
            if (ob6.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            addView(e29Var, tre.d(29, 29.0f, i3 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.F = hl.L(65.0f);
            TextView textView = this.c;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int i5 = 70;
            if (ob6.a0) {
                i4 = 70;
            } else {
                i4 = this.F;
            }
            marginLayoutParams.leftMargin = i4;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (ob6.a0) {
                i5 = this.F;
            }
            marginLayoutParams2.rightMargin = i5;
        }
        this.H.setVisibility(0);
        this.H.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        this.H.setImageResource(i2);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.H.setBackground(aob.b0(hl.L(9.0f), i));
    }

    public final void d(int i, int i2, int i3, int i4, int i5) {
        vnb vnbVar = this.G;
        TextView textView = this.c;
        yob.X(textView, i, vnbVar);
        this.e.d(i2, i3, i4, i5);
        textView.setTag(Integer.valueOf(i));
    }

    public final void e(ArrayList arrayList, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        super.setEnabled(z);
        Switch r0 = this.e;
        TextView textView = this.d;
        float f5 = 0.5f;
        TextView textView2 = this.c;
        if (arrayList != null) {
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.5f;
            }
            float[] fArr = {f3};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView2, property, fArr));
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(r0, property, f4));
            if (textView.getVisibility() == 0) {
                if (z) {
                    f5 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(textView, property, f5));
                return;
            }
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        textView2.setAlpha(f);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        r0.setAlpha(f2);
        if (textView.getVisibility() == 0) {
            if (z) {
                f5 = 1.0f;
            }
            textView.setAlpha(f5);
        }
    }

    public final void f(CharSequence charSequence, boolean z, boolean z2) {
        gc0.a(charSequence, this);
        TextView textView = this.c;
        textView.setText(charSequence);
        this.h = false;
        Switch r1 = this.e;
        r1.setVisibility(0);
        r1.c(z, this.J);
        this.f = z2;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z2);
    }

    public final void g(String str, String str2, boolean z, boolean z2, boolean z3) {
        gc0.a(str, this);
        TextView textView = this.c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(str2);
        Switch r4 = this.e;
        r4.setVisibility(0);
        r4.c(z, false);
        this.f = z3;
        textView2.setVisibility(0);
        this.h = z2;
        if (z2) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, hl.L(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = hl.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z3);
    }

    public Switch getCheckBox() {
        return this.e;
    }

    public TextView getValueTextView() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        if (this.r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + hl.L(40.0f)) * this.s, this.w);
        }
        if (this.f) {
            vnb vnbVar = this.G;
            if (vnbVar != null) {
                paint = vnbVar.d("paintDivider");
            } else {
                paint = aob.j0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                e29 e29Var = this.H;
                boolean z = ob6.a0;
                int i = 0;
                float f = 0.0f;
                if (e29Var != null) {
                    if (!z) {
                        f = this.F;
                    }
                    float measuredHeight = getMeasuredHeight() - 1;
                    int measuredWidth = getMeasuredWidth();
                    if (ob6.a0) {
                        i = this.F;
                    }
                    canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, paint2);
                    return;
                }
                if (!z) {
                    f = hl.L(20.0f);
                }
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (ob6.a0) {
                    i = hl.L(20.0f);
                }
                canvas.drawLine(f, measuredHeight2, measuredWidth2 - i, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.h);
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getText());
        TextView textView = this.d;
        if (!TextUtils.isEmpty(textView.getText())) {
            sb.append('\n');
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override
    public void onMeasure(int i, int i2) {
        float f;
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 0);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.d.getVisibility() == 0) {
            f = 64.0f;
        } else {
            f = this.n;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f) + (this.f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.x = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z) {
        this.a = z;
    }

    @Override
    public void setBackgroundColor(int i) {
        if (this.r != i) {
            clearAnimation();
            this.r = 0;
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i) {
        ObjectAnimator objectAnimator = this.y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.y = null;
        }
        int i2 = this.r;
        if (i2 == 0) {
            if (getBackground() instanceof ColorDrawable) {
                i2 = ((ColorDrawable) getBackground()).getColor();
            } else {
                i2 = 0;
            }
        }
        Paint paint = this.w;
        if (paint == null) {
            paint = new Paint(1);
            this.w = paint;
        }
        paint.setColor(i2);
        setBackgroundColor(i);
        this.e.setOverrideColor(1);
        this.r = i;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, K, 1.0f, 0.0f).setDuration(240L);
        this.y = duration;
        duration.addListener(new ukb(this, i, (byte) 1));
        this.y.setInterpolator(k43.g);
        this.y.start();
    }

    public void setCheckBoxIcon(int i) {
        this.e.setIcon(i);
    }

    public void setChecked(boolean z) {
        this.e.c(z, true);
    }

    public void setDivider(boolean z) {
        this.f = z;
        setWillNotDraw(!z);
    }

    public void setDrawCheckRipple(boolean z) {
        this.E = z;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.e.setEnabled(z);
    }

    public void setHeight(int i) {
        this.n = i;
    }

    @Override
    public void setPressed(boolean z) {
        if (this.E) {
            this.e.setDrawRipple(z);
        }
        super.setPressed(z);
    }

    public void setTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    public wkb(Context context, int i) {
        this(i, null, context, false);
    }

    public wkb(Context context, vnb vnbVar) {
        this(21, vnbVar, context, false);
    }

    public wkb(Context context) {
        this(context, 21);
    }
}
