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
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.z5;
public final class g extends yl0 {
    public final int f16421c = 0;
    public final Context d;
    public final FrameLayout f16422e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.f16422e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(c1 c1Var) {
        switch (this.f16421c) {
            case 0:
                if (j.d(3)[c1Var.f46542f] == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.f16421c) {
            case 0:
                return ((i) this.f16422e).E.size();
            default:
                return ((g91) this.f16422e).h.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f16421c) {
            case 1:
                return ((d91) ((g91) this.f16422e).h.get(i10)).f25731a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f16421c) {
            case 0:
                return j.c(((a) ((i) this.f16422e).E.get(i10)).f16406b);
            default:
                return 0;
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        f91 f91Var;
        switch (this.f16421c) {
            case 0:
                View view = c1Var.f46538a;
                a aVar = (a) ((i) this.f16422e).E.get(i10);
                int i11 = aVar.f16406b;
                r6 r6Var = aVar.f16409f;
                CharSequence charSequence = aVar.f16405a;
                int c10 = j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            h hVar = (h) view;
                            hVar.f16427f = charSequence.toString();
                            hVar.d = ((Float) r6Var.get(null)).floatValue();
                            hVar.f16424b = aVar.d;
                            hVar.f16425c = aVar.f16408e;
                            hVar.f16426e = r6Var;
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
                x1Var.setTextColor(i6.w0(null, i6.f20935j5, false));
                x1Var.a(0, charSequence);
                return;
            default:
                e91 e91Var = (e91) c1Var.f46538a;
                g91 g91Var = (g91) this.f16422e;
                d91 d91Var = (d91) g91Var.h.get(i10);
                e91Var.f26083a = d91Var;
                e91Var.setContentDescription(d91Var.f25732b);
                e91Var.setAlpha(1.0f);
                e91Var.requestLayout();
                if (g91Var.m0 && (f91Var = g91Var.f26794y) != null && ((n2.c) f91Var).b(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e91Var.setReordering(z10);
                return;
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f16421c) {
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
                        zo0 zo0Var = new zo0(context);
                        frameLayout2.f16423a = zo0Var;
                        zo0Var.setReportChanges(true);
                        zo0Var.setDelegate(new k2.e((Object) frameLayout2, 4));
                        zo0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(zo0Var, z5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new m4(context);
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new c1(frameLayout);
            default:
                return new c1(new e91((g91) this.f16422e, this.d));
        }
    }

    public g(g91 g91Var, Context context) {
        this.f16422e = g91Var;
        this.d = context;
    }
}
