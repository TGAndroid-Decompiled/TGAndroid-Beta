package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class b20 {
    public final int f14906a;
    public boolean f14908c;
    public boolean d;
    public boolean e;
    public boolean f14910g;
    public final ArrayList f14907b = new ArrayList();
    public final v10 f14909f = new v10(this, 0);

    public b20(int i10) {
        this.f14906a = i10;
        if (!this.f14908c && !this.d) {
            this.d = true;
            is.a0(i10).f16331a.c(new v10(this, 1));
        }
    }

    public final void a() {
        this.f14907b.clear();
        d();
        at.f(this.f14906a).k(at.f14695d3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f14907b;
            if (i10 >= arrayList.size()) {
                break;
            }
            a20 a20Var = (a20) arrayList.get(i10);
            if (a20Var != null && !a20Var.f14555a && a20Var.f14556b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new a20(this, tL_updateNewAuthorization));
        }
        at.f(this.f14906a).k(at.f14695d3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14907b;
            if (i10 < arrayList.size()) {
                a20 a20Var = (a20) arrayList.get(i10);
                if (a20Var != null && a20Var.f14555a && a20Var.f14557c == tL_updateNewBotConnection.bot_id) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            } else {
                arrayList.add(new a20(this, tL_updateNewBotConnection));
                at.f(this.f14906a).k(at.f14695d3, new Object[0]);
                e();
                d();
                return;
            }
        }
    }

    public final void d() {
        if (this.f14910g) {
            return;
        }
        if (this.d) {
            this.e = true;
            return;
        }
        this.f14910g = true;
        is.a0(this.f14906a).f16331a.c(new v10(this, 2));
    }

    public final void e() {
        a20 a20Var;
        v10 v10Var = this.f14909f;
        i0.r(v10Var);
        ArrayList arrayList = this.f14907b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            long j10 = Long.MAX_VALUE;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                b20 b20Var = ((a20) obj).f14559i;
                j10 = Math.min(j10, (ConnectionsManager.getInstance(b20Var.f14906a).getCurrentTime() + wp.r1(b20Var.f14906a).f19205o4) - a20Var.d);
            }
            if (j10 == Long.MAX_VALUE) {
                return;
            }
            i0.h3(v10Var, Math.max(0L, j10 * 1000));
        }
    }

    public final void f(final boolean z10, ArrayList arrayList, r20 r20Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        r20[] r20VarArr = new r20[arrayList2.size()];
        for (final int i10 = 0; i10 < arrayList2.size(); i10++) {
            final a20 a20Var = (a20) arrayList2.get(i10);
            r20VarArr[i10] = new r20() {
                @Override
                public final void a(Object obj) {
                    final x10 x10Var = new x10(i10, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final a20 a20Var2 = a20Var;
                    if (z11) {
                        b20 b20Var = a20Var2.f14559i;
                        if (a20Var2.f14555a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = wp.r1(b20Var.f14906a).n1(a20Var2.f14557c);
                            ConnectionsManager.getInstance(b20Var.f14906a).sendRequestTyped(confirmbotconnection, new a4(6, a20Var2, x10Var));
                            return;
                        }
                        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                        changeauthorizationsettings.hash = a20Var2.f14556b;
                        changeauthorizationsettings.confirmed = true;
                        ConnectionsManager.getInstance(b20Var.f14906a).sendRequest(changeauthorizationsettings, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        a20 a20Var3 = a20Var2;
                                        a20Var3.getClass();
                                        i0.g3(new z10(a20Var3, tLObject, x10Var, tL_error));
                                        return;
                                    case 1:
                                        a20 a20Var4 = a20Var2;
                                        a20Var4.getClass();
                                        i0.g3(new z10(a20Var4, x10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        a20 a20Var5 = a20Var2;
                                        a20Var5.getClass();
                                        i0.g3(new z10(a20Var5, x10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    b20 b20Var2 = a20Var2.f14559i;
                    if (a20Var2.f14555a) {
                        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                        updateconnectedbot.deleted = true;
                        updateconnectedbot.bot = wp.r1(b20Var2.f14906a).n1(a20Var2.f14557c);
                        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                        ConnectionsManager.getInstance(b20Var2.f14906a).sendRequest(updateconnectedbot, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        a20 a20Var3 = a20Var2;
                                        a20Var3.getClass();
                                        i0.g3(new z10(a20Var3, tLObject, x10Var, tL_error));
                                        return;
                                    case 1:
                                        a20 a20Var4 = a20Var2;
                                        a20Var4.getClass();
                                        i0.g3(new z10(a20Var4, x10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        a20 a20Var5 = a20Var2;
                                        a20Var5.getClass();
                                        i0.g3(new z10(a20Var5, x10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                    resetauthorization.hash = a20Var2.f14556b;
                    ConnectionsManager.getInstance(b20Var2.f14906a).sendRequest(resetauthorization, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    a20 a20Var3 = a20Var2;
                                    a20Var3.getClass();
                                    i0.g3(new z10(a20Var3, tLObject, x10Var, tL_error));
                                    return;
                                case 1:
                                    a20 a20Var4 = a20Var2;
                                    a20Var4.getClass();
                                    i0.g3(new z10(a20Var4, x10Var, tLObject, tL_error, 2));
                                    return;
                                default:
                                    a20 a20Var5 = a20Var2;
                                    a20Var5.getClass();
                                    i0.g3(new z10(a20Var5, x10Var, tLObject, tL_error, 0));
                                    return;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new sn(this, zArr, arrayList2, z10, r20Var, 6), r20VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                hashSet.add(Long.valueOf(((a20) arrayList2.get(i11)).f14556b));
            }
            int i12 = 0;
            while (true) {
                ArrayList arrayList3 = this.f14907b;
                if (i12 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((a20) arrayList3.get(i12)).f14556b))) {
                    arrayList3.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (!hashSet.isEmpty()) {
                d();
                at.f(this.f14906a).k(at.f14695d3, new Object[0]);
                e();
            }
        }
    }
}
