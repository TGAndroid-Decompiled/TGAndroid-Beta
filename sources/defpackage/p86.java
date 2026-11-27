package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.Switch;
public final class p86 extends FrameLayout {
    public final q86 E;
    public final ImageView a;
    public final LinearLayout b;
    public final xb c;
    public final in d;
    public final ImageView e;
    public final Switch f;
    public final og2 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    public p86(q86 q86Var, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        this.E = q86Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i7 = aob.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i7, null, mode);
        imageView.setVisibility(8);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(imageView, tre.d(24, 24.0f, i | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        xb xbVar = new xb(context, (byte) 23);
        this.c = xbVar;
        xbVar.setLines(1);
        xbVar.setSingleLine(true);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.setTextSize(1, 16.0f);
        int i8 = aob.G6;
        yob.X(xbVar, i8, null);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        xbVar.setGravity(i2);
        xbVar.setImportantForAccessibility(2);
        in inVar = new in(context, false, true, true);
        this.d = inVar;
        inVar.b(0.35f, 200L, k43.h);
        inVar.setTypeface(hl.o());
        inVar.setTextSize(hl.L(14.0f));
        yob.U(inVar, i8, null);
        inVar.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        yob.s(imageView2, i8, null, mode);
        imageView2.setImageResource(2131230871);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        linearLayout.setGravity(i3);
        if (ob6.a0) {
            linearLayout.addView(imageView2, tre.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(inVar, tre.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(xbVar, tre.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(xbVar, tre.p(-2, -2, 1.0f, 16));
            linearLayout.addView(inVar, tre.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, tre.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (ob6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        addView(linearLayout, tre.d(-1, -2.0f, i4 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r3 = new Switch(context, null);
        this.f = r3;
        r3.setVisibility(8);
        int i9 = aob.M6;
        int i10 = aob.N6;
        int i11 = aob.d6;
        r3.d(i9, i10, i11, i11);
        r3.setImportantForAccessibility(2);
        if (ob6.a0) {
            i5 = 3;
        } else {
            i5 = 5;
        }
        addView(r3, tre.d(37, 50.0f, i5 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        og2 og2Var = new og2(21, null, context);
        this.h = og2Var;
        og2Var.b(aob.h7, aob.j7, aob.k7);
        og2Var.setDrawUnchecked(true);
        og2Var.a(true, false);
        og2Var.setDrawBackgroundAsArc(10);
        og2Var.setVisibility(8);
        og2Var.setImportantForAccessibility(2);
        boolean z = ob6.a0;
        if (z) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        int i12 = i6 | 16;
        if (z) {
            f = 0.0f;
        } else {
            f = 64.0f;
        }
        if (z) {
            f2 = 64.0f;
        } else {
            f2 = 0.0f;
        }
        addView(og2Var, tre.d(21, 21.0f, i12, f, 0.0f, f2, 0.0f));
        setFocusable(true);
    }

    public final int a(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p86.a(int):int");
    }

    public final void b(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (this.s != z) {
            this.s = z;
            og2 og2Var = this.h;
            Switch r1 = this.f;
            LinearLayout linearLayout = this.b;
            float f7 = 1.0f;
            ImageView imageView = this.a;
            if (z2) {
                ViewPropertyAnimator animate = imageView.animate();
                if (z) {
                    f4 = 0.5f;
                } else {
                    f4 = 1.0f;
                }
                animate.alpha(f4).setDuration(220L).start();
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (z) {
                    f5 = 0.5f;
                } else {
                    f5 = 1.0f;
                }
                animate2.alpha(f5).setDuration(220L).start();
                ViewPropertyAnimator animate3 = r1.animate();
                if (z) {
                    f6 = 0.5f;
                } else {
                    f6 = 1.0f;
                }
                animate3.alpha(f6).setDuration(220L).start();
                ViewPropertyAnimator animate4 = og2Var.animate();
                if (z) {
                    f7 = 0.5f;
                }
                ik8.s(animate4, f7, 220L);
            } else {
                if (z) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                imageView.setAlpha(f);
                if (z) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                linearLayout.setAlpha(f2);
                if (z) {
                    f3 = 0.5f;
                } else {
                    f3 = 1.0f;
                }
                r1.setAlpha(f3);
                if (z) {
                    f7 = 0.5f;
                }
                og2Var.setAlpha(f7);
            }
            setEnabled(!z);
        }
    }

    public final void c(k86 k86Var, boolean z) {
        int d = i86.d(true);
        int i = k86Var.e;
        this.x = a(d & i);
        this.y = a(i);
        boolean z2 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.x), Integer.valueOf(this.y));
        if (z && !ob6.a0) {
            z2 = true;
        }
        this.d.c(format, z2, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        boolean z = ob6.a0;
        boolean z2 = this.r;
        xb xbVar = this.c;
        if (z) {
            if (z2) {
                float L = hl.L(75.0f);
                canvas.drawRect(L - hl.L(0.66f), (getMeasuredHeight() - hl.L(20.0f)) / 2.0f, L, (hl.L(20.0f) + getMeasuredHeight()) / 2.0f, aob.j0);
            }
            if (this.n) {
                int measuredWidth = getMeasuredWidth() - hl.L(64.0f);
                if (xbVar.getTranslationX() < 0.0f) {
                    i = hl.L(-32.0f);
                } else {
                    i = 0;
                }
                canvas.drawLine(measuredWidth + i, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, aob.j0);
                return;
            }
            return;
        }
        if (z2) {
            float measuredWidth2 = getMeasuredWidth() - hl.L(75.0f);
            canvas.drawRect(measuredWidth2 - hl.L(0.66f), (getMeasuredHeight() - hl.L(20.0f)) / 2.0f, measuredWidth2, (hl.L(20.0f) + getMeasuredHeight()) / 2.0f, aob.j0);
        }
        if (this.n) {
            canvas.drawLine(xbVar.getTranslationX() + hl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        og2 og2Var = this.h;
        if (og2Var.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (og2Var.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(og2Var.a.q);
        } else {
            accessibilityNodeInfo.setChecked(this.f.h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getText());
        if (this.w) {
            sb.append('\n');
            sb.append(ob6.a0("Of", null, 2131747556, Integer.valueOf(this.x), Integer.valueOf(this.y)));
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
    }
}
