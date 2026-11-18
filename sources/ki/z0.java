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
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.g70;
public final class z0 implements Runnable {
    public final int f19093a = 0;
    public final Object f19094b;
    public final long f19095c;
    public final Object d;
    public final int f19096e;
    public final TLObject f19097f;
    public final Object h;
    public final Object f19098n;
    public final Object f19099r;
    public final Object f19100s;

    public z0(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, i6 i6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f19094b = u1Var;
        this.d = context;
        this.f19096e = i7;
        this.f19095c = j3;
        this.f19097f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f19098n = i6Var;
        this.f19099r = qVar;
        this.f19100s = h0Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.r0 r0Var;
        String i7;
        org.telegram.ui.Wallet.h2 h2Var;
        switch (this.f19093a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f19097f;
                ((org.telegram.ui.ActionBar.u1) this.f19094b).dismiss();
                new h1(context, this.f19096e, this.f19095c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (i6) this.f19098n, (org.telegram.ui.web.q) this.f19099r, (bi.h0) this.f19100s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f19094b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                e70 e70Var = (e70) this.f19098n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.f19099r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f19100s;
                try {
                    u1Var.dismiss();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                TLObject tLObject = this.f19097f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        e70Var.a(mp.u1(cVar.f23221a).l1(fj.B1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    g70.D1 = joinaspeers.peers;
                    long j3 = this.f19095c;
                    g70.F1 = j3;
                    g70.E1 = SystemClock.elapsedRealtime();
                    int i10 = cVar.f23221a;
                    g70.G1 = i10;
                    mp.u1(i10).Z3(joinaspeers.chats, false);
                    mp.u1(cVar.f23221a).f4(joinaspeers.users, false);
                    g70.M0(context2, j3, joinaspeers.peers, h2Var2, this.f19096e, peer, e70Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.f19094b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f19097f;
                org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) this.h;
                String str = (String) this.f19098n;
                byte[] bArr = (byte[]) this.f19099r;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f19100s;
                l2Var.getClass();
                try {
                    r0Var = r0Var2;
                } catch (Exception e11) {
                    e = e11;
                    r0Var = r0Var2;
                }
                try {
                    h2Var = new org.telegram.ui.Wallet.h2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.l2.g(r0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, l2Var.f44483f.getCurrentTime()), str, bArr);
                    i7 = null;
                } catch (Exception e12) {
                    e = e12;
                    i7 = org.telegram.ui.Wallet.l2.i("decode request", e);
                    h2Var = null;
                    org.telegram.messenger.g0.g3(new nb(l2Var, h2Var, e0Var, i7, this.f19095c, this.f19096e, r0Var));
                    return;
                }
                org.telegram.messenger.g0.g3(new nb(l2Var, h2Var, e0Var, i7, this.f19095c, this.f19096e, r0Var));
                return;
        }
    }

    public z0(org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, org.telegram.messenger.c cVar, e70 e70Var, long j3, Context context, org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.Peer peer) {
        this.f19094b = u1Var;
        this.f19097f = tLObject;
        this.h = cVar;
        this.f19098n = e70Var;
        this.f19095c = j3;
        this.d = context;
        this.f19099r = h2Var;
        this.f19096e = i7;
        this.f19100s = peer;
    }

    public z0(org.telegram.ui.Wallet.l2 l2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.r0 r0Var, String str, byte[] bArr, org.telegram.ui.Wallet.e0 e0Var, long j3, int i7) {
        this.f19094b = l2Var;
        this.d = tonconnectpending;
        this.f19097f = tonconnectrequest;
        this.h = r0Var;
        this.f19098n = str;
        this.f19099r = bArr;
        this.f19100s = e0Var;
        this.f19095c = j3;
        this.f19096e = i7;
    }
}
