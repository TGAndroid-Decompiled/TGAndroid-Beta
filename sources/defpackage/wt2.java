package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class wt2 implements Runnable {
    public final byte a;
    public final qu2 b;

    public wt2(qu2 qu2Var, byte b) {
        this.a = b;
        this.b = qu2Var;
    }

    private final void a() {
        qu2 qu2Var = this.b;
        if (qu2Var.f0.isEmpty() && !qu2Var.h) {
            qu2Var.A(0L, true);
            return;
        }
        synchronized (qu2Var.c) {
            qu2Var.b = false;
        }
    }

    private final void b() {
        qu2 qu2Var = this.b;
        synchronized (qu2Var.c) {
            qu2Var.b = false;
        }
        qu2Var.getNotificationCenter().k(kk7.N, new Object[0]);
    }

    @Override
    public final void run() {
        TLRPC.User f;
        switch (this.a) {
            case 0:
                qu2 qu2Var = this.b;
                AccountManager accountManager = AccountManager.get(a.b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i = 0; i < accountsByType.length; i++) {
                        Account account = accountsByType[i];
                        int i2 = 0;
                        while (true) {
                            if (i2 < 4) {
                                if (y6c.h(i2).f() != null) {
                                    if (account.name.equals("" + f.id)) {
                                        if (i2 == qu2Var.currentAccount) {
                                            qu2Var.a = account;
                                        }
                                    }
                                }
                                i2++;
                            } else {
                                try {
                                    accountManager.removeAccount(accountsByType[i], null, null);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                if (qu2Var.getUserConfig().o()) {
                    synchronized (qu2Var.c) {
                        if (!qu2Var.b) {
                            qu2Var.b = true;
                            Utilities.d.c(new wt2(qu2Var, (byte) 5));
                        }
                    }
                    if (qu2Var.a == null) {
                        try {
                            Account account2 = new Account("" + qu2Var.getUserConfig().e(), "org.telegram.messenger");
                            qu2Var.a = account2;
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
                qu2 qu2Var2 = this.b;
                if (w01.a) {
                    fa4.b("force import contacts");
                }
                qu2Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                this.b.A(0L, false);
                return;
            case 3:
                qu2 qu2Var3 = this.b;
                if (qu2Var3.e()) {
                    if (w01.a) {
                        fa4.b("detected contacts change");
                    }
                    qu2Var3.F(qu2.q(qu2Var3.Z), true, false, true, false, true, false);
                    return;
                }
                return;
            case 4:
                qu2 qu2Var4 = this.b;
                qu2Var4.s = false;
                qu2Var4.n0 = 0;
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                ad7 messagesStorage = this.b.getMessagesStorage();
                messagesStorage.a.c(new cc7(messagesStorage, true, (byte) 0));
                return;
            case 8:
                qu2 qu2Var5 = this.b;
                try {
                    if (qu2.w()) {
                        a.b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new ou2(qu2Var5));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            default:
                qu2 qu2Var6 = this.b;
                qu2Var6.n = true;
                qu2Var6.getNotificationCenter().k(25, new Object[0]);
                return;
        }
    }
}
