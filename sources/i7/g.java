package i7;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import l7.ce;
import l7.fb;
import l7.gb;
import l7.hb;
import l7.wf;
import l7.yf;
public abstract class g {
    public static zzd a(kb.e eVar) {
        lb.b bVar = (lb.b) ab.h.c().a(lb.b.class);
        wf b10 = yf.b();
        ?? mobileVisionBase = new MobileVisionBase((lb.e) bVar.f15146a.G(eVar), (Executor) bVar.f15147b.f305a.get());
        ?? obj = new Object();
        obj.f16690c = fb.TYPE_THIN;
        g9.l lVar = new g9.l(18, (byte) 0);
        lVar.f7169c = eVar.a();
        lVar.f7168b = gb.NO_ERROR;
        obj.d = new ce(lVar);
        ab.q.f333a.execute(new c2.p(b10, new ag.j2((m.s3) obj, 1), hb.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, b10.c(), false, 7));
        return mobileVisionBase;
    }
}
