package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.va;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p80;
public final class o3 extends ka {
    public static final int f3924x2 = 0;
    public final org.telegram.ui.Wallet.u0 W1;
    public final TextView X1;
    public final k80 Y1;
    public final cy0 Z1;
    public final k80 f3925a2;
    public final TextView f3926b2;
    public final hi.d f3927c2;
    public final hi.d d2;
    public org.telegram.ui.Wallet.p0 f3928e2;
    public Runnable f3929f2;
    public long f3930g2;
    public boolean f3931h2;
    public boolean f3932i2;
    public boolean f3933j2;
    public boolean f3934k2;
    public boolean f3935l2;
    public final k3 f3936m2;
    public int f3937n2;
    public ai.o f3938o2;
    public final k3 f3939p2;
    public int f3940q2;
    public Runnable f3941r2;
    public x10 f3942s2;
    public ai.a1 f3943t2;
    public x10 f3944u2;
    public final ImageView f3945v2;
    public final FrameLayout f3946w2;

    public o3(int i7, Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i10;
        final ?? r13;
        ?? r14;
        int i11;
        Object obj;
        boolean z10;
        this.f3936m2 = new k3(this, 0);
        this.f3939p2 = new k3(this, 2);
        this.f3940q2 = 2131749615;
        this.f30189a = i7;
        this.W1 = org.telegram.ui.Wallet.u0.D(i7);
        O();
        this.T1.setLayoutParams(new v4.q0(-1, -2));
        this.f39541v1 = 0.1f;
        float f10 = this.f30227u0 / org.telegram.messenger.g0.f24120p;
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1.addView(frameLayout, ma.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f3945v2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232098);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29561m6, i6Var, PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29488i6, i6Var), 1, -1));
        imageView.setContentDescription(gd.M0(2131752030, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final o3 f3876b;

            {
                this.f3876b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f3876b.dismiss();
                        return;
                    case 1:
                        o3 o3Var = this.f3876b;
                        if (!o3Var.f3931h2) {
                            o3Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        o3 o3Var2 = this.f3876b;
                        if (!o3Var2.f3931h2 && !o3Var2.f3935l2 && o3Var2.f3928e2 != null) {
                            if (o3Var2.f3929f2 != null) {
                                o3Var2.f3935l2 = true;
                                o3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(o3Var2.f3936m2, 5000L);
                                return;
                            }
                            o3Var2.g1();
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setVisibility(8);
        frameLayout.addView(imageView, ma.d(40, 40.0f, 51, f10 + 8.0f, 8.0f, 0.0f, 0.0f));
        if (starGift != null) {
            c3 c3Var = new c3(i7, context, i6Var);
            if (di.x8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class) != null) {
                obj = null;
                z10 = true;
            } else {
                obj = null;
                z10 = false;
            }
            r14 = obj;
            r13 = 1;
            i10 = 8;
            c3Var.h(starGift, false, false, false, z10, false);
            c3Var.setImageSize(org.telegram.messenger.g0.L(90.0f));
            c3Var.K.setVisibility(8);
            frameLayout.addView(c3Var, ma.d(120, 120.0f, 49, 0.0f, 20.0f, 0.0f, 12.0f));
        } else {
            i10 = 8;
            r13 = 1;
            r14 = 0;
        }
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        TextView b10 = va.b(context, 20.0f, i12, r13, r14);
        this.X1 = b10;
        b10.setGravity(17);
        LinearLayout linearLayout = this.T1;
        if (starGift == null) {
            i11 = 20;
        } else {
            i11 = 0;
        }
        linearLayout.addView(b10, ma.t(-1, -2, 17, 32, i11, 32, 0));
        k80 k80Var = new k80(context, i6Var);
        this.Y1 = k80Var;
        k80Var.setTextSize(r13, 15.0f);
        k80Var.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(k80Var, i12, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.J6, i6Var);
        this.T1.addView(k80Var, ma.t(-1, -2, 17, 32, 8, 32, 0));
        cy0 cy0Var = new cy0(context, i6Var);
        this.Z1 = cy0Var;
        float f11 = f10 + 14.0f;
        this.T1.addView(cy0Var, ma.s(-1, -2, 7, f11, 18.0f, f11, 0.0f));
        k80 k80Var2 = new k80(context, i6Var);
        this.f3925a2 = k80Var2;
        k80Var2.setTextSize(r13, 15.0f);
        k80Var2.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(k80Var2, i12, i6Var);
        k80Var2.setVisibility(i10);
        this.T1.addView(k80Var2, ma.t(-1, -2, 17, 32, 16, 32, 0));
        TextView b11 = va.b(context, 14.0f, org.telegram.ui.ActionBar.n6.f29788y6, false, r14);
        this.f3926b2 = b11;
        b11.setGravity(17);
        this.T1.addView(b11, ma.t(-1, -2, 17, 32, 14, 32, 12));
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29469h5, frameLayout2, i6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        hi.d dVar = new hi.d(context, i6Var, false);
        this.f3927c2 = dVar;
        dVar.f();
        dVar.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.n6.r1(0.07f, org.telegram.ui.ActionBar.n6.w0(i12, i6Var))));
        dVar.setTextColorKey(i12);
        dVar.i(gd.M0(2131752578, r14), false, r13);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final o3 f3876b;

            {
                this.f3876b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r13) {
                    case 0:
                        this.f3876b.dismiss();
                        return;
                    case 1:
                        o3 o3Var = this.f3876b;
                        if (!o3Var.f3931h2) {
                            o3Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        o3 o3Var2 = this.f3876b;
                        if (!o3Var2.f3931h2 && !o3Var2.f3935l2 && o3Var2.f3928e2 != null) {
                            if (o3Var2.f3929f2 != null) {
                                o3Var2.f3935l2 = true;
                                o3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(o3Var2.f3936m2, 5000L);
                                return;
                            }
                            o3Var2.g1();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar, ma.m(1.0f, 0, 48, 0, 6, 0));
        hi.d dVar2 = new hi.d(context, i6Var, r13);
        this.d2 = dVar2;
        dVar2.f();
        dVar2.i(gd.M0(2131751806, r14), false, r13);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final o3 f3876b;

            {
                this.f3876b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r13) {
                    case 0:
                        this.f3876b.dismiss();
                        return;
                    case 1:
                        o3 o3Var = this.f3876b;
                        if (!o3Var.f3931h2) {
                            o3Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        o3 o3Var2 = this.f3876b;
                        if (!o3Var2.f3931h2 && !o3Var2.f3935l2 && o3Var2.f3928e2 != null) {
                            if (o3Var2.f3929f2 != null) {
                                o3Var2.f3935l2 = true;
                                o3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(o3Var2.f3936m2, 5000L);
                                return;
                            }
                            o3Var2.g1();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar2, ma.m(1.0f, 0, 48, 6, 0, 0));
        float f12 = f10 + 16.0f;
        frameLayout2.addView(linearLayout2, ma.d(-1, 48.0f, 119, f12, 8.0f, f12, 16.0f));
        this.f30192b.addView(frameLayout2, ma.e(-1, -2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f3946w2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f30227u0, 0, org.telegram.messenger.g0.L(6.0f) + this.f30227u0, 0);
        this.f30192b.addView(frameLayout3, ma.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
        ck0 ck0Var = this.f39534o1;
        ck0Var.setPadding(ck0Var.getPaddingLeft(), this.f39534o1.getPaddingTop(), this.f39534o1.getPaddingRight(), org.telegram.messenger.g0.L(72.0f) + this.f39534o1.getPaddingBottom());
    }

    public static boolean e1(Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, long j3, int i10) {
        if (org.telegram.ui.Wallet.u0.D(i7).A() >= j3) {
            return true;
        }
        String a02 = gd.a0(null, null, i10, org.telegram.ui.Wallet.u0.s(j3, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = gd.M0(2131742827, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = a02;
        alertDialog$Builder.h(gd.M0(2131742825, null), null);
        alertDialog$Builder.k(gd.M0(2131742732, null), new ai.r1(context, i7, i6Var, 1));
        alertDialog$Builder.p();
        return false;
    }

    @Override
    public final void dismiss() {
        if (this.f3932i2 && !this.f3933j2) {
            this.f3933j2 = true;
            this.f3932i2 = false;
            Runnable runnable = this.f3941r2;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3935l2 = false;
        org.telegram.messenger.g0.r(this.f3936m2);
        org.telegram.messenger.g0.r(this.f3939p2);
        Runnable runnable2 = this.f3929f2;
        if (runnable2 != null) {
            runnable2.run();
            this.f3929f2 = null;
        }
        super.dismiss();
    }

    public final void f1() {
        if (!this.f3931h2 && !this.f3933j2) {
            if (this.f3937n2 > 0 && ConnectionsManager.getInstance(this.f30189a).getCurrentTime() >= this.f3937n2) {
                dismiss();
                ai.o oVar = this.f3938o2;
                if (oVar != null) {
                    oVar.run();
                    return;
                }
                return;
            }
            h1();
        }
    }

    public final void g1() {
        long j3;
        if (!this.f3931h2 && this.f3928e2 != null) {
            if (this.f3937n2 > 0 && ConnectionsManager.getInstance(this.f30189a).getCurrentTime() >= this.f3937n2) {
                f1();
                return;
            }
            org.telegram.ui.Wallet.p0 p0Var = this.f3928e2.f44735f;
            org.telegram.ui.Wallet.u0 u0Var = this.W1;
            if (p0Var != null && u0Var.M()) {
                j3 = this.f3928e2.f44735f.f44732b;
            } else {
                j3 = this.f3928e2.f44732b + this.f3930g2;
            }
            if (u0Var.A() < j3) {
                Context context = getContext();
                int i7 = this.f30189a;
                org.telegram.ui.ActionBar.i6 i6Var = this.J0;
                String a02 = gd.a0(null, null, this.f3940q2, org.telegram.ui.Wallet.u0.s(j3, false));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                String M0 = gd.M0(2131742827, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = a02;
                alertDialog$Builder.h(gd.M0(2131742825, null), null);
                alertDialog$Builder.k(gd.M0(2131742732, null), new ai.r1(context, i7, i6Var, 1));
                alertDialog$Builder.p();
                return;
            }
            this.f3931h2 = true;
            this.d2.setLoading(true);
            u0Var.o0(this.f3928e2, new x10(this) {
                public final o3 f3839b;

                {
                    this.f3839b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            o3 o3Var = this.f3839b;
                            if (o3Var.f3932i2) {
                                if (!bool.booleanValue()) {
                                    o3Var.f3932i2 = false;
                                    o3Var.f3931h2 = false;
                                    o3Var.d2.setLoading(false);
                                    x10 x10Var = o3Var.f3944u2;
                                    if (x10Var != null) {
                                        x10Var.a("WALLET_SEND_FAILED");
                                        return;
                                    }
                                    return;
                                }
                                if (!o3Var.f3933j2) {
                                    o3Var.f3933j2 = true;
                                    o3Var.f3932i2 = false;
                                    o3Var.f3931h2 = false;
                                    o3Var.dismiss();
                                    Runnable runnable = o3Var.f3941r2;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                                if (!o3Var.f3934k2) {
                                    o3Var.f3934k2 = true;
                                    ai.a1 a1Var = o3Var.f3943t2;
                                    if (a1Var != null) {
                                        a1Var.run();
                                    }
                                }
                            }
                            x10 x10Var2 = o3Var.f3942s2;
                            if (x10Var2 != null) {
                                x10Var2.a(bool);
                                return;
                            }
                            return;
                        default:
                            String str = (String) obj;
                            o3 o3Var2 = this.f3839b;
                            if (str != null) {
                                o3Var2.f3931h2 = false;
                                o3Var2.d2.setLoading(false);
                                if (o3Var2.f3944u2 != null && !org.telegram.ui.Wallet.u0.L(str)) {
                                    o3Var2.f3944u2.a(str);
                                    return;
                                }
                                return;
                            }
                            o3Var2.f3932i2 = true;
                            return;
                    }
                }
            }, new x10(this) {
                public final o3 f3839b;

                {
                    this.f3839b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            o3 o3Var = this.f3839b;
                            if (o3Var.f3932i2) {
                                if (!bool.booleanValue()) {
                                    o3Var.f3932i2 = false;
                                    o3Var.f3931h2 = false;
                                    o3Var.d2.setLoading(false);
                                    x10 x10Var = o3Var.f3944u2;
                                    if (x10Var != null) {
                                        x10Var.a("WALLET_SEND_FAILED");
                                        return;
                                    }
                                    return;
                                }
                                if (!o3Var.f3933j2) {
                                    o3Var.f3933j2 = true;
                                    o3Var.f3932i2 = false;
                                    o3Var.f3931h2 = false;
                                    o3Var.dismiss();
                                    Runnable runnable = o3Var.f3941r2;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                                if (!o3Var.f3934k2) {
                                    o3Var.f3934k2 = true;
                                    ai.a1 a1Var = o3Var.f3943t2;
                                    if (a1Var != null) {
                                        a1Var.run();
                                    }
                                }
                            }
                            x10 x10Var2 = o3Var.f3942s2;
                            if (x10Var2 != null) {
                                x10Var2.a(bool);
                                return;
                            }
                            return;
                        default:
                            String str = (String) obj;
                            o3 o3Var2 = this.f3839b;
                            if (str != null) {
                                o3Var2.f3931h2 = false;
                                o3Var2.d2.setLoading(false);
                                if (o3Var2.f3944u2 != null && !org.telegram.ui.Wallet.u0.L(str)) {
                                    o3Var2.f3944u2.a(str);
                                    return;
                                }
                                return;
                            }
                            o3Var2.f3932i2 = true;
                            return;
                    }
                }
            }, new k3(this, 1));
        }
    }

    public final void h1() {
        k3 k3Var = this.f3939p2;
        org.telegram.messenger.g0.r(k3Var);
        int i7 = this.f3937n2;
        if (i7 <= 0) {
            return;
        }
        org.telegram.messenger.g0.h3(k3Var, Math.max(0L, (i7 - ConnectionsManager.getInstance(this.f30189a).getCurrentTime()) * 1000));
    }

    public final void i1(Runnable runnable, x10 x10Var, x10 x10Var2) {
        this.f3941r2 = runnable;
        this.f3942s2 = x10Var;
        this.f3944u2 = x10Var2;
    }

    public final void j1(org.telegram.ui.Wallet.p0 p0Var) {
        this.f3928e2 = p0Var;
        Runnable runnable = this.f3929f2;
        if (runnable != null) {
            runnable.run();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        int L = org.telegram.messenger.g0.L(140.0f);
        TextView textView = this.f3926b2;
        spannableStringBuilder.setSpan(new p80(L, textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        this.f3930g2 = 0L;
        this.f3929f2 = this.W1.l(p0Var, new b(this, 7));
    }

    @Override
    public final lc k() {
        return new lc(this.f3946w2, this.J0);
    }

    public final void k1(CharSequence charSequence, String str) {
        int i7;
        this.X1.setText(str);
        setTitle(str);
        k80 k80Var = this.Y1;
        k80Var.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        k80Var.setVisibility(i7);
    }
}
