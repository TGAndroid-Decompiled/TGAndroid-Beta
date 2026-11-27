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
public final class muc extends n9c {
    public String E;
    public int F;
    public TextView G;
    public FrameLayout H;
    public TextView I;
    public int K;
    public Runnable L;
    public boolean M;
    public h8b N;
    public m7 O;
    public TextView P;
    public ImageView Q;
    public ClipboardManager U;
    public FrameLayout W;
    public ImageView X;
    public ShapeDrawable Y;
    public int Z;
    public c51 a0;
    public int b0;
    public int c0;
    public int d0;
    public TL_wallet.nftItem e;
    public jz8 e0;
    public String f;
    public boolean h;
    public rj4 n;
    public boolean r;
    public sv9 x;
    public String y;
    public final ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final nv2 J = new nv2(this, (byte) 6);
    public boolean R = true;
    public boolean S = true;
    public boolean T = true;
    public final kx8 V = new kx8(this, (byte) 1);

    public static void c0(View view, boolean z, boolean z2) {
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
        view.animate().alpha(f).scaleX(f2).scaleY(f2).setDuration(320L).setInterpolator(k43.h).withEndAction(new q38((byte) 29, view, z)).start();
    }

    public static boolean d0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !lbc.z(user) && !lbc.C(user.id)) {
            return true;
        }
        return false;
    }

    public static String k0(String str) {
        Uri h1 = uqc.h1(str);
        if ("ton".equalsIgnoreCase(h1.getScheme())) {
            if ("transfer".equalsIgnoreCase(h1.getAuthority()) && h1.getPathSegments().size() == 1) {
                String str2 = h1.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        } else if (!uqc.x0(h1)) {
            return null;
        } else {
            String i1 = uqc.i1(h1);
            if (i1 != null) {
                return "@".concat(i1);
            }
            String queryParameter = h1.getQueryParameter("to");
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
    public final void Y(ArrayList arrayList, l9c l9cVar) {
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
            arrayList.add(b8c.D(hl.L(4.0f)));
            l9cVar.V();
            arrayList.add(b8c.u(ob6.M0(2131742671, null)));
            h8b h8bVar = this.N;
            b8c b8cVar = new b8c(-1);
            b8cVar.c = h8bVar;
            b8cVar.A = 50;
            arrayList.add(b8cVar);
            l9cVar.U();
            String trim = this.O.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f8 = 12.0f;
            int i4 = 0;
            if (this.y != null) {
                if (this.H == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(aob.f0(getThemedColor(aob.i6), 2, -1));
                    boolean z = ob6.a0;
                    if (z) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    this.X = imageView;
                    ShapeDrawable K = aob.K(hl.L(46.0f), getThemedColor(aob.Fi));
                    this.Y = K;
                    imageView.setImageDrawable(new zm2(K, getParentActivity().getResources().getDrawable(2131231833).mutate()));
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
                    frameLayout.addView(imageView, tre.d(46, 46.0f, i5, f2, 0.0f, f3, 0.0f));
                    TextView textView = new TextView(getParentActivity());
                    this.G = textView;
                    qd4.u(16.0f, 2131742749, 1, textView, null);
                    yob.X(textView, aob.G6, getResourceProvider());
                    textView.setTypeface(hl.o());
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
                    frameLayout.addView(textView, tre.d(-1, 24.0f, 48, f4, 8.0f, f5, 0.0f));
                    TextView textView2 = new TextView(getParentActivity());
                    this.I = textView2;
                    textView2.setTextSize(1, 14.0f);
                    yob.X(this.I, aob.y6, getResourceProvider());
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
                    frameLayout.addView(textView3, tre.d(-1, 22.0f, 48, f6, 32.0f, f7, 0.0f));
                    frameLayout.setOnClickListener(new huc(this, (byte) 0));
                    this.H = frameLayout;
                }
                TextView textView4 = this.G;
                String str = this.E;
                if (str == null) {
                    str = ob6.M0(2131742749, null);
                }
                textView4.setText(str);
                this.I.setText(this.y);
                arrayList.add(b8c.D(hl.L(12.0f)));
                l9cVar.V();
                FrameLayout frameLayout2 = this.H;
                b8c b8cVar2 = new b8c(-1);
                b8cVar2.c = frameLayout2;
                b8cVar2.A = 60;
                arrayList.add(b8cVar2);
                l9cVar.U();
                return;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = ls6.d0(this.currentAccount).j1;
                int size = arrayList3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList3.get(i6);
                    i6++;
                    float f9 = f8;
                    TLRPC.User X1 = getMessagesController().X1(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (d0(X1) && hashSet.add(Long.valueOf(X1.id))) {
                        arrayList2.add(X1);
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
                    arrayList.add(b8c.D(hl.L(f)));
                    l9cVar.V();
                    if (TextUtils.isEmpty(lowerCase)) {
                        bp1.o(2131746097, null, arrayList);
                    }
                }
                b8c w = b8c.w(user2);
                if (!TextUtils.isEmpty(lowerCase)) {
                    w.m = hl.r0(user2.first_name, user2.last_name, trim);
                    String p = lbc.p(user2);
                    if (!TextUtils.isEmpty(p)) {
                        w.n = hl.r0(c00.i("@", p), null, "@".concat(trim));
                    }
                    i2 = i4;
                    w.G = new w58(user2, w.m, w.n, (byte) 16);
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
                    arrayList.add(b8c.D(hl.L(f)));
                    l9cVar.V();
                }
                if (this.E != null) {
                    i = 1;
                } else {
                    i = 3;
                }
                for (int i11 = i10; i11 < i; i11++) {
                    arrayList.add(b8c.q((-1) - i11, 18));
                }
            }
            if (i8 > 0 || this.M) {
                l9cVar.U();
            }
            if (!this.M && i8 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String M0 = ob6.M0(2131745529, null);
                Object[] objArr = new Object[1];
                objArr[i10] = lowerCase;
                arrayList.add(v12.i(ob6.a0(null, null, 2131742656, objArr), M0));
            }
        }
    }

    @Override
    public final CharSequence Z() {
        int i;
        if (this.e == null) {
            i = 2131742651;
        } else {
            i = 2131742611;
        }
        return ob6.M0(i, null);
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
        Object obj = b8cVar.H;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i = this.currentAccount;
            kf7.a0(i).a.c(new am0(i, user.id, (byte) 2));
            hl.t1(this.O);
            l0(null, user);
        }
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.s1();
        this.a.setPadding(0, 0, 0, hl.L(68.0f));
        this.a.setClipToPadding(false);
        wa waVar = this.a;
        waVar.g3.r = false;
        waVar.j(new qhb(this, (byte) 11));
        h8b h8bVar = new h8b((byte) 10, context, this);
        this.U = (ClipboardManager) context.getSystemService("clipboard");
        m7 m7Var = new m7(context);
        this.O = m7Var;
        yob.X(m7Var, aob.G6, getResourceProvider());
        m7 m7Var2 = this.O;
        uob K = yob.K(0.72f, aob.H6);
        yob.n(m7Var2, 1, K.a, -1, 2, K.d, getResourceProvider());
        boolean z = true;
        this.O.setTextSize(1, 16.0f);
        this.O.setHint(ob6.M0(2131742848, null));
        this.O.setSingleLine(true);
        this.O.setBackground(null);
        this.O.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        this.O.setClipToPadding(true);
        this.O.setCursorWidth(1.5f);
        this.O.setGravity(16);
        this.O.setInputType(524289);
        this.O.setImeOptions(33554437);
        h8bVar.addView(this.O, tre.d(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setText(ob6.M0(2131742686, null));
        TextView textView2 = this.P;
        int i = aob.n6;
        yob.X(textView2, i, getResourceProvider());
        this.P.setTextSize(1, 14.0f);
        this.P.setTypeface(hl.o());
        this.P.setGravity(17);
        int p1 = aob.p1(0.1f, getThemedColor(i));
        TextView textView3 = this.P;
        int L = hl.L(16.0f);
        int p12 = aob.p1(0.18f, getThemedColor(i));
        yob.R(textView3, aob.i0(L, L, L, L, p1, p12, p12), yob.K(0.1f, i), yob.K(0.18f, i), getResourceProvider());
        this.P.setOnClickListener(new huc(this, (byte) 2));
        iye.b(this.P, 0.04f, 1.2f);
        h8bVar.addView(this.P, tre.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.O.addTextChangedListener(new nh6(this, (byte) 27));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.Q.setImageResource(2131232694);
        yob.s(this.Q, i, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        yob.R(this.Q, aob.f0(aob.p1(0.12f, getThemedColor(i)), 1, -1), null, yob.K(0.12f, i), getResourceProvider());
        this.Q.setContentDescription(ob6.M0(2131742658, null));
        this.Q.setOnClickListener(new huc(this, (byte) 3));
        h8bVar.addView(this.Q, tre.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        j0(false);
        this.N = h8bVar;
        sv9 sv9Var = new sv9(true);
        this.x = sv9Var;
        sv9Var.a = new l09(this, (byte) 19);
        getNotificationCenter().b(this.J, jn7.S0);
        ls6.d0(this.currentAccount).O0(true);
        this.s.clear();
        int i2 = this.currentAccount;
        kf7.a0(i2).a.c(new bt(i2, 0, new kuc(this), (byte) 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setPadding(hl.L(14.0f), hl.L(10.0f), hl.L(14.0f), hl.L(10.0f));
        int themedColor = getThemedColor(aob.a7);
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, themedColor), themedColor, themedColor}));
        c51 c51Var = new c51(getResourceProvider(), context, true);
        c51Var.setRoundRadius(24);
        this.a0 = c51Var;
        c51Var.setText(ob6.M0(2131742805, null));
        this.a0.setEnabled(false);
        this.a0.setOnClickListener(new huc(this, (byte) 1));
        c51 c51Var2 = this.a0;
        if (c51Var2 != null) {
            if (this.y == null) {
                z = false;
            }
            c51Var2.setEnabled(z);
        }
        this.W.addView(this.a0, tre.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.W, tre.e(-1, 68, 87));
        n0();
        this.a.g3.O(false);
        return this.fragmentView;
    }

    public final void e0(String str) {
        String k0 = k0(str);
        if (!this.isFinished && this.O != null && k0 != null) {
            if (k0.startsWith("@")) {
                int i = this.currentAccount;
                uc7.s1(i).a2().a(k0.substring(1), null, new jq0(i, new iuc(this, (byte) 1), (byte) 6));
                return;
            }
            this.O.setText(k0);
            m7 m7Var = this.O;
            m7Var.setSelection(m7Var.length());
            hl.t1(this.O);
            l0(k0, null);
        }
    }

    public final void f0(int i, String str) {
        this.L = null;
        int i2 = this.currentAccount;
        jq0 jq0Var = new jq0(this, i, (byte) 7);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        this.F = ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new ic((byte) 0), new qe2(str, jq0Var, (byte) 21), uc7.s1(i2).s3, 0);
    }

    public final void g0(c cVar, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
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
            uqc.I0(getParentActivity(), this.currentAccount, wallettransaction, new bw1(this, cVar, user, str, (byte) 2), new l8b(this, (byte) 13), null, null, getResourceProvider());
            return;
        }
        this.h = false;
        d31 b0 = d31.b0(this);
        if (str2 == null) {
            str2 = ob6.M0(2131742823, null);
        }
        b0.f0(str2, false);
    }

    public final void h0() {
        if (getParentActivity() != null && this.e0 == null && this.Q != null) {
            hl.t1(this.O);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.e0 = jz8.k(this, this.Q, new sb((byte) 15), new iuc(this, (byte) 0), new juc(this, (byte) 0));
            }
        }
    }

    public final void i0(String str) {
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
                    TLRPC.User X1 = getMessagesController().X1(Long.valueOf(dialog.id));
                    if (d0(X1) && (((r = lbc.r(X1)) != null && r.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((p = lbc.p(X1)) != null && p.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(X1.id))) {
                            arrayList.add(X1);
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
                    if (d0(user) && hashSet.add(Long.valueOf(user.id))) {
                        arrayList.add(user);
                    }
                }
            }
            wa waVar = this.a;
            if (waVar != null) {
                waVar.g3.O(true);
                return;
            }
            return;
        }
        wa waVar2 = this.a;
        if (waVar2 != null) {
            waVar2.g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z) {
        if (!this.r && this.O != null && this.Q != null) {
            ClipboardManager clipboardManager = this.U;
            if (clipboardManager != null) {
                this.T = clipboardManager.hasPrimaryClip();
            } else {
                this.T = false;
            }
            o0(z);
        }
    }

    public final void l0(String str, TLRPC.User user) {
        String str2;
        euc eucVar;
        if (this.e == null) {
            if (user != null) {
                eucVar = new euc(user);
            } else {
                euc eucVar2 = new euc(str);
                if (TextUtils.equals(str, this.y)) {
                    str2 = this.E;
                } else {
                    str2 = null;
                }
                eucVar2.A0(str2);
                eucVar = eucVar2;
            }
            presentFragment(eucVar);
        } else if (this.h) {
        } else {
            this.h = true;
            this.a0.setLoading(true);
            c C = c.C(this.currentAccount);
            w58 w58Var = new w58(this, C, user, (byte) 15);
            if (user != null) {
                C.k0(user, new ia7(this, w58Var, (byte) 19));
            } else {
                w58Var.a(str);
            }
        }
    }

    public final void m0(TL_wallet.nftItem nftitem) {
        this.e = nftitem;
        this.f = c.C(this.currentAccount).x();
    }

    public final void n0() {
        int max = Math.max(0, this.c0 - this.b0);
        wa waVar = this.a;
        if (waVar != null) {
            waVar.setPadding(0, 0, 0, hl.L(68.0f) + this.b0 + max);
            this.a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.setPadding(hl.L(14.0f), hl.L(10.0f), hl.L(14.0f), hl.L(10.0f) + this.b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.W.getLayoutParams();
            layoutParams.height = hl.L(68.0f) + this.b0;
            this.W.setLayoutParams(layoutParams);
            if (this.d0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(k43.h).start();
                this.d0 = max;
            }
        }
    }

    public final void o0(boolean z) {
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
                c0(this.P, z3, z);
            }
            if (this.S != z2 || !z) {
                this.S = z2;
                c0(this.Q, z2, z);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            if (this.R) {
                f = 128.0f;
            } else if (this.S) {
                f = 60.0f;
            } else {
                f = 8.0f;
            }
            int L = hl.L(f);
            if (layoutParams.rightMargin != L) {
                layoutParams.rightMargin = L;
                this.O.setLayoutParams(layoutParams);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        jz8 jz8Var = this.e0;
        if (jz8Var != null) {
            if (z) {
                jz8Var.e();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onFragmentDestroy() {
        this.r = true;
        jz8 jz8Var = this.e0;
        if (jz8Var != null) {
            jz8Var.g();
            hl.B2(this.e0);
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
        getNotificationCenter().n(this.J, jn7.S0);
        Runnable runnable = this.L;
        if (runnable != null) {
            hl.r(runnable);
        }
        rj4 rj4Var = this.n;
        if (rj4Var != null) {
            rj4Var.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.b0 = i4;
        n0();
    }

    @Override
    public final l2d onInsetsInternal(View view, l2d l2dVar) {
        this.c0 = l2dVar.a.f(8).d;
        return super.onInsetsInternal(view, l2dVar);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        jz8 jz8Var = this.e0;
        if (jz8Var != null) {
            jz8Var.g();
            hl.B2(this.e0);
            this.e0 = null;
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResultFragment(i, strArr, iArr);
        if (i == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                h0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = hl.S2(ob6.M0(2131746230, null));
            alertDialog$Builder.j(ob6.M0(2131747027, null), new kuc(this));
            alertDialog$Builder.g(ob6.M0(2131751737, null), null);
            int i2 = aob.L5;
            alertDialog$Builder.l(2131624117, 72, aob.w0(null, i2, false), null);
            alertDialog$Builder.m(i2, null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            kx8 kx8Var = this.V;
            clipboardManager.removePrimaryClipChangedListener(kx8Var);
            this.U.addPrimaryClipChangedListener(kx8Var);
        }
        j0(true);
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.W;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(aob.a7)) != this.Z) {
                this.Z = themedColor;
                ((GradientDrawable) this.W.getBackground()).setColors(new int[]{aob.p1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.Y;
            if (shapeDrawable != null) {
                aob.A1(getThemedColor(aob.Fi), shapeDrawable);
                ImageView imageView = this.X;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
