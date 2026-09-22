package mg;

import a4.m;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.x5;
public final class g extends kl0 {
    public final int f14816c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(c1 c1Var) {
        switch (this.f14816c) {
            case 0:
                if (j.d(3)[c1Var.f42674f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f14816c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((h81) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f14816c) {
            case 1:
                return ((e81) ((h81) this.e).h.get(i10)).f23580a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f14816c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f14802b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        g81 g81Var;
        switch (this.f14816c) {
            case 0:
                View view = c1Var.f42671a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f14802b;
                p6 p6Var = aVar.f14804f;
                CharSequence charSequence = aVar.f14801a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f14820f = charSequence.toString();
                            hVar.d = ((Float) p6Var.get(null)).floatValue();
                            hVar.f14818b = aVar.d;
                            hVar.f14819c = aVar.e;
                            hVar.e = p6Var;
                            hVar.invalidate();
                            return;
                        }
                        return;
                    }
                    m4 m4Var = (m4) view;
                    m4Var.setTextColor(i6.w0(null, i6.L6, false));
                    m4Var.setText(charSequence);
                    return;
                }
                x1 x1Var = (x1) view;
                x1Var.setTextColor(i6.w0(null, i6.f18940j5, false));
                x1Var.a(0, charSequence);
                return;
            default:
                f81 f81Var = (f81) c1Var.f42671a;
                h81 h81Var = (h81) this.e;
                e81 e81Var = (e81) h81Var.h.get(i10);
                f81Var.f23848a = e81Var;
                f81Var.setContentDescription(e81Var.f23581b);
                f81Var.setAlpha(1.0f);
                f81Var.requestLayout();
                if (h81Var.m0 && (g81Var = h81Var.f24617y) != null && ((ka.c) g81Var).d(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f81Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f14816c) {
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
                        frameLayout2.f14817a = fo0Var;
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
                return new c1(new f81((h81) this.e, this.d));
        }
    }

    public g(h81 h81Var, Context context) {
        this.e = h81Var;
        this.d = context;
    }
}
