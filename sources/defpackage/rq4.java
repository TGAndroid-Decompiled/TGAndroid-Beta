package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class rq4 extends FrameLayout implements s84, snb {
    public Runnable E;
    public long F;
    public final pn G;
    public final ArrayList H;
    public final oob I;
    public qq4 J;
    public int K;
    public final fm0 a;
    public final fm0 b;
    public final t84 c;
    public final vnb d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final m7 r;
    public jl0 s;
    public Drawable w;
    public boolean x;
    public boolean y;

    public rq4(Context context, vnb vnbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        k43 k43Var = k43.h;
        this.a = new fm0(0, this, k43Var, 380L, false);
        this.b = new fm0(1, this, k43Var, 380L, true);
        this.c = new t84(2, this, un.a, 280L);
        this.F = -1L;
        this.G = new pn(null);
        this.H = new ArrayList();
        this.d = vnbVar;
        m7 m7Var = new m7((byte) 3, context, this);
        this.r = m7Var;
        m7Var.setTextSize(1, 15.0f);
        m7Var.setCursorWidth(1.5f);
        m7Var.setInputType(m7Var.getInputType() | 176);
        m7Var.setSingleLine(true);
        m7Var.setBackground(null);
        m7Var.setVerticalScrollBarEnabled(false);
        m7Var.setHorizontalScrollBarEnabled(false);
        m7Var.setPadding(hl.L(48.0f), 0, hl.L(48.0f), 0);
        m7Var.setClipToPadding(true);
        m7Var.setImeOptions(268435459);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        m7Var.setGravity(i | 16);
        m7Var.addTextChangedListener(new c7(this, (byte) 24));
        if (Build.VERSION.SDK_INT >= 35) {
            m7Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(m7Var, tre.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232521);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(imageView, tre.d(24, 24.0f, i2 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (ob6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        addView(linearLayout, tre.d(-2, -1.0f, i3 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231987);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new mh3(this, (byte) 20));
        if (ob6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        addView(imageView2, tre.d(24, 24.0f, i4 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        oob oobVar = new oob((byte) 7, getContext(), this);
        this.I = oobVar;
        oobVar.setOrientation(0);
        oobVar.setVisibility(0);
        addView(oobVar, tre.d(-2, 32.0f, (ob6.a0 ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        c();
        updateColors();
    }

    public final void a(s7 s7Var) {
        this.h.addView(s7Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.Pi));
    }

    public final void b() {
        boolean z;
        k43 k43Var;
        if (!this.n && this.r.length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        long j = this.F;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        fm0 fm0Var = this.a;
        if (i > 0 && z != fm0Var.f) {
            if (z) {
                j = 380;
            }
            fm0Var.d = j;
            t84 t84Var = fm0Var.h;
            if (t84Var != null) {
                t84Var.d = j;
            }
            if (z) {
                k43Var = k43.h;
            } else {
                k43Var = k43.g;
            }
            fm0Var.c = k43Var;
            if (t84Var != null) {
                t84Var.c = k43Var;
            }
        }
        fm0Var.a(z, true);
    }

    public final void c() {
        int max = Math.max(hl.L(6.0f) + ((int) this.c.f), hl.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + hl.L(48.0f);
        if (!ob6.a0) {
            measuredWidth = max;
            max = measuredWidth;
        }
        Rect rect = hl.Q;
        m7 m7Var = this.r;
        rect.set(measuredWidth, 0, m7Var.getMeasuredWidth() - max, m7Var.getMeasuredHeight());
        m7Var.setClipBounds(rect);
        m7Var.setPadding(measuredWidth, 0, max, 0);
    }

    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i < arrayList.size()) {
                if (((ph4) arrayList.get(i)).h) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            } else {
                f();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.w.draw(canvas);
        }
        jl0 jl0Var = this.s;
        if (jl0Var != null) {
            jl0Var.setBounds(getPaddingLeft() - hl.L(4.0f), getPaddingTop() - hl.L(4.0f), hl.L(4.0f) + (getWidth() - getPaddingRight()), hl.L(4.0f) + (getHeight() - getPaddingBottom()));
            this.s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final boolean e() {
        ArrayList arrayList = this.H;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((ph4) arrayList.get(i)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        Integer num;
        boolean z;
        int i;
        int i2;
        ArrayList arrayList = this.H;
        boolean isEmpty = arrayList.isEmpty();
        this.b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new i7((byte) 1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) k43.g);
        transitionSet.addListener((Transition.TransitionListener) new j7(this, (byte) 1));
        oob oobVar = this.I;
        TransitionManager.beginDelayedTransition(oobVar, transitionSet);
        int i3 = 0;
        while (i3 < oobVar.getChildCount()) {
            if (!arrayList2.remove(((r7) oobVar.getChildAt(i3)).getFilter())) {
                oobVar.removeViewAt(i3);
                i3--;
            }
            i3++;
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            ph4 ph4Var = (ph4) arrayList2.get(i4);
            ph4Var.getClass();
            r7 r7Var = new r7(getContext(), this.d);
            r7Var.r = true;
            r7Var.updateColors();
            r7Var.setData(ph4Var);
            r7Var.setOnClickListener(new je3(this, r7Var, (byte) 14));
            boolean z2 = ob6.a0;
            if (z2) {
                i = 6;
            } else {
                i = 0;
            }
            if (z2) {
                i2 = 0;
            } else {
                i2 = 6;
            }
            oobVar.addView(r7Var, tre.t(-2, -1, 0, i, 0, i2, 0));
        }
        for (int i5 = 0; i5 < oobVar.getChildCount(); i5++) {
            r7 r7Var2 = (r7) oobVar.getChildAt(i5);
            if (i5 == this.K) {
                z = true;
            } else {
                z = false;
            }
            r7Var2.setExpanded(z);
        }
        if (!isEmpty) {
            num = 1;
        } else {
            num = null;
        }
        oobVar.setTag(num);
    }

    public final void g(ph4 ph4Var) {
        bj3 bj3Var;
        if (ph4Var.h) {
            ArrayList arrayList = this.H;
            arrayList.remove(ph4Var);
            int i = this.K;
            if (i < 0 || i > arrayList.size() - 1) {
                this.K = arrayList.size() - 1;
            }
            f();
            qq4 qq4Var = this.J;
            if (qq4Var != null && (bj3Var = ((xi3) qq4Var).a.D0) != null) {
                bj3Var.S(false);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        c();
    }

    public void setBlurredBackgroundVisibility(float f) {
        boolean z;
        int i;
        int i2 = (int) (f * 255.0f);
        jl0 jl0Var = this.s;
        boolean z2 = true;
        if (jl0Var != null && jl0Var.c != i2) {
            jl0Var.setAlpha(i2);
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.w;
        if (drawable != null && drawable.getAlpha() != (i = 255 - i2)) {
            this.w.setAlpha(i);
        } else {
            z2 = z;
        }
        if (z2) {
            invalidate();
        }
    }

    public void setCloseButtonHideDuration(long j) {
        this.F = j;
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setCloseButtonVisible(boolean z) {
        this.n = z;
        b();
    }

    public void setSearchFiltersListener(qq4 qq4Var) {
        this.J = qq4Var;
    }

    public void setupBlurredBackground(jl0 jl0Var) {
        ik8.r(jl0Var, hl.L(20.0f), 4.0f);
        this.s = jl0Var;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            ImageView imageView = this.f;
            zp4.d(imageView, f);
            imageView.setRotation((1.0f - f) * 90.0f);
        } else if (i == 1) {
            zp4.d(this.e, f);
        } else if (i == 2) {
            c();
        }
    }

    @Override
    public final void updateColors() {
        boolean o;
        float f;
        int p1;
        Drawable b0;
        vnb vnbVar = this.d;
        if (vnbVar != null) {
            o = vnbVar.a();
        } else {
            o = aob.I.o();
        }
        if (this.x) {
            b0 = aob.d0(hl.L(20.0f), aob.v0(aob.d6, vnbVar));
        } else {
            int L = hl.L(20.0f);
            if (this.y) {
                p1 = aob.v0(aob.d6, vnbVar);
            } else {
                int i = aob.G6;
                if (o) {
                    f = 0.07f;
                } else {
                    f = 0.05f;
                }
                p1 = aob.p1(f, aob.v0(i, vnbVar));
            }
            b0 = aob.b0(L, p1);
        }
        this.w = b0;
        int i2 = aob.G6;
        int p12 = aob.p1(0.6f, aob.v0(i2, vnbVar));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(p12, mode);
        int p13 = aob.p1(0.6f, aob.v0(i2, vnbVar));
        ImageView imageView = this.f;
        imageView.setColorFilter(p13, mode);
        imageView.setBackground(aob.f0(aob.v0(aob.i6, vnbVar), 1, hl.L(17.0f)));
        int p14 = aob.p1(0.5f, aob.v0(i2, vnbVar));
        m7 m7Var = this.r;
        m7Var.setHintTextColor(p14);
        m7Var.setTextColor(aob.v0(i2, vnbVar));
        m7Var.setCursorColor(aob.v0(aob.Pi, vnbVar));
        jl0 jl0Var = this.s;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = linearLayout.getChildAt(i3);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.getIconView() != null) {
                    s7Var.getIconView().setColorFilter(aob.p1(0.6f, aob.v0(aob.G6, vnbVar)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(aob.f0(aob.v0(aob.i6, vnbVar), 1, hl.L(17.0f)));
            }
        }
        oob oobVar = this.I;
        int childCount2 = oobVar.getChildCount();
        for (int i4 = 0; i4 < childCount2; i4++) {
            if (oobVar.getChildAt(i4) instanceof r7) {
                ((r7) oobVar.getChildAt(i4)).updateColors();
            }
        }
        invalidate();
    }

    @Override
    public final void v0(float f, int i) {
    }
}
