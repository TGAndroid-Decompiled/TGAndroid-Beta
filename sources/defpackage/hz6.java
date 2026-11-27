package defpackage;

import android.app.NotificationChannel;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.telegram.messenger.voip.CallAudioDevice;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;
public final class hz6 implements ot2, pz6, NativeLifecycleLock.NativePointerCallable, Vector.TLDeserializer, y2c, yj0, tl5, CallAudioDevice.SamplesCallback, fd, qd3, zla, ama {
    public final byte a;

    public static NotificationChannel c(Object obj) {
        return (NotificationChannel) obj;
    }

    public static void e(Object obj) {
        throw new AssertionError(obj);
    }

    @Override
    public final Object a(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return bitmap;
        }
        return bitmap.extractAlpha();
    }

    @Override
    public final void accept(Object obj) {
        og8 og8Var = (og8) obj;
        switch (this.a) {
            case 1:
                og8Var.K0();
                return;
            case 2:
                og8Var.J0();
                return;
            default:
                og8Var.stop();
                return;
        }
    }

    @Override
    public final Object apply(Object obj) {
        pf7 pf7Var = (pf7) obj;
        pf7Var.getClass();
        rw8 rw8Var = jw8.a;
        rw8Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            rw8Var.b(pf7Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public final boolean b(int i, int i2, int i3, int i4, int i5) {
        if (i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) {
            if (i2 == 77 && i3 == 76 && i4 == 76) {
                if (i5 == 84 || i == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object call(long j) {
        switch (this.a) {
            case 5:
                return MediaSource.c(j);
            case 6:
                return MediaStream.h(j);
            case 7:
                return MediaStreamTrack.c(j);
            case 8:
                return MediaStreamTrack.d(j);
            case 9:
                return MediaStreamTrack.b(j);
            default:
                return MediaStreamTrack.a(j);
        }
    }

    @Override
    public final void d(Object obj, float f) {
        lu7 lu7Var = (lu7) obj;
        switch (this.a) {
            case 26:
                lu7Var.f = f;
                if (!lu7Var.E || lu7Var.G) {
                    lu7Var.c.setStrokeWidth(hl.R1(lu7Var.w, lu7Var.x, f));
                    lu7Var.f();
                }
                lu7Var.invalidate();
                return;
            default:
                lu7Var.n = f;
                if (!lu7Var.E || lu7Var.G) {
                    lu7Var.f();
                }
                lu7Var.invalidate();
                return;
        }
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 11:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i, z);
            default:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i, z);
        }
    }

    @Override
    public final float get(Object obj) {
        lu7 lu7Var = (lu7) obj;
        switch (this.a) {
            case 25:
                return lu7Var.f;
            case 26:
            default:
                return lu7Var.s;
            case 27:
                return lu7Var.n;
        }
    }

    @Override
    public final Object j(yx6 yx6Var, xw6 xw6Var, int i) {
        sjf sjfVar = yx6Var.e;
        yx6Var.q(xw6Var);
        sjfVar.getClass();
        return fne.c(new gaa(-6));
    }

    @Override
    public final void onSamples(byte[] bArr, int i, int i2) {
        NativeInstance.b(i, i2, bArr);
    }

    @Override
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 22:
                idVar.dismiss();
                return;
            default:
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new uqc());
                    return;
                }
                return;
        }
    }

    public hz6(byte b) {
        this.a = b;
    }

    @Override
    public final void f(vw8 vw8Var) {
    }
}
