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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.t6;
import org.telegram.ui.LaunchActivity;
import s4.d1;
import s4.q0;
import w7.x5;
public final class g extends qm0 {
    public final int f16429c = 0;
    public final Context d;
    public final FrameLayout f16430e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.f16430e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(d1 d1Var) {
        switch (this.f16429c) {
            case 0:
                if (j.d(3)[d1Var.f47706f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f16429c) {
            case 0:
                return ((i) this.f16430e).E.size();
            default:
                return ((o91) this.f16430e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f16429c) {
            case 1:
                return ((l91) ((o91) this.f16430e).h.get(i10)).f28275a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f16429c) {
            case 0:
                return j.c(((a) ((i) this.f16430e).E.get(i10)).f16414b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(d1 d1Var, int i10) {
        boolean z10;
        n91 n91Var;
        switch (this.f16429c) {
            case 0:
                View view = d1Var.f47702a;
                a aVar = (a) ((i) this.f16430e).E.get(i10);
                int i11 = aVar.f16414b;
                t6 t6Var = aVar.f16417f;
                CharSequence charSequence = aVar.f16413a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f16435f = charSequence.toString();
                            hVar.d = ((Float) t6Var.get(null)).floatValue();
                            hVar.f16432b = aVar.d;
                            hVar.f16433c = aVar.f16416e;
                            hVar.f16434e = t6Var;
                            hVar.invalidate();
                            return;
                        }
                        return;
                    }
                    m4 m4Var = (m4) view;
                    m4Var.setTextColor(i6.x0(null, i6.L6, false));
                    m4Var.setText(charSequence);
                    return;
                }
                x1 x1Var = (x1) view;
                x1Var.setTextColor(i6.x0(null, i6.f20909j5, false));
                x1Var.a(0, charSequence);
                return;
            default:
                m91 m91Var = (m91) d1Var.f47702a;
                o91 o91Var = (o91) this.f16430e;
                l91 l91Var = (l91) o91Var.h.get(i10);
                m91Var.f28730a = l91Var;
                m91Var.setContentDescription(l91Var.f28276b);
                m91Var.setAlpha(1.0f);
                m91Var.requestLayout();
                if (o91Var.m0 && (n91Var = o91Var.f29427y) != null && ((t) n91Var).A(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m91Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f16429c) {
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
                        lp0 lp0Var = new lp0(context);
                        frameLayout2.f16431a = lp0Var;
                        lp0Var.setReportChanges(true);
                        lp0Var.setDelegate(new f3((Object) frameLayout2, 1));
                        lp0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(lp0Var, x5.a(38.0f, 5.0f, 29.0f, 47.0f, 0.0f, -1, 83));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new m4(context);
                }
                frameLayout.setLayoutParams(new q0(-1, -2));
                return new d1(frameLayout);
            default:
                return new d1(new m91((o91) this.f16430e, this.d));
        }
    }

    public g(o91 o91Var, Context context) {
        this.f16430e = o91Var;
        this.d = context;
    }
}
