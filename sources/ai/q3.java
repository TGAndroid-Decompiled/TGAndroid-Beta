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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ba1;
import org.telegram.ui.ca1;
import org.telegram.ui.tt;
public final class q3 implements View.OnLongClickListener {
    public final int f1421a;
    public final Object f1422b;
    public final Object f1423c;

    public q3(int i10, Object obj, Object obj2) {
        this.f1421a = i10;
        this.f1422b = obj;
        this.f1423c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f1421a) {
            case 0:
                e6 e6Var = (e6) this.f1422b;
                jc jcVar = (jc) this.f1423c;
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
                tk0 tk0Var = e6Var.f823r3;
                if (tk0Var == null) {
                    org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                    tk0 tk0Var2 = new tk0(2, e6Var.C2, e6Var.getContext(), R, new x3(4, e6Var.B0));
                    e6Var.f823r3 = tk0Var2;
                    tk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    e6Var.addView(e6Var.f823r3, e6Var.getChildCount() - 1, w7.y5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    e6Var.f823r3.setVisibility(8);
                    e6Var.f823r3.setDelegate(new z4(e6Var));
                    e6Var.f823r3.p(null, null, true);
                } else {
                    e6Var.bringChildToFront(tk0Var);
                    e6Var.f823r3.n();
                }
                e6Var.f823r3.setFragment(LaunchActivity.R());
                jcVar.f1100s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                e6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f1423c;
                ci.o5 o5Var = ((org.telegram.ui.Components.d0) this.f1422b).f23458n;
                if (o5Var != null) {
                    return ((Boolean) o5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1422b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.a1 a1Var = j8Var.X;
                a1Var.d(playbackSpeed, false);
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, (org.telegram.ui.ActionBar.d6) this.f1423c));
                j8Var.F0(false);
                org.telegram.ui.ActionBar.u0 u0Var = j8Var.V;
                u0Var.setDimMenu(0.15f);
                u0Var.M(a1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                b80 b80Var = (b80) this.f1422b;
                ((tt) this.f1423c).run();
                if (b80Var.J) {
                    b80Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f1422b;
                d dVar = (d) this.f1423c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new yc(org.telegram.ui.Components.mb.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1422b;
                ImageView imageView = (ImageView) this.f1423c;
                org.telegram.ui.ActionBar.m1 b10 = org.telegram.ui.Components.o9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f31644g1, profileActivity.f31772z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.f0(profileActivity, 3));
                    profileActivity.f31753w0 = imageView;
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
                ba1 ba1Var = (ba1) this.f1422b;
                kg.f fVar = (kg.f) this.f1423c;
                ca1 ca1Var = ba1Var.d;
                v00 v00Var = ba1Var.f32439a;
                boolean z10 = false;
                if (v00Var.f28971c) {
                    ca1Var.f();
                    ArrayList arrayList = ca1Var.f32704n;
                    ig.g gVar = ca1Var.f32702c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ba1) arrayList.get(i10)).f32439a.setChecked(false);
                        ((ba1) arrayList.get(i10)).f32440b.f13631n = false;
                        if (ca1Var.f32705r.f33429c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).f13631n = false;
                        }
                    }
                    z10 = true;
                    v00Var.setChecked(true);
                    fVar.f13631n = true;
                    ca1Var.f32701b.z();
                    if (ca1Var.f32705r.f33429c > 0) {
                        ((kg.f) gVar.d.get(ba1Var.f32441c)).f13631n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
