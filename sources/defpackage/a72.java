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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PhotoViewer;
public final class a72 extends f12 implements snb, vma, fn7 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final lg5 E;
    public int E0;
    public o24 F;
    public int F0;
    public final rx5 G;
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
    public final cdc N0;
    public Editable O;
    public final cdc O0;
    public Editable P;
    public final cdc[] P0;
    public Editable Q;
    public final ArrayList Q0;
    public final xxc R;
    public int R0;
    public boolean S;
    public int S0;
    public boolean T;
    public final int T0;
    public boolean U;
    public final int[] U0;
    public int V;
    public final p1 V0;
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
    public zh8 h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public z62 k0;
    public final Paint k1;
    public int l0;
    public f41 l1;
    public boolean m0;
    public int m1;
    public final boolean n;
    public int n0;
    public final ih8 n1;
    public int o0;
    public Drawable o1;
    public int p0;
    public Drawable p1;
    public int q0;
    public int q1;
    public final t20 r;
    public int r0;
    public int r1;
    public final qob s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final q62 w;
    public int w0;
    public final q22 x;
    public int x0;
    public final s62 y;
    public int y0;
    public int z0;

    public a72(n12 n12Var, Context context, boolean z, vnb vnbVar, Boolean bool) {
        super(n12Var, vnbVar, context);
        this.N = 1;
        this.S = true;
        this.T = true;
        this.U = true;
        this.c0 = true;
        this.g0 = true;
        this.h0 = true;
        this.l0 = -1;
        cdc cdcVar = new cdc(this);
        this.N0 = cdcVar;
        cdc cdcVar2 = new cdc(this);
        this.O0 = cdcVar2;
        this.P0 = new cdc[]{cdcVar, cdcVar2};
        ArrayList arrayList = new ArrayList();
        this.Q0 = arrayList;
        this.U0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.V0 = new p1(this, (byte) 17);
        this.W0 = false;
        this.X0 = -1;
        this.i1 = false;
        this.j1 = false;
        Paint paint = new Paint(1);
        this.k1 = paint;
        this.n1 = new ih8();
        this.n = z;
        int answersMaxCount = getAnswersMaxCount();
        this.K = answersMaxCount;
        this.L = new CharSequence[answersMaxCount];
        this.M = new boolean[answersMaxCount];
        boolean p = yac.h(k5.a(this.b.G3).a).p();
        this.J = p;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.d0 = booleanValue;
            this.f0 = booleanValue;
            boolean z2 = !booleanValue;
            this.U = z2;
            this.S = z2;
        }
        m0();
        paint.setColor(aob.v0(aob.Yl, this.a));
        this.b.o3.setDelegate(this);
        t20 t20Var = new t20(this, context, (byte) 1);
        this.r = t20Var;
        qob qobVar = new qob(context, null, (byte) 3);
        this.s = qobVar;
        setBlur3Capture(qobVar);
        this.d = qobVar;
        this.h = true;
        this.f = true;
        q62 q62Var = new q62(this);
        this.w = q62Var;
        qobVar.setItemAnimator(q62Var);
        arrayList.clear();
        q62Var.m = false;
        q62Var.C = false;
        q62Var.o(k43.h);
        q62Var.n(350L);
        qobVar.setClipToPadding(false);
        qobVar.setVerticalScrollBarEnabled(false);
        qobVar.setSections(true);
        q22 q22Var = new q22(this, hl.L(65.0f) + hl.m, qobVar, (byte) 3);
        this.x = q22Var;
        qobVar.setLayoutManager(q22Var);
        q22Var.O = true;
        new lu5(new s10(this, (byte) 3)).h(qobVar);
        addView(qobVar, tre.e(-1, -1, 51));
        qobVar.setPreserveFocusAfterLayout(true);
        qobVar.setAdapter(t20Var);
        qobVar.setOnItemClickListener(new h62(this, vnbVar, n12Var, context));
        qobVar.setOnScrollListener(new y(this, (byte) 21));
        lg5 lg5Var = new lg5(context, 4);
        this.E = lg5Var;
        lg5Var.setAlpha(0.0f);
        lg5Var.setVisibility(4);
        addView(lg5Var, tre.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.T0 = uc7.s1(this.b.G3).k4.U.f();
        this.R = new xxc(this.b.G3);
        jn7.f(this.b.G3).b(this, jn7.w0);
        if (p) {
            jn7.e().b(this, jn7.l4);
            ?? zebVar = new zeb(context, this.b.G3, null, vnbVar);
            this.y = zebVar;
            zebVar.E = true;
            zebVar.F = true;
            zebVar.setHorizontalPadding(hl.L(24.0f));
            addView((View) zebVar, tre.e(-2, 160, 51));
        }
        this.G = new rx5(this.b.o3, false, null);
        S();
    }

    public static CharSequence X(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence m1 = hl.m1(charSequence);
        while (TextUtils.indexOf(m1, "\n\n\n") >= 0) {
            m1 = TextUtils.replace(m1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(m1, "\n\n\n") == 0) {
            m1 = TextUtils.replace(m1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return m1;
    }

    public static f41 f0(e eVar, int i, pcc pccVar, go1 go1Var) {
        if (eVar == null) {
            return null;
        }
        f41 f41Var = new f41(eVar.getContext(), eVar, eVar.getResourceProvider(), go1Var);
        f41Var.W3 = new n62(f41Var, pccVar, eVar);
        f41Var.X3 = new o62(pccVar, f41Var);
        f41Var.d2.g0();
        f41Var.u1(1, true);
        f41Var.Q0(i);
        f41Var.t4 = new f62(pccVar, (byte) 0);
        f41Var.R1 = new p62(f41Var, pccVar, eVar);
        f41Var.S1 = new h01(pccVar, f41Var, (byte) 29);
        f41Var.a1();
        f41Var.w0(true);
        f41Var.show();
        return f41Var;
    }

    private int getAnswersMaxCount() {
        if (this.n) {
            return getMessagesController().k4.F3.f();
        }
        return getMessagesController().k4.R.f();
    }

    private int getCurrentAccount() {
        n12 n12Var = this.b;
        if (n12Var != null) {
            return n12Var.G3;
        }
        return yac.t0;
    }

    private uc7 getMessagesController() {
        return uc7.s1(getCurrentAccount());
    }

    @Override
    public final void B() {
        t20 t20Var = this.r;
        if (t20Var != null) {
            t20Var.f();
        }
        if (this.J) {
            Y(false);
            s62 s62Var = this.y;
            if (s62Var != null) {
                s62Var.e();
            }
            zh8 zh8Var = this.h1;
            if (zh8Var != null) {
                zh8Var.setEmojiButtonVisibility(false);
                this.h1.getTextView().clearFocus();
                hl.t1(this.h1.getEditField());
            }
        }
    }

    @Override
    public final void C(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a72.C(int, int):void");
    }

    @Override
    public final void H(f12 f12Var) {
        n12 n12Var = this.b;
        try {
            n12Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.n) {
            n12Var.U2.setTitle(ob6.M0(2131743707, null));
        } else if (this.f0) {
            n12Var.U2.setTitle(ob6.M0(2131748018, null));
        } else {
            n12Var.U2.setTitle(ob6.M0(2131748019, null));
        }
        n12Var.H1();
        this.x.g1(0, 0);
    }

    @Override
    public final void J() {
        this.s.A0(1);
    }

    @Override
    public final void L(int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        int L;
        if (this.J) {
            if (i > hl.L(50.0f) && this.f1 && !hl.E && !hl.O1()) {
                if (z) {
                    this.e1 = i;
                    uc7.d1().edit().putInt("kbd_height_land3", this.e1).commit();
                } else {
                    this.d1 = i;
                    uc7.d1().edit().putInt("kbd_height", this.d1).commit();
                }
            }
            boolean z4 = this.b1;
            n12 n12Var = this.b;
            rx5 rx5Var = this.G;
            if (z4) {
                if (z) {
                    i2 = this.e1;
                } else {
                    i2 = this.d1;
                }
                if (this.i1) {
                    i2 += hl.L(120.0f);
                }
                int i3 = i2 + hl.n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
                int i4 = layoutParams.width;
                int i5 = hl.q.x;
                if (i4 != i5 || layoutParams.height != i3 || this.j1 != this.i1) {
                    layoutParams.width = i5;
                    layoutParams.height = i3;
                    this.F.setLayoutParams(layoutParams);
                    this.c1 = layoutParams.height;
                    rx5Var.a();
                    n12Var.o3.requestLayout();
                    boolean z5 = this.j1;
                    if (z5 != this.i1) {
                        if (z5) {
                            L = -hl.L(120.0f);
                        } else {
                            L = hl.L(120.0f);
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
                zh8 zh8Var = this.h1;
                if (zh8Var != null) {
                    if (zh8Var.getEditField().isFocused() && rx5Var.c() && i > 0) {
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
                    i0(0);
                }
                if (this.c1 != 0 && !(z3 = this.f1) && z3 != z6 && !this.b1) {
                    this.c1 = 0;
                    rx5Var.a();
                    n12Var.o3.requestLayout();
                }
                if (this.f1 && this.H) {
                    this.H = false;
                    hl.r(this.V0);
                }
            }
        }
    }

    public final void O() {
        s62 s62Var = this.y;
        if (s62Var != null) {
            s62Var.setDelegate(null);
            s62Var.e();
        }
        this.s.setItemAnimator(this.w);
        int i = this.N;
        this.M[i] = false;
        int i2 = i + 1;
        this.N = i2;
        int length = this.L.length;
        t20 t20Var = this.r;
        if (i2 == length) {
            t20Var.s(this.v0);
        }
        t20Var.i(this.v0);
        m0();
        this.l0 = (this.u0 + this.N) - 1;
        t20Var.g(this.w0);
        t20Var.g(this.B0);
    }

    public final void P(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new qm1(this, f, (byte) 3));
        ofFloat.addListener(new j62(this, (byte) 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(hb.w);
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
        f89 L = this.s.L(i);
        if (L == null) {
            this.r.g(this.D0);
            return;
        }
        xh8 xh8Var = (xh8) L.a;
        if (!z) {
            xh8Var.setChecked(false);
        }
        xh8Var.getCheckBox().a.a(!z, true);
    }

    public final boolean R() {
        boolean z;
        int i;
        int i2;
        if (TextUtils.isEmpty(X(this.O)) && TextUtils.isEmpty(X(this.P)) && TextUtils.isEmpty(X(this.Q)) && this.n1.a.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i3 = 0; i3 < this.N && (z = TextUtils.isEmpty(X(this.L[i3]))); i3++) {
            }
        }
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.Z1.getParentActivity());
            boolean z2 = this.n;
            if (z2) {
                i = 2131752548;
            } else {
                i = 2131752554;
            }
            String M0 = ob6.M0(i, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            if (z2) {
                i2 = 2131752549;
            } else {
                i2 = 2131752555;
            }
            idVar.U = ob6.M0(i2, null);
            alertDialog$Builder.j(ob6.M0(2131747307, null), new rd1(this, (byte) 19));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
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
                if (!TextUtils.isEmpty(X(charSequenceArr[i4])) && zArr[i4]) {
                    i++;
                }
                i4++;
            }
        } else {
            i = 0;
        }
        if (this.n) {
            i2 = getMessagesController().k4.P2.f();
            i3 = getMessagesController().k4.Q2.f();
        } else {
            i2 = 255;
            i3 = 100;
        }
        if ((TextUtils.isEmpty(X(this.P)) || this.P.length() <= this.T0) && ((TextUtils.isEmpty(X(this.Q)) || this.Q.length() <= 200) && !TextUtils.isEmpty(X(this.O)) && this.O.length() <= i2)) {
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
            if (!TextUtils.isEmpty(X(charSequenceArr[i5]))) {
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
        n12 n12Var = this.b;
        n12Var.r0 = z3;
        this.Y0 = z;
        n12Var.H1();
    }

    public final void T(skb skbVar, boolean z) {
        if (this.W != 0) {
            skbVar.q(ob6.M0(2131746857, null), ob6.Q(this.W), z, false);
        } else if (this.V != 0) {
            skbVar.q(ob6.M0(2131746859, null), ob6.G(this.V / 3600, "Hours", new Object[0]), z, false);
        } else {
            skbVar.q(ob6.M0(2131746857, null), null, z, false);
        }
    }

    public final void U(eh8 eh8Var, boolean z) {
        boolean z2;
        TLRPC.Photo photo;
        String str = eh8Var.b;
        xxc xxcVar = this.R;
        boolean containsKey = xxcVar.c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) xxcVar.b.get(eh8Var.b);
        fm0 fm0Var = eh8Var.s;
        ImageReceiver imageReceiver = eh8Var.a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z2 = false;
        } else {
            z2 = true;
        }
        eh8Var.r.a(z2, z);
        eh8Var.n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w = xb4.w(photo.sizes, 40, false, null, false);
            imageReceiver.Z(jn5.f(xb4.w(webPage.photo.sizes, hl.L(36.0f), false, w, true), webPage.photo), "48_48", jn5.f(w, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            fm0Var.a(true, z);
            return;
        }
        fm0Var.a(false, z);
        imageReceiver.f();
    }

    public final void V() {
        if (this.i1) {
            this.F.r(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams.height -= hl.L(120.0f);
            this.F.setLayoutParams(layoutParams);
            this.c1 = layoutParams.height;
            this.j1 = this.i1;
            this.i1 = false;
            P(-hl.L(120.0f));
        }
    }

    public final void W(android.view.View r10, defpackage.zh8 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a72.W(android.view.View, zh8, boolean):void");
    }

    public final void Y(boolean z) {
        if (this.J) {
            if (this.b1) {
                o24 o24Var = this.F;
                o24Var.Q.E0();
                o24Var.J.scrollTo(0, 0);
                o24Var.D(1);
                o24Var.R.g1(0, 0);
                this.F.r(false);
                if (z) {
                    this.F.z();
                }
                this.i1 = false;
                i0(0);
            }
            if (z) {
                o24 o24Var2 = this.F;
                if (o24Var2 != null && o24Var2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.F.getMeasuredHeight());
                    ofFloat.addUpdateListener(new g62(this, (byte) 0));
                    this.g1 = true;
                    ofFloat.addListener(new j62(this, (byte) 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(hb.w);
                    ofFloat.start();
                    return;
                }
                Z();
            }
        }
    }

    public final void Z() {
        o24 o24Var;
        iz1 emojiButton;
        if (!this.b1 && (o24Var = this.F) != null && o24Var.getVisibility() != 8) {
            zh8 zh8Var = this.h1;
            if (zh8Var != null && (emojiButton = zh8Var.getEmojiButton()) != null) {
                emojiButton.j(gz1.e, false);
            }
            this.F.setVisibility(8);
        }
        int i = this.c1;
        this.c1 = 0;
        if (i != 0) {
            this.G.a();
        }
    }

    public final void a0(zh8 zh8Var, boolean z) {
        f89 U;
        if (this.J && z) {
            if (this.h1 == zh8Var && this.b1 && this.i1) {
                V();
                this.b1 = false;
            }
            zh8 zh8Var2 = this.h1;
            this.h1 = zh8Var;
            zh8Var.setEmojiButtonVisibility(true);
            iz1 emojiButton = zh8Var.getEmojiButton();
            gz1 gz1Var = gz1.e;
            emojiButton.j(gz1Var, false);
            qob qobVar = this.s;
            View G = qobVar.G(zh8Var);
            if (G == null) {
                U = null;
            } else {
                U = qobVar.U(G);
            }
            s62 s62Var = this.y;
            if (s62Var != null) {
                s62Var.e();
                if (U != null) {
                    View view = U.a;
                    if ((view instanceof zh8) && s62Var.getDelegate() != view) {
                        s62Var.setDelegate((zh8) view);
                    }
                }
            }
            if (zh8Var2 != null && zh8Var2 != zh8Var) {
                if (this.b1) {
                    V();
                    Y(false);
                    e0();
                }
                zh8Var2.setEmojiButtonVisibility(false);
                zh8Var2.getEmojiButton().j(gz1Var, false);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Zl));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.Mi));
        hashSet.add(Integer.valueOf(aob.H6));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.a7));
        hashSet.add(Integer.valueOf(aob.b7));
    }

    public final void b0(zh8 zh8Var) {
        this.h1 = zh8Var;
        if (this.b1) {
            V();
            e0();
            return;
        }
        i0(1);
    }

    public final void c0(int i) {
        int i2;
        this.m1 = i;
        e eVar = this.b.Z1;
        this.n1.b(i);
        if (i != -2 && i != -3) {
            i2 = 41026;
        } else {
            i2 = 74;
        }
        this.l1 = f0(eVar, i2, new d62(this, i, (byte) 0), new go1(this, (byte) 25));
    }

    public final void d0(int i) {
        n12 n12Var;
        e eVar;
        ih8 ih8Var = this.n1;
        if (ih8Var.b(i) != null) {
            zg8 b = ih8Var.b(i);
            if (b != null && (n12Var = this.b) != null && (eVar = n12Var.Z1) != null) {
                Activity parentActivity = eVar.getParentActivity();
                if (b instanceof dh8) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((dh8) b).b);
                    PhotoViewer.q0().T1(parentActivity, null, null);
                    PhotoViewer.q0().o1(arrayList, 0, 14, false, new k62(this, i), null);
                    return;
                }
                int i2 = 0;
                if (b instanceof jh8) {
                    jh8 jh8Var = (jh8) b;
                    rw2.e().l(parentActivity);
                    rw2.e().k(new ed(this, i, (byte) 4));
                    rw2 e = rw2.e();
                    TLRPC.Document document = jh8Var.b;
                    if (r47.H2(document)) {
                        i2 = 2;
                    }
                    e.i(document, null, "", null, null, i2, false, jh8Var.c, this.a, 200);
                    return;
                } else if (b instanceof ch8) {
                    ch8 ch8Var = (ch8) b;
                    String str = ch8Var.d;
                    k0(i, new do1(str, hl.i0(ch8Var.e, true, true) + " " + ch8Var.f, (byte) 1), hl.L(240.0f), hl.L(60.0f));
                    return;
                } else if (b instanceof hh8) {
                    hh8 hh8Var = (hh8) b;
                    TLRPC.Document F0 = hh8Var.b.F0();
                    String x1 = r47.x1(F0);
                    k0(i, new r(x1, r47.v1(F0) + " - " + ob6.R((int) r47.H0(F0)), hh8Var, (byte) 1), hl.L(240.0f), hl.L(60.0f));
                    return;
                } else if (b instanceof gh8) {
                    k0(i, new p12((gh8) b, (byte) 1), hl.L(300.0f), (hl.L(300.0f) * 9) / 16);
                    return;
                } else if (b instanceof eh8) {
                    eh8 eh8Var = (eh8) b;
                    jj.d0(getContext(), this.a, eh8Var.b, eh8Var.n, new d62(this, i, (byte) 1), new e62(this, i, (byte) 0));
                    return;
                } else {
                    c0(i);
                    return;
                }
            }
            return;
        }
        c0(i);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i == jn7.w0) {
            zh6 zh6Var = (zh6) objArr[0];
            for (Map.Entry entry : this.R.b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) zh6Var.f(((TLRPC.WebPage) entry.getValue()).id)) != null) {
                    entry.setValue(webPage);
                }
            }
            ih8 ih8Var = this.n1;
            int size = ih8Var.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                zg8 zg8Var = (zg8) ih8Var.a.get(i3);
                if (zg8Var instanceof eh8) {
                    U((eh8) zg8Var, true);
                }
            }
        } else if (i == jn7.l4) {
            o24 o24Var = this.F;
            if (o24Var != null) {
                o24Var.Q.i1();
            }
            zh8 zh8Var = this.h1;
            if (zh8Var != null) {
                int currentTextColor = zh8Var.getEditField().getCurrentTextColor();
                this.h1.getEditField().setTextColor(-1);
                this.h1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0() {
        int i;
        zh8 zh8Var = this.h1;
        if (zh8Var != null) {
            this.G.e = true;
            EditTextBoldCursor editField = zh8Var.getEditField();
            editField.requestFocus();
            hl.E3(editField);
        }
        if (hl.D) {
            i = 0;
        } else {
            i = 2;
        }
        i0(i);
        if (!hl.D && !this.f1 && !hl.E && !hl.O1()) {
            this.H = true;
            p1 p1Var = this.V0;
            hl.r(p1Var);
            hl.d3(p1Var, 100L);
        }
    }

    public final void g0(int i, zg8 zg8Var) {
        int i2;
        ih8 ih8Var = this.n1;
        if (zg8Var != null) {
            ih8Var.a.put(i, zg8Var);
        } else {
            ih8Var.a.remove(i);
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
            f89 L = this.s.L(i2);
            if (L != null) {
                View view = L.a;
                if (view instanceof zh8) {
                    ((zh8) view).e.a(zg8Var, true);
                }
            }
            this.r.g(i2);
        }
        if (zg8Var instanceof eh8) {
            eh8 eh8Var = (eh8) zg8Var;
            String str = eh8Var.b;
            qe2 qe2Var = new qe2(this, zg8Var, (byte) 10);
            xxc xxcVar = this.R;
            HashMap hashMap = xxcVar.c;
            HashMap hashMap2 = xxcVar.b;
            if (hashMap2.containsKey(str)) {
                qe2Var.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(qe2Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(xxcVar.a).sendRequestTyped(getwebpagepreview, new ic((byte) 0), new ia7(xxcVar, str, (byte) 20));
                }
            }
            U(eh8Var, false);
        }
        S();
    }

    @Override
    public int getButtonsHideOffset() {
        return hl.L(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        f89 U;
        int i;
        qob qobVar = this.s;
        if (qobVar.getChildCount() <= 1 || (childAt = qobVar.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View G = qobVar.G(childAt);
        if (G == null) {
            U = null;
        } else {
            U = qobVar.U(G);
        }
        n69 n69Var = (n69) U;
        int y = (((int) childAt.getY()) - hl.m) - hl.L(20.0f);
        if (y > 0 && n69Var != null && n69Var.b() == 1) {
            i = y;
        } else {
            i = 0;
        }
        if (y < 0 || n69Var == null || n69Var.b() != 1) {
            y = i;
        }
        return hl.L(25.0f) + y;
    }

    public int getEmojiPadding() {
        return this.c1;
    }

    @Override
    public int getFirstOffset() {
        return hl.L(17.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.S0;
    }

    @Override
    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        int i = aob.A5;
        qob qobVar = this.s;
        arrayList.add(new apb(qobVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(qobVar, 16, new Class[]{t62.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.a7));
        int i2 = aob.p7;
        arrayList.add(new apb(qobVar, 262144, new Class[]{mf5.class}, new String[]{"textView2"}, (Drawable[]) null, (zob) null, i2));
        int i3 = aob.m6;
        arrayList.add(new apb(qobVar, 8388608, new Class[]{zh8.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(qobVar, 8388608, new Class[]{zh8.class}, new String[]{"moveImageView"}, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(qobVar, 262144, new Class[]{zh8.class}, new String[]{"textView2"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(qobVar, 0, new Class[]{zh8.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i3));
        int i4 = aob.k7;
        arrayList.add(new apb(qobVar, 0, new Class[]{zh8.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i4));
        arrayList.add(new apb(qobVar, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        int i5 = aob.N6;
        arrayList.add(new apb(qobVar, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i5));
        arrayList.add(new apb(qobVar, 32, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, i5));
        arrayList.add(new apb(qobVar, 0, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, i4));
        return arrayList;
    }

    public final void h0(int r5, android.view.View r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a72.h0(int, android.view.View):void");
    }

    @Override
    public final boolean i() {
        return this.Y0;
    }

    public final void i0(int i) {
        boolean z;
        zh8 zh8Var;
        if (this.J) {
            rx5 rx5Var = this.G;
            iz1 iz1Var = null;
            n12 n12Var = this.b;
            if (i == 1) {
                o24 o24Var = this.F;
                if (o24Var != null && o24Var.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                o24 o24Var2 = this.F;
                if (o24Var2 != null && o24Var2.d1 != yac.t0) {
                    n12Var.o3.removeView(o24Var2);
                    this.F = null;
                    o24Var2 = null;
                }
                if (o24Var2 == null) {
                    o24 o24Var3 = new o24(null, true, false, false, getContext(), true, null, null, true, this.a, false, false);
                    this.F = o24Var3;
                    o24Var3.c = 3;
                    o24Var3.x0 = false;
                    o24Var3.x2 = false;
                    o24Var3.setShouldDrawBackground(false);
                    o24 o24Var4 = this.F;
                    o24Var4.V0 = false;
                    o24Var4.setVisibility(8);
                    if (hl.O1()) {
                        this.F.setForseMultiwindowLayout(true);
                    }
                    this.F.setDelegate(new i62(this));
                    n12Var.o3.addView(this.F);
                    this.F.setBottomInset(hl.n);
                }
                this.F.setVisibility(0);
                this.b1 = true;
                o24 o24Var5 = this.F;
                if (this.d1 <= 0) {
                    if (hl.O1()) {
                        this.d1 = hl.L(150.0f);
                    } else {
                        this.d1 = uc7.d1().getInt("kbd_height", hl.L(200.0f));
                    }
                }
                int i2 = this.e1;
                if (i2 <= 0) {
                    if (hl.O1()) {
                        i2 = hl.L(150.0f);
                        this.e1 = i2;
                    } else {
                        i2 = uc7.d1().getInt("kbd_height_land3", hl.L(200.0f));
                        this.e1 = i2;
                    }
                }
                Point point = hl.q;
                if (point.x <= point.y) {
                    i2 = this.d1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o24Var5.getLayoutParams();
                layoutParams.height = hl.n + i2;
                o24Var5.setLayoutParams(layoutParams);
                if (!hl.E && !hl.O1() && (zh8Var = this.h1) != null) {
                    hl.t1(zh8Var.getEditField());
                }
                this.c1 = i2;
                rx5Var.a();
                n12Var.o3.requestLayout();
                zh8 zh8Var2 = this.h1;
                if (zh8Var2 != null) {
                    iz1Var = zh8Var2.getEmojiButton();
                }
                if (iz1Var != null) {
                    iz1Var.j(gz1.d, true);
                }
                if (!z && !this.f1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c1, 0.0f);
                    ofFloat.addUpdateListener(new g62(this, (byte) 1));
                    ofFloat.addListener(new j62(this, (byte) 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(hb.w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            zh8 zh8Var3 = this.h1;
            if (zh8Var3 != null) {
                iz1Var = zh8Var3.getEmojiButton();
            }
            if (iz1Var != null) {
                iz1Var.j(gz1.e, true);
            }
            o24 o24Var6 = this.F;
            if (o24Var6 != null) {
                this.b1 = false;
                this.i1 = false;
                if (hl.D || hl.E) {
                    o24Var6.setVisibility(8);
                }
            }
            if (i == 0) {
                this.c1 = 0;
            }
            rx5Var.a();
            n12Var.o3.requestLayout();
        }
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0(int i) {
        f89 L = this.s.L(this.u0 + i);
        if (L != null) {
            View view = L.a;
            if (view instanceof zh8) {
                zh8 zh8Var = (zh8) view;
                if (zh8Var.getTop() > hl.L(40.0f)) {
                    s62 s62Var = this.y;
                    if (s62Var != null) {
                        s62Var.e();
                    }
                    String M0 = ob6.M0(2131746909, null);
                    lg5 lg5Var = this.E;
                    lg5Var.setText(M0);
                    lg5Var.c(zh8Var.getCheckBox());
                    ImageView imageView = lg5Var.b;
                    imageView.setTranslationX(imageView.getTranslationX() + hl.L(48.0f));
                    lg5Var.setTranslationY(lg5Var.getTranslationY() + hl.L(10.0f));
                }
            }
        }
    }

    @Override
    public final boolean k() {
        if (this.b1) {
            Y(true);
            return true;
        } else if (!R()) {
            return true;
        } else {
            return false;
        }
    }

    public final void k0(int i, qcc qccVar, int i2, int i3) {
        fu5 G = fu5.G(this, null, new View(getContext()));
        G.s = (short) 0;
        G.t = false;
        G.b(2131232336, ob6.M0(2131745998, null), new e62(this, i, (byte) 1), false);
        G.b(2131232113, ob6.M0(2131751563, null), new e62(this, i, (byte) 2), true);
        mu9 mu9Var = new mu9(getContext(), this.a);
        G.p = new dm1(mu9Var, (byte) 1);
        G.Y = hl.L(185.0f);
        G.Z();
        mu9Var.e(G);
        jl0 c = mu9Var.n.c(null, null, false);
        c.p(dtd.k(mu9Var.b));
        c.q(hl.L(8.0f));
        c.S.e = true;
        c.r(hl.L(16.0f));
        mu9Var.G = c;
        mu9Var.F = (Drawable) qccVar.a(mu9Var.s);
        Point point = hl.q;
        int i4 = (point.x - i2) / 2;
        int i5 = (point.y - i3) / 2;
        int i6 = i2 + i4;
        int i7 = i3 + i5;
        c.setBounds(i4 - hl.L(8.0f), i5 - hl.L(8.0f), hl.L(8.0f) + i6, hl.L(8.0f) + i7);
        mu9Var.F.setBounds(i4, i5, i6, i7);
        ((FrameLayout.LayoutParams) mu9Var.y.getLayoutParams()).gravity = 1;
        mu9Var.M = true;
        mu9Var.show();
    }

    public final void l0() {
        vnb vnbVar = this.a;
        try {
            int v0 = aob.v0(aob.N6, vnbVar);
            int v02 = aob.v0(aob.k7, vnbVar);
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
                qob qobVar = this.s;
                if (qobVar != null) {
                    for (int i = 0; i < qobVar.getChildCount(); i++) {
                        View childAt = qobVar.getChildAt(i);
                        if (childAt instanceof skb) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void m0() {
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
        cdc cdcVar = this.N0;
        cdcVar.b = -1;
        cdc cdcVar2 = this.O0;
        cdcVar2.b = -1;
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
            TLRPC.Chat chat = ((zu1) this.b.Z1).e;
            if (xc2.T(chat) && !chat.megagroup) {
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
                cdcVar.b = i13;
                i13 = i11 + 5;
                this.R0 = i13;
                cdcVar2.b = i11 + 4;
                if (cdcVar2.a) {
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
        n12 n12Var = this.b;
        jn7.f(n12Var.G3).n(this, jn7.w0);
        if (this.J) {
            jn7.e().n(this, jn7.l4);
            o24 o24Var = this.F;
            if (o24Var != null) {
                n12Var.o3.removeView(o24Var);
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

    public void setDelegate(z62 z62Var) {
        this.k0 = z62Var;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    @Override
    public final void u() {
        this.b.H1();
    }

    @Override
    public final void updateColors() {
        try {
            this.k1.setColor(aob.v0(aob.Yl, this.a));
            l0();
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void w(float f) {
        this.b.H1();
    }

    @Override
    public final void x(int i) {
        int i2;
        boolean z;
        if (i == 40) {
            boolean z2 = this.n;
            int i3 = 0;
            int i4 = 1;
            n12 n12Var = this.b;
            CharSequence[] charSequenceArr = this.L;
            if (z2) {
                CharSequence[] charSequenceArr2 = {X(this.O)};
                int i5 = n12Var.G3;
                ArrayList<TLRPC.MessageEntity> Y = ls6.d0(i5).Y(charSequenceArr2, true, true);
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
                    if (!TextUtils.isEmpty(X(charSequenceArr[i7]))) {
                        CharSequence[] charSequenceArr3 = {X(charSequenceArr[i7])};
                        ArrayList<TLRPC.MessageEntity> Y2 = ls6.d0(i5).Y(charSequenceArr3, true, true);
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
                jj.X(i5, n12Var.W0(), n12Var.S0() + 1, new gt(this, (zu1) n12Var.Z1, tL_messageMediaToDo, (byte) 12));
                return;
            }
            boolean z4 = this.d0;
            qob qobVar = this.s;
            boolean[] zArr = this.M;
            if (z4 && !this.Y0) {
                int i9 = 0;
                while (i3 < zArr.length) {
                    if (!TextUtils.isEmpty(X(charSequenceArr[i3])) && zArr[i3]) {
                        i9++;
                    }
                    i3++;
                }
                if (i9 <= 0) {
                    for (int i10 = this.u0; i10 < this.u0 + this.N; i10++) {
                        f89 L = qobVar.L(i10);
                        if (L != null) {
                            View view = L.a;
                            if (view instanceof zh8) {
                                zh8 zh8Var = (zh8) view;
                                if (zh8Var.getTop() > hl.L(40.0f)) {
                                    s62 s62Var = this.y;
                                    if (s62Var != null) {
                                        s62Var.e();
                                    }
                                    String M0 = ob6.M0(2131746882, null);
                                    lg5 lg5Var = this.E;
                                    lg5Var.setText(M0);
                                    lg5Var.c(zh8Var.getCheckBox());
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
                ih8 ih8Var = this.n1;
                if (i11 < length) {
                    if (TextUtils.isEmpty(X(charSequenceArr[i11])) && ih8Var.b(i11) != null) {
                        this.W0 = true;
                        this.X0 = i11;
                        qobVar.A0(this.u0 + i11);
                        return;
                    }
                    i11++;
                } else {
                    CharSequence[] charSequenceArr4 = {X(this.O)};
                    int i12 = n12Var.G3;
                    ArrayList<TLRPC.MessageEntity> Y3 = ls6.d0(i12).Y(charSequenceArr4, true, true);
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
                        if (TextUtils.isEmpty(X(charSequenceArr[i16]))) {
                            ih8Var.h(tL_messageMediaPoll.poll.answers.size());
                            i2 = i3;
                        } else {
                            CharSequence[] charSequenceArr5 = new CharSequence[i4];
                            charSequenceArr5[i3] = X(charSequenceArr[i16]);
                            ArrayList<TLRPC.MessageEntity> Y4 = ls6.d0(i12).Y(charSequenceArr5, i4, i4);
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
                    CharSequence X = X(this.Q);
                    if (X != null) {
                        tL_messageMediaPoll.results.solution = X.toString();
                        CharSequence[] charSequenceArr6 = new CharSequence[1];
                        charSequenceArr6[i19] = X;
                        ArrayList<TLRPC.MessageEntity> Y5 = ls6.d0(i12).Y(charSequenceArr6, true, true);
                        if (Y5 != null && !Y5.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = Y5;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    jj.X(i12, n12Var.W0(), n12Var.S0() + 1, new ku0(this, (zu1) n12Var.Z1, tL_messageMediaPoll, arrayList2, (byte) 6));
                    return;
                }
            }
        }
    }
}
