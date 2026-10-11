package k2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
public final class f0 implements u {
    public final AudioTrack a(k kVar, b2.e eVar, int i10, Context context) {
        AudioAttributes audioAttributes;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = kVar.f14506b;
        int i13 = kVar.f14507c;
        int i14 = kVar.f14505a;
        String str = e2.d0.f8531a;
        AudioFormat build = new AudioFormat.Builder().setSampleRate(i12).setChannelMask(i13).setEncoding(i14).build();
        if (kVar.d) {
            audioAttributes = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            audioAttributes = (AudioAttributes) eVar.b().f3681a;
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(audioAttributes).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(kVar.f14509f).setSessionId(i10);
        if (i11 >= 29) {
            sessionId.setOffloadedPlayback(kVar.f14508e);
        }
        if (i11 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return sessionId.build();
    }
}
