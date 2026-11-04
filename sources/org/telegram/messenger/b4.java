package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ct0;
public final class b4 implements Runnable {
    public final int f21736a;
    public final Object f21737b;
    public final Object f21738c;

    public b4(int i3, Object obj, Object obj2) {
        this.f21736a = i3;
        this.f21737b = obj;
        this.f21738c = obj2;
    }

    private final void a() {
        g5 g5Var = (g5) this.f21737b;
        for (Map.Entry entry : ((HashMap) this.f21738c).entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            g5Var.f22653f0.add(tL_contact);
            g5Var.f22654g0.put(Long.valueOf(user.f27150id), tL_contact);
        }
        g5Var.d(true);
        hs notificationCenter = g5Var.getNotificationCenter();
        int i3 = hp.C8;
        notificationCenter.k(hs.f23292r, 1);
        g5Var.getNotificationCenter().k(hs.O, new Object[0]);
    }

    private final void b() {
        Account[] accountArr;
        g5 g5Var = (g5) this.f21737b;
        ct0 ct0Var = (ct0) this.f21738c;
        AccountManager accountManager = AccountManager.get(t0.f25457b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            g5Var.f22643a = null;
            int i3 = 0;
            while (i3 < accountsByType.length) {
                Account account = accountsByType[i3];
                int i10 = 0;
                while (true) {
                    if (i10 < 4) {
                        TLRPC.User f10 = h10.i(i10).f();
                        if (f10 != null) {
                            String str = account.name;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("");
                            accountArr = accountsByType;
                            sb2.append(f10.f27150id);
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
                i3++;
                accountsByType = accountArr;
            }
        } catch (Throwable unused) {
        }
        try {
            Account account2 = new Account("" + g5Var.getUserConfig().e(), "org.telegram.messenger");
            g5Var.f22643a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        g5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        g5Var.getMessagesStorage().c1(new ArrayList(), true);
        g5Var.f22646b0.clear();
        g5Var.f22653f0.clear();
        g5Var.f22654g0.clear();
        g5Var.f22655h0.clear();
        g5Var.f22657j0.clear();
        g5Var.f22656i0.clear();
        g5Var.f22648c0.clear();
        g5Var.f22649d0.clear();
        g5Var.f22651e0.clear();
        g5Var.f22665x.clear();
        g5Var.f22658k0.clear();
        g5Var.f22659l0.clear();
        g5Var.m0.clear();
        g5Var.getNotificationCenter().k(hs.O, new Object[0]);
        g5Var.A(0L, false);
        ct0Var.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b4.run():void");
    }
}
