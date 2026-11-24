package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.WallpapersListActivity;
public final class hd2 implements View.OnClickListener {
    public final byte a;
    public final xd2 b;

    public hd2(xd2 xd2Var, byte b) {
        this.a = b;
        this.b = xd2Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        xd2 xd2Var = this.b;
        switch (b) {
            case 0:
                x02 x02Var = xd2Var.R1;
                p02 p02Var = x02Var.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
                hn hnVar = xd2Var.T1;
                if (p02Var == chatAttachAlertPhotoLayout) {
                    hnVar.setText(k96.M0(2131752126, null));
                    x02 x02Var2 = xd2Var.R1;
                    if (x02Var2.l2 == null) {
                        Context context = x02Var2.getContext();
                        wjb wjbVar = x02Var2.J0;
                        ?? p02Var2 = new p02(x02Var2, wjbVar, context);
                        p02Var2.r = gl.L(80.0f);
                        p02Var2.x = (byte) 3;
                        fu fuVar = new fu(p02Var2, context, wjbVar, (byte) 7);
                        p02Var2.n = fuVar;
                        dy0 dy0Var = new dy0(p02Var2, context);
                        p02Var2.w = dy0Var;
                        fuVar.setAdapter(dy0Var);
                        fuVar.setClipToPadding(false);
                        fuVar.setItemAnimator(null);
                        fuVar.setLayoutAnimation(null);
                        fuVar.setVerticalScrollBarEnabled(false);
                        zkb.l(fuVar, 21, bkb.z5, wjbVar);
                        p02Var2.addView(fuVar, nme.c(-1.0f, -1));
                        fuVar.setOnScrollListener(new y(p02Var2, (byte) 17));
                        ar0 ar0Var = new ar0(p02Var2, p02Var2.r, (byte) 1);
                        p02Var2.s = ar0Var;
                        ar0Var.O = new nq1(p02Var2, (byte) 1);
                        fuVar.setLayoutManager(ar0Var);
                        x02Var2.l2 = p02Var2;
                        p02Var2.setDelegate(new gw(x02Var2, (byte) 4));
                    }
                    x02Var2.A1(x02Var2.l2);
                    v12 v12Var = xd2Var.R1.l2;
                    boolean z = xd2Var.G1;
                    dy0 dy0Var2 = v12Var.w;
                    ((ArrayList) dy0Var2.e).clear();
                    WallpapersListActivity.z0((ArrayList) dy0Var2.e, z);
                    dy0Var2.f();
                    return;
                }
                hnVar.setText(k96.M0(2131745345, null));
                x02 x02Var3 = xd2Var.R1;
                x02Var3.A1(x02Var3.d2);
                return;
            case 1:
                if (xd2Var.J0()) {
                    xd2Var.N0(true);
                    xd2Var.U0(true);
                    return;
                }
                xd2Var.dismiss();
                return;
            case 2:
                if (xd2Var.M1 == null) {
                    xd2Var.P0(!xd2Var.G1);
                    return;
                }
                return;
            default:
                xd2Var.E0(false);
                return;
        }
    }
}
