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
public final class ypc extends n5c {
    public String E;
    public int F;
    public TextView G;
    public FrameLayout H;
    public TextView I;
    public int K;
    public Runnable L;
    public boolean M;
    public zab N;
    public l7 O;
    public TextView P;
    public ImageView Q;
    public ClipboardManager U;
    public FrameLayout W;
    public ImageView X;
    public ShapeDrawable Y;
    public int Z;
    public u41 a0;
    public int b0;
    public int c0;
    public int d0;
    public TL_wallet.nftItem e;
    public yv8 e0;
    public String f;
    public boolean h;
    public iu4 n;
    public boolean r;
    public zr9 x;
    public String y;
    public final ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final su2 J = new su2(this, (byte) 6);
    public boolean R = true;
    public boolean S = true;
    public boolean T = true;
    public final bu8 V = new bu8(this, (byte) 1);

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
        view.animate().alpha(f).scaleX(f2).scaleY(f2).setDuration(320L).setInterpolator(s33.h).withEndAction(new k08((byte) 28, view, z)).start();
    }

    public static boolean d0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !l7c.z(user) && !l7c.C(user.id)) {
            return true;
        }
        return false;
    }

    public static String k0(String str) {
        Uri h1 = hmc.h1(str);
        if ("ton".equalsIgnoreCase(h1.getScheme())) {
            if ("transfer".equalsIgnoreCase(h1.getAuthority()) && h1.getPathSegments().size() == 1) {
                String str2 = h1.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        } else if (!hmc.w0(h1)) {
            return null;
        } else {
            String i1 = hmc.i1(h1);
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
    public final void Y(ArrayList arrayList, l5c l5cVar) {
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
            arrayList.add(c4c.D(gl.L(4.0f)));
            l5cVar.V();
            arrayList.add(c4c.u(k96.M0(2131742777, null)));
            zab zabVar = this.N;
            c4c c4cVar = new c4c(-1);
            c4cVar.c = zabVar;
            c4cVar.A = 50;
            arrayList.add(c4cVar);
            l5cVar.U();
            String trim = this.O.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f8 = 12.0f;
            int i4 = 0;
            if (this.y != null) {
                if (this.H == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(bkb.f0(getThemedColor(bkb.h6), 2, -1));
                    boolean z = k96.a0;
                    if (z) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    this.X = imageView;
                    ShapeDrawable K = bkb.K(gl.L(46.0f), getThemedColor(bkb.Ei));
                    this.Y = K;
                    imageView.setImageDrawable(new fm2(K, getParentActivity().getResources().getDrawable(2131231833).mutate()));
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
                    frameLayout.addView(imageView, nme.d(46, 46.0f, i5, f2, 0.0f, f3, 0.0f));
                    TextView textView = new TextView(getParentActivity());
                    this.G = textView;
                    tb4.u(16.0f, 2131742855, 1, textView, null);
                    zkb.X(textView, bkb.F6, getResourceProvider());
                    textView.setTypeface(gl.o());
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
                    frameLayout.addView(textView, nme.d(-1, 24.0f, 48, f4, 8.0f, f5, 0.0f));
                    TextView textView2 = new TextView(getParentActivity());
                    this.I = textView2;
                    textView2.setTextSize(1, 14.0f);
                    zkb.X(this.I, bkb.x6, getResourceProvider());
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
                    frameLayout.addView(textView3, nme.d(-1, 22.0f, 48, f6, 32.0f, f7, 0.0f));
                    frameLayout.setOnClickListener(new tpc(this, (byte) 0));
                    this.H = frameLayout;
                }
                TextView textView4 = this.G;
                String str = this.E;
                if (str == null) {
                    str = k96.M0(2131742855, null);
                }
                textView4.setText(str);
                this.I.setText(this.y);
                arrayList.add(c4c.D(gl.L(12.0f)));
                l5cVar.V();
                FrameLayout frameLayout2 = this.H;
                c4c c4cVar2 = new c4c(-1);
                c4cVar2.c = frameLayout2;
                c4cVar2.A = 60;
                arrayList.add(c4cVar2);
                l5cVar.U();
                return;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = hq6.d0(this.currentAccount).j1;
                int size = arrayList3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList3.get(i6);
                    i6++;
                    float f9 = f8;
                    TLRPC.User V1 = getMessagesController().V1(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (d0(V1) && hashSet.add(Long.valueOf(V1.id))) {
                        arrayList2.add(V1);
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
                    arrayList.add(c4c.D(gl.L(f)));
                    l5cVar.V();
                    if (TextUtils.isEmpty(lowerCase)) {
                        oo1.o(2131746177, null, arrayList);
                    }
                }
                c4c w = c4c.w(user2);
                if (!TextUtils.isEmpty(lowerCase)) {
                    w.m = gl.r0(user2.first_name, user2.last_name, trim);
                    String p = l7c.p(user2);
                    if (!TextUtils.isEmpty(p)) {
                        w.n = gl.r0(b00.h("@", p), null, "@".concat(trim));
                    }
                    i2 = i4;
                    w.G = new f28(user2, w.m, w.n, (byte) 16);
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
                    arrayList.add(c4c.D(gl.L(f)));
                    l5cVar.V();
                }
                if (this.E != null) {
                    i = 1;
                } else {
                    i = 3;
                }
                for (int i11 = i10; i11 < i; i11++) {
                    arrayList.add(c4c.q((-1) - i11, 18));
                }
            }
            if (i8 > 0 || this.M) {
                l5cVar.U();
            }
            if (!this.M && i8 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String M0 = k96.M0(2131745609, null);
                Object[] objArr = new Object[1];
                objArr[i10] = lowerCase;
                arrayList.add(f12.i(k96.a0(null, null, 2131742762, objArr), M0));
            }
        }
    }

    @Override
    public final CharSequence Z() {
        int i;
        if (this.e == null) {
            i = 2131742757;
        } else {
            i = 2131742717;
        }
        return k96.M0(i, null);
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
        Object obj = c4cVar.H;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i = this.currentAccount;
            ad7.Y(i).a.c(new am0(i, user.id, (byte) 2));
            gl.t1(this.O);
            l0(null, user);
        }
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        this.a.setPadding(0, 0, 0, gl.L(68.0f));
        this.a.setClipToPadding(false);
        va vaVar = this.a;
        vaVar.g3.r = false;
        vaVar.j(new vdb(this, (byte) 11));
        zab zabVar = new zab((byte) 8, context, this);
        this.U = (ClipboardManager) context.getSystemService("clipboard");
        l7 l7Var = new l7(context);
        this.O = l7Var;
        zkb.X(l7Var, bkb.F6, getResourceProvider());
        l7 l7Var2 = this.O;
        vkb K = zkb.K(0.72f, bkb.G6);
        zkb.n(l7Var2, 1, K.a, -1, 2, K.d, getResourceProvider());
        boolean z = true;
        this.O.setTextSize(1, 16.0f);
        this.O.setHint(k96.M0(2131742954, null));
        this.O.setSingleLine(true);
        this.O.setBackground(null);
        this.O.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        this.O.setClipToPadding(true);
        this.O.setCursorWidth(1.5f);
        this.O.setGravity(16);
        this.O.setInputType(524289);
        this.O.setImeOptions(33554437);
        zabVar.addView(this.O, nme.d(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setText(k96.M0(2131742792, null));
        TextView textView2 = this.P;
        int i = bkb.m6;
        zkb.X(textView2, i, getResourceProvider());
        this.P.setTextSize(1, 14.0f);
        this.P.setTypeface(gl.o());
        this.P.setGravity(17);
        int p1 = bkb.p1(0.1f, getThemedColor(i));
        TextView textView3 = this.P;
        int L = gl.L(16.0f);
        int p12 = bkb.p1(0.18f, getThemedColor(i));
        zkb.R(textView3, bkb.i0(L, L, L, L, p1, p12, p12), zkb.K(0.1f, i), zkb.K(0.18f, i), getResourceProvider());
        this.P.setOnClickListener(new tpc(this, (byte) 2));
        ote.b(this.P, 0.04f, 1.2f);
        zabVar.addView(this.P, nme.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.O.addTextChangedListener(new jf6(this, (byte) 26));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.Q.setImageResource(2131232683);
        zkb.s(this.Q, i, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        zkb.R(this.Q, bkb.f0(bkb.p1(0.12f, getThemedColor(i)), 1, -1), null, zkb.K(0.12f, i), getResourceProvider());
        this.Q.setContentDescription(k96.M0(2131742764, null));
        this.Q.setOnClickListener(new tpc(this, (byte) 3));
        zabVar.addView(this.Q, nme.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        j0(false);
        this.N = zabVar;
        zr9 zr9Var = new zr9(true);
        this.x = zr9Var;
        zr9Var.a = new v39(this, (byte) 19);
        getNotificationCenter().b(this.J, kk7.R0);
        hq6.d0(this.currentAccount).O0(true);
        this.s.clear();
        int i2 = this.currentAccount;
        ad7.Y(i2).a.c(new bt(i2, 0, new wpc(this), (byte) 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setPadding(gl.L(14.0f), gl.L(10.0f), gl.L(14.0f), gl.L(10.0f));
        int themedColor = getThemedColor(bkb.Z6);
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, themedColor), themedColor, themedColor}));
        u41 u41Var = new u41(getResourceProvider(), context, true);
        u41Var.setRoundRadius(24);
        this.a0 = u41Var;
        u41Var.setText(k96.M0(2131742911, null));
        this.a0.setEnabled(false);
        this.a0.setOnClickListener(new tpc(this, (byte) 1));
        u41 u41Var2 = this.a0;
        if (u41Var2 != null) {
            if (this.y == null) {
                z = false;
            }
            u41Var2.setEnabled(z);
        }
        this.W.addView(this.a0, nme.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.W, nme.e(-1, 68, 87));
        n0();
        this.a.g3.O(false);
        return this.fragmentView;
    }

    public final void e0(String str) {
        String k0 = k0(str);
        if (!this.isFinished && this.O != null && k0 != null) {
            if (k0.startsWith("@")) {
                int i = this.currentAccount;
                na7.q1(i).Y1().a(k0.substring(1), null, new jq0(i, new upc(this, (byte) 1), (byte) 6));
                return;
            }
            this.O.setText(k0);
            l7 l7Var = this.O;
            l7Var.setSelection(l7Var.length());
            gl.t1(this.O);
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
        this.F = ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new hc((byte) 0), new ae2(str, jq0Var, (byte) 21), na7.q1(i2).r3, 0);
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
            hmc.I0(getParentActivity(), this.currentAccount, wallettransaction, new ev1(this, cVar, user, str, (byte) 2), new n4b(this, (byte) 13), null, null, getResourceProvider());
            return;
        }
        this.h = false;
        u21 b0 = u21.b0(this);
        if (str2 == null) {
            str2 = k96.M0(2131742929, null);
        }
        b0.f0(str2, false);
    }

    public final void h0() {
        if (getParentActivity() != null && this.e0 == null && this.Q != null) {
            gl.t1(this.O);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.e0 = yv8.k(this, this.Q, new pb((byte) 15), new upc(this, (byte) 0), new vpc(this, (byte) 0));
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
                    TLRPC.User V1 = getMessagesController().V1(Long.valueOf(dialog.id));
                    if (d0(V1) && (((r = l7c.r(V1)) != null && r.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((p = l7c.p(V1)) != null && p.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(V1.id))) {
                            arrayList.add(V1);
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
        qpc qpcVar;
        if (this.e == null) {
            if (user != null) {
                qpcVar = new qpc(user);
            } else {
                qpc qpcVar2 = new qpc(str);
                if (TextUtils.equals(str, this.y)) {
                    str2 = this.E;
                } else {
                    str2 = null;
                }
                qpcVar2.z0(str2);
                qpcVar = qpcVar2;
            }
            presentFragment(qpcVar);
        } else if (this.h) {
        } else {
            this.h = true;
            this.a0.setLoading(true);
            c C = c.C(this.currentAccount);
            f28 f28Var = new f28(this, C, user, (byte) 15);
            if (user != null) {
                C.i0(user, new w77(this, f28Var, (byte) 19));
            } else {
                f28Var.a(str);
            }
        }
    }

    public final void m0(TL_wallet.nftItem nftitem) {
        this.e = nftitem;
        this.f = c.C(this.currentAccount).x();
    }

    public final void n0() {
        int max = Math.max(0, this.c0 - this.b0);
        va vaVar = this.a;
        if (vaVar != null) {
            vaVar.setPadding(0, 0, 0, gl.L(68.0f) + this.b0 + max);
            this.a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.setPadding(gl.L(14.0f), gl.L(10.0f), gl.L(14.0f), gl.L(10.0f) + this.b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.W.getLayoutParams();
            layoutParams.height = gl.L(68.0f) + this.b0;
            this.W.setLayoutParams(layoutParams);
            if (this.d0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(s33.h).start();
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
            int L = gl.L(f);
            if (layoutParams.rightMargin != L) {
                layoutParams.rightMargin = L;
                this.O.setLayoutParams(layoutParams);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        yv8 yv8Var = this.e0;
        if (yv8Var != null) {
            if (z) {
                yv8Var.e();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onFragmentDestroy() {
        this.r = true;
        yv8 yv8Var = this.e0;
        if (yv8Var != null) {
            yv8Var.g();
            gl.B2(this.e0);
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
        getNotificationCenter().n(this.J, kk7.R0);
        Runnable runnable = this.L;
        if (runnable != null) {
            gl.r(runnable);
        }
        iu4 iu4Var = this.n;
        if (iu4Var != null) {
            iu4Var.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.b0 = i4;
        n0();
    }

    @Override
    public final vxc onInsetsInternal(View view, vxc vxcVar) {
        this.c0 = vxcVar.a.f(8).d;
        return super.onInsetsInternal(view, vxcVar);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        yv8 yv8Var = this.e0;
        if (yv8Var != null) {
            yv8Var.g();
            gl.B2(this.e0);
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
            alertDialog$Builder.a.U = gl.S2(k96.M0(2131746310, null));
            alertDialog$Builder.j(k96.M0(2131747107, null), new wpc(this));
            alertDialog$Builder.g(k96.M0(2131751760, null), null);
            int i2 = bkb.K5;
            alertDialog$Builder.l(2131624117, 72, bkb.w0(null, i2, false), null);
            alertDialog$Builder.m(i2, null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            bu8 bu8Var = this.V;
            clipboardManager.removePrimaryClipChangedListener(bu8Var);
            this.U.addPrimaryClipChangedListener(bu8Var);
        }
        j0(true);
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.W;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(bkb.Z6)) != this.Z) {
                this.Z = themedColor;
                ((GradientDrawable) this.W.getBackground()).setColors(new int[]{bkb.p1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.Y;
            if (shapeDrawable != null) {
                bkb.A1(getThemedColor(bkb.Ei), shapeDrawable);
                ImageView imageView = this.X;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
