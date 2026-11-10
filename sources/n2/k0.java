package n2;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
public final class k0 {
    public final Context f20236a;
    public Boolean f20237b;

    public k0(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f20236a = applicationContext;
    }

    public final f a(e2.e eVar, e2.u uVar) {
        boolean booleanValue;
        boolean z9;
        uVar.getClass();
        int i7 = uVar.L;
        eVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && i7 != -1) {
            Boolean bool = this.f20237b;
            boolean z10 = false;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                Context context = this.f20236a;
                if (context != null) {
                    String parameters = f2.i.d(context).getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    this.f20237b = Boolean.valueOf(z9);
                } else {
                    this.f20237b = Boolean.FALSE;
                }
                booleanValue = this.f20237b.booleanValue();
            }
            String str = uVar.f10620s;
            str.getClass();
            int c10 = e2.s0.c(str, uVar.f10612k);
            if (c10 != 0 && i10 >= h2.m0.s(c10)) {
                int t6 = h2.m0.t(uVar.K);
                if (t6 == 0) {
                    return f.d;
                }
                try {
                    AudioFormat build = new AudioFormat.Builder().setSampleRate(i7).setChannelMask(t6).setEncoding(c10).build();
                    if (i10 >= 33) {
                        int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, eVar.b());
                        if ((directPlaybackSupport & 1) == 0) {
                            return f.d;
                        }
                        if ((directPlaybackSupport & 3) == 3) {
                            z10 = true;
                        }
                        ?? obj = new Object();
                        obj.f15412a = true;
                        obj.f15413b = z10;
                        obj.f15414c = booleanValue;
                        return obj.a();
                    } else if (i10 >= 31) {
                        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, eVar.b());
                        if (playbackOffloadSupport == 0) {
                            return f.d;
                        }
                        ?? obj2 = new Object();
                        if (i10 > 32 && playbackOffloadSupport == 2) {
                            z10 = true;
                        }
                        obj2.f15412a = true;
                        obj2.f15413b = z10;
                        obj2.f15414c = booleanValue;
                        return obj2.a();
                    } else if (!AudioManager.isOffloadedPlaybackSupported(build, eVar.b())) {
                        return f.d;
                    } else {
                        ?? obj3 = new Object();
                        obj3.f15412a = true;
                        obj3.f15414c = booleanValue;
                        return obj3.a();
                    }
                } catch (IllegalArgumentException unused) {
                    return f.d;
                }
            }
            return f.d;
        }
        return f.d;
    }
}
