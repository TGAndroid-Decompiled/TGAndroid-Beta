package mg;

import a4.m;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.x5;
public final class g extends ll0 {
    public final int f14828c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(c1 c1Var) {
        switch (this.f14828c) {
            case 0:
                if (j.d(3)[c1Var.f42705f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f14828c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((i81) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f14828c) {
            case 1:
                return ((f81) ((i81) this.e).h.get(i10)).f23824a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f14828c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f14814b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        h81 h81Var;
        switch (this.f14828c) {
            case 0:
                View view = c1Var.f42702a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f14814b;
                p6 p6Var = aVar.f14816f;
                CharSequence charSequence = aVar.f14813a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f14832f = charSequence.toString();
                            hVar.d = ((Float) p6Var.get(null)).floatValue();
                            hVar.f14830b = aVar.d;
                            hVar.f14831c = aVar.e;
                            hVar.e = p6Var;
                            hVar.invalidate();
                            return;
                        }
                        return;
                    }
                    l4 l4Var = (l4) view;
                    l4Var.setTextColor(j6.w0(null, j6.L6, false));
                    l4Var.setText(charSequence);
                    return;
                }
                y1 y1Var = (y1) view;
                y1Var.setTextColor(j6.w0(null, j6.f18970j5, false));
                y1Var.a(0, charSequence);
                return;
            default:
                g81 g81Var = (g81) c1Var.f42702a;
                i81 i81Var = (i81) this.e;
                f81 f81Var = (f81) i81Var.h.get(i10);
                g81Var.f24120a = f81Var;
                g81Var.setContentDescription(f81Var.f23825b);
                g81Var.setAlpha(1.0f);
                g81Var.requestLayout();
                if (i81Var.m0 && (h81Var = i81Var.f24899y) != null && ((ka.c) h81Var).d(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g81Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f14828c) {
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
                        go0 go0Var = new go0(context);
                        frameLayout2.f14829a = go0Var;
                        go0Var.setReportChanges(true);
                        go0Var.setDelegate(new m((Object) frameLayout2, 26));
                        go0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(go0Var, x5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new l4(context);
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new c1(frameLayout);
            default:
                return new c1(new g81((i81) this.e, this.d));
        }
    }

    public g(i81 i81Var, Context context) {
        this.e = i81Var;
        this.d = context;
    }
}
