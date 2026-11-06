package bi;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.go;
import org.telegram.ui.kp;
import org.telegram.ui.lm;
import org.telegram.ui.nq;
import org.telegram.ui.oq;
public final class u0 implements Runnable {
    public final int f4779a;
    public final Object f4780b;
    public final Object f4781c;
    public final Object d;
    public final Object f4782e;
    public final Object f4783f;

    public u0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f4779a = i7;
        this.f4781c = obj;
        this.d = obj2;
        this.f4782e = obj3;
        this.f4783f = obj4;
        this.f4780b = obj5;
    }

    private final void a() {
        org.telegram.ui.bd bdVar = (org.telegram.ui.bd) this.f4781c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4780b;
        TLObject tLObject = (TLObject) this.f4782e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f4783f;
        bdVar.X = 0;
        String str2 = bdVar.Y;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                bdVar.V.setText(org.telegram.messenger.hd.a0("LinkAvailable", null, 2131748923, str));
                org.telegram.ui.Cells.b2 b2Var = bdVar.V;
                int i7 = org.telegram.ui.ActionBar.k6.f28202w6;
                b2Var.setTag(Integer.valueOf(i7));
                org.telegram.ui.ActionBar.r6.V(bdVar.V, i7, null);
                bdVar.f44236a0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                bdVar.V.setText(org.telegram.messenger.hd.M0(2131743655, null));
                org.telegram.ui.ActionBar.r6.V(bdVar.V, org.telegram.ui.ActionBar.k6.f28069p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    bdVar.V.setText(org.telegram.messenger.hd.M0(2131743654, null));
                } else {
                    bdVar.V.setText(org.telegram.messenger.hd.M0(2131743658, null));
                }
                org.telegram.ui.ActionBar.r6.V(bdVar.V, org.telegram.ui.ActionBar.k6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.ui.ActionBar.r6.V(bdVar.V, org.telegram.ui.ActionBar.k6.f28069p7, null);
                bdVar.f44250k0 = false;
                bdVar.l0();
            } else {
                org.telegram.ui.ActionBar.r6.V(bdVar.V, org.telegram.ui.ActionBar.k6.f28069p7, null);
                bdVar.V.setText(org.telegram.messenger.hd.M0(2131748911, null));
            }
            bdVar.f44236a0 = false;
        }
    }

    private final void b() {
        lm lmVar = (lm) this.f4781c;
        org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.f4782e;
        ij ijVar = (ij) this.f4783f;
        org.telegram.ui.q5 q5Var = (org.telegram.ui.q5) this.f4780b;
        an anVar = lmVar.f47534a;
        if (((TLRPC.Message) this.d).suggested_post.schedule_date == 0) {
            u1VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.Q(anVar.getParentActivity(), 0L, new ni.c(15, lmVar, ijVar), anVar.getResourceProvider(), 1).f14323b;
            v2Var.show();
            v2Var.setOnDismissListener(q5Var);
            return;
        }
        anVar.getMessagesController().v(ijVar.f23237k.f26973id, 0, org.telegram.messenger.m5.o(ijVar.f23237k.peer_id), null, false);
    }

    private final void c() {
        go goVar = (go) this.f4781c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4780b;
        TLObject tLObject = (TLObject) this.f4782e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f4783f;
        goVar.f46031h0 = 0;
        String str2 = goVar.f46032i0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                goVar.h.setText(org.telegram.messenger.hd.a0("LinkAvailable", null, 2131748923, str));
                goVar.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28202w6);
                goVar.f46034k0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                goVar.h.setText(org.telegram.messenger.hd.M0(2131743655, null));
                org.telegram.ui.ActionBar.r6.V(goVar.h.getTextView(), org.telegram.ui.ActionBar.k6.f28069p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    goVar.h.setText(org.telegram.messenger.hd.M0(2131743654, null));
                } else {
                    goVar.h.setText(org.telegram.messenger.hd.M0(2131743658, null));
                }
                org.telegram.ui.ActionBar.r6.V(goVar.h.getTextView(), org.telegram.ui.ActionBar.k6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                goVar.f46024c0 = false;
                goVar.f0();
            } else {
                goVar.h.setText(org.telegram.messenger.hd.M0(2131748911, null));
                goVar.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28069p7);
            }
            goVar.f46034k0 = false;
        }
    }

    private final void d() {
        kp.d0((kp) this.f4781c, (TLRPC.TL_error) this.f4780b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.f4782e, (TLRPC.TL_channels_editCreator) this.f4783f);
    }

    private final void f() {
        nq nqVar = (nq) this.f4781c;
        ArrayList arrayList = (ArrayList) this.d;
        a0.h hVar = (a0.h) this.f4782e;
        ArrayList arrayList2 = (ArrayList) this.f4783f;
        ArrayList arrayList3 = (ArrayList) this.f4780b;
        jg.z1 z1Var = nqVar.h;
        oq oqVar = nqVar.D;
        if (oqVar.n1) {
            nqVar.f48082s = false;
            nqVar.d = arrayList;
            nqVar.f48078e = hVar;
            nqVar.f48079f = arrayList2;
            z1Var.f(arrayList, null);
            if (!org.telegram.messenger.t3.T(oqVar.f48470n)) {
                ArrayList arrayList4 = z1Var.f16994g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i7 = nqVar.f48081r;
            nqVar.f();
            if (nqVar.f48081r > i7) {
                oqVar.D0(i7);
            }
            if (!z1Var.e() && nqVar.f48081r == 0) {
                oqVar.f48444b.e(false, true);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.u0.run():void");
    }

    public u0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i7) {
        this.f4779a = i7;
        this.f4781c = obj;
        this.d = obj2;
        this.f4780b = tL_error;
        this.f4782e = tLObject;
        this.f4783f = obj3;
    }

    public u0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i7) {
        this.f4779a = i7;
        this.f4781c = obj;
        this.f4780b = tL_error;
        this.d = obj2;
        this.f4782e = obj3;
        this.f4783f = tLObject;
    }

    public u0(Object obj, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLObject tLObject2, Object obj2, int i7) {
        this.f4779a = i7;
        this.f4781c = obj;
        this.f4782e = u1Var;
        this.d = tLObject;
        this.f4783f = tLObject2;
        this.f4780b = obj2;
    }

    public u0(org.telegram.ui.hb hbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f4779a = 21;
        this.f4781c = hbVar;
        this.d = tL_chatInviteExported;
        this.f4783f = tL_messages_exportedChatInvite;
        this.f4780b = zArr;
        this.f4782e = u1Var;
    }
}
