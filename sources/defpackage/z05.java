package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;
public final class z05 implements i8c {
    public final byte a;
    public final b b;
    public final TL_wallet.getTransactions c;

    public z05(b bVar, TL_wallet.getTransactions gettransactions, byte b) {
        this.a = b;
        this.b = bVar;
        this.c = gettransactions;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.a;
        TL_wallet.getTransactions gettransactions = this.c;
        b bVar = this.b;
        switch (b) {
            case 0:
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i = bVar.m.a;
                bVar.l = -1;
                int i2 = 0;
                bVar.k = false;
                if (wallettransactions != null) {
                    na7.q1(i).a4(wallettransactions.users, false);
                    na7.q1(i).U3(wallettransactions.chats, false);
                    int size = wallettransactions.transactions.size();
                    c.o(wallettransactions.transactions);
                    ArrayList<TL_wallet.walletTransaction> arrayList = wallettransactions.transactions;
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        TL_wallet.walletTransaction wallettransaction = arrayList.get(i2);
                        i2++;
                        TL_wallet.walletTransaction wallettransaction2 = wallettransaction;
                        if (wallettransaction2 != null) {
                            TL_wallet.walletTransaction c = bVar.c(wallettransaction2);
                            bVar.e(wallettransaction2);
                            if (c != null) {
                                c.set(wallettransaction2);
                                if (!TextUtils.equals(c.id, wallettransaction2.id)) {
                                    c.id = wallettransaction2.id;
                                }
                            } else {
                                bVar.b.add(wallettransaction2);
                            }
                        }
                    }
                    String str = wallettransactions.next_offset;
                    bVar.g = str;
                    if (size < gettransactions.limit || TextUtils.isEmpty(str)) {
                        bVar.h = true;
                    }
                } else {
                    bVar.h = true;
                }
                bVar.k();
                bVar.i();
                return;
            default:
                HashMap hashMap = bVar.f;
                HashSet hashSet = bVar.d;
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList2 = bVar.b;
                c cVar = bVar.m;
                int i3 = cVar.a;
                wz4 wz4Var = cVar.I;
                bVar.j = -1;
                bVar.i = false;
                if (wallettransactions2 != null) {
                    na7.q1(i3).a4(wallettransactions2.users, false);
                    na7.q1(i3).U3(wallettransactions2.chats, false);
                    int size3 = wallettransactions2.transactions.size();
                    c.o(wallettransactions2.transactions);
                    ArrayList<TL_wallet.walletTransaction> arrayList3 = wallettransactions2.transactions;
                    int size4 = arrayList3.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size4) {
                            TL_wallet.walletTransaction wallettransaction3 = arrayList3.get(i4);
                            i4++;
                            if (bVar.c(wallettransaction3) != null) {
                                boolean z4 = false;
                                for (int size5 = wallettransactions2.transactions.size() - 1; size5 >= 0; size5--) {
                                    TL_wallet.walletTransaction wallettransaction4 = wallettransactions2.transactions.get(size5);
                                    TL_wallet.walletTransaction c2 = bVar.c(wallettransaction4);
                                    bVar.e(wallettransaction4);
                                    if (c2 != null) {
                                        boolean q0 = c.q0(c2);
                                        boolean z5 = c2.set(wallettransaction4);
                                        if (!TextUtils.equals(c2.id, wallettransaction4.id)) {
                                            c2.id = wallettransaction4.id;
                                            z5 = true;
                                        }
                                        if (z5) {
                                            z4 = true;
                                        }
                                        if (!q0 && c.q0(c2)) {
                                            gl.r(wz4Var);
                                            gl.e3(wz4Var, 300L);
                                        }
                                    } else {
                                        arrayList2.add(0, wallettransaction4);
                                        if (c.q0(wallettransaction4)) {
                                            gl.r(wz4Var);
                                            gl.e3(wz4Var, 300L);
                                        }
                                        z4 = true;
                                    }
                                }
                                z = z4;
                            }
                        } else {
                            if (arrayList2.isEmpty() && !bVar.h) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            boolean z6 = bVar.k;
                            if (z6) {
                                bVar.a();
                            }
                            ArrayList arrayList4 = new ArrayList();
                            int size6 = arrayList2.size();
                            int i5 = 0;
                            while (i5 < size6) {
                                Object obj3 = arrayList2.get(i5);
                                i5++;
                                TL_wallet.walletTransaction wallettransaction5 = (TL_wallet.walletTransaction) obj3;
                                Iterator it = hashSet.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    } else if (hashMap.get((String) it.next()) == wallettransaction5) {
                                        arrayList4.add(wallettransaction5);
                                    }
                                }
                            }
                            ArrayList<TL_wallet.walletTransaction> arrayList5 = wallettransactions2.transactions;
                            int size7 = arrayList5.size();
                            int i6 = 0;
                            while (i6 < size7) {
                                TL_wallet.walletTransaction wallettransaction6 = arrayList5.get(i6);
                                i6++;
                                TL_wallet.walletTransaction wallettransaction7 = wallettransaction6;
                                bVar.e(wallettransaction7);
                                if (z2 && c.q0(wallettransaction7)) {
                                    gl.r(wz4Var);
                                    gl.e3(wz4Var, 300L);
                                }
                            }
                            arrayList2.clear();
                            arrayList2.addAll(wallettransactions2.transactions);
                            int size8 = arrayList4.size();
                            int i7 = 0;
                            while (i7 < size8) {
                                Object obj4 = arrayList4.get(i7);
                                i7++;
                                TL_wallet.walletTransaction wallettransaction8 = (TL_wallet.walletTransaction) obj4;
                                Iterator it2 = hashSet.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (hashMap.get((String) it2.next()) == wallettransaction8) {
                                        bVar.f(wallettransaction8);
                                    }
                                }
                            }
                            String str2 = wallettransactions2.next_offset;
                            bVar.g = str2;
                            if (size3 >= gettransactions.limit && !TextUtils.isEmpty(str2)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            bVar.h = z3;
                            if (z6) {
                                bVar.h();
                            }
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                if (z) {
                    bVar.k();
                    bVar.i();
                    return;
                }
                return;
        }
    }
}
