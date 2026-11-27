package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
public final class fa3 {
    public final Context a;
    public Boolean b;

    public fa3(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.a = applicationContext;
    }

    public final l00 a(oz ozVar, ko4 ko4Var) {
        Boolean bool;
        boolean booleanValue;
        boolean z;
        ko4Var.getClass();
        int i = ko4Var.P;
        ozVar.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && i != -1) {
            Boolean bool2 = this.b;
            boolean z2 = false;
            if (bool2 != null) {
                booleanValue = bool2.booleanValue();
            } else {
                Context context = this.a;
                if (context != null) {
                    String parameters = j00.e(context).getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                    this.b = bool;
                } else {
                    bool = Boolean.FALSE;
                    this.b = bool;
                }
                booleanValue = bool.booleanValue();
            }
            String str = ko4Var.t;
            str.getClass();
            int c = dg7.c(str, ko4Var.l);
            if (c != 0 && i2 >= gcc.s(c)) {
                int i3 = ko4Var.O;
                if (i3 == -1) {
                    i3 = gcc.t(ko4Var.N);
                }
                if (i3 == 0) {
                    return l00.d;
                }
                try {
                    AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(i3).setEncoding(c).build();
                    if (i2 >= 33) {
                        int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, ozVar.b());
                        if ((directPlaybackSupport & 1) == 0) {
                            return l00.d;
                        }
                        if ((directPlaybackSupport & 3) == 3) {
                            z2 = true;
                        }
                        ?? obj = new Object();
                        obj.a = true;
                        obj.b = z2;
                        obj.c = booleanValue;
                        return obj.a();
                    } else if (i2 >= 31) {
                        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, ozVar.b());
                        if (playbackOffloadSupport == 0) {
                            return l00.d;
                        }
                        ?? obj2 = new Object();
                        if (i2 > 32 && playbackOffloadSupport == 2) {
                            z2 = true;
                        }
                        obj2.a = true;
                        obj2.b = z2;
                        obj2.c = booleanValue;
                        return obj2.a();
                    } else if (!AudioManager.isOffloadedPlaybackSupported(build, ozVar.b())) {
                        return l00.d;
                    } else {
                        ?? obj3 = new Object();
                        obj3.a = true;
                        obj3.c = booleanValue;
                        return obj3.a();
                    }
                } catch (IllegalArgumentException unused) {
                    return l00.d;
                }
            }
            return l00.d;
        }
        return l00.d;
    }
}
