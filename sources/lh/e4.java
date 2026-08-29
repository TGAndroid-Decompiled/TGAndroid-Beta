package lh;

import android.util.Pair;
import android.view.MenuItem;
import java.util.Comparator;
import java.util.List;
import nh.lb;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.jr;
public final class e4 implements Comparator {
    public final int f15577a;

    public e4(int i10) {
        this.f15577a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int lambda$initCamera$0;
        int i11;
        int i12;
        int id2;
        int id3;
        int i13 = 0;
        switch (this.f15577a) {
            case 0:
                int i14 = ProfileStoriesView.f36262o0;
                return (int) (((g4) obj2).f15626i - ((g4) obj).f15626i);
            case 1:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 2:
                kg.q0 q0Var = (kg.q0) obj2;
                String str = ((kg.q0) obj).f13825f;
                if (str != null && str.equals("❤")) {
                    i10 = -1;
                } else {
                    i10 = 0;
                }
                String str2 = q0Var.f13825f;
                if (str2 != null && str2.equals("❤")) {
                    i13 = -1;
                }
                return i10 - i13;
            case 3:
                return (int) (((lb) obj2).f18060e - ((lb) obj).f18060e);
            case 4:
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
            case 5:
                p4.b bVar = (p4.b) obj;
                p4.b bVar2 = (p4.b) obj2;
                int compare = Integer.compare(bVar.f45538c, bVar2.f45538c);
                if (compare == 0) {
                    return bVar.f45537b.compareTo(bVar2.f45537b);
                }
                return compare;
            case 6:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 7:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 8:
                List list = org.telegram.ui.ActionBar.v4.f23892r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 9:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj2;
                if (f6Var.f22943b == null && f6Var.d == null) {
                    return -1;
                }
                if (f6Var2.f22943b == null && f6Var2.d == null) {
                    return 1;
                }
                return f6Var.f22941a.compareTo(f6Var2.f22941a);
            case 10:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                if (!org.telegram.ui.ActionBar.g6.g1(e6Var)) {
                    if (!org.telegram.ui.ActionBar.g6.g1(e6Var2)) {
                        ?? r02 = e6Var.f22924z;
                        ?? r42 = e6Var2.f22924z;
                        if (r02 == r42) {
                            if (r02 != 0) {
                                int i16 = e6Var.f22902a;
                                int i17 = e6Var2.f22902a;
                                if (i16 <= i17) {
                                    if (i16 >= i17) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i18 = e6Var.f22902a;
                                int i19 = e6Var2.f22902a;
                                if (i18 <= i19) {
                                    if (i18 >= i19) {
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
            case 11:
                int i20 = (((org.telegram.ui.q6) obj2).f41545c > ((org.telegram.ui.q6) obj).f41545c ? 1 : (((org.telegram.ui.q6) obj2).f41545c == ((org.telegram.ui.q6) obj).f41545c ? 0 : -1));
                if (i20 > 0) {
                    return 1;
                }
                if (i20 >= 0) {
                    return 0;
                }
                return -1;
            case 12:
                return Long.compare(((org.telegram.ui.s6) obj2).f42285g, ((org.telegram.ui.s6) obj).f42285g);
            case 13:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) obj2;
                float f9 = q1Var.f25031e;
                float f10 = q1Var2.f25031e;
                if (f9 <= f10) {
                    if (f9 < f10 || (i11 = q1Var.d) > (i12 = q1Var2.d)) {
                        return 1;
                    }
                    if (i11 >= i12) {
                        return 0;
                    }
                }
                return -1;
            case 14:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 15:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 16:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 17:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 18:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j02 = jr.j0(tLObject);
                int j03 = jr.j0(tLObject2);
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
            case 19:
                int j04 = jr.j0((TLObject) obj);
                int j05 = jr.j0((TLObject) obj2);
                if (j04 > j05) {
                    return 1;
                }
                if (j04 >= j05) {
                    return 0;
                }
                return -1;
            case 20:
                id2 = ((org.telegram.ui.Components.k9) obj2).f29970b;
                id3 = ((org.telegram.ui.Components.k9) obj).f29970b;
                break;
            case 21:
                id2 = ((org.telegram.ui.Components.k9) obj2).f29970b;
                id3 = ((org.telegram.ui.Components.k9) obj).f29970b;
                break;
            case 22:
                return Long.compare(((yc) obj).f35043c, ((yc) obj2).f35043c);
            case 23:
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
            case 24:
                kc.a aVar = (kc.a) obj;
                kc.a aVar2 = (kc.a) obj2;
                int compare2 = Integer.compare(aVar.f13615b, aVar2.f13615b);
                if (compare2 == 0) {
                    return Integer.compare(aVar2.d, aVar.d);
                }
                return compare2;
            case 25:
                id2 = ((Integer) obj2).intValue();
                id3 = ((Integer) obj).intValue();
                break;
            case 26:
                float f11 = ((ig0) obj).f29388a;
                float f12 = ((ig0) obj2).f29388a;
                if (f11 > f12) {
                    return -1;
                }
                if (f11 >= f12) {
                    return 0;
                }
                return 1;
            case 27:
                return Float.compare(((gl0) obj).f28913a, ((gl0) obj2).f28913a);
            case 28:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() <= ((Float) pair.first).floatValue()) {
                    return 0;
                }
                return -1;
            default:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() <= ((Float) pair3.first).floatValue()) {
                    return 0;
                }
                return -1;
        }
        return id2 - id3;
    }
}
