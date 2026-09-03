package eg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.wg;
public final class m0 implements ki {
    public final mi f5345a;
    public final c1 f5346b;

    public m0(c1 c1Var, mi miVar) {
        this.f5346b = c1Var;
        this.f5345a = miVar;
    }

    @Override
    public final void B0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        mi miVar = this.f5345a;
        try {
            HashMap<Object, Object> selectedPhotos = miVar.f29072g0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                c1 c1Var = this.f5346b;
                c1Var.f0(c1Var.h0(str, true));
                miVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean b2() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final boolean h0() {
        return false;
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void Z0(Object obj) {
    }

    @Override
    public final void o1(TLRPC.User user) {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
