package jg;

import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.g7;
import org.telegram.messenger.j6;
import org.telegram.messenger.xi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class w implements Comparator {
    public final int f17799a;

    public w(int i7) {
        this.f17799a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int bitCount;
        int bitCount2;
        int i7;
        int i10;
        int compare;
        int i11;
        int i12;
        switch (this.f17799a) {
            case 0:
                int i13 = ((g0) obj).f17557b;
                int i14 = ((g0) obj2).f17557b;
                if (i13 < i14) {
                    return 1;
                }
                if (i13 > i14) {
                    return -1;
                }
                return 0;
            case 1:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 2:
                int i15 = ((x1) obj).f17813b;
                int i16 = ((x1) obj2).f17813b;
                if (i15 < i16) {
                    return 1;
                }
                if (i15 > i16) {
                    return -1;
                }
                return 0;
            case 3:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 4:
                return ((kg.v1) obj).f18603c - ((kg.v1) obj2).f18603c;
            case 5:
                return Integer.compare(((l4.d) obj).f19744a.f19747b, ((l4.d) obj2).f19744a.f19747b);
            case 6:
                return Long.compare(((l4.c) obj).f19741b, ((l4.c) obj2).f19741b);
            case 7:
                bitCount = Integer.bitCount(((Integer) obj2).intValue());
                bitCount2 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 8:
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
            case 9:
                p2.b bVar = (p2.b) obj;
                p2.b bVar2 = (p2.b) obj2;
                int compare2 = Integer.compare(bVar.f55209c, bVar2.f55209c);
                if (compare2 == 0) {
                    return bVar.f55208b.compareTo(bVar2.f55208b);
                }
                return compare2;
            case 10:
                org.telegram.messenger.d0 d0Var = (org.telegram.messenger.d0) obj;
                org.telegram.messenger.d0 d0Var2 = (org.telegram.messenger.d0) obj2;
                int i18 = d0Var.f23567b;
                int i19 = d0Var2.f23567b;
                if (i18 < i19) {
                    return -1;
                }
                if (i18 > i19 || (i7 = d0Var.f23568c) < (i10 = d0Var2.f23568c)) {
                    return 1;
                }
                if (i7 > i10) {
                    return -1;
                }
                return 0;
            case 11:
                int i20 = (((org.telegram.messenger.y0) obj2).f28179e > ((org.telegram.messenger.y0) obj).f28179e ? 1 : (((org.telegram.messenger.y0) obj2).f28179e == ((org.telegram.messenger.y0) obj).f28179e ? 0 : -1));
                if (i20 > 0) {
                    return -1;
                }
                if (i20 >= 0) {
                    return 0;
                }
                return 1;
            case 12:
                return org.telegram.messenger.g0.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 13:
                int i21 = (((TLRPC.TL_contact) obj).user_id > ((TLRPC.TL_contact) obj2).user_id ? 1 : (((TLRPC.TL_contact) obj).user_id == ((TLRPC.TL_contact) obj2).user_id ? 0 : -1));
                if (i21 > 0) {
                    return 1;
                }
                if (i21 < 0) {
                    return -1;
                }
                return 0;
            case 14:
                Integer num = 0;
                HashMap hashMap = j6.h;
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
            case 15:
                int i22 = (((g7) obj).f24281a > ((g7) obj2).f24281a ? 1 : (((g7) obj).f24281a == ((g7) obj2).f24281a ? 0 : -1));
                if (i22 > 0) {
                    return 1;
                }
                if (i22 < 0) {
                    return -1;
                }
                return 0;
            case 16:
                String[] strArr = MediaController.W1;
                int i23 = (((ef) obj).D > ((ef) obj2).D ? 1 : (((ef) obj).D == ((ef) obj2).D ? 0 : -1));
                if (i23 < 0) {
                    return 1;
                }
                if (i23 > 0) {
                    return -1;
                }
                return 0;
            case 17:
                fj fjVar = (fj) obj;
                fj fjVar2 = (fj) obj2;
                String[] strArr2 = MediaController.W1;
                int e12 = fjVar.e1();
                int e13 = fjVar2.e1();
                long j3 = fjVar.f24073k.grouped_id;
                long j10 = fjVar2.f24073k.grouped_id;
                if (e12 < 0 && e13 < 0) {
                    if (j3 != 0 && j3 == j10) {
                        compare = Integer.compare(e12, e13);
                    } else {
                        return Integer.compare(e13, e12);
                    }
                } else if (j3 != 0 && j3 == j10) {
                    compare = Integer.compare(e13, e12);
                } else {
                    return Integer.compare(e12, e13);
                }
                return -compare;
            case 18:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d2 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d2) {
                    return -1;
                }
                if (d >= d2) {
                    return 0;
                }
                return 1;
            case 19:
                int i24 = ((TLRPC.MessageEntity) obj).offset;
                int i25 = ((TLRPC.MessageEntity) obj2).offset;
                if (i24 > i25) {
                    return 1;
                }
                if (i24 < i25) {
                    return -1;
                }
                return 0;
            case 20:
                double d10 = ((TLRPC.TL_topPeer) obj).rating;
                double d11 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d10 > d11) {
                    return -1;
                }
                if (d10 >= d11) {
                    return 0;
                }
                return 1;
            case 21:
                double d12 = ((TLRPC.TL_topPeer) obj).rating;
                double d13 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d12 > d13) {
                    return -1;
                }
                if (d12 >= d13) {
                    return 0;
                }
                return 1;
            case 22:
                int i26 = ((TLRPC.MessageEntity) obj).offset;
                int i27 = ((TLRPC.MessageEntity) obj2).offset;
                if (i26 > i27) {
                    return 1;
                }
                if (i26 < i27) {
                    return -1;
                }
                return 0;
            case 23:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 24:
                int i28 = ((TLRPC.MessageEntity) obj).offset;
                int i29 = ((TLRPC.MessageEntity) obj2).offset;
                if (i28 > i29) {
                    return 1;
                }
                if (i28 < i29) {
                    return -1;
                }
                return 0;
            case 25:
                bitCount = ((String) obj2).length();
                bitCount2 = ((String) obj).length();
                break;
            case 26:
                return ((xi) obj).f27996a - ((xi) obj2).f27996a;
            case 27:
                return org.telegram.messenger.g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 28:
                bitCount = ((fj) obj2).e1();
                bitCount2 = ((fj) obj).e1();
                break;
            default:
                fj fjVar3 = (fj) obj;
                fj fjVar4 = (fj) obj2;
                if (fjVar3.f24073k.date == fjVar4.f24073k.date && fjVar3.e1() >= 0 && fjVar4.e1() >= 0) {
                    i11 = fjVar4.e1();
                    i12 = fjVar3.e1();
                } else {
                    i11 = fjVar4.f24073k.date;
                    i12 = fjVar3.f24073k.date;
                }
                return i11 - i12;
        }
        return bitCount - bitCount2;
    }
}
