package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class i62 extends k69 {
    public final byte a;
    public boolean b;
    public final Object c;

    public i62(coc cocVar) {
        this.a = (byte) 1;
        this.c = cocVar;
        this.b = false;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        int i2;
        b59 b59Var;
        int topScrollOffset;
        int topScrollOffset2;
        byte b = this.a;
        boolean z = false;
        Object obj = this.c;
        switch (b) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                d62 d62Var = chatAttachAlertPhotoLayout.F;
                i22 i22Var = chatAttachAlertPhotoLayout.b;
                if (i == 0) {
                    int L = gm.L(13.0f);
                    r7 r7Var = i22Var.X2;
                    if (r7Var != null) {
                        i2 = gm.L(r7Var.getAlpha() * 26.0f);
                    } else {
                        i2 = 0;
                    }
                    int i3 = L + i2;
                    int i4 = i22Var.t0;
                    if (((i22Var.Y3[0] - i4) - i3) + i4 < (i22Var.L2.getAlpha() * i22Var.L2.getMeasuredHeight()) + a.getCurrentActionBarHeight() && (b59Var = (b59) d62Var.K(0)) != null) {
                        View view = b59Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            d62Var.x0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i == 0 && this.b) {
                    this.b = false;
                    ((coc) obj).f();
                    return;
                }
                return;
            default:
                v7b v7bVar = (v7b) obj;
                r59 r59Var = v7bVar.f;
                if (i == 1) {
                    a8b a8bVar = v7bVar.a0;
                    int i5 = a8b.X1;
                    if (a8bVar.d && v7bVar.y != null) {
                        a8bVar.F0();
                    }
                }
                if (i == 0) {
                    v7bVar.T = !r59Var.canScrollVertically(-1);
                    r59Var.canScrollVertically(1);
                } else {
                    z = true;
                }
                v7bVar.N = z;
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                i22 i22Var = chatAttachAlertPhotoLayout.b;
                d62 d62Var = chatAttachAlertPhotoLayout.F;
                if (d62Var.getChildCount() > 0) {
                    i22Var.H1(chatAttachAlertPhotoLayout, i2);
                    float f = 0.0f;
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z = this.b;
                        boolean z2 = i22Var.L1;
                        if (z != z2) {
                            this.b = z2;
                            ViewPropertyAnimator animate = d62Var.getFastScroll().animate();
                            if (this.b) {
                                f = 1.0f;
                            }
                            wi8.s(animate, f, 100L);
                        }
                    } else {
                        d62Var.getFastScroll().setAlpha(0.0f);
                    }
                    if (i2 != 0) {
                        chatAttachAlertPhotoLayout.W();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i != 0 || i2 != 0) {
                    this.b = true;
                    return;
                }
                return;
            default:
                v7b v7bVar = (v7b) obj;
                a8b a8bVar = v7bVar.a0;
                r59 r59Var = v7bVar.f;
                boolean canScrollVertically = r59Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    v7bVar.r.invalidate();
                    this.b = canScrollVertically;
                }
                v7bVar.e.invalidate();
                int i3 = a8b.X1;
                a8bVar.b.invalidate();
                if (v7bVar.a == 6 && r59Var.getChildCount() > 0 && RecyclerView.R(r59Var.getChildAt(0)) >= oc7.r1(a8bVar.a).N1().L.size()) {
                    oc7.r1(a8bVar.a).N1().R();
                    return;
                }
                return;
        }
    }

    public i62(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.c = frameLayout;
    }
}
