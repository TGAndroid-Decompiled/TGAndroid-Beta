package nh;

import android.util.Pair;
import android.view.MenuItem;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.tg0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.rr;
public final class e4 implements Comparator {
    public final int f15286a;

    public e4(int i10) {
        this.f15286a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$initCamera$0;
        int i10;
        int i11;
        int id2;
        int id3;
        switch (this.f15286a) {
            case 0:
                int i12 = ProfileStoriesView.f32277p0;
                return (int) (((g4) obj2).f15335i - ((g4) obj).f15335i);
            case 1:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i13 = 0; i13 < bArr.length; i13++) {
                    byte b10 = bArr[i13];
                    byte b11 = bArr2[i13];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 3:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 4:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 5:
                List list = org.telegram.ui.ActionBar.y4.f20731r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 6:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj2;
                if (i6Var.f19782b == null && i6Var.d == null) {
                    return -1;
                }
                if (i6Var2.f19782b == null && i6Var2.d == null) {
                    return 1;
                }
                return i6Var.f19780a.compareTo(i6Var2.f19780a);
            case 7:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj2;
                if (!org.telegram.ui.ActionBar.j6.g1(h6Var)) {
                    if (!org.telegram.ui.ActionBar.j6.g1(h6Var2)) {
                        ?? r02 = h6Var.f19757z;
                        ?? r42 = h6Var2.f19757z;
                        if (r02 == r42) {
                            if (r02 != 0) {
                                int i14 = h6Var.f19736a;
                                int i15 = h6Var2.f19736a;
                                if (i14 <= i15) {
                                    if (i14 >= i15) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i16 = h6Var.f19736a;
                                int i17 = h6Var2.f19736a;
                                if (i16 <= i17) {
                                    if (i16 >= i17) {
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
                int i18 = (((org.telegram.ui.w6) obj2).f39279c > ((org.telegram.ui.w6) obj).f39279c ? 1 : (((org.telegram.ui.w6) obj2).f39279c == ((org.telegram.ui.w6) obj).f39279c ? 0 : -1));
                if (i18 > 0) {
                    return 1;
                }
                if (i18 >= 0) {
                    return 0;
                }
                return -1;
            case 9:
                return Long.compare(((org.telegram.ui.y6) obj2).f40154g, ((org.telegram.ui.y6) obj).f40154g);
            case 10:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) obj2;
                float f10 = q1Var.e;
                float f11 = q1Var2.e;
                if (f10 <= f11) {
                    if (f10 < f11 || (i10 = q1Var.d) > (i11 = q1Var2.d)) {
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
                int j02 = rr.j0(tLObject);
                int j03 = rr.j0(tLObject2);
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
                int j04 = rr.j0((TLObject) obj);
                int j05 = rr.j0((TLObject) obj2);
                if (j04 > j05) {
                    return 1;
                }
                if (j04 >= j05) {
                    return 0;
                }
                return -1;
            case 17:
                id2 = ((org.telegram.ui.Components.g9) obj2).f25088b;
                id3 = ((org.telegram.ui.Components.g9) obj).f25088b;
                break;
            case 18:
                id2 = ((org.telegram.ui.Components.g9) obj2).f25088b;
                id3 = ((org.telegram.ui.Components.g9) obj).f25088b;
                break;
            case 19:
                return Long.compare(((vc) obj).f29456c, ((vc) obj2).f29456c);
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
                int compare = Integer.compare(aVar.f13896b, aVar2.f13896b);
                if (compare == 0) {
                    return Integer.compare(aVar2.d, aVar.d);
                }
                return compare;
            case 22:
                id2 = ((Integer) obj2).intValue();
                id3 = ((Integer) obj).intValue();
                break;
            case 23:
                float f12 = ((tg0) obj).f28987a;
                float f13 = ((tg0) obj2).f28987a;
                if (f12 > f13) {
                    return -1;
                }
                if (f12 >= f13) {
                    return 0;
                }
                return 1;
            case 24:
                return Float.compare(((ol0) obj).f27587a, ((ol0) obj2).f27587a);
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
                int i19 = ((zp0) obj).f31455c;
                int i20 = ((zp0) obj2).f31455c;
                if (i19 < i20) {
                    return 1;
                }
                if (i19 <= i20) {
                    return 0;
                }
                return -1;
            case 28:
                id2 = ((vt0) obj2).f30052c;
                id3 = ((vt0) obj).f30052c;
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
