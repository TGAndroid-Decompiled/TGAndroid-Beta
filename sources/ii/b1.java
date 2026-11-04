package ii;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.a8;
import org.telegram.messenger.hp;
import org.telegram.messenger.ib;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.o60;
public final class b1 implements Runnable {
    public final int f14838a = 0;
    public final Object f14839b;
    public final long f14840c;
    public final Object d;
    public final int f14841e;
    public final TLObject f14842f;
    public final Object h;
    public final Object f14843n;
    public final Object f14844r;
    public final Object f14845s;

    public b1(org.telegram.ui.ActionBar.s1 s1Var, Context context, int i3, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, e6 e6Var, org.telegram.ui.web.r rVar, ai.n0 n0Var) {
        this.f14839b = s1Var;
        this.d = context;
        this.f14841e = i3;
        this.f14840c = j10;
        this.f14842f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f14843n = e6Var;
        this.f14844r = rVar;
        this.f14845s = n0Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        String i3;
        org.telegram.ui.Wallet.y1 y1Var;
        switch (this.f14838a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f14842f;
                ((org.telegram.ui.ActionBar.s1) this.f14839b).dismiss();
                new j1(context, this.f14841e, this.f14840c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (e6) this.f14843n, (org.telegram.ui.web.r) this.f14844r, (ai.n0) this.f14845s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.f14839b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                m60 m60Var = (m60) this.f14843n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f14844r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f14845s;
                try {
                    s1Var.dismiss();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                TLObject tLObject = this.f14842f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        m60Var.a(hp.s1(cVar.f21919a).j1(zi.C1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    o60.A1 = joinaspeers.peers;
                    long j10 = this.f14840c;
                    o60.C1 = j10;
                    o60.B1 = SystemClock.elapsedRealtime();
                    int i10 = cVar.f21919a;
                    o60.D1 = i10;
                    hp.s1(i10).S3(joinaspeers.chats, false);
                    hp.s1(cVar.f21919a).Y3(joinaspeers.users, false);
                    o60.L0(context2, j10, joinaspeers.peers, d2Var, this.f14841e, peer, m60Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.f14839b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f14842f;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.h;
                String str = (String) this.f14843n;
                byte[] bArr = (byte[]) this.f14844r;
                org.telegram.ui.Wallet.s1 s1Var2 = (org.telegram.ui.Wallet.s1) this.f14845s;
                c2Var.getClass();
                try {
                    h0Var = h0Var2;
                } catch (Exception e11) {
                    e = e11;
                    h0Var = h0Var2;
                }
                try {
                    y1Var = new org.telegram.ui.Wallet.y1(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.c2.g(h0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, c2Var.f42381f.getCurrentTime()), str, bArr);
                    i3 = null;
                } catch (Exception e12) {
                    e = e12;
                    i3 = org.telegram.ui.Wallet.c2.i("decode request", e);
                    y1Var = null;
                    org.telegram.messenger.g0.h3(new ib(c2Var, y1Var, s1Var2, i3, this.f14840c, this.f14841e, h0Var));
                    return;
                }
                org.telegram.messenger.g0.h3(new ib(c2Var, y1Var, s1Var2, i3, this.f14840c, this.f14841e, h0Var));
                return;
        }
    }

    public b1(org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, org.telegram.messenger.c cVar, m60 m60Var, long j10, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.Peer peer) {
        this.f14839b = s1Var;
        this.f14842f = tLObject;
        this.h = cVar;
        this.f14843n = m60Var;
        this.f14840c = j10;
        this.d = context;
        this.f14844r = d2Var;
        this.f14841e = i3;
        this.f14845s = peer;
    }

    public b1(org.telegram.ui.Wallet.c2 c2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.h0 h0Var, String str, byte[] bArr, org.telegram.ui.Wallet.s1 s1Var, long j10, int i3) {
        this.f14839b = c2Var;
        this.d = tonconnectpending;
        this.f14842f = tonconnectrequest;
        this.h = h0Var;
        this.f14843n = str;
        this.f14844r = bArr;
        this.f14845s = s1Var;
        this.f14840c = j10;
        this.f14841e = i3;
    }
}
