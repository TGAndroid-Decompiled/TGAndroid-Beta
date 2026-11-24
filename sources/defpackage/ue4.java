package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class ue4 extends eba {
    public final byte m0;
    public final n39 n0;

    public ue4(ve4 ve4Var, Context context) {
        super(1, null, context);
        this.m0 = (byte) 0;
        this.n0 = ve4Var;
    }

    @Override
    public final boolean d(k27 k27Var) {
        long playlistTopicId;
        long playlistTopicId2;
        byte b = this.m0;
        ArrayList arrayList = null;
        n39 n39Var = this.n0;
        switch (b) {
            case 0:
                af4 af4Var = ((ve4) n39Var).w;
                if (!k27.Q4(k27Var.k) && !k27Var.g4()) {
                    if (!k27Var.I3()) {
                        return false;
                    }
                    String str = af4Var.R;
                    long j = af4Var.F;
                    long j2 = af4Var.I;
                    km6 km6Var = new km6(str, j, j2, j2, af4Var.E);
                    km6Var.g = af4Var.O;
                    km6Var.h = af4Var.w;
                    km6Var.f = af4Var.P;
                    km6Var.i = af4Var.K;
                    return MediaController.w().n0(af4Var.f, k27Var, 0L, true, km6Var, 0L);
                }
                boolean R = MediaController.w().R(k27Var);
                MediaController w = MediaController.w();
                if (R) {
                    arrayList = af4Var.f;
                }
                w.q0(arrayList, false);
                return R;
            case 1:
                kea keaVar = (kea) n39Var;
                if (!k27.Q4(k27Var.k) && !k27Var.g4()) {
                    if (!k27Var.I3()) {
                        return false;
                    }
                    MediaController w2 = MediaController.w();
                    ArrayList arrayList2 = keaVar.d;
                    nfa nfaVar = keaVar.w;
                    long j3 = nfaVar.f1;
                    playlistTopicId = nfaVar.getPlaylistTopicId();
                    return w2.n0(arrayList2, k27Var, j3, true, null, playlistTopicId);
                }
                boolean R2 = MediaController.w().R(k27Var);
                MediaController w3 = MediaController.w();
                if (R2) {
                    arrayList = keaVar.d;
                }
                w3.q0(arrayList, false);
                if (k27Var.g4()) {
                    MediaController.w().j0(false);
                }
                return R2;
            default:
                afa afaVar = (afa) n39Var;
                byte b2 = afaVar.d;
                nfa nfaVar2 = afaVar.f;
                if (!k27.Q4(k27Var.k) && !k27Var.g4()) {
                    if (!k27Var.I3()) {
                        return false;
                    }
                    MediaController w4 = MediaController.w();
                    ArrayList arrayList3 = nfaVar2.w1[b2].a;
                    long j4 = nfaVar2.f1;
                    playlistTopicId2 = nfaVar2.getPlaylistTopicId();
                    return w4.n0(arrayList3, k27Var, j4, true, null, playlistTopicId2);
                }
                boolean R3 = MediaController.w().R(k27Var);
                MediaController w5 = MediaController.w();
                if (R3) {
                    arrayList = nfaVar2.w1[b2].a;
                }
                w5.q0(arrayList, false);
                return R3;
        }
    }

    public ue4(n39 n39Var, Context context, wjb wjbVar, byte b) {
        super(0, wjbVar, context);
        this.m0 = b;
        this.n0 = n39Var;
    }
}
