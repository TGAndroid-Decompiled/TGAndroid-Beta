package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.p;
public class qmb extends d implements sp3, gk7 {
    public FrameLayout A0;
    public float A1;
    public FrameLayout B0;
    public hmb B1;
    public ke5 C0;
    public hmb C1;
    public AnimatorSet D0;
    public Object D1;
    public final int E;
    public tb0 E0;
    public Bitmap E1;
    public final int F;
    public qlb F0;
    public boolean F1;
    public final int G;
    public qlb G0;
    public boolean G1;
    public final int H;
    public ImageView H0;
    public boolean H1;
    public final int I;
    public ImageView I0;
    public String I1;
    public final boolean J;
    public AnimatorSet J0;
    public int J1;
    public final long K;
    public AnimatorSet K0;
    public pmb K1;
    public final long L;
    public rqc[] L0;
    public long L1;
    public final long M;
    public rqc[] M0;
    public boolean M1;
    public final long N;
    public final FrameLayout[] N0;
    public boolean N1;
    public final float O;
    public final TextView[] O0;
    public boolean O1;
    public final String P;
    public final TextView[] P0;
    public oy8 P1;
    public final int Q;
    public final FrameLayout[] Q0;
    public r7 Q1;
    public long R;
    public rkb R0;
    public ValueAnimator R1;
    public c25 S;
    public omb S0;
    public jo0 S1;
    public final njb T;
    public t26 T0;
    public plb T1;
    public final njb U;
    public ld5 U0;
    public final ns4 U1;
    public final njb V;
    public ty0 V0;
    public boolean V1;
    public final njb W;
    public ArrayList W0;
    public boolean W1;
    public p X;
    public final HashMap X0;
    public TL_stories.TL_premium_boostsStatus X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public int Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final slb a;
    public final Runnable a0;
    public TLRPC.TL_wallPaper a1;
    public float a2;
    public final byte b;
    public boolean b0;
    public int b1;
    public float b2;
    public Scroller c;
    public s71 c0;
    public int c1;
    public boolean c2;
    public final boolean d;
    public FrameLayout d0;
    public int d1;
    public int d2;
    public w42 e;
    public TextView e0;
    public int e1;
    public ValueAnimator e2;
    public r7 f;
    public TextView f0;
    public int f1;
    public boolean f2;
    public final akb g0;
    public int g1;
    public TextView g2;
    public TextView h;
    public final boolean h0;
    public int h1;
    public WeakReference h2;
    public final boolean i0;
    public int i1;
    public BitmapDrawable i2;
    public final boolean j0;
    public int j1;
    public xg1 j2;
    public ArrayList k0;
    public int k1;
    public float k2;
    public gec l0;
    public int l1;
    public ValueAnimator l2;
    public gw9 m0;
    public int m1;
    public int n;
    public UndoView n0;
    public float n1;
    public FrameLayout o0;
    public float o1;
    public o39 p0;
    public float p1;
    public s20 q0;
    public float q1;
    public Drawable r;
    public un4 r0;
    public imb r1;
    public int s;
    public k27 s0;
    public cm2 s1;
    public boolean t0;
    public AnimatorSet t1;
    public a u0;
    public final PorterDuff.Mode u1;
    public k7 v0;
    public int v1;
    public final zjb w;
    public nlb w0;
    public sd0 w1;
    public boolean x;
    public mmb x0;
    public brc x1;
    public final int y;
    public final gmb[] y0;
    public Bitmap y1;
    public gmb z0;
    public Bitmap z1;

    public qmb(akb akbVar, boolean z, int i, boolean z2, boolean z3) {
        super(null);
        zjb i2;
        this.a = new slb(this);
        this.d = true;
        this.n = 1;
        njb njbVar = new njb(this, 0, false);
        this.T = njbVar;
        njb njbVar2 = new njb(this, 0, true);
        this.U = njbVar2;
        njb njbVar3 = new njb(this, 1, false);
        this.V = njbVar3;
        njb njbVar4 = new njb(this, 1, true);
        this.W = njbVar4;
        this.Z = -1;
        this.a0 = new flb(this, (byte) 0);
        this.y0 = new gmb[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.n1 = 0.5f;
        this.p1 = 0.0f;
        this.u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new ns4(getParentActivity(), new ln8(this, (byte) 20));
        this.V1 = false;
        this.W1 = false;
        this.b = i;
        this.h0 = z3;
        this.g0 = akbVar;
        this.j0 = z;
        this.i0 = z2;
        if (i == 1) {
            i2 = akbVar.i(!z2);
            this.w = i2;
            if (i2 != null) {
                this.d = false;
                this.y = i2.c;
                this.E = i2.d;
                this.F = i2.e;
                this.G = i2.f;
                this.H = i2.g;
                this.I = i2.h;
                this.J = i2.i;
                this.K = i2.j;
                this.L = i2.k;
                this.M = i2.l;
                this.N = i2.m;
                this.O = i2.p;
                this.P = i2.o;
                this.Q = i2.n;
            }
        } else {
            if (i == 0) {
                this.d = false;
            }
            i2 = akbVar.i(false);
            this.w = i2;
            if (i2 != null) {
                this.Y0 = i2.s;
            }
        }
        if (i2 != null) {
            this.G1 = i2.q;
            if (!TextUtils.isEmpty(i2.o)) {
                this.n1 = i2.p;
            }
            bkb.M = bkb.B0();
            bkb.O = true;
            bkb.P = true;
            bkb.t(akbVar, false, false);
        }
        kk7.e().k(kk7.w4, new Object[0]);
        njbVar.v = true;
        njbVar3.v = true;
        njbVar2.v = true;
        njbVar4.v = true;
    }

    @Override
    public final void B(boolean z) {
        n1();
    }

    public final void M0() {
        AnimatorSet animatorSet = this.D0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.D0 = animatorSet2;
        boolean z = this.G1;
        gmb gmbVar = this.z0;
        if (z) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(gmbVar, View.SCALE_X, this.A1), ObjectAnimator.ofFloat(this.z0, View.SCALE_Y, this.A1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(gmbVar, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.z0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.z0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.z0, View.TRANSLATION_Y, 0.0f));
        }
        this.D0.setInterpolator(s33.g);
        this.D0.addListener(new vlb(this, (byte) 1));
        this.D0.start();
    }

    @Override
    public final void N(String str) {
        n1();
    }

