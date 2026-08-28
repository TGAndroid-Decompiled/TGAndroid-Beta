package j3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;
public final class g {
    public static final g f13241c = new g(8, new int[]{2});
    public static final g d = new g(8, new int[]{2, 5, 6});
    public static final o8.q0 f13242e;
    public final int[] f13243a;
    public final int f13244b;

    static {
        a6.a aVar = new a6.a(4, 17);
        aVar.j(5, 6);
        aVar.j(17, 6);
        aVar.j(7, 6);
        aVar.j(18, 6);
        aVar.j(6, 8);
        aVar.j(8, 8);
        aVar.j(14, 8);
        f13242e = aVar.c();
    }

    public g(int i9, int[] iArr) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f13243a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f13243a = new int[0];
        }
        this.f13244b = i9;
    }

    public static g a(Context context) {
        Intent M = d5.f0.M(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i9 = d5.f0.f4349a;
        if (i9 >= 17) {
            String str = d5.f0.f4351c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return d;
            }
        }
        if (i9 >= 29 && (d5.f0.F(context) || (i9 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return new g(8, f.a());
        }
        if (M != null && M.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new g(M.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8), M.getIntArrayExtra("android.media.extra.ENCODINGS"));
        }
        return f13241c;
    }

    public final android.util.Pair b(h3.t0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: j3.g.b(h3.t0):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Arrays.equals(this.f13243a, gVar.f13243a) && this.f13244b == gVar.f13244b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f13243a) * 31) + this.f13244b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f13244b + ", supportedEncodings=" + Arrays.toString(this.f13243a) + "]";
    }
}
