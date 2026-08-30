package cg;

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
import dg.y3;
import eg.q2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import kh.e6;
import kh.f5;
import kh.p5;
import kh.r5;
import lh.q3;
import lh.t7;
import nh.d4;
import nh.i9;
import nh.l6;
import nh.n4;
import nh.o2;
import nh.t6;
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
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.vt;
import org.telegram.ui.LaunchActivity;
import ph.o4;
public final class h0 implements Utilities.Callback {
    public final int f2413a;
    public final Object f2414b;

    public h0(Object obj, int i10) {
        this.f2413a = i10;
        this.f2414b = obj;
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
        float f12 = 0.08f;
        switch (this.f2413a) {
            case 0:
                m0 m0Var = (m0) this.f2414b;
                s1 s1Var = (s1) obj;
                p1 p1Var = m0Var.f2448a;
                if (s1Var != null) {
                    float currentWeight = p1Var.getCurrentWeight();
                    s1Var.f2519f = currentWeight;
                    double d = m0Var.f2460p;
                    if (d > 0.0d) {
                        s1Var.f2519f = (float) ((d / m0Var.f2461q) * currentWeight);
                    }
                    if (s1Var.f2516a.o() == 4) {
                        s1Var.f2523k *= s1Var.f2519f;
                    }
                }
                d1 painting = p1Var.getPainting();
                if (painting.L == null) {
                    painting.f2337f.f(new y0(painting, s1Var, 1));
                    return;
                }
                return;
            case 1:
                ch.i iVar = (ch.i) this.f2414b;
                if (((ch.b) obj) == ch.b.d && ((i10 = iVar.f2612s) == 2 || i10 == 3)) {
                    iVar.f2612s = 1;
                }
                iVar.h.run();
                return;
            case 2:
                o4 o4Var = (o4) this.f2414b;
                TextureView textureView = (TextureView) obj;
                o4Var.f4356t0 = textureView;
                if (textureView != null) {
                    o4Var.f4350n0.addView(textureView, 0);
                    return;
                }
                return;
            case 3:
                y3 y3Var = (y3) this.f2414b;
                y3Var.f4866n = (Bitmap) obj;
                Paint paint = new Paint(1);
                y3Var.f4868s = paint;
                Bitmap bitmap = y3Var.f4866n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                y3Var.f4867r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (!j6.I.q()) {
                    f12 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f12);
                if (j6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                y3Var.f4868s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                y3Var.v = new Matrix();
                return;
            case 4:
                dh.f fVar = (dh.f) this.f2414b;
                dh.h hVar = (dh.h) obj;
                fVar.h = hVar;
                fVar.f4893c.a(hVar, true);
                AndroidUtilities.runOnUIThread(new ag.d(fVar, 25), 200L);
                return;
            case 5:
                ((eg.v0) this.f2414b).E1((HashMap) obj);
                return;
            case 6:
                q2 q2Var = (q2) this.f2414b;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (q2Var.d != isEnabled) {
                    q2Var.d = isEnabled;
                    q2Var.invalidate();
                    return;
                }
                return;
            case 7:
                MessageObject messageObject = (MessageObject) this.f2414b;
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
                p2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = gg.r.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    qb qbVar = new qb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        qbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        qbVar.f28100b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            qbVar.c(R.raw.forward, 30, 30, new String[0]);
                            qbVar.f28100b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            qbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            qbVar.f28100b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    qbVar.f28100b.setSingleLine(false);
                    qbVar.f28100b.setMaxLines(2);
                    gc gcVar = new gc(R.getParentActivity(), R.getResourceProvider(), true);
                    gcVar.e(LocaleController.getString(R.string.LearnMore));
                    gcVar.f25097a = new gg.j(payments_giveawayinfo, z4, b10, j10, tL_messageMediaGiveaway2, R);
                    qbVar.setButton(gcVar);
                    ic.g(R, qbVar, 2750).j();
                    return;
                }
                return;
            case 8:
                gg.w1 w1Var = (gg.w1) this.f2414b;
                w1Var.X.setLoading(false);
                gg.r.j(w1Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 9:
                gh.f.P((gh.f) this.f2414b, (Pair) obj);
                return;
            case 10:
                HashMap hashMap = ((hg.b) this.f2414b).f7079w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 11:
                ((hg.e) this.f2414b).F((TLObject) obj);
                return;
            case 12:
                HashMap hashMap2 = ((hg.h) this.f2414b).f7103n;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 13:
                hh.j jVar = (hh.j) this.f2414b;
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
                if (!j6.I.q()) {
                    f12 = 1.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f12);
                if (j6.I.q()) {
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
                ((kh.d2) this.f2414b).a();
                return;
            case 15:
                ((r5) this.f2414b).e0(((Boolean) obj).booleanValue());
                return;
            case 16:
                ((Boolean) obj).getClass();
                f5 f5Var = ((p5) this.f2414b).d;
                if (f5Var != null) {
                    f5Var.run();
                    return;
                }
                return;
            case 17:
                gg.r.j(((e6) this.f2414b).getContext(), (TLRPC.TL_error) obj);
                return;
            case 18:
                lh.n0 n0Var = (lh.n0) this.f2414b;
                int i11 = lh.n0.f12810t0[((Integer) obj).intValue()];
                if (n0Var.f12821k0 != i11) {
                    n0Var.f12821k0 = i11;
                    n0Var.f12813c0.setText(LocaleController.formatPluralString("GiftOfferHours", i11 / 3600, new Object[0]));
                }
                n0Var.T(true);
                return;
            case 19:
                lh.j1 j1Var = (lh.j1) this.f2414b;
                Integer num = (Integer) obj;
                j1Var.f12641f0.g();
                j1Var.f12643h0.N(true);
                return;
            case 20:
                q3 q3Var = (q3) this.f2414b;
                q3Var.getClass();
                q3Var.f12977s = new Matrix();
                q3Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                q3Var.f12976r = bitmapShader2;
                Paint paint3 = q3Var.f12973c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 21:
                t7.a((t7) this.f2414b, (TL_stars.StarGifts) obj);
                return;
            case 22:
                ((g3) this.f2414b).dismiss(((Boolean) obj).booleanValue());
                return;
            case 23:
                TextView textView = (TextView) this.f2414b;
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
                nh.e1 e1Var = (nh.e1) this.f2414b;
                if (((Boolean) obj).booleanValue() && !e1Var.f15299w) {
                    e1Var.f15296n = true;
                    e1Var.F = true;
                    e1Var.u(false);
                    nh.e1.T = e1Var;
                    e1Var.G = NativeInstance.createVideoCapturer(e1Var.E, e1Var.F ? 1 : 0);
                    if (e1Var.B != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = e1Var.B;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.s0(nativeInstance, 4));
                        e1Var.J.clear();
                        e1Var.B = null;
                    }
                    e1Var.c();
                    e1Var.k();
                    NotificationCenter.getInstance(e1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1Var.f15295f.f19201id));
                    return;
                }
                return;
            case 25:
                d4 d4Var = (d4) this.f2414b;
                d4Var.I3 = ((Long) obj).longValue();
                o2 o2Var = d4Var.Y1;
                if (o2Var != null) {
                    o2Var.J(true);
                    d4Var.Y1.R1();
                }
                d4Var.r0(true);
                return;
            case 26:
                i9 i9Var = (i9) this.f2414b;
                Boolean bool3 = (Boolean) obj;
                i9Var.f15467h1 = false;
                i9Var.P();
                return;
            case 27:
                t6 t6Var = (t6) this.f2414b;
                l6 l6Var = (l6) obj;
                HashMap hashMap3 = t6Var.H;
                int i13 = l6Var.e;
                int i14 = l6Var.f15578f;
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
                oh.v vVar = (oh.v) this.f2414b;
                String str2 = (String) obj;
                ArrayList arrayList = vVar.h;
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                    vVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new n4(24, vVar, str2), 120L);
                return;
            default:
                AndroidUtilities.hideKeyboard((vt) this.f2414b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
        }
    }
}
