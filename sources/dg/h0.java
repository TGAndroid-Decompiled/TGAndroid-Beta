package dg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.Pair;
import android.view.TextureView;
import android.widget.TextView;
import eg.w3;
import fg.p2;
import j$.util.Objects;
import java.util.HashMap;
import lh.e6;
import lh.f5;
import lh.p5;
import lh.r5;
import mh.q3;
import mh.t7;
import oh.f4;
import oh.i9;
import oh.l6;
import oh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.xt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import qh.n4;
public final class h0 implements Utilities.Callback {
    public final int f4546a;
    public final Object f4547b;

    public h0(Object obj, int i10) {
        this.f4546a = i10;
        this.f4547b = obj;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        float f10;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z4;
        float f11;
        String formatPluralStringComma;
        String str;
        String str2;
        float f12 = 0.08f;
        switch (this.f4546a) {
            case 0:
                m0 m0Var = (m0) this.f4547b;
                r1 r1Var = (r1) obj;
                o1 o1Var = m0Var.f4582a;
                if (r1Var != null) {
                    float currentWeight = o1Var.getCurrentWeight();
                    r1Var.f4655f = currentWeight;
                    double d = m0Var.f4595p;
                    if (d > 0.0d) {
                        r1Var.f4655f = (float) ((d / m0Var.f4596q) * currentWeight);
                    }
                    if (r1Var.f4651a.o() == 4) {
                        r1Var.f4659k *= r1Var.f4655f;
                    }
                }
                c1 painting = o1Var.getPainting();
                if (painting.L == null) {
                    painting.f4455f.f(new x0(painting, r1Var, 1));
                    return;
                }
                return;
            case 1:
                dh.i iVar = (dh.i) this.f4547b;
                if (((dh.b) obj) == dh.b.d && ((i10 = iVar.f4764s) == 2 || i10 == 3)) {
                    iVar.f4764s = 1;
                }
                iVar.h.run();
                return;
            case 2:
                n4 n4Var = (n4) this.f4547b;
                TextureView textureView = (TextureView) obj;
                n4Var.f5558t0 = textureView;
                if (textureView != null) {
                    n4Var.f5552n0.addView(textureView, 0);
                    return;
                }
                return;
            case 3:
                w3 w3Var = (w3) this.f4547b;
                w3Var.f5534n = (Bitmap) obj;
                Paint paint = new Paint(1);
                w3Var.f5536s = paint;
                Bitmap bitmap = w3Var.f5534n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                w3Var.f5535r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (!k6.I.q()) {
                    f12 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f12);
                if (k6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                w3Var.f5536s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                w3Var.v = new Matrix();
                return;
            case 4:
                eh.f fVar = (eh.f) this.f4547b;
                eh.h hVar = (eh.h) obj;
                fVar.h = hVar;
                fVar.f5625c.a(hVar, true);
                AndroidUtilities.runOnUIThread(new ag.e(fVar, 28), 200L);
                return;
            case 5:
                ((fg.v0) this.f4547b).E1((HashMap) obj);
                return;
            case 6:
                p2 p2Var = (p2) this.f4547b;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (p2Var.d != isEnabled) {
                    p2Var.d = isEnabled;
                    p2Var.invalidate();
                    return;
                }
                return;
            case 7:
                MessageObject messageObject = (MessageObject) this.f4547b;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia;
                    tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                    tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                    tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                    tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                    tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                    tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                    if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                        tL_messageMediaGiveaway.flags |= 32;
                        tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                    }
                } else {
                    tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                }
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
                long j10 = messageObject.messageOwner.date * 1000;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = hg.r.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    qb qbVar = new qb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        qbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        qbVar.f30375b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            qbVar.c(R.raw.forward, 30, 30, new String[0]);
                            qbVar.f30375b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            qbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            qbVar.f30375b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    qbVar.f30375b.setSingleLine(false);
                    qbVar.f30375b.setMaxLines(2);
                    gc gcVar = new gc(R.getParentActivity(), R.getResourceProvider(), true);
                    gcVar.e(LocaleController.getString(R.string.LearnMore));
                    gcVar.f27139a = new hg.j(payments_giveawayinfo, z4, b10, j10, tL_messageMediaGiveaway2, R);
                    qbVar.setButton(gcVar);
                    ic.g(R, qbVar, 2750).j();
                    return;
                }
                return;
            case 8:
                hg.w1 w1Var = (hg.w1) this.f4547b;
                w1Var.X.setLoading(false);
                hg.r.j(w1Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 9:
                hh.f.P((hh.f) this.f4547b, (Pair) obj);
                return;
            case 10:
                HashMap hashMap = ((ig.b) this.f4547b).f8074w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 11:
                ((ig.e) this.f4547b).F((TLObject) obj);
                return;
            case 12:
                HashMap hashMap2 = ((ig.h) this.f4547b).f8101n;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 13:
                ih.j jVar = (ih.j) this.f4547b;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = jVar.H;
                if (jVar.Q) {
                    jVar.F.recycle();
                    return;
                }
                jVar.F = bitmap2;
                Bitmap bitmap3 = jVar.F;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                jVar.G = new BitmapShader(bitmap3, tileMode2, tileMode2);
                Paint paint2 = new Paint(2);
                jVar.I = paint2;
                paint2.setShader(jVar.G);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (!k6.I.q()) {
                    f12 = 1.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f12);
                if (k6.I.q()) {
                    f11 = 0.02f;
                } else {
                    f11 = -0.15f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f11);
                jVar.I.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                matrix.reset();
                matrix.setScale(15.0f, 15.0f);
                jVar.G.setLocalMatrix(matrix);
                return;
            case 14:
                Boolean bool2 = (Boolean) obj;
                ((lh.c2) this.f4547b).a();
                return;
            case 15:
                ((r5) this.f4547b).e0(((Boolean) obj).booleanValue());
                return;
            case 16:
                ((Boolean) obj).getClass();
                f5 f5Var = ((p5) this.f4547b).d;
                if (f5Var != null) {
                    f5Var.run();
                    return;
                }
                return;
            case 17:
                hg.r.j(((e6) this.f4547b).getContext(), (TLRPC.TL_error) obj);
                return;
            case 18:
                mh.m0 m0Var2 = (mh.m0) this.f4547b;
                int i11 = mh.m0.f14423t0[((Integer) obj).intValue()];
                if (m0Var2.f14434k0 != i11) {
                    m0Var2.f14434k0 = i11;
                    m0Var2.f14426c0.setText(LocaleController.formatPluralString("GiftOfferHours", i11 / 3600, new Object[0]));
                }
                m0Var2.T(true);
                return;
            case 19:
                mh.i1 i1Var = (mh.i1) this.f4547b;
                Integer num = (Integer) obj;
                i1Var.f14207f0.g();
                i1Var.f14209h0.N(true);
                return;
            case 20:
                q3 q3Var = (q3) this.f4547b;
                q3Var.getClass();
                q3Var.f14633s = new Matrix();
                q3Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                q3Var.f14632r = bitmapShader2;
                Paint paint3 = q3Var.f14628c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 21:
                t7.a((t7) this.f4547b, (TL_stars.StarGifts) obj);
                return;
            case 22:
                ((h3) this.f4547b).dismiss(((Boolean) obj).booleanValue());
                return;
            case 23:
                TextView textView = (TextView) this.f4547b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        if (starGift.availability_remains <= 0) {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        return;
                    }
                    int i12 = starGift.availability_remains;
                    if (i12 <= 0) {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability4Value", i12, LocaleController.formatNumber(starGift.availability_total, ','));
                    }
                    textView.setText(formatPluralStringComma);
                    return;
                }
                return;
            case 24:
                oh.e1 e1Var = (oh.e1) this.f4547b;
                if (((Boolean) obj).booleanValue() && !e1Var.f17012w) {
                    e1Var.f17009n = true;
                    e1Var.F = true;
                    e1Var.u(false);
                    oh.e1.T = e1Var;
                    e1Var.G = NativeInstance.createVideoCapturer(e1Var.E, e1Var.F ? 1 : 0);
                    if (e1Var.B != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = e1Var.B;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.s0(nativeInstance, 3));
                        e1Var.J.clear();
                        e1Var.B = null;
                    }
                    e1Var.c();
                    e1Var.k();
                    NotificationCenter.getInstance(e1Var.f17007e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1Var.f17008f.f20862id));
                    return;
                }
                return;
            case 25:
                f4 f4Var = (f4) this.f4547b;
                f4Var.I3 = ((Long) obj).longValue();
                oh.p2 p2Var2 = f4Var.Y1;
                if (p2Var2 != null) {
                    p2Var2.J(true);
                    f4Var.Y1.R1();
                }
                f4Var.r0(true);
                return;
            case 26:
                i9 i9Var = (i9) this.f4547b;
                Boolean bool3 = (Boolean) obj;
                i9Var.f17274h1 = false;
                i9Var.P();
                return;
            case 27:
                t6 t6Var = (t6) this.f4547b;
                l6 l6Var = (l6) obj;
                HashMap hashMap3 = t6Var.H;
                int i13 = l6Var.f17401e;
                int i14 = l6Var.f17402f;
                long j11 = l6Var.d;
                if (i13 == 0 && i14 > 0) {
                    HashMap hashMap4 = (HashMap) hashMap3.get(Long.valueOf(j11));
                    if (hashMap4 != null) {
                        hashMap4.remove(Integer.valueOf(i14));
                        if (hashMap4.isEmpty()) {
                            hashMap3.remove(Long.valueOf(j11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap5 = t6Var.G[i13];
                if (hashMap5 != null) {
                    hashMap5.remove(Long.valueOf(j11));
                    return;
                }
                return;
            case 28:
                AndroidUtilities.hideKeyboard((xt) this.f4547b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            default:
                org.telegram.ui.web.x0 x0Var = ((BotWebViewContainer$WebViewProxy) this.f4547b).f42421b;
                StringBuilder sb = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str2 = "";
                } else {
                    str2 = "'abort'";
                }
                sb.append(str2);
                sb.append(")");
                x0Var.d(sb.toString());
                return;
        }
    }
}
