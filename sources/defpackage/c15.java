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
public final class c15 {
    public static final long[] o = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final String c;
    public final yz4 d;
    public final yz4 e;
    public boolean f;
    public int g;
    public int h;
    public int j;
    public int i = -1;
    public int k = -1;
    public final a15 l = new Runnable(this) {
        public final c15 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            final c15 c15Var = this.b;
            switch (b) {
                case 0:
                    int i = c15Var.a;
                    if (c15Var.f) {
                        StringBuilder m = de9.m(i, "[gram-wallet-polling] account=", " msg_hash=");
                        m.append(c15Var.b);
                        m.append(" no answer in 45000 ms");
                        fa4.b(m.toString());
                        c15Var.g++;
                        if (c15Var.i >= 0) {
                            ConnectionsManager.getInstance(i).cancelRequest(c15Var.i, true);
                            c15Var.i = -1;
                        }
                        c15Var.b();
                        return;
                    }
                    return;
                case 1:
                    int i2 = c15Var.a;
                    if (c15Var.f && c15Var.k < 0) {
                        final int i3 = c15Var.j + 1;
                        c15Var.j = i3;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(c15Var.b) + "&include_actions=false";
                        c15Var.k = ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new hc((byte) 0), new i8c() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i4 = i3;
                                c15 c15Var2 = c15Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c15Var2.f && c15Var2.g == i4) {
                                            c15Var2.i = -1;
                                            gl.r(c15Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c15Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c15Var2.b);
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
                                            fa4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                yz4 yz4Var = c15Var2.d;
                                                c cVar = yz4Var.a;
                                                TL_wallet.walletTransaction wallettransaction = yz4Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    na7.q1(i5).a4(wallettransactions.users, false);
                                                    na7.q1(i5).U3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c15Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c15Var2.f && c15Var2.g == i4) {
                                                c15Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c15Var2.b;
                                        if (c15Var2.f && c15Var2.j == i4) {
                                            c15Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c15Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fa4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = ug8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fa4.b(p.toString());
                                            }
                                            if (z) {
                                                c15Var2.c();
                                                return;
                                            }
                                            a15 a15Var = c15Var2.m;
                                            if (c15Var2.f) {
                                                gl.r(a15Var);
                                                gl.e3(a15Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, na7.q1(i2).r3, 0);
                        return;
                    }
                    return;
                default:
                    if (c15Var.f) {
                        final int i4 = c15Var.g + 1;
                        c15Var.g = i4;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(c15Var.b);
                        gl.e3(c15Var.l, 45000L);
                        c15Var.i = ConnectionsManager.getInstance(c15Var.a).sendRequestTyped(gettransactionsbymsghash, new hc((byte) 0), new i8c() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i42 = i4;
                                c15 c15Var2 = c15Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c15Var2.f && c15Var2.g == i42) {
                                            c15Var2.i = -1;
                                            gl.r(c15Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c15Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c15Var2.b);
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
                                            fa4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                yz4 yz4Var = c15Var2.d;
                                                c cVar = yz4Var.a;
                                                TL_wallet.walletTransaction wallettransaction = yz4Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    na7.q1(i5).a4(wallettransactions.users, false);
                                                    na7.q1(i5).U3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c15Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c15Var2.f && c15Var2.g == i42) {
                                                c15Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c15Var2.b;
                                        if (c15Var2.f && c15Var2.j == i42) {
                                            c15Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c15Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fa4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = ug8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fa4.b(p.toString());
                                            }
                                            if (z) {
                                                c15Var2.c();
                                                return;
                                            }
                                            a15 a15Var = c15Var2.m;
                                            if (c15Var2.f) {
                                                gl.r(a15Var);
                                                gl.e3(a15Var, 10000L);
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
    public final a15 m = new Runnable(this) {
        public final c15 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            final c15 c15Var = this.b;
            switch (b) {
                case 0:
                    int i = c15Var.a;
                    if (c15Var.f) {
                        StringBuilder m = de9.m(i, "[gram-wallet-polling] account=", " msg_hash=");
                        m.append(c15Var.b);
                        m.append(" no answer in 45000 ms");
                        fa4.b(m.toString());
                        c15Var.g++;
                        if (c15Var.i >= 0) {
                            ConnectionsManager.getInstance(i).cancelRequest(c15Var.i, true);
                            c15Var.i = -1;
                        }
                        c15Var.b();
                        return;
                    }
                    return;
                case 1:
                    int i2 = c15Var.a;
                    if (c15Var.f && c15Var.k < 0) {
                        final int i3 = c15Var.j + 1;
                        c15Var.j = i3;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(c15Var.b) + "&include_actions=false";
                        c15Var.k = ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new hc((byte) 0), new i8c() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i42 = i3;
                                c15 c15Var2 = c15Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c15Var2.f && c15Var2.g == i42) {
                                            c15Var2.i = -1;
                                            gl.r(c15Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c15Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c15Var2.b);
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
                                            fa4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                yz4 yz4Var = c15Var2.d;
                                                c cVar = yz4Var.a;
                                                TL_wallet.walletTransaction wallettransaction = yz4Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    na7.q1(i5).a4(wallettransactions.users, false);
                                                    na7.q1(i5).U3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c15Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c15Var2.f && c15Var2.g == i42) {
                                                c15Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c15Var2.b;
                                        if (c15Var2.f && c15Var2.j == i42) {
                                            c15Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c15Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fa4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = ug8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fa4.b(p.toString());
                                            }
                                            if (z) {
                                                c15Var2.c();
                                                return;
                                            }
                                            a15 a15Var = c15Var2.m;
                                            if (c15Var2.f) {
                                                gl.r(a15Var);
                                                gl.e3(a15Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, na7.q1(i2).r3, 0);
                        return;
                    }
                    return;
                default:
                    if (c15Var.f) {
                        final int i4 = c15Var.g + 1;
                        c15Var.g = i4;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(c15Var.b);
                        gl.e3(c15Var.l, 45000L);
                        c15Var.i = ConnectionsManager.getInstance(c15Var.a).sendRequestTyped(gettransactionsbymsghash, new hc((byte) 0), new i8c() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i42 = i4;
                                c15 c15Var2 = c15Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c15Var2.f && c15Var2.g == i42) {
                                            c15Var2.i = -1;
                                            gl.r(c15Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c15Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c15Var2.b);
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
                                            fa4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                yz4 yz4Var = c15Var2.d;
                                                c cVar = yz4Var.a;
                                                TL_wallet.walletTransaction wallettransaction = yz4Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    na7.q1(i5).a4(wallettransactions.users, false);
                                                    na7.q1(i5).U3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c15Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c15Var2.f && c15Var2.g == i42) {
                                                c15Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c15Var2.b;
                                        if (c15Var2.f && c15Var2.j == i42) {
                                            c15Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c15Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fa4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = ug8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fa4.b(p.toString());
                                            }
                                            if (z) {
                                                c15Var2.c();
                                                return;
                                            }
                                            a15 a15Var = c15Var2.m;
                                            if (c15Var2.f) {
                                                gl.r(a15Var);
                                                gl.e3(a15Var, 10000L);
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
    public final a15 n = new Runnable(this) {
        public final c15 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            final c15 c15Var = this.b;
            switch (b) {
                case 0:
                    int i = c15Var.a;
                    if (c15Var.f) {
                        StringBuilder m = de9.m(i, "[gram-wallet-polling] account=", " msg_hash=");
                        m.append(c15Var.b);
                        m.append(" no answer in 45000 ms");
                        fa4.b(m.toString());
                        c15Var.g++;
                        if (c15Var.i >= 0) {
                            ConnectionsManager.getInstance(i).cancelRequest(c15Var.i, true);
                            c15Var.i = -1;
                        }
                        c15Var.b();
                        return;
                    }
                    return;
                case 1:
                    int i2 = c15Var.a;
                    if (c15Var.f && c15Var.k < 0) {
                        final int i3 = c15Var.j + 1;
                        c15Var.j = i3;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/traces";
                        performapirequest.query = "msg_hash=" + Uri.encode(c15Var.b) + "&include_actions=false";
                        c15Var.k = ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new hc((byte) 0), new i8c() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i42 = i3;
                                c15 c15Var2 = c15Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c15Var2.f && c15Var2.g == i42) {
                                            c15Var2.i = -1;
                                            gl.r(c15Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c15Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c15Var2.b);
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
                                            fa4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                yz4 yz4Var = c15Var2.d;
                                                c cVar = yz4Var.a;
                                                TL_wallet.walletTransaction wallettransaction = yz4Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    na7.q1(i5).a4(wallettransactions.users, false);
                                                    na7.q1(i5).U3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c15Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c15Var2.f && c15Var2.g == i42) {
                                                c15Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c15Var2.b;
                                        if (c15Var2.f && c15Var2.j == i42) {
                                            c15Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c15Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fa4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = ug8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fa4.b(p.toString());
                                            }
                                            if (z) {
                                                c15Var2.c();
                                                return;
                                            }
                                            a15 a15Var = c15Var2.m;
                                            if (c15Var2.f) {
                                                gl.r(a15Var);
                                                gl.e3(a15Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, na7.q1(i2).r3, 0);
                        return;
                    }
                    return;
                default:
                    if (c15Var.f) {
                        final int i4 = c15Var.g + 1;
                        c15Var.g = i4;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(c15Var.b);
                        gl.e3(c15Var.l, 45000L);
                        c15Var.i = ConnectionsManager.getInstance(c15Var.a).sendRequestTyped(gettransactionsbymsghash, new hc((byte) 0), new i8c() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                Integer valueOf;
                                byte b2 = r3;
                                Object obj3 = "none";
                                boolean z = false;
                                int i42 = i4;
                                c15 c15Var2 = c15Var;
                                switch (b2) {
                                    case 0:
                                        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (c15Var2.f && c15Var2.g == i42) {
                                            c15Var2.i = -1;
                                            gl.r(c15Var2.l);
                                            StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                            sb.append(c15Var2.a);
                                            sb.append(" msg_hash=");
                                            sb.append(c15Var2.b);
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
                                            fa4.b(sb.toString());
                                            if (tL_error == null && wallettransactions != null) {
                                                yz4 yz4Var = c15Var2.d;
                                                c cVar = yz4Var.a;
                                                TL_wallet.walletTransaction wallettransaction = yz4Var.b;
                                                int i5 = cVar.a;
                                                c.o(wallettransactions.transactions);
                                                Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                if (it.hasNext()) {
                                                    na7.q1(i5).a4(wallettransactions.users, false);
                                                    na7.q1(i5).U3(wallettransactions.chats, false);
                                                    cVar.c(wallettransaction, it.next());
                                                    cVar.J();
                                                    c15Var2.c();
                                                    return;
                                                }
                                            }
                                            if (c15Var2.f && c15Var2.g == i42) {
                                                c15Var2.b();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        String str = c15Var2.b;
                                        if (c15Var2.f && c15Var2.j == i42) {
                                            c15Var2.k = -1;
                                            if (apiresponse != null && apiresponse.response != null) {
                                                try {
                                                    z = c15Var2.a(new JSONObject(apiresponse.response.data));
                                                } catch (Exception e) {
                                                    fa4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str, e);
                                                }
                                            } else {
                                                StringBuilder p = ug8.p("[gram-wallet-polling] chain: msg_hash=", str, " errorCode=");
                                                if (tL_error2 != null) {
                                                    obj3 = Integer.valueOf(tL_error2.code);
                                                }
                                                p.append(obj3);
                                                fa4.b(p.toString());
                                            }
                                            if (z) {
                                                c15Var2.c();
                                                return;
                                            }
                                            a15 a15Var = c15Var2.m;
                                            if (c15Var2.f) {
                                                gl.r(a15Var);
                                                gl.e3(a15Var, 10000L);
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

    public c15(int i, String str, String str2, yz4 yz4Var, yz4 yz4Var2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = yz4Var;
        this.e = yz4Var2;
    }

    public final boolean a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString;
        boolean z;
        JSONObject jSONObject2;
        JSONObject optJSONObject2;
        boolean z2;
        String optString2;
        t05 t05Var;
        JSONArray optJSONArray = jSONObject.optJSONArray("traces");
        JSONObject jSONObject3 = null;
        if (optJSONArray == null) {
            optJSONObject = null;
        } else {
            optJSONObject = optJSONArray.optJSONObject(0);
        }
        String str = this.b;
        if (optJSONObject == null) {
            fa4.b("[gram-wallet-polling] chain: msg_hash=" + str + " not on chain yet");
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
            StringBuilder p = ug8.p("[gram-wallet-polling] chain: msg_hash=", str, " trace=");
            p.append(optJSONObject.optString("trace_id"));
            p.append(" state=");
            p.append(optString);
            de9.s(", no transaction of the wallet yet", p);
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
        StringBuilder p2 = ug8.p("[gram-wallet-polling] chain: expected msg_hash=", str, ", trace=");
        p2.append(optJSONObject.optString("trace_id"));
        p2.append(" (external ");
        p2.append(optJSONObject.optString("external_hash"));
        p2.append(") state=");
        p2.append(optString);
        p2.append(" complete=");
        p2.append(z);
        ug8.z(", wallet tx id=", str2, " in_msg=", p2);
        if (optJSONObject7 == null) {
            optString2 = "none";
        } else {
            optString2 = optJSONObject7.optString("hash");
        }
        p2.append(optString2);
        p2.append(" success=");
        p2.append(z2);
        fa4.b(p2.toString());
        if (!z || TextUtils.isEmpty(optString3)) {
            return false;
        }
        yz4 yz4Var = this.e;
        c cVar = yz4Var.a;
        TL_wallet.walletTransaction wallettransaction = yz4Var.b;
        if (!wallettransaction.pending) {
            return true;
        }
        StringBuilder sb = new StringBuilder("send completed by the chain: msg_hash=");
        ls6.u(sb, wallettransaction.messageHash, ", id=", str2, ", success=");
        sb.append(z2);
        c.O(sb.toString());
        wallettransaction.id = str2;
        cVar.g(wallettransaction, z2, optString3);
        if (wallettransaction.nft != null && (t05Var = cVar.o) != null) {
            t05Var.h(wallettransaction);
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
        gl.e3(this.n, j);
    }

    public final void c() {
        this.f = false;
        this.g++;
        this.j++;
        gl.r(this.n);
        gl.r(this.l);
        gl.r(this.m);
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
