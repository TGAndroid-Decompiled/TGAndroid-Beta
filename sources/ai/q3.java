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
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ha1;
import org.telegram.ui.ia1;
public final class q3 implements View.OnLongClickListener {
    public final int f1413a;
    public final Object f1414b;
    public final Object f1415c;

    public q3(int i10, Object obj, Object obj2) {
        this.f1413a = i10;
        this.f1414b = obj;
        this.f1415c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f1413a) {
            case 0:
                f6 f6Var = (f6) this.f1414b;
                jc jcVar = (jc) this.f1415c;
                c3 c3Var = f6Var.f872z3;
                if (c3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c3Var);
                    f6Var.f872z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ci.f4 f4Var = f6Var.H0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                fk0 fk0Var = f6Var.f845r3;
                if (fk0Var == null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    fk0 fk0Var2 = new fk0(2, f6Var.C2, f6Var.getContext(), R, new x3(4, f6Var.B0));
                    f6Var.f845r3 = fk0Var2;
                    fk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    f6Var.addView(f6Var.f845r3, f6Var.getChildCount() - 1, w7.x5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    f6Var.f845r3.setVisibility(8);
                    f6Var.f845r3.setDelegate(new z4(f6Var));
                    f6Var.f845r3.p(null, null, true);
                } else {
                    f6Var.bringChildToFront(fk0Var);
                    f6Var.f845r3.n();
                }
                f6Var.f845r3.setFragment(LaunchActivity.R());
                jcVar.f1102s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                f6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f1415c;
                ci.p5 p5Var = ((org.telegram.ui.Components.d0) this.f1414b).f23174n;
                if (p5Var != null) {
                    return ((Boolean) p5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.f1414b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.b1 b1Var = h8Var.X;
                b1Var.d(playbackSpeed, false);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, (org.telegram.ui.ActionBar.e6) this.f1415c));
                h8Var.F0(false);
                org.telegram.ui.ActionBar.v0 v0Var = h8Var.V;
                v0Var.setDimMenu(0.15f);
                v0Var.M(b1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                n70 n70Var = (n70) this.f1414b;
                ((ar0) this.f1415c).run();
                if (n70Var.J) {
                    n70Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f1414b;
                d dVar = (d) this.f1415c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new vc(org.telegram.ui.Components.jb.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1414b;
                ImageView imageView = (ImageView) this.f1415c;
                org.telegram.ui.ActionBar.n1 b10 = org.telegram.ui.Components.m9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f31284g1, profileActivity.f31412z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.e0(profileActivity, 3));
                    profileActivity.f31393w0 = imageView;
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
                ha1 ha1Var = (ha1) this.f1414b;
                kg.f fVar = (kg.f) this.f1415c;
                ia1 ia1Var = ha1Var.d;
                s00 s00Var = ha1Var.f34225a;
                boolean z10 = false;
                if (s00Var.f27726c) {
                    ia1Var.f();
                    ArrayList arrayList = ia1Var.f34575n;
                    ig.g gVar = ia1Var.f34573c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ha1) arrayList.get(i10)).f34225a.setChecked(false);
                        ((ha1) arrayList.get(i10)).f34226b.f13628n = false;
                        if (ia1Var.f34576r.f35095c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).f13628n = false;
                        }
                    }
                    z10 = true;
                    s00Var.setChecked(true);
                    fVar.f13628n = true;
                    ia1Var.f34572b.z();
                    if (ia1Var.f34576r.f35095c > 0) {
                        ((kg.f) gVar.d.get(ha1Var.f34227c)).f13628n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
