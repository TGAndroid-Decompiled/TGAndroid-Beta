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
public class oq4 extends FrameLayout implements g94, vlb {
    public Runnable E;
    public final po F;
    public final ArrayList G;
    public final qmb H;
    public nq4 I;
    public int J;
    public final fn0 a;
    public final fn0 b;
    public final h94 c;
    public final ylb d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final l7 r;
    public im0 s;
    public Drawable w;
    public boolean x;
    public boolean y;

    public oq4(Context context, ylb ylbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        d53 d53Var = d53.h;
        this.a = new fn0(0, this, d53Var, 380L, false);
        this.b = new fn0(1, this, d53Var, 380L, true);
        this.c = new h94(2, this, uo.a, 280L);
        this.F = new po(null);
        this.G = new ArrayList();
        this.d = ylbVar;
        l7 l7Var = new l7((byte) 3, context, this);
        this.r = l7Var;
        l7Var.setTextSize(1, 15.0f);
        l7Var.setCursorWidth(1.5f);
        l7Var.setInputType(l7Var.getInputType() | 176);
        l7Var.setSingleLine(true);
        l7Var.setBackground(null);
        l7Var.setVerticalScrollBarEnabled(false);
        l7Var.setHorizontalScrollBarEnabled(false);
        l7Var.setPadding(gm.L(48.0f), 0, gm.L(48.0f), 0);
        l7Var.setClipToPadding(true);
        l7Var.setImeOptions(268435459);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        l7Var.setGravity(i | 16);
        l7Var.addTextChangedListener(new b7(this, (byte) 25));
        if (Build.VERSION.SDK_INT >= 35) {
            l7Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(l7Var, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232522);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(imageView, qoe.d(24, 24.0f, i2 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (jb6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        addView(linearLayout, qoe.d(-2, -1.0f, i3 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231988);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new sf3(this, (byte) 21));
        if (jb6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        addView(imageView2, qoe.d(24, 24.0f, i4 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        qmb qmbVar = new qmb((byte) 7, getContext(), this);
        this.H = qmbVar;
        qmbVar.setOrientation(0);
        qmbVar.setVisibility(0);
        addView(qmbVar, qoe.d(-2, 32.0f, (jb6.a0 ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            ImageView imageView = this.f;
            wp4.d(imageView, f);
            imageView.setRotation((1.0f - f) * 90.0f);
        } else if (i == 1) {
            wp4.d(this.e, f);
        } else if (i == 2) {
            b();
        }
    }

    public final void a(r7 r7Var) {
        this.h.addView(r7Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.Oi));
    }

    public final void b() {
        int max = Math.max(gm.L(6.0f) + ((int) this.c.f), gm.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + gm.L(48.0f);
        if (!jb6.a0) {
            measuredWidth = max;
            max = measuredWidth;
        }
        Rect rect = gm.Q;
        l7 l7Var = this.r;
        rect.set(measuredWidth, 0, l7Var.getMeasuredWidth() - max, l7Var.getMeasuredHeight());
        l7Var.setClipBounds(rect);
        l7Var.setPadding(measuredWidth, 0, max, 0);
    }

    public final void c() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i < arrayList.size()) {
                if (((sh4) arrayList.get(i)).h) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            } else {
                e();
                return;
            }
        }
    }

    public final boolean d() {
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((sh4) arrayList.get(i)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.w.draw(canvas);
        }
        im0 im0Var = this.s;
        if (im0Var != null) {
            im0Var.setBounds(getPaddingLeft() - gm.L(4.0f), getPaddingTop() - gm.L(4.0f), gm.L(4.0f) + (getWidth() - getPaddingRight()), gm.L(4.0f) + (getHeight() - getPaddingBottom()));
            this.s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e() {
        Integer num;
        boolean z;
        int i;
        int i2;
        ArrayList arrayList = this.G;
        boolean isEmpty = arrayList.isEmpty();
        this.b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new h7((byte) 1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) d53.g);
        transitionSet.addListener((Transition.TransitionListener) new i7(this, (byte) 1));
        qmb qmbVar = this.H;
        TransitionManager.beginDelayedTransition(qmbVar, transitionSet);
        int i3 = 0;
        while (i3 < qmbVar.getChildCount()) {
            if (!arrayList2.remove(((q7) qmbVar.getChildAt(i3)).getFilter())) {
                qmbVar.removeViewAt(i3);
                i3--;
            }
            i3++;
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            sh4 sh4Var = (sh4) arrayList2.get(i4);
            sh4Var.getClass();
            q7 q7Var = new q7(getContext(), this.d);
            q7Var.r = true;
            q7Var.updateColors();
            q7Var.setData(sh4Var);
            q7Var.setOnClickListener(new tf3(this, q7Var, (byte) 12));
            boolean z2 = jb6.a0;
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
            qmbVar.addView(q7Var, qoe.t(-2, -1, 0, i, 0, i2, 0));
        }
        for (int i5 = 0; i5 < qmbVar.getChildCount(); i5++) {
            q7 q7Var2 = (q7) qmbVar.getChildAt(i5);
            if (i5 == this.J) {
                z = true;
            } else {
                z = false;
            }
            q7Var2.setExpanded(z);
        }
        if (!isEmpty) {
            num = 1;
        } else {
            num = null;
        }
        qmbVar.setTag(num);
    }

    public final void f(sh4 sh4Var) {
        sj3 sj3Var;
        if (sh4Var.h) {
            ArrayList arrayList = this.G;
            arrayList.remove(sh4Var);
            int i = this.J;
            if (i < 0 || i > arrayList.size() - 1) {
                this.J = arrayList.size() - 1;
            }
            e();
            nq4 nq4Var = this.I;
            if (nq4Var != null && (sj3Var = ((pj3) nq4Var).a.D0) != null) {
                sj3Var.R(false);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b();
    }

    public void setBlurredBackgroundVisibility(float f) {
        boolean z;
        int i;
        int i2 = (int) (f * 255.0f);
        im0 im0Var = this.s;
        boolean z2 = true;
        if (im0Var != null && im0Var.c != i2) {
            im0Var.setAlpha(i2);
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

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setCloseButtonVisible(boolean z) {
        boolean z2;
        this.n = z;
        if (!z && this.r.length() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.a.a(z2, true);
    }

    public void setSearchFiltersListener(nq4 nq4Var) {
        this.I = nq4Var;
    }

    public void setupBlurredBackground(im0 im0Var) {
        wi8.r(im0Var, gm.L(20.0f), 4.0f);
        this.s = im0Var;
    }

    @Override
    public final void updateColors() {
        boolean o;
        float f;
        int p1;
        Drawable b0;
        ylb ylbVar = this.d;
        if (ylbVar != null) {
            o = ylbVar.a();
        } else {
            o = cmb.I.o();
        }
        if (this.x) {
            b0 = cmb.d0(gm.L(20.0f), cmb.v0(cmb.c6, ylbVar));
        } else {
            int L = gm.L(20.0f);
            if (this.y) {
                p1 = cmb.v0(cmb.c6, ylbVar);
            } else {
                int i = cmb.F6;
                if (o) {
                    f = 0.07f;
                } else {
                    f = 0.05f;
                }
                p1 = cmb.p1(f, cmb.v0(i, ylbVar));
            }
            b0 = cmb.b0(L, p1);
        }
        this.w = b0;
        int i2 = cmb.F6;
        int p12 = cmb.p1(0.6f, cmb.v0(i2, ylbVar));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(p12, mode);
        int p13 = cmb.p1(0.6f, cmb.v0(i2, ylbVar));
        ImageView imageView = this.f;
        imageView.setColorFilter(p13, mode);
        imageView.setBackground(cmb.f0(cmb.v0(cmb.h6, ylbVar), 1, gm.L(17.0f)));
        int p14 = cmb.p1(0.5f, cmb.v0(i2, ylbVar));
        l7 l7Var = this.r;
        l7Var.setHintTextColor(p14);
        l7Var.setTextColor(cmb.v0(i2, ylbVar));
        l7Var.setCursorColor(cmb.v0(cmb.Oi, ylbVar));
        im0 im0Var = this.s;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = linearLayout.getChildAt(i3);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                if (r7Var.getIconView() != null) {
                    r7Var.getIconView().setColorFilter(cmb.p1(0.6f, cmb.v0(cmb.F6, ylbVar)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(cmb.f0(cmb.v0(cmb.h6, ylbVar), 1, gm.L(17.0f)));
            }
        }
        qmb qmbVar = this.H;
        int childCount2 = qmbVar.getChildCount();
        for (int i4 = 0; i4 < childCount2; i4++) {
            if (qmbVar.getChildAt(i4) instanceof q7) {
                ((q7) qmbVar.getChildAt(i4)).updateColors();
            }
        }
        invalidate();
    }

    @Override
    public final void V(float f, int i) {
    }
}
