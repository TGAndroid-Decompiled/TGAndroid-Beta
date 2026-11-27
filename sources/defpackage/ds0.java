package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
public final class ds0 implements Runnable {
    public final byte a = 1;
    public final long b;
    public final int c;
    public final Object d;
    public final Object e;
    public final TLObject f;
    public final Object h;
    public final Object n;
    public final Object r;
    public final Object s;

    public ds0(id idVar, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, vnb vnbVar, bu0 bu0Var, p pVar) {
        this.d = idVar;
        this.e = context;
        this.c = i;
        this.b = j;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = vnbVar;
        this.r = bu0Var;
        this.s = pVar;
    }

    @Override
    public final void run() {
        String h;
        w45 w45Var;
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
                ((id) obj6).dismiss();
                new ls0((Context) obj3, this.c, this.b, (TLRPC.TL_messages_preparedInlineMessage) tLObject, ((File[]) obj5)[0], null, (vnb) obj4, (bu0) obj2, (p) obj).show();
                return;
            case 1:
                a55 a55Var = (a55) obj6;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj3;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) tLObject;
                c35 c35Var = (c35) obj5;
                String str = (String) obj4;
                byte[] bArr = (byte[]) obj2;
                qe2 qe2Var = (qe2) obj;
                a55Var.getClass();
                try {
                } catch (Exception e) {
                    e = e;
                }
                try {
                    JSONObject f = a55.f(c35Var, tonconnectpending.session, str, bArr, tonconnectrequest.body, a55Var.f.getCurrentTime());
                    c35Var = c35Var;
                    h = null;
                    w45Var = new w45(tonconnectpending, tonconnectrequest, f, str, bArr);
                } catch (Exception e2) {
                    e = e2;
                    c35Var = c35Var;
                    h = a55.h("decode request", e);
                    w45Var = null;
                    hl.c3(new qe(a55Var, w45Var, qe2Var, h, this.b, this.c, c35Var, (byte) 1));
                    return;
                }
                hl.c3(new qe(a55Var, w45Var, qe2Var, h, this.b, this.c, c35Var, (byte) 1));
                return;
            default:
                k5 k5Var = (k5) obj5;
                zv5 zv5Var = (zv5) obj4;
                Context context = (Context) obj3;
                e eVar = (e) obj2;
                TLRPC.Peer peer = (TLRPC.Peer) obj;
                try {
                    ((id) obj6).dismiss();
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        zv5Var.a(uc7.s1(k5Var.a).j1(r47.B1(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    bw5.C1 = joinaspeers.peers;
                    long j = this.b;
                    bw5.E1 = j;
                    bw5.D1 = SystemClock.elapsedRealtime();
                    int i = k5Var.a;
                    bw5.F1 = i;
                    uc7.s1(i).c4(joinaspeers.chats, false);
                    uc7.s1(k5Var.a).j4(joinaspeers.users, false);
                    bw5.G0(context, j, joinaspeers.peers, eVar, this.c, peer, zv5Var);
                    return;
                }
                return;
        }
    }

    public ds0(id idVar, TLObject tLObject, k5 k5Var, zv5 zv5Var, long j, Context context, e eVar, int i, TLRPC.Peer peer) {
        this.d = idVar;
        this.f = tLObject;
        this.h = k5Var;
        this.n = zv5Var;
        this.b = j;
        this.e = context;
        this.r = eVar;
        this.c = i;
        this.s = peer;
    }

    public ds0(a55 a55Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, c35 c35Var, String str, byte[] bArr, qe2 qe2Var, long j, int i) {
        this.d = a55Var;
        this.e = tonconnectpending;
        this.f = tonconnectrequest;
        this.h = c35Var;
        this.n = str;
        this.r = bArr;
        this.s = qe2Var;
        this.b = j;
        this.c = i;
    }
}
