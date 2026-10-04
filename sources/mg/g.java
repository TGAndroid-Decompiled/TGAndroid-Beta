package mg;

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
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.z5;
public final class g extends yl0 {
    public final int f16411c = 0;
    public final Context d;
    public final FrameLayout f16412e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.f16412e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(c1 c1Var) {
        switch (this.f16411c) {
            case 0:
                if (j.d(3)[c1Var.f46527f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f16411c) {
            case 0:
                return ((i) this.f16412e).E.size();
            default:
                return ((f91) this.f16412e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f16411c) {
            case 1:
                return ((c91) ((f91) this.f16412e).h.get(i10)).f25276a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f16411c) {
            case 0:
                return j.c(((a) ((i) this.f16412e).E.get(i10)).f16396b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        e91 e91Var;
        switch (this.f16411c) {
            case 0:
                View view = c1Var.f46523a;
                a aVar = (a) ((i) this.f16412e).E.get(i10);
                int i11 = aVar.f16396b;
                r6 r6Var = aVar.f16399f;
                CharSequence charSequence = aVar.f16395a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f16417f = charSequence.toString();
                            hVar.d = ((Float) r6Var.get(null)).floatValue();
                            hVar.f16414b = aVar.d;
                            hVar.f16415c = aVar.f16398e;
                            hVar.f16416e = r6Var;
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
                x1Var.setTextColor(i6.w0(null, i6.f20925j5, false));
                x1Var.a(0, charSequence);
                return;
            default:
                d91 d91Var = (d91) c1Var.f46523a;
                f91 f91Var = (f91) this.f16412e;
                c91 c91Var = (c91) f91Var.h.get(i10);
                d91Var.f25666a = c91Var;
                d91Var.setContentDescription(c91Var.f25277b);
                d91Var.setAlpha(1.0f);
                d91Var.requestLayout();
                if (f91Var.m0 && (e91Var = f91Var.f26419y) != null && ((n2.c) e91Var).b(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d91Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f16411c) {
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
                        yo0 yo0Var = new yo0(context);
                        frameLayout2.f16413a = yo0Var;
                        yo0Var.setReportChanges(true);
                        yo0Var.setDelegate(new k2.e((Object) frameLayout2, 4));
                        yo0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(yo0Var, z5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new m4(context);
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new c1(frameLayout);
            default:
                return new c1(new d91((f91) this.f16412e, this.d));
        }
    }

    public g(f91 f91Var, Context context) {
        this.f16412e = f91Var;
        this.d = context;
    }
}
