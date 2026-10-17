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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a91;
import org.telegram.ui.b91;
import org.telegram.ui.nt;
public final class m2 implements View.OnLongClickListener {
    public final int f5606a;
    public final Object f5607b;
    public final Object f5608c;

    public m2(int i10, Object obj, Object obj2) {
        this.f5606a = i10;
        this.f5607b = obj;
        this.f5608c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f5606a) {
            case 0:
                q4 q4Var = (q4) this.f5607b;
                aa aaVar = (aa) this.f5608c;
                d2 d2Var = q4Var.f5846z3;
                if (d2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(d2Var);
                    q4Var.f5846z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ei.x3 x3Var = q4Var.H0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                cl0 cl0Var = q4Var.f5819r3;
                if (cl0Var == null) {
                    cl0 cl0Var2 = new cl0(2, q4Var.C2, q4Var.getContext(), LaunchActivity.R(), new t2(4, q4Var.B0));
                    q4Var.f5819r3 = cl0Var2;
                    cl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    q4Var.addView(q4Var.f5819r3, q4Var.getChildCount() - 1, w7.z5.a(74.0f, 0.0f, 0.0f, 12.0f, 64.0f, -2, 53));
                    q4Var.f5819r3.setVisibility(8);
                    q4Var.f5819r3.setDelegate(new q3(q4Var));
                    q4Var.f5819r3.p(null, null, true);
                } else {
                    q4Var.bringChildToFront(cl0Var);
                    q4Var.f5819r3.n();
                }
                q4Var.f5819r3.setFragment(LaunchActivity.R());
                aaVar.f5216s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                q4Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.f5608c;
                ei.e5 e5Var = ((org.telegram.ui.Components.d0) this.f5607b).f25415n;
                if (e5Var != null) {
                    return ((Boolean) e5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.f5607b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.a1 a1Var = k8Var.X;
                a1Var.d(playbackSpeed, false);
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, (org.telegram.ui.ActionBar.d6) this.f5608c));
                k8Var.F0(false);
                org.telegram.ui.ActionBar.u0 u0Var = k8Var.V;
                u0Var.setDimMenu(0.15f);
                u0Var.M(a1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                i80 i80Var = (i80) this.f5607b;
                ((nt) this.f5608c).run();
                if (i80Var.J) {
                    i80Var.u();
                    return true;
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f5607b;
                b bVar = (b) this.f5608c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new xc(lb.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f5607b;
                ImageView imageView = (ImageView) this.f5608c;
                org.telegram.ui.ActionBar.m1 b10 = org.telegram.ui.Components.o9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f33621h1, profileActivity.A0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.f0(profileActivity, 3));
                    profileActivity.f33732x0 = imageView;
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
                a91 a91Var = (a91) this.f5607b;
                lg.f fVar = (lg.f) this.f5608c;
                b91 b91Var = a91Var.d;
                a10 a10Var = a91Var.f35343a;
                boolean z10 = false;
                if (a10Var.f24448c) {
                    b91Var.f();
                    ArrayList arrayList = b91Var.f35608n;
                    jg.g gVar = b91Var.f35606c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((a91) arrayList.get(i10)).f35343a.setChecked(false);
                        ((a91) arrayList.get(i10)).f35344b.f16057n = false;
                        if (b91Var.f35609r.f36107c > 0 && i10 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i10)).f16057n = false;
                        }
                    }
                    z10 = true;
                    a10Var.setChecked(true);
                    fVar.f16057n = true;
                    b91Var.f35605b.z();
                    if (b91Var.f35609r.f36107c > 0) {
                        ((lg.f) gVar.d.get(a91Var.f35345c)).f16057n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
