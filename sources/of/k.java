package of;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k extends wf.a {
    public final TLRPC.Dialog f19385c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact f19386e;
    public final boolean f19387f;
    public final boolean f19388g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f19389i;
    public final int f19390j;
    public final int f19391k;
    public final String f19392l;
    public final TLRPC.Chat f19393m;
    public final TLRPC.User f19394n;

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f19389i = tL_chatlists_chatlistUpdates;
        int i9 = mVar.S;
        mVar.S = i9 + 1;
        this.f19391k = i9;
    }

    public final int hashCode() {
        return Objects.hash(this.f19385c, this.f19393m, this.d, this.f19386e, this.f19392l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.U;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f19391k = num.intValue();
        } else {
            int i9 = mVar.S;
            mVar.S = i9 + 1;
            this.f19391k = i9;
            hashMap.put(str, Integer.valueOf(i9));
        }
        this.f19392l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.f19394n = user;
        long j10 = user.f22527id;
        LongSparseIntArray longSparseIntArray = mVar.T;
        int i9 = longSparseIntArray.get(j10, -1);
        if (i9 >= 0) {
            this.f19391k = i9;
            return;
        }
        int i10 = mVar.S;
        mVar.S = i10 + 1;
        this.f19391k = i10;
        longSparseIntArray.put(user.f22527id, i10);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.f19393m = chat;
        long j10 = chat.f22380id;
        LongSparseIntArray longSparseIntArray = mVar.T;
        int i9 = longSparseIntArray.get(-j10, -1);
        if (i9 >= 0) {
            this.f19391k = i9;
            return;
        }
        int i10 = mVar.S;
        mVar.S = i10 + 1;
        this.f19391k = i10;
        longSparseIntArray.put(-chat.f22380id, i10);
    }

    public k(m mVar, int i9, TLRPC.Dialog dialog) {
        super(i9, true);
        LongSparseIntArray longSparseIntArray = mVar.T;
        boolean z10 = true;
        this.f19385c = dialog;
        if (dialog != null) {
            int i10 = longSparseIntArray.get(dialog.f22384id, -1);
            if (i10 >= 0) {
                this.f19391k = i10;
            } else {
                int i11 = mVar.S;
                mVar.S = i11 + 1;
                this.f19391k = i11;
                longSparseIntArray.put(dialog.f22384id, i11);
            }
        } else if (i9 == 19) {
            this.f19391k = 5;
        } else {
            int i12 = mVar.S;
            mVar.S = i12 + 1;
            this.f19391k = i12;
        }
        if (dialog != null) {
            int i13 = mVar.h;
            int i14 = mVar.B;
            if (i13 != 7 && i13 != 8) {
                this.f19388g = dialog.pinned;
            } else {
                MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i14).selectedDialogFilter[mVar.h == 8 ? (char) 1 : (char) 0];
                this.f19388g = (dialogFilter == null || dialogFilter.pinnedDialogs.indexOfKey(dialog.f22384id) < 0) ? false : false;
            }
            this.h = dialog.isFolder;
            this.f19387f = MessagesController.getInstance(i14).isForum(dialog.f22384id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i9 = mVar.S;
        mVar.S = i9 + 1;
        this.f19391k = i9;
    }

    public k(m mVar, int i9) {
        super(i9, true);
        this.f19390j = i9;
        if (i9 == 10) {
            this.f19391k = 1;
        } else if (i9 == 19) {
            this.f19391k = 5;
        } else {
            int i10 = mVar.S;
            mVar.S = i10 + 1;
            this.f19391k = i10;
        }
    }

    public k(m mVar, int i9, int i10) {
        super(5, true);
        this.f19390j = i9;
        int i11 = mVar.S;
        mVar.S = i11 + 1;
        this.f19391k = i11;
    }

    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.T;
        this.f19386e = tL_contact;
        if (tL_contact != null) {
            int i9 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i9 > 0) {
                this.f19391k = i9;
                return;
            }
            int i10 = mVar.S;
            mVar.S = i10 + 1;
            this.f19391k = i10;
            longSparseIntArray.put(tL_contact.user_id, i10);
            return;
        }
        int i11 = mVar.S;
        mVar.S = i11 + 1;
        this.f19391k = i11;
    }
}
