package oh;

import android.util.Pair;
import android.view.MenuItem;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.qr;
public final class k0 implements Comparator {
    public final int f17345a;

    public k0(int i10) {
        this.f17345a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$initCamera$0;
        int i10;
        int i11;
        int id2;
        int id3;
        switch (this.f17345a) {
            case 0:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 1:
                int i12 = ProfileStoriesView.f34841p0;
                return (int) (((i4) obj2).f17215i - ((i4) obj).f17215i);
            case 2:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 3:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 4:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 5:
                List list = org.telegram.ui.ActionBar.z4.f22491r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 6:
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) obj2;
                if (j6Var.f21507b == null && j6Var.d == null) {
                    return -1;
                }
                if (j6Var2.f21507b == null && j6Var2.d == null) {
                    return 1;
                }
                return j6Var.f21505a.compareTo(j6Var2.f21505a);
            case 7:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj2;
                if (!org.telegram.ui.ActionBar.k6.g1(i6Var)) {
                    if (!org.telegram.ui.ActionBar.k6.g1(i6Var2)) {
                        ?? r02 = i6Var.f21491z;
                        ?? r42 = i6Var2.f21491z;
                        if (r02 == r42) {
                            if (r02 != 0) {
                                int i13 = i6Var.f21469a;
                                int i14 = i6Var2.f21469a;
                                if (i13 <= i14) {
                                    if (i13 >= i14) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i15 = i6Var.f21469a;
                                int i16 = i6Var2.f21469a;
                                if (i15 <= i16) {
                                    if (i15 >= i16) {
                                        return 0;
                                    }
                                }
                            }
                        } else if (r02 > r42) {
                        }
                    }
                    return 1;
                }
                return -1;
            case 8:
                int i17 = (((org.telegram.ui.u6) obj2).f41729c > ((org.telegram.ui.u6) obj).f41729c ? 1 : (((org.telegram.ui.u6) obj2).f41729c == ((org.telegram.ui.u6) obj).f41729c ? 0 : -1));
                if (i17 > 0) {
                    return 1;
                }
                if (i17 >= 0) {
                    return 0;
                }
                return -1;
            case 9:
                return Long.compare(((org.telegram.ui.w6) obj2).f42296g, ((org.telegram.ui.w6) obj).f42296g);
            case 10:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj;
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) obj2;
                float f10 = r1Var.f23393e;
                float f11 = r1Var2.f23393e;
                if (f10 <= f11) {
                    if (f10 < f11 || (i10 = r1Var.d) > (i11 = r1Var2.d)) {
                        return 1;
                    }
                    if (i10 >= i11) {
                        return 0;
                    }
                }
                return -1;
            case 11:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 12:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 13:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 14:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 15:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j02 = qr.j0(tLObject);
                int j03 = qr.j0(tLObject2);
                if (j02 > j03) {
                    return 1;
                }
                if (j02 < j03) {
                    return -1;
                }
                if (!(tLObject instanceof TLRPC.ChannelParticipant) || !(tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return 0;
                }
                return (int) (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) - MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer));
            case 16:
                int j04 = qr.j0((TLObject) obj);
                int j05 = qr.j0((TLObject) obj2);
                if (j04 > j05) {
                    return 1;
                }
                if (j04 >= j05) {
                    return 0;
                }
                return -1;
            case 17:
                id2 = ((org.telegram.ui.Components.g9) obj2).f27117b;
                id3 = ((org.telegram.ui.Components.g9) obj).f27117b;
                break;
            case 18:
                id2 = ((org.telegram.ui.Components.g9) obj2).f27117b;
                id3 = ((org.telegram.ui.Components.g9) obj).f27117b;
                break;
            case 19:
                return Long.compare(((vc) obj).f31860c, ((vc) obj2).f31860c);
            case 20:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                if (abs <= abs2) {
                    return 0;
                }
                return 1;
            case 21:
                mc.a aVar = (mc.a) obj;
                mc.a aVar2 = (mc.a) obj2;
                int compare = Integer.compare(aVar.f13633b, aVar2.f13633b);
                if (compare == 0) {
                    return Integer.compare(aVar2.d, aVar.d);
                }
                return compare;
            case 22:
                id2 = ((Integer) obj2).intValue();
                id3 = ((Integer) obj).intValue();
                break;
            case 23:
                float f12 = ((ug0) obj).f31630a;
                float f13 = ((ug0) obj2).f31630a;
                if (f12 > f13) {
                    return -1;
                }
                if (f12 >= f13) {
                    return 0;
                }
                return 1;
            case 24:
                return Float.compare(((pl0) obj).f30118a, ((pl0) obj2).f30118a);
            case 25:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() <= ((Float) pair.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 26:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() <= ((Float) pair3.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 27:
                int i18 = ((zp0) obj).f33995c;
                int i19 = ((zp0) obj2).f33995c;
                if (i18 < i19) {
                    return 1;
                }
                if (i18 <= i19) {
                    return 0;
                }
                return -1;
            case 28:
                id2 = ((vt0) obj2).f32540c;
                id3 = ((vt0) obj).f32540c;
                break;
            default:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair6.first).floatValue() <= ((Float) pair5.first).floatValue()) {
                    return 0;
                }
                return -1;
        }
        return id2 - id3;
    }
}
