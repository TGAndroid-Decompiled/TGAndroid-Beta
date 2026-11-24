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
public final class jf9 extends d implements jm7 {
    public pr2 A0;
    public e34 B0;
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
    public se9 I0;
    public float J;
    public int J0;
    public yv1 K;
    public boolean K0;
    public Runnable L;
    public int L0;
    public Runnable M;
    public boolean M0;
    public boolean N;
    public final Runnable N0;
    public final ArrayList O;
    public ve9 O0;
    public bf9 P;
    public j67 P0;
    public ch9 Q;
    public ValueAnimator Q0;
    public View R;
    public float R0;
    public View S;
    public ne9 S0;
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
    public d02 c0;
    public int d;
    public ImageView d0;
    public boolean e;
    public df9 e0;
    public final String f;
    public LinearLayout f0;
    public final ArrayList g0;
    public CharSequence h;
    public ImageView h0;
    public qmb i0;
    public LinearLayout j0;
    public ef9 k0;
    public int l0;
    public final ArrayList m0;
    public CharSequence n;
    public LinearLayout n0;
    public LinearLayout o0;
    public LinearLayout p0;
    public ff9 q0;
    public k47 r;
    public ff9 r0;
    public va2 s;
    public ff9 s0;
    public ff9 t0;
    public ff9 u0;
    public ff9 v0;
    public ms1 w;
    public FrameLayout w0;
    public final Rect x;
    public s09 x0;
    public im0 y;
    public bu5 y0;
    public vi3 z0;

    public jf9(Editable editable) {
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
        this.N0 = new oe9(this, (byte) 0);
        this.a = editable;
    }

