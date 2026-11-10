package a3;

import android.util.Pair;
import bi.vd;
import ch.o0;
import ch.p0;
import da.h0;
import da.v1;
import di.l4;
import di.t0;
import fi.ab;
import h9.r1;
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
                i7 = ((e2.u) obj2).f10611j;
                i10 = ((e2.u) obj).f10611j;
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
                boolean z9 = rVar.f118e;
                int i13 = rVar.f122s;
                if (z9 && rVar.f120n) {
                    a10 = s.f126l;
                } else {
                    a10 = s.f126l.a();
                }
                boolean z10 = rVar.f119f.F;
                h9.w wVar = h9.w.f14409a;
                if (z10) {
                    wVar = wVar.b(Integer.valueOf(i13), Integer.valueOf(rVar2.f122s), s.f126l.a());
                }
                h9.w b10 = wVar.c(rVar.O, rVar2.O).b(Integer.valueOf(rVar.f123w), Integer.valueOf(rVar2.f123w), a10);
                if (rVar.K && rVar.M) {
                    b10 = b10.a(rVar.N, rVar2.N);
                }
                return b10.c(rVar.L, rVar2.L).b(Integer.valueOf(i13), Integer.valueOf(rVar2.f122s), a10).e();
            case 8:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 9:
                return ((h0) ((v1) obj)).f8371a.compareTo(((h0) ((v1) obj2)).f8371a);
            case 10:
                return ((b3.s) obj).f2970a - ((b3.s) obj2).f2970a;
            case 11:
                return Float.compare(((b3.s) obj).f2972c, ((b3.s) obj2).f2972c);
            case 12:
                i7 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 13:
                i7 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 14:
                return (int) (((vd) obj2).d - ((vd) obj).d);
            case 15:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 16:
                return (int) (p0.j((TLObject) obj) - p0.j((TLObject) obj2));
            case 17:
                int i14 = (((ci.b) obj2).f6422c > ((ci.b) obj).f6422c ? 1 : (((ci.b) obj2).f6422c == ((ci.b) obj).f6422c ? 0 : -1));
                if (i14 > 0) {
                    return 1;
                }
                if (i14 < 0) {
                    return -1;
                }
                return 0;
            case 18:
                return Integer.compare(((d4.d) obj2).f8142b, ((d4.d) obj).f8142b);
            case 19:
                i7 = ((di.p) obj2).f9478b;
                i10 = ((di.p) obj).f9478b;
                break;
            case 20:
            case 22:
                i7 = ((t0) obj2).f9774c;
                i10 = ((t0) obj).f9774c;
                break;
            case 21:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 23:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 24:
                int i15 = ProfileStoriesView.f41977s0;
                return (int) (((l4) obj2).f9321i - ((l4) obj).f9321i);
            case 25:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 26:
                o0 o0Var = (o0) obj2;
                String str = ((o0) obj).f6359f;
                if (str != null && str.equals("❤")) {
                    i11 = -1;
                } else {
                    i11 = 0;
                }
                String str2 = o0Var.f6359f;
                if (str2 == null || !str2.equals("❤")) {
                    i12 = 0;
                }
                return i11 - i12;
            case 27:
                return (int) (((ab) obj2).f11627e - ((ab) obj).f11627e);
            case 28:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                String name = ((File) obj).getName();
                int i16 = ga.b.f13610f;
                return name.substring(0, i16).compareTo(((File) obj2).getName().substring(0, i16));
        }
        return i7 - i10;
    }
}
