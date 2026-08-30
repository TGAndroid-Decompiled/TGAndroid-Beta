package k3;

import android.hardware.fingerprint.FingerprintManager;
import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import android.util.Base64;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import kh.q5;
import la.d0;
import la.j0;
import la.l;
import la.n0;
import la.s;
import lh.g5;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.og1;
public final class e implements h5.j, r8.i, c2, GenericProvider, c9.e, Vector.TLDeserializer {
    public final int f9705a;

    public e(int i10) {
        this.f9705a = i10;
    }

    public static FingerprintManager a(Object obj) {
        return (FingerprintManager) obj;
    }

    public static AudioDeviceInfo b(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static boolean c(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z4);
    }

    @Override
    public Object f0(c5.j jVar) {
        l m11getComponents$lambda0;
        j0 m12getComponents$lambda1;
        d0 m13getComponents$lambda2;
        na.h m14getComponents$lambda3;
        s m15getComponents$lambda4;
        n0 m16getComponents$lambda5;
        switch (this.f9705a) {
            case 20:
                m11getComponents$lambda0 = FirebaseSessionsRegistrar.m11getComponents$lambda0(jVar);
                return m11getComponents$lambda0;
            case 21:
                m12getComponents$lambda1 = FirebaseSessionsRegistrar.m12getComponents$lambda1(jVar);
                return m12getComponents$lambda1;
            case 22:
                m13getComponents$lambda2 = FirebaseSessionsRegistrar.m13getComponents$lambda2(jVar);
                return m13getComponents$lambda2;
            case 23:
                m14getComponents$lambda3 = FirebaseSessionsRegistrar.m14getComponents$lambda3(jVar);
                return m14getComponents$lambda3;
            case 24:
                m15getComponents$lambda4 = FirebaseSessionsRegistrar.m15getComponents$lambda4(jVar);
                return m15getComponents$lambda4;
            default:
                m16getComponents$lambda5 = FirebaseSessionsRegistrar.m16getComponents$lambda5(jVar);
                return m16getComponents$lambda5;
        }
    }

    @Override
    public Object get() {
        byte[] bArr = new byte[12];
        h.f9717i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override
    public void i(d2 d2Var, int i10) {
        switch (this.f9705a) {
            case 9:
                d2Var.dismiss();
                return;
            case 10:
                d2Var.dismiss();
                return;
            case 27:
                g5.d2(new og1(6, null));
                return;
            default:
                int i11 = g5.f12465n1;
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f9705a) {
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
            default:
                bVar.getClass();
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = q5.f10763h0;
        return 0;
    }
}
