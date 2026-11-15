package jg;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.np;
import org.telegram.messenger.so;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k extends rg.a {
    public final TLRPC.Dialog f17163c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact f17164e;
    public final boolean f17165f;
    public final boolean f17166g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f17167i;
    public final int f17168j;
    public final int f17169k;
    public final String f17170l;
    public final TLRPC.Chat f17171m;
    public final TLRPC.User f17172n;

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f17167i = tL_chatlists_chatlistUpdates;
        int i7 = mVar.X;
        mVar.X = i7 + 1;
        this.f17169k = i7;
    }

    public final int hashCode() {
        return Objects.hash(this.f17163c, this.f17171m, this.d, this.f17164e, this.f17170l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.Z;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f17169k = num.intValue();
        } else {
            int i7 = mVar.X;
            mVar.X = i7 + 1;
            this.f17169k = i7;
            hashMap.put(str, Integer.valueOf(i7));
        }
        this.f17170l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.f17172n = user;
        long j3 = user.f28200id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i7 = longSparseIntArray.get(j3, -1);
        if (i7 >= 0) {
            this.f17169k = i7;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17169k = i10;
        longSparseIntArray.put(user.f28200id, i10);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.f17171m = chat;
        long j3 = chat.f28051id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i7 = longSparseIntArray.get(-j3, -1);
        if (i7 >= 0) {
            this.f17169k = i7;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17169k = i10;
        longSparseIntArray.put(-chat.f28051id, i10);
    }

    public k(m mVar, int i7, TLRPC.Dialog dialog) {
        super(i7, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        boolean z10 = true;
        this.f17163c = dialog;
        if (dialog != null) {
            int i10 = longSparseIntArray.get(dialog.f28055id, -1);
            if (i10 >= 0) {
                this.f17169k = i10;
            } else {
                int i11 = mVar.X;
                mVar.X = i11 + 1;
                this.f17169k = i11;
                longSparseIntArray.put(dialog.f28055id, i11);
            }
        } else if (i7 == 19) {
            this.f17169k = 5;
        } else {
            int i12 = mVar.X;
            mVar.X = i12 + 1;
            this.f17169k = i12;
        }
        if (dialog != null) {
            int i13 = mVar.h;
            int i14 = mVar.G;
            if (i13 != 7 && i13 != 8) {
                this.f17166g = dialog.pinned;
            } else {
                so soVar = np.s1(i14).N[mVar.h == 8 ? (char) 1 : (char) 0];
                this.f17166g = (soVar == null || soVar.f26559j.indexOfKey(dialog.f28055id) < 0) ? false : z10;
            }
            this.h = dialog.isFolder;
            this.f17165f = np.s1(i14).t2(dialog.f28055id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i7 = mVar.X;
        mVar.X = i7 + 1;
        this.f17169k = i7;
    }

    public k(m mVar, int i7) {
        super(i7, true);
        this.f17168j = i7;
        if (i7 == 10) {
            this.f17169k = 1;
        } else if (i7 == 19) {
            this.f17169k = 5;
        } else {
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17169k = i10;
        }
    }

    public k(m mVar, int i7, int i10) {
        super(5, true);
        this.f17168j = i7;
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17169k = i11;
    }

    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        this.f17164e = tL_contact;
        if (tL_contact != null) {
            int i7 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i7 > 0) {
                this.f17169k = i7;
                return;
            }
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17169k = i10;
            longSparseIntArray.put(tL_contact.user_id, i10);
            return;
        }
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17169k = i11;
    }
}
