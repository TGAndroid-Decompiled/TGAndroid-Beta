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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cu;
import org.telegram.ui.ea1;
import org.telegram.ui.fa1;
public final class q3 implements View.OnLongClickListener {
    public final int f1539a;
    public final Object f1540b;
    public final Object f1541c;

    public q3(int i10, Object obj, Object obj2) {
        this.f1539a = i10;
        this.f1540b = obj;
        this.f1541c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f1539a) {
            case 0:
                e6 e6Var = (e6) this.f1540b;
                jc jcVar = (jc) this.f1541c;
                c3 c3Var = e6Var.f918z3;
                if (c3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c3Var);
                    e6Var.f918z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ci.e4 e4Var = e6Var.H0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                sk0 sk0Var = e6Var.f891r3;
                if (sk0Var == null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    sk0 sk0Var2 = new sk0(2, e6Var.C2, e6Var.getContext(), R, new x3(4, e6Var.B0));
                    e6Var.f891r3 = sk0Var2;
                    sk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    e6Var.addView(e6Var.f891r3, e6Var.getChildCount() - 1, w7.z5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    e6Var.f891r3.setVisibility(8);
                    e6Var.f891r3.setDelegate(new z4(e6Var));
                    e6Var.f891r3.p(null, null, true);
                } else {
                    e6Var.bringChildToFront(sk0Var);
                    e6Var.f891r3.n();
                }
                e6Var.f891r3.setFragment(LaunchActivity.R());
                jcVar.f1185s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                e6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f1541c;
                ci.o5 o5Var = ((org.telegram.ui.Components.d0) this.f1540b).f25495n;
                if (o5Var != null) {
                    return ((Boolean) o5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f1540b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.b1 b1Var = j8Var.X;
                b1Var.d(playbackSpeed, false);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, (org.telegram.ui.ActionBar.d6) this.f1541c));
                j8Var.F0(false);
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.V;
                v0Var.setDimMenu(0.15f);
                v0Var.M(b1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                b80 b80Var = (b80) this.f1540b;
                ((cu) this.f1541c).run();
                if (b80Var.J) {
                    b80Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f1540b;
                d dVar = (d) this.f1541c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new yc(org.telegram.ui.Components.mb.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1540b;
                ImageView imageView = (ImageView) this.f1541c;
                org.telegram.ui.ActionBar.n1 b10 = org.telegram.ui.Components.o9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f34248g1, profileActivity.f34376z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.f0(profileActivity, 3));
                    profileActivity.f34357w0 = imageView;
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
                ea1 ea1Var = (ea1) this.f1540b;
                kg.f fVar = (kg.f) this.f1541c;
                fa1 fa1Var = ea1Var.d;
                v00 v00Var = ea1Var.f35969a;
                boolean z10 = false;
                if (v00Var.f31479c) {
                    fa1Var.f();
                    ArrayList arrayList = fa1Var.f36234n;
                    ig.g gVar = fa1Var.f36231c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ea1) arrayList.get(i10)).f35969a.setChecked(false);
                        ((ea1) arrayList.get(i10)).f35970b.f14804n = false;
                        if (fa1Var.f36235r.f37017c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).f14804n = false;
                        }
                    }
                    z10 = true;
                    v00Var.setChecked(true);
                    fVar.f14804n = true;
                    fa1Var.f36230b.z();
                    if (fa1Var.f36235r.f37017c > 0) {
                        ((kg.f) gVar.d.get(ea1Var.f35971c)).f14804n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
