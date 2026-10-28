package a8;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
public abstract class y9 {
    public static zzd a(cc.e eVar) {
        dc.b bVar = (dc.b) sb.g.c().a(dc.b.class);
        kg c10 = rg.c();
        ?? mobileVisionBase = new MobileVisionBase((dc.f) bVar.f8312a.R0(eVar), (Executor) bVar.f8313b.f48083a.get());
        ?? obj = new Object();
        obj.f17845c = ob.TYPE_THIN;
        rf.b bVar2 = new rf.b(3, false);
        bVar2.f47371c = eVar.a();
        bVar2.f47370b = qb.NO_ERROR;
        obj.d = new ke(bVar2);
        sb.m.f48102a.execute(new fg(c10, new ng((m.r3) obj, 1), rb.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, c10.c(), 0));
        return mobileVisionBase;
    }
}
