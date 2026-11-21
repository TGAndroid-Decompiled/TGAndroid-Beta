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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.i70;
public final class y0 implements Runnable {
    public final int f19100a = 0;
    public final Object f19101b;
    public final long f19102c;
    public final Object d;
    public final int f19103e;
    public final TLObject f19104f;
    public final Object h;
    public final Object f19105n;
    public final Object f19106r;
    public final Object f19107s;

    public y0(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, h6 h6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f19101b = t1Var;
        this.d = context;
        this.f19103e = i7;
        this.f19102c = j3;
        this.f19104f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f19105n = h6Var;
        this.f19106r = qVar;
        this.f19107s = h0Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.r0 r0Var;
        String i7;
        org.telegram.ui.Wallet.h2 h2Var;
        switch (this.f19100a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f19104f;
                ((org.telegram.ui.ActionBar.t1) this.f19101b).dismiss();
                new g1(context, this.f19103e, this.f19102c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (h6) this.f19105n, (org.telegram.ui.web.q) this.f19106r, (bi.h0) this.f19107s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f19101b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                g70 g70Var = (g70) this.f19105n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f19106r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f19107s;
                try {
                    t1Var.dismiss();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                TLObject tLObject = this.f19104f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        g70Var.a(mp.u1(cVar.f23246a).l1(fj.B1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    i70.D1 = joinaspeers.peers;
                    long j3 = this.f19102c;
                    i70.F1 = j3;
                    i70.E1 = SystemClock.elapsedRealtime();
                    int i10 = cVar.f23246a;
                    i70.G1 = i10;
                    mp.u1(i10).Z3(joinaspeers.chats, false);
                    mp.u1(cVar.f23246a).f4(joinaspeers.users, false);
                    i70.M0(context2, j3, joinaspeers.peers, g2Var, this.f19103e, peer, g70Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.f19101b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f19104f;
                org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) this.h;
                String str = (String) this.f19105n;
                byte[] bArr = (byte[]) this.f19106r;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f19107s;
                l2Var.getClass();
                try {
                    r0Var = r0Var2;
                } catch (Exception e11) {
                    e = e11;
                    r0Var = r0Var2;
                }
                try {
                    h2Var = new org.telegram.ui.Wallet.h2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.l2.g(r0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, l2Var.f44523f.getCurrentTime()), str, bArr);
                    i7 = null;
                } catch (Exception e12) {
                    e = e12;
                    i7 = org.telegram.ui.Wallet.l2.i("decode request", e);
                    h2Var = null;
                    org.telegram.messenger.g0.g3(new nb(l2Var, h2Var, e0Var, i7, this.f19102c, this.f19103e, r0Var));
                    return;
                }
                org.telegram.messenger.g0.g3(new nb(l2Var, h2Var, e0Var, i7, this.f19102c, this.f19103e, r0Var));
                return;
        }
    }

    public y0(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, org.telegram.messenger.c cVar, g70 g70Var, long j3, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Peer peer) {
        this.f19101b = t1Var;
        this.f19104f = tLObject;
        this.h = cVar;
        this.f19105n = g70Var;
        this.f19102c = j3;
        this.d = context;
        this.f19106r = g2Var;
        this.f19103e = i7;
        this.f19107s = peer;
    }

    public y0(org.telegram.ui.Wallet.l2 l2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.r0 r0Var, String str, byte[] bArr, org.telegram.ui.Wallet.e0 e0Var, long j3, int i7) {
        this.f19101b = l2Var;
        this.d = tonconnectpending;
        this.f19104f = tonconnectrequest;
        this.h = r0Var;
        this.f19105n = str;
        this.f19106r = bArr;
        this.f19107s = e0Var;
        this.f19102c = j3;
        this.f19103e = i7;
    }
}
