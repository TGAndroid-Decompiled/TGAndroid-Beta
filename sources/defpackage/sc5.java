package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class sc5 extends q59 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final uc5 f;

    public sc5(uc5 uc5Var, Context context) {
        this.f = uc5Var;
        this.c = context;
    }

    @Override
    public final void A(u69 u69Var) {
        if (u69Var.f == 2) {
            ((xc5) u69Var.a).a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i != 3 && i != 4) {
            if (i != 6 || !this.f.R) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.e.size();
    }

    @Override
    public final int d(int i) {
        return ((rc5) this.e.get(i)).a;
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new ja(0, true));
        uc5 uc5Var = this.f;
        if (uc5Var.Q == 5) {
            arrayList.add(new ja(6, true));
            arrayList.add(new rc5(jb6.M0(2131750520, null)));
        } else {
            arrayList.add(new ja(4, true));
            arrayList.add(new rc5(jb6.M0(2131749212, null)));
        }
        if (uc5Var.U != null) {
            arrayList.add(new ja(1, true));
            arrayList.add(new ja(3, true));
            arrayList.add(new ja(0, true));
        }
        if (uc5Var.L.size() > 0) {
            arrayList.add(new ja(1, true));
            this.d = arrayList.size();
            for (int i = 0; i < uc5Var.L.size(); i++) {
                arrayList.add(new ja(2, true));
            }
            arrayList.add(new ja(7, true));
        }
        super.f();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        String c0;
        boolean z;
        int i2 = u69Var.f;
        View view = u69Var.a;
        ArrayList arrayList = this.e;
        boolean z2 = false;
        uc5 uc5Var = this.f;
        switch (i2) {
            case 1:
                jf5 jf5Var = (jf5) view;
                if (uc5Var.U != null && i == 1) {
                    jf5Var.setText(jb6.M0(2131753926, null));
                    return;
                } else {
                    jf5Var.setText(jb6.G(uc5Var.L.size(), "Members", new Object[0]));
                    return;
                }
            case 2:
                xc5 xc5Var = (xc5) view;
                xc5Var.d(uc5Var.getMessagesController().W1((Long) uc5Var.L.get(i - this.d)), null, null);
                if (i != arrayList.size() - 1) {
                    z2 = true;
                }
                xc5Var.setDrawDivider(z2);
                return;
            case 3:
                ((vkb) view).b(uc5Var.U, false);
                return;
            case 4:
                xib xibVar = (xib) view;
                int i3 = uc5Var.X;
                if (i3 == 0) {
                    c0 = jb6.M0(2131747172, null);
                } else {
                    c0 = jb6.c0(i3);
                }
                String str = c0;
                String M0 = jb6.M0(2131753815, null);
                z = ((d) uc5Var).fragmentBeginToShow;
                xibVar.u(M0, str, z, 2131232066, false);
                return;
            case 5:
                ((njb) view).setText(((rc5) arrayList.get(i)).c);
                return;
            case 6:
                xib xibVar2 = (xib) view;
                xibVar2.n(2131232413, jb6.M0(2131752219, null), true);
                xibVar2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        jf5 jf5Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                    jf5Var = new vkb(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    jf5Var = view;
                                }
                            } else {
                                jf5Var = new xib(23, this.f.getResourceProvider(), context, false, true);
                            }
                        } else {
                            jf5Var = new njb(context);
                        }
                    } else {
                        jf5Var = new xib(context);
                    }
                } else {
                    jf5Var = new xc5(context, 0, 3, false);
                }
            } else {
                jf5 jf5Var2 = new jf5(context);
                jf5Var2.setHeight(46);
                jf5Var = jf5Var2;
            }
        } else {
            jf5Var = new bba(context, (hg9) null);
        }
        return new u69(jf5Var);
    }
}
