package og;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import li.h5;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.u6;
import org.telegram.ui.LaunchActivity;
import s4.e1;
import s4.q0;
public final class g extends lm0 {
    public final int f19402c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(e1 e1Var) {
        switch (this.f19402c) {
            case 0:
                if (j.d(3)[e1Var.f47738f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f19402c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((t91) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f19402c) {
            case 1:
                return ((q91) ((t91) this.e).h.get(i10)).f31862a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f19402c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f19388b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(e1 e1Var, int i10) {
        boolean z10;
        s91 s91Var;
        switch (this.f19402c) {
            case 0:
                View view = e1Var.f47735a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f19388b;
                u6 u6Var = aVar.f19390f;
                CharSequence charSequence = aVar.f19387a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f19406f = charSequence.toString();
                            hVar.d = ((Float) u6Var.get(null)).floatValue();
                            hVar.f19404b = aVar.d;
                            hVar.f19405c = aVar.e;
                            hVar.e = u6Var;
                            hVar.invalidate();
                            return;
                        }
                        return;
                    }
                    q4 q4Var = (q4) view;
                    q4Var.setTextColor(y6.x0(null, y6.L6, false));
                    q4Var.setText(charSequence);
                    return;
                }
                y1 y1Var = (y1) view;
                y1Var.setTextColor(y6.x0(null, y6.f23462j5, false));
                y1Var.a(0, charSequence);
                return;
            default:
                r91 r91Var = (r91) e1Var.f47735a;
                t91 t91Var = (t91) this.e;
                q91 q91Var = (q91) t91Var.h.get(i10);
                r91Var.f32178a = q91Var;
                r91Var.setContentDescription(q91Var.f31863b);
                r91Var.setAlpha(1.0f);
                r91Var.requestLayout();
                if (t91Var.m0 && (s91Var = t91Var.f32945y) != null && ((jg.i) s91Var).b0(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r91Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f19402c) {
            case 0:
                int c10 = j.c(j.d(3)[i10]);
                Context context = this.d;
                if (c10 != 1) {
                    if (c10 != 2) {
                        frameLayout = new y1(context, null);
                    } else {
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.h = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                        lp0 lp0Var = new lp0(context);
                        frameLayout2.f19403a = lp0Var;
                        lp0Var.setReportChanges(true);
                        lp0Var.setDelegate(new h5(frameLayout2));
                        lp0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(lp0Var, gb1.h(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new q4(context);
                }
                frameLayout.setLayoutParams(new q0(-1, -2));
                return new e1(frameLayout);
            default:
                return new e1(new r91((t91) this.e, this.d));
        }
    }

    public g(t91 t91Var, Context context) {
        this.e = t91Var;
        this.d = context;
    }
}
