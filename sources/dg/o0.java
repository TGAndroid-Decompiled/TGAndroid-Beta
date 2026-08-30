package dg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.wg;
public final class o0 implements ji {
    public final li f4687a;
    public final e1 f4688b;

    public o0(e1 e1Var, li liVar) {
        this.f4688b = e1Var;
        this.f4687a = liVar;
    }

    @Override
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar = this.f4687a;
        try {
            HashMap<Object, Object> selectedPhotos = liVar.f26702g0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                e1 e1Var = this.f4688b;
                e1Var.f0(e1Var.h0(str, true));
                liVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean V() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void x(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void C() {
    }

    @Override
    public final void D(Object obj) {
    }

    @Override
    public final void G(TLRPC.User user) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
