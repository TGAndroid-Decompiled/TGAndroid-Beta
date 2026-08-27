package a5;

import ag.c3;
import android.graphics.RectF;
import android.util.Pair;
import b5.p;
import b5.q;
import com.google.android.exoplayer2.upstream.v0;
import h3.t0;
import h9.d0;
import h9.h1;
import hh.cb;
import ig.r0;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jh.g4;
import jh.o;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;
import p8.k0;
import p8.r;
import p8.t;

public final class f implements Comparator {

    public final int f74a;

    public f(int i10) {
        this.f74a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f74a) {
            case 0:
                return Integer.compare(((g) obj).f76a.f79b, ((g) obj2).f76a.f79b);
            case 1:
                return Long.compare(((e) obj).f72b, ((e) obj2).f72b);
            case 2:
                return (int) ((((c3) obj).f319a * 100.0f) - (((c3) obj2).f319a * 100.0f));
            case 3:
                i10 = ((t0) obj2).f8189n;
                i11 = ((t0) obj).f8189n;
                break;
            case 4:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 5:
                k0 k0Var = q.f1974k;
                return 0;
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i12 = 9;
                int i13 = 10;
                return r.f(p.c((p) Collections.max(list, new f(i12)), (p) Collections.max(list2, new f(i12)))).a(list.size(), list2.size()).b((p) Collections.max(list, new f(i13)), (p) Collections.max(list2, new f(i13)), new f(i13)).e();
            case 7:
                return ((b5.f) Collections.max((List) obj)).compareTo((b5.f) Collections.max((List) obj2));
            case 8:
                return ((b5.m) ((List) obj).get(0)).compareTo((b5.m) ((List) obj2).get(0));
            case 9:
                return p.c((p) obj, (p) obj2);
            case 10:
                p pVar = (p) obj;
                p pVar2 = (p) obj2;
                boolean z10 = pVar.f1966e;
                int i14 = pVar.f1969r;
                k0 k0VarA = (z10 && pVar.f1968n) ? q.f1974k : q.f1974k.a();
                return t.f45586a.b(Integer.valueOf(i14), Integer.valueOf(pVar2.f1969r), pVar.f1967f.I ? q.f1974k.a() : q.f1975l).b(Integer.valueOf(pVar.f1970s), Integer.valueOf(pVar2.f1970s), k0VarA).b(Integer.valueOf(i14), Integer.valueOf(pVar2.f1969r), k0VarA).e();
            case 11:
                return ((String) obj).compareTo((String) obj2);
            case 12:
                return ((v0) obj).f3074a - ((v0) obj2).f3074a;
            case 13:
                return Float.compare(((v0) obj).f3076c, ((v0) obj2).f3076c);
            case 14:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 15:
                return ((d0) ((h1) obj)).f8669a.compareTo(((d0) ((h1) obj2)).f8669a);
            case 16:
                RectF rectF = (RectF) obj;
                RectF rectF2 = (RectF) obj2;
                if (Math.abs(rectF.top - rectF2.top) > 1.0E-4f) {
                    if (rectF.top < rectF2.top) {
                        return -1;
                    }
                } else {
                    if (Math.abs(rectF.left - rectF2.left) <= 1.0E-4f) {
                        return 0;
                    }
                    if (rectF.left < rectF2.left) {
                        return -1;
                    }
                }
                return 1;
            case 17:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 18:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 19:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 20:
                return (int) (((cb) obj2).d - ((cb) obj).d);
            case 21:
                return (int) (r0.k((TLObject) obj) - r0.k((TLObject) obj2));
            case 22:
                long j10 = ((ih.a) obj2).f11478c;
                long j11 = ((ih.a) obj).f11478c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 23:
                i10 = ((o) obj2).f13721b;
                i11 = ((o) obj).f13721b;
                break;
            case 24:
            case 26:
                i10 = ((jh.t0) obj2).f13987c;
                i11 = ((jh.t0) obj).f13987c;
                break;
            case 25:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 27:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 28:
                int i15 = ProfileStoriesView.f36200o0;
                return (int) (((g4) obj2).f13360i - ((g4) obj).f13360i);
            default:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
        }
        return i10 - i11;
    }
}
