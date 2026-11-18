package fi;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l41;
import org.telegram.ui.m41;
import org.telegram.ui.vs;
public final class z1 implements View.OnLongClickListener {
    public final int f12804a;
    public final Object f12805b;
    public final Object f12806c;

    public z1(int i7, Object obj, Object obj2) {
        this.f12804a = i7;
        this.f12805b = obj;
        this.f12806c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f12804a;
        Object obj = this.f12806c;
        Object obj2 = this.f12805b;
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
                hi.m3 m3Var = z3Var.f12867r0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                vi0 vi0Var = z3Var.f12815b3;
                if (vi0Var == null) {
                    vi0 vi0Var2 = new vi0(2, z3Var.f12850m2, z3Var.getContext(), LaunchActivity.Q(), new g2(4, z3Var.f12846l0));
                    z3Var.f12815b3 = vi0Var2;
                    vi0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    z3Var.addView(z3Var.f12815b3, z3Var.getChildCount() - 1, ma.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    z3Var.f12815b3.setVisibility(8);
                    z3Var.f12815b3.setDelegate(new b3(z3Var));
                    z3Var.f12815b3.p(null, null, true);
                } else {
                    z3Var.bringChildToFront(vi0Var);
                    z3Var.f12815b3.n();
                }
                z3Var.f12815b3.setFragment(LaunchActivity.Q());
                f9Var.f11995s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                z3Var.Z0(true);
                return true;
            case 1:
                org.telegram.ui.Components.k0 k0Var = (org.telegram.ui.Components.k0) obj;
                hi.q4 q4Var = ((org.telegram.ui.Components.l0) obj2).f36943w;
                if (q4Var == null) {
                    return false;
                }
                return ((Boolean) q4Var.a(k0Var)).booleanValue();
            case 2:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) obj2;
                float f10 = MediaController.B().f22734r0;
                org.telegram.ui.ActionBar.v0 v0Var = g8Var.R1;
                v0Var.e(false, f10);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, v0Var, (org.telegram.ui.ActionBar.i6) obj);
                g8Var.b1(false);
                org.telegram.ui.ActionBar.r0 r0Var = g8Var.P1;
                r0Var.setDimMenu(0.15f);
                r0Var.V(v0Var, null);
                mp.h1().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                y60 y60Var = (y60) obj2;
                ((vs) obj).run();
                if (y60Var.J) {
                    y60Var.v();
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
                    new lc(cb.a(photoViewer.F), bVar).k(false).j();
                }
                return true;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.Z6;
                org.telegram.ui.ActionBar.h1 b10 = org.telegram.ui.Components.i9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f43555g1, profileActivity.A0);
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
                profileActivity.f43671x0 = imageView;
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
                org.telegram.ui.ActionBar.h1 b11 = org.telegram.ui.Components.i9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f43555g1, profileActivity2.A0);
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
                profileActivity2.f43671x0 = view2;
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
                vz vzVar = l41Var.f49427a;
                if (!vzVar.f41500c) {
                    return false;
                }
                m41Var.f();
                ArrayList arrayList = m41Var.f49752n;
                lg.g gVar = m41Var.f49749c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((l41) arrayList.get(i10)).f49427a.setChecked(false);
                    ((l41) arrayList.get(i10)).f49428b.f21513n = false;
                    if (m41Var.f49753r.f50465c > 0 && i10 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i10)).f21513n = false;
                    }
                }
                vzVar.setChecked(true);
                fVar.f21513n = true;
                m41Var.f49748b.z();
                if (m41Var.f49753r.f50465c > 0) {
                    ((ng.f) gVar.d.get(l41Var.f49429c)).f21513n = true;
                    gVar.z();
                }
                return true;
        }
    }
}
