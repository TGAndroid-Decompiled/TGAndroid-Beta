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
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.t6;
import org.telegram.ui.LaunchActivity;
import s4.d1;
import s4.q0;
import w7.x5;
public final class g extends pm0 {
    public final int f16425c = 0;
    public final Context d;
    public final FrameLayout f16426e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.f16426e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(d1 d1Var) {
        switch (this.f16425c) {
            case 0:
                if (j.d(3)[d1Var.f47662f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f16425c) {
            case 0:
                return ((i) this.f16426e).E.size();
            default:
                return ((n91) this.f16426e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f16425c) {
            case 1:
                return ((k91) ((n91) this.f16426e).h.get(i10)).f27909a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f16425c) {
            case 0:
                return j.c(((a) ((i) this.f16426e).E.get(i10)).f16410b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(d1 d1Var, int i10) {
        boolean z10;
        m91 m91Var;
        switch (this.f16425c) {
            case 0:
                View view = d1Var.f47658a;
                a aVar = (a) ((i) this.f16426e).E.get(i10);
                int i11 = aVar.f16410b;
                t6 t6Var = aVar.f16413f;
                CharSequence charSequence = aVar.f16409a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f16431f = charSequence.toString();
                            hVar.d = ((Float) t6Var.get(null)).floatValue();
                            hVar.f16428b = aVar.d;
                            hVar.f16429c = aVar.f16412e;
                            hVar.f16430e = t6Var;
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
                x1Var.setTextColor(i6.x0(null, i6.f20905j5, false));
                x1Var.a(0, charSequence);
                return;
            default:
                l91 l91Var = (l91) d1Var.f47658a;
                n91 n91Var = (n91) this.f16426e;
                k91 k91Var = (k91) n91Var.h.get(i10);
                l91Var.f28394a = k91Var;
                l91Var.setContentDescription(k91Var.f27910b);
                l91Var.setAlpha(1.0f);
                l91Var.requestLayout();
                if (n91Var.m0 && (m91Var = n91Var.f29122y) != null && ((t) m91Var).A(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l91Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f16425c) {
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
                        kp0 kp0Var = new kp0(context);
                        frameLayout2.f16427a = kp0Var;
                        kp0Var.setReportChanges(true);
                        kp0Var.setDelegate(new f3((Object) frameLayout2, 1));
                        kp0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(kp0Var, x5.a(38.0f, 5.0f, 29.0f, 47.0f, 0.0f, -1, 83));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new m4(context);
                }
                frameLayout.setLayoutParams(new q0(-1, -2));
                return new d1(frameLayout);
            default:
                return new d1(new l91((n91) this.f16426e, this.d));
        }
    }

    public g(n91 n91Var, Context context) {
        this.f16426e = n91Var;
        this.d = context;
    }
}
