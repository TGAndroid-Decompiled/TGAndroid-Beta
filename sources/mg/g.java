package mg;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.y5;
public final class g extends vl0 {
    public final int f15043c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(c1 c1Var) {
        switch (this.f15043c) {
            case 0:
                if (j.d(3)[c1Var.f42963f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f15043c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((v81) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f15043c) {
            case 1:
                return ((s81) ((v81) this.e).h.get(i10)).f28203a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f15043c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f15029b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        u81 u81Var;
        switch (this.f15043c) {
            case 0:
                View view = c1Var.f42960a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f15029b;
                r6 r6Var = aVar.f15031f;
                CharSequence charSequence = aVar.f15028a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f15047f = charSequence.toString();
                            hVar.d = ((Float) r6Var.get(null)).floatValue();
                            hVar.f15045b = aVar.d;
                            hVar.f15046c = aVar.e;
                            hVar.e = r6Var;
                            hVar.invalidate();
                            return;
                        }
                        return;
                    }
                    m4 m4Var = (m4) view;
                    m4Var.setTextColor(h6.w0(null, h6.L6, false));
                    m4Var.setText(charSequence);
                    return;
                }
                w1 w1Var = (w1) view;
                w1Var.setTextColor(h6.w0(null, h6.f19165j5, false));
                w1Var.a(0, charSequence);
                return;
            default:
                t81 t81Var = (t81) c1Var.f42960a;
                v81 v81Var = (v81) this.e;
                s81 s81Var = (s81) v81Var.h.get(i10);
                t81Var.f28448a = s81Var;
                t81Var.setContentDescription(s81Var.f28204b);
                t81Var.setAlpha(1.0f);
                t81Var.requestLayout();
                if (v81Var.m0 && (u81Var = v81Var.f29106y) != null && ((l.d) u81Var).G(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t81Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f15043c) {
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
                        so0 so0Var = new so0(context);
                        frameLayout2.f15044a = so0Var;
                        so0Var.setReportChanges(true);
                        so0Var.setDelegate(new ka.c((Object) frameLayout2, 3));
                        so0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(so0Var, y5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new m4(context);
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new c1(frameLayout);
            default:
                return new c1(new t81((v81) this.e, this.d));
        }
    }

    public g(v81 v81Var, Context context) {
        this.e = v81Var;
        this.d = context;
    }
}
