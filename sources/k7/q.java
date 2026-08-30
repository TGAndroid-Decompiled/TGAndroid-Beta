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
        ?? mobileVisionBase = new MobileVisionBase((nb.e) bVar.f14900a.F(eVar), (Executor) bVar.f14901b.f2214a.get());
        ?? obj = new Object();
        obj.f13643c = gb.TYPE_THIN;
        n7.qa qaVar = new n7.qa(1);
        qaVar.f14703c = eVar.a();
        qaVar.f14702b = hb.NO_ERROR;
        obj.d = new de(qaVar);
        cb.o.f2237a.execute(new c2.p(b10, new b4.e0((m.s3) obj, 1), ib.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, b10.c(), false, 7));
        return mobileVisionBase;
    }
}
