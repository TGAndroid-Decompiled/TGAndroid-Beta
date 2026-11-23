package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class m4 implements Runnable {
    public final int f25482a;
    public final i5 f25483b;

    public m4(i5 i5Var, int i7) {
        this.f25482a = i7;
        this.f25483b = i5Var;
    }

    private final void a() {
        i5 i5Var = this.f25483b;
        if (i5Var.f24569f0.isEmpty() && !i5Var.h) {
            i5Var.A(0L, true);
            return;
        }
        synchronized (i5Var.f24563c) {
            i5Var.f24561b = false;
        }
    }

    private final void b() {
        i5 i5Var = this.f25483b;
        synchronized (i5Var.f24563c) {
            i5Var.f24561b = false;
        }
        i5Var.getNotificationCenter().k(ls.O, new Object[0]);
    }

    @Override
    public final void run() {
        TLRPC.User f10;
        switch (this.f25482a) {
            case 0:
                i5 i5Var = this.f25483b;
                AccountManager accountManager = AccountManager.get(t0.f26895b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i7 = 0; i7 < accountsByType.length; i7++) {
                        Account account = accountsByType[i7];
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (k10.i(i10).f() != null) {
                                    if (account.name.equals("" + f10.f28547id)) {
                                        if (i10 == i5Var.currentAccount) {
                                            i5Var.f24559a = account;
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
                if (i5Var.getUserConfig().p()) {
                    synchronized (i5Var.f24563c) {
                        try {
                            if (!i5Var.f24561b) {
                                i5Var.f24561b = true;
                                Utilities.d.c(new m4(i5Var, 5));
                            }
                        } finally {
                        }
                    }
                    if (i5Var.f24559a == null) {
                        try {
                            Account account2 = new Account("" + i5Var.getUserConfig().e(), "org.telegram.messenger");
                            i5Var.f24559a = account2;
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
                i5 i5Var2 = this.f25483b;
                if (s2.f26694a) {
                    a8.b("force import contacts");
                }
                i5Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                this.f25483b.A(0L, false);
                return;
            case 3:
                i5 i5Var3 = this.f25483b;
                if (i5Var3.e()) {
                    if (s2.f26694a) {
                        a8.b("detected contacts change");
                    }
                    i5Var3.F(i5.q(i5Var3.Z), true, false, true, false, true, false);
                    return;
                }
                return;
            case 4:
                i5 i5Var4 = this.f25483b;
                i5Var4.f24579s = false;
                i5Var4.f24577n0 = 0;
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                ur messagesStorage = this.f25483b.getMessagesStorage();
                messagesStorage.f27214a.c(new zq(messagesStorage, true, 0));
                return;
            case 8:
                i5 i5Var5 = this.f25483b;
                try {
                    if (i5.w()) {
                        t0.f26895b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new g5(i5Var5));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            default:
                i5 i5Var6 = this.f25483b;
                i5Var6.f24576n = true;
                i5Var6.getNotificationCenter().k(25, new Object[0]);
                return;
        }
    }
}
