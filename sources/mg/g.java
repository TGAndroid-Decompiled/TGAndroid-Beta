package mg;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k2.g0;
import m1.j;
import n4.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.t6;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.LaunchActivity;
import s4.d1;
import s4.q0;
import w7.w5;
public final class g extends vm0 {
    public final int f16174c = 0;
    public final Context d;
    public final FrameLayout f16175e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.f16175e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(d1 d1Var) {
        switch (this.f16174c) {
            case 0:
                if (j.d(3)[d1Var.f47901f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f16174c) {
            case 0:
                return ((i) this.f16175e).E.size();
            default:
                return ((t91) this.f16175e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f16174c) {
            case 1:
                return ((q91) ((t91) this.f16175e).h.get(i10)).f29784a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f16174c) {
            case 0:
                return j.c(((a) ((i) this.f16175e).E.get(i10)).f16159b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(d1 d1Var, int i10) {
        boolean z10;
        s91 s91Var;
        switch (this.f16174c) {
            case 0:
                View view = d1Var.f47897a;
                a aVar = (a) ((i) this.f16175e).E.get(i10);
                int i11 = aVar.f16159b;
                t6 t6Var = aVar.f16162f;
                CharSequence charSequence = aVar.f16158a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f16180f = charSequence.toString();
                            hVar.d = ((Float) t6Var.get(null)).floatValue();
                            hVar.f16177b = aVar.d;
                            hVar.f16178c = aVar.f16161e;
                            hVar.f16179e = t6Var;
                            hVar.invalidate();
                            return;
                        }
                        return;
                    }
                    m4 m4Var = (m4) view;
                    m4Var.setTextColor(h6.x0(null, h6.L6, false));
                    m4Var.setText(charSequence);
                    return;
                }
                w1 w1Var = (w1) view;
                w1Var.setTextColor(h6.x0(null, h6.f20668j5, false));
                w1Var.a(0, charSequence);
                return;
            default:
                r91 r91Var = (r91) d1Var.f47897a;
                t91 t91Var = (t91) this.f16175e;
                q91 q91Var = (q91) t91Var.h.get(i10);
                r91Var.f30109a = q91Var;
                r91Var.setContentDescription(q91Var.f29785b);
                r91Var.setAlpha(1.0f);
                r91Var.requestLayout();
                if (t91Var.m0 && (s91Var = t91Var.f30830y) != null && ((l) s91Var).b(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r91Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f16174c) {
            case 0:
                int c10 = j.c(j.d(3)[i10]);
                Context context = this.d;
                if (c10 != 1) {
                    if (c10 != 2) {
                        frameLayout = new w1(context, null);
                    } else {
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.h = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                        qp0 qp0Var = new qp0(context);
                        frameLayout2.f16176a = qp0Var;
                        qp0Var.setReportChanges(true);
                        qp0Var.setDelegate(new g0((Object) frameLayout2, 5));
                        qp0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(qp0Var, w5.a(38.0f, 5.0f, 29.0f, 47.0f, 0.0f, -1, 83));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new m4(context);
                }
                frameLayout.setLayoutParams(new q0(-1, -2));
                return new d1(frameLayout);
            default:
                return new d1(new r91((t91) this.f16175e, this.d));
        }
    }

    public g(t91 t91Var, Context context) {
        this.f16175e = t91Var;
        this.d = context;
    }
}
