package jg;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.mp;
import org.telegram.messenger.ro;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k extends rg.a {
    public final TLRPC.Dialog f17549c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact f17550e;
    public final boolean f17551f;
    public final boolean f17552g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f17553i;
    public final int f17554j;
    public final int f17555k;
    public final String f17556l;
    public final TLRPC.Chat f17557m;
    public final TLRPC.User f17558n;

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f17553i = tL_chatlists_chatlistUpdates;
        int i7 = mVar.X;
        mVar.X = i7 + 1;
        this.f17555k = i7;
    }

    public final int hashCode() {
        return Objects.hash(this.f17549c, this.f17557m, this.d, this.f17550e, this.f17556l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.Z;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f17555k = num.intValue();
        } else {
            int i7 = mVar.X;
            mVar.X = i7 + 1;
            this.f17555k = i7;
            hashMap.put(str, Integer.valueOf(i7));
        }
        this.f17556l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.f17558n = user;
        long j3 = user.f28554id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i7 = longSparseIntArray.get(j3, -1);
        if (i7 >= 0) {
            this.f17555k = i7;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17555k = i10;
        longSparseIntArray.put(user.f28554id, i10);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.f17557m = chat;
        long j3 = chat.f28405id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i7 = longSparseIntArray.get(-j3, -1);
        if (i7 >= 0) {
            this.f17555k = i7;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17555k = i10;
        longSparseIntArray.put(-chat.f28405id, i10);
    }

    public k(m mVar, int i7, TLRPC.Dialog dialog) {
        super(i7, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        boolean z10 = true;
        this.f17549c = dialog;
        if (dialog != null) {
            int i10 = longSparseIntArray.get(dialog.f28409id, -1);
            if (i10 >= 0) {
                this.f17555k = i10;
            } else {
                int i11 = mVar.X;
                mVar.X = i11 + 1;
                this.f17555k = i11;
                longSparseIntArray.put(dialog.f28409id, i11);
            }
        } else if (i7 == 19) {
            this.f17555k = 5;
        } else {
            int i12 = mVar.X;
            mVar.X = i12 + 1;
            this.f17555k = i12;
        }
        if (dialog != null) {
            int i13 = mVar.h;
            int i14 = mVar.G;
            if (i13 != 7 && i13 != 8) {
                this.f17552g = dialog.pinned;
            } else {
                ro roVar = mp.u1(i14).N[mVar.h == 8 ? (char) 1 : (char) 0];
                this.f17552g = (roVar == null || roVar.f26681j.indexOfKey(dialog.f28409id) < 0) ? false : z10;
            }
            this.h = dialog.isFolder;
            this.f17551f = mp.u1(i14).y2(dialog.f28409id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i7 = mVar.X;
        mVar.X = i7 + 1;
        this.f17555k = i7;
    }

    public k(m mVar, int i7) {
        super(i7, true);
        this.f17554j = i7;
        if (i7 == 10) {
            this.f17555k = 1;
        } else if (i7 == 19) {
            this.f17555k = 5;
        } else {
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17555k = i10;
        }
    }

    public k(m mVar, int i7, int i10) {
        super(5, true);
        this.f17554j = i7;
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17555k = i11;
    }

    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        this.f17550e = tL_contact;
        if (tL_contact != null) {
            int i7 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i7 > 0) {
                this.f17555k = i7;
                return;
            }
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17555k = i10;
            longSparseIntArray.put(tL_contact.user_id, i10);
            return;
        }
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17555k = i11;
    }
}
