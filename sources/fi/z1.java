package fi;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l41;
import org.telegram.ui.m41;
import org.telegram.ui.vs;
public final class z1 implements View.OnLongClickListener {
    public final int f12796a;
    public final Object f12797b;
    public final Object f12798c;

    public z1(int i7, Object obj, Object obj2) {
        this.f12796a = i7;
        this.f12797b = obj;
        this.f12798c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f12796a;
        Object obj = this.f12798c;
        Object obj2 = this.f12797b;
        switch (i7) {
            case 0:
                z3 z3Var = (z3) obj2;
                f9 f9Var = (f9) obj;
                r1 r1Var = z3Var.j3;
                if (r1Var != null) {
                    org.telegram.messenger.g0.r(r1Var);
                    z3Var.j3 = null;
                }
                cz.H(true);
                hi.l3 l3Var = z3Var.f12859r0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                xi0 xi0Var = z3Var.f12807b3;
                if (xi0Var == null) {
                    xi0 xi0Var2 = new xi0(2, z3Var.f12842m2, z3Var.getContext(), LaunchActivity.Q(), new g2(4, z3Var.f12838l0));
                    z3Var.f12807b3 = xi0Var2;
                    xi0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    z3Var.addView(z3Var.f12807b3, z3Var.getChildCount() - 1, na.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    z3Var.f12807b3.setVisibility(8);
                    z3Var.f12807b3.setDelegate(new b3(z3Var));
                    z3Var.f12807b3.p(null, null, true);
                } else {
                    z3Var.bringChildToFront(xi0Var);
                    z3Var.f12807b3.n();
                }
                z3Var.f12807b3.setFragment(LaunchActivity.Q());
                f9Var.f11987s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                z3Var.Z0(true);
                return true;
            case 1:
                org.telegram.ui.Components.l0 l0Var = (org.telegram.ui.Components.l0) obj;
                hi.r4 r4Var = ((org.telegram.ui.Components.m0) obj2).f37325w;
                if (r4Var == null) {
                    return false;
                }
                return ((Boolean) r4Var.a(l0Var)).booleanValue();
            case 2:
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) obj2;
                float f10 = MediaController.B().f22726r0;
                org.telegram.ui.ActionBar.u0 u0Var = f8Var.R1;
                u0Var.e(false, f10);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, u0Var, (org.telegram.ui.ActionBar.h6) obj);
                f8Var.b1(false);
                org.telegram.ui.ActionBar.q0 q0Var = f8Var.P1;
                q0Var.setDimMenu(0.15f);
                q0Var.V(u0Var, null);
                np.h1().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                a70 a70Var = (a70) obj2;
                ((vs) obj).run();
                if (a70Var.J) {
                    a70Var.v();
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                b bVar = (b) obj;
                gj gjVar = photoViewer.T4;
                if (gjVar == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(gjVar.T0)) {
                    new lc(cb.a(photoViewer.F), bVar).k(false).j();
                }
                return true;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.Z6;
                org.telegram.ui.ActionBar.g1 b10 = org.telegram.ui.Components.i9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f43565g1, profileActivity.A0);
                if (b10 == null) {
                    return false;
                }
                b10.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        int i10 = r2;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i10) {
                            case 0:
                                RectF rectF2 = ProfileActivity.Z6;
                                profileActivity2.X3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.Z6;
                                profileActivity2.X3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity.f43681x0 = imageView;
                profileActivity.X3(0.3f);
                UndoView undoView = profileActivity.M;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                return true;
            case 6:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.ui.ActionBar.g1 b11 = org.telegram.ui.Components.i9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f43565g1, profileActivity2.A0);
                if (b11 == null) {
                    return false;
                }
                b11.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        int i10 = r2;
                        ProfileActivity profileActivity22 = profileActivity2;
                        switch (i10) {
                            case 0:
                                RectF rectF22 = ProfileActivity.Z6;
                                profileActivity22.X3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.Z6;
                                profileActivity22.X3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity2.f43681x0 = view2;
                profileActivity2.X3(0.3f);
                UndoView undoView2 = profileActivity2.M;
                if (undoView2 != null) {
                    undoView2.d(1, true);
                }
                return true;
            default:
                l41 l41Var = (l41) obj2;
                ng.f fVar = (ng.f) obj;
                m41 m41Var = l41Var.d;
                xz xzVar = l41Var.f49453a;
                if (!xzVar.f42242c) {
                    return false;
                }
                m41Var.f();
                ArrayList arrayList = m41Var.f49732n;
                lg.g gVar = m41Var.f49729c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((l41) arrayList.get(i10)).f49453a.setChecked(false);
                    ((l41) arrayList.get(i10)).f49454b.f21507n = false;
                    if (m41Var.f49733r.f50463c > 0 && i10 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i10)).f21507n = false;
                    }
                }
                xzVar.setChecked(true);
                fVar.f21507n = true;
                m41Var.f49728b.z();
                if (m41Var.f49733r.f50463c > 0) {
                    ((ng.f) gVar.d.get(l41Var.f49455c)).f21507n = true;
                    gVar.z();
                }
                return true;
        }
    }
}
