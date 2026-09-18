package gg;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k extends og.a {
    public final TLRPC.Dialog f9802c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact e;
    public final boolean f9803f;
    public final boolean f9804g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f9805i;
    public final int f9806j;
    public final int f9807k;
    public final String f9808l;
    public final TLRPC.Chat f9809m;
    public final TLRPC.User f9810n;

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f9805i = tL_chatlists_chatlistUpdates;
        int i10 = mVar.W;
        mVar.W = i10 + 1;
        this.f9807k = i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f9802c, this.f9809m, this.d, this.e, this.f9808l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.Y;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f9807k = num.intValue();
        } else {
            int i10 = mVar.W;
            mVar.W = i10 + 1;
            this.f9807k = i10;
            hashMap.put(str, Integer.valueOf(i10));
        }
        this.f9808l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.f9810n = user;
        long j3 = user.f18443id;
        LongSparseIntArray longSparseIntArray = mVar.X;
        int i10 = longSparseIntArray.get(j3, -1);
        if (i10 >= 0) {
            this.f9807k = i10;
            return;
        }
        int i11 = mVar.W;
        mVar.W = i11 + 1;
        this.f9807k = i11;
        longSparseIntArray.put(user.f18443id, i11);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.f9809m = chat;
        long j3 = chat.f18296id;
        LongSparseIntArray longSparseIntArray = mVar.X;
        int i10 = longSparseIntArray.get(-j3, -1);
        if (i10 >= 0) {
            this.f9807k = i10;
            return;
        }
        int i11 = mVar.W;
        mVar.W = i11 + 1;
        this.f9807k = i11;
        longSparseIntArray.put(-chat.f18296id, i11);
    }

    public k(m mVar, int i10, TLRPC.Dialog dialog) {
        super(i10, true);
        LongSparseIntArray longSparseIntArray = mVar.X;
        boolean z10 = true;
        this.f9802c = dialog;
        if (dialog != null) {
            int i11 = longSparseIntArray.get(dialog.f18300id, -1);
            if (i11 >= 0) {
                this.f9807k = i11;
            } else {
                int i12 = mVar.W;
                mVar.W = i12 + 1;
                this.f9807k = i12;
                longSparseIntArray.put(dialog.f18300id, i12);
            }
        } else if (i10 == 19) {
            this.f9807k = 5;
        } else {
            int i13 = mVar.W;
            mVar.W = i13 + 1;
            this.f9807k = i13;
        }
        if (dialog != null) {
            int i14 = mVar.h;
            int i15 = mVar.F;
            if (i14 != 7 && i14 != 8) {
                this.f9804g = dialog.pinned;
            } else {
                MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i15).selectedDialogFilter[mVar.h == 8 ? (char) 1 : (char) 0];
                this.f9804g = (dialogFilter == null || dialogFilter.pinnedDialogs.indexOfKey(dialog.f18300id) < 0) ? false : false;
            }
            this.h = dialog.isFolder;
            this.f9803f = MessagesController.getInstance(i15).isForum(dialog.f18300id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i10 = mVar.W;
        mVar.W = i10 + 1;
        this.f9807k = i10;
    }

    public k(m mVar, int i10) {
        super(i10, true);
        this.f9806j = i10;
        if (i10 == 10) {
            this.f9807k = 1;
        } else if (i10 == 19) {
            this.f9807k = 5;
        } else {
            int i11 = mVar.W;
            mVar.W = i11 + 1;
            this.f9807k = i11;
        }
    }

    public k(m mVar, int i10, int i11) {
        super(5, true);
        this.f9806j = i10;
        int i12 = mVar.W;
        mVar.W = i12 + 1;
        this.f9807k = i12;
    }

    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.X;
        this.e = tL_contact;
        if (tL_contact != null) {
            int i10 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i10 > 0) {
                this.f9807k = i10;
                return;
            }
            int i11 = mVar.W;
            mVar.W = i11 + 1;
            this.f9807k = i11;
            longSparseIntArray.put(tL_contact.user_id, i11);
            return;
        }
        int i12 = mVar.W;
        mVar.W = i12 + 1;
        this.f9807k = i12;
    }
}
