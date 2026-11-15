package bi;

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
import di.lb;
import di.u8;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.r9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
public class u6 extends ja implements is, u9 {
    public final boolean T1;
    public final int U1;
    public final long V1;
    public final boolean W1;
    public final boolean X1;
    public final TL_stars.StarGift Y1;
    public r9 Z1;
    public final ug.j f3907a2;
    public final String f3908b2;
    public final Runnable f3909c2;
    public final n6 d2;
    public final LinearLayout f3910e2;
    public final long f3911f2;
    public final org.telegram.ui.Cells.t0 f3912g2;
    public final TLRPC.MessageAction f3913h2;
    public final gj f3914i2;
    public final LinearLayout f3915j2;
    public final hi.d f3916k2;
    public final FrameLayout f3917l2;
    public boolean f3918m2;
    public boolean f3919n2;
    public boolean f3920o2;
    public final o6 f3921p2;
    public p41 f3922q2;
    public int f3923r2;
    public final eq[] f3924s2;
    public boolean f3925t2;
    public final ui.c f3926u2;

    public u6(Context context, int i7, final TL_stars.StarGift starGift, final ug.j jVar, long j3, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        int i10;
        float f10;
        long j10;
        Integer num;
        Integer num2;
        int w02;
        int i11;
        boolean z12;
        int i12;
        this.f3919n2 = false;
        this.f3920o2 = false;
        this.f3923r2 = -2;
        this.f3924s2 = new eq[1];
        this.f3925t2 = false;
        boolean z13 = j3 == m10.i(i7).e();
        this.T1 = z13;
        this.N0 = 4;
        O();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-10.0f);
        if (z13) {
            this.f3918m2 = true;
        }
        this.U1 = i7;
        this.V1 = j3;
        this.Y1 = starGift;
        if (starGift == null || !starGift.auction) {
            i10 = 4;
            f10 = 4.0f;
        } else {
            i10 = 4;
            f10 = 4.0f;
            this.Z1 = v9.c(i7).l(starGift.f28280id, this);
        }
        this.f3907a2 = jVar;
        this.f3909c2 = runnable;
        this.W1 = z10;
        this.X1 = z11;
        if (z10) {
            this.f3919n2 = true;
        } else if (z11) {
            this.f3919n2 = false;
        }
        this.f35938v1 = 0.2f;
        if (j3 >= 0) {
            j10 = 0;
            this.f3908b2 = q10.k(np.s1(i7).a2(Long.valueOf(j3)));
        } else {
            j10 = 0;
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
            this.f3908b2 = M0 == null ? "" : M0.title;
        }
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, this.J0, false);
        this.f3912g2 = t0Var;
        t0Var.setDelegate(new Object());
        n6 n6Var = new n6(this, context);
        this.d2 = n6Var;
        Drawable e10 = hi.x5.e(null, i7, j3, org.telegram.ui.ActionBar.j6.I.q());
        n6Var.U(e10);
        ui.c cVar = new ui.c();
        if (e10 instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e10).getColor());
        } else {
            if (e10 instanceof ra0) {
                ra0 ra0Var = (ra0) e10;
                if (ra0Var.f38929q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = ra0Var.f38911a;
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
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0);
        }
        cVar.a(w02);
        this.f3926u2 = num2 == null ? cVar : null;
        fh.g gVar = new fh.g(cVar, cVar, cVar);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        int i13 = org.telegram.ui.ActionBar.j6.f28922h5;
        gVar.p(new gh.b(i13, e6Var));
        gVar.r(org.telegram.messenger.g0.L(20.0f));
        gVar.q(org.telegram.messenger.g0.L(f10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f3910e2 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            i11 = 6;
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f3913h2 = tL_messageActionStarGift;
            z12 = z13;
            i12 = i13;
        } else {
            boolean z14 = z13;
            i11 = 6;
            if (jVar != null && jVar.f58125b != null) {
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
                    i12 = i13;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftCode.currency) - 6) * e11);
                } else {
                    i12 = i13;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.f3913h2 = tL_messageActionGiftCode;
            } else {
                z12 = z14;
                i12 = i13;
                if (jVar != null && jVar.f58124a != null) {
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
                    this.f3913h2 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.f3913h2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z15 = this.f3919n2;
            tL_messageActionStarGift2.can_upgrade = z15 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z15) ? starGift.upgrade_stars : j10;
            tL_messageActionStarGift2.convert_stars = z15 ? j10 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f28072id = 1;
        tL_messageService.dialog_id = j3;
        tL_messageService.from_id = np.s1(i7).z1(m10.i(i7).e());
        tL_messageService.peer_id = np.s1(i7).z1(j3);
        tL_messageService.action = this.f3913h2;
        long N1 = starGift != null ? np.s1(i7).N1(j3) : j10;
        this.f3911f2 = N1;
        gj gjVar = new gj(i7, tL_messageService, false, false);
        this.f3914i2 = gjVar;
        t0Var.h0(gjVar, true);
        linearLayout.addView(t0Var, c8.ja.t(-1, -1, 119, 0, N1 > j10 ? 0 : 8, 0, 8));
        n6Var.addView(linearLayout, c8.ja.e(-1, -1, 119));
        o6 o6Var = new o6(this, context, (st0) this.f29682b, hd.M0(starGift != null ? 2131750120 : 2131750119, null), np.s1(i7).E6, this.J0, gVar, i7);
        this.f3921p2 = o6Var;
        org.telegram.ui.Cells.f3 f3Var = o6Var.f30375b;
        f3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.j3());
        f3Var.R = true;
        o6Var.setShowLimitWhenNear(50);
        this.L1 = f3Var;
        o6Var.setShowLimitOnFocus(true);
        o6Var.setDivider(false);
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(o6Var, i10);
        f3Var.getEditText().setImeOptions(i11);
        f3Var.getEditText().setOnEditorActionListener(new m.r2(fVar, 1));
        int i14 = this.f29717u0;
        o6Var.setPadding(i14, 0, i14, 0);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f58564m = false;
        kVar.n(350L);
        kVar.o(er.h);
        kVar.D = 40L;
        this.f35931o1.setItemAnimator(kVar);
        this.f3922q2.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f3915j2 = linearLayout2;
        linearLayout2.setOrientation(1);
        int i15 = i12;
        ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(i15, this.J0));
        int i16 = this.f29717u0;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i16, 0, i16, 0));
        int i17 = this.f29717u0;
        linearLayout2.setPadding(i17, 0, i17, 0);
        this.f29682b.addView(linearLayout2, c8.ja.e(-1, -2, 87));
        View view = new View(context);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.K5, view, this.J0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c8.ja.z(-1.0f), c8.ja.z(1.0f / org.telegram.messenger.g0.f23610p));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float i18 = Utilities.i(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i19 = org.telegram.ui.ActionBar.j6.f28792a7;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i19, this.J0));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i19);
        org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(frameLayout, d02, M, null, e6Var2);
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f3917l2 = frameLayout2;
            frameLayout2.addView(frameLayout, c8.ja.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            org.telegram.ui.ActionBar.q6.h(i15, frameLayout2, this.J0);
        } else {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, c8.ja.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f3917l2 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i20 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i20, this.J0);
        if (starGift != null) {
            textView.setText(hd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView, c8.ja.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        k10.setTextSize(1, 13.0f);
        k10.setGravity(21);
        k10.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.U(k10, i20, this.J0);
        if (starGift != null) {
            k10.setText(hd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(k10, c8.ja.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View q6Var = new q6(context, starGift, i18);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i21 = org.telegram.ui.ActionBar.j6.Fi;
        Drawable d03 = org.telegram.ui.ActionBar.j6.d0(L2, org.telegram.ui.ActionBar.j6.w0(i21, this.J0));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i21);
        org.telegram.ui.ActionBar.e6 e6Var3 = this.J0;
        q6Var.setBackground(d03);
        org.telegram.ui.ActionBar.q6.j(q6Var, d03, M2, null, e6Var3);
        frameLayout.addView(q6Var, c8.ja.e(-1, -1, 119));
        r6 r6Var = new r6(context, i18);
        r6Var.setWillNotDraw(false);
        frameLayout.addView(r6Var, c8.ja.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(hd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        r6Var.addView(textView2, c8.ja.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(hd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        r6Var.addView(textView3, c8.ja.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        hi.d dVar = new hi.d(context, this.J0, true);
        this.f3916k2 = dVar;
        dVar.f();
        g1(false);
        linearLayout2.addView(dVar, c8.ja.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new a0(this, j3, context, runnable, starGift));
        jg.b0 b0Var = this.n1;
        this.K1 = true;
        b0Var.k1(true);
        this.f3922q2.O(false);
        this.n1.h1(this.f3922q2.E.size(), org.telegram.messenger.g0.L(200.0f));
        uj0 uj0Var = this.f35931o1;
        int i22 = this.f29717u0;
        uj0Var.setPadding(i22, 0, i22, org.telegram.messenger.g0.L(68 + ((starGift != null && starGift.limited && this.f3917l2 == null) ? 40 : 0)));
        this.f35931o1.i(new s6(this));
        this.f35931o1.setOnItemClickListener(new gj0() {
            @Override
            public final void b(int i23, View view2) {
                boolean z16;
                long j11;
                TL_stars.StarGift starGift2;
                u6 u6Var = u6.this;
                TL_stars.StarGift starGift3 = u6Var.Y1;
                boolean z17 = u6Var.T1;
                org.telegram.ui.Cells.t0 t0Var2 = u6Var.f3912g2;
                TLRPC.MessageAction messageAction2 = u6Var.f3913h2;
                gj gjVar2 = u6Var.f3914i2;
                p41 p41Var = u6Var.f3922q2;
                if (!u6Var.K1) {
                    i23--;
                }
                b41 G = p41Var.G(i23);
                if (G != null) {
                    int i24 = G.d;
                    if (i24 == 1) {
                        boolean z18 = !u6Var.f3918m2;
                        u6Var.f3918m2 = z18;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z18;
                        }
                        gjVar2.a6();
                        t0Var2.h0(gjVar2, true);
                        u6Var.f3922q2.O(true);
                    } else if (i24 == 2) {
                        if (!z10 && !z11) {
                            boolean z19 = u6Var.f3919n2;
                            u6Var.f3919n2 = !z19;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                                if (z19 && (!z17 || (starGift2 = starGift) == null || !starGift2.can_upgrade)) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                                tL_messageActionStarGift3.can_upgrade = z16;
                                long j12 = 0;
                                if (z17 || z19) {
                                    j11 = 0;
                                } else {
                                    j11 = starGift3.upgrade_stars;
                                }
                                tL_messageActionStarGift3.upgrade_stars = j11;
                                if (z19) {
                                    j12 = starGift3.convert_stars;
                                }
                                tL_messageActionStarGift3.convert_stars = j12;
                            }
                            gjVar2.a6();
                            t0Var2.h0(gjVar2, true);
                            u6Var.f3922q2.O(true);
                            u6Var.g1(true);
                            return;
                        }
                        int i25 = -u6Var.f3923r2;
                        u6Var.f3923r2 = i25;
                        org.telegram.messenger.g0.F3(i25, view2, null);
                    } else if (i24 == 3) {
                        boolean z20 = u6Var.f3920o2;
                        u6Var.f3920o2 = !z20;
                        boolean z21 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                        ug.j jVar2 = jVar;
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
                        gjVar2.a6();
                        t0Var2.h0(gjVar2, true);
                        u6Var.f3922q2.O(true);
                        u6Var.g1(true);
                    }
                }
            }
        });
        this.f35932p1.setTitle(O0());
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35931o1, getContext(), this.U1, 0, true, new f6(this, 0), this.J0);
        this.f3922q2 = p41Var;
        p41Var.f38199r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        if (this.T1) {
            i7 = 2131749938;
        } else {
            i7 = 2131749944;
        }
        return hd.M0(i7, null);
    }

    @Override
    public final void c(r9 r9Var) {
        this.Z1 = r9Var;
    }

    public final TLRPC.TL_textWithEntities d1() {
        if (np.s1(this.U1).N1(this.V1) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f3913h2;
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
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25611y3) {
            g1(true);
            p41 p41Var = this.f3922q2;
            if (p41Var != null && this.f3907a2 != null) {
                p41Var.O(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        o6 o6Var = this.f3921p2;
        org.telegram.ui.Cells.f3 f3Var = o6Var.f30375b;
        org.telegram.ui.Cells.f3 f3Var2 = o6Var.f30375b;
        if (f3Var.getEmojiPadding() > 0) {
            f3Var2.k(true);
        } else if (f3Var2.f39061w) {
            f3Var2.d();
        } else {
            f3Var2.r();
            if (this.Z1 != null) {
                v9.c(this.U1).n(this.Z1.f26267b, this);
            }
            this.f3925t2 = true;
            super.dismiss();
        }
    }

    public cc e1() {
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == null) {
            return null;
        }
        return cc.a0(T);
    }

    public final void f1(boolean z10) {
        int i7 = this.U1;
        np s12 = np.s1(i7);
        long j3 = this.V1;
        TLRPC.UserFull b22 = s12.b2(j3);
        TLObject e22 = np.s1(i7).e2(j3);
        int i10 = 0;
        if (b22 != null && (e22 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) e22;
            user.premium = true;
            np.s1(i7).X3(user, true, false);
            ns.f(i7).k(ns.E0, Long.valueOf(user.f28200id), b22);
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.f35935s1;
        if (e2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) e2Var.getParentActivity()).M().getFragmentStack());
            org.telegram.ui.ActionBar.o4 parentLayout = e2Var.getParentLayout();
            int size = arrayList.size();
            an anVar = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj;
                if (e2Var2 instanceof an) {
                    anVar = (an) e2Var2;
                    if (anVar.a() != j3) {
                        e2Var2.removeSelfFromStack();
                    }
                } else if (e2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == e2Var2) {
                        e2Var2.finishFragment();
                    } else {
                        e2Var2.removeSelfFromStack();
                    }
                }
            }
            if (anVar == null || anVar.a() != j3) {
                ((ActionBarLayout) parentLayout).T(new an(a8.p0.j(j3, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void g1(boolean z10) {
        CharSequence charSequence;
        long j3;
        String str;
        r9 r9Var = this.Z1;
        int i7 = this.U1;
        hi.d dVar = this.f3916k2;
        if (r9Var != null) {
            int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            if (this.Z1.g(currentTime)) {
                int i10 = this.Z1.d.auction_start_date - currentTime;
                dVar.i(hd.M0(2131750340, null), z10, true);
                dVar.g(hd.a0(null, null, 2131750335, hd.c0(i10)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.Z1.f26270f;
            if (tL_starGiftAuctionState != null) {
                int i11 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.i(hd.M0(2131750345, null), z10, true);
                dVar.g(hd.a0(null, null, 2131750321, hd.c0(i11)), z10);
                return;
            }
            dVar.i(hd.M0(2131750345, null), z10, true);
            dVar.g(null, z10);
            return;
        }
        TL_stars.StarGift starGift = this.Y1;
        eq[] eqVarArr = this.f3924s2;
        if (starGift != null) {
            long j10 = u8.y(i7, false).p().amount;
            long j11 = starGift.stars;
            long j12 = 0;
            if (this.f3919n2) {
                j3 = starGift.upgrade_stars;
            } else {
                j3 = 0;
            }
            long j13 = j11 + j3;
            if (!TextUtils.isEmpty(this.f3921p2.getText())) {
                j12 = this.f3911f2;
            }
            long j14 = j13 + j12;
            if (this.T1) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            dVar.i(lb.Y0(false, hd.H(',', str, (int) j14), eqVarArr), z10, true);
            if (u8.y(i7, false).f9532e && j14 > j10) {
                dVar.g(hd.H(',', "Gift2SendYourBalance", (int) j10), z10);
                return;
            } else {
                dVar.g(null, z10);
                return;
            }
        }
        ug.j jVar = this.f3907a2;
        if (jVar != null) {
            if (this.f3920o2) {
                dVar.i(lb.U0(hd.a0(null, null, 2131749994, hd.E(jVar.g(), ',')), 1.0f, eqVarArr), z10, true);
                eqVarArr[0].H = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                dVar.i(new SpannableStringBuilder(hd.a0(null, null, 2131749995, jVar.c())), z10, true);
            }
            dVar.g(charSequence, z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.U1).c(this, ns.f25611y3);
    }

    @Override
    public final void onBackPressed() {
        o6 o6Var = this.f3921p2;
        org.telegram.ui.Cells.f3 f3Var = o6Var.f30375b;
        org.telegram.ui.Cells.f3 f3Var2 = o6Var.f30375b;
        if (f3Var.getEmojiPadding() > 0) {
            f3Var2.k(true);
        } else if (f3Var2.f39061w) {
            f3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.U1).n(this, ns.f25611y3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            LinearLayout linearLayout = this.f3915j2;
            if (linearLayout != null) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != w02) {
                        colorDrawable.setColor(w02);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(w02);
                    int i7 = this.f29717u0;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i7, 0, i7, 0));
                }
            }
            ui.c cVar = this.f3926u2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0));
                ViewGroup viewGroup = this.f29682b;
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
        o6 o6Var = this.f3921p2;
        if (o6Var != null) {
            o6Var.f30375b.s();
        }
        super.show();
    }

    @Override
    public final void v() {
        this.f35931o1.a0();
    }
}
