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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.u91;
import org.telegram.ui.LaunchActivity;
import s4.e1;
import s4.q0;
public final class g extends mm0 {
    public final int f19401c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(e1 e1Var) {
        switch (this.f19401c) {
            case 0:
                if (j.d(3)[e1Var.f47776f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f19401c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((u91) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f19401c) {
            case 1:
                return ((r91) ((u91) this.e).h.get(i10)).f32186a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f19401c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f19387b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(e1 e1Var, int i10) {
        boolean z10;
        t91 t91Var;
        switch (this.f19401c) {
            case 0:
                View view = e1Var.f47773a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f19387b;
                u6 u6Var = aVar.f19389f;
                CharSequence charSequence = aVar.f19386a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f19405f = charSequence.toString();
                            hVar.d = ((Float) u6Var.get(null)).floatValue();
                            hVar.f19403b = aVar.d;
                            hVar.f19404c = aVar.e;
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
                y1Var.setTextColor(y6.x0(null, y6.f23465j5, false));
                y1Var.a(0, charSequence);
                return;
            default:
                s91 s91Var = (s91) e1Var.f47773a;
                u91 u91Var = (u91) this.e;
                r91 r91Var = (r91) u91Var.h.get(i10);
                s91Var.f32530a = r91Var;
                s91Var.setContentDescription(r91Var.f32187b);
                s91Var.setAlpha(1.0f);
                s91Var.requestLayout();
                if (u91Var.m0 && (t91Var = u91Var.f33322y) != null && ((jg.i) t91Var).b0(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s91Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f19401c) {
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
                        mp0 mp0Var = new mp0(context);
                        frameLayout2.f19402a = mp0Var;
                        mp0Var.setReportChanges(true);
                        mp0Var.setDelegate(new h5(frameLayout2));
                        mp0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(mp0Var, kb1.h(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new q4(context);
                }
                frameLayout.setLayoutParams(new q0(-1, -2));
                return new e1(frameLayout);
            default:
                return new e1(new s91((u91) this.e, this.d));
        }
    }

    public g(u91 u91Var, Context context) {
        this.e = u91Var;
        this.d = context;
    }
}
