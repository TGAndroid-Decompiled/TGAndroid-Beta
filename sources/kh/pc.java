package kh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class pc implements DialogInterface.OnCancelListener {
    public final int f15849a;
    public final Object f15850b;

    public pc(Object obj, int i9) {
        this.f15849a = i9;
        this.f15850b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f15849a) {
            case 0:
                ((o8) this.f15850b).run();
                return;
            case 1:
                ((d5.i) this.f15850b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f15850b).cancel(true);
                return;
            case 3:
                nh.q0 q0Var = (nh.q0) this.f15850b;
                ConnectionsManager.getInstance(q0Var.d).cancelRequest(q0Var.f18713r, true);
                q0Var.f18712q = null;
                q0Var.f18713r = 0;
                return;
            default:
                ((tf.n) this.f15850b).E = false;
                return;
        }
    }
}
