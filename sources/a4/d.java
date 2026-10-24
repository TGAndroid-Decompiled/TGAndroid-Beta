package a4;

import ah.i1;
import ah.j1;
import ai.fe;
import android.util.Pair;
import ci.q;
import ci.r4;
import ci.w0;
import ei.ac;
import hg.g0;
import hg.y1;
import java.io.File;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;
import s4.b1;
public final class d implements Comparator {
    public final int f233a;

    public d(int i10) {
        this.f233a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13 = -1;
        switch (this.f233a) {
            case 0:
                return Integer.compare(((e) obj2).f236b, ((e) obj).f236b);
            case 1:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 2:
                return (int) (j1.k((TLObject) obj) - j1.k((TLObject) obj2));
            case 3:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 4:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 5:
                return (int) (((fe) obj2).d - ((fe) obj).d);
            case 6:
                int i14 = (((bi.b) obj2).f4430c > ((bi.b) obj).f4430c ? 1 : (((bi.b) obj2).f4430c == ((bi.b) obj).f4430c ? 0 : -1));
                if (i14 > 0) {
                    return 1;
                }
                if (i14 < 0) {
                    return -1;
                }
                return 0;
            case 7:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 8:
                String name = ((File) obj).getName();
                int i15 = ca.b.f5044f;
                return name.substring(0, i15).compareTo(((File) obj2).getName().substring(0, i15));
            case 9:
                i10 = ((q) obj2).f5755b;
                i11 = ((q) obj).f5755b;
                break;
            case 10:
            case 12:
                i10 = ((w0) obj2).f6039c;
                i11 = ((w0) obj).f6039c;
                break;
            case 11:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 13:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 14:
                int i16 = ProfileStoriesView.f34169s0;
                return (int) (((r4) obj2).f5862i - ((r4) obj).f5862i);
            case 15:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 16:
                i1 i1Var = (i1) obj2;
                String str = ((i1) obj).f784f;
                if (str != null && str.equals("❤")) {
                    i12 = -1;
                } else {
                    i12 = 0;
                }
                String str2 = i1Var.f784f;
                return i12 - ((str2 == null || !str2.equals("❤")) ? 0 : 0);
            case 17:
                return (int) (((ac) obj2).e - ((ac) obj).e);
            case 18:
                int i17 = ((g0) obj).f11894b;
                int i18 = ((g0) obj2).f11894b;
                if (i17 < i18) {
                    return 1;
                }
                if (i17 > i18) {
                    return -1;
                }
                return 0;
            case 19:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 20:
                int i19 = ((y1) obj).f12140b;
                int i20 = ((y1) obj2).f12140b;
                if (i19 < i20) {
                    return 1;
                }
                if (i19 > i20) {
                    return -1;
                }
                return 0;
            case 21:
                return Integer.compare(((i4.d) obj).f12716a.f12719b, ((i4.d) obj2).f12716a.f12719b);
            case 22:
                return Long.compare(((i4.c) obj).f12713b, ((i4.c) obj2).f12713b);
            case 23:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 24:
                return ((ig.y1) obj).f13131c - ((ig.y1) obj2).f13131c;
            case 25:
                i10 = Integer.bitCount(((Integer) obj2).intValue());
                i11 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 26:
                m2.b bVar = (m2.b) obj;
                m2.b bVar2 = (m2.b) obj2;
                int compare = Integer.compare(bVar.f16477c, bVar2.f16477c);
                if (compare == 0) {
                    return bVar.f16476b.compareTo(bVar2.f16476b);
                }
                return compare;
            case 27:
                i10 = ((b1) obj2).f46342a.getTop();
                i11 = ((b1) obj).f46342a.getTop();
                break;
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i21 = 0; i21 < bArr.length; i21++) {
                    byte b10 = bArr[i21];
                    byte b11 = bArr2[i21];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
        }
        return i10 - i11;
    }
}
