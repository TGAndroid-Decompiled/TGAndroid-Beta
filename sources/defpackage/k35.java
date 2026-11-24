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
public abstract class k35 {
    public static final ArrayList a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, wjb wjbVar) {
        be0 be0Var = new be0(context);
        be0Var.setRoundRadius(gl.L(38.0f));
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.q(user);
        be0Var.f(user, pb0Var);
        linearLayout.addView(be0Var, nme.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = w25.v(context, charSequence, 20, wjbVar);
        v.setTypeface(gl.o());
        linearLayout.addView(v, nme.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String p = l7c.p(user);
        if (!TextUtils.isEmpty(p)) {
            linearLayout.addView(w25.g(context, "@" + p, wjbVar), nme.t(-2, -2, 1, 36, 6, 36, 12));
            return;
        }
        linearLayout.addView(new View(context), nme.o(-1, 12));
    }

    public static void b(ki7 ki7Var, j35 j35Var) {
        ki7Var.d0 = false;
        ki7Var.z0 = new tt(j35Var, (byte) 2);
        ki7Var.setOnDismissListener(new n1(j35Var, (byte) 22));
        ki7Var.show();
        gl.d3(new vc4(j35Var, ki7Var, (byte) 22), 700L);
    }

    public static void c(Context context, final int i, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final wjb wjbVar, h35 h35Var) {
        int i2;
        int i3;
        float f;
        String M0;
        int i4;
        final c C = c.C(i);
        boolean equals = "text".equals(jSONObject.optString("type"));
        final ki7 ki7Var = new ki7(context, wjbVar, new View[0]);
        ki7Var.E0(bkb.v0(bkb.Z6, wjbVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, k96.V(null, null, 2131742953, l7c.r(user)), wjbVar);
        LinearLayout j = de9.j(context, 1);
        j.setPadding(gl.L(20.0f), gl.L(16.0f), gl.L(20.0f), gl.L(16.0f));
        int L = gl.L(16.0f);
        int i5 = bkb.c6;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i5, wjbVar));
        vkb M = zkb.M(i5);
        j.setBackground(b0);
        zkb.j(j, b0, M, null, wjbVar);
        if (equals) {
            i2 = 2131742747;
        } else {
            i2 = 2131742941;
        }
        TextView v = w25.v(context, k96.M0(i2, null), 14, wjbVar);
        v.setGravity(3);
        v.setTypeface(gl.o());
        if (equals) {
            i3 = bkb.K6;
        } else {
            i3 = bkb.p7;
        }
        zkb.X(v, i3, wjbVar);
        if (equals) {
            f = 12.0f;
        } else {
            f = 4.0f;
        }
        j.addView(v, nme.k(0.0f, 0.0f, 0.0f, f, -1, -2));
        if (equals) {
            M0 = jSONObject.optString("text");
            i4 = 14;
        } else {
            M0 = k96.M0(2131742940, null);
            i4 = 16;
        }
        TextView v2 = w25.v(context, M0, i4, wjbVar);
        v2.setGravity(3);
        if (equals) {
            v2.setTypeface(Typeface.MONOSPACE);
        }
        j.addView(v2, nme.o(-1, -2));
        g35 g35Var = new g35(context, 320);
        g35Var.addView(j);
        linearLayout.addView(g35Var, nme.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        ji7 ji7Var = new ji7(context);
        ji7Var.getContent().addView(linearLayout, nme.c(-2.0f, -1));
        ki7Var.D0(ji7Var);
        LinearLayout j2 = de9.j(context, 1);
        if (equals) {
            TextView v3 = w25.v(context, k96.M0(2131742766, null), 14, wjbVar);
            v3.setGravity(3);
            zkb.X(v3, bkb.y6, wjbVar);
            j2.addView(v3, nme.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        u41 u41Var = new u41(wjbVar, context, true);
        u41Var.setRoundRadius(24);
        u41Var.e();
        u41Var.setText(k96.M0(2131752577, null));
        final u41 i6 = yjb.i(24, wjbVar, context, true);
        i6.setText(k96.M0(2131742749, null));
        linearLayout2.addView(u41Var, nme.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(i6, nme.m(1.0f, 0, 44, 6, 0, 0));
        j2.addView(linearLayout2);
        ki7Var.F0(j2);
        final j35 j35Var = new j35(ki7Var, h35Var);
        final jf4 jf4Var = new jf4(j35Var, i6, u41Var, (byte) 16);
        j35Var.g = jf4Var;
        u41Var.setOnClickListener(new y25(j35Var, (byte) 1));
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final j35 j35Var2 = j35Var;
                if (!j35Var2.a() && !j35Var2.d) {
                    j35Var2.d = true;
                    final u41 u41Var2 = i6;
                    u41Var2.setLoading(true);
                    final jf4 jf4Var2 = jf4Var;
                    jf4Var2.run();
                    final int i7 = i;
                    final ki7 ki7Var2 = ki7Var;
                    final wjb wjbVar2 = wjbVar;
                    final String str2 = str;
                    final JSONObject jSONObject2 = jSONObject;
                    final TLRPC.User user2 = user;
                    final c cVar = C;
                    final byte[] bArr2 = bArr;
                    cVar.E(true, false, false, new i8c() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            j35 j35Var3 = j35Var2;
                            u41 u41Var3 = u41Var2;
                            ki7 ki7Var3 = ki7Var2;
                            wjb wjbVar3 = wjbVar2;
                            jf4 jf4Var3 = jf4Var2;
                            c cVar2 = cVar;
                            String str3 = str2;
                            byte[] bArr3 = bArr2;
                            int i8 = i7;
                            TLRPC.User user3 = user2;
                            JSONObject jSONObject3 = jSONObject2;
                            y05 y05Var = (y05) obj;
                            String str4 = (String) obj2;
                            if (!j35Var3.e) {
                                if (y05Var != null && str4 == null) {
                                    if (str3.equals(cVar2.x()) && Arrays.equals(bArr3, cVar2.D())) {
                                        y05 b = y05Var.b();
                                        int currentTime = ConnectionsManager.getInstance(i8).getCurrentTime();
                                        Utilities.e.c(new ox1(b, str3, bArr3, jSONObject3, "bot" + user3.id, currentTime, j35Var3, cVar2, (byte) 2));
                                        return;
                                    }
                                    u21.c0(k96.M0(2131742696, null));
                                    j35Var3.d = false;
                                    if (!j35Var3.f) {
                                        j35Var3.f = true;
                                        j35Var3.b.a();
                                    }
                                    if (!j35Var3.e) {
                                        j35Var3.a.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                j35Var3.d = false;
                                u41Var3.setLoading(false);
                                if (str4 != null) {
                                    u21.d0(str4, ki7Var3.F, wjbVar3);
                                }
                                jf4Var3.run();
                            }
                        }
                    });
                }
            }
        });
        b(ki7Var, j35Var);
        jf4Var.run();
    }

    public static void d(final Context context, final int i, final TLRPC.User user, final v25 v25Var, final String str, final byte[] bArr, final wjb wjbVar, h35 h35Var) {
        int i2;
        final c C = c.C(i);
        char c = 0;
        final ki7 ki7Var = new ki7(context, wjbVar, new View[0]);
        ki7Var.E0(bkb.v0(bkb.Z6, wjbVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, k96.V(null, null, 2131742952, l7c.r(user)), wjbVar);
        smc smcVar = new smc(context, 2131232815, 24);
        smcVar.getCardHolderView().setMaxLines(2);
        smcVar.getCardHolderView().setSingleLine(false);
        List<u25> list = v25Var.b;
        smcVar.setCardHolder(noc.Z(((u25) list.get(0)).a));
        hn balanceView = smcVar.getBalanceView();
        long j = v25Var.c;
        balanceView.setText(w25.j(j));
        smcVar.getUsdBalanceView().setText(C.q(j, false));
        linearLayout.addView(smcVar, nme.o(-1, -2));
        LinearLayout F = w25.F(context, k96.M0(2131742964, null), wjbVar);
        for (u25 u25Var : list) {
            if (u25Var.b != null && u25Var.d == null) {
                i2 = 2131742910;
            } else {
                i2 = 2131742718;
            }
            String M0 = k96.M0(i2, null);
            Object[] objArr = new Object[1];
            objArr[c] = w25.C(u25Var.a);
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(w25.b(context, M0, k96.V(null, null, 2131742713, objArr), w25.a(-u25Var.e), u25Var.d, wjbVar), nme.o(-1, -2));
            F = linearLayout2;
            c = 0;
        }
        LinearLayout linearLayout3 = F;
        g35 g35Var = new g35(context, 240);
        g35Var.addView(linearLayout3);
        linearLayout.addView(g35Var, nme.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        ji7 ji7Var = new ji7(context);
        ji7Var.getContent().addView(linearLayout, nme.c(-2.0f, -1));
        ki7Var.D0(ji7Var);
        LinearLayout j2 = de9.j(context, 1);
        TextView v = w25.v(context, null, 14, wjbVar);
        zkb.X(v, bkb.y6, wjbVar);
        j2.addView(v, nme.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(16.0f));
        u41 u41Var = new u41(wjbVar, context, true);
        u41Var.setRoundRadius(24);
        u41Var.e();
        u41Var.setText(k96.M0(2131742900, null));
        linearLayout4.addView(u41Var, nme.m(1.0f, 0, 44, 0, 6, 0));
        final u41 i3 = yjb.i(24, wjbVar, context, true);
        i3.setText(k96.M0(2131742925, null));
        linearLayout4.addView(i3, nme.m(1.0f, 0, 44, 6, 0, 0));
        j2.addView(linearLayout4);
        ki7Var.F0(j2);
        final j35 j35Var = new j35(ki7Var, h35Var);
        final int[] iArr = {0};
        final hn1 hn1Var = new hn1(j35Var, i3, iArr, u41Var, (byte) 29);
        final Runnable[] runnableArr = {new e57(j35Var, iArr, v, hn1Var, C, v25Var, (byte) 14)};
        gk7 gk7Var = new gk7() {
            @Override
            public final void didReceivedNotification(int i4, int i5, Object[] objArr2) {
                if (iArr[0] == 2 && C.z() >= v25Var.c) {
                    runnableArr[0].run();
                }
            }
        };
        kk7.f(i).a(gk7Var, kk7.c4);
        j35Var.h = new sm3(i, gk7Var, (byte) 11);
        j35Var.g = hn1Var;
        u41Var.setOnClickListener(new y25(j35Var, (byte) 0));
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final j35 j35Var2 = j35.this;
                if (!j35Var2.a() && !j35Var2.d) {
                    int i4 = iArr[0];
                    final int i5 = i;
                    final wjb wjbVar2 = wjbVar;
                    if (i4 == 2) {
                        hmc.L0(i5, wjbVar2, context);
                    } else if (i4 == 1) {
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
                        final v25 v25Var2 = v25Var;
                        long j3 = v25Var2.a;
                        if (j3 != 0 && j3 <= connectionsManager.getCurrentTime()) {
                            u21.c0(k96.M0(2131742695, null));
                            j35Var2.d = false;
                            if (!j35Var2.f) {
                                j35Var2.f = true;
                                j35Var2.b.a();
                            }
                            if (!j35Var2.e) {
                                j35Var2.a.dismiss();
                                return;
                            }
                            return;
                        }
                        j35Var2.d = true;
                        u41 u41Var2 = i3;
                        u41Var2.setLoading(true);
                        hn1 hn1Var2 = hn1Var;
                        hn1Var2.run();
                        final ki7 ki7Var2 = ki7Var;
                        final yt0 yt0Var = new yt0(j35Var2, u41Var2, ki7Var2, wjbVar2, hn1Var2, (byte) 7);
                        final c cVar = C;
                        final String str2 = str;
                        final byte[] bArr2 = bArr;
                        final TLRPC.User user2 = user;
                        cVar.E(true, false, false, new i8c() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                final j35 j35Var3 = j35.this;
                                yt0 yt0Var2 = yt0Var;
                                final c cVar2 = cVar;
                                final String str3 = str2;
                                final byte[] bArr3 = bArr2;
                                final v25 v25Var3 = v25Var2;
                                final TLRPC.User user3 = user2;
                                final int i6 = i5;
                                final ki7 ki7Var3 = ki7Var2;
                                final wjb wjbVar3 = wjbVar2;
                                y05 y05Var = (y05) obj;
                                String str4 = (String) obj2;
                                if (!j35Var3.e) {
                                    if (y05Var != null && str4 == null) {
                                        if (str3.equals(cVar2.x()) && Arrays.equals(bArr3, cVar2.D())) {
                                            final WalletEngine2 walletEngine2 = cVar2.b;
                                            if (walletEngine2 == null) {
                                                yt0Var2.a(k96.M0(2131742696, null));
                                                return;
                                            }
                                            final y05 b = y05Var.b();
                                            Utilities.e.c(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    final y05 y05Var2 = y05.this;
                                                    final String str5 = str3;
                                                    final byte[] bArr4 = bArr3;
                                                    final byte[] f = k35.f(y05Var2, str5, bArr4);
                                                    final j35 j35Var4 = j35Var3;
                                                    final WalletEngine2 walletEngine22 = walletEngine2;
                                                    final v25 v25Var4 = v25Var3;
                                                    final TLRPC.User user4 = user3;
                                                    final int i7 = i6;
                                                    final c cVar3 = cVar2;
                                                    final ki7 ki7Var4 = ki7Var3;
                                                    final wjb wjbVar4 = wjbVar3;
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            j35 j35Var5 = j35.this;
                                                            WalletEngine2 walletEngine23 = walletEngine22;
                                                            y05 y05Var3 = y05Var2;
                                                            v25 v25Var5 = v25Var4;
                                                            TLRPC.User user5 = user4;
                                                            int i8 = i7;
                                                            c cVar4 = cVar3;
                                                            ki7 ki7Var5 = ki7Var4;
                                                            String str6 = str5;
                                                            byte[] bArr5 = bArr4;
                                                            byte[] bArr6 = f;
                                                            wjb wjbVar5 = wjbVar4;
                                                            try {
                                                                if (!j35Var5.e) {
                                                                    walletEngine23.prepareTonConnectTransfer(y05Var3, v25Var5, "widget:" + user5.id + ":" + Utilities.b.nextLong(), new e35(i8, cVar4, ki7Var5, j35Var5, str6, bArr5, bArr6, wjbVar5));
                                                                }
                                                            } finally {
                                                                y05Var3.close();
                                                            }
                                                        }
                                                    });
                                                }
                                            });
                                            return;
                                        }
                                        u21.c0(k96.M0(2131742696, null));
                                        j35Var3.d = false;
                                        if (!j35Var3.f) {
                                            j35Var3.f = true;
                                            j35Var3.b.a();
                                        }
                                        if (!j35Var3.e) {
                                            j35Var3.a.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                    yt0Var2.a(str4);
                                }
                            }
                        });
                    }
                }
            }
        });
        b(ki7Var, j35Var);
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

    public static byte[] f(y05 y05Var, String str, byte[] bArr) {
        try {
            return Base64.decode(WalletEngine2.tonConnectCrypto(y05Var, e(), str, bArr, new JSONObject().put("account", true)).getJSONObject("account").getString("walletStateInit"), 2);
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }
}
