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
public final class m84 extends FrameLayout implements tjb {
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public float I;
    public final wjb J;
    public boolean K;
    public int L;
    public int M;
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final ls8 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int x;
    public final Paint y;

    public m84(int i, wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        ViewGroup.LayoutParams d;
        ViewGroup.LayoutParams d2;
        ViewGroup.LayoutParams d3;
        ViewGroup.LayoutParams d4;
        this.x = y6c.t0;
        this.y = new Paint(1);
        this.a = z2;
        this.J = wjbVar;
        TextView textView = new TextView(context);
        this.b = textView;
        tb4.w(textView, bkb.Jf, wjbVar, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z) {
            d = nme.i(-2.0f, -2.0f, 8388659, i, 8.0f, 40.0f, 0.0f);
        } else {
            d = nme.d(-2, -2.0f, 51, i, 8.0f, 40.0f, 0.0f);
        }
        addView(textView, d);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        zkb.X(textView2, bkb.Nf, wjbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        if (z) {
            d2 = nme.i(-2.0f, -2.0f, 8388659, i, 30.0f, 100.0f, 0.0f);
        } else {
            d2 = nme.d(-2, -2.0f, 51, i, 30.0f, 100.0f, 0.0f);
        }
        addView(textView2, d2);
        if (z2) {
            ls8 ls8Var = new ls8(context);
            this.d = ls8Var;
            zkb.X(ls8Var, bkb.Ii, wjbVar);
            ls8Var.setText(k96.M0(2131754483, null));
            if (z) {
                d3 = nme.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d3 = nme.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(ls8Var, d3);
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            tb4.w(textView3, bkb.Hi, wjbVar, 1, 14.0f);
            textView3.setText(k96.M0(2131744618, null));
            if (z) {
                d4 = nme.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                d4 = nme.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(textView3, d4);
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, alb albVar) {
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.Di));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.Ei));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.Gi));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.p6));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.Nf));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.Ji));
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
                    cm4 cm4Var = new cm4(bkb.p6, this.J);
                    int i3 = this.E;
                    spannableStringBuilder.setSpan(cm4Var, i3, this.F + i3, 33);
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
            textView2.setText(k96.G(i4, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(k96.G(i4, "Stickers", new Object[0]));
        }
        this.w = z;
        if (this.a) {
            boolean z6 = this.s;
            ls8 ls8Var = this.d;
            if (z6) {
                ls8Var.setVisibility(0);
                if (!z3 && !hq6.d0(this.x).D0(stickerSetCovered.set.id, true)) {
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
                        ls8Var.setVisibility(0);
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
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ls8Var, property, f4);
                    if (this.r) {
                        f5 = 0.0f;
                    } else {
                        f5 = 1.0f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ls8Var, property2, f5);
                    if (!this.r) {
                        f7 = 1.0f;
                    }
                    animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(ls8Var, property3, f7));
                    this.h.addListener(new k84(this));
                    this.h.setInterpolator(new OvershootInterpolator(1.02f));
                    this.h.start();
                    return;
                } else if (z4) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    ls8Var.setVisibility(4);
                    ls8Var.setAlpha(0.0f);
                    ls8Var.setScaleX(0.0f);
                    ls8Var.setScaleY(0.0f);
                    return;
                } else {
                    ls8Var.setVisibility(0);
                    ls8Var.setAlpha(1.0f);
                    ls8Var.setScaleX(1.0f);
                    ls8Var.setScaleY(1.0f);
                    textView3.setVisibility(4);
                    textView3.setAlpha(0.0f);
                    textView3.setScaleX(0.0f);
                    textView3.setScaleY(0.0f);
                    return;
                }
            }
            ls8Var.setVisibility(8);
        }
    }

    public final void d(int i, CharSequence charSequence) {
        this.G = charSequence;
        this.H = i;
        wjb wjbVar = this.J;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.G);
            try {
                spannableStringBuilder.setSpan(new cm4(bkb.p6, wjbVar), 0, this.H, 33);
                spannableStringBuilder.setSpan(new cm4(bkb.Nf, wjbVar), this.H, this.G.length(), 33);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m84.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), 1073741824));
        if (this.a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = ug8.g(measuredWidth, measuredWidth2, 2, gl.L(14.0f));
            } else {
                layoutParams.rightMargin = gl.L(14.0f);
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
        ls8 ls8Var;
        if (this.a && (ls8Var = this.d) != null) {
            int i = bkb.Di;
            wjb wjbVar = this.J;
            ls8Var.setProgressColor(bkb.v0(i, wjbVar));
            int v0 = bkb.v0(bkb.Ei, wjbVar);
            int v02 = bkb.v0(bkb.Gi, wjbVar);
            if (!this.K || this.L != v0 || this.M != v02) {
                this.K = true;
                this.L = v0;
                this.M = v02;
                ls8Var.setBackground(sjb.e(v0, 14.0f));
            }
            ls8Var.invalidate();
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
