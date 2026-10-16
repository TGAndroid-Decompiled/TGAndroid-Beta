package ji;

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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class p1 implements Utilities.Callback {
    public final int f13462a;
    public final Object f13463b;

    public p1(Object obj, int i10) {
        this.f13462a = i10;
        this.f13463b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        a71 a71Var;
        int i10;
        float f7;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z10;
        float f10;
        String formatPluralStringComma;
        String str2;
        int i11 = this.f13462a;
        float f11 = 0.08f;
        Object obj2 = this.f13463b;
        switch (i11) {
            case 0:
                ((d2) obj2).P.V1((TL_iv.RichMessage) obj);
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
                AndroidUtilities.hideKeyboard((nu) obj2);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 3:
                org.telegram.ui.web.z0 z0Var = ((BotWebViewContainer$WebViewProxy) obj2).f40951b;
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
                h1Var.e = (ArrayList) obj;
                c71 c71Var = h1Var.f24003a;
                if (c71Var.G) {
                    c71Var.W2.N(true);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj2;
                z1Var.f41272n = ((ArrayList) obj).size();
                c71 c71Var2 = z1Var.f24003a;
                if (c71Var2 != null && (a71Var = c71Var2.W2) != null && c71Var2.G) {
                    a71Var.N(true);
                    return;
                }
                return;
            case 6:
                qg.d0 d0Var = (qg.d0) obj2;
                qg.f1 f1Var = (qg.f1) obj;
                qg.c1 c1Var = d0Var.f43149a;
                if (f1Var != null) {
                    float currentWeight = c1Var.getCurrentWeight();
                    f1Var.f43180f = currentWeight;
                    double d = d0Var.f43161p;
                    if (d > 0.0d) {
                        f1Var.f43180f = (float) ((d / d0Var.f43162q) * currentWeight);
                    }
                    if (f1Var.f43177a.o() == 4) {
                        f1Var.f43184k *= f1Var.f43180f;
                    }
                }
                qg.q0 painting = c1Var.getPainting();
                if (painting.L == null) {
                    painting.f43266f.f(new qg.m0(painting, f1Var, 1));
                    return;
                }
                return;
            case 7:
                qh.i iVar = (qh.i) obj2;
                if (((qh.b) obj) == qh.b.d && ((i10 = iVar.f43386s) == 2 || i10 == 3)) {
                    iVar.f43386s = 1;
                }
                iVar.h.run();
                return;
            case 8:
                di.a6 a6Var = (di.a6) obj2;
                TextureView textureView = (TextureView) obj;
                a6Var.f44023w0 = textureView;
                if (textureView != null) {
                    a6Var.f44017q0.addView(textureView, 0);
                    return;
                }
                return;
            case 9:
                rg.v2 v2Var = (rg.v2) obj2;
                v2Var.f44344n = (Bitmap) obj;
                Paint paint = new Paint(1);
                v2Var.f44346s = paint;
                Bitmap bitmap = v2Var.f44344n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                v2Var.f44345r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.g6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                v2Var.f44346s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                v2Var.v = new Matrix();
                return;
            case 10:
                rh.c cVar = (rh.c) obj2;
                rh.e eVar = (rh.e) obj;
                cVar.h = eVar;
                cVar.f44413c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(cVar, 26), 200L);
                return;
            case 11:
                ((sg.j0) obj2).F1((HashMap) obj);
                return;
            case 12:
                sg.x1 x1Var = (sg.x1) obj2;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (x1Var.d != isEnabled) {
                    x1Var.d = isEnabled;
                    x1Var.invalidate();
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
                long j10 = messageObject.messageOwner.date * 1000;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = ug.j.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ac acVar = new ac(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        acVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        acVar.f23192b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            acVar.c(R.raw.forward, 30, 30, new String[0]);
                            acVar.f23192b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            acVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            acVar.f23192b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    acVar.f23192b.setSingleLine(false);
                    acVar.f23192b.setMaxLines(2);
                    qc qcVar = new qc(R.getParentActivity(), R.getResourceProvider(), true);
                    qcVar.e(LocaleController.getString(R.string.LearnMore));
                    qcVar.f28266a = new di.t1(payments_giveawayinfo, z10, b10, j10, tL_messageMediaGiveaway2, R);
                    acVar.setButton(qcVar);
                    sc.g(R, acVar, 2750).j();
                    return;
                }
                return;
            case 14:
                ug.s0 s0Var = (ug.s0) obj2;
                s0Var.f46387a0.setLoading(false);
                ug.j.j(s0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 15:
                uh.f.Q((uh.f) obj2, (Pair) obj);
                return;
            case 16:
                HashMap hashMap = ((vg.b) obj2).f46966w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 17:
                ((vg.e) obj2).F((TLObject) obj);
                return;
            case 18:
                HashMap hashMap2 = ((vg.h) obj2).f46991r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 19:
                vh.h hVar = (vh.h) obj2;
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
                if (!org.telegram.ui.ActionBar.g6.I.q()) {
                    f11 = 1.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
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
                ((yh.m1) obj2).a();
                return;
            case 21:
                ((yh.g4) obj2).e0(((Boolean) obj).booleanValue());
                return;
            case 22:
                ((Boolean) obj).getClass();
                yh.x3 x3Var2 = ((yh.e4) obj2).d;
                if (x3Var2 != null) {
                    x3Var2.run();
                    return;
                }
                return;
            case 23:
                ug.j.j(((yh.x4) obj2).getContext(), (TLRPC.TL_error) obj);
                return;
            case 24:
                zh.z zVar = (zh.z) obj2;
                int i12 = zh.z.f51343w0[((Integer) obj).intValue()];
                if (zVar.f51356n0 != i12) {
                    zVar.f51356n0 = i12;
                    zVar.f51349f0.setText(LocaleController.formatPluralString("GiftOfferHours", i12 / 3600, new Object[0]));
                }
                zVar.U(true);
                return;
            case 25:
                zh.r0 r0Var = (zh.r0) obj2;
                Integer num = (Integer) obj;
                r0Var.f51042i0.g();
                r0Var.f51044k0.N(true);
                return;
            case 26:
                zh.e2 e2Var = (zh.e2) obj2;
                e2Var.getClass();
                e2Var.f50419s = new Matrix();
                e2Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                e2Var.f50418r = bitmapShader2;
                Paint paint3 = e2Var.f50415c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 27:
                zh.n5.a((zh.n5) obj2, (TL_stars.StarGifts) obj);
                return;
            case 28:
                ((org.telegram.ui.ActionBar.e3) obj2).dismiss(((Boolean) obj).booleanValue());
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
