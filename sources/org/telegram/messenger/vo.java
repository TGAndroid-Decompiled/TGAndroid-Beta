package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class vo {
    public static int f26055q = 10;
    public int f26056a;
    public String f26057b;
    public int d;
    public volatile int f26059e;
    public int f26060f;
    public int f26061g;
    public int f26066m;
    public boolean f26067n;
    public final int f26068o;
    public boolean f26069p;
    public ArrayList f26058c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList f26062i = new ArrayList();
    public final LongSparseIntArray f26063j = new LongSparseIntArray();
    public final ArrayList f26064k = new ArrayList();
    public final ArrayList f26065l = new ArrayList();

    public vo() {
        int i7 = f26055q;
        f26055q = i7 + 1;
        this.f26068o = i7;
    }

    public final boolean a(int i7, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat a12;
        if (dialog == null) {
            return false;
        }
        long j3 = dialog.f26956id;
        if (m5.C(j3) && (a12 = qp.s1(i7).a1(Integer.valueOf((int) (4294967295L & j3)))) != null) {
            j3 = a12.user_id;
        }
        return this.h.contains(Long.valueOf(j3));
    }

    public final boolean b(c cVar, long j3) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) qp.s1(cVar.f21723a).Q.f(j3);
        if (dialog == null) {
            return false;
        }
        return c(cVar, j3, dialog);
    }

    public final boolean c(c cVar, long j3, TLRPC.Dialog dialog) {
        TLRPC.Chat M0;
        if (!this.f26062i.contains(Long.valueOf(j3))) {
            if (!this.h.contains(Long.valueOf(j3))) {
                if (dialog.folder_id != 0) {
                    int i7 = this.f26061g;
                    int i10 = qp.C8;
                    if ((i7 & 128) != 0) {
                        return false;
                    }
                }
                int i11 = cVar.f21723a;
                qp s12 = qp.s1(i11);
                g5 r10 = g5.r(i11);
                if ((this.f26061g & 32) == 0 || !s12.r2(dialog.f26956id, 0L, null) || dialog.unread_mentions_count != 0) {
                    if ((this.f26061g & 64) == 0 || s12.V0(dialog) != 0 || dialog.unread_mark || dialog.unread_mentions_count != 0) {
                        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        if (i12 > 0) {
                            TLRPC.User a22 = s12.a2(Long.valueOf(j3));
                            if (a22 != null) {
                                if (!a22.bot) {
                                    if (!a22.self && !a22.contact && !r10.x(j3)) {
                                        if ((this.f26061g & 2) == 0) {
                                            return false;
                                        }
                                    } else if ((this.f26061g & 1) == 0) {
                                        return false;
                                    }
                                } else if ((this.f26061g & 16) == 0) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (i12 < 0 && (M0 = s12.M0(Long.valueOf(-j3))) != null) {
                            if (t3.Y(M0)) {
                                int i13 = this.f26061g;
                                int i14 = qp.D8;
                                if ((i13 & i14) != i14) {
                                    return false;
                                }
                            } else if (!t3.X(i11, M0)) {
                                if (t3.T(M0) && !M0.megagroup) {
                                    if ((this.f26061g & 8) == 0) {
                                        return false;
                                    }
                                } else if ((this.f26061g & 4) == 0) {
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
        int i7 = this.f26061g;
        int i10 = qp.C8;
        if ((i7 & 512) > 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f26056a == 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (d()) {
            int i7 = this.f26061g;
            int i10 = qp.C8;
            if ((i7 & 1024) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
