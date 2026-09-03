package e5;

import android.graphics.RectF;
import f5.o;
import f5.p;
import fg.h2;
import g5.s0;
import j3.n0;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k9.d0;
import k9.h1;
import mh.xa;
import ng.r0;
import oh.u0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import s8.h0;
import s8.n;
public final class f implements Comparator {
    public final int f4967a;

    public f(int i10) {
        this.f4967a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        h0 a2;
        h0 h0Var;
        switch (this.f4967a) {
            case 0:
                return Integer.compare(((g) obj).f4969a.f4972b, ((g) obj2).f4969a.f4972b);
            case 1:
                return Long.compare(((e) obj).f4965b, ((e) obj2).f4965b);
            case 2:
                i10 = ((n0) obj2).f9323n;
                i11 = ((n0) obj).f9323n;
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
                h0 h0Var2 = p.f6052k;
                return 0;
            case 5:
                List list = (List) obj;
                List list2 = (List) obj2;
                return n.f(o.c((o) Collections.max(list, new f(8)), (o) Collections.max(list2, new f(8)))).a(list.size(), list2.size()).b((o) Collections.max(list, new f(9)), (o) Collections.max(list2, new f(9)), new f(9)).e();
            case 6:
                return ((f5.e) Collections.max((List) obj)).compareTo((f5.e) Collections.max((List) obj2));
            case 7:
                return ((f5.l) ((List) obj).get(0)).compareTo((f5.l) ((List) obj2).get(0));
            case 8:
                return o.c((o) obj, (o) obj2);
            case 9:
                o oVar = (o) obj;
                o oVar2 = (o) obj2;
                boolean z4 = oVar.f6044e;
                int i12 = oVar.f6047r;
                if (z4 && oVar.f6046n) {
                    a2 = p.f6052k;
                } else {
                    a2 = p.f6052k.a();
                }
                Integer valueOf = Integer.valueOf(i12);
                Integer valueOf2 = Integer.valueOf(oVar2.f6047r);
                if (oVar.f6045f.J) {
                    h0Var = p.f6052k.a();
                } else {
                    h0Var = p.f6053l;
                }
                return s8.p.f47158a.b(valueOf, valueOf2, h0Var).b(Integer.valueOf(oVar.f6048s), Integer.valueOf(oVar2.f6048s), a2).b(Integer.valueOf(i12), Integer.valueOf(oVar2.f6047r), a2).e();
            case 10:
                return (int) ((((h2) obj).f6327a * 100.0f) - (((h2) obj2).f6327a * 100.0f));
            case 11:
                return ((s0) obj).f6925a - ((s0) obj2).f6925a;
            case 12:
                return Float.compare(((s0) obj).f6927c, ((s0) obj2).f6927c);
            case 13:
                return ((String) obj).compareTo((String) obj2);
            case 14:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 15:
                return ((d0) ((h1) obj)).f10853a.compareTo(((d0) ((h1) obj2)).f10853a);
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
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 22:
                String name = ((File) obj).getName();
                int i13 = n9.a.f15867f;
                return name.substring(0, i13).compareTo(((File) obj2).getName().substring(0, i13));
            case 23:
                return (int) (r0.k((TLObject) obj) - r0.k((TLObject) obj2));
            case 24:
                int i14 = (((nh.a) obj2).f16247c > ((nh.a) obj).f16247c ? 1 : (((nh.a) obj2).f16247c == ((nh.a) obj).f16247c ? 0 : -1));
                if (i14 > 0) {
                    return 1;
                }
                if (i14 < 0) {
                    return -1;
                }
                return 0;
            case 25:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i15 = 0; i15 < bArr.length; i15++) {
                    byte b10 = bArr[i15];
                    byte b11 = bArr2[i15];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 26:
                i10 = ((oh.o) obj2).f17519b;
                i11 = ((oh.o) obj).f17519b;
                break;
            case 27:
            default:
                i10 = ((u0) obj2).f17802c;
                i11 = ((u0) obj).f17802c;
                break;
            case 28:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
        }
        return i10 - i11;
    }
}
