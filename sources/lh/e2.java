package lh;

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
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c91;
import org.telegram.ui.d91;
public final class e2 implements View.OnLongClickListener {
    public final int f15574a;
    public final Object f15575b;
    public final Object f15576c;

    public e2(int i10, Object obj, Object obj2) {
        this.f15574a = i10;
        this.f15575b = obj;
        this.f15576c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f15574a) {
            case 0:
                d4 d4Var = (d4) this.f15575b;
                i9 i9Var = (i9) this.f15576c;
                v1 v1Var = d4Var.f15534v3;
                if (v1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(v1Var);
                    d4Var.f15534v3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                nh.t3 t3Var = d4Var.D0;
                if (t3Var != null) {
                    t3Var.e(true);
                }
                fk0 fk0Var = d4Var.f15506n3;
                if (fk0Var == null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    fk0 fk0Var2 = new fk0(2, d4Var.f15545y2, d4Var.getContext(), R, new l2(4, d4Var.f15539x0));
                    d4Var.f15506n3 = fk0Var2;
                    fk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    d4Var.addView(d4Var.f15506n3, d4Var.getChildCount() - 1, i7.f6.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    d4Var.f15506n3.setVisibility(8);
                    d4Var.f15506n3.setDelegate(new g3(d4Var));
                    d4Var.f15506n3.p(null, null, true);
                } else {
                    d4Var.bringChildToFront(fk0Var);
                    d4Var.f15506n3.n();
                }
                d4Var.f15506n3.setFragment(LaunchActivity.R());
                i9Var.f15783s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                d4Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f15576c;
                nh.v4 v4Var = ((org.telegram.ui.Components.f0) this.f15575b).f28224n;
                if (v4Var != null) {
                    return ((Boolean) v4Var.run(e0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.f15575b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = g8Var.T;
                c1Var.d(playbackSpeed, false);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, (org.telegram.ui.ActionBar.c6) this.f15576c));
                g8Var.F0(false);
                org.telegram.ui.ActionBar.w0 w0Var = g8Var.R;
                w0Var.setDimMenu(0.15f);
                w0Var.M(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                j70 j70Var = (j70) this.f15575b;
                ((org.telegram.ui.Components.voip.o) this.f15576c).run();
                if (j70Var.J) {
                    j70Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f15575b;
                b bVar = (b) this.f15576c;
                MessageObject messageObject = photoViewer.P4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new tc(hb.a(photoViewer.A), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f15575b;
                ImageView imageView = (ImageView) this.f15576c;
                org.telegram.ui.ActionBar.o1 b10 = org.telegram.ui.Components.l9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f36001c1, profileActivity.f36129v0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.h0(profileActivity, 3));
                    profileActivity.f36111s0 = imageView;
                    profileActivity.H3(0.3f);
                    UndoView undoView = profileActivity.I;
                    if (undoView == null) {
                        return true;
                    }
                    undoView.e(1, true);
                    return true;
                }
                return false;
            default:
                c91 c91Var = (c91) this.f15575b;
                vf.f fVar = (vf.f) this.f15576c;
                d91 d91Var = c91Var.d;
                o00 o00Var = c91Var.f37056a;
                boolean z10 = false;
                if (o00Var.f31207c) {
                    d91Var.f();
                    ArrayList arrayList = d91Var.f37429n;
                    tf.g gVar = d91Var.f37426c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((c91) arrayList.get(i10)).f37056a.setChecked(false);
                        ((c91) arrayList.get(i10)).f37057b.f49583n = false;
                        if (d91Var.f37430r.f38071c > 0 && i10 < gVar.d.size()) {
                            ((vf.f) gVar.d.get(i10)).f49583n = false;
                        }
                    }
                    z10 = true;
                    o00Var.setChecked(true);
                    fVar.f49583n = true;
                    d91Var.f37425b.z();
                    if (d91Var.f37430r.f38071c > 0) {
                        ((vf.f) gVar.d.get(c91Var.f37058c)).f49583n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
