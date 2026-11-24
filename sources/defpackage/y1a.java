package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y1a extends f9 {
    public final z1a c;

    public y1a(z1a z1aVar, Context context, r63 r63Var) {
        super(context, r63Var, false);
        this.c = z1aVar;
    }

    @Override
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(on2.f(0.18f, -16777216, -1));
        z1a z1aVar = this.c;
        i2a i2aVar = z1aVar.y;
        h2a h2aVar = i2aVar.F;
        if (h2aVar != null && h2aVar.f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 2131231927;
        } else if (i2aVar.P.a) {
            i = 2131231922;
        } else {
            i = 2131231921;
        }
        int i5 = i;
        if (z) {
            i2 = 2131745023;
        } else {
            i2 = 2131745024;
        }
        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i5, jb6.M0(i2, null), false, i2aVar.s);
        if (!i2aVar.P.a) {
            c.setAlpha(0.5f);
        }
        c.setOnClickListener(new View.OnClickListener(this) {
            public final y1a b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                y1a y1aVar = this.b;
                switch (b) {
                    case 0:
                        i2a i2aVar2 = y1aVar.c.y;
                        v1a v1aVar = i2aVar2.P;
                        if (!v1aVar.a) {
                            v1a v1aVar2 = i2aVar2.N;
                            if (v1aVar2 != null) {
                                v1aVar.a = true;
                                v1aVar2.a = true;
                            } else {
                                v1aVar.a = true;
                            }
                            i2aVar2.g(true);
                            i2aVar2.e();
                            i2aVar2.O.a(i2aVar2);
                        }
                        y1a y1aVar2 = i2aVar2.f;
                        if (y1aVar2 != null) {
                            y1aVar2.a();
                            return;
                        }
                        return;
                    default:
                        i2a i2aVar3 = y1aVar.c.y;
                        v1a v1aVar3 = i2aVar3.P;
                        if (v1aVar3.a) {
                            v1a v1aVar4 = i2aVar3.N;
                            if (v1aVar4 != null) {
                                v1aVar3.a = false;
                                v1aVar4.a = false;
                            } else {
                                v1aVar3.a = false;
                            }
                            i2aVar3.g(true);
                            i2aVar3.e();
                            i2aVar3.O.a(i2aVar3);
                        }
                        y1a y1aVar3 = i2aVar3.f;
                        if (y1aVar3 != null) {
                            y1aVar3.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!i2aVar.P.a) {
            i3 = 2131231925;
        } else {
            i3 = 2131231924;
        }
        a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i3, jb6.M0(2131745022, null), false, i2aVar.s);
        if (i2aVar.P.a) {
            c2.setAlpha(0.5f);
        }
        c2.setOnClickListener(new View.OnClickListener(this) {
            public final y1a b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                y1a y1aVar = this.b;
                switch (b) {
                    case 0:
                        i2a i2aVar2 = y1aVar.c.y;
                        v1a v1aVar = i2aVar2.P;
                        if (!v1aVar.a) {
                            v1a v1aVar2 = i2aVar2.N;
                            if (v1aVar2 != null) {
                                v1aVar.a = true;
                                v1aVar2.a = true;
                            } else {
                                v1aVar.a = true;
                            }
                            i2aVar2.g(true);
                            i2aVar2.e();
                            i2aVar2.O.a(i2aVar2);
                        }
                        y1a y1aVar2 = i2aVar2.f;
                        if (y1aVar2 != null) {
                            y1aVar2.a();
                            return;
                        }
                        return;
                    default:
                        i2a i2aVar3 = y1aVar.c.y;
                        v1a v1aVar3 = i2aVar3.P;
                        if (v1aVar3.a) {
                            v1a v1aVar4 = i2aVar3.N;
                            if (v1aVar4 != null) {
                                v1aVar3.a = false;
                                v1aVar4.a = false;
                            } else {
                                v1aVar3.a = false;
                            }
                            i2aVar3.g(true);
                            i2aVar3.e();
                            i2aVar3.O.a(i2aVar3);
                        }
                        y1a y1aVar3 = i2aVar3.f;
                        if (y1aVar3 != null) {
                            y1aVar3.a();
                            return;
                        }
                        return;
                }
            }
        });
        View j8Var = new j8(cmb.G8, i2aVar.s, z1aVar.getContext());
        j8Var.setTag(2131296439, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j8Var, qoe.o(-1, 8));
        if (z) {
            i4 = 2131744188;
        } else {
            i4 = 2131744131;
        }
        String M0 = jb6.M0(i4, null);
        r63 r63Var = i2aVar.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        anb.X(textView, cmb.i5, r63Var);
        textView.setPadding(gm.L(13.0f), gm.L(8.0f), gm.L(13.0f), gm.L(8.0f));
        textView.setText(M0);
        textView.setTag(2131296439, 1);
        textView.setMaxWidth(gm.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, qoe.o(-1, -2));
    }
}
