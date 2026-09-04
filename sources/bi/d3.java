package bi;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ka1;
import org.telegram.ui.la1;
import org.telegram.ui.yt;
public final class d3 implements View.OnLongClickListener {
    public final int f2854a;
    public final Object f2855b;
    public final Object f2856c;

    public d3(int i10, Object obj, Object obj2) {
        this.f2854a = i10;
        this.f2855b = obj;
        this.f2856c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f2854a) {
            case 0:
                o5 o5Var = (o5) this.f2855b;
                pb pbVar = (pb) this.f2856c;
                q2 q2Var = o5Var.f3483z3;
                if (q2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(q2Var);
                    o5Var.f3483z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                di.f4 f4Var = o5Var.H0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                fk0 fk0Var = o5Var.f3456r3;
                if (fk0Var == null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    fk0 fk0Var2 = new fk0(2, o5Var.C2, o5Var.getContext(), R, new k3(4, o5Var.B0));
                    o5Var.f3456r3 = fk0Var2;
                    fk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    o5Var.addView(o5Var.f3456r3, o5Var.getChildCount() - 1, w7.x5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    o5Var.f3456r3.setVisibility(8);
                    o5Var.f3456r3.setDelegate(new k4(o5Var));
                    o5Var.f3456r3.p(null, null, true);
                } else {
                    o5Var.bringChildToFront(fk0Var);
                    o5Var.f3456r3.n();
                }
                o5Var.f3456r3.setFragment(LaunchActivity.R());
                pbVar.f3572s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                o5Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.f2856c;
                di.p5 p5Var = ((org.telegram.ui.Components.e0) this.f2855b).f25500n;
                if (p5Var != null) {
                    return ((Boolean) p5Var.run(d0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.f2855b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.b1 b1Var = k8Var.X;
                b1Var.d(playbackSpeed, false);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.f6) this.f2856c));
                k8Var.F0(false);
                org.telegram.ui.ActionBar.v0 v0Var = k8Var.V;
                v0Var.setDimMenu(0.15f);
                v0Var.M(b1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                n70 n70Var = (n70) this.f2855b;
                ((yt) this.f2856c).run();
                if (n70Var.J) {
                    n70Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f2855b;
                b bVar = (b) this.f2856c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new yc(org.telegram.ui.Components.lb.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f2855b;
                ImageView imageView = (ImageView) this.f2856c;
                org.telegram.ui.ActionBar.n1 b10 = org.telegram.ui.Components.p9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f33903g1, profileActivity.f34031z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.e0(profileActivity, 3));
                    profileActivity.f34012w0 = imageView;
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
                ka1 ka1Var = (ka1) this.f2855b;
                lg.f fVar = (lg.f) this.f2856c;
                la1 la1Var = ka1Var.d;
                s00 s00Var = ka1Var.f37989a;
                boolean z10 = false;
                if (s00Var.f30139c) {
                    la1Var.f();
                    ArrayList arrayList = la1Var.f38256n;
                    jg.g gVar = la1Var.f38253c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ka1) arrayList.get(i10)).f37989a.setChecked(false);
                        ((ka1) arrayList.get(i10)).f37990b.f15448n = false;
                        if (la1Var.f38257r.f38896c > 0 && i10 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i10)).f15448n = false;
                        }
                    }
                    z10 = true;
                    s00Var.setChecked(true);
                    fVar.f15448n = true;
                    la1Var.f38252b.z();
                    if (la1Var.f38257r.f38896c > 0) {
                        ((lg.f) gVar.d.get(ka1Var.f37991c)).f15448n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
