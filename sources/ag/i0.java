package ag;

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
import bg.c4;
import cg.s2;
import ih.e6;
import ih.p5;
import ih.r5;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import jh.r3;
import jh.s7;
import lh.d4;
import lh.i9;
import lh.k6;
import lh.s6;
import nh.f5;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.LaunchActivity;
public final class i0 implements Utilities.Callback {
    public final int f529a;
    public final Object f530b;

    public i0(Object obj, int i10) {
        this.f529a = i10;
        this.f530b = obj;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        float f9;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z10;
        float f10;
        String formatPluralStringComma;
        String str;
        float f11 = 0.08f;
        switch (this.f529a) {
            case 0:
                n0 n0Var = (n0) this.f530b;
                w1 w1Var = (w1) obj;
                t1 t1Var = n0Var.f592a;
                if (w1Var != null) {
                    float currentWeight = t1Var.getCurrentWeight();
                    w1Var.f698f = currentWeight;
                    double d = n0Var.f605p;
                    if (d > 0.0d) {
                        w1Var.f698f = (float) ((d / n0Var.f606q) * currentWeight);
                    }
                    if (w1Var.f694a.o() == 4) {
                        w1Var.f702k *= w1Var.f698f;
                    }
                }
                f1 painting = t1Var.getPainting();
                if (painting.L == null) {
                    painting.f473f.f(new a1(painting, w1Var, 1));
                    return;
                }
                return;
            case 1:
                ah.i iVar = (ah.i) this.f530b;
                if (((ah.b) obj) == ah.b.d && ((i10 = iVar.f756s) == 2 || i10 == 3)) {
                    iVar.f756s = 1;
                }
                iVar.h.run();
                return;
            case 2:
                f5 f5Var = (f5) this.f530b;
                TextureView textureView = (TextureView) obj;
                f5Var.f2153s0 = textureView;
                if (textureView != null) {
                    f5Var.m0.addView(textureView, 0);
                    return;
                }
                return;
            case 3:
                c4 c4Var = (c4) this.f530b;
                c4Var.f2131n = (Bitmap) obj;
                Paint paint = new Paint(1);
                c4Var.f2133s = paint;
                Bitmap bitmap = c4Var.f2131n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                c4Var.f2132r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (!g6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (g6.I.q()) {
                    f9 = -0.02f;
                } else {
                    f9 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f9);
                c4Var.f2133s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                c4Var.v = new Matrix();
                return;
            case 4:
                bh.f fVar = (bh.f) this.f530b;
                bh.h hVar = (bh.h) obj;
                fVar.h = hVar;
                fVar.f2656c.a(hVar, true);
                AndroidUtilities.runOnUIThread(new a4.g(fVar, 17), 200L);
                return;
            case 5:
                ((cg.v0) this.f530b).E1((HashMap) obj);
                return;
            case 6:
                s2 s2Var = (s2) this.f530b;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (s2Var.d != isEnabled) {
                    s2Var.d = isEnabled;
                    s2Var.invalidate();
                    return;
                }
                return;
            case 7:
                MessageObject messageObject = (MessageObject) this.f530b;
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
                o2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = eg.s.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ub ubVar = new ub(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ubVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        ubVar.f33185b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            ubVar.c(R.raw.forward, 30, 30, new String[0]);
                            ubVar.f33185b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            ubVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            ubVar.f33185b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    ubVar.f33185b.setSingleLine(false);
                    ubVar.f33185b.setMaxLines(2);
                    kc kcVar = new kc(R.getParentActivity(), R.getResourceProvider(), true);
                    kcVar.e(LocaleController.getString(R.string.LearnMore));
                    kcVar.f30007a = new eg.j(payments_giveawayinfo, z10, b10, j10, tL_messageMediaGiveaway2, R);
                    ubVar.setButton(kcVar);
                    mc.g(R, ubVar, 2750).j();
                    return;
                }
                return;
            case 8:
                eg.x1 x1Var = (eg.x1) this.f530b;
                x1Var.W.setLoading(false);
                eg.s.j(x1Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 9:
                eh.f.P((eh.f) this.f530b, (Pair) obj);
                return;
            case 10:
                HashMap hashMap = ((fg.b) this.f530b).f6732w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 11:
                ((fg.e) this.f530b).F((TLObject) obj);
                return;
            case 12:
                HashMap hashMap2 = ((fg.h) this.f530b).f6759n;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 13:
                fh.j jVar = (fh.j) this.f530b;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = jVar.G;
                if (jVar.P) {
                    jVar.E.recycle();
                    return;
                }
                jVar.E = bitmap2;
                Bitmap bitmap3 = jVar.E;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                jVar.F = new BitmapShader(bitmap3, tileMode2, tileMode2);
                Paint paint2 = new Paint(2);
                jVar.H = paint2;
                paint2.setShader(jVar.F);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (!g6.I.q()) {
                    f11 = 1.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (g6.I.q()) {
                    f10 = 0.02f;
                } else {
                    f10 = -0.15f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f10);
                jVar.H.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                matrix.reset();
                matrix.setScale(15.0f, 15.0f);
                jVar.F.setLocalMatrix(matrix);
                return;
            case 14:
                Boolean bool2 = (Boolean) obj;
                ((ih.d2) this.f530b).a();
                return;
            case 15:
                ((r5) this.f530b).e0(((Boolean) obj).booleanValue());
                return;
            case 16:
                ((Boolean) obj).getClass();
                ih.f5 f5Var2 = ((p5) this.f530b).d;
                if (f5Var2 != null) {
                    f5Var2.run();
                    return;
                }
                return;
            case 17:
                eg.s.j(((e6) this.f530b).getContext(), (TLRPC.TL_error) obj);
                return;
            case 18:
                jh.n0 n0Var2 = (jh.n0) this.f530b;
                int i11 = jh.n0.f12481s0[((Integer) obj).intValue()];
                if (n0Var2.f12491j0 != i11) {
                    n0Var2.f12491j0 = i11;
                    n0Var2.f12483b0.setText(LocaleController.formatPluralString("GiftOfferHours", i11 / 3600, new Object[0]));
                }
                n0Var2.T(true);
                return;
            case 19:
                jh.j1 j1Var = (jh.j1) this.f530b;
                Integer num = (Integer) obj;
                j1Var.f12287e0.g();
                j1Var.f12289g0.N(true);
                return;
            case 20:
                r3 r3Var = (r3) this.f530b;
                r3Var.getClass();
                r3Var.f12702s = new Matrix();
                r3Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                r3Var.f12701r = bitmapShader2;
                Paint paint3 = r3Var.f12697c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 21:
                s7.a((s7) this.f530b, (TL_stars.StarGifts) obj);
                return;
            case 22:
                ((f3) this.f530b).dismiss(((Boolean) obj).booleanValue());
                return;
            case 23:
                TextView textView = (TextView) this.f530b;
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
                lh.d1 d1Var = (lh.d1) this.f530b;
                if (((Boolean) obj).booleanValue() && !d1Var.f15461w) {
                    d1Var.f15458n = true;
                    d1Var.E = true;
                    d1Var.u(false);
                    lh.d1.S = d1Var;
                    d1Var.F = NativeInstance.createVideoCapturer(d1Var.D, d1Var.E ? 1 : 0);
                    if (d1Var.A != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = d1Var.A;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 4));
                        d1Var.I.clear();
                        d1Var.A = null;
                    }
                    d1Var.c();
                    d1Var.k();
                    NotificationCenter.getInstance(d1Var.f15456e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var.f15457f.f22409id));
                    return;
                }
                return;
            case 25:
                d4 d4Var = (d4) this.f530b;
                d4Var.H3 = ((Long) obj).longValue();
                lh.n2 n2Var = d4Var.X1;
                if (n2Var != null) {
                    n2Var.J(true);
                    d4Var.X1.R1();
                }
                d4Var.r0(true);
                return;
            case 26:
                i9 i9Var = (i9) this.f530b;
                Boolean bool3 = (Boolean) obj;
                i9Var.f15760g1 = false;
                i9Var.P();
                return;
            case 27:
                s6 s6Var = (s6) this.f530b;
                k6 k6Var = (k6) obj;
                HashMap hashMap3 = s6Var.H;
                int i13 = k6Var.f15835e;
                int i14 = k6Var.f15836f;
                long j11 = k6Var.d;
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
                HashMap hashMap5 = s6Var.G[i13];
                if (hashMap5 != null) {
                    hashMap5.remove(Long.valueOf(j11));
                    return;
                }
                return;
            case 28:
                mh.v vVar = (mh.v) this.f530b;
                String str2 = (String) obj;
                ArrayList arrayList = vVar.h;
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                    vVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new lh.r3(23, vVar, str2), 120L);
                return;
            default:
                ((nh.m) this.f530b).x(((Integer) obj).intValue());
                return;
        }
    }
}
