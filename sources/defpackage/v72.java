package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PhotoViewer;
public final class v72 extends a22 implements vlb, dla, jm7 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final ig5 E;
    public int E0;
    public e34 F;
    public int F0;
    public final mx5 G;
    public int G0;
    public boolean H;
    public int H0;
    public boolean I;
    public int I0;
    public final boolean J;
    public int J0;
    public final int K;
    public int K0;
    public final CharSequence[] L;
    public int L0;
    public final boolean[] M;
    public int M0;
    public int N;
    public final dbc N0;
    public Editable O;
    public final dbc O0;
    public Editable P;
    public final dbc[] P0;
    public Editable Q;
    public final ArrayList Q0;
    public final jvc R;
    public int R0;
    public boolean S;
    public int S0;
    public boolean T;
    public final int T0;
    public boolean U;
    public final int[] U0;
    public int V;
    public final o1 V0;
    public int W;
    public boolean W0;
    public int X0;
    public boolean Y0;
    public int Z0;
    public boolean a0;
    public boolean a1;
    public boolean b0;
    public boolean b1;
    public boolean c0;
    public int c1;
    public boolean d0;
    public int d1;
    public boolean e0;
    public int e1;
    public final boolean f0;
    public boolean f1;
    public boolean g0;
    public boolean g1;
    public boolean h0;
    public ng8 h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public u72 k0;
    public final Paint k1;
    public int l0;
    public e51 l1;
    public boolean m0;
    public int m1;
    public final boolean n;
    public int n0;
    public final wf8 n1;
    public int o0;
    public Drawable o1;
    public int p0;
    public Drawable p1;
    public int q0;
    public int q1;
    public final s30 r;
    public int r0;
    public int r1;
    public final smb s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final l72 w;
    public int w0;
    public final l32 x;
    public int x0;
    public final n72 y;
    public int y0;
    public int z0;

    public v72(i22 i22Var, Context context, boolean z, ylb ylbVar, Boolean bool) {
        super(i22Var, ylbVar, context);
        this.N = 1;
        this.S = true;
        this.T = true;
        this.U = true;
        this.c0 = true;
        this.g0 = true;
        this.h0 = true;
        this.l0 = -1;
        dbc dbcVar = new dbc(this);
        this.N0 = dbcVar;
        dbc dbcVar2 = new dbc(this);
        this.O0 = dbcVar2;
        this.P0 = new dbc[]{dbcVar, dbcVar2};
        ArrayList arrayList = new ArrayList();
        this.Q0 = arrayList;
        this.U0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.V0 = new o1(this, (byte) 17);
        this.W0 = false;
        this.X0 = -1;
        this.i1 = false;
        this.j1 = false;
        Paint paint = new Paint(1);
        this.k1 = paint;
        this.n1 = new wf8();
        this.n = z;
        int answersMaxCount = getAnswersMaxCount();
        this.K = answersMaxCount;
        this.L = new CharSequence[answersMaxCount];
        this.M = new boolean[answersMaxCount];
        boolean p = z8c.h(j5.a(this.b.G3).a).p();
        this.J = p;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.d0 = booleanValue;
            this.f0 = booleanValue;
            boolean z2 = !booleanValue;
            this.U = z2;
            this.S = z2;
        }
        n0();
        paint.setColor(cmb.v0(cmb.Xl, this.a));
        this.b.o3.setDelegate(this);
        s30 s30Var = new s30(this, context, (byte) 1);
        this.r = s30Var;
        smb smbVar = new smb(context, null, (byte) 3);
        this.s = smbVar;
        setBlur3Capture(smbVar);
        this.d = smbVar;
        this.h = true;
        this.f = true;
        l72 l72Var = new l72(this);
        this.w = l72Var;
        smbVar.setItemAnimator(l72Var);
        arrayList.clear();
        l72Var.m = false;
        l72Var.C = false;
        l72Var.o(d53.h);
        l72Var.n(350L);
        smbVar.setClipToPadding(false);
        smbVar.setVerticalScrollBarEnabled(false);
        smbVar.setSections(true);
        l32 l32Var = new l32(this, gm.L(65.0f) + gm.m, smbVar, (byte) 3);
        this.x = l32Var;
        smbVar.setLayoutManager(l32Var);
        l32Var.O = true;
        new hu5(new r20(this, (byte) 3)).h(smbVar);
        addView(smbVar, qoe.e(-1, -1, 51));
        smbVar.setPreserveFocusAfterLayout(true);
        smbVar.setAdapter(s30Var);
        smbVar.setOnItemClickListener(new c72(this, ylbVar, i22Var, context));
        smbVar.setOnScrollListener(new y(this, (byte) 22));
        ig5 ig5Var = new ig5(context, 4);
        this.E = ig5Var;
        ig5Var.setAlpha(0.0f);
        ig5Var.setVisibility(4);
        addView(ig5Var, qoe.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.T0 = oc7.r1(this.b.G3).l4.N.f();
        this.R = new jvc(this.b.G3);
        nm7.f(this.b.G3).b(this, nm7.w0);
        if (p) {
            nm7.e().b(this, nm7.m4);
            ?? fdbVar = new fdb(context, this.b.G3, null, ylbVar);
            this.y = fdbVar;
            fdbVar.E = true;
            fdbVar.F = true;
            fdbVar.setHorizontalPadding(gm.L(24.0f));
            addView((View) fdbVar, qoe.e(-2, 160, 51));
        }
        this.G = new mx5(this.b.o3, false, null);
        S();
    }

    public static CharSequence Y(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence m1 = gm.m1(charSequence);
        while (TextUtils.indexOf(m1, "\n\n\n") >= 0) {
            m1 = TextUtils.replace(m1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(m1, "\n\n\n") == 0) {
            m1 = TextUtils.replace(m1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return m1;
    }

    public static e51 g0(d dVar, int i, qac qacVar, fo1 fo1Var) {
        if (dVar == null) {
            return null;
        }
        e51 e51Var = new e51(dVar.getContext(), dVar, dVar.getResourceProvider(), fo1Var);
        e51Var.W3 = new i72(e51Var, qacVar, dVar);
        e51Var.X3 = new j72(qacVar, e51Var);
        e51Var.d2.h0();
        e51Var.t1(1, true);
        e51Var.P0(i);
        e51Var.t4 = new a72(qacVar, (byte) 0);
        e51Var.R1 = new k72(e51Var, qacVar, dVar);
        e51Var.S1 = new g11(qacVar, e51Var, (byte) 28);
        e51Var.Z0();
        e51Var.v0(true);
        e51Var.show();
        return e51Var;
    }

    private int getAnswersMaxCount() {
        if (this.n) {
            return getMessagesController().l4.x3.f();
        }
        return getMessagesController().l4.K.f();
    }

    private int getCurrentAccount() {
        i22 i22Var = this.b;
        if (i22Var != null) {
            return i22Var.G3;
        }
        return z8c.t0;
    }

    private oc7 getMessagesController() {
        return oc7.r1(getCurrentAccount());
    }

    @Override
    public final void A() {
        s30 s30Var = this.r;
        if (s30Var != null) {
            s30Var.f();
        }
        if (this.J) {
            Z(false);
            n72 n72Var = this.y;
            if (n72Var != null) {
                n72Var.e();
            }
            ng8 ng8Var = this.h1;
            if (ng8Var != null) {
                ng8Var.setEmojiButtonVisibility(false);
                this.h1.getTextView().clearFocus();
                gm.t1(this.h1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v72.B(int, int):void");
    }

    @Override
    public final void H(a22 a22Var) {
        i22 i22Var = this.b;
        try {
            i22Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.n) {
            i22Var.U2.setTitle(jb6.M0(2131743739, null));
        } else if (this.f0) {
            i22Var.U2.setTitle(jb6.M0(2131748021, null));
        } else {
            i22Var.U2.setTitle(jb6.M0(2131748022, null));
        }
        i22Var.G1();
        this.x.g1(0, 0);
    }

    @Override
    public final void J() {
        this.s.z0(1);
    }

    @Override
    public final void L(int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        int L;
        if (this.J) {
            if (i > gm.L(50.0f) && this.f1 && !gm.E && !gm.O1()) {
                if (z) {
                    this.e1 = i;
                    oc7.c1().edit().putInt("kbd_height_land3", this.e1).commit();
                } else {
                    this.d1 = i;
                    oc7.c1().edit().putInt("kbd_height", this.d1).commit();
                }
            }
            boolean z4 = this.b1;
            i22 i22Var = this.b;
            mx5 mx5Var = this.G;
            if (z4) {
                if (z) {
                    i2 = this.e1;
                } else {
                    i2 = this.d1;
                }
                if (this.i1) {
                    i2 += gm.L(120.0f);
                }
                int i3 = i2 + gm.n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
                int i4 = layoutParams.width;
                int i5 = gm.q.x;
                if (i4 != i5 || layoutParams.height != i3 || this.j1 != this.i1) {
                    layoutParams.width = i5;
                    layoutParams.height = i3;
                    this.F.setLayoutParams(layoutParams);
                    this.c1 = layoutParams.height;
                    mx5Var.a();
                    i22Var.o3.requestLayout();
                    boolean z5 = this.j1;
                    if (z5 != this.i1) {
                        if (z5) {
                            L = -gm.L(120.0f);
                        } else {
                            L = gm.L(120.0f);
                        }
                        P(L);
                    }
                    this.j1 = this.i1;
                }
            }
            if (this.Z0 != i || this.a1 != z) {
                this.Z0 = i;
                this.a1 = z;
                boolean z6 = this.f1;
                ng8 ng8Var = this.h1;
                if (ng8Var != null) {
                    if (ng8Var.getEditField().isFocused() && mx5Var.c() && i > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f1 = z2;
                } else {
                    this.f1 = false;
                    z2 = false;
                }
                if (z2 && this.b1) {
                    j0(0);
                }
                if (this.c1 != 0 && !(z3 = this.f1) && z3 != z6 && !this.b1) {
                    this.c1 = 0;
                    mx5Var.a();
                    i22Var.o3.requestLayout();
                }
                if (this.f1 && this.H) {
                    this.H = false;
                    gm.r(this.V0);
                }
            }
        }
    }

    public final void O() {
        n72 n72Var = this.y;
        if (n72Var != null) {
            n72Var.setDelegate(null);
            n72Var.e();
        }
        this.s.setItemAnimator(this.w);
        int i = this.N;
        this.M[i] = false;
        int i2 = i + 1;
        this.N = i2;
        int length = this.L.length;
        s30 s30Var = this.r;
        if (i2 == length) {
            s30Var.s(this.v0);
        }
        s30Var.i(this.v0);
        n0();
        this.l0 = (this.u0 + this.N) - 1;
        s30Var.g(this.w0);
        s30Var.g(this.B0);
    }

    public final void P(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new go1(this, f, (byte) 3));
        ofFloat.addListener(new e72(this, (byte) 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(gb.w);
        ofFloat.start();
    }

    public final void Q() {
        boolean z;
        if (!this.d0 && !this.b0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.U = false;
        }
        int i = this.D0;
        if (i < 0) {
            return;
        }
        u69 K = this.s.K(i);
        if (K == null) {
            this.r.g(this.D0);
            return;
        }
        lg8 lg8Var = (lg8) K.a;
        if (!z) {
            lg8Var.setChecked(false);
        }
        lg8Var.getCheckBox().a.a(!z, true);
    }

    public final boolean R() {
        boolean z;
        int i;
        int i2;
        if (TextUtils.isEmpty(Y(this.O)) && TextUtils.isEmpty(Y(this.P)) && TextUtils.isEmpty(Y(this.Q)) && this.n1.a.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i3 = 0; i3 < this.N && (z = TextUtils.isEmpty(Y(this.L[i3]))); i3++) {
            }
        }
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.Z1.getParentActivity());
            boolean z2 = this.n;
            if (z2) {
                i = 2131752520;
            } else {
                i = 2131752526;
            }
            String M0 = jb6.M0(i, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            if (z2) {
                i2 = 2131752521;
            } else {
                i2 = 2131752527;
            }
            heVar.U = jb6.M0(i2, null);
            alertDialog$Builder.j(jb6.M0(2131747313, null), new cd1(this, (byte) 20));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.o();
        }
        return z;
    }

    public final void S() {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2 = this.d0;
        CharSequence[] charSequenceArr = this.L;
        boolean z3 = false;
        if (z2) {
            int i4 = 0;
            i = 0;
            while (true) {
                boolean[] zArr = this.M;
                if (i4 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(Y(charSequenceArr[i4])) && zArr[i4]) {
                    i++;
                }
                i4++;
            }
        } else {
            i = 0;
        }
        if (this.n) {
            i2 = getMessagesController().l4.H2.f();
            i3 = getMessagesController().l4.I2.f();
        } else {
            i2 = 255;
            i3 = 100;
        }
        if ((TextUtils.isEmpty(Y(this.P)) || this.P.length() <= this.T0) && ((TextUtils.isEmpty(Y(this.Q)) || this.Q.length() <= 200) && !TextUtils.isEmpty(Y(this.O)) && this.O.length() <= i2)) {
            z = true;
        } else {
            z = false;
        }
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (true) {
            if (i5 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(Y(charSequenceArr[i5]))) {
                if (charSequenceArr[i5].length() > i3) {
                    i6 = 0;
                    z4 = true;
                    break;
                }
                i6++;
                z4 = true;
            }
            i5++;
        }
        if (i6 < 1 || (this.d0 && i < 1)) {
            z = false;
        }
        if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.P) && !z4 && this.n1.a.size() <= 0) {
            this.i0 = true;
            z3 = true;
        } else {
            this.i0 = false;
        }
        i22 i22Var = this.b;
        i22Var.r0 = z3;
        this.Y0 = z;
        i22Var.G1();
    }

    public final void T(xib xibVar, boolean z) {
        if (this.W != 0) {
            xibVar.q(jb6.M0(2131746863, null), jb6.Q(this.W), z, false);
        } else if (this.V != 0) {
            xibVar.q(jb6.M0(2131746865, null), jb6.G(this.V / 3600, "Hours", new Object[0]), z, false);
        } else {
            xibVar.q(jb6.M0(2131746863, null), null, z, false);
        }
    }

    public final void U(sf8 sf8Var, boolean z) {
        boolean z2;
        TLRPC.Photo photo;
        String str = sf8Var.b;
        jvc jvcVar = this.R;
        boolean containsKey = jvcVar.c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) jvcVar.b.get(sf8Var.b);
        fn0 fn0Var = sf8Var.s;
        ImageReceiver imageReceiver = sf8Var.a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z2 = false;
        } else {
            z2 = true;
        }
        sf8Var.r.a(z2, z);
        sf8Var.n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w = bc4.w(photo.sizes, 40, false, null, false);
            imageReceiver.Z(gn5.f(bc4.w(webPage.photo.sizes, gm.L(36.0f), false, w, true), webPage.photo), "48_48", gn5.f(w, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            fn0Var.a(true, z);
            return;
        }
        fn0Var.a(false, z);
        imageReceiver.f();
    }

    public final void W() {
        if (this.i1) {
            this.F.r(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams.height -= gm.L(120.0f);
            this.F.setLayoutParams(layoutParams);
            this.c1 = layoutParams.height;
            this.j1 = this.i1;
            this.i1 = false;
            P(-gm.L(120.0f));
        }
    }

    public final void X(android.view.View r10, defpackage.ng8 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v72.X(android.view.View, ng8, boolean):void");
    }

    public final void Z(boolean z) {
        if (this.J) {
            if (this.b1) {
                e34 e34Var = this.F;
                e34Var.Q.D0();
                e34Var.J.scrollTo(0, 0);
                e34Var.C(1);
                e34Var.R.g1(0, 0);
                this.F.r(false);
                if (z) {
                    this.F.y();
                }
                this.i1 = false;
                j0(0);
            }
            if (z) {
                e34 e34Var2 = this.F;
                if (e34Var2 != null && e34Var2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.F.getMeasuredHeight());
                    ofFloat.addUpdateListener(new b72(this, (byte) 0));
                    this.g1 = true;
                    ofFloat.addListener(new e72(this, (byte) 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(gb.w);
                    ofFloat.start();
                    return;
                }
                a0();
            }
        }
    }

    public final void a0() {
        e34 e34Var;
        d02 emojiButton;
        if (!this.b1 && (e34Var = this.F) != null && e34Var.getVisibility() != 8) {
            ng8 ng8Var = this.h1;
            if (ng8Var != null && (emojiButton = ng8Var.getEmojiButton()) != null) {
                emojiButton.j(b02.e, false);
            }
            this.F.setVisibility(8);
        }
        int i = this.c1;
        this.c1 = 0;
        if (i != 0) {
            this.G.a();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Yl));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.Li));
        hashSet.add(Integer.valueOf(cmb.G6));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.Z6));
        hashSet.add(Integer.valueOf(cmb.a7));
    }

    public final void b0(ng8 ng8Var, boolean z) {
        u69 T;
        if (this.J && z) {
            if (this.h1 == ng8Var && this.b1 && this.i1) {
                W();
                this.b1 = false;
            }
            ng8 ng8Var2 = this.h1;
            this.h1 = ng8Var;
            ng8Var.setEmojiButtonVisibility(true);
            d02 emojiButton = ng8Var.getEmojiButton();
            b02 b02Var = b02.e;
            emojiButton.j(b02Var, false);
            smb smbVar = this.s;
            View F = smbVar.F(ng8Var);
            if (F == null) {
                T = null;
            } else {
                T = smbVar.T(F);
            }
            n72 n72Var = this.y;
            if (n72Var != null) {
                n72Var.e();
                if (T != null) {
                    View view = T.a;
                    if ((view instanceof ng8) && n72Var.getDelegate() != view) {
                        n72Var.setDelegate((ng8) view);
                    }
                }
            }
            if (ng8Var2 != null && ng8Var2 != ng8Var) {
                if (this.b1) {
                    W();
                    Z(false);
                    f0();
                }
                ng8Var2.setEmojiButtonVisibility(false);
                ng8Var2.getEmojiButton().j(b02Var, false);
            }
        }
    }

    public final void c0(ng8 ng8Var) {
        this.h1 = ng8Var;
        if (this.b1) {
            W();
            f0();
            return;
        }
        j0(1);
    }

    public final void d0(int i) {
        int i2;
        this.m1 = i;
        d dVar = this.b.Z1;
        this.n1.b(i);
        if (i != -2 && i != -3) {
            i2 = 41026;
        } else {
            i2 = 74;
        }
        this.l1 = g0(dVar, i2, new y62(this, i, (byte) 0), new fo1(this, (byte) 24));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i == nm7.w0) {
            vh6 vh6Var = (vh6) objArr[0];
            for (Map.Entry entry : this.R.b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) vh6Var.f(((TLRPC.WebPage) entry.getValue()).id)) != null) {
                    entry.setValue(webPage);
                }
            }
            wf8 wf8Var = this.n1;
            int size = wf8Var.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                nf8 nf8Var = (nf8) wf8Var.a.get(i3);
                if (nf8Var instanceof sf8) {
                    U((sf8) nf8Var, true);
                }
            }
        } else if (i == nm7.m4) {
            e34 e34Var = this.F;
            if (e34Var != null) {
                e34Var.Q.h1();
            }
            ng8 ng8Var = this.h1;
            if (ng8Var != null) {
                int currentTextColor = ng8Var.getEditField().getCurrentTextColor();
                this.h1.getEditField().setTextColor(-1);
                this.h1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i) {
        i22 i22Var;
        d dVar;
        wf8 wf8Var = this.n1;
        if (wf8Var.b(i) != null) {
            nf8 b = wf8Var.b(i);
            if (b != null && (i22Var = this.b) != null && (dVar = i22Var.Z1) != null) {
                Activity parentActivity = dVar.getParentActivity();
                if (b instanceof rf8) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((rf8) b).b);
                    PhotoViewer.r0().T1(parentActivity, null, null);
                    PhotoViewer.r0().o1(arrayList, 0, 14, false, new f72(this, i), null);
                    return;
                }
                int i2 = 0;
                if (b instanceof xf8) {
                    xf8 xf8Var = (xf8) b;
                    hx2.e().l(parentActivity);
                    hx2.e().k(new de(this, i, (byte) 4));
                    hx2 e = hx2.e();
                    TLRPC.Document document = xf8Var.b;
                    if (k47.H2(document)) {
                        i2 = 2;
                    }
                    e.i(document, null, "", null, null, i2, false, xf8Var.c, this.a, 200);
                    return;
                } else if (b instanceof qf8) {
                    qf8 qf8Var = (qf8) b;
                    String str = qf8Var.d;
                    l0(i, new jn1(str, gm.i0(qf8Var.e, true, true) + " " + qf8Var.f, (byte) 1), gm.L(240.0f), gm.L(60.0f));
                    return;
                } else if (b instanceof vf8) {
                    vf8 vf8Var = (vf8) b;
                    TLRPC.Document F0 = vf8Var.b.F0();
                    String x1 = k47.x1(F0);
                    l0(i, new r(x1, k47.v1(F0) + " - " + jb6.R((int) k47.H0(F0)), vf8Var, (byte) 1), gm.L(240.0f), gm.L(60.0f));
                    return;
                } else if (b instanceof uf8) {
                    l0(i, new k22((uf8) b, (byte) 1), gm.L(300.0f), (gm.L(300.0f) * 9) / 16);
                    return;
                } else if (b instanceof sf8) {
                    sf8 sf8Var = (sf8) b;
                    ik.d0(getContext(), this.a, sf8Var.b, sf8Var.n, new y62(this, i, (byte) 1), new z62(this, i, (byte) 0));
                    return;
                } else {
                    d0(i);
                    return;
                }
            }
            return;
        }
        d0(i);
    }

    public final void f0() {
        int i;
        ng8 ng8Var = this.h1;
        if (ng8Var != null) {
            this.G.e = true;
            EditTextBoldCursor editField = ng8Var.getEditField();
            editField.requestFocus();
            gm.E3(editField);
        }
        if (gm.D) {
            i = 0;
        } else {
            i = 2;
        }
        j0(i);
        if (!gm.D && !this.f1 && !gm.E && !gm.O1()) {
            this.H = true;
            o1 o1Var = this.V0;
            gm.r(o1Var);
            gm.d3(o1Var, 100L);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return gm.L(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        u69 T;
        int i;
        smb smbVar = this.s;
        if (smbVar.getChildCount() <= 1 || (childAt = smbVar.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = smbVar.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = smbVar.T(F);
        }
        b59 b59Var = (b59) T;
        int y = (((int) childAt.getY()) - gm.m) - gm.L(20.0f);
        if (y > 0 && b59Var != null && b59Var.b() == 1) {
            i = y;
        } else {
            i = 0;
        }
        if (y < 0 || b59Var == null || b59Var.b() != 1) {
            y = i;
        }
        return gm.L(25.0f) + y;
    }

    public int getEmojiPadding() {
        return this.c1;
    }

    @Override
    public int getFirstOffset() {
        return gm.L(17.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.S0;
    }

    @Override
    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        int i = cmb.z5;
        smb smbVar = this.s;
        arrayList.add(new cnb(smbVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(smbVar, 16, new Class[]{o72.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        int i2 = cmb.o7;
        arrayList.add(new cnb(smbVar, 262144, new Class[]{jf5.class}, new String[]{"textView2"}, (Drawable[]) null, (bnb) null, i2));
        int i3 = cmb.l6;
        arrayList.add(new cnb(smbVar, 8388608, new Class[]{ng8.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(smbVar, 8388608, new Class[]{ng8.class}, new String[]{"moveImageView"}, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(smbVar, 262144, new Class[]{ng8.class}, new String[]{"textView2"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(smbVar, 0, new Class[]{ng8.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i3));
        int i4 = cmb.j7;
        arrayList.add(new cnb(smbVar, 0, new Class[]{ng8.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i4));
        arrayList.add(new cnb(smbVar, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        int i5 = cmb.M6;
        arrayList.add(new cnb(smbVar, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i5));
        arrayList.add(new cnb(smbVar, 32, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, i5));
        arrayList.add(new cnb(smbVar, 0, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, i4));
        return arrayList;
    }

    public final void h0(int i, nf8 nf8Var) {
        int i2;
        wf8 wf8Var = this.n1;
        if (nf8Var != null) {
            wf8Var.a.put(i, nf8Var);
        } else {
            wf8Var.a.remove(i);
        }
        if (i == -2) {
            i2 = this.o0;
        } else if (i == -3) {
            i2 = this.q0;
        } else {
            int i3 = this.u0;
            if (i3 >= 0 && i >= 0 && i < this.N) {
                i2 = i + i3;
            } else {
                i2 = -1;
            }
        }
        if (i2 >= 0) {
            u69 K = this.s.K(i2);
            if (K != null) {
                View view = K.a;
                if (view instanceof ng8) {
                    ((ng8) view).e.a(nf8Var, true);
                }
            }
            this.r.g(i2);
        }
        if (nf8Var instanceof sf8) {
            sf8 sf8Var = (sf8) nf8Var;
            String str = sf8Var.b;
            lf2 lf2Var = new lf2(this, nf8Var, (byte) 12);
            jvc jvcVar = this.R;
            HashMap hashMap = jvcVar.c;
            HashMap hashMap2 = jvcVar.b;
            if (hashMap2.containsKey(str)) {
                lf2Var.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(lf2Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(jvcVar.a).sendRequestTyped(getwebpagepreview, new kc((byte) 0), new s87(jvcVar, str, (byte) 22));
                }
            }
            U(sf8Var, false);
        }
        S();
    }

    @Override
    public final boolean i() {
        return this.Y0;
    }

    public final void i0(int r5, android.view.View r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v72.i0(int, android.view.View):void");
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0(int i) {
        boolean z;
        ng8 ng8Var;
        if (this.J) {
            mx5 mx5Var = this.G;
            d02 d02Var = null;
            i22 i22Var = this.b;
            if (i == 1) {
                e34 e34Var = this.F;
                if (e34Var != null && e34Var.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                e34 e34Var2 = this.F;
                if (e34Var2 != null && e34Var2.d1 != z8c.t0) {
                    i22Var.o3.removeView(e34Var2);
                    this.F = null;
                    e34Var2 = null;
                }
                if (e34Var2 == null) {
                    e34 e34Var3 = new e34(null, true, false, false, getContext(), true, null, null, true, this.a, false, false);
                    this.F = e34Var3;
                    e34Var3.c = 3;
                    e34Var3.x0 = false;
                    e34Var3.x2 = false;
                    e34Var3.setShouldDrawBackground(false);
                    e34 e34Var4 = this.F;
                    e34Var4.V0 = false;
                    e34Var4.setVisibility(8);
                    if (gm.O1()) {
                        this.F.setForseMultiwindowLayout(true);
                    }
                    this.F.setDelegate(new d72(this));
                    i22Var.o3.addView(this.F);
                    this.F.setBottomInset(gm.n);
                }
                this.F.setVisibility(0);
                this.b1 = true;
                e34 e34Var5 = this.F;
                if (this.d1 <= 0) {
                    if (gm.O1()) {
                        this.d1 = gm.L(150.0f);
                    } else {
                        this.d1 = oc7.c1().getInt("kbd_height", gm.L(200.0f));
                    }
                }
                int i2 = this.e1;
                if (i2 <= 0) {
                    if (gm.O1()) {
                        i2 = gm.L(150.0f);
                        this.e1 = i2;
                    } else {
                        i2 = oc7.c1().getInt("kbd_height_land3", gm.L(200.0f));
                        this.e1 = i2;
                    }
                }
                Point point = gm.q;
                if (point.x <= point.y) {
                    i2 = this.d1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e34Var5.getLayoutParams();
                layoutParams.height = gm.n + i2;
                e34Var5.setLayoutParams(layoutParams);
                if (!gm.E && !gm.O1() && (ng8Var = this.h1) != null) {
                    gm.t1(ng8Var.getEditField());
                }
                this.c1 = i2;
                mx5Var.a();
                i22Var.o3.requestLayout();
                ng8 ng8Var2 = this.h1;
                if (ng8Var2 != null) {
                    d02Var = ng8Var2.getEmojiButton();
                }
                if (d02Var != null) {
                    d02Var.j(b02.d, true);
                }
                if (!z && !this.f1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c1, 0.0f);
                    ofFloat.addUpdateListener(new b72(this, (byte) 1));
                    ofFloat.addListener(new e72(this, (byte) 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(gb.w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            ng8 ng8Var3 = this.h1;
            if (ng8Var3 != null) {
                d02Var = ng8Var3.getEmojiButton();
            }
            if (d02Var != null) {
                d02Var.j(b02.e, true);
            }
            e34 e34Var6 = this.F;
            if (e34Var6 != null) {
                this.b1 = false;
                this.i1 = false;
                if (gm.D || gm.E) {
                    e34Var6.setVisibility(8);
                }
            }
            if (i == 0) {
                this.c1 = 0;
            }
            mx5Var.a();
            i22Var.o3.requestLayout();
        }
    }

    @Override
    public final boolean k() {
        if (this.b1) {
            Z(true);
            return true;
        } else if (!R()) {
            return true;
        } else {
            return false;
        }
    }

    public final void k0(int i) {
        u69 K = this.s.K(this.u0 + i);
        if (K != null) {
            View view = K.a;
            if (view instanceof ng8) {
                ng8 ng8Var = (ng8) view;
                if (ng8Var.getTop() > gm.L(40.0f)) {
                    n72 n72Var = this.y;
                    if (n72Var != null) {
                        n72Var.e();
                    }
                    String M0 = jb6.M0(2131746915, null);
                    ig5 ig5Var = this.E;
                    ig5Var.setText(M0);
                    ig5Var.c(ng8Var.getCheckBox());
                    ImageView imageView = ig5Var.b;
                    imageView.setTranslationX(imageView.getTranslationX() + gm.L(48.0f));
                    ig5Var.setTranslationY(ig5Var.getTranslationY() + gm.L(10.0f));
                }
            }
        }
    }

    public final void l0(int i, rac racVar, int i2, int i3) {
        bu5 G = bu5.G(this, null, new View(getContext()));
        G.s = (short) 0;
        G.t = false;
        G.b(2131232337, jb6.M0(2131746004, null), new z62(this, i, (byte) 1), false);
        G.b(2131232114, jb6.M0(2131751535, null), new z62(this, i, (byte) 2), true);
        vs9 vs9Var = new vs9(getContext(), this.a);
        G.p = new hm1(vs9Var, (byte) 1);
        G.V = gm.L(185.0f);
        G.Z();
        vs9Var.e(G);
        im0 c = vs9Var.n.c(null, null, false);
        c.p(qqd.k(vs9Var.b));
        c.q(gm.L(8.0f));
        c.S.e = true;
        c.r(gm.L(16.0f));
        vs9Var.G = c;
        vs9Var.F = (Drawable) racVar.a(vs9Var.s);
        Point point = gm.q;
        int i4 = (point.x - i2) / 2;
        int i5 = (point.y - i3) / 2;
        int i6 = i2 + i4;
        int i7 = i3 + i5;
        c.setBounds(i4 - gm.L(8.0f), i5 - gm.L(8.0f), gm.L(8.0f) + i6, gm.L(8.0f) + i7);
        vs9Var.F.setBounds(i4, i5, i6, i7);
        ((FrameLayout.LayoutParams) vs9Var.y.getLayoutParams()).gravity = 1;
        vs9Var.M = true;
        vs9Var.show();
    }

    public final void m0() {
        ylb ylbVar = this.a;
        try {
            int v0 = cmb.v0(cmb.M6, ylbVar);
            int v02 = cmb.v0(cmb.j7, ylbVar);
            if (v0 != this.q1 || v02 != this.r1) {
                this.q1 = v0;
                this.r1 = v02;
                Drawable drawable = this.o1;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = this.p1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
                smb smbVar = this.s;
                if (smbVar != null) {
                    for (int i = 0; i < smbVar.getChildCount(); i++) {
                        View childAt = smbVar.getChildAt(i);
                        if (childAt instanceof xib) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void n0() {
        boolean z;
        int i;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.G0 = -1;
        this.C0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.D0 = -1;
        this.F0 = -1;
        this.E0 = -1;
        this.H0 = -1;
        dbc dbcVar = this.N0;
        dbcVar.b = -1;
        dbc dbcVar2 = this.O0;
        dbcVar2.b = -1;
        this.M0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.v0 = -1;
        this.u0 = -1;
        this.y0 = -1;
        this.o0 = -1;
        this.m0 = true;
        int i2 = 3;
        this.R0 = 3;
        this.n0 = 2;
        boolean z2 = this.n;
        if (!z2) {
            this.R0 = 4;
            this.o0 = 3;
            i2 = 4;
        }
        int i3 = i2 + 1;
        this.s0 = i2;
        int i4 = i2 + 2;
        this.R0 = i4;
        this.t0 = i3;
        int i5 = this.N;
        if (i5 != 0) {
            this.u0 = i4;
            i4 += i5;
            this.R0 = i4;
        }
        if (i5 != this.L.length) {
            int i6 = i4 + 1;
            this.R0 = i6;
            this.v0 = i4;
            i4 = i6;
        }
        this.w0 = i4;
        int i7 = i4 + 2;
        this.R0 = i7;
        this.x0 = i4 + 1;
        if (z2) {
            i = i4 + 3;
            this.R0 = i;
            this.A0 = i7;
            if (this.h0) {
                int i8 = i4 + 4;
                this.R0 = i8;
                this.z0 = i;
                i = i8;
            }
        } else {
            TLRPC.Chat chat = ((yv1) this.b.Z1).e;
            if (sd2.T(chat) && !chat.megagroup) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int i9 = this.R0;
                this.R0 = i9 + 1;
                this.C0 = i9;
            } else {
                this.b0 = true;
            }
            int i10 = this.R0;
            int i11 = i10 + 1;
            this.R0 = i11;
            this.G0 = i10;
            if (!z) {
                int i12 = i10 + 2;
                this.R0 = i12;
                this.D0 = i11;
                i11 = i12;
            } else {
                this.U = false;
            }
            this.E0 = i11;
            this.F0 = i11 + 1;
            int i13 = i11 + 3;
            this.R0 = i13;
            this.H0 = i11 + 2;
            if (z) {
                dbcVar.b = i13;
                i13 = i11 + 5;
                this.R0 = i13;
                dbcVar2.b = i11 + 4;
                if (dbcVar2.a) {
                    int i14 = i11 + 6;
                    this.R0 = i14;
                    this.M0 = i13;
                    i13 = i14;
                }
            }
            int i15 = i13 + 1;
            this.R0 = i15;
            this.I0 = i13;
            if (this.V != 0 || this.W != 0) {
                this.J0 = i15;
                int i16 = i13 + 3;
                this.K0 = i13 + 2;
                int i17 = i13 + 4;
                this.R0 = i17;
                this.L0 = i16;
                i15 = i17;
            }
            i = i15 + 1;
            this.R0 = i;
            this.y0 = i15;
            if (this.d0) {
                this.p0 = i;
                int i18 = i15 + 3;
                this.q0 = i15 + 2;
                int i19 = i15 + 4;
                this.R0 = i19;
                this.r0 = i18;
                i = i19;
            }
        }
        this.R0 = i + 1;
        this.B0 = i;
    }

    @Override
    public final void p() {
        this.I = true;
        i22 i22Var = this.b;
        nm7.f(i22Var.G3).n(this, nm7.w0);
        if (this.J) {
            nm7.e().n(this, nm7.m4);
            e34 e34Var = this.F;
            if (e34Var != null) {
                i22Var.o3.removeView(e34Var);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.j0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        if (!R()) {
            return false;
        }
        return true;
    }

    public void setDelegate(u72 u72Var) {
        this.k0 = u72Var;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    @Override
    public final void t() {
        this.b.G1();
    }

    @Override
    public final void updateColors() {
        try {
            this.k1.setColor(cmb.v0(cmb.Xl, this.a));
            m0();
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void v(float f) {
        this.b.G1();
    }

    @Override
    public final void w(int i) {
        int i2;
        boolean z;
        if (i == 40) {
            boolean z2 = this.n;
            int i3 = 0;
            int i4 = 1;
            i22 i22Var = this.b;
            CharSequence[] charSequenceArr = this.L;
            if (z2) {
                CharSequence[] charSequenceArr2 = {Y(this.O)};
                int i5 = i22Var.G3;
                ArrayList<TLRPC.MessageEntity> Y = hs6.d0(i5).Y(charSequenceArr2, true, true);
                CharSequence charSequence = charSequenceArr2[0];
                if (Y != null) {
                    int size = Y.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        TLRPC.MessageEntity messageEntity = Y.get(i6);
                        if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                            messageEntity.length = charSequence.length() - messageEntity.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                boolean z3 = this.h0;
                if (z3 && this.g0) {
                    z = true;
                } else {
                    z = false;
                }
                todoList.others_can_append = z;
                todoList.others_can_complete = z3;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = Y;
                for (int i7 = 0; i7 < charSequenceArr.length; i7++) {
                    if (!TextUtils.isEmpty(Y(charSequenceArr[i7]))) {
                        CharSequence[] charSequenceArr3 = {Y(charSequenceArr[i7])};
                        ArrayList<TLRPC.MessageEntity> Y2 = hs6.d0(i5).Y(charSequenceArr3, true, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        if (Y2 != null) {
                            int size2 = Y2.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                TLRPC.MessageEntity messageEntity2 = Y2.get(i8);
                                if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                    messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                                }
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = Y2;
                        todoItem.id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                ik.X(i5, i22Var.V0(), i22Var.R0() + 1, new iu(this, (yv1) i22Var.Z1, tL_messageMediaToDo, (byte) 12));
                return;
            }
            boolean z4 = this.d0;
            smb smbVar = this.s;
            boolean[] zArr = this.M;
            if (z4 && !this.Y0) {
                int i9 = 0;
                while (i3 < zArr.length) {
                    if (!TextUtils.isEmpty(Y(charSequenceArr[i3])) && zArr[i3]) {
                        i9++;
                    }
                    i3++;
                }
                if (i9 <= 0) {
                    for (int i10 = this.u0; i10 < this.u0 + this.N; i10++) {
                        u69 K = smbVar.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof ng8) {
                                ng8 ng8Var = (ng8) view;
                                if (ng8Var.getTop() > gm.L(40.0f)) {
                                    n72 n72Var = this.y;
                                    if (n72Var != null) {
                                        n72Var.e();
                                    }
                                    String M0 = jb6.M0(2131746888, null);
                                    ig5 ig5Var = this.E;
                                    ig5Var.setText(M0);
                                    ig5Var.c(ng8Var.getCheckBox());
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            int i11 = 0;
            while (true) {
                int length = charSequenceArr.length;
                wf8 wf8Var = this.n1;
                if (i11 < length) {
                    if (TextUtils.isEmpty(Y(charSequenceArr[i11])) && wf8Var.b(i11) != null) {
                        this.W0 = true;
                        this.X0 = i11;
                        smbVar.z0(this.u0 + i11);
                        return;
                    }
                    i11++;
                } else {
                    CharSequence[] charSequenceArr4 = {Y(this.O)};
                    int i12 = i22Var.G3;
                    ArrayList<TLRPC.MessageEntity> Y3 = hs6.d0(i12).Y(charSequenceArr4, true, true);
                    CharSequence charSequence3 = charSequenceArr4[0];
                    if (Y3 != null) {
                        int size3 = Y3.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            TLRPC.MessageEntity messageEntity3 = Y3.get(i13);
                            if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                                messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                            }
                        }
                    }
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                    TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                    tL_messageMediaPoll.poll = tL_poll;
                    tL_poll.multiple_choice = this.c0;
                    tL_poll.quiz = this.d0;
                    tL_poll.public_voters = !this.b0;
                    tL_poll.open_answers = this.U;
                    tL_poll.revoting_disabled = !this.S;
                    tL_poll.shuffle_answers = this.T;
                    tL_poll.subscribers_only = this.N0.a;
                    if (this.O0.a) {
                        ArrayList arrayList = this.Q0;
                        if (!arrayList.isEmpty()) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            poll.flags |= 4096;
                            poll.countries_iso2.addAll(arrayList);
                        }
                    }
                    TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                    poll2.creator = true;
                    int i14 = this.V;
                    if (i14 != 0) {
                        poll2.hide_results_until_close = this.a0;
                        poll2.close_period = i14;
                        poll2.flags |= 16;
                    } else {
                        int i15 = this.W;
                        if (i15 != 0) {
                            poll2.hide_results_until_close = this.a0;
                            poll2.close_date = i15;
                            poll2.flags |= 32;
                        }
                    }
                    poll2.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                    tL_messageMediaPoll.poll.question.entities = Y3;
                    ArrayList arrayList2 = new ArrayList(this.K);
                    int i16 = 0;
                    while (i16 < charSequenceArr.length) {
                        if (TextUtils.isEmpty(Y(charSequenceArr[i16]))) {
                            wf8Var.h(tL_messageMediaPoll.poll.answers.size());
                            i2 = i3;
                        } else {
                            CharSequence[] charSequenceArr5 = new CharSequence[i4];
                            charSequenceArr5[i3] = Y(charSequenceArr[i16]);
                            ArrayList<TLRPC.MessageEntity> Y4 = hs6.d0(i12).Y(charSequenceArr5, i4, i4);
                            CharSequence charSequence4 = charSequenceArr5[i3];
                            if (Y4 != null) {
                                int size4 = Y4.size();
                                int i17 = i3;
                                while (i17 < size4) {
                                    TLRPC.MessageEntity messageEntity4 = Y4.get(i17);
                                    int i18 = i3;
                                    if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                        messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                    }
                                    i17++;
                                    i3 = i18;
                                }
                            }
                            i2 = i3;
                            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                            tL_pollAnswer.text = tL_textWithEntities2;
                            tL_textWithEntities2.text = charSequence4.toString();
                            tL_pollAnswer.text.entities = Y4;
                            byte[] bArr = new byte[1];
                            tL_pollAnswer.option = bArr;
                            bArr[i2] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                            if ((this.c0 || this.d0) && zArr[i16]) {
                                arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                            }
                            tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                        }
                        i16++;
                        i3 = i2;
                        i4 = 1;
                    }
                    int i19 = i3;
                    tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                    CharSequence Y5 = Y(this.Q);
                    if (Y5 != null) {
                        tL_messageMediaPoll.results.solution = Y5.toString();
                        CharSequence[] charSequenceArr6 = new CharSequence[1];
                        charSequenceArr6[i19] = Y5;
                        ArrayList<TLRPC.MessageEntity> Y6 = hs6.d0(i12).Y(charSequenceArr6, true, true);
                        if (Y6 != null && !Y6.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = Y6;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    ik.X(i12, i22Var.V0(), i22Var.R0() + 1, new jv0(this, (yv1) i22Var.Z1, tL_messageMediaPoll, arrayList2, (byte) 6));
                    return;
                }
            }
        }
    }
}
