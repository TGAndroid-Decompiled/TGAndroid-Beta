package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.gms.tasks.CancellationTokenSource;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class cs0 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final Object b;

    public cs0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((bf7) obj).run();
                return;
            case 1:
                ((HttpGetFileTask) obj).cancel(true);
                return;
            case 2:
                zu1 zu1Var = (zu1) obj;
                zu1Var.t9 = true;
                zu1Var.r9 = 0;
                zu1Var.fc = 0;
                zu1Var.b5 = 0;
                zu1Var.Q7();
                zu1Var.pc(false);
                return;
            case 3:
                n12 n12Var = (n12) obj;
                vpa vpaVar = n12Var.m4;
                if (vpaVar != null) {
                    vpaVar.d();
                }
                vpa vpaVar2 = new vpa((Object) n12Var.b, (vk4) vpa.p, 0.0f);
                n12Var.m4 = vpaVar2;
                vpaVar2.m.a(1.5f);
                n12Var.m4.m.b(1500.0f);
                n12Var.m4.h();
                return;
            case 4:
                ((View) obj).setTag(null);
                return;
            case 5:
                g92 g92Var = (g92) obj;
                g92Var.N0 = false;
                g92Var.b = null;
                g92Var.O0 = false;
                return;
            case 6:
                ((na2) obj).n = null;
                return;
            case 7:
                fp2 fp2Var = (fp2) obj;
                ConnectionsManager.getInstance(fp2Var.d).cancelRequest(fp2Var.r, true);
                fp2Var.q = null;
                fp2Var.r = 0;
                return;
            case 8:
                ((b43) obj).J = false;
                return;
            case 9:
                ((p35) obj).c("AUTH_CANCELED");
                return;
            case 10:
                ((e66) obj).b();
                return;
            case 11:
                ((CancellationTokenSource) obj).cancel();
                return;
            case 12:
                ((jo6) obj).f = true;
                return;
            default:
                ((slc) obj).run();
                return;
        }
    }
}
