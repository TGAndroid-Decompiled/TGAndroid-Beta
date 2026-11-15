package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class j10 {
    public final int f24501a;
    public boolean f24503c;
    public boolean d;
    public boolean f24504e;
    public boolean f24506g;
    public final ArrayList f24502b = new ArrayList();
    public final d10 f24505f = new d10(this, 0);

    public j10(int i7) {
        this.f24501a = i7;
        if (!this.f24503c && !this.d) {
            this.d = true;
            vr.a0(i7).f27220a.c(new d10(this, 1));
        }
    }

    public final void a() {
        this.f24502b.clear();
        d();
        ns.f(this.f24501a).k(ns.f25483d3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f24502b;
            if (i7 >= arrayList.size()) {
                break;
            }
            i10 i10Var = (i10) arrayList.get(i7);
            if (i10Var != null && !i10Var.f24264a && i10Var.f24265b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new i10(this, tL_updateNewAuthorization));
        }
        ns.f(this.f24501a).k(ns.f25483d3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f24502b;
            if (i7 < arrayList.size()) {
                i10 i10Var = (i10) arrayList.get(i7);
                if (i10Var != null && i10Var.f24264a && i10Var.f24266c == tL_updateNewBotConnection.bot_id) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            } else {
                arrayList.add(new i10(this, tL_updateNewBotConnection));
                ns.f(this.f24501a).k(ns.f25483d3, new Object[0]);
                e();
                d();
                return;
            }
        }
    }

    public final void d() {
        if (this.f24506g) {
            return;
        }
        if (this.d) {
            this.f24504e = true;
            return;
        }
        this.f24506g = true;
        vr.a0(this.f24501a).f27220a.c(new d10(this, 2));
    }

    public final void e() {
        i10 i10Var;
        d10 d10Var = this.f24505f;
        g0.r(d10Var);
        ArrayList arrayList = this.f24502b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i7 = 0;
            long j3 = Long.MAX_VALUE;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                j10 j10Var = ((i10) obj).f24269i;
                j3 = Math.min(j3, (ConnectionsManager.getInstance(j10Var.f24501a).getCurrentTime() + np.s1(j10Var.f24501a).o4) - i10Var.d);
            }
            if (j3 == Long.MAX_VALUE) {
                return;
            }
            g0.i3(d10Var, Math.max(0L, j3 * 1000));
        }
    }

    public final void f(final boolean z10, ArrayList arrayList, z10 z10Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        z10[] z10VarArr = new z10[arrayList2.size()];
        for (final int i7 = 0; i7 < arrayList2.size(); i7++) {
            final i10 i10Var = (i10) arrayList2.get(i7);
            z10VarArr[i7] = new z10() {
                @Override
                public final void a(Object obj) {
                    final f10 f10Var = new f10(i7, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final i10 i10Var2 = i10Var;
                    if (z11) {
                        j10 j10Var = i10Var2.f24269i;
                        if (i10Var2.f24264a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = np.s1(j10Var.f24501a).o1(i10Var2.f24266c);
                            ConnectionsManager.getInstance(j10Var.f24501a).sendRequestTyped(confirmbotconnection, new x3(7, i10Var2, f10Var));
                            return;
                        }
                        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                        changeauthorizationsettings.hash = i10Var2.f24265b;
                        changeauthorizationsettings.confirmed = true;
                        ConnectionsManager.getInstance(j10Var.f24501a).sendRequest(changeauthorizationsettings, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        i10 i10Var3 = i10Var2;
                                        i10Var3.getClass();
                                        g0.h3(new h10(i10Var3, tLObject, f10Var, tL_error));
                                        return;
                                    case 1:
                                        i10 i10Var4 = i10Var2;
                                        i10Var4.getClass();
                                        g0.h3(new h10(i10Var4, f10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        i10 i10Var5 = i10Var2;
                                        i10Var5.getClass();
                                        g0.h3(new h10(i10Var5, f10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    j10 j10Var2 = i10Var2.f24269i;
                    if (i10Var2.f24264a) {
                        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                        updateconnectedbot.deleted = true;
                        updateconnectedbot.bot = np.s1(j10Var2.f24501a).o1(i10Var2.f24266c);
                        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                        ConnectionsManager.getInstance(j10Var2.f24501a).sendRequest(updateconnectedbot, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        i10 i10Var3 = i10Var2;
                                        i10Var3.getClass();
                                        g0.h3(new h10(i10Var3, tLObject, f10Var, tL_error));
                                        return;
                                    case 1:
                                        i10 i10Var4 = i10Var2;
                                        i10Var4.getClass();
                                        g0.h3(new h10(i10Var4, f10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        i10 i10Var5 = i10Var2;
                                        i10Var5.getClass();
                                        g0.h3(new h10(i10Var5, f10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                    resetauthorization.hash = i10Var2.f24265b;
                    ConnectionsManager.getInstance(j10Var2.f24501a).sendRequest(resetauthorization, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    i10 i10Var3 = i10Var2;
                                    i10Var3.getClass();
                                    g0.h3(new h10(i10Var3, tLObject, f10Var, tL_error));
                                    return;
                                case 1:
                                    i10 i10Var4 = i10Var2;
                                    i10Var4.getClass();
                                    g0.h3(new h10(i10Var4, f10Var, tLObject, tL_error, 2));
                                    return;
                                default:
                                    i10 i10Var5 = i10Var2;
                                    i10Var5.getClass();
                                    g0.h3(new h10(i10Var5, f10Var, tLObject, tL_error, 0));
                                    return;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new in(this, zArr, arrayList2, z10Var, z10, 6), z10VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                hashSet.add(Long.valueOf(((i10) arrayList2.get(i10)).f24265b));
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList3 = this.f24502b;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((i10) arrayList3.get(i11)).f24265b))) {
                    arrayList3.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (!hashSet.isEmpty()) {
                d();
                ns.f(this.f24501a).k(ns.f25483d3, new Object[0]);
                e();
            }
        }
    }
}
