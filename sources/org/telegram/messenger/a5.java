package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class a5 implements Runnable {
    public final int f14566a;
    public final i5 f14567b;

    public a5(i5 i5Var, int i10) {
        this.f14566a = i10;
        this.f14567b = i5Var;
    }

    private final void a() {
        i5 i5Var = this.f14567b;
        if (i5Var.f16218e0.isEmpty() && !i5Var.h) {
            i5Var.A(0L, true);
            return;
        }
        synchronized (i5Var.f16215c) {
            i5Var.f16213b = false;
        }
    }

    private final void b() {
        i5 i5Var = this.f14567b;
        synchronized (i5Var.f16215c) {
            i5Var.f16213b = false;
        }
        i5Var.getNotificationCenter().k(at.O, new Object[0]);
    }

    @Override
    public final void run() {
        TLRPC.User f7;
        switch (this.f14566a) {
            case 0:
                i5 i5Var = this.f14567b;
                AccountManager accountManager = AccountManager.get(w0.f18945b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i10 = 0; i10 < accountsByType.length; i10++) {
                        Account account = accountsByType[i10];
                        int i11 = 0;
                        while (true) {
                            if (i11 < 4) {
                                if (e20.i(i11).f() != null) {
                                    if (account.name.equals("" + f7.f19943id)) {
                                        if (i11 == i5Var.currentAccount) {
                                            i5Var.f16211a = account;
                                        }
                                    }
                                }
                                i11++;
                            } else {
                                try {
                                    accountManager.removeAccount(accountsByType[i10], null, null);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                if (i5Var.getUserConfig().p()) {
                    synchronized (i5Var.f16215c) {
                        try {
                            if (!i5Var.f16213b) {
                                i5Var.f16213b = true;
                                Utilities.d.c(new a5(i5Var, 2));
                            }
                        } finally {
                        }
                    }
                    if (i5Var.f16211a == null) {
                        try {
                            Account account2 = new Account("" + i5Var.getUserConfig().e(), "org.telegram.messenger");
                            i5Var.f16211a = account2;
                            accountManager.addAccountExplicitly(account2, "", null);
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                i5 i5Var2 = this.f14567b;
                if (v2.f18578a) {
                    f8.b("force import contacts");
                }
                i5Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                a();
                return;
            case 3:
                this.f14567b.A(0L, false);
                return;
            case 4:
                i5 i5Var3 = this.f14567b;
                if (i5Var3.e()) {
                    if (v2.f18578a) {
                        f8.b("detected contacts change");
                    }
                    i5Var3.F(i5.q(i5Var3.Y), true, false, true, false, true, false);
                    return;
                }
                return;
            case 5:
                i5 i5Var4 = this.f14567b;
                i5Var4.f16229s = false;
                i5Var4.m0 = 0;
                return;
            case 6:
                b();
                return;
            case 7:
                is messagesStorage = this.f14567b.getMessagesStorage();
                messagesStorage.f16331a.c(new lr(messagesStorage, true, 0));
                return;
            case 8:
                i5 i5Var5 = this.f14567b;
                i5Var5.f16227n = true;
                i5Var5.getNotificationCenter().k(25, new Object[0]);
                return;
            default:
                i5 i5Var6 = this.f14567b;
                try {
                    if (i5.w()) {
                        w0.f18945b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new g5(i5Var6));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
        }
    }
}
