package ei;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.az;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.wa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a41;
import org.telegram.ui.b41;
public final class j2 implements View.OnLongClickListener {
    public final int f10435a;
    public final Object f10436b;
    public final Object f10437c;

    public j2(int i3, Object obj, Object obj2) {
        this.f10435a = i3;
        this.f10436b = obj;
        this.f10437c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i3 = this.f10435a;
        Object obj = this.f10437c;
        Object obj2 = this.f10436b;
        switch (i3) {
            case 0:
                j4 j4Var = (j4) obj2;
                r9 r9Var = (r9) obj;
                a2 a2Var = j4Var.f10472j3;
                if (a2Var != null) {
                    org.telegram.messenger.g0.r(a2Var);
                    j4Var.f10472j3 = null;
                }
                az.H(true);
                gi.l3 l3Var = j4Var.f10498r0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                li0 li0Var = j4Var.f10446b3;
                if (li0Var == null) {
                    li0 li0Var2 = new li0(2, j4Var.f10480m2, j4Var.getContext(), LaunchActivity.Q(), new q2(4, j4Var.f10476l0));
                    j4Var.f10446b3 = li0Var2;
                    li0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    j4Var.addView(j4Var.f10446b3, j4Var.getChildCount() - 1, mf.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    j4Var.f10446b3.setVisibility(8);
                    j4Var.f10446b3.setDelegate(new l3(j4Var));
                    j4Var.f10446b3.p(null, null, true);
                } else {
                    j4Var.bringChildToFront(li0Var);
                    j4Var.f10446b3.n();
                }
                j4Var.f10446b3.setFragment(LaunchActivity.Q());
                r9Var.f10948s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                j4Var.Z0(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                gi.s4 s4Var = ((org.telegram.ui.Components.d0) obj2).f32879n;
                if (s4Var == null) {
                    return false;
                }
                return ((Boolean) s4Var.a(c0Var)).booleanValue();
            case 2:
                org.telegram.ui.Components.z7 z7Var = (org.telegram.ui.Components.z7) obj2;
                float f10 = MediaController.B().f21339r0;
                org.telegram.ui.ActionBar.u0 u0Var = z7Var.O1;
                u0Var.e(false, f10);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, u0Var, (org.telegram.ui.ActionBar.e6) obj);
                z7Var.a1(false);
                org.telegram.ui.ActionBar.q0 q0Var = z7Var.M1;
                q0Var.setDimMenu(0.15f);
                q0Var.U(u0Var, null);
                hp.f1().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                f60 f60Var = (f60) obj2;
                ((p11) obj).run();
                if (f60Var.J) {
                    f60Var.u();
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                b bVar = (b) obj;
                zi ziVar = photoViewer.U4;
                if (ziVar == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(ziVar.R0)) {
                    new fc(wa.a(photoViewer.F), bVar).k(false).j();
                }
                return true;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.T6;
                org.telegram.ui.ActionBar.f1 b10 = org.telegram.ui.Components.b9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f41766g1, profileActivity.A0);
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
                                RectF rectF2 = ProfileActivity.T6;
                                profileActivity2.X3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.T6;
                                profileActivity2.X3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity.f41882x0 = imageView;
                profileActivity.X3(0.3f);
                UndoView undoView = profileActivity.M;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                return true;
            case 6:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.T6;
                org.telegram.ui.ActionBar.f1 b11 = org.telegram.ui.Components.b9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f41766g1, profileActivity2.A0);
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
                                RectF rectF22 = ProfileActivity.T6;
                                profileActivity22.X3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.T6;
                                profileActivity22.X3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity2.f41882x0 = view2;
                profileActivity2.X3(0.3f);
                UndoView undoView2 = profileActivity2.M;
                if (undoView2 != null) {
                    undoView2.d(1, true);
                }
                return true;
            default:
                a41 a41Var = (a41) obj2;
                og.f fVar = (og.f) obj;
                b41 b41Var = a41Var.d;
                hz hzVar = a41Var.f43593a;
                if (!hzVar.f34541c) {
                    return false;
                }
                b41Var.f();
                ArrayList arrayList = b41Var.f43922n;
                mg.g gVar = b41Var.f43919c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((a41) arrayList.get(i10)).f43593a.setChecked(false);
                    ((a41) arrayList.get(i10)).f43594b.f21096n = false;
                    if (b41Var.f43923r.f44540c > 0 && i10 < gVar.d.size()) {
                        ((og.f) gVar.d.get(i10)).f21096n = false;
                    }
                }
                hzVar.setChecked(true);
                fVar.f21096n = true;
                b41Var.f43918b.z();
                if (b41Var.f43923r.f44540c > 0) {
                    ((og.f) gVar.d.get(a41Var.f43595c)).f21096n = true;
                    gVar.z();
                }
                return true;
        }
    }
}
