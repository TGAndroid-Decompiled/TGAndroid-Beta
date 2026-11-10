package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class m10 {
    public final int f23973a;
    public boolean f23975c;
    public boolean d;
    public boolean f23976e;
    public boolean f23978g;
    public final ArrayList f23974b = new ArrayList();
    public final g10 f23977f = new g10(this, 0);

    public m10(int i7) {
        this.f23973a = i7;
        if (!this.f23975c && !this.d) {
            this.d = true;
            yr.a0(i7).f26723a.c(new g10(this, 1));
        }
    }

    public final void a() {
        this.f23974b.clear();
        d();
        qs.f(this.f23973a).k(qs.f24991d3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f23974b;
            if (i7 >= arrayList.size()) {
                break;
            }
            l10 l10Var = (l10) arrayList.get(i7);
            if (l10Var != null && !l10Var.f23831a && l10Var.f23832b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new l10(this, tL_updateNewAuthorization));
        }
        qs.f(this.f23973a).k(qs.f24991d3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f23974b;
            if (i7 < arrayList.size()) {
                l10 l10Var = (l10) arrayList.get(i7);
                if (l10Var != null && l10Var.f23831a && l10Var.f23833c == tL_updateNewBotConnection.bot_id) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            } else {
                arrayList.add(new l10(this, tL_updateNewBotConnection));
                qs.f(this.f23973a).k(qs.f24991d3, new Object[0]);
                e();
                d();
                return;
            }
        }
    }

    public final void d() {
        if (this.f23978g) {
            return;
        }
        if (this.d) {
            this.f23976e = true;
            return;
        }
        this.f23978g = true;
        yr.a0(this.f23973a).f26723a.c(new g10(this, 2));
    }

    public final void e() {
        l10 l10Var;
        g10 g10Var = this.f23977f;
        g0.r(g10Var);
        ArrayList arrayList = this.f23974b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i7 = 0;
            long j3 = Long.MAX_VALUE;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                m10 m10Var = ((l10) obj).f23836i;
                j3 = Math.min(j3, (ConnectionsManager.getInstance(m10Var.f23973a).getCurrentTime() + qp.s1(m10Var.f23973a).f24852n4) - l10Var.d);
            }
            if (j3 == Long.MAX_VALUE) {
                return;
            }
            g0.i3(g10Var, Math.max(0L, j3 * 1000));
        }
    }

    public final void f(final boolean z9, ArrayList arrayList, c20 c20Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        c20[] c20VarArr = new c20[arrayList2.size()];
        for (final int i7 = 0; i7 < arrayList2.size(); i7++) {
            final l10 l10Var = (l10) arrayList2.get(i7);
            c20VarArr[i7] = new c20() {
                @Override
                public final void a(Object obj) {
                    final i10 i10Var = new i10(i7, (Runnable) obj, zArr);
                    boolean z10 = z9;
                    final l10 l10Var2 = l10Var;
                    if (z10) {
                        m10 m10Var = l10Var2.f23836i;
                        if (l10Var2.f23831a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = qp.s1(m10Var.f23973a).o1(l10Var2.f23833c);
                            ConnectionsManager.getInstance(m10Var.f23973a).sendRequestTyped(confirmbotconnection, new x3(7, l10Var2, i10Var));
                            return;
                        }
                        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                        changeauthorizationsettings.hash = l10Var2.f23832b;
                        changeauthorizationsettings.confirmed = true;
                        ConnectionsManager.getInstance(m10Var.f23973a).sendRequest(changeauthorizationsettings, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        l10 l10Var3 = l10Var2;
                                        l10Var3.getClass();
                                        g0.h3(new k10(l10Var3, tLObject, i10Var, tL_error));
                                        return;
                                    case 1:
                                        l10 l10Var4 = l10Var2;
                                        l10Var4.getClass();
                                        g0.h3(new k10(l10Var4, i10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        l10 l10Var5 = l10Var2;
                                        l10Var5.getClass();
                                        g0.h3(new k10(l10Var5, i10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    m10 m10Var2 = l10Var2.f23836i;
                    if (l10Var2.f23831a) {
                        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                        updateconnectedbot.deleted = true;
                        updateconnectedbot.bot = qp.s1(m10Var2.f23973a).o1(l10Var2.f23833c);
                        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                        ConnectionsManager.getInstance(m10Var2.f23973a).sendRequest(updateconnectedbot, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        l10 l10Var3 = l10Var2;
                                        l10Var3.getClass();
                                        g0.h3(new k10(l10Var3, tLObject, i10Var, tL_error));
                                        return;
                                    case 1:
                                        l10 l10Var4 = l10Var2;
                                        l10Var4.getClass();
                                        g0.h3(new k10(l10Var4, i10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        l10 l10Var5 = l10Var2;
                                        l10Var5.getClass();
                                        g0.h3(new k10(l10Var5, i10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                    resetauthorization.hash = l10Var2.f23832b;
                    ConnectionsManager.getInstance(m10Var2.f23973a).sendRequest(resetauthorization, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    l10 l10Var3 = l10Var2;
                                    l10Var3.getClass();
                                    g0.h3(new k10(l10Var3, tLObject, i10Var, tL_error));
                                    return;
                                case 1:
                                    l10 l10Var4 = l10Var2;
                                    l10Var4.getClass();
                                    g0.h3(new k10(l10Var4, i10Var, tLObject, tL_error, 2));
                                    return;
                                default:
                                    l10 l10Var5 = l10Var2;
                                    l10Var5.getClass();
                                    g0.h3(new k10(l10Var5, i10Var, tLObject, tL_error, 0));
                                    return;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new ln(this, zArr, arrayList2, c20Var, z9, 6), c20VarArr);
        if (z9) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                hashSet.add(Long.valueOf(((l10) arrayList2.get(i10)).f23832b));
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList3 = this.f23974b;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((l10) arrayList3.get(i11)).f23832b))) {
                    arrayList3.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (!hashSet.isEmpty()) {
                d();
                qs.f(this.f23973a).k(qs.f24991d3, new Object[0]);
                e();
            }
        }
    }
}
