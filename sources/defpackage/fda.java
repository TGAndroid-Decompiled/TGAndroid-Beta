package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class fda extends eba {
    public final nfa m0;

    public fda(nfa nfaVar, Context context) {
        super(context);
        this.m0 = nfaVar;
    }

    @Override
    public final boolean d(k27 k27Var) {
        ArrayList arrayList;
        long playlistTopicId;
        nfa nfaVar = this.m0;
        cfa[] cfaVarArr = nfaVar.w1;
        if (!k27.Q4(k27Var.k) && !k27Var.g4()) {
            if (!k27Var.I3()) {
                return false;
            }
            MediaController w = MediaController.w();
            ArrayList arrayList2 = cfaVarArr[4].a;
            long j = nfaVar.f1;
            playlistTopicId = nfaVar.getPlaylistTopicId();
            return w.n0(arrayList2, k27Var, j, true, null, playlistTopicId);
        }
        boolean R = MediaController.w().R(k27Var);
        MediaController w2 = MediaController.w();
        if (R) {
            arrayList = cfaVarArr[4].a;
        } else {
            arrayList = null;
        }
        w2.q0(arrayList, false);
        return R;
    }
}
