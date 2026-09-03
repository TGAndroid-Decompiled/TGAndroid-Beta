package k7;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import n7.de;
import n7.gb;
import n7.hb;
import n7.ib;
import n7.xf;
import n7.zf;
public abstract class q {
    public static zzd a(mb.e eVar) {
        nb.b bVar = (nb.b) cb.h.c().a(nb.b.class);
        xf b10 = zf.b();
        ?? mobileVisionBase = new MobileVisionBase((nb.e) bVar.f14885a.F(eVar), (Executor) bVar.f14886b.f2237a.get());
        ?? obj = new Object();
        obj.f13627c = gb.TYPE_THIN;
        n7.qa qaVar = new n7.qa(1);
        qaVar.f14688c = eVar.a();
        qaVar.f14687b = hb.NO_ERROR;
        obj.d = new de(qaVar);
        cb.o.f2260a.execute(new c2.p(b10, new b4.e0((m.s3) obj, 1), ib.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, b10.c(), false, 7));
        return mobileVisionBase;
    }
}
