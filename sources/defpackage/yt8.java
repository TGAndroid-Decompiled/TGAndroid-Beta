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
public final class yt8 extends FrameLayout implements tjb {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public fba d;
    public Drawable e;
    public final wf2 f;
    public boolean h;
    public boolean n;
    public int r;
    public final ProxyListActivity s;

    public yt8(ProxyListActivity proxyListActivity, Context context) {
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
        zkb.X(textView, bkb.F6, null);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        boolean z = k96.a0;
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
        addView(textView, nme.d(-2, -2.0f, i9, f, 10.0f, i4, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (k96.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        textView2.setGravity(i5);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(gl.L(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z2 = k96.a0;
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
        addView(textView2, nme.d(-2, -2.0f, i10, i7, 35.0f, z2 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(2131232190);
        zkb.s(imageView, bkb.z6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(k96.M0(2131751323, null));
        if (k96.a0) {
            i8 = 3;
        } else {
            i8 = 5;
        }
        addView(imageView, nme.d(48, 48.0f, i8 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new ik8(this, (byte) 3));
        wf2 wf2Var = new wf2(21, null, context);
        this.f = wf2Var;
        wf2Var.b(bkb.h7, bkb.f7, bkb.j7);
        wf2Var.setDrawBackgroundAsArc(14);
        wf2Var.setVisibility(8);
        addView(wf2Var, nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z, boolean z2) {
        int L;
        int i;
        if (this.n == z && z2) {
            return;
        }
        this.n = z;
        if (k96.a0) {
            L = -gl.L(32.0f);
        } else {
            L = gl.L(32.0f);
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
            boolean z3 = k96.a0;
            int L2 = gl.L(32.0f);
            if (!z3) {
                L2 = -L2;
            }
            wf2 wf2Var = this.f;
            wf2Var.setTranslationX(L2 + f);
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
            wf2Var.setVisibility(i2);
            wf2Var.setAlpha(1.0f);
            wf2Var.setScaleX(1.0f);
            wf2Var.setScaleY(1.0f);
            return;
        }
        if (z) {
            f3 = 0.0f;
            f2 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f3, f2).setDuration(200L);
        duration.setInterpolator(s33.f);
        duration.addUpdateListener(new rm1(this, f, (byte) 6));
        duration.addListener(new id4((byte) 27, this, z));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt8.b():void");
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
        if (k96.a0) {
            L = 0.0f;
        } else {
            L = gl.L(20.0f);
        }
        float f = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (k96.a0) {
            i = gl.L(20.0f);
        } else {
            i = 0;
        }
        canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), ug8.E(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z) {
        TextView textView = this.b;
        if (z) {
            Drawable drawable = this.e;
            if (drawable == null) {
                drawable = getResources().getDrawable(2131232630).mutate();
                this.e = drawable;
            }
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
            }
            boolean z2 = k96.a0;
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

    public void setProxy(fba fbaVar) {
        String str;
        au8 au8Var = fbaVar.a;
        if (au8Var.a == 3) {
            str = b00.j(new StringBuilder(), au8Var.b, " (WEB)");
        } else {
            str = au8Var.b + ":" + fbaVar.a.c;
        }
        this.a.setText(str);
        this.d = fbaVar;
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
                if ((textView.getTag() instanceof Integer) && (w0 = bkb.w0(null, ((Integer) textView.getTag()).intValue(), false)) != this.r) {
                    this.r = w0;
                    textView.setTextColor(w0);
                    Drawable drawable = this.e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
