package c8;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
public abstract class je {
    public static zzd a(zb.d dVar) {
        ac.b bVar = (ac.b) pb.g.c().a(ac.b.class);
        uf b10 = wf.b();
        ?? mobileVisionBase = new MobileVisionBase((ac.f) bVar.f1015a.R0(dVar), (Executor) bVar.f1016b.f53434a.get());
        ga.d dVar2 = new ga.d(1);
        dVar2.d = db.TYPE_THIN;
        q4.q qVar = new q4.q(10, false);
        qVar.f53712c = dVar.a();
        qVar.f53711b = eb.NO_ERROR;
        dVar2.f13618e = new ae(qVar);
        pb.m.f53453a.execute(new a8.pa(b10, new a8.wa(dVar2, 1), fb.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, b10.c(), 1));
        return mobileVisionBase;
    }
}
