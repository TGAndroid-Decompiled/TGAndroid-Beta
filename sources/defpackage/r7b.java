package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r7b extends ka {
    public final Context d;
    public final ylb e;
    public final o7b f;
    public r59 h;
    public final v7b n;

    public r7b(v7b v7bVar, Context context, ylb ylbVar, o7b o7bVar, s48 s48Var) {
        this.n = v7bVar;
        this.d = context;
        this.e = ylbVar;
        this.f = o7bVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if ((i != 3 || !this.n.a0.z1) && i != 7 && i != 9 && i != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i) {
        ArrayList arrayList = this.n.M;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            return ((k7b) arrayList.get(i)).a;
        }
        return -1;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        k7b k7bVar;
        boolean z;
        int i2;
        int i3;
        int i4;
        v7b v7bVar = this.n;
        a8b a8bVar = v7bVar.a0;
        ArrayList arrayList = v7bVar.M;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            k7b k7bVar2 = (k7b) arrayList.get(i);
            int i5 = u69Var.f;
            View view = u69Var.a;
            boolean z2 = true;
            int i6 = i + 1;
            if (i6 < arrayList.size()) {
                k7bVar = (k7b) arrayList.get(i6);
            } else {
                k7bVar = null;
            }
            if (k7bVar != null && ((i4 = k7bVar.a) == i5 || (i4 == 9 && k7bVar.q == 1))) {
                z = true;
            } else {
                z = false;
            }
            if (i5 == 3) {
                z7b z7bVar = (z7b) view;
                boolean z3 = k7bVar2.n;
                z7bVar.d(z3, !z3);
                byte b = k7bVar2.i;
                float f = 1.0f;
                if (b > 0) {
                    z7bVar.e(b, k7bVar2.j, k7bVar2.g);
                    z7bVar.b(false, 1.0f);
                } else {
                    TLRPC.User user = k7bVar2.g;
                    if (user != null) {
                        z7bVar.setUser(user);
                        if (k7bVar2.l && !k7bVar2.k) {
                            f = 0.5f;
                        }
                        z7bVar.b(false, f);
                    } else {
                        TLRPC.Chat chat = k7bVar2.h;
                        if (chat != null) {
                            int i7 = a8b.X1;
                            z7bVar.a(a8bVar.J0(chat), chat);
                        }
                    }
                }
                if (!k7bVar2.k && !k7bVar2.l) {
                    z2 = false;
                }
                z7bVar.c(z2, false);
                z7bVar.setDivider(z);
                z7bVar.setRedCheckbox(k7bVar2.m);
                z7bVar.w = a8bVar.z1;
            } else if (i5 != 2) {
                if (i5 == 0) {
                    view.setLayoutParams(new g69(-1, gm.L(56.0f)));
                } else if (i5 == -1) {
                    if (k7bVar2.o > 0) {
                        r59 r59Var = this.h;
                        if (r59Var != null && r59Var.getMeasuredHeight() > 0) {
                            i3 = this.h.getMeasuredHeight() + v7bVar.U;
                        } else {
                            i3 = gm.q.y;
                        }
                        i2 = Math.max(i3 - k7bVar2.o, gm.L(120.0f));
                        view.setTag(33);
                    } else {
                        i2 = k7bVar2.p;
                        if (i2 >= 0) {
                            view.setTag(null);
                        } else {
                            i2 = (int) (gm.q.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new g69(-1, i2));
                } else if (i5 == 1) {
                    view.setLayoutParams(new g69(-1, Math.min(gm.L(150.0f), this.f.L)));
                } else if (i5 == 4) {
                    j7b j7bVar = (j7b) view;
                    CharSequence charSequence = k7bVar2.e;
                    CharSequence charSequence2 = k7bVar2.f;
                    j7bVar.a.setText(charSequence);
                    j7bVar.b.setText(charSequence2);
                } else if (i5 == 11) {
                    j7b j7bVar2 = (j7b) view;
                    j7bVar2.a.setText(k7bVar2.e);
                    j7bVar2.b.setText((CharSequence) null);
                } else if (i5 == 5) {
                    try {
                        ((a1b) view).b.getImageReceiver().w0(false);
                    } catch (Exception unused) {
                    }
                } else if (i5 == 6) {
                    njb njbVar = (njb) view;
                    if (k7bVar2.e == null) {
                        njbVar.setFixedSize(12);
                        njbVar.setText(null);
                        return;
                    }
                    njbVar.setFixedSize(0);
                    njbVar.setText(k7bVar2.e);
                } else if (i5 == 7) {
                    byte b2 = k7bVar2.c;
                    if (b2 == 0) {
                        ((xib) view).l(k7bVar2.e, a8bVar.w1, z);
                    } else if (b2 == 1) {
                        ((xib) view).l(k7bVar2.e, a8bVar.x1, z);
                    } else if (b2 == 2) {
                        ((xib) view).l(k7bVar2.e, a8bVar.v1, z);
                    }
                } else if (i5 == 9) {
                    BitmapDrawable bitmapDrawable = k7bVar2.d;
                    if (bitmapDrawable != null) {
                        ((xib) view).v(k7bVar2.e, bitmapDrawable, z);
                    } else {
                        ((xib) view).q(k7bVar2.e, k7bVar2.f, false, z);
                    }
                } else if (i5 == 8) {
                    ((jf5) view).setText(k7bVar2.e);
                } else if (i5 == 10) {
                    int i8 = a8b.X1;
                    int f2 = (int) oc7.r1(a8bVar.a).l4.H1.f();
                    int[] a = jla.a(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, f2);
                    int j = Utilities.j(a8bVar.B1, f2, 0);
                    c1b c1bVar = new c1b((byte) 2);
                    ila ilaVar = new ila();
                    ilaVar.c = a;
                    ilaVar.d = (byte) 20;
                    ilaVar.e = c1bVar;
                    ((jla) view).d(j, ilaVar, new eg9(this, (byte) 17));
                }
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View xibVar;
        a1b a1bVar;
        Context context = this.d;
        if (i == -1) {
            a1bVar = new View(context);
        } else if (i == 0) {
            View view = new View(context);
            view.setTag(35);
            a1bVar = view;
        } else if (i == 1) {
            View view2 = new View(context);
            view2.setTag(34);
            a1bVar = view2;
        } else {
            ylb ylbVar = this.e;
            if (i == 3) {
                a1bVar = new z7b(context, ylbVar);
            } else if (i == 4) {
                a1bVar = new j7b(ylbVar, context, true);
            } else if (i == 11) {
                a1bVar = new j7b(ylbVar, context, false);
            } else if (i == 8) {
                View jf5Var = new jf5(context, ylbVar);
                anb.h(cmb.g5, ylbVar, jf5Var);
                a1bVar = jf5Var;
            } else if (i == 5) {
                a1b a1bVar2 = new a1b(context, null, 1, ylbVar);
                a1bVar2.d.setText(jb6.M0(2131747901, null));
                a1bVar2.e.setText(jb6.M0(2131745541, null));
                a1bVar2.a.setTranslationY(gm.L(24.0f));
                a1bVar = a1bVar2;
            } else if (i == 6) {
                View njbVar = new njb(context, ylbVar);
                njbVar.setBackgroundColor(-15921907);
                a1bVar = njbVar;
            } else {
                if (i == 7) {
                    xibVar = new xib(23, this.e, this.d, true, true);
                } else if (i == 9) {
                    xibVar = new xib(23, this.e, this.d, true, false);
                } else if (i == 10) {
                    a1bVar = new jla(context, ylbVar);
                } else {
                    a1bVar = new o72(context, (byte) 26);
                }
                a1bVar = xibVar;
            }
        }
        return new u69(a1bVar);
    }
}
