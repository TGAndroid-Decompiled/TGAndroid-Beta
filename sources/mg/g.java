package mg;

import a4.m;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.x5;
public final class g extends ll0 {
    public final int f14793c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(c1 c1Var) {
        switch (this.f14793c) {
            case 0:
                if (j.d(3)[c1Var.f42630f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f14793c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((g81) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f14793c) {
            case 1:
                return ((d81) ((g81) this.e).h.get(i10)).f23322a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f14793c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f14779b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        f81 f81Var;
        switch (this.f14793c) {
            case 0:
                View view = c1Var.f42627a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f14779b;
                r6 r6Var = aVar.f14781f;
                CharSequence charSequence = aVar.f14778a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f14797f = charSequence.toString();
                            hVar.d = ((Float) r6Var.get(null)).floatValue();
                            hVar.f14795b = aVar.d;
                            hVar.f14796c = aVar.e;
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
                x1 x1Var = (x1) view;
                x1Var.setTextColor(h6.w0(null, h6.f18895j5, false));
                x1Var.a(0, charSequence);
                return;
            default:
                e81 e81Var = (e81) c1Var.f42627a;
                g81 g81Var = (g81) this.e;
                d81 d81Var = (d81) g81Var.h.get(i10);
                e81Var.f23599a = d81Var;
                e81Var.setContentDescription(d81Var.f23323b);
                e81Var.setAlpha(1.0f);
                e81Var.requestLayout();
                if (g81Var.m0 && (f81Var = g81Var.f24234y) != null && ((ka.c) f81Var).d(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e81Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f14793c) {
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
                        fo0 fo0Var = new fo0(context);
                        frameLayout2.f14794a = fo0Var;
                        fo0Var.setReportChanges(true);
                        fo0Var.setDelegate(new m((Object) frameLayout2, 26));
                        fo0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(fo0Var, x5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new m4(context);
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new c1(frameLayout);
            default:
                return new c1(new e81((g81) this.e, this.d));
        }
    }

    public g(g81 g81Var, Context context) {
        this.e = g81Var;
        this.d = context;
    }
}
