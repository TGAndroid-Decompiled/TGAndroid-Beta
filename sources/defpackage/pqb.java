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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.p;
public class pqb extends e implements jq3, fn7 {
    public FrameLayout A0;
    public float A1;
    public FrameLayout B0;
    public gqb B1;
    public lg5 C0;
    public gqb C1;
    public AnimatorSet D0;
    public Object D1;
    public final int E;
    public vb0 E0;
    public Bitmap E1;
    public final int F;
    public ppb F0;
    public boolean F1;
    public final int G;
    public ppb G0;
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
    public oqb K1;
    public final long L;
    public fvc[] L0;
    public long L1;
    public final long M;
    public fvc[] M0;
    public boolean M1;
    public final long N;
    public final FrameLayout[] N0;
    public boolean N1;
    public final float O;
    public final TextView[] O0;
    public boolean O1;
    public final String P;
    public final TextView[] P0;
    public b29 P1;
    public final int Q;
    public final FrameLayout[] Q0;
    public s7 Q1;
    public long R;
    public qob R0;
    public ValueAnimator R1;
    public l45 S;
    public nqb S0;
    public jo0 S1;
    public final mnb T;
    public x46 T0;
    public opb T1;
    public final mnb U;
    public mf5 U0;
    public final ru4 U1;
    public final mnb V;
    public bz0 V0;
    public boolean V1;
    public final mnb W;
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
    public final rpb a;
    public final Runnable a0;
    public TLRPC.TL_wallPaper a1;
    public float a2;
    public final byte b;
    public boolean b0;
    public int b1;
    public float b2;
    public Scroller c;
    public a81 c0;
    public int c1;
    public boolean c2;
    public final boolean d;
    public FrameLayout d0;
    public int d1;
    public int d2;
    public m52 e;
    public TextView e0;
    public int e1;
    public ValueAnimator e2;
    public s7 f;
    public TextView f0;
    public int f1;
    public boolean f2;
    public final znb g0;
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
    public gh1 j2;
    public ArrayList k0;
    public int k1;
    public float k2;
    public fic l0;
    public int l1;
    public ValueAnimator l2;
    public iy9 m0;
    public int m1;
    public int n;
    public UndoView n0;
    public float n1;
    public FrameLayout o0;
    public float o1;
    public d79 p0;
    public float p1;
    public t20 q0;
    public float q1;
    public Drawable r;
    public zp4 r0;
    public hqb r1;
    public int s;
    public r47 s0;
    public wm2 s1;
    public boolean t0;
    public AnimatorSet t1;
    public a u0;
    public final PorterDuff.Mode u1;
    public l7 v0;
    public int v1;
    public final ynb w;
    public mpb w0;
    public ud0 w1;
    public boolean x;
    public lqb x0;
    public pvc x1;
    public final int y;
    public final fqb[] y0;
    public Bitmap y1;
    public fqb z0;
    public Bitmap z1;

    public pqb(znb znbVar, boolean z, int i, boolean z2, boolean z3) {
        super(null);
        ynb i2;
        this.a = new rpb(this);
        this.d = true;
        this.n = 1;
        mnb mnbVar = new mnb(this, 0, false);
        this.T = mnbVar;
        mnb mnbVar2 = new mnb(this, 0, true);
        this.U = mnbVar2;
        mnb mnbVar3 = new mnb(this, 1, false);
        this.V = mnbVar3;
        mnb mnbVar4 = new mnb(this, 1, true);
        this.W = mnbVar4;
        this.Z = -1;
        this.a0 = new epb(this, (byte) 0);
        this.y0 = new fqb[2];
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
        this.U1 = new ru4(getParentActivity(), new j09(this, (byte) 19));
        this.V1 = false;
        this.W1 = false;
        this.b = i;
        this.h0 = z3;
        this.g0 = znbVar;
        this.j0 = z;
        this.i0 = z2;
        if (i == 1) {
            i2 = znbVar.i(!z2);
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
            i2 = znbVar.i(false);
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
            aob.M = aob.B0();
            aob.O = true;
            aob.P = true;
            aob.t(znbVar, false, false);
        }
        jn7.e().k(jn7.x4, new Object[0]);
        mnbVar.v = true;
        mnbVar3.v = true;
        mnbVar2.v = true;
        mnbVar4.v = true;
    }

    @Override
    public final void B(boolean z) {
        o1();
    }

    @Override
    public final void N(String str) {
        o1();
    }

