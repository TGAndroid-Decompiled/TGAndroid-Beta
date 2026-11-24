package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.Switch;
public final class ajb extends FrameLayout {
    public int a;
    public final TextView b;
    public final TextView c;
    public final Switch d;
    public boolean e;
    public LinearLayout f;
    public io h;
    public View n;
    public o72 r;

    public ajb(Context context) {
        super(context);
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        TextView textView = new TextView(context);
        this.b = textView;
        anb.X(textView, cmb.F6, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z = jb6.a0;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i5 = i2 | 48;
        if (z) {
            f = 64.0f;
        } else {
            f = 21.0f;
        }
        if (z) {
            f2 = 21.0f;
        } else {
            f2 = 64.0f;
        }
        addView(textView, qoe.d(-2, -1.0f, i5, f, 0.0f, f2, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        anb.X(textView2, cmb.y6, null);
        textView2.setTextSize(1, 13.0f);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z2 = jb6.a0;
        if (z2) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i6 = i4 | 48;
        if (z2) {
            f3 = 64.0f;
        } else {
            f3 = 21.0f;
        }
        if (z2) {
            f4 = 21.0f;
        } else {
            f4 = 64.0f;
        }
        addView(textView2, qoe.d(-2, -2.0f, i6, f3, 35.0f, f4, 0.0f));
        Switch r2 = new Switch(context, null);
        this.d = r2;
        r2.setDrawIconType(1);
        addView(r2, qoe.d(37, 40.0f, (jb6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    public final void a(Runnable runnable, String str, boolean z) {
        float f;
        int i;
        if (this.f == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            io ioVar = new io(getContext(), false, true, true);
            this.h = ioVar;
            ioVar.setTextSize(gm.L(14.0f));
            this.h.getDrawable().K = true;
            io ioVar2 = this.h;
            int i2 = cmb.F6;
            anb.U(ioVar2, i2, null);
            this.h.setTypeface(gm.o());
            this.h.b(0.4f, 320L, d53.h);
            this.f.addView(this.h, qoe.c(20.0f, -2));
            this.n = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(2131230872).mutate();
            anb.x(this, mutate, i2, null, PorterDuff.Mode.MULTIPLY);
            this.n.setBackground(mutate);
            this.f.addView(this.n, qoe.r(16, 16, 16));
            this.f.setClipChildren(false);
            setClipChildren(false);
            addView(this.f, qoe.e(-2, -2, 16));
            o72 o72Var = new o72(getContext(), (byte) 27);
            this.r = o72Var;
            o72Var.setBackground(cmb.f0(cmb.w0(null, cmb.h6, false), 2, -1));
            o72 o72Var2 = this.r;
            if (jb6.a0) {
                i = 3;
            } else {
                i = 5;
            }
            addView(o72Var2, qoe.e(76, -1, i));
        }
        this.h.setText(str);
        this.n.animate().cancel();
        ViewPropertyAnimator animate = this.n.animate();
        if (z) {
            f = 0.0f;
        } else {
            f = 180.0f;
        }
        animate.rotation(f).setDuration(340L).setInterpolator(d53.h).start();
        this.r.setOnClickListener(new xl3(runnable, (byte) 8));
    }

    public final void b(boolean z, boolean z2) {
        float f;
        float f2;
        super.setEnabled(z);
        Switch r0 = this.d;
        TextView textView = this.c;
        TextView textView2 = this.b;
        float f3 = 0.5f;
        if (z2) {
            textView2.clearAnimation();
            textView.clearAnimation();
            r0.clearAnimation();
            ViewPropertyAnimator animate = textView2.animate();
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            animate.alpha(f).start();
            ViewPropertyAnimator animate2 = textView.animate();
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            animate2.alpha(f2).start();
            ViewPropertyAnimator animate3 = r0.animate();
            if (z) {
                f3 = 1.0f;
            }
            animate3.alpha(f3).start();
        } else if (z) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            r0.setAlpha(1.0f);
        } else {
            r0.setAlpha(0.5f);
            textView2.setAlpha(0.5f);
            textView.setAlpha(0.5f);
        }
    }

    public final void c(String str, boolean z, boolean z2) {
        d(str, z, z2, false);
    }

    public final void d(String str, boolean z, boolean z2, boolean z3) {
        TextView textView = this.b;
        textView.setText(str);
        this.d.c(z, z3);
        this.e = z2;
        this.c.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z2);
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.e) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            boolean z2 = jb6.a0;
            TextView textView = this.b;
            if (z2) {
                linearLayout.setTranslationX((textView.getLeft() - this.f.getMeasuredWidth()) - gm.L(8.0f));
                return;
            }
            linearLayout.setTranslationX(gm.L(8.0f) + textView.getRight());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.c.getVisibility() == 0) {
            f = 64.0f;
        } else {
            f = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gm.L(f) + (this.e ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z) {
        this.d.c(z, true);
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        TextView textView = this.b;
        textView.clearAnimation();
        TextView textView2 = this.c;
        textView2.clearAnimation();
        Switch r2 = this.d;
        r2.clearAnimation();
        if (z) {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            r2.setAlpha(1.0f);
            io ioVar = this.h;
            if (ioVar != null) {
                ioVar.setAlpha(1.0f);
            }
            View view = this.n;
            if (view != null) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        r2.setAlpha(0.5f);
        textView.setAlpha(0.5f);
        textView2.setAlpha(0.5f);
        io ioVar2 = this.h;
        if (ioVar2 != null) {
            ioVar2.setAlpha(0.6f);
        }
        View view2 = this.n;
        if (view2 != null) {
            view2.setAlpha(0.6f);
        }
    }

    public void setIcon(int i) {
        this.d.setIcon(i);
    }
}
