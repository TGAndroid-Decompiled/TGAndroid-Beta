package c5;

import android.graphics.RectF;
import android.util.Pair;
import cg.j2;
import com.google.android.exoplayer2.upstream.v0;
import d5.o;
import d5.p;
import i9.d0;
import i9.h1;
import j3.t0;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jh.wa;
import kg.r0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import q8.k0;
import q8.r;
import q8.t;
public final class e implements Comparator {
    public final int f2973a;

    public e(int i10) {
        this.f2973a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        k0 a2;
        k0 k0Var;
        switch (this.f2973a) {
            case 0:
                return Integer.compare(((f) obj).f2975a.f2978b, ((f) obj2).f2975a.f2978b);
            case 1:
                return Long.compare(((d) obj).f2971b, ((d) obj2).f2971b);
            case 2:
                return (int) ((((j2) obj).f3169a * 100.0f) - (((j2) obj2).f3169a * 100.0f));
            case 3:
                return ((v0) obj).f3651a - ((v0) obj2).f3651a;
            case 4:
                return Float.compare(((v0) obj).f3653c, ((v0) obj2).f3653c);
            case 5:
                i10 = ((t0) obj2).f10802n;
                i11 = ((t0) obj).f10802n;
                break;
            case 6:
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
            case 7:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                k0 k0Var2 = p.f5363k;
                return 0;
            case 8:
                List list = (List) obj;
                List list2 = (List) obj2;
                return r.f(o.c((o) Collections.max(list, new e(11)), (o) Collections.max(list2, new e(11)))).a(list.size(), list2.size()).b((o) Collections.max(list, new e(12)), (o) Collections.max(list2, new e(12)), new e(12)).e();
            case 9:
                return ((d5.e) Collections.max((List) obj)).compareTo((d5.e) Collections.max((List) obj2));
            case 10:
                return ((d5.l) ((List) obj).get(0)).compareTo((d5.l) ((List) obj2).get(0));
            case 11:
                return o.c((o) obj, (o) obj2);
            case 12:
                o oVar = (o) obj;
                o oVar2 = (o) obj2;
                boolean z10 = oVar.f5355e;
                int i12 = oVar.f5358r;
                if (z10 && oVar.f5357n) {
                    a2 = p.f5363k;
                } else {
                    a2 = p.f5363k.a();
                }
                Integer valueOf = Integer.valueOf(i12);
                Integer valueOf2 = Integer.valueOf(oVar2.f5358r);
                if (oVar.f5356f.I) {
                    k0Var = p.f5363k.a();
                } else {
                    k0Var = p.f5364l;
                }
                return t.f46493a.b(valueOf, valueOf2, k0Var).b(Integer.valueOf(oVar.f5359s), Integer.valueOf(oVar2.f5359s), a2).b(Integer.valueOf(i12), Integer.valueOf(oVar2.f5358r), a2).e();
            case 13:
                return ((String) obj).compareTo((String) obj2);
            case 14:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 15:
                return ((d0) ((h1) obj)).f8633a.compareTo(((d0) ((h1) obj2)).f8633a);
            case 16:
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
            case 17:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 18:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 19:
                return (int) (((wa) obj2).d - ((wa) obj).d);
            case 20:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 21:
                return (int) (r0.k((TLObject) obj) - r0.k((TLObject) obj2));
            case 22:
                int i13 = (((kh.a) obj2).f13891c > ((kh.a) obj).f13891c ? 1 : (((kh.a) obj2).f13891c == ((kh.a) obj).f13891c ? 0 : -1));
                if (i13 > 0) {
                    return 1;
                }
                if (i13 < 0) {
                    return -1;
                }
                return 0;
            case 23:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 24:
                String name = ((File) obj).getName();
                int i14 = l9.a.f15096f;
                return name.substring(0, i14).compareTo(((File) obj2).getName().substring(0, i14));
            case 25:
                i10 = ((lh.o) obj2).f15996b;
                i11 = ((lh.o) obj).f15996b;
                break;
            case 26:
            case 28:
                i10 = ((lh.t0) obj2).f16252c;
                i11 = ((lh.t0) obj).f16252c;
                break;
            case 27:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            default:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
        }
        return i10 - i11;
    }
}
