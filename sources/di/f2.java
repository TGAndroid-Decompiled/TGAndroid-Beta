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
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k41;
import org.telegram.ui.l41;
public final class f2 implements View.OnLongClickListener {
    public final int f8977a;
    public final Object f8978b;
    public final Object f8979c;

    public f2(int i7, Object obj, Object obj2) {
        this.f8977a = i7;
        this.f8978b = obj;
        this.f8979c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f8977a;
        Object obj = this.f8979c;
        Object obj2 = this.f8978b;
        switch (i7) {
            case 0:
                i4 i4Var = (i4) obj2;
                p9 p9Var = (p9) obj;
                w1 w1Var = i4Var.f9159i3;
                if (w1Var != null) {
                    org.telegram.messenger.g0.r(w1Var);
                    i4Var.f9159i3 = null;
                }
                iz.H(true);
                fi.m3 m3Var = i4Var.f9184q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                ii0 ii0Var = i4Var.f9132a3;
                if (ii0Var == null) {
                    ii0 ii0Var2 = new ii0(2, i4Var.f9168l2, i4Var.getContext(), LaunchActivity.Q(), new m2(4, i4Var.f9163k0));
                    i4Var.f9132a3 = ii0Var2;
                    ii0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    i4Var.addView(i4Var.f9132a3, i4Var.getChildCount() - 1, ha.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    i4Var.f9132a3.setVisibility(8);
                    i4Var.f9132a3.setDelegate(new i3(i4Var));
                    i4Var.f9132a3.p(null, null, true);
                } else {
                    i4Var.bringChildToFront(ii0Var);
                    i4Var.f9132a3.n();
                }
                i4Var.f9132a3.setFragment(LaunchActivity.Q());
                p9Var.f9569s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                i4Var.Z0(true);
                return true;
            case 1:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj;
                fi.u4 u4Var = ((org.telegram.ui.Components.f0) obj2).f33423n;
                if (u4Var == null) {
                    return false;
                }
                return ((Boolean) u4Var.a(e0Var)).booleanValue();
            case 2:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) obj2;
                float f10 = MediaController.B().f21285q0;
                org.telegram.ui.ActionBar.v0 v0Var = b8Var.N1;
                v0Var.e(false, f10);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, v0Var, (org.telegram.ui.ActionBar.f6) obj);
                b8Var.a1(false);
                org.telegram.ui.ActionBar.r0 r0Var = b8Var.L1;
                r0Var.setDimMenu(0.15f);
                r0Var.U(v0Var, null);
                qp.f1().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                k60 k60Var = (k60) obj2;
                ((l51) obj).run();
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
                    new hc(xa.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.S6;
                org.telegram.ui.ActionBar.g1 b10 = org.telegram.ui.Components.d9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f41731f1, profileActivity.f41869z0);
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
                                RectF rectF2 = ProfileActivity.S6;
                                profileActivity2.X3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.S6;
                                profileActivity2.X3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity.f41846w0 = imageView;
                profileActivity.X3(0.3f);
                UndoView undoView = profileActivity.L;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                return true;
            case 6:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.S6;
                org.telegram.ui.ActionBar.g1 b11 = org.telegram.ui.Components.d9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f41731f1, profileActivity2.f41869z0);
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
                                RectF rectF22 = ProfileActivity.S6;
                                profileActivity22.X3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.S6;
                                profileActivity22.X3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity2.f41846w0 = view2;
                profileActivity2.X3(0.3f);
                UndoView undoView2 = profileActivity2.L;
                if (undoView2 != null) {
                    undoView2.d(1, true);
                }
                return true;
            default:
                k41 k41Var = (k41) obj2;
                ng.f fVar = (ng.f) obj;
                l41 l41Var = k41Var.d;
                lz lzVar = k41Var.f47101a;
                if (!lzVar.f35821c) {
                    return false;
                }
                l41Var.f();
                ArrayList arrayList = l41Var.f47418n;
                lg.g gVar = l41Var.f47415c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((k41) arrayList.get(i10)).f47101a.setChecked(false);
                    ((k41) arrayList.get(i10)).f47102b.f20579n = false;
                    if (l41Var.f47419r.f48255c > 0 && i10 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i10)).f20579n = false;
                    }
                }
                lzVar.setChecked(true);
                fVar.f20579n = true;
                l41Var.f47414b.z();
                if (l41Var.f47419r.f48255c > 0) {
                    ((ng.f) gVar.d.get(k41Var.f47103c)).f20579n = true;
                    gVar.z();
                }
                return true;
        }
    }
}
