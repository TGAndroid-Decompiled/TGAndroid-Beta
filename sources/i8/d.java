package i8;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.p;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import m.p3;
import n6.l;
import qb.m;
import z7.ce;
import z7.fb;
import z7.gb;
import z7.hb;
import z7.wf;
import z7.yf;
public abstract class d {
    public static zzd a(ac.e eVar) {
        bc.b bVar = (bc.b) qb.g.c().a(bc.b.class);
        wf b10 = yf.b();
        ?? mobileVisionBase = new MobileVisionBase((bc.f) bVar.f2574a.O0(eVar), (Executor) bVar.f2575b.f44274a.get());
        ?? obj = new Object();
        obj.f15636c = fb.TYPE_THIN;
        o0.a aVar = new o0.a(28, (byte) 0);
        aVar.f16770c = eVar.a();
        aVar.f16769b = gb.NO_ERROR;
        obj.d = new ce(aVar);
        m.f44293a.execute(new p(b10, new a5.a((p3) obj, 1), hb.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, b10.c(), 8));
        return mobileVisionBase;
    }

    public static Parcelable b(String str, Bundle bundle) {
        ClassLoader classLoader = d.class.getClassLoader();
        l.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void c(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable b10 = b("MapOptions", bundle);
            if (b10 != null) {
                d(bundle2, "MapOptions", b10);
            }
            Parcelable b11 = b("StreetViewPanoramaOptions", bundle);
            if (b11 != null) {
                d(bundle2, "StreetViewPanoramaOptions", b11);
            }
            Parcelable b12 = b("camera", bundle);
            if (b12 != null) {
                d(bundle2, "camera", b12);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void d(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = d.class.getClassLoader();
        l.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
