package defpackage;

import android.app.Activity;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class tm1 implements View.OnClickListener {
    public final byte a;
    public final yv1 b;

    public tm1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void onClick(View view) {
        yv1 yv1Var;
        int i;
        k47 k47Var = null;
        String str = null;
        int i2 = 0;
        boolean z = true;
        switch (this.a) {
            case 0:
                yv1 yv1Var2 = this.b;
                i46.n1(yv1Var2, yv1Var2.S1, yv1Var2.T1, yv1Var2.l6, false);
                return;
            case 1:
                yv1 yv1Var3 = this.b;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", yv1Var3.r);
                yv1Var3.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                yv1 yv1Var4 = this.b;
                if (yv1Var4.Z3 != null) {
                    yv1Var4.nc(!yv1Var4.rd.f);
                    return;
                }
                return;
            case 3:
                this.b.Ib(!yv1Var.D0.O);
                return;
            case 4:
                yv1 yv1Var5 = this.b;
                es1 es1Var = yv1Var5.X1;
                if (es1Var != null) {
                    es1Var.setReversed(true);
                    yv1Var5.X1.getAdapter().l0 = true;
                    yv1Var5.z5();
                }
                yv1Var5.h3.setVisibility(8);
                yv1Var5.i3.setVisibility(8);
                yv1Var5.C3 = true;
                yv1Var5.D3 = null;
                yv1Var5.E3 = null;
                yv1Var5.k0.setSearchFieldHint(jb6.M0(2131745491, null));
                yv1Var5.k0.setSearchFieldCaption(jb6.M0(2131745500, null));
                gm.E3(yv1Var5.k0.getSearchField());
                yv1Var5.k0.o();
                return;
            case 5:
                yv1 yv1Var6 = this.b;
                if (yv1Var6.getParentActivity() != null) {
                    r7 r7Var = yv1Var6.k0;
                    if (r7Var != null) {
                        gm.t1(r7Var.getSearchField());
                    }
                    yv1Var6.showDialog((my0) ik.o(yv1Var6.getParentActivity(), new ht1(yv1Var6), yv1Var6.Ba).b);
                    return;
                }
                return;
            case 6:
                this.b.N5(true);
                return;
            case 7:
                yv1 yv1Var7 = this.b;
                k47 k47Var2 = yv1Var7.v5;
                if (k47Var2 != null) {
                    yv1Var7.Y9(k47Var2, false, false);
                    l11.t(yv1Var7.getParentActivity(), Uri.parse(yv1Var7.v5.T0), true, false, false, null, null, false, yv1Var7.getMessagesController().l4.A2.f, false, false);
                    return;
                }
                return;
            case 8:
                yv1 yv1Var8 = this.b;
                if (gm.g(yv1Var8.v5.W0)) {
                    new c41(n21.a(yv1Var8.getParentActivity()), yv1Var8.Ba).i(jb6.M0(2131743879, null)).j();
                    return;
                }
                return;
            case 9:
                yv1 yv1Var9 = this.b;
                if (gm.g(yv1Var9.v5.X0)) {
                    new c41(n21.a(yv1Var9.getParentActivity()), yv1Var9.Ba).i(jb6.M0(2131743879, null)).j();
                    return;
                }
                return;
            case 10:
                yv1 yv1Var10 = this.b;
                if (yv1Var10.m1 != null && yv1Var10.getParentActivity() != null) {
                    my0 h = hg9.h(1, null, yv1Var10.m1.getContext(), false);
                    Activity parentActivity = yv1Var10.getParentActivity();
                    wv1 wv1Var = yv1Var10.Ba;
                    final ct8 ct8Var = new ct8(parentActivity, (byte) 10);
                    LinearLayout l = td4.l(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(jb6.M0(2131744943, null));
                    textView.setTypeface(gm.o());
                    int i3 = cmb.F6;
                    anb.X(textView, i3, wv1Var);
                    textView.setTextSize(1, 20.0f);
                    l66 l66Var = new l66(parentActivity, wv1Var);
                    l66Var.setText(gm.H2(jb6.N0("SponsoredMessageInfo2Description1"), wv1Var, null));
                    anb.G(l66Var, cmb.Wc, wv1Var);
                    anb.X(l66Var, i3, wv1Var);
                    l66Var.setTextSize(1, 14.0f);
                    l66Var.setLineSpacing(gm.L(2.0f), 1.0f);
                    l66Var.setOnLinkPressListener(new k66() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            byte b = r2;
                            ct8 ct8Var2 = ct8Var;
                            switch (b) {
                                case 0:
                                    clickableSpan.onClick(ct8Var2);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ct8Var2);
                                    return;
                                default:
                                    clickableSpan.onClick(ct8Var2);
                                    return;
                            }
                        }
                    });
                    l66 l66Var2 = new l66(parentActivity, null);
                    l66Var2.setText(gm.H2(jb6.N0("SponsoredMessageInfo2Description2"), wv1Var, null));
                    anb.X(l66Var2, i3, wv1Var);
                    l66Var2.setTextSize(1, 14.0f);
                    l66Var2.setLineSpacing(gm.L(2.0f), 1.0f);
                    l66Var2.setOnLinkPressListener(new k66() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            byte b = r2;
                            ct8 ct8Var2 = ct8Var;
                            switch (b) {
                                case 0:
                                    clickableSpan.onClick(ct8Var2);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ct8Var2);
                                    return;
                                default:
                                    clickableSpan.onClick(ct8Var2);
                                    return;
                            }
                        }
                    });
                    l66 l66Var3 = new l66(parentActivity, null);
                    l66Var3.setText(gm.H2(jb6.N0("SponsoredMessageInfo2Description3"), wv1Var, null));
                    anb.X(l66Var3, i3, wv1Var);
                    l66Var3.setTextSize(1, 14.0f);
                    l66Var3.setLineSpacing(gm.L(2.0f), 1.0f);
                    l66Var3.setOnLinkPressListener(new k66() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            byte b = r2;
                            ct8 ct8Var2 = ct8Var;
                            switch (b) {
                                case 0:
                                    clickableSpan.onClick(ct8Var2);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ct8Var2);
                                    return;
                                default:
                                    clickableSpan.onClick(ct8Var2);
                                    return;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i4 = cmb.Ei;
                    paint.setColor(cmb.v0(i4, wv1Var));
                    paint.setStrokeWidth(gm.L(1.0f));
                    ey0 ey0Var = new ey0(parentActivity, paint);
                    ey0Var.setOnClickListener(new g6(parentActivity, (byte) 15));
                    ey0Var.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
                    ey0Var.setText(jb6.M0(2131744944, null));
                    anb.X(ey0Var, i4, wv1Var);
                    int i5 = cmb.g5;
                    fg0 e = ulb.e(cmb.v0(i5, wv1Var), 4.0f);
                    wmb M = anb.M(i5);
                    wmb e2 = anb.e(i5);
                    ey0Var.setBackground(e);
                    anb.j(ey0Var, e, M, e2, wv1Var);
                    ey0Var.setTextSize(1, 14.0f);
                    ey0Var.setGravity(16);
                    l66 l66Var4 = new l66(parentActivity, null);
                    l66Var4.setText(gm.H2(jb6.N0("SponsoredMessageInfo2Description4"), wv1Var, null));
                    l66Var4.setLineSpacing(gm.L(2.0f), 1.0f);
                    anb.X(l66Var4, i3, wv1Var);
                    l66Var4.setTextSize(1, 14.0f);
                    textView.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
                    l.addView(textView);
                    l66Var.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
                    l.addView(l66Var, qoe.t(-1, -2, 0, 0, 18, 0, 0));
                    l66Var2.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
                    l.addView(l66Var2, qoe.t(-1, -2, 0, 0, 24, 0, 0));
                    l66Var3.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
                    l.addView(l66Var3, qoe.t(-1, -2, 0, 0, 24, 0, 0));
                    l.addView(ey0Var, qoe.t(-2, 34, 1, 22, 14, 22, 0));
                    l66Var4.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
                    l.addView(l66Var4, qoe.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(ct8Var.getContext());
                    scrollView.addView(l);
                    ct8Var.addView(scrollView, qoe.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    h.O = ct8Var;
                    h.show();
                    return;
                }
                return;
            case 11:
                this.b.finishPreviewFragment();
                return;
            case 12:
                yv1 yv1Var11 = this.b;
                yv1Var11.showDialog(new kj8((d) yv1Var11, 28, true));
                return;
            case 13:
                yv1 yv1Var12 = this.b;
                long j = yv1Var12.l6;
                TLRPC.User user = yv1Var12.f;
                TLRPC.Chat chat = yv1Var12.e;
                TLRPC.EncryptedChat encryptedChat = yv1Var12.h;
                if (yv1Var12.c2.getTag(2131296587) == null) {
                    z = false;
                }
                ik.g0(yv1Var12, j, user, chat, encryptedChat, z, yv1Var12.r8, new oo1(yv1Var12, (byte) 2), yv1Var12.Ba);
                return;
            case 14:
                this.b.y8();
                return;
            case 15:
                yv1 yv1Var13 = this.b;
                if (yv1Var13.r4 != null) {
                    qwb qwbVar = yv1Var13.getMessagesController().g4;
                    long j2 = yv1Var13.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = yv1Var13.r4;
                    int i6 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    qwbVar.z(i6, j2, false);
                }
                yv1Var13.Ad();
                yv1Var13.Pc(false);
                yv1Var13.zd(true);
                return;
            case 16:
                yv1 yv1Var14 = this.b;
                long j3 = yv1Var14.l6;
                if (yv1Var14.h != null) {
                    j3 = yv1Var14.f.id;
                }
                yv1Var14.Mc = false;
                yv1Var14.getMessagesController().e2(j3, yv1Var14.f, yv1Var14.e);
                yv1Var14.zd(true);
                yv1Var14.Wc(true);
                return;
            case 17:
                yv1 yv1Var15 = this.b;
                yv1Var15.R4 = true;
                if (yv1Var15.j8() && !yv1Var15.x4) {
                    yv1Var15.J((int) yv1Var15.s4, 0, 0, 0, true, true);
                    return;
                }
                int i7 = yv1Var15.Z4;
                if (i7 != 0) {
                    if (!yv1Var15.V4.isEmpty()) {
                        if (i7 == ((Integer) b10.f(1, yv1Var15.V4)).intValue()) {
                            i2 = ((Integer) yv1Var15.V4.get(0)).intValue() + 1;
                            yv1Var15.c5 = true;
                        } else {
                            yv1Var15.c5 = false;
                            i2 = i7 - 1;
                        }
                    }
                    yv1Var15.b5 = i2;
                    if (!yv1Var15.c5) {
                        i2 = -i2;
                    }
                    yv1Var15.J(i7, 0, 0, i2, true, true);
                    yv1Var15.cd();
                    return;
                }
                return;
            case 18:
                this.b.xa(false);
                return;
            case 19:
                this.b.x8();
                return;
            case 20:
                yv1 yv1Var16 = this.b;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", yv1Var16.a());
                yv1Var16.presentFragment(new ba2(bundle2));
                return;
            case 21:
                this.b.G8();
                return;
            case 22:
                this.b.N9();
                return;
            case 23:
                this.b.O9();
                return;
            case 24:
                this.b.qa(false);
                return;
            case 25:
                yv1 yv1Var17 = this.b;
                SparseArray[] sparseArrayArr = yv1Var17.o6;
                for (int i8 = 1; i8 >= 0; i8--) {
                    if (k47Var == null && sparseArrayArr[i8].size() != 0) {
                        k47Var = (k47) yv1Var17.G6[i8].get(sparseArrayArr[i8].keyAt(0));
                    }
                    sparseArrayArr[i8].clear();
                    yv1Var17.p6[i8].clear();
                    yv1Var17.q6[i8].clear();
                }
                yv1Var17.C7();
                if (k47Var != null && ((i = k47Var.k.id) > 0 || (i < 0 && yv1Var17.h != null))) {
                    yv1Var17.dc(k47Var);
                }
                yv1Var17.gd(0, true);
                yv1Var17.Gd(false);
                yv1Var17.td();
                return;
            case 26:
                this.b.L8();
                return;
            case 27:
                yv1 yv1Var18 = this.b;
                k47 k47Var3 = yv1Var18.H5;
                if (k47Var3 != null) {
                    yv1Var18.J(k47Var3.e1(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                yv1 yv1Var19 = this.b;
                if (yv1Var19.i8()) {
                    str = "";
                }
                yv1Var19.Ba(str);
                return;
            default:
                yv1 yv1Var20 = this.b;
                yv1Var20.i6();
                yv1Var20.N3.m(jb6.M0(2131752833, null), 18, yv1Var20.l6);
                return;
        }
    }
}
