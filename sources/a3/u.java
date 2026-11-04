package a3;

import android.util.Pair;
import ci.mc;
import dh.n0;
import dh.o0;
import ei.l4;
import ei.v0;
import gi.ab;
import java.io.File;
import java.util.Comparator;
import kg.d0;
import kg.t1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;
import u4.d1;
public final class u implements Comparator {
    public final int f115a;

    public u(int i3) {
        this.f115a = i3;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i3;
        int i10;
        int i11;
        int i12 = -1;
        switch (this.f115a) {
            case 0:
                return ((v) obj).f116a - ((v) obj2).f116a;
            case 1:
                return Float.compare(((v) obj).f118c, ((v) obj2).f118c);
            case 2:
                return Integer.compare(((c4.d) obj2).f4165b, ((c4.d) obj).f4165b);
            case 3:
                i3 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 4:
                i3 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 5:
                return (int) (((mc) obj2).d - ((mc) obj).d);
            case 6:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 7:
                return (int) (o0.j((TLObject) obj) - o0.j((TLObject) obj2));
            case 8:
                int i13 = (((di.b) obj2).f9182c > ((di.b) obj).f9182c ? 1 : (((di.b) obj2).f9182c == ((di.b) obj).f9182c ? 0 : -1));
                if (i13 > 0) {
                    return 1;
                }
                if (i13 < 0) {
                    return -1;
                }
                return 0;
            case 9:
                i3 = ((ei.q) obj2).f10782b;
                i10 = ((ei.q) obj).f10782b;
                break;
            case 10:
            case 12:
                i3 = ((v0) obj2).f11107c;
                i10 = ((v0) obj).f11107c;
                break;
            case 11:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 13:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 14:
                int i14 = ProfileStoriesView.f42008t0;
                return (int) (((l4) obj2).f10611i - ((l4) obj).f10611i);
            case 15:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 16:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 17:
                String name = ((File) obj).getName();
                int i15 = fa.d.f11531f;
                return name.substring(0, i15).compareTo(((File) obj2).getName().substring(0, i15));
            case 18:
                n0 n0Var = (n0) obj2;
                String str = ((n0) obj).f9097f;
                if (str != null && str.equals("❤")) {
                    i11 = -1;
                } else {
                    i11 = 0;
                }
                String str2 = n0Var.f9097f;
                if (str2 == null || !str2.equals("❤")) {
                    i12 = 0;
                }
                return i11 - i12;
            case 19:
                return (int) (((ab) obj2).f12415e - ((ab) obj).f12415e);
            case 20:
                return Integer.compare(((k4.d) obj).f16849a.f16852b, ((k4.d) obj2).f16849a.f16852b);
            case 21:
                return Long.compare(((k4.c) obj).f16846b, ((k4.c) obj2).f16846b);
            case 22:
                int i16 = ((d0) obj).f16947b;
                int i17 = ((d0) obj2).f16947b;
                if (i16 < i17) {
                    return 1;
                }
                if (i16 > i17) {
                    return -1;
                }
                return 0;
            case 23:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 24:
                int i18 = ((t1) obj).f17198b;
                int i19 = ((t1) obj2).f17198b;
                if (i18 < i19) {
                    return 1;
                }
                if (i18 > i19) {
                    return -1;
                }
                return 0;
            case 25:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 26:
                return ((lg.t1) obj).f18475c - ((lg.t1) obj2).f18475c;
            case 27:
                i3 = Integer.bitCount(((Integer) obj2).intValue());
                i10 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 28:
                o2.b bVar = (o2.b) obj;
                o2.b bVar2 = (o2.b) obj2;
                int compare = Integer.compare(bVar.f20511c, bVar2.f20511c);
                if (compare == 0) {
                    return bVar.f20510b.compareTo(bVar2.f20510b);
                }
                return compare;
            default:
                i3 = ((d1) obj2).f55540a.getTop();
                i10 = ((d1) obj).f55540a.getTop();
                break;
        }
        return i3 - i10;
    }
}
