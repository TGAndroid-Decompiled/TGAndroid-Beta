package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public final class vc5 extends c79 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final xc5 f;

    public vc5(xc5 xc5Var, Context context) {
        this.f = xc5Var;
        this.c = context;
    }

    @Override
    public final void A(f89 f89Var) {
        if (f89Var.f == 2) {
            ((bd5) f89Var.a).a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
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
        return ((uc5) this.e.get(i)).a;
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new ka(0, true));
        xc5 xc5Var = this.f;
        if (xc5Var.Q == 5) {
            arrayList.add(new ka(6, true));
            arrayList.add(new uc5(ob6.M0(2131750548, null)));
        } else {
            arrayList.add(new ka(4, true));
            arrayList.add(new uc5(ob6.M0(2131749209, null)));
        }
        if (xc5Var.U != null) {
            arrayList.add(new ka(1, true));
            arrayList.add(new ka(3, true));
            arrayList.add(new ka(0, true));
        }
        if (xc5Var.L.size() > 0) {
            arrayList.add(new ka(1, true));
            this.d = arrayList.size();
            for (int i = 0; i < xc5Var.L.size(); i++) {
                arrayList.add(new ka(2, true));
            }
            arrayList.add(new ka(7, true));
        }
        super.f();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String c0;
        boolean z;
        int i2 = f89Var.f;
        View view = f89Var.a;
        ArrayList arrayList = this.e;
        boolean z2 = false;
        xc5 xc5Var = this.f;
        switch (i2) {
            case 1:
                mf5 mf5Var = (mf5) view;
                if (xc5Var.U != null && i == 1) {
                    mf5Var.setText(ob6.M0(2131753954, null));
                    return;
                } else {
                    mf5Var.setText(ob6.G(xc5Var.L.size(), "Members", new Object[0]));
                    return;
                }
            case 2:
                bd5 bd5Var = (bd5) view;
                bd5Var.d(xc5Var.getMessagesController().X1((Long) xc5Var.L.get(i - this.d)), null, null);
                if (i != arrayList.size() - 1) {
                    z2 = true;
                }
                bd5Var.setDrawDivider(z2);
                return;
            case 3:
                ((qmb) view).b(xc5Var.U, false);
                return;
            case 4:
                skb skbVar = (skb) view;
                int i3 = xc5Var.X;
                if (i3 == 0) {
                    c0 = ob6.M0(2131747166, null);
                } else {
                    c0 = ob6.c0(i3);
                }
                String str = c0;
                String M0 = ob6.M0(2131753843, null);
                z = ((e) xc5Var).fragmentBeginToShow;
                skbVar.u(M0, str, z, 2131232065, false);
                return;
            case 5:
                ((ilb) view).setText(((uc5) arrayList.get(i)).c);
                return;
            case 6:
                skb skbVar2 = (skb) view;
                skbVar2.n(2131232412, ob6.M0(2131752247, null), true);
                skbVar2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        mf5 mf5Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                    mf5Var = new qmb(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    mf5Var = view;
                                }
                            } else {
                                mf5Var = new skb(23, this.f.getResourceProvider(), context, false, true);
                            }
                        } else {
                            mf5Var = new ilb(context);
                        }
                    } else {
                        mf5Var = new skb(context);
                    }
                } else {
                    mf5Var = new bd5(context, 0, 3, false);
                }
            } else {
                mf5 mf5Var2 = new mf5(context);
                mf5Var2.setHeight(46);
                mf5Var = mf5Var2;
            }
        } else {
            mf5Var = new rca(context, (uh9) null);
        }
        return new f89(mf5Var);
    }
}
