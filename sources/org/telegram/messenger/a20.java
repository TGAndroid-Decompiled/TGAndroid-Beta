package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class a20 {
    public final int f14560a;
    public boolean f14562c;
    public boolean d;
    public boolean e;
    public boolean f14564g;
    public final ArrayList f14561b = new ArrayList();
    public final u10 f14563f = new u10(this, 0);

    public a20(int i10) {
        this.f14560a = i10;
        if (!this.f14562c && !this.d) {
            this.d = true;
            hs.a0(i10).f15938a.c(new u10(this, 1));
        }
    }

    public final void a() {
        this.f14561b.clear();
        d();
        zs.f(this.f14560a).k(zs.f19599d3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f14561b;
            if (i10 >= arrayList.size()) {
                break;
            }
            z10 z10Var = (z10) arrayList.get(i10);
            if (z10Var != null && !z10Var.f19470a && z10Var.f19471b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new z10(this, tL_updateNewAuthorization));
        }
        zs.f(this.f14560a).k(zs.f19599d3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14561b;
            if (i10 < arrayList.size()) {
                z10 z10Var = (z10) arrayList.get(i10);
                if (z10Var != null && z10Var.f19470a && z10Var.f19472c == tL_updateNewBotConnection.bot_id) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            } else {
                arrayList.add(new z10(this, tL_updateNewBotConnection));
                zs.f(this.f14560a).k(zs.f19599d3, new Object[0]);
                e();
                d();
                return;
            }
        }
    }

    public final void d() {
        if (this.f14564g) {
            return;
        }
        if (this.d) {
            this.e = true;
            return;
        }
        this.f14564g = true;
        hs.a0(this.f14560a).f15938a.c(new u10(this, 2));
    }

    public final void e() {
        z10 z10Var;
        u10 u10Var = this.f14563f;
        i0.r(u10Var);
        ArrayList arrayList = this.f14561b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            long j10 = Long.MAX_VALUE;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a20 a20Var = ((z10) obj).f19474i;
                j10 = Math.min(j10, (ConnectionsManager.getInstance(a20Var.f14560a).getCurrentTime() + vp.r1(a20Var.f14560a).f18862o4) - z10Var.d);
            }
            if (j10 == Long.MAX_VALUE) {
                return;
            }
            i0.h3(u10Var, Math.max(0L, j10 * 1000));
        }
    }

    public final void f(final boolean z10, ArrayList arrayList, q20 q20Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        q20[] q20VarArr = new q20[arrayList2.size()];
        for (final int i10 = 0; i10 < arrayList2.size(); i10++) {
            final z10 z10Var = (z10) arrayList2.get(i10);
            q20VarArr[i10] = new q20() {
                @Override
                public final void a(Object obj) {
                    final w10 w10Var = new w10(i10, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final z10 z10Var2 = z10Var;
                    if (z11) {
                        a20 a20Var = z10Var2.f19474i;
                        if (z10Var2.f19470a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = vp.r1(a20Var.f14560a).n1(z10Var2.f19472c);
                            ConnectionsManager.getInstance(a20Var.f14560a).sendRequestTyped(confirmbotconnection, new a4(6, z10Var2, w10Var));
                            return;
                        }
                        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                        changeauthorizationsettings.hash = z10Var2.f19471b;
                        changeauthorizationsettings.confirmed = true;
                        ConnectionsManager.getInstance(a20Var.f14560a).sendRequest(changeauthorizationsettings, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        z10 z10Var3 = z10Var2;
                                        z10Var3.getClass();
                                        i0.g3(new y10(z10Var3, tLObject, w10Var, tL_error));
                                        return;
                                    case 1:
                                        z10 z10Var4 = z10Var2;
                                        z10Var4.getClass();
                                        i0.g3(new y10(z10Var4, w10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        z10 z10Var5 = z10Var2;
                                        z10Var5.getClass();
                                        i0.g3(new y10(z10Var5, w10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    a20 a20Var2 = z10Var2.f19474i;
                    if (z10Var2.f19470a) {
                        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                        updateconnectedbot.deleted = true;
                        updateconnectedbot.bot = vp.r1(a20Var2.f14560a).n1(z10Var2.f19472c);
                        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                        ConnectionsManager.getInstance(a20Var2.f14560a).sendRequest(updateconnectedbot, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r3) {
                                    case 0:
                                        z10 z10Var3 = z10Var2;
                                        z10Var3.getClass();
                                        i0.g3(new y10(z10Var3, tLObject, w10Var, tL_error));
                                        return;
                                    case 1:
                                        z10 z10Var4 = z10Var2;
                                        z10Var4.getClass();
                                        i0.g3(new y10(z10Var4, w10Var, tLObject, tL_error, 2));
                                        return;
                                    default:
                                        z10 z10Var5 = z10Var2;
                                        z10Var5.getClass();
                                        i0.g3(new y10(z10Var5, w10Var, tLObject, tL_error, 0));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                    resetauthorization.hash = z10Var2.f19471b;
                    ConnectionsManager.getInstance(a20Var2.f14560a).sendRequest(resetauthorization, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    z10 z10Var3 = z10Var2;
                                    z10Var3.getClass();
                                    i0.g3(new y10(z10Var3, tLObject, w10Var, tL_error));
                                    return;
                                case 1:
                                    z10 z10Var4 = z10Var2;
                                    z10Var4.getClass();
                                    i0.g3(new y10(z10Var4, w10Var, tLObject, tL_error, 2));
                                    return;
                                default:
                                    z10 z10Var5 = z10Var2;
                                    z10Var5.getClass();
                                    i0.g3(new y10(z10Var5, w10Var, tLObject, tL_error, 0));
                                    return;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new rn(this, zArr, arrayList2, z10, q20Var, 6), q20VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                hashSet.add(Long.valueOf(((z10) arrayList2.get(i11)).f19471b));
            }
            int i12 = 0;
            while (true) {
                ArrayList arrayList3 = this.f14561b;
                if (i12 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((z10) arrayList3.get(i12)).f19471b))) {
                    arrayList3.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (!hashSet.isEmpty()) {
                d();
                zs.f(this.f14560a).k(zs.f19599d3, new Object[0]);
                e();
            }
        }
    }
}
