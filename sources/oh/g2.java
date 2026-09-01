package oh;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q91;
import org.telegram.ui.r91;
public final class g2 implements View.OnLongClickListener {
    public final int f17157a;
    public final Object f17158b;
    public final Object f17159c;

    public g2(int i10, Object obj, Object obj2) {
        this.f17157a = i10;
        this.f17158b = obj;
        this.f17159c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f17157a) {
            case 0:
                f4 f4Var = (f4) this.f17158b;
                i9 i9Var = (i9) this.f17159c;
                w1 w1Var = f4Var.f17122w3;
                if (w1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(w1Var);
                    f4Var.f17122w3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                qh.f3 f3Var = f4Var.E0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                rk0 rk0Var = f4Var.f17094o3;
                if (rk0Var == null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    rk0 rk0Var2 = new rk0(2, f4Var.f17133z2, f4Var.getContext(), R, new n2(4, f4Var.f17127y0));
                    f4Var.f17094o3 = rk0Var2;
                    rk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    f4Var.addView(f4Var.f17094o3, f4Var.getChildCount() - 1, k7.c6.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    f4Var.f17094o3.setVisibility(8);
                    f4Var.f17094o3.setDelegate(new i3(f4Var));
                    f4Var.f17094o3.p(null, null, true);
                } else {
                    f4Var.bringChildToFront(rk0Var);
                    f4Var.f17094o3.n();
                }
                f4Var.f17094o3.setFragment(LaunchActivity.R());
                i9Var.f17293s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                f4Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.f17159c;
                org.telegram.ui.Components.i iVar = ((org.telegram.ui.Components.e0) this.f17158b).f26360n;
                if (iVar != null) {
                    return ((Boolean) iVar.run(d0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.f17158b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = c8Var.U;
                c1Var.d(playbackSpeed, false);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, (org.telegram.ui.ActionBar.g6) this.f17159c));
                c8Var.F0(false);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.S;
                w0Var.setDimMenu(0.15f);
                w0Var.M(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                q70 q70Var = (q70) this.f17158b;
                ((l41) this.f17159c).run();
                if (q70Var.J) {
                    q70Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f17158b;
                b bVar = (b) this.f17159c;
                MessageObject messageObject = photoViewer.Q4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new qc(cb.a(photoViewer.B), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f17158b;
                ImageView imageView = (ImageView) this.f17159c;
                org.telegram.ui.ActionBar.p1 b10 = org.telegram.ui.Components.h9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f34583d1, profileActivity.f34714w0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.g0(profileActivity, 3));
                    profileActivity.f34695t0 = imageView;
                    profileActivity.H3(0.3f);
                    UndoView undoView = profileActivity.J;
                    if (undoView == null) {
                        return true;
                    }
                    undoView.e(1, true);
                    return true;
                }
                return false;
            default:
                q91 q91Var = (q91) this.f17158b;
                yf.f fVar = (yf.f) this.f17159c;
                r91 r91Var = q91Var.d;
                t00 t00Var = q91Var.f40414a;
                boolean z4 = false;
                if (t00Var.f31216c) {
                    r91Var.f();
                    ArrayList arrayList = r91Var.f40872n;
                    wf.g gVar = r91Var.f40869c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((q91) arrayList.get(i10)).f40414a.setChecked(false);
                        ((q91) arrayList.get(i10)).f40415b.f50933n = false;
                        if (r91Var.f40873r.f41544c > 0 && i10 < gVar.d.size()) {
                            ((yf.f) gVar.d.get(i10)).f50933n = false;
                        }
                    }
                    z4 = true;
                    t00Var.setChecked(true);
                    fVar.f50933n = true;
                    r91Var.f40868b.z();
                    if (r91Var.f40873r.f41544c > 0) {
                        ((yf.f) gVar.d.get(q91Var.f40416c)).f50933n = true;
                        gVar.z();
                    }
                }
                return z4;
        }
    }
}