    public static String d0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 7) {
                        if (i != 9) {
                            return null;
                        }
                        return jb6.M0(2131754868, null);
                    }
                    return jb6.M0(2131754863, null);
                }
                return jb6.M0(2131754854, null);
            }
            return jb6.M0(2131754859, null);
        }
        return jb6.M0(2131754853, null);
    }

    public static String f0(int i) {
        if (i == 1) {
            return jb6.M0(2131753636, null);
        }
        if (i == 2) {
            return jb6.M0(2131748844, null);
        }
        if (i == 16) {
            return jb6.M0(2131743576, null);
        }
        if (i == 8) {
            return jb6.M0(2131744122, null);
        }
        if (i == 256) {
            return jb6.M0(2131744951, null);
        }
        if (i == 4) {
            return jb6.M0(2131748107, null);
        }
        if (i == 65536) {
            return jb6.M0(2131749060, null);
        }
        if (i == 16384) {
            return jb6.M0(2131744110, null);
        }
        if (i != 32768) {
            return null;
        }
        return jb6.M0(2131744012, null);
    }

    public static void r0(ylb ylbVar, Context context, final Runnable runnable, final Runnable runnable2) {
        final my0 h = hg9.h(1, ylbVar, context, false);
        LinearLayout i = hg9.i(context, 1);
        h.O = i;
        ImageView k = td4.k(context, 2131231607);
        k.setScaleType(ImageView.ScaleType.CENTER);
        int L = gm.L(80.0f);
        int i2 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i2, ylbVar));
        wmb M = anb.M(i2);
        k.setBackground(K);
        anb.j(k, K, M, null, ylbVar);
        i.addView(k, qoe.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131754006, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        int i3 = cmb.F6;
        anb.X(textView, i3, ylbVar);
        TextView m = wi8.m(i, textView, qoe.t(-1, -2, 49, 25, 16, 25, 0), context);
        m.setText(gm.S2(jb6.M0(2131754007, null)));
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        anb.X(m, i3, ylbVar);
        i.addView(m, qoe.t(-1, -2, 49, 25, 11, 25, 0));
        b61 i4 = mlb.i(24, ylbVar, context, true);
        i4.setText(jb6.M0(2131754008, null));
        i.addView(i4, qoe.t(-1, 48, 49, 14, 31, 14, 0));
        b61 i5 = mlb.i(24, ylbVar, context, false);
        i5.setText(jb6.M0(2131754009, null));
        i.addView(i5, qoe.t(-1, 48, 49, 14, 2, 14, 6));
        h.show();
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Runnable runnable3 = runnable2;
                my0 my0Var = h;
                switch (b) {
                    case 0:
                        my0Var.dismiss();
                        runnable3.run();
                        return;
                    default:
                        my0Var.dismiss();
                        runnable3.run();
                        return;
                }
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Runnable runnable3 = runnable;
                my0 my0Var = h;
                switch (b) {
                    case 0:
                        my0Var.dismiss();
                        runnable3.run();
                        return;
                    default:
                        my0Var.dismiss();
                        runnable3.run();
                        return;
                }
            }
        });
    }

    public final void A0() {
        va2 va2Var = this.s;
        int[] iArr = this.G;
        va2Var.getLocationInWindow(iArr);
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
        iArr4[0] = (int) (iArr4[0] - (this.w.F0.getX() - gm.L(16.0f)));
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf9.B0():void");
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
                L3 = gm.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).withEndAction(new oe9(this, (byte) 1)).start();
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
                L4 = gm.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(d53Var).withEndAction(new oe9(this, (byte) 2)).start();
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
            scaleX3.scaleY(f16).setDuration(420L).setInterpolator(d53Var).withEndAction(new oe9(this, (byte) 3)).start();
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
            L = gm.L(30.0f);
        }
        linearLayout5.setTranslationY(L);
        qmb qmbVar = this.i0;
        if (i == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        qmbVar.setVisibility(i3);
        qmb qmbVar2 = this.i0;
        if (i == 1) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        qmbVar2.setAlpha(f4);
        qmb qmbVar3 = this.i0;
        if (i == 1) {
            f5 = 1.0f;
        } else {
            f5 = 0.8f;
        }
        qmbVar3.setScaleX(f5);
        qmb qmbVar4 = this.i0;
        if (i == 1) {
            f6 = 1.0f;
        } else {
            f6 = 0.8f;
        }
        qmbVar4.setScaleY(f6);
        qmb qmbVar5 = this.i0;
        if (i == 1) {
            L2 = 0.0f;
        } else {
            L2 = gm.L(30.0f);
        }
        qmbVar5.setTranslationY(L2);
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
        ne9 ne9Var;
        int max3;
        boolean z8;
        boolean z9;
        gkb textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.w()) {
            ff9 ff9Var = this.v0;
            boolean z10 = false;
            if (ff9Var != null) {
                ch9 ch9Var = this.Q;
                int[] D4 = ch9Var.D4();
                if (D4 != null && ch9Var.D3(D4[0], D4[1])) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ff9Var.setSelected(z9);
            }
            boolean H3 = this.Q.H3();
            ch9 ch9Var2 = this.Q;
            if (H3) {
                gkb textSelectionHelper2 = ch9Var2.getTextSelectionHelper();
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
                    ff9 ff9Var2 = (ff9) obj;
                    ff9Var2.setSelected(this.Q.G3(((Integer) ff9Var2.getTag()).intValue(), i, i2, i4, i3, i5));
                }
                if (i2 == i3) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    ne9Var = this.Q.Q4(i, i2);
                } else {
                    ne9Var = null;
                }
                int max4 = Math.max(0, Math.min(i4, i5));
                if (ne9Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i4, i5), ne9Var.length()));
                }
                ff9 ff9Var3 = this.r0;
                if (ff9Var3 != null) {
                    if (ne9Var != null && max4 < max3 && zk9.h(ne9Var.getText(), max4, max3)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    ff9Var3.setSelected(z8);
                }
                ff9 ff9Var4 = this.t0;
                if (ff9Var4 != null) {
                    if (ne9Var != null && max4 < max3 && zk9.g(ne9Var.getText(), max4, max3)) {
                        z10 = true;
                    }
                    ff9Var4.setSelected(z10);
                }
                x0(true);
                y0(z7, this.Q.g2());
            } else if (ch9Var2.s3()) {
                gkb textSelectionHelper3 = this.Q.getTextSelectionHelper();
                ne9 o2 = this.Q.o2(textSelectionHelper3.p0);
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
                    ff9 ff9Var5 = (ff9) obj2;
                    int intValue = ((Integer) ff9Var5.getTag()).intValue();
                    if (o2 != null && max < max2 && (o2.c(max, max2) & intValue) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    ff9Var5.setSelected(z6);
                }
                ff9 ff9Var6 = this.r0;
                if (ff9Var6 != null) {
                    if (o2 != null && max < max2 && zk9.h(o2.getText(), max, max2)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    ff9Var6.setSelected(z5);
                }
                ff9 ff9Var7 = this.t0;
                if (ff9Var7 != null) {
                    if (o2 != null && max < max2 && zk9.g(o2.getText(), max, max2)) {
                        z10 = true;
                    }
                    ff9Var7.setSelected(z10);
                }
                x0(true);
                y0(true, this.Q.g2());
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
                    ff9 ff9Var8 = (ff9) arrayList.get(i14);
                    int intValue2 = ((Integer) ff9Var8.getTag()).intValue();
                    if (z && this.Q.F3(intValue2, i10, i12, i11, i13)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ff9Var8.setSelected(z4);
                    i14 = i15;
                }
                x0(!this.Q.E3());
                ff9 ff9Var9 = this.r0;
                if (ff9Var9 != null) {
                    if (z) {
                        Editable J4 = this.Q.J4(i10, i12, i11, i13);
                        if (J4 == null) {
                            h = false;
                        } else {
                            h = zk9.h(J4, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13));
                        }
                        if (h) {
                            z3 = true;
                            ff9Var9.setSelected(z3);
                        }
                    }
                    z3 = false;
                    ff9Var9.setSelected(z3);
                }
                ff9 ff9Var10 = this.t0;
                if (ff9Var10 != null) {
                    if (z) {
                        Editable J42 = this.Q.J4(i10, i12, i11, i13);
                        if (J42 == null) {
                            g = false;
                        } else {
                            g = zk9.g(J42, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13));
                        }
                        if (g) {
                            z2 = true;
                            ff9Var10.setSelected(z2);
                        }
                    }
                    z2 = false;
                    ff9Var10.setSelected(z2);
                }
                if (z && i10 == i11) {
                    z10 = true;
                }
                y0(z10, this.Q.g2());
            }
        }
    }

    public final void E0() {
        boolean z;
        float f;
        boolean m2 = this.Q.m2();
        of9 of9Var = this.Q.R3;
        if (of9Var != null && !of9Var.c.isEmpty()) {
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

    public final void F0() {
        boolean z;
        int i = 0;
        if (!oc7.r1(this.currentAccount).x4() && !z8c.h(this.currentAccount).p()) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ff9) obj).setPremiumLocked(z);
        }
    }

    public final void G0() {
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
        wi8.s(animate, f, 150L);
    }

    public final ff9 Z(int i, int i2, boolean z) {
        int i3;
        ff9 ff9Var = new ff9(i, getResourceProvider(), this.f0.getContext());
        if (z) {
            ff9Var.d();
            this.O.add(ff9Var);
        }
        ff9Var.setTag(Integer.valueOf(i2));
        ff9Var.setContentDescription(d0(i2));
        this.g0.add(ff9Var);
        LinearLayout linearLayout = this.f0;
        if (linearLayout.getChildCount() == 0) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        linearLayout.addView(ff9Var, qoe.t(38, 38, 16, i3, 0, 0, 0));
        return ff9Var;
    }

    public final void a0(Context context, int i, int i2, boolean z) {
        int i3;
        ff9 ff9Var = new ff9(i, getResourceProvider(), context);
        if (z) {
            ff9Var.d();
            this.O.add(ff9Var);
        }
        ff9Var.setTag(Integer.valueOf(i2));
        ff9Var.setContentDescription(f0(i2));
        ff9Var.setOnClickListener(new v0(this, i2, (byte) 21));
        this.m0.add(ff9Var);
        LinearLayout linearLayout = this.j0;
        if (linearLayout.getChildCount() > 0) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        linearLayout.addView(ff9Var, qoe.t(38, 38, 16, i3, 0, 0, 0));
    }

    public final void b0(boolean z) {
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
        ofFloat.addUpdateListener(new qe9(this, (byte) 0));
        this.Q0.setInterpolator(d53.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void c0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        e34 e34Var = this.B0;
        if (e34Var != null && (layoutParams = (FrameLayout.LayoutParams) e34Var.getLayoutParams()) != null) {
            int g0 = g0();
            bf9 bf9Var = this.P;
            if (bf9Var == null) {
                max = g0();
            } else {
                max = Math.max(g0(), ((bf9Var.getMeasuredHeight() - this.P.getPaddingTop()) - gm.L(240.0f)) - this.U0);
            }
            int round = Math.round(((max - g0) * this.R0) + g0);
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
        this.P = new bf9(this, context);
        setHasOwnBackground(true);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.P.setDefaultFocusHighlightEnabled(false);
        }
        this.F0 = oc7.c1().getInt("kbd_height", gm.L(200.0f));
        this.G0 = oc7.c1().getInt("kbd_height_land3", gm.L(200.0f));
        ?? obj = new Object();
        this.I0 = obj;
        this.P.r.add(obj);
        ch9 ch9Var = new ch9(context, this.currentAccount, getResourceProvider(), new cf9(this, (byte) 0));
        this.Q = ch9Var;
        ch9Var.setFileRefParentObject(this.r);
        this.P.addView(this.Q, qoe.e(-1, -1, 119));
        this.P.addView(this.Q.getOverlayView(), qoe.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            ch9 ch9Var2 = this.Q;
            ArrayList arrayList2 = ch9Var2.t3;
            ch9Var2.s3 = richMessage;
            ch9.S2(arrayList2, richMessage.blocks, ch9Var2.u3);
            ch9Var2.S3();
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                ch9Var2.w4((ll0) arrayList2.get(i4));
            }
            ch9Var2.g3.O(false);
        } else {
            String str = this.f;
            if (str != null) {
                ch9 ch9Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = ch9Var3.u3;
                ArrayList arrayList3 = ch9Var3.t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    ch9.S2(arrayList3, hi9.b(charSequence), hashMap);
                }
                arrayList3.addAll(ch9Var3.x4(jh9.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    ch9.S2(arrayList3, hi9.b(charSequence2), hashMap);
                }
                ch9Var3.S3();
                ch9Var3.g3.O(false);
            } else {
                Editable editable = this.a;
                if (editable != null) {
                    this.Q.setInitialText(editable);
                }
            }
        }
        of9 of9Var = this.Q.R3;
        if (of9Var != null) {
            of9Var.j();
        }
        View view = new View(context);
        this.R = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i5 = cmb.c6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i5), cmb.p1(0.0f, getThemedColor(i5))}));
        this.P.addView(this.R, qoe.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{cmb.p1(0.0f, getThemedColor(i5)), getThemedColor(i5)}));
        this.P.addView(this.S, qoe.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, qoe.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(2131231244);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i5);
        int themedColor2 = getThemedColor(i5);
        int i6 = cmb.h6;
        imageView3.setBackground(new if9(cmb.Z(themedColor, cmb.v(themedColor2, getThemedColor(i6)), gm.L(22.0f), gm.L(22.0f))));
        ImageView imageView4 = this.U;
        int i7 = cmb.F6;
        ylb resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView4, i7, resourceProvider, mode);
        rve.a(this.U);
        this.U.setContentDescription(jb6.M0(2131754878, null));
        this.U.setOnClickListener(new pe9(this, (byte) 1));
        this.T.addView(this.U, qoe.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i5))));
        this.T.addView(this.V, qoe.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(2131231603);
        this.W.setScaleType(scaleType);
        anb.R(this.W, cmb.f0(getThemedColor(i6), 1, -1), null, anb.M(i6), getResourceProvider());
        anb.s(this.W, i7, getResourceProvider(), mode);
        rve.a(this.W);
        this.W.setContentDescription(jb6.M0(2131743574, null));
        this.W.setOnClickListener(new pe9(this, (byte) 2));
        this.V.addView(this.W, qoe.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(2131231586);
        this.X.setScaleType(scaleType);
        anb.R(this.X, cmb.f0(getThemedColor(i6), 1, -1), null, anb.M(i6), getResourceProvider());
        anb.s(this.X, i7, getResourceProvider(), mode);
        rve.a(this.X);
        this.X.setContentDescription(jb6.M0(2131746075, null));
        this.X.setOnClickListener(new pe9(this, (byte) 3));
        this.V.addView(this.X, qoe.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, qoe.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.a0.setClipToPadding(false);
        this.Z.addView(this.a0, qoe.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.b0.setClipChildren(false);
        this.b0.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        this.a0.addView(this.b0, qoe.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.a0.addView(frameLayout4, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.d0 = imageView7;
        imageView7.setImageDrawable(new hd(context));
        this.d0.setScaleType(scaleType);
        anb.s(this.d0, i7, getResourceProvider(), mode);
        this.d0.setBackground(new if9(cmb.Z(getThemedColor(i5), cmb.v(getThemedColor(i5), getThemedColor(i6)), gm.L(22.0f), gm.L(22.0f))));
        this.b0.addView(this.d0, qoe.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        rve.a(this.d0);
        this.d0.setContentDescription(jb6.M0(2131755006, null));
        this.d0.setOnClickListener(new pe9(this, (byte) 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i5))));
        frameLayout5.addView(frameLayout6, qoe.e(-2, 44, 81));
        df9 df9Var = new df9(context, (byte) 0);
        this.e0 = df9Var;
        df9Var.setClipToOutline(true);
        this.e0.setOutlineProvider(new xj((byte) 14));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f0 = linearLayout3;
        linearLayout3.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        this.f0.setOrientation(0);
        this.e0.addView(this.f0);
        frameLayout6.addView(this.e0, qoe.c(-1.0f, -1));
        d02 d02Var = new d02(context, 24);
        this.c0 = d02Var;
        d02Var.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
        anb.s(this.c0, i7, getResourceProvider(), mode);
        anb.R(this.c0, cmb.Z(getThemedColor(i5), getThemedColor(i6), gm.L(20.0f), gm.L(20.0f)), anb.M(i5), anb.M(i6), getResourceProvider());
        this.c0.j(b02.e, false);
        this.f0.addView(this.c0, qoe.r(38, 38, 16));
        rve.a(this.c0);
        this.c0.setContentDescription(jb6.M0(2131754884, null));
        this.c0.setOnClickListener(new pe9(this, (byte) 5));
        Z(2131231600, 1, false).setOnClickListener(new r39(this, context, (byte) 3));
        Z(2131231572, 2, true).setOnClickListener(new pe9(this, (byte) 6));
        Z(2131231589, 4, true).setOnClickListener(new pe9(this, (byte) 7));
        Z(2131231574, 7, true).setOnClickListener(new pe9(this, (byte) 8));
        ImageView imageView8 = new ImageView(context);
        this.h0 = imageView8;
        imageView8.setImageResource(2131232506);
        this.h0.setScaleType(scaleType);
        anb.s(this.h0, i7, getResourceProvider(), mode);
        anb.R(this.h0, cmb.Z(getThemedColor(i5), getThemedColor(i6), gm.L(20.0f), gm.L(20.0f)), anb.M(i5), anb.M(i6), getResourceProvider());
        this.f0.addView(this.h0, qoe.t(38, 38, 16, 2, 0, 0, 0));
        rve.a(this.h0);
        this.h0.setContentDescription(jb6.M0(2131754921, null));
        this.h0.setOnClickListener(new pe9(this, (byte) 9));
        this.b0.addView(frameLayout5, qoe.l(1.0f, 0, 44));
        qmb qmbVar = new qmb((byte) 13, context, this);
        this.i0 = qmbVar;
        qmbVar.setOrientation(0);
        this.i0.setClipToPadding(false);
        this.i0.setClipChildren(false);
        this.i0.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        this.Z.addView(this.i0, qoe.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.w0.setClipToPadding(false);
        this.w0.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        this.Z.addView(this.w0, qoe.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.x0 = imageView9;
        imageView9.f(2131624043, gm.L(16.0f), gm.L(16.0f), null);
        p09 animatedDrawable = this.x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.F(0);
            animatedDrawable.K(0);
        }
        this.x0.setScaleType(scaleType);
        anb.s(this.x0, i7, getResourceProvider(), mode);
        this.x0.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i5))));
        this.w0.addView(this.x0, qoe.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i5))));
        this.i0.addView(frameLayout8, qoe.c(44.0f, -2));
        ef9 ef9Var = new ef9(this, context);
        this.k0 = ef9Var;
        ef9Var.setHorizontalScrollBarEnabled(false);
        this.k0.setClipToOutline(true);
        this.k0.setOutlineProvider(new xj((byte) 15));
        frameLayout8.addView(this.k0, qoe.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.j0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.j0.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        this.k0.addView(this.j0, new FrameLayout.LayoutParams(-2, -1));
        a0(context, 2131231203, 1, false);
        a0(context, 2131231205, 2, false);
        a0(context, 2131231211, 16, false);
        a0(context, 2131231210, 8, false);
        a0(context, 2131231209, 256, false);
        a0(context, 2131231556, 4, false);
        a0(context, 2131231206, 65536, true);
        a0(context, 2131231587, 16384, true);
        a0(context, 2131231588, 32768, true);
        ff9 ff9Var = new ff9(2131231585, getResourceProvider(), context);
        this.v0 = ff9Var;
        ff9Var.setContentDescription(jb6.M0(2131746173, null));
        this.v0.setOnClickListener(new pe9(this, (byte) 11));
        LinearLayout linearLayout5 = this.j0;
        ff9 ff9Var2 = this.v0;
        if (linearLayout5.getChildCount() > 0) {
            i = 2;
        } else {
            i = 0;
        }
        linearLayout5.addView(ff9Var2, qoe.t(38, 38, 16, i, 0, 0, 0));
        ff9 ff9Var3 = new ff9(2131231553, getResourceProvider(), context);
        this.s0 = ff9Var3;
        ff9Var3.setContentDescription(jb6.M0(2131745744, null));
        this.s0.setOnClickListener(new pe9(this, (byte) 12));
        LinearLayout linearLayout6 = this.j0;
        ff9 ff9Var4 = this.s0;
        if (linearLayout6.getChildCount() > 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        linearLayout6.addView(ff9Var4, qoe.t(38, 38, 16, i2, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.o0.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        this.o0.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i5))));
        this.i0.addView(this.o0, qoe.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ff9 ff9Var5 = new ff9(2131231750, getResourceProvider(), context);
        this.r0 = ff9Var5;
        ff9Var5.setContentDescription(jb6.M0(2131751681, null));
        this.r0.setOnClickListener(new pe9(this, (byte) 13));
        this.o0.addView(this.r0, qoe.r(38, 38, 16));
        ff9 ff9Var6 = new ff9(2131232083, getResourceProvider(), context);
        this.t0 = ff9Var6;
        ff9Var6.setContentDescription(jb6.M0(2131754861, null));
        this.t0.setOnClickListener(new pe9(this, (byte) 14));
        this.o0.addView(this.t0, qoe.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.p0.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        this.p0.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i5))));
        this.i0.addView(this.p0, qoe.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ff9 ff9Var7 = new ff9(2131231574, getResourceProvider(), context);
        this.u0 = ff9Var7;
        ff9Var7.d();
        arrayList.add(this.u0);
        this.u0.setContentDescription(jb6.M0(2131754863, null));
        this.u0.setOnClickListener(new pe9(this, (byte) 15));
        this.p0.addView(this.u0, qoe.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.n0.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        this.n0.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i5))));
        this.i0.addView(this.n0, 0, qoe.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        ff9 ff9Var8 = new ff9(0, getResourceProvider(), context);
        this.q0 = ff9Var8;
        ff9Var8.setImageDrawable(new hd(context));
        this.q0.setContentDescription(jb6.M0(2131755006, null));
        this.q0.setOnClickListener(new pe9(this, (byte) 16));
        this.n0.addView(this.q0, qoe.r(38, 38, 16));
        if (this.r != null) {
            i3 = 2131231506;
        } else if (i0()) {
            i3 = 2131231516;
        } else {
            i3 = 2131232711;
        }
        vi3 vi3Var = new vi3(this, context, i3, getResourceProvider());
        this.z0 = vi3Var;
        vi3Var.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(cmb.Oe))));
        rve.a(this.z0);
        this.b0.addView(this.z0, qoe.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.z0.setContentDescription(jb6.M0(2131745374, null));
        this.z0.setOnClickListener(new pe9(this, (byte) 0));
        this.z0.setOnLongClickListener(new au(this, (byte) 13));
        vi3 vi3Var2 = this.z0;
        if (vi3Var2 != null) {
            vi3Var2.setLocked(j0());
        }
        this.P.setPadding(0, gm.m, 0, 0);
        e0();
        C0(0, false);
        E0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new i82(this, (byte) 2));
        F0();
        if (this.e) {
            this.Q.y2();
            this.e = false;
        }
        bf9 bf9Var = this.P;
        this.fragmentView = bf9Var;
        return bf9Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.j5) {
            vi3 vi3Var = this.z0;
            if (vi3Var != null) {
                vi3Var.setLocked(j0());
            }
            F0();
        }
    }

    public final void e0() {
        FrameLayout.LayoutParams layoutParams;
        e34 e34Var = this.B0;
        if (e34Var != null && (layoutParams = (FrameLayout.LayoutParams) e34Var.getLayoutParams()) != null) {
            int i = layoutParams.bottomMargin;
            int i2 = this.U0;
            if (i != i2) {
                layoutParams.bottomMargin = i2;
                this.B0.setLayoutParams(layoutParams);
            }
        }
        c0();
        int max = Math.max(Math.max(this.E0, this.U0), this.V0);
        this.Q.setPadding(0, gm.L(60.0f), 0, gm.L(110.0f) + max);
        ch9 ch9Var = this.Q;
        int i3 = this.U0;
        int i4 = this.V0;
        int i5 = this.E0;
        ch9Var.W3 = i3;
        ch9Var.X3 = i4;
        ch9Var.Y3 = i5;
        int i6 = -max;
        this.Z.setTranslationY(i6);
        this.S.setTranslationY(i6 + this.U0);
    }

    public final int g0() {
        int i;
        Point point = gm.q;
        if (point.x > point.y) {
            i = this.G0;
        } else {
            i = this.F0;
        }
        if (i <= 0) {
            return gm.L(200.0f);
        }
        return i;
    }

    public final void h0(boolean z) {
        if (this.D0) {
            this.D0 = false;
            e34 e34Var = this.B0;
            if (e34Var != null) {
                e34Var.r(false);
                this.B0.y();
            }
        }
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q0 = null;
        }
        this.R0 = 0.0f;
        this.S0 = null;
        e34 e34Var2 = this.B0;
        if (e34Var2 != null) {
            e34Var2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            e0();
        }
        d02 d02Var = this.c0;
        if (d02Var != null) {
            d02Var.j(b02.e, z);
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final boolean i0() {
        yv1 yv1Var;
        if (this.r == null && (yv1Var = this.K) != null && yv1Var.X7()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ch9 ch9Var = this.Q;
        if (ch9Var != null && ch9Var.v3.w()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final boolean j0() {
        if (!oc7.r1(this.currentAccount).x4() && !z8c.h(this.currentAccount).p()) {
            ch9 ch9Var = this.Q;
            if (hi9.d(ch9Var.t3, ch9Var.u3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void k0(Context context, View view) {
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
        bu5 bu5Var = this.y0;
        if (bu5Var != null) {
            bu5Var.u();
            this.y0 = null;
        }
        if (!oc7.r1(this.currentAccount).x4() && !z8c.h(this.currentAccount).p()) {
            z = true;
        } else {
            z = false;
        }
        final ll0 M2 = this.Q.M2();
        final bu5 J = bu5.J(this, view);
        J.T = true;
        bu5 K = J.K();
        K.b(2131231244, jb6.M0(2131753721, null), new bo1(J, (byte) 9), false);
        K.j();
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        K.i(z2, 2131231563, null, jb6.M0(2131753995, null), new Runnable(this) {
            public final jf9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        return;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        return;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        return;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        return;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        return;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gda.S0 + 2);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        K.i(z3, 2131231564, null, jb6.M0(2131753994, null), new Runnable(this) {
            public final jf9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        return;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        return;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        return;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        return;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        return;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gda.S0 + 1);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading3)) {
            z4 = true;
        } else {
            z4 = false;
        }
        K.i(z4, 2131231565, null, jb6.M0(2131753993, null), new Runnable(this) {
            public final jf9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        return;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        return;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        return;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        return;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        return;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gda.S0);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading4)) {
            z5 = true;
        } else {
            z5 = false;
        }
        K.i(z5, 2131231566, null, jb6.M0(2131753992, null), new Runnable(this) {
            public final jf9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        return;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        return;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        return;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        return;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        return;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gda.S0 - 1);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading5)) {
            z6 = true;
        } else {
            z6 = false;
        }
        K.i(z6, 2131231567, null, jb6.M0(2131753991, null), new Runnable(this) {
            public final jf9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        return;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        return;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        return;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        return;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        return;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gda.S0 - 2);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockHeading6)) {
            z7 = true;
        } else {
            z7 = false;
        }
        K.i(z7, 2131231568, null, jb6.M0(2131753990, null), new Runnable(this) {
            public final jf9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r4;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        return;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        return;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        return;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        return;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        return;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        return;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gda.S0 - 3);
        if (M2 != null && ch9.y3(M2.b)) {
            z8 = true;
        } else {
            z8 = false;
        }
        hf9 hf9Var = new hf9(context, 2131231562);
        hf9Var.a(z);
        int i = cmb.F8;
        hf9Var.d = i;
        J.i(z8, 0, hf9Var, jb6.M0(2131753996, null), new c20(J, K, (byte) 8));
        J.z().a.setTypeface(gm.o());
        a8 z14 = J.z();
        float f6 = 9.0f;
        if (jb6.a0) {
            f = 18.0f;
        } else {
            f = 9.0f;
        }
        int L = gm.L(f);
        if (jb6.a0) {
            f2 = 9.0f;
        } else {
            f2 = 18.0f;
        }
        z14.setPadding(L, 0, gm.L(f2), 0);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockParagraph)) {
            z9 = true;
        } else {
            z9 = false;
        }
        J.i(z9, 2131231601, null, jb6.M0(2131753953, null), new te9(this, M2, (byte) 3));
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockBlockquote)) {
            z10 = true;
        } else {
            z10 = false;
        }
        J.i(z10, 2131231585, null, jb6.M0(2131753961, null), new te9(this, M2, (byte) 4));
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockPullquote)) {
            z11 = true;
        } else {
            z11 = false;
        }
        hf9 hf9Var2 = new hf9(context, 2131231584);
        hf9Var2.a(z);
        hf9Var2.d = i;
        J.i(z11, 0, hf9Var2, jb6.M0(2131753962, null), new te9(this, M2, (byte) 0));
        a8 z15 = J.z();
        if (jb6.a0) {
            f3 = 18.0f;
        } else {
            f3 = 9.0f;
        }
        int L2 = gm.L(f3);
        if (jb6.a0) {
            f4 = 9.0f;
        } else {
            f4 = 18.0f;
        }
        z15.setPadding(L2, 0, gm.L(f4), 0);
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockPreformatted)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.i(z12, 2131231556, null, jb6.M0(2131754020, null), new te9(this, M2, (byte) 1));
        if (M2 != null && (M2.b instanceof TL_iv.pageBlockFooter)) {
            z13 = true;
        } else {
            z13 = false;
        }
        hf9 hf9Var3 = new hf9(context, 2131231559);
        hf9Var3.a(z);
        hf9Var3.d = i;
        J.i(z13, 0, hf9Var3, jb6.M0(2131753997, null), new te9(this, M2, (byte) 2));
        a8 z16 = J.z();
        if (jb6.a0) {
            f5 = 18.0f;
        } else {
            f5 = 9.0f;
        }
        int L3 = gm.L(f5);
        if (!jb6.a0) {
            f6 = 18.0f;
        }
        z16.setPadding(L3, 0, gm.L(f6), 0);
        J.a0();
        this.y0 = J;
    }

    public final void l0() {
        qg9 qg9Var = this.Q.v3;
        if (qg9Var != null && qg9Var.w()) {
            o0();
            return;
        }
        new gd9(this.currentAccount, getResourceProvider(), new ci7(this, (byte) 29), getParentActivity()).show();
    }

    public final void m0(k47 k47Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j, k47 k47Var2, k47 k47Var3, nv1 nv1Var, boolean z, int i, int i2, l3a l3aVar, long j2) {
        int i3 = this.currentAccount;
        if (k47Var != null) {
            j5 a = j5.a(i3);
            yv1 yv1Var = this.K;
            mp3 mp3Var = a6a.J;
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
                a6a.j(pageBlock2, identityHashMap);
            }
            a6a.B(a.a).u(k47Var, richMessage, arrayList4, yv1Var, false);
            return;
        }
        a6a.Q(j5.a(i3), arrayList, arrayList2, arrayList3, arrayList4, j, k47Var2, k47Var3, nv1Var, z, i, i2, l3aVar, 0L, j2, 0L);
    }

    public final void n0() {
        if (!z8c.h(this.currentAccount).p()) {
            showDialog(new kj8((d) this, 43, true));
        }
    }

    public final void o0() {
        tg9 c2 = this.Q.c2();
        if (c2 != null) {
            TL_iv.RichMessage a = c2.a();
            if (a.blocks.isEmpty()) {
                return;
            }
            a1 a1Var = new a1(getParentActivity(), getResourceProvider());
            a1Var.n1(a);
            a1Var.f2 = new mf2(c2, (byte) 20);
            a1Var.show();
        }
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 21) {
                if (intent != null && intent.getData() != null) {
                    ch9 ch9Var = this.Q;
                    Uri data = intent.getData();
                    if (data == null) {
                        ch9Var.getClass();
                        return;
                    } else if (ch9Var.getContext() != null) {
                        Utilities.e.c(new ey8(ch9Var, data, (byte) 21));
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
                e34 e34Var = this.B0;
                if (e34Var != null) {
                    e34Var.r(false);
                    this.B0.y();
                }
                b0(false);
                return false;
            }
        } else if (this.C0) {
            h0(true);
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
            s0();
            this.W0 = true;
        }
        if (!gm.O1() && this.s != null && this.w != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            va2 va2Var = this.s;
            this.y = va2Var.n;
            va2Var.e = false;
            va2Var.invalidate();
            this.w.setAlpha(0.0f);
            this.w.q2.setVisibility(4);
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
            ofFloat.addUpdateListener(new qe9(this, (byte) 1));
            ofFloat.addListener(new ic8(this, runnable, (byte) 9));
            FrameLayout frameLayout = this.T;
            if (!z) {
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.T;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -gm.L(16.0f)), ObjectAnimator.ofFloat(this.a0, property, 0.0f), ObjectAnimator.ofFloat(this.a0, property2, gm.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, property, 1.0f, 0.0f));
            } else {
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout, property3, 0.0f, 1.0f);
                FrameLayout frameLayout3 = this.T;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout3, property4, -gm.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.a0, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a0, property4, gm.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(d53.h);
            this.P.post(new pu(animatorSet, (byte) 1));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.j5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        se9 se9Var;
        nm7.f(this.currentAccount).n(this, nm7.j5);
        if (!this.W0) {
            s0();
            this.W0 = true;
        }
        ve9 ve9Var = this.O0;
        if (ve9Var != null) {
            this.O0 = null;
            gm.c3(ve9Var);
        }
        j67 j67Var = this.P0;
        if (j67Var != null) {
            j67Var.g();
            this.P0 = null;
        }
        ch9 ch9Var = this.Q;
        if (ch9Var != null) {
            ch9Var.C2();
        }
        pr2 pr2Var = this.A0;
        if (pr2Var != null) {
            pr2Var.m();
        }
        super.onFragmentDestroy();
        e34 e34Var = this.B0;
        if (e34Var != null) {
            e34Var.z();
        }
        bf9 bf9Var = this.P;
        if (bf9Var != null && (se9Var = this.I0) != null) {
            bf9Var.r.remove(se9Var);
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.U0 = i4;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
        layoutParams.height = gm.L(68.0f) + this.U0;
        this.S.setLayoutParams(layoutParams);
        e0();
    }

    @Override
    public final wzc onInsetsInternal(View view, wzc wzcVar) {
        boolean z;
        bu5 bu5Var;
        iq5 f = wzcVar.a.f(3);
        int i = wzcVar.a.f(8).d;
        this.V0 = i;
        int i2 = i - f.d;
        boolean z2 = this.H0;
        if (i2 > gm.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        this.H0 = z;
        if (z && i2 > gm.L(50.0f) && !gm.E && !gm.O1()) {
            Point point = gm.q;
            if (point.x > point.y) {
                this.G0 = i2;
                oc7.c1().edit().putInt("kbd_height_land3", this.G0).commit();
            } else {
                this.F0 = i2;
                oc7.c1().edit().putInt("kbd_height", this.F0).commit();
            }
        }
        if (this.H0 && !z2 && this.C0 && !this.D0) {
            h0(false);
        }
        if (!this.H0 && z2 && (bu5Var = this.y0) != null) {
            bu5Var.u();
            this.y0 = null;
        }
        onInsets(f.a, f.b, f.c, f.d);
        return wzc.b;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i = cmb.c6;
            int themedColor = getThemedColor(i);
            int i2 = cmb.h6;
            int themedColor2 = getThemedColor(i2);
            int i3 = cmb.Oe;
            int themedColor3 = getThemedColor(i3);
            if (!this.a1 || themedColor != this.X0 || themedColor2 != this.Y0 || themedColor3 != this.Z0) {
                this.a1 = true;
                this.X0 = themedColor;
                this.Y0 = themedColor2;
                this.Z0 = themedColor3;
                View view = this.R;
                if (view != null) {
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i), cmb.p1(0.0f, getThemedColor(i))}));
                }
                View view2 = this.S;
                if (view2 != null) {
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, getThemedColor(i)), getThemedColor(i)}));
                }
                ImageView imageView = this.U;
                if (imageView != null) {
                    imageView.setBackground(new if9(cmb.Z(getThemedColor(i), cmb.v(getThemedColor(i), getThemedColor(i2)), gm.L(22.0f), gm.L(22.0f))));
                }
                LinearLayout linearLayout = this.V;
                if (linearLayout != null) {
                    linearLayout.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i))));
                }
                ImageView imageView2 = this.d0;
                if (imageView2 != null) {
                    imageView2.setBackground(new if9(cmb.Z(getThemedColor(i), cmb.v(getThemedColor(i), getThemedColor(i2)), gm.L(22.0f), gm.L(22.0f))));
                }
                s09 s09Var = this.x0;
                if (s09Var != null) {
                    s09Var.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i))));
                }
                LinearLayout linearLayout2 = this.o0;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i))));
                }
                LinearLayout linearLayout3 = this.p0;
                if (linearLayout3 != null) {
                    linearLayout3.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i))));
                }
                LinearLayout linearLayout4 = this.n0;
                if (linearLayout4 != null) {
                    linearLayout4.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i))));
                }
                vi3 vi3Var = this.z0;
                if (vi3Var != null) {
                    vi3Var.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i3))));
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        ch9 ch9Var;
        int i;
        ch9 ch9Var2;
        super.onTransitionAnimationStart(z, z2);
        if (z && !z2 && (i = this.c) >= 0 && (ch9Var2 = this.Q) != null) {
            int i2 = this.d;
            this.d = -1;
            this.c = -1;
            if (!ch9Var2.U1(i, i2)) {
                ch9Var2.post(new wf9(ch9Var2, i, i2, (byte) 0));
            }
        } else if (z && !z2) {
            if ((this.b != null || this.f != null) && (ch9Var = this.Q) != null && !ch9Var.W2()) {
                ch9Var.post(new b82(ch9Var, (byte) 5));
            }
        }
    }

    public final boolean p0(View view) {
        int i;
        yv1 yv1Var = this.K;
        if (yv1Var != null && this.r == null && !yv1Var.X7() && this.Q.g3() && !this.Q.i3()) {
            if (!this.Q.I3()) {
                G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> V2 = this.Q.V2();
            if (!V2.isEmpty()) {
                j67 j67Var = this.P0;
                if (j67Var != null) {
                    j67Var.f(false);
                    this.P0 = null;
                }
                j67 j67Var2 = new j67(getParentActivity(), getResourceProvider());
                this.P0 = j67Var2;
                j67Var2.setOnDismissListener(new qj8(this, (byte) 4));
                long a = this.K.a();
                k47 k47Var = this.K.F5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = oc7.r1(this.currentAccount).x1(a);
                tL_message.from_id = oc7.r1(this.currentAccount).x1(z8c.h(this.currentAccount).e());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = V2;
                richMessage.photos = this.Q.x2();
                tL_message.rich_message.documents = this.Q.u2();
                if (k47Var != null && !k47Var.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = k47Var.e1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                k47 k47Var2 = new k47(this.currentAccount, tL_message, false, false);
                if (k47Var != null && !k47Var.p) {
                    k47Var2.C = k47Var;
                }
                k47Var2.B0 = true;
                k47Var2.W2 = Boolean.TRUE;
                k47Var2.n0(null);
                k47Var2.w1 = true;
                this.P0.r(td4.u(k47Var2));
                this.z0.setScaleX(1.0f);
                this.z0.setScaleY(1.0f);
                xz1 s = this.P0.s(this.z0, true, new pe9(this, (byte) 10));
                if (s != null) {
                    s.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(cmb.Ei))));
                    j67 j67Var3 = this.P0;
                    int L = gm.L(44.0f);
                    j67Var3.p0 = true;
                    j67Var3.Y = L;
                }
                bu5 I = bu5.I(this, this.z0);
                boolean D = m9c.D(this.K.h());
                if (this.K.M4()) {
                    if (D) {
                        i = 2131745248;
                    } else {
                        i = 2131745593;
                    }
                    I.b(2131232083, jb6.M0(i, null), new fu(this, a, (byte) 28), false);
                    if (!D && a > 0) {
                        I.b(2131232270, jb6.M0(2131745320, null), new oe9(this, (byte) 5), false);
                    }
                }
                if (!D) {
                    I.b(2131231513, jb6.M0(2131745317, null), new oe9(this, (byte) 6), false);
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

    public final void q0(int i, int i2) {
        ch9 ch9Var = this.Q;
        ch9Var.k4 = ch9Var.M2();
        i22 i22Var = new i22(getParentActivity(), this, false, false, true, getResourceProvider());
        i22Var.W3 = new ye9(this, i22Var);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
        chatAttachAlertPhotoLayout.setIncludeVideosInGallery(true);
        chatAttachAlertPhotoLayout.h0();
        i22Var.t1(1, true);
        i22Var.P0(i);
        i22Var.t4 = new xe9(this, i22Var);
        i22Var.S1 = new xe9(this, i22Var);
        i22Var.R1 = new ze9(this, i22Var);
        i22Var.Z0();
        if (i2 != 0) {
            i22Var.j1(i2);
        }
        i22Var.v0(true);
        i22Var.show();
    }

    public final boolean s0() {
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
        ms1 ms1Var = this.K.a0;
        if (e2 != null && !this.N) {
            ch9 ch9Var = this.Q;
            if (ch9Var.g3() && !hi9.d(ch9Var.t3, ch9Var.u3) && ms1Var != null) {
                SpannableStringBuilder g = hi9.g(this.Q.t3);
                yv1 yv1Var = ms1Var.F3;
                if (ms1Var.F0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g);
                gw3.m(spannableStringBuilder, ms1Var.F0.getPaint().getFontMetricsInt(), false, null, 0);
                gn[] gnVarArr = (gn[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gn.class);
                if (gnVarArr != null) {
                    for (gn gnVar : gnVarArr) {
                        gnVar.applyFontMetrics(ms1Var.F0.getPaint().getFontMetricsInt(), vm.f());
                    }
                }
                f09.a(spannableStringBuilder);
                if (yv1Var != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    hs6.d0(ms1Var.R).T1(yv1Var.a(), yv1Var.O5(yv1Var.F5), charSequenceArr[0], hs6.d0(ms1Var.R).Y(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                ms1Var.setRichDraftPreview(null);
                if (ms1Var.F0.getText() != null) {
                    ms1Var.F0.getText().clear();
                }
                ms1Var.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        hs6 mediaDataController = getMediaDataController();
        long a = this.K.a();
        yv1 yv1Var2 = this.K;
        mediaDataController.T1(a, yv1Var2.O5(yv1Var2.F5), "", null, null, null, null, 0L, false, false, e2);
        TL_iv.RichMessage richMessage = e2;
        if (ms1Var == null) {
            return true;
        }
        ms1Var.setRichDraftPreview(richMessage);
        return true;
    }

    public final ne9 t0() {
        ne9 focusedEditTextOrNull = this.Q.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            this.S0 = focusedEditTextOrNull;
            this.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        ne9 ne9Var = this.S0;
        if (ne9Var != null) {
            return ne9Var;
        }
        return this.Q.L2();
    }

    public final int u0(ne9 ne9Var) {
        if (ne9Var == this.S0 && this.Q.getFocusedEditTextOrNull() != ne9Var) {
            return Math.min(this.T0, ne9Var.length());
        }
        return Math.max(0, ne9Var.getSelectionEnd());
    }

    public final void v0() {
        if (j0()) {
            Activity parentActivity = getParentActivity();
            ch9 ch9Var = this.Q;
            Objects.requireNonNull(ch9Var);
            r0(getResourceProvider(), parentActivity, new b82(ch9Var, (byte) 0), new oe9(this, (byte) 4));
        } else if (i0()) {
            ik.J(getParentActivity(), this.K.a(), new et8(this, (byte) 5), getResourceProvider());
        } else {
            w0(0, 0, true);
        }
    }

    public final void w0(final int i, final int i2, final boolean z) {
        ms1 ms1Var;
        uz1 uz1Var;
        if (j0()) {
            Activity parentActivity = getParentActivity();
            ch9 ch9Var = this.Q;
            Objects.requireNonNull(ch9Var);
            r0(getResourceProvider(), parentActivity, new b82(ch9Var, (byte) 0), new oe9(this, (byte) 4));
        } else if (this.K != null && this.Q.g3() && !this.Q.i3()) {
            if (!this.Q.I3()) {
                G0();
            } else if (!oc7.r1(this.currentAccount).x4()) {
                ms1 ms1Var2 = this.K.a0;
                if (ms1Var2 != null) {
                    this.N = true;
                    Runnable runnable = this.L;
                    if (runnable != null) {
                        runnable.run();
                    }
                    ms1Var2.v1(hi9.g(this.Q.t3), z, i, i2);
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
                final ArrayList a = gi9.a(this.currentAccount, V2);
                final long a2 = this.K.a();
                yv1 yv1Var = this.K;
                final k47 k47Var = yv1Var.F5;
                final k47 k47Var2 = yv1Var.m4;
                final nv1 nv1Var = yv1Var.D5;
                final long k7 = yv1Var.k7();
                final l3a X6 = this.K.X6();
                final k47 k47Var3 = this.r;
                ?? r0 = new Runnable() {
                    @Override
                    public final void run() {
                        jf9.this.m0(k47Var3, V2, x2, u2, a, a2, k47Var, k47Var2, nv1Var, z, i, i2, X6, k7);
                    }
                };
                Runnable runnable2 = this.L;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (k47Var3 == null && (ms1Var = this.K.a0) != null && (uz1Var = ms1Var.P3) != null) {
                    uz1Var.w(null, z, i, i2, 0L);
                }
                if (i != 0 && k47Var3 == null) {
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
            ff9 ff9Var = (ff9) obj;
            if (((Integer) ff9Var.getTag()).intValue() == 1) {
                ff9Var.setEnabled(z);
            }
        }
    }

    public final void y0(boolean z, boolean z2) {
        ff9 ff9Var = this.r0;
        if (ff9Var != null) {
            ff9Var.setEnabled(z);
        }
        ff9 ff9Var2 = this.s0;
        if (ff9Var2 != null) {
            ff9Var2.setEnabled(z2);
        }
        ff9 ff9Var3 = this.t0;
        if (ff9Var3 != null) {
            ff9Var3.setEnabled(z);
        }
        ff9 ff9Var4 = this.u0;
        if (ff9Var4 != null) {
            ff9Var4.setEnabled(z);
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
            s09 s09Var = this.x0;
            if (z2) {
                s09Var.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(d53.h).start();
            } else {
                s09Var.animate().cancel();
                this.x0.setScaleX(f);
                this.x0.setScaleY(f);
            }
            s09 s09Var2 = this.x0;
            if (z) {
                i = cmb.p7;
            } else {
                i = cmb.F6;
            }
            anb.s(s09Var2, i, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            p09 animatedDrawable = this.x0.getAnimatedDrawable();
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

    public jf9(String str) {
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
        this.N0 = new oe9(this, (byte) 0);
        this.f = str;
    }

    public jf9(TL_iv.RichMessage richMessage) {
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
        this.N0 = new oe9(this, (byte) 0);
        this.b = richMessage;
    }
}
