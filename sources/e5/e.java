package e5;

import android.graphics.RectF;
import android.util.Pair;
import eg.i2;
import f5.o;
import f5.p;
import g5.s0;
import j3.n0;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k9.d0;
import k9.h1;
import lh.xa;
import mg.r0;
import nh.u0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import s8.h0;
import s8.n;
public final class e implements Comparator {
    public final int f5135a;

    public e(int i10) {
        this.f5135a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        h0 a2;
        h0 h0Var;
        switch (this.f5135a) {
            case 0:
                return Integer.compare(((f) obj).f5137a.f5140b, ((f) obj2).f5137a.f5140b);
            case 1:
                return Long.compare(((d) obj).f5133b, ((d) obj2).f5133b);
            case 2:
                return (int) ((((i2) obj).f5296a * 100.0f) - (((i2) obj2).f5296a * 100.0f));
            case 3:
                i10 = ((n0) obj2).f8721n;
                i11 = ((n0) obj).f8721n;
                break;
            case 4:
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
            case 5:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                h0 h0Var2 = p.f5939k;
                return 0;
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                return n.f(o.c((o) Collections.max(list, new e(9)), (o) Collections.max(list2, new e(9)))).a(list.size(), list2.size()).b((o) Collections.max(list, new e(10)), (o) Collections.max(list2, new e(10)), new e(10)).e();
            case 7:
                return ((f5.e) Collections.max((List) obj)).compareTo((f5.e) Collections.max((List) obj2));
            case 8:
                return ((f5.l) ((List) obj).get(0)).compareTo((f5.l) ((List) obj2).get(0));
            case 9:
                return o.c((o) obj, (o) obj2);
            case 10:
                o oVar = (o) obj;
                o oVar2 = (o) obj2;
                boolean z4 = oVar.e;
                int i12 = oVar.f5934r;
                if (z4 && oVar.f5933n) {
                    a2 = p.f5939k;
                } else {
                    a2 = p.f5939k.a();
                }
                Integer valueOf = Integer.valueOf(i12);
                Integer valueOf2 = Integer.valueOf(oVar2.f5934r);
                if (oVar.f5932f.J) {
                    h0Var = p.f5939k.a();
                } else {
                    h0Var = p.f5940l;
                }
                return s8.p.f44207a.b(valueOf, valueOf2, h0Var).b(Integer.valueOf(oVar.f5935s), Integer.valueOf(oVar2.f5935s), a2).b(Integer.valueOf(i12), Integer.valueOf(oVar2.f5934r), a2).e();
            case 11:
                return ((s0) obj).f6436a - ((s0) obj2).f6436a;
            case 12:
                return Float.compare(((s0) obj).f6438c, ((s0) obj2).f6438c);
            case 13:
                return ((String) obj).compareTo((String) obj2);
            case 14:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 15:
                return ((d0) ((h1) obj)).f10092a.compareTo(((d0) ((h1) obj2)).f10092a);
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
                return (int) (((xa) obj2).d - ((xa) obj).d);
            case 21:
                return (int) (r0.k((TLObject) obj) - r0.k((TLObject) obj2));
            case 22:
                int i13 = (((mh.a) obj2).f14159c > ((mh.a) obj).f14159c ? 1 : (((mh.a) obj2).f14159c == ((mh.a) obj).f14159c ? 0 : -1));
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
                int i14 = n9.a.f14840f;
                return name.substring(0, i14).compareTo(((File) obj2).getName().substring(0, i14));
            case 25:
                i10 = ((nh.p) obj2).f15707b;
                i11 = ((nh.p) obj).f15707b;
                break;
            case 26:
            case 28:
                i10 = ((u0) obj2).f15929c;
                i11 = ((u0) obj).f15929c;
                break;
            case 27:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            default:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
        }
        return i10 - i11;
    }
}
