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
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ja1;
import org.telegram.ui.ka1;
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
                gk0 gk0Var = f6Var.f850r3;
                if (gk0Var == null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    gk0 gk0Var2 = new gk0(2, f6Var.C2, f6Var.getContext(), R, new x3(4, f6Var.B0));
                    f6Var.f850r3 = gk0Var2;
                    gk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    f6Var.addView(f6Var.f850r3, f6Var.getChildCount() - 1, w7.x5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    f6Var.f850r3.setVisibility(8);
                    f6Var.f850r3.setDelegate(new z4(f6Var));
                    f6Var.f850r3.p(null, null, true);
                } else {
                    f6Var.bringChildToFront(gk0Var);
                    f6Var.f850r3.n();
                }
                f6Var.f850r3.setFragment(LaunchActivity.R());
                jcVar.f1107s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                f6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f1420c;
                ci.p5 p5Var = ((org.telegram.ui.Components.d0) this.f1419b).f23170n;
                if (p5Var != null) {
                    return ((Boolean) p5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.f1419b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = h8Var.X;
                c1Var.d(playbackSpeed, false);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.f6) this.f1420c));
                h8Var.F0(false);
                org.telegram.ui.ActionBar.w0 w0Var = h8Var.V;
                w0Var.setDimMenu(0.15f);
                w0Var.M(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                n70 n70Var = (n70) this.f1419b;
                ((br0) this.f1420c).run();
                if (n70Var.J) {
                    n70Var.u();
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
                    new vc(org.telegram.ui.Components.jb.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1419b;
                ImageView imageView = (ImageView) this.f1420c;
                org.telegram.ui.ActionBar.o1 b10 = org.telegram.ui.Components.m9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f31301g1, profileActivity.f31429z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.e0(profileActivity, 3));
                    profileActivity.f31410w0 = imageView;
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
                ja1 ja1Var = (ja1) this.f1419b;
                kg.f fVar = (kg.f) this.f1420c;
                ka1 ka1Var = ja1Var.d;
                s00 s00Var = ja1Var.f34834a;
                boolean z10 = false;
                if (s00Var.f27734c) {
                    ka1Var.f();
                    ArrayList arrayList = ka1Var.f35182n;
                    ig.g gVar = ka1Var.f35180c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ja1) arrayList.get(i10)).f34834a.setChecked(false);
                        ((ja1) arrayList.get(i10)).f34835b.f13631n = false;
                        if (ka1Var.f35183r.f35748c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).f13631n = false;
                        }
                    }
                    z10 = true;
                    s00Var.setChecked(true);
                    fVar.f13631n = true;
                    ka1Var.f35179b.z();
                    if (ka1Var.f35183r.f35748c > 0) {
                        ((kg.f) gVar.d.get(ja1Var.f34836c)).f13631n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
