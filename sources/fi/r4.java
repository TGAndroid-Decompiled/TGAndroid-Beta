package fi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class r4 extends k.a {
    public final s4 f12266c;

    public r4(s4 s4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f12266c = s4Var;
    }

    @Override
    public final void k(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        s4 s4Var = this.f12266c;
        c5 c5Var = s4Var.f12315y;
        b5 b5Var = c5Var.F;
        if (b5Var != null && b5Var.f11554f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 2131231922;
        } else if (c5Var.P.f12115a) {
            i7 = 2131231917;
        } else {
            i7 = 2131231916;
        }
        int i13 = i7;
        if (z10) {
            i10 = 2131745289;
        } else {
            i10 = 2131745290;
        }
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i13, hd.M0(i10, null), false, c5Var.f11604s);
        if (!c5Var.P.f12115a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final r4 f12227b;

            {
                this.f12227b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var2 = this.f12227b.f12266c.f12315y;
                        o4 o4Var = c5Var2.P;
                        if (!o4Var.f12115a) {
                            o4 o4Var2 = c5Var2.N;
                            if (o4Var2 != null) {
                                o4Var.f12115a = true;
                                o4Var2.f12115a = true;
                            } else {
                                o4Var.f12115a = true;
                            }
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            c5Var2.O.a(c5Var2);
                        }
                        r4 r4Var = c5Var2.f11601f;
                        if (r4Var != null) {
                            r4Var.a();
                            return;
                        }
                        return;
                    default:
                        c5 c5Var3 = this.f12227b.f12266c.f12315y;
                        o4 o4Var3 = c5Var3.P;
                        if (o4Var3.f12115a) {
                            o4 o4Var4 = c5Var3.N;
                            if (o4Var4 != null) {
                                o4Var3.f12115a = false;
                                o4Var4.f12115a = false;
                            } else {
                                o4Var3.f12115a = false;
                            }
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            c5Var3.O.a(c5Var3);
                        }
                        r4 r4Var2 = c5Var3.f11601f;
                        if (r4Var2 != null) {
                            r4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!c5Var.P.f12115a) {
            i11 = 2131231920;
        } else {
            i11 = 2131231919;
        }
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i11, hd.M0(2131745288, null), false, c5Var.f11604s);
        if (c5Var.P.f12115a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final r4 f12227b;

            {
                this.f12227b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var2 = this.f12227b.f12266c.f12315y;
                        o4 o4Var = c5Var2.P;
                        if (!o4Var.f12115a) {
                            o4 o4Var2 = c5Var2.N;
                            if (o4Var2 != null) {
                                o4Var.f12115a = true;
                                o4Var2.f12115a = true;
                            } else {
                                o4Var.f12115a = true;
                            }
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            c5Var2.O.a(c5Var2);
                        }
                        r4 r4Var = c5Var2.f11601f;
                        if (r4Var != null) {
                            r4Var.a();
                            return;
                        }
                        return;
                    default:
                        c5 c5Var3 = this.f12227b.f12266c.f12315y;
                        o4 o4Var3 = c5Var3.P;
                        if (o4Var3.f12115a) {
                            o4 o4Var4 = c5Var3.N;
                            if (o4Var4 != null) {
                                o4Var3.f12115a = false;
                                o4Var4.f12115a = false;
                            } else {
                                o4Var3.f12115a = false;
                            }
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            c5Var3.O.a(c5Var3);
                        }
                        r4 r4Var2 = c5Var3.f11601f;
                        if (r4Var2 != null) {
                            r4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.j6.H8, s4Var.getContext(), c5Var.f11604s);
        d1Var.setTag(2131296437, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ja.o(-1, 8));
        if (z10) {
            i12 = 2131744502;
        } else {
            i12 = 2131744445;
        }
        String M0 = hd.M0(i12, null);
        b bVar = c5Var.f11604s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, bVar);
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setText(M0);
        textView.setTag(2131296437, 1);
        textView.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, ja.o(-1, -2));
    }

    @Override
    public final void l() {
    }
}
