package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.PhotoViewer;
public final class q68 extends FrameLayout {
    public static final Rect c0 = new Rect();
    public boolean E;
    public int F;
    public boolean G;
    public final boolean H;
    public jo6 I;
    public no6 J;
    public final Paint K;
    public AnimatorSet L;
    public final ylb M;
    public rna N;
    public qna O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public Bitmap T;
    public Float U;
    public float V;
    public o68 W;
    public final m68 a;
    public SpannableString a0;
    public final ne6 b;
    public SpannableString b0;
    public final FrameLayout c;
    public final jh2 d;
    public final ImageView e;
    public final TextView f;
    public final n68 h;
    public AnimatorSet n;
    public boolean r;
    public boolean s;
    public final kl7 w;
    public boolean x;
    public p68 y;

    public q68(Context context, ylb ylbVar) {
        super(context);
        this.w = new kl7(this, (byte) 26);
        this.H = true;
        this.K = new Paint();
        this.V = 1.0f;
        this.M = ylbVar;
        setWillNotDraw(false);
        ne6 ne6Var = new ne6((byte) 6, context, this);
        this.b = ne6Var;
        addView(ne6Var, qoe.c(80.0f, 80));
        m68 m68Var = new m68(this, context);
        this.a = m68Var;
        m68Var.setBlurAllowed(true);
        ne6Var.addView(m68Var, qoe.c(-1.0f, -1));
        n68 n68Var = new n68(context, (byte) 0);
        n68Var.b = new RectF();
        this.h = n68Var;
        n68Var.setWillNotDraw(false);
        n68Var.setPadding(gm.L(5.0f), 0, gm.L(5.0f), 0);
        ne6Var.addView(n68Var, qoe.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(2131232566);
        n68Var.addView(imageView, qoe.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n68Var.addView(textView, qoe.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        jh2 jh2Var = new jh2(24, ylbVar, context);
        this.d = jh2Var;
        jh2Var.setDrawBackgroundAsArc(7);
        jh2Var.b(cmb.V9, cmb.W9, cmb.U9);
        addView(jh2Var, qoe.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        jh2Var.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, qoe.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.F = gm.L(80.0f);
    }

    public final boolean a() {
        return this.d.a.q;
    }

    public final void b(int i, boolean z, boolean z2) {
        float f;
        float f2;
        this.d.a.f(i, z, z2);
        boolean z3 = false;
        if (this.E) {
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.L = null;
            }
            float f3 = 1.0f;
            ne6 ne6Var = this.b;
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L = animatorSet2;
                if (z) {
                    f2 = 0.787f;
                } else {
                    f2 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ne6Var, View.SCALE_X, f2);
                if (z) {
                    f3 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(ne6Var, View.SCALE_Y, f3));
                this.L.setDuration(200L);
                this.L.addListener(new jf4((byte) 20, this, z));
                this.L.start();
            } else {
                if (z) {
                    f = 0.787f;
                } else {
                    f = 1.0f;
                }
                ne6Var.setScaleX(f);
                if (z) {
                    f3 = 0.787f;
                }
                ne6Var.setScaleY(f3);
            }
        }
        jo6 jo6Var = this.I;
        if (jo6Var != null && jo6Var.c() && a()) {
            z3 = true;
        }
        setHighQuality(z3);
    }

    public final void c(boolean z, Float f) {
        if (this.P != z) {
            boolean isLaidOut = isLaidOut();
            Bitmap bitmap = this.T;
            m68 m68Var = this.a;
            if (isLaidOut) {
                this.T = gm.H3(m68Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.V = 0.0f;
            } else {
                if (bitmap != null) {
                    bitmap.recycle();
                    this.T = null;
                }
                this.V = 1.0f;
            }
            this.P = z;
            this.U = f;
            m68Var.setHasBlur(z);
            m68Var.invalidate();
            if (z) {
                h(z);
            }
        }
    }

    @Override
    public final void clearAnimation() {
        float f;
        super.clearAnimation();
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L = null;
            jh2 jh2Var = this.d;
            float f2 = 1.0f;
            if (jh2Var.a.q) {
                f = 0.787f;
            } else {
                f = 1.0f;
            }
            ne6 ne6Var = this.b;
            ne6Var.setScaleX(f);
            if (jh2Var.a.q) {
                f2 = 0.787f;
            }
            ne6Var.setScaleY(f2);
        }
    }

    public final void d(jo6 jo6Var, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        float f;
        boolean z6 = false;
        this.x = false;
        this.I = jo6Var;
        this.r = z3;
        this.s = z4;
        if (z4) {
            jo6Var.k(this.w);
        }
        jo6 jo6Var2 = this.I;
        boolean z7 = jo6Var2.b;
        float f2 = 0.0f;
        ImageView imageView = this.e;
        TextView textView = this.f;
        n68 n68Var = this.h;
        m68 m68Var = this.a;
        if (z7 && !jo6Var2.d()) {
            m68Var.q();
            n68Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gm.L(13.0f);
            textView.setText(gm.g0(this.I.E, false, false));
        } else if (this.I.c() && a()) {
            n68Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gm.L(0.0f);
            textView.setText(jb6.M0(2131745099, null));
        } else {
            imageView.setVisibility(8);
            n68Var.setVisibility(4);
        }
        jo6 jo6Var3 = this.I;
        String str = jo6Var3.g;
        if (str != null) {
            m68Var.o(str, null, cmb.Q4);
        } else {
            String str2 = jo6Var3.c;
            if (str2 != null) {
                m68Var.o(str2, null, cmb.Q4);
            } else if (jo6Var3.I != null) {
                if (jo6Var3.b && !jo6Var3.d()) {
                    m68Var.o("vthumb://" + this.I.C + ":" + this.I.I, null, cmb.Q4);
                } else {
                    jo6 jo6Var4 = this.I;
                    m68Var.r(jo6Var4.J, jo6Var4.K, true);
                    m68Var.o("thumb://" + this.I.C + ":" + this.I.I, null, cmb.Q4);
                }
            } else {
                m68Var.setImageDrawable(cmb.Q4);
            }
        }
        if (z2 && PhotoViewer.Q0(this.I.I)) {
            z5 = true;
        } else {
            z5 = false;
        }
        m68Var.getImageReceiver().v0(!z5, true);
        if (z5) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.d.setAlpha(f);
        if (!z5) {
            f2 = 1.0f;
        }
        n68Var.setAlpha(f2);
        requestLayout();
        setHasSpoiler(jo6Var.M);
        if (jo6Var.c() && a()) {
            z6 = true;
        }
        setHighQuality(z6);
        f(jo6Var.N, z);
    }

    public final void e(defpackage.no6 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q68.e(no6):void");
    }

    public final void f(long j, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        if (z == this.S && j == this.R) {
            return;
        }
        this.R = j;
        this.S = z;
        if (j > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.a0 == null) {
                this.a0 = new SpannableString("⭐");
                pn2 pn2Var = new pn2(2131232769, 0);
                pn2Var.I = 0.7f;
                pn2Var.J = 0.7f;
                SpannableString spannableString = this.a0;
                spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.a0);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z) {
                if (this.b0 == null) {
                    this.b0 = new SpannableString("l");
                    pn2 pn2Var2 = new pn2(2131232248, 0);
                    SpannableString spannableString2 = this.b0;
                    spannableString2.setSpan(pn2Var2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.b0);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j));
            }
        } else {
            spannableStringBuilder = null;
        }
        m68 m68Var = this.a;
        m68Var.setBlurredText(spannableStringBuilder);
        m68Var.invalidate();
        this.b.invalidate();
    }

    public final void g(boolean z) {
        float f;
        float f2 = 0.0f;
        jh2 jh2Var = this.d;
        float alpha = jh2Var.getAlpha();
        if (z) {
            if (alpha == 1.0f) {
                return;
            }
        } else if (alpha == 0.0f) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        this.n.setDuration(180L);
        AnimatorSet animatorSet3 = this.n;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float[] fArr = {f};
        n68 n68Var = this.h;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n68Var, property, fArr);
        if (z) {
            f2 = 1.0f;
        }
        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(jh2Var, property, f2));
        this.n.addListener(new s38(this, (byte) 2));
        this.n.start();
    }

    public jh2 getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public bf0 getImageView() {
        return this.a;
    }

    public jo6 getPhotoEntry() {
        return this.I;
    }

    public float getScale() {
        return this.b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z) {
        m68 m68Var;
        ne6 ne6Var = this.b;
        if (ne6Var != null && (m68Var = this.a) != null && m68Var.getMeasuredHeight() > 0 && m68Var.getMeasuredWidth() > 0) {
            qna qnaVar = this.O;
            if (z) {
                if (qnaVar == null) {
                    this.O = qna.e(ne6Var);
                }
            } else if (qnaVar != null) {
                qnaVar.b(this);
                this.O = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qna qnaVar = this.O;
        if (qnaVar != null) {
            if (qnaVar.i) {
                this.O = qna.e(this);
            } else {
                qnaVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qna qnaVar = this.O;
        if (qnaVar != null) {
            qnaVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        jo6 jo6Var;
        no6 no6Var;
        boolean z = this.d.a.q;
        m68 m68Var = this.a;
        if (!z && this.b.getScaleX() == 1.0f && m68Var.getImageReceiver().E() && m68Var.getImageReceiver().i1 == 1.0f && (((jo6Var = this.I) == null || !PhotoViewer.Q0(jo6Var.I)) && ((no6Var = this.J) == null || !PhotoViewer.Q0(no6Var.g())))) {
            return;
        }
        int v0 = cmb.v0(cmb.W9, this.M);
        Paint paint = this.K;
        paint.setColor(v0);
        canvas.drawRect(0.0f, 0.0f, m68Var.getMeasuredWidth(), m68Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder();
        jo6 jo6Var = this.I;
        if (jo6Var != null && jo6Var.i() && this.I.d()) {
            sb.append(jb6.M0(2131753927, null));
        } else {
            jo6 jo6Var2 = this.I;
            if (jo6Var2 != null && jo6Var2.b) {
                sb.append(jb6.M0(2131753898, null) + ", " + jb6.z(this.I.E));
            } else {
                sb.append(jb6.M0(2131753913, null));
            }
        }
        if (this.I != null) {
            sb.append(". ");
            sb.append(jb6.D0().y0().format(this.I.D * 1000));
        }
        accessibilityNodeInfo.setText(sb);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296266, jb6.M0(2131747550, null)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), wi8.E(2.0f, this.F, 1073741824));
            return;
        }
        int i3 = 6;
        if (this.G) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.L(80.0f), 1073741824);
            if (this.r) {
                i3 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gm.L(i3 + 80), 1073741824));
            return;
        }
        if (this.r) {
            i3 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(i3 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q68.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 2131296266) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setDelegate(p68 p68Var) {
        this.y = p68Var;
    }

    public void setFastScrollDelegate(o68 o68Var) {
        this.W = o68Var;
    }

    public void setHasSpoiler(boolean z) {
        c(z, null);
    }

    public void setHighQuality(boolean z) {
        boolean z2;
        if (z && a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.Q != z2) {
            this.Q = z2;
            jo6 jo6Var = this.I;
            if (jo6Var != null) {
                boolean z3 = jo6Var.b;
                ImageView imageView = this.e;
                n68 n68Var = this.h;
                TextView textView = this.f;
                if (z3 && !jo6Var.d()) {
                    this.a.q();
                    n68Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gm.L(13.0f);
                    textView.setText(gm.g0(this.I.E, false, false));
                } else if (this.I.c()) {
                    n68Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gm.L(0.0f);
                    textView.setText(jb6.M0(2131745099, null));
                } else {
                    imageView.setVisibility(8);
                    n68Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z) {
        this.G = z;
    }

    public void setItemSize(int i) {
        this.F = i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        int i2 = this.F;
        layoutParams.height = i2;
        layoutParams.width = i2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        jh2 jh2Var = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) jh2Var.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = gm.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        jh2Var.setDrawBackgroundAsArc(6);
        this.E = true;
    }

    public void setNum(int i) {
        this.d.setNum(i);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
