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
public final class mp7 extends ix0 {
    public static final int w2 = 0;
    public final c V1;
    public final TextView W1;
    public final l46 X1;
    public final mfb Y1;
    public final l46 Z1;
    public final TextView a2;
    public final u41 b2;
    public final u41 c2;
    public w05 d2;
    public Runnable e2;
    public long f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public final ip7 l2;
    public int m2;
    public am6 n2;
    public final ip7 o2;
    public int p2;
    public Runnable q2;
    public p8c r2;
    public j45 s2;
    public p8c t2;
    public final ImageView u2;
    public final FrameLayout v2;

    public mp7(Context context, int i, TL_stars.StarGift starGift, wjb wjbVar) {
        super(context, wjbVar);
        int i2;
        final ?? r12;
        ?? r13;
        int i3;
        Object obj;
        boolean z;
        this.l2 = new ip7(this, (byte) 0);
        this.o2 = new ip7(this, (byte) 2);
        this.p2 = 2131749615;
        this.a = i;
        this.V1 = c.C(i);
        K();
        this.S1.setLayoutParams(new e49(-1, -2));
        this.u1 = 0.1f;
        float f = this.u0 / gl.p;
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1.addView(frameLayout, nme.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.u2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232101);
        zkb.s(imageView, bkb.l6, wjbVar, PorterDuff.Mode.SRC_IN);
        imageView.setBackground(bkb.f0(bkb.v0(bkb.h6, wjbVar), 1, -1));
        imageView.setContentDescription(k96.M0(2131752029, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final mp7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                mp7 mp7Var = this.b;
                switch (b) {
                    case 0:
                        mp7Var.dismiss();
                        return;
                    case 1:
                        if (!mp7Var.g2) {
                            mp7Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        if (!mp7Var.g2 && !mp7Var.k2 && mp7Var.d2 != null) {
                            if (mp7Var.e2 != null) {
                                mp7Var.k2 = true;
                                mp7Var.c2.setLoading(true);
                                gl.d3(mp7Var.l2, 5000L);
                                return;
                            }
                            mp7Var.a1();
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setVisibility(8);
        frameLayout.addView(imageView, nme.d(40, 40.0f, 51, f + 8.0f, 8.0f, 0.0f, 0.0f));
        if (starGift != null) {
            nv4 nv4Var = new nv4(i, wjbVar, context);
            if (gta.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class) != null) {
                obj = null;
                z = true;
            } else {
                obj = null;
                z = false;
            }
            r12 = 1;
            r13 = obj;
            i2 = 8;
            nv4Var.h(starGift, false, false, false, z, false);
            nv4Var.setImageSize(gl.L(90.0f));
            nv4Var.K.setVisibility(8);
            frameLayout.addView(nv4Var, nme.d(120, 120.0f, 49, 0.0f, 20.0f, 0.0f, 12.0f));
        } else {
            i2 = 8;
            r12 = 1;
            r13 = 0;
        }
        int i4 = bkb.F6;
        TextView b = hve.b(context, 20.0f, i4, r12, r13);
        this.W1 = b;
        b.setGravity(17);
        LinearLayout linearLayout = this.S1;
        if (starGift == null) {
            i3 = 20;
        } else {
            i3 = 0;
        }
        linearLayout.addView(b, nme.t(-1, -2, 17, 32, i3, 32, 0));
        l46 l46Var = new l46(context, wjbVar);
        this.X1 = l46Var;
        l46Var.setTextSize(r12, 15.0f);
        l46Var.setGravity(17);
        zkb.X(l46Var, i4, wjbVar);
        zkb.G(l46Var, bkb.I6, wjbVar);
        this.S1.addView(l46Var, nme.t(-1, -2, 17, 32, 8, 32, 0));
        mfb mfbVar = new mfb(context, wjbVar);
        this.Y1 = mfbVar;
        float f2 = f + 14.0f;
        this.S1.addView(mfbVar, nme.s(-1, -2, 7, f2, 18.0f, f2, 0.0f));
        l46 l46Var2 = new l46(context, wjbVar);
        this.Z1 = l46Var2;
        l46Var2.setTextSize(r12, 15.0f);
        l46Var2.setGravity(17);
        zkb.X(l46Var2, i4, wjbVar);
        l46Var2.setVisibility(i2);
        this.S1.addView(l46Var2, nme.t(-1, -2, 17, 32, 16, 32, 0));
        TextView b2 = hve.b(context, 14.0f, bkb.x6, false, r13);
        this.a2 = b2;
        b2.setGravity(17);
        this.S1.addView(b2, nme.t(-1, -2, 17, 32, 14, 32, 12));
        FrameLayout frameLayout2 = new FrameLayout(context);
        zkb.h(bkb.g5, wjbVar, frameLayout2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        u41 u41Var = new u41(wjbVar, context, false);
        this.b2 = u41Var;
        u41Var.f();
        u41Var.setBackground(bkb.b0(gl.L(24.0f), bkb.p1(0.07f, bkb.v0(i4, wjbVar))));
        u41Var.setTextColorKey(i4);
        u41Var.i(k96.M0(2131752577, r13), false, r12);
        u41Var.setOnClickListener(new View.OnClickListener(this) {
            public final mp7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r12;
                mp7 mp7Var = this.b;
                switch (b3) {
                    case 0:
                        mp7Var.dismiss();
                        return;
                    case 1:
                        if (!mp7Var.g2) {
                            mp7Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        if (!mp7Var.g2 && !mp7Var.k2 && mp7Var.d2 != null) {
                            if (mp7Var.e2 != null) {
                                mp7Var.k2 = true;
                                mp7Var.c2.setLoading(true);
                                gl.d3(mp7Var.l2, 5000L);
                                return;
                            }
                            mp7Var.a1();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(u41Var, nme.m(1.0f, 0, 48, 0, 6, 0));
        u41 u41Var2 = new u41(wjbVar, context, r12);
        this.c2 = u41Var2;
        u41Var2.f();
        u41Var2.i(k96.M0(2131751805, r13), false, r12);
        u41Var2.setOnClickListener(new View.OnClickListener(this) {
            public final mp7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r12;
                mp7 mp7Var = this.b;
                switch (b3) {
                    case 0:
                        mp7Var.dismiss();
                        return;
                    case 1:
                        if (!mp7Var.g2) {
                            mp7Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        if (!mp7Var.g2 && !mp7Var.k2 && mp7Var.d2 != null) {
                            if (mp7Var.e2 != null) {
                                mp7Var.k2 = true;
                                mp7Var.c2.setLoading(true);
                                gl.d3(mp7Var.l2, 5000L);
                                return;
                            }
                            mp7Var.a1();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(u41Var2, nme.m(1.0f, 0, 48, 6, 0, 0));
        float f3 = f + 16.0f;
        frameLayout2.addView(linearLayout2, nme.d(-1, 48.0f, 119, f3, 8.0f, f3, 16.0f));
        this.b.addView(frameLayout2, nme.e(-1, -2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v2 = frameLayout3;
        frameLayout3.setPadding(gl.L(6.0f) + this.u0, 0, gl.L(6.0f) + this.u0, 0);
        this.b.addView(frameLayout3, nme.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
        o39 o39Var = this.n1;
        o39Var.setPadding(o39Var.getPaddingLeft(), this.n1.getPaddingTop(), this.n1.getPaddingRight(), gl.L(72.0f) + this.n1.getPaddingBottom());
    }

    public static boolean Y0(Context context, int i, wjb wjbVar, long j, int i2) {
        if (c.C(i).z() >= j) {
            return true;
        }
        String a0 = k96.a0(null, null, i2, c.r(j, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String M0 = k96.M0(2131742822, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = a0;
        alertDialog$Builder.g(k96.M0(2131742820, null), null);
        alertDialog$Builder.j(k96.M0(2131742727, null), new yf(context, i, wjbVar, (byte) 9));
        alertDialog$Builder.o();
        return false;
    }

    public final void Z0() {
        if (!this.g2 && !this.i2) {
            if (this.m2 > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.m2) {
                dismiss();
                am6 am6Var = this.n2;
                if (am6Var != null) {
                    am6Var.run();
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
            w05 w05Var = this.d2.f;
            c cVar = this.V1;
            if (w05Var != null && cVar.L()) {
                j = this.d2.f.b;
            } else {
                j = this.d2.b + this.f2;
            }
            if (cVar.z() < j) {
                Context context = getContext();
                int i = this.a;
                wjb wjbVar = this.J0;
                String a0 = k96.a0(null, null, this.p2, c.r(j, false));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                String M0 = k96.M0(2131742822, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = a0;
                alertDialog$Builder.g(k96.M0(2131742820, null), null);
                alertDialog$Builder.j(k96.M0(2131742727, null), new yf(context, i, wjbVar, (byte) 9));
                alertDialog$Builder.o();
                return;
            }
            this.g2 = true;
            this.c2.setLoading(true);
            cVar.n0(this.d2, new p8c(this) {
                public final mp7 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    mp7 mp7Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            if (mp7Var.h2) {
                                if (!bool.booleanValue()) {
                                    mp7Var.h2 = false;
                                    mp7Var.g2 = false;
                                    mp7Var.c2.setLoading(false);
                                    p8c p8cVar = mp7Var.t2;
                                    if (p8cVar != null) {
                                        p8cVar.a("WALLET_SEND_FAILED");
                                        return;
                                    }
                                    return;
                                }
                                if (!mp7Var.i2) {
                                    mp7Var.i2 = true;
                                    mp7Var.h2 = false;
                                    mp7Var.g2 = false;
                                    mp7Var.dismiss();
                                    Runnable runnable = mp7Var.q2;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                                if (!mp7Var.j2) {
                                    mp7Var.j2 = true;
                                    j45 j45Var = mp7Var.s2;
                                    if (j45Var != null) {
                                        j45Var.run();
                                    }
                                }
                            }
                            p8c p8cVar2 = mp7Var.r2;
                            if (p8cVar2 != null) {
                                p8cVar2.a(bool);
                                return;
                            }
                            return;
                        default:
                            String str = (String) obj;
                            if (str != null) {
                                mp7Var.g2 = false;
                                mp7Var.c2.setLoading(false);
                                if (mp7Var.t2 != null && !c.K(str)) {
                                    mp7Var.t2.a(str);
                                    return;
                                }
                                return;
                            }
                            mp7Var.h2 = true;
                            return;
                    }
                }
            }, new p8c(this) {
                public final mp7 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    mp7 mp7Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            if (mp7Var.h2) {
                                if (!bool.booleanValue()) {
                                    mp7Var.h2 = false;
                                    mp7Var.g2 = false;
                                    mp7Var.c2.setLoading(false);
                                    p8c p8cVar = mp7Var.t2;
                                    if (p8cVar != null) {
                                        p8cVar.a("WALLET_SEND_FAILED");
                                        return;
                                    }
                                    return;
                                }
                                if (!mp7Var.i2) {
                                    mp7Var.i2 = true;
                                    mp7Var.h2 = false;
                                    mp7Var.g2 = false;
                                    mp7Var.dismiss();
                                    Runnable runnable = mp7Var.q2;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                                if (!mp7Var.j2) {
                                    mp7Var.j2 = true;
                                    j45 j45Var = mp7Var.s2;
                                    if (j45Var != null) {
                                        j45Var.run();
                                    }
                                }
                            }
                            p8c p8cVar2 = mp7Var.r2;
                            if (p8cVar2 != null) {
                                p8cVar2.a(bool);
                                return;
                            }
                            return;
                        default:
                            String str = (String) obj;
                            if (str != null) {
                                mp7Var.g2 = false;
                                mp7Var.c2.setLoading(false);
                                if (mp7Var.t2 != null && !c.K(str)) {
                                    mp7Var.t2.a(str);
                                    return;
                                }
                                return;
                            }
                            mp7Var.h2 = true;
                            return;
                    }
                }
            }, new ip7(this, (byte) 1));
        }
    }

    public final void b1() {
        ip7 ip7Var = this.o2;
        gl.r(ip7Var);
        int i = this.m2;
        if (i <= 0) {
            return;
        }
        gl.d3(ip7Var, Math.max(0L, (i - ConnectionsManager.getInstance(this.a).getCurrentTime()) * 1000));
    }

    public final void c1(Runnable runnable, p8c p8cVar, p8c p8cVar2) {
        this.q2 = runnable;
        this.r2 = p8cVar;
        this.t2 = p8cVar2;
    }

    public final void d1(w05 w05Var) {
        this.d2 = w05Var;
        Runnable runnable = this.e2;
        if (runnable != null) {
            runnable.run();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        int L = gl.L(140.0f);
        TextView textView = this.a2;
        spannableStringBuilder.setSpan(new u86(L, textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        this.f2 = 0L;
        this.e2 = this.V1.k(w05Var, new ur4(this, (byte) 22));
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
        gl.r(this.l2);
        gl.r(this.o2);
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
        l46 l46Var = this.X1;
        l46Var.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        l46Var.setVisibility(i);
    }

    @Override
    public final u21 j() {
        return new u21(this.v2, this.J0);
    }
}
