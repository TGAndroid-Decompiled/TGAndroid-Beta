package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bd;
import org.telegram.messenger.v10;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.bi;
import org.telegram.ui.hc1;
public final class ab implements v10 {
    public final int f4843a;
    public final KeyEvent.Callback f4844b;

    public ab(KeyEvent.Callback callback, int i3) {
        this.f4843a = i3;
        this.f4844b = callback;
    }

    @Override
    public final Object a(Object obj) {
        int i3 = this.f4843a;
        KeyEvent.Callback callback = this.f4844b;
        switch (i3) {
            case 0:
                bb bbVar = (bb) callback;
                return bbVar.f4890s[((Integer) obj).intValue() % bbVar.f4890s.length];
            case 1:
                zi ziVar = (zi) obj;
                ((gi.x6) callback).f13852j2 = ziVar;
                return Boolean.valueOf(MediaController.B().o0(org.telegram.messenger.k5.k(ziVar), ziVar, 0L, true, null, 0L));
            case 2:
                bb bbVar2 = (bb) callback;
                return bbVar2.f4890s[((Integer) obj).intValue() % bbVar2.f4890s.length];
            case 3:
                return new hc1(9, (org.telegram.ui.m0) callback, (Integer) obj);
            case 4:
                ug.f0 f0Var = (ug.f0) callback;
                if (((Integer) obj).intValue() == 2) {
                    bi biVar = new bi(f0Var.getContext(), new ug.w(f0Var), false, false, false, f0Var.A1);
                    biVar.f28608n = true;
                    biVar.A1(bd.M0(2131754428, null));
                    biVar.U3 = new mi.h0(27, f0Var, biVar);
                    biVar.setOnDismissListener(new gi.d1(8));
                    biVar.y1(1, false);
                    biVar.e1();
                    MediaController.f21300h2 = true;
                    biVar.f32215b2.i0();
                    biVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((zg.r) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
