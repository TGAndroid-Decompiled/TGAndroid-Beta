package defpackage;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
public final class k88 implements ed, x74, l8, n8c, no7, j8c, fh6, yw5, yk0, cz8, e39, et3, vb9, wi3, wu9 {
    public final byte a;
    public final Object b;

    public k88(ee3 ee3Var, s59 s59Var) {
        this.a = (byte) 21;
        this.b = ee3Var;
    }

    @Override
    public final boolean F() {
        return false;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                io5 H0 = gl.H0(vxcVar, false);
                premiumPreviewFragment.p0 = H0;
                premiumPreviewFragment.a.setPadding(0, H0.b, 0, gl.L(48.0f) + premiumPreviewFragment.p0.d);
                o39 o39Var = premiumPreviewFragment.a;
                io5 io5Var = premiumPreviewFragment.p0;
                gl.w3(o39Var, io5Var.a, 0, io5Var.c, 0);
                ei8 ei8Var = premiumPreviewFragment.V;
                io5 io5Var2 = premiumPreviewFragment.p0;
                ei8Var.setPadding(io5Var2.a, 0, io5Var2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.K;
                if (frameLayout != null) {
                    int i = premiumPreviewFragment.p0.a;
                    int L = gl.L(14.0f);
                    io5 io5Var3 = premiumPreviewFragment.p0;
                    frameLayout.setPadding(i, L, io5Var3.c, io5Var3.d);
                }
                return vxc.b;
            default:
                js8 js8Var = (js8) obj;
                js8Var.I = vxcVar.a.f(647);
                js8Var.h.requestLayout();
                return vxc.b;
        }
    }

    @Override
    public final boolean a(gh6 gh6Var, boolean z) {
        fk8 fk8Var = (fk8) this.b;
        if (z) {
            fk8Var.d.Y((Long) gh6Var.getTag(), gh6Var);
            return true;
        }
        return true;
    }

    @Override
    public final void b() {
        ((ve8) this.b).e();
    }

    public final void c(int i) {
        jb9 jb9Var = (jb9) this.b;
        jb9Var.c = i;
        jb9Var.e(i);
    }

