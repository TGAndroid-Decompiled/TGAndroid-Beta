package a4;

import android.util.Pair;
import bh.x0;
import bh.y0;
import bi.ud;
import di.q;
import di.s4;
import di.w0;
import fi.xb;
import ig.h0;
import ig.y1;
import java.io.File;
import java.util.Comparator;
import jg.b2;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;
import s4.e1;
public final class d implements Comparator {
    public final int f233a;

    public d(int i10) {
        this.f233a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int lambda$initCamera$0;
        int i13 = -1;
        switch (this.f233a) {
            case 0:
                return Integer.compare(((e) obj2).f236b, ((e) obj).f236b);
            case 1:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 2:
                return (int) (y0.k((TLObject) obj) - y0.k((TLObject) obj2));
            case 3:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 4:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 5:
                return (int) (((ud) obj2).d - ((ud) obj).d);
            case 6:
                int i14 = (((ci.a) obj2).f6366c > ((ci.a) obj).f6366c ? 1 : (((ci.a) obj2).f6366c == ((ci.a) obj).f6366c ? 0 : -1));
                if (i14 > 0) {
                    return 1;
                }
                if (i14 < 0) {
                    return -1;
                }
                return 0;
            case 7:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 8:
                String name = ((File) obj).getName();
                int i15 = da.b.f8267f;
                return name.substring(0, i15).compareTo(((File) obj2).getName().substring(0, i15));
            case 9:
                i10 = ((q) obj2).f8937b;
                i11 = ((q) obj).f8937b;
                break;
            case 10:
            case 12:
                i10 = ((w0) obj2).f9286c;
                i11 = ((w0) obj).f9286c;
                break;
            case 11:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 13:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 14:
                int i16 = ProfileStoriesView.f36229s0;
                return (int) (((s4) obj2).f9150i - ((s4) obj).f9150i);
            case 15:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 16:
                x0 x0Var = (x0) obj2;
                String str = ((x0) obj).f4208f;
                if (str != null && str.equals("❤")) {
                    i12 = -1;
                } else {
                    i12 = 0;
                }
                String str2 = x0Var.f4208f;
                return i12 - ((str2 == null || !str2.equals("❤")) ? 0 : 0);
            case 17:
                return (int) (((xb) obj2).e - ((xb) obj).e);
            case 18:
                return Integer.compare(((i4.d) obj).f13856a.f13859b, ((i4.d) obj2).f13856a.f13859b);
            case 19:
                return Long.compare(((i4.c) obj).f13853b, ((i4.c) obj2).f13853b);
            case 20:
                int i17 = ((h0) obj).f14065b;
                int i18 = ((h0) obj2).f14065b;
                if (i17 < i18) {
                    return 1;
                }
                if (i17 > i18) {
                    return -1;
                }
                return 0;
            case 21:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 22:
                int i19 = ((y1) obj).f14306b;
                int i20 = ((y1) obj2).f14306b;
                if (i19 < i20) {
                    return 1;
                }
                if (i19 > i20) {
                    return -1;
                }
                return 0;
            case 23:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 24:
                return ((b2) obj).f15642c - ((b2) obj2).f15642c;
            case 25:
                i10 = Integer.bitCount(((Integer) obj2).intValue());
                i11 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 26:
                m2.b bVar = (m2.b) obj;
                m2.b bVar2 = (m2.b) obj2;
                int compare = Integer.compare(bVar.f17934c, bVar2.f17934c);
                if (compare == 0) {
                    return bVar.f17933b.compareTo(bVar2.f17933b);
                }
                return compare;
            case 27:
                i10 = ((e1) obj2).f47735a.getTop();
                i11 = ((e1) obj).f47735a.getTop();
                break;
            case 28:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i21 = 0; i21 < bArr.length; i21++) {
                    byte b10 = bArr[i21];
                    byte b11 = bArr2[i21];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            default:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
        }
        return i10 - i11;
    }
}
