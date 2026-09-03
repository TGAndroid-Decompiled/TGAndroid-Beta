package k3;

import android.hardware.fingerprint.FingerprintManager;
import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import android.util.Base64;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import la.d0;
import la.j0;
import la.l;
import la.n0;
import la.s;
import lh.q5;
import mh.g5;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.vg1;
public final class e implements h5.j, r8.i, c9.e, Vector.TLDeserializer, c2, GenericProvider {
    public final int f10421a;

    public e(int i10) {
        this.f10421a = i10;
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
    public Object e0(c5.j jVar) {
        l m10getComponents$lambda0;
        j0 m11getComponents$lambda1;
        d0 m12getComponents$lambda2;
        na.h m13getComponents$lambda3;
        s m14getComponents$lambda4;
        n0 m15getComponents$lambda5;
        switch (this.f10421a) {
            case 17:
                m10getComponents$lambda0 = FirebaseSessionsRegistrar.m10getComponents$lambda0(jVar);
                return m10getComponents$lambda0;
            case 18:
                m11getComponents$lambda1 = FirebaseSessionsRegistrar.m11getComponents$lambda1(jVar);
                return m11getComponents$lambda1;
            case 19:
                m12getComponents$lambda2 = FirebaseSessionsRegistrar.m12getComponents$lambda2(jVar);
                return m12getComponents$lambda2;
            case 20:
                m13getComponents$lambda3 = FirebaseSessionsRegistrar.m13getComponents$lambda3(jVar);
                return m13getComponents$lambda3;
            case 21:
                m14getComponents$lambda4 = FirebaseSessionsRegistrar.m14getComponents$lambda4(jVar);
                return m14getComponents$lambda4;
            default:
                m15getComponents$lambda5 = FirebaseSessionsRegistrar.m15getComponents$lambda5(jVar);
                return m15getComponents$lambda5;
        }
    }

    @Override
    public Object get() {
        byte[] bArr = new byte[12];
        h.f10435i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f10421a) {
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
    public void j(d2 d2Var, int i10) {
        switch (this.f10421a) {
            case 24:
                d2Var.dismiss();
                return;
            case 25:
                d2Var.dismiss();
                return;
            default:
                g5.d2(new vg1(6, null));
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = q5.f12908h0;
        return 0;
    }
}
