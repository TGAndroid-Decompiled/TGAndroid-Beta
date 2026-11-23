package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mt0;
public final class w3 implements Runnable {
    public final int f27681a;
    public final Object f27682b;
    public final Object f27683c;

    public w3(int i7, Object obj, Object obj2) {
        this.f27681a = i7;
        this.f27682b = obj;
        this.f27683c = obj2;
    }

    private final void a() {
        i5 i5Var = (i5) this.f27682b;
        for (Map.Entry entry : ((HashMap) this.f27683c).entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            i5Var.f24605f0.add(tL_contact);
            i5Var.f24606g0.put(Long.valueOf(user.f28583id), tL_contact);
        }
        i5Var.d(true);
        ls notificationCenter = i5Var.getNotificationCenter();
        int i7 = np.I8;
        notificationCenter.k(ls.f25371r, 1);
        i5Var.getNotificationCenter().k(ls.O, new Object[0]);
    }

    private final void b() {
        Account[] accountArr;
        i5 i5Var = (i5) this.f27682b;
        mt0 mt0Var = (mt0) this.f27683c;
        AccountManager accountManager = AccountManager.get(t0.f26931b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            i5Var.f24595a = null;
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
                            sb2.append(f10.f28583id);
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
            i5Var.f24595a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        i5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        i5Var.getMessagesStorage().c1(new ArrayList(), true);
        i5Var.f24598b0.clear();
        i5Var.f24605f0.clear();
        i5Var.f24606g0.clear();
        i5Var.f24607h0.clear();
        i5Var.f24609j0.clear();
        i5Var.f24608i0.clear();
        i5Var.f24600c0.clear();
        i5Var.f24601d0.clear();
        i5Var.f24603e0.clear();
        i5Var.f24617x.clear();
        i5Var.f24610k0.clear();
        i5Var.f24611l0.clear();
        i5Var.m0.clear();
        i5Var.getNotificationCenter().k(ls.O, new Object[0]);
        i5Var.A(0L, false);
        mt0Var.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w3.run():void");
    }
}
