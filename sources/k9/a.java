package k9;

import android.util.Pair;
import android.view.MenuItem;
import ig.q0;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import lh.xb;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.v4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.zf0;
import org.telegram.ui.lr;
import org.telegram.ui.s6;
import org.telegram.ui.u6;

public final class a implements Comparator {

    public final int f15090a;

    public a(int i10) {
        this.f15090a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int id2;
        int id3;
        switch (this.f15090a) {
            case 0:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 1:
                String name = ((File) obj).getName();
                int i12 = b.f15092f;
                return name.substring(0, i12).compareTo(((File) obj2).getName().substring(0, i12));
            case 2:
                q0 q0Var = (q0) obj2;
                String str = ((q0) obj).f11412f;
                int i13 = 0;
                int i14 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = q0Var.f11412f;
                if (str2 != null && str2.equals("❤")) {
                    i13 = -1;
                }
                return i14 - i13;
            case 3:
                return (int) (((xb) obj2).f17059e - ((xb) obj).f17059e);
            case 4:
                n4.b bVar = (n4.b) obj;
                n4.b bVar2 = (n4.b) obj2;
                int iCompare = Integer.compare(bVar.f18216c, bVar2.f18216c);
                return iCompare != 0 ? iCompare : bVar.f18215b.compareTo(bVar2.f18215b);
            case 5:
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
            case 6:
                return CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
            case 7:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 8:
                List list = v4.f23902r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 9:
                f6 f6Var = (f6) obj;
                f6 f6Var2 = (f6) obj2;
                if (f6Var.f22943b == null && f6Var.d == null) {
                    return -1;
                }
                if (f6Var2.f22943b == null && f6Var2.d == null) {
                    return 1;
                }
                return f6Var.f22941a.compareTo(f6Var2.f22941a);
            case 10:
                e6 e6Var = (e6) obj;
                e6 e6Var2 = (e6) obj2;
                if (!g6.g1(e6Var)) {
                    if (!g6.g1(e6Var2)) {
                        ?? r10 = e6Var.f22905z;
                        ?? r11 = e6Var2.f22905z;
                        if (r10 == r11) {
                            if (r10 != 0) {
                                int i16 = e6Var.f22883a;
                                int i17 = e6Var2.f22883a;
                                if (i16 <= i17) {
                                    if (i16 >= i17) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i18 = e6Var.f22883a;
                                int i19 = e6Var2.f22883a;
                                if (i18 <= i19) {
                                    if (i18 >= i19) {
                                        return 0;
                                    }
                                }
                            }
                        } else if (r10 > r11) {
                        }
                    }
                    return 1;
                }
                return -1;
            case 11:
                long j10 = ((s6) obj2).f42524c;
                long j11 = ((s6) obj).f42524c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 12:
                return Long.compare(((u6) obj2).f43130g, ((u6) obj).f43130g);
            case 13:
                q1 q1Var = (q1) obj;
                q1 q1Var2 = (q1) obj2;
                float f10 = q1Var.f25020e;
                float f11 = q1Var2.f25020e;
                if (f10 <= f11) {
                    if (f10 < f11 || (i10 = q1Var.d) > (i11 = q1Var2.d)) {
                        return 1;
                    }
                    if (i10 >= i11) {
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
                int iJ0 = lr.j0(tLObject);
                int iJ1 = lr.j0(tLObject2);
                if (iJ0 > iJ1) {
                    return 1;
                }
                if (iJ0 < iJ1) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) - MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 19:
                int iJ2 = lr.j0((TLObject) obj);
                int iJ3 = lr.j0((TLObject) obj2);
                if (iJ2 > iJ3) {
                    return 1;
                }
                return iJ2 < iJ3 ? -1 : 0;
            case 20:
                id2 = ((e9) obj2).f27985b;
                id3 = ((e9) obj).f27985b;
                break;
            case 21:
                id2 = ((e9) obj2).f27985b;
                id3 = ((e9) obj).f27985b;
                break;
            case 22:
                return Long.compare(((rc) obj).f32127c, ((rc) obj2).f32127c);
            case 23:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float fAbs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float fAbs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (fAbs < fAbs2) {
                    return -1;
                }
                return fAbs > fAbs2 ? 1 : 0;
            case 24:
                jc.a aVar = (jc.a) obj;
                jc.a aVar2 = (jc.a) obj2;
                int iCompare2 = Integer.compare(aVar.f12894b, aVar2.f12894b);
                return iCompare2 != 0 ? iCompare2 : Integer.compare(aVar2.d, aVar.d);
            case 25:
                id2 = ((Integer) obj2).intValue();
                id3 = ((Integer) obj).intValue();
                break;
            case 26:
                float f12 = ((zf0) obj).f35233a;
                float f13 = ((zf0) obj2).f35233a;
                if (f12 > f13) {
                    return -1;
                }
                return f12 < f13 ? 1 : 0;
            case 27:
                return Float.compare(((wk0) obj).f34277a, ((wk0) obj2).f34277a);
            case 28:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            default:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
        }
        return id2 - id3;
    }
}
