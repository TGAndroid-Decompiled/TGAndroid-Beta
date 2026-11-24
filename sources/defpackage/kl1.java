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
public final class kl1 implements View.OnClickListener {
    public final byte a;
    public final mu1 b;

    public kl1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void onClick(View view) {
        mu1 mu1Var;
        int i;
        k27 k27Var = null;
        String str = null;
        int i2 = 0;
        boolean z = true;
        switch (this.a) {
            case 0:
                mu1 mu1Var2 = this.b;
                h26.n1(mu1Var2, mu1Var2.S1, mu1Var2.T1, mu1Var2.l6, false);
                return;
            case 1:
                mu1 mu1Var3 = this.b;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", mu1Var3.r);
                mu1Var3.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                mu1 mu1Var4 = this.b;
                if (mu1Var4.Z3 != null) {
                    mu1Var4.Zb(!mu1Var4.gd.f);
                    return;
                }
                return;
            case 3:
                this.b.wb(!mu1Var.D0.O);
                return;
            case 4:
                mu1 mu1Var5 = this.b;
                sq1 sq1Var = mu1Var5.X1;
                if (sq1Var != null) {
                    sq1Var.setReversed(true);
                    mu1Var5.X1.getAdapter().l0 = true;
                    mu1Var5.r5();
                }
                mu1Var5.h3.setVisibility(8);
                mu1Var5.i3.setVisibility(8);
                mu1Var5.C3 = true;
                mu1Var5.D3 = null;
                mu1Var5.E3 = null;
                mu1Var5.k0.setSearchFieldHint(k96.M0(2131745565, null));
                mu1Var5.k0.setSearchFieldCaption(k96.M0(2131745574, null));
                gl.F3(mu1Var5.k0.getSearchField());
                mu1Var5.k0.o();
                return;
            case 5:
                mu1 mu1Var6 = this.b;
                if (mu1Var6.getParentActivity() != null) {
                    r7 r7Var = mu1Var6.k0;
                    if (r7Var != null) {
                        gl.t1(r7Var.getSearchField());
                    }
                    mu1Var6.showDialog((fx0) ij.o(mu1Var6.getParentActivity(), new ur1(mu1Var6), mu1Var6.Ba).a);
                    return;
                }
                return;
            case 6:
                this.b.F5(true);
                return;
            case 7:
                mu1 mu1Var7 = this.b;
                k27 k27Var2 = mu1Var7.v5;
                if (k27Var2 != null) {
                    mu1Var7.M9(k27Var2, false, false);
                    d01.s(mu1Var7.getParentActivity(), Uri.parse(mu1Var7.v5.T0), true, false, false, null, null, false, mu1Var7.getMessagesController().k4.A2.f, false, false);
                    return;
                }
                return;
            case 8:
                mu1 mu1Var8 = this.b;
                if (gl.g(mu1Var8.v5.W0)) {
                    new u21(f11.a(mu1Var8.getParentActivity()), mu1Var8.Ba).i(k96.M0(2131743953, null)).j();
                    return;
                }
                return;
            case 9:
                mu1 mu1Var9 = this.b;
                if (gl.g(mu1Var9.v5.X0)) {
                    new u21(f11.a(mu1Var9.getParentActivity()), mu1Var9.Ba).i(k96.M0(2131743953, null)).j();
                    return;
                }
                return;
            case 10:
                mu1 mu1Var10 = this.b;
                if (mu1Var10.m1 != null && mu1Var10.getParentActivity() != null) {
                    fx0 h = de9.h(1, null, mu1Var10.m1.getContext(), false);
                    Activity parentActivity = mu1Var10.getParentActivity();
                    ku1 ku1Var = mu1Var10.Ba;
                    final ar8 ar8Var = new ar8(parentActivity, (byte) 10);
                    LinearLayout m = ir2.m(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(k96.M0(2131745017, null));
                    textView.setTypeface(gl.o());
                    int i3 = bkb.F6;
                    zkb.X(textView, i3, ku1Var);
                    textView.setTextSize(1, 20.0f);
                    l46 l46Var = new l46(parentActivity, ku1Var);
                    l46Var.setText(gl.I2(k96.N0("SponsoredMessageInfo2Description1"), ku1Var, null));
                    zkb.G(l46Var, bkb.Wc, ku1Var);
                    zkb.X(l46Var, i3, ku1Var);
                    l46Var.setTextSize(1, 14.0f);
                    l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
                    l46Var.setOnLinkPressListener(new k46() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            byte b = r2;
                            ar8 ar8Var2 = ar8Var;
                            switch (b) {
                                case 0:
                                    clickableSpan.onClick(ar8Var2);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ar8Var2);
                                    return;
                                default:
                                    clickableSpan.onClick(ar8Var2);
                                    return;
                            }
                        }
                    });
                    l46 l46Var2 = new l46(parentActivity, null);
                    l46Var2.setText(gl.I2(k96.N0("SponsoredMessageInfo2Description2"), ku1Var, null));
                    zkb.X(l46Var2, i3, ku1Var);
                    l46Var2.setTextSize(1, 14.0f);
                    l46Var2.setLineSpacing(gl.L(2.0f), 1.0f);
                    l46Var2.setOnLinkPressListener(new k46() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            byte b = r2;
                            ar8 ar8Var2 = ar8Var;
                            switch (b) {
                                case 0:
                                    clickableSpan.onClick(ar8Var2);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ar8Var2);
                                    return;
                                default:
                                    clickableSpan.onClick(ar8Var2);
                                    return;
                            }
                        }
                    });
                    l46 l46Var3 = new l46(parentActivity, null);
                    l46Var3.setText(gl.I2(k96.N0("SponsoredMessageInfo2Description3"), ku1Var, null));
                    zkb.X(l46Var3, i3, ku1Var);
                    l46Var3.setTextSize(1, 14.0f);
                    l46Var3.setLineSpacing(gl.L(2.0f), 1.0f);
                    l46Var3.setOnLinkPressListener(new k46() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            byte b = r2;
                            ar8 ar8Var2 = ar8Var;
                            switch (b) {
                                case 0:
                                    clickableSpan.onClick(ar8Var2);
                                    return;
                                case 1:
                                    clickableSpan.onClick(ar8Var2);
                                    return;
                                default:
                                    clickableSpan.onClick(ar8Var2);
                                    return;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i4 = bkb.Ei;
                    paint.setColor(bkb.v0(i4, ku1Var));
                    paint.setStrokeWidth(gl.L(1.0f));
                    xw0 xw0Var = new xw0(parentActivity, paint);
                    xw0Var.setOnClickListener(new g6(parentActivity, (byte) 15));
                    xw0Var.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
                    xw0Var.setText(k96.M0(2131745018, null));
                    zkb.X(xw0Var, i4, ku1Var);
                    int i5 = bkb.g5;
                    ff0 e = sjb.e(bkb.v0(i5, ku1Var), 4.0f);
                    vkb M = zkb.M(i5);
                    vkb e2 = zkb.e(i5);
                    xw0Var.setBackground(e);
                    zkb.j(xw0Var, e, M, e2, ku1Var);
                    xw0Var.setTextSize(1, 14.0f);
                    xw0Var.setGravity(16);
                    l46 l46Var4 = new l46(parentActivity, null);
                    l46Var4.setText(gl.I2(k96.N0("SponsoredMessageInfo2Description4"), ku1Var, null));
                    l46Var4.setLineSpacing(gl.L(2.0f), 1.0f);
                    zkb.X(l46Var4, i3, ku1Var);
                    l46Var4.setTextSize(1, 14.0f);
                    textView.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
                    m.addView(textView);
                    l46Var.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
                    m.addView(l46Var, nme.t(-1, -2, 0, 0, 18, 0, 0));
                    l46Var2.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
                    m.addView(l46Var2, nme.t(-1, -2, 0, 0, 24, 0, 0));
                    l46Var3.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
                    m.addView(l46Var3, nme.t(-1, -2, 0, 0, 24, 0, 0));
                    m.addView(xw0Var, nme.t(-2, 34, 1, 22, 14, 22, 0));
                    l46Var4.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
                    m.addView(l46Var4, nme.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(ar8Var.getContext());
                    scrollView.addView(m);
                    ar8Var.addView(scrollView, nme.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    h.O = ar8Var;
                    h.show();
                    return;
                }
                return;
            case 11:
                this.b.finishPreviewFragment();
                return;
            case 12:
                mu1 mu1Var11 = this.b;
                mu1Var11.showDialog(new jh8((d) mu1Var11, 28, true));
                return;
            case 13:
                mu1 mu1Var12 = this.b;
                long j = mu1Var12.l6;
                TLRPC.User user = mu1Var12.f;
                TLRPC.Chat chat = mu1Var12.e;
                TLRPC.EncryptedChat encryptedChat = mu1Var12.h;
                if (mu1Var12.c2.getTag(2131296587) == null) {
                    z = false;
                }
                ij.g0(mu1Var12, j, user, chat, encryptedChat, z, mu1Var12.r8, new an1(mu1Var12, (byte) 2), mu1Var12.Ba);
                return;
            case 14:
                this.b.m8();
                return;
            case 15:
                mu1 mu1Var13 = this.b;
                if (mu1Var13.r4 != null) {
                    pub pubVar = mu1Var13.getMessagesController().g4;
                    long j2 = mu1Var13.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = mu1Var13.r4;
                    int i6 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    pubVar.z(i6, j2, false);
                }
                mu1Var13.md();
                mu1Var13.Bc(false);
                mu1Var13.ld(true);
                return;
            case 16:
                mu1 mu1Var14 = this.b;
                long j3 = mu1Var14.l6;
                if (mu1Var14.h != null) {
                    j3 = mu1Var14.f.id;
                }
                mu1Var14.Cc = false;
                mu1Var14.getMessagesController().d2(j3, mu1Var14.f, mu1Var14.e);
                mu1Var14.ld(true);
                mu1Var14.Ic(true);
                return;
            case 17:
                mu1 mu1Var15 = this.b;
                mu1Var15.R4 = true;
                if (mu1Var15.Y7() && !mu1Var15.x4) {
                    mu1Var15.J((int) mu1Var15.s4, 0, 0, 0, true, true);
                    return;
                }
                int i7 = mu1Var15.Z4;
                if (i7 != 0) {
                    if (!mu1Var15.V4.isEmpty()) {
                        if (i7 == ((Integer) b00.f(1, mu1Var15.V4)).intValue()) {
                            i2 = ((Integer) mu1Var15.V4.get(0)).intValue() + 1;
                            mu1Var15.c5 = true;
                        } else {
                            mu1Var15.c5 = false;
                            i2 = i7 - 1;
                        }
                    }
                    mu1Var15.b5 = i2;
                    if (!mu1Var15.c5) {
                        i2 = -i2;
                    }
                    mu1Var15.J(i7, 0, 0, i2, true, true);
                    mu1Var15.Oc();
                    return;
                }
                return;
            case 18:
                this.b.la(false);
                return;
            case 19:
                this.b.l8();
                return;
            case 20:
                mu1 mu1Var16 = this.b;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", mu1Var16.a());
                mu1Var16.presentFragment(new p82(bundle2));
                return;
            case 21:
                this.b.u8();
                return;
            case 22:
                this.b.B9();
                return;
            case 23:
                this.b.C9();
                return;
            case 24:
                this.b.ea(false);
                return;
            case 25:
                mu1 mu1Var17 = this.b;
                SparseArray[] sparseArrayArr = mu1Var17.o6;
                for (int i8 = 1; i8 >= 0; i8--) {
                    if (k27Var == null && sparseArrayArr[i8].size() != 0) {
                        k27Var = (k27) mu1Var17.G6[i8].get(sparseArrayArr[i8].keyAt(0));
                    }
                    sparseArrayArr[i8].clear();
                    mu1Var17.p6[i8].clear();
                    mu1Var17.q6[i8].clear();
                }
                mu1Var17.s7();
                if (k27Var != null && ((i = k27Var.k.id) > 0 || (i < 0 && mu1Var17.h != null))) {
                    mu1Var17.Pb(k27Var);
                }
                mu1Var17.Sc(0, true);
                mu1Var17.sd(false);
                mu1Var17.fd();
                return;
            case 26:
                this.b.z8();
                return;
            case 27:
                mu1 mu1Var18 = this.b;
                k27 k27Var3 = mu1Var18.H5;
                if (k27Var3 != null) {
                    mu1Var18.J(k27Var3.e1(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                mu1 mu1Var19 = this.b;
                if (mu1Var19.X7()) {
                    str = "";
                }
                mu1Var19.pa(str);
                return;
            default:
                mu1 mu1Var20 = this.b;
                mu1Var20.Z5();
                mu1Var20.N3.m(k96.M0(2131752868, null), 18, mu1Var20.l6);
                return;
        }
    }
}
