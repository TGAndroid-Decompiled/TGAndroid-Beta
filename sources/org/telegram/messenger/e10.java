package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class e10 {
    public final int f22287a;
    public boolean f22289c;
    public boolean d;
    public boolean f22290e;
    public boolean f22292g;
    public final ArrayList f22288b = new ArrayList();
    public final y00 f22291f = new y00(this, 0);

    public e10(int i3) {
        this.f22287a = i3;
        if (!this.f22289c && !this.d) {
            this.d = true;
            qr.a0(i3).f24934a.c(new y00(this, 1));
        }
    }

    public final void a() {
        this.f22288b.clear();
        d();
        hs.f(this.f22287a).k(hs.f23216d3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i3 = 0;
        while (true) {
            arrayList = this.f22288b;
            if (i3 >= arrayList.size()) {
                break;
            }
            d10 d10Var = (d10) arrayList.get(i3);
            if (d10Var != null && !d10Var.f22121a && d10Var.f22122b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new d10(this, tL_updateNewAuthorization));
        }
        hs.f(this.f22287a).k(hs.f23216d3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f22288b;
            if (i3 < arrayList.size()) {
                d10 d10Var = (d10) arrayList.get(i3);
                if (d10Var != null && d10Var.f22121a && d10Var.f22123c == tL_updateNewBotConnection.bot_id) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            } else {
                arrayList.add(new d10(this, tL_updateNewBotConnection));
                hs.f(this.f22287a).k(hs.f23216d3, new Object[0]);
                e();
                d();
                return;
            }
        }
    }

    public final void d() {
        if (this.f22292g) {
            return;
        }
        if (this.d) {
            this.f22290e = true;
            return;
        }
        this.f22292g = true;
        qr.a0(this.f22287a).f24934a.c(new y00(this, 2));
    }

    public final void e() {
        d10 d10Var;
        y00 y00Var = this.f22291f;
        g0.r(y00Var);
        ArrayList arrayList = this.f22288b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            long j10 = Long.MAX_VALUE;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                e10 e10Var = ((d10) obj).f22126i;
                j10 = Math.min(j10, (ConnectionsManager.getInstance(e10Var.f22287a).getCurrentTime() + hp.s1(e10Var.f22287a).n4) - d10Var.d);
            }
            if (j10 == Long.MAX_VALUE) {
                return;
            }
            g0.i3(y00Var, Math.max(0L, j10 * 1000));
        }
    }

    public final void f(final boolean z10, ArrayList arrayList, u10 u10Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        u10[] u10VarArr = new u10[arrayList2.size()];
        for (final int i3 = 0; i3 < arrayList2.size(); i3++) {
            final d10 d10Var = (d10) arrayList2.get(i3);
            u10VarArr[i3] = new u10() {
                @Override
                public final void a(Object obj) {
                    final a10 a10Var = new a10(i3, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final d10 d10Var2 = d10Var;
                    if (z11) {
                        e10 e10Var = d10Var2.f22126i;
                        if (d10Var2.f22121a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = hp.s1(e10Var.f22287a).o1(d10Var2.f22123c);
                            ConnectionsManager.getInstance(e10Var.f22287a).sendRequestTyped(confirmbotconnection, new x3(6, d10Var2, a10Var));
                            return;
                        }
                        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                        changeauthorizationsettings.hash = d10Var2.f22122b;
                        changeauthorizationsettings.confirmed = true;
                        ConnectionsManager.getInstance(e10Var.f22287a).sendRequest(changeauthorizationsettings, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        d10 d10Var3 = d10Var2;
                                        d10Var3.getClass();
                                        g0.h3(new c10(d10Var3, tLObject, a10Var, tL_error));
                                        return;
                                    case 1:
                                        d10 d10Var4 = d10Var2;
                                        d10Var4.getClass();
                                        g0.h3(new c10(d10Var4, a10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        d10 d10Var5 = d10Var2;
                                        d10Var5.getClass();
                                        g0.h3(new c10(d10Var5, a10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    e10 e10Var2 = d10Var2.f22126i;
                    if (d10Var2.f22121a) {
                        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                        updateconnectedbot.deleted = true;
                        updateconnectedbot.bot = hp.s1(e10Var2.f22287a).o1(d10Var2.f22123c);
                        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                        ConnectionsManager.getInstance(e10Var2.f22287a).sendRequest(updateconnectedbot, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        d10 d10Var3 = d10Var2;
                                        d10Var3.getClass();
                                        g0.h3(new c10(d10Var3, tLObject, a10Var, tL_error));
                                        return;
                                    case 1:
                                        d10 d10Var4 = d10Var2;
                                        d10Var4.getClass();
                                        g0.h3(new c10(d10Var4, a10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        d10 d10Var5 = d10Var2;
                                        d10Var5.getClass();
                                        g0.h3(new c10(d10Var5, a10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                    resetauthorization.hash = d10Var2.f22122b;
                    ConnectionsManager.getInstance(e10Var2.f22287a).sendRequest(resetauthorization, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    d10 d10Var3 = d10Var2;
                                    d10Var3.getClass();
                                    g0.h3(new c10(d10Var3, tLObject, a10Var, tL_error));
                                    return;
                                case 1:
                                    d10 d10Var4 = d10Var2;
                                    d10Var4.getClass();
                                    g0.h3(new c10(d10Var4, a10Var, tLObject, tL_error, 2));
                                    return;
                                default:
                                    d10 d10Var5 = d10Var2;
                                    d10Var5.getClass();
                                    g0.h3(new c10(d10Var5, a10Var, tLObject, tL_error, 0));
                                    return;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new bn(this, zArr, arrayList2, u10Var, z10, 6), u10VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                hashSet.add(Long.valueOf(((d10) arrayList2.get(i10)).f22122b));
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList3 = this.f22288b;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((d10) arrayList3.get(i11)).f22122b))) {
                    arrayList3.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (!hashSet.isEmpty()) {
                d();
                hs.f(this.f22287a).k(hs.f23216d3, new Object[0]);
                e();
            }
        }
    }
}
