package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class yg9 extends e implements fn7 {
    public xq2 A0;
    public o24 B0;
    public boolean C0;
    public boolean D0;
    public RectF E;
    public int E0;
    public boolean F;
    public int F0;
    public final int[] G;
    public int G0;
    public int[] H;
    public boolean H0;
    public int[] I;
    public kg9 I0;
    public float J;
    public int J0;
    public zu1 K;
    public boolean K0;
    public Runnable L;
    public int L0;
    public Runnable M;
    public boolean M0;
    public boolean N;
    public final Runnable N0;
    public final ArrayList O;
    public lg9 O0;
    public rg9 P;
    public q67 P0;
    public pi9 Q;
    public ValueAnimator Q0;
    public View R;
    public float R0;
    public View S;
    public dg9 S0;
    public FrameLayout T;
    public int T0;
    public ImageView U;
    public int U0;
    public LinearLayout V;
    public int V0;
    public ImageView W;
    public boolean W0;
    public ImageView X;
    public int X0;
    public FrameLayout Y;
    public int Y0;
    public FrameLayout Z;
    public int Z0;
    public final Editable a;
    public FrameLayout a0;
    public boolean a1;
    public final TL_iv.RichMessage b;
    public LinearLayout b0;
    public int c;
    public iz1 c0;
    public int d;
    public ImageView d0;
    public boolean e;
    public sg9 e0;
    public final String f;
    public LinearLayout f0;
    public final ArrayList g0;
    public CharSequence h;
    public ImageView h0;
    public oob i0;
    public LinearLayout j0;
    public tg9 k0;
    public int l0;
    public final ArrayList m0;
    public CharSequence n;
    public LinearLayout n0;
    public LinearLayout o0;
    public LinearLayout p0;
    public ug9 q0;
    public r47 r;
    public ug9 r0;
    public z92 s;
    public ug9 s0;
    public ug9 t0;
    public ug9 u0;
    public ug9 v0;
    public nr1 w;
    public FrameLayout w0;
    public final Rect x;
    public e29 x0;
    public jl0 y;
    public fu5 y0;
    public di3 z0;

    public yg9(Editable editable) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new gg9(this, (byte) 0);
        this.a = editable;
    }

    public static String c0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 7) {
                        if (i != 9) {
                            return null;
                        }
                        return ob6.M0(2131754864, null);
                    }
                    return ob6.M0(2131754859, null);
                }
                return ob6.M0(2131754850, null);
            }
            return ob6.M0(2131754855, null);
        }
        return ob6.M0(2131754849, null);
    }

    public static String e0(int i) {
        if (i == 1) {
            return ob6.M0(2131753664, null);
        }
        if (i == 2) {
            return ob6.M0(2131748841, null);
        }
        if (i == 16) {
            return ob6.M0(2131743544, null);
        }
        if (i == 8) {
            return ob6.M0(2131744090, null);
        }
        if (i == 256) {
            return ob6.M0(2131744919, null);
        }
        if (i == 4) {
            return ob6.M0(2131748104, null);
        }
        if (i == 65536) {
            return ob6.M0(2131749057, null);
        }
        if (i == 16384) {
            return ob6.M0(2131744078, null);
        }
        if (i != 32768) {
            return null;
        }
        return ob6.M0(2131743980, null);
    }

    public static void q0(vnb vnbVar, Context context, final Runnable runnable, final Runnable runnable2) {
        final nx0 h = uh9.h(1, vnbVar, context, false);
        LinearLayout j = uh9.j(context, 1);
        h.O = j;
        ImageView k = qd4.k(context, 2131231606);
        k.setScaleType(ImageView.ScaleType.CENTER);
        int L = hl.L(80.0f);
        int i = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        k.setBackground(K);
        yob.j(k, K, M, null, vnbVar);
        j.addView(k, tre.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131754034, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        int i2 = aob.G6;
        yob.X(textView, i2, vnbVar);
        TextView m = ik8.m(j, textView, tre.t(-1, -2, 49, 25, 16, 25, 0), context);
        m.setText(hl.S2(ob6.M0(2131754035, null)));
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        yob.X(m, i2, vnbVar);
        j.addView(m, tre.t(-1, -2, 49, 25, 11, 25, 0));
        c51 i3 = xnb.i(24, vnbVar, context, true);
        i3.setText(ob6.M0(2131754036, null));
        j.addView(i3, tre.t(-1, 48, 49, 14, 31, 14, 0));
        c51 i4 = xnb.i(24, vnbVar, context, false);
        i4.setText(ob6.M0(2131754037, null));
        j.addView(i4, tre.t(-1, 48, 49, 14, 2, 14, 6));
        h.show();
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Runnable runnable3 = runnable2;
                nx0 nx0Var = h;
                switch (b) {
                    case 0:
                        nx0Var.dismiss();
                        runnable3.run();
                        return;
                    default:
                        nx0Var.dismiss();
                        runnable3.run();
                        return;
                }
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Runnable runnable3 = runnable;
                nx0 nx0Var = h;
                switch (b) {
                    case 0:
                        nx0Var.dismiss();
                        runnable3.run();
                        return;
                    default:
                        nx0Var.dismiss();
                        runnable3.run();
                        return;
                }
            }
        });
    }

    public final void A0() {
        z92 z92Var = this.s;
        int[] iArr = this.G;
        z92Var.getLocationInWindow(iArr);
        if (this.E == null) {
            this.E = new RectF();
        }
        RectF rectF = new RectF(this.y.getBounds());
        this.E = rectF;
        rectF.offset(iArr[0], iArr[1]);
        int[] iArr2 = this.H;
        if (iArr2 == null) {
            iArr2 = new int[2];
            this.H = iArr2;
        }
        this.w.getLocationInWindow(iArr2);
        int[] iArr3 = this.I;
        if (iArr3 == null) {
            iArr3 = new int[2];
            this.I = iArr3;
        }
        iArr3[0] = this.Q.getPaddingLeft();
        this.I[1] = this.Q.getPaddingTop();
        int[] iArr4 = this.I;
        iArr4[0] = (int) (iArr4[0] - (this.w.F0.getX() - hl.L(16.0f)));
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg9.B0():void");
    }

    public final void C0(int i, boolean z) {
        int i2;
        float f;
        float f2;
        float f3;
        float L;
        int i3;
        float f4;
        float f5;
        float f6;
        float L2;
        float f7;
        float f8;
        float f9;
        float f10;
        float L3;
        float f11;
        float f12;
        float f13;
        float L4;
        float f14;
        if (this.L0 == i) {
            return;
        }
        this.L0 = i;
        LinearLayout linearLayout = this.b0;
        int i4 = 0;
        float f15 = 0.0f;
        float f16 = 0.8f;
        if (z) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = this.b0.animate();
            if (this.L0 == 0) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f8);
            if (this.L0 == 0) {
                f9 = 1.0f;
            } else {
                f9 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f9);
            if (this.L0 == 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
            if (this.L0 == 0) {
                L3 = 0.0f;
            } else {
                L3 = hl.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).withEndAction(new gg9(this, (byte) 1)).start();
            this.i0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.i0.animate();
            if (this.L0 == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (this.L0 == 1) {
                f12 = 1.0f;
            } else {
                f12 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f12);
            if (this.L0 == 1) {
                f13 = 1.0f;
            } else {
                f13 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f13);
            if (this.L0 == 1) {
                L4 = 0.0f;
            } else {
                L4 = hl.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(k43Var).withEndAction(new gg9(this, (byte) 2)).start();
            this.w0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.w0.animate();
            if (this.L0 == 2) {
                f15 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f15);
            if (this.L0 == 2) {
                f14 = 1.0f;
            } else {
                f14 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f14);
            if (this.L0 == 2) {
                f16 = 1.0f;
            }
            scaleX3.scaleY(f16).setDuration(420L).setInterpolator(k43Var).withEndAction(new gg9(this, (byte) 3)).start();
            return;
        }
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        LinearLayout linearLayout2 = this.b0;
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        linearLayout2.setAlpha(f);
        LinearLayout linearLayout3 = this.b0;
        if (i == 0) {
            f2 = 1.0f;
        } else {
            f2 = 0.8f;
        }
        linearLayout3.setScaleX(f2);
        LinearLayout linearLayout4 = this.b0;
        if (i == 0) {
            f3 = 1.0f;
        } else {
            f3 = 0.8f;
        }
        linearLayout4.setScaleY(f3);
        LinearLayout linearLayout5 = this.b0;
        if (i == 0) {
            L = 0.0f;
        } else {
            L = hl.L(30.0f);
        }
        linearLayout5.setTranslationY(L);
        oob oobVar = this.i0;
        if (i == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        oobVar.setVisibility(i3);
        oob oobVar2 = this.i0;
        if (i == 1) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        oobVar2.setAlpha(f4);
        oob oobVar3 = this.i0;
        if (i == 1) {
            f5 = 1.0f;
        } else {
            f5 = 0.8f;
        }
        oobVar3.setScaleX(f5);
        oob oobVar4 = this.i0;
        if (i == 1) {
            f6 = 1.0f;
        } else {
            f6 = 0.8f;
        }
        oobVar4.setScaleY(f6);
        oob oobVar5 = this.i0;
        if (i == 1) {
            L2 = 0.0f;
        } else {
            L2 = hl.L(30.0f);
        }
        oobVar5.setTranslationY(L2);
        FrameLayout frameLayout = this.w0;
        if (i != 2) {
            i4 = 8;
        }
        frameLayout.setVisibility(i4);
        FrameLayout frameLayout2 = this.w0;
        if (i == 2) {
            f15 = 1.0f;
        }
        frameLayout2.setAlpha(f15);
        FrameLayout frameLayout3 = this.w0;
        if (i == 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.8f;
        }
        frameLayout3.setScaleX(f7);
        FrameLayout frameLayout4 = this.w0;
        if (i == 2) {
            f16 = 1.0f;
        }
        frameLayout4.setScaleY(f16);
    }

    public final void D0() {
        boolean z;
        boolean z2;
        boolean g;
        boolean z3;
        boolean h;
        boolean z4;
        int max;
        int max2;
        boolean z5;
        boolean z6;
        boolean z7;
        dg9 dg9Var;
        int max3;
        boolean z8;
        boolean z9;
        amb textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.w()) {
            ug9 ug9Var = this.v0;
            boolean z10 = false;
            if (ug9Var != null) {
                pi9 pi9Var = this.Q;
                int[] E4 = pi9Var.E4();
                if (E4 != null && pi9Var.E3(E4[0], E4[1])) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ug9Var.setSelected(z9);
            }
            boolean I3 = this.Q.I3();
            pi9 pi9Var2 = this.Q;
            if (I3) {
                amb textSelectionHelper2 = pi9Var2.getTextSelectionHelper();
                int i = textSelectionHelper2.p0;
                int i2 = textSelectionHelper2.q0;
                int i3 = textSelectionHelper2.t0;
                int i4 = textSelectionHelper2.r0;
                int i5 = textSelectionHelper2.u0;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ug9 ug9Var2 = (ug9) obj;
                    ug9Var2.setSelected(this.Q.H3(((Integer) ug9Var2.getTag()).intValue(), i, i2, i4, i3, i5));
                }
                if (i2 == i3) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    dg9Var = this.Q.R4(i, i2);
                } else {
                    dg9Var = null;
                }
                int max4 = Math.max(0, Math.min(i4, i5));
                if (dg9Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i4, i5), dg9Var.length()));
                }
                ug9 ug9Var3 = this.r0;
                if (ug9Var3 != null) {
                    if (dg9Var != null && max4 < max3 && mm9.h(dg9Var.getText(), max4, max3)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    ug9Var3.setSelected(z8);
                }
                ug9 ug9Var4 = this.t0;
                if (ug9Var4 != null) {
                    if (dg9Var != null && max4 < max3 && mm9.g(dg9Var.getText(), max4, max3)) {
                        z10 = true;
                    }
                    ug9Var4.setSelected(z10);
                }
                x0(true);
                y0(z7, this.Q.h2());
            } else if (pi9Var2.t3()) {
                amb textSelectionHelper3 = this.Q.getTextSelectionHelper();
                dg9 p2 = this.Q.p2(textSelectionHelper3.p0);
                int i7 = textSelectionHelper3.r0;
                int i8 = textSelectionHelper3.u0;
                if (p2 == null) {
                    max2 = 0;
                    max = 0;
                } else {
                    max = Math.max(0, Math.min(Math.min(i7, i8), p2.length()));
                    max2 = Math.max(0, Math.min(Math.max(i7, i8), p2.length()));
                }
                int size2 = arrayList.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    ug9 ug9Var5 = (ug9) obj2;
                    int intValue = ((Integer) ug9Var5.getTag()).intValue();
                    if (p2 != null && max < max2 && (p2.c(max, max2) & intValue) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    ug9Var5.setSelected(z6);
                }
                ug9 ug9Var6 = this.r0;
                if (ug9Var6 != null) {
                    if (p2 != null && max < max2 && mm9.h(p2.getText(), max, max2)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    ug9Var6.setSelected(z5);
                }
                ug9 ug9Var7 = this.t0;
                if (ug9Var7 != null) {
                    if (p2 != null && max < max2 && mm9.g(p2.getText(), max, max2)) {
                        z10 = true;
                    }
                    ug9Var7.setSelected(z10);
                }
                x0(true);
                y0(true, this.Q.h2());
            } else {
                int i10 = textSelectionHelper.p0;
                int i11 = textSelectionHelper.s0;
                int i12 = textSelectionHelper.r0;
                int i13 = textSelectionHelper.u0;
                if (i10 >= 0 && i11 >= 0 && i11 >= i10 && i11 < this.Q.x4.size()) {
                    z = true;
                } else {
                    z = false;
                }
                int size3 = arrayList.size();
                int i14 = 0;
                while (i14 < size3) {
                    int i15 = i14 + 1;
                    ug9 ug9Var8 = (ug9) arrayList.get(i14);
                    int intValue2 = ((Integer) ug9Var8.getTag()).intValue();
                    if (z && this.Q.G3(intValue2, i10, i12, i11, i13)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ug9Var8.setSelected(z4);
                    i14 = i15;
                }
                x0(!this.Q.F3());
                ug9 ug9Var9 = this.r0;
                if (ug9Var9 != null) {
                    if (z) {
                        Editable K4 = this.Q.K4(i10, i12, i11, i13);
                        if (K4 == null) {
                            h = false;
                        } else {
                            h = mm9.h(K4, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13));
                        }
                        if (h) {
                            z3 = true;
                            ug9Var9.setSelected(z3);
                        }
                    }
                    z3 = false;
                    ug9Var9.setSelected(z3);
                }
                ug9 ug9Var10 = this.t0;
                if (ug9Var10 != null) {
                    if (z) {
                        Editable K42 = this.Q.K4(i10, i12, i11, i13);
                        if (K42 == null) {
                            g = false;
                        } else {
                            g = mm9.g(K42, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13));
                        }
                        if (g) {
                            z2 = true;
                            ug9Var10.setSelected(z2);
                        }
                    }
                    z2 = false;
                    ug9Var10.setSelected(z2);
                }
                if (z && i10 == i11) {
                    z10 = true;
                }
                y0(z10, this.Q.h2());
            }
        }
    }

    public final void E0() {
        boolean z;
        float f;
        boolean n2 = this.Q.n2();
        ch9 ch9Var = this.Q.R3;
        if (ch9Var != null && !ch9Var.c.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = this.W;
        float f2 = 0.35f;
        if (imageView != null) {
            imageView.setEnabled(n2);
            ImageView imageView2 = this.W;
            if (n2) {
                f = 1.0f;
            } else {
                f = 0.35f;
            }
            imageView2.setAlpha(f);
        }
        ImageView imageView3 = this.X;
        if (imageView3 != null) {
            imageView3.setEnabled(z);
            ImageView imageView4 = this.X;
            if (z) {
                f2 = 1.0f;
            }
            imageView4.setAlpha(f2);
        }
    }

    public final void F0() {
        boolean z;
        int i = 0;
        if (!uc7.s1(this.currentAccount).D4() && !yac.h(this.currentAccount).p()) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ug9) obj).setPremiumLocked(z);
        }
    }

    public final void G0() {
        float f;
        if (this.z0 == null) {
            return;
        }
        boolean J3 = this.Q.J3();
        this.z0.setEnabled(J3);
        ViewPropertyAnimator animate = this.z0.animate();
        if (J3) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        ik8.s(animate, f, 150L);
    }

    public final ug9 Y(int i, int i2, boolean z) {
        int i3;
        ug9 ug9Var = new ug9(i, getResourceProvider(), this.f0.getContext());
        if (z) {
            ug9Var.d();
            this.O.add(ug9Var);
        }
        ug9Var.setTag(Integer.valueOf(i2));
        ug9Var.setContentDescription(c0(i2));
        this.g0.add(ug9Var);
        LinearLayout linearLayout = this.f0;
        if (linearLayout.getChildCount() == 0) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        linearLayout.addView(ug9Var, tre.t(38, 38, 16, i3, 0, 0, 0));
        return ug9Var;
    }

    public final void Z(Context context, int i, int i2, boolean z) {
        int i3;
        ug9 ug9Var = new ug9(i, getResourceProvider(), context);
        if (z) {
            ug9Var.d();
            this.O.add(ug9Var);
        }
        ug9Var.setTag(Integer.valueOf(i2));
        ug9Var.setContentDescription(e0(i2));
        ug9Var.setOnClickListener(new w0(this, i2, (byte) 22));
        this.m0.add(ug9Var);
        LinearLayout linearLayout = this.j0;
        if (linearLayout.getChildCount() > 0) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        linearLayout.addView(ug9Var, tre.t(38, 38, 16, i3, 0, 0, 0));
    }

    public final void a0(boolean z) {
        float f;
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q0 = null;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R0, f);
        this.Q0 = ofFloat;
        ofFloat.addUpdateListener(new ig9(this, (byte) 1));
        this.Q0.setInterpolator(k43.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void b0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        o24 o24Var = this.B0;
        if (o24Var != null && (layoutParams = (FrameLayout.LayoutParams) o24Var.getLayoutParams()) != null) {
            int f0 = f0();
            rg9 rg9Var = this.P;
            if (rg9Var == null) {
                max = f0();
            } else {
                max = Math.max(f0(), ((rg9Var.getMeasuredHeight() - this.P.getPaddingTop()) - hl.L(240.0f)) - this.U0);
            }
            int round = Math.round(((max - f0) * this.R0) + f0);
            if (layoutParams.height != round) {
                layoutParams.height = round;
                this.B0.setLayoutParams(layoutParams);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.O;
        arrayList.clear();
        this.P = new rg9(this, context);
        setHasOwnBackground(true);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.P.setDefaultFocusHighlightEnabled(false);
        }
        this.F0 = uc7.d1().getInt("kbd_height", hl.L(200.0f));
        this.G0 = uc7.d1().getInt("kbd_height_land3", hl.L(200.0f));
        ?? obj = new Object();
        this.I0 = obj;
        this.P.r.add(obj);
        pi9 pi9Var = new pi9(context, this.currentAccount, getResourceProvider(), new j09(this, (byte) 5));
        this.Q = pi9Var;
        pi9Var.setFileRefParentObject(this.r);
        this.P.addView(this.Q, tre.e(-1, -1, 119));
        this.P.addView(this.Q.getOverlayView(), tre.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            pi9 pi9Var2 = this.Q;
            ArrayList arrayList2 = pi9Var2.t3;
            pi9Var2.s3 = richMessage;
            pi9.T2(arrayList2, richMessage.blocks, pi9Var2.u3);
            pi9Var2.T3();
            for (int i = 0; i < arrayList2.size(); i++) {
                pi9Var2.x4((mk0) arrayList2.get(i));
            }
            pi9Var2.g3.O(false);
        } else {
            String str = this.f;
            if (str != null) {
                pi9 pi9Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = pi9Var3.u3;
                ArrayList arrayList3 = pi9Var3.t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    pi9.T2(arrayList3, uj9.b(charSequence), hashMap);
                }
                arrayList3.addAll(pi9Var3.y4(wi9.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    pi9.T2(arrayList3, uj9.b(charSequence2), hashMap);
                }
                pi9Var3.T3();
                pi9Var3.g3.O(false);
            } else {
                Editable editable = this.a;
                if (editable != null) {
                    this.Q.setInitialText(editable);
                }
            }
        }
        ch9 ch9Var = this.Q.R3;
        if (ch9Var != null) {
            ch9Var.j();
        }
        View view = new View(context);
        this.R = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i2 = aob.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i2), aob.p1(0.0f, getThemedColor(i2))}));
        this.P.addView(this.R, tre.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{aob.p1(0.0f, getThemedColor(i2)), getThemedColor(i2)}));
        this.P.addView(this.S, tre.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, tre.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(2131231243);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i2);
        int themedColor2 = getThemedColor(i2);
        int i3 = aob.i6;
        imageView3.setBackground(new xg9(aob.Z(themedColor, aob.v(themedColor2, getThemedColor(i3)), hl.L(22.0f), hl.L(22.0f))));
        ImageView imageView4 = this.U;
        int i4 = aob.G6;
        vnb resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView4, i4, resourceProvider, mode);
        iye.a(this.U);
        this.U.setContentDescription(ob6.M0(2131754874, null));
        this.U.setOnClickListener(new fg9(this, (byte) 2));
        this.T.addView(this.U, tre.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.T.addView(this.V, tre.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(2131231602);
        this.W.setScaleType(scaleType);
        yob.R(this.W, aob.f0(getThemedColor(i3), 1, -1), null, yob.M(i3), getResourceProvider());
        yob.s(this.W, i4, getResourceProvider(), mode);
        iye.a(this.W);
        this.W.setContentDescription(ob6.M0(2131743542, null));
        this.W.setOnClickListener(new fg9(this, (byte) 3));
        this.V.addView(this.W, tre.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(2131231585);
        this.X.setScaleType(scaleType);
        yob.R(this.X, aob.f0(getThemedColor(i3), 1, -1), null, yob.M(i3), getResourceProvider());
        yob.s(this.X, i4, getResourceProvider(), mode);
        iye.a(this.X);
        this.X.setContentDescription(ob6.M0(2131746069, null));
        this.X.setOnClickListener(new fg9(this, (byte) 4));
        this.V.addView(this.X, tre.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, tre.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.a0.setClipToPadding(false);
        this.Z.addView(this.a0, tre.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.b0.setClipChildren(false);
        this.b0.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        this.a0.addView(this.b0, tre.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.a0.addView(frameLayout4, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.d0 = imageView7;
        imageView7.setImageDrawable(new hc(context));
        this.d0.setScaleType(scaleType);
        yob.s(this.d0, i4, getResourceProvider(), mode);
        this.d0.setBackground(new xg9(aob.Z(getThemedColor(i2), aob.v(getThemedColor(i2), getThemedColor(i3)), hl.L(22.0f), hl.L(22.0f))));
        this.b0.addView(this.d0, tre.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        iye.a(this.d0);
        this.d0.setContentDescription(ob6.M0(2131755003, null));
        this.d0.setOnClickListener(new fg9(this, (byte) 5));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        frameLayout5.addView(frameLayout6, tre.e(-2, 44, 81));
        sg9 sg9Var = new sg9(context, (byte) 0);
        this.e0 = sg9Var;
        sg9Var.setClipToOutline(true);
        this.e0.setOutlineProvider(new yi((byte) 13));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f0 = linearLayout3;
        linearLayout3.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        this.f0.setOrientation(0);
        this.e0.addView(this.f0);
        frameLayout6.addView(this.e0, tre.c(-1.0f, -1));
        iz1 iz1Var = new iz1(context, 24);
        this.c0 = iz1Var;
        iz1Var.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
        yob.s(this.c0, i4, getResourceProvider(), mode);
        yob.R(this.c0, aob.Z(getThemedColor(i2), getThemedColor(i3), hl.L(20.0f), hl.L(20.0f)), yob.M(i2), yob.M(i3), getResourceProvider());
        this.c0.j(gz1.e, false);
        this.f0.addView(this.c0, tre.r(38, 38, 16));
        iye.a(this.c0);
        this.c0.setContentDescription(ob6.M0(2131754880, null));
        this.c0.setOnClickListener(new fg9(this, (byte) 6));
        Y(2131231599, 1, false).setOnClickListener(new jy8(this, context, (byte) 5));
        Y(2131231571, 2, true).setOnClickListener(new fg9(this, (byte) 7));
        Y(2131231588, 4, true).setOnClickListener(new fg9(this, (byte) 8));
        Y(2131231573, 7, true).setOnClickListener(new fg9(this, (byte) 9));
        ImageView imageView8 = new ImageView(context);
        this.h0 = imageView8;
        imageView8.setImageResource(2131232505);
        this.h0.setScaleType(scaleType);
        yob.s(this.h0, i4, getResourceProvider(), mode);
        yob.R(this.h0, aob.Z(getThemedColor(i2), getThemedColor(i3), hl.L(20.0f), hl.L(20.0f)), yob.M(i2), yob.M(i3), getResourceProvider());
        this.f0.addView(this.h0, tre.t(38, 38, 16, 2, 0, 0, 0));
        iye.a(this.h0);
        this.h0.setContentDescription(ob6.M0(2131754917, null));
        this.h0.setOnClickListener(new fg9(this, (byte) 11));
        this.b0.addView(frameLayout5, tre.l(1.0f, 0, 44));
        oob oobVar = new oob((byte) 13, context, this);
        this.i0 = oobVar;
        oobVar.setOrientation(0);
        this.i0.setClipToPadding(false);
        this.i0.setClipChildren(false);
        this.i0.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        this.Z.addView(this.i0, tre.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.w0.setClipToPadding(false);
        this.w0.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        this.Z.addView(this.w0, tre.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.x0 = imageView9;
        imageView9.f(2131624043, hl.L(16.0f), hl.L(16.0f), null);
        b29 animatedDrawable = this.x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.F(0);
            animatedDrawable.K(0);
        }
        this.x0.setScaleType(scaleType);
        yob.s(this.x0, i4, getResourceProvider(), mode);
        this.x0.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.w0.addView(this.x0, tre.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.i0.addView(frameLayout8, tre.c(44.0f, -2));
        tg9 tg9Var = new tg9(this, context);
        this.k0 = tg9Var;
        tg9Var.setHorizontalScrollBarEnabled(false);
        this.k0.setClipToOutline(true);
        this.k0.setOutlineProvider(new yi((byte) 14));
        frameLayout8.addView(this.k0, tre.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.j0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.j0.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        this.k0.addView(this.j0, new FrameLayout.LayoutParams(-2, -1));
        Z(context, 2131231202, 1, false);
        Z(context, 2131231204, 2, false);
        Z(context, 2131231210, 16, false);
        Z(context, 2131231209, 8, false);
        Z(context, 2131231208, 256, false);
        Z(context, 2131231555, 4, false);
        Z(context, 2131231205, 65536, true);
        Z(context, 2131231586, 16384, true);
        Z(context, 2131231587, 32768, true);
        ug9 ug9Var = new ug9(2131231584, getResourceProvider(), context);
        this.v0 = ug9Var;
        ug9Var.setContentDescription(ob6.M0(2131746167, null));
        this.v0.setOnClickListener(new fg9(this, (byte) 12));
        LinearLayout linearLayout5 = this.j0;
        linearLayout5.addView(this.v0, tre.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        ug9 ug9Var2 = new ug9(2131231552, getResourceProvider(), context);
        this.s0 = ug9Var2;
        ug9Var2.setContentDescription(ob6.M0(2131745738, null));
        this.s0.setOnClickListener(new fg9(this, (byte) 13));
        LinearLayout linearLayout6 = this.j0;
        linearLayout6.addView(this.s0, tre.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.o0.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        this.o0.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.i0.addView(this.o0, tre.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ug9 ug9Var3 = new ug9(2131231749, getResourceProvider(), context);
        this.r0 = ug9Var3;
        ug9Var3.setContentDescription(ob6.M0(2131751709, null));
        this.r0.setOnClickListener(new fg9(this, (byte) 14));
        this.o0.addView(this.r0, tre.r(38, 38, 16));
        ug9 ug9Var4 = new ug9(2131232082, getResourceProvider(), context);
        this.t0 = ug9Var4;
        ug9Var4.setContentDescription(ob6.M0(2131754857, null));
        this.t0.setOnClickListener(new fg9(this, (byte) 15));
        this.o0.addView(this.t0, tre.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.p0.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        this.p0.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.i0.addView(this.p0, tre.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ug9 ug9Var5 = new ug9(2131231573, getResourceProvider(), context);
        this.u0 = ug9Var5;
        ug9Var5.d();
        arrayList.add(this.u0);
        this.u0.setContentDescription(ob6.M0(2131754859, null));
        this.u0.setOnClickListener(new fg9(this, (byte) 16));
        this.p0.addView(this.u0, tre.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.n0.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        this.n0.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i2))));
        this.i0.addView(this.n0, 0, tre.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        ug9 ug9Var6 = new ug9(0, getResourceProvider(), context);
        this.q0 = ug9Var6;
        ug9Var6.setImageDrawable(new hc(context));
        this.q0.setContentDescription(ob6.M0(2131755003, null));
        this.q0.setOnClickListener(new fg9(this, (byte) 0));
        this.n0.addView(this.q0, tre.r(38, 38, 16));
        di3 di3Var = new di3(this, context, this.r != null ? 2131231505 : h0() ? 2131231515 : 2131232710, getResourceProvider());
        this.z0 = di3Var;
        di3Var.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(aob.Pe))));
        iye.a(this.z0);
        this.b0.addView(this.z0, tre.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.z0.setContentDescription(ob6.M0(2131745368, null));
        this.z0.setOnClickListener(new fg9(this, (byte) 1));
        this.z0.setOnLongClickListener(new zs(this, (byte) 13));
        di3 di3Var2 = this.z0;
        if (di3Var2 != null) {
            di3Var2.setLocked(i0());
        }
        this.P.setPadding(0, hl.m, 0, 0);
        d0();
        C0(0, false);
        E0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new o72(this, (byte) 2));
        F0();
        if (this.e) {
            this.Q.z2();
            this.e = false;
        }
        rg9 rg9Var = this.P;
        this.fragmentView = rg9Var;
        return rg9Var;
    }

    public final void d0() {
        FrameLayout.LayoutParams layoutParams;
        o24 o24Var = this.B0;
        if (o24Var != null && (layoutParams = (FrameLayout.LayoutParams) o24Var.getLayoutParams()) != null) {
            int i = layoutParams.bottomMargin;
            int i2 = this.U0;
            if (i != i2) {
                layoutParams.bottomMargin = i2;
                this.B0.setLayoutParams(layoutParams);
            }
        }
        b0();
        int max = Math.max(Math.max(this.E0, this.U0), this.V0);
        this.Q.setPadding(0, hl.L(60.0f), 0, hl.L(110.0f) + max);
        pi9 pi9Var = this.Q;
        int i3 = this.U0;
        int i4 = this.V0;
        int i5 = this.E0;
        pi9Var.W3 = i3;
        pi9Var.X3 = i4;
        pi9Var.Y3 = i5;
        int i6 = -max;
        this.Z.setTranslationY(i6);
        this.S.setTranslationY(i6 + this.U0);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.i5) {
            di3 di3Var = this.z0;
            if (di3Var != null) {
                di3Var.setLocked(i0());
            }
            F0();
        }
    }

    public final int f0() {
        int i;
        Point point = hl.q;
        if (point.x > point.y) {
            i = this.G0;
        } else {
            i = this.F0;
        }
        if (i <= 0) {
            return hl.L(200.0f);
        }
        return i;
    }

    public final void g0(boolean z) {
        if (this.D0) {
            this.D0 = false;
            o24 o24Var = this.B0;
            if (o24Var != null) {
                o24Var.r(false);
                this.B0.z();
            }
        }
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q0 = null;
        }
        this.R0 = 0.0f;
        this.S0 = null;
        o24 o24Var2 = this.B0;
        if (o24Var2 != null) {
            o24Var2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            d0();
        }
        iz1 iz1Var = this.c0;
        if (iz1Var != null) {
            iz1Var.j(gz1.e, z);
        }
    }

    public final boolean h0() {
        zu1 zu1Var;
        if (this.r == null && (zu1Var = this.K) != null && zu1Var.X7()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final boolean i0() {
        if (!uc7.s1(this.currentAccount).D4() && !yac.h(this.currentAccount).p()) {
            pi9 pi9Var = this.Q;
            if (uj9.d(pi9Var.t3, pi9Var.u3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        pi9 pi9Var = this.Q;
        if (pi9Var != null && pi9Var.v3.w()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0(Context context, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        float f;
        float f2;
        boolean z9;
        boolean z10;
        boolean z11;
        float f3;
        float f4;
        boolean z12;
        boolean z13;
        float f5;
        fu5 fu5Var = this.y0;
        if (fu5Var != null) {
            fu5Var.u();
            this.y0 = null;
        }
        if (!uc7.s1(this.currentAccount).D4() && !yac.h(this.currentAccount).p()) {
            z = true;
        } else {
            z = false;
        }
        final mk0 N2 = this.Q.N2();
        final fu5 J = fu5.J(this, view);
        J.W = true;
        fu5 K = J.K();
        K.b(2131231243, ob6.M0(2131753749, null), new vn1(J, (byte) 10), false);
        K.j();
        if (N2 != null && (N2.b instanceof TL_iv.pageBlockHeading1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        K.i(z2, 2131231562, null, ob6.M0(2131754023, null), new Runnable(this) {
            public final yg9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        return;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        return;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        return;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        return;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        return;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, xea.S0 + 2);
        if (N2 != null && (N2.b instanceof TL_iv.pageBlockHeading2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        K.i(z3, 2131231563, null, ob6.M0(2131754022, null), new Runnable(this) {
            public final yg9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        return;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        return;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        return;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        return;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        return;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, xea.S0 + 1);
        if (N2 != null && (N2.b instanceof TL_iv.pageBlockHeading3)) {
            z4 = true;
        } else {
            z4 = false;
        }
        K.i(z4, 2131231564, null, ob6.M0(2131754021, null), new Runnable(this) {
            public final yg9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        return;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        return;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        return;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        return;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        return;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, xea.S0);
        if (N2 != null && (N2.b instanceof TL_iv.pageBlockHeading4)) {
            z5 = true;
        } else {
            z5 = false;
        }
        K.i(z5, 2131231565, null, ob6.M0(2131754020, null), new Runnable(this) {
            public final yg9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        return;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        return;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        return;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        return;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        return;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, xea.S0 - 1);
        if (N2 != null && (N2.b instanceof TL_iv.pageBlockHeading5)) {
            z6 = true;
        } else {
            z6 = false;
        }
        K.i(z6, 2131231566, null, ob6.M0(2131754019, null), new Runnable(this) {
            public final yg9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        return;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        return;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        return;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        return;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        return;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, xea.S0 - 2);
        if (N2 != null && (N2.b instanceof TL_iv.pageBlockHeading6)) {
            z7 = true;
        } else {
            z7 = false;
        }
        K.i(z7, 2131231567, null, ob6.M0(2131754018, null), new Runnable(this) {
            public final yg9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                fu5 fu5Var2 = J;
                mk0 mk0Var = N2;
                yg9 yg9Var = this.b;
                switch (b) {
                    case 0:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading1());
                        fu5Var2.u();
                        return;
                    case 1:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading2());
                        fu5Var2.u();
                        return;
                    case 2:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading3());
                        fu5Var2.u();
                        return;
                    case 3:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading4());
                        fu5Var2.u();
                        return;
                    case 4:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading5());
                        fu5Var2.u();
                        return;
                    default:
                        yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockHeading6());
                        fu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, xea.S0 - 3);
        if (N2 != null && pi9.z3(N2.b)) {
            z8 = true;
        } else {
            z8 = false;
        }
        wg9 wg9Var = new wg9(context, 2131231561);
        wg9Var.a(z);
        int i = aob.G8;
        wg9Var.d = i;
        J.i(z8, 0, wg9Var, ob6.M0(2131754024, null), new c10(J, K, (byte) 8));
        J.z().a.setTypeface(hl.o());
        b8 z14 = J.z();
        float f6 = 9.0f;
        if (ob6.a0) {
            f = 18.0f;
        } else {
            f = 9.0f;
        }
        int L = hl.L(f);
        if (ob6.a0) {
            f2 = 9.0f;
        } else {
            f2 = 18.0f;
        }
        z14.setPadding(L, 0, hl.L(f2), 0);
        if (N2 != null && (N2.b instanceof TL_iv.pageBlockParagraph)) {
            z9 = true;
        } else {
            z9 = false;
        }
        J.i(z9, 2131231600, null, ob6.M0(2131753981, null), new eg9(this, N2, (byte) 4));
        if (N2 != null && (N2.b instanceof TL_iv.pageBlockBlockquote)) {
            z10 = true;
        } else {
            z10 = false;
        }
        J.i(z10, 2131231584, null, ob6.M0(2131753989, null), new eg9(this, N2, (byte) 5));
        if (N2 != null && (N2.b instanceof TL_iv.pageBlockPullquote)) {
            z11 = true;
        } else {
            z11 = false;
        }
        wg9 wg9Var2 = new wg9(context, 2131231583);
        wg9Var2.a(z);
        wg9Var2.d = i;
        J.i(z11, 0, wg9Var2, ob6.M0(2131753990, null), new eg9(this, N2, (byte) 1));
        b8 z15 = J.z();
        if (ob6.a0) {
            f3 = 18.0f;
        } else {
            f3 = 9.0f;
        }
        int L2 = hl.L(f3);
        if (ob6.a0) {
            f4 = 9.0f;
        } else {
            f4 = 18.0f;
        }
        z15.setPadding(L2, 0, hl.L(f4), 0);
        if (N2 != null && (N2.b instanceof TL_iv.pageBlockPreformatted)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.i(z12, 2131231555, null, ob6.M0(2131754048, null), new eg9(this, N2, (byte) 2));
        if (N2 != null && (N2.b instanceof TL_iv.pageBlockFooter)) {
            z13 = true;
        } else {
            z13 = false;
        }
        wg9 wg9Var3 = new wg9(context, 2131231558);
        wg9Var3.a(z);
        wg9Var3.d = i;
        J.i(z13, 0, wg9Var3, ob6.M0(2131754025, null), new eg9(this, N2, (byte) 3));
        b8 z16 = J.z();
        if (ob6.a0) {
            f5 = 18.0f;
        } else {
            f5 = 9.0f;
        }
        int L3 = hl.L(f5);
        if (!ob6.a0) {
            f6 = 18.0f;
        }
        z16.setPadding(L3, 0, hl.L(f6), 0);
        J.a0();
        this.y0 = J;
    }

    public final void k0() {
        di9 di9Var = this.Q.v3;
        if (di9Var != null && di9Var.w()) {
            n0();
            return;
        }
        new ue9(this.currentAccount, getResourceProvider(), new ji7(this, (byte) 29), getParentActivity()).show();
    }

    public final void l0(r47 r47Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j, r47 r47Var2, r47 r47Var3, ou1 ou1Var, boolean z, int i, int i2, c5a c5aVar, long j2) {
        int i3 = this.currentAccount;
        if (r47Var != null) {
            k5 a = k5.a(i3);
            zu1 zu1Var = this.K;
            to3 to3Var = r7a.J;
            if (arrayList.isEmpty()) {
                return;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            int i4 = 0;
            richMessage.rtl = false;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock != null) {
                    richMessage.blocks.add(pageBlock);
                }
            }
            if (richMessage.blocks.isEmpty()) {
                return;
            }
            if (!arrayList2.isEmpty()) {
                richMessage.photos.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                richMessage.documents.addAll(arrayList3);
            }
            IdentityHashMap identityHashMap = new IdentityHashMap();
            ArrayList<TL_iv.PageBlock> arrayList5 = richMessage.blocks;
            int size2 = arrayList5.size();
            while (i4 < size2) {
                TL_iv.PageBlock pageBlock2 = arrayList5.get(i4);
                i4++;
                r7a.j(pageBlock2, identityHashMap);
            }
            r7a.B(a.a).u(r47Var, richMessage, arrayList4, zu1Var, false);
            return;
        }
        r7a.Q(k5.a(i3), arrayList, arrayList2, arrayList3, arrayList4, j, r47Var2, r47Var3, ou1Var, z, i, i2, c5aVar, 0L, j2, 0L);
    }

    public final void m0() {
        if (!yac.h(this.currentAccount).p()) {
            showDialog(new xk8((e) this, 43, true));
        }
    }

    public final void n0() {
        gi9 d2 = this.Q.d2();
        if (d2 != null) {
            TL_iv.RichMessage a = d2.a();
            if (a.blocks.isEmpty()) {
                return;
            }
            b1 b1Var = new b1(getParentActivity(), getResourceProvider());
            b1Var.p1(a);
            b1Var.f2 = new te2(d2, (byte) 20);
            b1Var.show();
        }
    }

    public final boolean o0(View view) {
        int i;
        zu1 zu1Var = this.K;
        if (zu1Var != null && this.r == null && !zu1Var.X7() && this.Q.h3() && !this.Q.j3()) {
            if (!this.Q.J3()) {
                G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> W2 = this.Q.W2();
            if (!W2.isEmpty()) {
                q67 q67Var = this.P0;
                if (q67Var != null) {
                    q67Var.f(false);
                    this.P0 = null;
                }
                q67 q67Var2 = new q67(getParentActivity(), getResourceProvider());
                this.P0 = q67Var2;
                q67Var2.setOnDismissListener(new dl8(this, (byte) 4));
                long a = this.K.a();
                r47 r47Var = this.K.F5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = uc7.s1(this.currentAccount).y1(a);
                tL_message.from_id = uc7.s1(this.currentAccount).y1(yac.h(this.currentAccount).e());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = W2;
                richMessage.photos = this.Q.y2();
                tL_message.rich_message.documents = this.Q.v2();
                if (r47Var != null && !r47Var.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = r47Var.e1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                r47 r47Var2 = new r47(this.currentAccount, tL_message, false, false);
                if (r47Var != null && !r47Var.p) {
                    r47Var2.C = r47Var;
                }
                r47Var2.B0 = true;
                r47Var2.W2 = Boolean.TRUE;
                r47Var2.n0(null);
                r47Var2.w1 = true;
                this.P0.r(qd4.t(r47Var2));
                this.z0.setScaleX(1.0f);
                this.z0.setScaleY(1.0f);
                bz1 s = this.P0.s(this.z0, true, new fg9(this, (byte) 10));
                if (s != null) {
                    s.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(aob.Fi))));
                    q67 q67Var3 = this.P0;
                    int L = hl.L(44.0f);
                    q67Var3.p0 = true;
                    q67Var3.Y = L;
                }
                fu5 I = fu5.I(this, this.z0);
                boolean D = lbc.D(this.K.h());
                if (this.K.M4()) {
                    if (D) {
                        i = 2131745242;
                    } else {
                        i = 2131745587;
                    }
                    I.b(2131232082, ob6.M0(i, null), new kt(this, a, (byte) 28), false);
                    if (!D && a > 0) {
                        I.b(2131232269, ob6.M0(2131745314, null), new gg9(this, (byte) 5), false);
                    }
                }
                if (!D) {
                    I.b(2131231512, ob6.M0(2131745311, null), new gg9(this, (byte) 6), false);
                }
                I.Z();
                this.P0.q(I);
                this.P0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 21) {
                if (intent != null && intent.getData() != null) {
                    pi9 pi9Var = this.Q;
                    Uri data = intent.getData();
                    if (data == null) {
                        pi9Var.getClass();
                        return;
                    } else if (pi9Var.getContext() != null) {
                        Utilities.e.c(new yz8(pi9Var, data, (byte) 19));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            } else if (i == 1 || i == 14) {
                if (intent != null && intent.getData() != null) {
                    this.Q.a2(intent.getData());
                    return;
                }
                return;
            }
        }
        super.onActivityResultFragment(i, i2, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        boolean z2 = this.D0;
        if (z2) {
            if (z2) {
                this.D0 = false;
                o24 o24Var = this.B0;
                if (o24Var != null) {
                    o24Var.r(false);
                    this.B0.z();
                }
                a0(false);
                return false;
            }
        } else if (this.C0) {
            g0(true);
            return false;
        } else if (!this.Q.C2()) {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        float f;
        if (!z && !this.W0) {
            r0();
            this.W0 = true;
        }
        if (!hl.O1() && this.s != null && this.w != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            z92 z92Var = this.s;
            this.y = z92Var.r;
            z92Var.e = false;
            z92Var.invalidate();
            this.w.setAlpha(0.0f);
            this.w.p2.setVisibility(4);
            A0();
            float f2 = 1.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            this.J = f;
            if (!z) {
                f2 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
            this.F = true;
            this.P.invalidate();
            ofFloat.addUpdateListener(new ig9(this, (byte) 0));
            ofFloat.addListener(new wd8(this, runnable, (byte) 9));
            FrameLayout frameLayout = this.T;
            if (!z) {
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.T;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -hl.L(16.0f)), ObjectAnimator.ofFloat(this.a0, property, 0.0f), ObjectAnimator.ofFloat(this.a0, property2, hl.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, property, 1.0f, 0.0f));
            } else {
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout, property3, 0.0f, 1.0f);
                FrameLayout frameLayout3 = this.T;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout3, property4, -hl.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.a0, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a0, property4, hl.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(k43.h);
            this.P.post(new at(animatorSet, (byte) 1));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.i5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        kg9 kg9Var;
        jn7.f(this.currentAccount).n(this, jn7.i5);
        if (!this.W0) {
            r0();
            this.W0 = true;
        }
        lg9 lg9Var = this.O0;
        if (lg9Var != null) {
            this.O0 = null;
            hl.c3(lg9Var);
        }
        q67 q67Var = this.P0;
        if (q67Var != null) {
            q67Var.g();
            this.P0 = null;
        }
        pi9 pi9Var = this.Q;
        if (pi9Var != null) {
            pi9Var.D2();
        }
        xq2 xq2Var = this.A0;
        if (xq2Var != null) {
            xq2Var.n();
        }
        super.onFragmentDestroy();
        o24 o24Var = this.B0;
        if (o24Var != null) {
            o24Var.A();
        }
        rg9 rg9Var = this.P;
        if (rg9Var != null && (kg9Var = this.I0) != null) {
            rg9Var.r.remove(kg9Var);
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.U0 = i4;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
        layoutParams.height = hl.L(68.0f) + this.U0;
        this.S.setLayoutParams(layoutParams);
        d0();
    }

    @Override
    public final l2d onInsetsInternal(View view, l2d l2dVar) {
        boolean z;
        fu5 fu5Var;
        mq5 f = l2dVar.a.f(3);
        int i = l2dVar.a.f(8).d;
        this.V0 = i;
        int i2 = i - f.d;
        boolean z2 = this.H0;
        if (i2 > hl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        this.H0 = z;
        if (z && i2 > hl.L(50.0f) && !hl.E && !hl.O1()) {
            Point point = hl.q;
            if (point.x > point.y) {
                this.G0 = i2;
                uc7.d1().edit().putInt("kbd_height_land3", this.G0).commit();
            } else {
                this.F0 = i2;
                uc7.d1().edit().putInt("kbd_height", this.F0).commit();
            }
        }
        if (this.H0 && !z2 && this.C0 && !this.D0) {
            g0(false);
        }
        if (!this.H0 && z2 && (fu5Var = this.y0) != null) {
            fu5Var.u();
            this.y0 = null;
        }
        onInsets(f.a, f.b, f.c, f.d);
        return l2d.b;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i = aob.d6;
            int themedColor = getThemedColor(i);
            int i2 = aob.i6;
            int themedColor2 = getThemedColor(i2);
            int i3 = aob.Pe;
            int themedColor3 = getThemedColor(i3);
            if (!this.a1 || themedColor != this.X0 || themedColor2 != this.Y0 || themedColor3 != this.Z0) {
                this.a1 = true;
                this.X0 = themedColor;
                this.Y0 = themedColor2;
                this.Z0 = themedColor3;
                View view = this.R;
                if (view != null) {
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i), aob.p1(0.0f, getThemedColor(i))}));
                }
                View view2 = this.S;
                if (view2 != null) {
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, getThemedColor(i)), getThemedColor(i)}));
                }
                ImageView imageView = this.U;
                if (imageView != null) {
                    imageView.setBackground(new xg9(aob.Z(getThemedColor(i), aob.v(getThemedColor(i), getThemedColor(i2)), hl.L(22.0f), hl.L(22.0f))));
                }
                LinearLayout linearLayout = this.V;
                if (linearLayout != null) {
                    linearLayout.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i))));
                }
                ImageView imageView2 = this.d0;
                if (imageView2 != null) {
                    imageView2.setBackground(new xg9(aob.Z(getThemedColor(i), aob.v(getThemedColor(i), getThemedColor(i2)), hl.L(22.0f), hl.L(22.0f))));
                }
                e29 e29Var = this.x0;
                if (e29Var != null) {
                    e29Var.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i))));
                }
                LinearLayout linearLayout2 = this.o0;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i))));
                }
                LinearLayout linearLayout3 = this.p0;
                if (linearLayout3 != null) {
                    linearLayout3.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i))));
                }
                LinearLayout linearLayout4 = this.n0;
                if (linearLayout4 != null) {
                    linearLayout4.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i))));
                }
                di3 di3Var = this.z0;
                if (di3Var != null) {
                    di3Var.setBackground(new xg9(aob.b0(hl.L(22.0f), getThemedColor(i3))));
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        pi9 pi9Var;
        int i;
        pi9 pi9Var2;
        super.onTransitionAnimationStart(z, z2);
        if (z && !z2 && (i = this.c) >= 0 && (pi9Var2 = this.Q) != null) {
            int i2 = this.d;
            this.d = -1;
            this.c = -1;
            if (!pi9Var2.V1(i, i2)) {
                pi9Var2.post(new mh9(pi9Var2, i, i2, (byte) 0));
            }
        } else if (z && !z2) {
            if ((this.b != null || this.f != null) && (pi9Var = this.Q) != null && !pi9Var.X2()) {
                pi9Var.post(new m72(pi9Var, (byte) 5));
            }
        }
    }

    public final void p0(int i, int i2) {
        pi9 pi9Var = this.Q;
        pi9Var.k4 = pi9Var.N2();
        n12 n12Var = new n12(getParentActivity(), this, false, false, true, getResourceProvider());
        n12Var.W3 = new og9(this, n12Var);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
        chatAttachAlertPhotoLayout.setIncludeVideosInGallery(true);
        chatAttachAlertPhotoLayout.g0();
        n12Var.u1(1, true);
        n12Var.Q0(i);
        n12Var.t4 = new ng9(this, n12Var);
        n12Var.S1 = new ng9(this, n12Var);
        n12Var.R1 = new pg9(this, n12Var);
        n12Var.a1();
        if (i2 != 0) {
            n12Var.k1(i2);
        }
        n12Var.w0(true);
        n12Var.show();
    }

    public final boolean r0() {
        TL_iv.RichMessage f2;
        Runnable runnable;
        if (this.K == null || this.r != null || !this.Q.n2()) {
            return false;
        }
        if (this.N) {
            f2 = null;
        } else {
            f2 = this.Q.f2();
        }
        if (f2 == null && (runnable = this.M) != null) {
            runnable.run();
        }
        nr1 nr1Var = this.K.a0;
        if (f2 != null && !this.N) {
            pi9 pi9Var = this.Q;
            if (pi9Var.h3() && !uj9.d(pi9Var.t3, pi9Var.u3) && nr1Var != null) {
                SpannableStringBuilder g = uj9.g(this.Q.t3);
                zu1 zu1Var = nr1Var.E3;
                if (nr1Var.F0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g);
                pv3.m(spannableStringBuilder, nr1Var.F0.getPaint().getFontMetricsInt(), false, null, 0);
                hm[] hmVarArr = (hm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hm.class);
                if (hmVarArr != null) {
                    for (hm hmVar : hmVarArr) {
                        hmVar.applyFontMetrics(nr1Var.F0.getPaint().getFontMetricsInt(), wl.f());
                    }
                }
                r19.a(spannableStringBuilder);
                if (zu1Var != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    ls6.d0(nr1Var.R).T1(zu1Var.a(), zu1Var.N5(zu1Var.F5), charSequenceArr[0], ls6.d0(nr1Var.R).Y(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                nr1Var.setRichDraftPreview(null);
                if (nr1Var.F0.getText() != null) {
                    nr1Var.F0.getText().clear();
                }
                nr1Var.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        ls6 mediaDataController = getMediaDataController();
        long a = this.K.a();
        zu1 zu1Var2 = this.K;
        mediaDataController.T1(a, zu1Var2.N5(zu1Var2.F5), "", null, null, null, null, 0L, false, false, f2);
        TL_iv.RichMessage richMessage = f2;
        if (nr1Var == null) {
            return true;
        }
        nr1Var.setRichDraftPreview(richMessage);
        return true;
    }

    public final dg9 s0() {
        dg9 focusedEditTextOrNull = this.Q.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            this.S0 = focusedEditTextOrNull;
            this.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        dg9 dg9Var = this.S0;
        if (dg9Var != null) {
            return dg9Var;
        }
        return this.Q.M2();
    }

    public final int t0(dg9 dg9Var) {
        if (dg9Var == this.S0 && this.Q.getFocusedEditTextOrNull() != dg9Var) {
            return Math.min(this.T0, dg9Var.length());
        }
        return Math.max(0, dg9Var.getSelectionEnd());
    }

    public final void u0() {
        if (i0()) {
            Activity parentActivity = getParentActivity();
            pi9 pi9Var = this.Q;
            Objects.requireNonNull(pi9Var);
            q0(getResourceProvider(), parentActivity, new m72(pi9Var, (byte) 0), new gg9(this, (byte) 4));
        } else if (h0()) {
            jj.J(getParentActivity(), this.K.a(), new pq8(this, (byte) 7), getResourceProvider());
        } else {
            w0(0, 0, true);
        }
    }

    public final void w0(final int i, final int i2, final boolean z) {
        nr1 nr1Var;
        xy1 xy1Var;
        if (i0()) {
            Activity parentActivity = getParentActivity();
            pi9 pi9Var = this.Q;
            Objects.requireNonNull(pi9Var);
            q0(getResourceProvider(), parentActivity, new m72(pi9Var, (byte) 0), new gg9(this, (byte) 4));
        } else if (this.K != null && this.Q.h3() && !this.Q.j3()) {
            if (!this.Q.J3()) {
                G0();
            } else if (!uc7.s1(this.currentAccount).D4()) {
                nr1 nr1Var2 = this.K.a0;
                if (nr1Var2 != null) {
                    this.N = true;
                    Runnable runnable = this.L;
                    if (runnable != null) {
                        runnable.run();
                    }
                    nr1Var2.D1(uj9.g(this.Q.t3), z, i, i2);
                    finishFragment();
                }
            } else {
                this.N = true;
                final ArrayList W2 = this.Q.W2();
                if (W2.isEmpty()) {
                    return;
                }
                final ArrayList y2 = this.Q.y2();
                final ArrayList v2 = this.Q.v2();
                final ArrayList a = tj9.a(this.currentAccount, W2);
                final long a2 = this.K.a();
                zu1 zu1Var = this.K;
                final r47 r47Var = zu1Var.F5;
                final r47 r47Var2 = zu1Var.m4;
                final ou1 ou1Var = zu1Var.D5;
                final long k7 = zu1Var.k7();
                final c5a X6 = this.K.X6();
                final r47 r47Var3 = this.r;
                ?? r0 = new Runnable() {
                    @Override
                    public final void run() {
                        yg9.this.l0(r47Var3, W2, y2, v2, a, a2, r47Var, r47Var2, ou1Var, z, i, i2, X6, k7);
                    }
                };
                Runnable runnable2 = this.L;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (r47Var3 == null && (nr1Var = this.K.a0) != null && (xy1Var = nr1Var.O3) != null) {
                    xy1Var.x(null, z, i, i2, 0L);
                }
                if (i != 0 && r47Var3 == null) {
                    this.O0 = r0;
                    finishFragment();
                    return;
                }
                r0.run();
                finishFragment();
            }
        }
    }

    public final void x0(boolean z) {
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ug9 ug9Var = (ug9) obj;
            if (((Integer) ug9Var.getTag()).intValue() == 1) {
                ug9Var.setEnabled(z);
            }
        }
    }

    public final void y0(boolean z, boolean z2) {
        ug9 ug9Var = this.r0;
        if (ug9Var != null) {
            ug9Var.setEnabled(z);
        }
        ug9 ug9Var2 = this.s0;
        if (ug9Var2 != null) {
            ug9Var2.setEnabled(z2);
        }
        ug9 ug9Var3 = this.t0;
        if (ug9Var3 != null) {
            ug9Var3.setEnabled(z);
        }
        ug9 ug9Var4 = this.u0;
        if (ug9Var4 != null) {
            ug9Var4.setEnabled(z);
        }
    }

    public final void z0(boolean z, boolean z2) {
        float f;
        int i;
        if (this.K0 != z || !z2) {
            this.K0 = z;
            if (z) {
                f = 1.15f;
            } else {
                f = 1.0f;
            }
            e29 e29Var = this.x0;
            if (z2) {
                e29Var.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(k43.h).start();
            } else {
                e29Var.animate().cancel();
                this.x0.setScaleX(f);
                this.x0.setScaleY(f);
            }
            e29 e29Var2 = this.x0;
            if (z) {
                i = aob.q7;
            } else {
                i = aob.G6;
            }
            yob.s(e29Var2, i, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            b29 animatedDrawable = this.x0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z) {
                    if (animatedDrawable.b0 > 34) {
                        animatedDrawable.I(0, false, false);
                    }
                    animatedDrawable.K(33);
                } else {
                    animatedDrawable.K(0);
                }
                animatedDrawable.start();
            }
        }
    }

    public yg9(String str) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new gg9(this, (byte) 0);
        this.f = str;
    }

    public yg9(TL_iv.RichMessage richMessage) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new gg9(this, (byte) 0);
        this.b = richMessage;
    }
}
