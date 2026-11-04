package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class mo {
    public static int f24236q = 10;
    public int f24237a;
    public String f24238b;
    public int d;
    public volatile int f24240e;
    public int f24241f;
    public int f24242g;
    public int f24247m;
    public boolean f24248n;
    public final int f24249o;
    public boolean f24250p;
    public ArrayList f24239c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList f24243i = new ArrayList();
    public final LongSparseIntArray f24244j = new LongSparseIntArray();
    public final ArrayList f24245k = new ArrayList();
    public final ArrayList f24246l = new ArrayList();

    public mo() {
        int i3 = f24236q;
        f24236q = i3 + 1;
        this.f24249o = i3;
    }

    public final boolean a(int i3, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat a12;
        if (dialog == null) {
            return false;
        }
        long j10 = dialog.f27005id;
        if (m5.C(j10) && (a12 = hp.s1(i3).a1(Integer.valueOf((int) (4294967295L & j10)))) != null) {
            j10 = a12.user_id;
        }
        return this.h.contains(Long.valueOf(j10));
    }

    public final boolean b(c cVar, long j10) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) hp.s1(cVar.f21919a).R.f(j10);
        if (dialog == null) {
            return false;
        }
        return c(cVar, j10, dialog);
    }

    public final boolean c(c cVar, long j10, TLRPC.Dialog dialog) {
        TLRPC.Chat M0;
        if (!this.f24243i.contains(Long.valueOf(j10))) {
            if (!this.h.contains(Long.valueOf(j10))) {
                if (dialog.folder_id != 0) {
                    int i3 = this.f24242g;
                    int i10 = hp.C8;
                    if ((i3 & 128) != 0) {
                        return false;
                    }
                }
                int i11 = cVar.f21919a;
                hp s12 = hp.s1(i11);
                g5 r5 = g5.r(i11);
                if ((this.f24242g & 32) == 0 || !s12.r2(dialog.f27005id, 0L, null) || dialog.unread_mentions_count != 0) {
                    if ((this.f24242g & 64) == 0 || s12.V0(dialog) != 0 || dialog.unread_mark || dialog.unread_mentions_count != 0) {
                        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i12 > 0) {
                            TLRPC.User a22 = s12.a2(Long.valueOf(j10));
                            if (a22 != null) {
                                if (!a22.bot) {
                                    if (!a22.self && !a22.contact && !r5.x(j10)) {
                                        if ((this.f24242g & 2) == 0) {
                                            return false;
                                        }
                                    } else if ((this.f24242g & 1) == 0) {
                                        return false;
                                    }
                                } else if ((this.f24242g & 16) == 0) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (i12 < 0 && (M0 = s12.M0(Long.valueOf(-j10))) != null) {
                            if (t3.Y(M0)) {
                                int i13 = this.f24242g;
                                int i14 = hp.D8;
                                if ((i13 & i14) != i14) {
                                    return false;
                                }
                            } else if (!t3.X(i11, M0)) {
                                if (t3.T(M0) && !M0.megagroup) {
                                    if ((this.f24242g & 8) == 0) {
                                        return false;
                                    }
                                } else if ((this.f24242g & 4) == 0) {
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
        int i3 = this.f24242g;
        int i10 = hp.C8;
        if ((i3 & 512) > 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f24237a == 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (d()) {
            int i3 = this.f24242g;
            int i10 = hp.C8;
            if ((i3 & 1024) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
