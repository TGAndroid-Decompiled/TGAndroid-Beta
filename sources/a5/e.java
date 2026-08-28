package a5;

import android.graphics.RectF;
import android.util.Pair;
import b5.n;
import b5.q;
import b5.r;
import com.google.android.exoplayer2.upstream.v0;
import g9.d0;
import g9.h1;
import gh.cb;
import h3.t0;
import hg.s0;
import ih.k4;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o8.k0;
import o8.t;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class e implements Comparator {
    public final int f72a;

    public e(int i9) {
        this.f72a = i9;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i9;
        int i10;
        k0 a2;
        k0 k0Var;
        switch (this.f72a) {
            case 0:
                return Integer.compare(((f) obj).f74a.f77b, ((f) obj2).f74a.f77b);
            case 1:
                return Long.compare(((d) obj).f70b, ((d) obj2).f70b);
            case 2:
                i9 = ((t0) obj2).f9765n;
                i10 = ((t0) obj).f9765n;
                break;
            case 3:
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
            case 4:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                k0 k0Var2 = r.f1489k;
                return 0;
            case 5:
                List list = (List) obj;
                List list2 = (List) obj2;
                return o8.r.f(q.c((q) Collections.max(list, new e(8)), (q) Collections.max(list2, new e(8)))).a(list.size(), list2.size()).b((q) Collections.max(list, new e(9)), (q) Collections.max(list2, new e(9)), new e(9)).e();
            case 6:
                return ((b5.g) Collections.max((List) obj)).compareTo((b5.g) Collections.max((List) obj2));
            case 7:
                return ((n) ((List) obj).get(0)).compareTo((n) ((List) obj2).get(0));
            case 8:
                return q.c((q) obj, (q) obj2);
            case 9:
                q qVar = (q) obj;
                q qVar2 = (q) obj2;
                boolean z10 = qVar.f1481e;
                int i11 = qVar.f1484r;
                if (z10 && qVar.f1483n) {
                    a2 = r.f1489k;
                } else {
                    a2 = r.f1489k.a();
                }
                Integer valueOf = Integer.valueOf(i11);
                Integer valueOf2 = Integer.valueOf(qVar2.f1484r);
                if (qVar.f1482f.I) {
                    k0Var = r.f1489k.a();
                } else {
                    k0Var = r.f1490l;
                }
                return t.f19087a.b(valueOf, valueOf2, k0Var).b(Integer.valueOf(qVar.f1485s), Integer.valueOf(qVar2.f1485s), a2).b(Integer.valueOf(i11), Integer.valueOf(qVar2.f1484r), a2).e();
            case 10:
                return ((String) obj).compareTo((String) obj2);
            case 11:
                return ((v0) obj).f2637a - ((v0) obj2).f2637a;
            case 12:
                return Float.compare(((v0) obj).f2639c, ((v0) obj2).f2639c);
            case 13:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 14:
                return ((d0) ((h1) obj)).f7498a.compareTo(((d0) ((h1) obj2)).f7498a);
            case 15:
                RectF rectF = (RectF) obj;
                RectF rectF2 = (RectF) obj2;
                if (Math.abs(rectF.top - rectF2.top) > 1.0E-4f) {
                    if (rectF.top < rectF2.top) {
                        return -1;
                    }
                } else if (Math.abs(rectF.left - rectF2.left) > 1.0E-4f) {
                    if (rectF.left < rectF2.left) {
                        return -1;
                    }
                } else {
                    return 0;
                }
                return 1;
            case 16:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 17:
                i9 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 18:
                i9 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 19:
                return (int) (((cb) obj2).d - ((cb) obj).d);
            case 20:
                return (int) (s0.k((TLObject) obj) - s0.k((TLObject) obj2));
            case 21:
                int i12 = (((hh.a) obj2).f10782c > ((hh.a) obj).f10782c ? 1 : (((hh.a) obj2).f10782c == ((hh.a) obj).f10782c ? 0 : -1));
                if (i12 > 0) {
                    return 1;
                }
                if (i12 < 0) {
                    return -1;
                }
                return 0;
            case 22:
                i9 = ((ih.q) obj2).f11980b;
                i10 = ((ih.q) obj).f11980b;
                break;
            case 23:
            case 25:
                i9 = ((ih.v0) obj2).f12222c;
                i10 = ((ih.v0) obj).f12222c;
                break;
            case 24:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 26:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 27:
                int i13 = ProfileStoriesView.f36197o0;
                return (int) (((k4) obj2).f11677i - ((k4) obj).f11677i);
            case 28:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            default:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
        return i9 - i10;
    }
}
