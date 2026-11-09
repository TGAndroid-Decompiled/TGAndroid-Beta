package fi;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.yi0;
public final class h8 extends v4.s0 {
    public final int f12139a;
    public boolean f12140b;
    public final Object f12141c;

    public h8(int i7, FrameLayout frameLayout) {
        this.f12139a = i7;
        this.f12141c = frameLayout;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        int i10;
        yi0 yi0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i11 = this.f12139a;
        Object obj = this.f12141c;
        boolean z9 = false;
        switch (i11) {
            case 0:
                n8 n8Var = (n8) obj;
                qj0 qj0Var = n8Var.f12489f;
                if (i7 == 1) {
                    s8 s8Var = n8Var.W;
                    int i12 = s8.U1;
                    if (s8Var.d && n8Var.f12495y != null) {
                        s8Var.M0();
                    }
                }
                if (i7 == 0) {
                    n8Var.S = !qj0Var.canScrollVertically(-1);
                    qj0Var.canScrollVertically(1);
                }
                if (i7 != 0) {
                    z9 = true;
                }
                n8Var.M = z9;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                jl jlVar = chatAttachAlertPhotoLayout.E;
                di diVar = chatAttachAlertPhotoLayout.f39071b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = diVar.U2;
                    if (r0Var != null) {
                        i10 = org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = diVar.f28653s0;
                    if (((diVar.V3[0] - i14) - i13) + i14 < (diVar.I2.getAlpha() * diVar.I2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (yi0Var = (yi0) jlVar.K(0)) != null) {
                        View view = yi0Var.f57056a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            jlVar.w0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 == 0 && this.f12140b) {
                    this.f12140b = false;
                    ((org.telegram.ui.Wallet.s5) obj).f();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11 = this.f12139a;
        Object obj = this.f12141c;
        switch (i11) {
            case 0:
                n8 n8Var = (n8) obj;
                s8 s8Var = n8Var.W;
                qj0 qj0Var = n8Var.f12489f;
                boolean canScrollVertically = qj0Var.canScrollVertically(1);
                if (canScrollVertically != this.f12140b) {
                    n8Var.f12491r.invalidate();
                    this.f12140b = canScrollVertically;
                }
                n8Var.f12488e.invalidate();
                int i12 = s8.U1;
                s8Var.f28624b.invalidate();
                if (n8Var.f12485a == 6 && qj0Var.getChildCount() > 0 && RecyclerView.R(qj0Var.getChildAt(0)) >= qp.s1(s8Var.f28621a).P1().L.size()) {
                    qp.s1(s8Var.f28621a).P1().S();
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                di diVar = chatAttachAlertPhotoLayout.f39071b;
                jl jlVar = chatAttachAlertPhotoLayout.E;
                if (jlVar.getChildCount() > 0) {
                    diVar.M1(chatAttachAlertPhotoLayout, i10);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.b() > 30) {
                        boolean z9 = this.f12140b;
                        boolean z10 = diVar.I1;
                        if (z9 != z10) {
                            this.f12140b = z10;
                            ViewPropertyAnimator animate = jlVar.getFastScroll().animate();
                            if (this.f12140b) {
                                f10 = 1.0f;
                            }
                            org.telegram.messenger.camera.q.k(animate, f10, 100L);
                        }
                    } else {
                        jlVar.getFastScroll().setAlpha(0.0f);
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
                    this.f12140b = true;
                    return;
                }
                return;
        }
    }

    public h8(org.telegram.ui.Wallet.s5 s5Var) {
        this.f12139a = 2;
        this.f12141c = s5Var;
        this.f12140b = false;
    }
}
