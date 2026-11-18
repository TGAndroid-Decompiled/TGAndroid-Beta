package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class g10 {
    public final int f24135a;
    public boolean f24137c;
    public boolean d;
    public boolean f24138e;
    public boolean f24140g;
    public final ArrayList f24136b = new ArrayList();
    public final a10 f24139f = new a10(this, 0);

    public g10(int i7) {
        this.f24135a = i7;
        if (!this.f24137c && !this.d) {
            this.d = true;
            tr.a0(i7).f27052a.c(new a10(this, 1));
        }
    }

    public final void a() {
        this.f24136b.clear();
        d();
        ks.f(this.f24135a).k(ks.f25113f3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f24136b;
            if (i7 >= arrayList.size()) {
                break;
            }
            f10 f10Var = (f10) arrayList.get(i7);
            if (f10Var != null && !f10Var.f23815a && f10Var.f23816b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new f10(this, tL_updateNewAuthorization));
        }
        ks.f(this.f24135a).k(ks.f25113f3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f24136b;
            if (i7 < arrayList.size()) {
                f10 f10Var = (f10) arrayList.get(i7);
                if (f10Var != null && f10Var.f23815a && f10Var.f23817c == tL_updateNewBotConnection.bot_id) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            } else {
                arrayList.add(new f10(this, tL_updateNewBotConnection));
                ks.f(this.f24135a).k(ks.f25113f3, new Object[0]);
                e();
                d();
                return;
            }
        }
    }

    public final void d() {
        if (this.f24140g) {
            return;
        }
        if (this.d) {
            this.f24138e = true;
            return;
        }
        this.f24140g = true;
        tr.a0(this.f24135a).f27052a.c(new a10(this, 2));
    }

    public final void e() {
        f10 f10Var;
        a10 a10Var = this.f24139f;
        g0.r(a10Var);
        ArrayList arrayList = this.f24136b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i7 = 0;
            long j3 = Long.MAX_VALUE;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                g10 g10Var = ((f10) obj).f23820i;
                j3 = Math.min(j3, (ConnectionsManager.getInstance(g10Var.f24135a).getCurrentTime() + mp.u1(g10Var.f24135a).f25739q4) - f10Var.d);
            }
            if (j3 == Long.MAX_VALUE) {
                return;
            }
            g0.h3(a10Var, Math.max(0L, j3 * 1000));
        }
    }

    public final void f(final boolean z10, ArrayList arrayList, x10 x10Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        x10[] x10VarArr = new x10[arrayList2.size()];
        for (final int i7 = 0; i7 < arrayList2.size(); i7++) {
            final f10 f10Var = (f10) arrayList2.get(i7);
            x10VarArr[i7] = new x10() {
                @Override
                public final void a(Object obj) {
                    final c10 c10Var = new c10(i7, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final f10 f10Var2 = f10Var;
                    if (z11) {
                        g10 g10Var = f10Var2.f23820i;
                        if (f10Var2.f23815a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = mp.u1(g10Var.f24135a).q1(f10Var2.f23817c);
                            ConnectionsManager.getInstance(g10Var.f24135a).sendRequestTyped(confirmbotconnection, new z3(7, f10Var2, c10Var));
                            return;
                        }
                        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                        changeauthorizationsettings.hash = f10Var2.f23816b;
                        changeauthorizationsettings.confirmed = true;
                        ConnectionsManager.getInstance(g10Var.f24135a).sendRequest(changeauthorizationsettings, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        f10 f10Var3 = f10Var2;
                                        f10Var3.getClass();
                                        g0.g3(new e10(f10Var3, tLObject, c10Var, tL_error));
                                        return;
                                    case 1:
                                        f10 f10Var4 = f10Var2;
                                        f10Var4.getClass();
                                        g0.g3(new e10(f10Var4, c10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        f10 f10Var5 = f10Var2;
                                        f10Var5.getClass();
                                        g0.g3(new e10(f10Var5, c10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    g10 g10Var2 = f10Var2.f23820i;
                    if (f10Var2.f23815a) {
                        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                        updateconnectedbot.deleted = true;
                        updateconnectedbot.bot = mp.u1(g10Var2.f24135a).q1(f10Var2.f23817c);
                        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                        ConnectionsManager.getInstance(g10Var2.f24135a).sendRequest(updateconnectedbot, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        f10 f10Var3 = f10Var2;
                                        f10Var3.getClass();
                                        g0.g3(new e10(f10Var3, tLObject, c10Var, tL_error));
                                        return;
                                    case 1:
                                        f10 f10Var4 = f10Var2;
                                        f10Var4.getClass();
                                        g0.g3(new e10(f10Var4, c10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        f10 f10Var5 = f10Var2;
                                        f10Var5.getClass();
                                        g0.g3(new e10(f10Var5, c10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                    resetauthorization.hash = f10Var2.f23816b;
                    ConnectionsManager.getInstance(g10Var2.f24135a).sendRequest(resetauthorization, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    f10 f10Var3 = f10Var2;
                                    f10Var3.getClass();
                                    g0.g3(new e10(f10Var3, tLObject, c10Var, tL_error));
                                    return;
                                case 1:
                                    f10 f10Var4 = f10Var2;
                                    f10Var4.getClass();
                                    g0.g3(new e10(f10Var4, c10Var, tLObject, tL_error, 2));
                                    return;
                                default:
                                    f10 f10Var5 = f10Var2;
                                    f10Var5.getClass();
                                    g0.g3(new e10(f10Var5, c10Var, tLObject, tL_error, 0));
                                    return;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new in(this, zArr, arrayList2, x10Var, z10, 6), x10VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                hashSet.add(Long.valueOf(((f10) arrayList2.get(i10)).f23816b));
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList3 = this.f24136b;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((f10) arrayList3.get(i11)).f23816b))) {
                    arrayList3.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (!hashSet.isEmpty()) {
                d();
                ks.f(this.f24135a).k(ks.f25113f3, new Object[0]);
                e();
            }
        }
    }
}
