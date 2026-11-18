package a3;

import android.util.Pair;
import ch.p0;
import ch.q0;
import da.h0;
import da.v1;
import di.fc;
import fi.b4;
import fi.s0;
import h9.r1;
import hi.ya;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class c implements Comparator {
    public final int f73a;

    public c(int i7) {
        this.f73a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        r1 a10;
        int i11;
        int i12 = -1;
        switch (this.f73a) {
            case 0:
                i7 = ((e2.u) obj2).f10760j;
                i10 = ((e2.u) obj).f10760j;
                break;
            case 1:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case 2:
                return Integer.compare(((j) ((List) obj).get(0)).f99f, ((j) ((List) obj2).get(0)).f99f);
            case 3:
                List list = (List) obj;
                List list2 = (List) obj2;
                return h9.u.f(r.c((r) Collections.max(list, new c(6)), (r) Collections.max(list2, new c(6)))).a(list.size(), list2.size()).b((r) Collections.max(list, new c(7)), (r) Collections.max(list2, new c(7)), new c(7)).e();
            case 4:
                return ((i) Collections.max((List) obj)).compareTo((i) Collections.max((List) obj2));
            case 5:
                return ((o) ((List) obj).get(0)).compareTo((o) ((List) obj2).get(0));
            case 6:
                return r.c((r) obj, (r) obj2);
            case 7:
                r rVar = (r) obj;
                r rVar2 = (r) obj2;
                boolean z10 = rVar.f118e;
                int i13 = rVar.f122s;
                if (z10 && rVar.f120n) {
                    a10 = s.f126l;
                } else {
                    a10 = s.f126l.a();
                }
                boolean z11 = rVar.f119f.F;
                h9.w wVar = h9.w.f14084a;
                if (z11) {
                    wVar = wVar.b(Integer.valueOf(i13), Integer.valueOf(rVar2.f122s), s.f126l.a());
                }
                h9.w b10 = wVar.c(rVar.P, rVar2.P).b(Integer.valueOf(rVar.f123w), Integer.valueOf(rVar2.f123w), a10);
                if (rVar.L && rVar.N) {
                    b10 = b10.a(rVar.O, rVar2.O);
                }
                return b10.c(rVar.M, rVar2.M).b(Integer.valueOf(i13), Integer.valueOf(rVar2.f122s), a10).e();
            case 8:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 9:
                return ((h0) ((v1) obj)).f8040a.compareTo(((h0) ((v1) obj2)).f8040a);
            case 10:
                return ((b3.t) obj).f2921a - ((b3.t) obj2).f2921a;
            case 11:
                return Float.compare(((b3.t) obj).f2923c, ((b3.t) obj2).f2923c);
            case 12:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 13:
                return (int) (q0.j((TLObject) obj) - q0.j((TLObject) obj2));
            case 14:
                return Integer.compare(((d4.d) obj2).f7811b, ((d4.d) obj).f7811b);
            case 15:
                i7 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 16:
                i7 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 17:
                return (int) (((fc) obj2).d - ((fc) obj).d);
            case 18:
                int i14 = (((ei.b) obj2).f10968c > ((ei.b) obj).f10968c ? 1 : (((ei.b) obj2).f10968c == ((ei.b) obj).f10968c ? 0 : -1));
                if (i14 > 0) {
                    return 1;
                }
                if (i14 < 0) {
                    return -1;
                }
                return 0;
            case 19:
                i7 = ((fi.p) obj2).f12357b;
                i10 = ((fi.p) obj).f12357b;
                break;
            case 20:
            case 22:
                i7 = ((s0) obj2).f12516c;
                i10 = ((s0) obj).f12516c;
                break;
            case 21:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 23:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 24:
                int i15 = ProfileStoriesView.f43797t0;
                return (int) (((b4) obj2).f11774i - ((b4) obj).f11774i);
            case 25:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 26:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 27:
                String name = ((File) obj).getName();
                int i16 = ga.b.f13272f;
                return name.substring(0, i16).compareTo(((File) obj2).getName().substring(0, i16));
            case 28:
                p0 p0Var = (p0) obj2;
                String str = ((p0) obj).f5478f;
                if (str != null && str.equals("❤")) {
                    i11 = -1;
                } else {
                    i11 = 0;
                }
                String str2 = p0Var.f5478f;
                if (str2 == null || !str2.equals("❤")) {
                    i12 = 0;
                }
                return i11 - i12;
            default:
                return (int) (((ya) obj2).f15787e - ((ya) obj).f15787e);
        }
        return i7 - i10;
    }
}
