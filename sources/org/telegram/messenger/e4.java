package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tu0;
public final class e4 implements Runnable {
    public final int f15538a;
    public final Object f15539b;
    public final Object f15540c;

    public e4(int i10, Object obj, Object obj2) {
        this.f15538a = i10;
        this.f15539b = obj;
        this.f15540c = obj2;
    }

    private final void a() {
        Account[] accountArr;
        i5 i5Var = (i5) this.f15539b;
        tu0 tu0Var = (tu0) this.f15540c;
        AccountManager accountManager = AccountManager.get(w0.f18945b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            i5Var.f16211a = null;
            int i10 = 0;
            while (i10 < accountsByType.length) {
                Account account = accountsByType[i10];
                int i11 = 0;
                while (true) {
                    if (i11 < 4) {
                        TLRPC.User f7 = e20.i(i11).f();
                        if (f7 != null) {
                            String str = account.name;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("");
                            accountArr = accountsByType;
                            sb2.append(f7.f19943id);
                            if (str.equals(sb2.toString())) {
                                accountManager.removeAccount(account, null, null);
                                break;
                            }
                        } else {
                            accountArr = accountsByType;
                        }
                        i11++;
                        accountsByType = accountArr;
                    } else {
                        accountArr = accountsByType;
                        break;
                    }
                }
                i10++;
                accountsByType = accountArr;
            }
        } catch (Throwable unused) {
        }
        try {
            Account account2 = new Account("" + i5Var.getUserConfig().e(), "org.telegram.messenger");
            i5Var.f16211a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        i5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        i5Var.getMessagesStorage().c1(new ArrayList(), true);
        i5Var.f16212a0.clear();
        i5Var.f16218e0.clear();
        i5Var.f16220f0.clear();
        i5Var.f16221g0.clear();
        i5Var.f16223i0.clear();
        i5Var.f16222h0.clear();
        i5Var.f16214b0.clear();
        i5Var.f16216c0.clear();
        i5Var.f16217d0.clear();
        i5Var.f16231x.clear();
        i5Var.f16224j0.clear();
        i5Var.f16225k0.clear();
        i5Var.f16226l0.clear();
        i5Var.getNotificationCenter().k(at.O, new Object[0]);
        i5Var.A(0L, false);
        tu0Var.run();
    }

    private final void b() {
        ((i5) this.f15539b).a((TLRPC.User) this.f15540c);
    }

    private final void c() {
        i5 i5Var = (i5) this.f15539b;
        SparseArray sparseArray = (SparseArray) this.f15540c;
        if (i5Var.f16229s) {
            return;
        }
        i5Var.f16229s = true;
        HashMap hashMap = new HashMap();
        HashMap H = i5Var.H();
        HashMap hashMap2 = new HashMap();
        Iterator it = H.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f5 f5Var = (f5) ((Map.Entry) it.next()).getValue();
            for (int i10 = 0; i10 < f5Var.f15696g.size(); i10++) {
                hashMap2.put((String) f5Var.f15696g.get(i10), f5Var.f15693b);
            }
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            f5 f5Var2 = (f5) sparseArray.valueAt(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= f5Var2.f15696g.size()) {
                    break;
                }
                String str = (String) hashMap2.get((String) f5Var2.f15696g.get(i12));
                if (str != null) {
                    f5Var2.f15693b = str;
                    hashMap.put(str, f5Var2);
                    break;
                }
                i12++;
            }
        }
        if (v2.f18578a) {
            f8.b("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
        }
        i5Var.getMessagesStorage().Z0(hashMap, true, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.e4.run():void");
    }
}
