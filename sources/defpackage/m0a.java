package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class m0a extends c79 {
    public final n1a c;

    public m0a(n1a n1aVar) {
        this.c = n1aVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i == 2 || i == 1 || i == 3 || i == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.c.v0;
    }

    @Override
    public final long c(int i) {
        return Math.abs(((Long) this.c.w0.get(i)).longValue());
    }

    @Override
    public final int d(int i) {
        n1a n1aVar = this.c;
        if (i == n1aVar.a) {
            return 7;
        }
        if (i < n1aVar.b || i >= n1aVar.c) {
            if (i < n1aVar.d || i >= n1aVar.e) {
                if (i >= n1aVar.F && i < n1aVar.G) {
                    return 1;
                }
                if (i < n1aVar.r || i >= n1aVar.s) {
                    if (n1aVar.z0.indexOfKey(i) >= 0) {
                        return 4;
                    }
                    if (n1aVar.A0.indexOfKey(i) >= 0) {
                        return 5;
                    }
                    if (i == n1aVar.w) {
                        return 6;
                    }
                    if (n1aVar.x0.indexOfKey(i) < 0 && i != n1aVar.f && i != n1aVar.E && i != n1aVar.n && i != n1aVar.h && i != n1aVar.y) {
                        if (i == n1aVar.x) {
                            return 8;
                        }
                        return 3;
                    }
                    return 0;
                }
                return 3;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final void t(defpackage.f89 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0a.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        c19 c19Var;
        int o;
        n1a n1aVar = this.c;
        int i2 = n1aVar.a0;
        vnb vnbVar = n1aVar.a1;
        boolean z = false;
        if (i == 0) {
            Context context = n1aVar.getContext();
            if (i2 == 6) {
                z = true;
            }
            c19Var = new s0a(n1aVar, context, z);
        } else if (i == 2) {
            c19Var = new ImageView(n1aVar.getContext());
        } else if (i != 3 && i != 1 && i != 8) {
            if (i == 4) {
                Context context2 = n1aVar.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (n1aVar.h1) {
                    o = aob.v(n1aVar.g1, aob.p1(0.4f, aob.w0(null, aob.d6, false)));
                } else {
                    o = vm2.o(aob.w0(null, aob.Lf, false), 99);
                }
                if (n1aVar.h1) {
                    textView.setBackground(aob.b0(hl.L(11.0f), o));
                } else {
                    ShapeDrawable b0 = aob.b0(hl.L(11.0f), o);
                    uob g = yob.g(aob.Lf, 99);
                    textView.setBackground(b0);
                    yob.j(textView, b0, g, null, null);
                }
                textView.setTypeface(hl.o());
                textView.setPadding(hl.L(4.0f), hl.L(1.66f), hl.L(4.0f), hl.L(2.0f));
                frameLayout.addView(textView, tre.e(-2, -2, 17));
                c19Var = frameLayout;
            } else if (i == 5) {
                ?? frameLayout2 = new FrameLayout(n1aVar.getContext());
                si siVar = new si(frameLayout2.getContext(), false, false, false, (byte) 3);
                frameLayout2.b = siVar;
                siVar.b(0.3f, 250L, k43.h);
                siVar.setTextSize(hl.L(14.0f));
                siVar.setTypeface(hl.o());
                yob.U(siVar, aob.Ji, vnbVar);
                siVar.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.a = frameLayout3;
                int i3 = aob.Fi;
                hf0 e = rnb.e(aob.v0(i3, vnbVar), 8.0f);
                uob M = yob.M(i3);
                uob e2 = yob.e(i3);
                frameLayout3.setBackground(e);
                yob.j(frameLayout3, e, M, e2, vnbVar);
                frameLayout3.addView(siVar, tre.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, tre.c(-1.0f, -1));
                ok8 ok8Var = new ok8(vnbVar, frameLayout2.getContext(), false);
                frameLayout2.c = ok8Var;
                ok8Var.setIcon(2131624310);
                frameLayout2.addView(ok8Var, tre.c(-1.0f, -1));
                c19Var = frameLayout2;
            } else if (i == 6) {
                c19 c19Var2 = new c19(n1aVar.getContext(), (byte) 1);
                c19Var2.setTextSize(1, 13.0f);
                if (i2 == 3) {
                    c19Var2.setText(ob6.M0(2131745376, null));
                } else if (i2 != 0 && i2 != 12 && i2 != 9 && i2 != 10) {
                    c19Var2.setText(ob6.M0(2131746107, null));
                } else {
                    c19Var2.setText(ob6.M0(2131751141, null));
                }
                c19Var2.setGravity(17);
                yob.X(c19Var2, aob.y6, vnbVar);
                c19Var = c19Var2;
            } else if (i == 7) {
                View ak4Var = new ak4(n1aVar.getContext(), 52, (byte) 0);
                ak4Var.setTag("searchbox");
                c19Var = ak4Var;
            } else {
                c19Var = new w0a(n1aVar, n1aVar.getContext());
            }
        } else {
            w0a w0aVar = new w0a(n1aVar, n1aVar.getContext());
            if (i == 8) {
                w0aVar.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(w0aVar);
                w0aVar.h = imageReceiver;
                w0aVar.r = imageReceiver;
                imageReceiver.g0(n1aVar.O);
                n1aVar.P = w0aVar;
                w0aVar.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
            }
            c19Var = w0aVar;
        }
        if (n1aVar.g()) {
            c19Var.setScaleX(0.0f);
            c19Var.setScaleY(0.0f);
        }
        return new f89(c19Var);
    }
}
