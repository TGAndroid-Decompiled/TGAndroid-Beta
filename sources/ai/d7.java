package ai;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.e9;
import ci.wb;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.m9;
import org.telegram.messenger.p9;
import org.telegram.messenger.q9;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wm;
public class d7 extends ma implements cs, p9 {
    public final boolean Q1;
    public final int R1;
    public final long S1;
    public final boolean T1;
    public final boolean U1;
    public final TL_stars.StarGift V1;
    public m9 W1;
    public final vg.j X1;
    public final String Y1;
    public final Runnable Z1;
    public final w6 f577a2;
    public final LinearLayout f578b2;
    public final long c2;
    public final org.telegram.ui.Cells.t0 f579d2;
    public final TLRPC.MessageAction f580e2;
    public final zi f581f2;
    public final LinearLayout f582g2;
    public final gi.d f583h2;
    public final FrameLayout f584i2;
    public boolean f585j2;
    public boolean f586k2;
    public boolean f587l2;
    public final x6 f588m2;
    public f41 f589n2;
    public int f590o2;
    public final wp[] f591p2;
    public boolean f592q2;
    public final si.c f593r2;

    public d7(Context context, int i3, final TL_stars.StarGift starGift, final vg.j jVar, long j10, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        float f10;
        long j11;
        Integer num;
        Integer num2;
        int w02;
        int i10;
        boolean z12;
        int i11;
        this.f586k2 = false;
        this.f587l2 = false;
        this.f590o2 = -2;
        this.f591p2 = new wp[1];
        this.f592q2 = false;
        boolean z13 = j10 == h10.i(i3).e();
        this.Q1 = z13;
        this.N0 = 4;
        N();
        this.A1 = org.telegram.messenger.g0.L(4.0f);
        this.B1 = org.telegram.messenger.g0.L(-10.0f);
        if (z13) {
            this.f585j2 = true;
        }
        this.R1 = i3;
        this.S1 = j10;
        this.V1 = starGift;
        if (starGift == null || !starGift.auction) {
            f10 = 4.0f;
        } else {
            f10 = 4.0f;
            this.W1 = q9.c(i3).l(starGift.f27230id, this);
        }
        this.X1 = jVar;
        this.Z1 = runnable;
        this.T1 = z10;
        this.U1 = z11;
        if (z10) {
            this.f586k2 = true;
        } else if (z11) {
            this.f586k2 = false;
        }
        this.f36108s1 = 0.2f;
        if (j10 >= 0) {
            j11 = 0;
            this.Y1 = l10.k(hp.s1(i3).a2(Long.valueOf(j10)));
        } else {
            j11 = 0;
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            this.Y1 = M0 == null ? "" : M0.title;
        }
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, this.J0, false);
        this.f579d2 = t0Var;
        t0Var.setDelegate(new Object());
        w6 w6Var = new w6(this, context);
        this.f577a2 = w6Var;
        Drawable e10 = gi.y5.e(null, i3, j10, org.telegram.ui.ActionBar.k6.I.q());
        w6Var.U(e10);
        si.c cVar = new si.c();
        if (e10 instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e10).getColor());
        } else {
            if (e10 instanceof la0) {
                la0 la0Var = (la0) e10;
                if (la0Var.f35664q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = la0Var.f35646a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        if (num != null) {
            w02 = num.intValue();
            num2 = num;
        } else {
            num2 = num;
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0);
        }
        cVar.a(w02);
        this.f593r2 = num2 == null ? cVar : null;
        gh.g gVar = new gh.g(cVar, cVar, cVar);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        int i12 = org.telegram.ui.ActionBar.k6.f27954h5;
        gVar.p(new hh.b(i12, e6Var));
        gVar.r(org.telegram.messenger.g0.L(20.0f));
        gVar.q(org.telegram.messenger.g0.L(f10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f578b2 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            i10 = 6;
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f580e2 = tL_messageActionStarGift;
            z12 = z13;
            i11 = i12;
        } else {
            boolean z14 = z13;
            i10 = 6;
            if (jVar != null && jVar.f56678b != null) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = jVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = jVar.a();
                long e11 = jVar.e();
                tL_messageActionGiftCode.amount = e11;
                z12 = z14;
                if (jVar.h != null) {
                    i11 = i12;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftCode.currency) - 6) * e11);
                } else {
                    i11 = i12;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.f580e2 = tL_messageActionGiftCode;
            } else {
                z12 = z14;
                i11 = i12;
                if (jVar != null && jVar.f56677a != null) {
                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                    tL_messageActionGiftPremium.months = jVar.d();
                    tL_messageActionGiftPremium.currency = jVar.a();
                    long e12 = jVar.e();
                    tL_messageActionGiftPremium.amount = e12;
                    if (jVar.h != null) {
                        tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftPremium.currency) - 6) * e12);
                    }
                    tL_messageActionGiftPremium.flags |= 2;
                    tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                    this.f580e2 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.f580e2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z15 = this.f586k2;
            tL_messageActionStarGift2.can_upgrade = z15 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z15) ? starGift.upgrade_stars : j11;
            tL_messageActionStarGift2.convert_stars = z15 ? j11 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f27022id = 1;
        tL_messageService.dialog_id = j10;
        tL_messageService.from_id = hp.s1(i3).z1(h10.i(i3).e());
        tL_messageService.peer_id = hp.s1(i3).z1(j10);
        tL_messageService.action = this.f580e2;
        long N1 = starGift != null ? hp.s1(i3).N1(j10) : j11;
        this.c2 = N1;
        zi ziVar = new zi(i3, tL_messageService, false, false);
        this.f581f2 = ziVar;
        t0Var.f0(ziVar, true);
        linearLayout.addView(t0Var, mf.t(-1, -1, 119, 0, N1 > j11 ? 0 : 8, 0, 8));
        w6Var.addView(linearLayout, mf.e(-1, -1, 119));
        x6 x6Var = new x6(this, context, (qt0) this.f28586b, bd.M0(starGift != null ? 2131750128 : 2131750127, null), hp.s1(i3).D6, this.J0, gVar, i3);
        this.f588m2 = x6Var;
        org.telegram.ui.Cells.f3 f3Var = x6Var.f29316b;
        f3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.j3());
        f3Var.R = true;
        x6Var.setShowLimitWhenNear(50);
        this.I1 = f3Var;
        x6Var.setShowLimitOnFocus(true);
        x6Var.setDivider(false);
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(x6Var, 3);
        f3Var.getEditText().setImeOptions(i10);
        f3Var.getEditText().setOnEditorActionListener(new m.r2(fVar, 1));
        int i13 = this.f28618u0;
        x6Var.setPadding(i13, 0, i13, 0);
        u4.k kVar = new u4.k();
        kVar.C = false;
        kVar.f55567m = false;
        kVar.n(350L);
        kVar.o(xq.h);
        kVar.D = 40L;
        this.f36102l1.setItemAnimator(kVar);
        this.f589n2.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f582g2 = linearLayout2;
        linearLayout2.setOrientation(1);
        ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(i11, this.J0));
        int i14 = this.f28618u0;
        int i15 = i11;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i14, 0, i14, 0));
        int i16 = this.f28618u0;
        linearLayout2.setPadding(i16, 0, i16, 0);
        this.f28586b.addView(linearLayout2, mf.e(-1, -2, 87));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.K5, view, this.J0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(mf.z(-1.0f), mf.z(1.0f / org.telegram.messenger.g0.f22607p));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float i17 = Utilities.i(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i18 = org.telegram.ui.ActionBar.k6.f27824a7;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i18, this.J0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
        org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, e6Var2);
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f584i2 = frameLayout2;
            frameLayout2.addView(frameLayout, mf.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            org.telegram.ui.ActionBar.r6.i(i15, frameLayout2, this.J0);
        } else {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, mf.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f584i2 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i19 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i19, this.J0);
        if (starGift != null) {
            textView.setText(bd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, mf.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        m10.setTextSize(1, 13.0f);
        m10.setGravity(21);
        m10.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(m10, i19, this.J0);
        if (starGift != null) {
            m10.setText(bd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(m10, mf.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View z6Var = new z6(context, starGift, i17);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i20 = org.telegram.ui.ActionBar.k6.Ci;
        Drawable d03 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i20, this.J0));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i20);
        org.telegram.ui.ActionBar.e6 e6Var3 = this.J0;
        z6Var.setBackground(d03);
        org.telegram.ui.ActionBar.r6.k(z6Var, d03, N2, null, e6Var3);
        frameLayout.addView(z6Var, mf.e(-1, -1, 119));
        a7 a7Var = new a7(context, i17);
        a7Var.setWillNotDraw(false);
        frameLayout.addView(a7Var, mf.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(bd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        a7Var.addView(textView2, mf.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(bd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        a7Var.addView(textView3, mf.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        gi.d dVar = new gi.d(context, this.J0, true);
        this.f583h2 = dVar;
        dVar.f();
        g1(false);
        linearLayout2.addView(dVar, mf.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new g0(this, j10, context, runnable, starGift));
        kg.y yVar = this.k1;
        this.H1 = true;
        yVar.k1(true);
        this.f589n2.O(false);
        this.k1.h1(this.f589n2.E.size(), org.telegram.messenger.g0.L(200.0f));
        tj0 tj0Var = this.f36102l1;
        int i21 = this.f28618u0;
        tj0Var.setPadding(i21, 0, i21, org.telegram.messenger.g0.L(68 + ((starGift != null && starGift.limited && this.f584i2 == null) ? 40 : 0)));
        this.f36102l1.i(new b7(this));
        this.f36102l1.setOnItemClickListener(new fj0() {
            @Override
            public final void f(int i22, View view2) {
                boolean z16;
                long j12;
                TL_stars.StarGift starGift2;
                d7 d7Var = d7.this;
                TL_stars.StarGift starGift3 = d7Var.V1;
                boolean z17 = d7Var.Q1;
                org.telegram.ui.Cells.t0 t0Var2 = d7Var.f579d2;
                TLRPC.MessageAction messageAction2 = d7Var.f580e2;
                zi ziVar2 = d7Var.f581f2;
                f41 f41Var = d7Var.f589n2;
                if (!d7Var.H1) {
                    i22--;
                }
                r31 G = f41Var.G(i22);
                if (G != null) {
                    int i23 = G.d;
                    if (i23 == 1) {
                        boolean z18 = !d7Var.f585j2;
                        d7Var.f585j2 = z18;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z18;
                        }
                        ziVar2.b6();
                        t0Var2.f0(ziVar2, true);
                        d7Var.f589n2.O(true);
                    } else if (i23 == 2) {
                        if (!z10 && !z11) {
                            boolean z19 = d7Var.f586k2;
                            d7Var.f586k2 = !z19;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                                if (z19 && (!z17 || (starGift2 = starGift) == null || !starGift2.can_upgrade)) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                                tL_messageActionStarGift3.can_upgrade = z16;
                                long j13 = 0;
                                if (z17 || z19) {
                                    j12 = 0;
                                } else {
                                    j12 = starGift3.upgrade_stars;
                                }
                                tL_messageActionStarGift3.upgrade_stars = j12;
                                if (z19) {
                                    j13 = starGift3.convert_stars;
                                }
                                tL_messageActionStarGift3.convert_stars = j13;
                            }
                            ziVar2.b6();
                            t0Var2.f0(ziVar2, true);
                            d7Var.f589n2.O(true);
                            d7Var.g1(true);
                            return;
                        }
                        int i24 = -d7Var.f590o2;
                        d7Var.f590o2 = i24;
                        org.telegram.messenger.g0.G3(i24, view2, null);
                    } else if (i23 == 3) {
                        boolean z20 = d7Var.f587l2;
                        d7Var.f587l2 = !z20;
                        boolean z21 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                        vg.j jVar2 = jVar;
                        if (z21) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                            if (!z20) {
                                tL_messageActionGiftPremium2.currency = "XTR";
                                tL_messageActionGiftPremium2.amount = jVar2.g();
                            } else {
                                tL_messageActionGiftPremium2.currency = jVar2.a();
                                long e13 = jVar2.e();
                                tL_messageActionGiftPremium2.amount = e13;
                                if (jVar2.h != null) {
                                    tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftPremium2.currency) - 6) * e13);
                                }
                            }
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                            if (!z20) {
                                tL_messageActionGiftCode2.currency = "XTR";
                                tL_messageActionGiftCode2.amount = jVar2.g();
                            } else {
                                tL_messageActionGiftCode2.currency = jVar2.a();
                                long e14 = jVar2.e();
                                tL_messageActionGiftCode2.amount = e14;
                                if (jVar2.h != null) {
                                    tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftCode2.currency) - 6) * e14);
                                }
                            }
                        }
                        ziVar2.b6();
                        t0Var2.f0(ziVar2, true);
                        d7Var.f589n2.O(true);
                        d7Var.g1(true);
                    }
                }
            }
        });
        this.m1.setTitle(O0());
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.f36102l1, getContext(), this.R1, 0, true, new n6(this, 0), this.J0);
        this.f589n2 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        int i3;
        if (this.Q1) {
            i3 = 2131749946;
        } else {
            i3 = 2131749952;
        }
        return bd.M0(i3, null);
    }

    @Override
    public final void c(m9 m9Var) {
        this.W1 = m9Var;
    }

    public final TLRPC.TL_textWithEntities d1() {
        if (hp.s1(this.R1).N1(this.S1) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f580e2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium)) {
            return null;
        }
        return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23343y3) {
            g1(true);
            f41 f41Var = this.f589n2;
            if (f41Var != null && this.X1 != null) {
                f41Var.O(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        x6 x6Var = this.f588m2;
        org.telegram.ui.Cells.f3 f3Var = x6Var.f29316b;
        org.telegram.ui.Cells.f3 f3Var2 = x6Var.f29316b;
        if (f3Var.getEmojiPadding() > 0) {
            f3Var2.k(true);
        } else if (f3Var2.f35196w) {
            f3Var2.d();
        } else {
            f3Var2.r();
            if (this.W1 != null) {
                q9.c(this.R1).n(this.W1.f24177b, this);
            }
            this.f592q2 = true;
            super.dismiss();
        }
    }

    public fc e1() {
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == null) {
            return null;
        }
        return fc.a0(T);
    }

    public final void f1(boolean z10) {
        int i3 = this.R1;
        hp s12 = hp.s1(i3);
        long j10 = this.S1;
        TLRPC.UserFull b22 = s12.b2(j10);
        TLObject e22 = hp.s1(i3).e2(j10);
        int i10 = 0;
        if (b22 != null && (e22 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) e22;
            user.premium = true;
            hp.s1(i3).X3(user, true, false);
            hs.f(i3).k(hs.E0, Long.valueOf(user.f27150id), b22);
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.f36105p1;
        if (d2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) d2Var.getParentActivity()).M().getFragmentStack());
            org.telegram.ui.ActionBar.q4 parentLayout = d2Var.getParentLayout();
            int size = arrayList.size();
            wm wmVar = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj;
                if (d2Var2 instanceof wm) {
                    wmVar = (wm) d2Var2;
                    if (wmVar.a() != j10) {
                        d2Var2.removeSelfFromStack();
                    }
                } else if (d2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == d2Var2) {
                        d2Var2.finishFragment();
                    } else {
                        d2Var2.removeSelfFromStack();
                    }
                }
            }
            if (wmVar == null || wmVar.a() != j10) {
                ((ActionBarLayout) parentLayout).T(new wm(a1.g.j(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void g1(boolean z10) {
        CharSequence charSequence;
        long j10;
        String str;
        m9 m9Var = this.W1;
        int i3 = this.R1;
        gi.d dVar = this.f583h2;
        if (m9Var != null) {
            int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
            if (this.W1.g(currentTime)) {
                int i10 = this.W1.d.auction_start_date - currentTime;
                dVar.i(bd.M0(2131750348, null), z10, true);
                dVar.g(bd.a0(null, null, 2131750343, bd.c0(i10)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.W1.f24180f;
            if (tL_starGiftAuctionState != null) {
                int i11 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.i(bd.M0(2131750353, null), z10, true);
                dVar.g(bd.a0(null, null, 2131750329, bd.c0(i11)), z10);
                return;
            }
            dVar.i(bd.M0(2131750353, null), z10, true);
            dVar.g(null, z10);
            return;
        }
        TL_stars.StarGift starGift = this.V1;
        wp[] wpVarArr = this.f591p2;
        if (starGift != null) {
            long j11 = e9.y(i3, false).p().amount;
            long j12 = starGift.stars;
            long j13 = 0;
            if (this.f586k2) {
                j10 = starGift.upgrade_stars;
            } else {
                j10 = 0;
            }
            long j14 = j12 + j10;
            if (!TextUtils.isEmpty(this.f588m2.getText())) {
                j13 = this.c2;
            }
            long j15 = j14 + j13;
            if (this.Q1) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            dVar.i(wb.Y0(false, bd.H(',', str, (int) j15), wpVarArr), z10, true);
            if (e9.y(i3, false).f5032e && j15 > j11) {
                dVar.g(bd.H(',', "Gift2SendYourBalance", (int) j11), z10);
                return;
            } else {
                dVar.g(null, z10);
                return;
            }
        }
        vg.j jVar = this.X1;
        if (jVar != null) {
            if (this.f587l2) {
                dVar.i(wb.U0(bd.a0(null, null, 2131750002, bd.E(jVar.g(), ',')), 1.0f, wpVarArr), z10, true);
                wpVarArr[0].H = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                dVar.i(new SpannableStringBuilder(bd.a0(null, null, 2131750003, jVar.c())), z10, true);
            }
            dVar.g(charSequence, z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.R1).c(this, hs.f23343y3);
    }

    @Override
    public final void onBackPressed() {
        x6 x6Var = this.f588m2;
        org.telegram.ui.Cells.f3 f3Var = x6Var.f29316b;
        org.telegram.ui.Cells.f3 f3Var2 = x6Var.f29316b;
        if (f3Var.getEmojiPadding() > 0) {
            f3Var2.k(true);
        } else if (f3Var2.f35196w) {
            f3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.R1).n(this, hs.f23343y3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            LinearLayout linearLayout = this.f582g2;
            if (linearLayout != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != w02) {
                        colorDrawable.setColor(w02);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(w02);
                    int i3 = this.f28618u0;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i3, 0, i3, 0));
                }
            }
            si.c cVar = this.f593r2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0));
                ViewGroup viewGroup = this.f28586b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        x6 x6Var = this.f588m2;
        if (x6Var != null) {
            x6Var.f29316b.s();
        }
        super.show();
    }

    @Override
    public final void v() {
        this.f36102l1.a0();
    }
}
