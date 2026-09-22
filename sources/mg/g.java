package mg;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ki.e0;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.y81;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.y5;
public final class g extends xl0 {
    public final int f15054c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(c1 c1Var) {
        switch (this.f15054c) {
            case 0:
                if (j.d(3)[c1Var.f42998f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f15054c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((y81) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f15054c) {
            case 1:
                return ((v81) ((y81) this.e).h.get(i10)).f29031a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f15054c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f15040b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        x81 x81Var;
        switch (this.f15054c) {
            case 0:
                View view = c1Var.f42995a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f15040b;
                q6 q6Var = aVar.f15042f;
                CharSequence charSequence = aVar.f15039a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f15058f = charSequence.toString();
                            hVar.d = ((Float) q6Var.get(null)).floatValue();
                            hVar.f15056b = aVar.d;
                            hVar.f15057c = aVar.e;
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
                x1Var.setTextColor(j6.w0(null, j6.f19216j5, false));
                x1Var.a(0, charSequence);
                return;
            default:
                w81 w81Var = (w81) c1Var.f42995a;
                y81 y81Var = (y81) this.e;
                v81 v81Var = (v81) y81Var.h.get(i10);
                w81Var.f29973a = v81Var;
                w81Var.setContentDescription(v81Var.f29032b);
                w81Var.setAlpha(1.0f);
                w81Var.requestLayout();
                if (y81Var.m0 && (x81Var = y81Var.f30609y) != null && ((e0) x81Var).d(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w81Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f15054c) {
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
                        uo0 uo0Var = new uo0(context);
                        frameLayout2.f15055a = uo0Var;
                        uo0Var.setReportChanges(true);
                        uo0Var.setDelegate(new k2.e((Object) frameLayout2, 4));
                        uo0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(uo0Var, y5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new n4(context);
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new c1(frameLayout);
            default:
                return new c1(new w81((y81) this.e, this.d));
        }
    }

    public g(y81 y81Var, Context context) {
        this.e = y81Var;
        this.d = context;
    }
}
