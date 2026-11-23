package jg;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.np;
import org.telegram.messenger.so;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k extends rg.a {
    public final TLRPC.Dialog f17574c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact f17575e;
    public final boolean f17576f;
    public final boolean f17577g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f17578i;
    public final int f17579j;
    public final int f17580k;
    public final String f17581l;
    public final TLRPC.Chat f17582m;
    public final TLRPC.User f17583n;

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f17578i = tL_chatlists_chatlistUpdates;
        int i7 = mVar.X;
        mVar.X = i7 + 1;
        this.f17580k = i7;
    }

    public final int hashCode() {
        return Objects.hash(this.f17574c, this.f17582m, this.d, this.f17575e, this.f17581l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.Z;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f17580k = num.intValue();
        } else {
            int i7 = mVar.X;
            mVar.X = i7 + 1;
            this.f17580k = i7;
            hashMap.put(str, Integer.valueOf(i7));
        }
        this.f17581l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.f17583n = user;
        long j3 = user.f28583id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i7 = longSparseIntArray.get(j3, -1);
        if (i7 >= 0) {
            this.f17580k = i7;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17580k = i10;
        longSparseIntArray.put(user.f28583id, i10);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.f17582m = chat;
        long j3 = chat.f28434id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i7 = longSparseIntArray.get(-j3, -1);
        if (i7 >= 0) {
            this.f17580k = i7;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17580k = i10;
        longSparseIntArray.put(-chat.f28434id, i10);
    }

    public k(m mVar, int i7, TLRPC.Dialog dialog) {
        super(i7, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        boolean z10 = true;
        this.f17574c = dialog;
        if (dialog != null) {
            int i10 = longSparseIntArray.get(dialog.f28438id, -1);
            if (i10 >= 0) {
                this.f17580k = i10;
            } else {
                int i11 = mVar.X;
                mVar.X = i11 + 1;
                this.f17580k = i11;
                longSparseIntArray.put(dialog.f28438id, i11);
            }
        } else if (i7 == 19) {
            this.f17580k = 5;
        } else {
            int i12 = mVar.X;
            mVar.X = i12 + 1;
            this.f17580k = i12;
        }
        if (dialog != null) {
            int i13 = mVar.h;
            int i14 = mVar.G;
            if (i13 != 7 && i13 != 8) {
                this.f17577g = dialog.pinned;
            } else {
                so soVar = np.u1(i14).N[mVar.h == 8 ? (char) 1 : (char) 0];
                this.f17577g = (soVar == null || soVar.f26893j.indexOfKey(dialog.f28438id) < 0) ? false : z10;
            }
            this.h = dialog.isFolder;
            this.f17576f = np.u1(i14).y2(dialog.f28438id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i7 = mVar.X;
        mVar.X = i7 + 1;
        this.f17580k = i7;
    }

    public k(m mVar, int i7) {
        super(i7, true);
        this.f17579j = i7;
        if (i7 == 10) {
            this.f17580k = 1;
        } else if (i7 == 19) {
            this.f17580k = 5;
        } else {
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17580k = i10;
        }
    }

    public k(m mVar, int i7, int i10) {
        super(5, true);
        this.f17579j = i7;
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17580k = i11;
    }

    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        this.f17575e = tL_contact;
        if (tL_contact != null) {
            int i7 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i7 > 0) {
                this.f17580k = i7;
                return;
            }
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17580k = i10;
            longSparseIntArray.put(tL_contact.user_id, i10);
            return;
        }
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17580k = i11;
    }
}
