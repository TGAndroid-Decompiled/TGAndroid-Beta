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
public final class l86 extends FrameLayout {
    public final m86 E;
    public final ImageView a;
    public final LinearLayout b;
    public final wb c;
    public final io d;
    public final ImageView e;
    public final Switch f;
    public final jh2 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    public l86(m86 m86Var, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        this.E = m86Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i7 = cmb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i7, null, mode);
        imageView.setVisibility(8);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(imageView, qoe.d(24, 24.0f, i | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        wb wbVar = new wb(context, (byte) 23);
        this.c = wbVar;
        wbVar.setLines(1);
        wbVar.setSingleLine(true);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        wbVar.setTextSize(1, 16.0f);
        int i8 = cmb.F6;
        anb.X(wbVar, i8, null);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        wbVar.setGravity(i2);
        wbVar.setImportantForAccessibility(2);
        io ioVar = new io(context, false, true, true);
        this.d = ioVar;
        ioVar.b(0.35f, 200L, d53.h);
        ioVar.setTypeface(gm.o());
        ioVar.setTextSize(gm.L(14.0f));
        anb.U(ioVar, i8, null);
        ioVar.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        anb.s(imageView2, i8, null, mode);
        imageView2.setImageResource(2131230872);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        linearLayout.setGravity(i3);
        if (jb6.a0) {
            linearLayout.addView(imageView2, qoe.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(ioVar, qoe.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(wbVar, qoe.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(wbVar, qoe.p(-2, -2, 1.0f, 16));
            linearLayout.addView(ioVar, qoe.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, qoe.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        addView(linearLayout, qoe.d(-1, -2.0f, i4 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r3 = new Switch(context, null);
        this.f = r3;
        r3.setVisibility(8);
        int i9 = cmb.L6;
        int i10 = cmb.M6;
        int i11 = cmb.c6;
        r3.d(i9, i10, i11, i11);
        r3.setImportantForAccessibility(2);
        if (jb6.a0) {
            i5 = 3;
        } else {
            i5 = 5;
        }
        addView(r3, qoe.d(37, 50.0f, i5 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        jh2 jh2Var = new jh2(21, null, context);
        this.h = jh2Var;
        jh2Var.b(cmb.g7, cmb.i7, cmb.j7);
        jh2Var.setDrawUnchecked(true);
        jh2Var.a(true, false);
        jh2Var.setDrawBackgroundAsArc(10);
        jh2Var.setVisibility(8);
        jh2Var.setImportantForAccessibility(2);
        boolean z = jb6.a0;
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
        addView(jh2Var, qoe.d(21, 21.0f, i12, f, 0.0f, f2, 0.0f));
        setFocusable(true);
    }

    public final int a(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l86.a(int):int");
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
            jh2 jh2Var = this.h;
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
                ViewPropertyAnimator animate4 = jh2Var.animate();
                if (z) {
                    f7 = 0.5f;
                }
                wi8.s(animate4, f7, 220L);
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
                jh2Var.setAlpha(f7);
            }
            setEnabled(!z);
        }
    }

    public final void c(g86 g86Var, boolean z) {
        int d = e86.d(true);
        int i = g86Var.e;
        this.x = a(d & i);
        this.y = a(i);
        boolean z2 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.x), Integer.valueOf(this.y));
        if (z && !jb6.a0) {
            z2 = true;
        }
        this.d.c(format, z2, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        boolean z = jb6.a0;
        boolean z2 = this.r;
        wb wbVar = this.c;
        if (z) {
            if (z2) {
                float L = gm.L(75.0f);
                canvas.drawRect(L - gm.L(0.66f), (getMeasuredHeight() - gm.L(20.0f)) / 2.0f, L, (gm.L(20.0f) + getMeasuredHeight()) / 2.0f, cmb.j0);
            }
            if (this.n) {
                int measuredWidth = getMeasuredWidth() - gm.L(64.0f);
                if (wbVar.getTranslationX() < 0.0f) {
                    i = gm.L(-32.0f);
                } else {
                    i = 0;
                }
                canvas.drawLine(measuredWidth + i, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, cmb.j0);
                return;
            }
            return;
        }
        if (z2) {
            float measuredWidth2 = getMeasuredWidth() - gm.L(75.0f);
            canvas.drawRect(measuredWidth2 - gm.L(0.66f), (getMeasuredHeight() - gm.L(20.0f)) / 2.0f, measuredWidth2, (gm.L(20.0f) + getMeasuredHeight()) / 2.0f, cmb.j0);
        }
        if (this.n) {
            canvas.drawLine(wbVar.getTranslationX() + gm.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        jh2 jh2Var = this.h;
        if (jh2Var.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (jh2Var.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(jh2Var.a.q);
        } else {
            accessibilityNodeInfo.setChecked(this.f.h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getText());
        if (this.w) {
            sb.append('\n');
            sb.append(jb6.a0("Of", null, 2131747562, Integer.valueOf(this.x), Integer.valueOf(this.y)));
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
    }
}
