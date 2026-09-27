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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aa1;
import org.telegram.ui.ba1;
import org.telegram.ui.tv;
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
                e6 e6Var = (e6) this.f1419b;
                jc jcVar = (jc) this.f1420c;
                c3 c3Var = e6Var.f853z3;
                if (c3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c3Var);
                    e6Var.f853z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ci.e4 e4Var = e6Var.H0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                sk0 sk0Var = e6Var.f826r3;
                if (sk0Var == null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    sk0 sk0Var2 = new sk0(2, e6Var.C2, e6Var.getContext(), R, new x3(4, e6Var.B0));
                    e6Var.f826r3 = sk0Var2;
                    sk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    e6Var.addView(e6Var.f826r3, e6Var.getChildCount() - 1, w7.y5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    e6Var.f826r3.setVisibility(8);
                    e6Var.f826r3.setDelegate(new z4(e6Var));
                    e6Var.f826r3.p(null, null, true);
                } else {
                    e6Var.bringChildToFront(sk0Var);
                    e6Var.f826r3.n();
                }
                e6Var.f826r3.setFragment(LaunchActivity.R());
                jcVar.f1100s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                e6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f1420c;
                ci.o5 o5Var = ((org.telegram.ui.Components.d0) this.f1419b).f23470n;
                if (o5Var != null) {
                    return ((Boolean) o5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1419b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = j8Var.X;
                c1Var.d(playbackSpeed, false);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, (org.telegram.ui.ActionBar.e6) this.f1420c));
                j8Var.F0(false);
                org.telegram.ui.ActionBar.w0 w0Var = j8Var.V;
                w0Var.setDimMenu(0.15f);
                w0Var.M(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                a80 a80Var = (a80) this.f1419b;
                ((tv) this.f1420c).run();
                if (a80Var.J) {
                    a80Var.u();
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
                org.telegram.ui.ActionBar.o1 b10 = org.telegram.ui.Components.o9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f31572g1, profileActivity.f31700z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.g0(profileActivity, 3));
                    profileActivity.f31681w0 = imageView;
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
                aa1 aa1Var = (aa1) this.f1419b;
                kg.f fVar = (kg.f) this.f1420c;
                ba1 ba1Var = aa1Var.d;
                u00 u00Var = aa1Var.f32034a;
                boolean z10 = false;
                if (u00Var.f28728c) {
                    ba1Var.f();
                    ArrayList arrayList = ba1Var.f32305n;
                    ig.g gVar = ba1Var.f32303c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((aa1) arrayList.get(i10)).f32034a.setChecked(false);
                        ((aa1) arrayList.get(i10)).f32035b.f13618n = false;
                        if (ba1Var.f32306r.f32908c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).f13618n = false;
                        }
                    }
                    z10 = true;
                    u00Var.setChecked(true);
                    fVar.f13618n = true;
                    ba1Var.f32302b.z();
                    if (ba1Var.f32306r.f32908c > 0) {
                        ((kg.f) gVar.d.get(aa1Var.f32036c)).f13618n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
