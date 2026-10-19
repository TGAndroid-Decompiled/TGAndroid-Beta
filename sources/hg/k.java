package hg;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k extends pg.a {
    public final TLRPC.Dialog f11954c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact e;
    public final boolean f11955f;
    public final boolean f11956g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f11957i;
    public final int f11958j;
    public final int f11959k;
    public final String f11960l;
    public final TLRPC.Chat f11961m;
    public final TLRPC.User f11962n;

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f11957i = tL_chatlists_chatlistUpdates;
        int i10 = mVar.W;
        mVar.W = i10 + 1;
        this.f11959k = i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f11954c, this.f11961m, this.d, this.e, this.f11960l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.Y;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f11959k = num.intValue();
        } else {
            int i10 = mVar.W;
            mVar.W = i10 + 1;
            this.f11959k = i10;
            hashMap.put(str, Integer.valueOf(i10));
        }
        this.f11960l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.f11962n = user;
        long j10 = user.f20422id;
        LongSparseIntArray longSparseIntArray = mVar.X;
        int i10 = longSparseIntArray.get(j10, -1);
        if (i10 >= 0) {
            this.f11959k = i10;
            return;
        }
        int i11 = mVar.W;
        mVar.W = i11 + 1;
        this.f11959k = i11;
        longSparseIntArray.put(user.f20422id, i11);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.f11961m = chat;
        long j10 = chat.f20275id;
        LongSparseIntArray longSparseIntArray = mVar.X;
        int i10 = longSparseIntArray.get(-j10, -1);
        if (i10 >= 0) {
            this.f11959k = i10;
            return;
        }
        int i11 = mVar.W;
        mVar.W = i11 + 1;
        this.f11959k = i11;
        longSparseIntArray.put(-chat.f20275id, i11);
    }

    public k(m mVar, int i10, TLRPC.Dialog dialog) {
        super(i10, true);
        LongSparseIntArray longSparseIntArray = mVar.X;
        boolean z10 = true;
        this.f11954c = dialog;
        if (dialog != null) {
            int i11 = longSparseIntArray.get(dialog.f20279id, -1);
            if (i11 >= 0) {
                this.f11959k = i11;
            } else {
                int i12 = mVar.W;
                mVar.W = i12 + 1;
                this.f11959k = i12;
                longSparseIntArray.put(dialog.f20279id, i12);
            }
        } else if (i10 == 19) {
            this.f11959k = 5;
        } else {
            int i13 = mVar.W;
            mVar.W = i13 + 1;
            this.f11959k = i13;
        }
        if (dialog != null) {
            int i14 = mVar.h;
            int i15 = mVar.F;
            if (i14 != 7 && i14 != 8) {
                this.f11956g = dialog.pinned;
            } else {
                MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i15).selectedDialogFilter[mVar.h == 8 ? (char) 1 : (char) 0];
                this.f11956g = (dialogFilter == null || dialogFilter.pinnedDialogs.indexOfKey(dialog.f20279id) < 0) ? false : z10;
            }
            this.h = dialog.isFolder;
            this.f11955f = MessagesController.getInstance(i15).isForum(dialog.f20279id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i10 = mVar.W;
        mVar.W = i10 + 1;
        this.f11959k = i10;
    }

    public k(m mVar, int i10) {
        super(i10, true);
        this.f11958j = i10;
        if (i10 == 10) {
            this.f11959k = 1;
        } else if (i10 == 19) {
            this.f11959k = 5;
        } else {
            int i11 = mVar.W;
            mVar.W = i11 + 1;
            this.f11959k = i11;
        }
    }

    public k(m mVar, int i10, int i11) {
        super(5, true);
        this.f11958j = i10;
        int i12 = mVar.W;
        mVar.W = i12 + 1;
        this.f11959k = i12;
    }

    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.X;
        this.e = tL_contact;
        if (tL_contact != null) {
            int i10 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i10 > 0) {
                this.f11959k = i10;
                return;
            }
            int i11 = mVar.W;
            mVar.W = i11 + 1;
            this.f11959k = i11;
            longSparseIntArray.put(tL_contact.user_id, i11);
            return;
        }
        int i12 = mVar.W;
        mVar.W = i12 + 1;
        this.f11959k = i12;
    }
}
