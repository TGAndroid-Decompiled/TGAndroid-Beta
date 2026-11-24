package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class hv2 implements Runnable {
    public final byte a;
    public final bw2 b;

    public hv2(bw2 bw2Var, byte b) {
        this.a = b;
        this.b = bw2Var;
    }

    private final void a() {
        bw2 bw2Var = this.b;
        if (bw2Var.f0.isEmpty() && !bw2Var.h) {
            bw2Var.A(0L, true);
            return;
        }
        synchronized (bw2Var.c) {
            bw2Var.b = false;
        }
    }

    private final void b() {
        bw2 bw2Var = this.b;
        synchronized (bw2Var.c) {
            bw2Var.b = false;
        }
        bw2Var.getNotificationCenter().k(nm7.N, new Object[0]);
    }

    @Override
    public final void run() {
        TLRPC.User f;
        switch (this.a) {
            case 0:
                bw2 bw2Var = this.b;
                AccountManager accountManager = AccountManager.get(a.b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i = 0; i < accountsByType.length; i++) {
                        Account account = accountsByType[i];
                        int i2 = 0;
                        while (true) {
                            if (i2 < 4) {
                                if (z8c.h(i2).f() != null) {
                                    if (account.name.equals("" + f.id)) {
                                        if (i2 == bw2Var.currentAccount) {
                                            bw2Var.a = account;
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
                if (bw2Var.getUserConfig().o()) {
                    synchronized (bw2Var.c) {
                        if (!bw2Var.b) {
                            bw2Var.b = true;
                            Utilities.d.c(new hv2(bw2Var, (byte) 5));
                        }
                    }
                    if (bw2Var.a == null) {
                        try {
                            Account account2 = new Account("" + bw2Var.getUserConfig().e(), "org.telegram.messenger");
                            bw2Var.a = account2;
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
                bw2 bw2Var2 = this.b;
                if (e21.a) {
                    fc4.b("force import contacts");
                }
                bw2Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                this.b.A(0L, false);
                return;
            case 3:
                bw2 bw2Var3 = this.b;
                if (bw2Var3.e()) {
                    if (e21.a) {
                        fc4.b("detected contacts change");
                    }
                    bw2Var3.F(bw2.q(bw2Var3.Z), true, false, true, false, true, false);
                    return;
                }
                return;
            case 4:
                bw2 bw2Var4 = this.b;
                bw2Var4.s = false;
                bw2Var4.n0 = 0;
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                cf7 messagesStorage = this.b.getMessagesStorage();
                messagesStorage.a.c(new ee7(messagesStorage, true, (byte) 0));
                return;
            case 8:
                bw2 bw2Var5 = this.b;
                try {
                    if (bw2.w()) {
                        a.b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new zv2(bw2Var5));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            default:
                bw2 bw2Var6 = this.b;
                bw2Var6.n = true;
                bw2Var6.getNotificationCenter().k(25, new Object[0]);
                return;
        }
    }
}
