package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class c35 {
    public static final long[] o = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final String c;
    public final y15 d;
    public final y15 e;
    public boolean f;
    public int g;
    public int h;
    public int j;
    public int i = -1;
    public int k = -1;
    public final a35 l = new Runnable(this) {
        public final c35 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            final c35 c35Var = this.b;
            switch (b) {
                case 0:
                    int i = c35Var.a;
                    if (c35Var.f) {
                        StringBuilder l = hg9.l(i, "[gram-wallet-polling] account=", " msg_hash=");
                        l.append(c35Var.b);
                        l.append(" no answer in 45000 ms");
                        fc4.b(l.toString());
                        c35Var.g++;
                        if (c35Var.i >= 0) {
                            ConnectionsManager.getInstance(i).cancelRequest(c35Var.i, true);
                            c35Var.i = -1;
                        }
                        c35Var.b();
                        return;
                    }
                    return;
                case 1:
                    int i2 = c35Var.a;
                    if (c35Var.f && c35Var.k < 0) {
                        final int i3 = c35Var.j + 1;
                        c35Var.j = i3;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(c35Var.b) + "&include_actions=false";
                        c35Var.k = ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new kc((byte) 0), new jac() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i4 = i3;
                                c35 c35Var2 = c35Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c35Var2.f && c35Var2.g == i4) {
                                            c35Var2.i = -1;
                                            gm.r(c35Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c35Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c35Var2.b);
                                            sb.append(" transactions=");
                                            if (wallettransactions == null) {
                                                valueOf = "none";
                                            } else {
                                                valueOf = Integer.valueOf(wallettransactions.transactions.size());
                                            }
                                            sb.append(valueOf);
                                            sb.append(" errorCode=");
                                            if (tL_error != null) {
                                                obj3 = Integer.valueOf(tL_error.code);
                                            }
                                            sb.append(obj3);
                                            fc4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                y15 y15Var = c35Var2.d;
                                                c cVar = y15Var.a;
                                                TL_wallet.walletTransaction wallettransaction = y15Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    oc7.r1(i5).d4(wallettransactions.users, false);
                                                    oc7.r1(i5).X3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c35Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c35Var2.f && c35Var2.g == i4) {
                                                c35Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c35Var2.b;
                                        if (c35Var2.f && c35Var2.j == i4) {
                                            c35Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fc4.b(p.toString());
                                            }
                                            if (z) {
                                                c35Var2.c();
                                                return;
                                            }
                                            a35 a35Var = c35Var2.m;
                                            if (c35Var2.f) {
                                                gm.r(a35Var);
                                                gm.d3(a35Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, oc7.r1(i2).r3, 0);
                        return;
                    }
                    return;
                default:
                    if (c35Var.f) {
                        final int i4 = c35Var.g + 1;
                        c35Var.g = i4;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(c35Var.b);
                        gm.d3(c35Var.l, 45000L);
                        c35Var.i = ConnectionsManager.getInstance(c35Var.a).sendRequestTyped(gettransactionsbymsghash, new kc((byte) 0), new jac() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i42 = i4;
                                c35 c35Var2 = c35Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c35Var2.f && c35Var2.g == i42) {
                                            c35Var2.i = -1;
                                            gm.r(c35Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c35Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c35Var2.b);
                                            sb.append(" transactions=");
                                            if (wallettransactions == null) {
                                                valueOf = "none";
                                            } else {
                                                valueOf = Integer.valueOf(wallettransactions.transactions.size());
                                            }
                                            sb.append(valueOf);
                                            sb.append(" errorCode=");
                                            if (tL_error != null) {
                                                obj3 = Integer.valueOf(tL_error.code);
                                            }
                                            sb.append(obj3);
                                            fc4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                y15 y15Var = c35Var2.d;
                                                c cVar = y15Var.a;
                                                TL_wallet.walletTransaction wallettransaction = y15Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    oc7.r1(i5).d4(wallettransactions.users, false);
                                                    oc7.r1(i5).X3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c35Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c35Var2.f && c35Var2.g == i42) {
                                                c35Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c35Var2.b;
                                        if (c35Var2.f && c35Var2.j == i42) {
                                            c35Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fc4.b(p.toString());
                                            }
                                            if (z) {
                                                c35Var2.c();
                                                return;
                                            }
                                            a35 a35Var = c35Var2.m;
                                            if (c35Var2.f) {
                                                gm.r(a35Var);
                                                gm.d3(a35Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
            }
        }
    };
    public final a35 m = new Runnable(this) {
        public final c35 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            final c35 c35Var = this.b;
            switch (b) {
                case 0:
                    int i = c35Var.a;
                    if (c35Var.f) {
                        StringBuilder l = hg9.l(i, "[gram-wallet-polling] account=", " msg_hash=");
                        l.append(c35Var.b);
                        l.append(" no answer in 45000 ms");
                        fc4.b(l.toString());
                        c35Var.g++;
                        if (c35Var.i >= 0) {
                            ConnectionsManager.getInstance(i).cancelRequest(c35Var.i, true);
                            c35Var.i = -1;
                        }
                        c35Var.b();
                        return;
                    }
                    return;
                case 1:
                    int i2 = c35Var.a;
                    if (c35Var.f && c35Var.k < 0) {
                        final int i3 = c35Var.j + 1;
                        c35Var.j = i3;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(c35Var.b) + "&include_actions=false";
                        c35Var.k = ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new kc((byte) 0), new jac() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i42 = i3;
                                c35 c35Var2 = c35Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c35Var2.f && c35Var2.g == i42) {
                                            c35Var2.i = -1;
                                            gm.r(c35Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c35Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c35Var2.b);
                                            sb.append(" transactions=");
                                            if (wallettransactions == null) {
                                                valueOf = "none";
                                            } else {
                                                valueOf = Integer.valueOf(wallettransactions.transactions.size());
                                            }
                                            sb.append(valueOf);
                                            sb.append(" errorCode=");
                                            if (tL_error != null) {
                                                obj3 = Integer.valueOf(tL_error.code);
                                            }
                                            sb.append(obj3);
                                            fc4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                y15 y15Var = c35Var2.d;
                                                c cVar = y15Var.a;
                                                TL_wallet.walletTransaction wallettransaction = y15Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    oc7.r1(i5).d4(wallettransactions.users, false);
                                                    oc7.r1(i5).X3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c35Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c35Var2.f && c35Var2.g == i42) {
                                                c35Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c35Var2.b;
                                        if (c35Var2.f && c35Var2.j == i42) {
                                            c35Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fc4.b(p.toString());
                                            }
                                            if (z) {
                                                c35Var2.c();
                                                return;
                                            }
                                            a35 a35Var = c35Var2.m;
                                            if (c35Var2.f) {
                                                gm.r(a35Var);
                                                gm.d3(a35Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, oc7.r1(i2).r3, 0);
                        return;
                    }
                    return;
                default:
                    if (c35Var.f) {
                        final int i4 = c35Var.g + 1;
                        c35Var.g = i4;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(c35Var.b);
                        gm.d3(c35Var.l, 45000L);
                        c35Var.i = ConnectionsManager.getInstance(c35Var.a).sendRequestTyped(gettransactionsbymsghash, new kc((byte) 0), new jac() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i42 = i4;
                                c35 c35Var2 = c35Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c35Var2.f && c35Var2.g == i42) {
                                            c35Var2.i = -1;
                                            gm.r(c35Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c35Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c35Var2.b);
                                            sb.append(" transactions=");
                                            if (wallettransactions == null) {
                                                valueOf = "none";
                                            } else {
                                                valueOf = Integer.valueOf(wallettransactions.transactions.size());
                                            }
                                            sb.append(valueOf);
                                            sb.append(" errorCode=");
                                            if (tL_error != null) {
                                                obj3 = Integer.valueOf(tL_error.code);
                                            }
                                            sb.append(obj3);
                                            fc4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                y15 y15Var = c35Var2.d;
                                                c cVar = y15Var.a;
                                                TL_wallet.walletTransaction wallettransaction = y15Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    oc7.r1(i5).d4(wallettransactions.users, false);
                                                    oc7.r1(i5).X3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c35Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c35Var2.f && c35Var2.g == i42) {
                                                c35Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c35Var2.b;
                                        if (c35Var2.f && c35Var2.j == i42) {
                                            c35Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fc4.b(p.toString());
                                            }
                                            if (z) {
                                                c35Var2.c();
                                                return;
                                            }
                                            a35 a35Var = c35Var2.m;
                                            if (c35Var2.f) {
                                                gm.r(a35Var);
                                                gm.d3(a35Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
            }
        }
    };
    public final a35 n = new Runnable(this) {
        public final c35 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            final c35 c35Var = this.b;
            switch (b) {
                case 0:
                    int i = c35Var.a;
                    if (c35Var.f) {
                        StringBuilder l = hg9.l(i, "[gram-wallet-polling] account=", " msg_hash=");
                        l.append(c35Var.b);
                        l.append(" no answer in 45000 ms");
                        fc4.b(l.toString());
                        c35Var.g++;
                        if (c35Var.i >= 0) {
                            ConnectionsManager.getInstance(i).cancelRequest(c35Var.i, true);
                            c35Var.i = -1;
                        }
                        c35Var.b();
                        return;
                    }
                    return;
                case 1:
                    int i2 = c35Var.a;
                    if (c35Var.f && c35Var.k < 0) {
                        final int i3 = c35Var.j + 1;
                        c35Var.j = i3;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(c35Var.b) + "&include_actions=false";
                        c35Var.k = ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new kc((byte) 0), new jac() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i42 = i3;
                                c35 c35Var2 = c35Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c35Var2.f && c35Var2.g == i42) {
                                            c35Var2.i = -1;
                                            gm.r(c35Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c35Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c35Var2.b);
                                            sb.append(" transactions=");
                                            if (wallettransactions == null) {
                                                valueOf = "none";
                                            } else {
                                                valueOf = Integer.valueOf(wallettransactions.transactions.size());
                                            }
                                            sb.append(valueOf);
                                            sb.append(" errorCode=");
                                            if (tL_error != null) {
                                                obj3 = Integer.valueOf(tL_error.code);
                                            }
                                            sb.append(obj3);
                                            fc4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                y15 y15Var = c35Var2.d;
                                                c cVar = y15Var.a;
                                                TL_wallet.walletTransaction wallettransaction = y15Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    oc7.r1(i5).d4(wallettransactions.users, false);
                                                    oc7.r1(i5).X3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c35Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c35Var2.f && c35Var2.g == i42) {
                                                c35Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c35Var2.b;
                                        if (c35Var2.f && c35Var2.j == i42) {
                                            c35Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fc4.b(p.toString());
                                            }
                                            if (z) {
                                                c35Var2.c();
                                                return;
                                            }
                                            a35 a35Var = c35Var2.m;
                                            if (c35Var2.f) {
                                                gm.r(a35Var);
                                                gm.d3(a35Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, oc7.r1(i2).r3, 0);
                        return;
                    }
                    return;
                default:
                    if (c35Var.f) {
                        final int i4 = c35Var.g + 1;
                        c35Var.g = i4;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(c35Var.b);
                        gm.d3(c35Var.l, 45000L);
                        c35Var.i = ConnectionsManager.getInstance(c35Var.a).sendRequestTyped(gettransactionsbymsghash, new kc((byte) 0), new jac() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i42 = i4;
                                c35 c35Var2 = c35Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c35Var2.f && c35Var2.g == i42) {
                                            c35Var2.i = -1;
                                            gm.r(c35Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c35Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c35Var2.b);
                                            sb.append(" transactions=");
                                            if (wallettransactions == null) {
                                                valueOf = "none";
                                            } else {
                                                valueOf = Integer.valueOf(wallettransactions.transactions.size());
                                            }
                                            sb.append(valueOf);
                                            sb.append(" errorCode=");
                                            if (tL_error != null) {
                                                obj3 = Integer.valueOf(tL_error.code);
                                            }
                                            sb.append(obj3);
                                            fc4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                y15 y15Var = c35Var2.d;
                                                c cVar = y15Var.a;
                                                TL_wallet.walletTransaction wallettransaction = y15Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    oc7.r1(i5).d4(wallettransactions.users, false);
                                                    oc7.r1(i5).X3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c35Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c35Var2.f && c35Var2.g == i42) {
                                                c35Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c35Var2.b;
                                        if (c35Var2.f && c35Var2.j == i42) {
                                            c35Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fc4.b(p.toString());
                                            }
                                            if (z) {
                                                c35Var2.c();
                                                return;
                                            }
                                            a35 a35Var = c35Var2.m;
                                            if (c35Var2.f) {
                                                gm.r(a35Var);
                                                gm.d3(a35Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
            }
        }
    };

    public c35(int i, String str, String str2, y15 y15Var, y15 y15Var2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = y15Var;
        this.e = y15Var2;
    }

    public final boolean a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString;
        boolean z;
        JSONObject jSONObject2;
        JSONObject optJSONObject2;
        boolean z2;
        String optString2;
        t25 t25Var;
        JSONArray optJSONArray = jSONObject.optJSONArray("traces");
        JSONObject jSONObject3 = null;
        if (optJSONArray == null) {
            optJSONObject = null;
        } else {
            optJSONObject = optJSONArray.optJSONObject(0);
        }
        String str = this.b;
        if (optJSONObject == null) {
            fc4.b("[gram-wallet-polling] chain: msg_hash=" + str + " not on chain yet");
            return false;
        }
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("trace_info");
        if (optJSONObject3 == null) {
            optString = "";
        } else {
            optString = optJSONObject3.optString("trace_state");
        }
        if (!optJSONObject.optBoolean("is_incomplete", true) && "complete".equals(optString) && (optJSONObject3 == null || optJSONObject3.optInt("pending_messages", 0) == 0)) {
            z = true;
        } else {
            z = false;
        }
        JSONObject optJSONObject4 = optJSONObject.optJSONObject("transactions");
        JSONArray optJSONArray2 = optJSONObject.optJSONArray("transactions_order");
        if (optJSONObject4 != null && optJSONArray2 != null) {
            jSONObject2 = null;
            for (int i = 0; i < optJSONArray2.length() && jSONObject2 == null; i++) {
                JSONObject optJSONObject5 = optJSONObject4.optJSONObject(optJSONArray2.optString(i));
                if (optJSONObject5 != null && c.b(optJSONObject5.optString("account"), this.c)) {
                    jSONObject2 = optJSONObject5;
                }
            }
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str, " trace=");
            p.append(optJSONObject.optString("trace_id"));
            p.append(" state=");
            p.append(optString);
            hg9.r(", no transaction of the wallet yet", p);
            return false;
        }
        JSONObject optJSONObject6 = jSONObject2.optJSONObject("description");
        if (optJSONObject6 == null) {
            optJSONObject2 = null;
        } else {
            optJSONObject2 = optJSONObject6.optJSONObject("compute_ph");
            jSONObject3 = optJSONObject6.optJSONObject("action");
        }
        if (optJSONObject6 != null && !optJSONObject6.optBoolean("aborted", false) && ((optJSONObject2 == null || optJSONObject2.optBoolean("success", true)) && (jSONObject3 == null || jSONObject3.optBoolean("success", true)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        JSONObject optJSONObject7 = jSONObject2.optJSONObject("in_msg");
        String optString3 = jSONObject2.optString("hash");
        String str2 = jSONObject2.optString("lt") + ":" + optString3;
        StringBuilder p2 = wi8.p("[gram-wallet-polling] chain: expected msg_hash=", str, ", trace=");
        p2.append(optJSONObject.optString("trace_id"));
        p2.append(" (external ");
        p2.append(optJSONObject.optString("external_hash"));
        p2.append(") state=");
        p2.append(optString);
        p2.append(" complete=");
        p2.append(z);
        wi8.z(", wallet tx id=", str2, " in_msg=", p2);
        if (optJSONObject7 == null) {
            optString2 = "none";
        } else {
            optString2 = optJSONObject7.optString("hash");
        }
        p2.append(optString2);
        p2.append(" success=");
        p2.append(z2);
        fc4.b(p2.toString());
        if (!z || TextUtils.isEmpty(optString3)) {
            return false;
        }
        y15 y15Var = this.e;
        c cVar = y15Var.a;
        TL_wallet.walletTransaction wallettransaction = y15Var.b;
        if (!wallettransaction.pending) {
            return true;
        }
        StringBuilder sb = new StringBuilder("send completed by the chain: msg_hash=");
        kt6.v(sb, wallettransaction.messageHash, ", id=", str2, ", success=");
        sb.append(z2);
        c.O(sb.toString());
        wallettransaction.id = str2;
        cVar.g(wallettransaction, z2, optString3);
        if (wallettransaction.nft != null && (t25Var = cVar.o) != null) {
            t25Var.h(wallettransaction);
            cVar.o.d();
        }
        cVar.J();
        return true;
    }

    public final void b() {
        if (!this.f) {
            return;
        }
        int i = this.h;
        long j = o[i];
        if (i < 4) {
            this.h = i + 1;
        }
        gm.d3(this.n, j);
    }

    public final void c() {
        this.f = false;
        this.g++;
        this.j++;
        gm.r(this.n);
        gm.r(this.l);
        gm.r(this.m);
        int i = this.i;
        int i2 = this.a;
        if (i >= 0) {
            ConnectionsManager.getInstance(i2).cancelRequest(this.i, true);
            this.i = -1;
        }
        if (this.k >= 0) {
            ConnectionsManager.getInstance(i2).cancelRequest(this.k, true);
            this.k = -1;
        }
    }
}
