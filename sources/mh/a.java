package mh;

import k2.c;
import oe.d;
import oe.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.voip.w2;
public final class a implements d {
    public final e f18488a;
    public final e f18489b;
    public final oe.b f18490c;
    public final oe.b d;
    public final w2 e;
    public final c f18491f;
    public boolean h;

    public a(w2 w2Var, c cVar) {
        ds dsVar = ds.h;
        this.f18488a = new e(1, this, dsVar, 350L);
        this.f18489b = new e(2, this, dsVar, 350L);
        this.f18490c = new oe.b(0, this, dsVar, 350L, true);
        this.d = new oe.b(3, this, dsVar, 350L, true);
        this.h = true;
        this.e = w2Var;
        this.f18491f = cVar;
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        int i11;
        w2 w2Var = this.e;
        if (i10 == 1) {
            w2Var.setTranslationX(this.f18488a.f19333f);
        }
        if (i10 == 2) {
            w2Var.setTranslationY(this.f18489b.f19333f);
        }
        oe.b bVar = this.d;
        oe.b bVar2 = this.f18490c;
        if (i10 == 0) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
            w2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            w2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            w2Var.setVisibility(i11);
        }
        if (i10 == 3) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        c cVar = this.f18491f;
        if (cVar != null) {
            cVar.run();
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
