package bi;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qa1;
import org.telegram.ui.ra1;
public final class g3 implements View.OnLongClickListener {
    public final int f3077a;
    public final Object f3078b;
    public final Object f3079c;

    public g3(int i10, Object obj, Object obj2) {
        this.f3077a = i10;
        this.f3078b = obj;
        this.f3079c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f3077a) {
            case 0:
                q5 q5Var = (q5) this.f3078b;
                sb sbVar = (sb) this.f3079c;
                r2 r2Var = q5Var.f3590z3;
                if (r2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(r2Var);
                    q5Var.f3590z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                di.d4 d4Var = q5Var.H0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                gl0 gl0Var = q5Var.f3563r3;
                if (gl0Var == null) {
                    gl0 gl0Var2 = new gl0(2, q5Var.C2, q5Var.getContext(), LaunchActivity.R(), new n3(4, q5Var.B0));
                    q5Var.f3563r3 = gl0Var2;
                    gl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    q5Var.addView(q5Var.f3563r3, q5Var.getChildCount() - 1, w7.z5.a(74.0f, 0.0f, 0.0f, 12.0f, 64.0f, -2, 53));
                    q5Var.f3563r3.setVisibility(8);
                    q5Var.f3563r3.setDelegate(new n4(q5Var));
                    q5Var.f3563r3.p(null, null, true);
                } else {
                    q5Var.bringChildToFront(gl0Var);
                    q5Var.f3563r3.n();
                }
                q5Var.f3563r3.setFragment(LaunchActivity.R());
                sbVar.f3704s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                q5Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f3079c;
                di.n5 n5Var = ((org.telegram.ui.Components.d0) this.f3078b).f23922n;
                if (n5Var != null) {
                    return ((Boolean) n5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) this.f3078b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.a1 a1Var = m8Var.X;
                a1Var.d(playbackSpeed, false);
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, (org.telegram.ui.ActionBar.c6) this.f3079c));
                m8Var.F0(false);
                org.telegram.ui.ActionBar.u0 u0Var = m8Var.V;
                u0Var.setDimMenu(0.15f);
                u0Var.M(a1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                l80 l80Var = (l80) this.f3078b;
                ((n51) this.f3079c).run();
                if (l80Var.J) {
                    l80Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f3078b;
                b bVar = (b) this.f3079c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new zc(org.telegram.ui.Components.nb.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f3078b;
                ImageView imageView = (ImageView) this.f3079c;
                org.telegram.ui.ActionBar.m1 b10 = org.telegram.ui.Components.r9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f32276g1, profileActivity.f32405z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.f0(profileActivity, 3));
                    profileActivity.f32386w0 = imageView;
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
                qa1 qa1Var = (qa1) this.f3078b;
                lg.f fVar = (lg.f) this.f3079c;
                ra1 ra1Var = qa1Var.d;
                e10 e10Var = qa1Var.f39086a;
                boolean z10 = false;
                if (e10Var.f24248c) {
                    ra1Var.f();
                    ArrayList arrayList = ra1Var.f39441n;
                    jg.g gVar = ra1Var.f39439c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((qa1) arrayList.get(i10)).f39086a.setChecked(false);
                        ((qa1) arrayList.get(i10)).f39087b.f14720n = false;
                        if (ra1Var.f39442r.f40051c > 0 && i10 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i10)).f14720n = false;
                        }
                    }
                    z10 = true;
                    e10Var.setChecked(true);
                    fVar.f14720n = true;
                    ra1Var.f39438b.z();
                    if (ra1Var.f39442r.f40051c > 0) {
                        ((lg.f) gVar.d.get(qa1Var.f39088c)).f14720n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
