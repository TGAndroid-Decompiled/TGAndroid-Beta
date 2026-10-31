package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ap {
    public static int f14644q = 10;
    public int f14645a;
    public String f14646b;
    public int d;
    public volatile int e;
    public int f14648f;
    public int f14649g;
    public int f14654m;
    public boolean f14655n;
    public final int f14656o;
    public boolean f14657p;
    public ArrayList f14647c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList f14650i = new ArrayList();
    public final LongSparseIntArray f14651j = new LongSparseIntArray();
    public final ArrayList f14652k = new ArrayList();
    public final ArrayList f14653l = new ArrayList();

    public ap() {
        int i10 = f14644q;
        f14644q = i10 + 1;
        this.f14656o = i10;
    }

    public final boolean a(int i10, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat Z0;
        if (dialog == null) {
            return false;
        }
        long j10 = dialog.f19797id;
        if (o5.C(j10) && (Z0 = vp.r1(i10).Z0(Integer.valueOf((int) (4294967295L & j10)))) != null) {
            j10 = Z0.user_id;
        }
        return this.h.contains(Long.valueOf(j10));
    }

    public final boolean b(c cVar, long j10) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) vp.r1(cVar.f14863a).Q.f(j10);
        if (dialog == null) {
            return false;
        }
        return c(cVar, j10, dialog);
    }

    public final boolean c(c cVar, long j10, TLRPC.Dialog dialog) {
        TLRPC.Chat L0;
        if (!this.f14650i.contains(Long.valueOf(j10))) {
            if (!this.h.contains(Long.valueOf(j10))) {
                if (dialog.folder_id != 0) {
                    int i10 = this.f14649g;
                    int i11 = vp.D8;
                    if ((i10 & 128) != 0) {
                        return false;
                    }
                }
                int i12 = cVar.f14863a;
                vp r12 = vp.r1(i12);
                i5 r10 = i5.r(i12);
                if ((this.f14649g & 32) == 0 || !r12.q2(dialog.f19797id, 0L, null) || dialog.unread_mentions_count != 0) {
                    if ((this.f14649g & 64) == 0 || r12.U0(dialog) != 0 || dialog.unread_mark || dialog.unread_mentions_count != 0) {
                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i13 > 0) {
                            TLRPC.User Z1 = r12.Z1(Long.valueOf(j10));
                            if (Z1 != null) {
                                if (!Z1.bot) {
                                    if (!Z1.self && !Z1.contact && !r10.x(j10)) {
                                        if ((this.f14649g & 2) == 0) {
                                            return false;
                                        }
                                    } else if ((this.f14649g & 1) == 0) {
                                        return false;
                                    }
                                } else if ((this.f14649g & 16) == 0) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (i13 < 0 && (L0 = r12.L0(Long.valueOf(-j10))) != null) {
                            if (w3.Y(L0)) {
                                int i14 = this.f14649g;
                                int i15 = vp.E8;
                                if ((i14 & i15) != i15) {
                                    return false;
                                }
                            } else if (!w3.X(i12, L0)) {
                                if (w3.T(L0) && !L0.megagroup) {
                                    if ((this.f14649g & 8) == 0) {
                                        return false;
                                    }
                                } else if ((this.f14649g & 4) == 0) {
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
        int i10 = this.f14649g;
        int i11 = vp.D8;
        if ((i10 & 512) > 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f14645a == 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (d()) {
            int i10 = this.f14649g;
            int i11 = vp.D8;
            if ((i10 & 1024) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
