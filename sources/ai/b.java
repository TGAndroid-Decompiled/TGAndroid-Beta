package ai;

import android.view.View;
import android.widget.ImageView;
import di.y8;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
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
    public final int f1122a;
    public final Object f1123b;
    public final Object f1124c;
    public final Object d;
    public final Object f1125e;
    public final Object f1126f;

    public b(y8 y8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, r10 r10Var) {
        this.f1122a = 5;
        this.f1124c = y8Var;
        this.f1123b = zArr;
        this.d = str;
        this.f1125e = chatInvite;
        this.f1126f = r10Var;
    }

    private final void a() {
        la laVar = (la) this.f1123b;
        String str = (String) this.f1124c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f1125e;
        TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f1126f;
        laVar.f49534e = 0;
        String str2 = laVar.f49535f;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                org.telegram.ui.Cells.c2 c2Var = laVar.H;
                if (c2Var != null) {
                    c2Var.setText(hd.a0("UsernameAvailable", null, 2131743422, str));
                    org.telegram.ui.Cells.c2 c2Var2 = laVar.H;
                    int i7 = m6.f29735w6;
                    c2Var2.setTag(Integer.valueOf(i7));
                    t6.U(laVar.H, i7, null);
                    ka kaVar = laVar.G;
                    if (kaVar != null) {
                        ka.a(kaVar);
                    }
                }
            } else if (laVar.H != null) {
                if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && checkusername.username.length() == 4) {
                    laVar.H.setText(hd.N0(2131743409, null));
                    org.telegram.ui.Cells.c2 c2Var3 = laVar.H;
                    int i10 = m6.f29602p7;
                    c2Var3.setTag(Integer.valueOf(i10));
                    t6.U(laVar.H, i10, null);
                } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                    if (checkusername.username.length() == 4) {
                        laVar.H.setText(hd.N0(2131743408, null));
                    } else {
                        laVar.H.setText(hd.N0(2131743412, null));
                    }
                    org.telegram.ui.Cells.c2 c2Var4 = laVar.H;
                    int i11 = m6.F6;
                    c2Var4.setTag(Integer.valueOf(i11));
                    t6.U(laVar.H, i11, null);
                } else {
                    laVar.H.setText(hd.N0(2131743413, null));
                    org.telegram.ui.Cells.c2 c2Var5 = laVar.H;
                    int i12 = m6.f29602p7;
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
        qc qcVar = (qc) this.f1124c;
        boolean[] zArr = (boolean[]) this.f1123b;
        int[] iArr = (int[]) this.f1125e;
        int[] iArr2 = (int[]) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1126f;
        if (!zArr[0] && (i7 = iArr[0]) < iArr2[0]) {
            if (tL_error != null) {
                zArr[0] = true;
                if ("BOOSTS_REQUIRED".equals(tL_error.text)) {
                    qcVar.getMessagesController().I0().b(qcVar.f51209a, qcVar.f51213c, new vb(qcVar, 1));
                    return;
                }
                qcVar.Q.setLoading(false);
                lc.b0(qcVar).Q(2131624012, 36, hd.a0(null, null, 2131743633, tL_error.text)).j();
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
        ad adVar = (ad) this.f1123b;
        String str = (String) this.f1124c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f1125e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f1126f;
        adVar.Y = 0;
        String str2 = adVar.Z;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                adVar.W.setText(hd.a0("LinkAvailable", null, 2131748731, str));
                org.telegram.ui.Cells.c2 c2Var = adVar.W;
                int i7 = m6.f29735w6;
                c2Var.setTag(Integer.valueOf(i7));
                t6.U(adVar.W, i7, null);
                adVar.f45578b0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                adVar.W.setText(hd.N0(2131743409, null));
                t6.U(adVar.W, m6.f29602p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    adVar.W.setText(hd.N0(2131743408, null));
                } else {
                    adVar.W.setText(hd.N0(2131743412, null));
                }
                t6.U(adVar.W, m6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                t6.U(adVar.W, m6.f29602p7, null);
                adVar.f45591l0 = false;
                adVar.l0();
            } else {
                t6.U(adVar.W, m6.f29602p7, null);
                adVar.W.setText(hd.N0(2131748719, null));
            }
            adVar.f45578b0 = false;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.b.run():void");
    }

    public b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f1122a = i7;
        this.f1123b = obj;
        this.f1124c = obj2;
        this.d = obj3;
        this.f1125e = obj4;
        this.f1126f = obj5;
    }

    public b(gb gbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f1122a = 24;
        this.f1124c = gbVar;
        this.d = tL_chatInviteExported;
        this.f1125e = tL_messages_exportedChatInvite;
        this.f1123b = zArr;
        this.f1126f = t1Var;
    }

    public b(qc qcVar, boolean[] zArr, int[] iArr, int[] iArr2, TLRPC.TL_error tL_error) {
        this.f1122a = 25;
        this.f1124c = qcVar;
        this.f1123b = zArr;
        this.f1125e = iArr;
        this.d = iArr2;
        this.f1126f = tL_error;
    }

    public b(bn bnVar, View view, boolean[] zArr, org.telegram.ui.ActionBar.g1 g1Var, View view2) {
        this.f1122a = 28;
        this.f1124c = bnVar;
        this.d = view;
        this.f1123b = zArr;
        this.f1125e = g1Var;
        this.f1126f = view2;
    }

    public b(bn bnVar, boolean[] zArr, boolean[] zArr2, ImageView imageView, ImageView imageView2) {
        this.f1122a = 27;
        this.d = bnVar;
        this.f1123b = zArr;
        this.f1124c = zArr2;
        this.f1125e = imageView;
        this.f1126f = imageView2;
    }

    public b(boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, a1.e eVar) {
        this.f1122a = 0;
        this.f1123b = zArr;
        this.f1124c = zArr2;
        this.f1125e = iArr;
        this.d = zArr3;
        this.f1126f = eVar;
    }
}
