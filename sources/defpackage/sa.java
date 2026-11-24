package defpackage;

import java.io.File;
import java.util.Comparator;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class sa implements Comparator {
    public final byte a;

    public sa(byte b) {
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
                return (int) (((db) obj2).c - ((db) obj).c);
            case 1:
                return (int) (((db) obj2).c - ((db) obj).c);
            case 2:
                dl dlVar = (dl) obj;
                dl dlVar2 = (dl) obj2;
                int i5 = dlVar.b;
                int i6 = dlVar2.b;
                if (i5 >= i6) {
                    if (i5 > i6 || (i = dlVar.c) < (i2 = dlVar2.c)) {
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
                int i7 = (((r60) obj2).e > ((r60) obj).e ? 1 : (((r60) obj2).e == ((r60) obj).e ? 0 : -1));
                if (i7 > 0) {
                    return -1;
                }
                if (i7 >= 0) {
                    return 0;
                }
                return 1;
            case 5:
                return ((cd0) obj2).b - ((cd0) obj).b;
            case 6:
                return ((cd0) obj2).b - ((cd0) obj).b;
            case 7:
                return Integer.compare(((fm4) obj2).k, ((fm4) obj).k);
            case 8:
                wg0 wg0Var = (wg0) obj;
                wg0 wg0Var2 = (wg0) obj2;
                int compare = Integer.compare(wg0Var.c, wg0Var2.c);
                if (compare == 0) {
                    return wg0Var.b.compareTo(wg0Var2.b);
                }
                return compare;
            case 9:
                return ((String) obj).compareTo((String) obj2);
            case 10:
                return Integer.compare(((mz0) obj2).b, ((mz0) obj).b);
            case 11:
                return Long.compare(((q51) obj).c, ((q51) obj2).c);
            case 12:
                int i8 = (((l61) obj2).c > ((l61) obj).c ? 1 : (((l61) obj2).c == ((l61) obj).c ? 0 : -1));
                if (i8 > 0) {
                    return 1;
                }
                if (i8 >= 0) {
                    return 0;
                }
                return -1;
            case 13:
                return Long.compare(((n61) obj2).g, ((n61) obj).g);
            case 14:
                int i9 = (((u61) obj2).c > ((u61) obj).c ? 1 : (((u61) obj2).c == ((u61) obj).c ? 0 : -1));
                if (i9 > 0) {
                    return 1;
                }
                if (i9 >= 0) {
                    return 0;
                }
                return -1;
            case 15:
                return Integer.compare(((a91) obj2).b, ((a91) obj).b);
            case 16:
                return Integer.compare(((a91) obj).c, ((a91) obj2).c);
            case 17:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 18:
                return Integer.compare(((od1) obj2).b, ((od1) obj).b);
            case 19:
                return ((k27) obj).e1() - ((k27) obj2).e1();
            case 20:
                return ((k27) obj2).e1() - ((k27) obj).e1();
            case 21:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 22:
                return ((k27) obj2).e1() - ((k27) obj).e1();
            case 23:
                return ((s49) obj2).a.getTop() - ((s49) obj).a.getTop();
            case 24:
                fb2 fb2Var = (fb2) obj;
                fb2 fb2Var2 = (fb2) obj2;
                float f = fb2Var.e;
                float f2 = fb2Var2.e;
                if (f <= f2) {
                    if (f < f2 || (i3 = fb2Var.d) > (i4 = fb2Var2.d)) {
                        return 1;
                    }
                    if (i3 >= i4) {
                        return 0;
                    }
                }
                return -1;
            case 25:
                return gl.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 26:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j0 = kf2.j0(tLObject);
                int j02 = kf2.j0(tLObject2);
                if (j0 > j02) {
                    return 1;
                }
                if (j0 < j02) {
                    return -1;
                }
                if (!(tLObject instanceof TLRPC.ChannelParticipant) || !(tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return 0;
                }
                return (int) (k27.B1(((TLRPC.ChannelParticipant) tLObject).peer) - k27.B1(((TLRPC.ChannelParticipant) tLObject2).peer));
            case 27:
                int j03 = kf2.j0((TLObject) obj);
                int j04 = kf2.j0((TLObject) obj2);
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
