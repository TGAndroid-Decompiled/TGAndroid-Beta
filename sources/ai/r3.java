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
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ma1;
import org.telegram.ui.na1;
public final class r3 implements View.OnLongClickListener {
    public final int f1648a;
    public final Object f1649b;
    public final Object f1650c;

    public r3(int i10, Object obj, Object obj2) {
        this.f1648a = i10;
        this.f1649b = obj;
        this.f1650c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f1648a) {
            case 0:
                f6 f6Var = (f6) this.f1649b;
                kc kcVar = (kc) this.f1650c;
                d3 d3Var = f6Var.f1027z3;
                if (d3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(d3Var);
                    f6Var.f1027z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ci.d4 d4Var = f6Var.H0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                nl0 nl0Var = f6Var.f1000r3;
                if (nl0Var == null) {
                    nl0 nl0Var2 = new nl0(2, f6Var.C2, f6Var.getContext(), LaunchActivity.R(), new y3(4, f6Var.B0));
                    f6Var.f1000r3 = nl0Var2;
                    nl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    f6Var.addView(f6Var.f1000r3, f6Var.getChildCount() - 1, w7.w5.a(74.0f, 0.0f, 0.0f, 12.0f, 64.0f, -2, 53));
                    f6Var.f1000r3.setVisibility(8);
                    f6Var.f1000r3.setDelegate(new a5(f6Var));
                    f6Var.f1000r3.p(null, null, true);
                } else {
                    f6Var.bringChildToFront(nl0Var);
                    f6Var.f1000r3.n();
                }
                f6Var.f1000r3.setFragment(LaunchActivity.R());
                kcVar.f1292s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                f6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f1650c;
                ci.n5 n5Var = ((org.telegram.ui.Components.d0) this.f1649b).f25062n;
                if (n5Var != null) {
                    return ((Boolean) n5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f1649b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.a1 a1Var = l8Var.X;
                a1Var.d(playbackSpeed, false);
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, (org.telegram.ui.ActionBar.c6) this.f1650c));
                l8Var.F0(false);
                org.telegram.ui.ActionBar.u0 u0Var = l8Var.V;
                u0Var.setDimMenu(0.15f);
                u0Var.M(a1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                s80 s80Var = (s80) this.f1649b;
                ((org.telegram.ui.Components.voip.p) this.f1650c).run();
                if (s80Var.J) {
                    s80Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f1649b;
                d dVar = (d) this.f1650c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new zc(org.telegram.ui.Components.nb.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1649b;
                ImageView imageView = (ImageView) this.f1650c;
                org.telegram.ui.ActionBar.m1 b10 = org.telegram.ui.Components.q9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f34097g1, profileActivity.f34225z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.f0(profileActivity, 3));
                    profileActivity.f34206w0 = imageView;
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
                ma1 ma1Var = (ma1) this.f1649b;
                kg.f fVar = (kg.f) this.f1650c;
                na1 na1Var = ma1Var.d;
                l10 l10Var = ma1Var.f39982a;
                boolean z10 = false;
                if (l10Var.f27976c) {
                    na1Var.f();
                    ArrayList arrayList = na1Var.f40344n;
                    ig.g gVar = na1Var.f40341c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ma1) arrayList.get(i10)).f39982a.setChecked(false);
                        ((ma1) arrayList.get(i10)).f39983b.f14849n = false;
                        if (na1Var.f40345r.f40894c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).f14849n = false;
                        }
                    }
                    z10 = true;
                    l10Var.setChecked(true);
                    fVar.f14849n = true;
                    na1Var.f40340b.z();
                    if (na1Var.f40345r.f40894c > 0) {
                        ((kg.f) gVar.d.get(ma1Var.f39984c)).f14849n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
