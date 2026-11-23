package fi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class p4 extends k.a {
    public final q4 f12371c;

    public p4(q4 q4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f12371c = q4Var;
    }

    @Override
    public final void l(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        q4 q4Var = this.f12371c;
        a5 a5Var = q4Var.f12457y;
        z4 z4Var = a5Var.F;
        if (z4Var != null && z4Var.f12899f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 2131231923;
        } else if (a5Var.P.f12259a) {
            i7 = 2131231918;
        } else {
            i7 = 2131231917;
        }
        int i13 = i7;
        if (z10) {
            i10 = 2131745093;
        } else {
            i10 = 2131745094;
        }
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i13, hd.N0(i10, null), false, a5Var.f11727s);
        if (!a5Var.P.f12259a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final p4 f12320b;

            {
                this.f12320b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var2 = this.f12320b.f12371c.f12457y;
                        m4 m4Var = a5Var2.P;
                        if (!m4Var.f12259a) {
                            m4 m4Var2 = a5Var2.N;
                            if (m4Var2 != null) {
                                m4Var.f12259a = true;
                                m4Var2.f12259a = true;
                            } else {
                                m4Var.f12259a = true;
                            }
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            a5Var2.O.a(a5Var2);
                        }
                        p4 p4Var = a5Var2.f11724f;
                        if (p4Var != null) {
                            p4Var.a();
                            return;
                        }
                        return;
                    default:
                        a5 a5Var3 = this.f12320b.f12371c.f12457y;
                        m4 m4Var3 = a5Var3.P;
                        if (m4Var3.f12259a) {
                            m4 m4Var4 = a5Var3.N;
                            if (m4Var4 != null) {
                                m4Var3.f12259a = false;
                                m4Var4.f12259a = false;
                            } else {
                                m4Var3.f12259a = false;
                            }
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            a5Var3.O.a(a5Var3);
                        }
                        p4 p4Var2 = a5Var3.f11724f;
                        if (p4Var2 != null) {
                            p4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!a5Var.P.f12259a) {
            i11 = 2131231921;
        } else {
            i11 = 2131231920;
        }
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i11, hd.N0(2131745092, null), false, a5Var.f11727s);
        if (a5Var.P.f12259a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final p4 f12320b;

            {
                this.f12320b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var2 = this.f12320b.f12371c.f12457y;
                        m4 m4Var = a5Var2.P;
                        if (!m4Var.f12259a) {
                            m4 m4Var2 = a5Var2.N;
                            if (m4Var2 != null) {
                                m4Var.f12259a = true;
                                m4Var2.f12259a = true;
                            } else {
                                m4Var.f12259a = true;
                            }
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            a5Var2.O.a(a5Var2);
                        }
                        p4 p4Var = a5Var2.f11724f;
                        if (p4Var != null) {
                            p4Var.a();
                            return;
                        }
                        return;
                    default:
                        a5 a5Var3 = this.f12320b.f12371c.f12457y;
                        m4 m4Var3 = a5Var3.P;
                        if (m4Var3.f12259a) {
                            m4 m4Var4 = a5Var3.N;
                            if (m4Var4 != null) {
                                m4Var3.f12259a = false;
                                m4Var4.f12259a = false;
                            } else {
                                m4Var3.f12259a = false;
                            }
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            a5Var3.O.a(a5Var3);
                        }
                        p4 p4Var2 = a5Var3.f11724f;
                        if (p4Var2 != null) {
                            p4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, q4Var.getContext(), a5Var.f11727s);
        d1Var.setTag(2131296439, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, na.o(-1, 8));
        if (z10) {
            i12 = 2131744261;
        } else {
            i12 = 2131744204;
        }
        String N0 = hd.N0(i12, null);
        b bVar = a5Var.f11727s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29455j5, bVar);
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setText(N0);
        textView.setTag(2131296439, 1);
        textView.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, na.o(-1, -2));
    }

    @Override
    public final void m() {
    }
}
