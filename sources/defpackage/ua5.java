package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class ua5 extends n39 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final wa5 f;

    public ua5(wa5 wa5Var, Context context) {
        this.f = wa5Var;
        this.c = context;
    }

    @Override
    public final void A(s49 s49Var) {
        if (s49Var.f == 2) {
            ((za5) s49Var.a).a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
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
        return ((ta5) this.e.get(i)).a;
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new ja(0, true));
        wa5 wa5Var = this.f;
        if (wa5Var.Q == 5) {
            arrayList.add(new ja(6, true));
            arrayList.add(new ta5(k96.M0(2131750571, null)));
        } else {
            arrayList.add(new ja(4, true));
            arrayList.add(new ta5(k96.M0(2131749263, null)));
        }
        if (wa5Var.U != null) {
            arrayList.add(new ja(1, true));
            arrayList.add(new ja(3, true));
            arrayList.add(new ja(0, true));
        }
        if (wa5Var.L.size() > 0) {
            arrayList.add(new ja(1, true));
            this.d = arrayList.size();
            for (int i = 0; i < wa5Var.L.size(); i++) {
                arrayList.add(new ja(2, true));
            }
            arrayList.add(new ja(7, true));
        }
        super.f();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        String c0;
        boolean z;
        int i2 = s49Var.f;
        View view = s49Var.a;
        ArrayList arrayList = this.e;
        boolean z2 = false;
        wa5 wa5Var = this.f;
        switch (i2) {
            case 1:
                ld5 ld5Var = (ld5) view;
                if (wa5Var.U != null && i == 1) {
                    ld5Var.setText(k96.M0(2131753958, null));
                    return;
                } else {
                    ld5Var.setText(k96.G(wa5Var.L.size(), "Members", new Object[0]));
                    return;
                }
            case 2:
                za5 za5Var = (za5) view;
                za5Var.d(wa5Var.getMessagesController().V1((Long) wa5Var.L.get(i - this.d)), null, null);
                if (i != arrayList.size() - 1) {
                    z2 = true;
                }
                za5Var.setDrawDivider(z2);
                return;
            case 3:
                ((uib) view).b(wa5Var.U, false);
                return;
            case 4:
                wgb wgbVar = (wgb) view;
                int i3 = wa5Var.X;
                if (i3 == 0) {
                    c0 = k96.M0(2131747246, null);
                } else {
                    c0 = k96.c0(i3);
                }
                String str = c0;
                String M0 = k96.M0(2131753847, null);
                z = ((d) wa5Var).fragmentBeginToShow;
                wgbVar.u(M0, str, z, 2131232065, false);
                return;
            case 5:
                ((mhb) view).setText(((ta5) arrayList.get(i)).c);
                return;
            case 6:
                wgb wgbVar2 = (wgb) view;
                wgbVar2.n(2131232412, k96.M0(2131752269, null), true);
                wgbVar2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        ld5 ld5Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                    ld5Var = new uib(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    ld5Var = view;
                                }
                            } else {
                                ld5Var = new wgb(23, this.f.getResourceProvider(), context, false, true);
                            }
                        } else {
                            ld5Var = new mhb(context);
                        }
                    } else {
                        ld5Var = new wgb(context);
                    }
                } else {
                    ld5Var = new za5(context, 0, 3, false);
                }
            } else {
                ld5 ld5Var2 = new ld5(context);
                ld5Var2.setHeight(46);
                ld5Var = ld5Var2;
            }
        } else {
            ld5Var = new b9a(context, (de9) null);
        }
        return new s49(ld5Var);
    }
}
