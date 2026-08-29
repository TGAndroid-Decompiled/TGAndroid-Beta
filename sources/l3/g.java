package l3;

import ag.j2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;
public final class g {
    public static final g f14091c = new g(8, new int[]{2});
    public static final g d = new g(8, new int[]{2, 5, 6});
    public static final q8.q0 f14092e;
    public final int[] f14093a;
    public final int f14094b;

    static {
        j2 j2Var = new j2(4, 21);
        j2Var.l(5, 6);
        j2Var.l(17, 6);
        j2Var.l(7, 6);
        j2Var.l(18, 6);
        j2Var.l(6, 8);
        j2Var.l(8, 8);
        j2Var.l(14, 8);
        f14092e = j2Var.c();
    }

    public g(int i10, int[] iArr) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f14093a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f14093a = new int[0];
        }
        this.f14094b = i10;
    }

    public static g a(Context context) {
        Intent M = f5.d0.M(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i10 = f5.d0.f6579a;
        if (i10 >= 17) {
            String str = f5.d0.f6581c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return d;
            }
        }
        if (i10 >= 29 && (f5.d0.F(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return new g(8, f.a());
        }
        if (M != null && M.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new g(M.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8), M.getIntArrayExtra("android.media.extra.ENCODINGS"));
        }
        return f14091c;
    }

    public final android.util.Pair b(j3.t0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: l3.g.b(j3.t0):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Arrays.equals(this.f14093a, gVar.f14093a) && this.f14094b == gVar.f14094b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f14093a) * 31) + this.f14094b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f14094b + ", supportedEncodings=" + Arrays.toString(this.f14093a) + "]";
    }
}
