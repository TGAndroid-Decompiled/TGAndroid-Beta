package di;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a5 extends k.a {
    public final b5 f8809c;

    public a5(b5 b5Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f8809c = b5Var;
    }

    @Override
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z9;
        int i7;
        int i10;
        int i11;
        int i12;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        b5 b5Var = this.f8809c;
        l5 l5Var = b5Var.f8848y;
        k5 k5Var = l5Var.E;
        if (k5Var != null && k5Var.f9285f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i7 = 2131231922;
        } else if (l5Var.O.f9926a) {
            i7 = 2131231917;
        } else {
            i7 = 2131231916;
        }
        int i13 = i7;
        if (z9) {
            i10 = 2131745289;
        } else {
            i10 = 2131745290;
        }
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i13, id.M0(i10, null), false, l5Var.f9330s);
        if (!l5Var.O.f9926a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f9989b;

            {
                this.f9989b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l5 l5Var2 = this.f9989b.f8809c.f8848y;
                        x4 x4Var = l5Var2.O;
                        if (!x4Var.f9926a) {
                            x4 x4Var2 = l5Var2.M;
                            if (x4Var2 != null) {
                                x4Var.f9926a = true;
                                x4Var2.f9926a = true;
                            } else {
                                x4Var.f9926a = true;
                            }
                            l5Var2.h(true);
                            l5.b(l5Var2);
                            l5Var2.N.a(l5Var2);
                        }
                        a5 a5Var = l5Var2.f9327f;
                        if (a5Var != null) {
                            a5Var.a();
                            return;
                        }
                        return;
                    default:
                        l5 l5Var3 = this.f9989b.f8809c.f8848y;
                        x4 x4Var3 = l5Var3.O;
                        if (x4Var3.f9926a) {
                            x4 x4Var4 = l5Var3.M;
                            if (x4Var4 != null) {
                                x4Var3.f9926a = false;
                                x4Var4.f9926a = false;
                            } else {
                                x4Var3.f9926a = false;
                            }
                            l5Var3.h(true);
                            l5.b(l5Var3);
                            l5Var3.N.a(l5Var3);
                        }
                        a5 a5Var2 = l5Var3.f9327f;
                        if (a5Var2 != null) {
                            a5Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!l5Var.O.f9926a) {
            i11 = 2131231920;
        } else {
            i11 = 2131231919;
        }
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i11, id.M0(2131745288, null), false, l5Var.f9330s);
        if (l5Var.O.f9926a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f9989b;

            {
                this.f9989b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l5 l5Var2 = this.f9989b.f8809c.f8848y;
                        x4 x4Var = l5Var2.O;
                        if (!x4Var.f9926a) {
                            x4 x4Var2 = l5Var2.M;
                            if (x4Var2 != null) {
                                x4Var.f9926a = true;
                                x4Var2.f9926a = true;
                            } else {
                                x4Var.f9926a = true;
                            }
                            l5Var2.h(true);
                            l5.b(l5Var2);
                            l5Var2.N.a(l5Var2);
                        }
                        a5 a5Var = l5Var2.f9327f;
                        if (a5Var != null) {
                            a5Var.a();
                            return;
                        }
                        return;
                    default:
                        l5 l5Var3 = this.f9989b.f8809c.f8848y;
                        x4 x4Var3 = l5Var3.O;
                        if (x4Var3.f9926a) {
                            x4 x4Var4 = l5Var3.M;
                            if (x4Var4 != null) {
                                x4Var3.f9926a = false;
                                x4Var4.f9926a = false;
                            } else {
                                x4Var3.f9926a = false;
                            }
                            l5Var3.h(true);
                            l5.b(l5Var3);
                            l5Var3.N.a(l5Var3);
                        }
                        a5 a5Var2 = l5Var3.f9327f;
                        if (a5Var2 != null) {
                            a5Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.l6.H8, b5Var.getContext(), l5Var.f9330s);
        d1Var.setTag(2131296437, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ha.o(-1, 8));
        if (z9) {
            i12 = 2131744502;
        } else {
            i12 = 2131744445;
        }
        String M0 = id.M0(i12, null);
        b bVar = l5Var.f9330s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, bVar);
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
