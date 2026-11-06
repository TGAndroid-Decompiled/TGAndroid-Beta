package jg;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.qp;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.vo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class l extends rg.a {
    public final TLRPC.Dialog f16817c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact f16818e;
    public final boolean f16819f;
    public final boolean f16820g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f16821i;
    public final int f16822j;
    public final int f16823k;
    public final String f16824l;
    public final TLRPC.Chat f16825m;
    public final TLRPC.User f16826n;

    public l(n nVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f16821i = tL_chatlists_chatlistUpdates;
        int i7 = nVar.W;
        nVar.W = i7 + 1;
        this.f16823k = i7;
    }

    public final int hashCode() {
        return Objects.hash(this.f16817c, this.f16825m, this.d, this.f16818e, this.f16824l);
    }

    public l(n nVar, String str) {
        super(22, false);
        HashMap hashMap = nVar.Y;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f16823k = num.intValue();
        } else {
            int i7 = nVar.W;
            nVar.W = i7 + 1;
            this.f16823k = i7;
            hashMap.put(str, Integer.valueOf(i7));
        }
        this.f16824l = str;
    }

    public l(n nVar, TLRPC.User user) {
        super(23, false);
        this.f16826n = user;
        long j3 = user.f27101id;
        LongSparseIntArray longSparseIntArray = nVar.X;
        int i7 = longSparseIntArray.get(j3, -1);
        if (i7 >= 0) {
            this.f16823k = i7;
            return;
        }
        int i10 = nVar.W;
        nVar.W = i10 + 1;
        this.f16823k = i10;
        longSparseIntArray.put(user.f27101id, i10);
    }

    public l(n nVar, TLRPC.Chat chat) {
        super(23, false);
        this.f16825m = chat;
        long j3 = chat.f26952id;
        LongSparseIntArray longSparseIntArray = nVar.X;
        int i7 = longSparseIntArray.get(-j3, -1);
        if (i7 >= 0) {
            this.f16823k = i7;
            return;
        }
        int i10 = nVar.W;
        nVar.W = i10 + 1;
        this.f16823k = i10;
        longSparseIntArray.put(-chat.f26952id, i10);
    }

    public l(n nVar, int i7, TLRPC.Dialog dialog) {
        super(i7, true);
        LongSparseIntArray longSparseIntArray = nVar.X;
        boolean z9 = true;
        this.f16817c = dialog;
        if (dialog != null) {
            int i10 = longSparseIntArray.get(dialog.f26956id, -1);
            if (i10 >= 0) {
                this.f16823k = i10;
            } else {
                int i11 = nVar.W;
                nVar.W = i11 + 1;
                this.f16823k = i11;
                longSparseIntArray.put(dialog.f26956id, i11);
            }
        } else if (i7 == 19) {
            this.f16823k = 5;
        } else {
            int i12 = nVar.W;
            nVar.W = i12 + 1;
            this.f16823k = i12;
        }
        if (dialog != null) {
            int i13 = nVar.h;
            int i14 = nVar.F;
            if (i13 != 7 && i13 != 8) {
                this.f16820g = dialog.pinned;
            } else {
                vo voVar = qp.s1(i14).M[nVar.h == 8 ? (char) 1 : (char) 0];
                this.f16820g = (voVar == null || voVar.f26063j.indexOfKey(dialog.f26956id) < 0) ? false : z9;
            }
            this.h = dialog.isFolder;
            this.f16819f = qp.s1(i14).t2(dialog.f26956id);
        }
    }

    public l(n nVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i7 = nVar.W;
        nVar.W = i7 + 1;
        this.f16823k = i7;
    }

    public l(n nVar, int i7) {
        super(i7, true);
        this.f16822j = i7;
        if (i7 == 10) {
            this.f16823k = 1;
        } else if (i7 == 19) {
            this.f16823k = 5;
        } else {
            int i10 = nVar.W;
            nVar.W = i10 + 1;
            this.f16823k = i10;
        }
    }

    public l(n nVar, int i7, int i10) {
        super(5, true);
        this.f16822j = i7;
        int i11 = nVar.W;
        nVar.W = i11 + 1;
        this.f16823k = i11;
    }

    public l(n nVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = nVar.X;
        this.f16818e = tL_contact;
        if (tL_contact != null) {
            int i7 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i7 > 0) {
                this.f16823k = i7;
                return;
            }
            int i10 = nVar.W;
            nVar.W = i10 + 1;
            this.f16823k = i10;
            longSparseIntArray.put(tL_contact.user_id, i10);
            return;
        }
        int i11 = nVar.W;
        nVar.W = i11 + 1;
        this.f16823k = i11;
    }
}
