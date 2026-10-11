package mg;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m.f3;
import m1.j;
import m2.t;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.t6;
import org.telegram.ui.LaunchActivity;
import s4.d1;
import s4.q0;
import w7.x5;
public final class g extends rm0 {
    public final int f16451c = 0;
    public final Context d;
    public final FrameLayout f16452e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.f16452e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(d1 d1Var) {
        switch (this.f16451c) {
            case 0:
                if (j.d(3)[d1Var.f47752f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f16451c) {
            case 0:
                return ((i) this.f16452e).E.size();
            default:
                return ((p91) this.f16452e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f16451c) {
            case 1:
                return ((m91) ((p91) this.f16452e).h.get(i10)).f28633a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f16451c) {
            case 0:
                return j.c(((a) ((i) this.f16452e).E.get(i10)).f16436b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(d1 d1Var, int i10) {
        boolean z10;
        o91 o91Var;
        switch (this.f16451c) {
            case 0:
                View view = d1Var.f47748a;
                a aVar = (a) ((i) this.f16452e).E.get(i10);
                int i11 = aVar.f16436b;
                t6 t6Var = aVar.f16439f;
                CharSequence charSequence = aVar.f16435a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f16457f = charSequence.toString();
                            hVar.d = ((Float) t6Var.get(null)).floatValue();
                            hVar.f16454b = aVar.d;
                            hVar.f16455c = aVar.f16438e;
                            hVar.f16456e = t6Var;
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
                w1Var.setTextColor(h6.x0(null, h6.f20894j5, false));
                w1Var.a(0, charSequence);
                return;
            default:
                n91 n91Var = (n91) d1Var.f47748a;
                p91 p91Var = (p91) this.f16452e;
                m91 m91Var = (m91) p91Var.h.get(i10);
                n91Var.f29015a = m91Var;
                n91Var.setContentDescription(m91Var.f28634b);
                n91Var.setAlpha(1.0f);
                n91Var.requestLayout();
                if (p91Var.m0 && (o91Var = p91Var.f29685y) != null && ((t) o91Var).p(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n91Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f16451c) {
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
                        mp0 mp0Var = new mp0(context);
                        frameLayout2.f16453a = mp0Var;
                        mp0Var.setReportChanges(true);
                        mp0Var.setDelegate(new f3((Object) frameLayout2, 1));
                        mp0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(mp0Var, x5.a(38.0f, 5.0f, 29.0f, 47.0f, 0.0f, -1, 83));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new m4(context);
                }
                frameLayout.setLayoutParams(new q0(-1, -2));
                return new d1(frameLayout);
            default:
                return new d1(new n91((p91) this.f16452e, this.d));
        }
    }

    public g(p91 p91Var, Context context) {
        this.f16452e = p91Var;
        this.d = context;
    }
}
