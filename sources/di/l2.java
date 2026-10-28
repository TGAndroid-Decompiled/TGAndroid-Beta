package di;

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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h91;
import org.telegram.ui.i91;
public final class l2 implements View.OnLongClickListener {
    public final int f8752a;
    public final Object f8753b;
    public final Object f8754c;

    public l2(int i10, Object obj, Object obj2) {
        this.f8752a = i10;
        this.f8753b = obj;
        this.f8754c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f8752a;
        Object obj = this.f8754c;
        Object obj2 = this.f8753b;
        switch (i10) {
            case 0:
                q4 q4Var = (q4) obj2;
                y9 y9Var = (y9) obj;
                c2 c2Var = q4Var.f9009o3;
                if (c2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c2Var);
                    q4Var.f9009o3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                fi.v3 v3Var = q4Var.f9038w0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                gl0 gl0Var = q4Var.f8983g3;
                if (gl0Var == null) {
                    gl0 gl0Var2 = new gl0(2, q4Var.f9020r2, q4Var.getContext(), LaunchActivity.R(), new s2(4, q4Var.f9014q0));
                    q4Var.f8983g3 = gl0Var2;
                    gl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    q4Var.addView(q4Var.f8983g3, q4Var.getChildCount() - 1, kb1.h(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    q4Var.f8983g3.setVisibility(8);
                    q4Var.f8983g3.setDelegate(new p3(q4Var));
                    q4Var.f8983g3.p(null, null, true);
                } else {
                    q4Var.bringChildToFront(gl0Var);
                    q4Var.f8983g3.n();
                }
                q4Var.f8983g3.setFragment(LaunchActivity.R());
                y9Var.f9455s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                q4Var.Z0(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                fi.d5 d5Var = ((org.telegram.ui.Components.d0) obj2).f27306n;
                if (d5Var == null) {
                    return false;
                }
                return ((Boolean) d5Var.run(c0Var)).booleanValue();
            case 2:
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) obj2;
                m8Var.getClass();
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = m8Var.W;
                c1Var.e(playbackSpeed, false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, c1Var, (org.telegram.ui.ActionBar.u6) obj);
                m8Var.L0(false);
                org.telegram.ui.ActionBar.w0 w0Var = m8Var.U;
                w0Var.setDimMenu(0.15f);
                w0Var.U(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                l80 l80Var = (l80) obj2;
                ((d71) obj).run();
                if (l80Var.J) {
                    l80Var.u();
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                b bVar = (b) obj;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new wc(lb.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                int i11 = ProfileActivity.R6;
                org.telegram.ui.ActionBar.o1 b10 = org.telegram.ui.Components.q9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f36018g1, profileActivity.f36150z0);
                if (b10 == null) {
                    return false;
                }
                b10.setOnDismissListener(new org.telegram.ui.e0(profileActivity, 3));
                profileActivity.f36128w0 = imageView;
                profileActivity.Q3(0.3f);
                UndoView undoView = profileActivity.L;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                return true;
            default:
                h91 h91Var = (h91) obj2;
                mg.f fVar = (mg.f) obj;
                i91 i91Var = h91Var.d;
                a10 a10Var = h91Var.f39831a;
                if (!a10Var.f26391c) {
                    return false;
                }
                i91Var.f();
                ArrayList arrayList = i91Var.f40075n;
                kg.h hVar = i91Var.f40073c;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((h91) arrayList.get(i12)).f39831a.setChecked(false);
                    ((h91) arrayList.get(i12)).f39832b.f18474n = false;
                    if (i91Var.f40076r.f40706c > 0 && i12 < hVar.d.size()) {
                        ((mg.f) hVar.d.get(i12)).f18474n = false;
                    }
                }
                a10Var.setChecked(true);
                fVar.f18474n = true;
                i91Var.f40072b.z();
                if (i91Var.f40076r.f40706c > 0) {
                    ((mg.f) hVar.d.get(h91Var.f39833c)).f18474n = true;
                    hVar.z();
                }
                return true;
        }
    }
}
