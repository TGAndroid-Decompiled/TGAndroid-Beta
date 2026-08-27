package ia;

import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import h9.e2;
import j4.i1;
import j4.j1;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import lh.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.ru0;

public final class l implements z8.d, h3.f, NativeInstance.AudioLevelsCallback, qu0, ru0, a2, t2.e, GenericProvider, Utilities.Callback2Return, mg.c {

    public final int f11044a;

    public l(int i10) {
        this.f11044a = i10;
    }

    public static AudioDeviceInfo d(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    @Override
    public h3.g a(Bundle bundle) {
        p8.l0 l0VarS;
        k4.a[] aVarArr;
        switch (this.f11044a) {
            case 8:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(i1.f12581f);
                if (parcelableArrayList == null) {
                    p8.x xVar = p8.z.f45604b;
                    l0VarS = p8.l0.f45555e;
                } else {
                    l0VarS = d5.a.s(h3.t0.F0, parcelableArrayList);
                }
                return new i1(bundle.getString(i1.h, ""), (h3.t0[]) l0VarS.toArray(new h3.t0[0]));
            case 9:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(j1.f12592e);
                return parcelableArrayList2 == null ? new j1(new i1[0]) : new j1((i1[]) d5.a.s(i1.f12582n, parcelableArrayList2).toArray(new i1[0]));
            case 17:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(k4.b.f14449n);
                if (parcelableArrayList3 == null) {
                    aVarArr = new k4.a[0];
                } else {
                    k4.a[] aVarArr2 = new k4.a[parcelableArrayList3.size()];
                    for (int i10 = 0; i10 < parcelableArrayList3.size(); i10++) {
                        aVarArr2[i10] = (k4.a) k4.a.C.a((Bundle) parcelableArrayList3.get(i10));
                    }
                    aVarArr = aVarArr2;
                }
                return new k4.b(aVarArr, bundle.getLong(k4.b.f14450r, 0L), bundle.getLong(k4.b.f14451s, -9223372036854775807L), bundle.getInt(k4.b.v, 0));
            default:
                long j10 = bundle.getLong(k4.a.f14437r);
                int i11 = bundle.getInt(k4.a.f14438s);
                int i12 = bundle.getInt(k4.a.B);
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(k4.a.v);
                int[] intArray = bundle.getIntArray(k4.a.f14439w);
                long[] longArray = bundle.getLongArray(k4.a.f14440x);
                long j11 = bundle.getLong(k4.a.f14441y);
                boolean z10 = bundle.getBoolean(k4.a.A);
                int[] iArr = intArray;
                if (iArr == null) {
                    iArr = new int[0];
                }
                Uri[] uriArr = parcelableArrayList4 == null ? new Uri[0] : (Uri[]) parcelableArrayList4.toArray(new Uri[0]);
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new k4.a(j10, i11, i12, iArr, uriArr, longArray, j11, z10);
        }
    }

    @Override
    public Object apply(Object obj) {
        l9.a.f15489b.getClass();
        return i9.a.f10965a.h((e2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override
    public void b(Object obj, float f10) {
        jh.i1 i1Var = (jh.i1) obj;
        switch (this.f11044a) {
            case 12:
                WindowManager.LayoutParams layoutParams = i1Var.f13426c;
                i1Var.J = f10;
                layoutParams.x = (int) f10;
                AndroidUtilities.updateViewLayout(i1Var.f13425b, i1Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = i1Var.f13426c;
                i1Var.K = f10;
                layoutParams2.y = (int) f10;
                AndroidUtilities.updateViewLayout(i1Var.f13425b, i1Var.d, layoutParams2);
                break;
        }
    }

    public Constructor c() {
        switch (this.f11044a) {
            case 26:
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(m3.k.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(m3.k.class).getConstructor(null);
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f11044a) {
            case 15:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override
    public float get(Object obj) {
        jh.i1 i1Var = (jh.i1) obj;
        switch (this.f11044a) {
            case 11:
                return i1Var.J;
            default:
                return i1Var.K;
        }
    }

    @Override
    public int i(c6 c6Var, boolean z10) {
        return ng.c.l(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.v0(g6.f23053d6, c6Var), g6.v0(g6.Sd, c6Var));
    }

    @Override
    public Object provide(Object obj) {
        MediaController.AlbumEntry albumEntry = p3.f16506f0;
        return 0;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override
    public Object u0(af.h hVar) {
        switch (this.f11044a) {
            case 1:
                return FirebaseSessionsRegistrar.m11getComponents$lambda0(hVar);
            case 2:
                return FirebaseSessionsRegistrar.m12getComponents$lambda1(hVar);
            case 3:
                return FirebaseSessionsRegistrar.m13getComponents$lambda2(hVar);
            case 4:
                return FirebaseSessionsRegistrar.m14getComponents$lambda3(hVar);
            case 5:
                return FirebaseSessionsRegistrar.m15getComponents$lambda4(hVar);
            default:
                return FirebaseSessionsRegistrar.m16getComponents$lambda5(hVar);
        }
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