    public final void N0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmb.N0(boolean):void");
    }

    public final void O0(boolean z) {
        byte b = this.b;
        if (b == 2) {
            if (!z) {
                finishFragment();
                return;
            }
            return;
        }
        bkb.o();
        kk7.e().n(this, kk7.B4);
        zjb zjbVar = this.w;
        if (b == 1) {
            if (this.i0) {
                zjbVar.c = this.y;
                zjbVar.d = this.E;
                zjbVar.e = this.F;
                zjbVar.f = this.G;
                zjbVar.g = this.H;
                zjbVar.h = this.I;
                zjbVar.i = this.J;
                zjbVar.j = this.K;
                zjbVar.k = this.L;
                zjbVar.l = this.M;
                zjbVar.m = this.N;
                zjbVar.n = this.Q;
                zjbVar.o = this.P;
                zjbVar.p = this.O;
            }
            bkb.x1(this.g0, false, true, false, false, false);
        } else {
            if (zjbVar != null) {
                bkb.x1(this.g0, false, this.j0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).W(false, false);
            if (this.j0) {
                akb akbVar = this.g0;
                if (akbVar.b != null && bkb.H.get(akbVar.k()) == null) {
                    new File(akbVar.b).delete();
                }
            }
        }
        if (!z) {
            finishFragment();
        }
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.h2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.i2;
        }
        WeakReference weakReference2 = this.h2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.h2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.h2 = new WeakReference(drawable);
            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, 24);
            ColorFilter colorFilter = drawable.getColorFilter();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.3f);
            gl.l2(colorMatrix, 0.94f);
            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            drawable.draw(new Canvas(createBitmap));
            drawable.setColorFilter(colorFilter);
            Utilities.blurBitmap(createBitmap, 3);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
            this.i2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.i2;
        }
        this.i2 = null;
        return null;
    }

    public final boolean Q0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmb.Q0(boolean):boolean");
    }

    public final void R0() {
        int themedColor;
        w42 w42Var = this.e;
        int i = 0;
        if (w42Var != null) {
            w42Var.I(getThemedColor(bkb.F8));
            this.e.O(getThemedColor(bkb.D8), false);
        }
        if (this.r != null && (themedColor = getThemedColor(bkb.c6)) != this.s) {
            this.s = themedColor;
            this.r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        tb0 tb0Var = this.E0;
        if (tb0Var != null) {
            tb0Var.invalidate();
        }
        if (this.r1 != null) {
            ui5 ui5Var = this.parentLayout;
            if (ui5Var != null && ui5Var.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().L(getThemedColor(bkb.g5));
                if (this.b == 2 && this.L1 != 0) {
                    this.parentLayout.getBottomSheet().x0(-16777216);
                }
            } else {
                setNavigationBarColor(getThemedColor(bkb.g5));
            }
        }
        if (this.L0 != null) {
            int i2 = 0;
            while (true) {
                rqc[] rqcVarArr = this.L0;
                if (i2 >= rqcVarArr.length) {
                    break;
                }
                rqc rqcVar = rqcVarArr[i2];
                if (rqcVar != null) {
                    rqcVar.invalidate();
                }
                i2++;
            }
        }
        if (this.M0 != null) {
            while (true) {
                rqc[] rqcVarArr2 = this.M0;
                if (i >= rqcVarArr2.length) {
                    break;
                }
                rqc rqcVar2 = rqcVarArr2[i];
                if (rqcVar2 != null) {
                    rqcVar2.invalidate();
                }
                i++;
            }
        }
        TextView textView = this.g2;
        if (textView != null) {
            zkb.X(textView, bkb.F6, this.a);
        }
        p pVar = this.X;
        if (pVar != null) {
            pVar.invalidate();
        }
        un4 un4Var = this.r0;
        if (un4Var != null) {
            un4Var.updateColors();
        }
    }

    public final int S0() {
        if (hc2.U(this.currentAccount, -this.L1)) {
            return getMessagesController().k4.g2.f();
        }
        return getMessagesController().k4.Y1.f();
    }

    public final ArrayList T0() {
        t00 t00Var = new t00(this, (byte) 22);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.l0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
        arrayList.add(new blb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.B8));
        arrayList.add(new blb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C8));
        arrayList.add(new blb(this.u0, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.F8));
        arrayList.add(new blb(this.u0, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.D8));
        p pVar = this.X;
        if (pVar != null) {
            r7 r7Var = pVar.J;
            EditTextBoldCursor[] editTextBoldCursorArr = pVar.F;
            for (int i = 0; i < editTextBoldCursorArr.length; i++) {
                arrayList.add(new blb(editTextBoldCursorArr[i], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.K6));
                arrayList.add(new blb(editTextBoldCursorArr[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
                arrayList.add(new blb(editTextBoldCursorArr[i], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
            }
            arrayList.add(new blb(pVar.G, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.H5));
            if (r7Var != null) {
                t00 t00Var2 = new t00(pVar, (byte) 5);
                arrayList.add(new blb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var2, bkb.F6));
                arrayList.add(new blb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var2, bkb.D8));
                arrayList.add(new blb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var2, bkb.E8));
                arrayList.add(new blb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var2, bkb.F8));
            }
        }
        FrameLayout[] frameLayoutArr = this.N0;
        if (frameLayoutArr != null) {
            for (int i2 = 0; i2 < frameLayoutArr.length; i2++) {
            }
            for (int i3 = 0; i3 < this.Q0.length; i3++) {
            }
            for (int i4 = 0; i4 < this.P0.length; i4++) {
            }
            for (int i5 = 0; i5 < this.O0.length; i5++) {
            }
            njb njbVar = this.T;
            njb njbVar2 = this.V;
            arrayList.add(new blb(this.w0, 0, new Class[]{gb2.class}, (Paint) null, new Drawable[]{njbVar, njbVar2}, (alb) null, bkb.tb));
            arrayList.add(new blb(this.w0, 0, new Class[]{gb2.class}, (Paint) null, new Drawable[]{njbVar, njbVar2}, (alb) null, bkb.ub));
            arrayList.add(new blb(this.w0, 0, new Class[]{gb2.class}, (Paint) null, new Drawable[]{njbVar, njbVar2}, (alb) null, bkb.vb));
            arrayList.add(new blb(this.w0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Md));
            arrayList.add(new blb(this.w0, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Sb));
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((blb) arrayList.get(i6)).n = this.a;
        }
        return arrayList;
    }

    public final boolean U0(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmb.U0(int):boolean");
    }

    public boolean V0() {
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ui5Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void W0() {
        float f;
        jo0 jo0Var = this.S1;
        if (jo0Var != null) {
            jo0Var.invalidate();
        }
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0.getChildAt(i).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.B0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                this.B0.getChildAt(i2).invalidate();
            }
        }
        if (this.L0 != null) {
            int i3 = 0;
            while (true) {
                rqc[] rqcVarArr = this.L0;
                if (i3 >= rqcVarArr.length) {
                    break;
                }
                rqc rqcVar = rqcVarArr[i3];
                if (rqcVar != null) {
                    if (this.O1) {
                        f = this.p1 * this.q1;
                    } else {
                        f = 0.0f;
                    }
                    rqcVar.setDimAmount(f);
                    this.L0[i3].invalidate();
                }
                i3++;
            }
        }
        if (this.p0 != null) {
            for (int i4 = 0; i4 < this.p0.getChildCount(); i4++) {
                View childAt = this.p0.getChildAt(i4);
                if (childAt instanceof uk1) {
                    h1((uk1) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.w0 != null) {
            for (int i5 = 0; i5 < this.w0.getChildCount(); i5++) {
                View childAt2 = this.w0.getChildAt(i5);
                if (childAt2 instanceof uk1) {
                    h1((uk1) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        hmb hmbVar = this.B1;
        if (hmbVar != null) {
            hmbVar.invalidate();
        }
        hmb hmbVar2 = this.C1;
        if (hmbVar2 != null) {
            hmbVar2.invalidate();
        }
        tb0 tb0Var = this.E0;
        if (tb0Var != null) {
            tb0Var.invalidate();
        }
    }

    public final void X0(ng1 ng1Var) {
        if (getParentActivity() == null) {
            return;
        }
        h26 h26Var = new h26(23, this.currentAccount, this.a, getParentActivity(), this);
        h26Var.r1(ng1Var);
        h26Var.q1(this.X1, true);
        h26Var.s1(this.L1);
        if (!V0()) {
            h26Var.L2 = new flb(this, (byte) 1);
        }
        showDialog(h26Var);
    }

    public final void Y0() {
        zjb i;
        akb akbVar = bkb.M;
        if (akbVar == null) {
            return;
        }
        int i2 = akbVar.a0;
        if (i2 >= 0) {
            i = (zjb) akbVar.b0.get(i2);
        } else {
            i = akbVar.i(false);
        }
        if (this.w != null) {
            a1();
            bkb.x1(this.g0, true, false, false, false, false);
            if (bkb.M != null) {
                bkb.O = false;
                bkb.P = false;
                bkb.M = null;
            }
            bkb.t(this.g0, true, this.h0);
            ((ActionBarLayout) this.parentLayout).W(false, false);
        } else {
            ((ActionBarLayout) this.parentLayout).W(false, false);
            File file = new File(this.g0.b);
            akb akbVar2 = this.g0;
            bkb.u(file, akbVar2.a, akbVar2.G, false);
            na7.q1(this.g0.F).A4(this.g0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", this.g0.k());
            edit.commit();
        }
        d dVar = (d) getParentLayout().getFragmentStack().get(Math.max(0, getParentLayout().getFragmentStack().size() - 2));
        finishFragment();
        if (this.b == 0) {
            kk7.e().k(kk7.r4, akbVar, i, Boolean.valueOf(this.j0));
        }
        bkb.K1(dVar);
    }

    public final void Z0(TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        boolean z = tLObject instanceof TL_account.TL_wallPapers;
        zjb zjbVar = this.w;
        if (z) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            this.W0.clear();
            HashMap hashMap = this.X0;
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                if (tL_wallPapers.wallpapers.get(i) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            this.W0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (zjbVar != null && (str = zjbVar.o) != null && str.equals(tL_wallPaper2.slug)) {
                            this.Y0 = tL_wallPaper2;
                            f1(false);
                            n1();
                        } else if (zjbVar == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = this.Y0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z2 = true;
                    }
                }
            }
            if (!z2 && (tL_wallPaper = this.Y0) != null) {
                this.W0.add(0, tL_wallPaper);
            }
            omb ombVar = this.S0;
            if (ombVar != null) {
                ombVar.f();
            }
            ad7.Y(this.currentAccount).m1(1, tL_wallPapers.wallpapers);
        }
        if (this.Y0 == null && zjbVar != null && !TextUtils.isEmpty(zjbVar.o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = zjbVar.o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(getConnectionsManager().sendRequest(getwallpaper, new llb(this, (byte) 0)), this.classGuid);
        }
    }

    public final void a1() {
        TLRPC.TL_wallPaper tL_wallPaper;
        zjb zjbVar = this.w;
        if (zjbVar != null && !TextUtils.isEmpty(zjbVar.o) && (tL_wallPaper = this.Y0) != null && tL_wallPaper.document != null) {
            try {
                ba4.G(this.currentAccount);
                zqc.e(ng5.c(zjbVar.o), new c4b(ba4.J(this.Y0.document, null, true, true), (byte) 3));
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.h5));
        hashSet.add(Integer.valueOf(bkb.g5));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.dc));
        hashSet.add(Integer.valueOf(bkb.ee));
        hashSet.add(Integer.valueOf(bkb.ic));
        hashSet.add(Integer.valueOf(bkb.de));
        hashSet.add(Integer.valueOf(bkb.Vb));
        hashSet.add(Integer.valueOf(bkb.Qd));
        hashSet.add(Integer.valueOf(bkb.Tb));
        hashSet.add(Integer.valueOf(bkb.Od));
        hashSet.add(Integer.valueOf(bkb.Qb));
        hashSet.add(Integer.valueOf(bkb.Kd));
        hashSet.add(Integer.valueOf(bkb.id));
        hashSet.add(Integer.valueOf(bkb.Cb));
        hashSet.add(Integer.valueOf(bkb.Bb));
        hashSet.add(Integer.valueOf(bkb.Ab));
        hashSet.add(Integer.valueOf(bkb.zb));
        hashSet.add(Integer.valueOf(bkb.Vc));
        hashSet.add(Integer.valueOf(bkb.Uc));
        hashSet.add(Integer.valueOf(bkb.sb));
        hashSet.add(Integer.valueOf(bkb.rb));
        hashSet.add(Integer.valueOf(bkb.qb));
        hashSet.add(Integer.valueOf(bkb.sa));
        hashSet.add(Integer.valueOf(bkb.Tc));
        hashSet.add(Integer.valueOf(bkb.qa));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.Lj));
        hashSet.add(Integer.valueOf(bkb.Jj));
        hashSet.add(Integer.valueOf(bkb.Ie));
        hashSet.add(Integer.valueOf(bkb.Je));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.A8));
    }

    public final void b1() {
        c1(2, true);
    }

    public final void c1(int i, boolean z) {
        zjb zjbVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (getParentActivity() != null && this.n != i && this.t1 == null && (zjbVar = this.w) != null) {
            if (z && i == 2 && (bkb.a1() || zjbVar.j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131752538, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                if (bkb.a1() && (!bkb.a1() || bkb.I.j0.d == 0)) {
                    hdVar.U = k96.M0(2131752517, null);
                    alertDialog$Builder.j(k96.M0(2131752540, null), new hlb(this, (byte) 7));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                } else {
                    hdVar.U = k96.M0(2131752537, null);
                    alertDialog$Builder.j(k96.M0(2131745925, null), new hlb(this, (byte) 5));
                    alertDialog$Builder.g(k96.M0(2131751759, null), new hlb(this, (byte) 6));
                }
                showDialog(hdVar);
                return;
            }
            int i9 = this.n;
            this.n = i;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.h.setText(k96.M0(2131752002, null));
                        if (zjbVar.f != 0) {
                            if (zjbVar.h != 0) {
                                i8 = 4;
                            } else if (zjbVar.g != 0) {
                                i8 = 3;
                            } else {
                                i8 = 2;
                            }
                        } else {
                            i8 = 1;
                        }
                        p pVar = this.X;
                        U0(3);
                        pVar.f(2, 4, i8, true);
                        this.X.e(zjbVar.h, 3);
                        this.X.e(zjbVar.g, 2);
                        this.X.e(zjbVar.f, 1);
                        p pVar2 = this.X;
                        int i10 = zjbVar.e;
                        if (i10 == 0) {
                            i10 = zjbVar.c;
                        }
                        pVar2.e(i10, 0);
                        this.M0[1].b(0, zjbVar.e);
                        this.M0[1].b(1, zjbVar.f);
                        this.M0[1].b(2, zjbVar.g);
                        this.M0[1].b(3, zjbVar.h);
                        if (zjbVar.g != 0) {
                            mmb mmbVar = this.x0;
                            if (i9 == 1) {
                                mmbVar.i(0);
                            } else {
                                mmbVar.g(0);
                            }
                        } else if (i9 == 2) {
                            this.x0.r(0);
                        }
                        this.w0.x0(0, gl.L(60.0f), null);
                        i1();
                    }
                    i2 = i9;
                } else {
                    this.h.setText(k96.M0(2131752004, null));
                    int themedColor = getThemedColor(bkb.De);
                    int i11 = bkb.Ee;
                    if (bkb.d1(i11)) {
                        i4 = getThemedColor(i11);
                    } else {
                        i4 = 0;
                    }
                    int i12 = bkb.Fe;
                    if (bkb.d1(i12)) {
                        i5 = getThemedColor(i12);
                    } else {
                        i5 = 0;
                    }
                    int i13 = bkb.Ge;
                    if (bkb.d1(i13)) {
                        i6 = getThemedColor(i13);
                    } else {
                        i6 = 0;
                    }
                    long j = zjbVar.k;
                    int i14 = (int) j;
                    if (i14 == 0 && j != 0) {
                        i4 = 0;
                    }
                    long j2 = zjbVar.l;
                    int i15 = (int) j2;
                    if (i15 == 0 && j2 != 0) {
                        i5 = 0;
                    }
                    long j3 = zjbVar.m;
                    int i16 = (int) j3;
                    if (i16 == 0 && j3 != 0) {
                        i6 = 0;
                    }
                    int i17 = (int) zjbVar.j;
                    if (i14 == 0 && i4 == 0) {
                        i7 = 1;
                    } else if (i16 == 0 && i6 == 0) {
                        if (i15 == 0 && i5 == 0) {
                            i7 = 2;
                        } else {
                            i7 = 3;
                        }
                    } else {
                        i7 = 4;
                    }
                    p pVar3 = this.X;
                    U0(2);
                    pVar3.f(2, 4, i7, false);
                    p pVar4 = this.X;
                    if (i16 == 0) {
                        i16 = i6;
                    }
                    pVar4.e(i16, 3);
                    p pVar5 = this.X;
                    if (i15 == 0) {
                        i15 = i5;
                    }
                    pVar5.e(i15, 2);
                    p pVar6 = this.X;
                    if (i14 == 0) {
                        i14 = i4;
                    }
                    pVar6.e(i14, 1);
                    p pVar7 = this.X;
                    if (i17 != 0) {
                        themedColor = i17;
                    }
                    pVar7.e(themedColor, 0);
                    i2 = i9;
                    if (i2 != 1 && zjbVar.g != 0) {
                        this.x0.g(0);
                    } else {
                        this.x0.i(0);
                    }
                    this.w0.x0(0, gl.L(60.0f), null);
                }
            } else {
                i2 = i9;
                this.h.setText(k96.M0(2131752003, null));
                if (zjbVar.d != 0) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                p pVar8 = this.X;
                U0(1);
                pVar8.f(1, 2, i3, false);
                this.X.e(zjbVar.c, 0);
                int i18 = zjbVar.d;
                if (i18 != 0) {
                    this.X.e(i18, 1);
                }
                if (i2 == 2 || (i2 == 3 && zjbVar.g != 0)) {
                    this.x0.r(0);
                }
            }
            if (i != 1 && i != 3) {
                this.X.setMinBrightness(0.0f);
                this.X.setMaxBrightness(1.0f);
                return;
            }
            if (i2 == 2 && this.N0[1].getVisibility() == 0) {
                j1(0, true, true);
            }
            if (i == 1) {
                boolean o = this.g0.o();
                p pVar9 = this.X;
                if (o) {
                    pVar9.setMinBrightness(0.2f);
                    return;
                }
                pVar9.setMinBrightness(0.05f);
                this.X.setMaxBrightness(0.8f);
                return;
            }
            this.X.setMinBrightness(0.0f);
            this.X.setMaxBrightness(1.0f);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r51) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmb.createView(android.content.Context):android.view.View");
    }

    public final void d1(int i) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i >= 0 && i < this.W0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.W0.get(i);
        } else {
            tL_wallPaper = this.a1;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.e2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.e2.cancel();
        }
        gmb[] gmbVarArr = this.y0;
        gmb gmbVar = gmbVarArr[0];
        gmb gmbVar2 = gmbVarArr[1];
        gmbVarArr[0] = gmbVar2;
        gmbVarArr[1] = gmbVar;
        this.v0.removeView(gmbVar2);
        this.v0.addView(gmbVarArr[0], this.v0.indexOfChild(gmbVarArr[1]) + 1);
        gmb gmbVar3 = gmbVarArr[0];
        this.z0 = gmbVar3;
        gmbVar3.setBackground(gmbVarArr[1].getBackground());
        this.z0.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
        q1(false);
        o1();
        gmbVarArr[1].setVisibility(0);
        gmbVarArr[1].setAlpha(1.0f);
        this.z0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e2 = ofFloat;
        ofFloat.addUpdateListener(new ae0(this, (byte) 15));
        this.e2.addListener(new vlb(this, (byte) 0));
        this.e2.setInterpolator(s33.f);
        this.e2.setDuration(300L);
        this.e2.start();
        this.z0.getImageReceiver().t1 = (short) 300;
        this.z0.getImageReceiver().Z(gl5.b(tL_wallPaper2.document), this.I1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.z0.e();
        this.Y0 = tL_wallPaper2;
        this.G1 = this.L0[2].s;
        n1();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i == kk7.q3) {
            if (this.L1 == ((Long) objArr[2]).longValue()) {
                this.X1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                l1(true);
            }
        } else if (i == kk7.k4) {
            o39 o39Var = this.p0;
            if (o39Var != null) {
                int childCount = o39Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.p0.getChildAt(i3);
                    if (childAt instanceof ue3) {
                        ((ue3) childAt).k0(0, true);
                    }
                }
            }
        } else if (i == kk7.l4) {
            nlb nlbVar = this.w0;
            if (nlbVar != null) {
                nlbVar.h1();
            }
        } else if (i == kk7.B4) {
            if (this.v0 != null) {
                f1(true);
            }
        } else if (i == kk7.h4) {
            Object obj = this.D1;
            if (obj instanceof lrc) {
                lrc lrcVar = (lrc) obj;
                if (lrcVar.a == null) {
                    lrcVar.a = (String) objArr[0];
                }
            }
        } else {
            long j = 0;
            if (i == kk7.g4) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.W0.clear();
                HashMap hashMap = this.X0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z = false;
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i4);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            this.W0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.id), wallPaper);
                        }
                        zjb zjbVar = this.w;
                        if (zjbVar != null && (str = zjbVar.o) != null && str.equals(wallPaper.slug)) {
                            this.Y0 = (TLRPC.TL_wallPaper) wallPaper;
                            f1(false);
                            n1();
                        } else if (zjbVar == null) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
                            if (tL_wallPaper2 != null) {
                                String str2 = tL_wallPaper2.slug;
                                if (str2 != null) {
                                    if (!str2.equals(wallPaper.slug)) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                }
                if (!z && (tL_wallPaper = this.Y0) != null) {
                    this.W0.add(0, tL_wallPaper);
                }
                omb ombVar = this.S0;
                if (ombVar != null) {
                    ombVar.f();
                }
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i5);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j = hq6.r(j, wallPaper2.id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new llb(this, (byte) 1)), this.classGuid);
            } else if (i == kk7.w5 && this.L1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1(int i, int i2, boolean z) {
        ye7 ye7Var;
        if (i2 == 0) {
            this.b1 = i;
        } else if (i2 == 1) {
            this.d1 = i;
        } else if (i2 == 2) {
            this.e1 = i;
        } else if (i2 == 3) {
            this.f1 = i;
        }
        q1(z);
        if (this.L0 != null) {
            int i3 = 0;
            while (true) {
                rqc[] rqcVarArr = this.L0;
                if (i3 >= rqcVarArr.length) {
                    break;
                }
                rqc rqcVar = rqcVarArr[i3];
                if (rqcVar != null) {
                    rqcVar.b(i2, i);
                }
                i3++;
            }
        }
        if (this.e1 != 0) {
            if (this.V0 != null && bkb.I.o()) {
                this.V0.setTwoSided(true);
            }
            Drawable background = this.z0.getBackground();
            if (background instanceof ye7) {
                ye7Var = (ye7) background;
            } else {
                ye7Var = new ye7();
                ye7Var.p(this.z0);
                if (this.F1) {
                    ye7Var.m(false);
                }
            }
            ye7 ye7Var2 = ye7Var;
            ye7Var2.n(true, this.b1, this.d1, this.e1, this.f1);
            this.z0.setBackground(ye7Var2);
            this.l1 = ye7Var2.f();
            this.m1 = 754974720;
        } else if (this.d1 != 0) {
            this.z0.setBackground(new GradientDrawable(wd0.c(this.j1), new int[]{this.b1, this.d1}));
            int U0 = gl.U0(gl.w0(this.b1, this.d1), false);
            this.m1 = U0;
            this.l1 = U0;
        } else {
            this.z0.setBackgroundColor(this.b1);
            int U02 = gl.U0(this.b1, false);
            this.m1 = U02;
            this.l1 = U02;
        }
        int i4 = bkb.bd;
        boolean d1 = bkb.d1(i4);
        slb slbVar = this.a;
        if (d1 && !(this.z0.getBackground() instanceof ye7)) {
            if (bkb.s0() instanceof ye7) {
                getThemedColor(i4);
                slbVar.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
            }
        } else {
            slbVar.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        }
        ImageView imageView = this.H0;
        if (imageView != null) {
            zkb.s(imageView, bkb.Yc, slbVar, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.I0;
        if (imageView2 != null) {
            zkb.s(imageView2, bkb.Yc, slbVar, PorterDuff.Mode.MULTIPLY);
        }
        gmb gmbVar = this.z0;
        if (gmbVar != null) {
            gmbVar.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
            this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
            this.z0.invalidate();
            if (bkb.I.o() && (this.z0.getBackground() instanceof ye7)) {
                ty0 ty0Var = this.V0;
                if (ty0Var != null) {
                    ty0Var.setTwoSided(true);
                }
                if (this.n1 < 0.0f) {
                    this.z0.getImageReceiver().W(((ye7) this.z0.getBackground()).k);
                }
            } else {
                this.z0.getImageReceiver().W(null);
                ty0 ty0Var2 = this.V0;
                if (ty0Var2 != null) {
                    ty0Var2.setTwoSided(false);
                }
            }
            ty0 ty0Var3 = this.V0;
            if (ty0Var3 != null) {
                ty0Var3.setProgress(this.n1);
            }
        }
        nlb nlbVar = this.w0;
        if (nlbVar != null) {
            nlbVar.h1();
        }
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                this.A0.getChildAt(i5).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.B0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                this.B0.getChildAt(i6).invalidate();
            }
        }
    }

    public final void f1(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmb.f1(boolean):void");
    }

    public final void g1(long j) {
        boolean z;
        this.L1 = j;
        if (j != 0 && j != getUserConfig().e()) {
            z = false;
        } else {
            z = true;
        }
        this.M1 = z;
    }

    @Override
    public final int getObserverTag() {
        return this.v1;
    }

    @Override
    public final wjb getResourceProvider() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.N1) {
            return T0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(uk1 uk1Var) {
        slb slbVar;
        float f;
        if (this.z0 == null) {
            return;
        }
        Bitmap bitmap = this.a.i;
        float f2 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f = ((this.z0.getMeasuredWidth() - (Math.max(this.z0.getMeasuredWidth() / width, this.z0.getMeasuredHeight() / slbVar.i.getHeight()) * width)) / 2.0f) + this.Z1 + 0.0f;
        } else {
            f = this.Z1 + 0.0f;
        }
        float y = uk1Var.getY() - ((-this.z0.K) + 0.0f);
        int measuredHeight = this.z0.getMeasuredHeight();
        if (this.O1) {
            f2 = this.p1 * this.q1;
        }
        uk1Var.x0 = true;
        uk1Var.w0 = measuredHeight;
        uk1Var.u0 = y;
        uk1Var.v0 = f;
        uk1Var.h2 = f2;
        uk1Var.i2.setColor(bm2.o(-16777216, (int) (f2 * 255.0f)));
        uk1Var.invalidate();
    }

    public final void i1() {
        if (this.v0 != null && this.M0 != null && this.w.g != 0) {
            SharedPreferences c1 = na7.c1();
            if (!c1.getBoolean("bganimationhint", false)) {
                if (this.C0 == null) {
                    ke5 ke5Var = new ke5(getParentActivity(), 8);
                    this.C0 = ke5Var;
                    ke5Var.setShowingDuration(5000L);
                    this.C0.setAlpha(0.0f);
                    this.C0.setVisibility(4);
                    this.C0.setText(k96.M0(2131753748, null));
                    this.C0.setExtraTranslationY(gl.L(6.0f));
                    this.m0.addView(this.C0, nme.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                gl.d3(new a5b(this, c1, (byte) 9), 500L);
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b == 2) {
            if (this.c2 && motionEvent != null) {
                if (motionEvent.getY() > a.getCurrentActionBarHeight() + gl.m) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1(int i, boolean z, boolean z2) {
        boolean z3;
        char c;
        char c2;
        FrameLayout frameLayout;
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        FrameLayout frameLayout2;
        int i4;
        float f7;
        FrameLayout frameLayout3;
        float f8;
        float f9;
        float f10;
        int i5;
        int i6;
        int i7;
        char c3 = 0;
        if (z && i == 1 && this.Y0 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        byte b = this.b;
        if (z) {
            if (i == 0) {
                if (b == 2) {
                    this.c1 = this.b1;
                    int i8 = this.d1;
                    this.g1 = i8;
                    int i9 = this.e1;
                    this.h1 = i9;
                    int i10 = this.f1;
                    this.i1 = i10;
                    this.k1 = this.Q;
                    if (i10 != 0) {
                        i7 = 4;
                    } else if (i9 != 0) {
                        i7 = 3;
                    } else if (i8 != 0) {
                        i7 = 2;
                    } else {
                        i7 = 1;
                    }
                    this.X.f(0, 4, i7, false);
                    this.X.e(this.f1, 3);
                    this.X.e(this.e1, 2);
                    this.X.e(this.d1, 1);
                    this.X.e(this.b1, 0);
                }
            } else {
                this.Z0 = this.Y0;
                this.o1 = this.n1;
                this.S0.f();
                ArrayList arrayList = this.W0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
                    if (tL_wallPaper == null) {
                        i6 = 0;
                    } else {
                        int indexOf = arrayList.indexOf(tL_wallPaper);
                        if (b == 2) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        i6 = indexOf + i5;
                    }
                    this.T0.g1(i6, (this.R0.getMeasuredWidth() - gl.L(124.0f)) / 2);
                }
            }
        }
        if (b == 1 || b == 2) {
            rqc[] rqcVarArr = this.L0;
            if (z3) {
                c = 2;
            } else {
                c = 0;
            }
            rqcVarArr[c].setVisibility(0);
        }
        if (i == 1) {
            ty0 ty0Var = this.V0;
            if (!ty0Var.N) {
                float f11 = this.n1;
                if (f11 < 0.0f) {
                    float f12 = -f11;
                    this.n1 = f12;
                    ty0Var.setProgress(f12);
                }
            }
        }
        int i11 = 58;
        float f13 = 1.0f;
        FrameLayout[] frameLayoutArr = this.N0;
        if (z2) {
            this.t1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (z) {
                frameLayoutArr[i].setVisibility(0);
                if (b == 1) {
                    nlb nlbVar = this.w0;
                    Property property = View.TRANSLATION_Y;
                    if (i == 1) {
                        f8 = -gl.L(21.0f);
                    } else {
                        f8 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(nlbVar, property, f8));
                    rqc rqcVar = this.L0[2];
                    Property property2 = View.ALPHA;
                    if (z3) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(rqcVar, property2, f9));
                    rqc rqcVar2 = this.L0[0];
                    if (z3) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(rqcVar2, property2, f10));
                    if (i == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], property2, 0.0f));
                    }
                    gl.t1(this.X.F[1]);
                } else if (b == 2) {
                    nlb nlbVar2 = this.w0;
                    Property property3 = View.TRANSLATION_Y;
                    int i12 = -frameLayoutArr[i].getMeasuredHeight();
                    if (this.C1 == null) {
                        i11 = 0;
                    }
                    int L = gl.L(i11 + 72) + i12;
                    if (V0()) {
                        i4 = gl.n;
                    } else {
                        i4 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(nlbVar2, property3, L + i4));
                    rqc rqcVar3 = this.L0[2];
                    Property property4 = View.ALPHA;
                    if (z3) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(rqcVar3, property4, f7));
                    rqc rqcVar4 = this.L0[0];
                    if (z3) {
                        f13 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(rqcVar4, property4, f13));
                    if (frameLayoutArr[i3].getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], property4, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], property4, 0.0f, 1.0f));
                        frameLayoutArr[i].setTranslationY(0.0f);
                    } else {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], property3, frameLayout3.getMeasuredHeight(), 0.0f));
                    }
                } else {
                    if (i == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], View.ALPHA, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], View.ALPHA, 0.0f));
                    }
                    gl.t1(this.X.F[1]);
                }
            } else {
                nlb nlbVar3 = this.w0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(nlbVar3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], property5, frameLayout2.getMeasuredHeight()));
                rqc rqcVar5 = this.L0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(rqcVar5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.z0, property6, 1.0f));
            }
            this.t1.playTogether(arrayList2);
            this.t1.addListener(new ylb(this, z, i3, i, z3));
            this.t1.setInterpolator(s33.g);
            this.t1.setDuration(200L);
            this.t1.start();
            return;
        }
        if (i == 0) {
            c2 = 1;
        } else {
            c2 = 0;
        }
        if (z) {
            frameLayoutArr[i].setVisibility(0);
            if (b == 1) {
                nlb nlbVar4 = this.w0;
                if (i == 1) {
                    f4 = -gl.L(21.0f);
                } else {
                    f4 = 0.0f;
                }
                nlbVar4.setTranslationY(f4);
                rqc rqcVar6 = this.L0[2];
                if (z3) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                rqcVar6.setAlpha(f5);
                rqc rqcVar7 = this.L0[0];
                if (z3) {
                    f6 = 0.0f;
                } else {
                    f6 = 1.0f;
                }
                rqcVar7.setAlpha(f6);
                if (i == 1) {
                    frameLayoutArr[i].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i].setAlpha(1.0f);
                    frameLayoutArr[c2].setAlpha(0.0f);
                }
                gl.t1(this.X.F[1]);
            } else if (b == 2) {
                nlb nlbVar5 = this.w0;
                if (i == 0) {
                    f = 343.0f;
                } else {
                    f = 316.0f;
                }
                int i13 = -gl.L(f);
                if (this.C1 == null) {
                    i11 = 0;
                }
                int L2 = gl.L(i11 + 72) + i13;
                if (V0()) {
                    i2 = gl.n;
                } else {
                    i2 = 0;
                }
                nlbVar5.setTranslationY(L2 + i2);
                rqc rqcVar8 = this.L0[2];
                if (z3) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                rqcVar8.setAlpha(f2);
                rqc rqcVar9 = this.L0[0];
                if (z3) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                rqcVar9.setAlpha(f3);
                if (frameLayoutArr[c2].getVisibility() == 0) {
                    frameLayoutArr[c2].setAlpha(0.0f);
                    frameLayoutArr[i].setAlpha(1.0f);
                    frameLayoutArr[i].setTranslationY(0.0f);
                } else {
                    frameLayoutArr[i].setTranslationY(0.0f);
                }
            } else {
                if (i == 1) {
                    frameLayoutArr[i].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i].setAlpha(1.0f);
                    frameLayoutArr[c2].setAlpha(0.0f);
                }
                gl.t1(this.X.F[1]);
            }
        } else {
            this.w0.setTranslationY(0.0f);
            frameLayoutArr[i].setTranslationY(frameLayout.getMeasuredHeight());
            this.L0[0].setAlpha(1.0f);
            this.L0[2].setAlpha(1.0f);
            this.z0.setAlpha(1.0f);
        }
        if (z) {
            if (frameLayoutArr[c2].getVisibility() == 0) {
                frameLayoutArr[c2].setAlpha(1.0f);
                frameLayoutArr[c2].setVisibility(4);
            }
        } else {
            frameLayoutArr[i].setVisibility(4);
        }
        if (b != 1 && b != 2) {
            if (i == 1) {
                frameLayoutArr[c2].setAlpha(0.0f);
                return;
            }
            return;
        }
        rqc[] rqcVarArr2 = this.L0;
        if (!z3) {
            c3 = 2;
        }
        rqcVarArr2[c3].setVisibility(4);
    }

    public final void k1() {
        Window window;
        if (this.j2 != null) {
            return;
        }
        if (V0()) {
            window = this.parentLayout.getBottomSheet().getWindow();
        } else {
            window = getParentActivity().getWindow();
        }
        FrameLayout frameLayout = (FrameLayout) window.getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.Q1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.Q1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.Q1.getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gl.n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        xg1 xg1Var = new xg1(this, getParentActivity(), canvas, (this.Q1.getMeasuredWidth() / 2.0f) + f, (this.Q1.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 2);
        this.j2 = xg1Var;
        xg1Var.setOnTouchListener(new jz1((byte) 28));
        this.k2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l2 = ofFloat;
        ofFloat.addUpdateListener(new yg1(this, (byte) 3));
        this.l2.addListener(new vlb(this, (byte) 4));
        this.l2.setDuration(400L);
        this.l2.setInterpolator(ls3.e);
        this.l2.start();
        frameLayout.addView(this.j2, new ViewGroup.LayoutParams(-1, -1));
        gl.c3(new flb(this, (byte) 2));
    }

    public final void l1(boolean z) {
        int i = (this.L1 > 0L ? 1 : (this.L1 == 0L ? 0 : -1));
        if (i > 0) {
            this.B1.c(k96.M0(2131754209, null));
        } else if (i < 0) {
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-this.L1));
            hmb hmbVar = this.B1;
            if (K0 != null) {
                hmbVar.c(k96.a0(null, null, 2131754210, K0.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < S0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    cm2 cm2Var = this.s1;
                    if (cm2Var == null) {
                        cm2Var = new cm2(2131231980, 0);
                        this.s1 = cm2Var;
                        cm2Var.n = 1;
                    }
                    spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.G(S0(), "ReactionLevelRequiredBtn", new Object[0]));
                    this.B1.b(spannableStringBuilder, z);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.L1 < 0 && !this.V1 && !this.W1 && tL_premium_boostsStatus2 == null) {
                        this.V1 = true;
                        getMessagesController().E0().a(this.L1, new ilb(this, (byte) 1));
                        return;
                    }
                    return;
                }
                this.B1.b(null, z);
                return;
            }
            hmbVar.c(k96.a0(null, null, 2131754210, k96.M0(2131754904, null).toLowerCase()));
        } else {
            this.B1.c(k96.M0(2131754211, null));
        }
    }

    public final void m1() {
        if (this.H1 && this.y1 == null) {
            Bitmap bitmap = this.E1;
            if (bitmap != null) {
                this.z1 = bitmap;
                this.y1 = Utilities.e(bitmap);
            } else {
                ImageReceiver imageReceiver = this.z0.getImageReceiver();
                if (imageReceiver.E() || imageReceiver.n0 != null) {
                    this.z1 = imageReceiver.n();
                    this.y1 = Utilities.e(imageReceiver.n());
                }
            }
        }
        if (this.H1) {
            Bitmap bitmap2 = this.y1;
            if (bitmap2 != null) {
                this.z0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        f1(false);
    }

    public final void n1() {
        long j;
        String str;
        File file;
        float f;
        FrameLayout frameLayout;
        float f2;
        int i;
        Object obj = this.Y0;
        if (obj == null) {
            obj = this.D1;
        }
        if (!(obj instanceof TLRPC.TL_wallPaper)) {
            if (obj instanceof nm6) {
                nm6 nm6Var = (nm6) obj;
                TLRPC.Photo photo = nm6Var.K;
                if (photo != null) {
                    TLRPC.PhotoSize w = ba4.w(photo.sizes, this.J1, true, null, false);
                    ba4.G(this.currentAccount);
                    file = ba4.J(w, null, true, true);
                    str = ba4.r(null, w);
                    i = w.size;
                } else {
                    file = fl5.w(nm6Var.C);
                    str = file.getName();
                    i = nm6Var.G;
                }
                j = i;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            } else {
                return;
            }
        } else {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            String r = ba4.r(null, tL_wallPaper.document);
            if (!TextUtils.isEmpty(r)) {
                ba4.G(this.currentAccount);
                File J = ba4.J(tL_wallPaper.document, null, true, true);
                j = tL_wallPaper.document.size;
                str = r;
                file = J;
            } else {
                return;
            }
        }
        boolean exists = file.exists();
        int i2 = this.currentAccount;
        byte b = this.b;
        if (exists) {
            up3.q(i2).v(this);
            this.z0.invalidate();
            if (b == 2) {
                if (j != 0 && this.L1 == 0) {
                    this.u0.setSubtitle(gl.i0(j, false, false));
                } else {
                    this.u0.setSubtitle(null);
                }
            }
        } else {
            up3.q(i2).a(str, null, this);
            if (b == 2 && this.L1 == 0) {
                this.u0.setSubtitle(k96.M0(2131748586, null));
            }
            this.z0.invalidate();
        }
        float f3 = 0.5f;
        if (this.Y0 == null && (frameLayout = this.A0) != null) {
            if (exists) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            frameLayout.setAlpha(f2);
        }
        if (b == 0) {
            this.e0.setEnabled(exists);
            TextView textView = this.e0;
            if (exists) {
                f3 = 1.0f;
            }
            textView.setAlpha(f3);
        } else if (b == 2) {
            this.E0.setEnabled(exists);
            hmb hmbVar = this.B1;
            if (hmbVar != null) {
                if (exists) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                hmbVar.setAlpha(f);
            }
            hmb hmbVar2 = this.C1;
            if (hmbVar2 != null) {
                if (exists) {
                    f3 = 1.0f;
                }
                hmbVar2.setAlpha(f3);
            }
        } else {
            this.f.setEnabled(exists);
            r7 r7Var = this.f;
            if (exists) {
                f3 = 1.0f;
            }
            r7Var.setAlpha(f3);
        }
    }

    public final void o1() {
        this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
        this.z0.invalidate();
        this.R0.h1();
        if (this.n1 >= 0.0f) {
            this.z0.getImageReceiver().W(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.z0.getImageReceiver().P(null);
            }
            if (this.z0.getBackground() instanceof ye7) {
                this.z0.getImageReceiver().W(((ye7) this.z0.getBackground()).k);
            }
        }
        this.a.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        W0();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!Q0(z)) {
            return false;
        }
        O0(true);
        return super.onBackPressed(z);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ui5Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().L(getThemedColor(bkb.g5));
            if (this.b == 2 && this.L1 != 0) {
                this.parentLayout.getBottomSheet().x0(-16777216);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.q3);
        kk7.e().b(this, kk7.k4);
        kk7.e().b(this, kk7.l4);
        getNotificationCenter().b(this, kk7.w5);
        byte b = this.b;
        if (b == 1 || b == 0) {
            kk7.e().b(this, kk7.B4);
        }
        if (b == 2 || b == 1) {
            bkb.N = true;
        }
        if (b == 0 && this.w == null) {
            this.G1 = bkb.h0;
        } else {
            Point point = gl.q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb = new StringBuilder();
            sb.append((int) (min / gl.p));
            sb.append("_");
            this.I1 = de9.l(sb, (int) (max / gl.p), "_f");
            this.J1 = Math.max(point.x, point.y);
            kk7.e().b(this, kk7.h4);
            kk7.e().b(this, kk7.g4);
            this.v1 = up3.q(this.currentAccount).k();
            if (this.W0 == null) {
                this.W0 = new ArrayList();
                ad7.Y(this.currentAccount).m0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        kk7.f(this.currentAccount).n(this, kk7.q3);
        kk7.e().n(this, kk7.k4);
        kk7.e().n(this, kk7.l4);
        getNotificationCenter().n(this, kk7.w5);
        gw9 gw9Var = this.m0;
        if (gw9Var != null && this.S != null) {
            gw9Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
        }
        byte b = this.b;
        if ((b == 2 || b == 1) && this.r1 == null) {
            gl.c3(new cza((byte) 5));
        }
        int i = kk7.B4;
        if (b == 2) {
            Bitmap bitmap = this.y1;
            if (bitmap != null) {
                bitmap.recycle();
                this.y1 = null;
            }
            this.a.k(null, null, null);
            kk7.e().k(i, new Object[0]);
        } else if (b == 1 || b == 0) {
            kk7.e().n(this, i);
        }
        if (b != 0 || this.w != null) {
            kk7.e().n(this, kk7.h4);
            kk7.e().n(this, kk7.g4);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.G1) {
            this.x1.b(false);
        }
        bkb.b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.q0;
        if (s20Var != null) {
            s20Var.f();
        }
        mmb mmbVar = this.x0;
        if (mmbVar != null) {
            mmbVar.f();
        }
        if (this.G1) {
            this.x1.b(true);
        }
        bkb.b = true;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            R0();
            try {
                gec gecVar = this.l0;
                if (gecVar != null) {
                    gl.w3(gecVar, getThemedColor(bkb.r8));
                }
                ty0 ty0Var = this.V0;
                if (ty0Var != null) {
                    ty0Var.setOuterColor(getThemedColor(bkb.Lj));
                    this.V0.invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (!z && this.b == 2) {
            this.a.k(null, null, null);
            kk7.e().k(kk7.B4, new Object[0]);
        }
    }

    public final void p1() {
        char c;
        float f;
        boolean z;
        boolean z2;
        float f2;
        float f3 = 1.0f;
        float f4 = 0.0f;
        byte b = this.b;
        if (b != 1 && b != 2) {
            boolean isEnabled = this.L0[0].isEnabled();
            TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
            if (tL_wallPaper != null) {
                z = true;
            } else {
                z = false;
            }
            if (isEnabled == z) {
                return;
            }
            if (tL_wallPaper == null) {
                this.L0[0].a(false, true);
            }
            rqc rqcVar = this.L0[0];
            if (this.Y0 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            rqcVar.setEnabled(z2);
            if (this.Y0 != null) {
                this.L0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int L = (gl.L(9.0f) + ((FrameLayout.LayoutParams) this.L0[1].getLayoutParams()).width) / 2;
            rqc rqcVar2 = this.L0[0];
            Property property = View.ALPHA;
            if (this.Y0 == null) {
                f3 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(rqcVar2, property, f3));
            rqc rqcVar3 = this.L0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.Y0 != null) {
                f2 = 0.0f;
            } else {
                f2 = L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(rqcVar3, property2, f2));
            rqc rqcVar4 = this.L0[1];
            if (this.Y0 == null) {
                f4 = -L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(rqcVar4, property2, f4));
            animatorSet.setInterpolator(s33.g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new xlb(this));
            animatorSet.start();
            return;
        }
        if (this.Y0 == null && (this.D1 instanceof krc)) {
            this.L0[2].a(false, true);
        }
        rqc[] rqcVarArr = this.L0;
        if (this.Y0 != null) {
            c = 2;
        } else {
            c = 0;
        }
        rqcVarArr[c].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        rqc rqcVar5 = this.L0[2];
        Property property3 = View.ALPHA;
        if (this.Y0 != null) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rqcVar5, property3, f);
        rqc rqcVar6 = this.L0[0];
        if (this.Y0 != null) {
            f3 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(rqcVar6, property3, f3));
        animatorSet2.addListener(new wlb(this));
        animatorSet2.setInterpolator(s33.g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void q1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmb.q1(boolean):void");
    }

    public final void r1() {
        int childCount = this.R0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.R0.getChildAt(i);
            if (childAt instanceof ly7) {
                ((ly7) childAt).v(true);
            }
        }
    }

    @Override
    public final void setResourceProvider(wjb wjbVar) {
        this.a.a = wjbVar;
    }

    @Override
    public final void i(long j, long j2) {
    }

    @Override
    public final void l(long j, long j2) {
    }

    public qmb(Object obj, Bitmap bitmap, boolean z) {
        super(null);
        this.a = new slb(this);
        this.d = true;
        this.n = 1;
        njb njbVar = new njb(this, 0, false);
        this.T = njbVar;
        njb njbVar2 = new njb(this, 0, true);
        this.U = njbVar2;
        njb njbVar3 = new njb(this, 1, false);
        this.V = njbVar3;
        njb njbVar4 = new njb(this, 1, true);
        this.W = njbVar4;
        this.Z = -1;
        this.a0 = new flb(this, (byte) 0);
        this.y0 = new gmb[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.n1 = 0.5f;
        this.p1 = 0.0f;
        this.u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new ns4(getParentActivity(), new ln8(this, (byte) 20));
        this.V1 = false;
        this.W1 = false;
        this.b = (byte) 2;
        this.D1 = obj;
        this.E1 = bitmap;
        this.F1 = z;
        if (obj instanceof krc) {
            krc krcVar = (krc) obj;
            this.G1 = krcVar.i;
            TLRPC.TL_wallPaper tL_wallPaper = krcVar.g;
            this.Y0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f = krcVar.h;
                this.n1 = f;
                if (f < 0.0f && !bkb.I.o()) {
                    this.n1 *= -1.0f;
                }
            }
        }
        njbVar.v = true;
        njbVar3.v = true;
        njbVar2.v = true;
        njbVar4.v = true;
    }

    public qmb(akb akbVar) {
        this(akbVar, false, 0, false, false);
    }
}
