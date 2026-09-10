package lg;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.a6;
public final class g extends ul0 {
    public final int f12947c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(c1 c1Var) {
        switch (this.f12947c) {
            case 0:
                if (j.d(3)[c1Var.f41613f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f12947c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((u81) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f12947c) {
            case 1:
                return ((r81) ((u81) this.e).h.get(i10)).f26629a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f12947c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f12933b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        t81 t81Var;
        switch (this.f12947c) {
            case 0:
                View view = c1Var.f41610a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f12933b;
                q6 q6Var = aVar.f12935f;
                CharSequence charSequence = aVar.f12932a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f12951f = charSequence.toString();
                            hVar.d = ((Float) q6Var.get(null)).floatValue();
                            hVar.f12949b = aVar.d;
                            hVar.f12950c = aVar.e;
                            hVar.e = q6Var;
                            hVar.invalidate();
                            return;
                        }
                        return;
                    }
                    m4 m4Var = (m4) view;
                    m4Var.setTextColor(j6.w0(null, j6.L6, false));
                    m4Var.setText(charSequence);
                    return;
                }
                z1 z1Var = (z1) view;
                z1Var.setTextColor(j6.w0(null, j6.f18034j5, false));
                z1Var.a(0, charSequence);
                return;
            default:
                s81 s81Var = (s81) c1Var.f41610a;
                u81 u81Var = (u81) this.e;
                r81 r81Var = (r81) u81Var.h.get(i10);
                s81Var.f26977a = r81Var;
                s81Var.setContentDescription(r81Var.f26630b);
                s81Var.setAlpha(1.0f);
                s81Var.requestLayout();
                if (u81Var.m0 && (t81Var = u81Var.f27640y) != null && ((l2.h) t81Var).j(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s81Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f12947c) {
            case 0:
                int c10 = j.c(j.d(3)[i10]);
                Context context = this.d;
                if (c10 != 1) {
                    if (c10 != 2) {
                        frameLayout = new z1(context, null);
                    } else {
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.h = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                        oo0 oo0Var = new oo0(context);
                        frameLayout2.f12948a = oo0Var;
                        oo0Var.setReportChanges(true);
                        oo0Var.setDelegate(new l2.h((Object) frameLayout2, 1));
                        oo0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(oo0Var, a6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new m4(context);
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new c1(frameLayout);
            default:
                return new c1(new s81((u81) this.e, this.d));
        }
    }

    public g(u81 u81Var, Context context) {
        this.e = u81Var;
        this.d = context;
    }
}
