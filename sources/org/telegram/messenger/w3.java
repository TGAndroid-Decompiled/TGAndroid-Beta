package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lt0;
public final class w3 implements Runnable {
    public final int f27730a;
    public final Object f27731b;
    public final Object f27732c;

    public w3(int i7, Object obj, Object obj2) {
        this.f27730a = i7;
        this.f27731b = obj;
        this.f27732c = obj2;
    }

    private final void a() {
        i5 i5Var = (i5) this.f27731b;
        for (Map.Entry entry : ((HashMap) this.f27732c).entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            i5Var.f24693f0.add(tL_contact);
            i5Var.f24694g0.put(Long.valueOf(user.f28641id), tL_contact);
        }
        i5Var.d(true);
        ks notificationCenter = i5Var.getNotificationCenter();
        int i7 = mp.I8;
        notificationCenter.k(ks.f25276r, 1);
        i5Var.getNotificationCenter().k(ks.O, new Object[0]);
    }

    private final void b() {
        Account[] accountArr;
        i5 i5Var = (i5) this.f27731b;
        lt0 lt0Var = (lt0) this.f27732c;
        AccountManager accountManager = AccountManager.get(t0.f27013b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            i5Var.f24683a = null;
            int i7 = 0;
            while (i7 < accountsByType.length) {
                Account account = accountsByType[i7];
                int i10 = 0;
                while (true) {
                    if (i10 < 4) {
                        TLRPC.User f10 = i10.i(i10).f();
                        if (f10 != null) {
                            String str = account.name;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("");
                            accountArr = accountsByType;
                            sb2.append(f10.f28641id);
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
            i5Var.f24683a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        i5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        i5Var.getMessagesStorage().c1(new ArrayList(), true);
        i5Var.f24686b0.clear();
        i5Var.f24693f0.clear();
        i5Var.f24694g0.clear();
        i5Var.f24695h0.clear();
        i5Var.f24697j0.clear();
        i5Var.f24696i0.clear();
        i5Var.f24688c0.clear();
        i5Var.f24689d0.clear();
        i5Var.f24691e0.clear();
        i5Var.f24705x.clear();
        i5Var.f24698k0.clear();
        i5Var.f24699l0.clear();
        i5Var.m0.clear();
        i5Var.getNotificationCenter().k(ks.O, new Object[0]);
        i5Var.A(0L, false);
        lt0Var.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w3.run():void");
    }
}
