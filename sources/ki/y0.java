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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.i70;
public final class y0 implements Runnable {
    public final int f19069a = 0;
    public final Object f19070b;
    public final long f19071c;
    public final Object d;
    public final int f19072e;
    public final TLObject f19073f;
    public final Object h;
    public final Object f19074n;
    public final Object f19075r;
    public final Object f19076s;

    public y0(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, h6 h6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f19070b = t1Var;
        this.d = context;
        this.f19072e = i7;
        this.f19071c = j3;
        this.f19073f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f19074n = h6Var;
        this.f19075r = qVar;
        this.f19076s = h0Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.r0 r0Var;
        String i7;
        org.telegram.ui.Wallet.h2 h2Var;
        switch (this.f19069a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f19073f;
                ((org.telegram.ui.ActionBar.t1) this.f19070b).dismiss();
                new g1(context, this.f19072e, this.f19071c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (h6) this.f19074n, (org.telegram.ui.web.q) this.f19075r, (bi.h0) this.f19076s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f19070b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                g70 g70Var = (g70) this.f19074n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f19075r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f19076s;
                try {
                    t1Var.dismiss();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                TLObject tLObject = this.f19073f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        g70Var.a(np.u1(cVar.f23166a).l1(gj.B1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    i70.D1 = joinaspeers.peers;
                    long j3 = this.f19071c;
                    i70.F1 = j3;
                    i70.E1 = SystemClock.elapsedRealtime();
                    int i10 = cVar.f23166a;
                    i70.G1 = i10;
                    np.u1(i10).Z3(joinaspeers.chats, false);
                    np.u1(cVar.f23166a).f4(joinaspeers.users, false);
                    i70.M0(context2, j3, joinaspeers.peers, g2Var, this.f19072e, peer, g70Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.f19070b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f19073f;
                org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) this.h;
                String str = (String) this.f19074n;
                byte[] bArr = (byte[]) this.f19075r;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f19076s;
                l2Var.getClass();
                try {
                    r0Var = r0Var2;
                } catch (Exception e11) {
                    e = e11;
                    r0Var = r0Var2;
                }
                try {
                    h2Var = new org.telegram.ui.Wallet.h2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.l2.g(r0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, l2Var.f44493f.getCurrentTime()), str, bArr);
                    i7 = null;
                } catch (Exception e12) {
                    e = e12;
                    i7 = org.telegram.ui.Wallet.l2.i("decode request", e);
                    h2Var = null;
                    org.telegram.messenger.g0.g3(new ob(l2Var, h2Var, e0Var, i7, this.f19071c, this.f19072e, r0Var));
                    return;
                }
                org.telegram.messenger.g0.g3(new ob(l2Var, h2Var, e0Var, i7, this.f19071c, this.f19072e, r0Var));
                return;
        }
    }

    public y0(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, org.telegram.messenger.c cVar, g70 g70Var, long j3, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Peer peer) {
        this.f19070b = t1Var;
        this.f19073f = tLObject;
        this.h = cVar;
        this.f19074n = g70Var;
        this.f19071c = j3;
        this.d = context;
        this.f19075r = g2Var;
        this.f19072e = i7;
        this.f19076s = peer;
    }

    public y0(org.telegram.ui.Wallet.l2 l2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.r0 r0Var, String str, byte[] bArr, org.telegram.ui.Wallet.e0 e0Var, long j3, int i7) {
        this.f19070b = l2Var;
        this.d = tonconnectpending;
        this.f19073f = tonconnectrequest;
        this.h = r0Var;
        this.f19074n = str;
        this.f19075r = bArr;
        this.f19076s = e0Var;
        this.f19071c = j3;
        this.f19072e = i7;
    }
}
