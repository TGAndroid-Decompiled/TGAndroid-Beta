package ki;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.nb;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.f70;
public final class y0 implements Runnable {
    public final int f19161a = 0;
    public final Object f19162b;
    public final long f19163c;
    public final Object d;
    public final int f19164e;
    public final TLObject f19165f;
    public final Object h;
    public final Object f19166n;
    public final Object f19167r;
    public final Object f19168s;

    public y0(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, i6 i6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f19162b = t1Var;
        this.d = context;
        this.f19164e = i7;
        this.f19163c = j3;
        this.f19165f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f19166n = i6Var;
        this.f19167r = qVar;
        this.f19168s = h0Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.s0 s0Var;
        String i7;
        org.telegram.ui.Wallet.i2 i2Var;
        switch (this.f19161a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f19165f;
                ((org.telegram.ui.ActionBar.t1) this.f19162b).dismiss();
                new g1(context, this.f19164e, this.f19163c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (i6) this.f19166n, (org.telegram.ui.web.q) this.f19167r, (bi.h0) this.f19168s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f19162b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                d70 d70Var = (d70) this.f19166n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f19167r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f19168s;
                try {
                    t1Var.dismiss();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                TLObject tLObject = this.f19165f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        d70Var.a(mp.u1(cVar.f23343a).l1(fj.B1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    f70.D1 = joinaspeers.peers;
                    long j3 = this.f19163c;
                    f70.F1 = j3;
                    f70.E1 = SystemClock.elapsedRealtime();
                    int i10 = cVar.f23343a;
                    f70.G1 = i10;
                    mp.u1(i10).Z3(joinaspeers.chats, false);
                    mp.u1(cVar.f23343a).f4(joinaspeers.users, false);
                    f70.M0(context2, j3, joinaspeers.peers, g2Var, this.f19164e, peer, d70Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.f19162b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f19165f;
                org.telegram.ui.Wallet.s0 s0Var2 = (org.telegram.ui.Wallet.s0) this.h;
                String str = (String) this.f19166n;
                byte[] bArr = (byte[]) this.f19167r;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.f19168s;
                m2Var.getClass();
                try {
                    s0Var = s0Var2;
                } catch (Exception e11) {
                    e = e11;
                    s0Var = s0Var2;
                }
                try {
                    i2Var = new org.telegram.ui.Wallet.i2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.m2.g(s0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, m2Var.f44652f.getCurrentTime()), str, bArr);
                    i7 = null;
                } catch (Exception e12) {
                    e = e12;
                    i7 = org.telegram.ui.Wallet.m2.i("decode request", e);
                    i2Var = null;
                    org.telegram.messenger.g0.g3(new nb(m2Var, i2Var, f0Var, i7, this.f19163c, this.f19164e, s0Var));
                    return;
                }
                org.telegram.messenger.g0.g3(new nb(m2Var, i2Var, f0Var, i7, this.f19163c, this.f19164e, s0Var));
                return;
        }
    }

    public y0(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, org.telegram.messenger.c cVar, d70 d70Var, long j3, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Peer peer) {
        this.f19162b = t1Var;
        this.f19165f = tLObject;
        this.h = cVar;
        this.f19166n = d70Var;
        this.f19163c = j3;
        this.d = context;
        this.f19167r = g2Var;
        this.f19164e = i7;
        this.f19168s = peer;
    }

    public y0(org.telegram.ui.Wallet.m2 m2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.s0 s0Var, String str, byte[] bArr, org.telegram.ui.Wallet.f0 f0Var, long j3, int i7) {
        this.f19162b = m2Var;
        this.d = tonconnectpending;
        this.f19165f = tonconnectrequest;
        this.h = s0Var;
        this.f19166n = str;
        this.f19167r = bArr;
        this.f19168s = f0Var;
        this.f19163c = j3;
        this.f19164e = i7;
    }
}
