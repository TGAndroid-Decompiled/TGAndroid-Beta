package ii;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import android.view.TextureView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class q1 implements Utilities.Callback {
    public final int f11564a;
    public final Object f11565b;

    public q1(Object obj, int i10) {
        this.f11564a = i10;
        this.f11565b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        v51 v51Var;
        int i10;
        float f7;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z10;
        float f10;
        String formatPluralStringComma;
        String str2;
        int i11 = this.f11564a;
        float f11 = 0.08f;
        Object obj2 = this.f11565b;
        switch (i11) {
            case 0:
                ((e2) obj2).P.U1((TL_iv.RichMessage) obj);
                return;
            case 1:
                x3 x3Var = (x3) obj2;
                String str3 = (String) obj;
                x3Var.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str3;
                    x3Var.R1(pageblockmath);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((cu) obj2);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 3:
                org.telegram.ui.web.y0 y0Var = ((BotWebViewContainer$WebViewProxy) obj2).f38611b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb2.append(str);
                sb2.append(")");
                y0Var.d(sb2.toString());
                return;
            case 4:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) obj2;
                g1Var.e = (ArrayList) obj;
                x51 x51Var = g1Var.f30163a;
                if (x51Var.G) {
                    x51Var.Y2.N(true);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj2;
                y1Var.f38916n = ((ArrayList) obj).size();
                x51 x51Var2 = y1Var.f30163a;
                if (x51Var2 != null && (v51Var = x51Var2.Y2) != null && x51Var2.G) {
                    v51Var.N(true);
                    return;
                }
                return;
            case 6:
                pg.d0 d0Var = (pg.d0) obj2;
                pg.g1 g1Var2 = (pg.g1) obj;
                pg.d1 d1Var = d0Var.f40777a;
                if (g1Var2 != null) {
                    float currentWeight = d1Var.getCurrentWeight();
                    g1Var2.f40819f = currentWeight;
                    double d = d0Var.f40789p;
                    if (d > 0.0d) {
                        g1Var2.f40819f = (float) ((d / d0Var.f40790q) * currentWeight);
                    }
                    if (g1Var2.f40816a.o() == 4) {
                        g1Var2.f40823k *= g1Var2.f40819f;
                    }
                }
                pg.r0 painting = d1Var.getPainting();
                if (painting.L == null) {
                    painting.f40908f.f(new pg.n0(painting, g1Var2, 1));
                    return;
                }
                return;
            case 7:
                ph.i iVar = (ph.i) obj2;
                if (((ph.b) obj) == ph.b.d && ((i10 = iVar.f41023s) == 2 || i10 == 3)) {
                    iVar.f41023s = 1;
                }
                iVar.h.run();
                return;
            case 8:
                ci.b6 b6Var = (ci.b6) obj2;
                TextureView textureView = (TextureView) obj;
                b6Var.f41328w0 = textureView;
                if (textureView != null) {
                    b6Var.f41322q0.addView(textureView, 0);
                    return;
                }
                return;
            case 9:
                qg.v2 v2Var = (qg.v2) obj2;
                v2Var.f41640n = (Bitmap) obj;
                Paint paint = new Paint(1);
                v2Var.f41642s = paint;
                Bitmap bitmap = v2Var.f41640n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                v2Var.f41641r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                v2Var.f41642s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                v2Var.v = new Matrix();
                return;
            case 10:
                qh.c cVar = (qh.c) obj2;
                qh.e eVar = (qh.e) obj;
                cVar.h = eVar;
                cVar.f41706c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(cVar, 18), 200L);
                return;
            case 11:
                ((rg.j0) obj2).E1((HashMap) obj);
                return;
            case 12:
                rg.v1 v1Var = (rg.v1) obj2;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (v1Var.d != isEnabled) {
                    v1Var.d = isEnabled;
                    v1Var.invalidate();
                    return;
                }
                return;
            case 13:
                MessageObject messageObject = (MessageObject) obj2;
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
                long j3 = messageObject.messageOwner.date * 1000;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = tg.k.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yb ybVar = new yb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ybVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        ybVar.f30192b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            ybVar.c(R.raw.forward, 30, 30, new String[0]);
                            ybVar.f30192b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            ybVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            ybVar.f30192b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    ybVar.f30192b.setSingleLine(false);
                    ybVar.f30192b.setMaxLines(2);
                    oc ocVar = new oc(R.getParentActivity(), R.getResourceProvider(), true);
                    ocVar.e(LocaleController.getString(R.string.LearnMore));
                    ocVar.f26716a = new ci.u1(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, R);
                    ybVar.setButton(ocVar);
                    qc.g(R, ybVar, 2750).j();
                    return;
                }
                return;
            case 14:
                tg.t0 t0Var = (tg.t0) obj2;
                t0Var.f43173a0.setLoading(false);
                tg.k.j(t0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 15:
                th.f.P((th.f) obj2, (Pair) obj);
                return;
            case 16:
                HashMap hashMap = ((ug.b) obj2).f43662w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 17:
                ((ug.e) obj2).F((TLObject) obj);
                return;
            case 18:
                HashMap hashMap2 = ((ug.h) obj2).f43687r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 19:
                uh.h hVar = (uh.h) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = hVar.K;
                if (hVar.T) {
                    hVar.I.recycle();
                    return;
                }
                hVar.I = bitmap2;
                Bitmap bitmap3 = hVar.I;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                hVar.J = new BitmapShader(bitmap3, tileMode2, tileMode2);
                Paint paint2 = new Paint(2);
                hVar.L = paint2;
                paint2.setShader(hVar.J);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 1.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = 0.02f;
                } else {
                    f10 = -0.15f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f10);
                hVar.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                matrix.reset();
                matrix.setScale(15.0f, 15.0f);
                hVar.J.setLocalMatrix(matrix);
                return;
            case 20:
                Boolean bool2 = (Boolean) obj;
                ((xh.o1) obj2).a();
                return;
            case 21:
                ((xh.i4) obj2).e0(((Boolean) obj).booleanValue());
                return;
            case 22:
                ((Boolean) obj).getClass();
                xh.z3 z3Var = ((xh.g4) obj2).d;
                if (z3Var != null) {
                    z3Var.run();
                    return;
                }
                return;
            case 23:
                tg.k.j(((xh.z4) obj2).getContext(), (TLRPC.TL_error) obj);
                return;
            case 24:
                yh.a0 a0Var = (yh.a0) obj2;
                int i12 = yh.a0.f46847w0[((Integer) obj).intValue()];
                if (a0Var.f46860n0 != i12) {
                    a0Var.f46860n0 = i12;
                    a0Var.f46853f0.setText(LocaleController.formatPluralString("GiftOfferHours", i12 / 3600, new Object[0]));
                }
                a0Var.T(true);
                return;
            case 25:
                yh.s0 s0Var = (yh.s0) obj2;
                Integer num = (Integer) obj;
                s0Var.f47662i0.g();
                s0Var.f47664k0.N(true);
                return;
            case 26:
                yh.j2 j2Var = (yh.j2) obj2;
                j2Var.getClass();
                j2Var.f47243s = new Matrix();
                j2Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                j2Var.f47242r = bitmapShader2;
                Paint paint3 = j2Var.f47239c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 27:
                yh.t5.a((yh.t5) obj2, (TL_stars.StarGifts) obj);
                return;
            case 28:
                ((org.telegram.ui.ActionBar.f3) obj2).dismiss(((Boolean) obj).booleanValue());
                return;
            default:
                TextView textView = (TextView) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        if (starGift.availability_remains <= 0) {
                            str2 = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str2 = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str2);
                        return;
                    }
                    int i13 = starGift.availability_remains;
                    if (i13 <= 0) {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability4Value", i13, LocaleController.formatNumber(starGift.availability_total, ','));
                    }
                    textView.setText(formatPluralStringComma);
                    return;
                }
                return;
        }
    }
}
