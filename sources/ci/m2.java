package ci;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lt;
import org.telegram.ui.y81;
import org.telegram.ui.z81;
public final class m2 implements View.OnLongClickListener {
    public final int f5604a;
    public final Object f5605b;
    public final Object f5606c;

    public m2(int i10, Object obj, Object obj2) {
        this.f5604a = i10;
        this.f5605b = obj;
        this.f5606c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f5604a) {
            case 0:
                q4 q4Var = (q4) this.f5605b;
                aa aaVar = (aa) this.f5606c;
                d2 d2Var = q4Var.f5844z3;
                if (d2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(d2Var);
                    q4Var.f5844z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ei.x3 x3Var = q4Var.H0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                dl0 dl0Var = q4Var.f5817r3;
                if (dl0Var == null) {
                    dl0 dl0Var2 = new dl0(2, q4Var.C2, q4Var.getContext(), LaunchActivity.R(), new t2(4, q4Var.B0));
                    q4Var.f5817r3 = dl0Var2;
                    dl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    q4Var.addView(q4Var.f5817r3, q4Var.getChildCount() - 1, w7.z5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    q4Var.f5817r3.setVisibility(8);
                    q4Var.f5817r3.setDelegate(new q3(q4Var));
                    q4Var.f5817r3.p(null, null, true);
                } else {
                    q4Var.bringChildToFront(dl0Var);
                    q4Var.f5817r3.n();
                }
                q4Var.f5817r3.setFragment(LaunchActivity.R());
                aaVar.f5214s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                q4Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f5606c;
                ei.e5 e5Var = ((org.telegram.ui.Components.d0) this.f5605b).f25296n;
                if (e5Var != null) {
                    return ((Boolean) e5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.f5605b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.a1 a1Var = k8Var.X;
                a1Var.d(playbackSpeed, false);
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, (org.telegram.ui.ActionBar.d6) this.f5606c));
                k8Var.F0(false);
                org.telegram.ui.ActionBar.u0 u0Var = k8Var.V;
                u0Var.setDimMenu(0.15f);
                u0Var.M(a1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                i80 i80Var = (i80) this.f5605b;
                ((lt) this.f5606c).run();
                if (i80Var.J) {
                    i80Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f5605b;
                b bVar = (b) this.f5606c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new xc(lb.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f5605b;
                ImageView imageView = (ImageView) this.f5606c;
                org.telegram.ui.ActionBar.m1 b10 = org.telegram.ui.Components.o9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f33633h1, profileActivity.A0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.f0(profileActivity, 3));
                    profileActivity.f33744x0 = imageView;
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
                y81 y81Var = (y81) this.f5605b;
                lg.f fVar = (lg.f) this.f5606c;
                z81 z81Var = y81Var.d;
                a10 a10Var = y81Var.f43395a;
                boolean z10 = false;
                if (a10Var.f24451c) {
                    z81Var.f();
                    ArrayList arrayList = z81Var.f43674n;
                    jg.g gVar = z81Var.f43672c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((y81) arrayList.get(i10)).f43395a.setChecked(false);
                        ((y81) arrayList.get(i10)).f43396b.f16063n = false;
                        if (z81Var.f43675r.f35543c > 0 && i10 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i10)).f16063n = false;
                        }
                    }
                    z10 = true;
                    a10Var.setChecked(true);
                    fVar.f16063n = true;
                    z81Var.f43671b.z();
                    if (z81Var.f43675r.f35543c > 0) {
                        ((lg.f) gVar.d.get(y81Var.f43397c)).f16063n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
