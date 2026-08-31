package l3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
public abstract class f {
    public static final AudioAttributes f11499a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static s8.v a() {
        s8.t tVar = s8.v.f47143b;
        ?? wVar = new com.google.android.gms.common.api.internal.w();
        s8.n0 n0Var = g.f11502e;
        s8.l0 l0Var = n0Var.f47148b;
        if (l0Var == null) {
            s8.l0 l0Var2 = new s8.l0(n0Var, new s8.m0(0, n0Var.f47121f, n0Var.f47120e));
            n0Var.f47148b = l0Var2;
            l0Var = l0Var2;
        }
        s8.u0 w10 = l0Var.w();
        while (w10.hasNext()) {
            Integer num = (Integer) w10.next();
            int intValue = num.intValue();
            if (h5.d0.f7237a >= 34 || intValue != 30) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f11499a)) {
                    wVar.b(num);
                }
            }
        }
        wVar.b(2);
        return wVar.i();
    }

    public static int b(int i10, int i11) {
        for (int i12 = 10; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(h5.d0.n(i12)).build(), f11499a)) {
                return i12;
            }
        }
        return 0;
    }
}
