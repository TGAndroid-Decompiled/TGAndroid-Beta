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
public final class dt0 implements Runnable {
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

    public dt0(he heVar, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, ylb ylbVar, bv0 bv0Var, p pVar) {
        this.d = heVar;
        this.e = context;
        this.c = i;
        this.b = j;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = ylbVar;
        this.r = bv0Var;
        this.s = pVar;
    }

    @Override
    public final void run() {
        String h;
        s45 s45Var;
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
                ((he) obj6).dismiss();
                new lt0((Context) obj3, this.c, this.b, (TLRPC.TL_messages_preparedInlineMessage) tLObject, ((File[]) obj5)[0], null, (ylb) obj4, (bv0) obj2, (p) obj).show();
                return;
            case 1:
                w45 w45Var = (w45) obj6;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj3;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) tLObject;
                y25 y25Var = (y25) obj5;
                String str = (String) obj4;
                byte[] bArr = (byte[]) obj2;
                lf2 lf2Var = (lf2) obj;
                w45Var.getClass();
                try {
                } catch (Exception e) {
                    e = e;
                }
                try {
                    JSONObject f = w45.f(y25Var, tonconnectpending.session, str, bArr, tonconnectrequest.body, w45Var.f.getCurrentTime());
                    y25Var = y25Var;
                    h = null;
                    s45Var = new s45(tonconnectpending, tonconnectrequest, f, str, bArr);
                } catch (Exception e2) {
                    e = e2;
                    y25Var = y25Var;
                    h = w45.h("decode request", e);
                    s45Var = null;
                    gm.c3(new pf(w45Var, s45Var, lf2Var, h, this.b, this.c, y25Var, (byte) 1));
                    return;
                }
                gm.c3(new pf(w45Var, s45Var, lf2Var, h, this.b, this.c, y25Var, (byte) 1));
                return;
            default:
                j5 j5Var = (j5) obj5;
                uv5 uv5Var = (uv5) obj4;
                Context context = (Context) obj3;
                d dVar = (d) obj2;
                TLRPC.Peer peer = (TLRPC.Peer) obj;
                try {
                    ((he) obj6).dismiss();
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        uv5Var.a(oc7.r1(j5Var.a).i1(k47.B1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    wv5.C1 = joinaspeers.peers;
                    long j = this.b;
                    wv5.E1 = j;
                    wv5.D1 = SystemClock.elapsedRealtime();
                    int i = j5Var.a;
                    wv5.F1 = i;
                    oc7.r1(i).X3(joinaspeers.chats, false);
                    oc7.r1(j5Var.a).d4(joinaspeers.users, false);
                    wv5.F0(context, j, joinaspeers.peers, dVar, this.c, peer, uv5Var);
                    return;
                }
                return;
        }
    }

    public dt0(he heVar, TLObject tLObject, j5 j5Var, uv5 uv5Var, long j, Context context, d dVar, int i, TLRPC.Peer peer) {
        this.d = heVar;
        this.f = tLObject;
        this.h = j5Var;
        this.n = uv5Var;
        this.b = j;
        this.e = context;
        this.r = dVar;
        this.c = i;
        this.s = peer;
    }

    public dt0(w45 w45Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, y25 y25Var, String str, byte[] bArr, lf2 lf2Var, long j, int i) {
        this.d = w45Var;
        this.e = tonconnectpending;
        this.f = tonconnectrequest;
        this.h = y25Var;
        this.n = str;
        this.r = bArr;
        this.s = lf2Var;
        this.b = j;
        this.c = i;
    }
}
