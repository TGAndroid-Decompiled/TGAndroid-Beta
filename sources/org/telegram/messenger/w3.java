package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nt0;
public final class w3 implements Runnable {
    public final int f27645a;
    public final Object f27646b;
    public final Object f27647c;

    public w3(int i7, Object obj, Object obj2) {
        this.f27645a = i7;
        this.f27646b = obj;
        this.f27647c = obj2;
    }

    private final void a() {
        i5 i5Var = (i5) this.f27646b;
        for (Map.Entry entry : ((HashMap) this.f27647c).entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            i5Var.f24569f0.add(tL_contact);
            i5Var.f24570g0.put(Long.valueOf(user.f28547id), tL_contact);
        }
        i5Var.d(true);
        ls notificationCenter = i5Var.getNotificationCenter();
        int i7 = np.I8;
        notificationCenter.k(ls.f25335r, 1);
        i5Var.getNotificationCenter().k(ls.O, new Object[0]);
    }

    private final void b() {
        Account[] accountArr;
        i5 i5Var = (i5) this.f27646b;
        nt0 nt0Var = (nt0) this.f27647c;
        AccountManager accountManager = AccountManager.get(t0.f26895b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            i5Var.f24559a = null;
            int i7 = 0;
            while (i7 < accountsByType.length) {
                Account account = accountsByType[i7];
                int i10 = 0;
                while (true) {
                    if (i10 < 4) {
                        TLRPC.User f10 = k10.i(i10).f();
                        if (f10 != null) {
                            String str = account.name;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("");
                            accountArr = accountsByType;
                            sb2.append(f10.f28547id);
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
            Account account2 = new Account("" + i5Var.getUserConfig().e(), "org.telegram.messenger");
            i5Var.f24559a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        i5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        i5Var.getMessagesStorage().c1(new ArrayList(), true);
        i5Var.f24562b0.clear();
        i5Var.f24569f0.clear();
        i5Var.f24570g0.clear();
        i5Var.f24571h0.clear();
        i5Var.f24573j0.clear();
        i5Var.f24572i0.clear();
        i5Var.f24564c0.clear();
        i5Var.f24565d0.clear();
        i5Var.f24567e0.clear();
        i5Var.f24581x.clear();
        i5Var.f24574k0.clear();
        i5Var.f24575l0.clear();
        i5Var.m0.clear();
        i5Var.getNotificationCenter().k(ls.O, new Object[0]);
        i5Var.A(0L, false);
        nt0Var.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w3.run():void");
    }
}
