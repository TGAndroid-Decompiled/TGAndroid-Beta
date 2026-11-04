package o0;

import android.graphics.Typeface;
import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d0;
import org.telegram.messenger.g0;
import org.telegram.messenger.g7;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.mo;
import org.telegram.messenger.ri;
import org.telegram.messenger.y0;
import org.telegram.messenger.ye;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class a implements Comparator {
    public final int f20475a;

    public a(int i3) {
        this.f20475a = i3;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i3;
        int i10;
        int compare;
        int length;
        int length2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        switch (this.f20475a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i17 = 0; i17 < bArr.length; i17++) {
                    byte b10 = bArr[i17];
                    byte b11 = bArr2[i17];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 1:
                d0 d0Var = (d0) obj;
                d0 d0Var2 = (d0) obj2;
                int i18 = d0Var.f22113b;
                int i19 = d0Var2.f22113b;
                if (i18 < i19) {
                    return -1;
                }
                if (i18 > i19 || (i3 = d0Var.f22114c) < (i10 = d0Var2.f22114c)) {
                    return 1;
                }
                if (i3 > i10) {
                    return -1;
                }
                return 0;
            case 2:
                int i20 = (((y0) obj2).f26503e > ((y0) obj).f26503e ? 1 : (((y0) obj2).f26503e == ((y0) obj).f26503e ? 0 : -1));
                if (i20 > 0) {
                    return -1;
                }
                if (i20 >= 0) {
                    return 0;
                }
                return 1;
            case 3:
                return g0.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 4:
                int i21 = (((TLRPC.TL_contact) obj).user_id > ((TLRPC.TL_contact) obj2).user_id ? 1 : (((TLRPC.TL_contact) obj).user_id == ((TLRPC.TL_contact) obj2).user_id ? 0 : -1));
                if (i21 > 0) {
                    return 1;
                }
                if (i21 < 0) {
                    return -1;
                }
                return 0;
            case 5:
                Integer num = 0;
                HashMap hashMap = i6.h;
                Integer num2 = (Integer) hashMap.get((String) obj);
                Integer num3 = (Integer) hashMap.get((String) obj2);
                if (num2 == null) {
                    num2 = num;
                }
                if (num3 != null) {
                    num = num3;
                }
                if (num2.intValue() > num.intValue()) {
                    return -1;
                }
                if (num2.intValue() >= num.intValue()) {
                    return 0;
                }
                return 1;
            case 6:
                int i22 = (((g7) obj).f22670a > ((g7) obj2).f22670a ? 1 : (((g7) obj).f22670a == ((g7) obj2).f22670a ? 0 : -1));
                if (i22 > 0) {
                    return 1;
                }
                if (i22 < 0) {
                    return -1;
                }
                return 0;
            case 7:
                zi ziVar = (zi) obj;
                zi ziVar2 = (zi) obj2;
                String[] strArr = MediaController.W1;
                int f12 = ziVar.f1();
                int f13 = ziVar2.f1();
                long j10 = ziVar.f26868k.grouped_id;
                long j11 = ziVar2.f26868k.grouped_id;
                if (f12 < 0 && f13 < 0) {
                    if (j10 != 0 && j10 == j11) {
                        compare = Integer.compare(f12, f13);
                    } else {
                        return Integer.compare(f13, f12);
                    }
                } else if (j10 != 0 && j10 == j11) {
                    compare = Integer.compare(f13, f12);
                } else {
                    return Integer.compare(f12, f13);
                }
                return -compare;
            case 8:
                String[] strArr2 = MediaController.W1;
                int i23 = (((ye) obj).D > ((ye) obj2).D ? 1 : (((ye) obj).D == ((ye) obj2).D ? 0 : -1));
                if (i23 < 0) {
                    return 1;
                }
                if (i23 > 0) {
                    return -1;
                }
                return 0;
            case 9:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d10 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d10) {
                    return -1;
                }
                if (d >= d10) {
                    return 0;
                }
                return 1;
            case 10:
                int i24 = ((TLRPC.MessageEntity) obj).offset;
                int i25 = ((TLRPC.MessageEntity) obj2).offset;
                if (i24 > i25) {
                    return 1;
                }
                if (i24 < i25) {
                    return -1;
                }
                return 0;
            case 11:
                double d11 = ((TLRPC.TL_topPeer) obj).rating;
                double d12 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d11 > d12) {
                    return -1;
                }
                if (d11 >= d12) {
                    return 0;
                }
                return 1;
            case 12:
                double d13 = ((TLRPC.TL_topPeer) obj).rating;
                double d14 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d13 > d14) {
                    return -1;
                }
                if (d13 >= d14) {
                    return 0;
                }
                return 1;
            case 13:
                int i26 = ((TLRPC.MessageEntity) obj).offset;
                int i27 = ((TLRPC.MessageEntity) obj2).offset;
                if (i26 > i27) {
                    return 1;
                }
                if (i26 < i27) {
                    return -1;
                }
                return 0;
            case 14:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 15:
                int i28 = ((TLRPC.MessageEntity) obj).offset;
                int i29 = ((TLRPC.MessageEntity) obj2).offset;
                if (i28 > i29) {
                    return 1;
                }
                if (i28 < i29) {
                    return -1;
                }
                return 0;
            case 16:
                length = ((String) obj2).length();
                length2 = ((String) obj).length();
                break;
            case 17:
                return ((ri) obj).f25140a - ((ri) obj2).f25140a;
            case 18:
                return g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 19:
                return g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 20:
                return g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 21:
                length = ((zi) obj2).f1();
                length2 = ((zi) obj).f1();
                break;
            case 22:
                zi ziVar3 = (zi) obj;
                zi ziVar4 = (zi) obj2;
                if (ziVar3.f26868k.date == ziVar4.f26868k.date && ziVar3.f1() >= 0 && ziVar4.f1() >= 0) {
                    i11 = ziVar4.f1();
                    i12 = ziVar3.f1();
                } else {
                    i11 = ziVar4.f26868k.date;
                    i12 = ziVar3.f26868k.date;
                }
                return i11 - i12;
            case 23:
                length = ((zi) obj2).f1();
                length2 = ((zi) obj).f1();
                break;
            case 24:
                TLRPC.Update update = (TLRPC.Update) obj;
                TLRPC.Update update2 = (TLRPC.Update) obj2;
                int Y1 = hp.Y1(update);
                int Y12 = hp.Y1(update2);
                if (Y1 != Y12) {
                    return g0.A(Y1, Y12);
                }
                if (Y1 == 0) {
                    return g0.A(hp.W1(update), hp.W1(update2));
                }
                if (Y1 == 1) {
                    if (update instanceof TL_update.TL_updateNewEncryptedMessage) {
                        i13 = ((TL_update.TL_updateNewEncryptedMessage) update).qts;
                    } else {
                        i13 = 0;
                    }
                    if (update2 instanceof TL_update.TL_updateNewEncryptedMessage) {
                        i16 = ((TL_update.TL_updateNewEncryptedMessage) update2).qts;
                    }
                    return g0.A(i13, i16);
                }
                if (Y1 == 2) {
                    int i30 = (hp.V1(update) > hp.V1(update2) ? 1 : (hp.V1(update) == hp.V1(update2) ? 0 : -1));
                    if (i30 == 0) {
                        return g0.A(hp.W1(update), hp.W1(update2));
                    }
                    Typeface typeface = g0.f22580a;
                    if (i30 != 0) {
                        if (i30 <= 0) {
                            return -1;
                        }
                        return 1;
                    }
                }
                return 0;
            case 25:
                TLRPC.TL_savedReactionTag tL_savedReactionTag = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = (TLRPC.TL_savedReactionTag) obj2;
                int i31 = tL_savedReactionTag.count;
                int i32 = tL_savedReactionTag2.count;
                if (i31 == i32) {
                    return Long.compare(hp.Q1(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, hp.Q1(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE);
                }
                return i32 - i31;
            case 26:
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag4 = (TLRPC.TL_savedReactionTag) obj2;
                int i33 = tL_savedReactionTag3.count;
                int i34 = tL_savedReactionTag4.count;
                if (i33 == i34) {
                    return Long.compare(hp.Q1(tL_savedReactionTag4.reaction) ^ Long.MIN_VALUE, hp.Q1(tL_savedReactionTag3.reaction) ^ Long.MIN_VALUE);
                }
                return i34 - i33;
            case 27:
                int i35 = ((mo) obj).f24241f;
                int i36 = ((mo) obj2).f24241f;
                if (i35 > i36) {
                    return 1;
                }
                if (i35 < i36) {
                    return -1;
                }
                return 0;
            case 28:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                if (updates instanceof TLRPC.TL_updatesCombined) {
                    i14 = updates.seq_start;
                } else {
                    i14 = updates.seq;
                }
                if (updates2 instanceof TLRPC.TL_updatesCombined) {
                    i15 = updates2.seq_start;
                } else {
                    i15 = updates2.seq;
                }
                return g0.A(i14, i15);
            default:
                int i37 = ((mo) obj).f24241f;
                int i38 = ((mo) obj2).f24241f;
                if (i37 > i38) {
                    return 1;
                }
                if (i37 < i38) {
                    return -1;
                }
                return 0;
        }
        return length - length2;
    }

    public a(hp hpVar, int i3) {
        this.f20475a = i3;
    }
}
