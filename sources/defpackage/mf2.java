package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class mf2 implements qac {
    public final byte a;
    public final Object b;

    public mf2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z;
        l7c l7cVar;
        Editable editable;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User W1;
        TL_account.TL_businessBotRights makeDefault;
        boolean z2;
        l7c l7cVar2;
        byte b = this.a;
        String str = "";
        ll0 ll0Var = null;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        boolean z3 = false;
        boolean z4 = true;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                uf2 uf2Var = (uf2) obj2;
                List<TLRPC.TL_chatThemeUniqueGift> list = (List) obj;
                if (list != null) {
                    for (TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift : list) {
                        uf2Var.e.put(tL_chatThemeUniqueGift.gift.slug, new tz3(uf2Var.currentAccount, tL_chatThemeUniqueGift));
                    }
                    return;
                }
                return;
            case 1:
                w7 w7Var = (w7) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = w7Var.G;
                w7Var.a0 = false;
                w7Var.f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                w7Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = w7Var.n;
                if (matrix == null) {
                    w7Var.n = new Matrix();
                } else {
                    matrix.reset();
                }
                w7Var.n.postScale(8.0f, 8.0f);
                Matrix matrix2 = w7Var.n;
                int[] iArr = w7Var.r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                w7Var.h.setLocalMatrix(w7Var.n);
                paint.setShader(w7Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                gm.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                w7Var.invalidate();
                return;
            case 2:
                he heVar = (he) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    if (heVar.G0 == null) {
                        heVar.G0 = new Paint(1);
                    }
                    heVar.D0 = bitmap2;
                    Bitmap bitmap3 = heVar.D0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    heVar.F0 = bitmapShader;
                    heVar.G0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    heVar.E0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = heVar.E0;
                    int[] iArr2 = heVar.y0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    heVar.F0.setLocalMatrix(heVar.E0);
                    heVar.b1.invalidate();
                    return;
                }
                return;
            case 3:
                Object[] objArr = (Object[]) obj;
                ((eh) obj2).run();
                return;
            case 4:
                o oVar = ((sx) obj2).L;
                if (((Integer) obj).intValue() - gm.n > gm.L(20.0f)) {
                    z3 = true;
                }
                oVar.p0 = z3;
                return;
            case 5:
                HashMap hashMap = ((kn0) obj2).x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 6:
                k47 k47Var = (k47) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = k47Var.k.media;
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
                long j = k47Var.k.date * 1000;
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    String b2 = yn0.b(k47Var);
                    TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-k47Var.Z0()));
                    if (L0 != null && sd2.V(L0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    b31 b31Var = new b31(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        b31Var.c(2131623982, 30, 30, new String[0]);
                        b31Var.b.setText(jb6.M0(2131753336, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            b31Var.c(2131624029, 30, 30, new String[0]);
                            b31Var.b.setText(jb6.M0(2131753334, null));
                        } else {
                            b31Var.c(2131623982, 30, 30, new String[0]);
                            b31Var.b.setText(jb6.M0(2131753335, null));
                        }
                    }
                    b31Var.b.setSingleLine(false);
                    b31Var.b.setMaxLines(2);
                    s31 s31Var = new s31(Q.getResourceProvider(), Q.getParentActivity(), true);
                    s31Var.e(jb6.M0(2131748767, null));
                    s31Var.b = new aa7(payments_giveawayinfo, z, b2, j, tL_messageMediaGiveaway2, Q);
                    b31Var.setButton(s31Var);
                    u31.g(Q, b31Var, 2750).j();
                    return;
                }
                return;
            case 7:
                vp0 vp0Var = (vp0) obj2;
                ArrayList arrayList = vp0Var.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                q7c q7cVar = vp0Var.a;
                if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
                    l7cVar.O(true);
                    return;
                }
                return;
            case 8:
                ks0 ks0Var = (ks0) obj2;
                String str2 = (String) obj;
                ArrayList arrayList2 = ks0Var.h;
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                    ks0Var.i(true);
                }
                gm.d3(new x30(ks0Var, str2, (byte) 16), 120L);
                return;
            case 9:
                mw0 mw0Var = ((BotWebViewContainer$WebViewProxy) obj2).b;
                StringBuilder sb = new StringBuilder("window.navigator.__share__receive(");
                String str3 = str;
                if (!((Boolean) obj).booleanValue()) {
                    str3 = "'abort'";
                }
                sb.append(str3);
                sb.append(")");
                mw0Var.c(sb.toString());
                return;
            case 10:
                f51 f51Var = (f51) obj2;
                if (((Integer) obj).intValue() <= gm.L(20.0f)) {
                    z4 = false;
                }
                if (f51Var.G != z4) {
                    f51Var.G = z4;
                    if (!z4) {
                        f51Var.a.z0(0);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((pc1) obj2).x(((Integer) obj).intValue());
                return;
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                jc1 jc1Var = ((tc1) obj2).f;
                jc1Var.setText(charSequence);
                jc1Var.w(charSequence.length(), charSequence.length());
                return;
            case 13:
                ((fd1) obj2).R(((Long) obj).longValue());
                return;
            case 14:
                gm.c3(new y31((sh1) obj2, (TL_stories.TL_premium_boostsStatus) obj, (byte) 23));
                return;
            case 15:
                gm.c3(new y31((ik1) obj2, (TL_stories.TL_premium_boostsStatus) obj, (byte) 29));
                return;
            case 16:
                ((eg9) obj2).a((vm3) obj);
                return;
            case 17:
                ((jlc) obj2).setEditMenuProgress(((Float) obj).floatValue());
                return;
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((p62) obj2).w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                return;
            case 19:
                Object[] objArr2 = (Object[]) obj;
                gm.d0(((a82) obj2).s, new bn0((byte) 6));
                return;
            case 20:
                tg9 tg9Var = (tg9) obj2;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i = tg9Var.b;
                int i2 = tg9Var.a;
                ch9 ch9Var = tg9Var.e;
                if (richMessage != null) {
                    ArrayList arrayList3 = ch9Var.t3;
                    ArrayList arrayList4 = ch9Var.t3;
                    if (i2 < arrayList3.size() && i < arrayList4.size()) {
                        of9 of9Var = ch9Var.R3;
                        if (of9Var != null) {
                            of9Var.d();
                        }
                        qg9 qg9Var = ch9Var.v3;
                        if (qg9Var != null) {
                            qg9Var.e(false);
                        }
                        ll0 ll0Var2 = (ll0) arrayList4.get(i2);
                        ll0 ll0Var3 = (ll0) arrayList4.get(i);
                        if (!ch9.w3(ll0Var2.b)) {
                            editable = "";
                        } else {
                            editable = ch9Var.P4(ll0Var2);
                        }
                        Editable editable2 = str;
                        if (ch9.w3(ll0Var3.b)) {
                            editable2 = ch9Var.P4(ll0Var3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(tg9Var.c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(editable2.subSequence(Math.max(0, Math.min(tg9Var.d, editable2.length())), editable2.length()));
                        ArrayList arrayList5 = new ArrayList();
                        ch9.S2(arrayList5, richMessage.blocks, null);
                        if (arrayList5.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            xk9.b(pageblockparagraph, spannableStringBuilder3);
                            arrayList5.add(new ll0(pageblockparagraph, ll0Var2.c, ll0Var2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ll0 ll0Var4 = (ll0) arrayList5.get(0);
                                if (ch9.w3(ll0Var4.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) xk9.z(ll0Var4.b));
                                    xk9.b(ll0Var4.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    xk9.b(pageblockparagraph2, spannableStringBuilder);
                                    arrayList5.add(0, new ll0(pageblockparagraph2, ll0Var2.c, ll0Var2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ll0 ll0Var5 = (ll0) b10.f(1, arrayList5);
                                if (ch9.w3(ll0Var5.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(xk9.z(ll0Var5.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    xk9.b(ll0Var5.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    xk9.b(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList5.add(new ll0(pageblockparagraph3, ll0Var3.c, ll0Var3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = ch9Var.s3;
                        if (richMessage2 == null) {
                            ch9Var.s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList6 = richMessage.photos;
                            if (arrayList6 != null) {
                                richMessage2.photos.addAll(arrayList6);
                            }
                            ArrayList<TLRPC.Document> arrayList7 = richMessage.documents;
                            if (arrayList7 != null) {
                                ch9Var.s3.documents.addAll(arrayList7);
                            }
                        }
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            ch9Var.w4((ll0) arrayList5.get(i3));
                        }
                        while (i >= i2) {
                            arrayList4.remove(i);
                            i--;
                        }
                        arrayList4.addAll(i2, arrayList5);
                        ch9Var.t4();
                        ch9Var.g3.O(false);
                        of9 of9Var2 = ch9Var.R3;
                        if (of9Var2 != null) {
                            of9Var2.h();
                        }
                        ch9Var.p3.onContentChanged();
                        if (!arrayList5.isEmpty()) {
                            ll0Var = (ll0) b10.f(1, arrayList5);
                        }
                        ch9Var.post(new ey8(tg9Var, ll0Var, (byte) 24));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ((l82) obj2).a.r.Q1((TL_iv.RichMessage) obj);
                return;
            case 22:
                ((je2) obj2).e.T = (String) obj;
                return;
            case 23:
                wg2 wg2Var = ((sg2) obj2).d;
                wg2Var.A1 = ((Integer) obj).intValue();
                gm.U3(wg2Var.r0, wg2Var.c);
                return;
            case 24:
                hh2 hh2Var = (hh2) obj2;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                hh2Var.H = connectedbots;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = hh2Var.H.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                hh2Var.I = tL_connectedBot;
                if (tL_connectedBot == null) {
                    W1 = null;
                } else {
                    W1 = hh2Var.getMessagesController().W1(Long.valueOf(hh2Var.I.bot_id));
                }
                hh2Var.N = W1;
                TL_account.TL_connectedBot tL_connectedBot2 = hh2Var.I;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                hh2Var.K = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = hh2Var.I;
                if (tL_connectedBot3 != null) {
                    z2 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z2 = true;
                }
                hh2Var.J = z2;
                t51 t51Var = hh2Var.w;
                if (t51Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    t51Var.i(tL_businessBotRecipients);
                }
                q7c q7cVar2 = hh2Var.c;
                if (q7cVar2 != null && (l7cVar2 = q7cVar2.g3) != null) {
                    l7cVar2.O(true);
                }
                hh2Var.a0(true);
                hh2Var.U = true;
                return;
            case 25:
                cm2 cm2Var = (cm2) obj2;
                cm2Var.k0.n.P = ((Float) obj).floatValue();
                bm2 bm2Var = cm2Var.k0;
                am2 am2Var = bm2Var.d;
                if (am2Var != null) {
                    am2Var.setVolume(bm2Var.n.P);
                    return;
                }
                return;
            case 26:
                io2 io2Var = (io2) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = io2Var.n;
                z3 = (arrayList9 == null || arrayList9.isEmpty()) ? true : true;
                io2Var.n = arrayList8;
                q7c q7cVar3 = io2Var.f;
                if (q7cVar3 != null) {
                    q7cVar3.g3.O(z3);
                    return;
                }
                return;
            case 27:
                ((tu2) obj2).c0((TL_account.TL_birthday) obj);
                return;
            default:
                ((hz2) obj2).a1((Pair) obj);
                return;
        }
    }
}
