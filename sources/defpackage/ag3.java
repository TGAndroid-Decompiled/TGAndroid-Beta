package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.Components.UndoView;
public final class ag3 implements aba, d39, e39, qe4, ed, mw4, no7, nw4, s29 {
    public final byte a;
    public final cj3 b;

    public ag3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        UndoView[] undoViewArr;
        cj3 cj3Var = this.b;
        cj3Var.w.j(vxcVar);
        io5 H0 = gl.H0(vxcVar, false);
        cj3Var.j4 = H0.b;
        cj3Var.k4 = H0.d;
        int i = vxcVar.a.f(8).d;
        if (cj3Var.l4 != i) {
            cj3Var.l4 = i;
            cj3Var.fragmentView.requestLayout();
        }
        cj3Var.G0.setPadding(0, cj3Var.j4, 0, 0);
        cj3Var.q5();
        for (UndoView undoView : cj3Var.z0) {
            if (undoView != null) {
                int i2 = cj3Var.k4 + cj3Var.m4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i2) {
                    marginLayoutParams.bottomMargin = i2;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        rh3 rh3Var = cj3Var.H3;
        if (rh3Var != null) {
            jdc.b(rh3Var, vxcVar);
        }
        return vxc.b;
    }

    @Override
    public final boolean d(int i, View view) {
        this.b.K3(i);
        return false;
    }

    @Override
    public final void e(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag3.e(float, float, int, android.view.View):void");
    }

    @Override
    public final void f() {
        cj3 cj3Var = this.b;
        cj3Var.R = true;
        cj3Var.fragmentView.invalidate();
    }

    public final void g(int i) {
        hh3 hh3Var = this.b.D1;
        if (hh3Var == null) {
            return;
        }
        if (i == 0) {
            hh3Var.N0(true);
        } else {
            hh3Var.b2(true, false);
        }
    }

    public final void h(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        this.b.p5(z, arrayList, arrayList2, z2, true);
    }

    @Override
    public final int i() {
        return this.b.getThemedColor(bkb.c6);
    }

    @Override
    public final void j(int i) {
        this.b.B3(i);
    }

    @Override
    public final void l(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final boolean q(View view) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 6:
                cj3Var.d4();
                return;
            case 7:
                cj3Var.getMessagesController().e2();
                cj3Var.y3(false);
                return;
            case 8:
            case 9:
            default:
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                try {
                    cj3Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 10:
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", a.b.getPackageName());
                try {
                    try {
                        cj3Var.getParentActivity().startActivity(intent2);
                        return;
                    } catch (Exception unused) {
                        Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                        cj3Var.getParentActivity().startActivity(intent3);
                        return;
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }

    private final void a(View view, float f, float f2) {
    }

    private final void b(View view, float f, float f2) {
    }

    private final void c(View view, float f, float f2) {
    }
}
