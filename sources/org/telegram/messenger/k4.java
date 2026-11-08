package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k4 implements Runnable {
    public final int f23657a;
    public final g5 f23658b;

    public k4(g5 g5Var, int i7) {
        this.f23657a = i7;
        this.f23658b = g5Var;
    }

    private final void a() {
        g5 g5Var = this.f23658b;
        if (g5Var.f22608e0.isEmpty() && !g5Var.h) {
            g5Var.A(0L, true);
            return;
        }
        synchronized (g5Var.f22604c) {
            g5Var.f22602b = false;
        }
    }

    private final void b() {
        g5 g5Var = this.f23658b;
        synchronized (g5Var.f22604c) {
            g5Var.f22602b = false;
        }
        g5Var.getNotificationCenter().k(qs.O, new Object[0]);
    }

    @Override
    public final void run() {
        TLRPC.User f10;
        switch (this.f23657a) {
            case 0:
                g5 g5Var = this.f23658b;
                AccountManager accountManager = AccountManager.get(t0.f25566b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i7 = 0; i7 < accountsByType.length; i7++) {
                        Account account = accountsByType[i7];
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (p10.i(i10).f() != null) {
                                    if (account.name.equals("" + f10.f27105id)) {
                                        if (i10 == g5Var.currentAccount) {
                                            g5Var.f22600a = account;
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
                    synchronized (g5Var.f22604c) {
                        try {
                            if (!g5Var.f22602b) {
                                g5Var.f22602b = true;
                                Utilities.d.c(new k4(g5Var, 5));
                            }
                        } finally {
                        }
                    }
                    if (g5Var.f22600a == null) {
                        try {
                            Account account2 = new Account("" + g5Var.getUserConfig().e(), "org.telegram.messenger");
                            g5Var.f22600a = account2;
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
                g5 g5Var2 = this.f23658b;
                if (r2.f25212a) {
                    a8.b("force import contacts");
                }
                g5Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                this.f23658b.A(0L, false);
                return;
            case 3:
                g5 g5Var3 = this.f23658b;
                if (g5Var3.e()) {
                    if (r2.f25212a) {
                        a8.b("detected contacts change");
                    }
                    g5Var3.F(g5.q(g5Var3.Y), true, false, true, false, true, false);
                    return;
                }
                return;
            case 4:
                g5 g5Var4 = this.f23658b;
                g5Var4.f22619s = false;
                g5Var4.m0 = 0;
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                yr messagesStorage = this.f23658b.getMessagesStorage();
                messagesStorage.f26719a.c(new dr(messagesStorage, true, 0));
                return;
            case 8:
                g5 g5Var5 = this.f23658b;
                try {
                    if (g5.w()) {
                        t0.f25566b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new e5(g5Var5));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            default:
                g5 g5Var6 = this.f23658b;
                g5Var6.f22617n = true;
                g5Var6.getNotificationCenter().k(25, new Object[0]);
                return;
        }
    }
}
