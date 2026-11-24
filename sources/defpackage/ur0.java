package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.gms.tasks.CancellationTokenSource;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class ur0 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final Object b;

    public ur0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((va7) obj).run();
                return;
            case 1:
                ((HttpGetFileTask) obj).cancel(true);
                return;
            case 2:
                mu1 mu1Var = (mu1) obj;
                mu1Var.t9 = true;
                mu1Var.r9 = 0;
                mu1Var.Ub = 0;
                mu1Var.b5 = 0;
                mu1Var.G7();
                mu1Var.bc(false);
                return;
            case 3:
                x02 x02Var = (x02) obj;
                yla ylaVar = x02Var.m4;
                if (ylaVar != null) {
                    ylaVar.d();
                }
                yla ylaVar2 = new yla((Object) x02Var.b, (ri4) yla.p, 0.0f);
                x02Var.m4 = ylaVar2;
                ylaVar2.m.a(1.5f);
                x02Var.m4.m.b(1500.0f);
                x02Var.m4.h();
                return;
            case 4:
                ((View) obj).setTag(null);
                return;
            case 5:
                p82 p82Var = (p82) obj;
                p82Var.N0 = false;
                p82Var.b = null;
                p82Var.O0 = false;
                return;
            case 6:
                ((x92) obj).n = null;
                return;
            case 7:
                mo2 mo2Var = (mo2) obj;
                ConnectionsManager.getInstance(mo2Var.d).cancelRequest(mo2Var.r, true);
                mo2Var.q = null;
                mo2Var.r = 0;
                return;
            case 8:
                ((j33) obj).J = false;
                return;
            case 9:
                ((l15) obj).c("AUTH_CANCELED");
                return;
            case 10:
                ((a46) obj).b();
                return;
            case 11:
                ((CancellationTokenSource) obj).cancel();
                return;
            case 12:
                ((em6) obj).f = true;
                return;
            default:
                ((mhc) obj).run();
                return;
        }
    }
}
