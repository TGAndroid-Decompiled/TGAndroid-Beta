package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class q3a extends g9 {
    public final r3a c;

    public q3a(r3a r3aVar, Context context, x53 x53Var) {
        super(context, x53Var, false);
        this.c = r3aVar;
    }

    @Override
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(vm2.f(0.18f, -16777216, -1));
        r3a r3aVar = this.c;
        z3a z3aVar = r3aVar.y;
        y3a y3aVar = z3aVar.F;
        if (y3aVar != null && y3aVar.f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 2131231926;
        } else if (z3aVar.P.a) {
            i = 2131231921;
        } else {
            i = 2131231920;
        }
        int i5 = i;
        if (z) {
            i2 = 2131745017;
        } else {
            i2 = 2131745018;
        }
        b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i5, ob6.M0(i2, null), false, z3aVar.s);
        if (!z3aVar.P.a) {
            c.setAlpha(0.5f);
        }
        c.setOnClickListener(new View.OnClickListener(this) {
            public final q3a b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                q3a q3aVar = this.b;
                switch (b) {
                    case 0:
                        z3a z3aVar2 = q3aVar.c.y;
                        n3a n3aVar = z3aVar2.P;
                        if (!n3aVar.a) {
                            n3a n3aVar2 = z3aVar2.N;
                            if (n3aVar2 != null) {
                                n3aVar.a = true;
                                n3aVar2.a = true;
                            } else {
                                n3aVar.a = true;
                            }
                            z3aVar2.g(true);
                            z3aVar2.e();
                            z3aVar2.O.a(z3aVar2);
                        }
                        q3a q3aVar2 = z3aVar2.f;
                        if (q3aVar2 != null) {
                            q3aVar2.a();
                            return;
                        }
                        return;
                    default:
                        z3a z3aVar3 = q3aVar.c.y;
                        n3a n3aVar3 = z3aVar3.P;
                        if (n3aVar3.a) {
                            n3a n3aVar4 = z3aVar3.N;
                            if (n3aVar4 != null) {
                                n3aVar3.a = false;
                                n3aVar4.a = false;
                            } else {
                                n3aVar3.a = false;
                            }
                            z3aVar3.g(true);
                            z3aVar3.e();
                            z3aVar3.O.a(z3aVar3);
                        }
                        q3a q3aVar3 = z3aVar3.f;
                        if (q3aVar3 != null) {
                            q3aVar3.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!z3aVar.P.a) {
            i3 = 2131231924;
        } else {
            i3 = 2131231923;
        }
        b8 c2 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i3, ob6.M0(2131745016, null), false, z3aVar.s);
        if (z3aVar.P.a) {
            c2.setAlpha(0.5f);
        }
        c2.setOnClickListener(new View.OnClickListener(this) {
            public final q3a b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                q3a q3aVar = this.b;
                switch (b) {
                    case 0:
                        z3a z3aVar2 = q3aVar.c.y;
                        n3a n3aVar = z3aVar2.P;
                        if (!n3aVar.a) {
                            n3a n3aVar2 = z3aVar2.N;
                            if (n3aVar2 != null) {
                                n3aVar.a = true;
                                n3aVar2.a = true;
                            } else {
                                n3aVar.a = true;
                            }
                            z3aVar2.g(true);
                            z3aVar2.e();
                            z3aVar2.O.a(z3aVar2);
                        }
                        q3a q3aVar2 = z3aVar2.f;
                        if (q3aVar2 != null) {
                            q3aVar2.a();
                            return;
                        }
                        return;
                    default:
                        z3a z3aVar3 = q3aVar.c.y;
                        n3a n3aVar3 = z3aVar3.P;
                        if (n3aVar3.a) {
                            n3a n3aVar4 = z3aVar3.N;
                            if (n3aVar4 != null) {
                                n3aVar3.a = false;
                                n3aVar4.a = false;
                            } else {
                                n3aVar3.a = false;
                            }
                            z3aVar3.g(true);
                            z3aVar3.e();
                            z3aVar3.O.a(z3aVar3);
                        }
                        q3a q3aVar3 = z3aVar3.f;
                        if (q3aVar3 != null) {
                            q3aVar3.a();
                            return;
                        }
                        return;
                }
            }
        });
        View k8Var = new k8(aob.H8, z3aVar.s, r3aVar.getContext());
        k8Var.setTag(2131296439, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k8Var, tre.o(-1, 8));
        if (z) {
            i4 = 2131744156;
        } else {
            i4 = 2131744099;
        }
        String M0 = ob6.M0(i4, null);
        x53 x53Var = z3aVar.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        yob.X(textView, aob.j5, x53Var);
        textView.setPadding(hl.L(13.0f), hl.L(8.0f), hl.L(13.0f), hl.L(8.0f));
        textView.setText(M0);
        textView.setTag(2131296439, 1);
        textView.setMaxWidth(hl.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, tre.o(-1, -2));
    }
}
