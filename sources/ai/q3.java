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
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cu;
import org.telegram.ui.ia1;
import org.telegram.ui.ja1;
public final class q3 implements View.OnLongClickListener {
    public final int f1418a;
    public final Object f1419b;
    public final Object f1420c;

    public q3(int i10, Object obj, Object obj2) {
        this.f1418a = i10;
        this.f1419b = obj;
        this.f1420c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f1418a) {
            case 0:
                f6 f6Var = (f6) this.f1419b;
                jc jcVar = (jc) this.f1420c;
                c3 c3Var = f6Var.f877z3;
                if (c3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c3Var);
                    f6Var.f877z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ci.f4 f4Var = f6Var.H0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                qk0 qk0Var = f6Var.f850r3;
                if (qk0Var == null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    qk0 qk0Var2 = new qk0(2, f6Var.C2, f6Var.getContext(), R, new x3(4, f6Var.B0));
                    f6Var.f850r3 = qk0Var2;
                    qk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    f6Var.addView(f6Var.f850r3, f6Var.getChildCount() - 1, w7.y5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    f6Var.f850r3.setVisibility(8);
                    f6Var.f850r3.setDelegate(new z4(f6Var));
                    f6Var.f850r3.p(null, null, true);
                } else {
                    f6Var.bringChildToFront(qk0Var);
                    f6Var.f850r3.n();
                }
                f6Var.f850r3.setFragment(LaunchActivity.R());
                jcVar.f1107s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                f6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f1420c;
                ci.p5 p5Var = ((org.telegram.ui.Components.d0) this.f1419b).f23381n;
                if (p5Var != null) {
                    return ((Boolean) p5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1419b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.b1 b1Var = j8Var.X;
                b1Var.d(playbackSpeed, false);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.e6) this.f1420c));
                j8Var.F0(false);
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.V;
                v0Var.setDimMenu(0.15f);
                v0Var.M(b1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                w70 w70Var = (w70) this.f1419b;
                ((cu) this.f1420c).run();
                if (w70Var.J) {
                    w70Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f1419b;
                d dVar = (d) this.f1420c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new xc(org.telegram.ui.Components.lb.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1419b;
                ImageView imageView = (ImageView) this.f1420c;
                org.telegram.ui.ActionBar.n1 b10 = org.telegram.ui.Components.o9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f31528g1, profileActivity.f31656z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.e0(profileActivity, 3));
                    profileActivity.f31637w0 = imageView;
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
                ia1 ia1Var = (ia1) this.f1419b;
                kg.f fVar = (kg.f) this.f1420c;
                ja1 ja1Var = ia1Var.d;
                s00 s00Var = ia1Var.f34480a;
                boolean z10 = false;
                if (s00Var.f28014c) {
                    ja1Var.f();
                    ArrayList arrayList = ja1Var.f34774n;
                    ig.g gVar = ja1Var.f34772c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ia1) arrayList.get(i10)).f34480a.setChecked(false);
                        ((ia1) arrayList.get(i10)).f34481b.f13629n = false;
                        if (ja1Var.f34775r.f35324c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).f13629n = false;
                        }
                    }
                    z10 = true;
                    s00Var.setChecked(true);
                    fVar.f13629n = true;
                    ja1Var.f34771b.z();
                    if (ja1Var.f34775r.f35324c > 0) {
                        ((kg.f) gVar.d.get(ia1Var.f34482c)).f13629n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
