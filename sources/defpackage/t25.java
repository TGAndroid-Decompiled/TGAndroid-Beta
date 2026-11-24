package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class t25 {
    public String e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public String m;
    public final c o;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f = "";
    public int n = -1;

    public t25(c cVar) {
        this.o = cVar;
        this.e = cVar.x();
    }

    public final void a() {
        if (this.n >= 0) {
            ConnectionsManager.getInstance(this.o.a).cancelRequest(this.n, true);
            this.n = -1;
        }
        if (this.j) {
            this.g = false;
            this.h = false;
        }
        this.j = false;
        this.i = false;
        this.k = false;
    }

    public final void b() {
        a();
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.f = "";
        this.g = false;
        this.h = false;
        this.m = null;
        g();
    }

    public final boolean c(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (c.b(((TL_wallet.nftItem) obj).address, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        if (this.j) {
            this.k = true;
            return;
        }
        a();
        f(true);
    }

    public final void e() {
        if (!this.i && !this.g) {
            f(!this.h);
        }
    }

    public final void f(final boolean z) {
        String str;
        int i;
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z) {
            str = "";
        } else {
            str = this.f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i = 5;
        } else {
            i = 20;
        }
        getnfts.limit = i;
        this.i = true;
        this.j = z;
        this.m = null;
        g();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.n = ConnectionsManager.getInstance(this.o.a).sendRequestTyped(getnfts, new kc((byte) 0), new jac() {
            @Override
            public final void a(Object obj, Object obj2) {
                String str2;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                t25 t25Var = t25.this;
                ArrayList arrayList = t25Var.b;
                ArrayList arrayList2 = t25Var.c;
                t25Var.n = -1;
                t25Var.j = false;
                t25Var.i = false;
                boolean z2 = z;
                if (nftitems != null) {
                    if (z2) {
                        arrayList.clear();
                        t25Var.l = elapsedRealtime;
                    }
                    ArrayList<TL_wallet.nftItem> arrayList3 = nftitems.items;
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TL_wallet.nftItem nftitem = arrayList3.get(i2);
                        i2++;
                        TL_wallet.nftItem nftitem2 = nftitem;
                        int i3 = 0;
                        while (true) {
                            if (i3 < arrayList.size()) {
                                if (c.b(((TL_wallet.nftItem) arrayList.get(i3)).address, nftitem2.address)) {
                                    arrayList.set(i3, nftitem2);
                                    break;
                                }
                                i3++;
                            } else {
                                arrayList.add(nftitem2);
                                break;
                            }
                        }
                    }
                    String str3 = nftitems.next_offset;
                    t25Var.f = str3;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    t25Var.g = isEmpty;
                    t25Var.h = true;
                    if (isEmpty) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size2);
                            if (!wallettransaction.pending && !wallettransaction.failed) {
                                String str4 = wallettransaction.nft.address;
                                int size3 = arrayList.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 < size3) {
                                        Object obj3 = arrayList.get(i4);
                                        i4++;
                                        if (c.b(((TL_wallet.nftItem) obj3).address, str4)) {
                                            break;
                                        }
                                    } else {
                                        arrayList2.remove(size2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    t25Var.j();
                } else {
                    if (z2) {
                        t25Var.g = false;
                        t25Var.h = false;
                    }
                    if (tL_error == null) {
                        str2 = "Could not load collectibles";
                    } else {
                        str2 = tL_error.text;
                    }
                    t25Var.m = str2;
                }
                if (t25Var.k) {
                    t25Var.k = false;
                    t25Var.d();
                    if (t25Var.i) {
                        return;
                    }
                }
                t25Var.g();
            }
        });
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
    }

    public final void h(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed) {
                    String str = wallettransaction.nft.address;
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            if (c.b(((TL_wallet.nftItem) obj2).address, str)) {
                                break;
                            }
                        } else {
                            arrayList2.add(0, wallettransaction.nft);
                            break;
                        }
                    }
                }
                j();
                g();
                return;
            }
        }
    }

    public final void i(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
                TL_stars.StarGift starGift = nftitem.gift;
                if ((starGift instanceof TL_stars.TL_starGiftUnique) && starGift != tL_starGiftUnique && TextUtils.equals(((TL_stars.TL_starGiftUnique) starGift).slug, tL_starGiftUnique.slug)) {
                    nftitem.gift = tL_starGiftUnique;
                    z = true;
                }
            }
            if (z) {
                g();
            }
        }
    }

    public final void j() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.c;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (true) {
                if (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                    if (wallettransaction.failed || !c.b(wallettransaction.nft.address, nftitem.address)) {
                    }
                } else {
                    arrayList.add(nftitem);
                    break;
                }
            }
        }
    }
}
