package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.ProxyListActivity;
public final class zv8 extends FrameLayout implements vlb {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public fda d;
    public Drawable e;
    public final jh2 f;
    public boolean h;
    public boolean n;
    public int r;
    public final ProxyListActivity s;

    public zv8(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.s = proxyListActivity;
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.F6, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        boolean z = jb6.a0;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i9 = i2 | 48;
        if (z) {
            i3 = 56;
        } else {
            i3 = 21;
        }
        float f = i3;
        if (z) {
            i4 = 21;
        } else {
            i4 = 56;
        }
        addView(textView, qoe.d(-2, -2.0f, i9, f, 10.0f, i4, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (jb6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        textView2.setGravity(i5);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(gm.L(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z2 = jb6.a0;
        if (z2) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        int i10 = i6 | 48;
        if (z2) {
            i7 = 56;
        } else {
            i7 = 21;
        }
        addView(textView2, qoe.d(-2, -2.0f, i10, i7, 35.0f, z2 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(2131232191);
        anb.s(imageView, cmb.z6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(jb6.M0(2131751272, null));
        if (jb6.a0) {
            i8 = 3;
        } else {
            i8 = 5;
        }
        addView(imageView, qoe.d(48, 48.0f, i8 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new wk8(this, (byte) 6));
        jh2 jh2Var = new jh2(21, null, context);
        this.f = jh2Var;
        jh2Var.b(cmb.h7, cmb.f7, cmb.j7);
        jh2Var.setDrawBackgroundAsArc(14);
        jh2Var.setVisibility(8);
        addView(jh2Var, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z, boolean z2) {
        int L;
        int i;
        if (this.n == z && z2) {
            return;
        }
        this.n = z;
        if (jb6.a0) {
            L = -gm.L(32.0f);
        } else {
            L = gm.L(32.0f);
        }
        float f = L;
        int i2 = 0;
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (!z2) {
            if (!z) {
                f = 0.0f;
            }
            this.a.setTranslationX(f);
            this.b.setTranslationX(f);
            ImageView imageView = this.c;
            imageView.setTranslationX(f);
            boolean z3 = jb6.a0;
            int L2 = gm.L(32.0f);
            if (!z3) {
                L2 = -L2;
            }
            jh2 jh2Var = this.f;
            jh2Var.setTranslationX(L2 + f);
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            if (!z) {
                i2 = 8;
            }
            jh2Var.setVisibility(i2);
            jh2Var.setAlpha(1.0f);
            jh2Var.setScaleX(1.0f);
            jh2Var.setScaleY(1.0f);
            return;
        }
        if (z) {
            f3 = 0.0f;
            f2 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f3, f2).setDuration(200L);
        duration.setInterpolator(d53.f);
        duration.addUpdateListener(new go1(this, f, (byte) 6));
        duration.addListener(new jf4((byte) 27, this, z));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zv8.b():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
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

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), wi8.E(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z) {
        TextView textView = this.b;
        if (z) {
            Drawable drawable = this.e;
            if (drawable == null) {
                drawable = getResources().getDrawable(2131232642).mutate();
                this.e = drawable;
            }
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
            }
            boolean z2 = jb6.a0;
            Drawable drawable2 = this.e;
            if (z2) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(fda fdaVar) {
        String str;
        bw8 bw8Var = fdaVar.a;
        if (bw8Var.a == 3) {
            str = b10.j(new StringBuilder(), bw8Var.b, " (WEB)");
        } else {
            str = bw8Var.b + ":" + fdaVar.a.c;
        }
        this.a.setText(str);
        this.d = fdaVar;
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int w0;
        TextView textView = this.b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (w0 = cmb.w0(null, ((Integer) textView.getTag()).intValue(), false)) != this.r) {
                    this.r = w0;
                    textView.setTextColor(w0);
                    Drawable drawable = this.e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
