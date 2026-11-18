package ai;

import android.view.View;
import android.widget.ImageView;
import di.x8;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
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
    public final int f1118a;
    public final Object f1119b;
    public final Object f1120c;
    public final Object d;
    public final Object f1121e;
    public final Object f1122f;

    public b(x8 x8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, q10 q10Var) {
        this.f1118a = 5;
        this.f1120c = x8Var;
        this.f1119b = zArr;
        this.d = str;
        this.f1121e = chatInvite;
        this.f1122f = q10Var;
    }

    private final void a() {
        la laVar = (la) this.f1119b;
        String str = (String) this.f1120c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f1121e;
        TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f1122f;
        laVar.f49512e = 0;
        String str2 = laVar.f49513f;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                org.telegram.ui.Cells.b2 b2Var = laVar.H;
                if (b2Var != null) {
                    b2Var.setText(gd.a0("UsernameAvailable", null, 2131743430, str));
                    org.telegram.ui.Cells.b2 b2Var2 = laVar.H;
                    int i7 = n6.f29750w6;
                    b2Var2.setTag(Integer.valueOf(i7));
                    u6.U(laVar.H, i7, null);
                    ka kaVar = laVar.G;
                    if (kaVar != null) {
                        ka.a(kaVar);
                    }
                }
            } else if (laVar.H != null) {
                if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && checkusername.username.length() == 4) {
                    laVar.H.setText(gd.M0(2131743417, null));
                    org.telegram.ui.Cells.b2 b2Var3 = laVar.H;
                    int i10 = n6.f29617p7;
                    b2Var3.setTag(Integer.valueOf(i10));
                    u6.U(laVar.H, i10, null);
                } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                    if (checkusername.username.length() == 4) {
                        laVar.H.setText(gd.M0(2131743416, null));
                    } else {
                        laVar.H.setText(gd.M0(2131743420, null));
                    }
                    org.telegram.ui.Cells.b2 b2Var4 = laVar.H;
                    int i11 = n6.F6;
                    b2Var4.setTag(Integer.valueOf(i11));
                    u6.U(laVar.H, i11, null);
                } else {
                    laVar.H.setText(gd.M0(2131743421, null));
                    org.telegram.ui.Cells.b2 b2Var5 = laVar.H;
                    int i12 = n6.f29617p7;
                    b2Var5.setTag(Integer.valueOf(i12));
                    u6.U(laVar.H, i12, null);
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
        qc qcVar = (qc) this.f1120c;
        boolean[] zArr = (boolean[]) this.f1119b;
        int[] iArr = (int[]) this.f1121e;
        int[] iArr2 = (int[]) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1122f;
        if (!zArr[0] && (i7 = iArr[0]) < iArr2[0]) {
            if (tL_error != null) {
                zArr[0] = true;
                if ("BOOSTS_REQUIRED".equals(tL_error.text)) {
                    qcVar.getMessagesController().I0().b(qcVar.f51201a, qcVar.f51205c, new vb(qcVar, 1));
                    return;
                }
                qcVar.Q.setLoading(false);
                lc.b0(qcVar).Q(2131624012, 36, gd.a0(null, null, 2131743641, tL_error.text)).j();
                return;
            }
            int i11 = i7 + 1;
            iArr[0] = i11;
            if (i11 == iArr2[0]) {
                qcVar.finishFragment();
                org.telegram.ui.ActionBar.h2 h2Var = qcVar.m0;
                if (h2Var != null) {
                    if (h2Var instanceof rn) {
                        ((rn) h2Var).t0();
                    }
                    lc b02 = lc.b0(qcVar.m0);
                    if (qcVar.d) {
                        i10 = 2131749306;
                    } else {
                        i10 = 2131752448;
                    }
                    f3.n(null, i10, b02, 2131623990, 36);
                    qcVar.m0 = null;
                }
                qcVar.Q.setLoading(false);
            }
        }
    }

    private final void c() {
        ad adVar = (ad) this.f1119b;
        String str = (String) this.f1120c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f1121e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f1122f;
        adVar.Y = 0;
        String str2 = adVar.Z;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                adVar.W.setText(gd.a0("LinkAvailable", null, 2131748732, str));
                org.telegram.ui.Cells.b2 b2Var = adVar.W;
                int i7 = n6.f29750w6;
                b2Var.setTag(Integer.valueOf(i7));
                u6.U(adVar.W, i7, null);
                adVar.f45541b0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                adVar.W.setText(gd.M0(2131743417, null));
                u6.U(adVar.W, n6.f29617p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    adVar.W.setText(gd.M0(2131743416, null));
                } else {
                    adVar.W.setText(gd.M0(2131743420, null));
                }
                u6.U(adVar.W, n6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                u6.U(adVar.W, n6.f29617p7, null);
                adVar.f45554l0 = false;
                adVar.l0();
            } else {
                u6.U(adVar.W, n6.f29617p7, null);
                adVar.W.setText(gd.M0(2131748720, null));
            }
            adVar.f45541b0 = false;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.b.run():void");
    }

    public b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f1118a = i7;
        this.f1119b = obj;
        this.f1120c = obj2;
        this.d = obj3;
        this.f1121e = obj4;
        this.f1122f = obj5;
    }

    public b(gb gbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f1118a = 24;
        this.f1120c = gbVar;
        this.d = tL_chatInviteExported;
        this.f1121e = tL_messages_exportedChatInvite;
        this.f1119b = zArr;
        this.f1122f = u1Var;
    }

    public b(qc qcVar, boolean[] zArr, int[] iArr, int[] iArr2, TLRPC.TL_error tL_error) {
        this.f1118a = 25;
        this.f1120c = qcVar;
        this.f1119b = zArr;
        this.f1121e = iArr;
        this.d = iArr2;
        this.f1122f = tL_error;
    }

    public b(bn bnVar, View view, boolean[] zArr, org.telegram.ui.ActionBar.h1 h1Var, View view2) {
        this.f1118a = 28;
        this.f1120c = bnVar;
        this.d = view;
        this.f1119b = zArr;
        this.f1121e = h1Var;
        this.f1122f = view2;
    }

    public b(bn bnVar, boolean[] zArr, boolean[] zArr2, ImageView imageView, ImageView imageView2) {
        this.f1118a = 27;
        this.d = bnVar;
        this.f1119b = zArr;
        this.f1120c = zArr2;
        this.f1121e = imageView;
        this.f1122f = imageView2;
    }

    public b(boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, a1.e eVar) {
        this.f1118a = 0;
        this.f1119b = zArr;
        this.f1120c = zArr2;
        this.f1121e = iArr;
        this.d = zArr3;
        this.f1122f = eVar;
    }
}
