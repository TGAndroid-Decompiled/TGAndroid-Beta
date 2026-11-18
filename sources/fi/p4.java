package fi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class p4 extends k.a {
    public final q4 f12379c;

    public p4(q4 q4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f12379c = q4Var;
    }

    @Override
    public final void l(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        q4 q4Var = this.f12379c;
        a5 a5Var = q4Var.f12465y;
        z4 z4Var = a5Var.F;
        if (z4Var != null && z4Var.f12907f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 2131231923;
        } else if (a5Var.P.f12267a) {
            i7 = 2131231918;
        } else {
            i7 = 2131231917;
        }
        int i13 = i7;
        if (z10) {
            i10 = 2131745094;
        } else {
            i10 = 2131745095;
        }
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i13, gd.M0(i10, null), false, a5Var.f11735s);
        if (!a5Var.P.f12267a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final p4 f12328b;

            {
                this.f12328b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var2 = this.f12328b.f12379c.f12465y;
                        m4 m4Var = a5Var2.P;
                        if (!m4Var.f12267a) {
                            m4 m4Var2 = a5Var2.N;
                            if (m4Var2 != null) {
                                m4Var.f12267a = true;
                                m4Var2.f12267a = true;
                            } else {
                                m4Var.f12267a = true;
                            }
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            a5Var2.O.a(a5Var2);
                        }
                        p4 p4Var = a5Var2.f11732f;
                        if (p4Var != null) {
                            p4Var.a();
                            return;
                        }
                        return;
                    default:
                        a5 a5Var3 = this.f12328b.f12379c.f12465y;
                        m4 m4Var3 = a5Var3.P;
                        if (m4Var3.f12267a) {
                            m4 m4Var4 = a5Var3.N;
                            if (m4Var4 != null) {
                                m4Var3.f12267a = false;
                                m4Var4.f12267a = false;
                            } else {
                                m4Var3.f12267a = false;
                            }
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            a5Var3.O.a(a5Var3);
                        }
                        p4 p4Var2 = a5Var3.f11732f;
                        if (p4Var2 != null) {
                            p4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!a5Var.P.f12267a) {
            i11 = 2131231921;
        } else {
            i11 = 2131231920;
        }
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i11, gd.M0(2131745093, null), false, a5Var.f11735s);
        if (a5Var.P.f12267a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final p4 f12328b;

            {
                this.f12328b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var2 = this.f12328b.f12379c.f12465y;
                        m4 m4Var = a5Var2.P;
                        if (!m4Var.f12267a) {
                            m4 m4Var2 = a5Var2.N;
                            if (m4Var2 != null) {
                                m4Var.f12267a = true;
                                m4Var2.f12267a = true;
                            } else {
                                m4Var.f12267a = true;
                            }
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            a5Var2.O.a(a5Var2);
                        }
                        p4 p4Var = a5Var2.f11732f;
                        if (p4Var != null) {
                            p4Var.a();
                            return;
                        }
                        return;
                    default:
                        a5 a5Var3 = this.f12328b.f12379c.f12465y;
                        m4 m4Var3 = a5Var3.P;
                        if (m4Var3.f12267a) {
                            m4 m4Var4 = a5Var3.N;
                            if (m4Var4 != null) {
                                m4Var3.f12267a = false;
                                m4Var4.f12267a = false;
                            } else {
                                m4Var3.f12267a = false;
                            }
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            a5Var3.O.a(a5Var3);
                        }
                        p4 p4Var2 = a5Var3.f11732f;
                        if (p4Var2 != null) {
                            p4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View e1Var = new org.telegram.ui.ActionBar.e1(org.telegram.ui.ActionBar.n6.H8, q4Var.getContext(), a5Var.f11735s);
        e1Var.setTag(2131296437, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, ma.o(-1, 8));
        if (z10) {
            i12 = 2131744267;
        } else {
            i12 = 2131744210;
        }
        String M0 = gd.M0(i12, null);
        b bVar = a5Var.f11735s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, bVar);
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setText(M0);
        textView.setTag(2131296437, 1);
        textView.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, ma.o(-1, -2));
    }

    @Override
    public final void m() {
    }
}
