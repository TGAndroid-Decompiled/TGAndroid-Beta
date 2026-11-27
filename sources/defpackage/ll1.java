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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class ll1 implements View.OnClickListener {
    public final byte a;
    public final zu1 b;

    public ll1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void onClick(View view) {
        zu1 zu1Var;
        boolean z;
        int i;
        int i2;
        r47 r47Var = null;
        String str = null;
        switch (this.a) {
            case 0:
                zu1 zu1Var2 = this.b;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", zu1Var2.r);
                zu1Var2.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                zu1 zu1Var3 = this.b;
                l46.o1(zu1Var3, zu1Var3.S1, zu1Var3.T1, zu1Var3.l6, false);
                return;
            case 2:
                zu1 zu1Var4 = this.b;
                if (zu1Var4.Z3 != null) {
                    zu1Var4.nc(!zu1Var4.ud.f);
                    return;
                }
                return;
            case 3:
                this.b.Jb(!zu1Var.D0.O);
                return;
            case 4:
                zu1 zu1Var5 = this.b;
                fr1 fr1Var = zu1Var5.X1;
                if (fr1Var != null) {
                    fr1Var.setReversed(true);
                    zu1Var5.X1.getAdapter().l0 = true;
                    zu1Var5.y5();
                }
                zu1Var5.h3.setVisibility(8);
                zu1Var5.i3.setVisibility(8);
                zu1Var5.C3 = true;
                zu1Var5.D3 = null;
                zu1Var5.E3 = null;
                zu1Var5.k0.setSearchFieldHint(ob6.M0(2131745485, null));
                zu1Var5.k0.setSearchFieldCaption(ob6.M0(2131745494, null));
                hl.E3(zu1Var5.k0.getSearchField());
                zu1Var5.k0.o();
                return;
            case 5:
                zu1 zu1Var6 = this.b;
                if (zu1Var6.getParentActivity() != null) {
                    s7 s7Var = zu1Var6.k0;
                    if (s7Var != null) {
                        hl.t1(s7Var.getSearchField());
                    }
                    zu1Var6.showDialog((nx0) jj.o(zu1Var6.getParentActivity(), new is1(zu1Var6), zu1Var6.Ba).b);
                    return;
                }
                return;
            case 6:
                this.b.finishPreviewFragment();
                return;
            case 7:
                boolean z2 = false;
                zu1 zu1Var7 = this.b;
                long j = zu1Var7.l6;
                TLRPC.User user = zu1Var7.f;
                TLRPC.Chat chat = zu1Var7.e;
                TLRPC.EncryptedChat encryptedChat = zu1Var7.h;
                if (zu1Var7.c2.getTag(2131296587) != null) {
                    z2 = true;
                }
                jj.g0(zu1Var7, j, user, chat, encryptedChat, z2, zu1Var7.r8, new cn1(zu1Var7, (byte) 2), zu1Var7.Ba);
                return;
            case 8:
                this.b.z8();
                return;
            case 9:
                zu1 zu1Var8 = this.b;
                if (zu1Var8.r4 != null) {
                    qyb qybVar = zu1Var8.getMessagesController().g4;
                    long j2 = zu1Var8.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = zu1Var8.r4;
                    int i3 = tL_forumTopic.id;
                    z = false;
                    tL_forumTopic.closed = false;
                    qybVar.z(i3, j2, false);
                } else {
                    z = false;
                }
                zu1Var8.Ad();
                zu1Var8.Pc(z);
                zu1Var8.zd(true);
                return;
            case 10:
                zu1 zu1Var9 = this.b;
                long j3 = zu1Var9.l6;
                if (zu1Var9.h != null) {
                    j3 = zu1Var9.f.id;
                }
                zu1Var9.Nc = false;
                zu1Var9.getMessagesController().f2(j3, zu1Var9.f, zu1Var9.e);
                zu1Var9.zd(true);
                zu1Var9.Wc(true);
                return;
            case 11:
                zu1 zu1Var10 = this.b;
                zu1Var10.R4 = true;
                if (zu1Var10.k8() && !zu1Var10.x4) {
                    zu1Var10.J((int) zu1Var10.s4, 0, 0, 0, true, true);
                    return;
                }
                int i4 = zu1Var10.Z4;
                if (i4 != 0) {
                    if (!zu1Var10.V4.isEmpty()) {
                        if (i4 == ((Integer) c00.g(1, zu1Var10.V4)).intValue()) {
                            i = ((Integer) zu1Var10.V4.get(0)).intValue() + 1;
                            zu1Var10.c5 = true;
                        } else {
                            zu1Var10.c5 = false;
                            i = i4 - 1;
                        }
                    } else {
                        i = 0;
                    }
                    zu1Var10.b5 = i;
                    if (!zu1Var10.c5) {
                        i = -i;
                    }
                    zu1Var10.J(i4, 0, 0, i, true, true);
                    zu1Var10.cd();
                    return;
                }
                return;
            case 12:
                this.b.ya(false);
                return;
            case 13:
                this.b.y8();
                return;
            case 14:
                zu1 zu1Var11 = this.b;
                zu1Var11.showDialog(new xk8((e) zu1Var11, 28, true));
                return;
            case 15:
                this.b.H8();
                return;
            case 16:
                zu1 zu1Var12 = this.b;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", zu1Var12.a());
                zu1Var12.presentFragment(new g92(bundle2));
                return;
            case 17:
                this.b.O9();
                return;
            case 18:
                this.b.P9();
                return;
            case 19:
                this.b.ra(false);
                return;
            case 20:
                zu1 zu1Var13 = this.b;
                SparseArray[] sparseArrayArr = zu1Var13.o6;
                for (int i5 = 1; i5 >= 0; i5--) {
                    if (r47Var == null && sparseArrayArr[i5].size() != 0) {
                        r47Var = (r47) zu1Var13.G6[i5].get(sparseArrayArr[i5].keyAt(0));
                    }
                    sparseArrayArr[i5].clear();
                    zu1Var13.p6[i5].clear();
                    zu1Var13.q6[i5].clear();
                }
                zu1Var13.C7();
                if (r47Var != null && ((i2 = r47Var.k.id) > 0 || (i2 < 0 && zu1Var13.h != null))) {
                    zu1Var13.dc(r47Var);
                }
                zu1Var13.gd(0, true);
                zu1Var13.Gd(false);
                zu1Var13.td();
                return;
            case 21:
                this.b.M5(true);
                return;
            case 22:
                zu1 zu1Var14 = this.b;
                r47 r47Var2 = zu1Var14.v5;
                if (r47Var2 != null) {
                    zu1Var14.Z9(r47Var2, false, false);
                    m01.t(zu1Var14.getParentActivity(), Uri.parse(zu1Var14.v5.T0), true, false, false, null, null, false, zu1Var14.getMessagesController().k4.I2.f, false, false);
                    return;
                }
                return;
            case 23:
                this.b.M8();
                return;
            case 24:
                zu1 zu1Var15 = this.b;
                if (hl.g(zu1Var15.v5.W0)) {
                    new d31(o11.a(zu1Var15.getParentActivity()), zu1Var15.Ba).i(ob6.M0(2131743847, null)).j();
                    return;
                }
                return;
            case 25:
                zu1 zu1Var16 = this.b;
                if (hl.g(zu1Var16.v5.X0)) {
                    new d31(o11.a(zu1Var16.getParentActivity()), zu1Var16.Ba).i(ob6.M0(2131743847, null)).j();
                    return;
                }
                return;
            case 26:
                zu1 zu1Var17 = this.b;
                if (zu1Var17.m1 != null && zu1Var17.getParentActivity() != null) {
                    nx0 h = uh9.h(1, null, zu1Var17.m1.getContext(), false);
                    Activity parentActivity = zu1Var17.getParentActivity();
                    xu1 xu1Var = zu1Var17.Ba;
                    final ir8 ir8Var = new ir8(parentActivity, (byte) 11);
                    LinearLayout m = bs2.m(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(ob6.M0(2131744911, null));
                    textView.setTypeface(hl.o());
                    int i6 = aob.G6;
                    yob.X(textView, i6, xu1Var);
                    textView.setTextSize(1, 20.0f);
                    p66 p66Var = new p66(parentActivity, xu1Var);
                    p66Var.setText(hl.H2(ob6.N0("SponsoredMessageInfo2Description1"), xu1Var, null));
                    yob.G(p66Var, aob.Xc, xu1Var);
                    yob.X(p66Var, i6, xu1Var);
                    p66Var.setTextSize(1, 14.0f);
                    p66Var.setLineSpacing(hl.L(2.0f), 1.0f);
                    p66Var.setOnLinkPressListener(new o66() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            byte b = r2;
                            ir8 ir8Var2 = ir8Var;
                            switch (b) {
                                case 0:
                                    clickableSpan.onClick(ir8Var2);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ir8Var2);
                                    return;
                                default:
                                    clickableSpan.onClick(ir8Var2);
                                    return;
                            }
                        }
                    });
                    p66 p66Var2 = new p66(parentActivity, null);
                    p66Var2.setText(hl.H2(ob6.N0("SponsoredMessageInfo2Description2"), xu1Var, null));
                    yob.X(p66Var2, i6, xu1Var);
                    p66Var2.setTextSize(1, 14.0f);
                    p66Var2.setLineSpacing(hl.L(2.0f), 1.0f);
                    p66Var2.setOnLinkPressListener(new o66() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            byte b = r2;
                            ir8 ir8Var2 = ir8Var;
                            switch (b) {
                                case 0:
                                    clickableSpan.onClick(ir8Var2);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ir8Var2);
                                    return;
                                default:
                                    clickableSpan.onClick(ir8Var2);
                                    return;
                            }
                        }
                    });
                    p66 p66Var3 = new p66(parentActivity, null);
                    p66Var3.setText(hl.H2(ob6.N0("SponsoredMessageInfo2Description3"), xu1Var, null));
                    yob.X(p66Var3, i6, xu1Var);
                    p66Var3.setTextSize(1, 14.0f);
                    p66Var3.setLineSpacing(hl.L(2.0f), 1.0f);
                    p66Var3.setOnLinkPressListener(new o66() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            byte b = r2;
                            ir8 ir8Var2 = ir8Var;
                            switch (b) {
                                case 0:
                                    clickableSpan.onClick(ir8Var2);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ir8Var2);
                                    return;
                                default:
                                    clickableSpan.onClick(ir8Var2);
                                    return;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i7 = aob.Fi;
                    paint.setColor(aob.v0(i7, xu1Var));
                    paint.setStrokeWidth(hl.L(1.0f));
                    fx0 fx0Var = new fx0(parentActivity, paint);
                    fx0Var.setOnClickListener(new h6(parentActivity, (byte) 15));
                    fx0Var.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
                    fx0Var.setText(ob6.M0(2131744912, null));
                    yob.X(fx0Var, i7, xu1Var);
                    int i8 = aob.h5;
                    hf0 e = rnb.e(aob.v0(i8, xu1Var), 4.0f);
                    uob M = yob.M(i8);
                    uob e2 = yob.e(i8);
                    fx0Var.setBackground(e);
                    yob.j(fx0Var, e, M, e2, xu1Var);
                    fx0Var.setTextSize(1, 14.0f);
                    fx0Var.setGravity(16);
                    p66 p66Var4 = new p66(parentActivity, null);
                    p66Var4.setText(hl.H2(ob6.N0("SponsoredMessageInfo2Description4"), xu1Var, null));
                    p66Var4.setLineSpacing(hl.L(2.0f), 1.0f);
                    yob.X(p66Var4, i6, xu1Var);
                    p66Var4.setTextSize(1, 14.0f);
                    textView.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
                    m.addView(textView);
                    p66Var.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
                    m.addView(p66Var, tre.t(-1, -2, 0, 0, 18, 0, 0));
                    p66Var2.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
                    m.addView(p66Var2, tre.t(-1, -2, 0, 0, 24, 0, 0));
                    p66Var3.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
                    m.addView(p66Var3, tre.t(-1, -2, 0, 0, 24, 0, 0));
                    m.addView(fx0Var, tre.t(-2, 34, 1, 22, 14, 22, 0));
                    p66Var4.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
                    m.addView(p66Var4, tre.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(ir8Var.getContext());
                    scrollView.addView(m);
                    ir8Var.addView(scrollView, tre.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    h.O = ir8Var;
                    h.show();
                    return;
                }
                return;
            case 27:
                zu1 zu1Var18 = this.b;
                r47 r47Var3 = zu1Var18.H5;
                if (r47Var3 != null) {
                    zu1Var18.J(r47Var3.e1(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                zu1 zu1Var19 = this.b;
                if (zu1Var19.j8()) {
                    str = "";
                }
                zu1Var19.Ca(str);
                return;
            default:
                zu1 zu1Var20 = this.b;
                zu1Var20.i6();
                zu1Var20.N3.m(zu1Var20.l6, ob6.M0(2131752861, null), 18);
                return;
        }
    }
}
