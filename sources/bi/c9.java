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
import c8.ma;
import di.pb;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.r9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
public class c9 extends sa implements gs, u9 {
    public final boolean T1;
    public final int U1;
    public final long V1;
    public final boolean W1;
    public final boolean X1;
    public final TL_stars.StarGift Y1;
    public r9 Z1;
    public final ug.j f3507a2;
    public final String f3508b2;
    public final Runnable f3509c2;
    public final v8 d2;
    public final LinearLayout f3510e2;
    public final long f3511f2;
    public final org.telegram.ui.Cells.v0 f3512g2;
    public final TLRPC.MessageAction f3513h2;
    public final gj f3514i2;
    public final LinearLayout f3515j2;
    public final hi.e f3516k2;
    public final FrameLayout f3517l2;
    public boolean f3518m2;
    public boolean f3519n2;
    public boolean f3520o2;
    public final w8 f3521p2;
    public c51 f3522q2;
    public int f3523r2;
    public final nq[] f3524s2;
    public boolean f3525t2;
    public final ui.c f3526u2;

    public c9(Context context, int i7, final TL_stars.StarGift starGift, final ug.j jVar, long j3, Runnable runnable, final boolean z10, final boolean z11) {
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
        this.f3519n2 = false;
        this.f3520o2 = false;
        this.f3523r2 = -2;
        this.f3524s2 = new nq[1];
        this.f3525t2 = false;
        boolean z13 = j3 == k10.i(i7).e();
        this.T1 = z13;
        this.N0 = 4;
        O();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-10.0f);
        if (z13) {
            this.f3518m2 = true;
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
            this.Z1 = v9.c(i7).l(starGift.f28663id, this);
        }
        this.f3507a2 = jVar;
        this.f3509c2 = runnable;
        this.W1 = z10;
        this.X1 = z11;
        if (z10) {
            this.f3519n2 = true;
        } else if (z11) {
            this.f3519n2 = false;
        }
        this.f39538v1 = 0.2f;
        if (j3 >= 0) {
            j10 = 0;
            this.f3508b2 = p10.l(np.u1(i7).c2(Long.valueOf(j3)));
        } else {
            j10 = 0;
            TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-j3));
            this.f3508b2 = O0 == null ? "" : O0.title;
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, this.J0, false);
        this.f3512g2 = v0Var;
        v0Var.setDelegate(new Object());
        v8 v8Var = new v8(this, context);
        this.d2 = v8Var;
        Drawable e10 = hi.v5.e(null, i7, j3, org.telegram.ui.ActionBar.m6.I.q());
        v8Var.U(e10);
        ui.c cVar = new ui.c();
        if (e10 instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e10).getColor());
        } else {
            if (e10 instanceof cb0) {
                cb0 cb0Var = (cb0) e10;
                if (cb0Var.f34161q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = cb0Var.f34143a;
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
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0);
        }
        cVar.a(w02);
        this.f3526u2 = num2 == null ? cVar : null;
        fh.g gVar = new fh.g(cVar, cVar, cVar);
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        int i13 = org.telegram.ui.ActionBar.m6.f29454h5;
        gVar.p(new gh.b(i13, h6Var));
        gVar.r(org.telegram.messenger.g0.L(20.0f));
        gVar.q(org.telegram.messenger.g0.L(f10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f3510e2 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            i11 = 6;
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f3513h2 = tL_messageActionStarGift;
            z12 = z13;
            i12 = i13;
        } else {
            boolean z14 = z13;
            i11 = 6;
            if (jVar != null && jVar.f58747b != null) {
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
                this.f3513h2 = tL_messageActionGiftCode;
            } else {
                z12 = z14;
                i12 = i13;
                if (jVar != null && jVar.f58746a != null) {
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
                    this.f3513h2 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.f3513h2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z15 = this.f3519n2;
            tL_messageActionStarGift2.can_upgrade = z15 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z15) ? starGift.upgrade_stars : j10;
            tL_messageActionStarGift2.convert_stars = z15 ? j10 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f28455id = 1;
        tL_messageService.dialog_id = j3;
        tL_messageService.from_id = np.u1(i7).B1(k10.i(i7).e());
        tL_messageService.peer_id = np.u1(i7).B1(j3);
        tL_messageService.action = this.f3513h2;
        long P1 = starGift != null ? np.u1(i7).P1(j3) : j10;
        this.f3511f2 = P1;
        gj gjVar = new gj(i7, tL_messageService, false, false);
        this.f3514i2 = gjVar;
        v0Var.i0(gjVar, true);
        linearLayout.addView(v0Var, ma.t(-1, -1, 119, 0, P1 > j10 ? 0 : 8, 0, 8));
        v8Var.addView(linearLayout, ma.e(-1, -1, 119));
        w8 w8Var = new w8(this, context, (du0) this.f30176b, hd.N0(starGift != null ? 2131750103 : 2131750102, null), np.u1(i7).G6, this.J0, gVar, i7);
        this.f3521p2 = w8Var;
        org.telegram.ui.Cells.g3 g3Var = w8Var.f30831b;
        g3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.k3());
        g3Var.R = true;
        w8Var.setShowLimitWhenNear(50);
        this.L1 = g3Var;
        w8Var.setShowLimitOnFocus(true);
        w8Var.setDivider(false);
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(w8Var, i10);
        g3Var.getEditText().setImeOptions(i11);
        g3Var.getEditText().setOnEditorActionListener(new m.r2(fVar, 1));
        int i14 = this.f30211u0;
        w8Var.setPadding(i14, 0, i14, 0);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f59194m = false;
        kVar.n(350L);
        kVar.o(nr.h);
        kVar.D = 40L;
        this.f39531o1.setItemAnimator(kVar);
        this.f3522q2.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f3515j2 = linearLayout2;
        linearLayout2.setOrientation(1);
        int i15 = i12;
        ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.m6.w0(i15, this.J0));
        int i16 = this.f30211u0;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i16, 0, i16, 0));
        int i17 = this.f30211u0;
        linearLayout2.setPadding(i17, 0, i17, 0);
        this.f30176b.addView(linearLayout2, ma.e(-1, -2, 87));
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.K5, view, this.J0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ma.z(-1.0f), ma.z(1.0f / org.telegram.messenger.g0.f24045p));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float i18 = Utilities.i(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i19 = org.telegram.ui.ActionBar.m6.f29324a7;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i19, this.J0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i19);
        org.telegram.ui.ActionBar.h6 h6Var2 = this.J0;
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var2);
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f3517l2 = frameLayout2;
            frameLayout2.addView(frameLayout, ma.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            org.telegram.ui.ActionBar.t6.h(i15, frameLayout2, this.J0);
        } else {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, ma.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f3517l2 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i20 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i20, this.J0);
        if (starGift != null) {
            textView.setText(hd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, ma.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        m10.setTextSize(1, 13.0f);
        m10.setGravity(21);
        m10.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(m10, i20, this.J0);
        if (starGift != null) {
            m10.setText(hd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(m10, ma.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View y8Var = new y8(context, starGift, i18);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i21 = org.telegram.ui.ActionBar.m6.Fi;
        Drawable d03 = org.telegram.ui.ActionBar.m6.d0(L2, org.telegram.ui.ActionBar.m6.w0(i21, this.J0));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i21);
        org.telegram.ui.ActionBar.h6 h6Var3 = this.J0;
        y8Var.setBackground(d03);
        org.telegram.ui.ActionBar.t6.j(y8Var, d03, M2, null, h6Var3);
        frameLayout.addView(y8Var, ma.e(-1, -1, 119));
        z8 z8Var = new z8(context, i18);
        z8Var.setWillNotDraw(false);
        frameLayout.addView(z8Var, ma.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(hd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        z8Var.addView(textView2, ma.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(hd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        z8Var.addView(textView3, ma.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        hi.e eVar = new hi.e(context, this.J0, true);
        this.f3516k2 = eVar;
        eVar.f();
        h1(false);
        linearLayout2.addView(eVar, ma.t(-1, 48, 119, 10, 10, 10, 10));
        eVar.setOnClickListener(new a0(this, j3, context, runnable, starGift));
        jg.b0 b0Var = this.n1;
        this.K1 = true;
        b0Var.k1(true);
        this.f3522q2.O(false);
        this.n1.h1(this.f3522q2.E.size(), org.telegram.messenger.g0.L(200.0f));
        ek0 ek0Var = this.f39531o1;
        int i22 = this.f30211u0;
        ek0Var.setPadding(i22, 0, i22, org.telegram.messenger.g0.L(68 + ((starGift != null && starGift.limited && this.f3517l2 == null) ? 40 : 0)));
        this.f39531o1.i(new a9(this));
        this.f39531o1.setOnItemClickListener(new qj0() {
            @Override
            public final void c(int i23, View view2) {
                boolean z16;
                long j11;
                TL_stars.StarGift starGift2;
                c9 c9Var = c9.this;
                TL_stars.StarGift starGift3 = c9Var.Y1;
                boolean z17 = c9Var.T1;
                org.telegram.ui.Cells.v0 v0Var2 = c9Var.f3512g2;
                TLRPC.MessageAction messageAction2 = c9Var.f3513h2;
                gj gjVar2 = c9Var.f3514i2;
                c51 c51Var = c9Var.f3522q2;
                if (!c9Var.K1) {
                    i23--;
                }
                o41 G = c51Var.G(i23);
                if (G != null) {
                    int i24 = G.d;
                    if (i24 == 1) {
                        boolean z18 = !c9Var.f3518m2;
                        c9Var.f3518m2 = z18;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z18;
                        }
                        gjVar2.a6();
                        v0Var2.i0(gjVar2, true);
                        c9Var.f3522q2.O(true);
                    } else if (i24 == 2) {
                        if (!z10 && !z11) {
                            boolean z19 = c9Var.f3519n2;
                            c9Var.f3519n2 = !z19;
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
                            v0Var2.i0(gjVar2, true);
                            c9Var.f3522q2.O(true);
                            c9Var.h1(true);
                            return;
                        }
                        int i25 = -c9Var.f3523r2;
                        c9Var.f3523r2 = i25;
                        org.telegram.messenger.g0.E3(i25, view2, null);
                    } else if (i24 == 3) {
                        boolean z20 = c9Var.f3520o2;
                        c9Var.f3520o2 = !z20;
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
                        v0Var2.i0(gjVar2, true);
                        c9Var.f3522q2.O(true);
                        c9Var.h1(true);
                    }
                }
            }
        });
        this.f39532p1.setTitle(P0());
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.f39531o1, getContext(), this.U1, 0, true, new o8(this, 0), this.J0);
        this.f3522q2 = c51Var;
        c51Var.f34062r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        int i7;
        if (this.T1) {
            i7 = 2131749921;
        } else {
            i7 = 2131749927;
        }
        return hd.N0(i7, null);
    }

    @Override
    public final void c(r9 r9Var) {
        this.Z1 = r9Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.A3) {
            h1(true);
            c51 c51Var = this.f3522q2;
            if (c51Var != null && this.f3507a2 != null) {
                c51Var.O(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        w8 w8Var = this.f3521p2;
        org.telegram.ui.Cells.g3 g3Var = w8Var.f30831b;
        org.telegram.ui.Cells.g3 g3Var2 = w8Var.f30831b;
        if (g3Var.getEmojiPadding() > 0) {
            g3Var2.k(true);
        } else if (g3Var2.f42542w) {
            g3Var2.d();
        } else {
            g3Var2.r();
            if (this.Z1 != null) {
                v9.c(this.U1).n(this.Z1.f26580b, this);
            }
            this.f3525t2 = true;
            super.dismiss();
        }
    }

    public final TLRPC.TL_textWithEntities e1() {
        if (np.u1(this.U1).P1(this.V1) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f3513h2;
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

    public lc f1() {
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T == null) {
            return null;
        }
        return lc.b0(T);
    }

    public final void g1(boolean z10) {
        int i7 = this.U1;
        np u12 = np.u1(i7);
        long j3 = this.V1;
        TLRPC.UserFull d2 = u12.d2(j3);
        TLObject g22 = np.u1(i7).g2(j3);
        int i10 = 0;
        if (d2 != null && (g22 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) g22;
            user.premium = true;
            np.u1(i7).e4(user, true, false);
            ls.f(i7).k(ls.E0, Long.valueOf(user.f28583id), d2);
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f39535s1;
        if (g2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) g2Var.getParentActivity()).M().getFragmentStack());
            org.telegram.ui.ActionBar.r4 parentLayout = g2Var.getParentLayout();
            int size = arrayList.size();
            bn bnVar = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj;
                if (g2Var2 instanceof bn) {
                    bnVar = (bn) g2Var2;
                    if (bnVar.a() != j3) {
                        g2Var2.removeSelfFromStack();
                    }
                } else if (g2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == g2Var2) {
                        g2Var2.finishFragment();
                    } else {
                        g2Var2.removeSelfFromStack();
                    }
                }
            }
            if (bnVar == null || bnVar.a() != j3) {
                ((ActionBarLayout) parentLayout).T(new bn(a8.p0.j(j3, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void h1(boolean z10) {
        CharSequence charSequence;
        long j3;
        String str;
        r9 r9Var = this.Z1;
        int i7 = this.U1;
        hi.e eVar = this.f3516k2;
        if (r9Var != null) {
            int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            if (this.Z1.g(currentTime)) {
                int i10 = this.Z1.d.auction_start_date - currentTime;
                eVar.i(hd.N0(2131750323, null), z10, true);
                eVar.g(hd.a0(null, null, 2131750318, hd.c0(i10)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.Z1.f26583f;
            if (tL_starGiftAuctionState != null) {
                int i11 = tL_starGiftAuctionState.end_date - currentTime;
                eVar.i(hd.N0(2131750328, null), z10, true);
                eVar.g(hd.a0(null, null, 2131750304, hd.c0(i11)), z10);
                return;
            }
            eVar.i(hd.N0(2131750328, null), z10, true);
            eVar.g(null, z10);
            return;
        }
        TL_stars.StarGift starGift = this.Y1;
        nq[] nqVarArr = this.f3524s2;
        if (starGift != null) {
            long j10 = di.y8.y(i7, false).p().amount;
            long j11 = starGift.stars;
            long j12 = 0;
            if (this.f3519n2) {
                j3 = starGift.upgrade_stars;
            } else {
                j3 = 0;
            }
            long j13 = j11 + j3;
            if (!TextUtils.isEmpty(this.f3521p2.getText())) {
                j12 = this.f3511f2;
            }
            long j14 = j13 + j12;
            if (this.T1) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            eVar.i(pb.Z0(false, hd.H(',', str, (int) j14), nqVarArr), z10, true);
            if (di.y8.y(i7, false).f10088e && j14 > j10) {
                eVar.g(hd.H(',', "Gift2SendYourBalance", (int) j10), z10);
                return;
            } else {
                eVar.g(null, z10);
                return;
            }
        }
        ug.j jVar = this.f3507a2;
        if (jVar != null) {
            if (this.f3520o2) {
                eVar.i(pb.U0(hd.a0(null, null, 2131749977, hd.E(jVar.g(), ',')), 1.0f, nqVarArr), z10, true);
                nqVarArr[0].H = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                eVar.i(new SpannableStringBuilder(hd.a0(null, null, 2131749978, jVar.c())), z10, true);
            }
            eVar.g(charSequence, z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(this.U1).c(this, ls.A3);
    }

    @Override
    public final void onBackPressed() {
        w8 w8Var = this.f3521p2;
        org.telegram.ui.Cells.g3 g3Var = w8Var.f30831b;
        org.telegram.ui.Cells.g3 g3Var2 = w8Var.f30831b;
        if (g3Var.getEmojiPadding() > 0) {
            g3Var2.k(true);
        } else if (g3Var2.f42542w) {
            g3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.U1).n(this, ls.A3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            LinearLayout linearLayout = this.f3515j2;
            if (linearLayout != null) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != w02) {
                        colorDrawable.setColor(w02);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(w02);
                    int i7 = this.f30211u0;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i7, 0, i7, 0));
                }
            }
            ui.c cVar = this.f3526u2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0));
                ViewGroup viewGroup = this.f30176b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        w8 w8Var = this.f3521p2;
        if (w8Var != null) {
            w8Var.f30831b.s();
        }
        super.show();
    }

    @Override
    public final void v() {
        this.f39531o1.a0();
    }
}
