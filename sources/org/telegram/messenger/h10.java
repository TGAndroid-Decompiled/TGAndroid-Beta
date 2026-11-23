package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class h10 {
    public final int f24322a;
    public boolean f24324c;
    public boolean d;
    public boolean f24325e;
    public boolean f24327g;
    public final ArrayList f24323b = new ArrayList();
    public final b10 f24326f = new b10(this, 0);

    public h10(int i7) {
        this.f24322a = i7;
        if (!this.f24324c && !this.d) {
            this.d = true;
            ur.a0(i7).f27214a.c(new b10(this, 1));
        }
    }

    public final void a() {
        this.f24323b.clear();
        d();
        ls.f(this.f24322a).k(ls.f25271f3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f24323b;
            if (i7 >= arrayList.size()) {
                break;
            }
            g10 g10Var = (g10) arrayList.get(i7);
            if (g10Var != null && !g10Var.f24025a && g10Var.f24026b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new g10(this, tL_updateNewAuthorization));
        }
        ls.f(this.f24322a).k(ls.f25271f3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f24323b;
            if (i7 < arrayList.size()) {
                g10 g10Var = (g10) arrayList.get(i7);
                if (g10Var != null && g10Var.f24025a && g10Var.f24027c == tL_updateNewBotConnection.bot_id) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            } else {
                arrayList.add(new g10(this, tL_updateNewBotConnection));
                ls.f(this.f24322a).k(ls.f25271f3, new Object[0]);
                e();
                d();
                return;
            }
        }
    }

    public final void d() {
        if (this.f24327g) {
            return;
        }
        if (this.d) {
            this.f24325e = true;
            return;
        }
        this.f24327g = true;
        ur.a0(this.f24322a).f27214a.c(new b10(this, 2));
    }

    public final void e() {
        g10 g10Var;
        b10 b10Var = this.f24326f;
        g0.r(b10Var);
        ArrayList arrayList = this.f24323b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i7 = 0;
            long j3 = Long.MAX_VALUE;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                h10 h10Var = ((g10) obj).f24030i;
                j3 = Math.min(j3, (ConnectionsManager.getInstance(h10Var.f24322a).getCurrentTime() + np.u1(h10Var.f24322a).f25902q4) - g10Var.d);
            }
            if (j3 == Long.MAX_VALUE) {
                return;
            }
            g0.h3(b10Var, Math.max(0L, j3 * 1000));
        }
    }

    public final void f(final boolean z10, ArrayList arrayList, y10 y10Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        y10[] y10VarArr = new y10[arrayList2.size()];
        for (final int i7 = 0; i7 < arrayList2.size(); i7++) {
            final g10 g10Var = (g10) arrayList2.get(i7);
            y10VarArr[i7] = new y10() {
                @Override
                public final void a(Object obj) {
                    final d10 d10Var = new d10(i7, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final g10 g10Var2 = g10Var;
                    if (z11) {
                        h10 h10Var = g10Var2.f24030i;
                        if (g10Var2.f24025a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = np.u1(h10Var.f24322a).q1(g10Var2.f24027c);
                            ConnectionsManager.getInstance(h10Var.f24322a).sendRequestTyped(confirmbotconnection, new z3(7, g10Var2, d10Var));
                            return;
                        }
                        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                        changeauthorizationsettings.hash = g10Var2.f24026b;
                        changeauthorizationsettings.confirmed = true;
                        ConnectionsManager.getInstance(h10Var.f24322a).sendRequest(changeauthorizationsettings, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        g10 g10Var3 = g10Var2;
                                        g10Var3.getClass();
                                        g0.g3(new f10(g10Var3, tLObject, d10Var, tL_error));
                                        return;
                                    case 1:
                                        g10 g10Var4 = g10Var2;
                                        g10Var4.getClass();
                                        g0.g3(new f10(g10Var4, d10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        g10 g10Var5 = g10Var2;
                                        g10Var5.getClass();
                                        g0.g3(new f10(g10Var5, d10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    h10 h10Var2 = g10Var2.f24030i;
                    if (g10Var2.f24025a) {
                        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                        updateconnectedbot.deleted = true;
                        updateconnectedbot.bot = np.u1(h10Var2.f24322a).q1(g10Var2.f24027c);
                        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                        ConnectionsManager.getInstance(h10Var2.f24322a).sendRequest(updateconnectedbot, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        g10 g10Var3 = g10Var2;
                                        g10Var3.getClass();
                                        g0.g3(new f10(g10Var3, tLObject, d10Var, tL_error));
                                        return;
                                    case 1:
                                        g10 g10Var4 = g10Var2;
                                        g10Var4.getClass();
                                        g0.g3(new f10(g10Var4, d10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        g10 g10Var5 = g10Var2;
                                        g10Var5.getClass();
                                        g0.g3(new f10(g10Var5, d10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                    resetauthorization.hash = g10Var2.f24026b;
                    ConnectionsManager.getInstance(h10Var2.f24322a).sendRequest(resetauthorization, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    g10 g10Var3 = g10Var2;
                                    g10Var3.getClass();
                                    g0.g3(new f10(g10Var3, tLObject, d10Var, tL_error));
                                    return;
                                case 1:
                                    g10 g10Var4 = g10Var2;
                                    g10Var4.getClass();
                                    g0.g3(new f10(g10Var4, d10Var, tLObject, tL_error, 2));
                                    return;
                                default:
                                    g10 g10Var5 = g10Var2;
                                    g10Var5.getClass();
                                    g0.g3(new f10(g10Var5, d10Var, tLObject, tL_error, 0));
                                    return;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new jn(this, zArr, arrayList2, y10Var, z10, 6), y10VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                hashSet.add(Long.valueOf(((g10) arrayList2.get(i10)).f24026b));
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList3 = this.f24323b;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((g10) arrayList3.get(i11)).f24026b))) {
                    arrayList3.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (!hashSet.isEmpty()) {
                d();
                ls.f(this.f24322a).k(ls.f25271f3, new Object[0]);
                e();
            }
        }
    }
}
