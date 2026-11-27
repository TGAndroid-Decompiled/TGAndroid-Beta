package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class v72 extends f12 implements fn7 {
    public static final int[] R = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public boolean E;
    public int F;
    public dg9 G;
    public int H;
    public fu5 I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public q67 P;
    public final k72 Q;
    public final int n;
    public final pi9 r;
    public final ui9 s;
    public xq2 w;
    public o24 x;
    public boolean y;

    public v72(int i, n12 n12Var, vnb vnbVar, Context context) {
        super(n12Var, vnbVar, context);
        r72 r72Var = new r72(this);
        this.K = true;
        this.Q = new k72(this, (byte) 3);
        this.n = i;
        this.h = true;
        this.f = true;
        pi9 pi9Var = new pi9(context, i, vnbVar, new lh2(this, vnbVar, false, (byte) 15));
        this.r = pi9Var;
        pi9Var.setAdaptiveLinkDialogs(false);
        pi9Var.setAllowTapAboveContent(false);
        addView(pi9Var, tre.e(-1, -1, 119));
        addView(pi9Var.getOverlayView(), tre.e(-1, -1, 119));
        pi9Var.C4();
        ch9 ch9Var = pi9Var.R3;
        if (ch9Var != null) {
            ch9Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        ui9 ui9Var = new ui9(context, r72Var);
        this.s = ui9Var;
        ui9Var.setBackVisible(false);
        ui9Var.setTopGradientVisible(false);
        c0();
        addView(ui9Var, tre.e(-1, -1, 119));
        b0();
        d0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new o72(this, (byte) 0));
    }

    public static void W(Context context, final String str, final pcc pccVar, vnb vnbVar) {
        String str2;
        nx0 h = uh9.h(1, vnbVar, context, true);
        LinearLayout j = uh9.j(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        int L = hl.L(8.0f);
        int i = aob.G6;
        ShapeDrawable b0 = aob.b0(L, aob.p1(0.05f, aob.v0(i, vnbVar)));
        uob K = yob.K(0.05f, i);
        imageView.setBackground(b0);
        yob.j(imageView, b0, K, null, vnbVar);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        j.addView(horizontalScrollView, tre.t(-1, -2, 49, 12, 2, 12, 0));
        c51 i2 = xnb.i(24, vnbVar, context, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        nn0 nn0Var = new nn0(strArr, horizontalScrollView, i2, zArr2, new c(strArr, (byte) 29), imageView, vnbVar, new int[]{6}, (byte) 2);
        final zt3 zt3Var = new zt3(context, ob6.M0(2131754001, null), true, false, -1, vnbVar);
        yt3 yt3Var = zt3Var.d;
        yt3Var.setImeOptions(6);
        yt3Var.setMaxLines(5);
        int L2 = hl.L(24.0f);
        int i3 = aob.d6;
        ShapeDrawable b02 = aob.b0(L2, aob.v0(i3, vnbVar));
        uob M = yob.M(i3);
        zt3Var.setBackground(b02);
        yob.j(zt3Var, b02, M, null, vnbVar);
        zt3Var.setText(strArr[0]);
        yt3Var.addTextChangedListener(new ry(strArr, nn0Var, false, (byte) 3));
        j.addView(zt3Var, tre.t(-1, -2, 55, 12, 8, 12, 0));
        i2.setText(ob6.M0(2131751319, null));
        j.addView(i2, tre.t(-1, 48, 55, 12, 12, 12, 12));
        nn0Var.run();
        h.O = j;
        h.I0 = new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                yt3 yt3Var2 = zt3.this.d;
                yt3Var2.clearFocus();
                hl.t1(yt3Var2);
                boolean[] zArr3 = zArr;
                if (!zArr3[0] && !zArr2[0]) {
                    String[] strArr2 = strArr;
                    if (!TextUtils.equals(str, strArr2[0])) {
                        zArr3[0] = true;
                        pccVar.a(strArr2[0]);
                    }
                }
            }
        };
        h.show();
        int i4 = aob.a7;
        h.t0(i4);
        h.L(i4);
        i2.setOnClickListener(new nh(i2, zArr, pccVar, strArr, h, (byte) 6));
        hl.d3(new i72(zt3Var, (byte) 0), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q = this.b.o3.Q();
        if (Q <= 0) {
            SharedPreferences d1 = uc7.d1();
            Point point = hl.q;
            if (point.x > point.y) {
                str = "kbd_height_land3";
            } else {
                str = "kbd_height";
            }
            Q = d1.getInt(str, hl.L(200.0f));
        }
        if (Q <= 0) {
            Q = hl.L(200.0f);
        }
        return Q + hl.n;
    }

    @Override
    public final void A(int i, boolean z) {
        this.M = z;
        R();
        if (z && this.y && !this.E) {
            Q(false);
        }
        e0();
    }

    @Override
    public final void C(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v72.C(int, int):void");
    }

    @Override
    public final void H(f12 f12Var) {
        this.b.U2.setTitle("");
        this.r.g3.O(false);
        Y(false);
        post(new k72(this, (byte) 4));
    }

    @Override
    public final void J() {
        this.r.A0(0);
    }

    @Override
    public final boolean K(boolean z, int i, int i2, long j, boolean z2) {
        r47 r47Var;
        ou1 ou1Var;
        c5a c5aVar;
        long j2;
        r47 r47Var2;
        nr1 nr1Var;
        xy1 xy1Var;
        nr1 nr1Var2;
        int i3 = this.n;
        boolean D4 = uc7.s1(i3).D4();
        pi9 pi9Var = this.r;
        if (!D4 && !yac.h(i3).p() && uj9.d(pi9Var.t3, pi9Var.u3)) {
            yg9.q0(this.a, getContext(), new m72(pi9Var, (byte) 0), new k72(this, (byte) 2));
            return false;
        }
        if (pi9Var.h3() && !pi9Var.j3()) {
            if (!pi9Var.J3()) {
                ui9 ui9Var = this.s;
                if (ui9Var != null) {
                    ui9Var.setSendEnabled(pi9Var.J3());
                    return false;
                }
            } else {
                boolean D42 = uc7.s1(i3).D4();
                n12 n12Var = this.b;
                if (!D42) {
                    e eVar = n12Var.Z1;
                    if ((eVar instanceof zu1) && (nr1Var2 = ((zu1) eVar).a0) != null) {
                        nr1Var2.D1(uj9.g(pi9Var.t3), z, i, i2);
                        n12Var.a(true);
                        return true;
                    }
                } else {
                    ArrayList W2 = pi9Var.W2();
                    if (!W2.isEmpty()) {
                        ArrayList y2 = pi9Var.y2();
                        ArrayList v2 = pi9Var.v2();
                        ArrayList a = tj9.a(i3, W2);
                        e eVar2 = n12Var.Z1;
                        if (eVar2 instanceof zu1) {
                            zu1 zu1Var = (zu1) eVar2;
                            r47 r47Var3 = zu1Var.F5;
                            r47 r47Var4 = zu1Var.m4;
                            ou1 ou1Var2 = zu1Var.D5;
                            long k7 = zu1Var.k7();
                            c5aVar = zu1Var.X6();
                            r47Var = r47Var4;
                            ou1Var = ou1Var2;
                            j2 = k7;
                            r47Var2 = r47Var3;
                        } else {
                            r47Var = null;
                            ou1Var = null;
                            c5aVar = null;
                            j2 = 0;
                            r47Var2 = null;
                        }
                        r7a.Q(k5.a(n12Var.G3), W2, y2, v2, a, n12Var.W0(), r47Var2, r47Var, ou1Var, z, i, i2, c5aVar, j, j2, 0L);
                        e eVar3 = n12Var.Z1;
                        if ((eVar3 instanceof zu1) && (nr1Var = ((zu1) eVar3).a0) != null && (xy1Var = nr1Var.O3) != null) {
                            xy1Var.x(null, z, i, i2, 0L);
                        }
                        n12Var.a(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean M() {
        return !this.r.h3();
    }

    public final void O(fu5 fu5Var, mk0 mk0Var, TL_iv.PageBlock pageBlock, int i, String str, int i2, fu5 fu5Var2) {
        boolean z;
        if (mk0Var != null && mk0Var.b.getClass() == pageBlock.getClass()) {
            z = true;
        } else {
            z = false;
        }
        fu5Var.i(z, i, null, str, new ao1(this, mk0Var, pageBlock, fu5Var2, (byte) 7));
        fu5Var.z().a.setTypeface(hl.n1("fonts/mw_bold.ttf"));
        fu5Var.z().a.setTextSize(1, i2);
    }

    public final boolean P() {
        pi9 pi9Var = this.r;
        if (pi9Var == null || !pi9Var.h3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = ob6.M0(2131753986, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131753987, null);
        alertDialog$Builder.g(ob6.M0(2131751563, null), new fd(this) {
            public final v72 b;

            {
                this.b = this;
            }

            @Override
            public final void w(id idVar2, int i) {
                byte b = r2;
                v72 v72Var = this.b;
                switch (b) {
                    case 0:
                        v72Var.b.dismiss();
                        return;
                    default:
                        v72Var.T();
                        v72Var.b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.j(ob6.M0(2131745674, null), new fd(this) {
            public final v72 b;

            {
                this.b = this;
            }

            @Override
            public final void w(id idVar2, int i) {
                byte b = r2;
                v72 v72Var = this.b;
                switch (b) {
                    case 0:
                        v72Var.b.dismiss();
                        return;
                    default:
                        v72Var.T();
                        v72Var.b.dismiss();
                        return;
                }
            }
        });
        alertDialog$Builder.c(-2);
        alertDialog$Builder.o();
        return false;
    }

    public final void Q(boolean z) {
        if (this.E) {
            this.E = false;
            o24 o24Var = this.x;
            if (o24Var != null) {
                o24Var.r(false);
                if (!z) {
                    this.x.z();
                }
            }
        }
        this.G = null;
        o24 o24Var2 = this.x;
        if (o24Var2 != null) {
            o24Var2.setTranslationY(0.0f);
            this.x.setVisibility(8);
        }
        this.y = false;
        this.F = 0;
        ui9 ui9Var = this.s;
        if (ui9Var != null) {
            ui9Var.setEmojiOpened(false);
        }
        Y(false);
        requestLayout();
    }

    public final void R() {
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        float f3;
        if (this.E) {
            i = hl.L(245.0f);
        } else {
            i = this.F;
        }
        o24 o24Var = this.x;
        float f4 = 0.0f;
        n12 n12Var = this.b;
        if (o24Var != null) {
            if (this.y) {
                float f5 = this.F - i;
                if (this.E) {
                    f3 = -n12Var.i4;
                } else {
                    f3 = 0.0f;
                }
                f2 = f5 + f3;
            } else {
                f2 = 0.0f;
            }
            o24Var.setTranslationY(f2);
        }
        ui9 ui9Var = this.s;
        if (ui9Var != null) {
            boolean z = this.y;
            if (z) {
                f = i;
            } else {
                if (!this.M && this.F <= 0) {
                    i2 = hl.n;
                } else {
                    i2 = 0;
                }
                f = i2;
            }
            if (!z || this.E) {
                f += n12Var.i4;
            }
            ui9Var.getBottomContainer().animate().cancel();
            ui9Var.getBottomContainer().setTranslationY(-f);
            boolean z2 = this.y;
            if (z2) {
                f4 = i;
            }
            if (!z2 || this.E) {
                f4 += n12Var.i4;
            }
            ui9Var.setBottomGradientTranslationY(-f4);
            if (this.N != this.L) {
                ViewPropertyAnimator animate = ui9Var.getBottomInnerContainer().animate();
                this.N = this.L;
                animate.translationY(-i3).setDuration(320L).setInterpolator(k43.h).start();
            }
        }
    }

    public final void S(int i, int i2) {
        n12 n12Var = this.b;
        if (n12Var.Z1 == null) {
            return;
        }
        n12 n12Var2 = new n12(getContext(), n12Var.Z1, false, false, true, this.a);
        n12Var2.W3 = new s72(this, n12Var2);
        n12Var2.d2.g0();
        n12Var2.u1(1, true);
        n12Var2.Q0(i);
        n12Var2.t4 = new l72(this, n12Var2);
        n12Var2.S1 = new l72(this, n12Var2);
        n12Var2.R1 = new t72(this, n12Var2);
        n12Var2.a1();
        if (i2 != 0) {
            n12Var2.k1(i2);
        }
        n12Var2.w0(true);
        n12Var2.show();
    }

    public final boolean T() {
        e eVar = this.b.Z1;
        if (eVar instanceof zu1) {
            zu1 zu1Var = (zu1) eVar;
            pi9 pi9Var = this.r;
            if (!pi9Var.n2()) {
                return false;
            }
            TL_iv.RichMessage f2 = pi9Var.f2();
            ls6.d0(k5.a(this.n).a).T1(zu1Var.a(), zu1Var.N5(zu1Var.F5), "", null, null, null, null, 0L, false, false, f2);
            nr1 nr1Var = zu1Var.a0;
            if (nr1Var != null) {
                nr1Var.setRichDraftPreview(f2);
                return true;
            }
            return true;
        }
        return false;
    }

    public final dg9 U() {
        pi9 pi9Var = this.r;
        dg9 focusedEditTextOrNull = pi9Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            this.G = focusedEditTextOrNull;
            this.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        dg9 dg9Var = this.G;
        if (dg9Var != null) {
            return dg9Var;
        }
        return pi9Var.M2();
    }

    public final int V(dg9 dg9Var) {
        if (dg9Var == this.G && this.r.getFocusedEditTextOrNull() != dg9Var) {
            return Math.min(this.H, dg9Var.length());
        }
        return Math.max(0, dg9Var.getSelectionEnd());
    }

    public final void X() {
        boolean z = this.y;
        pi9 pi9Var = this.r;
        if (z) {
            dg9 M2 = pi9Var.M2();
            if (M2 != null) {
                M2.O();
                hl.E3(M2);
            }
            Q(true);
            return;
        }
        if (this.x == null) {
            n12 n12Var = this.b;
            o24 o24Var = new o24(n12Var.Z1, true, false, false, getContext(), true, null, n12Var.o3, true, this.a, false, false);
            this.x = o24Var;
            o24Var.setVisibility(8);
            o24 o24Var2 = this.x;
            o24Var2.x2 = false;
            o24Var2.setBottomInset(hl.n);
            View view = this.x.w;
            if (view != null) {
                view.setVisibility(8);
            }
            this.x.setDelegate(new u72(this));
            addView(this.x, tre.e(-1, getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        this.x.setLayoutParams(layoutParams);
        this.x.setTranslationY(0.0f);
        this.x.setVisibility(0);
        this.y = true;
        this.F = emojiPanelHeight;
        dg9 M22 = pi9Var.M2();
        if (M22 != null) {
            hl.t1(M22);
        }
        ui9 ui9Var = this.s;
        if (ui9Var != null) {
            ui9Var.setEmojiOpened(true);
        }
        Y(false);
        requestLayout();
    }

    public final void Y(boolean z) {
        boolean z2;
        int i;
        int i2 = 0;
        if (!this.r.h3() && !this.y) {
            z2 = false;
        } else {
            z2 = true;
        }
        n12 n12Var = this.b;
        m02 m02Var = n12Var.u3;
        if (n12Var.u4 != z2) {
            n12Var.u4 = z2;
            if (n12Var.P2) {
                m02Var.animate().cancel();
                if (!z2) {
                    m02Var.setVisibility(0);
                }
                float f = 1.0f;
                float f2 = 0.0f;
                if (z) {
                    ViewPropertyAnimator animate = m02Var.animate();
                    if (z2) {
                        f = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f);
                    if (z2) {
                        f2 = hl.L(48.0f);
                    }
                    alpha.translationY(f2).setDuration(180L).withEndAction(new h02(n12Var, z2, (byte) 3)).start();
                } else {
                    if (z2) {
                        f = 0.0f;
                    }
                    m02Var.setAlpha(f);
                    if (z2) {
                        f2 = hl.L(48.0f);
                    }
                    m02Var.setTranslationY(f2);
                    if (z2) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    m02Var.setVisibility(i);
                }
            }
        }
        if (!z2 && !n12Var.L1 && n12Var.P2) {
            i2 = hl.L(62.0f);
        }
        this.L = i2;
        R();
        if (this.K == z2) {
            this.K = !z2;
            requestLayout();
        }
    }

    public final void Z() {
        boolean z;
        int i = 0;
        if (!this.r.h3() && !this.y) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            n12 n12Var = this.b;
            if (!n12Var.L1 && n12Var.P2) {
                i = hl.L(62.0f);
            }
        }
        if (this.L != i) {
            this.L = i;
            R();
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v72.a0():void");
    }

    public final void b0() {
        boolean z;
        float f;
        ui9 ui9Var = this.s;
        if (ui9Var != null) {
            pi9 pi9Var = this.r;
            boolean n2 = pi9Var.n2();
            ch9 ch9Var = pi9Var.R3;
            if (ch9Var != null && !ch9Var.c.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            ImageView imageView = ui9Var.r;
            ImageView imageView2 = ui9Var.n;
            imageView2.setEnabled(n2);
            float f2 = 0.35f;
            if (n2) {
                f = 1.0f;
            } else {
                f = 0.35f;
            }
            imageView2.setAlpha(f);
            imageView.setEnabled(z);
            if (z) {
                f2 = 1.0f;
            }
            imageView.setAlpha(f2);
        }
    }

    public final void c0() {
        boolean z;
        ui9 ui9Var = this.s;
        if (ui9Var != null) {
            int i = this.n;
            boolean z2 = false;
            if (!uc7.s1(i).D4() && !yac.h(i).p()) {
                z = true;
            } else {
                z = false;
            }
            bz1 sendButton = ui9Var.getSendButton();
            if (z) {
                pi9 pi9Var = this.r;
                if (uj9.d(pi9Var.t3, pi9Var.u3)) {
                    z2 = true;
                }
            }
            sendButton.setLocked(z2);
            ui9Var.setPremiumLocked(z);
        }
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v72.d0():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.i5) {
            c0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        pi9 pi9Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.Z1 instanceof zu1) && pi9Var.n2() && T()) {
                bs2.v(null, 2131745730, new d31(this.s, this.a), 2131623990, 36);
                return true;
            }
        } else if (!pi9Var.e3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        o24 o24Var;
        pi9 pi9Var = this.r;
        di9 di9Var = pi9Var.v3;
        lmb lmbVar = pi9Var.w3;
        if (!di9Var.w() || !lmbVar.onTouchEvent(motionEvent)) {
            if (this.E && (o24Var = this.x) != null) {
                height = (int) o24Var.getY();
            } else {
                height = getHeight() - this.F;
            }
            int L = (height - hl.L(60.0f)) - this.L;
            if (motionEvent.getAction() == 0 && this.y && motionEvent.getY() < L) {
                Q(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > hl.L(60.0f) && motionEvent.getY() < L)) && lmbVar.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < L && pi9Var.f3(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0() {
        int i;
        ui9 ui9Var = this.s;
        if (ui9Var == null) {
            return;
        }
        int currentActionBarHeight = (((a.getCurrentActionBarHeight() - hl.L(44.0f)) / 2) + hl.m) - hl.L(8.0f);
        pi9 pi9Var = this.r;
        if (pi9Var.getChildCount() <= 0) {
            i = pi9Var.getPaddingTop();
        } else {
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < pi9Var.getChildCount(); i3++) {
                View childAt = pi9Var.getChildAt(i3);
                if (RecyclerView.S(childAt) >= 0 && childAt.getTop() < i2) {
                    i2 = childAt.getTop();
                }
            }
            if (i2 == Integer.MAX_VALUE) {
                i = pi9Var.getPaddingTop();
            } else {
                i = i2;
            }
        }
        ui9Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i));
    }

    @Override
    public int getCurrentItemTop() {
        pi9 pi9Var = this.r;
        if (pi9Var.getChildCount() <= 0) {
            int paddingTop = pi9Var.getPaddingTop();
            this.J = paddingTop;
            pi9Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z = false;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < pi9Var.getChildCount(); i2++) {
            View childAt = pi9Var.getChildAt(i2);
            int S = RecyclerView.S(childAt);
            if (S == 0) {
                z = true;
            }
            if (S >= 0 && childAt.getTop() < i) {
                i = childAt.getTop();
            }
        }
        if (i == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        pi9Var.setTopGlowOffset(Math.max(0, i));
        int i3 = i - hl.m;
        int L = hl.L(7.0f);
        if (i3 < hl.L(7.0f) || !z) {
            i3 = L;
        }
        this.J = i3;
        return i3;
    }

    @Override
    public int getFirstOffset() {
        return hl.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - hl.m) - a.getCurrentActionBarHeight();
    }

    public amb getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final boolean k() {
        boolean z = this.E;
        if (z) {
            if (z) {
                this.E = false;
                o24 o24Var = this.x;
                if (o24Var != null) {
                    o24Var.r(false);
                    this.x.z();
                }
                R();
                return false;
            }
        } else if (this.y) {
            Q(false);
            return false;
        } else if (!this.r.C2() && !P()) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(float f) {
        R();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.n).b(this, jn7.i5);
        c0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.n).n(this, jn7.i5);
    }

    @Override
    public final void p() {
        q67 q67Var = this.P;
        if (q67Var != null) {
            q67Var.g();
            this.P = null;
        }
        xq2 xq2Var = this.w;
        if (xq2Var != null) {
            xq2Var.n();
        }
        pi9 pi9Var = this.r;
        if (pi9Var != null) {
            pi9Var.s2();
        }
        o24 o24Var = this.x;
        if (o24Var != null) {
            o24Var.A();
        }
    }

    @Override
    public final boolean q() {
        pi9 pi9Var = this.r;
        if (pi9Var != null) {
            pi9Var.s2();
            return false;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        if (!P()) {
            return false;
        }
        return true;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }

    @Override
    public final void v() {
        xq2 xq2Var = this.w;
        if (xq2Var != null) {
            xq2Var.n();
        }
        if (this.y) {
            Q(false);
        }
    }

    @Override
    public final void z() {
        boolean z;
        if (this.b.o3.Q() > hl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        this.M = z;
        R();
        e0();
    }

    @Override
    public final void u() {
    }
}
