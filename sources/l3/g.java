package l3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k7.y7;
public final class g {
    public static final g f11139c = new g(10, new int[]{2});
    public static final s8.i0 d;
    public static final s8.n0 e;
    public final int[] f11140a;
    public final int f11141b;

    static {
        Object[] objArr = {2, 5, 6};
        s8.l.b(3, objArr);
        d = s8.v.s(3, objArr);
        b4.e0 e0Var = new b4.e0(4, 22);
        e0Var.w(5, 6);
        e0Var.w(17, 6);
        e0Var.w(7, 6);
        e0Var.w(30, 10);
        e0Var.w(18, 6);
        e0Var.w(6, 8);
        e0Var.w(8, 8);
        e0Var.w(14, 8);
        e = e0Var.c();
    }

    public g(int i10, int[] iArr) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f11140a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f11140a = new int[0];
        }
        this.f11141b = i10;
    }

    public static g a(Context context) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public static g b(Context context, Intent intent) {
        List aVar;
        int i10 = h5.d0.f6937a;
        if (i10 < 23 || !e.b(context)) {
            ?? wVar = new com.google.android.gms.common.api.internal.w();
            if (i10 >= 17) {
                String str = h5.d0.f6939c;
                if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                    s8.i0 i0Var = d;
                    i0Var.getClass();
                    wVar.d(i0Var);
                }
            }
            if (i10 >= 29 && (h5.d0.F(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
                s8.v a2 = f.a();
                a2.getClass();
                wVar.d(a2);
                return new g(10, y7.d(wVar.i()));
            } else if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
                int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                if (intArrayExtra != null) {
                    if (intArrayExtra.length == 0) {
                        aVar = Collections.EMPTY_LIST;
                    } else {
                        aVar = new u8.a(0, intArrayExtra.length, intArrayExtra);
                    }
                    List list = aVar;
                    list.getClass();
                    wVar.d(list);
                }
                return new g(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), y7.d(wVar.i()));
            } else {
                s8.z i11 = wVar.i();
                if (!i11.isEmpty()) {
                    return new g(10, y7.d(i11));
                }
            }
        }
        return f11139c;
    }

    public final android.util.Pair c(j3.n0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: l3.g.c(j3.n0):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Arrays.equals(this.f11140a, gVar.f11140a) && this.f11141b == gVar.f11141b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f11140a) * 31) + this.f11141b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f11141b + ", supportedEncodings=" + Arrays.toString(this.f11140a) + "]";
    }
}
