package ai;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ba1;
import org.telegram.ui.ca1;
import org.telegram.ui.tt;
public final class q3 implements View.OnLongClickListener {
    public final int f1416a;
    public final Object f1417b;
    public final Object f1418c;

    public q3(int i10, Object obj, Object obj2) {
        this.f1416a = i10;
        this.f1417b = obj;
        this.f1418c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f1416a) {
            case 0:
                e6 e6Var = (e6) this.f1417b;
                jc jcVar = (jc) this.f1418c;
                c3 c3Var = e6Var.f850z3;
                if (c3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c3Var);
                    e6Var.f850z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ci.e4 e4Var = e6Var.H0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                qk0 qk0Var = e6Var.f823r3;
                if (qk0Var == null) {
                    org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                    qk0 qk0Var2 = new qk0(2, e6Var.C2, e6Var.getContext(), R, new x3(4, e6Var.B0));
                    e6Var.f823r3 = qk0Var2;
                    qk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    e6Var.addView(e6Var.f823r3, e6Var.getChildCount() - 1, w7.y5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    e6Var.f823r3.setVisibility(8);
                    e6Var.f823r3.setDelegate(new z4(e6Var));
                    e6Var.f823r3.p(null, null, true);
                } else {
                    e6Var.bringChildToFront(qk0Var);
                    e6Var.f823r3.n();
                }
                e6Var.f823r3.setFragment(LaunchActivity.R());
                jcVar.f1098s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                e6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f1418c;
                ci.o5 o5Var = ((org.telegram.ui.Components.d0) this.f1417b).f23425n;
                if (o5Var != null) {
                    return ((Boolean) o5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1417b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.a1 a1Var = j8Var.X;
                a1Var.d(playbackSpeed, false);
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, (org.telegram.ui.ActionBar.d6) this.f1418c));
                j8Var.F0(false);
                org.telegram.ui.ActionBar.u0 u0Var = j8Var.V;
                u0Var.setDimMenu(0.15f);
                u0Var.M(a1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                y70 y70Var = (y70) this.f1417b;
                ((tt) this.f1418c).run();
                if (y70Var.J) {
                    y70Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f1417b;
                d dVar = (d) this.f1418c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new xc(org.telegram.ui.Components.lb.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1417b;
                ImageView imageView = (ImageView) this.f1418c;
                org.telegram.ui.ActionBar.m1 b10 = org.telegram.ui.Components.o9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f31570g1, profileActivity.f31698z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.f0(profileActivity, 3));
                    profileActivity.f31679w0 = imageView;
                    profileActivity.H3(0.3f);
                    UndoView undoView = profileActivity.M;
                    if (undoView == null) {
                        return true;
                    }
                    undoView.e(1, true);
                    return true;
                }
                return false;
            default:
                ba1 ba1Var = (ba1) this.f1417b;
                kg.f fVar = (kg.f) this.f1418c;
                ca1 ca1Var = ba1Var.d;
                t00 t00Var = ba1Var.f32364a;
                boolean z10 = false;
                if (t00Var.f28353c) {
                    ca1Var.f();
                    ArrayList arrayList = ca1Var.f32616n;
                    ig.g gVar = ca1Var.f32614c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ba1) arrayList.get(i10)).f32364a.setChecked(false);
                        ((ba1) arrayList.get(i10)).f32365b.f13616n = false;
                        if (ca1Var.f32617r.f33346c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).f13616n = false;
                        }
                    }
                    z10 = true;
                    t00Var.setChecked(true);
                    fVar.f13616n = true;
                    ca1Var.f32613b.z();
                    if (ca1Var.f32617r.f33346c > 0) {
                        ((kg.f) gVar.d.get(ba1Var.f32366c)).f13616n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
