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
public final class sqc extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public qu2 f;
    public boolean h;
    public boolean n;
    public ValueAnimator r;

    public sqc(Context context, String str) {
        super(context);
        float f;
        char c;
        ActivityManager activityManager;
        addView(new kqc(context, str), tre.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackground(aob.b0(hl.L(20.0f), -1));
        frameLayout.setCameraDistance(hl.L(8000.0f));
        addView(frameLayout, tre.d(212, 244.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout.addView(frameLayout2, tre.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, tre.d(164, 164.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        ry8 c2 = sy8.c("ton://transfer/".concat(str), 768, r44.H, 1.0f, new ColorDrawable(0));
        frameLayout3.addView(new vl4(context, c2), tre.c(-1.0f, -1));
        if (c2 == null) {
            f = 0.0f;
        } else {
            f = c2.k / c2.b;
        }
        if (f > 0.0f) {
            if (xea.o() != 0 && !i86.f() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                int round = Math.round(f * 164.0f * 1.35f);
                frameLayout3.addView(new itc(context), tre.e(round, round, 17));
            } else {
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(2131231961);
                int round2 = Math.round(f * 164.0f);
                frameLayout3.addView(imageView, tre.e(round2, round2, 17));
            }
        }
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setText(ob6.M0(2131742803, null));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(hl.L(4.0f));
        textView.setTypeface(hl.n1("fonts/rmedium.ttf"));
        textView.setPadding(hl.L(10.0f), 0, hl.L(12.0f), 0);
        int L = hl.L(18.0f);
        textView.setBackground(aob.i0(L, L, L, L, -984578, -1903620, -1903620));
        Drawable e = c00.e(context, 2131232838);
        e.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        e.setBounds(0, 0, hl.L(14.0f), hl.L(14.0f));
        textView.setCompoundDrawables(e, null, null, null);
        iye.a(textView);
        frameLayout2.addView(textView, tre.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        frameLayout.addView(frameLayout4, tre.c(-1.0f, -1));
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
        textView2.setTypeface(uqc.r0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView l = ik8.l(this.e, textView2, tre.d(-1, 112.0f, 55, 8.0f, 32.0f, 8.0f, 0.0f), context);
        l.setText(ob6.M0(2131742851, null));
        l.setTextColor(-15556886);
        l.setTextSize(1, 14.0f);
        l.setTypeface(hl.n1("fonts/rmedium.ttf"));
        l.setGravity(17);
        l.setCompoundDrawablePadding(hl.L(3.0f));
        Drawable mutate = context.getResources().getDrawable(2131232403).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, hl.L(16.0f), hl.L(16.0f));
        l.setCompoundDrawables(mutate, null, null, null);
        TextView l2 = ik8.l(this.e, l, tre.d(-2, 28.0f, 49, 0.0f, 149.0f, 0.0f, 0.0f), context);
        this.b = l2;
        l2.setText(ob6.M0(2131742644, null));
        l2.setTextColor(-15556886);
        l2.setTextSize(1, 14.0f);
        l2.setTypeface(hl.n1("fonts/rmedium.ttf"));
        l2.setGravity(17);
        l2.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        int L2 = hl.L(18.0f);
        l2.setBackground(aob.i0(L2, L2, L2, L2, -984578, -1903620, -1903620));
        iye.a(l2);
        this.e.addView(l2, tre.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final sqc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                sqc sqcVar = this.b;
                switch (b) {
                    case 0:
                        if (!sqcVar.h && !sqcVar.n) {
                            qu2 qu2Var = sqcVar.f;
                            if (qu2Var != null) {
                                qu2Var.run();
                            }
                            sqcVar.a(true);
                            return;
                        }
                        return;
                    default:
                        sqcVar.a(false);
                        return;
                }
            }
        };
        frameLayout3.setOnClickListener(onClickListener);
        this.a.setOnClickListener(onClickListener);
        l2.setOnClickListener(new View.OnClickListener(this) {
            public final sqc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                sqc sqcVar = this.b;
                switch (b) {
                    case 0:
                        if (!sqcVar.h && !sqcVar.n) {
                            qu2 qu2Var = sqcVar.f;
                            if (qu2Var != null) {
                                qu2Var.run();
                            }
                            sqcVar.a(true);
                            return;
                        }
                        return;
                    default:
                        sqcVar.a(false);
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
            this.r.setInterpolator(k43.h);
            this.r.addUpdateListener(new pzb(this, (byte) 12));
            this.r.addListener(new omb(this, (byte) 26));
            this.r.start();
        }
    }
}
