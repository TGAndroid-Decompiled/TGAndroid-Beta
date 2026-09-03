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
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.w91;
import org.telegram.ui.x91;
public final class g2 implements View.OnLongClickListener {
    public final int f17159a;
    public final Object f17160b;
    public final Object f17161c;

    public g2(int i10, Object obj, Object obj2) {
        this.f17159a = i10;
        this.f17160b = obj;
        this.f17161c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f17159a) {
            case 0:
                f4 f4Var = (f4) this.f17160b;
                i9 i9Var = (i9) this.f17161c;
                w1 w1Var = f4Var.f17124w3;
                if (w1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(w1Var);
                    f4Var.f17124w3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                qh.e3 e3Var = f4Var.E0;
                if (e3Var != null) {
                    e3Var.e(true);
                }
                qk0 qk0Var = f4Var.f17096o3;
                if (qk0Var == null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    qk0 qk0Var2 = new qk0(2, f4Var.f17135z2, f4Var.getContext(), R, new n2(4, f4Var.f17129y0));
                    f4Var.f17096o3 = qk0Var2;
                    qk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    f4Var.addView(f4Var.f17096o3, f4Var.getChildCount() - 1, k7.c6.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    f4Var.f17096o3.setVisibility(8);
                    f4Var.f17096o3.setDelegate(new i3(f4Var));
                    f4Var.f17096o3.p(null, null, true);
                } else {
                    f4Var.bringChildToFront(qk0Var);
                    f4Var.f17096o3.n();
                }
                f4Var.f17096o3.setFragment(LaunchActivity.R());
                i9Var.f17295s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                f4Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.f17161c;
                org.telegram.ui.Components.i iVar = ((org.telegram.ui.Components.e0) this.f17160b).f26409n;
                if (iVar != null) {
                    return ((Boolean) iVar.run(d0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.f17160b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = c8Var.U;
                c1Var.d(playbackSpeed, false);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, (org.telegram.ui.ActionBar.g6) this.f17161c));
                c8Var.F0(false);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.S;
                w0Var.setDimMenu(0.15f);
                w0Var.M(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                q70 q70Var = (q70) this.f17160b;
                ((q51) this.f17161c).run();
                if (q70Var.J) {
                    q70Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f17160b;
                b bVar = (b) this.f17161c;
                MessageObject messageObject = photoViewer.Q4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new qc(cb.a(photoViewer.B), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f17160b;
                ImageView imageView = (ImageView) this.f17161c;
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
                w91 w91Var = (w91) this.f17160b;
                yf.f fVar = (yf.f) this.f17161c;
                x91 x91Var = w91Var.d;
                t00 t00Var = w91Var.f42389a;
                boolean z4 = false;
                if (t00Var.f31228c) {
                    x91Var.f();
                    ArrayList arrayList = x91Var.f42970n;
                    wf.g gVar = x91Var.f42967c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((w91) arrayList.get(i10)).f42389a.setChecked(false);
                        ((w91) arrayList.get(i10)).f42390b.f50969n = false;
                        if (x91Var.f42971r.f43861c > 0 && i10 < gVar.d.size()) {
                            ((yf.f) gVar.d.get(i10)).f50969n = false;
                        }
                    }
                    z4 = true;
                    t00Var.setChecked(true);
                    fVar.f50969n = true;
                    x91Var.f42966b.z();
                    if (x91Var.f42971r.f43861c > 0) {
                        ((yf.f) gVar.d.get(w91Var.f42391c)).f50969n = true;
                        gVar.z();
                    }
                }
                return z4;
        }
    }
}
