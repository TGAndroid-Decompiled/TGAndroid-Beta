package ch;

import a3.d;
import fe.e;
import fe.f;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.voip.c2;
public final class a implements e {
    public final f f4178a;
    public final f f4179b;
    public final fe.b f4180c;
    public final fe.b d;
    public final c2 e;
    public final d f4181f;
    public boolean h;

    public a(c2 c2Var, d dVar) {
        gr grVar = gr.h;
        this.f4178a = new f(1, this, grVar, 350L);
        this.f4179b = new f(2, this, grVar, 350L);
        this.f4180c = new fe.b(0, this, grVar, 350L, true);
        this.d = new fe.b(3, this, grVar, 350L, true);
        this.h = true;
        this.e = c2Var;
        this.f4181f = dVar;
    }

    @Override
    public final void v(int i10, float f7, float f10, f fVar) {
        int i11;
        c2 c2Var = this.e;
        if (i10 == 1) {
            c2Var.setTranslationX(this.f4178a.f7032f);
        }
        if (i10 == 2) {
            c2Var.setTranslationY(this.f4179b.f7032f);
        }
        fe.b bVar = this.d;
        fe.b bVar2 = this.f4180c;
        if (i10 == 0) {
            c2Var.setAlpha(i0.T1(0.5f, 1.0f, bVar.e) * bVar2.e);
            c2Var.setScaleX(i0.T1(0.3f, 1.0f, f7));
            c2Var.setScaleY(i0.T1(0.3f, 1.0f, f7));
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c2Var.setVisibility(i11);
        }
        if (i10 == 3) {
            c2Var.setAlpha(i0.T1(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        d dVar = this.f4181f;
        if (dVar != null) {
            dVar.run();
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
