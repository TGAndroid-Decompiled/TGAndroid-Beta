package i3;

import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import g9.e2;
import h3.t0;
import ih.k1;
import j4.i1;
import j4.j1;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kh.q3;
import o8.l0;
import o8.x;
import o8.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.ou0;
public final class i implements NativeInstance.AudioLevelsCallback, nu0, ou0, b2, h3.f, t2.e, GenericProvider, Utilities.Callback2Return, lg.c {
    public final int f10908a;

    public i(int i9) {
        this.f10908a = i9;
    }

    public static AudioDeviceInfo d(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public Constructor a() {
        switch (this.f10908a) {
            case 20:
                if (!Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(m3.k.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(m3.k.class).getConstructor(null);
        }
    }

    @Override
    public Object apply(Object obj) {
        k9.a.f14708b.getClass();
        return h9.c.f10257a.u((e2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override
    public void b(Object obj, float f10) {
        k1 k1Var = (k1) obj;
        switch (this.f10908a) {
            case 3:
                WindowManager.LayoutParams layoutParams = k1Var.f11658c;
                k1Var.J = f10;
                layoutParams.x = (int) f10;
                AndroidUtilities.updateViewLayout(k1Var.f11657b, k1Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = k1Var.f11658c;
                k1Var.K = f10;
                layoutParams2.y = (int) f10;
                AndroidUtilities.updateViewLayout(k1Var.f11657b, k1Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public h3.g c(Bundle bundle) {
        l0 s10;
        k4.a[] aVarArr;
        Uri[] uriArr;
        switch (this.f10908a) {
            case 9:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(i1.f13479f);
                if (parcelableArrayList == null) {
                    x xVar = z.f19105b;
                    s10 = l0.f19056e;
                } else {
                    s10 = d5.a.s(t0.F0, parcelableArrayList);
                }
                return new i1(bundle.getString(i1.h, ""), (t0[]) s10.toArray(new t0[0]));
            case 10:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(j1.f13490e);
                if (parcelableArrayList2 == null) {
                    return new j1(new i1[0]);
                }
                return new j1((i1[]) d5.a.s(i1.f13480n, parcelableArrayList2).toArray(new i1[0]));
            case 11:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(k4.b.f14628n);
                if (parcelableArrayList3 == null) {
                    aVarArr = new k4.a[0];
                } else {
                    k4.a[] aVarArr2 = new k4.a[parcelableArrayList3.size()];
                    for (int i9 = 0; i9 < parcelableArrayList3.size(); i9++) {
                        aVarArr2[i9] = (k4.a) k4.a.C.c((Bundle) parcelableArrayList3.get(i9));
                    }
                    aVarArr = aVarArr2;
                }
                return new k4.b(aVarArr, bundle.getLong(k4.b.f14629r, 0L), bundle.getLong(k4.b.f14630s, -9223372036854775807L), bundle.getInt(k4.b.v, 0));
            default:
                long j10 = bundle.getLong(k4.a.f14616r);
                int i10 = bundle.getInt(k4.a.f14617s);
                int i11 = bundle.getInt(k4.a.B);
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(k4.a.v);
                int[] intArray = bundle.getIntArray(k4.a.f14618w);
                long[] longArray = bundle.getLongArray(k4.a.f14619x);
                long j11 = bundle.getLong(k4.a.f14620y);
                boolean z10 = bundle.getBoolean(k4.a.A);
                int[] iArr = intArray;
                if (iArr == null) {
                    iArr = new int[0];
                }
                if (parcelableArrayList4 == null) {
                    uriArr = new Uri[0];
                } else {
                    uriArr = (Uri[]) parcelableArrayList4.toArray(new Uri[0]);
                }
                Uri[] uriArr2 = uriArr;
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new k4.a(j10, i10, i11, iArr, uriArr2, longArray, j11, z10);
        }
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f10908a) {
            case 6:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public int g(b6 b6Var, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        switch (this.f10908a) {
            case 22:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return mg.c.l(f10, f6.v0(f6.f23001d6, b6Var), f6.v0(f6.Sd, b6Var));
            case 23:
                if (!LiteMode.isEnabled(256)) {
                    return f6.w0(null, f6.G8, false);
                }
                int w02 = f6.w0(null, f6.G8, false);
                if (z10) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.825f;
                }
                return f6.l1(f11, w02);
            case 24:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return mg.c.l(f12, f6.v0(f6.f23001d6, b6Var), f6.v0(f6.Zk, b6Var));
            case 25:
                if (LiteMode.isEnabled(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return f6.l1(f13, f6.v0(f6.Fi, b6Var));
            case 26:
                return 855638016;
            case 27:
                return 1073741824;
            case 28:
                return f6.l1(0.075f, -16777216);
            default:
                int w03 = f6.w0(null, f6.G8, false);
                if (z10) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.825f;
                }
                return f6.l1(f14, w03);
        }
    }

    @Override
    public float get(Object obj) {
        k1 k1Var = (k1) obj;
        switch (this.f10908a) {
            case 2:
                return k1Var.J;
            default:
                return k1Var.K;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        MediaController.AlbumEntry albumEntry = q3.f15857f0;
        return 0;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return num.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }
}
