package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k4 implements Runnable {
    public final int f24640a;
    public final g5 f24641b;

    public k4(g5 g5Var, int i7) {
        this.f24640a = i7;
        this.f24641b = g5Var;
    }

    private final void a() {
        g5 g5Var = this.f24641b;
        if (g5Var.f23681f0.isEmpty() && !g5Var.h) {
            g5Var.A(0L, true);
            return;
        }
        synchronized (g5Var.f23675c) {
            g5Var.f23673b = false;
        }
    }

    private final void b() {
        g5 g5Var = this.f24641b;
        synchronized (g5Var.f23675c) {
            g5Var.f23673b = false;
        }
        g5Var.getNotificationCenter().k(ns.O, new Object[0]);
    }

    @Override
    public final void run() {
        TLRPC.User f10;
        switch (this.f24640a) {
            case 0:
                g5 g5Var = this.f24641b;
                AccountManager accountManager = AccountManager.get(t0.f26609b);
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
                                            g5Var.f23671a = account;
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
                    synchronized (g5Var.f23675c) {
                        try {
                            if (!g5Var.f23673b) {
                                g5Var.f23673b = true;
                                Utilities.d.c(new k4(g5Var, 5));
                            }
                        } finally {
                        }
                    }
                    if (g5Var.f23671a == null) {
                        try {
                            Account account2 = new Account("" + g5Var.getUserConfig().e(), "org.telegram.messenger");
                            g5Var.f23671a = account2;
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
                g5 g5Var2 = this.f24641b;
                if (r2.f26206a) {
                    a8.b("force import contacts");
                }
                g5Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                this.f24641b.A(0L, false);
                return;
            case 3:
                g5 g5Var3 = this.f24641b;
                if (g5Var3.e()) {
                    if (r2.f26206a) {
                        a8.b("detected contacts change");
                    }
                    g5Var3.F(g5.q(g5Var3.Z), true, false, true, false, true, false);
                    return;
                }
                return;
            case 4:
                g5 g5Var4 = this.f24641b;
                g5Var4.f23691s = false;
                g5Var4.f23689n0 = 0;
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                vr messagesStorage = this.f24641b.getMessagesStorage();
                messagesStorage.f27219a.c(new zq(messagesStorage, true, 0));
                return;
            case 8:
                g5 g5Var5 = this.f24641b;
                try {
                    if (g5.w()) {
                        t0.f26609b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new e5(g5Var5));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            default:
                g5 g5Var6 = this.f24641b;
                g5Var6.f23688n = true;
                g5Var6.getNotificationCenter().k(25, new Object[0]);
                return;
        }
    }
}
