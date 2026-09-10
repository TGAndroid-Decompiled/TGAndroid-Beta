package k2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;
public final class g0 implements u {
    public static AudioAttributes b(b2.e eVar, boolean z10) {
        if (z10) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) eVar.b().f2037a;
    }

    public final AudioTrack a(k kVar, b2.e eVar, int i10, Context context) {
        boolean z10 = kVar.d;
        int i11 = kVar.f12168a;
        int i12 = kVar.f12170c;
        int i13 = kVar.f12169b;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23) {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b(eVar, z10)).setAudioFormat(e2.d0.r(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(kVar.f12171f).setSessionId(i10);
            if (i14 >= 29) {
                sessionId.setOffloadedPlayback(kVar.e);
            }
            if (i14 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            return sessionId.build();
        }
        return new AudioTrack(b(eVar, z10), e2.d0.r(i13, i12, i11), kVar.f12171f, 1, i10);
    }
}
