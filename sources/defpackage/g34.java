package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class g34 extends LinearLayout implements snb {
    public final vnb a;
    public final FrameLayout[] b;
    public final de0[] c;
    public final FrameLayout[] d;
    public final FrameLayout[] e;
    public final float[] f;
    public final int[] h;
    public pcc n;
    public b8c r;
    public int s;
    public ValueAnimator w;
    public int x;
    public static final int[] y = {2131624293, 2131624291, 2131624292};
    public static final int[] E = {2131743640, 2131743641, 2131743637};

    public g34(Context context, vnb vnbVar) {
        super(context);
        int i = 3;
        this.b = new FrameLayout[3];
        this.c = new de0[3];
        this.d = new FrameLayout[3];
        this.e = new FrameLayout[3];
        this.f = new float[3];
        this.h = new int[3];
        int i2 = -1;
        this.s = -1;
        this.a = vnbVar;
        ?? r5 = 0;
        setOrientation(0);
        setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        setClipChildren(false);
        int i3 = 0;
        while (i3 < i) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(r5);
            iye.b(frameLayout, 0.05f, 1.25f);
            frameLayout.setOnClickListener(new w0(this, i3, (byte) 6));
            addView(frameLayout, tre.p(r5, i2, 1.0f, 119));
            this.b[i3] = frameLayout;
            de0 de0Var = new de0(context);
            de0Var.setImageDrawable(new b29(y[i3], hl.L(160.0f), hl.L(160.0f)));
            frameLayout.addView(de0Var, tre.d(160, 160.0f, 49, 0.0f, 12.0f, 0.0f, 0.0f));
            this.c[i3] = de0Var;
            FrameLayout frameLayout2 = new FrameLayout(context);
            TextView b = zze.b(context, 14.0f, aob.z6, true, null);
            int[] iArr = E;
            b.setText(ob6.M0(iArr[i3], null));
            b.setSingleLine();
            b.setPadding(hl.L(10.0f), r5, hl.L(10.0f), r5);
            frameLayout2.addView(b, tre.e(-2, -2, 17));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setPadding(hl.L(10.0f), r5, hl.L(10.0f), r5);
            int L = hl.L(13.0f);
            int i4 = aob.Fi;
            ShapeDrawable b0 = aob.b0(L, aob.v0(i4, vnbVar));
            uob M = yob.M(i4);
            frameLayout3.setBackground(b0);
            yob.j(frameLayout3, b0, M, null, vnbVar);
            frameLayout2.addView(frameLayout3, tre.e(-2, 26, 17));
            TextView b2 = zze.b(context, 14.0f, aob.g6, true, null);
            b2.setText(ob6.M0(iArr[i3], null));
            b2.setSingleLine();
            frameLayout3.addView(b2, tre.e(-2, -2, 17));
            frameLayout.addView(frameLayout2, tre.e(-2, 26, 49));
            this.d[i3] = frameLayout2;
            this.e[i3] = frameLayout3;
            i3++;
            i = 3;
            i2 = -1;
            r5 = 0;
        }
        boolean z = r5;
        b(z ? 1 : 0, z);
    }

    public final void a() {
        for (int i = 0; i < 3; i++) {
            int i2 = aob.C6;
            vnb vnbVar = this.a;
            int f = vm2.f(this.f[i], aob.v0(i2, vnbVar), aob.v0(aob.Fi, vnbVar));
            int[] iArr = this.h;
            if (f != iArr[i]) {
                iArr[i] = f;
                de0[] de0VarArr = this.c;
                de0VarArr[i].setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
                de0VarArr[i].invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.C6));
    }

    public final void b(int i, boolean z) {
        float f;
        if (this.s != i) {
            this.s = i;
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            int i2 = 0;
            while (true) {
                float f2 = 1.0f;
                if (i2 >= 3) {
                    break;
                }
                if (i2 != i) {
                    f2 = 0.0f;
                }
                FrameLayout[] frameLayoutArr = this.e;
                if (z) {
                    ik8.t(frameLayoutArr[i2].animate().scaleX(f2).scaleY(f2).alpha(f2), k43.h, 320L);
                } else {
                    frameLayoutArr[i2].animate().cancel();
                    frameLayoutArr[i2].setScaleX(f2);
                    frameLayoutArr[i2].setScaleY(f2);
                    frameLayoutArr[i2].setAlpha(f2);
                }
                i2++;
            }
            float[] fArr = this.f;
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.w = ofFloat;
                ofFloat.addUpdateListener(new e34(this, (float[]) fArr.clone(), i, (byte) 0));
                this.w.addListener(new cn2(this, (byte) 19));
                this.w.setInterpolator(k43.h);
                this.w.setDuration(320L);
                this.w.start();
            } else {
                for (int i3 = 0; i3 < 3; i3++) {
                    if (i3 == i) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    fArr[i3] = f;
                }
                a();
            }
            b29 y2 = this.c[i].getImageReceiver().y();
            if (y2 != null) {
                if (y2.o() > 0.8f) {
                    y2.O(false, 0.0f);
                }
                y2.C(true);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int max = Math.max(hl.L(48.0f), Math.min(hl.L(160.0f), (int) (((((size - getPaddingLeft()) - getPaddingRight()) / 3) - hl.L(8.0f)) / 0.61f)));
        if (max != this.x) {
            this.x = max;
            for (int i3 = 0; i3 < 3; i3++) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c[i3].getLayoutParams();
                layoutParams.height = max;
                layoutParams.width = max;
                ((FrameLayout.LayoutParams) this.d[i3].getLayoutParams()).topMargin = hl.L(22.0f) + max;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(66.0f) + max, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            a();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
