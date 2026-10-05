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
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.zb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class q1 implements Utilities.Callback {
    public final int f12584a;
    public final Object f12585b;

    public q1(Object obj, int i10) {
        this.f12584a = i10;
        this.f12585b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        w61 w61Var;
        int i10;
        float f7;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z10;
        float f10;
        String formatPluralStringComma;
        String str2;
        int i11 = this.f12584a;
        float f11 = 0.08f;
        Object obj2 = this.f12585b;
        switch (i11) {
            case 0:
                ((e2) obj2).P.V1((TL_iv.RichMessage) obj);
                return;
            case 1:
                x3 x3Var = (x3) obj2;
                String str3 = (String) obj;
                x3Var.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str3;
                    x3Var.S1(pageblockmath);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.hideKeyboard((eu) obj2);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 3:
                org.telegram.ui.web.z0 z0Var = ((BotWebViewContainer$WebViewProxy) obj2).f42103b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb2.append(str);
                sb2.append(")");
                z0Var.d(sb2.toString());
                return;
            case 4:
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) obj2;
                h1Var.f42218f = (ArrayList) obj;
                y61 y61Var = h1Var.f33438a;
                if (y61Var.G) {
                    y61Var.f26034f3.N(true);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) obj2;
                a2Var.f42119r = ((ArrayList) obj).size();
                y61 y61Var2 = a2Var.f33438a;
                if (y61Var2 != null && (w61Var = y61Var2.f26034f3) != null && y61Var2.G) {
                    w61Var.N(true);
                    return;
                }
                return;
            case 6:
                pg.e0 e0Var = (pg.e0) obj2;
                pg.i1 i1Var = (pg.i1) obj;
                pg.f1 f1Var = e0Var.f44466a;
                if (i1Var != null) {
                    float currentWeight = f1Var.getCurrentWeight();
                    i1Var.f44513f = currentWeight;
                    double d = e0Var.f44479p;
                    if (d > 0.0d) {
                        i1Var.f44513f = (float) ((d / e0Var.f44480q) * currentWeight);
                    }
                    if (i1Var.f44509a.o() == 4) {
                        i1Var.f44517k *= i1Var.f44513f;
                    }
                }
                pg.s0 painting = f1Var.getPainting();
                if (painting.L == null) {
                    painting.f44601f.f(new pg.o0(painting, i1Var, 1));
                    return;
                }
                return;
            case 7:
                ph.i iVar = (ph.i) obj2;
                if (((ph.b) obj) == ph.b.d && ((i10 = iVar.f44735s) == 2 || i10 == 3)) {
                    iVar.f44735s = 1;
                }
                iVar.h.run();
                return;
            case 8:
                ci.b6 b6Var = (ci.b6) obj2;
                TextureView textureView = (TextureView) obj;
                b6Var.f45026w0 = textureView;
                if (textureView != null) {
                    b6Var.f45020q0.addView(textureView, 0);
                    return;
                }
                return;
            case 9:
                qg.t2 t2Var = (qg.t2) obj2;
                t2Var.f45363n = (Bitmap) obj;
                Paint paint = new Paint(1);
                t2Var.f45365s = paint;
                Bitmap bitmap = t2Var.f45363n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t2Var.f45364r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.i6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                t2Var.f45365s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                t2Var.v = new Matrix();
                return;
            case 10:
                qh.c cVar = (qh.c) obj2;
                qh.e eVar = (qh.e) obj;
                cVar.h = eVar;
                cVar.f45461c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(cVar, 18), 200L);
                return;
            case 11:
                ((rg.k0) obj2).E1((HashMap) obj);
                return;
            case 12:
                rg.y1 y1Var = (rg.y1) obj2;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (y1Var.d != isEnabled) {
                    y1Var.d = isEnabled;
                    y1Var.invalidate();
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
                    String b10 = tg.i.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zb zbVar = new zb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        zbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        zbVar.f33480b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            zbVar.c(R.raw.forward, 30, 30, new String[0]);
                            zbVar.f33480b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            zbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            zbVar.f33480b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    zbVar.f33480b.setSingleLine(false);
                    zbVar.f33480b.setMaxLines(2);
                    pc pcVar = new pc(R.getParentActivity(), R.getResourceProvider(), true);
                    pcVar.e(LocaleController.getString(R.string.LearnMore));
                    pcVar.f29693a = new ci.u1(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, R);
                    zbVar.setButton(pcVar);
                    rc.g(R, zbVar, 2750).j();
                    return;
                }
                return;
            case 14:
                tg.s0 s0Var = (tg.s0) obj2;
                s0Var.f47108a0.setLoading(false);
                tg.i.j(s0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 15:
                th.f.N((th.f) obj2, (Pair) obj);
                return;
            case 16:
                HashMap hashMap = ((ug.b) obj2).f47658w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 17:
                ((ug.e) obj2).F((TLObject) obj);
                return;
            case 18:
                HashMap hashMap2 = ((ug.h) obj2).f47686r;
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
                if (!org.telegram.ui.ActionBar.i6.I.q()) {
                    f11 = 1.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
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
                ((xh.n1) obj2).a();
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
                tg.i.j(((xh.z4) obj2).getContext(), (TLRPC.TL_error) obj);
                return;
            case 24:
                yh.b0 b0Var = (yh.b0) obj2;
                int i12 = yh.b0.f51118w0[((Integer) obj).intValue()];
                if (b0Var.f51131n0 != i12) {
                    b0Var.f51131n0 = i12;
                    b0Var.f51124f0.setText(LocaleController.formatPluralString("GiftOfferHours", i12 / 3600, new Object[0]));
                }
                b0Var.R(true);
                return;
            case 25:
                yh.t0 t0Var = (yh.t0) obj2;
                Integer num = (Integer) obj;
                t0Var.f51994i0.g();
                t0Var.f51996k0.N(true);
                return;
            case 26:
                yh.j2 j2Var = (yh.j2) obj2;
                j2Var.getClass();
                j2Var.f51492s = new Matrix();
                j2Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                j2Var.f51491r = bitmapShader2;
                Paint paint3 = j2Var.f51487c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 27:
                yh.u5.a((yh.u5) obj2, (TL_stars.StarGifts) obj);
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
