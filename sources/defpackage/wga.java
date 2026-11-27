package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class wga extends vea {
    public final eja m0;

    public wga(eja ejaVar, Context context) {
        super(context);
        this.m0 = ejaVar;
    }

    @Override
    public final boolean d(r47 r47Var) {
        ArrayList arrayList;
        long playlistTopicId;
        eja ejaVar = this.m0;
        tia[] tiaVarArr = ejaVar.w1;
        if (!r47.Q4(r47Var.k) && !r47Var.g4()) {
            if (!r47Var.I3()) {
                return false;
            }
            MediaController z = MediaController.z();
            ArrayList arrayList2 = tiaVarArr[4].a;
            long j = ejaVar.f1;
            playlistTopicId = ejaVar.getPlaylistTopicId();
            return z.q0(arrayList2, r47Var, j, true, null, playlistTopicId);
        }
        boolean V = MediaController.z().V(r47Var);
        MediaController z2 = MediaController.z();
        if (V) {
            arrayList = tiaVarArr[4].a;
        } else {
            arrayList = null;
        }
        z2.u0(arrayList, false);
        return V;
    }
}
