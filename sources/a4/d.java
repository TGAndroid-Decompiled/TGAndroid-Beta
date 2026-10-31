package a4;

import ag.h3;
import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import kg.y1;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b1;
import org.telegram.messenger.bj;
import org.telegram.messenger.ef;
import org.telegram.messenger.f0;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.k7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import s4.c1;
public final class d implements Comparator {
    public final int f233a;

    public d(int i10) {
        this.f233a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int top;
        int top2;
        int i10;
        int i11;
        int compare;
        switch (this.f233a) {
            case 0:
                return Integer.compare(((e) obj2).f236b, ((e) obj).f236b);
            case 1:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 2:
                return ((h3) obj).f553c - ((h3) obj2).f553c;
            case 3:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 4:
                String name = ((File) obj).getName();
                int i12 = ca.b.f4077f;
                return name.substring(0, i12).compareTo(((File) obj2).getName().substring(0, i12));
            case 5:
                top = ((c1) obj2).f47898a.getTop();
                top2 = ((c1) obj).f47898a.getTop();
                break;
            case 6:
                return Integer.compare(((i4.d) obj).f8182a.f8185b, ((i4.d) obj2).f8182a.f8185b);
            case 7:
                return Long.compare(((i4.c) obj).f8179b, ((i4.c) obj2).f8179b);
            case 8:
                top = Integer.bitCount(((Integer) obj2).intValue());
                top2 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 9:
                return (int) ((((y1) obj).f11339a * 100.0f) - (((y1) obj2).f11339a * 100.0f));
            case 10:
                m2.b bVar = (m2.b) obj;
                m2.b bVar2 = (m2.b) obj2;
                int compare2 = Integer.compare(bVar.f12629c, bVar2.f12629c);
                if (compare2 == 0) {
                    return bVar.f12628b.compareTo(bVar2.f12628b);
                }
                return compare2;
            case 11:
                return ((String) obj).compareTo((String) obj2);
            case 12:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i13 = 0; i13 < bArr.length; i13++) {
                    byte b10 = bArr[i13];
                    byte b11 = bArr2[i13];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 13:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                int i14 = f0Var.f15490b;
                int i15 = f0Var2.f15490b;
                if (i14 < i15) {
                    return -1;
                }
                if (i14 > i15 || (i10 = f0Var.f15491c) < (i11 = f0Var2.f15491c)) {
                    return 1;
                }
                if (i10 > i11) {
                    return -1;
                }
                return 0;
            case 14:
                int i16 = (((b1) obj2).e > ((b1) obj).e ? 1 : (((b1) obj2).e == ((b1) obj).e ? 0 : -1));
                if (i16 > 0) {
                    return -1;
                }
                if (i16 < 0) {
                    return 1;
                }
                return 0;
            case 15:
                return i0.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 16:
                int i17 = (((TLRPC.TL_contact) obj).user_id > ((TLRPC.TL_contact) obj2).user_id ? 1 : (((TLRPC.TL_contact) obj).user_id == ((TLRPC.TL_contact) obj2).user_id ? 0 : -1));
                if (i17 > 0) {
                    return 1;
                }
                if (i17 < 0) {
                    return -1;
                }
                return 0;
            case 17:
                Integer num = 0;
                HashMap hashMap = k6.h;
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
                if (num2.intValue() < num.intValue()) {
                    return 1;
                }
                return 0;
            case 18:
                int i18 = (((k7) obj).f16542a > ((k7) obj2).f16542a ? 1 : (((k7) obj).f16542a == ((k7) obj2).f16542a ? 0 : -1));
                if (i18 > 0) {
                    return 1;
                }
                if (i18 < 0) {
                    return -1;
                }
                return 0;
            case 19:
                jj jjVar = (jj) obj;
                jj jjVar2 = (jj) obj2;
                String[] strArr = MediaController.U1;
                int f12 = jjVar.f1();
                int f13 = jjVar2.f1();
                long j10 = jjVar.f16337k.grouped_id;
                long j11 = jjVar2.f16337k.grouped_id;
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
            case 20:
                String[] strArr2 = MediaController.U1;
                int i19 = (((ef) obj).D > ((ef) obj2).D ? 1 : (((ef) obj).D == ((ef) obj2).D ? 0 : -1));
                if (i19 < 0) {
                    return 1;
                }
                if (i19 > 0) {
                    return -1;
                }
                return 0;
            case 21:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d10 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d10) {
                    return -1;
                }
                if (d < d10) {
                    return 1;
                }
                return 0;
            case 22:
                int i20 = ((TLRPC.MessageEntity) obj).offset;
                int i21 = ((TLRPC.MessageEntity) obj2).offset;
                if (i20 > i21) {
                    return 1;
                }
                if (i20 < i21) {
                    return -1;
                }
                return 0;
            case 23:
                double d11 = ((TLRPC.TL_topPeer) obj).rating;
                double d12 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d11 > d12) {
                    return -1;
                }
                if (d11 < d12) {
                    return 1;
                }
                return 0;
            case 24:
                double d13 = ((TLRPC.TL_topPeer) obj).rating;
                double d14 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d13 > d14) {
                    return -1;
                }
                if (d13 < d14) {
                    return 1;
                }
                return 0;
            case 25:
                int i22 = ((TLRPC.MessageEntity) obj).offset;
                int i23 = ((TLRPC.MessageEntity) obj2).offset;
                if (i22 > i23) {
                    return 1;
                }
                if (i22 < i23) {
                    return -1;
                }
                return 0;
            case 26:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 27:
                int i24 = ((TLRPC.MessageEntity) obj).offset;
                int i25 = ((TLRPC.MessageEntity) obj2).offset;
                if (i24 > i25) {
                    return 1;
                }
                if (i24 < i25) {
                    return -1;
                }
                return 0;
            case 28:
                top = ((String) obj2).length();
                top2 = ((String) obj).length();
                break;
            default:
                return ((bj) obj).f14775a - ((bj) obj2).f14775a;
        }
        return top - top2;
    }
}
