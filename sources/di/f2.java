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
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l41;
import org.telegram.ui.m41;
public final class f2 implements View.OnLongClickListener {
    public final int f8982a;
    public final Object f8983b;
    public final Object f8984c;

    public f2(int i7, Object obj, Object obj2) {
        this.f8982a = i7;
        this.f8983b = obj;
        this.f8984c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f8982a;
        Object obj = this.f8984c;
        Object obj2 = this.f8983b;
        switch (i7) {
            case 0:
                j4 j4Var = (j4) obj2;
                q9 q9Var = (q9) obj;
                w1 w1Var = j4Var.f9191i3;
                if (w1Var != null) {
                    org.telegram.messenger.g0.r(w1Var);
                    j4Var.f9191i3 = null;
                }
                iz.H(true);
                fi.m3 m3Var = j4Var.f9216q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                ji0 ji0Var = j4Var.f9164a3;
                if (ji0Var == null) {
                    ji0 ji0Var2 = new ji0(2, j4Var.f9200l2, j4Var.getContext(), LaunchActivity.Q(), new m2(4, j4Var.f9195k0));
                    j4Var.f9164a3 = ji0Var2;
                    ji0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    j4Var.addView(j4Var.f9164a3, j4Var.getChildCount() - 1, ha.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    j4Var.f9164a3.setVisibility(8);
                    j4Var.f9164a3.setDelegate(new i3(j4Var));
                    j4Var.f9164a3.p(null, null, true);
                } else {
                    j4Var.bringChildToFront(ji0Var);
                    j4Var.f9164a3.n();
                }
                j4Var.f9164a3.setFragment(LaunchActivity.Q());
                q9Var.f9634s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                j4Var.Z0(true);
                return true;
            case 1:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj;
                fi.u4 u4Var = ((org.telegram.ui.Components.f0) obj2).f33537n;
                if (u4Var == null) {
                    return false;
                }
                return ((Boolean) u4Var.a(e0Var)).booleanValue();
            case 2:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) obj2;
                float f10 = MediaController.B().f21285q0;
                org.telegram.ui.ActionBar.v0 v0Var = b8Var.N1;
                v0Var.e(false, f10);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.G8, v0Var, (org.telegram.ui.ActionBar.g6) obj);
                b8Var.a1(false);
                org.telegram.ui.ActionBar.r0 r0Var = b8Var.L1;
                r0Var.setDimMenu(0.15f);
                r0Var.U(v0Var, null);
                qp.f1().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                l60 l60Var = (l60) obj2;
                ((m51) obj).run();
                if (l60Var.J) {
                    l60Var.u();
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
                RectF rectF = ProfileActivity.V6;
                org.telegram.ui.ActionBar.g1 b10 = org.telegram.ui.Components.d9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f41738f1, profileActivity.f41876z0);
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
                profileActivity.f41853w0 = imageView;
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
                org.telegram.ui.ActionBar.g1 b11 = org.telegram.ui.Components.d9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f41738f1, profileActivity2.f41876z0);
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
                profileActivity2.f41853w0 = view2;
                profileActivity2.X3(0.3f);
                UndoView undoView2 = profileActivity2.L;
                if (undoView2 != null) {
                    undoView2.d(1, true);
                }
                return true;
            default:
                l41 l41Var = (l41) obj2;
                ng.f fVar = (ng.f) obj;
                m41 m41Var = l41Var.d;
                lz lzVar = l41Var.f47460a;
                if (!lzVar.f35873c) {
                    return false;
                }
                m41Var.f();
                ArrayList arrayList = m41Var.f47748n;
                lg.g gVar = m41Var.f47745c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((l41) arrayList.get(i10)).f47460a.setChecked(false);
                    ((l41) arrayList.get(i10)).f47461b.f20579n = false;
                    if (m41Var.f47749r.f48622c > 0 && i10 < gVar.d.size()) {
                        ((ng.f) gVar.d.get(i10)).f20579n = false;
                    }
                }
                lzVar.setChecked(true);
                fVar.f20579n = true;
                m41Var.f47744b.z();
                if (m41Var.f47749r.f48622c > 0) {
                    ((ng.f) gVar.d.get(l41Var.f47462c)).f20579n = true;
                    gVar.z();
                }
                return true;
        }
    }
}
