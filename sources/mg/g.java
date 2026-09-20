package mg;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.w81;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.y5;
public final class g extends ul0 {
    public final int f15039c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(c1 c1Var) {
        switch (this.f15039c) {
            case 0:
                if (j.d(3)[c1Var.f42977f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f15039c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((w81) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f15039c) {
            case 1:
                return ((t81) ((w81) this.e).h.get(i10)).f28348a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f15039c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f15025b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        v81 v81Var;
        switch (this.f15039c) {
            case 0:
                View view = c1Var.f42974a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f15025b;
                q6 q6Var = aVar.f15027f;
                CharSequence charSequence = aVar.f15024a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f15043f = charSequence.toString();
                            hVar.d = ((Float) q6Var.get(null)).floatValue();
                            hVar.f15041b = aVar.d;
                            hVar.f15042c = aVar.e;
                            hVar.e = q6Var;
                            hVar.invalidate();
                            return;
                        }
                        return;
                    }
                    n4 n4Var = (n4) view;
                    n4Var.setTextColor(j6.w0(null, j6.L6, false));
                    n4Var.setText(charSequence);
                    return;
                }
                x1 x1Var = (x1) view;
                x1Var.setTextColor(j6.w0(null, j6.f19201j5, false));
                x1Var.a(0, charSequence);
                return;
            default:
                u81 u81Var = (u81) c1Var.f42974a;
                w81 w81Var = (w81) this.e;
                t81 t81Var = (t81) w81Var.h.get(i10);
                u81Var.f28622a = t81Var;
                u81Var.setContentDescription(t81Var.f28349b);
                u81Var.setAlpha(1.0f);
                u81Var.requestLayout();
                if (w81Var.m0 && (v81Var = w81Var.f30007y) != null && ((l.d) v81Var).H(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u81Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f15039c) {
            case 0:
                int c10 = j.c(j.d(3)[i10]);
                Context context = this.d;
                if (c10 != 1) {
                    if (c10 != 2) {
                        frameLayout = new x1(context, null);
                    } else {
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.h = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                        so0 so0Var = new so0(context);
                        frameLayout2.f15040a = so0Var;
                        so0Var.setReportChanges(true);
                        so0Var.setDelegate(new ka.c((Object) frameLayout2, 3));
                        so0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(so0Var, y5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new n4(context);
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new c1(frameLayout);
            default:
                return new c1(new u81((w81) this.e, this.d));
        }
    }

    public g(w81 w81Var, Context context) {
        this.e = w81Var;
        this.d = context;
    }
}
