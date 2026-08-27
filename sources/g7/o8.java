package g7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import k7.ce;
import k7.fb;
import k7.gb;
import k7.hb;
import k7.wf;
import k7.yf;

public abstract class o8 {
    public static zzd a(jb.e eVar) {
        kb.b bVar = (kb.b) za.g.c().a(kb.b.class);
        kb.e eVar2 = (kb.e) bVar.f15142a.G(eVar);
        Executor executor = (Executor) bVar.f15143b.f50282a.get();
        wf wfVarB = yf.b();
        zzd zzdVar = new zzd(eVar2, executor);
        m.t3 t3Var = new m.t3();
        t3Var.f17475c = fb.TYPE_THIN;
        g5.b bVar2 = new g5.b(13);
        bVar2.f6390c = eVar.a();
        bVar2.f6389b = gb.NO_ERROR;
        t3Var.d = new ce(bVar2);
        za.m.f50301a.execute(new bf.e(wfVarB, new b6.a(t3Var, 1), hb.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, wfVarB.c(), false, 6));
        return zzdVar;
    }
}
