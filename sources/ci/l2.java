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
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c91;
import org.telegram.ui.d91;
import org.telegram.ui.ot;
public final class l2 implements View.OnLongClickListener {
    public final int f5510a;
    public final Object f5511b;
    public final Object f5512c;

    public l2(int i10, Object obj, Object obj2) {
        this.f5510a = i10;
        this.f5511b = obj;
        this.f5512c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f5510a) {
            case 0:
                p4 p4Var = (p4) this.f5511b;
                z9 z9Var = (z9) this.f5512c;
                c2 c2Var = p4Var.f5731z3;
                if (c2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c2Var);
                    p4Var.f5731z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ei.x3 x3Var = p4Var.H0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                fl0 fl0Var = p4Var.f5704r3;
                if (fl0Var == null) {
                    fl0 fl0Var2 = new fl0(2, p4Var.C2, p4Var.getContext(), LaunchActivity.R(), new s2(4, p4Var.B0));
                    p4Var.f5704r3 = fl0Var2;
                    fl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    p4Var.addView(p4Var.f5704r3, p4Var.getChildCount() - 1, w7.z5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    p4Var.f5704r3.setVisibility(8);
                    p4Var.f5704r3.setDelegate(new p3(p4Var));
                    p4Var.f5704r3.p(null, null, true);
                } else {
                    p4Var.bringChildToFront(fl0Var);
                    p4Var.f5704r3.n();
                }
                p4Var.f5704r3.setFragment(LaunchActivity.R());
                z9Var.f6260s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                p4Var.a1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f5512c;
                ei.e5 e5Var = ((org.telegram.ui.Components.d0) this.f5511b).f25505n;
                if (e5Var != null) {
                    return ((Boolean) e5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) this.f5511b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.a1 a1Var = i8Var.W;
                a1Var.e(playbackSpeed, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, a1Var, (org.telegram.ui.ActionBar.g6) this.f5512c);
                i8Var.L0(false);
                org.telegram.ui.ActionBar.u0 u0Var = i8Var.U;
                u0Var.setDimMenu(0.15f);
                u0Var.M(a1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                h80 h80Var = (h80) this.f5511b;
                ((ot) this.f5512c).run();
                if (h80Var.J) {
                    h80Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f5511b;
                b bVar = (b) this.f5512c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new vc(jb.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f5511b;
                ImageView imageView = (ImageView) this.f5512c;
                org.telegram.ui.ActionBar.m1 b10 = org.telegram.ui.Components.m9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f33937h1, profileActivity.A0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.e0(profileActivity, 3));
                    profileActivity.f34048x0 = imageView;
                    profileActivity.J3(0.3f);
                    UndoView undoView = profileActivity.M;
                    if (undoView == null) {
                        return true;
                    }
                    undoView.d(1, true);
                    return true;
                }
                return false;
            default:
                c91 c91Var = (c91) this.f5511b;
                lg.f fVar = (lg.f) this.f5512c;
                d91 d91Var = c91Var.d;
                y00 y00Var = c91Var.f36275a;
                boolean z10 = false;
                if (y00Var.f32766c) {
                    d91Var.f();
                    ArrayList arrayList = d91Var.f36543n;
                    jg.g gVar = d91Var.f36541c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((c91) arrayList.get(i10)).f36275a.setChecked(false);
                        ((c91) arrayList.get(i10)).f36276b.f16126n = false;
                        if (d91Var.f36544r.f37245c > 0 && i10 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i10)).f16126n = false;
                        }
                    }
                    z10 = true;
                    y00Var.setChecked(true);
                    fVar.f16126n = true;
                    d91Var.f36540b.z();
                    if (d91Var.f36544r.f37245c > 0) {
                        ((lg.f) gVar.d.get(c91Var.f36277c)).f16126n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
