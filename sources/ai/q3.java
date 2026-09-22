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
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ka1;
import org.telegram.ui.la1;
import org.telegram.ui.yt;
public final class q3 implements View.OnLongClickListener {
    public final int f1415a;
    public final Object f1416b;
    public final Object f1417c;

    public q3(int i10, Object obj, Object obj2) {
        this.f1415a = i10;
        this.f1416b = obj;
        this.f1417c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f1415a) {
            case 0:
                f6 f6Var = (f6) this.f1416b;
                jc jcVar = (jc) this.f1417c;
                c3 c3Var = f6Var.f874z3;
                if (c3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c3Var);
                    f6Var.f874z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ci.f4 f4Var = f6Var.H0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                sk0 sk0Var = f6Var.f847r3;
                if (sk0Var == null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    sk0 sk0Var2 = new sk0(2, f6Var.C2, f6Var.getContext(), R, new x3(4, f6Var.B0));
                    f6Var.f847r3 = sk0Var2;
                    sk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    f6Var.addView(f6Var.f847r3, f6Var.getChildCount() - 1, w7.y5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    f6Var.f847r3.setVisibility(8);
                    f6Var.f847r3.setDelegate(new z4(f6Var));
                    f6Var.f847r3.p(null, null, true);
                } else {
                    f6Var.bringChildToFront(sk0Var);
                    f6Var.f847r3.n();
                }
                f6Var.f847r3.setFragment(LaunchActivity.R());
                jcVar.f1104s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                f6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f1417c;
                ci.p5 p5Var = ((org.telegram.ui.Components.d0) this.f1416b).f23513n;
                if (p5Var != null) {
                    return ((Boolean) p5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) this.f1416b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.b1 b1Var = i8Var.X;
                b1Var.d(playbackSpeed, false);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.f6) this.f1417c));
                i8Var.F0(false);
                org.telegram.ui.ActionBar.v0 v0Var = i8Var.V;
                v0Var.setDimMenu(0.15f);
                v0Var.M(b1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                y70 y70Var = (y70) this.f1416b;
                ((yt) this.f1417c).run();
                if (y70Var.J) {
                    y70Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f1416b;
                d dVar = (d) this.f1417c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new xc(org.telegram.ui.Components.kb.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1416b;
                ImageView imageView = (ImageView) this.f1417c;
                org.telegram.ui.ActionBar.n1 b10 = org.telegram.ui.Components.n9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f31589g1, profileActivity.f31717z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.e0(profileActivity, 3));
                    profileActivity.f31698w0 = imageView;
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
                ka1 ka1Var = (ka1) this.f1416b;
                kg.f fVar = (kg.f) this.f1417c;
                la1 la1Var = ka1Var.d;
                s00 s00Var = ka1Var.f35097a;
                boolean z10 = false;
                if (s00Var.f28084c) {
                    la1Var.f();
                    ArrayList arrayList = la1Var.f35411n;
                    ig.g gVar = la1Var.f35409c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ka1) arrayList.get(i10)).f35097a.setChecked(false);
                        ((ka1) arrayList.get(i10)).f35098b.f13628n = false;
                        if (la1Var.f35412r.f35971c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).f13628n = false;
                        }
                    }
                    z10 = true;
                    s00Var.setChecked(true);
                    fVar.f13628n = true;
                    la1Var.f35408b.z();
                    if (la1Var.f35412r.f35971c > 0) {
                        ((kg.f) gVar.d.get(ka1Var.f35099c)).f13628n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
