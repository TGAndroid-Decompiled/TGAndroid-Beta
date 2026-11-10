package di;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.wa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m41;
import org.telegram.ui.n41;
public final class f2 implements View.OnLongClickListener {
    public final int f8987a;
    public final Object f8988b;
    public final Object f8989c;

    public f2(int i7, Object obj, Object obj2) {
        this.f8987a = i7;
        this.f8988b = obj;
        this.f8989c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f8987a;
        Object obj = this.f8989c;
        Object obj2 = this.f8988b;
        switch (i7) {
            case 0:
                j4 j4Var = (j4) obj2;
                q9 q9Var = (q9) obj;
                w1 w1Var = j4Var.f9196i3;
                if (w1Var != null) {
                    org.telegram.messenger.g0.r(w1Var);
                    j4Var.f9196i3 = null;
                }
                iz.H(true);
                fi.m3 m3Var = j4Var.f9221q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                ii0 ii0Var = j4Var.f9169a3;
                if (ii0Var == null) {
                    ii0 ii0Var2 = new ii0(2, j4Var.f9205l2, j4Var.getContext(), LaunchActivity.Q(), new m2(4, j4Var.f9200k0));
                    j4Var.f9169a3 = ii0Var2;
                    ii0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    j4Var.addView(j4Var.f9169a3, j4Var.getChildCount() - 1, ha.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    j4Var.f9169a3.setVisibility(8);
                    j4Var.f9169a3.setDelegate(new i3(j4Var));
                    j4Var.f9169a3.p(null, null, true);
                } else {
                    j4Var.bringChildToFront(ii0Var);
                    j4Var.f9169a3.n();
                }
                j4Var.f9169a3.setFragment(LaunchActivity.Q());
                q9Var.f9639s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                j4Var.Z0(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) obj;
                fi.u4 u4Var = ((org.telegram.ui.Components.e0) obj2).f33117n;
                if (u4Var == null) {
                    return false;
                }
                return ((Boolean) u4Var.a(d0Var)).booleanValue();
            case 2:
                org.telegram.ui.Components.a8 a8Var = (org.telegram.ui.Components.a8) obj2;
                float f10 = MediaController.B().f21290q0;
                org.telegram.ui.ActionBar.v0 v0Var = a8Var.Q1;
                v0Var.e(false, f10);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, v0Var, (org.telegram.ui.ActionBar.h6) obj);
                a8Var.a1(false);
                org.telegram.ui.ActionBar.r0 r0Var = a8Var.O1;
                r0Var.setDimMenu(0.15f);
                r0Var.U(v0Var, null);
                qp.f1().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                k60 k60Var = (k60) obj2;
                ((h41) obj).run();
                if (k60Var.J) {
                    k60Var.u();
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                b bVar = (b) obj;
                ij ijVar = photoViewer.S4;
                if (ijVar == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(ijVar.R0)) {
                    new gc(wa.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.V6;
                org.telegram.ui.ActionBar.g1 b10 = org.telegram.ui.Components.c9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f41729f1, profileActivity.f41867z0);
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
                                RectF rectF2 = ProfileActivity.V6;
                                profileActivity2.X3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.V6;
                                profileActivity2.X3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity.f41844w0 = imageView;
                profileActivity.X3(0.3f);
                UndoView undoView = profileActivity.L;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                return true;
            case 6:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.ui.ActionBar.g1 b11 = org.telegram.ui.Components.c9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f41729f1, profileActivity2.f41867z0);
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
                                RectF rectF22 = ProfileActivity.V6;
                                profileActivity22.X3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.V6;
                                profileActivity22.X3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity2.f41844w0 = view2;
                profileActivity2.X3(0.3f);
                UndoView undoView2 = profileActivity2.L;
                if (undoView2 != null) {
                    undoView2.d(1, true);
                }
                return true;
            default:
                m41 m41Var = (m41) obj2;
                ng.f fVar = (ng.f) obj;
                n41 n41Var = m41Var.d;
                kz kzVar = m41Var.f47789a;
                if (!kzVar.f35465c) {
                    return false;
                }
                n41Var.f();
                ArrayList arrayList = n41Var.f48118n;
                lg.g gVar = n41Var.f48115c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((m41) arrayList.get(i10)).f47789a.setChecked(false);
                    ((m41) arrayList.get(i10)).f47790b.f20584n = false;
                    if (n41Var.f48119r.f48950c > 0 && i10 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i10)).f20584n = false;
                    }
                }
                kzVar.setChecked(true);
                fVar.f20584n = true;
                n41Var.f48114b.z();
                if (n41Var.f48119r.f48950c > 0) {
                    ((ng.f) gVar.d.get(m41Var.f47791c)).f20584n = true;
                    gVar.z();
                }
                return true;
        }
    }
}
