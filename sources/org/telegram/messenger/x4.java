package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Runnable {
    public final int f26432a;
    public final g5 f26433b;

    public x4(g5 g5Var, int i7) {
        this.f26432a = i7;
        this.f26433b = g5Var;
    }

    private final void a() {
        g5 g5Var = this.f26433b;
        if (g5Var.f22589e0.isEmpty() && !g5Var.h) {
            g5Var.A(0L, true);
            return;
        }
        synchronized (g5Var.f22585c) {
            g5Var.f22583b = false;
        }
    }

    private final void b() {
        g5 g5Var = this.f26433b;
        synchronized (g5Var.f22585c) {
            g5Var.f22583b = false;
        }
        g5Var.getNotificationCenter().k(qs.O, new Object[0]);
    }

    @Override
    public final void run() {
        TLRPC.User f10;
        switch (this.f26432a) {
            case 0:
                g5 g5Var = this.f26433b;
                AccountManager accountManager = AccountManager.get(t0.f25563b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i7 = 0; i7 < accountsByType.length; i7++) {
                        Account account = accountsByType[i7];
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (p10.i(i10).f() != null) {
                                    if (account.name.equals("" + f10.f27102id)) {
                                        if (i10 == g5Var.currentAccount) {
                                            g5Var.f22581a = account;
                                        }
                                    }
                                }
                                i10++;
                            } else {
                                try {
                                    accountManager.removeAccount(accountsByType[i7], null, null);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                if (g5Var.getUserConfig().p()) {
                    synchronized (g5Var.f22585c) {
                        try {
                            if (!g5Var.f22583b) {
                                g5Var.f22583b = true;
                                Utilities.d.c(new x4(g5Var, 2));
                            }
                        } finally {
                        }
                    }
                    if (g5Var.f22581a == null) {
                        try {
                            Account account2 = new Account("" + g5Var.getUserConfig().e(), "org.telegram.messenger");
                            g5Var.f22581a = account2;
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
                g5 g5Var2 = this.f26433b;
                if (r2.f25199a) {
                    a8.b("force import contacts");
                }
                g5Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                a();
                return;
            case 3:
                this.f26433b.A(0L, false);
                return;
            case 4:
                g5 g5Var3 = this.f26433b;
                if (g5Var3.e()) {
                    if (r2.f25199a) {
                        a8.b("detected contacts change");
                    }
                    g5Var3.F(g5.q(g5Var3.Y), true, false, true, false, true, false);
                    return;
                }
                return;
            case 5:
                g5 g5Var4 = this.f26433b;
                g5Var4.f22600s = false;
                g5Var4.m0 = 0;
                return;
            case 6:
                b();
                return;
            case 7:
                yr messagesStorage = this.f26433b.getMessagesStorage();
                messagesStorage.f26696a.c(new dr(messagesStorage, true, 0));
                return;
            case 8:
                g5 g5Var5 = this.f26433b;
                g5Var5.f22598n = true;
                g5Var5.getNotificationCenter().k(25, new Object[0]);
                return;
            default:
                g5 g5Var6 = this.f26433b;
                try {
                    if (g5.w()) {
                        t0.f25563b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new e5(g5Var6));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
        }
    }
}
