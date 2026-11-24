package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class l2b extends tca {
    public final x2b U2;

    public l2b(x2b x2bVar, Context context, String str, String str2, ylb ylbVar) {
        super(context, null, str, false, str2, false, ylbVar);
        this.U2 = x2bVar;
    }

    @Override
    public final void H() {
        super.H();
        d dVar = this.U2.F1;
        if (dVar instanceof yv1) {
            gm.V2(dVar.getParentActivity(), dVar.getClassGuid());
            if (((yv1) dVar).a0.getVisibility() == 0) {
                dVar.getFragmentView().requestLayout();
            }
        }
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        gm.d3(new v99(this, vh6Var, i, (byte) 17), 100L);
    }
}
