package j3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import h7.u6;
import p8.x0;

public abstract class f {

    public static final AudioAttributes f12327a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int[] a() {
        p8.x xVar = p8.z.f45604b;
        p8.w wVar = new p8.w();
        p8.q0 q0Var = g.f12336e;
        p8.o0 o0Var = q0Var.f45528b;
        if (o0Var == null) {
            p8.o0 o0Var2 = new p8.o0(q0Var, new p8.p0(0, q0Var.f45579f, q0Var.f45578e));
            q0Var.f45528b = o0Var2;
            o0Var = o0Var2;
        }
        x0 it = o0Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f12327a)) {
                wVar.a(num);
            }
        }
        wVar.a(2);
        return u6.e(wVar.c());
    }

    public static int b(int i10, int i11) {
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(d5.g0.m(i12)).build(), f12327a)) {
                return i12;
            }
        }
        return 0;
    }
}
