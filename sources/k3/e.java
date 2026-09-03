package k3;

import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import android.util.Base64;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import kh.p5;
import lh.g5;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.wg1;
public final class e implements h5.j, r8.i, Vector.TLDeserializer, c2, GenericProvider, c9.f {
    public final int f9686a;

    public e(int i10) {
        this.f9686a = i10;
    }

    public static AudioDeviceInfo a(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static boolean b(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override
    public Object d0(c5.j jVar) {
        switch (this.f9686a) {
            case 21:
                return FirebaseSessionsRegistrar.e(jVar);
            case 22:
                return FirebaseSessionsRegistrar.f(jVar);
            case 23:
                return FirebaseSessionsRegistrar.a(jVar);
            case 24:
                return FirebaseSessionsRegistrar.b(jVar);
            case 25:
                return FirebaseSessionsRegistrar.d(jVar);
            default:
                return FirebaseSessionsRegistrar.c(jVar);
        }
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z4);
    }

    @Override
    public Object get() {
        byte[] bArr = new byte[12];
        h.f9698i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f9686a) {
            case 0:
                bVar.getClass();
                return;
            case 1:
                bVar.getClass();
                return;
            case 2:
                bVar.getClass();
                return;
            case 3:
                bVar.getClass();
                return;
            case 4:
                bVar.getClass();
                return;
            case 5:
                bVar.getClass();
                return;
            default:
                bVar.getClass();
                return;
        }
    }

    @Override
    public void l(d2 d2Var, int i10) {
        switch (this.f9686a) {
            case 10:
                d2Var.dismiss();
                return;
            case 11:
                d2Var.dismiss();
                return;
            case 27:
                g5.d2(new wg1(6, null));
                return;
            default:
                int i11 = g5.f12449n1;
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = p5.f10859h0;
        return 0;
    }
}
