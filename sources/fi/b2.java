package fi;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.np;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.ta;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i41;
import org.telegram.ui.j41;
public final class b2 implements View.OnLongClickListener {
    public final int f11451a;
    public final Object f11452b;
    public final Object f11453c;

    public b2(int i7, Object obj, Object obj2) {
        this.f11451a = i7;
        this.f11452b = obj;
        this.f11453c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f11451a;
        Object obj = this.f11453c;
        Object obj2 = this.f11452b;
        switch (i7) {
            case 0:
                b4 b4Var = (b4) obj2;
                i9 i9Var = (i9) obj;
                t1 t1Var = b4Var.j3;
                if (t1Var != null) {
                    org.telegram.messenger.g0.r(t1Var);
                    b4Var.j3 = null;
                }
                gz.H(true);
                hi.l3 l3Var = b4Var.f11514r0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                mi0 mi0Var = b4Var.f11462b3;
                if (mi0Var == null) {
                    mi0 mi0Var2 = new mi0(2, b4Var.f11497m2, b4Var.getContext(), LaunchActivity.Q(), new i2(4, b4Var.f11493l0));
                    b4Var.f11462b3 = mi0Var2;
                    mi0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    b4Var.addView(b4Var.f11462b3, b4Var.getChildCount() - 1, ja.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    b4Var.f11462b3.setVisibility(8);
                    b4Var.f11462b3.setDelegate(new d3(b4Var));
                    b4Var.f11462b3.p(null, null, true);
                } else {
                    b4Var.bringChildToFront(mi0Var);
                    b4Var.f11462b3.n();
                }
                b4Var.f11462b3.setFragment(LaunchActivity.Q());
                i9Var.f11870s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                b4Var.Z0(true);
                return true;
            case 1:
                org.telegram.ui.Components.b0 b0Var = (org.telegram.ui.Components.b0) obj;
                hi.s4 s4Var = ((org.telegram.ui.Components.c0) obj2).f33442n;
                if (s4Var == null) {
                    return false;
                }
                return ((Boolean) s4Var.a(b0Var)).booleanValue();
            case 2:
                org.telegram.ui.Components.y7 y7Var = (org.telegram.ui.Components.y7) obj2;
                float f10 = MediaController.B().f22368r0;
                org.telegram.ui.ActionBar.v0 v0Var = y7Var.R1;
                v0Var.e(false, f10);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, v0Var, (org.telegram.ui.ActionBar.e6) obj);
                y7Var.a1(false);
                org.telegram.ui.ActionBar.q0 q0Var = y7Var.P1;
                q0Var.setDimMenu(0.15f);
                q0Var.V(v0Var, null);
                np.f1().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                m60 m60Var = (m60) obj2;
                ((org.telegram.ui.Components.voip.u) obj).run();
                if (m60Var.J) {
                    m60Var.u();
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
                    new cc(ta.a(photoViewer.F), bVar).k(false).j();
                }
                return true;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.X6;
                org.telegram.ui.ActionBar.g1 b10 = org.telegram.ui.Components.a9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f43109g1, profileActivity.A0);
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
                                RectF rectF2 = ProfileActivity.X6;
                                profileActivity2.W3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.X6;
                                profileActivity2.W3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity.f43225x0 = imageView;
                profileActivity.W3(0.3f);
                UndoView undoView = profileActivity.M;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                return true;
            case 6:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.X6;
                org.telegram.ui.ActionBar.g1 b11 = org.telegram.ui.Components.a9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f43109g1, profileActivity2.A0);
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
                                RectF rectF22 = ProfileActivity.X6;
                                profileActivity22.W3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.X6;
                                profileActivity22.W3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity2.f43225x0 = view2;
                profileActivity2.W3(0.3f);
                UndoView undoView2 = profileActivity2.M;
                if (undoView2 != null) {
                    undoView2.d(1, true);
                }
                return true;
            default:
                i41 i41Var = (i41) obj2;
                ng.f fVar = (ng.f) obj;
                j41 j41Var = i41Var.d;
                oz ozVar = i41Var.f47899a;
                if (!ozVar.f38123c) {
                    return false;
                }
                j41Var.f();
                ArrayList arrayList = j41Var.f48220n;
                lg.g gVar = j41Var.f48217c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i41) arrayList.get(i10)).f47899a.setChecked(false);
                    ((i41) arrayList.get(i10)).f47900b.f21149n = false;
                    if (j41Var.f48221r.f48832c > 0 && i10 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i10)).f21149n = false;
                    }
                }
                ozVar.setChecked(true);
                fVar.f21149n = true;
                j41Var.f48216b.z();
                if (j41Var.f48221r.f48832c > 0) {
                    ((ng.f) gVar.d.get(i41Var.f47901c)).f21149n = true;
                    gVar.z();
                }
                return true;
        }
    }
}
