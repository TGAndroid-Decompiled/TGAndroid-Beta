package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class v94 extends FrameLayout implements vlb {
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public float I;
    public final ylb J;
    public boolean K;
    public int L;
    public int M;
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final mu8 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int x;
    public final Paint y;

    public v94(int i, ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d2;
        ViewGroup.LayoutParams d3;
        ViewGroup.LayoutParams d4;
        this.x = z8c.t0;
        this.y = new Paint(1);
        this.a = z2;
        this.J = ylbVar;
        TextView textView = new TextView(context);
        this.b = textView;
        td4.x(textView, cmb.Jf, ylbVar, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z) {
            d = qoe.i(-2.0f, -2.0f, 8388659, i, 8.0f, 40.0f, 0.0f);
        } else {
            d = qoe.d(-2, -2.0f, 51, i, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        anb.X(textView2, cmb.Nf, ylbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z) {
            d2 = qoe.i(-2.0f, -2.0f, 8388659, i, 30.0f, 100.0f, 0.0f);
        } else {
            d2 = qoe.d(-2, -2.0f, 51, i, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d2);
        if (z2) {
            mu8 mu8Var = new mu8(context);
            this.d = mu8Var;
            anb.X(mu8Var, cmb.Ii, ylbVar);
            mu8Var.setText(jb6.M0(2131754483, null));
            if (z) {
                d3 = qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d3 = qoe.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(mu8Var, d3);
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            td4.x(textView3, cmb.Hi, ylbVar, 1, 14.0f);
            textView3.setText(jb6.M0(2131744544, null));
            if (z) {
                d4 = qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d4 = qoe.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d4);
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, bnb bnbVar) {
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.Di));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.Ei));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.Gi));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.p6));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.Nf));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.Ji));
    }

    public final void b(boolean z, boolean z2) {
        if (this.a) {
            this.d.a(z, z2);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z, boolean z2, int i, int i2, boolean z3) {
        boolean z4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        float f7 = 0.0f;
        if (this.f != stickerSetCovered) {
            if (z) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            this.I = f6;
            invalidate();
        }
        this.f = stickerSetCovered;
        this.E = i;
        this.F = i2;
        TextView textView = this.b;
        if (i2 != 0) {
            if (i2 != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f.set.title);
                try {
                    do4 do4Var = new do4(cmb.p6, this.J);
                    int i3 = this.E;
                    spannableStringBuilder.setSpan(do4Var, i3, this.F + i3, 33);
                } catch (Exception unused) {
                }
                textView.setText(spannableStringBuilder);
            }
        } else {
            textView.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z5 = stickerSet.emojis;
        int i4 = stickerSet.count;
        TextView textView2 = this.c;
        if (z5) {
            textView2.setText(jb6.G(i4, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(jb6.G(i4, "Stickers", new Object[0]));
        }
        this.w = z;
        if (this.a) {
            boolean z6 = this.s;
            mu8 mu8Var = this.d;
            if (z6) {
                mu8Var.setVisibility(0);
                if (!z3 && !hs6.d0(this.x).D0(stickerSetCovered.set.id, true)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.r = z4;
                TextView textView3 = this.e;
                if (z2) {
                    if (z4) {
                        textView3.setVisibility(0);
                    } else {
                        mu8Var.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.h = animatorSet2;
                    animatorSet2.setDuration(250L);
                    AnimatorSet animatorSet3 = this.h;
                    if (this.r) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    float[] fArr = {f};
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView3, property, fArr);
                    if (this.r) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    float[] fArr2 = {f2};
                    Property property2 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, fArr2);
                    if (this.r) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    float[] fArr3 = {f3};
                    Property property3 = View.SCALE_Y;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView3, property3, fArr3);
                    if (this.r) {
                        f4 = 0.0f;
                    } else {
                        f4 = 1.0f;
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(mu8Var, property, f4);
                    if (this.r) {
                        f5 = 0.0f;
                    } else {
                        f5 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(mu8Var, property2, f5);
                    if (!this.r) {
                        f7 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(mu8Var, property3, f7));
                    this.h.addListener(new t94(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z4) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    mu8Var.setVisibility(4);
                    mu8Var.setAlpha(0.0f);
                    mu8Var.setScaleX(0.0f);
                    mu8Var.setScaleY(0.0f);
                    return;
                } else {
                    mu8Var.setVisibility(0);
                    mu8Var.setAlpha(1.0f);
                    mu8Var.setScaleX(1.0f);
                    mu8Var.setScaleY(1.0f);
                    textView3.setVisibility(4);
                    textView3.setAlpha(0.0f);
                    textView3.setScaleX(0.0f);
                    textView3.setScaleY(0.0f);
                    return;
                }
            }
            mu8Var.setVisibility(8);
        }
    }

    public final void d(int i, CharSequence charSequence) {
        this.G = charSequence;
        this.H = i;
        ylb ylbVar = this.J;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.G);
            try {
                spannableStringBuilder.setSpan(new do4(cmb.p6, ylbVar), 0, this.H, 33);
                spannableStringBuilder.setSpan(new do4(cmb.Nf, ylbVar), this.H, this.G.length(), 33);
            } catch (Exception unused) {
            }
            this.c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), 1073741824));
        if (this.a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = wi8.g(measuredWidth, measuredWidth2, 2, gm.L(14.0f));
            } else {
                layoutParams.rightMargin = gm.L(14.0f);
            }
            measureChildWithMargins(this.b, i, measuredWidth, i2, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.a) {
            this.s = true;
            this.d.setOnClickListener(onClickListener);
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z) {
        this.n = z;
    }

    @Override
    public final void updateColors() {
        mu8 mu8Var;
        if (this.a && (mu8Var = this.d) != null) {
            int i = cmb.Di;
            ylb ylbVar = this.J;
            mu8Var.setProgressColor(cmb.v0(i, ylbVar));
            int v0 = cmb.v0(cmb.Ei, ylbVar);
            int v02 = cmb.v0(cmb.Gi, ylbVar);
            if (!this.K || this.L != v0 || this.M != v02) {
                this.K = true;
                this.L = v0;
                this.M = v02;
                mu8Var.setBackground(ulb.e(v0, 14.0f));
            }
            mu8Var.invalidate();
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }
}
