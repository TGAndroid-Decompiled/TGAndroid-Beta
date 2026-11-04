package ei;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z4 extends k.a {
    public final a5 f11271c;

    public z4(a5 a5Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f11271c = a5Var;
    }

    @Override
    public final void k(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i3;
        int i10;
        int i11;
        int i12;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        a5 a5Var = this.f11271c;
        k5 k5Var = a5Var.f10089y;
        j5 j5Var = k5Var.F;
        if (j5Var != null && j5Var.f10538f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i3 = 2131231922;
        } else if (k5Var.P.f11180a) {
            i3 = 2131231917;
        } else {
            i3 = 2131231916;
        }
        int i13 = i3;
        if (z10) {
            i10 = 2131745299;
        } else {
            i10 = 2131745300;
        }
        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i13, bd.M0(i10, null), false, k5Var.f10578s);
        if (!k5Var.P.f11180a) {
            c2.setAlpha(0.5f);
        }
        c2.setOnClickListener(new View.OnClickListener(this) {
            public final z4 f11231b;

            {
                this.f11231b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var2 = this.f11231b.f11271c.f10089y;
                        w4 w4Var = k5Var2.P;
                        if (!w4Var.f11180a) {
                            w4 w4Var2 = k5Var2.N;
                            if (w4Var2 != null) {
                                w4Var.f11180a = true;
                                w4Var2.f11180a = true;
                            } else {
                                w4Var.f11180a = true;
                            }
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            k5Var2.O.a(k5Var2);
                        }
                        z4 z4Var = k5Var2.f10575f;
                        if (z4Var != null) {
                            z4Var.a();
                            return;
                        }
                        return;
                    default:
                        k5 k5Var3 = this.f11231b.f11271c.f10089y;
                        w4 w4Var3 = k5Var3.P;
                        if (w4Var3.f11180a) {
                            w4 w4Var4 = k5Var3.N;
                            if (w4Var4 != null) {
                                w4Var3.f11180a = false;
                                w4Var4.f11180a = false;
                            } else {
                                w4Var3.f11180a = false;
                            }
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            k5Var3.O.a(k5Var3);
                        }
                        z4 z4Var2 = k5Var3.f10575f;
                        if (z4Var2 != null) {
                            z4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!k5Var.P.f11180a) {
            i11 = 2131231920;
        } else {
            i11 = 2131231919;
        }
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i11, bd.M0(2131745298, null), false, k5Var.f10578s);
        if (k5Var.P.f11180a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final z4 f11231b;

            {
                this.f11231b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var2 = this.f11231b.f11271c.f10089y;
                        w4 w4Var = k5Var2.P;
                        if (!w4Var.f11180a) {
                            w4 w4Var2 = k5Var2.N;
                            if (w4Var2 != null) {
                                w4Var.f11180a = true;
                                w4Var2.f11180a = true;
                            } else {
                                w4Var.f11180a = true;
                            }
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            k5Var2.O.a(k5Var2);
                        }
                        z4 z4Var = k5Var2.f10575f;
                        if (z4Var != null) {
                            z4Var.a();
                            return;
                        }
                        return;
                    default:
                        k5 k5Var3 = this.f11231b.f11271c.f10089y;
                        w4 w4Var3 = k5Var3.P;
                        if (w4Var3.f11180a) {
                            w4 w4Var4 = k5Var3.N;
                            if (w4Var4 != null) {
                                w4Var3.f11180a = false;
                                w4Var4.f11180a = false;
                            } else {
                                w4Var3.f11180a = false;
                            }
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            k5Var3.O.a(k5Var3);
                        }
                        z4 z4Var2 = k5Var3.f10575f;
                        if (z4Var2 != null) {
                            z4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View c1Var = new org.telegram.ui.ActionBar.c1(org.telegram.ui.ActionBar.k6.H8, a5Var.getContext(), k5Var.f10578s);
        c1Var.setTag(2131296437, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(c1Var, mf.o(-1, 8));
        if (z10) {
            i12 = 2131744512;
        } else {
            i12 = 2131744455;
        }
        String M0 = bd.M0(i12, null);
        b bVar = k5Var.f10578s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, bVar);
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setText(M0);
        textView.setTag(2131296437, 1);
        textView.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, mf.o(-1, -2));
    }

    @Override
    public final void l() {
    }
}
