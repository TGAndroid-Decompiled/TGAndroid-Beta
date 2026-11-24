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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class hd9 extends d implements gk7 {
    public eq2 A0;
    public t14 B0;
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
    public rc9 I0;
    public float J;
    public int J0;
    public mu1 K;
    public boolean K0;
    public Runnable L;
    public int L0;
    public Runnable M;
    public boolean M0;
    public boolean N;
    public final Runnable N0;
    public final ArrayList O;
    public uc9 O0;
    public ad9 P;
    public j47 P0;
    public ye9 Q;
    public ValueAnimator Q0;
    public View R;
    public float R0;
    public View S;
    public mc9 S0;
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
    public qy1 c0;
    public int d;
    public ImageView d0;
    public boolean e;
    public bd9 e0;
    public final String f;
    public LinearLayout f0;
    public final ArrayList g0;
    public CharSequence h;
    public ImageView h0;
    public pkb i0;
    public LinearLayout j0;
    public cd9 k0;
    public int l0;
    public final ArrayList m0;
    public CharSequence n;
    public LinearLayout n0;
    public LinearLayout o0;
    public LinearLayout p0;
    public dd9 q0;
    public k27 r;
    public dd9 r0;
    public j92 s;
    public dd9 s0;
    public dd9 t0;
    public dd9 u0;
    public dd9 v0;
    public ar1 w;
    public FrameLayout w0;
    public final Rect x;
    public ry8 x0;
    public il0 y;
    public cs5 y0;
    public jh3 z0;

    public hd9(Editable editable) {
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
        this.N0 = new nc9(this, (byte) 0);
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
                        return k96.M0(2131754868, null);
                    }
                    return k96.M0(2131754863, null);
                }
                return k96.M0(2131754854, null);
            }
            return k96.M0(2131754859, null);
        }
        return k96.M0(2131754853, null);
    }

    public static String e0(int i) {
        if (i == 1) {
            return k96.M0(2131753668, null);
        }
        if (i == 2) {
            return k96.M0(2131748895, null);
        }
        if (i == 16) {
            return k96.M0(2131743650, null);
        }
        if (i == 8) {
            return k96.M0(2131744196, null);
        }
        if (i == 256) {
            return k96.M0(2131745025, null);
        }
        if (i == 4) {
            return k96.M0(2131748158, null);
        }
        if (i == 65536) {
            return k96.M0(2131749111, null);
        }
        if (i == 16384) {
            return k96.M0(2131744184, null);
        }
        if (i != 32768) {
            return null;
        }
        return k96.M0(2131744086, null);
    }

    public static void q0(wjb wjbVar, Context context, final Runnable runnable, final Runnable runnable2) {
        final fx0 h = de9.h(1, wjbVar, context, false);
        LinearLayout j = de9.j(context, 1);
        h.O = j;
        ImageView k = tb4.k(context, 2131231606);
        k.setScaleType(ImageView.ScaleType.CENTER);
        int L = gl.L(80.0f);
        int i = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        k.setBackground(K);
        zkb.j(k, K, M, null, wjbVar);
        j.addView(k, nme.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131754038, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        int i2 = bkb.F6;
        zkb.X(textView, i2, wjbVar);
        TextView m = ug8.m(j, textView, nme.t(-1, -2, 49, 25, 16, 25, 0), context);
        m.setText(gl.T2(k96.M0(2131754039, null)));
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        zkb.X(m, i2, wjbVar);
        j.addView(m, nme.t(-1, -2, 49, 25, 11, 25, 0));
        u41 i3 = yjb.i(24, wjbVar, context, true);
        i3.setText(k96.M0(2131754040, null));
        j.addView(i3, nme.t(-1, 48, 49, 14, 31, 14, 0));
        u41 i4 = yjb.i(24, wjbVar, context, false);
        i4.setText(k96.M0(2131754041, null));
        j.addView(i4, nme.t(-1, 48, 49, 14, 2, 14, 6));
        h.show();
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Runnable runnable3 = runnable2;
                fx0 fx0Var = h;
                switch (b) {
                    case 0:
                        fx0Var.dismiss();
                        runnable3.run();
                        return;
                    default:
                        fx0Var.dismiss();
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
                fx0 fx0Var = h;
                switch (b) {
                    case 0:
                        fx0Var.dismiss();
                        runnable3.run();
                        return;
                    default:
                        fx0Var.dismiss();
                        runnable3.run();
                        return;
                }
            }
        });
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd9.A0():void");
    }

    public final void B0(int i, boolean z) {
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
                L3 = gl.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).withEndAction(new nc9(this, (byte) 1)).start();
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
                L4 = gl.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(s33Var).withEndAction(new nc9(this, (byte) 2)).start();
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
            scaleX3.scaleY(f16).setDuration(420L).setInterpolator(s33Var).withEndAction(new nc9(this, (byte) 3)).start();
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
            L = gl.L(30.0f);
        }
        linearLayout5.setTranslationY(L);
        pkb pkbVar = this.i0;
        if (i == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        pkbVar.setVisibility(i3);
        pkb pkbVar2 = this.i0;
        if (i == 1) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        pkbVar2.setAlpha(f4);
        pkb pkbVar3 = this.i0;
        if (i == 1) {
            f5 = 1.0f;
        } else {
            f5 = 0.8f;
        }
        pkbVar3.setScaleX(f5);
        pkb pkbVar4 = this.i0;
        if (i == 1) {
            f6 = 1.0f;
        } else {
            f6 = 0.8f;
        }
        pkbVar4.setScaleY(f6);
        pkb pkbVar5 = this.i0;
        if (i == 1) {
            L2 = 0.0f;
        } else {
            L2 = gl.L(30.0f);
        }
        pkbVar5.setTranslationY(L2);
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

    public final void C0() {
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
        mc9 mc9Var;
        int max3;
        boolean z8;
        boolean z9;
        fib textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.w()) {
            dd9 dd9Var = this.v0;
            boolean z10 = false;
            if (dd9Var != null) {
                ye9 ye9Var = this.Q;
                int[] D4 = ye9Var.D4();
                if (D4 != null && ye9Var.D3(D4[0], D4[1])) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                dd9Var.setSelected(z9);
            }
            boolean H3 = this.Q.H3();
            ye9 ye9Var2 = this.Q;
            if (H3) {
                fib textSelectionHelper2 = ye9Var2.getTextSelectionHelper();
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
                    dd9 dd9Var2 = (dd9) obj;
                    dd9Var2.setSelected(this.Q.G3(((Integer) dd9Var2.getTag()).intValue(), i, i2, i4, i3, i5));
                }
                if (i2 == i3) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    mc9Var = this.Q.Q4(i, i2);
                } else {
                    mc9Var = null;
                }
                int max4 = Math.max(0, Math.min(i4, i5));
                if (mc9Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i4, i5), mc9Var.length()));
                }
                dd9 dd9Var3 = this.r0;
                if (dd9Var3 != null) {
                    if (mc9Var != null && max4 < max3 && yi9.h(mc9Var.getText(), max4, max3)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    dd9Var3.setSelected(z8);
                }
                dd9 dd9Var4 = this.t0;
                if (dd9Var4 != null) {
                    if (mc9Var != null && max4 < max3 && yi9.g(mc9Var.getText(), max4, max3)) {
                        z10 = true;
                    }
                    dd9Var4.setSelected(z10);
                }
                w0(true);
                x0(z7, this.Q.g2());
            } else if (ye9Var2.s3()) {
                fib textSelectionHelper3 = this.Q.getTextSelectionHelper();
                mc9 o2 = this.Q.o2(textSelectionHelper3.p0);
                int i7 = textSelectionHelper3.r0;
                int i8 = textSelectionHelper3.u0;
                if (o2 == null) {
                    max2 = 0;
                    max = 0;
                } else {
                    max = Math.max(0, Math.min(Math.min(i7, i8), o2.length()));
                    max2 = Math.max(0, Math.min(Math.max(i7, i8), o2.length()));
                }
                int size2 = arrayList.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    dd9 dd9Var5 = (dd9) obj2;
                    int intValue = ((Integer) dd9Var5.getTag()).intValue();
                    if (o2 != null && max < max2 && (o2.c(max, max2) & intValue) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    dd9Var5.setSelected(z6);
                }
                dd9 dd9Var6 = this.r0;
                if (dd9Var6 != null) {
                    if (o2 != null && max < max2 && yi9.h(o2.getText(), max, max2)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    dd9Var6.setSelected(z5);
                }
                dd9 dd9Var7 = this.t0;
                if (dd9Var7 != null) {
                    if (o2 != null && max < max2 && yi9.g(o2.getText(), max, max2)) {
                        z10 = true;
                    }
                    dd9Var7.setSelected(z10);
                }
                w0(true);
                x0(true, this.Q.g2());
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
                    dd9 dd9Var8 = (dd9) arrayList.get(i14);
                    int intValue2 = ((Integer) dd9Var8.getTag()).intValue();
                    if (z && this.Q.F3(intValue2, i10, i12, i11, i13)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    dd9Var8.setSelected(z4);
                    i14 = i15;
                }
                w0(!this.Q.E3());
                dd9 dd9Var9 = this.r0;
                if (dd9Var9 != null) {
                    if (z) {
                        Editable J4 = this.Q.J4(i10, i12, i11, i13);
                        if (J4 == null) {
                            h = false;
                        } else {
                            h = yi9.h(J4, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13));
                        }
                        if (h) {
                            z3 = true;
                            dd9Var9.setSelected(z3);
                        }
                    }
                    z3 = false;
                    dd9Var9.setSelected(z3);
                }
                dd9 dd9Var10 = this.t0;
                if (dd9Var10 != null) {
                    if (z) {
                        Editable J42 = this.Q.J4(i10, i12, i11, i13);
                        if (J42 == null) {
                            g = false;
                        } else {
                            g = yi9.g(J42, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13));
                        }
                        if (g) {
                            z2 = true;
                            dd9Var10.setSelected(z2);
                        }
                    }
                    z2 = false;
                    dd9Var10.setSelected(z2);
                }
                if (z && i10 == i11) {
                    z10 = true;
                }
                x0(z10, this.Q.g2());
            }
        }
    }

    public final void D0() {
        boolean z;
        float f;
        boolean m2 = this.Q.m2();
        ld9 ld9Var = this.Q.R3;
        if (ld9Var != null && !ld9Var.c.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = this.W;
        float f2 = 0.35f;
        if (imageView != null) {
            imageView.setEnabled(m2);
            ImageView imageView2 = this.W;
            if (m2) {
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

    public final void E0() {
        boolean z;
        int i = 0;
        if (!na7.q1(this.currentAccount).u4() && !y6c.h(this.currentAccount).p()) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dd9) obj).setPremiumLocked(z);
        }
    }

    public final void F0() {
        float f;
        if (this.z0 == null) {
            return;
        }
        boolean I3 = this.Q.I3();
        this.z0.setEnabled(I3);
        ViewPropertyAnimator animate = this.z0.animate();
        if (I3) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        ug8.s(animate, f, 150L);
    }

    public final dd9 Y(int i, int i2, boolean z) {
        int i3;
        dd9 dd9Var = new dd9(i, getResourceProvider(), this.f0.getContext());
        if (z) {
            dd9Var.d();
            this.O.add(dd9Var);
        }
        dd9Var.setTag(Integer.valueOf(i2));
        dd9Var.setContentDescription(c0(i2));
        this.g0.add(dd9Var);
        LinearLayout linearLayout = this.f0;
        if (linearLayout.getChildCount() == 0) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        linearLayout.addView(dd9Var, nme.t(38, 38, 16, i3, 0, 0, 0));
        return dd9Var;
    }

    public final void Z(Context context, int i, int i2, boolean z) {
        int i3;
        dd9 dd9Var = new dd9(i, getResourceProvider(), context);
        if (z) {
            dd9Var.d();
            this.O.add(dd9Var);
        }
        dd9Var.setTag(Integer.valueOf(i2));
        dd9Var.setContentDescription(e0(i2));
        dd9Var.setOnClickListener(new v0(this, i2, (byte) 21));
        this.m0.add(dd9Var);
        LinearLayout linearLayout = this.j0;
        if (linearLayout.getChildCount() > 0) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        linearLayout.addView(dd9Var, nme.t(38, 38, 16, i3, 0, 0, 0));
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
        ofFloat.addUpdateListener(new pc9(this, (byte) 0));
        this.Q0.setInterpolator(s33.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void b0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        t14 t14Var = this.B0;
        if (t14Var != null && (layoutParams = (FrameLayout.LayoutParams) t14Var.getLayoutParams()) != null) {
            int f0 = f0();
            ad9 ad9Var = this.P;
            if (ad9Var == null) {
                max = f0();
            } else {
                max = Math.max(f0(), ((ad9Var.getMeasuredHeight() - this.P.getPaddingTop()) - gl.L(240.0f)) - this.U0);
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
        int i;
        int i2;
        int i3;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.O;
        arrayList.clear();
        this.P = new ad9(this, context);
        setHasOwnBackground(true);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.P.setDefaultFocusHighlightEnabled(false);
        }
        this.F0 = na7.b1().getInt("kbd_height", gl.L(200.0f));
        this.G0 = na7.b1().getInt("kbd_height_land3", gl.L(200.0f));
        ?? obj = new Object();
        this.I0 = obj;
        this.P.r.add(obj);
        ye9 ye9Var = new ye9(context, this.currentAccount, getResourceProvider(), new ln8(this, (byte) 7));
        this.Q = ye9Var;
        ye9Var.setFileRefParentObject(this.r);
        this.P.addView(this.Q, nme.e(-1, -1, 119));
        this.P.addView(this.Q.getOverlayView(), nme.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            ye9 ye9Var2 = this.Q;
            ArrayList arrayList2 = ye9Var2.t3;
            ye9Var2.s3 = richMessage;
            ye9.S2(arrayList2, richMessage.blocks, ye9Var2.u3);
            ye9Var2.S3();
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                ye9Var2.w4((lk0) arrayList2.get(i4));
            }
            ye9Var2.g3.O(false);
        } else {
            String str = this.f;
            if (str != null) {
                ye9 ye9Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = ye9Var3.u3;
                ArrayList arrayList3 = ye9Var3.t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    ye9.S2(arrayList3, dg9.b(charSequence), hashMap);
                }
                arrayList3.addAll(ye9Var3.x4(ff9.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    ye9.S2(arrayList3, dg9.b(charSequence2), hashMap);
                }
                ye9Var3.S3();
                ye9Var3.g3.O(false);
            } else {
                Editable editable = this.a;
                if (editable != null) {
                    this.Q.setInitialText(editable);
                }
            }
        }
        ld9 ld9Var = this.Q.R3;
        if (ld9Var != null) {
            ld9Var.j();
        }
        View view = new View(context);
        this.R = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i5 = bkb.c6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i5), bkb.p1(0.0f, getThemedColor(i5))}));
        this.P.addView(this.R, nme.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{bkb.p1(0.0f, getThemedColor(i5)), getThemedColor(i5)}));
        this.P.addView(this.S, nme.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, nme.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(2131231243);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i5);
        int themedColor2 = getThemedColor(i5);
        int i6 = bkb.h6;
        imageView3.setBackground(new gd9(bkb.Z(themedColor, bkb.v(themedColor2, getThemedColor(i6)), gl.L(22.0f), gl.L(22.0f))));
        ImageView imageView4 = this.U;
        int i7 = bkb.F6;
        wjb resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView4, i7, resourceProvider, mode);
        ote.a(this.U);
        this.U.setContentDescription(k96.M0(2131754878, null));
        this.U.setOnClickListener(new oc9(this, (byte) 1));
        this.T.addView(this.U, nme.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i5))));
        this.T.addView(this.V, nme.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(2131231602);
        this.W.setScaleType(scaleType);
        zkb.R(this.W, bkb.f0(getThemedColor(i6), 1, -1), null, zkb.M(i6), getResourceProvider());
        zkb.s(this.W, i7, getResourceProvider(), mode);
        ote.a(this.W);
        this.W.setContentDescription(k96.M0(2131743648, null));
        this.W.setOnClickListener(new oc9(this, (byte) 2));
        this.V.addView(this.W, nme.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(2131231585);
        this.X.setScaleType(scaleType);
        zkb.R(this.X, bkb.f0(getThemedColor(i6), 1, -1), null, zkb.M(i6), getResourceProvider());
        zkb.s(this.X, i7, getResourceProvider(), mode);
        ote.a(this.X);
        this.X.setContentDescription(k96.M0(2131746149, null));
        this.X.setOnClickListener(new oc9(this, (byte) 3));
        this.V.addView(this.X, nme.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, nme.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.a0.setClipToPadding(false);
        this.Z.addView(this.a0, nme.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.b0.setClipChildren(false);
        this.b0.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        this.a0.addView(this.b0, nme.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.a0.addView(frameLayout4, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.d0 = imageView7;
        imageView7.setImageDrawable(new gc(context));
        this.d0.setScaleType(scaleType);
        zkb.s(this.d0, i7, getResourceProvider(), mode);
        this.d0.setBackground(new gd9(bkb.Z(getThemedColor(i5), bkb.v(getThemedColor(i5), getThemedColor(i6)), gl.L(22.0f), gl.L(22.0f))));
        this.b0.addView(this.d0, nme.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ote.a(this.d0);
        this.d0.setContentDescription(k96.M0(2131755006, null));
        this.d0.setOnClickListener(new oc9(this, (byte) 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i5))));
        frameLayout5.addView(frameLayout6, nme.e(-2, 44, 81));
        bd9 bd9Var = new bd9(context, (byte) 0);
        this.e0 = bd9Var;
        bd9Var.setClipToOutline(true);
        this.e0.setOutlineProvider(new xi((byte) 14));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f0 = linearLayout3;
        linearLayout3.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        this.f0.setOrientation(0);
        this.e0.addView(this.f0);
        frameLayout6.addView(this.e0, nme.c(-1.0f, -1));
        qy1 qy1Var = new qy1(context, 24);
        this.c0 = qy1Var;
        qy1Var.setPadding(gl.L(7.0f), gl.L(7.0f), gl.L(7.0f), gl.L(7.0f));
        zkb.s(this.c0, i7, getResourceProvider(), mode);
        zkb.R(this.c0, bkb.Z(getThemedColor(i5), getThemedColor(i6), gl.L(20.0f), gl.L(20.0f)), zkb.M(i5), zkb.M(i6), getResourceProvider());
        this.c0.j(oy1.e, false);
        this.f0.addView(this.c0, nme.r(38, 38, 16));
        ote.a(this.c0);
        this.c0.setContentDescription(k96.M0(2131754884, null));
        this.c0.setOnClickListener(new oc9(this, (byte) 5));
        Y(2131231599, 1, false).setOnClickListener(new b99(this, context, (byte) 2));
        Y(2131231571, 2, true).setOnClickListener(new oc9(this, (byte) 6));
        Y(2131231588, 4, true).setOnClickListener(new oc9(this, (byte) 7));
        Y(2131231573, 7, true).setOnClickListener(new oc9(this, (byte) 8));
        ImageView imageView8 = new ImageView(context);
        this.h0 = imageView8;
        imageView8.setImageResource(2131232494);
        this.h0.setScaleType(scaleType);
        zkb.s(this.h0, i7, getResourceProvider(), mode);
        zkb.R(this.h0, bkb.Z(getThemedColor(i5), getThemedColor(i6), gl.L(20.0f), gl.L(20.0f)), zkb.M(i5), zkb.M(i6), getResourceProvider());
        this.f0.addView(this.h0, nme.t(38, 38, 16, 2, 0, 0, 0));
        ote.a(this.h0);
        this.h0.setContentDescription(k96.M0(2131754921, null));
        this.h0.setOnClickListener(new oc9(this, (byte) 9));
        this.b0.addView(frameLayout5, nme.l(1.0f, 0, 44));
        pkb pkbVar = new pkb((byte) 13, context, this);
        this.i0 = pkbVar;
        pkbVar.setOrientation(0);
        this.i0.setClipToPadding(false);
        this.i0.setClipChildren(false);
        this.i0.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        this.Z.addView(this.i0, nme.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.w0.setClipToPadding(false);
        this.w0.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        this.Z.addView(this.w0, nme.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.x0 = imageView9;
        imageView9.f(2131624043, gl.L(16.0f), gl.L(16.0f), null);
        oy8 animatedDrawable = this.x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.F(0);
            animatedDrawable.K(0);
        }
        this.x0.setScaleType(scaleType);
        zkb.s(this.x0, i7, getResourceProvider(), mode);
        this.x0.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i5))));
        this.w0.addView(this.x0, nme.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i5))));
        this.i0.addView(frameLayout8, nme.c(44.0f, -2));
        cd9 cd9Var = new cd9(this, context);
        this.k0 = cd9Var;
        cd9Var.setHorizontalScrollBarEnabled(false);
        this.k0.setClipToOutline(true);
        this.k0.setOutlineProvider(new xi((byte) 15));
        frameLayout8.addView(this.k0, nme.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.j0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.j0.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
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
        dd9 dd9Var = new dd9(2131231584, getResourceProvider(), context);
        this.v0 = dd9Var;
        dd9Var.setContentDescription(k96.M0(2131746247, null));
        this.v0.setOnClickListener(new oc9(this, (byte) 11));
        LinearLayout linearLayout5 = this.j0;
        dd9 dd9Var2 = this.v0;
        if (linearLayout5.getChildCount() > 0) {
            i = 2;
        } else {
            i = 0;
        }
        linearLayout5.addView(dd9Var2, nme.t(38, 38, 16, i, 0, 0, 0));
        dd9 dd9Var3 = new dd9(2131231552, getResourceProvider(), context);
        this.s0 = dd9Var3;
        dd9Var3.setContentDescription(k96.M0(2131745818, null));
        this.s0.setOnClickListener(new oc9(this, (byte) 12));
        LinearLayout linearLayout6 = this.j0;
        dd9 dd9Var4 = this.s0;
        if (linearLayout6.getChildCount() > 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        linearLayout6.addView(dd9Var4, nme.t(38, 38, 16, i2, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.o0.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        this.o0.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i5))));
        this.i0.addView(this.o0, nme.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        dd9 dd9Var5 = new dd9(2131231749, getResourceProvider(), context);
        this.r0 = dd9Var5;
        dd9Var5.setContentDescription(k96.M0(2131751732, null));
        this.r0.setOnClickListener(new oc9(this, (byte) 13));
        this.o0.addView(this.r0, nme.r(38, 38, 16));
        dd9 dd9Var6 = new dd9(2131232082, getResourceProvider(), context);
        this.t0 = dd9Var6;
        dd9Var6.setContentDescription(k96.M0(2131754861, null));
        this.t0.setOnClickListener(new oc9(this, (byte) 14));
        this.o0.addView(this.t0, nme.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.p0.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        this.p0.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i5))));
        this.i0.addView(this.p0, nme.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        dd9 dd9Var7 = new dd9(2131231573, getResourceProvider(), context);
        this.u0 = dd9Var7;
        dd9Var7.d();
        arrayList.add(this.u0);
        this.u0.setContentDescription(k96.M0(2131754863, null));
        this.u0.setOnClickListener(new oc9(this, (byte) 15));
        this.p0.addView(this.u0, nme.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.n0.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        this.n0.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i5))));
        this.i0.addView(this.n0, 0, nme.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        dd9 dd9Var8 = new dd9(0, getResourceProvider(), context);
        this.q0 = dd9Var8;
        dd9Var8.setImageDrawable(new gc(context));
        this.q0.setContentDescription(k96.M0(2131755006, null));
        this.q0.setOnClickListener(new oc9(this, (byte) 16));
        this.n0.addView(this.q0, nme.r(38, 38, 16));
        if (this.r != null) {
            i3 = 2131231505;
        } else if (h0()) {
            i3 = 2131231515;
        } else {
            i3 = 2131232699;
        }
        jh3 jh3Var = new jh3(this, context, i3, getResourceProvider());
        this.z0 = jh3Var;
        jh3Var.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(bkb.Oe))));
        ote.a(this.z0);
        this.b0.addView(this.z0, nme.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.z0.setContentDescription(k96.M0(2131745448, null));
        this.z0.setOnClickListener(new oc9(this, (byte) 0));
        this.z0.setOnLongClickListener(new zs(this, (byte) 13));
        jh3 jh3Var2 = this.z0;
        if (jh3Var2 != null) {
            jh3Var2.setLocked(i0());
        }
        this.P.setPadding(0, gl.m, 0, 0);
        d0();
        B0(0, false);
        D0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new x62(this, (byte) 2));
        E0();
        if (this.e) {
            this.Q.y2();
            this.e = false;
        }
        ad9 ad9Var = this.P;
        this.fragmentView = ad9Var;
        return ad9Var;
    }

    public final void d0() {
        FrameLayout.LayoutParams layoutParams;
        t14 t14Var = this.B0;
        if (t14Var != null && (layoutParams = (FrameLayout.LayoutParams) t14Var.getLayoutParams()) != null) {
            int i = layoutParams.bottomMargin;
            int i2 = this.U0;
            if (i != i2) {
                layoutParams.bottomMargin = i2;
                this.B0.setLayoutParams(layoutParams);
            }
        }
        b0();
        int max = Math.max(Math.max(this.E0, this.U0), this.V0);
        this.Q.setPadding(0, gl.L(60.0f), 0, gl.L(110.0f) + max);
        ye9 ye9Var = this.Q;
        int i3 = this.U0;
        int i4 = this.V0;
        int i5 = this.E0;
        ye9Var.W3 = i3;
        ye9Var.X3 = i4;
        ye9Var.Y3 = i5;
        int i6 = -max;
        this.Z.setTranslationY(i6);
        this.S.setTranslationY(i6 + this.U0);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.h5) {
            jh3 jh3Var = this.z0;
            if (jh3Var != null) {
                jh3Var.setLocked(i0());
            }
            E0();
        }
    }

    public final int f0() {
        int i;
        Point point = gl.q;
        if (point.x > point.y) {
            i = this.G0;
        } else {
            i = this.F0;
        }
        if (i <= 0) {
            return gl.L(200.0f);
        }
        return i;
    }

    public final void g0(boolean z) {
        if (this.D0) {
            this.D0 = false;
            t14 t14Var = this.B0;
            if (t14Var != null) {
                t14Var.s(false);
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
        t14 t14Var2 = this.B0;
        if (t14Var2 != null) {
            t14Var2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            d0();
        }
        qy1 qy1Var = this.c0;
        if (qy1Var != null) {
            qy1Var.j(oy1.e, z);
        }
    }

    public final boolean h0() {
        mu1 mu1Var;
        if (this.r == null && (mu1Var = this.K) != null && mu1Var.N7()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final boolean i0() {
        if (!na7.q1(this.currentAccount).u4() && !y6c.h(this.currentAccount).p()) {
            ye9 ye9Var = this.Q;
            if (dg9.d(ye9Var.t3, ye9Var.u3)) {
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
        ye9 ye9Var = this.Q;
        if (ye9Var != null && ye9Var.v3.w()) {
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
        cs5 cs5Var = this.y0;
        if (cs5Var != null) {
            cs5Var.u();
            this.y0 = null;
        }
        if (!na7.q1(this.currentAccount).u4() && !y6c.h(this.currentAccount).p()) {
            z = true;
        } else {
            z = false;
        }
        final lk0 M2 = this.Q.M2();
        final cs5 J = cs5.J(this, view);
        J.T = true;
        cs5 K = J.K();
        K.b(2131231243, k96.M0(2131753753, null), new en1(J, (byte) 9), false);
        K.j();
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        K.i(z2, 2131231562, null, k96.M0(2131754027, null), new Runnable(this) {
            public final hd9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                cs5 cs5Var2 = J;
                lk0 lk0Var = M2;
                hd9 hd9Var = this.b;
                switch (b) {
                    case 0:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading1());
                        cs5Var2.u();
                        return;
                    case 1:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading2());
                        cs5Var2.u();
                        return;
                    case 2:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading3());
                        cs5Var2.u();
                        return;
                    case 3:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading4());
                        cs5Var2.u();
                        return;
                    case 4:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading5());
                        cs5Var2.u();
                        return;
                    default:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading6());
                        cs5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gba.T0 + 2);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        K.i(z3, 2131231563, null, k96.M0(2131754026, null), new Runnable(this) {
            public final hd9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                cs5 cs5Var2 = J;
                lk0 lk0Var = M2;
                hd9 hd9Var = this.b;
                switch (b) {
                    case 0:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading1());
                        cs5Var2.u();
                        return;
                    case 1:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading2());
                        cs5Var2.u();
                        return;
                    case 2:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading3());
                        cs5Var2.u();
                        return;
                    case 3:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading4());
                        cs5Var2.u();
                        return;
                    case 4:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading5());
                        cs5Var2.u();
                        return;
                    default:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading6());
                        cs5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gba.T0 + 1);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading3)) {
            z4 = true;
        } else {
            z4 = false;
        }
        K.i(z4, 2131231564, null, k96.M0(2131754025, null), new Runnable(this) {
            public final hd9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                cs5 cs5Var2 = J;
                lk0 lk0Var = M2;
                hd9 hd9Var = this.b;
                switch (b) {
                    case 0:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading1());
                        cs5Var2.u();
                        return;
                    case 1:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading2());
                        cs5Var2.u();
                        return;
                    case 2:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading3());
                        cs5Var2.u();
                        return;
                    case 3:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading4());
                        cs5Var2.u();
                        return;
                    case 4:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading5());
                        cs5Var2.u();
                        return;
                    default:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading6());
                        cs5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gba.T0);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading4)) {
            z5 = true;
        } else {
            z5 = false;
        }
        K.i(z5, 2131231565, null, k96.M0(2131754024, null), new Runnable(this) {
            public final hd9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                cs5 cs5Var2 = J;
                lk0 lk0Var = M2;
                hd9 hd9Var = this.b;
                switch (b) {
                    case 0:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading1());
                        cs5Var2.u();
                        return;
                    case 1:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading2());
                        cs5Var2.u();
                        return;
                    case 2:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading3());
                        cs5Var2.u();
                        return;
                    case 3:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading4());
                        cs5Var2.u();
                        return;
                    case 4:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading5());
                        cs5Var2.u();
                        return;
                    default:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading6());
                        cs5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gba.T0 - 1);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading5)) {
            z6 = true;
        } else {
            z6 = false;
        }
        K.i(z6, 2131231566, null, k96.M0(2131754023, null), new Runnable(this) {
            public final hd9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                cs5 cs5Var2 = J;
                lk0 lk0Var = M2;
                hd9 hd9Var = this.b;
                switch (b) {
                    case 0:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading1());
                        cs5Var2.u();
                        return;
                    case 1:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading2());
                        cs5Var2.u();
                        return;
                    case 2:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading3());
                        cs5Var2.u();
                        return;
                    case 3:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading4());
                        cs5Var2.u();
                        return;
                    case 4:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading5());
                        cs5Var2.u();
                        return;
                    default:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading6());
                        cs5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gba.T0 - 2);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading6)) {
            z7 = true;
        } else {
            z7 = false;
        }
        K.i(z7, 2131231567, null, k96.M0(2131754022, null), new Runnable(this) {
            public final hd9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                cs5 cs5Var2 = J;
                lk0 lk0Var = M2;
                hd9 hd9Var = this.b;
                switch (b) {
                    case 0:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading1());
                        cs5Var2.u();
                        return;
                    case 1:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading2());
                        cs5Var2.u();
                        return;
                    case 2:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading3());
                        cs5Var2.u();
                        return;
                    case 3:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading4());
                        cs5Var2.u();
                        return;
                    case 4:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading5());
                        cs5Var2.u();
                        return;
                    default:
                        hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockHeading6());
                        cs5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gl.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gba.T0 - 3);
        if (M2 != null && ye9.y3(M2.b)) {
            z8 = true;
        } else {
            z8 = false;
        }
        fd9 fd9Var = new fd9(context, 2131231561);
        fd9Var.a(z);
        int i = bkb.F8;
        fd9Var.d = i;
        J.i(z8, 0, fd9Var, k96.M0(2131754028, null), new c10(J, K, (byte) 8));
        J.z().a.setTypeface(gl.o());
        a8 z14 = J.z();
        float f6 = 9.0f;
        if (k96.a0) {
            f = 18.0f;
        } else {
            f = 9.0f;
        }
        int L = gl.L(f);
        if (k96.a0) {
            f2 = 9.0f;
        } else {
            f2 = 18.0f;
        }
        z14.setPadding(L, 0, gl.L(f2), 0);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockParagraph)) {
            z9 = true;
        } else {
            z9 = false;
        }
        J.i(z9, 2131231600, null, k96.M0(2131753985, null), new sc9(this, M2, (byte) 3));
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockBlockquote)) {
            z10 = true;
        } else {
            z10 = false;
        }
        J.i(z10, 2131231584, null, k96.M0(2131753993, null), new sc9(this, M2, (byte) 4));
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockPullquote)) {
            z11 = true;
        } else {
            z11 = false;
        }
        fd9 fd9Var2 = new fd9(context, 2131231583);
        fd9Var2.a(z);
        fd9Var2.d = i;
        J.i(z11, 0, fd9Var2, k96.M0(2131753994, null), new sc9(this, M2, (byte) 0));
        a8 z15 = J.z();
        if (k96.a0) {
            f3 = 18.0f;
        } else {
            f3 = 9.0f;
        }
        int L2 = gl.L(f3);
        if (k96.a0) {
            f4 = 9.0f;
        } else {
            f4 = 18.0f;
        }
        z15.setPadding(L2, 0, gl.L(f4), 0);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockPreformatted)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.i(z12, 2131231555, null, k96.M0(2131754052, null), new sc9(this, M2, (byte) 1));
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockFooter)) {
            z13 = true;
        } else {
            z13 = false;
        }
        fd9 fd9Var3 = new fd9(context, 2131231558);
        fd9Var3.a(z);
        fd9Var3.d = i;
        J.i(z13, 0, fd9Var3, k96.M0(2131754029, null), new sc9(this, M2, (byte) 2));
        a8 z16 = J.z();
        if (k96.a0) {
            f5 = 18.0f;
        } else {
            f5 = 9.0f;
        }
        int L3 = gl.L(f5);
        if (!k96.a0) {
            f6 = 18.0f;
        }
        z16.setPadding(L3, 0, gl.L(f6), 0);
        J.a0();
        this.y0 = J;
    }

    public final void k0() {
        me9 me9Var = this.Q.v3;
        if (me9Var != null && me9Var.w()) {
            n0();
            return;
        }
        new gb9(this.currentAccount, getResourceProvider(), new zf7(this, (byte) 29), getParentActivity()).show();
    }

    public final void l0(k27 k27Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j, k27 k27Var2, k27 k27Var3, bu1 bu1Var, boolean z, int i, int i2, j1a j1aVar, long j2) {
        int i3 = this.currentAccount;
        if (k27Var != null) {
            j5 a = j5.a(i3);
            mu1 mu1Var = this.K;
            co3 co3Var = z3a.J;
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
                z3a.j(pageBlock2, identityHashMap);
            }
            z3a.B(a.a).u(k27Var, richMessage, arrayList4, mu1Var, false);
            return;
        }
        z3a.Q(j5.a(i3), arrayList, arrayList2, arrayList3, arrayList4, j, k27Var2, k27Var3, bu1Var, z, i, i2, j1aVar, 0L, j2, 0L);
    }

    public final void m0() {
        if (!y6c.h(this.currentAccount).p()) {
            showDialog(new jh8((d) this, 43, true));
        }
    }

    public final void n0() {
        pe9 c2 = this.Q.c2();
        if (c2 != null) {
            TL_iv.RichMessage a = c2.a();
            if (a.blocks.isEmpty()) {
                return;
            }
            a1 a1Var = new a1(getParentActivity(), getResourceProvider());
            a1Var.n1(a);
            a1Var.f2 = new be2(c2, (byte) 20);
            a1Var.show();
        }
    }

    public final boolean o0(View view) {
        int i;
        mu1 mu1Var = this.K;
        if (mu1Var != null && this.r == null && !mu1Var.N7() && this.Q.g3() && !this.Q.i3()) {
            if (!this.Q.I3()) {
                F0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> V2 = this.Q.V2();
            if (!V2.isEmpty()) {
                j47 j47Var = this.P0;
                if (j47Var != null) {
                    j47Var.f(false);
                    this.P0 = null;
                }
                j47 j47Var2 = new j47(getParentActivity(), getResourceProvider());
                this.P0 = j47Var2;
                j47Var2.setOnDismissListener(new ph8(this, (byte) 4));
                long a = this.K.a();
                k27 k27Var = this.K.F5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = na7.q1(this.currentAccount).w1(a);
                tL_message.from_id = na7.q1(this.currentAccount).w1(y6c.h(this.currentAccount).e());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = V2;
                richMessage.photos = this.Q.x2();
                tL_message.rich_message.documents = this.Q.u2();
                if (k27Var != null && !k27Var.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = k27Var.e1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                k27 k27Var2 = new k27(this.currentAccount, tL_message, false, false);
                if (k27Var != null && !k27Var.p) {
                    k27Var2.C = k27Var;
                }
                k27Var2.B0 = true;
                k27Var2.W2 = Boolean.TRUE;
                k27Var2.n0(null);
                k27Var2.w1 = true;
                this.P0.r(tb4.t(k27Var2));
                this.z0.setScaleX(1.0f);
                this.z0.setScaleY(1.0f);
                ky1 s = this.P0.s(this.z0, true, new oc9(this, (byte) 10));
                if (s != null) {
                    s.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(bkb.Ei))));
                    j47 j47Var3 = this.P0;
                    int L = gl.L(44.0f);
                    j47Var3.p0 = true;
                    j47Var3.Y = L;
                }
                cs5 I = cs5.I(this, this.z0);
                boolean C = l7c.C(this.K.h());
                if (this.K.G4()) {
                    if (C) {
                        i = 2131745322;
                    } else {
                        i = 2131745667;
                    }
                    I.b(2131232082, k96.M0(i, null), new et(this, a, (byte) 28), false);
                    if (!C && a > 0) {
                        I.b(2131232269, k96.M0(2131745394, null), new nc9(this, (byte) 5), false);
                    }
                }
                if (!C) {
                    I.b(2131231512, k96.M0(2131745391, null), new nc9(this, (byte) 6), false);
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
                    ye9 ye9Var = this.Q;
                    Uri data = intent.getData();
                    if (data == null) {
                        ye9Var.getClass();
                        return;
                    } else if (ye9Var.getContext() != null) {
                        Utilities.e.c(new lw8(ye9Var, data, (byte) 19));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            } else if (i == 1 || i == 14) {
                if (intent != null && intent.getData() != null) {
                    this.Q.Z1(intent.getData());
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
                t14 t14Var = this.B0;
                if (t14Var != null) {
                    t14Var.s(false);
                    this.B0.z();
                }
                a0(false);
                return false;
            }
        } else if (this.C0) {
            g0(true);
            return false;
        } else if (!this.Q.B2()) {
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
        if (!gl.O1() && this.s != null && this.w != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            j92 j92Var = this.s;
            this.y = j92Var.n;
            j92Var.e = false;
            j92Var.invalidate();
            this.w.setAlpha(0.0f);
            this.w.q2.setVisibility(4);
            z0();
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
            ofFloat.addUpdateListener(new pc9(this, (byte) 1));
            ofFloat.addListener(new eh8(this, runnable, (byte) 8));
            FrameLayout frameLayout = this.T;
            if (!z) {
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.T;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -gl.L(16.0f)), ObjectAnimator.ofFloat(this.a0, property, 0.0f), ObjectAnimator.ofFloat(this.a0, property2, gl.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, property, 1.0f, 0.0f));
            } else {
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout, property3, 0.0f, 1.0f);
                FrameLayout frameLayout3 = this.T;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout3, property4, -gl.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.a0, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a0, property4, gl.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(s33.h);
            this.P.post(new pt(animatorSet, (byte) 1));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.h5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        rc9 rc9Var;
        kk7.f(this.currentAccount).n(this, kk7.h5);
        if (!this.W0) {
            r0();
            this.W0 = true;
        }
        uc9 uc9Var = this.O0;
        if (uc9Var != null) {
            this.O0 = null;
            gl.d3(uc9Var);
        }
        j47 j47Var = this.P0;
        if (j47Var != null) {
            j47Var.g();
            this.P0 = null;
        }
        ye9 ye9Var = this.Q;
        if (ye9Var != null) {
            ye9Var.C2();
        }
        eq2 eq2Var = this.A0;
        if (eq2Var != null) {
            eq2Var.n();
        }
        super.onFragmentDestroy();
        t14 t14Var = this.B0;
        if (t14Var != null) {
            t14Var.A();
        }
        ad9 ad9Var = this.P;
        if (ad9Var != null && (rc9Var = this.I0) != null) {
            ad9Var.r.remove(rc9Var);
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.U0 = i4;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
        layoutParams.height = gl.L(68.0f) + this.U0;
        this.S.setLayoutParams(layoutParams);
        d0();
    }

    @Override
    public final vxc onInsetsInternal(View view, vxc vxcVar) {
        boolean z;
        cs5 cs5Var;
        io5 f = vxcVar.a.f(3);
        int i = vxcVar.a.f(8).d;
        this.V0 = i;
        int i2 = i - f.d;
        boolean z2 = this.H0;
        if (i2 > gl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        this.H0 = z;
        if (z && i2 > gl.L(50.0f) && !gl.E && !gl.O1()) {
            Point point = gl.q;
            if (point.x > point.y) {
                this.G0 = i2;
                na7.b1().edit().putInt("kbd_height_land3", this.G0).commit();
            } else {
                this.F0 = i2;
                na7.b1().edit().putInt("kbd_height", this.F0).commit();
            }
        }
        if (this.H0 && !z2 && this.C0 && !this.D0) {
            g0(false);
        }
        if (!this.H0 && z2 && (cs5Var = this.y0) != null) {
            cs5Var.u();
            this.y0 = null;
        }
        onInsets(f.a, f.b, f.c, f.d);
        return vxc.b;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i = bkb.c6;
            int themedColor = getThemedColor(i);
            int i2 = bkb.h6;
            int themedColor2 = getThemedColor(i2);
            int i3 = bkb.Oe;
            int themedColor3 = getThemedColor(i3);
            if (!this.a1 || themedColor != this.X0 || themedColor2 != this.Y0 || themedColor3 != this.Z0) {
                this.a1 = true;
                this.X0 = themedColor;
                this.Y0 = themedColor2;
                this.Z0 = themedColor3;
                View view = this.R;
                if (view != null) {
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i), bkb.p1(0.0f, getThemedColor(i))}));
                }
                View view2 = this.S;
                if (view2 != null) {
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, getThemedColor(i)), getThemedColor(i)}));
                }
                ImageView imageView = this.U;
                if (imageView != null) {
                    imageView.setBackground(new gd9(bkb.Z(getThemedColor(i), bkb.v(getThemedColor(i), getThemedColor(i2)), gl.L(22.0f), gl.L(22.0f))));
                }
                LinearLayout linearLayout = this.V;
                if (linearLayout != null) {
                    linearLayout.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i))));
                }
                ImageView imageView2 = this.d0;
                if (imageView2 != null) {
                    imageView2.setBackground(new gd9(bkb.Z(getThemedColor(i), bkb.v(getThemedColor(i), getThemedColor(i2)), gl.L(22.0f), gl.L(22.0f))));
                }
                ry8 ry8Var = this.x0;
                if (ry8Var != null) {
                    ry8Var.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i))));
                }
                LinearLayout linearLayout2 = this.o0;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i))));
                }
                LinearLayout linearLayout3 = this.p0;
                if (linearLayout3 != null) {
                    linearLayout3.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i))));
                }
                LinearLayout linearLayout4 = this.n0;
                if (linearLayout4 != null) {
                    linearLayout4.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i))));
                }
                jh3 jh3Var = this.z0;
                if (jh3Var != null) {
                    jh3Var.setBackground(new gd9(bkb.b0(gl.L(22.0f), getThemedColor(i3))));
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        ye9 ye9Var;
        int i;
        ye9 ye9Var2;
        super.onTransitionAnimationStart(z, z2);
        if (z && !z2 && (i = this.c) >= 0 && (ye9Var2 = this.Q) != null) {
            int i2 = this.d;
            this.d = -1;
            this.c = -1;
            if (!ye9Var2.U1(i, i2)) {
                ye9Var2.post(new td9(ye9Var2, i, i2, (byte) 0));
            }
        } else if (z && !z2) {
            if ((this.b != null || this.f != null) && (ye9Var = this.Q) != null && !ye9Var.W2()) {
                ye9Var.post(new q62(ye9Var, (byte) 5));
            }
        }
    }

    public final void p0(int i, int i2) {
        ye9 ye9Var = this.Q;
        ye9Var.k4 = ye9Var.M2();
        x02 x02Var = new x02(getParentActivity(), this, false, false, true, getResourceProvider());
        x02Var.W3 = new xc9(this, x02Var);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
        chatAttachAlertPhotoLayout.setIncludeVideosInGallery(true);
        chatAttachAlertPhotoLayout.h0();
        x02Var.t1(1, true);
        x02Var.P0(i);
        x02Var.t4 = new wc9(this, x02Var);
        x02Var.S1 = new wc9(this, x02Var);
        x02Var.R1 = new yc9(this, x02Var);
        x02Var.Z0();
        if (i2 != 0) {
            x02Var.j1(i2);
        }
        x02Var.v0(true);
        x02Var.show();
    }

    public final boolean r0() {
        TL_iv.RichMessage e2;
        Runnable runnable;
        if (this.K == null || this.r != null || !this.Q.m2()) {
            return false;
        }
        if (this.N) {
            e2 = null;
        } else {
            e2 = this.Q.e2();
        }
        if (e2 == null && (runnable = this.M) != null) {
            runnable.run();
        }
        ar1 ar1Var = this.K.a0;
        if (e2 != null && !this.N) {
            ye9 ye9Var = this.Q;
            if (ye9Var.g3() && !dg9.d(ye9Var.t3, ye9Var.u3) && ar1Var != null) {
                SpannableStringBuilder g = dg9.g(this.Q.t3);
                mu1 mu1Var = ar1Var.F3;
                if (ar1Var.F0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g);
                vu3.m(spannableStringBuilder, ar1Var.F0.getPaint().getFontMetricsInt(), false, null, 0);
                gm[] gmVarArr = (gm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gm.class);
                if (gmVarArr != null) {
                    for (gm gmVar : gmVarArr) {
                        gmVar.applyFontMetrics(ar1Var.F0.getPaint().getFontMetricsInt(), vl.f());
                    }
                }
                ey8.a(spannableStringBuilder);
                if (mu1Var != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    hq6.d0(ar1Var.R).T1(mu1Var.a(), mu1Var.G5(mu1Var.F5), charSequenceArr[0], hq6.d0(ar1Var.R).Y(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                ar1Var.setRichDraftPreview(null);
                if (ar1Var.F0.getText() != null) {
                    ar1Var.F0.getText().clear();
                }
                ar1Var.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        hq6 mediaDataController = getMediaDataController();
        long a = this.K.a();
        mu1 mu1Var2 = this.K;
        mediaDataController.T1(a, mu1Var2.G5(mu1Var2.F5), "", null, null, null, null, 0L, false, false, e2);
        TL_iv.RichMessage richMessage = e2;
        if (ar1Var == null) {
            return true;
        }
        ar1Var.setRichDraftPreview(richMessage);
        return true;
    }

    public final mc9 s0() {
        mc9 focusedEditTextOrNull = this.Q.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            this.S0 = focusedEditTextOrNull;
            this.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        mc9 mc9Var = this.S0;
        if (mc9Var != null) {
            return mc9Var;
        }
        return this.Q.L2();
    }

    public final int t0(mc9 mc9Var) {
        if (mc9Var == this.S0 && this.Q.getFocusedEditTextOrNull() != mc9Var) {
            return Math.min(this.T0, mc9Var.length());
        }
        return Math.max(0, mc9Var.getSelectionEnd());
    }

    public final void u0() {
        if (i0()) {
            Activity parentActivity = getParentActivity();
            ye9 ye9Var = this.Q;
            Objects.requireNonNull(ye9Var);
            q0(getResourceProvider(), parentActivity, new q62(ye9Var, (byte) 0), new nc9(this, (byte) 4));
        } else if (h0()) {
            ij.J(getParentActivity(), this.K.a(), new g29(this, (byte) 4), getResourceProvider());
        } else {
            v0(0, 0, true);
        }
    }

    public final void v0(final int i, final int i2, final boolean z) {
        ar1 ar1Var;
        hy1 hy1Var;
        if (i0()) {
            Activity parentActivity = getParentActivity();
            ye9 ye9Var = this.Q;
            Objects.requireNonNull(ye9Var);
            q0(getResourceProvider(), parentActivity, new q62(ye9Var, (byte) 0), new nc9(this, (byte) 4));
        } else if (this.K != null && this.Q.g3() && !this.Q.i3()) {
            if (!this.Q.I3()) {
                F0();
            } else if (!na7.q1(this.currentAccount).u4()) {
                ar1 ar1Var2 = this.K.a0;
                if (ar1Var2 != null) {
                    this.N = true;
                    Runnable runnable = this.L;
                    if (runnable != null) {
                        runnable.run();
                    }
                    ar1Var2.t1(dg9.g(this.Q.t3), z, i, i2);
                    finishFragment();
                }
            } else {
                this.N = true;
                final ArrayList V2 = this.Q.V2();
                if (V2.isEmpty()) {
                    return;
                }
                final ArrayList x2 = this.Q.x2();
                final ArrayList u2 = this.Q.u2();
                final ArrayList a = cg9.a(this.currentAccount, V2);
                final long a2 = this.K.a();
                mu1 mu1Var = this.K;
                final k27 k27Var = mu1Var.F5;
                final k27 k27Var2 = mu1Var.m4;
                final bu1 bu1Var = mu1Var.D5;
                final long a7 = mu1Var.a7();
                final j1a O6 = this.K.O6();
                final k27 k27Var3 = this.r;
                ?? r0 = new Runnable() {
                    @Override
                    public final void run() {
                        hd9.this.l0(k27Var3, V2, x2, u2, a, a2, k27Var, k27Var2, bu1Var, z, i, i2, O6, a7);
                    }
                };
                Runnable runnable2 = this.L;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (k27Var3 == null && (ar1Var = this.K.a0) != null && (hy1Var = ar1Var.P3) != null) {
                    hy1Var.u(null, z, i, i2, 0L);
                }
                if (i != 0 && k27Var3 == null) {
                    this.O0 = r0;
                    finishFragment();
                    return;
                }
                r0.run();
                finishFragment();
            }
        }
    }

    public final void w0(boolean z) {
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dd9 dd9Var = (dd9) obj;
            if (((Integer) dd9Var.getTag()).intValue() == 1) {
                dd9Var.setEnabled(z);
            }
        }
    }

    public final void x0(boolean z, boolean z2) {
        dd9 dd9Var = this.r0;
        if (dd9Var != null) {
            dd9Var.setEnabled(z);
        }
        dd9 dd9Var2 = this.s0;
        if (dd9Var2 != null) {
            dd9Var2.setEnabled(z2);
        }
        dd9 dd9Var3 = this.t0;
        if (dd9Var3 != null) {
            dd9Var3.setEnabled(z);
        }
        dd9 dd9Var4 = this.u0;
        if (dd9Var4 != null) {
            dd9Var4.setEnabled(z);
        }
    }

    public final void y0(boolean z, boolean z2) {
        float f;
        int i;
        if (this.K0 != z || !z2) {
            this.K0 = z;
            if (z) {
                f = 1.15f;
            } else {
                f = 1.0f;
            }
            ry8 ry8Var = this.x0;
            if (z2) {
                ry8Var.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(s33.h).start();
            } else {
                ry8Var.animate().cancel();
                this.x0.setScaleX(f);
                this.x0.setScaleY(f);
            }
            ry8 ry8Var2 = this.x0;
            if (z) {
                i = bkb.p7;
            } else {
                i = bkb.F6;
            }
            zkb.s(ry8Var2, i, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            oy8 animatedDrawable = this.x0.getAnimatedDrawable();
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

    public final void z0() {
        j92 j92Var = this.s;
        int[] iArr = this.G;
        j92Var.getLocationInWindow(iArr);
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
        iArr4[0] = (int) (iArr4[0] - (this.w.F0.getX() - gl.L(16.0f)));
    }

    public hd9(String str) {
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
        this.N0 = new nc9(this, (byte) 0);
        this.f = str;
    }

    public hd9(TL_iv.RichMessage richMessage) {
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
        this.N0 = new nc9(this, (byte) 0);
        this.b = richMessage;
    }
}
