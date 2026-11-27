package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class pu2 implements Runnable {
    public final byte a;
    public final lv2 b;

    public pu2(lv2 lv2Var, byte b) {
        this.a = b;
        this.b = lv2Var;
    }

    private final void a() {
        lv2 lv2Var = this.b;
        if (lv2Var.f0.isEmpty() && !lv2Var.h) {
            lv2Var.A(0L, true);
            return;
        }
        synchronized (lv2Var.c) {
            lv2Var.b = false;
        }
    }

    private final void b() {
        lv2 lv2Var = this.b;
        synchronized (lv2Var.c) {
            lv2Var.b = false;
        }
        lv2Var.getNotificationCenter().k(jn7.N, new Object[0]);
    }

    @Override
    public final void run() {
        TLRPC.User f;
        switch (this.a) {
            case 0:
                lv2 lv2Var = this.b;
                AccountManager accountManager = AccountManager.get(a.b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i = 0; i < accountsByType.length; i++) {
                        Account account = accountsByType[i];
                        int i2 = 0;
                        while (true) {
                            if (i2 < 4) {
                                if (yac.h(i2).f() != null) {
                                    if (account.name.equals("" + f.id)) {
                                        if (i2 == lv2Var.currentAccount) {
                                            lv2Var.a = account;
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
                if (lv2Var.getUserConfig().o()) {
                    synchronized (lv2Var.c) {
                        if (!lv2Var.b) {
                            lv2Var.b = true;
                            Utilities.d.c(new pu2(lv2Var, (byte) 5));
                        }
                    }
                    if (lv2Var.a == null) {
                        try {
                            Account account2 = new Account("" + lv2Var.getUserConfig().e(), "org.telegram.messenger");
                            lv2Var.a = account2;
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
                lv2 lv2Var2 = this.b;
                if (f11.a) {
                    cc4.b("force import contacts");
                }
                lv2Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                this.b.A(0L, false);
                return;
            case 3:
                lv2 lv2Var3 = this.b;
                if (lv2Var3.e()) {
                    if (f11.a) {
                        cc4.b("detected contacts change");
                    }
                    lv2Var3.F(lv2.q(lv2Var3.Z), true, false, true, false, true, false);
                    return;
                }
                return;
            case 4:
                lv2 lv2Var4 = this.b;
                lv2Var4.s = false;
                lv2Var4.n0 = 0;
                return;
            case 5:
                a();
                return;
            case 6:
                lv2 lv2Var5 = this.b;
                try {
                    if (lv2.w()) {
                        a.b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new jv2(lv2Var5));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            case 7:
                b();
                return;
            case 8:
                jf7 messagesStorage = this.b.getMessagesStorage();
                messagesStorage.a.c(new je7(messagesStorage, true, (byte) 0));
                return;
            default:
                lv2 lv2Var6 = this.b;
                lv2Var6.n = true;
                lv2Var6.getNotificationCenter().k(25, new Object[0]);
                return;
        }
    }
}
