package kg;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.hp;
import org.telegram.messenger.mo;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k extends sg.a {
    public final TLRPC.Dialog f17061c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact f17062e;
    public final boolean f17063f;
    public final boolean f17064g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f17065i;
    public final int f17066j;
    public final int f17067k;
    public final String f17068l;
    public final TLRPC.Chat f17069m;
    public final TLRPC.User f17070n;

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f17065i = tL_chatlists_chatlistUpdates;
        int i3 = mVar.X;
        mVar.X = i3 + 1;
        this.f17067k = i3;
    }

    public final int hashCode() {
        return Objects.hash(this.f17061c, this.f17069m, this.d, this.f17062e, this.f17068l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.Z;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f17067k = num.intValue();
        } else {
            int i3 = mVar.X;
            mVar.X = i3 + 1;
            this.f17067k = i3;
            hashMap.put(str, Integer.valueOf(i3));
        }
        this.f17068l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.f17070n = user;
        long j10 = user.f27150id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i3 = longSparseIntArray.get(j10, -1);
        if (i3 >= 0) {
            this.f17067k = i3;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17067k = i10;
        longSparseIntArray.put(user.f27150id, i10);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.f17069m = chat;
        long j10 = chat.f27001id;
        LongSparseIntArray longSparseIntArray = mVar.Y;
        int i3 = longSparseIntArray.get(-j10, -1);
        if (i3 >= 0) {
            this.f17067k = i3;
            return;
        }
        int i10 = mVar.X;
        mVar.X = i10 + 1;
        this.f17067k = i10;
        longSparseIntArray.put(-chat.f27001id, i10);
    }

    public k(m mVar, int i3, TLRPC.Dialog dialog) {
        super(i3, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        boolean z10 = true;
        this.f17061c = dialog;
        if (dialog != null) {
            int i10 = longSparseIntArray.get(dialog.f27005id, -1);
            if (i10 >= 0) {
                this.f17067k = i10;
            } else {
                int i11 = mVar.X;
                mVar.X = i11 + 1;
                this.f17067k = i11;
                longSparseIntArray.put(dialog.f27005id, i11);
            }
        } else if (i3 == 19) {
            this.f17067k = 5;
        } else {
            int i12 = mVar.X;
            mVar.X = i12 + 1;
            this.f17067k = i12;
        }
        if (dialog != null) {
            int i13 = mVar.h;
            int i14 = mVar.G;
            if (i13 != 7 && i13 != 8) {
                this.f17064g = dialog.pinned;
            } else {
                mo moVar = hp.s1(i14).N[mVar.h == 8 ? (char) 1 : (char) 0];
                this.f17064g = (moVar == null || moVar.f24244j.indexOfKey(dialog.f27005id) < 0) ? false : z10;
            }
            this.h = dialog.isFolder;
            this.f17063f = hp.s1(i14).t2(dialog.f27005id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i3 = mVar.X;
        mVar.X = i3 + 1;
        this.f17067k = i3;
    }

    public k(m mVar, int i3) {
        super(i3, true);
        this.f17066j = i3;
        if (i3 == 10) {
            this.f17067k = 1;
        } else if (i3 == 19) {
            this.f17067k = 5;
        } else {
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17067k = i10;
        }
    }

    public k(m mVar, int i3, int i10) {
        super(5, true);
        this.f17066j = i3;
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17067k = i11;
    }

    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.Y;
        this.f17062e = tL_contact;
        if (tL_contact != null) {
            int i3 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i3 > 0) {
                this.f17067k = i3;
                return;
            }
            int i10 = mVar.X;
            mVar.X = i10 + 1;
            this.f17067k = i10;
            longSparseIntArray.put(tL_contact.user_id, i10);
            return;
        }
        int i11 = mVar.X;
        mVar.X = i11 + 1;
        this.f17067k = i11;
    }
}
