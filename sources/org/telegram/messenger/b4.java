package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kt0;
public final class b4 implements Runnable {
    public final int f21584a;
    public final Object f21585b;
    public final Object f21586c;

    public b4(int i7, Object obj, Object obj2) {
        this.f21584a = i7;
        this.f21585b = obj;
        this.f21586c = obj2;
    }

    private final void a() {
        g5 g5Var = (g5) this.f21585b;
        for (Map.Entry entry : ((HashMap) this.f21586c).entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            g5Var.f22582e0.add(tL_contact);
            g5Var.f22584f0.put(Long.valueOf(user.f27101id), tL_contact);
        }
        g5Var.d(true);
        qs notificationCenter = g5Var.getNotificationCenter();
        int i7 = qp.C8;
        notificationCenter.k(qs.f25046r, 1);
        g5Var.getNotificationCenter().k(qs.O, new Object[0]);
    }

    private final void b() {
        Account[] accountArr;
        g5 g5Var = (g5) this.f21585b;
        kt0 kt0Var = (kt0) this.f21586c;
        AccountManager accountManager = AccountManager.get(t0.f25555b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            g5Var.f22574a = null;
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
                            sb2.append(f10.f27101id);
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
            g5Var.f22574a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        g5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        g5Var.getMessagesStorage().c1(new ArrayList(), true);
        g5Var.f22575a0.clear();
        g5Var.f22582e0.clear();
        g5Var.f22584f0.clear();
        g5Var.f22585g0.clear();
        g5Var.f22587i0.clear();
        g5Var.f22586h0.clear();
        g5Var.f22577b0.clear();
        g5Var.f22579c0.clear();
        g5Var.f22580d0.clear();
        g5Var.f22595x.clear();
        g5Var.f22588j0.clear();
        g5Var.f22589k0.clear();
        g5Var.f22590l0.clear();
        g5Var.getNotificationCenter().k(qs.O, new Object[0]);
        g5Var.A(0L, false);
        kt0Var.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b4.run():void");
    }
}
