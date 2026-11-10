package fi;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xi0;
public final class h8 extends v4.s0 {
    public final int f12143a;
    public boolean f12144b;
    public final Object f12145c;

    public h8(int i7, FrameLayout frameLayout) {
        this.f12143a = i7;
        this.f12145c = frameLayout;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        int i10;
        xi0 xi0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i11 = this.f12143a;
        Object obj = this.f12145c;
        boolean z9 = false;
        switch (i11) {
            case 0:
                n8 n8Var = (n8) obj;
                pj0 pj0Var = n8Var.f12493f;
                if (i7 == 1) {
                    s8 s8Var = n8Var.W;
                    int i12 = s8.X1;
                    if (s8Var.d && n8Var.f12499y != null) {
                        s8Var.M0();
                    }
                }
                if (i7 == 0) {
                    n8Var.S = !pj0Var.canScrollVertically(-1);
                    pj0Var.canScrollVertically(1);
                }
                if (i7 != 0) {
                    z9 = true;
                }
                n8Var.M = z9;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                il ilVar = chatAttachAlertPhotoLayout.E;
                ci ciVar = chatAttachAlertPhotoLayout.f38656b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = ciVar.X2;
                    if (r0Var != null) {
                        i10 = org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = ciVar.f28704s0;
                    if (((ciVar.Y3[0] - i14) - i13) + i14 < (ciVar.L2.getAlpha() * ciVar.L2.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (xi0Var = (xi0) ilVar.K(0)) != null) {
                        View view = xi0Var.f57052a;
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
                if (i7 == 0 && this.f12144b) {
                    this.f12144b = false;
                    ((org.telegram.ui.Wallet.v5) obj).f();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11 = this.f12143a;
        Object obj = this.f12145c;
        switch (i11) {
            case 0:
                n8 n8Var = (n8) obj;
                s8 s8Var = n8Var.W;
                pj0 pj0Var = n8Var.f12493f;
                boolean canScrollVertically = pj0Var.canScrollVertically(1);
                if (canScrollVertically != this.f12144b) {
                    n8Var.f12495r.invalidate();
                    this.f12144b = canScrollVertically;
                }
                n8Var.f12492e.invalidate();
                int i12 = s8.X1;
                s8Var.f28672b.invalidate();
                if (n8Var.f12489a == 6 && pj0Var.getChildCount() > 0 && RecyclerView.R(pj0Var.getChildAt(0)) >= qp.s1(s8Var.f28669a).P1().L.size()) {
                    qp.s1(s8Var.f28669a).P1().S();
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ci ciVar = chatAttachAlertPhotoLayout.f38656b;
                il ilVar = chatAttachAlertPhotoLayout.E;
                if (ilVar.getChildCount() > 0) {
                    ciVar.M1(chatAttachAlertPhotoLayout, i10);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.b() > 30) {
                        boolean z9 = this.f12144b;
                        boolean z10 = ciVar.L1;
                        if (z9 != z10) {
                            this.f12144b = z10;
                            ViewPropertyAnimator animate = ilVar.getFastScroll().animate();
                            if (this.f12144b) {
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
                if (i7 != 0 || i10 != 0) {
                    this.f12144b = true;
                    return;
                }
                return;
        }
    }

    public h8(org.telegram.ui.Wallet.v5 v5Var) {
        this.f12143a = 2;
        this.f12145c = v5Var;
        this.f12144b = false;
    }
}
