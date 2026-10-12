package a4;

import ah.i1;
import ah.j1;
import android.util.Pair;
import android.view.MenuItem;
import bi.f1;
import bi.t5;
import bi.u;
import di.pc;
import hg.g0;
import hg.y1;
import ig.a2;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.v4;
import org.telegram.ui.Stories.ProfileStoriesView;
import s4.b1;
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
                return (int) (j1.k((TLObject) obj) - j1.k((TLObject) obj2));
            case 3:
                int i14 = (((ai.b) obj2).f917c > ((ai.b) obj).f917c ? 1 : (((ai.b) obj2).f917c == ((ai.b) obj).f917c ? 0 : -1));
                if (i14 > 0) {
                    return 1;
                }
                if (i14 < 0) {
                    return -1;
                }
                return 0;
            case 4:
                i10 = ((u) obj2).f3760b;
                i11 = ((u) obj).f3760b;
                break;
            case 5:
            case 7:
                i10 = ((f1) obj2).f3009c;
                i11 = ((f1) obj).f3009c;
                break;
            case 6:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 8:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 9:
                int i15 = ProfileStoriesView.f32809s0;
                return (int) (((t5) obj2).f3742i - ((t5) obj).f3742i);
            case 10:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 11:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 12:
                String name = ((File) obj).getName();
                int i16 = ca.b.f4668f;
                return name.substring(0, i16).compareTo(((File) obj2).getName().substring(0, i16));
            case 13:
                i1 i1Var = (i1) obj2;
                String str = ((i1) obj).f779f;
                if (str != null && str.equals("❤")) {
                    i12 = -1;
                } else {
                    i12 = 0;
                }
                String str2 = i1Var.f779f;
                return i12 - ((str2 == null || !str2.equals("❤")) ? 0 : 0);
            case 14:
                return (int) (((pc) obj2).e - ((pc) obj).e);
            case 15:
                int i17 = ((g0) obj).f10559b;
                int i18 = ((g0) obj2).f10559b;
                if (i17 < i18) {
                    return 1;
                }
                if (i17 > i18) {
                    return -1;
                }
                return 0;
            case 16:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 17:
                int i19 = ((y1) obj).f10802b;
                int i20 = ((y1) obj2).f10802b;
                if (i19 < i20) {
                    return 1;
                }
                if (i19 > i20) {
                    return -1;
                }
                return 0;
            case 18:
                return Integer.compare(((i4.d) obj).f11295a.f11298b, ((i4.d) obj2).f11295a.f11298b);
            case 19:
                return Long.compare(((i4.c) obj).f11292b, ((i4.c) obj2).f11292b);
            case 20:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 21:
                return ((a2) obj).f11436c - ((a2) obj2).f11436c;
            case 22:
                i10 = Integer.bitCount(((Integer) obj2).intValue());
                i11 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 23:
                i10 = ((b1) obj2).f44838a.getTop();
                i11 = ((b1) obj).f44838a.getTop();
                break;
            case 24:
                m2.b bVar = (m2.b) obj;
                m2.b bVar2 = (m2.b) obj2;
                int compare = Integer.compare(bVar.f15320c, bVar2.f15320c);
                if (compare == 0) {
                    return bVar.f15319b.compareTo(bVar2.f15319b);
                }
                return compare;
            case 25:
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
            case 26:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 27:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 28:
                List list = v4.f20762r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            default:
                f6 f6Var = (f6) obj;
                f6 f6Var2 = (f6) obj2;
                if (f6Var.f19793b == null && f6Var.d == null) {
                    return -1;
                }
                if (f6Var2.f19793b == null && f6Var2.d == null) {
                    return 1;
                }
                return f6Var.f19791a.compareTo(f6Var2.f19791a);
        }
        return i10 - i11;
    }
}
