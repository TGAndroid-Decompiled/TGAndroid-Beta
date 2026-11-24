package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.WallpapersListActivity;
public final class se2 implements View.OnClickListener {
    public final byte a;
    public final if2 b;

    public se2(if2 if2Var, byte b) {
        this.a = b;
        this.b = if2Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        if2 if2Var = this.b;
        switch (b) {
            case 0:
                i22 i22Var = if2Var.R1;
                a22 a22Var = i22Var.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
                io ioVar = if2Var.T1;
                if (a22Var == chatAttachAlertPhotoLayout) {
                    ioVar.setText(jb6.M0(2131752075, null));
                    i22 i22Var2 = if2Var.R1;
                    if (i22Var2.l2 == null) {
                        Context context = i22Var2.getContext();
                        ylb ylbVar = i22Var2.J0;
                        ?? a22Var2 = new a22(i22Var2, ylbVar, context);
                        a22Var2.r = gm.L(80.0f);
                        a22Var2.x = (byte) 3;
                        fv fvVar = new fv(a22Var2, context, ylbVar, (byte) 7);
                        a22Var2.n = fvVar;
                        kz0 kz0Var = new kz0(a22Var2, context);
                        a22Var2.w = kz0Var;
                        fvVar.setAdapter(kz0Var);
                        fvVar.setClipToPadding(false);
                        fvVar.setItemAnimator(null);
                        fvVar.setLayoutAnimation(null);
                        fvVar.setVerticalScrollBarEnabled(false);
                        anb.l(fvVar, 21, cmb.z5, ylbVar);
                        a22Var2.addView(fvVar, qoe.c(-1.0f, -1));
                        fvVar.setOnScrollListener(new y(a22Var2, (byte) 18));
                        as0 as0Var = new as0(a22Var2, a22Var2.r, (byte) 1);
                        a22Var2.s = as0Var;
                        as0Var.O = new zr1(a22Var2, (byte) 1);
                        fvVar.setLayoutManager(as0Var);
                        i22Var2.l2 = a22Var2;
                        a22Var2.setDelegate(new gx(i22Var2, (byte) 4));
                    }
                    i22Var2.A1(i22Var2.l2);
                    h32 h32Var = if2Var.R1.l2;
                    boolean z = if2Var.G1;
                    kz0 kz0Var2 = h32Var.w;
                    ((ArrayList) kz0Var2.e).clear();
                    WallpapersListActivity.A0((ArrayList) kz0Var2.e, z);
                    kz0Var2.f();
                    return;
                }
                ioVar.setText(jb6.M0(2131745271, null));
                i22 i22Var3 = if2Var.R1;
                i22Var3.A1(i22Var3.d2);
                return;
            case 1:
                if (if2Var.J0()) {
                    if2Var.N0(true);
                    if2Var.U0(true);
                    return;
                }
                if2Var.dismiss();
                return;
            case 2:
                if (if2Var.M1 == null) {
                    if2Var.P0(!if2Var.G1);
                    return;
                }
                return;
            default:
                if2Var.E0(false);
                return;
        }
    }
}
