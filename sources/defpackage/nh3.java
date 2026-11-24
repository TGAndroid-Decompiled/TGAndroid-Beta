package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.Components.UndoView;
public final class nh3 implements ada, g59, h59, sg4, ee, oy4, qq7, py4, v49 {
    public final byte a;
    public final nk3 b;

    public nh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        UndoView[] undoViewArr;
        nk3 nk3Var = this.b;
        nk3Var.w.j(wzcVar);
        iq5 H0 = gm.H0(wzcVar, false);
        nk3Var.l4 = H0.b;
        nk3Var.m4 = H0.d;
        int i = wzcVar.a.f(8).d;
        if (nk3Var.n4 != i) {
            nk3Var.n4 = i;
            nk3Var.fragmentView.requestLayout();
        }
        nk3Var.G0.setPadding(0, nk3Var.l4, 0, 0);
        nk3Var.u5();
        for (UndoView undoView : nk3Var.z0) {
            if (undoView != null) {
                int i2 = nk3Var.m4 + nk3Var.o4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i2) {
                    marginLayoutParams.bottomMargin = i2;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        dj3 dj3Var = nk3Var.H3;
        if (dj3Var != null) {
            kfc.b(dj3Var, wzcVar);
        }
        return wzc.b;
    }

    @Override
    public final void d(float r5, float r6, int r7, android.view.View r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh3.d(float, float, int, android.view.View):void");
    }

    @Override
    public final void e() {
        nk3 nk3Var = this.b;
        nk3Var.R = true;
        nk3Var.fragmentView.invalidate();
    }

    public final void f(int i) {
        ti3 ti3Var = this.b.D1;
        if (ti3Var == null) {
            return;
        }
        if (i == 0) {
            ti3Var.N0(true);
        } else {
            ti3Var.e2(true, false);
        }
    }

    @Override
    public final boolean g(int i, View view) {
        this.b.N3(i);
        return false;
    }

    public final void h(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        this.b.t5(z, arrayList, arrayList2, z2, true);
    }

    @Override
    public final int i() {
        return this.b.getThemedColor(cmb.c6);
    }

    @Override
    public final void p(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 6:
                nk3Var.g4();
                return;
            case 7:
                nk3Var.getMessagesController().f2();
                nk3Var.A3(false);
                return;
            case 8:
            case 9:
            default:
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                try {
                    nk3Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 10:
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", a.b.getPackageName());
                try {
                    try {
                        nk3Var.getParentActivity().startActivity(intent2);
                        return;
                    } catch (Exception unused) {
                        Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                        nk3Var.getParentActivity().startActivity(intent3);
                        return;
                    }
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }

    @Override
    public final void s(int i) {
        this.b.D3(i);
    }

    @Override
    public final boolean u(View view) {
        byte b = this.a;
        return false;
    }

    private final void a(View view, float f, float f2) {
    }

    private final void b(View view, float f, float f2) {
    }

    private final void c(View view, float f, float f2) {
    }
}
