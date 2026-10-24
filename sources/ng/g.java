package ng;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.LaunchActivity;
import s4.b1;
import s4.o0;
import w7.z5;
public final class g extends km0 {
    public final int f17521c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(b1 b1Var) {
        switch (this.f17521c) {
            case 0:
                if (j.d(3)[b1Var.f46345f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f17521c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((k91) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f17521c) {
            case 1:
                return ((h91) ((k91) this.e).h.get(i10)).f26971a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f17521c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f17507b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        boolean z10;
        j91 j91Var;
        switch (this.f17521c) {
            case 0:
                View view = b1Var.f46342a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f17507b;
                q6 q6Var = aVar.f17509f;
                CharSequence charSequence = aVar.f17506a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f17525f = charSequence.toString();
                            hVar.d = ((Float) q6Var.get(null)).floatValue();
                            hVar.f17523b = aVar.d;
                            hVar.f17524c = aVar.e;
                            hVar.e = q6Var;
                            hVar.invalidate();
                            return;
                        }
                        return;
                    }
                    l4 l4Var = (l4) view;
                    l4Var.setTextColor(k6.x0(null, k6.L6, false));
                    l4Var.setText(charSequence);
                    return;
                }
                w1 w1Var = (w1) view;
                w1Var.setTextColor(k6.x0(null, k6.f21290j5, false));
                w1Var.a(0, charSequence);
                return;
            default:
                i91 i91Var = (i91) b1Var.f46342a;
                k91 k91Var = (k91) this.e;
                h91 h91Var = (h91) k91Var.h.get(i10);
                i91Var.f27374a = h91Var;
                i91Var.setContentDescription(h91Var.f26972b);
                i91Var.setAlpha(1.0f);
                i91Var.requestLayout();
                if (k91Var.m0 && (j91Var = k91Var.f27989y) != null && ((l2.f) j91Var).l(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i91Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f17521c) {
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
                        gp0 gp0Var = new gp0(context);
                        frameLayout2.f17522a = gp0Var;
                        gp0Var.setReportChanges(true);
                        gp0Var.setDelegate(new l2.f((Object) frameLayout2, 5));
                        gp0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(gp0Var, z5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new l4(context);
                }
                frameLayout.setLayoutParams(new o0(-1, -2));
                return new b1(frameLayout);
            default:
                return new b1(new i91((k91) this.e, this.d));
        }
    }

    public g(k91 k91Var, Context context) {
        this.e = k91Var;
        this.d = context;
    }
}
