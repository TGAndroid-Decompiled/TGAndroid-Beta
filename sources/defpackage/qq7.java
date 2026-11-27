package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class qq7 implements Comparator {
    public final byte a;

    public qq7(byte b) {
        this.a = b;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        long j;
        switch (this.a) {
            case 0:
                int i3 = (yac.h(((Integer) obj).intValue()).Z > yac.h(((Integer) obj2).intValue()).Z ? 1 : (yac.h(((Integer) obj).intValue()).Z == yac.h(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i3 > 0) {
                    return 1;
                }
                if (i3 >= 0) {
                    return 0;
                }
                return -1;
            case 1:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 2:
                return ((Integer) obj2).intValue() - ((Integer) obj).intValue();
            case 3:
                int h1 = b18.h1((String) obj);
                int h12 = b18.h1((String) obj2);
                if (h1 < h12) {
                    return -1;
                }
                if (h1 <= h12) {
                    return 0;
                }
                return 1;
            case 4:
                int h13 = b18.h1((String) obj);
                int h14 = b18.h1((String) obj2);
                if (h13 < h14) {
                    return -1;
                }
                if (h13 <= h14) {
                    return 0;
                }
                return 1;
            case 5:
                Drawable[] drawableArr = PhotoViewer.d9;
                return ((r47) obj).e1() - ((r47) obj2).e1();
            case 6:
                float f = ((ri8) obj).a;
                float f2 = ((ri8) obj2).a;
                if (f > f2) {
                    return -1;
                }
                if (f >= f2) {
                    return 0;
                }
                return 1;
            case 7:
                return (int) ((((cm8) obj).a * 100.0f) - (((cm8) obj2).a * 100.0f));
            case 8:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 9:
                if (obj instanceof es8) {
                    i = ((es8) obj).g;
                } else if (obj instanceof hc7) {
                    i = ((hc7) obj).d;
                } else {
                    i = 0;
                }
                if (obj2 instanceof es8) {
                    i2 = ((es8) obj2).g;
                } else if (obj2 instanceof hc7) {
                    i2 = ((hc7) obj2).d;
                } else {
                    i2 = 0;
                }
                if (i < i2) {
                    return -1;
                }
                if (i <= i2) {
                    return 0;
                }
                return 1;
            case 10:
                int i4 = ProfileStoriesView.t0;
                return (int) (((iv8) obj2).i - ((iv8) obj).i);
            case 11:
                return Long.compare(((wea) obj).b, ((wea) obj2).b);
            case 12:
                return ((a19) obj).c - ((a19) obj2).c;
            case 13:
                return (int) (x49.j((TLObject) obj) - x49.j((TLObject) obj2));
            case 14:
                return Float.compare(((z69) obj).a, ((z69) obj2).a);
            case 15:
                return ((ak9) obj).d - ((ak9) obj2).d;
            case 16:
                return ((mt9) obj2).c() - ((mt9) obj).c();
            case 17:
                return ((mt9) obj).k - ((mt9) obj2).k;
            case 18:
                return ((mt9) obj2).c() - ((mt9) obj).c();
            case 19:
                int i5 = ((qv9) obj).b;
                int i6 = ((qv9) obj2).b;
                if (i5 < i6) {
                    return 1;
                }
                if (i5 <= i6) {
                    return 0;
                }
                return -1;
            case 20:
                return hl.A(((TLRPC.Message) obj).seq_out, ((TLRPC.Message) obj2).seq_out);
            case 21:
                int i7 = ((vx9) obj).b.out_seq_no;
                int i8 = ((vx9) obj2).b.out_seq_no;
                if (i7 > i8) {
                    return 1;
                }
                if (i7 >= i8) {
                    return 0;
                }
                return -1;
            case 22:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() <= ((Float) pair.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 23:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() <= ((Float) pair3.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 24:
                return ((h80) ((dz2) obj)).a.compareTo(((h80) ((dz2) obj2)).a);
            case 25:
                int i9 = (yac.h(((Integer) obj).intValue()).Z > yac.h(((Integer) obj2).intValue()).Z ? 1 : (yac.h(((Integer) obj).intValue()).Z == yac.h(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i9 > 0) {
                    return 1;
                }
                if (i9 >= 0) {
                    return 0;
                }
                return -1;
            case 26:
                int i10 = ((zda) obj).c;
                int i11 = ((zda) obj2).c;
                if (i10 < i11) {
                    return 1;
                }
                if (i10 <= i11) {
                    return 0;
                }
                return -1;
            case 27:
                wea weaVar = (wea) obj;
                wea weaVar2 = (wea) obj2;
                wea weaVar3 = xea.x1;
                long j2 = 0;
                if (weaVar3 == weaVar) {
                    j = -200000;
                } else {
                    j = 0;
                }
                if (!weaVar.d) {
                    j += 100000;
                }
                if (weaVar3 == weaVar2) {
                    j2 = -200000;
                }
                if (!weaVar2.d) {
                    j2 += 100000;
                }
                return Long.compare(weaVar.b + j, weaVar2.b + j2);
            case 28:
                return ((eia) obj2).c - ((eia) obj).c;
            default:
                return ((gna) obj).a - ((gna) obj2).a;
        }
    }
}
