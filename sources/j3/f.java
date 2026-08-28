package j3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import g7.r6;
import o8.x0;
public abstract class f {
    public static final AudioAttributes f13237a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int[] a() {
        o8.x xVar = o8.z.f19105b;
        o8.w wVar = new o8.w();
        o8.q0 q0Var = g.f13242e;
        o8.o0 o0Var = q0Var.f19029b;
        if (o0Var == null) {
            o8.o0 o0Var2 = new o8.o0(q0Var, new o8.p0(0, q0Var.f19080f, q0Var.f19079e));
            q0Var.f19029b = o0Var2;
            o0Var = o0Var2;
        }
        x0 w8 = o0Var.w();
        while (w8.hasNext()) {
            Integer num = (Integer) w8.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f13237a)) {
                wVar.a(num);
            }
        }
        wVar.a(2);
        return r6.e(wVar.c());
    }

    public static int b(int i9, int i10) {
        for (int i11 = 8; i11 > 0; i11--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i9).setSampleRate(i10).setChannelMask(d5.f0.m(i11)).build(), f13237a)) {
                return i11;
            }
        }
        return 0;
    }
}
