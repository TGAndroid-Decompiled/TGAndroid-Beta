package jh;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a91;
import org.telegram.ui.z81;

public final class f2 implements View.OnLongClickListener {

    public final int f13316a;

    public final Object f13317b;

    public final Object f13318c;

    public f2(int i10, Object obj, Object obj2) {
        this.f13316a = i10;
        this.f13317b = obj;
        this.f13318c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f13316a) {
            case 0:
                e4 e4Var = (e4) this.f13317b;
                i9 i9Var = (i9) this.f13318c;
                v1 v1Var = e4Var.f13285v3;
                if (v1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(v1Var);
                    e4Var.f13285v3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                lh.w3 w3Var = e4Var.D0;
                if (w3Var != null) {
                    w3Var.e(true);
                }
                wj0 wj0Var = e4Var.f13257n3;
                if (wj0Var == null) {
                    org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                    wj0 wj0Var2 = new wj0(2, e4Var.f13296y2, e4Var.getContext(), n2VarR, new m2(4, e4Var.f13290x0));
                    e4Var.f13257n3 = wj0Var2;
                    wj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    e4Var.addView(e4Var.f13257n3, e4Var.getChildCount() - 1, h7.z5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    e4Var.f13257n3.setVisibility(8);
                    e4Var.f13257n3.setDelegate(new i3(e4Var));
                    e4Var.f13257n3.p(null, null, true);
                } else {
                    e4Var.bringChildToFront(wj0Var);
                    e4Var.f13257n3.n();
                }
                e4Var.f13257n3.setFragment(LaunchActivity.R());
                i9Var.f13505s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                e4Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.f13317b;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f13318c;
                lh.e5 e5Var = d0Var.f27589n;
                if (e5Var != null) {
                    return ((Boolean) e5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.f13317b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f13318c;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.b1 b1Var = b8Var.T;
                b1Var.d(playbackSpeed, false);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
                b8Var.F0(false);
                org.telegram.ui.ActionBar.v0 v0Var = b8Var.R;
                v0Var.setDimMenu(0.15f);
                v0Var.M(b1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                b70 b70Var = (b70) this.f13317b;
                ((r61) this.f13318c).run();
                if (!b70Var.J) {
                    return true;
                }
                b70Var.u();
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f13317b;
                b bVar = (b) this.f13318c;
                MessageObject messageObject = photoViewer.P4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new mc(ab.a(photoViewer.A), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f13317b;
                ImageView imageView = (ImageView) this.f13318c;
                org.telegram.ui.ActionBar.n1 n1VarB = org.telegram.ui.Components.f9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f35937c1, profileActivity.f36067v0);
                if (n1VarB == null) {
                    return false;
                }
                n1VarB.setOnDismissListener(new org.telegram.ui.h0(profileActivity, 3));
                profileActivity.f36049s0 = imageView;
                profileActivity.H3(0.3f);
                UndoView undoView = profileActivity.I;
                if (undoView == null) {
                    return true;
                }
                undoView.e(1, true);
                return true;
            default:
                z81 z81Var = (z81) this.f13317b;
                tf.f fVar = (tf.f) this.f13318c;
                a91 a91Var = z81Var.d;
                g00 g00Var = z81Var.f45104a;
                boolean z10 = false;
                if (g00Var.f28482c) {
                    a91Var.f();
                    ArrayList arrayList = a91Var.f36468n;
                    rf.g gVar = a91Var.f36465c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((z81) arrayList.get(i10)).f45104a.setChecked(false);
                        ((z81) arrayList.get(i10)).f45105b.f48206n = false;
                        if (a91Var.f36469r.f37023c > 0 && i10 < gVar.d.size()) {
                            ((tf.f) gVar.d.get(i10)).f48206n = false;
                        }
                    }
                    z10 = true;
                    g00Var.setChecked(true);
                    fVar.f48206n = true;
                    a91Var.f36464b.z();
                    if (a91Var.f36469r.f37023c > 0) {
                        ((tf.f) gVar.d.get(z81Var.f45106c)).f48206n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
