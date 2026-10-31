package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uu0;
public final class e4 implements Runnable {
    public final int f15365a;
    public final Object f15366b;
    public final Object f15367c;

    public e4(int i10, Object obj, Object obj2) {
        this.f15365a = i10;
        this.f15366b = obj;
        this.f15367c = obj2;
    }

    private final void a() {
        Account[] accountArr;
        i5 i5Var = (i5) this.f15366b;
        uu0 uu0Var = (uu0) this.f15367c;
        AccountManager accountManager = AccountManager.get(w0.f19025b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            i5Var.f16058a = null;
            int i10 = 0;
            while (i10 < accountsByType.length) {
                Account account = accountsByType[i10];
                int i11 = 0;
                while (true) {
                    if (i11 < 4) {
                        TLRPC.User f7 = d20.i(i11).f();
                        if (f7 != null) {
                            String str = account.name;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("");
                            accountArr = accountsByType;
                            sb2.append(f7.f19942id);
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
            i5Var.f16058a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        i5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        i5Var.getMessagesStorage().c1(new ArrayList(), true);
        i5Var.f16059a0.clear();
        i5Var.f16065e0.clear();
        i5Var.f16067f0.clear();
        i5Var.f16068g0.clear();
        i5Var.f16070i0.clear();
        i5Var.f16069h0.clear();
        i5Var.f16061b0.clear();
        i5Var.f16063c0.clear();
        i5Var.f16064d0.clear();
        i5Var.f16078x.clear();
        i5Var.f16071j0.clear();
        i5Var.f16072k0.clear();
        i5Var.f16073l0.clear();
        i5Var.getNotificationCenter().k(zs.O, new Object[0]);
        i5Var.A(0L, false);
        uu0Var.run();
    }

    private final void b() {
        ((i5) this.f15366b).a((TLRPC.User) this.f15367c);
    }

    private final void c() {
        i5 i5Var = (i5) this.f15366b;
        SparseArray sparseArray = (SparseArray) this.f15367c;
        if (i5Var.f16076s) {
            return;
        }
        i5Var.f16076s = true;
        HashMap hashMap = new HashMap();
        HashMap H = i5Var.H();
        HashMap hashMap2 = new HashMap();
        Iterator it = H.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f5 f5Var = (f5) ((Map.Entry) it.next()).getValue();
            for (int i10 = 0; i10 < f5Var.f15512g.size(); i10++) {
                hashMap2.put((String) f5Var.f15512g.get(i10), f5Var.f15509b);
            }
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            f5 f5Var2 = (f5) sparseArray.valueAt(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= f5Var2.f15512g.size()) {
                    break;
                }
                String str = (String) hashMap2.get((String) f5Var2.f15512g.get(i12));
                if (str != null) {
                    f5Var2.f15509b = str;
                    hashMap.put(str, f5Var2);
                    break;
                }
                i12++;
            }
        }
        if (v2.f18448a) {
            f8.b("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
        }
        i5Var.getMessagesStorage().Z0(hashMap, true, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.e4.run():void");
    }
}
