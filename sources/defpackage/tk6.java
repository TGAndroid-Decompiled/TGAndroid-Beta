package defpackage;

import android.graphics.Typeface;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class tk6 implements Comparator {
    public final byte a;

    public tk6(byte b) {
        this.a = b;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int compare;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ei5 ei5Var = (ei5) obj;
                ei5 ei5Var2 = (ei5) obj2;
                int compare2 = Integer.compare(ei5Var.b, ei5Var2.b);
                if (compare2 == 0) {
                    return Integer.compare(ei5Var2.d, ei5Var.d);
                }
                return compare2;
            case 1:
                String[] strArr = MediaController.W1;
                int i11 = (((jo6) obj).D > ((jo6) obj2).D ? 1 : (((jo6) obj).D == ((jo6) obj2).D ? 0 : -1));
                if (i11 < 0) {
                    return 1;
                }
                if (i11 <= 0) {
                    return 0;
                }
                return -1;
            case 2:
                k47 k47Var = (k47) obj;
                k47 k47Var2 = (k47) obj2;
                String[] strArr2 = MediaController.W1;
                int e1 = k47Var.e1();
                int e12 = k47Var2.e1();
                long j = k47Var.k.grouped_id;
                long j2 = k47Var2.k.grouped_id;
                if (e1 < 0 && e12 < 0) {
                    if (j != 0 && j == j2) {
                        compare = Integer.compare(e1, e12);
                    } else {
                        return Integer.compare(e12, e1);
                    }
                } else if (j != 0 && j == j2) {
                    compare = Integer.compare(e12, e1);
                } else {
                    return Integer.compare(e1, e12);
                }
                return -compare;
            case 3:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d2 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d2) {
                    return -1;
                }
                if (d >= d2) {
                    return 0;
                }
                return 1;
            case 4:
                int i12 = ((TLRPC.MessageEntity) obj).offset;
                int i13 = ((TLRPC.MessageEntity) obj2).offset;
                if (i12 > i13) {
                    return 1;
                }
                if (i12 >= i13) {
                    return 0;
                }
                return -1;
            case 5:
                double d3 = ((TLRPC.TL_topPeer) obj).rating;
                double d4 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d3 > d4) {
                    return -1;
                }
                if (d3 >= d4) {
                    return 0;
                }
                return 1;
            case 6:
                double d5 = ((TLRPC.TL_topPeer) obj).rating;
                double d6 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d5 > d6) {
                    return -1;
                }
                if (d5 >= d6) {
                    return 0;
                }
                return 1;
            case 7:
                int i14 = ((TLRPC.MessageEntity) obj).offset;
                int i15 = ((TLRPC.MessageEntity) obj2).offset;
                if (i14 > i15) {
                    return 1;
                }
                if (i14 >= i15) {
                    return 0;
                }
                return -1;
            case 8:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 9:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 10:
                int i16 = ((TLRPC.MessageEntity) obj).offset;
                int i17 = ((TLRPC.MessageEntity) obj2).offset;
                if (i16 > i17) {
                    return 1;
                }
                if (i16 >= i17) {
                    return 0;
                }
                return -1;
            case 11:
                return ((String) obj2).length() - ((String) obj).length();
            case 12:
                return ((c47) obj).a - ((c47) obj2).a;
            case 13:
                return gm.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 14:
                return ((k47) obj2).e1() - ((k47) obj).e1();
            case 15:
                k47 k47Var3 = (k47) obj;
                k47 k47Var4 = (k47) obj2;
                if (k47Var3.k.date == k47Var4.k.date && k47Var3.e1() >= 0 && k47Var4.e1() >= 0) {
                    i = k47Var4.e1();
                    i2 = k47Var3.e1();
                } else {
                    i = k47Var4.k.date;
                    i2 = k47Var3.k.date;
                }
                return i - i2;
            case 16:
                return ((k47) obj2).e1() - ((k47) obj).e1();
            case 17:
                TLRPC.Update update = (TLRPC.Update) obj;
                TLRPC.Update update2 = (TLRPC.Update) obj2;
                int U1 = oc7.U1(update);
                int U12 = oc7.U1(update2);
                if (U1 != U12) {
                    return gm.A(U1, U12);
                }
                if (U1 == 0) {
                    return gm.A(oc7.S1(update), oc7.S1(update2));
                }
                if (U1 == 1) {
                    if (update instanceof TL_update.TL_updateNewEncryptedMessage) {
                        i3 = ((TL_update.TL_updateNewEncryptedMessage) update).qts;
                    } else {
                        i3 = 0;
                    }
                    if (update2 instanceof TL_update.TL_updateNewEncryptedMessage) {
                        i10 = ((TL_update.TL_updateNewEncryptedMessage) update2).qts;
                    }
                    return gm.A(i3, i10);
                } else if (U1 != 2) {
                    return 0;
                } else {
                    int i18 = (oc7.R1(update) > oc7.R1(update2) ? 1 : (oc7.R1(update) == oc7.R1(update2) ? 0 : -1));
                    if (i18 == 0) {
                        return gm.A(oc7.S1(update), oc7.S1(update2));
                    }
                    Typeface typeface = gm.a;
                    if (i18 == 0) {
                        return 0;
                    }
                    if (i18 <= 0) {
                        return -1;
                    }
                    return 1;
                }
            case 18:
                TLRPC.TL_savedReactionTag tL_savedReactionTag = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = (TLRPC.TL_savedReactionTag) obj2;
                int i19 = tL_savedReactionTag.count;
                int i20 = tL_savedReactionTag2.count;
                if (i19 == i20) {
                    return Long.compare(oc7.O1(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, oc7.O1(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE);
                }
                return i20 - i19;
            case 19:
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag4 = (TLRPC.TL_savedReactionTag) obj2;
                int i21 = tL_savedReactionTag3.count;
                int i22 = tL_savedReactionTag4.count;
                if (i21 == i22) {
                    return Long.compare(oc7.O1(tL_savedReactionTag4.reaction) ^ Long.MIN_VALUE, oc7.O1(tL_savedReactionTag3.reaction) ^ Long.MIN_VALUE);
                }
                return i22 - i21;
            case 20:
                int i23 = ((ub7) obj).f;
                int i24 = ((ub7) obj2).f;
                if (i23 > i24) {
                    return 1;
                }
                if (i23 >= i24) {
                    return 0;
                }
                return -1;
            case 21:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                if (updates instanceof TLRPC.TL_updatesCombined) {
                    i4 = updates.seq_start;
                } else {
                    i4 = updates.seq;
                }
                if (updates2 instanceof TLRPC.TL_updatesCombined) {
                    i5 = updates2.seq_start;
                } else {
                    i5 = updates2.seq;
                }
                return gm.A(i4, i5);
            case 22:
                return gm.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 23:
                return gm.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 24:
                int i25 = ((ub7) obj).f;
                int i26 = ((ub7) obj2).f;
                if (i25 > i26) {
                    return 1;
                }
                if (i25 >= i26) {
                    return 0;
                }
                return -1;
            case 25:
                TLRPC.Message message = (TLRPC.Message) obj;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                if (!k47.f3(message.id) && !k47.f3(message2.id)) {
                    int i27 = message.id;
                    if (i27 > 0 && (i9 = message2.id) > 0) {
                        if (i27 <= i9) {
                            if (i27 >= i9) {
                                return 0;
                            }
                            return 1;
                        }
                        return -1;
                    } else if (i27 < 0 && (i8 = message2.id) < 0) {
                        if (i27 >= i8) {
                            if (i27 <= i8) {
                                return 0;
                            }
                            return 1;
                        }
                        return -1;
                    } else {
                        int i28 = message.date;
                        int i29 = message2.date;
                        if (i28 <= i29) {
                            if (i28 >= i29) {
                                return 0;
                            }
                            return 1;
                        }
                        return -1;
                    }
                }
                int i30 = message.date;
                int i31 = message2.date;
                if (i30 <= i31) {
                    if (i30 >= i31) {
                        if (!k47.f3(message.id) || k47.f3(message2.id)) {
                            if ((k47.f3(message.id) || !k47.f3(message2.id)) && (i6 = message.id) <= (i7 = message2.id)) {
                                if (i6 >= i7) {
                                    return 0;
                                }
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            case 26:
                int i32 = ((ub7) obj).f;
                int i33 = ((ub7) obj2).f;
                if (i32 > i33) {
                    return 1;
                }
                if (i32 >= i33) {
                    return 0;
                }
                return -1;
            case 27:
                int i34 = ((im3) obj).b;
                int i35 = ((im3) obj2).b;
                if (i34 < i35) {
                    return 1;
                }
                if (i34 <= i35) {
                    return 0;
                }
                return -1;
            case 28:
                int i36 = (z8c.h(((Integer) obj).intValue()).Z > z8c.h(((Integer) obj2).intValue()).Z ? 1 : (z8c.h(((Integer) obj).intValue()).Z == z8c.h(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i36 > 0) {
                    return 1;
                }
                if (i36 >= 0) {
                    return 0;
                }
                return -1;
            default:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
        }
    }

    public tk6(oc7 oc7Var, byte b) {
        this.a = b;
    }
}
