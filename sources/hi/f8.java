package hi;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.xl;
public final class f8 extends v4.u0 {
    public final int f14656a;
    public boolean f14657b;
    public final Object f14658c;

    public f8(int i7, FrameLayout frameLayout) {
        this.f14656a = i7;
        this.f14658c = frameLayout;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        int i10;
        kj0 kj0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i11 = this.f14656a;
        Object obj = this.f14658c;
        boolean z10 = false;
        switch (i11) {
            case 0:
                l8 l8Var = (l8) obj;
                ck0 ck0Var = l8Var.f14956f;
                if (i7 == 1) {
                    q8 q8Var = l8Var.f14952a0;
                    int i12 = q8.Y1;
                    if (q8Var.d && l8Var.f14962y != null) {
                        q8Var.N0();
                    }
                }
                if (i7 == 0) {
                    l8Var.T = !ck0Var.canScrollVertically(-1);
                    ck0Var.canScrollVertically(1);
                }
                if (i7 != 0) {
                    z10 = true;
                }
                l8Var.N = z10;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                xl xlVar = chatAttachAlertPhotoLayout.F;
                si siVar = chatAttachAlertPhotoLayout.f36766b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = siVar.Y2;
                    if (r0Var != null) {
                        i10 = org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = siVar.f30224t0;
                    if (((siVar.Z3[0] - i14) - i13) + i14 < (siVar.M2.getAlpha() * siVar.M2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var = (kj0) xlVar.K(0)) != null) {
                        View view = kj0Var.f59123a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            xlVar.w0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 == 0 && this.f14657b) {
                    this.f14657b = false;
                    ((org.telegram.ui.Wallet.j6) obj).f();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11 = this.f14656a;
        Object obj = this.f14658c;
        switch (i11) {
            case 0:
                l8 l8Var = (l8) obj;
                q8 q8Var = l8Var.f14952a0;
                ck0 ck0Var = l8Var.f14956f;
                boolean canScrollVertically = ck0Var.canScrollVertically(1);
                if (canScrollVertically != this.f14657b) {
                    l8Var.f14958r.invalidate();
                    this.f14657b = canScrollVertically;
                }
                l8Var.f14955e.invalidate();
                int i12 = q8.Y1;
                q8Var.f30190b.invalidate();
                if (l8Var.f14951a == 6 && ck0Var.getChildCount() > 0 && RecyclerView.R(ck0Var.getChildAt(0)) >= mp.u1(q8Var.f30187a).R1().L.size()) {
                    mp.u1(q8Var.f30187a).R1().S();
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                si siVar = chatAttachAlertPhotoLayout.f36766b;
                xl xlVar = chatAttachAlertPhotoLayout.F;
                if (xlVar.getChildCount() > 0) {
                    siVar.N1(chatAttachAlertPhotoLayout, i10);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z10 = this.f14657b;
                        boolean z11 = siVar.M1;
                        if (z10 != z11) {
                            this.f14657b = z11;
                            ViewPropertyAnimator animate = xlVar.getFastScroll().animate();
                            if (this.f14657b) {
                                f10 = 1.0f;
                            }
                            n10.n(animate, f10, 100L);
                        }
                    } else {
                        xlVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i10 != 0) {
                        chatAttachAlertPhotoLayout.Y();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 != 0 || i10 != 0) {
                    this.f14657b = true;
                    return;
                }
                return;
        }
    }

    public f8(org.telegram.ui.Wallet.j6 j6Var) {
        this.f14656a = 2;
        this.f14658c = j6Var;
        this.f14657b = false;
    }
}
