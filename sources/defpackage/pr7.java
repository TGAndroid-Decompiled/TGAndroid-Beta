package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public final class pr7 extends py0 {
    public static final int w2 = 0;
    public final c V1;
    public final TextView W1;
    public final l66 X1;
    public final mhb Y1;
    public final l66 Z1;
    public final TextView a2;
    public final b61 b2;
    public final b61 c2;
    public w25 d2;
    public Runnable e2;
    public long f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public final lr7 l2;
    public int m2;
    public bo6 n2;
    public final lr7 o2;
    public int p2;
    public Runnable q2;
    public qac r2;
    public h65 s2;
    public qac t2;
    public final ImageView u2;
    public final FrameLayout v2;

    public pr7(Context context, int i, TL_stars.StarGift starGift, ylb ylbVar) {
        super(context, ylbVar);
        int i2;
        final ?? r12;
        ?? r13;
        int i3;
        Object obj;
        boolean z;
        this.l2 = new lr7(this, (byte) 0);
        this.o2 = new lr7(this, (byte) 2);
        this.p2 = 2131749564;
        this.a = i;
        this.V1 = c.C(i);
        J();
        this.S1.setLayoutParams(new g69(-1, -2));
        this.u1 = 0.1f;
        float f = this.u0 / gm.p;
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1.addView(frameLayout, qoe.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.u2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232102);
        anb.s(imageView, cmb.l6, ylbVar, PorterDuff.Mode.SRC_IN);
        imageView.setBackground(cmb.f0(cmb.v0(cmb.h6, ylbVar), 1, -1));
        imageView.setContentDescription(jb6.M0(2131751978, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final pr7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                pr7 pr7Var = this.b;
                switch (b) {
                    case 0:
                        pr7Var.dismiss();
                        return;
                    case 1:
                        if (!pr7Var.g2) {
                            pr7Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        if (!pr7Var.g2 && !pr7Var.k2 && pr7Var.d2 != null) {
                            if (pr7Var.e2 != null) {
                                pr7Var.k2 = true;
                                pr7Var.c2.setLoading(true);
                                gm.d3(pr7Var.l2, 5000L);
                                return;
                            }
                            pr7Var.a1();
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setVisibility(8);
        frameLayout.addView(imageView, qoe.d(40, 40.0f, 51, f + 8.0f, 8.0f, 0.0f, 0.0f));
        if (starGift != null) {
            ox4 ox4Var = new ox4(i, ylbVar, context);
            if (jva.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class) != null) {
                obj = null;
                z = true;
            } else {
                obj = null;
                z = false;
            }
            r12 = 1;
            r13 = obj;
            i2 = 8;
            ox4Var.h(starGift, false, false, false, z, false);
            ox4Var.setImageSize(gm.L(90.0f));
            ox4Var.K.setVisibility(8);
            frameLayout.addView(ox4Var, qoe.d(120, 120.0f, 49, 0.0f, 20.0f, 0.0f, 12.0f));
        } else {
            i2 = 8;
            r12 = 1;
            r13 = 0;
        }
        int i4 = cmb.F6;
        TextView b = jxe.b(context, 20.0f, i4, r12, r13);
        this.W1 = b;
        b.setGravity(17);
        LinearLayout linearLayout = this.S1;
        if (starGift == null) {
            i3 = 20;
        } else {
            i3 = 0;
        }
        linearLayout.addView(b, qoe.t(-1, -2, 17, 32, i3, 32, 0));
        l66 l66Var = new l66(context, ylbVar);
        this.X1 = l66Var;
        l66Var.setTextSize(r12, 15.0f);
        l66Var.setGravity(17);
        anb.X(l66Var, i4, ylbVar);
        anb.G(l66Var, cmb.I6, ylbVar);
        this.S1.addView(l66Var, qoe.t(-1, -2, 17, 32, 8, 32, 0));
        mhb mhbVar = new mhb(context, ylbVar);
        this.Y1 = mhbVar;
        float f2 = f + 14.0f;
        this.S1.addView(mhbVar, qoe.s(-1, -2, 7, f2, 18.0f, f2, 0.0f));
        l66 l66Var2 = new l66(context, ylbVar);
        this.Z1 = l66Var2;
        l66Var2.setTextSize(r12, 15.0f);
        l66Var2.setGravity(17);
        anb.X(l66Var2, i4, ylbVar);
        l66Var2.setVisibility(i2);
        this.S1.addView(l66Var2, qoe.t(-1, -2, 17, 32, 16, 32, 0));
        TextView b2 = jxe.b(context, 14.0f, cmb.x6, false, r13);
        this.a2 = b2;
        b2.setGravity(17);
        this.S1.addView(b2, qoe.t(-1, -2, 17, 32, 14, 32, 12));
        FrameLayout frameLayout2 = new FrameLayout(context);
        anb.h(cmb.g5, ylbVar, frameLayout2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        b61 b61Var = new b61(ylbVar, context, false);
        this.b2 = b61Var;
        b61Var.f();
        b61Var.setBackground(cmb.b0(gm.L(24.0f), cmb.p1(0.07f, cmb.v0(i4, ylbVar))));
        b61Var.setTextColorKey(i4);
        b61Var.i(jb6.M0(2131752542, r13), false, r12);
        b61Var.setOnClickListener(new View.OnClickListener(this) {
            public final pr7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r12;
                pr7 pr7Var = this.b;
                switch (b3) {
                    case 0:
                        pr7Var.dismiss();
                        return;
                    case 1:
                        if (!pr7Var.g2) {
                            pr7Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        if (!pr7Var.g2 && !pr7Var.k2 && pr7Var.d2 != null) {
                            if (pr7Var.e2 != null) {
                                pr7Var.k2 = true;
                                pr7Var.c2.setLoading(true);
                                gm.d3(pr7Var.l2, 5000L);
                                return;
                            }
                            pr7Var.a1();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(b61Var, qoe.m(1.0f, 0, 48, 0, 6, 0));
        b61 b61Var2 = new b61(ylbVar, context, r12);
        this.c2 = b61Var2;
        b61Var2.f();
        b61Var2.i(jb6.M0(2131751754, r13), false, r12);
        b61Var2.setOnClickListener(new View.OnClickListener(this) {
            public final pr7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r12;
                pr7 pr7Var = this.b;
                switch (b3) {
                    case 0:
                        pr7Var.dismiss();
                        return;
                    case 1:
                        if (!pr7Var.g2) {
                            pr7Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        if (!pr7Var.g2 && !pr7Var.k2 && pr7Var.d2 != null) {
                            if (pr7Var.e2 != null) {
                                pr7Var.k2 = true;
                                pr7Var.c2.setLoading(true);
                                gm.d3(pr7Var.l2, 5000L);
                                return;
                            }
                            pr7Var.a1();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(b61Var2, qoe.m(1.0f, 0, 48, 6, 0, 0));
        float f3 = f + 16.0f;
        frameLayout2.addView(linearLayout2, qoe.d(-1, 48.0f, 119, f3, 8.0f, f3, 16.0f));
        this.b.addView(frameLayout2, qoe.e(-1, -2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v2 = frameLayout3;
        frameLayout3.setPadding(gm.L(6.0f) + this.u0, 0, gm.L(6.0f) + this.u0, 0);
        this.b.addView(frameLayout3, qoe.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
        r59 r59Var = this.n1;
        r59Var.setPadding(r59Var.getPaddingLeft(), this.n1.getPaddingTop(), this.n1.getPaddingRight(), gm.L(72.0f) + this.n1.getPaddingBottom());
    }

    public static boolean Y0(Context context, int i, ylb ylbVar, long j, int i2) {
        if (c.C(i).z() >= j) {
            return true;
        }
        String a0 = jb6.a0(null, null, i2, c.r(j, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131742748, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = a0;
        alertDialog$Builder.g(jb6.M0(2131742746, null), null);
        alertDialog$Builder.j(jb6.M0(2131742653, null), new yg(context, i, ylbVar, (byte) 10));
        alertDialog$Builder.o();
        return false;
    }

    public final void Z0() {
        if (!this.g2 && !this.i2) {
            if (this.m2 > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.m2) {
                dismiss();
                bo6 bo6Var = this.n2;
                if (bo6Var != null) {
                    bo6Var.run();
                    return;
                }
                return;
            }
            b1();
        }
    }

    public final void a1() {
        long j;
        if (!this.g2 && this.d2 != null) {
            if (this.m2 > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.m2) {
                Z0();
                return;
            }
            w25 w25Var = this.d2.f;
            c cVar = this.V1;
            if (w25Var != null && cVar.L()) {
                j = this.d2.f.b;
            } else {
                j = this.d2.b + this.f2;
            }
            if (cVar.z() < j) {
                Context context = getContext();
                int i = this.a;
                ylb ylbVar = this.J0;
                String a0 = jb6.a0(null, null, this.p2, c.r(j, false));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                String M0 = jb6.M0(2131742748, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = a0;
                alertDialog$Builder.g(jb6.M0(2131742746, null), null);
                alertDialog$Builder.j(jb6.M0(2131742653, null), new yg(context, i, ylbVar, (byte) 10));
                alertDialog$Builder.o();
                return;
            }
            this.g2 = true;
            this.c2.setLoading(true);
            cVar.n0(this.d2, new qac(this) {
                public final pr7 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    pr7 pr7Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            if (pr7Var.h2) {
                                if (!bool.booleanValue()) {
                                    pr7Var.h2 = false;
                                    pr7Var.g2 = false;
                                    pr7Var.c2.setLoading(false);
                                    qac qacVar = pr7Var.t2;
                                    if (qacVar != null) {
                                        qacVar.a("WALLET_SEND_FAILED");
                                        return;
                                    }
                                    return;
                                }
                                if (!pr7Var.i2) {
                                    pr7Var.i2 = true;
                                    pr7Var.h2 = false;
                                    pr7Var.g2 = false;
                                    pr7Var.dismiss();
                                    Runnable runnable = pr7Var.q2;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                                if (!pr7Var.j2) {
                                    pr7Var.j2 = true;
                                    h65 h65Var = pr7Var.s2;
                                    if (h65Var != null) {
                                        h65Var.run();
                                    }
                                }
                            }
                            qac qacVar2 = pr7Var.r2;
                            if (qacVar2 != null) {
                                qacVar2.a(bool);
                                return;
                            }
                            return;
                        default:
                            String str = (String) obj;
                            if (str != null) {
                                pr7Var.g2 = false;
                                pr7Var.c2.setLoading(false);
                                if (pr7Var.t2 != null && !c.K(str)) {
                                    pr7Var.t2.a(str);
                                    return;
                                }
                                return;
                            }
                            pr7Var.h2 = true;
                            return;
                    }
                }
            }, new qac(this) {
                public final pr7 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    pr7 pr7Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            if (pr7Var.h2) {
                                if (!bool.booleanValue()) {
                                    pr7Var.h2 = false;
                                    pr7Var.g2 = false;
                                    pr7Var.c2.setLoading(false);
                                    qac qacVar = pr7Var.t2;
                                    if (qacVar != null) {
                                        qacVar.a("WALLET_SEND_FAILED");
                                        return;
                                    }
                                    return;
                                }
                                if (!pr7Var.i2) {
                                    pr7Var.i2 = true;
                                    pr7Var.h2 = false;
                                    pr7Var.g2 = false;
                                    pr7Var.dismiss();
                                    Runnable runnable = pr7Var.q2;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                                if (!pr7Var.j2) {
                                    pr7Var.j2 = true;
                                    h65 h65Var = pr7Var.s2;
                                    if (h65Var != null) {
                                        h65Var.run();
                                    }
                                }
                            }
                            qac qacVar2 = pr7Var.r2;
                            if (qacVar2 != null) {
                                qacVar2.a(bool);
                                return;
                            }
                            return;
                        default:
                            String str = (String) obj;
                            if (str != null) {
                                pr7Var.g2 = false;
                                pr7Var.c2.setLoading(false);
                                if (pr7Var.t2 != null && !c.K(str)) {
                                    pr7Var.t2.a(str);
                                    return;
                                }
                                return;
                            }
                            pr7Var.h2 = true;
                            return;
                    }
                }
            }, new lr7(this, (byte) 1));
        }
    }

    public final void b1() {
        lr7 lr7Var = this.o2;
        gm.r(lr7Var);
        int i = this.m2;
        if (i <= 0) {
            return;
        }
        gm.d3(lr7Var, Math.max(0L, (i - ConnectionsManager.getInstance(this.a).getCurrentTime()) * 1000));
    }

    public final void c1(Runnable runnable, qac qacVar, qac qacVar2) {
        this.q2 = runnable;
        this.r2 = qacVar;
        this.t2 = qacVar2;
    }

    public final void d1(w25 w25Var) {
        this.d2 = w25Var;
        Runnable runnable = this.e2;
        if (runnable != null) {
            runnable.run();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        int L = gm.L(140.0f);
        TextView textView = this.a2;
        spannableStringBuilder.setSpan(new ta6(L, textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        this.f2 = 0L;
        this.e2 = this.V1.k(w25Var, new vt4(this, (byte) 22));
    }

    @Override
    public final void dismiss() {
        if (this.h2 && !this.i2) {
            this.i2 = true;
            this.h2 = false;
            Runnable runnable = this.q2;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.k2 = false;
        gm.r(this.l2);
        gm.r(this.o2);
        Runnable runnable2 = this.e2;
        if (runnable2 != null) {
            runnable2.run();
            this.e2 = null;
        }
        super.dismiss();
    }

    public final void e1(CharSequence charSequence, String str) {
        int i;
        this.W1.setText(str);
        setTitle(str);
        l66 l66Var = this.X1;
        l66Var.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        l66Var.setVisibility(i);
    }

    @Override
    public final c41 j() {
        return new c41(this.v2, this.J0);
    }
}
