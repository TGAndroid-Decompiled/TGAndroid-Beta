package jg;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.np;
import org.telegram.messenger.so;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k extends rg.a {
    public final TLRPC.Dialog f17540c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact f17541e;
    public final boolean f17542f;
    public final boolean f17543g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f17544i;
    public final int f17545j;
    public final int f17546k;
    public final String f17547l;
    public final TLRPC.Chat f17548m;
    public final TLRPC.User f17549n;

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f17544i = tL_chatlists_chatlistUpdates;
        int i7 = mVar.X;
        mVar.X = i7 + 1;
        this.f17546k = i7;
    }

    public final int hashCode() {
        return Objects.hash(this.f17540c, this.f17548m, this.d, this.f17541e, this.f17547l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.Z;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f17546k = num.intValue();
        } else {
            int i7 = mVar.X;
            mVar.X = i7 + 1;
            this.f17546k = i7;
            hashMap.put(str, Integer.valueOf(i7));
        }
        this.f17547l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.f17549n = user;
        long j3 = user.f28547id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i7 = longSparseIntArray.get(j3, -1);
        if (i7 >= 0) {
            this.f17546k = i7;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17546k = i10;
        longSparseIntArray.put(user.f28547id, i10);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.f17548m = chat;
        long j3 = chat.f28398id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i7 = longSparseIntArray.get(-j3, -1);
        if (i7 >= 0) {
            this.f17546k = i7;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17546k = i10;
        longSparseIntArray.put(-chat.f28398id, i10);
    }

    public k(m mVar, int i7, TLRPC.Dialog dialog) {
        super(i7, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        boolean z10 = true;
        this.f17540c = dialog;
        if (dialog != null) {
            int i10 = longSparseIntArray.get(dialog.f28402id, -1);
            if (i10 >= 0) {
                this.f17546k = i10;
            } else {
                int i11 = mVar.X;
                mVar.X = i11 + 1;
                this.f17546k = i11;
                longSparseIntArray.put(dialog.f28402id, i11);
            }
        } else if (i7 == 19) {
            this.f17546k = 5;
        } else {
            int i12 = mVar.X;
            mVar.X = i12 + 1;
            this.f17546k = i12;
        }
        if (dialog != null) {
            int i13 = mVar.h;
            int i14 = mVar.G;
            if (i13 != 7 && i13 != 8) {
                this.f17543g = dialog.pinned;
            } else {
                so soVar = np.u1(i14).N[mVar.h == 8 ? (char) 1 : (char) 0];
                this.f17543g = (soVar == null || soVar.f26857j.indexOfKey(dialog.f28402id) < 0) ? false : z10;
            }
            this.h = dialog.isFolder;
            this.f17542f = np.u1(i14).y2(dialog.f28402id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i7 = mVar.X;
        mVar.X = i7 + 1;
        this.f17546k = i7;
    }

    public k(m mVar, int i7) {
        super(i7, true);
        this.f17545j = i7;
        if (i7 == 10) {
            this.f17546k = 1;
        } else if (i7 == 19) {
            this.f17546k = 5;
        } else {
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17546k = i10;
        }
    }

    public k(m mVar, int i7, int i10) {
        super(5, true);
        this.f17545j = i7;
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17546k = i11;
    }

    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        this.f17541e = tL_contact;
        if (tL_contact != null) {
            int i7 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i7 > 0) {
                this.f17546k = i7;
                return;
            }
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17546k = i10;
            longSparseIntArray.put(tL_contact.user_id, i10);
            return;
        }
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17546k = i11;
    }
}
