package fi;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gf;
import org.telegram.messenger.id;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.vi0;
public final class z2 extends vi0 {
    public final f3 f13242c;

    public z2(f3 f3Var) {
        this.f13242c = f3Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57048f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        gf gfVar;
        int i10 = i7 - 2;
        f3 f3Var = this.f13242c;
        if (f3Var.f11961c0) {
            if (i10 == 0) {
                return null;
            }
            i10 = i7 - 3;
        } else if (f3Var.f11962d0) {
            if (i10 >= 0 && i10 < f3Var.f11959b0.size()) {
                return id.e0(((e7) f3Var.f11959b0.get(i10)).d / 1000, true);
            }
            i10 -= f3Var.f11959b0.size();
        }
        ArrayList arrayList = f3Var.f11966f0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (gfVar = (gf) f3Var.f11966f0.get(i10)) == null) {
            return null;
        }
        long j3 = gfVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return id.e0(j3, true);
    }

    @Override
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int i7;
        int e10 = e();
        f3 f3Var = this.f13242c;
        ei.h hVar = f3Var.f11963e;
        float f11 = hVar.J;
        int width = (int) (((int) (((pj0Var.getWidth() - pj0Var.getPaddingLeft()) - pj0Var.getPaddingRight()) / f11)) * f3Var.O);
        int ceil = (int) Math.ceil(e10 / f11);
        float W1 = (org.telegram.messenger.g0.W1(f10, 0, Math.max(0, i7 - ((org.telegram.messenger.g0.f22563q.y - pj0Var.getPaddingTop()) - pj0Var.getPaddingBottom()))) / (ceil * width)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, hVar.J * round) + 2;
        iArr[1] = pj0Var.getPaddingTop() + ((int) ((W1 - round) * width));
    }

    @Override
    public final float H(pj0 pj0Var) {
        f3 f3Var;
        int e10 = e();
        float f10 = this.f13242c.f11963e.J;
        return (Math.max(0, pj0Var.computeVerticalScrollOffset() - f3Var.getPadding()) - pj0Var.getPaddingTop()) / ((((int) Math.ceil(e10 / f10)) * ((int) (((int) (((pj0Var.getWidth() - pj0Var.getPaddingLeft()) - pj0Var.getPaddingRight()) / f10)) * f3Var.O))) - (org.telegram.messenger.g0.f22563q.y - pj0Var.getPaddingTop()));
    }

    @Override
    public final int b() {
        return e() + 3;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0 && i7 != b() - 1) {
            if (i7 == 1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final int e() {
        int size;
        f3 f3Var = this.f13242c;
        ArrayList arrayList = f3Var.f11966f0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (f3Var.f11961c0) {
            return size + 1;
        }
        if (f3Var.f11962d0) {
            return f3Var.f11959b0.size() + size;
        }
        return size;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        boolean z11;
        String str;
        f3 f3Var = this.f13242c;
        ArrayList arrayList = f3Var.f11968h0;
        ArrayList arrayList2 = f3Var.f11959b0;
        int i10 = d1Var.f57048f;
        View view = d1Var.f57044a;
        int i11 = -1;
        if (i10 == 0) {
            c3 c3Var = (c3) view;
            if (i7 == 0) {
                i11 = f3Var.getPadding();
            }
            c3Var.f11725a = i11;
        } else if (i10 == 2) {
            b3 b3Var = (b3) view;
            boolean z12 = true;
            if (i7 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i7 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            b3Var.U = z9;
            b3Var.V = z10;
            b3Var.M = new y2(this, b3Var, 0);
            b3Var.N = new y2(this, b3Var, 1);
            int i12 = i7 - 2;
            if (f3Var.f11961c0) {
                if (i12 == 0) {
                    b3Var.f(-1, false, false);
                    b3Var.e(arrayList2.size(), (e7) arrayList2.get(0));
                    return;
                }
                i12 = i7 - 3;
            } else if (f3Var.f11962d0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    b3Var.f(-1, false, false);
                    b3Var.e(0, (e7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = f3Var.f11966f0;
            if (arrayList3 != null && i12 >= 0 && i12 < arrayList3.size()) {
                gf gfVar = (gf) f3Var.f11966f0.get(i12);
                if (arrayList.isEmpty() && !f3Var.Q) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int indexOf = arrayList.indexOf(gfVar);
                if (b3Var.S != gfVar) {
                    z12 = false;
                }
                b3Var.f(indexOf, z11, z12);
                b3Var.S = gfVar;
                if (gfVar != null && gfVar.f26845b && !gfVar.d()) {
                    str = org.telegram.messenger.g0.g0(gfVar.E, false, false);
                } else {
                    str = null;
                }
                b3Var.g(str);
                b3Var.F = null;
                if (gfVar == null) {
                    b3Var.O = null;
                } else if (gfVar.f26845b) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
                    sb2.append(id.z(gfVar.E));
                    b3Var.O = sb2.toString();
                } else {
                    b3Var.O = id.M0(2131753948, null);
                }
                b3Var.b(gfVar);
                b3Var.invalidate();
                if (f3Var.M) {
                    b3Var.I.setOnClickListener(new ah.g(this, gfVar, b3Var, 9));
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        float f10;
        float f11;
        di.a4 a4Var;
        f3 f3Var = this.f13242c;
        if (i7 == 0) {
            a4Var = new c3(f3Var, f3Var.getContext());
        } else if (i7 == 1) {
            Context context = f3Var.getContext();
            boolean z9 = f3Var.L;
            di.a4 a4Var2 = new di.a4(context, 1);
            if (z9) {
                f10 = 14.0f;
            } else {
                f10 = 16.0f;
            }
            a4Var2.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(f3Var.getTitle());
            if (z9) {
                f11 = 32.0f;
            } else {
                f11 = 0.0f;
            }
            a4Var2.addView(textView, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, f11, 0.0f));
            f3Var.f11969i0 = a4Var2;
            a4Var = a4Var2;
        } else {
            a4Var = new b3(f3Var.getContext(), f3Var.f11958b, f3Var.O, f3Var.M);
        }
        return new v4.d1(a4Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        boolean z9;
        f3 f3Var = this.f13242c;
        ArrayList arrayList = f3Var.f11968h0;
        if (d1Var.f57048f == 2) {
            b3 b3Var = (b3) d1Var.f57044a;
            Object obj = b3Var.S;
            if (obj instanceof gf) {
                gf gfVar = (gf) obj;
                if (arrayList.isEmpty() && !f3Var.Q) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                b3Var.f(arrayList.indexOf(gfVar), z9, false);
                return;
            }
            b3Var.f(-1, false, false);
        }
    }
}
