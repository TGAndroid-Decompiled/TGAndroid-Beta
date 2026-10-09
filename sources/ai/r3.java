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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ea1;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ka1;
import org.telegram.ui.la1;
public final class r3 implements View.OnLongClickListener {
    public final int f1650a;
    public final Object f1651b;
    public final Object f1652c;

    public r3(int i10, Object obj, Object obj2) {
        this.f1650a = i10;
        this.f1651b = obj;
        this.f1652c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f1650a) {
            case 0:
                f6 f6Var = (f6) this.f1651b;
                kc kcVar = (kc) this.f1652c;
                d3 d3Var = f6Var.f1029z3;
                if (d3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(d3Var);
                    f6Var.f1029z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ci.d4 d4Var = f6Var.H0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                kl0 kl0Var = f6Var.f1002r3;
                if (kl0Var == null) {
                    kl0 kl0Var2 = new kl0(2, f6Var.C2, f6Var.getContext(), LaunchActivity.R(), new y3(4, f6Var.B0));
                    f6Var.f1002r3 = kl0Var2;
                    kl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    f6Var.addView(f6Var.f1002r3, f6Var.getChildCount() - 1, w7.x5.a(74.0f, 0.0f, 0.0f, 12.0f, 64.0f, -2, 53));
                    f6Var.f1002r3.setVisibility(8);
                    f6Var.f1002r3.setDelegate(new a5(f6Var));
                    f6Var.f1002r3.p(null, null, true);
                } else {
                    f6Var.bringChildToFront(kl0Var);
                    f6Var.f1002r3.n();
                }
                f6Var.f1002r3.setFragment(LaunchActivity.R());
                kcVar.f1294s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                f6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f1652c;
                ci.n5 n5Var = ((org.telegram.ui.Components.d0) this.f1651b).f25538n;
                if (n5Var != null) {
                    return ((Boolean) n5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f1651b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.b1 b1Var = l8Var.X;
                b1Var.d(playbackSpeed, false);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, (org.telegram.ui.ActionBar.e6) this.f1652c));
                l8Var.F0(false);
                org.telegram.ui.ActionBar.v0 v0Var = l8Var.V;
                v0Var.setDimMenu(0.15f);
                v0Var.M(b1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                p80 p80Var = (p80) this.f1651b;
                ((ea1) this.f1652c).run();
                if (p80Var.J) {
                    p80Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f1651b;
                d dVar = (d) this.f1652c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new ad(org.telegram.ui.Components.ob.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1651b;
                ImageView imageView = (ImageView) this.f1652c;
                org.telegram.ui.ActionBar.n1 b10 = org.telegram.ui.Components.q9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f34258g1, profileActivity.f34386z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.f0(profileActivity, 3));
                    profileActivity.f34367w0 = imageView;
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
                ka1 ka1Var = (ka1) this.f1651b;
                kg.f fVar = (kg.f) this.f1652c;
                la1 la1Var = ka1Var.d;
                i10 i10Var = ka1Var.f39200a;
                boolean z10 = false;
                if (i10Var.f27183c) {
                    la1Var.f();
                    ArrayList arrayList = la1Var.f39493n;
                    ig.g gVar = la1Var.f39490c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ka1) arrayList.get(i10)).f39200a.setChecked(false);
                        ((ka1) arrayList.get(i10)).f39201b.f14852n = false;
                        if (la1Var.f39494r.f40150c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).f14852n = false;
                        }
                    }
                    z10 = true;
                    i10Var.setChecked(true);
                    fVar.f14852n = true;
                    la1Var.f39489b.z();
                    if (la1Var.f39494r.f40150c > 0) {
                        ((kg.f) gVar.d.get(ka1Var.f39202c)).f14852n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
