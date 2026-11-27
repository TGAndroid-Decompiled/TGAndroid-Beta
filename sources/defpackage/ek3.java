package defpackage;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class ek3 extends ka {
    public final TLRPC.Dialog c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates i;
    public final int j;
    public final int k;
    public final String l;
    public final TLRPC.Chat m;
    public final TLRPC.User n;

    public ek3(gk3 gk3Var, int i, TLRPC.Dialog dialog) {
        super(i, true);
        char c;
        LongSparseIntArray longSparseIntArray = gk3Var.Y;
        boolean z = true;
        this.c = dialog;
        if (dialog != null) {
            int i2 = longSparseIntArray.get(dialog.id, -1);
            if (i2 >= 0) {
                this.k = i2;
            } else {
                int i3 = gk3Var.X;
                gk3Var.X = i3 + 1;
                this.k = i3;
                longSparseIntArray.put(dialog.id, i3);
            }
        } else if (i == 19) {
            this.k = 5;
        } else {
            int i4 = gk3Var.X;
            gk3Var.X = i4 + 1;
            this.k = i4;
        }
        if (dialog != null) {
            int i5 = gk3Var.h;
            int i6 = gk3Var.G;
            if (i5 != 7 && i5 != 8) {
                this.g = dialog.pinned;
            } else {
                ac7[] ac7VarArr = uc7.s1(i6).N;
                if (gk3Var.h == 8) {
                    c = 1;
                } else {
                    c = 0;
                }
                ac7 ac7Var = ac7VarArr[c];
                this.g = (ac7Var == null || ac7Var.j.indexOfKey(dialog.id) < 0) ? false : z;
            }
            this.h = dialog.isFolder;
            this.f = uc7.s1(i6).v2(dialog.id);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.m, this.d, this.e, this.l);
    }

    public ek3(gk3 gk3Var, String str) {
        super(22, false);
        HashMap hashMap = gk3Var.Z;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.k = num.intValue();
        } else {
            int i = gk3Var.X;
            gk3Var.X = i + 1;
            this.k = i;
            hashMap.put(str, Integer.valueOf(i));
        }
        this.l = str;
    }

    public ek3(gk3 gk3Var, TLRPC.User user) {
        super(23, false);
        this.n = user;
        long j = user.id;
        LongSparseIntArray longSparseIntArray = gk3Var.Y;
        int i = longSparseIntArray.get(j, -1);
        if (i >= 0) {
            this.k = i;
            return;
        }
        int i2 = gk3Var.X;
        gk3Var.X = i2 + 1;
        this.k = i2;
        longSparseIntArray.put(user.id, i2);
    }

    public ek3(gk3 gk3Var, TLRPC.Chat chat) {
        super(23, false);
        this.m = chat;
        long j = chat.id;
        LongSparseIntArray longSparseIntArray = gk3Var.Y;
        int i = longSparseIntArray.get(-j, -1);
        if (i >= 0) {
            this.k = i;
            return;
        }
        int i2 = gk3Var.X;
        gk3Var.X = i2 + 1;
        this.k = i2;
        longSparseIntArray.put(-chat.id, i2);
    }

    public ek3(gk3 gk3Var, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.i = tL_chatlists_chatlistUpdates;
        int i = gk3Var.X;
        gk3Var.X = i + 1;
        this.k = i;
    }

    public ek3(gk3 gk3Var, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i = gk3Var.X;
        gk3Var.X = i + 1;
        this.k = i;
    }

    public ek3(gk3 gk3Var, int i) {
        super(i, true);
        this.j = i;
        if (i == 10) {
            this.k = 1;
        } else if (i == 19) {
            this.k = 5;
        } else {
            int i2 = gk3Var.X;
            gk3Var.X = i2 + 1;
            this.k = i2;
        }
    }

    public ek3(gk3 gk3Var, int i, int i2) {
        super(5, true);
        this.j = i;
        int i3 = gk3Var.X;
        gk3Var.X = i3 + 1;
        this.k = i3;
    }

    public ek3(gk3 gk3Var, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = gk3Var.Y;
        this.e = tL_contact;
        if (tL_contact != null) {
            int i = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i > 0) {
                this.k = i;
                return;
            }
            int i2 = gk3Var.X;
            gk3Var.X = i2 + 1;
            this.k = i2;
            longSparseIntArray.put(tL_contact.user_id, i2);
            return;
        }
        int i3 = gk3Var.X;
        gk3Var.X = i3 + 1;
        this.k = i3;
    }
}
