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
import c8.na;
import c8.wa;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.r80;
public final class u3 extends ka {
    public static final int f4096x2 = 0;
    public final org.telegram.ui.Wallet.u0 W1;
    public final TextView X1;
    public final m80 Y1;
    public final ey0 Z1;
    public final m80 f4097a2;
    public final TextView f4098b2;
    public final hi.d f4099c2;
    public final hi.d d2;
    public org.telegram.ui.Wallet.p0 f4100e2;
    public Runnable f4101f2;
    public long f4102g2;
    public boolean f4103h2;
    public boolean f4104i2;
    public boolean f4105j2;
    public boolean f4106k2;
    public boolean f4107l2;
    public final q3 f4108m2;
    public int f4109n2;
    public ai.i f4110o2;
    public final q3 f4111p2;
    public int f4112q2;
    public Runnable f4113r2;
    public y10 f4114s2;
    public ai.d1 f4115t2;
    public y10 f4116u2;
    public final ImageView f4117v2;
    public final FrameLayout f4118w2;

    public u3(int i7, Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i10;
        final ?? r13;
        ?? r14;
        int i11;
        Object obj;
        boolean z10;
        this.f4108m2 = new q3(this, 0);
        this.f4111p2 = new q3(this, 2);
        this.f4112q2 = 2131749614;
        this.f30139a = i7;
        this.W1 = org.telegram.ui.Wallet.u0.D(i7);
        O();
        this.T1.setLayoutParams(new v4.p0(-1, -2));
        this.f39494v1 = 0.1f;
        float f10 = this.f30177u0 / org.telegram.messenger.g0.f24009p;
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1.addView(frameLayout, na.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f4117v2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232098);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f29512m6, h6Var, PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29439i6, h6Var), 1, -1));
        imageView.setContentDescription(hd.N0(2131752029, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final u3 f4048b;

            {
                this.f4048b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f4048b.dismiss();
                        return;
                    case 1:
                        u3 u3Var = this.f4048b;
                        if (!u3Var.f4103h2) {
                            u3Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        u3 u3Var2 = this.f4048b;
                        if (!u3Var2.f4103h2 && !u3Var2.f4107l2 && u3Var2.f4100e2 != null) {
                            if (u3Var2.f4101f2 != null) {
                                u3Var2.f4107l2 = true;
                                u3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(u3Var2.f4108m2, 5000L);
                                return;
                            }
                            u3Var2.g1();
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setVisibility(8);
        frameLayout.addView(imageView, na.d(40, 40.0f, 51, f10 + 8.0f, 8.0f, 0.0f, 0.0f));
        if (starGift != null) {
            i3 i3Var = new i3(i7, context, h6Var);
            if (di.y8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class) != null) {
                obj = null;
                z10 = true;
            } else {
                obj = null;
                z10 = false;
            }
            r14 = obj;
            r13 = 1;
            i10 = 8;
            i3Var.h(starGift, false, false, false, z10, false);
            i3Var.setImageSize(org.telegram.messenger.g0.L(90.0f));
            i3Var.K.setVisibility(8);
            frameLayout.addView(i3Var, na.d(120, 120.0f, 49, 0.0f, 20.0f, 0.0f, 12.0f));
        } else {
            i10 = 8;
            r13 = 1;
            r14 = 0;
        }
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        TextView b10 = wa.b(context, 20.0f, i12, r13, r14);
        this.X1 = b10;
        b10.setGravity(17);
        LinearLayout linearLayout = this.T1;
        if (starGift == null) {
            i11 = 20;
        } else {
            i11 = 0;
        }
        linearLayout.addView(b10, na.t(-1, -2, 17, 32, i11, 32, 0));
        m80 m80Var = new m80(context, h6Var);
        this.Y1 = m80Var;
        m80Var.setTextSize(r13, 15.0f);
        m80Var.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(m80Var, i12, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, h6Var);
        this.T1.addView(m80Var, na.t(-1, -2, 17, 32, 8, 32, 0));
        ey0 ey0Var = new ey0(context, h6Var);
        this.Z1 = ey0Var;
        float f11 = f10 + 14.0f;
        this.T1.addView(ey0Var, na.s(-1, -2, 7, f11, 18.0f, f11, 0.0f));
        m80 m80Var2 = new m80(context, h6Var);
        this.f4097a2 = m80Var2;
        m80Var2.setTextSize(r13, 15.0f);
        m80Var2.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(m80Var2, i12, h6Var);
        m80Var2.setVisibility(i10);
        this.T1.addView(m80Var2, na.t(-1, -2, 17, 32, 16, 32, 0));
        TextView b11 = wa.b(context, 14.0f, org.telegram.ui.ActionBar.m6.f29739y6, false, r14);
        this.f4098b2 = b11;
        b11.setGravity(17);
        this.T1.addView(b11, na.t(-1, -2, 17, 32, 14, 32, 12));
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29420h5, frameLayout2, h6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        hi.d dVar = new hi.d(context, h6Var, false);
        this.f4099c2 = dVar;
        dVar.f();
        dVar.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.r1(0.07f, org.telegram.ui.ActionBar.m6.w0(i12, h6Var))));
        dVar.setTextColorKey(i12);
        dVar.i(hd.N0(2131752577, r14), false, r13);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final u3 f4048b;

            {
                this.f4048b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r13) {
                    case 0:
                        this.f4048b.dismiss();
                        return;
                    case 1:
                        u3 u3Var = this.f4048b;
                        if (!u3Var.f4103h2) {
                            u3Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        u3 u3Var2 = this.f4048b;
                        if (!u3Var2.f4103h2 && !u3Var2.f4107l2 && u3Var2.f4100e2 != null) {
                            if (u3Var2.f4101f2 != null) {
                                u3Var2.f4107l2 = true;
                                u3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(u3Var2.f4108m2, 5000L);
                                return;
                            }
                            u3Var2.g1();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar, na.m(1.0f, 0, 48, 0, 6, 0));
        hi.d dVar2 = new hi.d(context, h6Var, r13);
        this.d2 = dVar2;
        dVar2.f();
        dVar2.i(hd.N0(2131751805, r14), false, r13);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final u3 f4048b;

            {
                this.f4048b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r13) {
                    case 0:
                        this.f4048b.dismiss();
                        return;
                    case 1:
                        u3 u3Var = this.f4048b;
                        if (!u3Var.f4103h2) {
                            u3Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        u3 u3Var2 = this.f4048b;
                        if (!u3Var2.f4103h2 && !u3Var2.f4107l2 && u3Var2.f4100e2 != null) {
                            if (u3Var2.f4101f2 != null) {
                                u3Var2.f4107l2 = true;
                                u3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(u3Var2.f4108m2, 5000L);
                                return;
                            }
                            u3Var2.g1();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar2, na.m(1.0f, 0, 48, 6, 0, 0));
        float f12 = f10 + 16.0f;
        frameLayout2.addView(linearLayout2, na.d(-1, 48.0f, 119, f12, 8.0f, f12, 16.0f));
        this.f30142b.addView(frameLayout2, na.e(-1, -2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f4118w2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f30177u0, 0, org.telegram.messenger.g0.L(6.0f) + this.f30177u0, 0);
        this.f30142b.addView(frameLayout3, na.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
        ek0 ek0Var = this.f39487o1;
        ek0Var.setPadding(ek0Var.getPaddingLeft(), this.f39487o1.getPaddingTop(), this.f39487o1.getPaddingRight(), org.telegram.messenger.g0.L(72.0f) + this.f39487o1.getPaddingBottom());
    }

    public static boolean e1(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, long j3, int i10) {
        if (org.telegram.ui.Wallet.u0.D(i7).A() >= j3) {
            return true;
        }
        String a02 = hd.a0(null, null, i10, org.telegram.ui.Wallet.u0.s(j3, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = hd.N0(2131742821, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.S = N0;
        t1Var.U = a02;
        alertDialog$Builder.h(hd.N0(2131742819, null), null);
        alertDialog$Builder.k(hd.N0(2131742726, null), new ai.n1(context, i7, h6Var, 1));
        alertDialog$Builder.p();
        return false;
    }

    @Override
    public final void dismiss() {
        if (this.f4104i2 && !this.f4105j2) {
            this.f4105j2 = true;
            this.f4104i2 = false;
            Runnable runnable = this.f4113r2;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4107l2 = false;
        org.telegram.messenger.g0.r(this.f4108m2);
        org.telegram.messenger.g0.r(this.f4111p2);
        Runnable runnable2 = this.f4101f2;
        if (runnable2 != null) {
            runnable2.run();
            this.f4101f2 = null;
        }
        super.dismiss();
    }

    public final void f1() {
        if (!this.f4103h2 && !this.f4105j2) {
            if (this.f4109n2 > 0 && ConnectionsManager.getInstance(this.f30139a).getCurrentTime() >= this.f4109n2) {
                dismiss();
                ai.i iVar = this.f4110o2;
                if (iVar != null) {
                    iVar.run();
                    return;
                }
                return;
            }
            h1();
        }
    }

    public final void g1() {
        long j3;
        if (!this.f4103h2 && this.f4100e2 != null) {
            if (this.f4109n2 > 0 && ConnectionsManager.getInstance(this.f30139a).getCurrentTime() >= this.f4109n2) {
                f1();
                return;
            }
            org.telegram.ui.Wallet.p0 p0Var = this.f4100e2.f44745f;
            org.telegram.ui.Wallet.u0 u0Var = this.W1;
            if (p0Var != null && u0Var.M()) {
                j3 = this.f4100e2.f44745f.f44742b;
            } else {
                j3 = this.f4100e2.f44742b + this.f4102g2;
            }
            if (u0Var.A() < j3) {
                Context context = getContext();
                int i7 = this.f30139a;
                org.telegram.ui.ActionBar.h6 h6Var = this.J0;
                String a02 = hd.a0(null, null, this.f4112q2, org.telegram.ui.Wallet.u0.s(j3, false));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                String N0 = hd.N0(2131742821, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = a02;
                alertDialog$Builder.h(hd.N0(2131742819, null), null);
                alertDialog$Builder.k(hd.N0(2131742726, null), new ai.n1(context, i7, h6Var, 1));
                alertDialog$Builder.p();
                return;
            }
            this.f4103h2 = true;
            this.d2.setLoading(true);
            u0Var.o0(this.f4100e2, new y10(this) {
                public final u3 f4022b;

                {
                    this.f4022b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            u3 u3Var = this.f4022b;
                            if (u3Var.f4104i2) {
                                if (!bool.booleanValue()) {
                                    u3Var.f4104i2 = false;
                                    u3Var.f4103h2 = false;
                                    u3Var.d2.setLoading(false);
                                    y10 y10Var = u3Var.f4116u2;
                                    if (y10Var != null) {
                                        y10Var.a("WALLET_SEND_FAILED");
                                        return;
                                    }
                                    return;
                                }
                                if (!u3Var.f4105j2) {
                                    u3Var.f4105j2 = true;
                                    u3Var.f4104i2 = false;
                                    u3Var.f4103h2 = false;
                                    u3Var.dismiss();
                                    Runnable runnable = u3Var.f4113r2;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                                if (!u3Var.f4106k2) {
                                    u3Var.f4106k2 = true;
                                    ai.d1 d1Var = u3Var.f4115t2;
                                    if (d1Var != null) {
                                        d1Var.run();
                                    }
                                }
                            }
                            y10 y10Var2 = u3Var.f4114s2;
                            if (y10Var2 != null) {
                                y10Var2.a(bool);
                                return;
                            }
                            return;
                        default:
                            String str = (String) obj;
                            u3 u3Var2 = this.f4022b;
                            if (str != null) {
                                u3Var2.f4103h2 = false;
                                u3Var2.d2.setLoading(false);
                                if (u3Var2.f4116u2 != null && !org.telegram.ui.Wallet.u0.L(str)) {
                                    u3Var2.f4116u2.a(str);
                                    return;
                                }
                                return;
                            }
                            u3Var2.f4104i2 = true;
                            return;
                    }
                }
            }, new y10(this) {
                public final u3 f4022b;

                {
                    this.f4022b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            u3 u3Var = this.f4022b;
                            if (u3Var.f4104i2) {
                                if (!bool.booleanValue()) {
                                    u3Var.f4104i2 = false;
                                    u3Var.f4103h2 = false;
                                    u3Var.d2.setLoading(false);
                                    y10 y10Var = u3Var.f4116u2;
                                    if (y10Var != null) {
                                        y10Var.a("WALLET_SEND_FAILED");
                                        return;
                                    }
                                    return;
                                }
                                if (!u3Var.f4105j2) {
                                    u3Var.f4105j2 = true;
                                    u3Var.f4104i2 = false;
                                    u3Var.f4103h2 = false;
                                    u3Var.dismiss();
                                    Runnable runnable = u3Var.f4113r2;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                                if (!u3Var.f4106k2) {
                                    u3Var.f4106k2 = true;
                                    ai.d1 d1Var = u3Var.f4115t2;
                                    if (d1Var != null) {
                                        d1Var.run();
                                    }
                                }
                            }
                            y10 y10Var2 = u3Var.f4114s2;
                            if (y10Var2 != null) {
                                y10Var2.a(bool);
                                return;
                            }
                            return;
                        default:
                            String str = (String) obj;
                            u3 u3Var2 = this.f4022b;
                            if (str != null) {
                                u3Var2.f4103h2 = false;
                                u3Var2.d2.setLoading(false);
                                if (u3Var2.f4116u2 != null && !org.telegram.ui.Wallet.u0.L(str)) {
                                    u3Var2.f4116u2.a(str);
                                    return;
                                }
                                return;
                            }
                            u3Var2.f4104i2 = true;
                            return;
                    }
                }
            }, new q3(this, 1));
        }
    }

    public final void h1() {
        q3 q3Var = this.f4111p2;
        org.telegram.messenger.g0.r(q3Var);
        int i7 = this.f4109n2;
        if (i7 <= 0) {
            return;
        }
        org.telegram.messenger.g0.h3(q3Var, Math.max(0L, (i7 - ConnectionsManager.getInstance(this.f30139a).getCurrentTime()) * 1000));
    }

    public final void i1(Runnable runnable, y10 y10Var, y10 y10Var2) {
        this.f4113r2 = runnable;
        this.f4114s2 = y10Var;
        this.f4116u2 = y10Var2;
    }

    public final void j1(org.telegram.ui.Wallet.p0 p0Var) {
        this.f4100e2 = p0Var;
        Runnable runnable = this.f4101f2;
        if (runnable != null) {
            runnable.run();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        int L = org.telegram.messenger.g0.L(140.0f);
        TextView textView = this.f4098b2;
        spannableStringBuilder.setSpan(new r80(L, textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        this.f4102g2 = 0L;
        this.f4101f2 = this.W1.l(p0Var, new b(this, 7));
    }

    @Override
    public final lc k() {
        return new lc(this.f4118w2, this.J0);
    }

    public final void k1(CharSequence charSequence, String str) {
        int i7;
        this.X1.setText(str);
        setTitle(str);
        m80 m80Var = this.Y1;
        m80Var.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        m80Var.setVisibility(i7);
    }
}
