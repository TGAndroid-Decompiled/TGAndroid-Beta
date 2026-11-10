package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ot0;
public final class b4 implements Runnable {
    public final int f21614a;
    public final Object f21615b;
    public final Object f21616c;

    public b4(int i7, Object obj, Object obj2) {
        this.f21614a = i7;
        this.f21615b = obj;
        this.f21616c = obj2;
    }

    private final void a() {
        g5 g5Var = (g5) this.f21615b;
        for (Map.Entry entry : ((HashMap) this.f21616c).entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            g5Var.f22612e0.add(tL_contact);
            g5Var.f22614f0.put(Long.valueOf(user.f27109id), tL_contact);
        }
        g5Var.d(true);
        qs notificationCenter = g5Var.getNotificationCenter();
        int i7 = qp.C8;
        notificationCenter.k(qs.f25067r, 1);
        g5Var.getNotificationCenter().k(qs.O, new Object[0]);
    }

    private final void b() {
        Account[] accountArr;
        g5 g5Var = (g5) this.f21615b;
        ot0 ot0Var = (ot0) this.f21616c;
        AccountManager accountManager = AccountManager.get(t0.f25570b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            g5Var.f22604a = null;
            int i7 = 0;
            while (i7 < accountsByType.length) {
                Account account = accountsByType[i7];
                int i10 = 0;
                while (true) {
                    if (i10 < 4) {
                        TLRPC.User f10 = p10.i(i10).f();
                        if (f10 != null) {
                            String str = account.name;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("");
                            accountArr = accountsByType;
                            sb2.append(f10.f27109id);
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
            g5Var.f22604a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        g5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        g5Var.getMessagesStorage().c1(new ArrayList(), true);
        g5Var.f22605a0.clear();
        g5Var.f22612e0.clear();
        g5Var.f22614f0.clear();
        g5Var.f22615g0.clear();
        g5Var.f22617i0.clear();
        g5Var.f22616h0.clear();
        g5Var.f22607b0.clear();
        g5Var.f22609c0.clear();
        g5Var.f22610d0.clear();
        g5Var.f22625x.clear();
        g5Var.f22618j0.clear();
        g5Var.f22619k0.clear();
        g5Var.f22620l0.clear();
        g5Var.getNotificationCenter().k(qs.O, new Object[0]);
        g5Var.A(0L, false);
        ot0Var.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b4.run():void");
    }
}
