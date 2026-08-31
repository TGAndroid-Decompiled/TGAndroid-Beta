package ag;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import f2.m1;
import f2.x0;
import k7.c6;
import oh.h4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.LaunchActivity;
public final class m extends sl0 {
    public final int f214c = 0;
    public final Context d;
    public final FrameLayout f215e;

    public m(o oVar, LaunchActivity launchActivity) {
        this.f215e = oVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(m1 m1Var) {
        switch (this.f214c) {
            case 0:
                if (m1.j.d(3)[m1Var.f5879f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f214c) {
            case 0:
                return ((o) this.f215e).B.size();
            default:
                return ((l81) this.f215e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f214c) {
            case 1:
                return ((i81) ((l81) this.f215e).h.get(i10)).f27698a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f214c) {
            case 0:
                return m1.j.c(((a) ((o) this.f215e).B.get(i10)).f188b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(m1 m1Var, int i10) {
        boolean z4;
        k81 k81Var;
        switch (this.f214c) {
            case 0:
                View view = m1Var.f5875a;
                a aVar = (a) ((o) this.f215e).B.get(i10);
                int i11 = aVar.f188b;
                m6 m6Var = aVar.f191f;
                CharSequence charSequence = aVar.f187a;
                int c3 = m1.j.c(i11);
                if (c3 != 0) {
                    if (c3 != 1) {
                        if (c3 == 2) {
                            n nVar = (n) view;
                            nVar.f220f = charSequence.toString();
                            nVar.d = ((Float) m6Var.get(null)).floatValue();
                            nVar.f217b = aVar.d;
                            nVar.f218c = aVar.f190e;
                            nVar.f219e = m6Var;
                            nVar.invalidate();
                            return;
                        }
                        return;
                    }
                    m4 m4Var = (m4) view;
                    m4Var.setTextColor(k6.w0(null, k6.L6, false));
                    m4Var.setText(charSequence);
                    return;
                }
                z1 z1Var = (z1) view;
                z1Var.setTextColor(k6.w0(null, k6.f21766j5, false));
                z1Var.a(0, charSequence);
                return;
            default:
                j81 j81Var = (j81) m1Var.f5875a;
                l81 l81Var = (l81) this.f215e;
                i81 i81Var = (i81) l81Var.h.get(i10);
                j81Var.f28074a = i81Var;
                j81Var.setContentDescription(i81Var.f27699b);
                j81Var.setAlpha(1.0f);
                j81Var.requestLayout();
                if (l81Var.f28661j0 && (k81Var = l81Var.f28671y) != null && ((h4) k81Var).Q(i10)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                j81Var.setReordering(z4);
                return;
        }
    }

    @Override
    public final m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f214c) {
            case 0:
                int c3 = m1.j.c(m1.j.d(3)[i10]);
                Context context = this.d;
                if (c3 != 1) {
                    if (c3 != 2) {
                        frameLayout = new z1(context, null);
                    } else {
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.h = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                        lo0 lo0Var = new lo0(context);
                        frameLayout2.f216a = lo0Var;
                        lo0Var.setReportChanges(true);
                        lo0Var.setDelegate(new ja.c((Object) frameLayout2));
                        lo0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(lo0Var, c6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new m4(context);
                }
                frameLayout.setLayoutParams(new x0(-1, -2));
                return new m1(frameLayout);
            default:
                return new m1(new j81((l81) this.f215e, this.d));
        }
    }

    public m(l81 l81Var, Context context) {
        this.f215e = l81Var;
        this.d = context;
    }
}
