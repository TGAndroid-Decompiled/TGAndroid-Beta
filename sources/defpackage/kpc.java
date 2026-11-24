package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
public final class kpc implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public kpc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                npc npcVar = (npc) obj;
                if (!npcVar.y && npcVar.r && !npcVar.h.b()) {
                    npcVar.h.setProgress(0.0f);
                    npcVar.h.d();
                    return;
                }
                return;
            case 1:
                brc brcVar = (brc) obj;
                brcVar.b(!brcVar.E);
                return;
            case 2:
                mrc mrcVar = ((qrc) obj).c;
                mrcVar.requestFocus();
                gm.E3(mrcVar);
                return;
            default:
                quc qucVar = (quc) obj;
                oh2 oh2Var = qucVar.a;
                oh2Var.c(!oh2Var.b(), true);
                qucVar.c.setEnabled(qucVar.a.b());
                ViewPropertyAnimator animate = qucVar.c.animate();
                if (qucVar.a.b()) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                animate.alpha(f).start();
                return;
        }
    }
}