    @Override
    public final boolean d(int i, View view) {
        zz8 zz8Var;
        a09 a09Var = (a09) this.b;
        ArrayList arrayList = a09Var.n;
        if (a09Var.f.d(i) == 0 && (zz8Var = a09Var.G) != null) {
            zz8Var.l(k27.B1(((TLRPC.MessagePeerReaction) arrayList.get(i)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i));
            return true;
        }
        return true;
    }

    @Override
    public final cs5 e(mc9 mc9Var) {
        return cs5.I((hd9) ((ln8) this.b).b, mc9Var);
    }

    @Override
    public final void f(float f) {
        k27 k27Var = ((lg9) this.b).X;
        if (k27Var == null) {
            return;
        }
        k27Var.b0 = f;
        MediaController.w().h0(k27Var, f);
    }

    @Override
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((yj8) this.b).d;
        if (num.intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().p()) {
                if (privacyControlActivity.B0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    cm2 cm2Var = new cm2(2131232248, 0);
                    cm2Var.r = gl.L(2.0f);
                    cm2Var.s = gl.L(1.0f);
                    spannableString.setSpan(cm2Var, 0, 1, 33);
                    privacyControlActivity.B0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.B0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) k96.H(',', "Stars", num2.intValue()));
                return spannableStringBuilder;
            }
            return k96.H(',', "Stars", num2.intValue());
        }
        return k96.E(num2.intValue(), ',');
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 6:
                yf8 yf8Var = (yf8) obj3;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f = (Float) serializable;
                Float f2 = (Float) serializable2;
                Object obj4 = ((c4c) obj).H;
                if (obj4 instanceof k27) {
                    k27 k27Var = (k27) obj4;
                    Bundle bundle = new Bundle();
                    int i = (k27.B0(k27Var.k) > 0L ? 1 : (k27.B0(k27Var.k) == 0L ? 0 : -1));
                    TLRPC.Message message = k27Var.k;
                    if (i >= 0) {
                        bundle.putLong("user_id", k27.B0(message));
                    } else {
                        bundle.putLong("chat_id", -k27.B0(message));
                    }
                    bundle.putInt("message_id", k27Var.e1());
                    mu1 mu1Var = new mu1(bundle);
                    d dVar = yf8Var.a;
                    cj3.A3(mu1Var, k27Var);
                    dVar.presentFragment(mu1Var);
                    return;
                }
                return;
            case 20:
                Canvas canvas = (Canvas) obj;
                RectF rectF = (RectF) obj2;
                float floatValue = ((Float) number).floatValue();
                float floatValue2 = ((Float) serializable).floatValue();
                float floatValue3 = ((Float) serializable2).floatValue();
                wjb wjbVar = ((o39) obj3).o2;
                Paint paint = o39.c3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(bkb.p1(floatValue3, bkb.v0(bkb.c6, wjbVar)));
                if (floatValue <= 0.0f && floatValue2 <= 0.0f) {
                    canvas.drawRect(rectF, paint);
                    return;
                } else if (floatValue == floatValue2) {
                    canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
                    return;
                } else {
                    Path path = o39.d3;
                    path.rewind();
                    float[] fArr = o39.e3;
                    fArr[3] = floatValue;
                    fArr[2] = floatValue;
                    fArr[1] = floatValue;
                    fArr[0] = floatValue;
                    fArr[7] = floatValue2;
                    fArr[6] = floatValue2;
                    fArr[5] = floatValue2;
                    fArr[4] = floatValue2;
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.drawPath(path, paint);
                    return;
                }
            case 22:
                a89 a89Var = (a89) obj3;
                c4c c4cVar = (c4c) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f3 = (Float) serializable;
                Float f4 = (Float) serializable2;
                b89 b89Var = a89Var.w;
                if (c4cVar.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = a89Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(c4cVar.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            String str = tL_sponsoredMessageReportOption.text;
                            byte[] bArr = tL_sponsoredMessageReportOption.option;
                            int i2 = b89.v1;
                            b89Var.J0(str, bArr, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = a89Var.c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(c4cVar.d);
                        if (tL_messageReportOption != null) {
                            String str2 = tL_messageReportOption.text;
                            byte[] bArr2 = tL_messageReportOption.option;
                            int i3 = b89.v1;
                            b89Var.J0(str2, bArr2, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = a89Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr3 = tL_reportResultAddComment.option;
                        if (bArr3 != null) {
                            int i4 = b89.v1;
                            b89Var.J0(null, bArr3, null);
                            return;
                        }
                        return;
                    }
                    CharSequence charSequence = c4cVar.m;
                    int i5 = b89.v1;
                    b89Var.J0(charSequence, null, null);
                    return;
                }
                return;
            default:
                c4c c4cVar2 = (c4c) obj;
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f5 = (Float) serializable;
                Float f6 = (Float) serializable2;
                if (((ye9[]) obj3)[0] != null && (view3 instanceof wi9)) {
                    ((wi9) view3).A();
                    return;
                }
                return;
        }
    }

    @Override
    public final void m() {
        ac9 ac9Var = (ac9) this.b;
        mc9 mc9Var = ac9Var.d;
        lk0 lk0Var = ac9Var.f;
        if (lk0Var != null) {
            lk0Var.s = true;
            lk0Var.r = mc9Var.q2;
        }
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = yi9.f(mc9Var.getText());
            }
        }
        he9 he9Var = ac9Var.h;
        if (he9Var != null && ac9Var.f != null) {
            he9Var.a.W3();
        }
    }

    @Override
    public final void n(Exception exc) {
        RectF rectF = ProfileActivity.Z6;
        fa4.e("mlkit: failed to detect language in selection", exc);
        ((qt) this.b).run();
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        jd8 jd8Var = (jd8) this.b;
        jia jiaVar = jd8Var.f;
        un4.d(jiaVar, jd8Var.I.e);
        int i2 = bkb.z6;
        mu1 mu1Var = jd8Var.d;
        jiaVar.setTextColor(bm2.f(jd8Var.J.e, bkb.v0(i2, mu1Var.getResourceProvider()), bkb.v0(bkb.o7, mu1Var.getResourceProvider())));
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        kf9 kf9Var = (kf9) this.b;
        if (arrayList.isEmpty() || ((zc7) arrayList.get(0)).a <= 0) {
            return false;
        }
        kf9Var.run(((zc7) arrayList.get(0)).a);
        cj3Var.finishFragment();
        return true;
    }

    @Override
    public final void s(Canvas canvas, int i) {
        vx8 vx8Var = (vx8) this.b;
        canvas.save();
        RectF rectF = vx8Var.r;
        canvas.translate(-rectF.left, (-rectF.top) + gl.L(30.0f));
        vx8Var.e(canvas, true, i);
        canvas.restore();
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) ((e31) obj).c;
                try {
                    gl.r2(photoViewer.T4, photoViewer.E, photoViewer.w2, true);
                    photoViewer.B(false, false);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 2:
                ((ie8) obj).finishFragment();
                return;
            case 3:
                ((ce8) obj).a.S.q();
                return;
            case 5:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                int i2 = PopupNotificationActivity.c0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 10:
                RectF rectF = ProfileActivity.Z6;
                ((rl8) obj).a(1);
                return;
            case 15:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((iv7) obj).c;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    gba.i((fba) obj2);
                }
                if (gba.y1 == null) {
                    proxyListActivity.d = false;
                }
                kk7.e().n(proxyListActivity, 280);
                kk7.e().k(280, new Object[0]);
                kk7.e().b(proxyListActivity, 280);
                proxyListActivity.g0(true);
                s20 s20Var = proxyListActivity.a;
                if (s20Var != null) {
                    if (gba.y1 == null) {
                        s20Var.h(ProxyListActivity.d0(proxyListActivity), 0);
                    }
                    proxyListActivity.a.F();
                    return;
                }
                return;
            case 16:
                kx8 kx8Var = (kx8) ((kk8) obj).b;
                ox8 f = ox8.f(kx8.b0(kx8Var));
                ArrayList arrayList2 = kx8Var.b;
                int i4 = f.a;
                int i5 = 0;
                while (i5 < arrayList2.size()) {
                    if (f.c(((Integer) arrayList2.get(i5)).intValue()) == null) {
                        arrayList2.remove(i5);
                        i5--;
                    }
                    i5++;
                }
                if (!arrayList2.isEmpty()) {
                    for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                        nx8 c = f.c(((Integer) arrayList2.get(i6)).intValue());
                        f.b.remove(c);
                        f.a(c.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c.a;
                        ConnectionsManager.getInstance(i4).sendRequest(tL_messages_deleteQuickReplyShortcut, new ce2((byte) 6));
                        if ("hello".equals(c.b)) {
                            ConnectionsManager.getInstance(i4).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull W1 = na7.q1(i4).W1(y6c.h(i4).e());
                            if (W1 != null) {
                                W1.flags2 &= -5;
                                W1.business_greeting_message = null;
                                ad7.Y(i4).g2(W1, true);
                            }
                        } else if ("away".equals(c.b)) {
                            ConnectionsManager.getInstance(i4).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull W12 = na7.q1(i4).W1(y6c.h(i4).e());
                            if (W12 != null) {
                                W12.flags2 &= -9;
                                W12.business_away_message = null;
                                ad7.Y(i4).g2(W12, true);
                            }
                        }
                    }
                    f.l();
                    ad7 Y = ad7.Y(i4);
                    Y.a.c(new i41(Y, arrayList2, (byte) 24));
                    kk7.f(i4).k(121, new Object[0]);
                }
                kx8Var.d0();
                return;
            default:
                ((d97) obj).run();
                return;
        }
    }

    public k88(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void h(float f) {
    }

    @Override
    public final void D(float f, int i) {
    }
}
