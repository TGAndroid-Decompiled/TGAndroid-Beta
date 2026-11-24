package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lu4 extends fx0 {
    public static final int[] G1 = {21600, 43200, 86400, 129600, 172800, 259200};
    public nj A1;
    public int B1;
    public int C1;
    public final nna D1;
    public final cm2[] E1;
    public final cm2[] F1;
    public final ge0 l1;
    public final TL_stars.TL_starGiftUnique m1;
    public final String n1;
    public final long o1;
    public final xf5 p1;
    public final TextView q1;
    public final EditTextBoldCursor r1;
    public final TextView s1;
    public final TextView t1;
    public final TextView u1;
    public final u41 v1;
    public final hn w1;
    public final ImageView x1;
    public final ImageView y1;
    public final lj9 z1;

    public lu4(final int i, final long j, nna nnaVar, final wjb wjbVar, final Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(1, wjbVar, context, true);
        long j2;
        boolean z;
        byte b;
        TLRPC.User V1;
        lj9 lj9Var = new lj9((byte) 4);
        tg2[] tg2VarArr = (tg2[]) lj9Var.b;
        this.z1 = lj9Var;
        this.E1 = new cm2[1];
        this.F1 = new cm2[1];
        this.a = i;
        this.o1 = j;
        this.m1 = tL_starGiftUnique;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.n1 = ls6.m(tL_starGiftUnique.num, ',', sb);
        this.D1 = nnaVar;
        this.E = true;
        this.Q0 = true;
        int i2 = bkb.Z6;
        t0(i2);
        M(i2);
        this.b0 = i2;
        gta v = gta.v(i, true);
        if (!v.b) {
            z = false;
            j2 = 0;
        } else {
            a.t();
            if (!w01.a()) {
                a.q();
                TL_stars.StarsAmount m = v.m();
                j2 = 0;
                if (m.nanos == 0 && m.amount == 0) {
                    z = false;
                }
            } else {
                j2 = 0;
            }
            z = true;
        }
        if (j > j2 && na7.q1(i).W1(j) == null && (V1 = na7.q1(i).V1(Long.valueOf(j))) != null) {
            na7.q1(i).Z2(V1, 0, false, null);
        }
        gr grVar = na7.q1(i).k4;
        oj ojVar = oj.a;
        nj h = nj.h(tL_starGiftUnique.offer_min_stars, ojVar);
        boolean z2 = z;
        nj h2 = nj.h(Math.max(h.a() << 1, grVar.p.f()), ojVar);
        oj ojVar2 = oj.b;
        nj j3 = nj.j(Math.max(h.e(ojVar2).o(2).b, grVar.q.f()), ojVar2);
        nj j4 = nj.j(Math.max(j3.b << 1, grVar.r.f()), ojVar2);
        oj ojVar3 = h.a;
        if (ojVar3 != h2.a) {
            b = 4;
        } else {
            b = 4;
            tg2VarArr[ojVar3.ordinal()] = new tg2(h, h2, (byte) 4);
        }
        oj ojVar4 = j3.a;
        if (ojVar4 == j4.a) {
            tg2VarArr[ojVar4.ordinal()] = new tg2(j3, j4, b);
        }
        LinearLayout j5 = de9.j(context, 1);
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131749669, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(8388627);
        int i3 = bkb.F6;
        zkb.X(textView, i3, wjbVar);
        j5.addView(textView, nme.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.r1 = editTextBoldCursor;
        if (z2) {
            xf5 xf5Var = new xf5(context, wjbVar);
            this.p1 = xf5Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(k96.M0(2131744136, null));
            arrayList.add(k96.M0(2131744135, null));
            xf5Var.b(arrayList, new re1(this, (byte) 2));
            j5.addView(xf5Var, nme.k(16.0f, 0.0f, 16.0f, 14.0f, -1, -2));
        } else {
            this.p1 = null;
        }
        LinearLayout D0 = iq7.D0(context, wjbVar);
        j5.addView(D0, nme.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        this.q1 = textView2;
        ir2.t(textView2, 1, 15.0f);
        zkb.X(textView2, bkb.K6, wjbVar);
        D0.addView(textView2, nme.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        D0.addView(frameLayout, nme.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        this.x1 = imageView;
        imageView.setImageResource(2131232757);
        frameLayout.addView(imageView, nme.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.y1 = imageView2;
        imageView2.setImageResource(2131231961);
        frameLayout.addView(imageView2, nme.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        editTextBoldCursor.setCursorSize(gl.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        int i4 = bkb.n6;
        editTextBoldCursor.setCursorColor(bkb.v0(i4, wjbVar));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(bkb.v0(bkb.G6, wjbVar));
        zkb.X(editTextBoldCursor, i3, wjbVar);
        frameLayout.addView(editTextBoldCursor, nme.d(-1, -1.0f, 119, 50.0f, 0.0f, 120.0f, 0.0f));
        hn hnVar = new hn(context, false, false, false);
        this.w1 = hnVar;
        int i5 = bkb.x6;
        zkb.U(hnVar, i5, wjbVar);
        hnVar.setTextSize(gl.L(17.0f));
        hnVar.setGravity(5);
        frameLayout.addView(hnVar, nme.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.s1 = textView3;
        textView3.setTextSize(1, 14.0f);
        j5.addView(textView3, nme.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout D02 = iq7.D0(context, wjbVar);
        D02.setOrientation(0);
        D02.setGravity(16);
        j5.addView(D02, nme.k(12.0f, 20.0f, 12.0f, 0.0f, -1, 50));
        TextView textView4 = new TextView(context);
        tb4.u(16.0f, 2131749713, 1, textView4, null);
        zkb.X(textView4, i3, wjbVar);
        TextView m2 = ug8.m(D02, textView4, nme.q(0, -2, 1.0f, 16, 18, 0, 8, 0), context);
        this.t1 = m2;
        m2.setTextSize(1, 16.0f);
        m2.setGravity(16);
        m2.setCompoundDrawablePadding(gl.L(4.0f));
        zkb.X(m2, i4, wjbVar);
        D02.addView(m2, nme.t(-2, -1, 16, 0, 0, 14, 0));
        D02.setOnClickListener(new yj3(this, (byte) 22));
        TextView textView5 = new TextView(context);
        this.u1 = textView5;
        textView5.setTextSize(1, 14.0f);
        zkb.X(textView5, i5, wjbVar);
        j5.addView(textView5, nme.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        u41 i6 = yjb.i(24, wjbVar, context, true);
        this.v1 = i6;
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                nj njVar;
                final boolean z3;
                String a0;
                int i7;
                lu4 lu4Var;
                int i8;
                lu4 lu4Var2 = lu4.this;
                if (lu4Var2.v1.e0) {
                    int i9 = i;
                    if (na7.q1(i9).t2()) {
                        h5.b(i9);
                        return;
                    }
                    gta u = gta.u(i9, lu4Var2.A1.a);
                    if (u.e) {
                        njVar = nj.m(u.m());
                    } else {
                        njVar = null;
                    }
                    oj ojVar5 = oj.a;
                    oj ojVar6 = oj.b;
                    if (njVar != null) {
                        long j6 = njVar.b;
                        nj njVar2 = lu4Var2.A1;
                        if (j6 >= njVar2.b) {
                            String str = lu4Var2.n1;
                            long j7 = lu4Var2.o1;
                            String d = njVar2.d();
                            if (lu4Var2.A1.a == ojVar6) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            LinearLayout linearLayout = new LinearLayout(lu4Var2.getContext());
                            linearLayout.setOrientation(1);
                            TextView textView6 = new TextView(lu4Var2.getContext());
                            textView6.setText(k96.M0(2131749715, null));
                            int i10 = bkb.i5;
                            tb4.w(textView6, i10, lu4Var2.J0, 1, 20.0f);
                            linearLayout.addView(textView6, nme.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView7 = new TextView(lu4Var2.getContext());
                            zkb.X(textView7, i10, lu4Var2.J0);
                            textView7.setTextSize(1, 16.0f);
                            if (lu4Var2.A1.a == ojVar5) {
                                a0 = k96.a0(null, null, 2131749666, d, cf3.s(j7), str);
                            } else {
                                a0 = k96.a0(null, null, 2131749665, d, cf3.s(j7), str);
                            }
                            textView7.setText(gl.S2(a0));
                            linearLayout.addView(textView7, nme.t(-1, -2, 48, 24, 4, 24, 4));
                            mfb mfbVar = new mfb(lu4Var2.getContext(), lu4Var2.J0);
                            final long K1 = na7.q1(lu4Var2.a).K1(j7);
                            final nj h3 = nj.h(K1, ojVar5);
                            mfbVar.f(k96.M0(2131749687, null), jva.a1(z3, k96.a0(null, null, 2131749723, d), 0.8f, null), null, null);
                            int i11 = (K1 > 0L ? 1 : (K1 == 0L ? 0 : -1));
                            if (i11 > 0) {
                                i7 = 0;
                                mfbVar.f(k96.M0(2131749688, null), jva.a1(false, k96.a0(null, null, 2131749723, h3.d()), 0.8f, null), null, null);
                            } else {
                                i7 = 0;
                            }
                            mfbVar.f(k96.M0(2131749689, null), k96.G(lu4Var2.B1 / 3600, "GiftOfferHours", new Object[i7]), null, null);
                            linearLayout.addView(mfbVar, nme.t(-1, -2, 48, 23, 16, 23, 4));
                            z3a.B(lu4Var2.a);
                            final long D = z3a.D();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (i11 == 0) {
                                spannableStringBuilder.append((CharSequence) jva.U0(k96.a0(null, null, 2131749695, d), z3));
                                lu4Var = lu4Var2;
                                i8 = 0;
                            } else if (z3) {
                                spannableStringBuilder.append(k96.V(null, null, 2131749694, jva.U0(k96.a0(null, null, 2131749693, d), true), jva.S0(k96.a0(null, null, 2131749693, h3.d()))));
                                lu4Var = lu4Var2;
                                i8 = 0;
                            } else {
                                lu4Var = lu4Var2;
                                i8 = 0;
                                spannableStringBuilder.append((CharSequence) jva.S0(k96.a0(null, null, 2131749695, nj.j(lu4Var2.A1.b + h3.b, ojVar5).d())));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i8, lu4Var.J0, lu4Var.getContext());
                            alertDialog$Builder.n(linearLayout);
                            final lu4 lu4Var3 = lu4Var;
                            alertDialog$Builder.j(spannableStringBuilder, new ed() {
                                @Override
                                public final void u(hd hdVar, int i12) {
                                    nj njVar3;
                                    nj j8;
                                    long j9 = K1;
                                    int i13 = (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1));
                                    lu4 lu4Var4 = lu4.this;
                                    if (i13 > 0) {
                                        int i14 = lu4Var4.a;
                                        oj ojVar7 = oj.a;
                                        gta u2 = gta.u(i14, ojVar7);
                                        if (u2.e) {
                                            njVar3 = nj.m(u2.m());
                                        } else {
                                            njVar3 = null;
                                        }
                                        if (z3) {
                                            j8 = nj.h(j9, ojVar7);
                                        } else {
                                            j8 = nj.j(lu4Var4.A1.b + h3.b, ojVar7);
                                        }
                                        if (njVar3 == null || njVar3.b < j8.b) {
                                            new zua(lu4Var4.getContext(), lu4Var4.J0, j8.a(), 14, null, null, lu4Var4.o1).show();
                                            return;
                                        }
                                    }
                                    c01 g = hdVar.g(-1, true, true);
                                    g.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = lu4Var4.A1.q();
                                    tL_sendStarGiftOffer.peer = na7.q1(lu4Var4.a).h1(lu4Var4.o1);
                                    tL_sendStarGiftOffer.duration = lu4Var4.B1;
                                    tL_sendStarGiftOffer.slug = lu4Var4.m1.slug;
                                    tL_sendStarGiftOffer.random_id = D;
                                    if (i13 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j9;
                                    }
                                    ConnectionsManager.getInstance(lu4Var4.a).sendRequestTyped(tL_sendStarGiftOffer, new p(lu4Var4, g, hdVar, (byte) 11));
                                }
                            });
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.Y0 = true;
                            hdVar.show();
                            return;
                        }
                    }
                    nj njVar3 = lu4Var2.A1;
                    oj ojVar7 = njVar3.a;
                    Context context2 = context;
                    wjb wjbVar2 = wjbVar;
                    if (ojVar7 == ojVar5) {
                        new zua(context2, wjbVar2, njVar3.a(), 14, null, null, j).show();
                    } else if (ojVar7 == ojVar6) {
                        new xdb(context2, wjbVar2, njVar3, null).show();
                    }
                }
            }
        });
        j5.addView(i6, nme.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = j5;
        ge0 ge0Var = new ge0(i, wjbVar, context);
        this.l1 = ge0Var;
        ote.a(ge0Var);
        ge0Var.setOnClickListener(new hu4(this, context, wjbVar, (byte) 0));
        this.c.addView(ge0Var, nme.d(-2, -2.0f, 49, 0.0f, (gl.m / gl.p) + 8.0f, 0.0f, 0.0f));
        E0(nj.j(0L, ojVar), false, true, false);
        F0(86400, false);
        editTextBoldCursor.addTextChangedListener(new ku4(this));
    }

    public final void D0(boolean z) {
        boolean z2;
        if (this.C1 == 0 && this.A1.b > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        u41 u41Var = this.v1;
        if (u41Var.e0 != z2) {
            u41Var.setEnabled(z2);
            u41Var.setClickable(z2);
            float f = 0.6f;
            if (z) {
                ViewPropertyAnimator animate = u41Var.animate();
                if (z2) {
                    f = 1.0f;
                }
                ug8.s(animate, f, 180L);
                return;
            }
            if (z2) {
                f = 1.0f;
            }
            u41Var.setAlpha(f);
        }
    }

    public final void E0(nj njVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r16;
        int i;
        int i2;
        int i3;
        boolean z7;
        int i4;
        int i5;
        int i6;
        boolean z8;
        String E;
        cm2[] cm2VarArr;
        double d;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i7;
        nj njVar2 = njVar;
        oj ojVar = oj.a;
        oj ojVar2 = oj.b;
        nj njVar3 = this.A1;
        int i8 = this.C1;
        this.C1 = 0;
        if (njVar2 != null) {
            this.A1 = njVar2;
        } else {
            njVar2 = nj.j(0L, njVar3.a);
            this.A1 = njVar2;
            this.C1 |= 1;
        }
        long j = ((nj) ((tg2[]) this.z1.b)[njVar2.a.ordinal()].c).b;
        nj njVar4 = this.A1;
        if (j < njVar4.b) {
            this.C1 |= 4;
        }
        if (!njVar4.l() && ((nj) ((tg2[]) this.z1.b)[this.A1.a.ordinal()].b).b > this.A1.b) {
            this.C1 |= 2;
        }
        if (!z2 && njVar3.a == this.A1.a) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z2 && njVar3.b == this.A1.b) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z2 && i8 == this.C1) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z4) {
            ImageView imageView = this.y1;
            lj9 lj9Var = this.z1;
            TextView textView = this.u1;
            EditTextBoldCursor editTextBoldCursor = this.r1;
            xf5 xf5Var = this.p1;
            boolean z9 = false;
            if (xf5Var != null) {
                if (this.A1.a == ojVar) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                xf5Var.a(i7, z3);
            }
            String s = cf3.s(this.o1);
            oj ojVar3 = this.A1.a;
            if (ojVar3 == ojVar) {
                de9.r(null, null, 2131749712, new Object[]{s}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((nj) ((tg2[]) lj9Var.b)[this.A1.a.ordinal()].c).a()).length())});
            } else if (ojVar3 == ojVar2) {
                de9.r(null, null, 2131749711, new Object[]{s}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((nj) ((tg2[]) lj9Var.b)[this.A1.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView2 = this.x1;
            float f7 = 0.0f;
            if (z3) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.A1.a == ojVar) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f2);
                if (this.A1.a == ojVar) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f3);
                if (this.A1.a == ojVar) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                scaleX.scaleY(f4).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.A1.a == ojVar2) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f5);
                if (this.A1.a == ojVar2) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f6);
                if (this.A1.a == ojVar2) {
                    f7 = 1.0f;
                }
                scaleX2.scaleY(f7).setDuration(180L).start();
            } else {
                if (this.A1.a == ojVar) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                imageView2.setAlpha(f);
                if (this.A1.a == ojVar2) {
                    f7 = 1.0f;
                }
                imageView.setAlpha(f7);
            }
            ge0 ge0Var = this.l1;
            r16 = z9;
            if (ge0Var != null) {
                oj ojVar4 = this.A1.a;
                r16 = z9;
                if (ge0Var.e != ojVar4) {
                    ge0Var.e = ojVar4;
                    ge0Var.b();
                    r16 = z9;
                }
            }
        } else {
            r16 = 0;
        }
        if (z4 || z6) {
            if (this.A1.a == ojVar) {
                i = 2131749682;
            } else {
                i = 2131749674;
            }
            this.q1.setText(k96.M0(i, null));
            lj9 lj9Var2 = this.z1;
            String str = this.n1;
            TextView textView2 = this.s1;
            oj ojVar5 = this.A1.a;
            int i9 = this.C1;
            if ((i9 & 4) != 0) {
                if (ojVar5 == ojVar) {
                    i6 = 2131749680;
                } else {
                    i6 = 2131749672;
                }
                Object[] objArr = new Object[2];
                objArr[r16] = ((nj) ((tg2[]) lj9Var2.b)[ojVar5.ordinal()].c).o(2).d();
                objArr[1] = str;
                de9.r(null, null, i6, objArr, textView2);
            } else if ((i9 & 2) != 0) {
                if (ojVar5 == ojVar) {
                    i3 = 2131749679;
                } else {
                    i3 = 2131749671;
                }
                Object[] objArr2 = new Object[2];
                objArr2[r16] = ((nj) ((tg2[]) lj9Var2.b)[ojVar5.ordinal()].b).p().d();
                objArr2[1] = str;
                de9.r(null, null, i3, objArr2, textView2);
            } else {
                if (ojVar5 == ojVar) {
                    i2 = 2131749681;
                } else {
                    i2 = 2131749673;
                }
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                de9.r(null, null, i2, objArr3, textView2);
            }
            if ((this.C1 & (-9)) != 0) {
                z7 = true;
            } else {
                z7 = r16;
            }
            if (z7) {
                i4 = bkb.p7;
            } else {
                i4 = bkb.x6;
            }
            zkb.X(textView2, i4, this.J0);
            EditTextBoldCursor editTextBoldCursor2 = this.r1;
            if (z7) {
                i5 = bkb.p7;
            } else {
                i5 = bkb.F6;
            }
            zkb.X(editTextBoldCursor2, i5, this.J0);
        }
        if (z4 || z5 || z6) {
            nj njVar5 = this.A1;
            if (njVar5.a == ojVar2) {
                z8 = true;
            } else {
                z8 = r16;
            }
            u41 u41Var = this.v1;
            if (z8) {
                E = njVar5.b();
            } else {
                E = k96.E(njVar5.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[r16] = E;
            String a0 = k96.a0(null, null, 2131749716, objArr4);
            if (z8) {
                cm2VarArr = this.F1;
            } else {
                cm2VarArr = this.E1;
            }
            u41Var.i(jva.s1(jva.Y0(z8, a0, cm2VarArr), z8), z3, true);
            D0(z3);
        }
        if (z4 || z5) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            oj ojVar6 = this.A1.a;
            int i10 = this.a;
            if (ojVar6 == ojVar2) {
                d = na7.q1(i10).k4.k.i;
            } else {
                d = na7.q1(i10).k4.s3.i * 1.0E-5d;
            }
            ci0.h();
            sb.append(ci0.f("USD", 2, (long) (this.A1.c() * d * 100.0d), r16));
            this.w1.c(sb, z3, true);
        }
        if (z && z5) {
            String b = this.A1.b();
            this.r1.setText(b);
            this.r1.setSelection(b.length());
        }
    }

    public final void F0(int i, boolean z) {
        if (this.B1 != i) {
            this.B1 = i;
            String G = k96.G(i / 3600, "GiftOfferHours", new Object[0]);
            TextView textView = this.t1;
            textView.setText(G);
            Drawable mutate = getContext().getResources().getDrawable(2131230873).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.n6, this.J0), PorterDuff.Mode.SRC_IN));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
        }
        D0(z);
    }

    @Override
    public final void show() {
        super.show();
        gl.d3(new iu4(this, (byte) 0), 50L);
    }
}
