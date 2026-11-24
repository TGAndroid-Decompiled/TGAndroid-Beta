package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
public final class vr0 implements Runnable {
    public final byte a = 0;
    public final long b;
    public final int c;
    public final Object d;
    public final Object e;
    public final TLObject f;
    public final Object h;
    public final Object n;
    public final Object r;
    public final Object s;

    public vr0(hd hdVar, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, wjb wjbVar, st0 st0Var, p pVar) {
        this.d = hdVar;
        this.e = context;
        this.c = i;
        this.b = j;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = wjbVar;
        this.r = st0Var;
        this.s = pVar;
    }

    @Override
    public final void run() {
        String h;
        s25 s25Var;
        byte b = this.a;
        Object obj = this.s;
        Object obj2 = this.r;
        Object obj3 = this.e;
        Object obj4 = this.n;
        Object obj5 = this.h;
        TLObject tLObject = this.f;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                ((hd) obj6).dismiss();
                new ds0((Context) obj3, this.c, this.b, (TLRPC.TL_messages_preparedInlineMessage) tLObject, ((File[]) obj5)[0], null, (wjb) obj4, (st0) obj2, (p) obj).show();
                return;
            case 1:
                w25 w25Var = (w25) obj6;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj3;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) tLObject;
                y05 y05Var = (y05) obj5;
                String str = (String) obj4;
                byte[] bArr = (byte[]) obj2;
                ae2 ae2Var = (ae2) obj;
                w25Var.getClass();
                try {
                } catch (Exception e) {
                    e = e;
                }
                try {
                    JSONObject f = w25.f(y05Var, tonconnectpending.session, str, bArr, tonconnectrequest.body, w25Var.f.getCurrentTime());
                    y05Var = y05Var;
                    h = null;
                    s25Var = new s25(tonconnectpending, tonconnectrequest, f, str, bArr);
                } catch (Exception e2) {
                    e = e2;
                    y05Var = y05Var;
                    h = w25.h("decode request", e);
                    s25Var = null;
                    gl.c3(new oe(w25Var, s25Var, ae2Var, h, this.b, this.c, y05Var, (byte) 1));
                    return;
                }
                gl.c3(new oe(w25Var, s25Var, ae2Var, h, this.b, this.c, y05Var, (byte) 1));
                return;
            default:
                j5 j5Var = (j5) obj5;
                vt5 vt5Var = (vt5) obj4;
                Context context = (Context) obj3;
                d dVar = (d) obj2;
                TLRPC.Peer peer = (TLRPC.Peer) obj;
                try {
                    ((hd) obj6).dismiss();
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        vt5Var.a(na7.q1(j5Var.a).h1(k27.B1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    xt5.C1 = joinaspeers.peers;
                    long j = this.b;
                    xt5.E1 = j;
                    xt5.D1 = SystemClock.elapsedRealtime();
                    int i = j5Var.a;
                    xt5.F1 = i;
                    na7.q1(i).V3(joinaspeers.chats, false);
                    na7.q1(j5Var.a).b4(joinaspeers.users, false);
                    xt5.F0(context, j, joinaspeers.peers, dVar, this.c, peer, vt5Var);
                    return;
                }
                return;
        }
    }

    public vr0(hd hdVar, TLObject tLObject, j5 j5Var, vt5 vt5Var, long j, Context context, d dVar, int i, TLRPC.Peer peer) {
        this.d = hdVar;
        this.f = tLObject;
        this.h = j5Var;
        this.n = vt5Var;
        this.b = j;
        this.e = context;
        this.r = dVar;
        this.c = i;
        this.s = peer;
    }

    public vr0(w25 w25Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, y05 y05Var, String str, byte[] bArr, ae2 ae2Var, long j, int i) {
        this.d = w25Var;
        this.e = tonconnectpending;
        this.f = tonconnectrequest;
        this.h = y05Var;
        this.n = str;
        this.r = bArr;
        this.s = ae2Var;
        this.b = j;
        this.c = i;
    }
}
