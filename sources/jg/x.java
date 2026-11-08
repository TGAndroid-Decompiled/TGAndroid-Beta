package jg;

import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.aj;
import org.telegram.messenger.g7;
import org.telegram.messenger.gf;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class x implements Comparator {
    public final int f16979a;

    public x(int i7) {
        this.f16979a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int top;
        int top2;
        int i7;
        int i10;
        int compare;
        switch (this.f16979a) {
            case 0:
                int i11 = ((g0) obj).f16728b;
                int i12 = ((g0) obj2).f16728b;
                if (i11 < i12) {
                    return 1;
                }
                if (i11 > i12) {
                    return -1;
                }
                return 0;
            case 1:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 2:
                int i13 = ((x1) obj).f16982b;
                int i14 = ((x1) obj2).f16982b;
                if (i13 < i14) {
                    return 1;
                }
                if (i13 > i14) {
                    return -1;
                }
                return 0;
            case 3:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 4:
                return ((kg.s1) obj).f17534c - ((kg.s1) obj2).f17534c;
            case 5:
                return Integer.compare(((l4.d) obj).f18150a.f18153b, ((l4.d) obj2).f18150a.f18153b);
            case 6:
                return Long.compare(((l4.c) obj).f18147b, ((l4.c) obj2).f18147b);
            case 7:
                top = ((v4.d1) obj2).f57043a.getTop();
                top2 = ((v4.d1) obj).f57043a.getTop();
                break;
            case 8:
                top = Integer.bitCount(((Integer) obj2).intValue());
                top2 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 9:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i15 = 0; i15 < bArr.length; i15++) {
                    byte b10 = bArr[i15];
                    byte b11 = bArr2[i15];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 10:
                p2.b bVar = (p2.b) obj;
                p2.b bVar2 = (p2.b) obj2;
                int compare2 = Integer.compare(bVar.f53096c, bVar2.f53096c);
                if (compare2 == 0) {
                    return bVar.f53095b.compareTo(bVar2.f53095b);
                }
                return compare2;
            case 11:
                org.telegram.messenger.d0 d0Var = (org.telegram.messenger.d0) obj;
                org.telegram.messenger.d0 d0Var2 = (org.telegram.messenger.d0) obj2;
                int i16 = d0Var.f21962b;
                int i17 = d0Var2.f21962b;
                if (i16 < i17) {
                    return -1;
                }
                if (i16 > i17 || (i7 = d0Var.f21963c) < (i10 = d0Var2.f21963c)) {
                    return 1;
                }
                if (i7 > i10) {
                    return -1;
                }
                return 0;
            case 12:
                int i18 = (((org.telegram.messenger.y0) obj2).f26568e > ((org.telegram.messenger.y0) obj).f26568e ? 1 : (((org.telegram.messenger.y0) obj2).f26568e == ((org.telegram.messenger.y0) obj).f26568e ? 0 : -1));
                if (i18 > 0) {
                    return -1;
                }
                if (i18 >= 0) {
                    return 0;
                }
                return 1;
            case 13:
                return org.telegram.messenger.g0.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 14:
                int i19 = (((TLRPC.TL_contact) obj).user_id > ((TLRPC.TL_contact) obj2).user_id ? 1 : (((TLRPC.TL_contact) obj).user_id == ((TLRPC.TL_contact) obj2).user_id ? 0 : -1));
                if (i19 > 0) {
                    return 1;
                }
                if (i19 < 0) {
                    return -1;
                }
                return 0;
            case 15:
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
            case 16:
                int i20 = (((g7) obj).f22626a > ((g7) obj2).f22626a ? 1 : (((g7) obj).f22626a == ((g7) obj2).f22626a ? 0 : -1));
                if (i20 > 0) {
                    return 1;
                }
                if (i20 < 0) {
                    return -1;
                }
                return 0;
            case 17:
                ij ijVar = (ij) obj;
                ij ijVar2 = (ij) obj2;
                String[] strArr = MediaController.V1;
                int f12 = ijVar.f1();
                int f13 = ijVar2.f1();
                long j3 = ijVar.f23262k.grouped_id;
                long j10 = ijVar2.f23262k.grouped_id;
                if (f12 < 0 && f13 < 0) {
                    if (j3 != 0 && j3 == j10) {
                        compare = Integer.compare(f12, f13);
                    } else {
                        return Integer.compare(f13, f12);
                    }
                } else if (j3 != 0 && j3 == j10) {
                    compare = Integer.compare(f13, f12);
                } else {
                    return Integer.compare(f12, f13);
                }
                return -compare;
            case 18:
                String[] strArr2 = MediaController.V1;
                int i21 = (((gf) obj).D > ((gf) obj2).D ? 1 : (((gf) obj).D == ((gf) obj2).D ? 0 : -1));
                if (i21 < 0) {
                    return 1;
                }
                if (i21 > 0) {
                    return -1;
                }
                return 0;
            case 19:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d2 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d2) {
                    return -1;
                }
                if (d >= d2) {
                    return 0;
                }
                return 1;
            case 20:
                int i22 = ((TLRPC.MessageEntity) obj).offset;
                int i23 = ((TLRPC.MessageEntity) obj2).offset;
                if (i22 > i23) {
                    return 1;
                }
                if (i22 < i23) {
                    return -1;
                }
                return 0;
            case 21:
                double d10 = ((TLRPC.TL_topPeer) obj).rating;
                double d11 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d10 > d11) {
                    return -1;
                }
                if (d10 >= d11) {
                    return 0;
                }
                return 1;
            case 22:
                double d12 = ((TLRPC.TL_topPeer) obj).rating;
                double d13 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d12 > d13) {
                    return -1;
                }
                if (d12 >= d13) {
                    return 0;
                }
                return 1;
            case 23:
                int i24 = ((TLRPC.MessageEntity) obj).offset;
                int i25 = ((TLRPC.MessageEntity) obj2).offset;
                if (i24 > i25) {
                    return 1;
                }
                if (i24 < i25) {
                    return -1;
                }
                return 0;
            case 24:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 25:
                int i26 = ((TLRPC.MessageEntity) obj).offset;
                int i27 = ((TLRPC.MessageEntity) obj2).offset;
                if (i26 > i27) {
                    return 1;
                }
                if (i26 < i27) {
                    return -1;
                }
                return 0;
            case 26:
                top = ((String) obj2).length();
                top2 = ((String) obj).length();
                break;
            case 27:
                return ((aj) obj).f21441a - ((aj) obj2).f21441a;
            case 28:
                return org.telegram.messenger.g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            default:
                return org.telegram.messenger.g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
        }
        return top - top2;
    }
}
