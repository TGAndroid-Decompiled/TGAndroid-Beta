package c8;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
public abstract class oe {
    public static zzd a(zb.d dVar) {
        ac.b bVar = (ac.b) pb.g.c().a(ac.b.class);
        uf b10 = wf.b();
        ?? mobileVisionBase = new MobileVisionBase((ac.f) bVar.f1012a.R0(dVar), (Executor) bVar.f1013b.f55641a.get());
        ?? obj = new Object();
        obj.f13272c = db.TYPE_THIN;
        q4.q qVar = new q4.q(9, false);
        qVar.f55950c = dVar.a();
        qVar.f55949b = eb.NO_ERROR;
        obj.d = new ae(qVar);
        pb.n.f55663a.execute(new a8.qa(b10, new a8.xa((ga.d) obj, 1), fb.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, b10.c(), 1));
        return mobileVisionBase;
    }
}
