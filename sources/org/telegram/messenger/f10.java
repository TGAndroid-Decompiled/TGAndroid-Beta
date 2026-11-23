package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class f10 {
    public final int f23922a;
    public boolean f23924c;
    public boolean d;
    public boolean f23925e;
    public boolean f23927g;
    public final ArrayList f23923b = new ArrayList();
    public final z00 f23926f = new z00(this, 0);

    public f10(int i7) {
        this.f23922a = i7;
        if (!this.f23924c && !this.d) {
            this.d = true;
            tr.a0(i7).f27149a.c(new z00(this, 1));
        }
    }

    public final void a() {
        this.f23923b.clear();
        d();
        ks.f(this.f23922a).k(ks.f25212f3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f23923b;
            if (i7 >= arrayList.size()) {
                break;
            }
            e10 e10Var = (e10) arrayList.get(i7);
            if (e10Var != null && !e10Var.f23753a && e10Var.f23754b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new e10(this, tL_updateNewAuthorization));
        }
        ks.f(this.f23922a).k(ks.f25212f3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f23923b;
            if (i7 < arrayList.size()) {
                e10 e10Var = (e10) arrayList.get(i7);
                if (e10Var != null && e10Var.f23753a && e10Var.f23755c == tL_updateNewBotConnection.bot_id) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            } else {
                arrayList.add(new e10(this, tL_updateNewBotConnection));
                ks.f(this.f23922a).k(ks.f25212f3, new Object[0]);
                e();
                d();
                return;
            }
        }
    }

    public final void d() {
        if (this.f23927g) {
            return;
        }
        if (this.d) {
            this.f23925e = true;
            return;
        }
        this.f23927g = true;
        tr.a0(this.f23922a).f27149a.c(new z00(this, 2));
    }

    public final void e() {
        e10 e10Var;
        z00 z00Var = this.f23926f;
        g0.r(z00Var);
        ArrayList arrayList = this.f23923b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i7 = 0;
            long j3 = Long.MAX_VALUE;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                f10 f10Var = ((e10) obj).f23758i;
                j3 = Math.min(j3, (ConnectionsManager.getInstance(f10Var.f23922a).getCurrentTime() + mp.u1(f10Var.f23922a).f25834q4) - e10Var.d);
            }
            if (j3 == Long.MAX_VALUE) {
                return;
            }
            g0.h3(z00Var, Math.max(0L, j3 * 1000));
        }
    }

    public final void f(final boolean z10, ArrayList arrayList, w10 w10Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        w10[] w10VarArr = new w10[arrayList2.size()];
        for (final int i7 = 0; i7 < arrayList2.size(); i7++) {
            final e10 e10Var = (e10) arrayList2.get(i7);
            w10VarArr[i7] = new w10() {
                @Override
                public final void a(Object obj) {
                    final b10 b10Var = new b10(i7, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final e10 e10Var2 = e10Var;
                    if (z11) {
                        f10 f10Var = e10Var2.f23758i;
                        if (e10Var2.f23753a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = mp.u1(f10Var.f23922a).q1(e10Var2.f23755c);
                            ConnectionsManager.getInstance(f10Var.f23922a).sendRequestTyped(confirmbotconnection, new z3(7, e10Var2, b10Var));
                            return;
                        }
                        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                        changeauthorizationsettings.hash = e10Var2.f23754b;
                        changeauthorizationsettings.confirmed = true;
                        ConnectionsManager.getInstance(f10Var.f23922a).sendRequest(changeauthorizationsettings, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        e10 e10Var3 = e10Var2;
                                        e10Var3.getClass();
                                        g0.g3(new d10(e10Var3, tLObject, b10Var, tL_error));
                                        return;
                                    case 1:
                                        e10 e10Var4 = e10Var2;
                                        e10Var4.getClass();
                                        g0.g3(new d10(e10Var4, b10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        e10 e10Var5 = e10Var2;
                                        e10Var5.getClass();
                                        g0.g3(new d10(e10Var5, b10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    f10 f10Var2 = e10Var2.f23758i;
                    if (e10Var2.f23753a) {
                        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                        updateconnectedbot.deleted = true;
                        updateconnectedbot.bot = mp.u1(f10Var2.f23922a).q1(e10Var2.f23755c);
                        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                        ConnectionsManager.getInstance(f10Var2.f23922a).sendRequest(updateconnectedbot, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        e10 e10Var3 = e10Var2;
                                        e10Var3.getClass();
                                        g0.g3(new d10(e10Var3, tLObject, b10Var, tL_error));
                                        return;
                                    case 1:
                                        e10 e10Var4 = e10Var2;
                                        e10Var4.getClass();
                                        g0.g3(new d10(e10Var4, b10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        e10 e10Var5 = e10Var2;
                                        e10Var5.getClass();
                                        g0.g3(new d10(e10Var5, b10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                    resetauthorization.hash = e10Var2.f23754b;
                    ConnectionsManager.getInstance(f10Var2.f23922a).sendRequest(resetauthorization, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    e10 e10Var3 = e10Var2;
                                    e10Var3.getClass();
                                    g0.g3(new d10(e10Var3, tLObject, b10Var, tL_error));
                                    return;
                                case 1:
                                    e10 e10Var4 = e10Var2;
                                    e10Var4.getClass();
                                    g0.g3(new d10(e10Var4, b10Var, tLObject, tL_error, 2));
                                    return;
                                default:
                                    e10 e10Var5 = e10Var2;
                                    e10Var5.getClass();
                                    g0.g3(new d10(e10Var5, b10Var, tLObject, tL_error, 0));
                                    return;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new in(this, zArr, arrayList2, w10Var, z10, 6), w10VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                hashSet.add(Long.valueOf(((e10) arrayList2.get(i10)).f23754b));
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList3 = this.f23923b;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((e10) arrayList3.get(i11)).f23754b))) {
                    arrayList3.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (!hashSet.isEmpty()) {
                d();
                ks.f(this.f23922a).k(ks.f25212f3, new Object[0]);
                e();
            }
        }
    }
}
