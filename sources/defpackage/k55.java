package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public abstract class k55 {
    public static final ArrayList a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, ylb ylbVar) {
        bf0 bf0Var = new bf0(context);
        bf0Var.setRoundRadius(gm.L(38.0f));
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.q(user);
        bf0Var.f(user, pc0Var);
        linearLayout.addView(bf0Var, qoe.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = w45.v(context, charSequence, 20, ylbVar);
        v.setTypeface(gm.o());
        linearLayout.addView(v, qoe.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String p = m9c.p(user);
        if (!TextUtils.isEmpty(p)) {
            linearLayout.addView(w45.g(context, "@" + p, ylbVar), qoe.t(-2, -2, 1, 36, 6, 36, 12));
            return;
        }
        linearLayout.addView(new View(context), qoe.o(-1, 12));
    }

    public static void b(mk7 mk7Var, j55 j55Var) {
        mk7Var.d0 = false;
        mk7Var.z0 = new tu(j55Var, (byte) 2);
        mk7Var.setOnDismissListener(new n1(j55Var, (byte) 22));
        mk7Var.show();
        gm.d3(new ve4(j55Var, mk7Var, (byte) 23), 700L);
    }

    public static void c(Context context, final int i, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final ylb ylbVar, h55 h55Var) {
        int i2;
        int i3;
        float f;
        String M0;
        int i4;
        final c C = c.C(i);
        boolean equals = "text".equals(jSONObject.optString("type"));
        final mk7 mk7Var = new mk7(context, ylbVar, new View[0]);
        mk7Var.E0(cmb.v0(cmb.Z6, ylbVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, jb6.V(null, null, 2131742879, m9c.r(user)), ylbVar);
        LinearLayout i5 = hg9.i(context, 1);
        i5.setPadding(gm.L(20.0f), gm.L(16.0f), gm.L(20.0f), gm.L(16.0f));
        int L = gm.L(16.0f);
        int i6 = cmb.c6;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i6, ylbVar));
        wmb M = anb.M(i6);
        i5.setBackground(b0);
        anb.j(i5, b0, M, null, ylbVar);
        if (equals) {
            i2 = 2131742673;
        } else {
            i2 = 2131742867;
        }
        TextView v = w45.v(context, jb6.M0(i2, null), 14, ylbVar);
        v.setGravity(3);
        v.setTypeface(gm.o());
        if (equals) {
            i3 = cmb.K6;
        } else {
            i3 = cmb.p7;
        }
        anb.X(v, i3, ylbVar);
        if (equals) {
            f = 12.0f;
        } else {
            f = 4.0f;
        }
        i5.addView(v, qoe.k(0.0f, 0.0f, 0.0f, f, -1, -2));
        if (equals) {
            M0 = jSONObject.optString("text");
            i4 = 14;
        } else {
            M0 = jb6.M0(2131742866, null);
            i4 = 16;
        }
        TextView v2 = w45.v(context, M0, i4, ylbVar);
        v2.setGravity(3);
        if (equals) {
            v2.setTypeface(Typeface.MONOSPACE);
        }
        i5.addView(v2, qoe.o(-1, -2));
        g55 g55Var = new g55(context, 320);
        g55Var.addView(i5);
        linearLayout.addView(g55Var, qoe.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        lk7 lk7Var = new lk7(context);
        lk7Var.getContent().addView(linearLayout, qoe.c(-2.0f, -1));
        mk7Var.D0(lk7Var);
        LinearLayout i7 = hg9.i(context, 1);
        if (equals) {
            TextView v3 = w45.v(context, jb6.M0(2131742692, null), 14, ylbVar);
            v3.setGravity(3);
            anb.X(v3, cmb.y6, ylbVar);
            i7.addView(v3, qoe.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        b61 b61Var = new b61(ylbVar, context, true);
        b61Var.setRoundRadius(24);
        b61Var.e();
        b61Var.setText(jb6.M0(2131752542, null));
        final b61 i8 = mlb.i(24, ylbVar, context, true);
        i8.setText(jb6.M0(2131742675, null));
        linearLayout2.addView(b61Var, qoe.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(i8, qoe.m(1.0f, 0, 44, 6, 0, 0));
        i7.addView(linearLayout2);
        mk7Var.F0(i7);
        final j55 j55Var = new j55(mk7Var, h55Var);
        final if4 if4Var = new if4(j55Var, i8, b61Var, (byte) 18);
        j55Var.g = if4Var;
        b61Var.setOnClickListener(new y45(j55Var, (byte) 1));
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final j55 j55Var2 = j55Var;
                if (!j55Var2.a() && !j55Var2.d) {
                    j55Var2.d = true;
                    final b61 b61Var2 = i8;
                    b61Var2.setLoading(true);
                    final if4 if4Var2 = if4Var;
                    if4Var2.run();
                    final int i9 = i;
                    final mk7 mk7Var2 = mk7Var;
                    final ylb ylbVar2 = ylbVar;
                    final String str2 = str;
                    final JSONObject jSONObject2 = jSONObject;
                    final TLRPC.User user2 = user;
                    final c cVar = C;
                    final byte[] bArr2 = bArr;
                    cVar.E(true, false, false, new jac() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            j55 j55Var3 = j55Var2;
                            b61 b61Var3 = b61Var2;
                            mk7 mk7Var3 = mk7Var2;
                            ylb ylbVar3 = ylbVar2;
                            if4 if4Var3 = if4Var2;
                            c cVar2 = cVar;
                            String str3 = str2;
                            byte[] bArr3 = bArr2;
                            int i10 = i9;
                            TLRPC.User user3 = user2;
                            JSONObject jSONObject3 = jSONObject2;
                            y25 y25Var = (y25) obj;
                            String str4 = (String) obj2;
                            if (!j55Var3.e) {
                                if (y25Var != null && str4 == null) {
                                    if (str3.equals(cVar2.x()) && Arrays.equals(bArr3, cVar2.D())) {
                                        y25 b = y25Var.b();
                                        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                                        Utilities.e.c(new bz1(b, str3, bArr3, jSONObject3, "bot" + user3.id, currentTime, j55Var3, cVar2, (byte) 2));
                                        return;
                                    }
                                    c41.c0(jb6.M0(2131742622, null));
                                    j55Var3.d = false;
                                    if (!j55Var3.f) {
                                        j55Var3.f = true;
                                        j55Var3.b.a();
                                    }
                                    if (!j55Var3.e) {
                                        j55Var3.a.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                j55Var3.d = false;
                                b61Var3.setLoading(false);
                                if (str4 != null) {
                                    c41.d0(str4, mk7Var3.F, ylbVar3);
                                }
                                if4Var3.run();
                            }
                        }
                    });
                }
            }
        });
        b(mk7Var, j55Var);
        if4Var.run();
    }

    public static void d(final Context context, final int i, final TLRPC.User user, final v45 v45Var, final String str, final byte[] bArr, final ylb ylbVar, h55 h55Var) {
        int i2;
        final c C = c.C(i);
        char c = 0;
        final mk7 mk7Var = new mk7(context, ylbVar, new View[0]);
        mk7Var.E0(cmb.v0(cmb.Z6, ylbVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, jb6.V(null, null, 2131742878, m9c.r(user)), ylbVar);
        soc socVar = new soc(context, 2131232828, 24);
        socVar.getCardHolderView().setMaxLines(2);
        socVar.getCardHolderView().setSingleLine(false);
        List<u45> list = v45Var.b;
        socVar.setCardHolder(pqc.a0(((u45) list.get(0)).a));
        io balanceView = socVar.getBalanceView();
        long j = v45Var.c;
        balanceView.setText(w45.j(j));
        socVar.getUsdBalanceView().setText(C.q(j, false));
        linearLayout.addView(socVar, qoe.o(-1, -2));
        LinearLayout F = w45.F(context, jb6.M0(2131742890, null), ylbVar);
        for (u45 u45Var : list) {
            if (u45Var.b != null && u45Var.d == null) {
                i2 = 2131742836;
            } else {
                i2 = 2131742644;
            }
            String M0 = jb6.M0(i2, null);
            Object[] objArr = new Object[1];
            objArr[c] = w45.C(u45Var.a);
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(w45.b(context, M0, jb6.V(null, null, 2131742639, objArr), w45.a(-u45Var.e), u45Var.d, ylbVar), qoe.o(-1, -2));
            F = linearLayout2;
            c = 0;
        }
        LinearLayout linearLayout3 = F;
        g55 g55Var = new g55(context, 240);
        g55Var.addView(linearLayout3);
        linearLayout.addView(g55Var, qoe.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        lk7 lk7Var = new lk7(context);
        lk7Var.getContent().addView(linearLayout, qoe.c(-2.0f, -1));
        mk7Var.D0(lk7Var);
        LinearLayout i3 = hg9.i(context, 1);
        TextView v = w45.v(context, null, 14, ylbVar);
        anb.X(v, cmb.y6, ylbVar);
        i3.addView(v, qoe.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(16.0f));
        b61 b61Var = new b61(ylbVar, context, true);
        b61Var.setRoundRadius(24);
        b61Var.e();
        b61Var.setText(jb6.M0(2131742826, null));
        linearLayout4.addView(b61Var, qoe.m(1.0f, 0, 44, 0, 6, 0));
        final b61 i4 = mlb.i(24, ylbVar, context, true);
        i4.setText(jb6.M0(2131742851, null));
        linearLayout4.addView(i4, qoe.m(1.0f, 0, 44, 6, 0, 0));
        i3.addView(linearLayout4);
        mk7Var.F0(i3);
        final j55 j55Var = new j55(mk7Var, h55Var);
        final int[] iArr = {0};
        final xo1 xo1Var = new xo1(j55Var, i4, iArr, b61Var, (byte) 29);
        final Runnable[] runnableArr = {new e77(j55Var, iArr, v, xo1Var, C, v45Var, (byte) 14)};
        jm7 jm7Var = new jm7() {
            @Override
            public final void didReceivedNotification(int i5, int i6, Object[] objArr2) {
                if (iArr[0] == 2 && C.z() >= v45Var.c) {
                    runnableArr[0].run();
                }
            }
        };
        nm7.f(i).a(jm7Var, nm7.e4);
        j55Var.h = new bm3(i, jm7Var, (byte) 13);
        j55Var.g = xo1Var;
        b61Var.setOnClickListener(new y45(j55Var, (byte) 0));
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final j55 j55Var2 = j55.this;
                if (!j55Var2.a() && !j55Var2.d) {
                    int i5 = iArr[0];
                    final int i6 = i;
                    final ylb ylbVar2 = ylbVar;
                    if (i5 == 2) {
                        goc.M0(i6, ylbVar2, context);
                    } else if (i5 == 1) {
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i6);
                        final v45 v45Var2 = v45Var;
                        long j2 = v45Var2.a;
                        if (j2 != 0 && j2 <= connectionsManager.getCurrentTime()) {
                            c41.c0(jb6.M0(2131742621, null));
                            j55Var2.d = false;
                            if (!j55Var2.f) {
                                j55Var2.f = true;
                                j55Var2.b.a();
                            }
                            if (!j55Var2.e) {
                                j55Var2.a.dismiss();
                                return;
                            }
                            return;
                        }
                        j55Var2.d = true;
                        b61 b61Var2 = i4;
                        b61Var2.setLoading(true);
                        xo1 xo1Var2 = xo1Var;
                        xo1Var2.run();
                        final mk7 mk7Var2 = mk7Var;
                        final hv0 hv0Var = new hv0(j55Var2, b61Var2, mk7Var2, ylbVar2, xo1Var2, (byte) 7);
                        final c cVar = C;
                        final String str2 = str;
                        final byte[] bArr2 = bArr;
                        final TLRPC.User user2 = user;
                        cVar.E(true, false, false, new jac() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                final j55 j55Var3 = j55.this;
                                hv0 hv0Var2 = hv0Var;
                                final c cVar2 = cVar;
                                final String str3 = str2;
                                final byte[] bArr3 = bArr2;
                                final v45 v45Var3 = v45Var2;
                                final TLRPC.User user3 = user2;
                                final int i7 = i6;
                                final mk7 mk7Var3 = mk7Var2;
                                final ylb ylbVar3 = ylbVar2;
                                y25 y25Var = (y25) obj;
                                String str4 = (String) obj2;
                                if (!j55Var3.e) {
                                    if (y25Var != null && str4 == null) {
                                        if (str3.equals(cVar2.x()) && Arrays.equals(bArr3, cVar2.D())) {
                                            final WalletEngine2 walletEngine2 = cVar2.b;
                                            if (walletEngine2 == null) {
                                                hv0Var2.a(jb6.M0(2131742622, null));
                                                return;
                                            }
                                            final y25 b = y25Var.b();
                                            Utilities.e.c(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    final y25 y25Var2 = y25.this;
                                                    final String str5 = str3;
                                                    final byte[] bArr4 = bArr3;
                                                    final byte[] f = k55.f(y25Var2, str5, bArr4);
                                                    final j55 j55Var4 = j55Var3;
                                                    final WalletEngine2 walletEngine22 = walletEngine2;
                                                    final v45 v45Var4 = v45Var3;
                                                    final TLRPC.User user4 = user3;
                                                    final int i8 = i7;
                                                    final c cVar3 = cVar2;
                                                    final mk7 mk7Var4 = mk7Var3;
                                                    final ylb ylbVar4 = ylbVar3;
                                                    gm.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            j55 j55Var5 = j55.this;
                                                            WalletEngine2 walletEngine23 = walletEngine22;
                                                            y25 y25Var3 = y25Var2;
                                                            v45 v45Var5 = v45Var4;
                                                            TLRPC.User user5 = user4;
                                                            int i9 = i8;
                                                            c cVar4 = cVar3;
                                                            mk7 mk7Var5 = mk7Var4;
                                                            String str6 = str5;
                                                            byte[] bArr5 = bArr4;
                                                            byte[] bArr6 = f;
                                                            ylb ylbVar5 = ylbVar4;
                                                            try {
                                                                if (!j55Var5.e) {
                                                                    walletEngine23.prepareTonConnectTransfer(y25Var3, v45Var5, "widget:" + user5.id + ":" + Utilities.b.nextLong(), new e55(i9, cVar4, mk7Var5, j55Var5, str6, bArr5, bArr6, ylbVar5));
                                                                }
                                                            } finally {
                                                                y25Var3.close();
                                                            }
                                                        }
                                                    });
                                                }
                                            });
                                            return;
                                        }
                                        c41.c0(jb6.M0(2131742622, null));
                                        j55Var3.d = false;
                                        if (!j55Var3.f) {
                                            j55Var3.f = true;
                                            j55Var3.b.a();
                                        }
                                        if (!j55Var3.e) {
                                            j55Var3.a.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                    hv0Var2.a(str4);
                                }
                            }
                        });
                    }
                }
            }
        });
        b(mk7Var, j55Var);
        runnableArr[0].run();
    }

    public static TL_wallet.tonConnectSession e() {
        TL_wallet.tonConnectSession tonconnectsession = new TL_wallet.tonConnectSession();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = Utilities.b;
        secureRandom.nextBytes(bArr);
        tonconnectsession.dapp_client_id = Utilities.f(bArr).toLowerCase(Locale.ROOT);
        byte[] bArr2 = new byte[32];
        tonconnectsession.nonce = bArr2;
        secureRandom.nextBytes(bArr2);
        return tonconnectsession;
    }

    public static byte[] f(y25 y25Var, String str, byte[] bArr) {
        try {
            return Base64.decode(WalletEngine2.tonConnectCrypto(y25Var, e(), str, bArr, new JSONObject().put("account", true)).getJSONObject("account").getString("walletStateInit"), 2);
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }
}
