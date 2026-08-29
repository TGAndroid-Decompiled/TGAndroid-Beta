package bg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.zg;
public final class p0 implements li {
    public final ni f2449a;
    public final g1 f2450b;

    public p0(g1 g1Var, ni niVar) {
        this.f2450b = g1Var;
        this.f2449a = niVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ni niVar = this.f2449a;
        try {
            HashMap<Object, Object> selectedPhotos = niVar.f31005f0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                g1 g1Var = this.f2450b;
                g1Var.f0(g1Var.h0(str, true));
                niVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean T1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void x0(zg zgVar) {
        zgVar.run();
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