    public final void N0() {
        AnimatorSet animatorSet = this.D0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.D0 = animatorSet2;
        boolean z = this.G1;
        fqb fqbVar = this.z0;
        if (z) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(fqbVar, View.SCALE_X, this.A1), ObjectAnimator.ofFloat(this.z0, View.SCALE_Y, this.A1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(fqbVar, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.z0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.z0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.z0, View.TRANSLATION_Y, 0.0f));
        }
        this.D0.setInterpolator(k43.g);
        this.D0.addListener(new upb(this, (byte) 1));
        this.D0.start();
    }

    public final void O0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqb.O0(boolean):void");
    }

    public final void P0(boolean z) {
        byte b = this.b;
        if (b == 2) {
            if (!z) {
                finishFragment();
                return;
            }
            return;
        }
        aob.o();
        jn7.e().n(this, jn7.C4);
        ynb ynbVar = this.w;
        if (b == 1) {
            if (this.i0) {
                ynbVar.c = this.y;
                ynbVar.d = this.E;
                ynbVar.e = this.F;
                ynbVar.f = this.G;
                ynbVar.g = this.H;
                ynbVar.h = this.I;
                ynbVar.i = this.J;
                ynbVar.j = this.K;
                ynbVar.k = this.L;
                ynbVar.l = this.M;
                ynbVar.m = this.N;
                ynbVar.n = this.Q;
                ynbVar.o = this.P;
                ynbVar.p = this.O;
            }
            aob.x1(this.g0, false, true, false, false, false);
        } else {
            if (ynbVar != null) {
                aob.x1(this.g0, false, this.j0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).W(false, false);
            if (this.j0) {
                znb znbVar = this.g0;
                if (znbVar.b != null && aob.H.get(znbVar.k()) == null) {
                    new File(znbVar.b).delete();
                }
            }
        }
        if (!z) {
            finishFragment();
        }
    }

    public final BitmapDrawable Q0(Drawable drawable) {
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
            hl.l2(colorMatrix, 0.94f);
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

    public final boolean R0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqb.R0(boolean):boolean");
    }

    public final void S0() {
        int themedColor;
        m52 m52Var = this.e;
        int i = 0;
        if (m52Var != null) {
            m52Var.I(getThemedColor(aob.G8));
            this.e.O(getThemedColor(aob.E8), false);
        }
        if (this.r != null && (themedColor = getThemedColor(aob.d6)) != this.s) {
            this.s = themedColor;
            this.r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        vb0 vb0Var = this.E0;
        if (vb0Var != null) {
            vb0Var.invalidate();
        }
        if (this.r1 != null) {
            wk5 wk5Var = this.parentLayout;
            if (wk5Var != null && wk5Var.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().K(getThemedColor(aob.h5));
                if (this.b == 2 && this.L1 != 0) {
                    this.parentLayout.getBottomSheet().y0(-16777216);
                }
            } else {
                setNavigationBarColor(getThemedColor(aob.h5));
            }
        }
        if (this.L0 != null) {
            int i2 = 0;
            while (true) {
                fvc[] fvcVarArr = this.L0;
                if (i2 >= fvcVarArr.length) {
                    break;
                }
                fvc fvcVar = fvcVarArr[i2];
                if (fvcVar != null) {
                    fvcVar.invalidate();
                }
                i2++;
            }
        }
        if (this.M0 != null) {
            while (true) {
                fvc[] fvcVarArr2 = this.M0;
                if (i >= fvcVarArr2.length) {
                    break;
                }
                fvc fvcVar2 = fvcVarArr2[i];
                if (fvcVar2 != null) {
                    fvcVar2.invalidate();
                }
                i++;
            }
        }
        TextView textView = this.g2;
        if (textView != null) {
            yob.X(textView, aob.G6, this.a);
        }
        p pVar = this.X;
        if (pVar != null) {
            pVar.invalidate();
        }
        zp4 zp4Var = this.r0;
        if (zp4Var != null) {
            zp4Var.updateColors();
        }
    }

    public final int T0() {
        if (xc2.U(this.currentAccount, -this.L1)) {
            return getMessagesController().l4.o2.f();
        }
        return getMessagesController().l4.g2.f();
    }

    public final ArrayList U0() {
        u00 u00Var = new u00(this, (byte) 22);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.l0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
        arrayList.add(new apb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.C8));
        arrayList.add(new apb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D8));
        arrayList.add(new apb(this.u0, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.G8));
        arrayList.add(new apb(this.u0, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.E8));
        p pVar = this.X;
        if (pVar != null) {
            s7 s7Var = pVar.J;
            EditTextBoldCursor[] editTextBoldCursorArr = pVar.F;
            for (int i = 0; i < editTextBoldCursorArr.length; i++) {
                arrayList.add(new apb(editTextBoldCursorArr[i], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.L6));
                arrayList.add(new apb(editTextBoldCursorArr[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
                arrayList.add(new apb(editTextBoldCursorArr[i], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l6));
            }
            arrayList.add(new apb(pVar.G, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.I5));
            if (s7Var != null) {
                u00 u00Var2 = new u00(pVar, (byte) 5);
                arrayList.add(new apb(s7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var2, aob.G6));
                arrayList.add(new apb(s7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var2, aob.E8));
                arrayList.add(new apb(s7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var2, aob.F8));
                arrayList.add(new apb(s7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var2, aob.G8));
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
            mnb mnbVar = this.T;
            mnb mnbVar2 = this.V;
            arrayList.add(new apb(this.w0, 0, new Class[]{wb2.class}, (Paint) null, new Drawable[]{mnbVar, mnbVar2}, (zob) null, aob.ub));
            arrayList.add(new apb(this.w0, 0, new Class[]{wb2.class}, (Paint) null, new Drawable[]{mnbVar, mnbVar2}, (zob) null, aob.vb));
            arrayList.add(new apb(this.w0, 0, new Class[]{wb2.class}, (Paint) null, new Drawable[]{mnbVar, mnbVar2}, (zob) null, aob.wb));
            arrayList.add(new apb(this.w0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Nd));
            arrayList.add(new apb(this.w0, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Tb));
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((apb) arrayList.get(i6)).n = this.a;
        }
        return arrayList;
    }

    public final boolean V0(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqb.V0(int):boolean");
    }

    public boolean W0() {
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && wk5Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void X0() {
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
                fvc[] fvcVarArr = this.L0;
                if (i3 >= fvcVarArr.length) {
                    break;
                }
                fvc fvcVar = fvcVarArr[i3];
                if (fvcVar != null) {
                    if (this.O1) {
                        f = this.p1 * this.q1;
                    } else {
                        f = 0.0f;
                    }
                    fvcVar.setDimAmount(f);
                    this.L0[i3].invalidate();
                }
                i3++;
            }
        }
        if (this.p0 != null) {
            for (int i4 = 0; i4 < this.p0.getChildCount(); i4++) {
                View childAt = this.p0.getChildAt(i4);
                if (childAt instanceof dl1) {
                    i1((dl1) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.w0 != null) {
            for (int i5 = 0; i5 < this.w0.getChildCount(); i5++) {
                View childAt2 = this.w0.getChildAt(i5);
                if (childAt2 instanceof dl1) {
                    i1((dl1) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        gqb gqbVar = this.B1;
        if (gqbVar != null) {
            gqbVar.invalidate();
        }
        gqb gqbVar2 = this.C1;
        if (gqbVar2 != null) {
            gqbVar2.invalidate();
        }
        vb0 vb0Var = this.E0;
        if (vb0Var != null) {
            vb0Var.invalidate();
        }
    }

    public final void Y0(wg1 wg1Var) {
        if (getParentActivity() == null) {
            return;
        }
        l46 l46Var = new l46(23, this.currentAccount, this.a, getParentActivity(), this);
        l46Var.s1(wg1Var);
        l46Var.r1(this.X1, true);
        l46Var.t1(this.L1);
        if (!W0()) {
            l46Var.L2 = new epb(this, (byte) 1);
        }
        showDialog(l46Var);
    }

    public final void Z0() {
        ynb i;
        znb znbVar = aob.M;
        if (znbVar == null) {
            return;
        }
        int i2 = znbVar.a0;
        if (i2 >= 0) {
            i = (ynb) znbVar.b0.get(i2);
        } else {
            i = znbVar.i(false);
        }
        if (this.w != null) {
            b1();
            aob.x1(this.g0, true, false, false, false, false);
            if (aob.M != null) {
                aob.O = false;
                aob.P = false;
                aob.M = null;
            }
            aob.t(this.g0, true, this.h0);
            ((ActionBarLayout) this.parentLayout).W(false, false);
        } else {
            ((ActionBarLayout) this.parentLayout).W(false, false);
            File file = new File(this.g0.b);
            znb znbVar2 = this.g0;
            aob.u(file, znbVar2.a, znbVar2.G, false);
            uc7.s1(this.g0.F).I4(this.g0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", this.g0.k());
            edit.commit();
        }
        e eVar = (e) getParentLayout().getFragmentStack().get(Math.max(0, getParentLayout().getFragmentStack().size() - 2));
        finishFragment();
        if (this.b == 0) {
            jn7.e().k(jn7.s4, znbVar, i, Boolean.valueOf(this.j0));
        }
        aob.K1(eVar);
    }

    public final void a1(TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        boolean z = tLObject instanceof TL_account.TL_wallPapers;
        ynb ynbVar = this.w;
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
                        if (ynbVar != null && (str = ynbVar.o) != null && str.equals(tL_wallPaper2.slug)) {
                            this.Y0 = tL_wallPaper2;
                            g1(false);
                            o1();
                        } else if (ynbVar == null) {
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
            nqb nqbVar = this.S0;
            if (nqbVar != null) {
                nqbVar.f();
            }
            kf7.a0(this.currentAccount).q1(1, tL_wallPapers.wallpapers);
        }
        if (this.Y0 == null && ynbVar != null && !TextUtils.isEmpty(ynbVar.o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = ynbVar.o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(getConnectionsManager().sendRequest(getwallpaper, new kpb(this, (byte) 0)), this.classGuid);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.i5));
        hashSet.add(Integer.valueOf(aob.h5));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.ec));
        hashSet.add(Integer.valueOf(aob.fe));
        hashSet.add(Integer.valueOf(aob.jc));
        hashSet.add(Integer.valueOf(aob.ee));
        hashSet.add(Integer.valueOf(aob.Wb));
        hashSet.add(Integer.valueOf(aob.Rd));
        hashSet.add(Integer.valueOf(aob.Ub));
        hashSet.add(Integer.valueOf(aob.Pd));
        hashSet.add(Integer.valueOf(aob.Rb));
        hashSet.add(Integer.valueOf(aob.Ld));
        hashSet.add(Integer.valueOf(aob.jd));
        hashSet.add(Integer.valueOf(aob.Db));
        hashSet.add(Integer.valueOf(aob.Cb));
        hashSet.add(Integer.valueOf(aob.Bb));
        hashSet.add(Integer.valueOf(aob.Ab));
        hashSet.add(Integer.valueOf(aob.Wc));
        hashSet.add(Integer.valueOf(aob.Vc));
        hashSet.add(Integer.valueOf(aob.tb));
        hashSet.add(Integer.valueOf(aob.sb));
        hashSet.add(Integer.valueOf(aob.rb));
        hashSet.add(Integer.valueOf(aob.ta));
        hashSet.add(Integer.valueOf(aob.Uc));
        hashSet.add(Integer.valueOf(aob.ra));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.Mj));
        hashSet.add(Integer.valueOf(aob.Kj));
        hashSet.add(Integer.valueOf(aob.Je));
        hashSet.add(Integer.valueOf(aob.Ke));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.B8));
    }

    public final void b1() {
        TLRPC.TL_wallPaper tL_wallPaper;
        ynb ynbVar = this.w;
        if (ynbVar != null && !TextUtils.isEmpty(ynbVar.o) && (tL_wallPaper = this.Y0) != null && tL_wallPaper.document != null) {
            try {
                xb4.G(this.currentAccount);
                nvc.e(pi5.c(ynbVar.o), new z7b(xb4.J(this.Y0.document, null, true, true), (byte) 3));
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
    }

    public final void c1() {
        d1(2, true);
    }

    @Override
    public final android.view.View createView(android.content.Context r51) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqb.createView(android.content.Context):android.view.View");
    }

    public final void d1(int i, boolean z) {
        ynb ynbVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (getParentActivity() != null && this.n != i && this.t1 == null && (ynbVar = this.w) != null) {
            if (z && i == 2 && (aob.a1() || ynbVar.j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131752531, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                if (aob.a1() && (!aob.a1() || aob.I.j0.d == 0)) {
                    idVar.U = ob6.M0(2131752510, null);
                    alertDialog$Builder.j(ob6.M0(2131752533, null), new gpb(this, (byte) 7));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                } else {
                    idVar.U = ob6.M0(2131752530, null);
                    alertDialog$Builder.j(ob6.M0(2131745845, null), new gpb(this, (byte) 5));
                    alertDialog$Builder.g(ob6.M0(2131751736, null), new gpb(this, (byte) 6));
                }
                showDialog(idVar);
                return;
            }
            int i9 = this.n;
            this.n = i;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.h.setText(ob6.M0(2131751979, null));
                        if (ynbVar.f != 0) {
                            if (ynbVar.h != 0) {
                                i8 = 4;
                            } else if (ynbVar.g != 0) {
                                i8 = 3;
                            } else {
                                i8 = 2;
                            }
                        } else {
                            i8 = 1;
                        }
                        p pVar = this.X;
                        V0(3);
                        pVar.f(2, 4, i8, true);
                        this.X.e(ynbVar.h, 3);
                        this.X.e(ynbVar.g, 2);
                        this.X.e(ynbVar.f, 1);
                        p pVar2 = this.X;
                        int i10 = ynbVar.e;
                        if (i10 == 0) {
                            i10 = ynbVar.c;
                        }
                        pVar2.e(i10, 0);
                        this.M0[1].b(0, ynbVar.e);
                        this.M0[1].b(1, ynbVar.f);
                        this.M0[1].b(2, ynbVar.g);
                        this.M0[1].b(3, ynbVar.h);
                        if (ynbVar.g != 0) {
                            lqb lqbVar = this.x0;
                            if (i9 == 1) {
                                lqbVar.i(0);
                            } else {
                                lqbVar.g(0);
                            }
                        } else if (i9 == 2) {
                            this.x0.s(0);
                        }
                        this.w0.y0(0, hl.L(60.0f), null);
                        j1();
                    }
                    i2 = i9;
                } else {
                    this.h.setText(ob6.M0(2131751981, null));
                    int themedColor = getThemedColor(aob.Ee);
                    int i11 = aob.Fe;
                    if (aob.d1(i11)) {
                        i4 = getThemedColor(i11);
                    } else {
                        i4 = 0;
                    }
                    int i12 = aob.Ge;
                    if (aob.d1(i12)) {
                        i5 = getThemedColor(i12);
                    } else {
                        i5 = 0;
                    }
                    int i13 = aob.He;
                    if (aob.d1(i13)) {
                        i6 = getThemedColor(i13);
                    } else {
                        i6 = 0;
                    }
                    long j = ynbVar.k;
                    int i14 = (int) j;
                    if (i14 == 0 && j != 0) {
                        i4 = 0;
                    }
                    long j2 = ynbVar.l;
                    int i15 = (int) j2;
                    if (i15 == 0 && j2 != 0) {
                        i5 = 0;
                    }
                    long j3 = ynbVar.m;
                    int i16 = (int) j3;
                    if (i16 == 0 && j3 != 0) {
                        i6 = 0;
                    }
                    int i17 = (int) ynbVar.j;
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
                    V0(2);
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
                    if (i2 != 1 && ynbVar.g != 0) {
                        this.x0.g(0);
                    } else {
                        this.x0.i(0);
                    }
                    this.w0.y0(0, hl.L(60.0f), null);
                }
            } else {
                i2 = i9;
                this.h.setText(ob6.M0(2131751980, null));
                if (ynbVar.d != 0) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                p pVar8 = this.X;
                V0(1);
                pVar8.f(1, 2, i3, false);
                this.X.e(ynbVar.c, 0);
                int i18 = ynbVar.d;
                if (i18 != 0) {
                    this.X.e(i18, 1);
                }
                if (i2 == 2 || (i2 == 3 && ynbVar.g != 0)) {
                    this.x0.s(0);
                }
            }
            if (i != 1 && i != 3) {
                this.X.setMinBrightness(0.0f);
                this.X.setMaxBrightness(1.0f);
                return;
            }
            if (i2 == 2 && this.N0[1].getVisibility() == 0) {
                k1(0, true, true);
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
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i == jn7.r3) {
            if (this.L1 == ((Long) objArr[2]).longValue()) {
                this.X1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                m1(true);
            }
        } else if (i == jn7.l4) {
            d79 d79Var = this.p0;
            if (d79Var != null) {
                int childCount = d79Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.p0.getChildAt(i3);
                    if (childAt instanceof of3) {
                        ((of3) childAt).j0(0, true);
                    }
                }
            }
        } else if (i == jn7.m4) {
            mpb mpbVar = this.w0;
            if (mpbVar != null) {
                mpbVar.i1();
            }
        } else if (i == jn7.C4) {
            if (this.v0 != null) {
                g1(true);
            }
        } else if (i == jn7.i4) {
            Object obj = this.D1;
            if (obj instanceof zvc) {
                zvc zvcVar = (zvc) obj;
                if (zvcVar.a == null) {
                    zvcVar.a = (String) objArr[0];
                }
            }
        } else {
            long j = 0;
            if (i == jn7.h4) {
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
                        ynb ynbVar = this.w;
                        if (ynbVar != null && (str = ynbVar.o) != null && str.equals(wallPaper.slug)) {
                            this.Y0 = (TLRPC.TL_wallPaper) wallPaper;
                            g1(false);
                            o1();
                        } else if (ynbVar == null) {
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
                nqb nqbVar = this.S0;
                if (nqbVar != null) {
                    nqbVar.f();
                }
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i5);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j = ls6.r(j, wallPaper2.id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new kpb(this, (byte) 1)), this.classGuid);
            } else if (i == jn7.x5 && this.L1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1(int i) {
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
        fqb[] fqbVarArr = this.y0;
        fqb fqbVar = fqbVarArr[0];
        fqb fqbVar2 = fqbVarArr[1];
        fqbVarArr[0] = fqbVar2;
        fqbVarArr[1] = fqbVar;
        this.v0.removeView(fqbVar2);
        this.v0.addView(fqbVarArr[0], this.v0.indexOfChild(fqbVarArr[1]) + 1);
        fqb fqbVar3 = fqbVarArr[0];
        this.z0 = fqbVar3;
        fqbVar3.setBackground(fqbVarArr[1].getBackground());
        this.z0.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
        r1(false);
        p1();
        fqbVarArr[1].setVisibility(0);
        fqbVarArr[1].setAlpha(1.0f);
        this.z0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e2 = ofFloat;
        ofFloat.addUpdateListener(new ce0(this, (byte) 15));
        this.e2.addListener(new upb(this, (byte) 0));
        this.e2.setInterpolator(k43.f);
        this.e2.setDuration(300L);
        this.e2.start();
        this.z0.getImageReceiver().t1 = (short) 300;
        this.z0.getImageReceiver().Z(jn5.b(tL_wallPaper2.document), this.I1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.z0.e();
        this.Y0 = tL_wallPaper2;
        this.G1 = this.L0[2].s;
        o1();
    }

    public final void f1(int i, int i2, boolean z) {
        ih7 ih7Var;
        if (i2 == 0) {
            this.b1 = i;
        } else if (i2 == 1) {
            this.d1 = i;
        } else if (i2 == 2) {
            this.e1 = i;
        } else if (i2 == 3) {
            this.f1 = i;
        }
        r1(z);
        if (this.L0 != null) {
            int i3 = 0;
            while (true) {
                fvc[] fvcVarArr = this.L0;
                if (i3 >= fvcVarArr.length) {
                    break;
                }
                fvc fvcVar = fvcVarArr[i3];
                if (fvcVar != null) {
                    fvcVar.b(i2, i);
                }
                i3++;
            }
        }
        if (this.e1 != 0) {
            if (this.V0 != null && aob.I.o()) {
                this.V0.setTwoSided(true);
            }
            Drawable background = this.z0.getBackground();
            if (background instanceof ih7) {
                ih7Var = (ih7) background;
            } else {
                ih7Var = new ih7();
                ih7Var.p(this.z0);
                if (this.F1) {
                    ih7Var.m(false);
                }
            }
            ih7 ih7Var2 = ih7Var;
            ih7Var2.n(true, this.b1, this.d1, this.e1, this.f1);
            this.z0.setBackground(ih7Var2);
            this.l1 = ih7Var2.f();
            this.m1 = 754974720;
        } else if (this.d1 != 0) {
            this.z0.setBackground(new GradientDrawable(yd0.c(this.j1), new int[]{this.b1, this.d1}));
            int U0 = hl.U0(hl.w0(this.b1, this.d1), false);
            this.m1 = U0;
            this.l1 = U0;
        } else {
            this.z0.setBackgroundColor(this.b1);
            int U02 = hl.U0(this.b1, false);
            this.m1 = U02;
            this.l1 = U02;
        }
        int i4 = aob.cd;
        boolean d1 = aob.d1(i4);
        rpb rpbVar = this.a;
        if (d1 && !(this.z0.getBackground() instanceof ih7)) {
            if (aob.s0() instanceof ih7) {
                getThemedColor(i4);
                rpbVar.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
            }
        } else {
            rpbVar.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        }
        ImageView imageView = this.H0;
        if (imageView != null) {
            yob.s(imageView, aob.Zc, rpbVar, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.I0;
        if (imageView2 != null) {
            yob.s(imageView2, aob.Zc, rpbVar, PorterDuff.Mode.MULTIPLY);
        }
        fqb fqbVar = this.z0;
        if (fqbVar != null) {
            fqbVar.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
            this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
            this.z0.invalidate();
            if (aob.I.o() && (this.z0.getBackground() instanceof ih7)) {
                bz0 bz0Var = this.V0;
                if (bz0Var != null) {
                    bz0Var.setTwoSided(true);
                }
                if (this.n1 < 0.0f) {
                    this.z0.getImageReceiver().W(((ih7) this.z0.getBackground()).k);
                }
            } else {
                this.z0.getImageReceiver().W(null);
                bz0 bz0Var2 = this.V0;
                if (bz0Var2 != null) {
                    bz0Var2.setTwoSided(false);
                }
            }
            bz0 bz0Var3 = this.V0;
            if (bz0Var3 != null) {
                bz0Var3.setProgress(this.n1);
            }
        }
        mpb mpbVar = this.w0;
        if (mpbVar != null) {
            mpbVar.i1();
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

    public final void g1(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqb.g1(boolean):void");
    }

    @Override
    public final int getObserverTag() {
        return this.v1;
    }

    @Override
    public final vnb getResourceProvider() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.N1) {
            return U0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(long j) {
        boolean z;
        this.L1 = j;
        if (j != 0 && j != getUserConfig().e()) {
            z = false;
        } else {
            z = true;
        }
        this.M1 = z;
    }

    public final void i1(dl1 dl1Var) {
        rpb rpbVar;
        float f;
        if (this.z0 == null) {
            return;
        }
        Bitmap bitmap = this.a.i;
        float f2 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f = ((this.z0.getMeasuredWidth() - (Math.max(this.z0.getMeasuredWidth() / width, this.z0.getMeasuredHeight() / rpbVar.i.getHeight()) * width)) / 2.0f) + this.Z1 + 0.0f;
        } else {
            f = this.Z1 + 0.0f;
        }
        float y = dl1Var.getY() - ((-this.z0.K) + 0.0f);
        int measuredHeight = this.z0.getMeasuredHeight();
        if (this.O1) {
            f2 = this.p1 * this.q1;
        }
        dl1Var.x0 = true;
        dl1Var.w0 = measuredHeight;
        dl1Var.u0 = y;
        dl1Var.v0 = f;
        dl1Var.h2 = f2;
        dl1Var.i2.setColor(vm2.o(-16777216, (int) (f2 * 255.0f)));
        dl1Var.invalidate();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b == 2) {
            if (this.c2 && motionEvent != null) {
                if (motionEvent.getY() > a.getCurrentActionBarHeight() + hl.m) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1() {
        if (this.v0 != null && this.M0 != null && this.w.g != 0) {
            SharedPreferences e1 = uc7.e1();
            if (!e1.getBoolean("bganimationhint", false)) {
                if (this.C0 == null) {
                    lg5 lg5Var = new lg5(getParentActivity(), 8);
                    this.C0 = lg5Var;
                    lg5Var.setShowingDuration(5000L);
                    this.C0.setAlpha(0.0f);
                    this.C0.setVisibility(4);
                    this.C0.setText(ob6.M0(2131753744, null));
                    this.C0.setExtraTranslationY(hl.L(6.0f));
                    this.m0.addView(this.C0, tre.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                hl.d3(new hab(this, e1, (byte) 7), 500L);
            }
        }
    }

    public final void k1(int i, boolean z, boolean z2) {
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
                    this.T0.g1(i6, (this.R0.getMeasuredWidth() - hl.L(124.0f)) / 2);
                }
            }
        }
        if (b == 1 || b == 2) {
            fvc[] fvcVarArr = this.L0;
            if (z3) {
                c = 2;
            } else {
                c = 0;
            }
            fvcVarArr[c].setVisibility(0);
        }
        if (i == 1) {
            bz0 bz0Var = this.V0;
            if (!bz0Var.N) {
                float f11 = this.n1;
                if (f11 < 0.0f) {
                    float f12 = -f11;
                    this.n1 = f12;
                    bz0Var.setProgress(f12);
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
                    mpb mpbVar = this.w0;
                    Property property = View.TRANSLATION_Y;
                    if (i == 1) {
                        f8 = -hl.L(21.0f);
                    } else {
                        f8 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(mpbVar, property, f8));
                    fvc fvcVar = this.L0[2];
                    Property property2 = View.ALPHA;
                    if (z3) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(fvcVar, property2, f9));
                    fvc fvcVar2 = this.L0[0];
                    if (z3) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(fvcVar2, property2, f10));
                    if (i == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], property2, 0.0f));
                    }
                    hl.t1(this.X.F[1]);
                } else if (b == 2) {
                    mpb mpbVar2 = this.w0;
                    Property property3 = View.TRANSLATION_Y;
                    int i12 = -frameLayoutArr[i].getMeasuredHeight();
                    if (this.C1 == null) {
                        i11 = 0;
                    }
                    int L = hl.L(i11 + 72) + i12;
                    if (W0()) {
                        i4 = hl.n;
                    } else {
                        i4 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(mpbVar2, property3, L + i4));
                    fvc fvcVar3 = this.L0[2];
                    Property property4 = View.ALPHA;
                    if (z3) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(fvcVar3, property4, f7));
                    fvc fvcVar4 = this.L0[0];
                    if (z3) {
                        f13 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(fvcVar4, property4, f13));
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
                    hl.t1(this.X.F[1]);
                }
            } else {
                mpb mpbVar3 = this.w0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(mpbVar3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], property5, frameLayout2.getMeasuredHeight()));
                fvc fvcVar5 = this.L0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(fvcVar5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.z0, property6, 1.0f));
            }
            this.t1.playTogether(arrayList2);
            this.t1.addListener(new xpb(this, z, i3, i, z3));
            this.t1.setInterpolator(k43.g);
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
                mpb mpbVar4 = this.w0;
                if (i == 1) {
                    f4 = -hl.L(21.0f);
                } else {
                    f4 = 0.0f;
                }
                mpbVar4.setTranslationY(f4);
                fvc fvcVar6 = this.L0[2];
                if (z3) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                fvcVar6.setAlpha(f5);
                fvc fvcVar7 = this.L0[0];
                if (z3) {
                    f6 = 0.0f;
                } else {
                    f6 = 1.0f;
                }
                fvcVar7.setAlpha(f6);
                if (i == 1) {
                    frameLayoutArr[i].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i].setAlpha(1.0f);
                    frameLayoutArr[c2].setAlpha(0.0f);
                }
                hl.t1(this.X.F[1]);
            } else if (b == 2) {
                mpb mpbVar5 = this.w0;
                if (i == 0) {
                    f = 343.0f;
                } else {
                    f = 316.0f;
                }
                int i13 = -hl.L(f);
                if (this.C1 == null) {
                    i11 = 0;
                }
                int L2 = hl.L(i11 + 72) + i13;
                if (W0()) {
                    i2 = hl.n;
                } else {
                    i2 = 0;
                }
                mpbVar5.setTranslationY(L2 + i2);
                fvc fvcVar8 = this.L0[2];
                if (z3) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                fvcVar8.setAlpha(f2);
                fvc fvcVar9 = this.L0[0];
                if (z3) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                fvcVar9.setAlpha(f3);
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
                hl.t1(this.X.F[1]);
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
        fvc[] fvcVarArr2 = this.L0;
        if (!z3) {
            c3 = 2;
        }
        fvcVarArr2[c3].setVisibility(4);
    }

    public final void l1() {
        Window window;
        if (this.j2 != null) {
            return;
        }
        if (W0()) {
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
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + hl.n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        gh1 gh1Var = new gh1(this, getParentActivity(), canvas, (this.Q1.getMeasuredWidth() / 2.0f) + f, (this.Q1.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 2);
        this.j2 = gh1Var;
        gh1Var.setOnTouchListener(new b02((byte) 28));
        this.k2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l2 = ofFloat;
        ofFloat.addUpdateListener(new hh1(this, (byte) 3));
        this.l2.addListener(new upb(this, (byte) 4));
        this.l2.setDuration(400L);
        this.l2.setInterpolator(dt3.e);
        this.l2.start();
        frameLayout.addView(this.j2, new ViewGroup.LayoutParams(-1, -1));
        hl.c3(new epb(this, (byte) 2));
    }

    public final void m1(boolean z) {
        int i = (this.L1 > 0L ? 1 : (this.L1 == 0L ? 0 : -1));
        if (i > 0) {
            this.B1.c(ob6.M0(2131754205, null));
        } else if (i < 0) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.L1));
            gqb gqbVar = this.B1;
            if (M0 != null) {
                gqbVar.c(ob6.a0(null, null, 2131754206, M0.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < T0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    wm2 wm2Var = this.s1;
                    if (wm2Var == null) {
                        wm2Var = new wm2(2131231980, 0);
                        this.s1 = wm2Var;
                        wm2Var.n = 1;
                    }
                    spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.G(T0(), "ReactionLevelRequiredBtn", new Object[0]));
                    this.B1.b(spannableStringBuilder, z);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.L1 < 0 && !this.V1 && !this.W1 && tL_premium_boostsStatus2 == null) {
                        this.V1 = true;
                        getMessagesController().G0().a(this.L1, new hpb(this, (byte) 1));
                        return;
                    }
                    return;
                }
                this.B1.b(null, z);
                return;
            }
            gqbVar.c(ob6.a0(null, null, 2131754206, ob6.M0(2131754900, null).toLowerCase()));
        } else {
            this.B1.c(ob6.M0(2131754207, null));
        }
    }

    public final void n1() {
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
        g1(false);
    }

    public final void o1() {
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
            if (obj instanceof ro6) {
                ro6 ro6Var = (ro6) obj;
                TLRPC.Photo photo = ro6Var.K;
                if (photo != null) {
                    TLRPC.PhotoSize w = xb4.w(photo.sizes, this.J1, true, null, false);
                    xb4.G(this.currentAccount);
                    file = xb4.J(w, null, true, true);
                    str = xb4.r(null, w);
                    i = w.size;
                } else {
                    file = in5.w(ro6Var.C);
                    str = file.getName();
                    i = ro6Var.G;
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
            String r = xb4.r(null, tL_wallPaper.document);
            if (!TextUtils.isEmpty(r)) {
                xb4.G(this.currentAccount);
                File J = xb4.J(tL_wallPaper.document, null, true, true);
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
            lq3.q(i2).v(this);
            this.z0.invalidate();
            if (b == 2) {
                if (j != 0 && this.L1 == 0) {
                    this.u0.setSubtitle(hl.i0(j, false, false));
                } else {
                    this.u0.setSubtitle(null);
                }
            }
        } else {
            lq3.q(i2).a(str, null, this);
            if (b == 2 && this.L1 == 0) {
                this.u0.setSubtitle(ob6.M0(2131748532, null));
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
            gqb gqbVar = this.B1;
            if (gqbVar != null) {
                if (exists) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                gqbVar.setAlpha(f);
            }
            gqb gqbVar2 = this.C1;
            if (gqbVar2 != null) {
                if (exists) {
                    f3 = 1.0f;
                }
                gqbVar2.setAlpha(f3);
            }
        } else {
            this.f.setEnabled(exists);
            s7 s7Var = this.f;
            if (exists) {
                f3 = 1.0f;
            }
            s7Var.setAlpha(f3);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!R0(z)) {
            return false;
        }
        P0(true);
        return super.onBackPressed(z);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && wk5Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().K(getThemedColor(aob.h5));
            if (this.b == 2 && this.L1 != 0) {
                this.parentLayout.getBottomSheet().y0(-16777216);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.r3);
        jn7.e().b(this, jn7.l4);
        jn7.e().b(this, jn7.m4);
        getNotificationCenter().b(this, jn7.x5);
        byte b = this.b;
        if (b == 1 || b == 0) {
            jn7.e().b(this, jn7.C4);
        }
        if (b == 2 || b == 1) {
            aob.N = true;
        }
        if (b == 0 && this.w == null) {
            this.G1 = aob.h0;
        } else {
            Point point = hl.q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb = new StringBuilder();
            sb.append((int) (min / hl.p));
            sb.append("_");
            this.I1 = uh9.l(sb, (int) (max / hl.p), "_f");
            this.J1 = Math.max(point.x, point.y);
            jn7.e().b(this, jn7.i4);
            jn7.e().b(this, jn7.h4);
            this.v1 = lq3.q(this.currentAccount).k();
            if (this.W0 == null) {
                this.W0 = new ArrayList();
                kf7.a0(this.currentAccount).o0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        jn7.f(this.currentAccount).n(this, jn7.r3);
        jn7.e().n(this, jn7.l4);
        jn7.e().n(this, jn7.m4);
        getNotificationCenter().n(this, jn7.x5);
        iy9 iy9Var = this.m0;
        if (iy9Var != null && this.S != null) {
            iy9Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
        }
        byte b = this.b;
        if ((b == 2 || b == 1) && this.r1 == null) {
            hl.c3(new osa((byte) 8));
        }
        int i = jn7.C4;
        if (b == 2) {
            Bitmap bitmap = this.y1;
            if (bitmap != null) {
                bitmap.recycle();
                this.y1 = null;
            }
            this.a.k(null, null, null);
            jn7.e().k(i, new Object[0]);
        } else if (b == 1 || b == 0) {
            jn7.e().n(this, i);
        }
        if (b != 0 || this.w != null) {
            jn7.e().n(this, jn7.i4);
            jn7.e().n(this, jn7.h4);
        }
        super.onFragmentDestroy();
        Q0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.G1) {
            this.x1.b(false);
        }
        aob.b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        t20 t20Var = this.q0;
        if (t20Var != null) {
            t20Var.f();
        }
        lqb lqbVar = this.x0;
        if (lqbVar != null) {
            lqbVar.f();
        }
        if (this.G1) {
            this.x1.b(true);
        }
        aob.b = true;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            S0();
            try {
                fic ficVar = this.l0;
                if (ficVar != null) {
                    hl.w3(ficVar, getThemedColor(aob.s8));
                }
                bz0 bz0Var = this.V0;
                if (bz0Var != null) {
                    bz0Var.setOuterColor(getThemedColor(aob.Mj));
                    this.V0.invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (!z && this.b == 2) {
            this.a.k(null, null, null);
            jn7.e().k(jn7.C4, new Object[0]);
        }
    }

    public final void p1() {
        this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
        this.z0.invalidate();
        this.R0.i1();
        if (this.n1 >= 0.0f) {
            this.z0.getImageReceiver().W(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.z0.getImageReceiver().P(null);
            }
            if (this.z0.getBackground() instanceof ih7) {
                this.z0.getImageReceiver().W(((ih7) this.z0.getBackground()).k);
            }
        }
        this.a.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        X0();
    }

    public final void q1() {
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
            fvc fvcVar = this.L0[0];
            if (this.Y0 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            fvcVar.setEnabled(z2);
            if (this.Y0 != null) {
                this.L0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int L = (hl.L(9.0f) + ((FrameLayout.LayoutParams) this.L0[1].getLayoutParams()).width) / 2;
            fvc fvcVar2 = this.L0[0];
            Property property = View.ALPHA;
            if (this.Y0 == null) {
                f3 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(fvcVar2, property, f3));
            fvc fvcVar3 = this.L0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.Y0 != null) {
                f2 = 0.0f;
            } else {
                f2 = L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(fvcVar3, property2, f2));
            fvc fvcVar4 = this.L0[1];
            if (this.Y0 == null) {
                f4 = -L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(fvcVar4, property2, f4));
            animatorSet.setInterpolator(k43.g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new wpb(this));
            animatorSet.start();
            return;
        }
        if (this.Y0 == null && (this.D1 instanceof yvc)) {
            this.L0[2].a(false, true);
        }
        fvc[] fvcVarArr = this.L0;
        if (this.Y0 != null) {
            c = 2;
        } else {
            c = 0;
        }
        fvcVarArr[c].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        fvc fvcVar5 = this.L0[2];
        Property property3 = View.ALPHA;
        if (this.Y0 != null) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fvcVar5, property3, f);
        fvc fvcVar6 = this.L0[0];
        if (this.Y0 != null) {
            f3 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(fvcVar6, property3, f3));
        animatorSet2.addListener(new vpb(this));
        animatorSet2.setInterpolator(k43.g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void r1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqb.r1(boolean):void");
    }

    public final void s1() {
        int childCount = this.R0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.R0.getChildAt(i);
            if (childAt instanceof r18) {
                ((r18) childAt).v(true);
            }
        }
    }

    @Override
    public final void setResourceProvider(vnb vnbVar) {
        this.a.a = vnbVar;
    }

    @Override
    public final void i(long j, long j2) {
    }

    @Override
    public final void l(long j, long j2) {
    }

    public pqb(Object obj, Bitmap bitmap, boolean z) {
        super(null);
        this.a = new rpb(this);
        this.d = true;
        this.n = 1;
        mnb mnbVar = new mnb(this, 0, false);
        this.T = mnbVar;
        mnb mnbVar2 = new mnb(this, 0, true);
        this.U = mnbVar2;
        mnb mnbVar3 = new mnb(this, 1, false);
        this.V = mnbVar3;
        mnb mnbVar4 = new mnb(this, 1, true);
        this.W = mnbVar4;
        this.Z = -1;
        this.a0 = new epb(this, (byte) 0);
        this.y0 = new fqb[2];
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
        this.U1 = new ru4(getParentActivity(), new j09(this, (byte) 19));
        this.V1 = false;
        this.W1 = false;
        this.b = (byte) 2;
        this.D1 = obj;
        this.E1 = bitmap;
        this.F1 = z;
        if (obj instanceof yvc) {
            yvc yvcVar = (yvc) obj;
            this.G1 = yvcVar.i;
            TLRPC.TL_wallPaper tL_wallPaper = yvcVar.g;
            this.Y0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f = yvcVar.h;
                this.n1 = f;
                if (f < 0.0f && !aob.I.o()) {
                    this.n1 *= -1.0f;
                }
            }
        }
        mnbVar.v = true;
        mnbVar3.v = true;
        mnbVar2.v = true;
        mnbVar4.v = true;
    }

    public pqb(znb znbVar) {
        this(znbVar, false, 0, false, false);
    }
}
