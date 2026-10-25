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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f91;
import org.telegram.ui.g91;
public final class l2 implements View.OnLongClickListener {
    public final int f8753a;
    public final Object f8754b;
    public final Object f8755c;

    public l2(int i10, Object obj, Object obj2) {
        this.f8753a = i10;
        this.f8754b = obj;
        this.f8755c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f8753a;
        Object obj = this.f8755c;
        Object obj2 = this.f8754b;
        switch (i10) {
            case 0:
                q4 q4Var = (q4) obj2;
                y9 y9Var = (y9) obj;
                c2 c2Var = q4Var.f9010o3;
                if (c2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c2Var);
                    q4Var.f9010o3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                fi.v3 v3Var = q4Var.f9039w0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                fl0 fl0Var = q4Var.f8984g3;
                if (fl0Var == null) {
                    fl0 fl0Var2 = new fl0(2, q4Var.f9021r2, q4Var.getContext(), LaunchActivity.R(), new s2(4, q4Var.f9015q0));
                    q4Var.f8984g3 = fl0Var2;
                    fl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    q4Var.addView(q4Var.f8984g3, q4Var.getChildCount() - 1, gb1.h(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    q4Var.f8984g3.setVisibility(8);
                    q4Var.f8984g3.setDelegate(new p3(q4Var));
                    q4Var.f8984g3.p(null, null, true);
                } else {
                    q4Var.bringChildToFront(fl0Var);
                    q4Var.f8984g3.n();
                }
                q4Var.f8984g3.setFragment(LaunchActivity.R());
                y9Var.f9456s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                q4Var.Z0(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                fi.d5 d5Var = ((org.telegram.ui.Components.d0) obj2).f27322n;
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
                k80 k80Var = (k80) obj2;
                ((c71) obj).run();
                if (k80Var.J) {
                    k80Var.u();
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
                org.telegram.ui.ActionBar.o1 b10 = org.telegram.ui.Components.q9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f35991g1, profileActivity.f36123z0);
                if (b10 == null) {
                    return false;
                }
                b10.setOnDismissListener(new org.telegram.ui.e0(profileActivity, 3));
                profileActivity.f36101w0 = imageView;
                profileActivity.Q3(0.3f);
                UndoView undoView = profileActivity.L;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                return true;
            default:
                f91 f91Var = (f91) obj2;
                mg.f fVar = (mg.f) obj;
                g91 g91Var = f91Var.d;
                a10 a10Var = f91Var.f39314a;
                if (!a10Var.f26379c) {
                    return false;
                }
                g91Var.f();
                ArrayList arrayList = g91Var.f39572n;
                kg.h hVar = g91Var.f39570c;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((f91) arrayList.get(i12)).f39314a.setChecked(false);
                    ((f91) arrayList.get(i12)).f39315b.f18475n = false;
                    if (g91Var.f39573r.f40185c > 0 && i12 < hVar.d.size()) {
                        ((mg.f) hVar.d.get(i12)).f18475n = false;
                    }
                }
                a10Var.setChecked(true);
                fVar.f18475n = true;
                g91Var.f39569b.z();
                if (g91Var.f39573r.f40185c > 0) {
                    ((mg.f) hVar.d.get(f91Var.f39316c)).f18475n = true;
                    hVar.z();
                }
                return true;
        }
    }
}
