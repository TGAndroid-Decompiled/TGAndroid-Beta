package ki;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.ob;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.v60;
public final class b1 implements Runnable {
    public final int f18205a = 0;
    public final Object f18206b;
    public final long f18207c;
    public final Object d;
    public final int f18208e;
    public final TLObject f18209f;
    public final Object h;
    public final Object f18210n;
    public final Object f18211r;
    public final Object f18212s;

    public b1(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, e6 e6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f18206b = t1Var;
        this.d = context;
        this.f18208e = i7;
        this.f18207c = j3;
        this.f18209f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f18210n = e6Var;
        this.f18211r = qVar;
        this.f18212s = h0Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        String i7;
        org.telegram.ui.Wallet.z1 z1Var;
        switch (this.f18205a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f18209f;
                ((org.telegram.ui.ActionBar.t1) this.f18206b).dismiss();
                new j1(context, this.f18208e, this.f18207c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (e6) this.f18210n, (org.telegram.ui.web.q) this.f18211r, (bi.h0) this.f18212s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f18206b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                t60 t60Var = (t60) this.f18210n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f18211r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f18212s;
                try {
                    t1Var.dismiss();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                TLObject tLObject = this.f18209f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        t60Var.a(np.s1(cVar.f22782a).j1(gj.B1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    v60.D1 = joinaspeers.peers;
                    long j3 = this.f18207c;
                    v60.F1 = j3;
                    v60.E1 = SystemClock.elapsedRealtime();
                    int i10 = cVar.f22782a;
                    v60.G1 = i10;
                    np.s1(i10).S3(joinaspeers.chats, false);
                    np.s1(cVar.f22782a).Y3(joinaspeers.users, false);
                    v60.L0(context2, j3, joinaspeers.peers, e2Var, this.f18208e, peer, t60Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.f18206b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f18209f;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.h;
                String str = (String) this.f18210n;
                byte[] bArr = (byte[]) this.f18211r;
                org.telegram.ui.Wallet.t1 t1Var2 = (org.telegram.ui.Wallet.t1) this.f18212s;
                d2Var.getClass();
                try {
                    i0Var = i0Var2;
                } catch (Exception e11) {
                    e = e11;
                    i0Var = i0Var2;
                }
                try {
                    z1Var = new org.telegram.ui.Wallet.z1(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.d2.g(i0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, d2Var.f43733f.getCurrentTime()), str, bArr);
                    i7 = null;
                } catch (Exception e12) {
                    e = e12;
                    i7 = org.telegram.ui.Wallet.d2.i("decode request", e);
                    z1Var = null;
                    org.telegram.messenger.g0.h3(new ob(d2Var, z1Var, t1Var2, i7, this.f18207c, this.f18208e, i0Var));
                    return;
                }
                org.telegram.messenger.g0.h3(new ob(d2Var, z1Var, t1Var2, i7, this.f18207c, this.f18208e, i0Var));
                return;
        }
    }

    public b1(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, org.telegram.messenger.c cVar, t60 t60Var, long j3, Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, TLRPC.Peer peer) {
        this.f18206b = t1Var;
        this.f18209f = tLObject;
        this.h = cVar;
        this.f18210n = t60Var;
        this.f18207c = j3;
        this.d = context;
        this.f18211r = e2Var;
        this.f18208e = i7;
        this.f18212s = peer;
    }

    public b1(org.telegram.ui.Wallet.d2 d2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, org.telegram.ui.Wallet.t1 t1Var, long j3, int i7) {
        this.f18206b = d2Var;
        this.d = tonconnectpending;
        this.f18209f = tonconnectrequest;
        this.h = i0Var;
        this.f18210n = str;
        this.f18211r = bArr;
        this.f18212s = t1Var;
        this.f18207c = j3;
        this.f18208e = i7;
    }
}
