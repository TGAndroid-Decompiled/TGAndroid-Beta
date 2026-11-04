package gi;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.tj0;
public final class g8 extends u4.t0 {
    public final int f12839a;
    public boolean f12840b;
    public final Object f12841c;

    public g8(int i3, FrameLayout frameLayout) {
        this.f12839a = i3;
        this.f12841c = frameLayout;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        int i10;
        bj0 bj0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i11 = this.f12839a;
        Object obj = this.f12841c;
        boolean z10 = false;
        switch (i11) {
            case 0:
                o8 o8Var = (o8) obj;
                tj0 tj0Var = o8Var.f13344f;
                if (i3 == 1) {
                    t8 t8Var = o8Var.f13340a0;
                    int i12 = t8.V1;
                    if (t8Var.d && o8Var.f13350y != null) {
                        t8Var.M0();
                    }
                }
                if (i3 == 0) {
                    o8Var.T = !tj0Var.canScrollVertically(-1);
                    tj0Var.canScrollVertically(1);
                }
                if (i3 != 0) {
                    z10 = true;
                }
                o8Var.N = z10;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                il ilVar = chatAttachAlertPhotoLayout.F;
                bi biVar = chatAttachAlertPhotoLayout.f38416b;
                if (i3 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = biVar.V2;
                    if (q0Var != null) {
                        i10 = org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = biVar.f28617t0;
                    if (((biVar.W3[0] - i14) - i13) + i14 < (biVar.J2.getAlpha() * biVar.J2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var = (bj0) ilVar.K(0)) != null) {
                        View view = bj0Var.f55540a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            ilVar.w0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i3 == 0 && this.f12840b) {
                    this.f12840b = false;
                    ((org.telegram.ui.Wallet.s5) obj).f();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        int i11 = this.f12839a;
        Object obj = this.f12841c;
        switch (i11) {
            case 0:
                o8 o8Var = (o8) obj;
                t8 t8Var = o8Var.f13340a0;
                tj0 tj0Var = o8Var.f13344f;
                boolean canScrollVertically = tj0Var.canScrollVertically(1);
                if (canScrollVertically != this.f12840b) {
                    o8Var.f13346r.invalidate();
                    this.f12840b = canScrollVertically;
                }
                o8Var.f13343e.invalidate();
                int i12 = t8.V1;
                t8Var.f28586b.invalidate();
                if (o8Var.f13339a == 6 && tj0Var.getChildCount() > 0 && RecyclerView.R(tj0Var.getChildAt(0)) >= hp.s1(t8Var.f28583a).P1().L.size()) {
                    hp.s1(t8Var.f28583a).P1().S();
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                bi biVar = chatAttachAlertPhotoLayout.f38416b;
                il ilVar = chatAttachAlertPhotoLayout.F;
                if (ilVar.getChildCount() > 0) {
                    biVar.M1(chatAttachAlertPhotoLayout, i10);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z10 = this.f12840b;
                        boolean z11 = biVar.J1;
                        if (z10 != z11) {
                            this.f12840b = z11;
                            ViewPropertyAnimator animate = ilVar.getFastScroll().animate();
                            if (this.f12840b) {
                                f10 = 1.0f;
                            }
                            org.telegram.messenger.camera.q.k(animate, f10, 100L);
                        }
                    } else {
                        ilVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i10 != 0) {
                        chatAttachAlertPhotoLayout.X();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i3 != 0 || i10 != 0) {
                    this.f12840b = true;
                    return;
                }
                return;
        }
    }

    public g8(org.telegram.ui.Wallet.s5 s5Var) {
        this.f12839a = 2;
        this.f12841c = s5Var;
        this.f12840b = false;
    }
}
