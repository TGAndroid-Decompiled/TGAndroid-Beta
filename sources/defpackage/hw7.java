package defpackage;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class hw7 implements Runnable {
    public final byte a;
    public final dx7 b;
    public final h44 c;

    public hw7(dx7 dx7Var, h44 h44Var, byte b) {
        this.a = b;
        this.b = dx7Var;
        this.c = h44Var;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        int i3;
        byte b = this.a;
        final h44 h44Var = this.c;
        final dx7 dx7Var = this.b;
        switch (b) {
            case 0:
                dx7Var.B0(h44Var);
                return;
            default:
                zw7 zw7Var = dx7Var.B0;
                qw7 qw7Var = dx7Var.y1;
                uk5 uk5Var = dx7Var.q1;
                LinearLayout linearLayout = new LinearLayout(dx7Var.getContext());
                linearLayout.setOrientation(0);
                boolean z = h44Var instanceof b47;
                if (!z) {
                    TextView textView = new TextView(dx7Var.getContext());
                    yob.X(textView, aob.E8, uk5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(hl.o());
                    textView.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(ob6.M0(2131747399, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rlb rlbVar;
                            byte b2 = r3;
                            h44 h44Var2 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b2) {
                                case 0:
                                    if (h44Var2 instanceof pp9) {
                                        ibb ibbVar = ((wab) dx7Var2).o2.d1;
                                        if (ibbVar != null) {
                                            ibbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var2);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((rlb) h44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    dx7Var2.C0(h44Var2, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var2, new ia7(dx7Var2, h44Var2, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var2);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (h44Var2 instanceof w3b) {
                                        ((w3b) h44Var2).r(true);
                                    } else if (h44Var2 instanceof s39) {
                                        ((s39) h44Var2).r(true);
                                    } else if (h44Var2 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var2;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var2).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    h44Var2.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var2 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var2);
                                        if (h44Var2 instanceof w3b) {
                                            h44 w3bVar = new w3b(dx7Var2.getContext(), (w3b) h44Var2, P0);
                                            w3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(w3bVar);
                                            dx7Var2.c0();
                                            rlbVar = w3bVar;
                                        } else if (h44Var2 instanceof rlb) {
                                            rlb rlbVar2 = new rlb(dx7Var2.getContext(), (rlb) h44Var2, P0);
                                            rlbVar2.setDelegate(dx7Var2);
                                            rlbVar2.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar2, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            rlbVar = rlbVar2;
                                        }
                                        dx7Var2.A0(rlbVar);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(rlbVar);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, tre.o(-2, 44));
                }
                if (h44Var instanceof rlb) {
                    TextView textView2 = new TextView(dx7Var.getContext());
                    yob.X(textView2, aob.E8, uk5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(hl.o());
                    textView2.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((qw7Var.c() && !qw7Var.d) || dx7Var.h2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(ob6.M0(2131747162, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                rlb rlbVar;
                                byte b2 = r3;
                                h44 h44Var2 = h44Var;
                                dx7 dx7Var2 = dx7Var;
                                switch (b2) {
                                    case 0:
                                        if (h44Var2 instanceof pp9) {
                                            ibb ibbVar = ((wab) dx7Var2).o2.d1;
                                            if (ibbVar != null) {
                                                ibbVar.B();
                                            }
                                        } else {
                                            dx7Var2.B0(h44Var2);
                                        }
                                        n8 n8Var = dx7Var2.r1;
                                        if (n8Var != null && n8Var.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((rlb) h44Var2).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            cc4.g(e, true);
                                        }
                                        n8 n8Var2 = dx7Var2.r1;
                                        if (n8Var2 != null && n8Var2.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        dx7Var2.C0(h44Var2, true);
                                        dx7Var2.o0();
                                        n8 n8Var3 = dx7Var2.r1;
                                        if (n8Var3 != null && n8Var3.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        dx7Var2.C0(null, true);
                                        dx7Var2.K0((sd6) h44Var2, new ia7(dx7Var2, h44Var2, (byte) 4));
                                        n8 n8Var4 = dx7Var2.r1;
                                        if (n8Var4 != null && n8Var4.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        dx7Var2.C0(null, true);
                                        dx7Var2.J0((s66) h44Var2);
                                        n8 n8Var5 = dx7Var2.r1;
                                        if (n8Var5 != null && n8Var5.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        if (h44Var2 instanceof w3b) {
                                            ((w3b) h44Var2).r(true);
                                        } else if (h44Var2 instanceof s39) {
                                            ((s39) h44Var2).r(true);
                                        } else if (h44Var2 instanceof pp9) {
                                            pp9 pp9Var = (pp9) h44Var2;
                                            pp9Var.t0 = !pp9Var.t0;
                                            pp9Var.invalidate();
                                        } else {
                                            ((v98) h44Var2).r(true);
                                        }
                                        n8 n8Var6 = dx7Var2.r1;
                                        if (n8Var6 != null && n8Var6.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        h44Var2.bringToFront();
                                        n8 n8Var7 = dx7Var2.r1;
                                        if (n8Var7 != null && n8Var7.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        zw7 zw7Var2 = dx7Var2.B0;
                                        if (h44Var2 != null) {
                                            PointF P0 = dx7Var2.P0(h44Var2);
                                            if (h44Var2 instanceof w3b) {
                                                h44 w3bVar = new w3b(dx7Var2.getContext(), (w3b) h44Var2, P0);
                                                w3bVar.setDelegate(dx7Var2);
                                                zw7Var2.addView(w3bVar);
                                                dx7Var2.c0();
                                                rlbVar = w3bVar;
                                            } else if (h44Var2 instanceof rlb) {
                                                rlb rlbVar2 = new rlb(dx7Var2.getContext(), (rlb) h44Var2, P0);
                                                rlbVar2.setDelegate(dx7Var2);
                                                rlbVar2.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                                zw7Var2.addView(rlbVar2, tre.c(-2.0f, -2));
                                                dx7Var2.c0();
                                                rlbVar = rlbVar2;
                                            }
                                            dx7Var2.A0(rlbVar);
                                            dx7Var2.C0(null, true);
                                            dx7Var2.a0(rlbVar);
                                        }
                                        n8 n8Var8 = dx7Var2.r1;
                                        if (n8Var8 != null && n8Var8.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(ob6.M0(2131747397, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                rlb rlbVar;
                                byte b2 = r3;
                                h44 h44Var2 = h44Var;
                                dx7 dx7Var2 = dx7Var;
                                switch (b2) {
                                    case 0:
                                        if (h44Var2 instanceof pp9) {
                                            ibb ibbVar = ((wab) dx7Var2).o2.d1;
                                            if (ibbVar != null) {
                                                ibbVar.B();
                                            }
                                        } else {
                                            dx7Var2.B0(h44Var2);
                                        }
                                        n8 n8Var = dx7Var2.r1;
                                        if (n8Var != null && n8Var.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((rlb) h44Var2).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            cc4.g(e, true);
                                        }
                                        n8 n8Var2 = dx7Var2.r1;
                                        if (n8Var2 != null && n8Var2.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        dx7Var2.C0(h44Var2, true);
                                        dx7Var2.o0();
                                        n8 n8Var3 = dx7Var2.r1;
                                        if (n8Var3 != null && n8Var3.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        dx7Var2.C0(null, true);
                                        dx7Var2.K0((sd6) h44Var2, new ia7(dx7Var2, h44Var2, (byte) 4));
                                        n8 n8Var4 = dx7Var2.r1;
                                        if (n8Var4 != null && n8Var4.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        dx7Var2.C0(null, true);
                                        dx7Var2.J0((s66) h44Var2);
                                        n8 n8Var5 = dx7Var2.r1;
                                        if (n8Var5 != null && n8Var5.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        if (h44Var2 instanceof w3b) {
                                            ((w3b) h44Var2).r(true);
                                        } else if (h44Var2 instanceof s39) {
                                            ((s39) h44Var2).r(true);
                                        } else if (h44Var2 instanceof pp9) {
                                            pp9 pp9Var = (pp9) h44Var2;
                                            pp9Var.t0 = !pp9Var.t0;
                                            pp9Var.invalidate();
                                        } else {
                                            ((v98) h44Var2).r(true);
                                        }
                                        n8 n8Var6 = dx7Var2.r1;
                                        if (n8Var6 != null && n8Var6.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        h44Var2.bringToFront();
                                        n8 n8Var7 = dx7Var2.r1;
                                        if (n8Var7 != null && n8Var7.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        zw7 zw7Var2 = dx7Var2.B0;
                                        if (h44Var2 != null) {
                                            PointF P0 = dx7Var2.P0(h44Var2);
                                            if (h44Var2 instanceof w3b) {
                                                h44 w3bVar = new w3b(dx7Var2.getContext(), (w3b) h44Var2, P0);
                                                w3bVar.setDelegate(dx7Var2);
                                                zw7Var2.addView(w3bVar);
                                                dx7Var2.c0();
                                                rlbVar = w3bVar;
                                            } else if (h44Var2 instanceof rlb) {
                                                rlb rlbVar2 = new rlb(dx7Var2.getContext(), (rlb) h44Var2, P0);
                                                rlbVar2.setDelegate(dx7Var2);
                                                rlbVar2.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                                zw7Var2.addView(rlbVar2, tre.c(-2.0f, -2));
                                                dx7Var2.c0();
                                                rlbVar = rlbVar2;
                                            }
                                            dx7Var2.A0(rlbVar);
                                            dx7Var2.C0(null, true);
                                            dx7Var2.a0(rlbVar);
                                        }
                                        n8 n8Var8 = dx7Var2.r1;
                                        if (n8Var8 != null && n8Var8.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, tre.o(-2, 44));
                } else if (h44Var instanceof sd6) {
                    TextView d0 = dx7Var.d0(1, ob6.M0(2131747397, null));
                    d0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rlb rlbVar;
                            byte b2 = r3;
                            h44 h44Var2 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b2) {
                                case 0:
                                    if (h44Var2 instanceof pp9) {
                                        ibb ibbVar = ((wab) dx7Var2).o2.d1;
                                        if (ibbVar != null) {
                                            ibbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var2);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((rlb) h44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    dx7Var2.C0(h44Var2, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var2, new ia7(dx7Var2, h44Var2, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var2);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (h44Var2 instanceof w3b) {
                                        ((w3b) h44Var2).r(true);
                                    } else if (h44Var2 instanceof s39) {
                                        ((s39) h44Var2).r(true);
                                    } else if (h44Var2 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var2;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var2).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    h44Var2.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var2 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var2);
                                        if (h44Var2 instanceof w3b) {
                                            h44 w3bVar = new w3b(dx7Var2.getContext(), (w3b) h44Var2, P0);
                                            w3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(w3bVar);
                                            dx7Var2.c0();
                                            rlbVar = w3bVar;
                                        } else if (h44Var2 instanceof rlb) {
                                            rlb rlbVar2 = new rlb(dx7Var2.getContext(), (rlb) h44Var2, P0);
                                            rlbVar2.setDelegate(dx7Var2);
                                            rlbVar2.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar2, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            rlbVar = rlbVar2;
                                        }
                                        dx7Var2.A0(rlbVar);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(rlbVar);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(d0, tre.o(-2, 44));
                } else if (h44Var instanceof s66) {
                    TextView d02 = dx7Var.d0(1, ob6.M0(2131747397, null));
                    d02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rlb rlbVar;
                            byte b2 = r3;
                            h44 h44Var2 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b2) {
                                case 0:
                                    if (h44Var2 instanceof pp9) {
                                        ibb ibbVar = ((wab) dx7Var2).o2.d1;
                                        if (ibbVar != null) {
                                            ibbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var2);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((rlb) h44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    dx7Var2.C0(h44Var2, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var2, new ia7(dx7Var2, h44Var2, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var2);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (h44Var2 instanceof w3b) {
                                        ((w3b) h44Var2).r(true);
                                    } else if (h44Var2 instanceof s39) {
                                        ((s39) h44Var2).r(true);
                                    } else if (h44Var2 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var2;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var2).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    h44Var2.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var2 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var2);
                                        if (h44Var2 instanceof w3b) {
                                            h44 w3bVar = new w3b(dx7Var2.getContext(), (w3b) h44Var2, P0);
                                            w3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(w3bVar);
                                            dx7Var2.c0();
                                            rlbVar = w3bVar;
                                        } else if (h44Var2 instanceof rlb) {
                                            rlb rlbVar2 = new rlb(dx7Var2.getContext(), (rlb) h44Var2, P0);
                                            rlbVar2.setDelegate(dx7Var2);
                                            rlbVar2.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar2, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            rlbVar = rlbVar2;
                                        }
                                        dx7Var2.A0(rlbVar);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(rlbVar);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(d02, tre.o(-2, 44));
                }
                if ((h44Var instanceof w3b) || (h44Var instanceof pp9) || (h44Var instanceof v98) || (h44Var instanceof s39)) {
                    TextView d03 = dx7Var.d0(4, ob6.M0(2131750650, null));
                    d03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rlb rlbVar;
                            byte b2 = r3;
                            h44 h44Var2 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b2) {
                                case 0:
                                    if (h44Var2 instanceof pp9) {
                                        ibb ibbVar = ((wab) dx7Var2).o2.d1;
                                        if (ibbVar != null) {
                                            ibbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var2);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((rlb) h44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    dx7Var2.C0(h44Var2, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var2, new ia7(dx7Var2, h44Var2, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var2);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (h44Var2 instanceof w3b) {
                                        ((w3b) h44Var2).r(true);
                                    } else if (h44Var2 instanceof s39) {
                                        ((s39) h44Var2).r(true);
                                    } else if (h44Var2 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var2;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var2).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    h44Var2.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var2 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var2);
                                        if (h44Var2 instanceof w3b) {
                                            h44 w3bVar = new w3b(dx7Var2.getContext(), (w3b) h44Var2, P0);
                                            w3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(w3bVar);
                                            dx7Var2.c0();
                                            rlbVar = w3bVar;
                                        } else if (h44Var2 instanceof rlb) {
                                            rlb rlbVar2 = new rlb(dx7Var2.getContext(), (rlb) h44Var2, P0);
                                            rlbVar2.setDelegate(dx7Var2);
                                            rlbVar2.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar2, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            rlbVar = rlbVar2;
                                        }
                                        dx7Var2.A0(rlbVar);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(rlbVar);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(d03, tre.o(-2, 44));
                }
                boolean z2 = h44Var instanceof v98;
                if (zw7Var.indexOfChild(h44Var) != zw7Var.getChildCount() - 1 && !(h44Var instanceof s39)) {
                    TextView textView3 = new TextView(dx7Var.getContext());
                    yob.X(textView3, aob.E8, uk5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(hl.o());
                    textView3.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(ob6.M0(2131747402, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rlb rlbVar;
                            byte b2 = r3;
                            h44 h44Var2 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b2) {
                                case 0:
                                    if (h44Var2 instanceof pp9) {
                                        ibb ibbVar = ((wab) dx7Var2).o2.d1;
                                        if (ibbVar != null) {
                                            ibbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var2);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((rlb) h44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    dx7Var2.C0(h44Var2, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var2, new ia7(dx7Var2, h44Var2, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var2);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (h44Var2 instanceof w3b) {
                                        ((w3b) h44Var2).r(true);
                                    } else if (h44Var2 instanceof s39) {
                                        ((s39) h44Var2).r(true);
                                    } else if (h44Var2 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var2;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var2).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    h44Var2.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var2 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var2);
                                        if (h44Var2 instanceof w3b) {
                                            h44 w3bVar = new w3b(dx7Var2.getContext(), (w3b) h44Var2, P0);
                                            w3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(w3bVar);
                                            dx7Var2.c0();
                                            rlbVar = w3bVar;
                                        } else if (h44Var2 instanceof rlb) {
                                            rlb rlbVar2 = new rlb(dx7Var2.getContext(), (rlb) h44Var2, P0);
                                            rlbVar2.setDelegate(dx7Var2);
                                            rlbVar2.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar2, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            rlbVar = rlbVar2;
                                        }
                                        dx7Var2.A0(rlbVar);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(rlbVar);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, tre.o(-2, 44));
                } else if (!(h44Var instanceof kc1) && !z2 && !z && !(h44Var instanceof pp9) && !(h44Var instanceof sd6) && !(h44Var instanceof xwc) && !(h44Var instanceof s66) && !(h44Var instanceof s39)) {
                    TextView textView4 = new TextView(dx7Var.getContext());
                    yob.X(textView4, aob.E8, uk5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(hl.o());
                    textView4.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(ob6.M0(2131747398, "PaintDuplicate"));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            rlb rlbVar;
                            byte b2 = r3;
                            h44 h44Var2 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b2) {
                                case 0:
                                    if (h44Var2 instanceof pp9) {
                                        ibb ibbVar = ((wab) dx7Var2).o2.d1;
                                        if (ibbVar != null) {
                                            ibbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var2);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((rlb) h44Var2).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    dx7Var2.C0(h44Var2, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var2, new ia7(dx7Var2, h44Var2, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var2);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (h44Var2 instanceof w3b) {
                                        ((w3b) h44Var2).r(true);
                                    } else if (h44Var2 instanceof s39) {
                                        ((s39) h44Var2).r(true);
                                    } else if (h44Var2 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var2;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var2).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    h44Var2.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var2 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var2);
                                        if (h44Var2 instanceof w3b) {
                                            h44 w3bVar = new w3b(dx7Var2.getContext(), (w3b) h44Var2, P0);
                                            w3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(w3bVar);
                                            dx7Var2.c0();
                                            rlbVar = w3bVar;
                                        } else if (h44Var2 instanceof rlb) {
                                            rlb rlbVar2 = new rlb(dx7Var2.getContext(), (rlb) h44Var2, P0);
                                            rlbVar2.setDelegate(dx7Var2);
                                            rlbVar2.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar2, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            rlbVar = rlbVar2;
                                        }
                                        dx7Var2.A0(rlbVar);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(rlbVar);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, tre.o(-2, 44));
                }
                for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
                    View childAt = linearLayout.getChildAt(i4);
                    int i5 = aob.i6;
                    int v0 = aob.v0(i5, uk5Var);
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
                    yob.R(childAt, aob.a0(v0, i, i2, i3, i6), null, yob.M(i5), uk5Var);
                }
                dx7Var.s1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
