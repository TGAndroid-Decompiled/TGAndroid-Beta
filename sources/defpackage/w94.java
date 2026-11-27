package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
public final class w94 extends FrameLayout implements snb {
    public int E;
    public final vnb a;
    public int b;
    public final im7 c;
    public final FrameLayout d;
    public final ei2 e;
    public final me7 f;
    public final int h;
    public float n;
    public float r;
    public float s;
    public boolean w;
    public boolean x;
    public boolean y;

    public w94(Context context, im7 im7Var, vnb vnbVar, me7 me7Var) {
        super(context);
        int i;
        boolean z;
        this.E = -1;
        this.c = im7Var;
        this.f = me7Var;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        addView(im7Var, tre.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        int L = hl.L(20.0f);
        int i2 = aob.d6;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        frameLayout.setBackground(b0);
        r4 r4Var = null;
        yob.j(frameLayout, b0, M, null, vnbVar);
        frameLayout.setElevation(hl.L(4.0f));
        addView(frameLayout, tre.e(40, 40, 49));
        ei2 ei2Var = new ei2(context);
        this.e = ei2Var;
        float f = ei2Var.c.getDisplayMetrics().density;
        float f2 = 2.5f * f;
        ci2 ci2Var = ei2Var.a;
        ci2Var.h = f2;
        ci2Var.b.setStrokeWidth(f2);
        ci2Var.q = 7.5f * f;
        ci2Var.a(0);
        ci2Var.r = (int) (10.0f * f);
        ci2Var.s = (int) (5.0f * f);
        ei2Var.invalidateSelf();
        float L2 = hl.L(2.25f);
        ci2Var.h = L2;
        ci2Var.b.setStrokeWidth(L2);
        ei2Var.invalidateSelf();
        this.a = vnbVar;
        int v0 = aob.v0(aob.Fi, vnbVar);
        this.b = v0;
        ci2Var.i = new int[]{v0};
        ci2Var.a(0);
        ci2Var.a(0);
        ei2Var.invalidateSelf();
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(ei2Var);
        frameLayout.addView(imageView, tre.e(32, 32, 17));
        frameLayout.setImportantForAccessibility(2);
        String M0 = ob6.M0(2131746067, null);
        u34 u34Var = new u34(this, me7Var, (byte) 1);
        ArrayList f3 = ihc.f(im7Var);
        int i3 = 0;
        while (true) {
            if (i3 < f3.size()) {
                if (TextUtils.equals(M0, ((AccessibilityNodeInfo.AccessibilityAction) ((s4) f3.get(i3)).a).getLabel())) {
                    i = ((s4) f3.get(i3)).a();
                    break;
                }
                i3++;
            } else {
                int i4 = -1;
                int i5 = 0;
                while (true) {
                    int[] iArr = ihc.d;
                    if (i5 >= 32 || i4 != -1) {
                        break;
                    }
                    int i6 = iArr[i5];
                    boolean z2 = true;
                    for (int i7 = 0; i7 < f3.size(); i7++) {
                        if (((s4) f3.get(i7)).a() != i6) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        i4 = i6;
                    }
                    i5++;
                }
                i = i4;
            }
        }
        if (i != -1) {
            s4 s4Var = new s4(null, i, M0, u34Var, null);
            View.AccessibilityDelegate e = ihc.e(im7Var);
            if (e != null) {
                if (e instanceof q4) {
                    r4Var = ((q4) e).a;
                } else {
                    r4Var = new r4(e);
                }
            }
            ihc.l(im7Var, r4Var == null ? new r4() : r4Var);
            int a = s4Var.a();
            ArrayList f4 = ihc.f(im7Var);
            int i8 = 0;
            while (true) {
                if (i8 >= f4.size()) {
                    break;
                } else if (((s4) f4.get(i8)).a() == a) {
                    f4.remove(i8);
                    break;
                } else {
                    i8++;
                }
            }
            ihc.f(im7Var).add(s4Var);
            ihc.h(0, im7Var);
        }
        b();
    }

    public final void a(boolean z) {
        this.w = false;
        this.x = false;
        this.E = -1;
        getParent().requestDisallowInterceptTouchEvent(false);
        if (z) {
            setRefreshing(true);
            this.f.run();
            return;
        }
        setRefreshing(false);
    }

    public final void b() {
        FrameLayout frameLayout = this.d;
        frameLayout.setVisibility(4);
        frameLayout.setTranslationY(-hl.L(48.0f));
        frameLayout.setAlpha(0.0f);
        this.e.stop();
        this.s = 0.0f;
        this.c.setTranslationY(0.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.y) {
            ei2 ei2Var = this.e;
            if (!ei2Var.d.isRunning()) {
                ei2Var.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        this.e.stop();
        this.d.animate().cancel();
        this.c.animate().cancel();
        this.w = false;
        this.x = false;
        this.E = -1;
        if (!this.y) {
            b();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w94.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.x) {
            return super.onTouchEvent(motionEvent);
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.E);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3 && actionMasked != 5 && actionMasked != 6) {
                    return true;
                }
                a(false);
                return true;
            } else if (findPointerIndex < 0) {
                a(false);
                return true;
            } else {
                this.s = Math.min(hl.L(112.0f), Math.max(0.0f, ((motionEvent.getY(findPointerIndex) - this.r) - this.h) * 0.5f));
                FrameLayout frameLayout = this.d;
                frameLayout.animate().cancel();
                frameLayout.setVisibility(0);
                frameLayout.setAlpha(Math.min(1.0f, this.s / hl.L(48.0f)));
                frameLayout.setTranslationY((this.s - hl.L(40.0f)) / 2.0f);
                im7 im7Var = this.c;
                im7Var.animate().cancel();
                im7Var.setTranslationY(this.s);
                float max = (Math.max(Math.min(1.0f, this.s / hl.L(72.0f)) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                ei2 ei2Var = this.e;
                ci2 ci2Var = ei2Var.a;
                ci2 ci2Var2 = ei2Var.a;
                if (!ci2Var.n) {
                    ci2Var.n = true;
                }
                ei2Var.invalidateSelf();
                if (max != ci2Var2.p) {
                    ci2Var2.p = max;
                }
                ei2Var.invalidateSelf();
                ci2Var2.e = 0.0f;
                ci2Var2.f = 0.8f * max;
                ei2Var.invalidateSelf();
                ci2Var2.g = bp1.g(max, 0.4f, -0.25f, 0.5f, Math.max(0.0f, this.s - hl.L(72.0f)) / hl.L(80.0f));
                ei2Var.invalidateSelf();
                return true;
            }
        }
        if (this.s >= hl.L(72.0f)) {
            z = true;
        }
        a(z);
        return true;
    }

    public void setIndicatorTop(int i) {
        FrameLayout frameLayout = this.d;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.topMargin == i) {
            return;
        }
        layoutParams.topMargin = i;
        frameLayout.requestLayout();
    }

    public void setRefreshing(boolean z) {
        boolean z2 = this.y;
        this.y = z;
        FrameLayout frameLayout = this.d;
        frameLayout.animate().cancel();
        im7 im7Var = this.c;
        im7Var.animate().cancel();
        if (z) {
            frameLayout.setVisibility(0);
            if (!z2) {
                this.e.start();
            }
            frameLayout.animate().translationY(hl.L(16.0f)).alpha(1.0f).setDuration(180L).start();
            im7Var.animate().translationY(hl.L(72.0f)).setDuration(180L).start();
            return;
        }
        im7Var.animate().translationY(0.0f).setDuration(180L).start();
        frameLayout.animate().translationY(-hl.L(20.0f)).alpha(0.0f).setDuration(180L).withEndAction(new lw3(this, (byte) 14)).start();
    }

    @Override
    public final void updateColors() {
        ei2 ei2Var = this.e;
        if (ei2Var != null) {
            try {
                int v0 = aob.v0(aob.Fi, this.a);
                if (v0 != this.b) {
                    this.b = v0;
                    int[] iArr = {v0};
                    ci2 ci2Var = ei2Var.a;
                    ci2Var.i = iArr;
                    ci2Var.a(0);
                    ci2Var.a(0);
                    ei2Var.invalidateSelf();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
