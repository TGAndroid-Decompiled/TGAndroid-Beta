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
                i30 i30Var = (i30) obj2;
                float f = MediaController.w().r0;
                v7 v7Var = i30Var.Q1;
                v7Var.e(false, f);
                anb.h(cmb.F8, (ylb) obj, v7Var);
                i30Var.V0(false);
                r7 r7Var = i30Var.O1;
                r7Var.setDimMenu(0.15f);
                r7Var.U(v7Var, null);
                oc7.e1().edit().putInt("speedhint", -15).apply();
                return true;
            case 2:
                bu5 bu5Var = (bu5) obj2;
                ((rd3) obj).run();
                if (bu5Var.J) {
                    bu5Var.u();
                }
                return true;
            case 3:
                a58 a58Var = (a58) obj2;
                oab oabVar = (oab) obj;
                h38 h38Var = a58Var.p3;
                if (h38Var != null) {
                    gm.r(h38Var);
                    a58Var.p3 = null;
                }
                gda.G(true);
                hg5 hg5Var = a58Var.x0;
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                v29 v29Var = a58Var.h3;
                if (v29Var == null) {
                    v29 v29Var2 = new v29(2, a58Var.s2, new pv0(a58Var.r0, (byte) 7), a58Var.getContext(), LaunchActivity.Q());
                    a58Var.h3 = v29Var2;
                    v29Var2.setPadding(0, 0, 0, gm.L(22.0f));
                    a58Var.addView(a58Var.h3, a58Var.getChildCount() - 1, qoe.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    a58Var.h3.setVisibility(8);
                    a58Var.h3.setDelegate(new f48(a58Var));
                    a58Var.h3.m(null, null, true);
                } else {
                    a58Var.bringChildToFront(v29Var);
                    a58Var.h3.k();
                }
                a58Var.h3.setFragment(LaunchActivity.Q());
                oabVar.s.dispatchTouchEvent(gm.R());
                a58Var.W0(true);
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                r63 r63Var = (r63) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                k47 k47Var = photoViewer.S4;
                if (k47Var == null) {
                    return false;
                }
                if (gm.g(k47Var.T0)) {
                    new c41(n21.a(photoViewer.F), r63Var).k(false).j();
                }
                return true;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.e7;
                m8 b2 = de0.b(profileActivity, imageView, profileActivity.a(), profileActivity.g1, profileActivity.A0);
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
                                RectF rectF2 = ProfileActivity.e7;
                                profileActivity2.R1(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.e7;
                                profileActivity2.R1(0.0f);
                                return;
                        }
                    }
                });
                profileActivity.x0 = imageView;
                profileActivity.R1(0.3f);
                UndoView undoView = profileActivity.M;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                return true;
            case 6:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.e7;
                m8 b3 = de0.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.g1, profileActivity2.A0);
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
                                RectF rectF22 = ProfileActivity.e7;
                                profileActivity22.R1(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.e7;
                                profileActivity22.R1(0.0f);
                                return;
                        }
                    }
                });
                profileActivity2.x0 = view2;
                profileActivity2.R1(0.3f);
                UndoView undoView2 = profileActivity2.M;
                if (undoView2 != null) {
                    undoView2.d(1, true);
                }
                return true;
            default:
                fza fzaVar = (fza) obj2;
                l46 l46Var = (l46) obj;
                gza gzaVar = fzaVar.d;
                sk4 sk4Var = fzaVar.a;
                if (!sk4Var.c) {
                    return false;
                }
                gzaVar.f();
                ArrayList arrayList = gzaVar.n;
                ng0 ng0Var = gzaVar.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((fza) arrayList.get(i)).a.setChecked(false);
                    ((fza) arrayList.get(i)).b.n = false;
                    if (gzaVar.r.c > 0 && i < ng0Var.d.size()) {
                        ((l46) ng0Var.d.get(i)).n = false;
                    }
                }
                sk4Var.setChecked(true);
                l46Var.n = true;
                gzaVar.b.z();
                if (gzaVar.r.c > 0) {
                    ((l46) ng0Var.d.get(fzaVar.c)).n = true;
                    ng0Var.z();
                }
                return true;
        }
    }
}
