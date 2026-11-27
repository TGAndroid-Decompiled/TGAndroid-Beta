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
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public final class ms7 extends qx0 {
    public static final int y2 = 0;
    public final c V1;
    public final TextView W1;
    public final p66 X1;
    public final hjb Y1;
    public final p66 Z1;
    public final TextView a2;
    public final c51 b2;
    public final c51 c2;
    public a35 d2;
    public Runnable e2;
    public long f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public final is7 l2;
    public int m2;
    public pg6 n2;
    public final is7 o2;
    public int p2;
    public Runnable q2;
    public pcc r2;
    public l65 s2;
    public pcc t2;
    public final ImageView u2;
    public final FrameLayout v2;
    public ct7 w2;
    public boolean x2;

    public ms7(Context context, int i, TL_stars.StarGift starGift, vnb vnbVar) {
        super(context, vnbVar);
        int i2;
        final ?? r12;
        ?? r13;
        int i3;
        Object obj;
        boolean z;
        this.l2 = new is7(this, (byte) 0);
        this.o2 = new is7(this, (byte) 2);
        this.p2 = 2131749576;
        this.a = i;
        this.V1 = c.C(i);
        J();
        this.S1.setLayoutParams(new r79(-1, -2));
        this.u1 = 0.1f;
        float f = this.u0 / hl.p;
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1.addView(frameLayout, tre.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.u2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232101);
        yob.s(imageView, aob.m6, vnbVar, PorterDuff.Mode.SRC_IN);
        imageView.setBackground(aob.f0(aob.v0(aob.i6, vnbVar), 1, -1));
        imageView.setContentDescription(ob6.M0(2131752006, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ms7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                ms7 ms7Var = this.b;
                switch (b) {
                    case 0:
                        ms7Var.dismiss();
                        return;
                    case 1:
                        if (!ms7Var.g2) {
                            ms7Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        if (!ms7Var.g2 && !ms7Var.k2 && ms7Var.d2 != null) {
                            if (ms7Var.e2 != null) {
                                ms7Var.k2 = true;
                                ms7Var.c2.setLoading(true);
                                hl.d3(ms7Var.l2, 5000L);
                                return;
                            }
                            ms7Var.b1();
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setVisibility(8);
        frameLayout.addView(imageView, tre.d(40, 40.0f, 51, f + 8.0f, 8.0f, 0.0f, 0.0f));
        if (starGift != null) {
            sx4 sx4Var = new sx4(i, vnbVar, context);
            if (jxa.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class) != null) {
                obj = null;
                z = true;
            } else {
                obj = null;
                z = false;
            }
            r12 = 1;
            r13 = obj;
            i2 = 8;
            sx4Var.h(starGift, false, false, false, z, false);
            sx4Var.setImageSize(hl.L(90.0f));
            sx4Var.K.setVisibility(8);
            frameLayout.addView(sx4Var, tre.d(120, 120.0f, 49, 0.0f, 20.0f, 0.0f, 12.0f));
        } else {
            i2 = 8;
            r12 = 1;
            r13 = 0;
        }
        int i4 = aob.G6;
        TextView b = zze.b(context, 20.0f, i4, r12, r13);
        this.W1 = b;
        b.setGravity(17);
        LinearLayout linearLayout = this.S1;
        if (starGift == null) {
            i3 = 20;
        } else {
            i3 = 0;
        }
        linearLayout.addView(b, tre.t(-1, -2, 17, 32, i3, 32, 0));
        p66 p66Var = new p66(context, vnbVar);
        this.X1 = p66Var;
        p66Var.setTextSize(r12, 15.0f);
        p66Var.setGravity(17);
        yob.X(p66Var, i4, vnbVar);
        yob.G(p66Var, aob.J6, vnbVar);
        this.S1.addView(p66Var, tre.t(-1, -2, 17, 32, 8, 32, 0));
        hjb hjbVar = new hjb(context, vnbVar);
        this.Y1 = hjbVar;
        float f2 = f + 14.0f;
        this.S1.addView(hjbVar, tre.s(-1, -2, 7, f2, 18.0f, f2, 0.0f));
        p66 p66Var2 = new p66(context, vnbVar);
        this.Z1 = p66Var2;
        p66Var2.setTextSize(r12, 15.0f);
        p66Var2.setGravity(17);
        yob.X(p66Var2, i4, vnbVar);
        p66Var2.setVisibility(i2);
        this.S1.addView(p66Var2, tre.t(-1, -2, 17, 32, 16, 32, 0));
        TextView b2 = zze.b(context, 14.0f, aob.y6, false, r13);
        this.a2 = b2;
        b2.setGravity(17);
        this.S1.addView(b2, tre.t(-1, -2, 17, 32, 14, 32, 12));
        FrameLayout frameLayout2 = new FrameLayout(context);
        yob.h(aob.h5, vnbVar, frameLayout2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        c51 c51Var = new c51(vnbVar, context, false);
        this.b2 = c51Var;
        c51Var.f();
        c51Var.setBackground(aob.b0(hl.L(24.0f), aob.p1(0.07f, aob.v0(i4, vnbVar))));
        c51Var.setTextColorKey(i4);
        c51Var.i(ob6.M0(2131752570, r13), false, r12);
        c51Var.setOnClickListener(new View.OnClickListener(this) {
            public final ms7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r12;
                ms7 ms7Var = this.b;
                switch (b3) {
                    case 0:
                        ms7Var.dismiss();
                        return;
                    case 1:
                        if (!ms7Var.g2) {
                            ms7Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        if (!ms7Var.g2 && !ms7Var.k2 && ms7Var.d2 != null) {
                            if (ms7Var.e2 != null) {
                                ms7Var.k2 = true;
                                ms7Var.c2.setLoading(true);
                                hl.d3(ms7Var.l2, 5000L);
                                return;
                            }
                            ms7Var.b1();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(c51Var, tre.m(1.0f, 0, 48, 0, 6, 0));
        c51 c51Var2 = new c51(vnbVar, context, r12);
        this.c2 = c51Var2;
        c51Var2.f();
        c51Var2.i(ob6.M0(2131751782, r13), false, r12);
        c51Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ms7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r12;
                ms7 ms7Var = this.b;
                switch (b3) {
                    case 0:
                        ms7Var.dismiss();
                        return;
                    case 1:
                        if (!ms7Var.g2) {
                            ms7Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        if (!ms7Var.g2 && !ms7Var.k2 && ms7Var.d2 != null) {
                            if (ms7Var.e2 != null) {
                                ms7Var.k2 = true;
                                ms7Var.c2.setLoading(true);
                                hl.d3(ms7Var.l2, 5000L);
                                return;
                            }
                            ms7Var.b1();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(c51Var2, tre.m(1.0f, 0, 48, 6, 0, 0));
        float f3 = f + 16.0f;
        frameLayout2.addView(linearLayout2, tre.d(-1, 48.0f, 119, f3, 8.0f, f3, 16.0f));
        this.b.addView(frameLayout2, tre.e(-1, -2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v2 = frameLayout3;
        frameLayout3.setPadding(hl.L(6.0f) + this.u0, 0, hl.L(6.0f) + this.u0, 0);
        this.b.addView(frameLayout3, tre.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
        d79 d79Var = this.n1;
        d79Var.setPadding(d79Var.getPaddingLeft(), this.n1.getPaddingTop(), this.n1.getPaddingRight(), hl.L(72.0f) + this.n1.getPaddingBottom());
    }

    public static boolean Z0(Context context, int i, vnb vnbVar, long j, int i2) {
        if (c.C(i).z() >= j) {
            return true;
        }
        String a0 = ob6.a0(null, null, i2, c.r(j, false));
        HashMap hashMap = it7.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String M0 = ob6.M0(2131742716, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = a0;
        alertDialog$Builder.g(ob6.M0(2131742714, null), null);
        alertDialog$Builder.j(ob6.M0(2131742621, null), new bf(context, i, vnbVar, (byte) 11));
        alertDialog$Builder.o();
        return false;
    }

    public final void a1() {
        if (!this.g2 && !this.i2) {
            if (this.m2 > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.m2) {
                dismiss();
                pg6 pg6Var = this.n2;
                if (pg6Var != null) {
                    pg6Var.run();
                    return;
                }
                return;
            }
            c1();
        }
    }

    public final void b1() {
        long j;
        if (!this.g2 && this.d2 != null) {
            if (this.m2 > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.m2) {
                a1();
                return;
            }
            ct7 ct7Var = this.w2;
            c51 c51Var = this.c2;
            if (ct7Var != null && !this.x2) {
                this.g2 = true;
                c51Var.setLoading(true);
                this.w2.a(new pcc(this) {
                    public final ms7 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        ms7 ms7Var = this.b;
                        switch (b) {
                            case 0:
                                String str = (String) obj;
                                if (str != null) {
                                    ms7Var.g2 = false;
                                    ms7Var.c2.setLoading(false);
                                    if (ms7Var.t2 != null && !c.K(str)) {
                                        ms7Var.t2.a(str);
                                        return;
                                    }
                                    return;
                                }
                                ms7Var.h2 = true;
                                return;
                            case 1:
                                Boolean bool = (Boolean) obj;
                                if (ms7Var.h2) {
                                    if (!bool.booleanValue()) {
                                        ms7Var.h2 = false;
                                        ms7Var.g2 = false;
                                        ms7Var.c2.setLoading(false);
                                        if (ms7Var.d2.k) {
                                            ms7Var.i2 = true;
                                            ms7Var.dismiss();
                                            pcc pccVar = ms7Var.t2;
                                            if (pccVar != null) {
                                                pccVar.a("WALLET_SEND_UNCERTAIN");
                                                return;
                                            }
                                            return;
                                        }
                                        pcc pccVar2 = ms7Var.t2;
                                        if (pccVar2 != null) {
                                            pccVar2.a("WALLET_SEND_FAILED");
                                            return;
                                        }
                                        return;
                                    }
                                    if (!ms7Var.i2) {
                                        ms7Var.i2 = true;
                                        ms7Var.h2 = false;
                                        ms7Var.g2 = false;
                                        ms7Var.dismiss();
                                        Runnable runnable = ms7Var.q2;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                    }
                                    if (!ms7Var.j2) {
                                        ms7Var.j2 = true;
                                        l65 l65Var = ms7Var.s2;
                                        if (l65Var != null) {
                                            l65Var.run();
                                        }
                                    }
                                }
                                pcc pccVar3 = ms7Var.r2;
                                if (pccVar3 != null) {
                                    pccVar3.a(bool);
                                    return;
                                }
                                return;
                            default:
                                a35 a35Var = (a35) obj;
                                ms7Var.g2 = false;
                                ms7Var.c2.setLoading(false);
                                if (a35Var != null && !ms7Var.i2 && !ms7Var.J) {
                                    ms7Var.d2 = a35Var;
                                    ms7Var.x2 = true;
                                    ms7Var.b1();
                                    ms7Var.x2 = false;
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            }
            a35 a35Var = this.d2.f;
            c cVar = this.V1;
            if (a35Var != null && cVar.L()) {
                j = this.d2.f.b;
            } else {
                j = this.d2.b + this.f2;
            }
            if (cVar.z() < j) {
                Context context = getContext();
                int i = this.a;
                vnb vnbVar = this.J0;
                String a0 = ob6.a0(null, null, this.p2, c.r(j, false));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                String M0 = ob6.M0(2131742716, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = a0;
                alertDialog$Builder.g(ob6.M0(2131742714, null), null);
                alertDialog$Builder.j(ob6.M0(2131742621, null), new bf(context, i, vnbVar, (byte) 11));
                alertDialog$Builder.o();
                return;
            }
            this.g2 = true;
            c51Var.setLoading(true);
            cVar.p0(this.d2, new pcc(this) {
                public final ms7 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    ms7 ms7Var = this.b;
                    switch (b) {
                        case 0:
                            String str = (String) obj;
                            if (str != null) {
                                ms7Var.g2 = false;
                                ms7Var.c2.setLoading(false);
                                if (ms7Var.t2 != null && !c.K(str)) {
                                    ms7Var.t2.a(str);
                                    return;
                                }
                                return;
                            }
                            ms7Var.h2 = true;
                            return;
                        case 1:
                            Boolean bool = (Boolean) obj;
                            if (ms7Var.h2) {
                                if (!bool.booleanValue()) {
                                    ms7Var.h2 = false;
                                    ms7Var.g2 = false;
                                    ms7Var.c2.setLoading(false);
                                    if (ms7Var.d2.k) {
                                        ms7Var.i2 = true;
                                        ms7Var.dismiss();
                                        pcc pccVar = ms7Var.t2;
                                        if (pccVar != null) {
                                            pccVar.a("WALLET_SEND_UNCERTAIN");
                                            return;
                                        }
                                        return;
                                    }
                                    pcc pccVar2 = ms7Var.t2;
                                    if (pccVar2 != null) {
                                        pccVar2.a("WALLET_SEND_FAILED");
                                        return;
                                    }
                                    return;
                                }
                                if (!ms7Var.i2) {
                                    ms7Var.i2 = true;
                                    ms7Var.h2 = false;
                                    ms7Var.g2 = false;
                                    ms7Var.dismiss();
                                    Runnable runnable = ms7Var.q2;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                                if (!ms7Var.j2) {
                                    ms7Var.j2 = true;
                                    l65 l65Var = ms7Var.s2;
                                    if (l65Var != null) {
                                        l65Var.run();
                                    }
                                }
                            }
                            pcc pccVar3 = ms7Var.r2;
                            if (pccVar3 != null) {
                                pccVar3.a(bool);
                                return;
                            }
                            return;
                        default:
                            a35 a35Var2 = (a35) obj;
                            ms7Var.g2 = false;
                            ms7Var.c2.setLoading(false);
                            if (a35Var2 != null && !ms7Var.i2 && !ms7Var.J) {
                                ms7Var.d2 = a35Var2;
                                ms7Var.x2 = true;
                                ms7Var.b1();
                                ms7Var.x2 = false;
                                return;
                            }
                            return;
                    }
                }
            }, new pcc(this) {
                public final ms7 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    ms7 ms7Var = this.b;
                    switch (b) {
                        case 0:
                            String str = (String) obj;
                            if (str != null) {
                                ms7Var.g2 = false;
                                ms7Var.c2.setLoading(false);
                                if (ms7Var.t2 != null && !c.K(str)) {
                                    ms7Var.t2.a(str);
                                    return;
                                }
                                return;
                            }
                            ms7Var.h2 = true;
                            return;
                        case 1:
                            Boolean bool = (Boolean) obj;
                            if (ms7Var.h2) {
                                if (!bool.booleanValue()) {
                                    ms7Var.h2 = false;
                                    ms7Var.g2 = false;
                                    ms7Var.c2.setLoading(false);
                                    if (ms7Var.d2.k) {
                                        ms7Var.i2 = true;
                                        ms7Var.dismiss();
                                        pcc pccVar = ms7Var.t2;
                                        if (pccVar != null) {
                                            pccVar.a("WALLET_SEND_UNCERTAIN");
                                            return;
                                        }
                                        return;
                                    }
                                    pcc pccVar2 = ms7Var.t2;
                                    if (pccVar2 != null) {
                                        pccVar2.a("WALLET_SEND_FAILED");
                                        return;
                                    }
                                    return;
                                }
                                if (!ms7Var.i2) {
                                    ms7Var.i2 = true;
                                    ms7Var.h2 = false;
                                    ms7Var.g2 = false;
                                    ms7Var.dismiss();
                                    Runnable runnable = ms7Var.q2;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                                if (!ms7Var.j2) {
                                    ms7Var.j2 = true;
                                    l65 l65Var = ms7Var.s2;
                                    if (l65Var != null) {
                                        l65Var.run();
                                    }
                                }
                            }
                            pcc pccVar3 = ms7Var.r2;
                            if (pccVar3 != null) {
                                pccVar3.a(bool);
                                return;
                            }
                            return;
                        default:
                            a35 a35Var2 = (a35) obj;
                            ms7Var.g2 = false;
                            ms7Var.c2.setLoading(false);
                            if (a35Var2 != null && !ms7Var.i2 && !ms7Var.J) {
                                ms7Var.d2 = a35Var2;
                                ms7Var.x2 = true;
                                ms7Var.b1();
                                ms7Var.x2 = false;
                                return;
                            }
                            return;
                    }
                }
            }, new is7(this, (byte) 1));
        }
    }

    public final void c1() {
        is7 is7Var = this.o2;
        hl.r(is7Var);
        int i = this.m2;
        if (i <= 0) {
            return;
        }
        hl.d3(is7Var, Math.max(0L, (i - ConnectionsManager.getInstance(this.a).getCurrentTime()) * 1000));
    }

    public final void d1(Runnable runnable, pcc pccVar, pcc pccVar2) {
        this.q2 = runnable;
        this.r2 = pccVar;
        this.t2 = pccVar2;
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
        hl.r(this.l2);
        hl.r(this.o2);
        Runnable runnable2 = this.e2;
        if (runnable2 != null) {
            runnable2.run();
            this.e2 = null;
        }
        super.dismiss();
    }

    public final void e1(String str) {
        this.c2.i(str, false, true);
    }

    public final void f1(a35 a35Var) {
        this.d2 = a35Var;
        Runnable runnable = this.e2;
        if (runnable != null) {
            runnable.run();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        int L = hl.L(140.0f);
        TextView textView = this.a2;
        spannableStringBuilder.setSpan(new ya6(L, textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        this.f2 = 0L;
        this.e2 = this.V1.k(a35Var, new yt4(this, (byte) 22));
    }

    public final void g1(CharSequence charSequence) {
        int i;
        p66 p66Var = this.Z1;
        p66Var.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        p66Var.setVisibility(i);
    }

    public final void h1(CharSequence charSequence, String str) {
        int i;
        this.W1.setText(str);
        setTitle(str);
        p66 p66Var = this.X1;
        p66Var.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        p66Var.setVisibility(i);
    }

    @Override
    public final d31 j() {
        return new d31(this.v2, this.J0);
    }
}
