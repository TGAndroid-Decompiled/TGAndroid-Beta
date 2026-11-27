package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.WallpapersListActivity;
public final class zd2 implements View.OnClickListener {
    public final byte a;
    public final oe2 b;

    public zd2(oe2 oe2Var, byte b) {
        this.a = b;
        this.b = oe2Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        oe2 oe2Var = this.b;
        switch (b) {
            case 0:
                n12 n12Var = oe2Var.R1;
                f12 f12Var = n12Var.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                in inVar = oe2Var.T1;
                if (f12Var == chatAttachAlertPhotoLayout) {
                    inVar.setText(ob6.M0(2131752103, null));
                    n12 n12Var2 = oe2Var.R1;
                    if (n12Var2.l2 == null) {
                        Context context = n12Var2.getContext();
                        vnb vnbVar = n12Var2.J0;
                        ?? f12Var2 = new f12(n12Var2, vnbVar, context);
                        f12Var2.r = hl.L(80.0f);
                        f12Var2.x = (byte) 3;
                        gu guVar = new gu(f12Var2, context, vnbVar, (byte) 7);
                        f12Var2.n = guVar;
                        ly0 ly0Var = new ly0(f12Var2, context);
                        f12Var2.w = ly0Var;
                        guVar.setAdapter(ly0Var);
                        guVar.setClipToPadding(false);
                        guVar.setItemAnimator(null);
                        guVar.setLayoutAnimation(null);
                        guVar.setVerticalScrollBarEnabled(false);
                        yob.l(guVar, 21, aob.A5, vnbVar);
                        f12Var2.addView(guVar, tre.c(-1.0f, -1));
                        guVar.setOnScrollListener(new y(f12Var2, (byte) 17));
                        ar0 ar0Var = new ar0(f12Var2, f12Var2.r, (byte) 1);
                        f12Var2.s = ar0Var;
                        ar0Var.O = new ar1(f12Var2, (byte) 1);
                        guVar.setLayoutManager(ar0Var);
                        n12Var2.l2 = f12Var2;
                        f12Var2.setDelegate(new hw(n12Var2, (byte) 4));
                    }
                    n12Var2.B1(n12Var2.l2);
                    m22 m22Var = oe2Var.R1.l2;
                    boolean z = oe2Var.G1;
                    ly0 ly0Var2 = m22Var.w;
                    ((ArrayList) ly0Var2.e).clear();
                    WallpapersListActivity.A0((ArrayList) ly0Var2.e, z);
                    ly0Var2.f();
                    return;
                }
                inVar.setText(ob6.M0(2131745265, null));
                n12 n12Var3 = oe2Var.R1;
                n12Var3.B1(n12Var3.d2);
                return;
            case 1:
                if (oe2Var.K0()) {
                    oe2Var.O0(true);
                    oe2Var.V0(true);
                    return;
                }
                oe2Var.dismiss();
                return;
            case 2:
                if (oe2Var.M1 == null) {
                    oe2Var.Q0(!oe2Var.G1);
                    return;
                }
                return;
            default:
                oe2Var.F0(false);
                return;
        }
    }
}
