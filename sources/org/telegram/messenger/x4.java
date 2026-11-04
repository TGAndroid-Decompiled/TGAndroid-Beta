package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Runnable {
    public final int f26343a;
    public final g5 f26344b;

    public x4(g5 g5Var, int i3) {
        this.f26343a = i3;
        this.f26344b = g5Var;
    }

    private final void a() {
        g5 g5Var = this.f26344b;
        if (g5Var.f22653f0.isEmpty() && !g5Var.h) {
            g5Var.A(0L, true);
            return;
        }
        synchronized (g5Var.f22647c) {
            g5Var.f22645b = false;
        }
    }

    private final void b() {
        g5 g5Var = this.f26344b;
        synchronized (g5Var.f22647c) {
            g5Var.f22645b = false;
        }
        g5Var.getNotificationCenter().k(hs.O, new Object[0]);
    }

    @Override
    public final void run() {
        TLRPC.User f10;
        switch (this.f26343a) {
            case 0:
                g5 g5Var = this.f26344b;
                AccountManager accountManager = AccountManager.get(t0.f25457b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i3 = 0; i3 < accountsByType.length; i3++) {
                        Account account = accountsByType[i3];
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (h10.i(i10).f() != null) {
                                    if (account.name.equals("" + f10.f27150id)) {
                                        if (i10 == g5Var.currentAccount) {
                                            g5Var.f22643a = account;
                                        }
                                    }
                                }
                                i10++;
                            } else {
                                try {
                                    accountManager.removeAccount(accountsByType[i3], null, null);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                if (g5Var.getUserConfig().p()) {
                    synchronized (g5Var.f22647c) {
                        try {
                            if (!g5Var.f22645b) {
                                g5Var.f22645b = true;
                                Utilities.d.c(new x4(g5Var, 2));
                            }
                        } finally {
                        }
                    }
                    if (g5Var.f22643a == null) {
                        try {
                            Account account2 = new Account("" + g5Var.getUserConfig().e(), "org.telegram.messenger");
                            g5Var.f22643a = account2;
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
                g5 g5Var2 = this.f26344b;
                if (r2.f25040a) {
                    a8.b("force import contacts");
                }
                g5Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                a();
                return;
            case 3:
                this.f26344b.A(0L, false);
                return;
            case 4:
                g5 g5Var3 = this.f26344b;
                if (g5Var3.e()) {
                    if (r2.f25040a) {
                        a8.b("detected contacts change");
                    }
                    g5Var3.F(g5.q(g5Var3.Z), true, false, true, false, true, false);
                    return;
                }
                return;
            case 5:
                g5 g5Var4 = this.f26344b;
                g5Var4.f22663s = false;
                g5Var4.f22661n0 = 0;
                return;
            case 6:
                b();
                return;
            case 7:
                qr messagesStorage = this.f26344b.getMessagesStorage();
                messagesStorage.f24934a.c(new vq(messagesStorage, true, 0));
                return;
            case 8:
                g5 g5Var5 = this.f26344b;
                g5Var5.f22660n = true;
                g5Var5.getNotificationCenter().k(25, new Object[0]);
                return;
            default:
                g5 g5Var6 = this.f26344b;
                try {
                    if (g5.w()) {
                        t0.f25457b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new e5(g5Var6));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
        }
    }
}
