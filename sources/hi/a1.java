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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.u60;
public final class a1 implements Runnable {
    public final int f14497a = 0;
    public final Object f14498b;
    public final long f14499c;
    public final Object d;
    public final int f14500e;
    public final TLObject f14501f;
    public final Object h;
    public final Object f14502n;
    public final Object f14503r;
    public final Object f14504s;

    public a1(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, g6 g6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.f14498b = u1Var;
        this.d = context;
        this.f14500e = i7;
        this.f14499c = j3;
        this.f14501f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f14502n = g6Var;
        this.f14503r = pVar;
        this.f14504s = t0Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        String i7;
        org.telegram.ui.Wallet.z1 z1Var;
        switch (this.f14497a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f14501f;
                ((org.telegram.ui.ActionBar.u1) this.f14498b).dismiss();
                new i1(context, this.f14500e, this.f14499c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (g6) this.f14502n, (org.telegram.ui.web.p) this.f14503r, (bi.t0) this.f14504s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f14498b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                s60 s60Var = (s60) this.f14502n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f14503r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f14504s;
                try {
                    u1Var.dismiss();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                TLObject tLObject = this.f14501f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        s60Var.a(qp.s1(cVar.f21765a).j1(ij.B1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    u60.f38625z1 = joinaspeers.peers;
                    long j3 = this.f14499c;
                    u60.B1 = j3;
                    u60.A1 = SystemClock.elapsedRealtime();
                    int i10 = cVar.f21765a;
                    u60.C1 = i10;
                    qp.s1(i10).S3(joinaspeers.chats, false);
                    qp.s1(cVar.f21765a).Y3(joinaspeers.users, false);
                    u60.L0(context2, j3, joinaspeers.peers, f2Var, this.f14500e, peer, s60Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.f14498b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f14501f;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.h;
                String str = (String) this.f14502n;
                byte[] bArr = (byte[]) this.f14503r;
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.f14504s;
                d2Var.getClass();
                try {
                    i0Var = i0Var2;
                } catch (Exception e11) {
                    e = e11;
                    i0Var = i0Var2;
                }
                try {
                    z1Var = new org.telegram.ui.Wallet.z1(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.d2.g(i0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, d2Var.f42349f.getCurrentTime()), str, bArr);
                    i7 = null;
                } catch (Exception e12) {
                    e = e12;
                    i7 = org.telegram.ui.Wallet.d2.i("decode request", e);
                    z1Var = null;
                    org.telegram.messenger.g0.h3(new pb(d2Var, z1Var, t1Var, i7, this.f14499c, this.f14500e, i0Var));
                    return;
                }
                org.telegram.messenger.g0.h3(new pb(d2Var, z1Var, t1Var, i7, this.f14499c, this.f14500e, i0Var));
                return;
        }
    }

    public a1(org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, org.telegram.messenger.c cVar, s60 s60Var, long j3, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer) {
        this.f14498b = u1Var;
        this.f14501f = tLObject;
        this.h = cVar;
        this.f14502n = s60Var;
        this.f14499c = j3;
        this.d = context;
        this.f14503r = f2Var;
        this.f14500e = i7;
        this.f14504s = peer;
    }

    public a1(org.telegram.ui.Wallet.d2 d2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, org.telegram.ui.Wallet.t1 t1Var, long j3, int i7) {
        this.f14498b = d2Var;
        this.d = tonconnectpending;
        this.f14501f = tonconnectrequest;
        this.h = i0Var;
        this.f14502n = str;
        this.f14503r = bArr;
        this.f14504s = t1Var;
        this.f14499c = j3;
        this.f14500e = i7;
    }
}
