package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k4 implements Runnable {
    public final int f24637a;
    public final g5 f24638b;

    public k4(g5 g5Var, int i7) {
        this.f24637a = i7;
        this.f24638b = g5Var;
    }

    private final void a() {
        g5 g5Var = this.f24638b;
        if (g5Var.f23679f0.isEmpty() && !g5Var.h) {
            g5Var.A(0L, true);
            return;
        }
        synchronized (g5Var.f23673c) {
            g5Var.f23671b = false;
        }
    }

    private final void b() {
        g5 g5Var = this.f24638b;
        synchronized (g5Var.f23673c) {
            g5Var.f23671b = false;
        }
        g5Var.getNotificationCenter().k(ns.O, new Object[0]);
    }

    @Override
    public final void run() {
        TLRPC.User f10;
        switch (this.f24637a) {
            case 0:
                g5 g5Var = this.f24638b;
                AccountManager accountManager = AccountManager.get(t0.f26600b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i7 = 0; i7 < accountsByType.length; i7++) {
                        Account account = accountsByType[i7];
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (m10.i(i10).f() != null) {
                                    if (account.name.equals("" + f10.f28200id)) {
                                        if (i10 == g5Var.currentAccount) {
                                            g5Var.f23669a = account;
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
                    synchronized (g5Var.f23673c) {
                        try {
                            if (!g5Var.f23671b) {
                                g5Var.f23671b = true;
                                Utilities.d.c(new k4(g5Var, 5));
                            }
                        } finally {
                        }
                    }
                    if (g5Var.f23669a == null) {
                        try {
                            Account account2 = new Account("" + g5Var.getUserConfig().e(), "org.telegram.messenger");
                            g5Var.f23669a = account2;
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
                g5 g5Var2 = this.f24638b;
                if (r2.f26198a) {
                    a8.b("force import contacts");
                }
                g5Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                this.f24638b.A(0L, false);
                return;
            case 3:
                g5 g5Var3 = this.f24638b;
                if (g5Var3.e()) {
                    if (r2.f26198a) {
                        a8.b("detected contacts change");
                    }
                    g5Var3.F(g5.q(g5Var3.Z), true, false, true, false, true, false);
                    return;
                }
                return;
            case 4:
                g5 g5Var4 = this.f24638b;
                g5Var4.f23689s = false;
                g5Var4.f23687n0 = 0;
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                vr messagesStorage = this.f24638b.getMessagesStorage();
                messagesStorage.f27220a.c(new ar(messagesStorage, true, 0));
                return;
            case 8:
                g5 g5Var5 = this.f24638b;
                try {
                    if (g5.w()) {
                        t0.f26600b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new e5(g5Var5));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            default:
                g5 g5Var6 = this.f24638b;
                g5Var6.f23686n = true;
                g5Var6.getNotificationCenter().k(25, new Object[0]);
                return;
        }
    }
}
