package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class fx7 implements Comparator {
    public final byte a;

    public fx7(byte b) {
        this.a = b;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        long j;
        switch (this.a) {
            case 0:
                int g1 = vx7.g1((String) obj);
                int g12 = vx7.g1((String) obj2);
                if (g1 < g12) {
                    return -1;
                }
                if (g1 <= g12) {
                    return 0;
                }
                return 1;
            case 1:
                int g13 = vx7.g1((String) obj);
                int g14 = vx7.g1((String) obj2);
                if (g13 < g14) {
                    return -1;
                }
                if (g13 <= g14) {
                    return 0;
                }
                return 1;
            case 2:
                Drawable[] drawableArr = PhotoViewer.f9;
                return ((k27) obj).e1() - ((k27) obj2).e1();
            case 3:
                float f = ((df8) obj).a;
                float f2 = ((df8) obj2).a;
                if (f > f2) {
                    return -1;
                }
                if (f >= f2) {
                    return 0;
                }
                return 1;
            case 4:
                return (int) ((((pi8) obj).a * 100.0f) - (((pi8) obj2).a * 100.0f));
            case 5:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 6:
                if (obj instanceof so8) {
                    i = ((so8) obj).g;
                } else if (obj instanceof aa7) {
                    i = ((aa7) obj).d;
                } else {
                    i = 0;
                }
                if (obj2 instanceof so8) {
                    i2 = ((so8) obj2).g;
                } else if (obj2 instanceof aa7) {
                    i2 = ((aa7) obj2).d;
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
            case 7:
                int i3 = ProfileStoriesView.t0;
                return (int) (((zr8) obj2).i - ((zr8) obj).i);
            case 8:
                return Long.compare(((fba) obj).b, ((fba) obj2).b);
            case 9:
                return ((nx8) obj).c - ((nx8) obj2).c;
            case 10:
                return (int) (i19.j((TLObject) obj) - i19.j((TLObject) obj2));
            case 11:
                return Float.compare(((k39) obj).a, ((k39) obj2).a);
            case 12:
                return ((jg9) obj).d - ((jg9) obj2).d;
            case 13:
                return ((up9) obj2).c() - ((up9) obj).c();
            case 14:
                return ((up9) obj).k - ((up9) obj2).k;
            case 15:
                return ((up9) obj2).c() - ((up9) obj).c();
            case 16:
                int i4 = ((xr9) obj).b;
                int i5 = ((xr9) obj2).b;
                if (i4 < i5) {
                    return 1;
                }
                if (i4 <= i5) {
                    return 0;
                }
                return -1;
            case 17:
                int i6 = ((au9) obj).b.out_seq_no;
                int i7 = ((au9) obj2).b.out_seq_no;
                if (i6 > i7) {
                    return 1;
                }
                if (i6 >= i7) {
                    return 0;
                }
                return -1;
            case 18:
                return gl.A(((TLRPC.Message) obj).seq_out, ((TLRPC.Message) obj2).seq_out);
            case 19:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() <= ((Float) pair.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 20:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() <= ((Float) pair3.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 21:
                return ((f80) ((iy2) obj)).a.compareTo(((f80) ((iy2) obj2)).a);
            case 22:
                int i8 = (y6c.h(((Integer) obj).intValue()).Z > y6c.h(((Integer) obj2).intValue()).Z ? 1 : (y6c.h(((Integer) obj).intValue()).Z == y6c.h(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i8 > 0) {
                    return 1;
                }
                if (i8 >= 0) {
                    return 0;
                }
                return -1;
            case 23:
                int i9 = ((iaa) obj).c;
                int i10 = ((iaa) obj2).c;
                if (i9 < i10) {
                    return 1;
                }
                if (i9 <= i10) {
                    return 0;
                }
                return -1;
            case 24:
                fba fbaVar = (fba) obj;
                fba fbaVar2 = (fba) obj2;
                fba fbaVar3 = gba.y1;
                long j2 = 0;
                if (fbaVar3 == fbaVar) {
                    j = -200000;
                } else {
                    j = 0;
                }
                if (!fbaVar.d) {
                    j += 100000;
                }
                if (fbaVar3 == fbaVar2) {
                    j2 = -200000;
                }
                if (!fbaVar2.d) {
                    j2 += 100000;
                }
                return Long.compare(fbaVar.b + j, fbaVar2.b + j2);
            case 25:
                return ((nea) obj2).c - ((nea) obj).c;
            case 26:
                return ((mja) obj).a - ((mja) obj2).a;
            case 27:
                return Float.compare(((mja) obj).c, ((mja) obj2).c);
            case 28:
                return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
            default:
                return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
        }
    }
}
