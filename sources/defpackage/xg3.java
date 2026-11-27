package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.Components.UndoView;
public final class xg3 implements s69, t69, og4, fd, ry4, nr7, sy4, rea, h69 {
    public final byte a;
    public final uj3 b;

    public xg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override
    public final boolean C(View view) {
        byte b = this.a;
        return false;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        UndoView[] undoViewArr;
        uj3 uj3Var = this.b;
        uj3Var.w.j(l2dVar);
        mq5 H0 = hl.H0(l2dVar, false);
        uj3Var.l4 = H0.b;
        uj3Var.m4 = H0.d;
        int i = l2dVar.a.f(8).d;
        if (uj3Var.n4 != i) {
            uj3Var.n4 = i;
            uj3Var.fragmentView.requestLayout();
        }
        uj3Var.G0.setPadding(0, uj3Var.l4, 0, 0);
        uj3Var.u5();
        for (UndoView undoView : uj3Var.z0) {
            if (undoView != null) {
                int i2 = uj3Var.m4 + uj3Var.o4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i2) {
                    marginLayoutParams.bottomMargin = i2;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        li3 li3Var = uj3Var.H3;
        if (li3Var != null) {
            ihc.b(li3Var, l2dVar);
        }
        return l2d.b;
    }

    @Override
    public final void d(float r5, float r6, int r7, android.view.View r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg3.d(float, float, int, android.view.View):void");
    }

    @Override
    public final boolean e(int i, View view) {
        this.b.N3(i);
        return false;
    }

    @Override
    public final void f() {
        uj3 uj3Var = this.b;
        uj3Var.R = true;
        uj3Var.fragmentView.invalidate();
    }

    public final void g(int i) {
        bi3 bi3Var = this.b.D1;
        if (bi3Var == null) {
            return;
        }
        if (i == 0) {
            bi3Var.R0(true);
        } else {
            bi3Var.n2(true, false);
        }
    }

    @Override
    public final int h() {
        return this.b.getThemedColor(aob.d6);
    }

    public final void i(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        this.b.t5(z, arrayList, arrayList2, z2, true);
    }

    @Override
    public final void k(int i) {
        this.b.D3(i);
    }

    @Override
    public final void u(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 5:
                uj3Var.g4();
                return;
            case 6:
            case 7:
            default:
                uj3Var.getMessagesController().g2();
                uj3Var.A3(false);
                return;
            case 8:
                Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent.setPackage("com.miui.securitycenter");
                intent.putExtra("extra_package_uid", Process.myUid());
                intent.putExtra("extra_pkgname", a.b.getPackageName());
                try {
                    try {
                        uj3Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception unused) {
                        Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent2.setData(Uri.parse("package:" + a.b.getPackageName()));
                        uj3Var.getParentActivity().startActivity(intent2);
                        return;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 9:
                Intent intent3 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                try {
                    uj3Var.getParentActivity().startActivity(intent3);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
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
