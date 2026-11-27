package defpackage;

import java.io.File;
import java.util.Comparator;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class ta implements Comparator {
    public final byte a;

    public ta(byte b) {
        this.a = b;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int lambda$initCamera$0;
        int i3;
        int i4;
        switch (this.a) {
            case 0:
                return (int) (((eb) obj2).c - ((eb) obj).c);
            case 1:
                return (int) (((eb) obj2).c - ((eb) obj).c);
            case 2:
                el elVar = (el) obj;
                el elVar2 = (el) obj2;
                int i5 = elVar.b;
                int i6 = elVar2.b;
                if (i5 >= i6) {
                    if (i5 > i6 || (i = elVar.c) < (i2 = elVar2.c)) {
                        return 1;
                    }
                    if (i <= i2) {
                        return 0;
                    }
                }
                return -1;
            case 3:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 4:
                int i7 = (((t60) obj2).e > ((t60) obj).e ? 1 : (((t60) obj2).e == ((t60) obj).e ? 0 : -1));
                if (i7 > 0) {
                    return -1;
                }
                if (i7 >= 0) {
                    return 0;
                }
                return 1;
            case 5:
                return ((ed0) obj2).b - ((ed0) obj).b;
            case 6:
                return ((ed0) obj2).b - ((ed0) obj).b;
            case 7:
                return Integer.compare(((ko4) obj2).k, ((ko4) obj).k);
            case 8:
                xg0 xg0Var = (xg0) obj;
                xg0 xg0Var2 = (xg0) obj2;
                int compare = Integer.compare(xg0Var.c, xg0Var2.c);
                if (compare == 0) {
                    return xg0Var.b.compareTo(xg0Var2.b);
                }
                return compare;
            case 9:
                return ((String) obj).compareTo((String) obj2);
            case 10:
                return Integer.compare(((uz0) obj2).b, ((uz0) obj).b);
            case 11:
                return Long.compare(((y51) obj).c, ((y51) obj2).c);
            case 12:
                int i8 = (((t61) obj2).c > ((t61) obj).c ? 1 : (((t61) obj2).c == ((t61) obj).c ? 0 : -1));
                if (i8 > 0) {
                    return 1;
                }
                if (i8 >= 0) {
                    return 0;
                }
                return -1;
            case 13:
                return Long.compare(((v61) obj2).g, ((v61) obj).g);
            case 14:
                int i9 = (((c71) obj2).c > ((c71) obj).c ? 1 : (((c71) obj2).c == ((c71) obj).c ? 0 : -1));
                if (i9 > 0) {
                    return 1;
                }
                if (i9 >= 0) {
                    return 0;
                }
                return -1;
            case 15:
                return Integer.compare(((j91) obj2).b, ((j91) obj).b);
            case 16:
                return Integer.compare(((j91) obj).c, ((j91) obj2).c);
            case 17:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 18:
                return Integer.compare(((xd1) obj2).b, ((xd1) obj).b);
            case 19:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 20:
                return ((r47) obj).e1() - ((r47) obj2).e1();
            case 21:
                return ((r47) obj2).e1() - ((r47) obj).e1();
            case 22:
                return ((r47) obj2).e1() - ((r47) obj).e1();
            case 23:
                return ((f89) obj2).a.getTop() - ((f89) obj).a.getTop();
            case 24:
                vb2 vb2Var = (vb2) obj;
                vb2 vb2Var2 = (vb2) obj2;
                float f = vb2Var.e;
                float f2 = vb2Var2.e;
                if (f <= f2) {
                    if (f < f2 || (i3 = vb2Var.d) > (i4 = vb2Var2.d)) {
                        return 1;
                    }
                    if (i3 >= i4) {
                        return 0;
                    }
                }
                return -1;
            case 25:
                return hl.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 26:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j0 = bg2.j0(tLObject);
                int j02 = bg2.j0(tLObject2);
                if (j0 > j02) {
                    return 1;
                }
                if (j0 < j02) {
                    return -1;
                }
                if (!(tLObject instanceof TLRPC.ChannelParticipant) || !(tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return 0;
                }
                return (int) (r47.B1(((TLRPC.ChannelParticipant) tLObject).peer) - r47.B1(((TLRPC.ChannelParticipant) tLObject2).peer));
            case 27:
                int j03 = bg2.j0((TLObject) obj);
                int j04 = bg2.j0((TLObject) obj2);
                if (j03 > j04) {
                    return 1;
                }
                if (j03 >= j04) {
                    return 0;
                }
                return -1;
            case 28:
                int i10 = (((TLRPC.TL_contact) obj).user_id > ((TLRPC.TL_contact) obj2).user_id ? 1 : (((TLRPC.TL_contact) obj).user_id == ((TLRPC.TL_contact) obj2).user_id ? 0 : -1));
                if (i10 > 0) {
                    return 1;
                }
                if (i10 >= 0) {
                    return 0;
                }
                return -1;
            default:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    }
}
