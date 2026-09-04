package ng;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ji.u4;
import k2.g0;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.x5;
public final class g extends kl0 {
    public final int f16735c = 0;
    public final Context d;
    public final FrameLayout f16736e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.f16736e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(c1 c1Var) {
        switch (this.f16735c) {
            case 0:
                if (j.d(3)[c1Var.f45742f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f16735c) {
            case 0:
                return ((i) this.f16736e).E.size();
            default:
                return ((h81) this.f16736e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f16735c) {
            case 1:
                return ((e81) ((h81) this.f16736e).h.get(i10)).f25602a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f16735c) {
            case 0:
                return j.c(((a) ((i) this.f16736e).E.get(i10)).f16720b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        g81 g81Var;
        switch (this.f16735c) {
            case 0:
                View view = c1Var.f45738a;
                a aVar = (a) ((i) this.f16736e).E.get(i10);
                int i11 = aVar.f16720b;
                s6 s6Var = aVar.f16723f;
                CharSequence charSequence = aVar.f16719a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f16741f = charSequence.toString();
                            hVar.d = ((Float) s6Var.get(null)).floatValue();
                            hVar.f16738b = aVar.d;
                            hVar.f16739c = aVar.f16722e;
                            hVar.f16740e = s6Var;
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
                x1 x1Var = (x1) view;
                x1Var.setTextColor(j6.w0(null, j6.f20770j5, false));
                x1Var.a(0, charSequence);
                return;
            default:
                f81 f81Var = (f81) c1Var.f45738a;
                h81 h81Var = (h81) this.f16736e;
                e81 e81Var = (e81) h81Var.h.get(i10);
                f81Var.f25955a = e81Var;
                f81Var.setContentDescription(e81Var.f25603b);
                f81Var.setAlpha(1.0f);
                f81Var.requestLayout();
                if (h81Var.m0 && (g81Var = h81Var.f26659y) != null && ((g0) g81Var).i(i10)) {
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
        switch (this.f16735c) {
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
                        frameLayout2.f16737a = fo0Var;
                        fo0Var.setReportChanges(true);
                        fo0Var.setDelegate(new u4((Object) frameLayout2, 7));
                        fo0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(fo0Var, x5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new l4(context);
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new c1(frameLayout);
            default:
                return new c1(new f81((h81) this.f16736e, this.d));
        }
    }

    public g(h81 h81Var, Context context) {
        this.f16736e = h81Var;
        this.d = context;
    }
}
