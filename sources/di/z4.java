package di;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z4 extends k.a {
    public final a5 f10014c;

    public z4(a5 a5Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f10014c = a5Var;
    }

    @Override
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z9;
        int i7;
        int i10;
        int i11;
        int i12;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        a5 a5Var = this.f10014c;
        k5 k5Var = a5Var.f8814y;
        j5 j5Var = k5Var.E;
        if (j5Var != null && j5Var.f9259f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i7 = 2131231922;
        } else if (k5Var.O.f9901a) {
            i7 = 2131231917;
        } else {
            i7 = 2131231916;
        }
        int i13 = i7;
        if (z9) {
            i10 = 2131745290;
        } else {
            i10 = 2131745291;
        }
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i13, hd.M0(i10, null), false, k5Var.f9306s);
        if (!k5Var.O.f9901a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final z4 f9960b;

            {
                this.f9960b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var2 = this.f9960b.f10014c.f8814y;
                        w4 w4Var = k5Var2.O;
                        if (!w4Var.f9901a) {
                            w4 w4Var2 = k5Var2.M;
                            if (w4Var2 != null) {
                                w4Var.f9901a = true;
                                w4Var2.f9901a = true;
                            } else {
                                w4Var.f9901a = true;
                            }
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            k5Var2.N.a(k5Var2);
                        }
                        z4 z4Var = k5Var2.f9303f;
                        if (z4Var != null) {
                            z4Var.a();
                            return;
                        }
                        return;
                    default:
                        k5 k5Var3 = this.f9960b.f10014c.f8814y;
                        w4 w4Var3 = k5Var3.O;
                        if (w4Var3.f9901a) {
                            w4 w4Var4 = k5Var3.M;
                            if (w4Var4 != null) {
                                w4Var3.f9901a = false;
                                w4Var4.f9901a = false;
                            } else {
                                w4Var3.f9901a = false;
                            }
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            k5Var3.N.a(k5Var3);
                        }
                        z4 z4Var2 = k5Var3.f9303f;
                        if (z4Var2 != null) {
                            z4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!k5Var.O.f9901a) {
            i11 = 2131231920;
        } else {
            i11 = 2131231919;
        }
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i11, hd.M0(2131745289, null), false, k5Var.f9306s);
        if (k5Var.O.f9901a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final z4 f9960b;

            {
                this.f9960b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var2 = this.f9960b.f10014c.f8814y;
                        w4 w4Var = k5Var2.O;
                        if (!w4Var.f9901a) {
                            w4 w4Var2 = k5Var2.M;
                            if (w4Var2 != null) {
                                w4Var.f9901a = true;
                                w4Var2.f9901a = true;
                            } else {
                                w4Var.f9901a = true;
                            }
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            k5Var2.N.a(k5Var2);
                        }
                        z4 z4Var = k5Var2.f9303f;
                        if (z4Var != null) {
                            z4Var.a();
                            return;
                        }
                        return;
                    default:
                        k5 k5Var3 = this.f9960b.f10014c.f8814y;
                        w4 w4Var3 = k5Var3.O;
                        if (w4Var3.f9901a) {
                            w4 w4Var4 = k5Var3.M;
                            if (w4Var4 != null) {
                                w4Var3.f9901a = false;
                                w4Var4.f9901a = false;
                            } else {
                                w4Var3.f9901a = false;
                            }
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            k5Var3.N.a(k5Var3);
                        }
                        z4 z4Var2 = k5Var3.f9303f;
                        if (z4Var2 != null) {
                            z4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.k6.H8, a5Var.getContext(), k5Var.f9306s);
        d1Var.setTag(2131296437, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ha.o(-1, 8));
        if (z9) {
            i12 = 2131744503;
        } else {
            i12 = 2131744446;
        }
        String M0 = hd.M0(i12, null);
        b bVar = k5Var.f9306s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27957j5, bVar);
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setText(M0);
        textView.setTag(2131296437, 1);
        textView.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, ha.o(-1, -2));
    }

    @Override
    public final void k() {
    }
}
