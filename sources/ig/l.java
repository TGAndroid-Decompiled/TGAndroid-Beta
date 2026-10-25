package ig;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class l extends qg.a {
    public final TLRPC.Dialog f14150c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact e;
    public final boolean f14151f;
    public final boolean f14152g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f14153i;
    public final int f14154j;
    public final int f14155k;
    public final String f14156l;
    public final TLRPC.Chat f14157m;
    public final TLRPC.User f14158n;

    public l(n nVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f14153i = tL_chatlists_chatlistUpdates;
        int i10 = nVar.W;
        nVar.W = i10 + 1;
        this.f14155k = i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f14150c, this.f14157m, this.d, this.e, this.f14156l);
    }

    public l(n nVar, String str) {
        super(22, false);
        HashMap hashMap = nVar.Y;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f14155k = num.intValue();
        } else {
            int i10 = nVar.W;
            nVar.W = i10 + 1;
            this.f14155k = i10;
            hashMap.put(str, Integer.valueOf(i10));
        }
        this.f14156l = str;
    }

    public l(n nVar, TLRPC.User user) {
        super(23, false);
        this.f14158n = user;
        long j10 = user.f22174id;
        LongSparseIntArray longSparseIntArray = nVar.X;
        int i10 = longSparseIntArray.get(j10, -1);
        if (i10 >= 0) {
            this.f14155k = i10;
            return;
        }
        int i11 = nVar.W;
        nVar.W = i11 + 1;
        this.f14155k = i11;
        longSparseIntArray.put(user.f22174id, i11);
    }

    public l(n nVar, TLRPC.Chat chat) {
        super(23, false);
        this.f14157m = chat;
        long j10 = chat.f22027id;
        LongSparseIntArray longSparseIntArray = nVar.X;
        int i10 = longSparseIntArray.get(-j10, -1);
        if (i10 >= 0) {
            this.f14155k = i10;
            return;
        }
        int i11 = nVar.W;
        nVar.W = i11 + 1;
        this.f14155k = i11;
        longSparseIntArray.put(-chat.f22027id, i11);
    }

    public l(n nVar, int i10, TLRPC.Dialog dialog) {
        super(i10, true);
        LongSparseIntArray longSparseIntArray = nVar.X;
        boolean z10 = true;
        this.f14150c = dialog;
        if (dialog != null) {
            int i11 = longSparseIntArray.get(dialog.f22031id, -1);
            if (i11 >= 0) {
                this.f14155k = i11;
            } else {
                int i12 = nVar.W;
                nVar.W = i12 + 1;
                this.f14155k = i12;
                longSparseIntArray.put(dialog.f22031id, i12);
            }
        } else if (i10 == 19) {
            this.f14155k = 5;
        } else {
            int i13 = nVar.W;
            nVar.W = i13 + 1;
            this.f14155k = i13;
        }
        if (dialog != null) {
            int i14 = nVar.h;
            int i15 = nVar.F;
            if (i14 != 7 && i14 != 8) {
                this.f14152g = dialog.pinned;
            } else {
                MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i15).selectedDialogFilter[nVar.h == 8 ? (char) 1 : (char) 0];
                this.f14152g = (dialogFilter == null || dialogFilter.pinnedDialogs.indexOfKey(dialog.f22031id) < 0) ? false : z10;
            }
            this.h = dialog.isFolder;
            this.f14151f = MessagesController.getInstance(i15).isForum(dialog.f22031id);
        }
    }

    public l(n nVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i10 = nVar.W;
        nVar.W = i10 + 1;
        this.f14155k = i10;
    }

    public l(n nVar, int i10) {
        super(i10, true);
        this.f14154j = i10;
        if (i10 == 10) {
            this.f14155k = 1;
        } else if (i10 == 19) {
            this.f14155k = 5;
        } else {
            int i11 = nVar.W;
            nVar.W = i11 + 1;
            this.f14155k = i11;
        }
    }

    public l(n nVar, int i10, int i11) {
        super(5, true);
        this.f14154j = i10;
        int i12 = nVar.W;
        nVar.W = i12 + 1;
        this.f14155k = i12;
    }

    public l(n nVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = nVar.X;
        this.e = tL_contact;
        if (tL_contact != null) {
            int i10 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i10 > 0) {
                this.f14155k = i10;
                return;
            }
            int i11 = nVar.W;
            nVar.W = i11 + 1;
            this.f14155k = i11;
            longSparseIntArray.put(tL_contact.user_id, i11);
            return;
        }
        int i12 = nVar.W;
        nVar.W = i12 + 1;
        this.f14155k = i12;
    }
}
