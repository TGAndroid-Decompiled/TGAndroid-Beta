package defpackage;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class eoc extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public iv2 f;
    public boolean h;
    public boolean n;
    public ValueAnimator r;

    public eoc(Context context, String str) {
        super(context);
        float f;
        char c;
        ActivityManager activityManager;
        addView(new wnc(context, str), qoe.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackground(cmb.b0(gm.L(20.0f), -1));
        frameLayout.setCameraDistance(gm.L(8000.0f));
        addView(frameLayout, qoe.d(212, 244.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout.addView(frameLayout2, qoe.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, qoe.d(164, 164.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        hx8 c2 = ix8.c("ton://transfer/".concat(str), 768, g54.H, 1.0f, new ColorDrawable(0));
        frameLayout3.addView(new yc(context, c2), qoe.c(-1.0f, -1));
        if (c2 == null) {
            f = 0.0f;
        } else {
            f = c2.k / c2.b;
        }
        if (f > 0.0f) {
            if (gda.o() != 0 && !e86.f() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                int round = Math.round(f * 164.0f * 1.35f);
                frameLayout3.addView(new xqc(context), qoe.e(round, round, 17));
            } else {
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(2131231962);
                int round2 = Math.round(f * 164.0f);
                frameLayout3.addView(imageView, qoe.e(round2, round2, 17));
            }
        }
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setText(jb6.M0(2131742835, null));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(gm.L(4.0f));
        textView.setTypeface(gm.n1("fonts/rmedium.ttf"));
        textView.setPadding(gm.L(10.0f), 0, gm.L(12.0f), 0);
        int L = gm.L(18.0f);
        textView.setBackground(cmb.i0(L, L, L, L, -984578, -1903620, -1903620));
        Drawable d = b10.d(context, 2131232832);
        d.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        d.setBounds(0, 0, gm.L(14.0f), gm.L(14.0f));
        textView.setCompoundDrawables(d, null, null, null);
        rve.a(textView);
        frameLayout2.addView(textView, qoe.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        frameLayout.addView(frameLayout4, qoe.c(-1.0f, -1));
        TextView textView2 = new TextView(context);
        String replace = str.replace(" ", "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < replace.length()) {
            if (i2 > 0) {
                if (i2 % 3 == 0) {
                    c = '\n';
                } else {
                    c = ' ';
                }
                spannableStringBuilder.append(c);
            }
            int length = spannableStringBuilder.length();
            int i3 = i + 4;
            spannableStringBuilder.append((CharSequence) replace, i, Math.min(i3, replace.length()));
            if ((i2 & 1) != 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-7434605), length, spannableStringBuilder.length(), 33);
            }
            i2++;
            i = i3;
        }
        textView2.setText(spannableStringBuilder);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(1, 18.0f);
        textView2.setTypeface(goc.s0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView l = wi8.l(this.e, textView2, qoe.d(-1, 112.0f, 55, 8.0f, 32.0f, 8.0f, 0.0f), context);
        l.setText(jb6.M0(2131742883, null));
        l.setTextColor(-15556886);
        l.setTextSize(1, 14.0f);
        l.setTypeface(gm.n1("fonts/rmedium.ttf"));
        l.setGravity(17);
        l.setCompoundDrawablePadding(gm.L(3.0f));
        Drawable mutate = context.getResources().getDrawable(2131232404).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, gm.L(16.0f), gm.L(16.0f));
        l.setCompoundDrawables(mutate, null, null, null);
        TextView l2 = wi8.l(this.e, l, qoe.d(-2, 28.0f, 49, 0.0f, 149.0f, 0.0f, 0.0f), context);
        this.b = l2;
        l2.setText(jb6.M0(2131742676, null));
        l2.setTextColor(-15556886);
        l2.setTextSize(1, 14.0f);
        l2.setTypeface(gm.n1("fonts/rmedium.ttf"));
        l2.setGravity(17);
        l2.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        int L2 = gm.L(18.0f);
        l2.setBackground(cmb.i0(L2, L2, L2, L2, -984578, -1903620, -1903620));
        rve.a(l2);
        this.e.addView(l2, qoe.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final eoc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                eoc eocVar = this.b;
                switch (b) {
                    case 0:
                        if (!eocVar.h && !eocVar.n) {
                            iv2 iv2Var = eocVar.f;
                            if (iv2Var != null) {
                                iv2Var.run();
                            }
                            eocVar.a(true);
                            return;
                        }
                        return;
                    default:
                        eocVar.a(false);
                        return;
                }
            }
        };
        frameLayout3.setOnClickListener(onClickListener);
        this.a.setOnClickListener(onClickListener);
        l2.setOnClickListener(new View.OnClickListener(this) {
            public final eoc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                eoc eocVar = this.b;
                switch (b) {
                    case 0:
                        if (!eocVar.h && !eocVar.n) {
                            iv2 iv2Var = eocVar.f;
                            if (iv2Var != null) {
                                iv2Var.run();
                            }
                            eocVar.a(true);
                            return;
                        }
                        return;
                    default:
                        eocVar.a(false);
                        return;
                }
            }
        });
    }

    public final void a(boolean z) {
        float f;
        if (this.h != z && !this.n) {
            this.n = true;
            this.h = z;
            FrameLayout frameLayout = this.c;
            frameLayout.setLayerType(2, null);
            float rotationY = frameLayout.getRotationY();
            if (z) {
                f = 180.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(rotationY, f);
            this.r = ofFloat;
            ofFloat.setDuration(420L);
            this.r.setInterpolator(d53.h);
            this.r.addUpdateListener(new oxb(this, (byte) 12));
            this.r.addListener(new q7b(this, (byte) 29));
            this.r.start();
        }
    }
}
