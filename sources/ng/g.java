package ng;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.a91;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.z81;
import org.telegram.ui.LaunchActivity;
import s4.b1;
import s4.o0;
import w7.z5;
public final class g extends hm0 {
    public final int f17457c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(b1 b1Var) {
        switch (this.f17457c) {
            case 0:
                if (j.d(3)[b1Var.f45913f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f17457c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((b91) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f17457c) {
            case 1:
                return ((y81) ((b91) this.e).h.get(i10)).f32571a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f17457c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f17443b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        boolean z10;
        a91 a91Var;
        switch (this.f17457c) {
            case 0:
                View view = b1Var.f45910a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f17443b;
                s6 s6Var = aVar.f17445f;
                CharSequence charSequence = aVar.f17442a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f17461f = charSequence.toString();
                            hVar.d = ((Float) s6Var.get(null)).floatValue();
                            hVar.f17459b = aVar.d;
                            hVar.f17460c = aVar.e;
                            hVar.e = s6Var;
                            hVar.invalidate();
                            return;
                        }
                        return;
                    }
                    l4 l4Var = (l4) view;
                    l4Var.setTextColor(h6.x0(null, h6.L6, false));
                    l4Var.setText(charSequence);
                    return;
                }
                x1 x1Var = (x1) view;
                x1Var.setTextColor(h6.x0(null, h6.f21092j5, false));
                x1Var.a(0, charSequence);
                return;
            default:
                z81 z81Var = (z81) b1Var.f45910a;
                b91 b91Var = (b91) this.e;
                y81 y81Var = (y81) b91Var.h.get(i10);
                z81Var.f32861a = y81Var;
                z81Var.setContentDescription(y81Var.f32572b);
                z81Var.setAlpha(1.0f);
                z81Var.requestLayout();
                if (b91Var.m0 && (a91Var = b91Var.f24871y) != null && ((l2.f) a91Var).q(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z81Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f17457c) {
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
                        cp0 cp0Var = new cp0(context);
                        frameLayout2.f17458a = cp0Var;
                        cp0Var.setReportChanges(true);
                        cp0Var.setDelegate(new l2.f(frameLayout2, 4));
                        cp0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(cp0Var, z5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new l4(context);
                }
                frameLayout.setLayoutParams(new o0(-1, -2));
                return new b1(frameLayout);
            default:
                return new b1(new z81((b91) this.e, this.d));
        }
    }

    public g(b91 b91Var, Context context) {
        this.e = b91Var;
        this.d = context;
    }
}
