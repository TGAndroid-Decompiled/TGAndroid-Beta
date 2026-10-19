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
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.z81;
import org.telegram.ui.LaunchActivity;
import s4.b1;
import s4.o0;
import w7.z5;
public final class g extends hm0 {
    public final int f17460c = 0;
    public final Context d;
    public final FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(b1 b1Var) {
        switch (this.f17460c) {
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
        switch (this.f17460c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((c91) this.e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f17460c) {
            case 1:
                return ((z81) ((c91) this.e).h.get(i10)).f32888a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f17460c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).f17446b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        boolean z10;
        b91 b91Var;
        switch (this.f17460c) {
            case 0:
                View view = b1Var.f45910a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.f17446b;
                s6 s6Var = aVar.f17448f;
                CharSequence charSequence = aVar.f17445a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f17464f = charSequence.toString();
                            hVar.d = ((Float) s6Var.get(null)).floatValue();
                            hVar.f17462b = aVar.d;
                            hVar.f17463c = aVar.e;
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
                x1Var.setTextColor(h6.x0(null, h6.f21095j5, false));
                x1Var.a(0, charSequence);
                return;
            default:
                a91 a91Var = (a91) b1Var.f45910a;
                c91 c91Var = (c91) this.e;
                z81 z81Var = (z81) c91Var.h.get(i10);
                a91Var.f24526a = z81Var;
                a91Var.setContentDescription(z81Var.f32889b);
                a91Var.setAlpha(1.0f);
                a91Var.requestLayout();
                if (c91Var.m0 && (b91Var = c91Var.f25153y) != null && ((l2.f) b91Var).z(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a91Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f17460c) {
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
                        frameLayout2.f17461a = cp0Var;
                        cp0Var.setReportChanges(true);
                        cp0Var.setDelegate(new l2.f((Object) frameLayout2, 5));
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
                return new b1(new a91((c91) this.e, this.d));
        }
    }

    public g(c91 c91Var, Context context) {
        this.e = c91Var;
        this.d = context;
    }
}
