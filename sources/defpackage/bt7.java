package defpackage;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class bt7 implements Runnable {
    public final byte a;
    public final wt7 b;
    public final l34 c;

    public bt7(wt7 wt7Var, l34 l34Var, byte b) {
        this.a = b;
        this.b = wt7Var;
        this.c = l34Var;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        int i3;
        byte b = this.a;
        final l34 l34Var = this.c;
        final wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.B0(l34Var);
                return;
            default:
                st7 st7Var = wt7Var.H0;
                jt7 jt7Var = wt7Var.E1;
                si5 si5Var = wt7Var.w1;
                LinearLayout linearLayout = new LinearLayout(wt7Var.getContext());
                linearLayout.setOrientation(0);
                boolean z = l34Var instanceof u17;
                if (!z) {
                    TextView textView = new TextView(wt7Var.getContext());
                    zkb.X(textView, bkb.D8, si5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(gl.o());
                    textView.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(k96.M0(2131747479, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            vhb vhbVar;
                            byte b2 = r3;
                            l34 l34Var2 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b2) {
                                case 0:
                                    if (l34Var2 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var2);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((vhb) l34Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    wt7Var2.D0(l34Var2, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var2, new w77(wt7Var2, l34Var2, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var2);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (l34Var2 instanceof yza) {
                                        ((yza) l34Var2).r(true);
                                    } else if (l34Var2 instanceof e09) {
                                        ((e09) l34Var2).r(true);
                                    } else if (l34Var2 instanceof am9) {
                                        am9 am9Var = (am9) l34Var2;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var2).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l34Var2.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var2 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var2);
                                        if (l34Var2 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var2, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            vhbVar = yzaVar;
                                        } else if (l34Var2 instanceof vhb) {
                                            vhb vhbVar2 = new vhb(wt7Var2.getContext(), (vhb) l34Var2, Q0);
                                            vhbVar2.setDelegate(wt7Var2);
                                            vhbVar2.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar2, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            vhbVar = vhbVar2;
                                        }
                                        wt7Var2.A0(vhbVar);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(vhbVar);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, nme.o(-2, 44));
                }
                if (l34Var instanceof vhb) {
                    TextView textView2 = new TextView(wt7Var.getContext());
                    zkb.X(textView2, bkb.D8, si5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(gl.o());
                    textView2.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((jt7Var.c() && !jt7Var.d) || wt7Var.n2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(k96.M0(2131747242, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                vhb vhbVar;
                                byte b2 = r3;
                                l34 l34Var2 = l34Var;
                                wt7 wt7Var2 = wt7Var;
                                switch (b2) {
                                    case 0:
                                        if (l34Var2 instanceof am9) {
                                            j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                            if (j7bVar != null) {
                                                j7bVar.B();
                                            }
                                        } else {
                                            wt7Var2.B0(l34Var2);
                                        }
                                        m8 m8Var = wt7Var2.x1;
                                        if (m8Var != null && m8Var.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((vhb) l34Var2).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                        m8 m8Var2 = wt7Var2.x1;
                                        if (m8Var2 != null && m8Var2.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        wt7Var2.D0(l34Var2, true);
                                        wt7Var2.o0();
                                        m8 m8Var3 = wt7Var2.x1;
                                        if (m8Var3 != null && m8Var3.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        wt7Var2.D0(null, true);
                                        wt7Var2.L0((ob6) l34Var2, new w77(wt7Var2, l34Var2, (byte) 4));
                                        m8 m8Var4 = wt7Var2.x1;
                                        if (m8Var4 != null && m8Var4.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        wt7Var2.D0(null, true);
                                        wt7Var2.K0((o46) l34Var2);
                                        m8 m8Var5 = wt7Var2.x1;
                                        if (m8Var5 != null && m8Var5.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        if (l34Var2 instanceof yza) {
                                            ((yza) l34Var2).r(true);
                                        } else if (l34Var2 instanceof e09) {
                                            ((e09) l34Var2).r(true);
                                        } else if (l34Var2 instanceof am9) {
                                            am9 am9Var = (am9) l34Var2;
                                            am9Var.t0 = !am9Var.t0;
                                            am9Var.invalidate();
                                        } else {
                                            ((e68) l34Var2).r(true);
                                        }
                                        m8 m8Var6 = wt7Var2.x1;
                                        if (m8Var6 != null && m8Var6.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        l34Var2.bringToFront();
                                        m8 m8Var7 = wt7Var2.x1;
                                        if (m8Var7 != null && m8Var7.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        st7 st7Var2 = wt7Var2.H0;
                                        if (l34Var2 != null) {
                                            PointF Q0 = wt7Var2.Q0(l34Var2);
                                            if (l34Var2 instanceof yza) {
                                                l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var2, Q0);
                                                yzaVar.setDelegate(wt7Var2);
                                                st7Var2.addView(yzaVar);
                                                wt7Var2.c0();
                                                vhbVar = yzaVar;
                                            } else if (l34Var2 instanceof vhb) {
                                                vhb vhbVar2 = new vhb(wt7Var2.getContext(), (vhb) l34Var2, Q0);
                                                vhbVar2.setDelegate(wt7Var2);
                                                vhbVar2.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                                st7Var2.addView(vhbVar2, nme.c(-2.0f, -2));
                                                wt7Var2.c0();
                                                vhbVar = vhbVar2;
                                            }
                                            wt7Var2.A0(vhbVar);
                                            wt7Var2.D0(null, true);
                                            wt7Var2.a0(vhbVar);
                                        }
                                        m8 m8Var8 = wt7Var2.x1;
                                        if (m8Var8 != null && m8Var8.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(k96.M0(2131747477, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                vhb vhbVar;
                                byte b2 = r3;
                                l34 l34Var2 = l34Var;
                                wt7 wt7Var2 = wt7Var;
                                switch (b2) {
                                    case 0:
                                        if (l34Var2 instanceof am9) {
                                            j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                            if (j7bVar != null) {
                                                j7bVar.B();
                                            }
                                        } else {
                                            wt7Var2.B0(l34Var2);
                                        }
                                        m8 m8Var = wt7Var2.x1;
                                        if (m8Var != null && m8Var.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((vhb) l34Var2).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                        m8 m8Var2 = wt7Var2.x1;
                                        if (m8Var2 != null && m8Var2.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        wt7Var2.D0(l34Var2, true);
                                        wt7Var2.o0();
                                        m8 m8Var3 = wt7Var2.x1;
                                        if (m8Var3 != null && m8Var3.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        wt7Var2.D0(null, true);
                                        wt7Var2.L0((ob6) l34Var2, new w77(wt7Var2, l34Var2, (byte) 4));
                                        m8 m8Var4 = wt7Var2.x1;
                                        if (m8Var4 != null && m8Var4.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        wt7Var2.D0(null, true);
                                        wt7Var2.K0((o46) l34Var2);
                                        m8 m8Var5 = wt7Var2.x1;
                                        if (m8Var5 != null && m8Var5.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        if (l34Var2 instanceof yza) {
                                            ((yza) l34Var2).r(true);
                                        } else if (l34Var2 instanceof e09) {
                                            ((e09) l34Var2).r(true);
                                        } else if (l34Var2 instanceof am9) {
                                            am9 am9Var = (am9) l34Var2;
                                            am9Var.t0 = !am9Var.t0;
                                            am9Var.invalidate();
                                        } else {
                                            ((e68) l34Var2).r(true);
                                        }
                                        m8 m8Var6 = wt7Var2.x1;
                                        if (m8Var6 != null && m8Var6.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        l34Var2.bringToFront();
                                        m8 m8Var7 = wt7Var2.x1;
                                        if (m8Var7 != null && m8Var7.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        st7 st7Var2 = wt7Var2.H0;
                                        if (l34Var2 != null) {
                                            PointF Q0 = wt7Var2.Q0(l34Var2);
                                            if (l34Var2 instanceof yza) {
                                                l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var2, Q0);
                                                yzaVar.setDelegate(wt7Var2);
                                                st7Var2.addView(yzaVar);
                                                wt7Var2.c0();
                                                vhbVar = yzaVar;
                                            } else if (l34Var2 instanceof vhb) {
                                                vhb vhbVar2 = new vhb(wt7Var2.getContext(), (vhb) l34Var2, Q0);
                                                vhbVar2.setDelegate(wt7Var2);
                                                vhbVar2.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                                st7Var2.addView(vhbVar2, nme.c(-2.0f, -2));
                                                wt7Var2.c0();
                                                vhbVar = vhbVar2;
                                            }
                                            wt7Var2.A0(vhbVar);
                                            wt7Var2.D0(null, true);
                                            wt7Var2.a0(vhbVar);
                                        }
                                        m8 m8Var8 = wt7Var2.x1;
                                        if (m8Var8 != null && m8Var8.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, nme.o(-2, 44));
                } else if (l34Var instanceof ob6) {
                    TextView d0 = wt7Var.d0(1, k96.M0(2131747477, null));
                    d0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            vhb vhbVar;
                            byte b2 = r3;
                            l34 l34Var2 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b2) {
                                case 0:
                                    if (l34Var2 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var2);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((vhb) l34Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    wt7Var2.D0(l34Var2, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var2, new w77(wt7Var2, l34Var2, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var2);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (l34Var2 instanceof yza) {
                                        ((yza) l34Var2).r(true);
                                    } else if (l34Var2 instanceof e09) {
                                        ((e09) l34Var2).r(true);
                                    } else if (l34Var2 instanceof am9) {
                                        am9 am9Var = (am9) l34Var2;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var2).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l34Var2.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var2 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var2);
                                        if (l34Var2 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var2, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            vhbVar = yzaVar;
                                        } else if (l34Var2 instanceof vhb) {
                                            vhb vhbVar2 = new vhb(wt7Var2.getContext(), (vhb) l34Var2, Q0);
                                            vhbVar2.setDelegate(wt7Var2);
                                            vhbVar2.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar2, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            vhbVar = vhbVar2;
                                        }
                                        wt7Var2.A0(vhbVar);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(vhbVar);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(d0, nme.o(-2, 44));
                } else if (l34Var instanceof o46) {
                    TextView d02 = wt7Var.d0(1, k96.M0(2131747477, null));
                    d02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            vhb vhbVar;
                            byte b2 = r3;
                            l34 l34Var2 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b2) {
                                case 0:
                                    if (l34Var2 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var2);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((vhb) l34Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    wt7Var2.D0(l34Var2, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var2, new w77(wt7Var2, l34Var2, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var2);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (l34Var2 instanceof yza) {
                                        ((yza) l34Var2).r(true);
                                    } else if (l34Var2 instanceof e09) {
                                        ((e09) l34Var2).r(true);
                                    } else if (l34Var2 instanceof am9) {
                                        am9 am9Var = (am9) l34Var2;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var2).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l34Var2.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var2 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var2);
                                        if (l34Var2 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var2, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            vhbVar = yzaVar;
                                        } else if (l34Var2 instanceof vhb) {
                                            vhb vhbVar2 = new vhb(wt7Var2.getContext(), (vhb) l34Var2, Q0);
                                            vhbVar2.setDelegate(wt7Var2);
                                            vhbVar2.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar2, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            vhbVar = vhbVar2;
                                        }
                                        wt7Var2.A0(vhbVar);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(vhbVar);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(d02, nme.o(-2, 44));
                }
                if ((l34Var instanceof yza) || (l34Var instanceof am9) || (l34Var instanceof e68) || (l34Var instanceof e09)) {
                    TextView d03 = wt7Var.d0(4, k96.M0(2131750673, null));
                    d03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            vhb vhbVar;
                            byte b2 = r3;
                            l34 l34Var2 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b2) {
                                case 0:
                                    if (l34Var2 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var2);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((vhb) l34Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    wt7Var2.D0(l34Var2, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var2, new w77(wt7Var2, l34Var2, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var2);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (l34Var2 instanceof yza) {
                                        ((yza) l34Var2).r(true);
                                    } else if (l34Var2 instanceof e09) {
                                        ((e09) l34Var2).r(true);
                                    } else if (l34Var2 instanceof am9) {
                                        am9 am9Var = (am9) l34Var2;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var2).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l34Var2.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var2 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var2);
                                        if (l34Var2 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var2, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            vhbVar = yzaVar;
                                        } else if (l34Var2 instanceof vhb) {
                                            vhb vhbVar2 = new vhb(wt7Var2.getContext(), (vhb) l34Var2, Q0);
                                            vhbVar2.setDelegate(wt7Var2);
                                            vhbVar2.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar2, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            vhbVar = vhbVar2;
                                        }
                                        wt7Var2.A0(vhbVar);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(vhbVar);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(d03, nme.o(-2, 44));
                }
                boolean z2 = l34Var instanceof e68;
                if (st7Var.indexOfChild(l34Var) != st7Var.getChildCount() - 1 && !(l34Var instanceof e09)) {
                    TextView textView3 = new TextView(wt7Var.getContext());
                    zkb.X(textView3, bkb.D8, si5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(gl.o());
                    textView3.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(k96.M0(2131747482, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            vhb vhbVar;
                            byte b2 = r3;
                            l34 l34Var2 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b2) {
                                case 0:
                                    if (l34Var2 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var2);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((vhb) l34Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    wt7Var2.D0(l34Var2, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var2, new w77(wt7Var2, l34Var2, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var2);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (l34Var2 instanceof yza) {
                                        ((yza) l34Var2).r(true);
                                    } else if (l34Var2 instanceof e09) {
                                        ((e09) l34Var2).r(true);
                                    } else if (l34Var2 instanceof am9) {
                                        am9 am9Var = (am9) l34Var2;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var2).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l34Var2.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var2 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var2);
                                        if (l34Var2 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var2, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            vhbVar = yzaVar;
                                        } else if (l34Var2 instanceof vhb) {
                                            vhb vhbVar2 = new vhb(wt7Var2.getContext(), (vhb) l34Var2, Q0);
                                            vhbVar2.setDelegate(wt7Var2);
                                            vhbVar2.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar2, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            vhbVar = vhbVar2;
                                        }
                                        wt7Var2.A0(vhbVar);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(vhbVar);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, nme.o(-2, 44));
                } else if (!(l34Var instanceof cc1) && !z2 && !z && !(l34Var instanceof am9) && !(l34Var instanceof ob6) && !(l34Var instanceof hsc) && !(l34Var instanceof o46) && !(l34Var instanceof e09)) {
                    TextView textView4 = new TextView(wt7Var.getContext());
                    zkb.X(textView4, bkb.D8, si5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(gl.o());
                    textView4.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(k96.M0(2131747478, "PaintDuplicate"));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            vhb vhbVar;
                            byte b2 = r3;
                            l34 l34Var2 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b2) {
                                case 0:
                                    if (l34Var2 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var2);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((vhb) l34Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    wt7Var2.D0(l34Var2, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var2, new w77(wt7Var2, l34Var2, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var2);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (l34Var2 instanceof yza) {
                                        ((yza) l34Var2).r(true);
                                    } else if (l34Var2 instanceof e09) {
                                        ((e09) l34Var2).r(true);
                                    } else if (l34Var2 instanceof am9) {
                                        am9 am9Var = (am9) l34Var2;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var2).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    l34Var2.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var2 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var2);
                                        if (l34Var2 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var2, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            vhbVar = yzaVar;
                                        } else if (l34Var2 instanceof vhb) {
                                            vhb vhbVar2 = new vhb(wt7Var2.getContext(), (vhb) l34Var2, Q0);
                                            vhbVar2.setDelegate(wt7Var2);
                                            vhbVar2.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar2, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            vhbVar = vhbVar2;
                                        }
                                        wt7Var2.A0(vhbVar);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(vhbVar);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, nme.o(-2, 44));
                }
                for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
                    View childAt = linearLayout.getChildAt(i4);
                    int i5 = bkb.h6;
                    int v0 = bkb.v0(i5, si5Var);
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
                    zkb.R(childAt, bkb.a0(v0, i, i2, i3, i6), null, zkb.M(i5), si5Var);
                }
                wt7Var.y1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
