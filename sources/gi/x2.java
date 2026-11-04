package gi;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.zi0;
public final class x2 extends zi0 {
    public final d3 f13824c;

    public x2(d3 d3Var) {
        this.f13824c = d3Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i3) {
        ye yeVar;
        int i10 = i3 - 2;
        d3 d3Var = this.f13824c;
        if (d3Var.f12565d0) {
            if (i10 == 0) {
                return null;
            }
            i10 = i3 - 3;
        } else if (d3Var.f12567e0) {
            if (i10 >= 0 && i10 < d3Var.f12564c0.size()) {
                return bd.e0(((f7) d3Var.f12564c0.get(i10)).d / 1000, true);
            }
            i10 -= d3Var.f12564c0.size();
        }
        ArrayList arrayList = d3Var.f12570g0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (yeVar = (ye) d3Var.f12570g0.get(i10)) == null) {
            return null;
        }
        long j10 = yeVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return bd.e0(j10, true);
    }

    @Override
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        int i3;
        int e10 = e();
        d3 d3Var = this.f13824c;
        fi.g gVar = d3Var.f12566e;
        float f11 = gVar.J;
        int width = (int) (((int) (((tj0Var.getWidth() - tj0Var.getPaddingLeft()) - tj0Var.getPaddingRight()) / f11)) * d3Var.P);
        int ceil = (int) Math.ceil(e10 / f11);
        float W1 = (org.telegram.messenger.g0.W1(f10, 0, Math.max(0, i3 - ((org.telegram.messenger.g0.f22608q.y - tj0Var.getPaddingTop()) - tj0Var.getPaddingBottom()))) / (ceil * width)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, gVar.J * round) + 2;
        iArr[1] = tj0Var.getPaddingTop() + ((int) ((W1 - round) * width));
    }

    @Override
    public final float H(tj0 tj0Var) {
        d3 d3Var;
        int e10 = e();
        float f10 = this.f13824c.f12566e.J;
        return (Math.max(0, tj0Var.computeVerticalScrollOffset() - d3Var.getPadding()) - tj0Var.getPaddingTop()) / ((((int) Math.ceil(e10 / f10)) * ((int) (((int) (((tj0Var.getWidth() - tj0Var.getPaddingLeft()) - tj0Var.getPaddingRight()) / f10)) * d3Var.P))) - (org.telegram.messenger.g0.f22608q.y - tj0Var.getPaddingTop()));
    }

    @Override
    public final int b() {
        return e() + 3;
    }

    @Override
    public final int d(int i3) {
        if (i3 != 0 && i3 != b() - 1) {
            if (i3 == 1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final int e() {
        int size;
        d3 d3Var = this.f13824c;
        ArrayList arrayList = d3Var.f12570g0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (d3Var.f12565d0) {
            return size + 1;
        }
        if (d3Var.f12567e0) {
            return d3Var.f12564c0.size() + size;
        }
        return size;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        d3 d3Var = this.f13824c;
        ArrayList arrayList = d3Var.f12572i0;
        ArrayList arrayList2 = d3Var.f12564c0;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        int i11 = -1;
        if (i10 == 0) {
            a3 a3Var = (a3) view;
            if (i3 == 0) {
                i11 = d3Var.getPadding();
            }
            a3Var.f12386a = i11;
        } else if (i10 == 2) {
            z2 z2Var = (z2) view;
            boolean z13 = true;
            if (i3 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i3 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z2Var.V = z10;
            z2Var.W = z11;
            z2Var.N = new w2(this, z2Var, 0);
            z2Var.O = new w2(this, z2Var, 1);
            int i12 = i3 - 2;
            if (d3Var.f12565d0) {
                if (i12 == 0) {
                    z2Var.f(-1, false, false);
                    z2Var.e(arrayList2.size(), (f7) arrayList2.get(0));
                    return;
                }
                i12 = i3 - 3;
            } else if (d3Var.f12567e0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    z2Var.f(-1, false, false);
                    z2Var.e(0, (f7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = d3Var.f12570g0;
            if (arrayList3 != null && i12 >= 0 && i12 < arrayList3.size()) {
                ye yeVar = (ye) d3Var.f12570g0.get(i12);
                if (arrayList.isEmpty() && !d3Var.R) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(yeVar);
                if (z2Var.T != yeVar) {
                    z13 = false;
                }
                z2Var.f(indexOf, z12, z13);
                z2Var.T = yeVar;
                if (yeVar != null && yeVar.f25310b && !yeVar.d()) {
                    str = org.telegram.messenger.g0.g0(yeVar.E, false, false);
                } else {
                    str = null;
                }
                z2Var.g(str);
                z2Var.G = null;
                if (yeVar == null) {
                    z2Var.P = null;
                } else if (yeVar.f25310b) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
                    sb2.append(bd.z(yeVar.E));
                    z2Var.P = sb2.toString();
                } else {
                    z2Var.P = bd.M0(2131753948, null);
                }
                z2Var.b(yeVar);
                z2Var.invalidate();
                if (d3Var.N) {
                    z2Var.J.setOnClickListener(new ai.h(this, yeVar, z2Var, 14));
                }
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        float f10;
        float f11;
        ai.d2 d2Var;
        d3 d3Var = this.f13824c;
        if (i3 == 0) {
            d2Var = new a3(d3Var, d3Var.getContext());
        } else if (i3 == 1) {
            Context context = d3Var.getContext();
            boolean z10 = d3Var.M;
            ai.d2 d2Var2 = new ai.d2(context, 3);
            if (z10) {
                f10 = 14.0f;
            } else {
                f10 = 16.0f;
            }
            d2Var2.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(d3Var.getTitle());
            if (z10) {
                f11 = 32.0f;
            } else {
                f11 = 0.0f;
            }
            d2Var2.addView(textView, mf.d(-1, -1.0f, 119, 0.0f, 0.0f, f11, 0.0f));
            d3Var.f12573j0 = d2Var2;
            d2Var = d2Var2;
        } else {
            d2Var = new z2(d3Var.getContext(), d3Var.f12561b, d3Var.P, d3Var.N);
        }
        return new u4.d1(d2Var);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        boolean z10;
        d3 d3Var = this.f13824c;
        ArrayList arrayList = d3Var.f12572i0;
        if (d1Var.f55544f == 2) {
            z2 z2Var = (z2) d1Var.f55540a;
            Object obj = z2Var.T;
            if (obj instanceof ye) {
                ye yeVar = (ye) obj;
                if (arrayList.isEmpty() && !d3Var.R) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                z2Var.f(arrayList.indexOf(yeVar), z10, false);
                return;
            }
            z2Var.f(-1, false, false);
        }
    }
}
