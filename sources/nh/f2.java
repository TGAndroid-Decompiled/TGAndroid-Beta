package nh;

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
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.x91;
import org.telegram.ui.y91;
public final class f2 implements View.OnLongClickListener {
    public final int f15301a;
    public final Object f15302b;
    public final Object f15303c;

    public f2(int i10, Object obj, Object obj2) {
        this.f15301a = i10;
        this.f15302b = obj;
        this.f15303c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f15301a) {
            case 0:
                d4 d4Var = (d4) this.f15302b;
                i9 i9Var = (i9) this.f15303c;
                w1 w1Var = d4Var.f15232w3;
                if (w1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(w1Var);
                    d4Var.f15232w3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ph.f3 f3Var = d4Var.E0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                pk0 pk0Var = d4Var.f15204o3;
                if (pk0Var == null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    pk0 pk0Var2 = new pk0(2, d4Var.f15243z2, d4Var.getContext(), R, new m2(4, d4Var.f15237y0));
                    d4Var.f15204o3 = pk0Var2;
                    pk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    d4Var.addView(d4Var.f15204o3, d4Var.getChildCount() - 1, k7.b6.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    d4Var.f15204o3.setVisibility(8);
                    d4Var.f15204o3.setDelegate(new h3(d4Var));
                    d4Var.f15204o3.p(null, null, true);
                } else {
                    d4Var.bringChildToFront(pk0Var);
                    d4Var.f15204o3.n();
                }
                d4Var.f15204o3.setFragment(LaunchActivity.R());
                i9Var.f15468s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                d4Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.f15303c;
                org.telegram.ui.Components.i iVar = ((org.telegram.ui.Components.e0) this.f15302b).f24431n;
                if (iVar != null) {
                    return ((Boolean) iVar.run(d0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.f15302b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = c8Var.U;
                c1Var.d(playbackSpeed, false);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.f6) this.f15303c));
                c8Var.F0(false);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.S;
                w0Var.setDimMenu(0.15f);
                w0Var.M(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                p70 p70Var = (p70) this.f15302b;
                ((k41) this.f15303c).run();
                if (p70Var.J) {
                    p70Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f15302b;
                b bVar = (b) this.f15303c;
                MessageObject messageObject = photoViewer.Q4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new qc(cb.a(photoViewer.B), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f15302b;
                ImageView imageView = (ImageView) this.f15303c;
                org.telegram.ui.ActionBar.p1 b10 = org.telegram.ui.Components.h9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f32025d1, profileActivity.f32155w0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.h0(profileActivity, 3));
                    profileActivity.f32136t0 = imageView;
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
                x91 x91Var = (x91) this.f15302b;
                xf.f fVar = (xf.f) this.f15303c;
                y91 y91Var = x91Var.d;
                t00 t00Var = x91Var.f39943a;
                boolean z4 = false;
                if (t00Var.f28853c) {
                    y91Var.f();
                    ArrayList arrayList = y91Var.f40193n;
                    vf.g gVar = y91Var.f40191c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((x91) arrayList.get(i10)).f39943a.setChecked(false);
                        ((x91) arrayList.get(i10)).f39944b.f47055n = false;
                        if (y91Var.f40194r.f32528c > 0 && i10 < gVar.d.size()) {
                            ((xf.f) gVar.d.get(i10)).f47055n = false;
                        }
                    }
                    z4 = true;
                    t00Var.setChecked(true);
                    fVar.f47055n = true;
                    y91Var.f40190b.z();
                    if (y91Var.f40194r.f32528c > 0) {
                        ((xf.f) gVar.d.get(x91Var.f39945c)).f47055n = true;
                        gVar.z();
                    }
                }
                return z4;
        }
    }
}
