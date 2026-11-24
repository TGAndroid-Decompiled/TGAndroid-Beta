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
public final class qx7 implements Comparator {
    public final byte a;

    public qx7(byte b) {
        this.a = b;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        long j;
        switch (this.a) {
            case 0:
                return ((Integer) obj2).intValue() - ((Integer) obj).intValue();
            case 1:
                int h1 = xz7.h1((String) obj);
                int h12 = xz7.h1((String) obj2);
                if (h1 < h12) {
                    return -1;
                }
                if (h1 <= h12) {
                    return 0;
                }
                return 1;
            case 2:
                int h13 = xz7.h1((String) obj);
                int h14 = xz7.h1((String) obj2);
                if (h13 < h14) {
                    return -1;
                }
                if (h13 <= h14) {
                    return 0;
                }
                return 1;
            case 3:
                Drawable[] drawableArr = PhotoViewer.d9;
                return ((k47) obj).e1() - ((k47) obj2).e1();
            case 4:
                float f = ((fh8) obj).a;
                float f2 = ((fh8) obj2).a;
                if (f > f2) {
                    return -1;
                }
                if (f >= f2) {
                    return 0;
                }
                return 1;
            case 5:
                return (int) ((((rk8) obj).a * 100.0f) - (((rk8) obj2).a * 100.0f));
            case 6:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 7:
                if (obj instanceof tq8) {
                    i = ((tq8) obj).g;
                } else if (obj instanceof bc7) {
                    i = ((bc7) obj).d;
                } else {
                    i = 0;
                }
                if (obj2 instanceof tq8) {
                    i2 = ((tq8) obj2).g;
                } else if (obj2 instanceof bc7) {
                    i2 = ((bc7) obj2).d;
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
            case 8:
                int i3 = ProfileStoriesView.t0;
                return (int) (((au8) obj2).i - ((au8) obj).i);
            case 9:
                return Long.compare(((fda) obj).b, ((fda) obj2).b);
            case 10:
                return ((oz8) obj).c - ((oz8) obj2).c;
            case 11:
                return (int) (l39.j((TLObject) obj) - l39.j((TLObject) obj2));
            case 12:
                return Float.compare(((n59) obj).a, ((n59) obj2).a);
            case 13:
                return ((ni9) obj).d - ((ni9) obj2).d;
            case 14:
                return ((vr9) obj2).c() - ((vr9) obj).c();
            case 15:
                return ((vr9) obj).k - ((vr9) obj2).k;
            case 16:
                return ((vr9) obj2).c() - ((vr9) obj).c();
            case 17:
                int i4 = ((zt9) obj).b;
                int i5 = ((zt9) obj2).b;
                if (i4 < i5) {
                    return 1;
                }
                if (i4 <= i5) {
                    return 0;
                }
                return -1;
            case 18:
                int i6 = ((cw9) obj).b.out_seq_no;
                int i7 = ((cw9) obj2).b.out_seq_no;
                if (i6 > i7) {
                    return 1;
                }
                if (i6 >= i7) {
                    return 0;
                }
                return -1;
            case 19:
                return gm.A(((TLRPC.Message) obj).seq_out, ((TLRPC.Message) obj2).seq_out);
            case 20:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() <= ((Float) pair.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 21:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() <= ((Float) pair3.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 22:
                return ((f90) ((tz2) obj)).a.compareTo(((f90) ((tz2) obj2)).a);
            case 23:
                int i8 = (z8c.h(((Integer) obj).intValue()).Z > z8c.h(((Integer) obj2).intValue()).Z ? 1 : (z8c.h(((Integer) obj).intValue()).Z == z8c.h(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i8 > 0) {
                    return 1;
                }
                if (i8 >= 0) {
                    return 0;
                }
                return -1;
            case 24:
                int i9 = ((ica) obj).c;
                int i10 = ((ica) obj2).c;
                if (i9 < i10) {
                    return 1;
                }
                if (i9 <= i10) {
                    return 0;
                }
                return -1;
            case 25:
                fda fdaVar = (fda) obj;
                fda fdaVar2 = (fda) obj2;
                fda fdaVar3 = gda.x1;
                long j2 = 0;
                if (fdaVar3 == fdaVar) {
                    j = -200000;
                } else {
                    j = 0;
                }
                if (!fdaVar.d) {
                    j += 100000;
                }
                if (fdaVar3 == fdaVar2) {
                    j2 = -200000;
                }
                if (!fdaVar2.d) {
                    j2 += 100000;
                }
                return Long.compare(fdaVar.b + j, fdaVar2.b + j2);
            case 26:
                return ((nga) obj2).c - ((nga) obj).c;
            case 27:
                return ((nla) obj).a - ((nla) obj2).a;
            case 28:
                return Float.compare(((nla) obj).c, ((nla) obj2).c);
            default:
                return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
        }
    }
}
