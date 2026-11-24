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
public class rob extends d implements cr3, jm7 {
    public FrameLayout A0;
    public float A1;
    public FrameLayout B0;
    public iob B1;
    public ig5 C0;
    public iob C1;
    public AnimatorSet D0;
    public Object D1;
    public final int E;
    public tc0 E0;
    public Bitmap E1;
    public final int F;
    public rnb F0;
    public boolean F1;
    public final int G;
    public rnb G0;
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
    public qob K1;
    public final long L;
    public tsc[] L0;
    public long L1;
    public final long M;
    public tsc[] M0;
    public boolean M1;
    public final long N;
    public final FrameLayout[] N0;
    public boolean N1;
    public final float O;
    public final TextView[] O0;
    public boolean O1;
    public final String P;
    public final TextView[] P0;
    public p09 P1;
    public final int Q;
    public final FrameLayout[] Q0;
    public r7 Q1;
    public long R;
    public smb R0;
    public ValueAnimator R1;
    public c45 S;
    public pob S0;
    public jp0 S1;
    public final plb T;
    public u46 T0;
    public qnb T1;
    public final plb U;
    public jf5 U0;
    public final ou4 U1;
    public final plb V;
    public a01 V0;
    public boolean V1;
    public final plb W;
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
    public final tnb a;
    public final Runnable a0;
    public TLRPC.TL_wallPaper a1;
    public float a2;
    public final byte b;
    public boolean b0;
    public int b1;
    public float b2;
    public Scroller c;
    public a91 c0;
    public int c1;
    public boolean c2;
    public final boolean d;
    public FrameLayout d0;
    public int d1;
    public int d2;
    public h62 e;
    public TextView e0;
    public int e1;
    public ValueAnimator e2;
    public r7 f;
    public TextView f0;
    public int f1;
    public boolean f2;
    public final bmb g0;
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
    public fi1 j2;
    public ArrayList k0;
    public int k1;
    public float k2;
    public ggc l0;
    public int l1;
    public ValueAnimator l2;
    public qw9 m0;
    public int m1;
    public int n;
    public UndoView n0;
    public float n1;
    public FrameLayout o0;
    public float o1;
    public r59 p0;
    public float p1;
    public s30 q0;
    public float q1;
    public Drawable r;
    public wp4 r0;
    public job r1;
    public int s;
    public k47 s0;
    public pn2 s1;
    public boolean t0;
    public AnimatorSet t1;
    public a u0;
    public final PorterDuff.Mode u1;
    public k7 v0;
    public int v1;
    public final amb w;
    public onb w0;
    public se0 w1;
    public boolean x;
    public nob x0;
    public dtc x1;
    public final int y;
    public final hob[] y0;
    public Bitmap y1;
    public hob z0;
    public Bitmap z1;

    public rob(bmb bmbVar, boolean z, int i, boolean z2, boolean z3) {
        super(null);
        amb i2;
        this.a = new tnb(this);
        this.d = true;
        this.n = 1;
        plb plbVar = new plb(this, 0, false);
        this.T = plbVar;
        plb plbVar2 = new plb(this, 0, true);
        this.U = plbVar2;
        plb plbVar3 = new plb(this, 1, false);
        this.V = plbVar3;
        plb plbVar4 = new plb(this, 1, true);
        this.W = plbVar4;
        this.Z = -1;
        this.a0 = new gnb(this, (byte) 0);
        this.y0 = new hob[2];
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
        this.U1 = new ou4(getParentActivity(), new cf9(this, (byte) 14));
        this.V1 = false;
        this.W1 = false;
        this.b = i;
        this.h0 = z3;
        this.g0 = bmbVar;
        this.j0 = z;
        this.i0 = z2;
        if (i == 1) {
            i2 = bmbVar.i(!z2);
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
            i2 = bmbVar.i(false);
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
            cmb.M = cmb.B0();
            cmb.O = true;
            cmb.P = true;
            cmb.t(bmbVar, false, false);
        }
        nm7.e().k(nm7.y4, new Object[0]);
        plbVar.v = true;
        plbVar3.v = true;
        plbVar2.v = true;
        plbVar4.v = true;
    }

