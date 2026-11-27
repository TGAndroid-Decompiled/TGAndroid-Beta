package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class n52 extends v79 {
    public final byte a;
    public boolean b;
    public final Object c;

    public n52(qqc qqcVar) {
        this.a = (byte) 1;
        this.c = qqcVar;
        this.b = false;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        int i2;
        n69 n69Var;
        int topScrollOffset;
        int topScrollOffset2;
        byte b = this.a;
        boolean z = false;
        Object obj = this.c;
        switch (b) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                i52 i52Var = chatAttachAlertPhotoLayout.F;
                n12 n12Var = chatAttachAlertPhotoLayout.b;
                if (i == 0) {
                    int L = hl.L(13.0f);
                    s7 s7Var = n12Var.X2;
                    if (s7Var != null) {
                        i2 = hl.L(s7Var.getAlpha() * 26.0f);
                    } else {
                        i2 = 0;
                    }
                    int i3 = L + i2;
                    int i4 = n12Var.t0;
                    if (((n12Var.Y3[0] - i4) - i3) + i4 < (n12Var.L2.getAlpha() * n12Var.L2.getMeasuredHeight()) + a.getCurrentActionBarHeight() && (n69Var = (n69) i52Var.L(0)) != null) {
                        View view = n69Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            i52Var.y0(0, top2 - topScrollOffset2, null);
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
                    ((qqc) obj).f();
                    return;
                }
                return;
            default:
                r9b r9bVar = (r9b) obj;
                d79 d79Var = r9bVar.f;
                if (i == 1) {
                    w9b w9bVar = r9bVar.a0;
                    int i5 = w9b.X1;
                    if (w9bVar.d && r9bVar.y != null) {
                        w9bVar.G0();
                    }
                }
                if (i == 0) {
                    r9bVar.T = !d79Var.canScrollVertically(-1);
                    d79Var.canScrollVertically(1);
                } else {
                    z = true;
                }
                r9bVar.N = z;
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
                n12 n12Var = chatAttachAlertPhotoLayout.b;
                i52 i52Var = chatAttachAlertPhotoLayout.F;
                if (i52Var.getChildCount() > 0) {
                    n12Var.I1(chatAttachAlertPhotoLayout, i2);
                    float f = 0.0f;
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z = this.b;
                        boolean z2 = n12Var.L1;
                        if (z != z2) {
                            this.b = z2;
                            ViewPropertyAnimator animate = i52Var.getFastScroll().animate();
                            if (this.b) {
                                f = 1.0f;
                            }
                            ik8.s(animate, f, 100L);
                        }
                    } else {
                        i52Var.getFastScroll().setAlpha(0.0f);
                    }
                    if (i2 != 0) {
                        chatAttachAlertPhotoLayout.V();
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
                r9b r9bVar = (r9b) obj;
                w9b w9bVar = r9bVar.a0;
                d79 d79Var = r9bVar.f;
                boolean canScrollVertically = d79Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    r9bVar.r.invalidate();
                    this.b = canScrollVertically;
                }
                r9bVar.e.invalidate();
                int i3 = w9b.X1;
                w9bVar.b.invalidate();
                if (r9bVar.a == 6 && d79Var.getChildCount() > 0 && RecyclerView.S(d79Var.getChildAt(0)) >= uc7.s1(w9bVar.a).O1().L.size()) {
                    uc7.s1(w9bVar.a).O1().R();
                    return;
                }
                return;
        }
    }

    public n52(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.c = frameLayout;
    }
}
