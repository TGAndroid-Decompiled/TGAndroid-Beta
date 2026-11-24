package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.gms.tasks.CancellationTokenSource;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class ct0 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final Object b;

    public ct0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wc7) obj).run();
                return;
            case 1:
                ((HttpGetFileTask) obj).cancel(true);
                return;
            case 2:
                yv1 yv1Var = (yv1) obj;
                yv1Var.t9 = true;
                yv1Var.r9 = 0;
                yv1Var.ec = 0;
                yv1Var.b5 = 0;
                yv1Var.Q7();
                yv1Var.pc(false);
                return;
            case 3:
                i22 i22Var = (i22) obj;
                zna znaVar = i22Var.m4;
                if (znaVar != null) {
                    znaVar.d();
                }
                zna znaVar2 = new zna((Object) i22Var.b, (vk4) zna.p, 0.0f);
                i22Var.m4 = znaVar2;
                znaVar2.m.a(1.5f);
                i22Var.m4.m.b(1500.0f);
                i22Var.m4.h();
                return;
            case 4:
                ((View) obj).setTag(null);
                return;
            case 5:
                ba2 ba2Var = (ba2) obj;
                ba2Var.N0 = false;
                ba2Var.b = null;
                ba2Var.O0 = false;
                return;
            case 6:
                ((ib2) obj).n = null;
                return;
            case 7:
                xp2 xp2Var = (xp2) obj;
                ConnectionsManager.getInstance(xp2Var.d).cancelRequest(xp2Var.r, true);
                xp2Var.q = null;
                xp2Var.r = 0;
                return;
            case 8:
                ((u43) obj).J = false;
                return;
            case 9:
                ((l35) obj).c("AUTH_CANCELED");
                return;
            case 10:
                ((a66) obj).b();
                return;
            case 11:
                ((CancellationTokenSource) obj).cancel();
                return;
            case 12:
                ((fo6) obj).f = true;
                return;
            default:
                ((ptc) obj).run();
                return;
        }
    }
}
