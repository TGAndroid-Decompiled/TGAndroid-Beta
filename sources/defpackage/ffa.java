package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class ffa extends eda {
    public final nha m0;

    public ffa(nha nhaVar, Context context) {
        super(context);
        this.m0 = nhaVar;
    }

    @Override
    public final boolean d(k47 k47Var) {
        ArrayList arrayList;
        long playlistTopicId;
        nha nhaVar = this.m0;
        cha[] chaVarArr = nhaVar.w1;
        if (!k47.Q4(k47Var.k) && !k47Var.g4()) {
            if (!k47Var.I3()) {
                return false;
            }
            MediaController w = MediaController.w();
            ArrayList arrayList2 = chaVarArr[4].a;
            long j = nhaVar.f1;
            playlistTopicId = nhaVar.getPlaylistTopicId();
            return w.n0(arrayList2, k47Var, j, true, null, playlistTopicId);
        }
        boolean R = MediaController.w().R(k47Var);
        MediaController w2 = MediaController.w();
        if (R) {
            arrayList = chaVarArr[4].a;
        } else {
            arrayList = null;
        }
        w2.q0(arrayList, false);
        return R;
    }
}
