package gi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class ob implements DialogInterface.OnCancelListener {
    public final int f13352a;
    public final Object f13353b;

    public ob(Object obj, int i3) {
        this.f13352a = i3;
        this.f13353b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f13352a) {
            case 0:
                ((g2.c) this.f13353b).run();
                return;
            case 1:
                ((ai.e3) this.f13353b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f13353b).cancel(true);
                return;
            case 3:
                ji.i0 i0Var = (ji.i0) this.f13353b;
                ConnectionsManager.getInstance(i0Var.d).cancelRequest(i0Var.f16328r, true);
                i0Var.f16327q = null;
                i0Var.f16328r = 0;
                return;
            default:
                ((pg.m) this.f13353b).J = false;
                return;
        }
    }
}
