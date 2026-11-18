package jg;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.mp;
import org.telegram.messenger.ro;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k extends rg.a {
    public final TLRPC.Dialog f17546c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact f17547e;
    public final boolean f17548f;
    public final boolean f17549g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f17550i;
    public final int f17551j;
    public final int f17552k;
    public final String f17553l;
    public final TLRPC.Chat f17554m;
    public final TLRPC.User f17555n;

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f17550i = tL_chatlists_chatlistUpdates;
        int i7 = mVar.X;
        mVar.X = i7 + 1;
        this.f17552k = i7;
    }

    public final int hashCode() {
        return Objects.hash(this.f17546c, this.f17554m, this.d, this.f17547e, this.f17553l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.Z;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f17552k = num.intValue();
        } else {
            int i7 = mVar.X;
            mVar.X = i7 + 1;
            this.f17552k = i7;
            hashMap.put(str, Integer.valueOf(i7));
        }
        this.f17553l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.f17555n = user;
        long j3 = user.f28552id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i7 = longSparseIntArray.get(j3, -1);
        if (i7 >= 0) {
            this.f17552k = i7;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17552k = i10;
        longSparseIntArray.put(user.f28552id, i10);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.f17554m = chat;
        long j3 = chat.f28403id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i7 = longSparseIntArray.get(-j3, -1);
        if (i7 >= 0) {
            this.f17552k = i7;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17552k = i10;
        longSparseIntArray.put(-chat.f28403id, i10);
    }

    public k(m mVar, int i7, TLRPC.Dialog dialog) {
        super(i7, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        boolean z10 = true;
        this.f17546c = dialog;
        if (dialog != null) {
            int i10 = longSparseIntArray.get(dialog.f28407id, -1);
            if (i10 >= 0) {
                this.f17552k = i10;
            } else {
                int i11 = mVar.X;
                mVar.X = i11 + 1;
                this.f17552k = i11;
                longSparseIntArray.put(dialog.f28407id, i11);
            }
        } else if (i7 == 19) {
            this.f17552k = 5;
        } else {
            int i12 = mVar.X;
            mVar.X = i12 + 1;
            this.f17552k = i12;
        }
        if (dialog != null) {
            int i13 = mVar.h;
            int i14 = mVar.G;
            if (i13 != 7 && i13 != 8) {
                this.f17549g = dialog.pinned;
            } else {
                ro roVar = mp.u1(i14).N[mVar.h == 8 ? (char) 1 : (char) 0];
                this.f17549g = (roVar == null || roVar.f26679j.indexOfKey(dialog.f28407id) < 0) ? false : z10;
            }
            this.h = dialog.isFolder;
            this.f17548f = mp.u1(i14).y2(dialog.f28407id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i7 = mVar.X;
        mVar.X = i7 + 1;
        this.f17552k = i7;
    }

    public k(m mVar, int i7) {
        super(i7, true);
        this.f17551j = i7;
        if (i7 == 10) {
            this.f17552k = 1;
        } else if (i7 == 19) {
            this.f17552k = 5;
        } else {
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17552k = i10;
        }
    }

    public k(m mVar, int i7, int i10) {
        super(5, true);
        this.f17551j = i7;
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17552k = i11;
    }

    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        this.f17547e = tL_contact;
        if (tL_contact != null) {
            int i7 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i7 > 0) {
                this.f17552k = i7;
                return;
            }
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17552k = i10;
            longSparseIntArray.put(tL_contact.user_id, i10);
            return;
        }
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17552k = i11;
    }
}
