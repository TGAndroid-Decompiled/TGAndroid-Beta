package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class g4b extends kea {
    public final s4b U2;

    public g4b(s4b s4bVar, Context context, String str, String str2, vnb vnbVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = s4bVar;
    }

    @Override
    public final void H() {
        super.H();
        e eVar = this.U2.F1;
        if (eVar instanceof zu1) {
            hl.V2(eVar.getParentActivity(), eVar.getClassGuid());
            if (((zu1) eVar).a0.getVisibility() == 0) {
                eVar.getFragmentView().requestLayout();
            }
        }
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        hl.d3(new a39(this, zh6Var, i, (byte) 18), 100L);
    }
}
