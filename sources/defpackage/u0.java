package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class u0 implements View.OnLongClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public u0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                y0 y0Var = (y0) obj;
                r rVar = ((z0) obj2).w;
                if (rVar == null) {
                    return false;
                }
                return ((Boolean) rVar.a(y0Var)).booleanValue();
            case 1:
                i20 i20Var = (i20) obj2;
                float f = MediaController.w().r0;
                v7 v7Var = i20Var.Q1;
                v7Var.e(false, f);
                zkb.h(bkb.F8, (wjb) obj, v7Var);
                i20Var.V0(false);
                r7 r7Var = i20Var.O1;
                r7Var.setDimMenu(0.15f);
                r7Var.U(v7Var, null);
                na7.d1().edit().putInt("speedhint", -15).apply();
                return true;
            case 2:
                cs5 cs5Var = (cs5) obj2;
                ((wc3) obj).run();
                if (cs5Var.J) {
                    cs5Var.u();
                }
                return true;
            case 3:
                y28 y28Var = (y28) obj2;
                m8b m8bVar = (m8b) obj;
                e18 e18Var = y28Var.p3;
                if (e18Var != null) {
                    gl.r(e18Var);
                    y28Var.p3 = null;
                }
                gba.G(true);
                je5 je5Var = y28Var.x0;
                if (je5Var != null) {
                    je5Var.f(true);
                }
                t09 t09Var = y28Var.h3;
                if (t09Var == null) {
                    t09 t09Var2 = new t09(2, y28Var.s2, new gu0(y28Var.r0, (byte) 7), y28Var.getContext(), LaunchActivity.Q());
                    y28Var.h3 = t09Var2;
                    t09Var2.setPadding(0, 0, 0, gl.L(22.0f));
                    y28Var.addView(y28Var.h3, y28Var.getChildCount() - 1, nme.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    y28Var.h3.setVisibility(8);
                    y28Var.h3.setDelegate(new c28(y28Var));
                    y28Var.h3.m(null, null, true);
                } else {
                    y28Var.bringChildToFront(t09Var);
                    y28Var.h3.k();
                }
                y28Var.h3.setFragment(LaunchActivity.Q());
                m8bVar.s.dispatchTouchEvent(gl.R());
                y28Var.W0(true);
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                f53 f53Var = (f53) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                k27 k27Var = photoViewer.S4;
                if (k27Var == null) {
                    return false;
                }
                if (gl.g(k27Var.T0)) {
                    new u21(f11.a(photoViewer.F), f53Var).k(false).j();
                }
                return true;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.Z6;
                m8 b2 = dd0.b(profileActivity, imageView, profileActivity.a(), profileActivity.g1, profileActivity.A0);
                if (b2 == null) {
                    return false;
                }
                b2.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        byte b3 = r2;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (b3) {
                            case 0:
                                RectF rectF2 = ProfileActivity.Z6;
                                profileActivity2.P1(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.Z6;
                                profileActivity2.P1(0.0f);
                                return;
                        }
                    }
                });
                profileActivity.x0 = imageView;
                profileActivity.P1(0.3f);
                UndoView undoView = profileActivity.M;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                return true;
            case 6:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.Z6;
                m8 b3 = dd0.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.g1, profileActivity2.A0);
                if (b3 == null) {
                    return false;
                }
                b3.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        byte b32 = r2;
                        ProfileActivity profileActivity22 = profileActivity2;
                        switch (b32) {
                            case 0:
                                RectF rectF22 = ProfileActivity.Z6;
                                profileActivity22.P1(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.Z6;
                                profileActivity22.P1(0.0f);
                                return;
                        }
                    }
                });
                profileActivity2.x0 = view2;
                profileActivity2.P1(0.3f);
                UndoView undoView2 = profileActivity2.M;
                if (undoView2 != null) {
                    undoView2.d(1, true);
                }
                return true;
            default:
                cxa cxaVar = (cxa) obj2;
                k26 k26Var = (k26) obj;
                dxa dxaVar = cxaVar.d;
                oi4 oi4Var = cxaVar.a;
                if (!oi4Var.c) {
                    return false;
                }
                dxaVar.f();
                ArrayList arrayList = dxaVar.n;
                nf0 nf0Var = dxaVar.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((cxa) arrayList.get(i)).a.setChecked(false);
                    ((cxa) arrayList.get(i)).b.n = false;
                    if (dxaVar.r.c > 0 && i < nf0Var.d.size()) {
                        ((k26) nf0Var.d.get(i)).n = false;
                    }
                }
                oi4Var.setChecked(true);
                k26Var.n = true;
                dxaVar.b.z();
                if (dxaVar.r.c > 0) {
                    ((k26) nf0Var.d.get(cxaVar.c)).n = true;
                    nf0Var.z();
                }
                return true;
        }
    }
}
