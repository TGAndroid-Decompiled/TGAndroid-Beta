package fi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class q4 extends k.a {
    public final r4 f12495c;

    public q4(r4 r4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f12495c = r4Var;
    }

    @Override
    public final void l(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        r4 r4Var = this.f12495c;
        b5 b5Var = r4Var.f12543y;
        a5 a5Var = b5Var.F;
        if (a5Var != null && a5Var.f11759f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 2131231923;
        } else if (b5Var.P.f12340a) {
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
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i13, hd.N0(i10, null), false, b5Var.f11819s);
        if (!b5Var.P.f12340a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f12422b;

            {
                this.f12422b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b5 b5Var2 = this.f12422b.f12495c.f12543y;
                        n4 n4Var = b5Var2.P;
                        if (!n4Var.f12340a) {
                            n4 n4Var2 = b5Var2.N;
                            if (n4Var2 != null) {
                                n4Var.f12340a = true;
                                n4Var2.f12340a = true;
                            } else {
                                n4Var.f12340a = true;
                            }
                            b5Var2.h(true);
                            b5.b(b5Var2);
                            b5Var2.O.a(b5Var2);
                        }
                        q4 q4Var = b5Var2.f11816f;
                        if (q4Var != null) {
                            q4Var.a();
                            return;
                        }
                        return;
                    default:
                        b5 b5Var3 = this.f12422b.f12495c.f12543y;
                        n4 n4Var3 = b5Var3.P;
                        if (n4Var3.f12340a) {
                            n4 n4Var4 = b5Var3.N;
                            if (n4Var4 != null) {
                                n4Var3.f12340a = false;
                                n4Var4.f12340a = false;
                            } else {
                                n4Var3.f12340a = false;
                            }
                            b5Var3.h(true);
                            b5.b(b5Var3);
                            b5Var3.O.a(b5Var3);
                        }
                        q4 q4Var2 = b5Var3.f11816f;
                        if (q4Var2 != null) {
                            q4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!b5Var.P.f12340a) {
            i11 = 2131231921;
        } else {
            i11 = 2131231920;
        }
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i11, hd.N0(2131745092, null), false, b5Var.f11819s);
        if (b5Var.P.f12340a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f12422b;

            {
                this.f12422b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b5 b5Var2 = this.f12422b.f12495c.f12543y;
                        n4 n4Var = b5Var2.P;
                        if (!n4Var.f12340a) {
                            n4 n4Var2 = b5Var2.N;
                            if (n4Var2 != null) {
                                n4Var.f12340a = true;
                                n4Var2.f12340a = true;
                            } else {
                                n4Var.f12340a = true;
                            }
                            b5Var2.h(true);
                            b5.b(b5Var2);
                            b5Var2.O.a(b5Var2);
                        }
                        q4 q4Var = b5Var2.f11816f;
                        if (q4Var != null) {
                            q4Var.a();
                            return;
                        }
                        return;
                    default:
                        b5 b5Var3 = this.f12422b.f12495c.f12543y;
                        n4 n4Var3 = b5Var3.P;
                        if (n4Var3.f12340a) {
                            n4 n4Var4 = b5Var3.N;
                            if (n4Var4 != null) {
                                n4Var3.f12340a = false;
                                n4Var4.f12340a = false;
                            } else {
                                n4Var3.f12340a = false;
                            }
                            b5Var3.h(true);
                            b5.b(b5Var3);
                            b5Var3.O.a(b5Var3);
                        }
                        q4 q4Var2 = b5Var3.f11816f;
                        if (q4Var2 != null) {
                            q4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, r4Var.getContext(), b5Var.f11819s);
        d1Var.setTag(2131296439, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ma.o(-1, 8));
        if (z10) {
            i12 = 2131744259;
        } else {
            i12 = 2131744202;
        }
        String N0 = hd.N0(i12, null);
        b bVar = b5Var.f11819s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, bVar);
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setText(N0);
        textView.setTag(2131296439, 1);
        textView.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, ma.o(-1, -2));
    }

    @Override
    public final void m() {
    }
}
