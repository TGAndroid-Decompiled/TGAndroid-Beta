package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jt0;
public final class b4 implements Runnable {
    public final int f22653a;
    public final Object f22654b;
    public final Object f22655c;

    public b4(int i7, Object obj, Object obj2) {
        this.f22653a = i7;
        this.f22654b = obj;
        this.f22655c = obj2;
    }

    private final void a() {
        g5 g5Var = (g5) this.f22654b;
        for (Map.Entry entry : ((HashMap) this.f22655c).entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            g5Var.f23681f0.add(tL_contact);
            g5Var.f23682g0.put(Long.valueOf(user.f28200id), tL_contact);
        }
        g5Var.d(true);
        ns notificationCenter = g5Var.getNotificationCenter();
        int i7 = np.D8;
        notificationCenter.k(ns.f25560r, 1);
        g5Var.getNotificationCenter().k(ns.O, new Object[0]);
    }

    private final void b() {
        Account[] accountArr;
        g5 g5Var = (g5) this.f22654b;
        jt0 jt0Var = (jt0) this.f22655c;
        AccountManager accountManager = AccountManager.get(t0.f26609b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            g5Var.f23671a = null;
            int i7 = 0;
            while (i7 < accountsByType.length) {
                Account account = accountsByType[i7];
                int i10 = 0;
                while (true) {
                    if (i10 < 4) {
                        TLRPC.User f10 = m10.i(i10).f();
                        if (f10 != null) {
                            String str = account.name;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("");
                            accountArr = accountsByType;
                            sb2.append(f10.f28200id);
                            if (str.equals(sb2.toString())) {
                                accountManager.removeAccount(account, null, null);
                                break;
                            }
                        } else {
                            accountArr = accountsByType;
                        }
                        i10++;
                        accountsByType = accountArr;
                    } else {
                        accountArr = accountsByType;
                        break;
                    }
                }
                i7++;
                accountsByType = accountArr;
            }
        } catch (Throwable unused) {
        }
        try {
            Account account2 = new Account("" + g5Var.getUserConfig().e(), "org.telegram.messenger");
            g5Var.f23671a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        g5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        g5Var.getMessagesStorage().c1(new ArrayList(), true);
        g5Var.f23674b0.clear();
        g5Var.f23681f0.clear();
        g5Var.f23682g0.clear();
        g5Var.f23683h0.clear();
        g5Var.f23685j0.clear();
        g5Var.f23684i0.clear();
        g5Var.f23676c0.clear();
        g5Var.f23677d0.clear();
        g5Var.f23679e0.clear();
        g5Var.f23693x.clear();
        g5Var.f23686k0.clear();
        g5Var.f23687l0.clear();
        g5Var.m0.clear();
        g5Var.getNotificationCenter().k(ns.O, new Object[0]);
        g5Var.A(0L, false);
        jt0Var.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b4.run():void");
    }
}
