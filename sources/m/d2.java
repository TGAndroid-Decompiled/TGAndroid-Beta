package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.ty;
public final class d2 implements View.OnTouchListener {
    public final int f16175a;
    public final Object f16176b;

    public d2(Object obj, int i10) {
        this.f16175a = i10;
        this.f16176b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f16175a) {
            case 0:
                e2 e2Var = (e2) this.f16176b;
                b2 b2Var = e2Var.G;
                Handler handler = e2Var.K;
                y yVar = e2Var.O;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                if (action == 0 && yVar != null && yVar.isShowing() && x10 >= 0 && x10 < yVar.getWidth() && y3 >= 0 && y3 < yVar.getHeight()) {
                    handler.postDelayed(b2Var, 250L);
                    return false;
                } else if (action == 1) {
                    handler.removeCallbacks(b2Var);
                    return false;
                } else {
                    return false;
                }
            case 1:
                ty tyVar = (ty) this.f16176b;
                if (motionEvent.getAction() == 0) {
                    tyVar.F.f30731f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    tyVar.F.f30731f = false;
                }
                return false;
            case 2:
                gz gzVar = (gz) this.f16176b;
                if (motionEvent.getAction() == 0) {
                    gzVar.G.f30731f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gzVar.G.f30731f = false;
                }
                return false;
            default:
                oz ozVar = (oz) this.f16176b;
                if (motionEvent.getAction() == 0) {
                    ozVar.Q.f30731f = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    ozVar.Q.f30731f = false;
                }
                return false;
        }
    }
}
