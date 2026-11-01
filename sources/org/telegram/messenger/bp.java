package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class bp {
    public static int f14999q = 10;
    public int f15000a;
    public String f15001b;
    public int d;
    public volatile int e;
    public int f15003f;
    public int f15004g;
    public int f15009m;
    public boolean f15010n;
    public final int f15011o;
    public boolean f15012p;
    public ArrayList f15002c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList f15005i = new ArrayList();
    public final LongSparseIntArray f15006j = new LongSparseIntArray();
    public final ArrayList f15007k = new ArrayList();
    public final ArrayList f15008l = new ArrayList();

    public bp() {
        int i10 = f14999q;
        f14999q = i10 + 1;
        this.f15011o = i10;
    }

    public final boolean a(int i10, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat Z0;
        if (dialog == null) {
            return false;
        }
        long j10 = dialog.f19798id;
        if (o5.C(j10) && (Z0 = wp.r1(i10).Z0(Integer.valueOf((int) (4294967295L & j10)))) != null) {
            j10 = Z0.user_id;
        }
        return this.h.contains(Long.valueOf(j10));
    }

    public final boolean b(c cVar, long j10) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) wp.r1(cVar.f15043a).Q.f(j10);
        if (dialog == null) {
            return false;
        }
        return c(cVar, j10, dialog);
    }

    public final boolean c(c cVar, long j10, TLRPC.Dialog dialog) {
        TLRPC.Chat L0;
        if (!this.f15005i.contains(Long.valueOf(j10))) {
            if (!this.h.contains(Long.valueOf(j10))) {
                if (dialog.folder_id != 0) {
                    int i10 = this.f15004g;
                    int i11 = wp.D8;
                    if ((i10 & 128) != 0) {
                        return false;
                    }
                }
                int i12 = cVar.f15043a;
                wp r12 = wp.r1(i12);
                i5 r10 = i5.r(i12);
                if ((this.f15004g & 32) == 0 || !r12.q2(dialog.f19798id, 0L, null) || dialog.unread_mentions_count != 0) {
                    if ((this.f15004g & 64) == 0 || r12.U0(dialog) != 0 || dialog.unread_mark || dialog.unread_mentions_count != 0) {
                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i13 > 0) {
                            TLRPC.User Z1 = r12.Z1(Long.valueOf(j10));
                            if (Z1 != null) {
                                if (!Z1.bot) {
                                    if (!Z1.self && !Z1.contact && !r10.x(j10)) {
                                        if ((this.f15004g & 2) == 0) {
                                            return false;
                                        }
                                    } else if ((this.f15004g & 1) == 0) {
                                        return false;
                                    }
                                } else if ((this.f15004g & 16) == 0) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (i13 < 0 && (L0 = r12.L0(Long.valueOf(-j10))) != null) {
                            if (w3.Y(L0)) {
                                int i14 = this.f15004g;
                                int i15 = wp.E8;
                                if ((i14 & i15) != i15) {
                                    return false;
                                }
                            } else if (!w3.X(i12, L0)) {
                                if (w3.T(L0) && !L0.megagroup) {
                                    if ((this.f15004g & 8) == 0) {
                                        return false;
                                    }
                                } else if ((this.f15004g & 4) == 0) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d() {
        int i10 = this.f15004g;
        int i11 = wp.D8;
        if ((i10 & 512) > 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f15000a == 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (d()) {
            int i10 = this.f15004g;
            int i11 = wp.D8;
            if ((i10 & 1024) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
