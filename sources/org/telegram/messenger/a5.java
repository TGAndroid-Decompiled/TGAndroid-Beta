package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class a5 implements Runnable {
    public final int f14576a;
    public final i5 f14577b;

    public a5(i5 i5Var, int i10) {
        this.f14576a = i10;
        this.f14577b = i5Var;
    }

    private final void a() {
        i5 i5Var = this.f14577b;
        if (i5Var.f16065e0.isEmpty() && !i5Var.h) {
            i5Var.A(0L, true);
            return;
        }
        synchronized (i5Var.f16062c) {
            i5Var.f16060b = false;
        }
    }

    private final void b() {
        i5 i5Var = this.f14577b;
        synchronized (i5Var.f16062c) {
            i5Var.f16060b = false;
        }
        i5Var.getNotificationCenter().k(zs.O, new Object[0]);
    }

    @Override
    public final void run() {
        TLRPC.User f7;
        switch (this.f14576a) {
            case 0:
                i5 i5Var = this.f14577b;
                AccountManager accountManager = AccountManager.get(w0.f19025b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i10 = 0; i10 < accountsByType.length; i10++) {
                        Account account = accountsByType[i10];
                        int i11 = 0;
                        while (true) {
                            if (i11 < 4) {
                                if (d20.i(i11).f() != null) {
                                    if (account.name.equals("" + f7.f19942id)) {
                                        if (i11 == i5Var.currentAccount) {
                                            i5Var.f16058a = account;
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
                    synchronized (i5Var.f16062c) {
                        try {
                            if (!i5Var.f16060b) {
                                i5Var.f16060b = true;
                                Utilities.d.c(new a5(i5Var, 2));
                            }
                        } finally {
                        }
                    }
                    if (i5Var.f16058a == null) {
                        try {
                            Account account2 = new Account("" + i5Var.getUserConfig().e(), "org.telegram.messenger");
                            i5Var.f16058a = account2;
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
                i5 i5Var2 = this.f14577b;
                if (v2.f18448a) {
                    f8.b("force import contacts");
                }
                i5Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                a();
                return;
            case 3:
                this.f14577b.A(0L, false);
                return;
            case 4:
                i5 i5Var3 = this.f14577b;
                if (i5Var3.e()) {
                    if (v2.f18448a) {
                        f8.b("detected contacts change");
                    }
                    i5Var3.F(i5.q(i5Var3.Y), true, false, true, false, true, false);
                    return;
                }
                return;
            case 5:
                i5 i5Var4 = this.f14577b;
                i5Var4.f16076s = false;
                i5Var4.m0 = 0;
                return;
            case 6:
                b();
                return;
            case 7:
                hs messagesStorage = this.f14577b.getMessagesStorage();
                messagesStorage.f15938a.c(new kr(messagesStorage, true, 0));
                return;
            case 8:
                i5 i5Var5 = this.f14577b;
                i5Var5.f16074n = true;
                i5Var5.getNotificationCenter().k(25, new Object[0]);
                return;
            default:
                i5 i5Var6 = this.f14577b;
                try {
                    if (i5.w()) {
                        w0.f19025b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new g5(i5Var6));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
        }
    }
}
