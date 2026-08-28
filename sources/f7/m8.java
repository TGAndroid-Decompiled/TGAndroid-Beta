package f7;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import j7.ce;
import j7.fb;
import j7.gb;
import j7.hb;
import j7.wf;
import j7.yf;
import java.util.concurrent.Executor;
public abstract class m8 {
    public static zzd a(ib.e eVar) {
        jb.b bVar = (jb.b) ya.g.c().a(jb.b.class);
        wf b10 = yf.b();
        ?? mobileVisionBase = new MobileVisionBase((jb.f) bVar.f14288a.G(eVar), (Executor) bVar.f14289b.f49687a.get());
        ?? obj = new Object();
        obj.f17100c = fb.TYPE_THIN;
        g5.b bVar2 = new g5.b(12);
        bVar2.f7112c = eVar.a();
        bVar2.f7111b = gb.NO_ERROR;
        obj.d = new ce(bVar2);
        ya.m.f49706a.execute(new af.f(b10, new a6.a((m.t3) obj, 1), hb.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, b10.c(), false, 6));
        return mobileVisionBase;
    }
}
