package fi;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k41;
import org.telegram.ui.l41;
public final class z1 implements View.OnLongClickListener {
    public final int f12807a;
    public final Object f12808b;
    public final Object f12809c;

    public z1(int i7, Object obj, Object obj2) {
        this.f12807a = i7;
        this.f12808b = obj;
        this.f12809c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f12807a;
        Object obj = this.f12809c;
        Object obj2 = this.f12808b;
        switch (i7) {
            case 0:
                z3 z3Var = (z3) obj2;
                f9 f9Var = (f9) obj;
                r1 r1Var = z3Var.j3;
                if (r1Var != null) {
                    org.telegram.messenger.g0.r(r1Var);
                    z3Var.j3 = null;
                }
                bz.H(true);
                hi.u3 u3Var = z3Var.f12870r0;
                if (u3Var != null) {
                    u3Var.f(true);
                }
                xi0 xi0Var = z3Var.f12818b3;
                if (xi0Var == null) {
                    xi0 xi0Var2 = new xi0(2, z3Var.f12853m2, z3Var.getContext(), LaunchActivity.Q(), new g2(4, z3Var.f12849l0));
                    z3Var.f12818b3 = xi0Var2;
                    xi0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    z3Var.addView(z3Var.f12818b3, z3Var.getChildCount() - 1, na.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    z3Var.f12818b3.setVisibility(8);
                    z3Var.f12818b3.setDelegate(new b3(z3Var));
                    z3Var.f12818b3.p(null, null, true);
                } else {
                    z3Var.bringChildToFront(xi0Var);
                    z3Var.f12818b3.n();
                }
                z3Var.f12818b3.setFragment(LaunchActivity.Q());
                f9Var.f11998s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                z3Var.Z0(true);
                return true;
            case 1:
                org.telegram.ui.Components.k0 k0Var = (org.telegram.ui.Components.k0) obj;
                hi.b5 b5Var = ((org.telegram.ui.Components.l0) obj2).f36964w;
                if (b5Var == null) {
                    return false;
                }
                return ((Boolean) b5Var.a(k0Var)).booleanValue();
            case 2:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) obj2;
                float f10 = MediaController.B().f22829r0;
                org.telegram.ui.ActionBar.u0 u0Var = e8Var.R1;
                u0Var.e(false, f10);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, u0Var, (org.telegram.ui.ActionBar.i6) obj);
                e8Var.b1(false);
                org.telegram.ui.ActionBar.q0 q0Var = e8Var.P1;
                q0Var.setDimMenu(0.15f);
                q0Var.V(u0Var, null);
                mp.h1().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                x60 x60Var = (x60) obj2;
                ((org.telegram.ui.Components.voip.o) obj).run();
                if (x60Var.J) {
                    x60Var.v();
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                b bVar = (b) obj;
                fj fjVar = photoViewer.T4;
                if (fjVar == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(fjVar.T0)) {
                    new kc(bb.a(photoViewer.F), bVar).k(false).j();
                }
                return true;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.Z6;
                org.telegram.ui.ActionBar.g1 b10 = org.telegram.ui.Components.h9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f43681g1, profileActivity.A0);
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
                profileActivity.f43797x0 = imageView;
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
                org.telegram.ui.ActionBar.g1 b11 = org.telegram.ui.Components.h9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f43681g1, profileActivity2.A0);
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
                profileActivity2.f43797x0 = view2;
                profileActivity2.X3(0.3f);
                UndoView undoView2 = profileActivity2.M;
                if (undoView2 != null) {
                    undoView2.d(1, true);
                }
                return true;
            default:
                k41 k41Var = (k41) obj2;
                ng.f fVar = (ng.f) obj;
                l41 l41Var = k41Var.d;
                uz uzVar = k41Var.f49314a;
                if (!uzVar.f40506c) {
                    return false;
                }
                l41Var.f();
                ArrayList arrayList = l41Var.f49589n;
                lg.g gVar = l41Var.f49586c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((k41) arrayList.get(i10)).f49314a.setChecked(false);
                    ((k41) arrayList.get(i10)).f49315b.f21606n = false;
                    if (l41Var.f49590r.f50210c > 0 && i10 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i10)).f21606n = false;
                    }
                }
                uzVar.setChecked(true);
                fVar.f21606n = true;
                l41Var.f49585b.z();
                if (l41Var.f49590r.f50210c > 0) {
                    ((ng.f) gVar.d.get(k41Var.f49316c)).f21606n = true;
                    gVar.z();
                }
                return true;
        }
    }
}
