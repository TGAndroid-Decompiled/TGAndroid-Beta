package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class sg4 extends vea {
    public final byte m0;
    public final c79 n0;

    public sg4(tg4 tg4Var, Context context) {
        super(1, null, context);
        this.m0 = (byte) 0;
        this.n0 = tg4Var;
    }

    @Override
    public final boolean d(r47 r47Var) {
        long playlistTopicId;
        long playlistTopicId2;
        byte b = this.m0;
        ArrayList arrayList = null;
        c79 c79Var = this.n0;
        switch (b) {
            case 0:
                yg4 yg4Var = ((tg4) c79Var).w;
                if (!r47.Q4(r47Var.k) && !r47Var.g4()) {
                    if (!r47Var.I3()) {
                        return false;
                    }
                    String str = yg4Var.R;
                    long j = yg4Var.F;
                    long j2 = yg4Var.I;
                    oo6 oo6Var = new oo6(str, j, j2, j2, yg4Var.E);
                    oo6Var.g = yg4Var.O;
                    oo6Var.h = yg4Var.w;
                    oo6Var.f = yg4Var.P;
                    oo6Var.i = yg4Var.K;
                    return MediaController.z().q0(yg4Var.f, r47Var, 0L, true, oo6Var, 0L);
                }
                boolean V = MediaController.z().V(r47Var);
                MediaController z = MediaController.z();
                if (V) {
                    arrayList = yg4Var.f;
                }
                z.u0(arrayList, false);
                return V;
            case 1:
                bia biaVar = (bia) c79Var;
                if (!r47.Q4(r47Var.k) && !r47Var.g4()) {
                    if (!r47Var.I3()) {
                        return false;
                    }
                    MediaController z2 = MediaController.z();
                    ArrayList arrayList2 = biaVar.d;
                    eja ejaVar = biaVar.w;
                    long j3 = ejaVar.f1;
                    playlistTopicId = ejaVar.getPlaylistTopicId();
                    return z2.q0(arrayList2, r47Var, j3, true, null, playlistTopicId);
                }
                boolean V2 = MediaController.z().V(r47Var);
                MediaController z3 = MediaController.z();
                if (V2) {
                    arrayList = biaVar.d;
                }
                z3.u0(arrayList, false);
                if (r47Var.g4()) {
                    MediaController.z().m0(false);
                }
                return V2;
            default:
                ria riaVar = (ria) c79Var;
                byte b2 = riaVar.d;
                eja ejaVar2 = riaVar.f;
                if (!r47.Q4(r47Var.k) && !r47Var.g4()) {
                    if (!r47Var.I3()) {
                        return false;
                    }
                    MediaController z4 = MediaController.z();
                    ArrayList arrayList3 = ejaVar2.w1[b2].a;
                    long j4 = ejaVar2.f1;
                    playlistTopicId2 = ejaVar2.getPlaylistTopicId();
                    return z4.q0(arrayList3, r47Var, j4, true, null, playlistTopicId2);
                }
                boolean V3 = MediaController.z().V(r47Var);
                MediaController z5 = MediaController.z();
                if (V3) {
                    arrayList = ejaVar2.w1[b2].a;
                }
                z5.u0(arrayList, false);
                return V3;
        }
    }

    public sg4(c79 c79Var, Context context, vnb vnbVar, byte b) {
        super(0, vnbVar, context);
        this.m0 = b;
        this.n0 = c79Var;
    }
}
