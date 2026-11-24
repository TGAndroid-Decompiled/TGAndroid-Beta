package defpackage;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class cv7 implements Runnable {
    public final byte a;
    public final xv7 b;
    public final w44 c;

    public cv7(xv7 xv7Var, w44 w44Var, byte b) {
        this.a = b;
        this.b = xv7Var;
        this.c = w44Var;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        int i3;
        byte b = this.a;
        final w44 w44Var = this.c;
        final xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                xv7Var.B0(w44Var);
                return;
            default:
                tv7 tv7Var = xv7Var.H0;
                kv7 kv7Var = xv7Var.E1;
                rk5 rk5Var = xv7Var.w1;
                LinearLayout linearLayout = new LinearLayout(xv7Var.getContext());
                linearLayout.setOrientation(0);
                boolean z = w44Var instanceof u37;
                if (!z) {
                    TextView textView = new TextView(xv7Var.getContext());
                    anb.X(textView, cmb.D8, rk5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(gm.o());
                    textView.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(jb6.M0(2131747405, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            xjb xjbVar;
                            byte b2 = r3;
                            w44 w44Var2 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b2) {
                                case 0:
                                    if (w44Var2 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var2);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((xjb) w44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    xv7Var2.D0(w44Var2, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var2, new s87(xv7Var2, w44Var2, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var2);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (w44Var2 instanceof z1b) {
                                        ((z1b) w44Var2).r(true);
                                    } else if (w44Var2 instanceof g29) {
                                        ((g29) w44Var2).r(true);
                                    } else if (w44Var2 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var2;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var2).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    w44Var2.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var2 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var2);
                                        if (w44Var2 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var2, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            xjbVar = z1bVar;
                                        } else if (w44Var2 instanceof xjb) {
                                            xjb xjbVar2 = new xjb(xv7Var2.getContext(), (xjb) w44Var2, Q0);
                                            xjbVar2.setDelegate(xv7Var2);
                                            xjbVar2.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar2, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            xjbVar = xjbVar2;
                                        }
                                        xv7Var2.A0(xjbVar);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(xjbVar);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, qoe.o(-2, 44));
                }
                if (w44Var instanceof xjb) {
                    TextView textView2 = new TextView(xv7Var.getContext());
                    anb.X(textView2, cmb.D8, rk5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(gm.o());
                    textView2.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((kv7Var.c() && !kv7Var.d) || xv7Var.n2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(jb6.M0(2131747168, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                xjb xjbVar;
                                byte b2 = r3;
                                w44 w44Var2 = w44Var;
                                xv7 xv7Var2 = xv7Var;
                                switch (b2) {
                                    case 0:
                                        if (w44Var2 instanceof ao9) {
                                            l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                            if (l9bVar != null) {
                                                l9bVar.B();
                                            }
                                        } else {
                                            xv7Var2.B0(w44Var2);
                                        }
                                        m8 m8Var = xv7Var2.x1;
                                        if (m8Var != null && m8Var.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((xjb) w44Var2).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                        m8 m8Var2 = xv7Var2.x1;
                                        if (m8Var2 != null && m8Var2.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        xv7Var2.D0(w44Var2, true);
                                        xv7Var2.o0();
                                        m8 m8Var3 = xv7Var2.x1;
                                        if (m8Var3 != null && m8Var3.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        xv7Var2.D0(null, true);
                                        xv7Var2.L0((nd6) w44Var2, new s87(xv7Var2, w44Var2, (byte) 6));
                                        m8 m8Var4 = xv7Var2.x1;
                                        if (m8Var4 != null && m8Var4.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        xv7Var2.D0(null, true);
                                        xv7Var2.K0((o66) w44Var2);
                                        m8 m8Var5 = xv7Var2.x1;
                                        if (m8Var5 != null && m8Var5.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        if (w44Var2 instanceof z1b) {
                                            ((z1b) w44Var2).r(true);
                                        } else if (w44Var2 instanceof g29) {
                                            ((g29) w44Var2).r(true);
                                        } else if (w44Var2 instanceof ao9) {
                                            ao9 ao9Var = (ao9) w44Var2;
                                            ao9Var.t0 = !ao9Var.t0;
                                            ao9Var.invalidate();
                                        } else {
                                            ((g88) w44Var2).r(true);
                                        }
                                        m8 m8Var6 = xv7Var2.x1;
                                        if (m8Var6 != null && m8Var6.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        w44Var2.bringToFront();
                                        m8 m8Var7 = xv7Var2.x1;
                                        if (m8Var7 != null && m8Var7.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        tv7 tv7Var2 = xv7Var2.H0;
                                        if (w44Var2 != null) {
                                            PointF Q0 = xv7Var2.Q0(w44Var2);
                                            if (w44Var2 instanceof z1b) {
                                                w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var2, Q0);
                                                z1bVar.setDelegate(xv7Var2);
                                                tv7Var2.addView(z1bVar);
                                                xv7Var2.c0();
                                                xjbVar = z1bVar;
                                            } else if (w44Var2 instanceof xjb) {
                                                xjb xjbVar2 = new xjb(xv7Var2.getContext(), (xjb) w44Var2, Q0);
                                                xjbVar2.setDelegate(xv7Var2);
                                                xjbVar2.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                                tv7Var2.addView(xjbVar2, qoe.c(-2.0f, -2));
                                                xv7Var2.c0();
                                                xjbVar = xjbVar2;
                                            }
                                            xv7Var2.A0(xjbVar);
                                            xv7Var2.D0(null, true);
                                            xv7Var2.a0(xjbVar);
                                        }
                                        m8 m8Var8 = xv7Var2.x1;
                                        if (m8Var8 != null && m8Var8.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(jb6.M0(2131747403, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                xjb xjbVar;
                                byte b2 = r3;
                                w44 w44Var2 = w44Var;
                                xv7 xv7Var2 = xv7Var;
                                switch (b2) {
                                    case 0:
                                        if (w44Var2 instanceof ao9) {
                                            l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                            if (l9bVar != null) {
                                                l9bVar.B();
                                            }
                                        } else {
                                            xv7Var2.B0(w44Var2);
                                        }
                                        m8 m8Var = xv7Var2.x1;
                                        if (m8Var != null && m8Var.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((xjb) w44Var2).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                        m8 m8Var2 = xv7Var2.x1;
                                        if (m8Var2 != null && m8Var2.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        xv7Var2.D0(w44Var2, true);
                                        xv7Var2.o0();
                                        m8 m8Var3 = xv7Var2.x1;
                                        if (m8Var3 != null && m8Var3.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        xv7Var2.D0(null, true);
                                        xv7Var2.L0((nd6) w44Var2, new s87(xv7Var2, w44Var2, (byte) 6));
                                        m8 m8Var4 = xv7Var2.x1;
                                        if (m8Var4 != null && m8Var4.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        xv7Var2.D0(null, true);
                                        xv7Var2.K0((o66) w44Var2);
                                        m8 m8Var5 = xv7Var2.x1;
                                        if (m8Var5 != null && m8Var5.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        if (w44Var2 instanceof z1b) {
                                            ((z1b) w44Var2).r(true);
                                        } else if (w44Var2 instanceof g29) {
                                            ((g29) w44Var2).r(true);
                                        } else if (w44Var2 instanceof ao9) {
                                            ao9 ao9Var = (ao9) w44Var2;
                                            ao9Var.t0 = !ao9Var.t0;
                                            ao9Var.invalidate();
                                        } else {
                                            ((g88) w44Var2).r(true);
                                        }
                                        m8 m8Var6 = xv7Var2.x1;
                                        if (m8Var6 != null && m8Var6.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        w44Var2.bringToFront();
                                        m8 m8Var7 = xv7Var2.x1;
                                        if (m8Var7 != null && m8Var7.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        tv7 tv7Var2 = xv7Var2.H0;
                                        if (w44Var2 != null) {
                                            PointF Q0 = xv7Var2.Q0(w44Var2);
                                            if (w44Var2 instanceof z1b) {
                                                w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var2, Q0);
                                                z1bVar.setDelegate(xv7Var2);
                                                tv7Var2.addView(z1bVar);
                                                xv7Var2.c0();
                                                xjbVar = z1bVar;
                                            } else if (w44Var2 instanceof xjb) {
                                                xjb xjbVar2 = new xjb(xv7Var2.getContext(), (xjb) w44Var2, Q0);
                                                xjbVar2.setDelegate(xv7Var2);
                                                xjbVar2.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                                tv7Var2.addView(xjbVar2, qoe.c(-2.0f, -2));
                                                xv7Var2.c0();
                                                xjbVar = xjbVar2;
                                            }
                                            xv7Var2.A0(xjbVar);
                                            xv7Var2.D0(null, true);
                                            xv7Var2.a0(xjbVar);
                                        }
                                        m8 m8Var8 = xv7Var2.x1;
                                        if (m8Var8 != null && m8Var8.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, qoe.o(-2, 44));
                } else if (w44Var instanceof nd6) {
                    TextView d0 = xv7Var.d0(1, jb6.M0(2131747403, null));
                    d0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            xjb xjbVar;
                            byte b2 = r3;
                            w44 w44Var2 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b2) {
                                case 0:
                                    if (w44Var2 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var2);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((xjb) w44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    xv7Var2.D0(w44Var2, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var2, new s87(xv7Var2, w44Var2, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var2);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (w44Var2 instanceof z1b) {
                                        ((z1b) w44Var2).r(true);
                                    } else if (w44Var2 instanceof g29) {
                                        ((g29) w44Var2).r(true);
                                    } else if (w44Var2 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var2;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var2).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    w44Var2.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var2 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var2);
                                        if (w44Var2 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var2, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            xjbVar = z1bVar;
                                        } else if (w44Var2 instanceof xjb) {
                                            xjb xjbVar2 = new xjb(xv7Var2.getContext(), (xjb) w44Var2, Q0);
                                            xjbVar2.setDelegate(xv7Var2);
                                            xjbVar2.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar2, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            xjbVar = xjbVar2;
                                        }
                                        xv7Var2.A0(xjbVar);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(xjbVar);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(d0, qoe.o(-2, 44));
                } else if (w44Var instanceof o66) {
                    TextView d02 = xv7Var.d0(1, jb6.M0(2131747403, null));
                    d02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            xjb xjbVar;
                            byte b2 = r3;
                            w44 w44Var2 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b2) {
                                case 0:
                                    if (w44Var2 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var2);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((xjb) w44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    xv7Var2.D0(w44Var2, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var2, new s87(xv7Var2, w44Var2, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var2);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (w44Var2 instanceof z1b) {
                                        ((z1b) w44Var2).r(true);
                                    } else if (w44Var2 instanceof g29) {
                                        ((g29) w44Var2).r(true);
                                    } else if (w44Var2 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var2;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var2).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    w44Var2.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var2 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var2);
                                        if (w44Var2 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var2, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            xjbVar = z1bVar;
                                        } else if (w44Var2 instanceof xjb) {
                                            xjb xjbVar2 = new xjb(xv7Var2.getContext(), (xjb) w44Var2, Q0);
                                            xjbVar2.setDelegate(xv7Var2);
                                            xjbVar2.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar2, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            xjbVar = xjbVar2;
                                        }
                                        xv7Var2.A0(xjbVar);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(xjbVar);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(d02, qoe.o(-2, 44));
                }
                if ((w44Var instanceof z1b) || (w44Var instanceof ao9) || (w44Var instanceof g88) || (w44Var instanceof g29)) {
                    TextView d03 = xv7Var.d0(4, jb6.M0(2131750622, null));
                    d03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            xjb xjbVar;
                            byte b2 = r3;
                            w44 w44Var2 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b2) {
                                case 0:
                                    if (w44Var2 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var2);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((xjb) w44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    xv7Var2.D0(w44Var2, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var2, new s87(xv7Var2, w44Var2, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var2);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (w44Var2 instanceof z1b) {
                                        ((z1b) w44Var2).r(true);
                                    } else if (w44Var2 instanceof g29) {
                                        ((g29) w44Var2).r(true);
                                    } else if (w44Var2 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var2;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var2).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    w44Var2.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var2 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var2);
                                        if (w44Var2 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var2, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            xjbVar = z1bVar;
                                        } else if (w44Var2 instanceof xjb) {
                                            xjb xjbVar2 = new xjb(xv7Var2.getContext(), (xjb) w44Var2, Q0);
                                            xjbVar2.setDelegate(xv7Var2);
                                            xjbVar2.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar2, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            xjbVar = xjbVar2;
                                        }
                                        xv7Var2.A0(xjbVar);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(xjbVar);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(d03, qoe.o(-2, 44));
                }
                boolean z2 = w44Var instanceof g88;
                if (tv7Var.indexOfChild(w44Var) != tv7Var.getChildCount() - 1 && !(w44Var instanceof g29)) {
                    TextView textView3 = new TextView(xv7Var.getContext());
                    anb.X(textView3, cmb.D8, rk5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(gm.o());
                    textView3.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(jb6.M0(2131747408, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            xjb xjbVar;
                            byte b2 = r3;
                            w44 w44Var2 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b2) {
                                case 0:
                                    if (w44Var2 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var2);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((xjb) w44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    xv7Var2.D0(w44Var2, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var2, new s87(xv7Var2, w44Var2, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var2);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (w44Var2 instanceof z1b) {
                                        ((z1b) w44Var2).r(true);
                                    } else if (w44Var2 instanceof g29) {
                                        ((g29) w44Var2).r(true);
                                    } else if (w44Var2 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var2;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var2).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    w44Var2.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var2 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var2);
                                        if (w44Var2 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var2, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            xjbVar = z1bVar;
                                        } else if (w44Var2 instanceof xjb) {
                                            xjb xjbVar2 = new xjb(xv7Var2.getContext(), (xjb) w44Var2, Q0);
                                            xjbVar2.setDelegate(xv7Var2);
                                            xjbVar2.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar2, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            xjbVar = xjbVar2;
                                        }
                                        xv7Var2.A0(xjbVar);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(xjbVar);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, qoe.o(-2, 44));
                } else if (!(w44Var instanceof kd1) && !z2 && !z && !(w44Var instanceof ao9) && !(w44Var instanceof nd6) && !(w44Var instanceof kuc) && !(w44Var instanceof o66) && !(w44Var instanceof g29)) {
                    TextView textView4 = new TextView(xv7Var.getContext());
                    anb.X(textView4, cmb.D8, rk5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(gm.o());
                    textView4.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(jb6.M0(2131747404, "PaintDuplicate"));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            xjb xjbVar;
                            byte b2 = r3;
                            w44 w44Var2 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b2) {
                                case 0:
                                    if (w44Var2 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var2);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((xjb) w44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    xv7Var2.D0(w44Var2, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var2, new s87(xv7Var2, w44Var2, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var2);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (w44Var2 instanceof z1b) {
                                        ((z1b) w44Var2).r(true);
                                    } else if (w44Var2 instanceof g29) {
                                        ((g29) w44Var2).r(true);
                                    } else if (w44Var2 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var2;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var2).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    w44Var2.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var2 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var2);
                                        if (w44Var2 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var2, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            xjbVar = z1bVar;
                                        } else if (w44Var2 instanceof xjb) {
                                            xjb xjbVar2 = new xjb(xv7Var2.getContext(), (xjb) w44Var2, Q0);
                                            xjbVar2.setDelegate(xv7Var2);
                                            xjbVar2.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar2, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            xjbVar = xjbVar2;
                                        }
                                        xv7Var2.A0(xjbVar);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(xjbVar);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, qoe.o(-2, 44));
                }
                for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
                    View childAt = linearLayout.getChildAt(i4);
                    int i5 = cmb.h6;
                    int v0 = cmb.v0(i5, rk5Var);
                    int i6 = 8;
                    if (i4 == 0) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    if (i4 == linearLayout.getChildCount() - 1) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    if (i4 == linearLayout.getChildCount() - 1) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    if (i4 != 0) {
                        i6 = 0;
                    }
                    anb.R(childAt, cmb.a0(v0, i, i2, i3, i6), null, anb.M(i5), rk5Var);
                }
                xv7Var.y1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
