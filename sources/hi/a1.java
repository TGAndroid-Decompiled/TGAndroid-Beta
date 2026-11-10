package hi;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.messenger.pb;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.t60;
public final class a1 implements Runnable {
    public final int f14499a = 0;
    public final Object f14500b;
    public final long f14501c;
    public final Object d;
    public final int f14502e;
    public final TLObject f14503f;
    public final Object h;
    public final Object f14504n;
    public final Object f14505r;
    public final Object f14506s;

    public a1(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, h6 h6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.f14500b = u1Var;
        this.d = context;
        this.f14502e = i7;
        this.f14501c = j3;
        this.f14503f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f14504n = h6Var;
        this.f14505r = pVar;
        this.f14506s = t0Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        String i7;
        org.telegram.ui.Wallet.z1 z1Var;
        switch (this.f14499a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f14503f;
                ((org.telegram.ui.ActionBar.u1) this.f14500b).dismiss();
                new i1(context, this.f14502e, this.f14501c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (h6) this.f14504n, (org.telegram.ui.web.p) this.f14505r, (bi.t0) this.f14506s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f14500b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                r60 r60Var = (r60) this.f14504n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f14505r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f14506s;
                try {
                    u1Var.dismiss();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                TLObject tLObject = this.f14503f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        r60Var.a(qp.s1(cVar.f21770a).j1(ij.B1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    t60.C1 = joinaspeers.peers;
                    long j3 = this.f14501c;
                    t60.E1 = j3;
                    t60.D1 = SystemClock.elapsedRealtime();
                    int i10 = cVar.f21770a;
                    t60.F1 = i10;
                    qp.s1(i10).S3(joinaspeers.chats, false);
                    qp.s1(cVar.f21770a).Y3(joinaspeers.users, false);
                    t60.L0(context2, j3, joinaspeers.peers, f2Var, this.f14502e, peer, r60Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.f14500b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f14503f;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.h;
                String str = (String) this.f14504n;
                byte[] bArr = (byte[]) this.f14505r;
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.f14506s;
                d2Var.getClass();
                try {
                    i0Var = i0Var2;
                } catch (Exception e11) {
                    e = e11;
                    i0Var = i0Var2;
                }
                try {
                    z1Var = new org.telegram.ui.Wallet.z1(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.d2.g(i0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, d2Var.f42290f.getCurrentTime()), str, bArr);
                    i7 = null;
                } catch (Exception e12) {
                    e = e12;
                    i7 = org.telegram.ui.Wallet.d2.i("decode request", e);
                    z1Var = null;
                    org.telegram.messenger.g0.h3(new pb(d2Var, z1Var, t1Var, i7, this.f14501c, this.f14502e, i0Var));
                    return;
                }
                org.telegram.messenger.g0.h3(new pb(d2Var, z1Var, t1Var, i7, this.f14501c, this.f14502e, i0Var));
                return;
        }
    }

    public a1(org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, org.telegram.messenger.c cVar, r60 r60Var, long j3, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer) {
        this.f14500b = u1Var;
        this.f14503f = tLObject;
        this.h = cVar;
        this.f14504n = r60Var;
        this.f14501c = j3;
        this.d = context;
        this.f14505r = f2Var;
        this.f14502e = i7;
        this.f14506s = peer;
    }

    public a1(org.telegram.ui.Wallet.d2 d2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, org.telegram.ui.Wallet.t1 t1Var, long j3, int i7) {
        this.f14500b = d2Var;
        this.d = tonconnectpending;
        this.f14503f = tonconnectrequest;
        this.h = i0Var;
        this.f14504n = str;
        this.f14505r = bArr;
        this.f14506s = t1Var;
        this.f14501c = j3;
        this.f14502e = i7;
    }
}
