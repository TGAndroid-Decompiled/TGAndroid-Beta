package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class asc extends n7c {
    public String E;
    public int F;
    public TextView G;
    public FrameLayout H;
    public TextView I;
    public int K;
    public Runnable L;
    public boolean M;
    public bdb N;
    public l7 O;
    public TextView P;
    public ImageView Q;
    public ClipboardManager U;
    public FrameLayout W;
    public ImageView X;
    public ShapeDrawable Y;
    public int Z;
    public b61 a0;
    public int b0;
    public int c0;
    public int d0;
    public TL_wallet.nftItem e;
    public zx8 e0;
    public String f;
    public boolean h;
    public qn4 n;
    public boolean r;
    public bu9 x;
    public String y;
    public final ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final dw2 J = new dw2(this, (byte) 6);
    public boolean R = true;
    public boolean S = true;
    public boolean T = true;
    public final cw8 V = new cw8(this, (byte) 1);

    public static void d0(View view, boolean z, boolean z2) {
        float f;
        float f2;
        view.animate().cancel();
        view.setEnabled(z);
        if (z) {
            f2 = 1.0f;
            f = 1.0f;
        } else {
            f = 0.0f;
            f2 = 0.5f;
        }
        int i = 0;
        if (!z2) {
            view.setAlpha(f);
            view.setScaleX(f2);
            view.setScaleY(f2);
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        view.setVisibility(0);
        view.animate().alpha(f).scaleX(f2).scaleY(f2).setDuration(320L).setInterpolator(d53.h).withEndAction(new n28((byte) 28, view, z)).start();
    }

    public static boolean e0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !m9c.z(user) && !m9c.C(user.id)) {
            return true;
        }
        return false;
    }

    public static String l0(String str) {
        Uri i1 = goc.i1(str);
        if ("ton".equalsIgnoreCase(i1.getScheme())) {
            if ("transfer".equalsIgnoreCase(i1.getAuthority()) && i1.getPathSegments().size() == 1) {
                String str2 = i1.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        } else if (!goc.x0(i1)) {
            return null;
        } else {
            String j1 = goc.j1(i1);
            if (j1 != null) {
                return "@".concat(j1);
            }
            String queryParameter = i1.getQueryParameter("to");
            if (TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            if (!queryParameter.startsWith("@") && !queryParameter.matches("[a-zA-Z0-9_]{1,32}")) {
                if (!WalletEngine2.isValidRecipientAddress(queryParameter)) {
                    return null;
                }
                return queryParameter;
            }
            if (queryParameter.startsWith("@")) {
                queryParameter = queryParameter.substring(1);
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            return "@".concat(queryParameter);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        float f;
        ArrayList arrayList2;
        int i;
        int i2;
        int i3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        if (this.N != null) {
            arrayList.add(c6c.D(gm.L(4.0f)));
            l7cVar.V();
            arrayList.add(c6c.u(jb6.M0(2131742703, null)));
            bdb bdbVar = this.N;
            c6c c6cVar = new c6c(-1);
            c6cVar.c = bdbVar;
            c6cVar.A = 50;
            arrayList.add(c6cVar);
            l7cVar.U();
            String trim = this.O.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f8 = 12.0f;
            int i4 = 0;
            if (this.y != null) {
                if (this.H == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(cmb.f0(getThemedColor(cmb.h6), 2, -1));
                    boolean z = jb6.a0;
                    if (z) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    this.X = imageView;
                    ShapeDrawable K = cmb.K(gm.L(46.0f), getThemedColor(cmb.Ei));
                    this.Y = K;
                    imageView.setImageDrawable(new sn2(K, getParentActivity().getResources().getDrawable(2131231834).mutate()));
                    int i5 = i3 | 16;
                    if (z) {
                        f2 = 0.0f;
                    } else {
                        f2 = 11.0f;
                    }
                    if (z) {
                        f3 = 11.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    frameLayout.addView(imageView, qoe.d(46, 46.0f, i5, f2, 0.0f, f3, 0.0f));
                    TextView textView = new TextView(getParentActivity());
                    this.G = textView;
                    td4.v(16.0f, 2131742781, 1, textView, null);
                    anb.X(textView, cmb.F6, getResourceProvider());
                    textView.setTypeface(gm.o());
                    textView.setSingleLine();
                    textView.setGravity(i3);
                    if (z) {
                        f4 = 16.0f;
                    } else {
                        f4 = 72.0f;
                    }
                    if (z) {
                        f5 = 72.0f;
                    } else {
                        f5 = 16.0f;
                    }
                    frameLayout.addView(textView, qoe.d(-1, 24.0f, 48, f4, 8.0f, f5, 0.0f));
                    TextView textView2 = new TextView(getParentActivity());
                    this.I = textView2;
                    textView2.setTextSize(1, 14.0f);
                    anb.X(this.I, cmb.x6, getResourceProvider());
                    this.I.setSingleLine();
                    this.I.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    this.I.setGravity(i3);
                    TextView textView3 = this.I;
                    if (z) {
                        f6 = 16.0f;
                    } else {
                        f6 = 72.0f;
                    }
                    if (z) {
                        f7 = 72.0f;
                    } else {
                        f7 = 16.0f;
                    }
                    frameLayout.addView(textView3, qoe.d(-1, 22.0f, 48, f6, 32.0f, f7, 0.0f));
                    frameLayout.setOnClickListener(new urc(this, (byte) 0));
                    this.H = frameLayout;
                }
                TextView textView4 = this.G;
                String str = this.E;
                if (str == null) {
                    str = jb6.M0(2131742781, null);
                }
                textView4.setText(str);
                this.I.setText(this.y);
                arrayList.add(c6c.D(gm.L(12.0f)));
                l7cVar.V();
                FrameLayout frameLayout2 = this.H;
                c6c c6cVar2 = new c6c(-1);
                c6cVar2.c = frameLayout2;
                c6cVar2.A = 60;
                arrayList.add(c6cVar2);
                l7cVar.U();
                return;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = hs6.d0(this.currentAccount).j1;
                int size = arrayList3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList3.get(i6);
                    i6++;
                    float f9 = f8;
                    TLRPC.User W1 = getMessagesController().W1(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (e0(W1) && hashSet.add(Long.valueOf(W1.id))) {
                        arrayList2.add(W1);
                    }
                    f8 = f9;
                }
                f = f8;
                ArrayList arrayList4 = this.s;
                int size2 = arrayList4.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList4.get(i7);
                    i7++;
                    TLRPC.User user = (TLRPC.User) obj2;
                    if (hashSet.add(Long.valueOf(user.id))) {
                        arrayList2.add(user);
                    }
                }
            } else {
                f = 12.0f;
                arrayList2 = this.w;
            }
            int size3 = arrayList2.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList2.get(i9);
                i9++;
                TLRPC.User user2 = (TLRPC.User) obj3;
                if (i8 == 0) {
                    arrayList.add(c6c.D(gm.L(f)));
                    l7cVar.V();
                    if (TextUtils.isEmpty(lowerCase)) {
                        aq1.o(2131746103, null, arrayList);
                    }
                }
                c6c w = c6c.w(user2);
                if (!TextUtils.isEmpty(lowerCase)) {
                    w.m = gm.r0(user2.first_name, user2.last_name, trim);
                    String p = m9c.p(user2);
                    if (!TextUtils.isEmpty(p)) {
                        w.n = gm.r0(b10.h("@", p), null, "@".concat(trim));
                    }
                    i2 = i4;
                    w.G = new i48(user2, w.m, w.n, (byte) 16);
                } else {
                    i2 = i4;
                }
                arrayList.add(w);
                i8++;
                i4 = i2;
            }
            int i10 = i4;
            if (this.M) {
                if (i8 == 0) {
                    arrayList.add(c6c.D(gm.L(f)));
                    l7cVar.V();
                }
                if (this.E != null) {
                    i = 1;
                } else {
                    i = 3;
                }
                for (int i11 = i10; i11 < i; i11++) {
                    arrayList.add(c6c.q((-1) - i11, 18));
                }
            }
            if (i8 > 0 || this.M) {
                l7cVar.U();
            }
            if (!this.M && i8 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String M0 = jb6.M0(2131745535, null);
                Object[] objArr = new Object[1];
                objArr[i10] = lowerCase;
                arrayList.add(q22.i(jb6.a0(null, null, 2131742688, objArr), M0));
            }
        }
    }

    @Override
    public final CharSequence a0() {
        int i;
        if (this.e == null) {
            i = 2131742683;
        } else {
            i = 2131742643;
        }
        return jb6.M0(i, null);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        Object obj = c6cVar.H;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i = this.currentAccount;
            cf7.Y(i).a.c(new an0(i, user.id, (byte) 2));
            gm.t1(this.O);
            m0(null, user);
        }
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        this.a.setPadding(0, 0, 0, gm.L(68.0f));
        this.a.setClipToPadding(false);
        va vaVar = this.a;
        vaVar.g3.r = false;
        vaVar.j(new k2b(this, (byte) 12));
        bdb bdbVar = new bdb((byte) 8, context, this);
        this.U = (ClipboardManager) context.getSystemService("clipboard");
        l7 l7Var = new l7(context);
        this.O = l7Var;
        anb.X(l7Var, cmb.F6, getResourceProvider());
        l7 l7Var2 = this.O;
        wmb K = anb.K(0.72f, cmb.G6);
        anb.n(l7Var2, 1, K.a, -1, 2, K.d, getResourceProvider());
        boolean z = true;
        this.O.setTextSize(1, 16.0f);
        this.O.setHint(jb6.M0(2131742880, null));
        this.O.setSingleLine(true);
        this.O.setBackground(null);
        this.O.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        this.O.setClipToPadding(true);
        this.O.setCursorWidth(1.5f);
        this.O.setGravity(16);
        this.O.setInputType(524289);
        this.O.setImeOptions(33554437);
        bdbVar.addView(this.O, qoe.d(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setText(jb6.M0(2131742718, null));
        TextView textView2 = this.P;
        int i = cmb.m6;
        anb.X(textView2, i, getResourceProvider());
        this.P.setTextSize(1, 14.0f);
        this.P.setTypeface(gm.o());
        this.P.setGravity(17);
        int p1 = cmb.p1(0.1f, getThemedColor(i));
        TextView textView3 = this.P;
        int L = gm.L(16.0f);
        int p12 = cmb.p1(0.18f, getThemedColor(i));
        anb.R(textView3, cmb.i0(L, L, L, L, p1, p12, p12), anb.K(0.1f, i), anb.K(0.18f, i), getResourceProvider());
        this.P.setOnClickListener(new urc(this, (byte) 2));
        rve.b(this.P, 0.04f, 1.2f);
        bdbVar.addView(this.P, qoe.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.O.addTextChangedListener(new og6(this, (byte) 27));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.Q.setImageResource(2131232695);
        anb.s(this.Q, i, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        anb.R(this.Q, cmb.f0(cmb.p1(0.12f, getThemedColor(i)), 1, -1), null, anb.K(0.12f, i), getResourceProvider());
        this.Q.setContentDescription(jb6.M0(2131742690, null));
        this.Q.setOnClickListener(new urc(this, (byte) 3));
        bdbVar.addView(this.Q, qoe.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        k0(false);
        this.N = bdbVar;
        bu9 bu9Var = new bu9(true);
        this.x = bu9Var;
        bu9Var.a = new oo8(this, (byte) 22);
        getNotificationCenter().b(this.J, nm7.S0);
        hs6.d0(this.currentAccount).O0(true);
        this.s.clear();
        int i2 = this.currentAccount;
        cf7.Y(i2).a.c(new cu(i2, 0, new xrc(this), (byte) 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setPadding(gm.L(14.0f), gm.L(10.0f), gm.L(14.0f), gm.L(10.0f));
        int themedColor = getThemedColor(cmb.Z6);
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, themedColor), themedColor, themedColor}));
        b61 b61Var = new b61(getResourceProvider(), context, true);
        b61Var.setRoundRadius(24);
        this.a0 = b61Var;
        b61Var.setText(jb6.M0(2131742837, null));
        this.a0.setEnabled(false);
        this.a0.setOnClickListener(new urc(this, (byte) 1));
        b61 b61Var2 = this.a0;
        if (b61Var2 != null) {
            if (this.y == null) {
                z = false;
            }
            b61Var2.setEnabled(z);
        }
        this.W.addView(this.a0, qoe.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.W, qoe.e(-1, 68, 87));
        o0();
        this.a.g3.O(false);
        return this.fragmentView;
    }

    public final void f0(String str) {
        String l0 = l0(str);
        if (!this.isFinished && this.O != null && l0 != null) {
            if (l0.startsWith("@")) {
                int i = this.currentAccount;
                oc7.r1(i).Z1().a(l0.substring(1), null, new jr0(i, new vrc(this, (byte) 1), (byte) 6));
                return;
            }
            this.O.setText(l0);
            l7 l7Var = this.O;
            l7Var.setSelection(l7Var.length());
            gm.t1(this.O);
            m0(l0, null);
        }
    }

    public final void g0(int i, String str) {
        this.L = null;
        int i2 = this.currentAccount;
        jr0 jr0Var = new jr0(this, i, (byte) 7);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        this.F = ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new kc((byte) 0), new lf2(str, jr0Var, (byte) 23), oc7.r1(i2).r3, 0);
    }

    public final void h0(c cVar, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        this.n = null;
        if (this.r) {
            return;
        }
        this.a0.setLoading(false);
        if (wallettransaction != null && c.b(this.f, cVar.x())) {
            if (user != null) {
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                wallettransactionpeeruser.user_id = user.id;
                wallettransactionpeeruser.address = str;
                wallettransaction.peer = wallettransactionpeeruser;
            }
            goc.J0(getParentActivity(), this.currentAccount, wallettransaction, new qw1(this, cVar, user, str, (byte) 2), new o6b(this, (byte) 13), null, null, getResourceProvider());
            return;
        }
        this.h = false;
        c41 b0 = c41.b0(this);
        if (str2 == null) {
            str2 = jb6.M0(2131742855, null);
        }
        b0.f0(str2, false);
    }

    public final void i0() {
        if (getParentActivity() != null && this.e0 == null && this.Q != null) {
            gm.t1(this.O);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.e0 = zx8.k(this, this.Q, new pb((byte) 15), new vrc(this, (byte) 0), new wrc(this, (byte) 0));
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(String str) {
        String r;
        String p;
        ArrayList arrayList = this.w;
        arrayList.clear();
        if (!TextUtils.isEmpty(str) && this.y == null && this.E == null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = getMessagesController().K;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                if (dialog != null && dialog.id > 0) {
                    TLRPC.User W1 = getMessagesController().W1(Long.valueOf(dialog.id));
                    if (e0(W1) && (((r = m9c.r(W1)) != null && r.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((p = m9c.p(W1)) != null && p.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(W1.id))) {
                            arrayList.add(W1);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.x.e;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (e0(user) && hashSet.add(Long.valueOf(user.id))) {
                        arrayList.add(user);
                    }
                }
            }
            va vaVar = this.a;
            if (vaVar != null) {
                vaVar.g3.O(true);
                return;
            }
            return;
        }
        va vaVar2 = this.a;
        if (vaVar2 != null) {
            vaVar2.g3.O(true);
        }
    }

    public final void k0(boolean z) {
        if (!this.r && this.O != null && this.Q != null) {
            ClipboardManager clipboardManager = this.U;
            if (clipboardManager != null) {
                this.T = clipboardManager.hasPrimaryClip();
            } else {
                this.T = false;
            }
            p0(z);
        }
    }

    public final void m0(String str, TLRPC.User user) {
        String str2;
        rrc rrcVar;
        if (this.e == null) {
            if (user != null) {
                rrcVar = new rrc(user);
            } else {
                rrc rrcVar2 = new rrc(str);
                if (TextUtils.equals(str, this.y)) {
                    str2 = this.E;
                } else {
                    str2 = null;
                }
                rrcVar2.A0(str2);
                rrcVar = rrcVar2;
            }
            presentFragment(rrcVar);
        } else if (this.h) {
        } else {
            this.h = true;
            this.a0.setLoading(true);
            c C = c.C(this.currentAccount);
            i48 i48Var = new i48(this, C, user, (byte) 15);
            if (user != null) {
                C.i0(user, new s87(this, i48Var, (byte) 21));
            } else {
                i48Var.a(str);
            }
        }
    }

    public final void n0(TL_wallet.nftItem nftitem) {
        this.e = nftitem;
        this.f = c.C(this.currentAccount).x();
    }

    public final void o0() {
        int max = Math.max(0, this.c0 - this.b0);
        va vaVar = this.a;
        if (vaVar != null) {
            vaVar.setPadding(0, 0, 0, gm.L(68.0f) + this.b0 + max);
            this.a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.setPadding(gm.L(14.0f), gm.L(10.0f), gm.L(14.0f), gm.L(10.0f) + this.b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.W.getLayoutParams();
            layoutParams.height = gm.L(68.0f) + this.b0;
            this.W.setLayoutParams(layoutParams);
            if (this.d0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(d53.h).start();
                this.d0 = max;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        zx8 zx8Var = this.e0;
        if (zx8Var != null) {
            if (z) {
                zx8Var.e();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onFragmentDestroy() {
        this.r = true;
        zx8 zx8Var = this.e0;
        if (zx8Var != null) {
            zx8Var.g();
            gm.B2(this.e0);
            this.e0 = null;
        }
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        TextView textView = this.P;
        if (textView != null) {
            textView.animate().cancel();
        }
        ImageView imageView = this.Q;
        if (imageView != null) {
            imageView.animate().cancel();
        }
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
        }
        getNotificationCenter().n(this.J, nm7.S0);
        Runnable runnable = this.L;
        if (runnable != null) {
            gm.r(runnable);
        }
        qn4 qn4Var = this.n;
        if (qn4Var != null) {
            qn4Var.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.b0 = i4;
        o0();
    }

    @Override
    public final wzc onInsetsInternal(View view, wzc wzcVar) {
        this.c0 = wzcVar.a.f(8).d;
        return super.onInsetsInternal(view, wzcVar);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        zx8 zx8Var = this.e0;
        if (zx8Var != null) {
            zx8Var.g();
            gm.B2(this.e0);
            this.e0 = null;
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResultFragment(i, strArr, iArr);
        if (i == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                i0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = gm.S2(jb6.M0(2131746236, null));
            alertDialog$Builder.j(jb6.M0(2131747033, null), new xrc(this));
            alertDialog$Builder.g(jb6.M0(2131751709, null), null);
            int i2 = cmb.K5;
            alertDialog$Builder.l(2131624117, 72, cmb.w0(null, i2, false), null);
            alertDialog$Builder.m(i2, null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            cw8 cw8Var = this.V;
            clipboardManager.removePrimaryClipChangedListener(cw8Var);
            this.U.addPrimaryClipChangedListener(cw8Var);
        }
        k0(true);
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.W;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(cmb.Z6)) != this.Z) {
                this.Z = themedColor;
                ((GradientDrawable) this.W.getBackground()).setColors(new int[]{cmb.p1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.Y;
            if (shapeDrawable != null) {
                cmb.A1(getThemedColor(cmb.Ei), shapeDrawable);
                ImageView imageView = this.X;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p0(boolean z) {
        boolean z2;
        float f;
        if (this.Q != null) {
            boolean z3 = false;
            if (this.O.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.T) {
                z3 = true;
            }
            if (this.R != z3 || !z) {
                this.R = z3;
                d0(this.P, z3, z);
            }
            if (this.S != z2 || !z) {
                this.S = z2;
                d0(this.Q, z2, z);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            if (this.R) {
                f = 128.0f;
            } else if (this.S) {
                f = 60.0f;
            } else {
                f = 8.0f;
            }
            int L = gm.L(f);
            if (layoutParams.rightMargin != L) {
                layoutParams.rightMargin = L;
                this.O.setLayoutParams(layoutParams);
            }
        }
    }
}
