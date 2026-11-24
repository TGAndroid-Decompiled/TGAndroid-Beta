package defpackage;

import android.graphics.Typeface;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class el6 implements Comparator {
    public final byte a;

    public el6(byte b) {
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
                String[] strArr = MediaController.W1;
                int i11 = (((jm6) obj).D > ((jm6) obj2).D ? 1 : (((jm6) obj).D == ((jm6) obj2).D ? 0 : -1));
                if (i11 < 0) {
                    return 1;
                }
                if (i11 <= 0) {
                    return 0;
                }
                return -1;
            case 1:
                k27 k27Var = (k27) obj;
                k27 k27Var2 = (k27) obj2;
                String[] strArr2 = MediaController.W1;
                int e1 = k27Var.e1();
                int e12 = k27Var2.e1();
                long j = k27Var.k.grouped_id;
                long j2 = k27Var2.k.grouped_id;
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
            case 2:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d2 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d2) {
                    return -1;
                }
                if (d >= d2) {
                    return 0;
                }
                return 1;
            case 3:
                int i12 = ((TLRPC.MessageEntity) obj).offset;
                int i13 = ((TLRPC.MessageEntity) obj2).offset;
                if (i12 > i13) {
                    return 1;
                }
                if (i12 >= i13) {
                    return 0;
                }
                return -1;
            case 4:
                double d3 = ((TLRPC.TL_topPeer) obj).rating;
                double d4 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d3 > d4) {
                    return -1;
                }
                if (d3 >= d4) {
                    return 0;
                }
                return 1;
            case 5:
                double d5 = ((TLRPC.TL_topPeer) obj).rating;
                double d6 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d5 > d6) {
                    return -1;
                }
                if (d5 >= d6) {
                    return 0;
                }
                return 1;
            case 6:
                int i14 = ((TLRPC.MessageEntity) obj).offset;
                int i15 = ((TLRPC.MessageEntity) obj2).offset;
                if (i14 > i15) {
                    return 1;
                }
                if (i14 >= i15) {
                    return 0;
                }
                return -1;
            case 7:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 8:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 9:
                int i16 = ((TLRPC.MessageEntity) obj).offset;
                int i17 = ((TLRPC.MessageEntity) obj2).offset;
                if (i16 > i17) {
                    return 1;
                }
                if (i16 >= i17) {
                    return 0;
                }
                return -1;
            case 10:
                return ((String) obj2).length() - ((String) obj).length();
            case 11:
                return ((c27) obj).a - ((c27) obj2).a;
            case 12:
                return gl.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 13:
                return ((k27) obj2).e1() - ((k27) obj).e1();
            case 14:
                k27 k27Var3 = (k27) obj;
                k27 k27Var4 = (k27) obj2;
                if (k27Var3.k.date == k27Var4.k.date && k27Var3.e1() >= 0 && k27Var4.e1() >= 0) {
                    i = k27Var4.e1();
                    i2 = k27Var3.e1();
                } else {
                    i = k27Var4.k.date;
                    i2 = k27Var3.k.date;
                }
                return i - i2;
            case 15:
                return ((k27) obj2).e1() - ((k27) obj).e1();
            case 16:
                TLRPC.Update update = (TLRPC.Update) obj;
                TLRPC.Update update2 = (TLRPC.Update) obj2;
                int T1 = na7.T1(update);
                int T12 = na7.T1(update2);
                if (T1 != T12) {
                    return gl.A(T1, T12);
                }
                if (T1 == 0) {
                    return gl.A(na7.R1(update), na7.R1(update2));
                }
                if (T1 == 1) {
                    if (update instanceof TL_update.TL_updateNewEncryptedMessage) {
                        i3 = ((TL_update.TL_updateNewEncryptedMessage) update).qts;
                    } else {
                        i3 = 0;
                    }
                    if (update2 instanceof TL_update.TL_updateNewEncryptedMessage) {
                        i10 = ((TL_update.TL_updateNewEncryptedMessage) update2).qts;
                    }
                    return gl.A(i3, i10);
                } else if (T1 != 2) {
                    return 0;
                } else {
                    int i18 = (na7.Q1(update) > na7.Q1(update2) ? 1 : (na7.Q1(update) == na7.Q1(update2) ? 0 : -1));
                    if (i18 == 0) {
                        return gl.A(na7.R1(update), na7.R1(update2));
                    }
                    Typeface typeface = gl.a;
                    if (i18 == 0) {
                        return 0;
                    }
                    if (i18 <= 0) {
                        return -1;
                    }
                    return 1;
                }
            case 17:
                TLRPC.TL_savedReactionTag tL_savedReactionTag = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = (TLRPC.TL_savedReactionTag) obj2;
                int i19 = tL_savedReactionTag.count;
                int i20 = tL_savedReactionTag2.count;
                if (i19 == i20) {
                    return Long.compare(na7.N1(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, na7.N1(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE);
                }
                return i20 - i19;
            case 18:
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag4 = (TLRPC.TL_savedReactionTag) obj2;
                int i21 = tL_savedReactionTag3.count;
                int i22 = tL_savedReactionTag4.count;
                if (i21 == i22) {
                    return Long.compare(na7.N1(tL_savedReactionTag4.reaction) ^ Long.MIN_VALUE, na7.N1(tL_savedReactionTag3.reaction) ^ Long.MIN_VALUE);
                }
                return i22 - i21;
            case 19:
                int i23 = ((t97) obj).f;
                int i24 = ((t97) obj2).f;
                if (i23 > i24) {
                    return 1;
                }
                if (i23 >= i24) {
                    return 0;
                }
                return -1;
            case 20:
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
                return gl.A(i4, i5);
            case 21:
                return gl.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 22:
                return gl.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 23:
                int i25 = ((t97) obj).f;
                int i26 = ((t97) obj2).f;
                if (i25 > i26) {
                    return 1;
                }
                if (i25 >= i26) {
                    return 0;
                }
                return -1;
            case 24:
                TLRPC.Message message = (TLRPC.Message) obj;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                if (!k27.f3(message.id) && !k27.f3(message2.id)) {
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
                        if (!k27.f3(message.id) || k27.f3(message2.id)) {
                            if ((k27.f3(message.id) || !k27.f3(message2.id)) && (i6 = message.id) <= (i7 = message2.id)) {
                                if (i6 >= i7) {
                                    return 0;
                                }
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            case 25:
                int i32 = ((t97) obj).f;
                int i33 = ((t97) obj2).f;
                if (i32 > i33) {
                    return 1;
                }
                if (i32 >= i33) {
                    return 0;
                }
                return -1;
            case 26:
                int i34 = ((xk3) obj).b;
                int i35 = ((xk3) obj2).b;
                if (i34 < i35) {
                    return 1;
                }
                if (i34 <= i35) {
                    return 0;
                }
                return -1;
            case 27:
                int i36 = (y6c.h(((Integer) obj).intValue()).Z > y6c.h(((Integer) obj2).intValue()).Z ? 1 : (y6c.h(((Integer) obj).intValue()).Z == y6c.h(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i36 > 0) {
                    return 1;
                }
                if (i36 >= 0) {
                    return 0;
                }
                return -1;
            case 28:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            default:
                return ((Integer) obj2).intValue() - ((Integer) obj).intValue();
        }
    }

    public el6(na7 na7Var, byte b) {
        this.a = b;
    }
}
