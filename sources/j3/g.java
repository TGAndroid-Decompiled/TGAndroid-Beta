package j3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;

public final class g {

    public static final g f12335c = new g(8, new int[]{2});
    public static final g d = new g(8, new int[]{2, 5, 6});

    public static final p8.q0 f12336e;

    public final int[] f12337a;

    public final int f12338b;

    static {
        b6.a aVar = new b6.a(4, 21);
        aVar.j(5, 6);
        aVar.j(17, 6);
        aVar.j(7, 6);
        aVar.j(18, 6);
        aVar.j(6, 8);
        aVar.j(8, 8);
        aVar.j(14, 8);
        f12336e = aVar.c();
    }

    public g(int i10, int[] iArr) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f12337a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f12337a = new int[0];
        }
        this.f12338b = i10;
    }

    public static g a(Context context) {
        Intent intentM = d5.g0.M(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i10 = d5.g0.f4795a;
        if (i10 >= 17) {
            String str = d5.g0.f4797c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return d;
            }
        }
        if (i10 >= 29 && (d5.g0.F(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return new g(8, f.a());
        }
        if (intentM == null || intentM.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f12335c;
        }
        return new g(intentM.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8), intentM.getIntArrayExtra("android.media.extra.ENCODINGS"));
    }

    public final Pair b(h3.t0 t0Var) {
        int iIntValue;
        String str = t0Var.B;
        str.getClass();
        int iB = d5.q.b(str, t0Var.f8190r);
        Integer numValueOf = Integer.valueOf(iB);
        p8.q0 q0Var = f12336e;
        if (q0Var.containsKey(numValueOf)) {
            int[] iArr = this.f12337a;
            int i10 = 6;
            if (iB == 18 && Arrays.binarySearch(iArr, 18) < 0) {
                iB = 6;
            } else if (iB == 8 && Arrays.binarySearch(iArr, 8) < 0) {
                iB = 7;
            }
            if (Arrays.binarySearch(iArr, iB) < 0) {
                return null;
            }
            int i11 = t0Var.O;
            if (i11 == -1 || iB == 18) {
                int i12 = t0Var.P;
                if (i12 == -1) {
                    i12 = 48000;
                }
                if (d5.g0.f4795a >= 29) {
                    iIntValue = f.b(iB, i12);
                } else {
                    Object obj = q0Var.get(Integer.valueOf(iB));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
                i11 = iIntValue;
            } else if (i11 <= this.f12338b) {
            }
            int i13 = d5.g0.f4795a;
            if (i13 > 28) {
                i10 = i11;
            } else if (i11 == 7) {
                i10 = 8;
            } else if (i11 != 3 && i11 != 4 && i11 != 5) {
                i10 = i11;
            }
            if (i13 <= 26 && "fugu".equals(d5.g0.f4796b) && i10 == 1) {
                i10 = 2;
            }
            int iM = d5.g0.m(i10);
            if (iM != 0) {
                return Pair.create(Integer.valueOf(iB), Integer.valueOf(iM));
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Arrays.equals(this.f12337a, gVar.f12337a) && this.f12338b == gVar.f12338b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f12337a) * 31) + this.f12338b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f12338b + ", supportedEncodings=" + Arrays.toString(this.f12337a) + "]";
    }
}