    @Override
    public final void A(boolean z) {
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
        hob hobVar = this.z0;
        if (z) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(hobVar, View.SCALE_X, this.A1), ObjectAnimator.ofFloat(this.z0, View.SCALE_Y, this.A1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(hobVar, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.z0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.z0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.z0, View.TRANSLATION_Y, 0.0f));
        }
        this.D0.setInterpolator(d53.g);
        this.D0.addListener(new wnb(this, (byte) 1));
        this.D0.start();
    }

    public final void O0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rob.O0(boolean):void");
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
        cmb.o();
        nm7.e().n(this, nm7.D4);
        amb ambVar = this.w;
        if (b == 1) {
            if (this.i0) {
                ambVar.c = this.y;
                ambVar.d = this.E;
                ambVar.e = this.F;
                ambVar.f = this.G;
                ambVar.g = this.H;
                ambVar.h = this.I;
                ambVar.i = this.J;
                ambVar.j = this.K;
                ambVar.k = this.L;
                ambVar.l = this.M;
                ambVar.m = this.N;
                ambVar.n = this.Q;
                ambVar.o = this.P;
                ambVar.p = this.O;
            }
            cmb.x1(this.g0, false, true, false, false, false);
        } else {
            if (ambVar != null) {
                cmb.x1(this.g0, false, this.j0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).W(false, false);
            if (this.j0) {
                bmb bmbVar = this.g0;
                if (bmbVar.b != null && cmb.H.get(bmbVar.k()) == null) {
                    new File(bmbVar.b).delete();
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
            gm.l2(colorMatrix, 0.94f);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rob.R0(boolean):boolean");
    }

    public final void S0() {
        int themedColor;
        h62 h62Var = this.e;
        int i = 0;
        if (h62Var != null) {
            h62Var.I(getThemedColor(cmb.F8));
            this.e.O(getThemedColor(cmb.D8), false);
        }
        if (this.r != null && (themedColor = getThemedColor(cmb.c6)) != this.s) {
            this.s = themedColor;
            this.r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        tc0 tc0Var = this.E0;
        if (tc0Var != null) {
            tc0Var.invalidate();
        }
        if (this.r1 != null) {
            tk5 tk5Var = this.parentLayout;
            if (tk5Var != null && tk5Var.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().K(getThemedColor(cmb.g5));
                if (this.b == 2 && this.L1 != 0) {
                    this.parentLayout.getBottomSheet().x0(-16777216);
                }
            } else {
                setNavigationBarColor(getThemedColor(cmb.g5));
            }
        }
        if (this.L0 != null) {
            int i2 = 0;
            while (true) {
                tsc[] tscVarArr = this.L0;
                if (i2 >= tscVarArr.length) {
                    break;
                }
                tsc tscVar = tscVarArr[i2];
                if (tscVar != null) {
                    tscVar.invalidate();
                }
                i2++;
            }
        }
        if (this.M0 != null) {
            while (true) {
                tsc[] tscVarArr2 = this.M0;
                if (i >= tscVarArr2.length) {
                    break;
                }
                tsc tscVar2 = tscVarArr2[i];
                if (tscVar2 != null) {
                    tscVar2.invalidate();
                }
                i++;
            }
        }
        TextView textView = this.g2;
        if (textView != null) {
            anb.X(textView, cmb.F6, this.a);
        }
        p pVar = this.X;
        if (pVar != null) {
            pVar.invalidate();
        }
        wp4 wp4Var = this.r0;
        if (wp4Var != null) {
            wp4Var.updateColors();
        }
    }

    public final int T0() {
        if (sd2.U(this.currentAccount, -this.L1)) {
            return getMessagesController().l4.g2.f();
        }
        return getMessagesController().l4.Y1.f();
    }

    public final ArrayList U0() {
        t10 t10Var = new t10(this, (byte) 22);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.l0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
        arrayList.add(new cnb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.B8));
        arrayList.add(new cnb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C8));
        arrayList.add(new cnb(this.u0, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.F8));
        arrayList.add(new cnb(this.u0, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.D8));
        p pVar = this.X;
        if (pVar != null) {
            r7 r7Var = pVar.J;
            EditTextBoldCursor[] editTextBoldCursorArr = pVar.F;
            for (int i = 0; i < editTextBoldCursorArr.length; i++) {
                arrayList.add(new cnb(editTextBoldCursorArr[i], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.K6));
                arrayList.add(new cnb(editTextBoldCursorArr[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
                arrayList.add(new cnb(editTextBoldCursorArr[i], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
            }
            arrayList.add(new cnb(pVar.G, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.H5));
            if (r7Var != null) {
                t10 t10Var2 = new t10(pVar, (byte) 5);
                arrayList.add(new cnb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var2, cmb.F6));
                arrayList.add(new cnb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var2, cmb.D8));
                arrayList.add(new cnb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var2, cmb.E8));
                arrayList.add(new cnb(r7Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var2, cmb.F8));
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
            plb plbVar = this.T;
            plb plbVar2 = this.V;
            arrayList.add(new cnb(this.w0, 0, new Class[]{rc2.class}, (Paint) null, new Drawable[]{plbVar, plbVar2}, (bnb) null, cmb.tb));
            arrayList.add(new cnb(this.w0, 0, new Class[]{rc2.class}, (Paint) null, new Drawable[]{plbVar, plbVar2}, (bnb) null, cmb.ub));
            arrayList.add(new cnb(this.w0, 0, new Class[]{rc2.class}, (Paint) null, new Drawable[]{plbVar, plbVar2}, (bnb) null, cmb.vb));
            arrayList.add(new cnb(this.w0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Md));
            arrayList.add(new cnb(this.w0, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Sb));
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((cnb) arrayList.get(i6)).n = this.a;
        }
        return arrayList;
    }

    public final boolean V0(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rob.V0(int):boolean");
    }

    public boolean W0() {
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && tk5Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void X0() {
        float f;
        jp0 jp0Var = this.S1;
        if (jp0Var != null) {
            jp0Var.invalidate();
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
                tsc[] tscVarArr = this.L0;
                if (i3 >= tscVarArr.length) {
                    break;
                }
                tsc tscVar = tscVarArr[i3];
                if (tscVar != null) {
                    if (this.O1) {
                        f = this.p1 * this.q1;
                    } else {
                        f = 0.0f;
                    }
                    tscVar.setDimAmount(f);
                    this.L0[i3].invalidate();
                }
                i3++;
            }
        }
        if (this.p0 != null) {
            for (int i4 = 0; i4 < this.p0.getChildCount(); i4++) {
                View childAt = this.p0.getChildAt(i4);
                if (childAt instanceof cm1) {
                    i1((cm1) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.w0 != null) {
            for (int i5 = 0; i5 < this.w0.getChildCount(); i5++) {
                View childAt2 = this.w0.getChildAt(i5);
                if (childAt2 instanceof cm1) {
                    i1((cm1) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        iob iobVar = this.B1;
        if (iobVar != null) {
            iobVar.invalidate();
        }
        iob iobVar2 = this.C1;
        if (iobVar2 != null) {
            iobVar2.invalidate();
        }
        tc0 tc0Var = this.E0;
        if (tc0Var != null) {
            tc0Var.invalidate();
        }
    }

    public final void Y0(vh1 vh1Var) {
        if (getParentActivity() == null) {
            return;
        }
        i46 i46Var = new i46(23, this.currentAccount, this.a, getParentActivity(), this);
        i46Var.r1(vh1Var);
        i46Var.q1(this.X1, true);
        i46Var.s1(this.L1);
        if (!W0()) {
            i46Var.L2 = new gnb(this, (byte) 1);
        }
        showDialog(i46Var);
    }

    public final void Z0() {
        amb i;
        bmb bmbVar = cmb.M;
        if (bmbVar == null) {
            return;
        }
        int i2 = bmbVar.a0;
        if (i2 >= 0) {
            i = (amb) bmbVar.b0.get(i2);
        } else {
            i = bmbVar.i(false);
        }
        if (this.w != null) {
            b1();
            cmb.x1(this.g0, true, false, false, false, false);
            if (cmb.M != null) {
                cmb.O = false;
                cmb.P = false;
                cmb.M = null;
            }
            cmb.t(this.g0, true, this.h0);
            ((ActionBarLayout) this.parentLayout).W(false, false);
        } else {
            ((ActionBarLayout) this.parentLayout).W(false, false);
            File file = new File(this.g0.b);
            bmb bmbVar2 = this.g0;
            cmb.u(file, bmbVar2.a, bmbVar2.G, false);
            oc7.r1(this.g0.F).C4(this.g0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", this.g0.k());
            edit.commit();
        }
        d dVar = (d) getParentLayout().getFragmentStack().get(Math.max(0, getParentLayout().getFragmentStack().size() - 2));
        finishFragment();
        if (this.b == 0) {
            nm7.e().k(nm7.t4, bmbVar, i, Boolean.valueOf(this.j0));
        }
        cmb.K1(dVar);
    }

    public final void a1(TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        boolean z = tLObject instanceof TL_account.TL_wallPapers;
        amb ambVar = this.w;
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
                        if (ambVar != null && (str = ambVar.o) != null && str.equals(tL_wallPaper2.slug)) {
                            this.Y0 = tL_wallPaper2;
                            g1(false);
                            o1();
                        } else if (ambVar == null) {
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
            pob pobVar = this.S0;
            if (pobVar != null) {
                pobVar.f();
            }
            cf7.Y(this.currentAccount).m1(1, tL_wallPapers.wallpapers);
        }
        if (this.Y0 == null && ambVar != null && !TextUtils.isEmpty(ambVar.o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = ambVar.o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(getConnectionsManager().sendRequest(getwallpaper, new mnb(this, (byte) 0)), this.classGuid);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.h5));
        hashSet.add(Integer.valueOf(cmb.g5));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.dc));
        hashSet.add(Integer.valueOf(cmb.ee));
        hashSet.add(Integer.valueOf(cmb.ic));
        hashSet.add(Integer.valueOf(cmb.de));
        hashSet.add(Integer.valueOf(cmb.Vb));
        hashSet.add(Integer.valueOf(cmb.Qd));
        hashSet.add(Integer.valueOf(cmb.Tb));
        hashSet.add(Integer.valueOf(cmb.Od));
        hashSet.add(Integer.valueOf(cmb.Qb));
        hashSet.add(Integer.valueOf(cmb.Kd));
        hashSet.add(Integer.valueOf(cmb.id));
        hashSet.add(Integer.valueOf(cmb.Cb));
        hashSet.add(Integer.valueOf(cmb.Bb));
        hashSet.add(Integer.valueOf(cmb.Ab));
        hashSet.add(Integer.valueOf(cmb.zb));
        hashSet.add(Integer.valueOf(cmb.Vc));
        hashSet.add(Integer.valueOf(cmb.Uc));
        hashSet.add(Integer.valueOf(cmb.sb));
        hashSet.add(Integer.valueOf(cmb.rb));
        hashSet.add(Integer.valueOf(cmb.qb));
        hashSet.add(Integer.valueOf(cmb.sa));
        hashSet.add(Integer.valueOf(cmb.Tc));
        hashSet.add(Integer.valueOf(cmb.qa));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.Lj));
        hashSet.add(Integer.valueOf(cmb.Jj));
        hashSet.add(Integer.valueOf(cmb.Ie));
        hashSet.add(Integer.valueOf(cmb.Je));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.A8));
    }

    public final void b1() {
        TLRPC.TL_wallPaper tL_wallPaper;
        amb ambVar = this.w;
        if (ambVar != null && !TextUtils.isEmpty(ambVar.o) && (tL_wallPaper = this.Y0) != null && tL_wallPaper.document != null) {
            try {
                bc4.G(this.currentAccount);
                btc.e(mi5.c(ambVar.o), new d6b(bc4.J(this.Y0.document, null, true, true), (byte) 3));
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
    }

    public final void c1() {
        d1(2, true);
    }

    @Override
    public final android.view.View createView(android.content.Context r52) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rob.createView(android.content.Context):android.view.View");
    }

    public final void d1(int i, boolean z) {
        amb ambVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (getParentActivity() != null && this.n != i && this.t1 == null && (ambVar = this.w) != null) {
            if (z && i == 2 && (cmb.a1() || ambVar.j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131752503, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                if (cmb.a1() && (!cmb.a1() || cmb.I.j0.d == 0)) {
                    heVar.U = jb6.M0(2131752482, null);
                    alertDialog$Builder.j(jb6.M0(2131752505, null), new inb(this, (byte) 7));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                } else {
                    heVar.U = jb6.M0(2131752502, null);
                    alertDialog$Builder.j(jb6.M0(2131745851, null), new inb(this, (byte) 5));
                    alertDialog$Builder.g(jb6.M0(2131751708, null), new inb(this, (byte) 6));
                }
                showDialog(heVar);
                return;
            }
            int i9 = this.n;
            this.n = i;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.h.setText(jb6.M0(2131751951, null));
                        if (ambVar.f != 0) {
                            if (ambVar.h != 0) {
                                i8 = 4;
                            } else if (ambVar.g != 0) {
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
                        this.X.e(ambVar.h, 3);
                        this.X.e(ambVar.g, 2);
                        this.X.e(ambVar.f, 1);
                        p pVar2 = this.X;
                        int i10 = ambVar.e;
                        if (i10 == 0) {
                            i10 = ambVar.c;
                        }
                        pVar2.e(i10, 0);
                        this.M0[1].b(0, ambVar.e);
                        this.M0[1].b(1, ambVar.f);
                        this.M0[1].b(2, ambVar.g);
                        this.M0[1].b(3, ambVar.h);
                        if (ambVar.g != 0) {
                            nob nobVar = this.x0;
                            if (i9 == 1) {
                                nobVar.i(0);
                            } else {
                                nobVar.g(0);
                            }
                        } else if (i9 == 2) {
                            this.x0.s(0);
                        }
                        this.w0.x0(0, gm.L(60.0f), null);
                        j1();
                    }
                    i2 = i9;
                } else {
                    this.h.setText(jb6.M0(2131751953, null));
                    int themedColor = getThemedColor(cmb.De);
                    int i11 = cmb.Ee;
                    if (cmb.d1(i11)) {
                        i4 = getThemedColor(i11);
                    } else {
                        i4 = 0;
                    }
                    int i12 = cmb.Fe;
                    if (cmb.d1(i12)) {
                        i5 = getThemedColor(i12);
                    } else {
                        i5 = 0;
                    }
                    int i13 = cmb.Ge;
                    if (cmb.d1(i13)) {
                        i6 = getThemedColor(i13);
                    } else {
                        i6 = 0;
                    }
                    long j = ambVar.k;
                    int i14 = (int) j;
                    if (i14 == 0 && j != 0) {
                        i4 = 0;
                    }
                    long j2 = ambVar.l;
                    int i15 = (int) j2;
                    if (i15 == 0 && j2 != 0) {
                        i5 = 0;
                    }
                    long j3 = ambVar.m;
                    int i16 = (int) j3;
                    if (i16 == 0 && j3 != 0) {
                        i6 = 0;
                    }
                    int i17 = (int) ambVar.j;
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
                    if (i2 != 1 && ambVar.g != 0) {
                        this.x0.g(0);
                    } else {
                        this.x0.i(0);
                    }
                    this.w0.x0(0, gm.L(60.0f), null);
                }
            } else {
                i2 = i9;
                this.h.setText(jb6.M0(2131751952, null));
                if (ambVar.d != 0) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                p pVar8 = this.X;
                V0(1);
                pVar8.f(1, 2, i3, false);
                this.X.e(ambVar.c, 0);
                int i18 = ambVar.d;
                if (i18 != 0) {
                    this.X.e(i18, 1);
                }
                if (i2 == 2 || (i2 == 3 && ambVar.g != 0)) {
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
        if (i == nm7.r3) {
            if (this.L1 == ((Long) objArr[2]).longValue()) {
                this.X1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                m1(true);
            }
        } else if (i == nm7.m4) {
            r59 r59Var = this.p0;
            if (r59Var != null) {
                int childCount = r59Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.p0.getChildAt(i3);
                    if (childAt instanceof hg3) {
                        ((hg3) childAt).j0(0, true);
                    }
                }
            }
        } else if (i == nm7.n4) {
            onb onbVar = this.w0;
            if (onbVar != null) {
                onbVar.h1();
            }
        } else if (i == nm7.D4) {
            if (this.v0 != null) {
                g1(true);
            }
        } else if (i == nm7.j4) {
            Object obj = this.D1;
            if (obj instanceof ntc) {
                ntc ntcVar = (ntc) obj;
                if (ntcVar.a == null) {
                    ntcVar.a = (String) objArr[0];
                }
            }
        } else {
            long j = 0;
            if (i == nm7.i4) {
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
                        amb ambVar = this.w;
                        if (ambVar != null && (str = ambVar.o) != null && str.equals(wallPaper.slug)) {
                            this.Y0 = (TLRPC.TL_wallPaper) wallPaper;
                            g1(false);
                            o1();
                        } else if (ambVar == null) {
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
                pob pobVar = this.S0;
                if (pobVar != null) {
                    pobVar.f();
                }
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i5);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j = hs6.r(j, wallPaper2.id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new mnb(this, (byte) 1)), this.classGuid);
            } else if (i == nm7.y5 && this.L1 != 0) {
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
        hob[] hobVarArr = this.y0;
        hob hobVar = hobVarArr[0];
        hob hobVar2 = hobVarArr[1];
        hobVarArr[0] = hobVar2;
        hobVarArr[1] = hobVar;
        this.v0.removeView(hobVar2);
        this.v0.addView(hobVarArr[0], this.v0.indexOfChild(hobVarArr[1]) + 1);
        hob hobVar3 = hobVarArr[0];
        this.z0 = hobVar3;
        hobVar3.setBackground(hobVarArr[1].getBackground());
        this.z0.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
        r1(false);
        p1();
        hobVarArr[1].setVisibility(0);
        hobVarArr[1].setAlpha(1.0f);
        this.z0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e2 = ofFloat;
        ofFloat.addUpdateListener(new af0(this, (byte) 15));
        this.e2.addListener(new wnb(this, (byte) 0));
        this.e2.setInterpolator(d53.f);
        this.e2.setDuration(300L);
        this.e2.start();
        this.z0.getImageReceiver().t1 = (short) 300;
        this.z0.getImageReceiver().Z(gn5.b(tL_wallPaper2.document), this.I1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.z0.e();
        this.Y0 = tL_wallPaper2;
        this.G1 = this.L0[2].s;
        o1();
    }

    public final void f1(int i, int i2, boolean z) {
        ah7 ah7Var;
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
                tsc[] tscVarArr = this.L0;
                if (i3 >= tscVarArr.length) {
                    break;
                }
                tsc tscVar = tscVarArr[i3];
                if (tscVar != null) {
                    tscVar.b(i2, i);
                }
                i3++;
            }
        }
        if (this.e1 != 0) {
            if (this.V0 != null && cmb.I.o()) {
                this.V0.setTwoSided(true);
            }
            Drawable background = this.z0.getBackground();
            if (background instanceof ah7) {
                ah7Var = (ah7) background;
            } else {
                ah7Var = new ah7();
                ah7Var.p(this.z0);
                if (this.F1) {
                    ah7Var.m(false);
                }
            }
            ah7 ah7Var2 = ah7Var;
            ah7Var2.n(true, this.b1, this.d1, this.e1, this.f1);
            this.z0.setBackground(ah7Var2);
            this.l1 = ah7Var2.f();
            this.m1 = 754974720;
        } else if (this.d1 != 0) {
            this.z0.setBackground(new GradientDrawable(we0.c(this.j1), new int[]{this.b1, this.d1}));
            int U0 = gm.U0(gm.w0(this.b1, this.d1), false);
            this.m1 = U0;
            this.l1 = U0;
        } else {
            this.z0.setBackgroundColor(this.b1);
            int U02 = gm.U0(this.b1, false);
            this.m1 = U02;
            this.l1 = U02;
        }
        int i4 = cmb.bd;
        boolean d1 = cmb.d1(i4);
        tnb tnbVar = this.a;
        if (d1 && !(this.z0.getBackground() instanceof ah7)) {
            if (cmb.s0() instanceof ah7) {
                getThemedColor(i4);
                tnbVar.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
            }
        } else {
            tnbVar.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        }
        ImageView imageView = this.H0;
        if (imageView != null) {
            anb.s(imageView, cmb.Yc, tnbVar, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.I0;
        if (imageView2 != null) {
            anb.s(imageView2, cmb.Yc, tnbVar, PorterDuff.Mode.MULTIPLY);
        }
        hob hobVar = this.z0;
        if (hobVar != null) {
            hobVar.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
            this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
            this.z0.invalidate();
            if (cmb.I.o() && (this.z0.getBackground() instanceof ah7)) {
                a01 a01Var = this.V0;
                if (a01Var != null) {
                    a01Var.setTwoSided(true);
                }
                if (this.n1 < 0.0f) {
                    this.z0.getImageReceiver().W(((ah7) this.z0.getBackground()).k);
                }
            } else {
                this.z0.getImageReceiver().W(null);
                a01 a01Var2 = this.V0;
                if (a01Var2 != null) {
                    a01Var2.setTwoSided(false);
                }
            }
            a01 a01Var3 = this.V0;
            if (a01Var3 != null) {
                a01Var3.setProgress(this.n1);
            }
        }
        onb onbVar = this.w0;
        if (onbVar != null) {
            onbVar.h1();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rob.g1(boolean):void");
    }

    @Override
    public final int getObserverTag() {
        return this.v1;
    }

    @Override
    public final ylb getResourceProvider() {
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

    public final void i1(cm1 cm1Var) {
        tnb tnbVar;
        float f;
        if (this.z0 == null) {
            return;
        }
        Bitmap bitmap = this.a.i;
        float f2 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f = ((this.z0.getMeasuredWidth() - (Math.max(this.z0.getMeasuredWidth() / width, this.z0.getMeasuredHeight() / tnbVar.i.getHeight()) * width)) / 2.0f) + this.Z1 + 0.0f;
        } else {
            f = this.Z1 + 0.0f;
        }
        float y = cm1Var.getY() - ((-this.z0.K) + 0.0f);
        int measuredHeight = this.z0.getMeasuredHeight();
        if (this.O1) {
            f2 = this.p1 * this.q1;
        }
        cm1Var.x0 = true;
        cm1Var.w0 = measuredHeight;
        cm1Var.u0 = y;
        cm1Var.v0 = f;
        cm1Var.h2 = f2;
        cm1Var.i2.setColor(on2.p(-16777216, (int) (f2 * 255.0f)));
        cm1Var.invalidate();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b == 2) {
            if (this.c2 && motionEvent != null) {
                if (motionEvent.getY() > a.getCurrentActionBarHeight() + gm.m) {
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
            SharedPreferences d1 = oc7.d1();
            if (!d1.getBoolean("bganimationhint", false)) {
                if (this.C0 == null) {
                    ig5 ig5Var = new ig5(getParentActivity(), 8);
                    this.C0 = ig5Var;
                    ig5Var.setShowingDuration(5000L);
                    this.C0.setAlpha(0.0f);
                    this.C0.setVisibility(4);
                    this.C0.setText(jb6.M0(2131753716, null));
                    this.C0.setExtraTranslationY(gm.L(6.0f));
                    this.m0.addView(this.C0, qoe.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                gm.d3(new b7b(this, d1, (byte) 11), 500L);
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
                    this.T0.g1(i6, (this.R0.getMeasuredWidth() - gm.L(124.0f)) / 2);
                }
            }
        }
        if (b == 1 || b == 2) {
            tsc[] tscVarArr = this.L0;
            if (z3) {
                c = 2;
            } else {
                c = 0;
            }
            tscVarArr[c].setVisibility(0);
        }
        if (i == 1) {
            a01 a01Var = this.V0;
            if (!a01Var.N) {
                float f11 = this.n1;
                if (f11 < 0.0f) {
                    float f12 = -f11;
                    this.n1 = f12;
                    a01Var.setProgress(f12);
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
                    onb onbVar = this.w0;
                    Property property = View.TRANSLATION_Y;
                    if (i == 1) {
                        f8 = -gm.L(21.0f);
                    } else {
                        f8 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(onbVar, property, f8));
                    tsc tscVar = this.L0[2];
                    Property property2 = View.ALPHA;
                    if (z3) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(tscVar, property2, f9));
                    tsc tscVar2 = this.L0[0];
                    if (z3) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(tscVar2, property2, f10));
                    if (i == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], property2, 0.0f));
                    }
                    gm.t1(this.X.F[1]);
                } else if (b == 2) {
                    onb onbVar2 = this.w0;
                    Property property3 = View.TRANSLATION_Y;
                    int i12 = -frameLayoutArr[i].getMeasuredHeight();
                    if (this.C1 == null) {
                        i11 = 0;
                    }
                    int L = gm.L(i11 + 72) + i12;
                    if (W0()) {
                        i4 = gm.n;
                    } else {
                        i4 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(onbVar2, property3, L + i4));
                    tsc tscVar3 = this.L0[2];
                    Property property4 = View.ALPHA;
                    if (z3) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(tscVar3, property4, f7));
                    tsc tscVar4 = this.L0[0];
                    if (z3) {
                        f13 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(tscVar4, property4, f13));
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
                    gm.t1(this.X.F[1]);
                }
            } else {
                onb onbVar3 = this.w0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(onbVar3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], property5, frameLayout2.getMeasuredHeight()));
                tsc tscVar5 = this.L0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(tscVar5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.z0, property6, 1.0f));
            }
            this.t1.playTogether(arrayList2);
            this.t1.addListener(new znb(this, z, i3, i, z3));
            this.t1.setInterpolator(d53.g);
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
                onb onbVar4 = this.w0;
                if (i == 1) {
                    f4 = -gm.L(21.0f);
                } else {
                    f4 = 0.0f;
                }
                onbVar4.setTranslationY(f4);
                tsc tscVar6 = this.L0[2];
                if (z3) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                tscVar6.setAlpha(f5);
                tsc tscVar7 = this.L0[0];
                if (z3) {
                    f6 = 0.0f;
                } else {
                    f6 = 1.0f;
                }
                tscVar7.setAlpha(f6);
                if (i == 1) {
                    frameLayoutArr[i].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i].setAlpha(1.0f);
                    frameLayoutArr[c2].setAlpha(0.0f);
                }
                gm.t1(this.X.F[1]);
            } else if (b == 2) {
                onb onbVar5 = this.w0;
                if (i == 0) {
                    f = 343.0f;
                } else {
                    f = 316.0f;
                }
                int i13 = -gm.L(f);
                if (this.C1 == null) {
                    i11 = 0;
                }
                int L2 = gm.L(i11 + 72) + i13;
                if (W0()) {
                    i2 = gm.n;
                } else {
                    i2 = 0;
                }
                onbVar5.setTranslationY(L2 + i2);
                tsc tscVar8 = this.L0[2];
                if (z3) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                tscVar8.setAlpha(f2);
                tsc tscVar9 = this.L0[0];
                if (z3) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                tscVar9.setAlpha(f3);
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
                gm.t1(this.X.F[1]);
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
        tsc[] tscVarArr2 = this.L0;
        if (!z3) {
            c3 = 2;
        }
        tscVarArr2[c3].setVisibility(4);
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
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gm.n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        fi1 fi1Var = new fi1(this, getParentActivity(), canvas, (this.Q1.getMeasuredWidth() / 2.0f) + f, (this.Q1.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 2);
        this.j2 = fi1Var;
        fi1Var.setOnTouchListener(new w02((byte) 28));
        this.k2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l2 = ofFloat;
        ofFloat.addUpdateListener(new gi1(this, (byte) 3));
        this.l2.addListener(new wnb(this, (byte) 4));
        this.l2.setDuration(400L);
        this.l2.setInterpolator(vt3.e);
        this.l2.start();
        frameLayout.addView(this.j2, new ViewGroup.LayoutParams(-1, -1));
        gm.c3(new gnb(this, (byte) 2));
    }

    public final void m1(boolean z) {
        int i = (this.L1 > 0L ? 1 : (this.L1 == 0L ? 0 : -1));
        if (i > 0) {
            this.B1.c(jb6.M0(2131754177, null));
        } else if (i < 0) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.L1));
            iob iobVar = this.B1;
            if (L0 != null) {
                iobVar.c(jb6.a0(null, null, 2131754178, L0.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < T0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    pn2 pn2Var = this.s1;
                    if (pn2Var == null) {
                        pn2Var = new pn2(2131231981, 0);
                        this.s1 = pn2Var;
                        pn2Var.n = 1;
                    }
                    spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.G(T0(), "ReactionLevelRequiredBtn", new Object[0]));
                    this.B1.b(spannableStringBuilder, z);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.L1 < 0 && !this.V1 && !this.W1 && tL_premium_boostsStatus2 == null) {
                        this.V1 = true;
                        getMessagesController().F0().a(this.L1, new jnb(this, (byte) 1));
                        return;
                    }
                    return;
                }
                this.B1.b(null, z);
                return;
            }
            iobVar.c(jb6.a0(null, null, 2131754178, jb6.M0(2131754904, null).toLowerCase()));
        } else {
            this.B1.c(jb6.M0(2131754179, null));
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
            if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                TLRPC.Photo photo = no6Var.K;
                if (photo != null) {
                    TLRPC.PhotoSize w = bc4.w(photo.sizes, this.J1, true, null, false);
                    bc4.G(this.currentAccount);
                    file = bc4.J(w, null, true, true);
                    str = bc4.r(null, w);
                    i = w.size;
                } else {
                    file = fn5.w(no6Var.C);
                    str = file.getName();
                    i = no6Var.G;
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
            String r = bc4.r(null, tL_wallPaper.document);
            if (!TextUtils.isEmpty(r)) {
                bc4.G(this.currentAccount);
                File J = bc4.J(tL_wallPaper.document, null, true, true);
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
            er3.q(i2).v(this);
            this.z0.invalidate();
            if (b == 2) {
                if (j != 0 && this.L1 == 0) {
                    this.u0.setSubtitle(gm.i0(j, false, false));
                } else {
                    this.u0.setSubtitle(null);
                }
            }
        } else {
            er3.q(i2).a(str, null, this);
            if (b == 2 && this.L1 == 0) {
                this.u0.setSubtitle(jb6.M0(2131748535, null));
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
            iob iobVar = this.B1;
            if (iobVar != null) {
                if (exists) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                iobVar.setAlpha(f);
            }
            iob iobVar2 = this.C1;
            if (iobVar2 != null) {
                if (exists) {
                    f3 = 1.0f;
                }
                iobVar2.setAlpha(f3);
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
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && tk5Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().K(getThemedColor(cmb.g5));
            if (this.b == 2 && this.L1 != 0) {
                this.parentLayout.getBottomSheet().x0(-16777216);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.r3);
        nm7.e().b(this, nm7.m4);
        nm7.e().b(this, nm7.n4);
        getNotificationCenter().b(this, nm7.y5);
        byte b = this.b;
        if (b == 1 || b == 0) {
            nm7.e().b(this, nm7.D4);
        }
        if (b == 2 || b == 1) {
            cmb.N = true;
        }
        if (b == 0 && this.w == null) {
            this.G1 = cmb.h0;
        } else {
            Point point = gm.q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb = new StringBuilder();
            sb.append((int) (min / gm.p));
            sb.append("_");
            this.I1 = hg9.k(sb, (int) (max / gm.p), "_f");
            this.J1 = Math.max(point.x, point.y);
            nm7.e().b(this, nm7.j4);
            nm7.e().b(this, nm7.i4);
            this.v1 = er3.q(this.currentAccount).k();
            if (this.W0 == null) {
                this.W0 = new ArrayList();
                cf7.Y(this.currentAccount).m0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        nm7.f(this.currentAccount).n(this, nm7.r3);
        nm7.e().n(this, nm7.m4);
        nm7.e().n(this, nm7.n4);
        getNotificationCenter().n(this, nm7.y5);
        qw9 qw9Var = this.m0;
        if (qw9Var != null && this.S != null) {
            qw9Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
        }
        byte b = this.b;
        if ((b == 2 || b == 1) && this.r1 == null) {
            gm.c3(new e1b((byte) 5));
        }
        int i = nm7.D4;
        if (b == 2) {
            Bitmap bitmap = this.y1;
            if (bitmap != null) {
                bitmap.recycle();
                this.y1 = null;
            }
            this.a.k(null, null, null);
            nm7.e().k(i, new Object[0]);
        } else if (b == 1 || b == 0) {
            nm7.e().n(this, i);
        }
        if (b != 0 || this.w != null) {
            nm7.e().n(this, nm7.j4);
            nm7.e().n(this, nm7.i4);
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
        cmb.b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        s30 s30Var = this.q0;
        if (s30Var != null) {
            s30Var.f();
        }
        nob nobVar = this.x0;
        if (nobVar != null) {
            nobVar.f();
        }
        if (this.G1) {
            this.x1.b(true);
        }
        cmb.b = true;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            S0();
            try {
                ggc ggcVar = this.l0;
                if (ggcVar != null) {
                    gm.w3(ggcVar, getThemedColor(cmb.r8));
                }
                a01 a01Var = this.V0;
                if (a01Var != null) {
                    a01Var.setOuterColor(getThemedColor(cmb.Lj));
                    this.V0.invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (!z && this.b == 2) {
            this.a.k(null, null, null);
            nm7.e().k(nm7.D4, new Object[0]);
        }
    }

    public final void p1() {
        this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
        this.z0.invalidate();
        this.R0.h1();
        if (this.n1 >= 0.0f) {
            this.z0.getImageReceiver().W(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.z0.getImageReceiver().P(null);
            }
            if (this.z0.getBackground() instanceof ah7) {
                this.z0.getImageReceiver().W(((ah7) this.z0.getBackground()).k);
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
            tsc tscVar = this.L0[0];
            if (this.Y0 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            tscVar.setEnabled(z2);
            if (this.Y0 != null) {
                this.L0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int L = (gm.L(9.0f) + ((FrameLayout.LayoutParams) this.L0[1].getLayoutParams()).width) / 2;
            tsc tscVar2 = this.L0[0];
            Property property = View.ALPHA;
            if (this.Y0 == null) {
                f3 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(tscVar2, property, f3));
            tsc tscVar3 = this.L0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.Y0 != null) {
                f2 = 0.0f;
            } else {
                f2 = L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(tscVar3, property2, f2));
            tsc tscVar4 = this.L0[1];
            if (this.Y0 == null) {
                f4 = -L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(tscVar4, property2, f4));
            animatorSet.setInterpolator(d53.g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new ynb(this));
            animatorSet.start();
            return;
        }
        if (this.Y0 == null && (this.D1 instanceof mtc)) {
            this.L0[2].a(false, true);
        }
        tsc[] tscVarArr = this.L0;
        if (this.Y0 != null) {
            c = 2;
        } else {
            c = 0;
        }
        tscVarArr[c].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        tsc tscVar5 = this.L0[2];
        Property property3 = View.ALPHA;
        if (this.Y0 != null) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tscVar5, property3, f);
        tsc tscVar6 = this.L0[0];
        if (this.Y0 != null) {
            f3 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(tscVar6, property3, f3));
        animatorSet2.addListener(new xnb(this));
        animatorSet2.setInterpolator(d53.g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void r1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rob.r1(boolean):void");
    }

    public final void s1() {
        int childCount = this.R0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.R0.getChildAt(i);
            if (childAt instanceof n08) {
                ((n08) childAt).v(true);
            }
        }
    }

    @Override
    public final void setResourceProvider(ylb ylbVar) {
        this.a.a = ylbVar;
    }

    @Override
    public final void i(long j, long j2) {
    }

    @Override
    public final void l(long j, long j2) {
    }

    public rob(Object obj, Bitmap bitmap, boolean z) {
        super(null);
        this.a = new tnb(this);
        this.d = true;
        this.n = 1;
        plb plbVar = new plb(this, 0, false);
        this.T = plbVar;
        plb plbVar2 = new plb(this, 0, true);
        this.U = plbVar2;
        plb plbVar3 = new plb(this, 1, false);
        this.V = plbVar3;
        plb plbVar4 = new plb(this, 1, true);
        this.W = plbVar4;
        this.Z = -1;
        this.a0 = new gnb(this, (byte) 0);
        this.y0 = new hob[2];
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
        this.U1 = new ou4(getParentActivity(), new cf9(this, (byte) 14));
        this.V1 = false;
        this.W1 = false;
        this.b = (byte) 2;
        this.D1 = obj;
        this.E1 = bitmap;
        this.F1 = z;
        if (obj instanceof mtc) {
            mtc mtcVar = (mtc) obj;
            this.G1 = mtcVar.i;
            TLRPC.TL_wallPaper tL_wallPaper = mtcVar.g;
            this.Y0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f = mtcVar.h;
                this.n1 = f;
                if (f < 0.0f && !cmb.I.o()) {
                    this.n1 *= -1.0f;
                }
            }
        }
        plbVar.v = true;
        plbVar3.v = true;
        plbVar2.v = true;
        plbVar4.v = true;
    }

    public rob(bmb bmbVar) {
        this(bmbVar, false, 0, false, false);
    }
}
