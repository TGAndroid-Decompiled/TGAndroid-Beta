package ai;

import android.view.View;
import android.widget.ImageView;
import di.y8;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.gb;
import org.telegram.ui.ka;
import org.telegram.ui.la;
import org.telegram.ui.qc;
import org.telegram.ui.rn;
import org.telegram.ui.vb;
public final class b implements Runnable {
    public final int f1119a;
    public final Object f1120b;
    public final Object f1121c;
    public final Object d;
    public final Object f1122e;
    public final Object f1123f;

    public b(y8 y8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, q10 q10Var) {
        this.f1119a = 5;
        this.f1121c = y8Var;
        this.f1120b = zArr;
        this.d = str;
        this.f1122e = chatInvite;
        this.f1123f = q10Var;
    }

    private final void a() {
        la laVar = (la) this.f1120b;
        String str = (String) this.f1121c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f1122e;
        TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f1123f;
        laVar.f49530e = 0;
        String str2 = laVar.f49531f;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                org.telegram.ui.Cells.c2 c2Var = laVar.H;
                if (c2Var != null) {
                    c2Var.setText(gd.a0("UsernameAvailable", null, 2131743424, str));
                    org.telegram.ui.Cells.c2 c2Var2 = laVar.H;
                    int i7 = m6.f29732w6;
                    c2Var2.setTag(Integer.valueOf(i7));
                    t6.U(laVar.H, i7, null);
                    ka kaVar = laVar.G;
                    if (kaVar != null) {
                        ka.a(kaVar);
                    }
                }
            } else if (laVar.H != null) {
                if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && checkusername.username.length() == 4) {
                    laVar.H.setText(gd.N0(2131743411, null));
                    org.telegram.ui.Cells.c2 c2Var3 = laVar.H;
                    int i10 = m6.f29599p7;
                    c2Var3.setTag(Integer.valueOf(i10));
                    t6.U(laVar.H, i10, null);
                } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                    if (checkusername.username.length() == 4) {
                        laVar.H.setText(gd.N0(2131743410, null));
                    } else {
                        laVar.H.setText(gd.N0(2131743414, null));
                    }
                    org.telegram.ui.Cells.c2 c2Var4 = laVar.H;
                    int i11 = m6.F6;
                    c2Var4.setTag(Integer.valueOf(i11));
                    t6.U(laVar.H, i11, null);
                } else {
                    laVar.H.setText(gd.N0(2131743415, null));
                    org.telegram.ui.Cells.c2 c2Var5 = laVar.H;
                    int i12 = m6.f29599p7;
                    c2Var5.setTag(Integer.valueOf(i12));
                    t6.U(laVar.H, i12, null);
                }
                ka kaVar2 = laVar.G;
                if (kaVar2 != null) {
                    ka.a(kaVar2);
                }
            }
        }
    }

    private final void b() {
        int i7;
        int i10;
        qc qcVar = (qc) this.f1121c;
        boolean[] zArr = (boolean[]) this.f1120b;
        int[] iArr = (int[]) this.f1122e;
        int[] iArr2 = (int[]) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1123f;
        if (!zArr[0] && (i7 = iArr[0]) < iArr2[0]) {
            if (tL_error != null) {
                zArr[0] = true;
                if ("BOOSTS_REQUIRED".equals(tL_error.text)) {
                    qcVar.getMessagesController().I0().b(qcVar.f51205a, qcVar.f51209c, new vb(qcVar, 1));
                    return;
                }
                qcVar.Q.setLoading(false);
                lc.b0(qcVar).Q(2131624012, 36, gd.a0(null, null, 2131743635, tL_error.text)).j();
                return;
            }
            int i11 = i7 + 1;
            iArr[0] = i11;
            if (i11 == iArr2[0]) {
                qcVar.finishFragment();
                org.telegram.ui.ActionBar.g2 g2Var = qcVar.m0;
                if (g2Var != null) {
                    if (g2Var instanceof rn) {
                        ((rn) g2Var).t0();
                    }
                    lc b02 = lc.b0(qcVar.m0);
                    if (qcVar.d) {
                        i10 = 2131749305;
                    } else {
                        i10 = 2131752447;
                    }
                    f3.n(null, i10, b02, 2131623990, 36);
                    qcVar.m0 = null;
                }
                qcVar.Q.setLoading(false);
            }
        }
    }

    private final void c() {
        ad adVar = (ad) this.f1120b;
        String str = (String) this.f1121c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f1122e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f1123f;
        adVar.Y = 0;
        String str2 = adVar.Z;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                adVar.W.setText(gd.a0("LinkAvailable", null, 2131748731, str));
                org.telegram.ui.Cells.c2 c2Var = adVar.W;
                int i7 = m6.f29732w6;
                c2Var.setTag(Integer.valueOf(i7));
                t6.U(adVar.W, i7, null);
                adVar.f45574b0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                adVar.W.setText(gd.N0(2131743411, null));
                t6.U(adVar.W, m6.f29599p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    adVar.W.setText(gd.N0(2131743410, null));
                } else {
                    adVar.W.setText(gd.N0(2131743414, null));
                }
                t6.U(adVar.W, m6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                t6.U(adVar.W, m6.f29599p7, null);
                adVar.f45587l0 = false;
                adVar.l0();
            } else {
                t6.U(adVar.W, m6.f29599p7, null);
                adVar.W.setText(gd.N0(2131748719, null));
            }
            adVar.f45574b0 = false;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.b.run():void");
    }

    public b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f1119a = i7;
        this.f1120b = obj;
        this.f1121c = obj2;
        this.d = obj3;
        this.f1122e = obj4;
        this.f1123f = obj5;
    }

    public b(gb gbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f1119a = 24;
        this.f1121c = gbVar;
        this.d = tL_chatInviteExported;
        this.f1122e = tL_messages_exportedChatInvite;
        this.f1120b = zArr;
        this.f1123f = t1Var;
    }

    public b(qc qcVar, boolean[] zArr, int[] iArr, int[] iArr2, TLRPC.TL_error tL_error) {
        this.f1119a = 25;
        this.f1121c = qcVar;
        this.f1120b = zArr;
        this.f1122e = iArr;
        this.d = iArr2;
        this.f1123f = tL_error;
    }

    public b(bn bnVar, View view, boolean[] zArr, org.telegram.ui.ActionBar.g1 g1Var, View view2) {
        this.f1119a = 28;
        this.f1121c = bnVar;
        this.d = view;
        this.f1120b = zArr;
        this.f1122e = g1Var;
        this.f1123f = view2;
    }

    public b(bn bnVar, boolean[] zArr, boolean[] zArr2, ImageView imageView, ImageView imageView2) {
        this.f1119a = 27;
        this.d = bnVar;
        this.f1120b = zArr;
        this.f1121c = zArr2;
        this.f1122e = imageView;
        this.f1123f = imageView2;
    }

    public b(boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, a1.e eVar) {
        this.f1119a = 0;
        this.f1120b = zArr;
        this.f1121c = zArr2;
        this.f1122e = iArr;
        this.d = zArr3;
        this.f1123f = eVar;
    }
}
