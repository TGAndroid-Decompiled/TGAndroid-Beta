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
public final class be2 implements p8c {
    public final byte a;
    public final Object b;

    public be2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z;
        l5c l5cVar;
        Editable editable;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User V1;
        TL_account.TL_businessBotRights makeDefault;
        boolean z2;
        l5c l5cVar2;
        byte b = this.a;
        String str = "";
        lk0 lk0Var = null;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        boolean z3 = false;
        boolean z4 = true;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                je2 je2Var = (je2) obj2;
                List<TLRPC.TL_chatThemeUniqueGift> list = (List) obj;
                if (list != null) {
                    for (TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift : list) {
                        je2Var.e.put(tL_chatThemeUniqueGift.gift.slug, new jy3(je2Var.currentAccount, tL_chatThemeUniqueGift));
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
                gl.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                w7Var.invalidate();
                return;
            case 2:
                hd hdVar = (hd) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    if (hdVar.G0 == null) {
                        hdVar.G0 = new Paint(1);
                    }
                    hdVar.D0 = bitmap2;
                    Bitmap bitmap3 = hdVar.D0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    hdVar.F0 = bitmapShader;
                    hdVar.G0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    hdVar.E0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = hdVar.E0;
                    int[] iArr2 = hdVar.y0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    hdVar.F0.setLocalMatrix(hdVar.E0);
                    hdVar.b1.invalidate();
                    return;
                }
                return;
            case 3:
                Object[] objArr = (Object[]) obj;
                ((eg) obj2).run();
                return;
            case 4:
                o oVar = ((sw) obj2).L;
                if (((Integer) obj).intValue() - gl.n > gl.L(20.0f)) {
                    z3 = true;
                }
                oVar.p0 = z3;
                return;
            case 5:
                HashMap hashMap = ((km0) obj2).x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 6:
                k27 k27Var = (k27) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = k27Var.k.media;
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
                long j = k27Var.k.date * 1000;
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    String b2 = ym0.b(k27Var);
                    TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(-k27Var.Z0()));
                    if (K0 != null && hc2.V(K0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    t11 t11Var = new t11(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        t11Var.c(2131623982, 30, 30, new String[0]);
                        t11Var.b.setText(k96.M0(2131753368, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            t11Var.c(2131624029, 30, 30, new String[0]);
                            t11Var.b.setText(k96.M0(2131753366, null));
                        } else {
                            t11Var.c(2131623982, 30, 30, new String[0]);
                            t11Var.b.setText(k96.M0(2131753367, null));
                        }
                    }
                    t11Var.b.setSingleLine(false);
                    t11Var.b.setMaxLines(2);
                    k21 k21Var = new k21(Q.getResourceProvider(), Q.getParentActivity(), true);
                    k21Var.e(k96.M0(2131748818, null));
                    k21Var.b = new z77(payments_giveawayinfo, z, b2, j, tL_messageMediaGiveaway2, Q);
                    t11Var.setButton(k21Var);
                    m21.g(Q, t11Var, 2750).j();
                    return;
                }
                return;
            case 7:
                vo0 vo0Var = (vo0) obj2;
                ArrayList arrayList = vo0Var.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                q5c q5cVar = vo0Var.a;
                if (q5cVar != null && (l5cVar = q5cVar.g3) != null) {
                    l5cVar.O(true);
                    return;
                }
                return;
            case 8:
                kr0 kr0Var = (kr0) obj2;
                String str2 = (String) obj;
                ArrayList arrayList2 = kr0Var.h;
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                    kr0Var.i(true);
                }
                gl.d3(new z20(kr0Var, str2, (byte) 15), 120L);
                return;
            case 9:
                cv0 cv0Var = ((BotWebViewContainer$WebViewProxy) obj2).b;
                StringBuilder sb = new StringBuilder("window.navigator.__share__receive(");
                String str3 = str;
                if (!((Boolean) obj).booleanValue()) {
                    str3 = "'abort'";
                }
                sb.append(str3);
                sb.append(")");
                cv0Var.c(sb.toString());
                return;
            case 10:
                y31 y31Var = (y31) obj2;
                if (((Integer) obj).intValue() <= gl.L(20.0f)) {
                    z4 = false;
                }
                if (y31Var.G != z4) {
                    y31Var.G = z4;
                    if (!z4) {
                        y31Var.a.z0(0);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((ib1) obj2).x(((Integer) obj).intValue());
                return;
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                cb1 cb1Var = ((mb1) obj2).f;
                cb1Var.setText(charSequence);
                cb1Var.w(charSequence.length(), charSequence.length());
                return;
            case 13:
                ((xb1) obj2).M(((Long) obj).longValue());
                return;
            case 14:
                gl.c3(new q21((kg1) obj2, (TL_stories.TL_premium_boostsStatus) obj, (byte) 22));
                return;
            case 15:
                gl.c3(new q21((zi1) obj2, (TL_stories.TL_premium_boostsStatus) obj, (byte) 28));
                return;
            case 16:
                ((jjc) obj2).setEditMenuProgress(((Float) obj).floatValue());
                return;
            case 17:
                ((ae9) obj2).a((kl3) obj);
                return;
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((e52) obj2).w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                return;
            case 19:
                Object[] objArr2 = (Object[]) obj;
                gl.d0(((p62) obj2).s, new bm0((byte) 6));
                return;
            case 20:
                pe9 pe9Var = (pe9) obj2;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i = pe9Var.b;
                int i2 = pe9Var.a;
                ye9 ye9Var = pe9Var.e;
                if (richMessage != null) {
                    ArrayList arrayList3 = ye9Var.t3;
                    ArrayList arrayList4 = ye9Var.t3;
                    if (i2 < arrayList3.size() && i < arrayList4.size()) {
                        ld9 ld9Var = ye9Var.R3;
                        if (ld9Var != null) {
                            ld9Var.d();
                        }
                        me9 me9Var = ye9Var.v3;
                        if (me9Var != null) {
                            me9Var.e(false);
                        }
                        lk0 lk0Var2 = (lk0) arrayList4.get(i2);
                        lk0 lk0Var3 = (lk0) arrayList4.get(i);
                        if (!ye9.w3(lk0Var2.b)) {
                            editable = "";
                        } else {
                            editable = ye9Var.P4(lk0Var2);
                        }
                        Editable editable2 = str;
                        if (ye9.w3(lk0Var3.b)) {
                            editable2 = ye9Var.P4(lk0Var3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(pe9Var.c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(editable2.subSequence(Math.max(0, Math.min(pe9Var.d, editable2.length())), editable2.length()));
                        ArrayList arrayList5 = new ArrayList();
                        ye9.S2(arrayList5, richMessage.blocks, null);
                        if (arrayList5.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            wi9.b(pageblockparagraph, spannableStringBuilder3);
                            arrayList5.add(new lk0(pageblockparagraph, lk0Var2.c, lk0Var2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                lk0 lk0Var4 = (lk0) arrayList5.get(0);
                                if (ye9.w3(lk0Var4.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) wi9.z(lk0Var4.b));
                                    wi9.b(lk0Var4.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    wi9.b(pageblockparagraph2, spannableStringBuilder);
                                    arrayList5.add(0, new lk0(pageblockparagraph2, lk0Var2.c, lk0Var2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                lk0 lk0Var5 = (lk0) b00.f(1, arrayList5);
                                if (ye9.w3(lk0Var5.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(wi9.z(lk0Var5.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    wi9.b(lk0Var5.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    wi9.b(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList5.add(new lk0(pageblockparagraph3, lk0Var3.c, lk0Var3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = ye9Var.s3;
                        if (richMessage2 == null) {
                            ye9Var.s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList6 = richMessage.photos;
                            if (arrayList6 != null) {
                                richMessage2.photos.addAll(arrayList6);
                            }
                            ArrayList<TLRPC.Document> arrayList7 = richMessage.documents;
                            if (arrayList7 != null) {
                                ye9Var.s3.documents.addAll(arrayList7);
                            }
                        }
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            ye9Var.w4((lk0) arrayList5.get(i3));
                        }
                        while (i >= i2) {
                            arrayList4.remove(i);
                            i--;
                        }
                        arrayList4.addAll(i2, arrayList5);
                        ye9Var.t4();
                        ye9Var.g3.O(false);
                        ld9 ld9Var2 = ye9Var.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.h();
                        }
                        ye9Var.p3.onContentChanged();
                        if (!arrayList5.isEmpty()) {
                            lk0Var = (lk0) b00.f(1, arrayList5);
                        }
                        ye9Var.post(new lw8(pe9Var, lk0Var, (byte) 22));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ((a72) obj2).a.r.Q1((TL_iv.RichMessage) obj);
                return;
            case 22:
                ((yc2) obj2).e.T = (String) obj;
                return;
            case 23:
                kf2 kf2Var = ((gf2) obj2).d;
                kf2Var.A1 = ((Integer) obj).intValue();
                gl.U3(kf2Var.r0, kf2Var.c);
                return;
            case 24:
                uf2 uf2Var = (uf2) obj2;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                uf2Var.H = connectedbots;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = uf2Var.H.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                uf2Var.I = tL_connectedBot;
                if (tL_connectedBot == null) {
                    V1 = null;
                } else {
                    V1 = uf2Var.getMessagesController().V1(Long.valueOf(uf2Var.I.bot_id));
                }
                uf2Var.N = V1;
                TL_account.TL_connectedBot tL_connectedBot2 = uf2Var.I;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                uf2Var.K = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = uf2Var.I;
                if (tL_connectedBot3 != null) {
                    z2 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z2 = true;
                }
                uf2Var.J = z2;
                m41 m41Var = uf2Var.w;
                if (m41Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    m41Var.i(tL_businessBotRecipients);
                }
                q5c q5cVar2 = uf2Var.c;
                if (q5cVar2 != null && (l5cVar2 = q5cVar2.g3) != null) {
                    l5cVar2.O(true);
                }
                uf2Var.Z(true);
                uf2Var.U = true;
                return;
            case 25:
                qk2 qk2Var = (qk2) obj2;
                qk2Var.k0.n.P = ((Float) obj).floatValue();
                pk2 pk2Var = qk2Var.k0;
                ok2 ok2Var = pk2Var.d;
                if (ok2Var != null) {
                    ok2Var.setVolume(pk2Var.n.P);
                    return;
                }
                return;
            case 26:
                xm2 xm2Var = (xm2) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = xm2Var.n;
                z3 = (arrayList9 == null || arrayList9.isEmpty()) ? true : true;
                xm2Var.n = arrayList8;
                q5c q5cVar3 = xm2Var.f;
                if (q5cVar3 != null) {
                    q5cVar3.g3.O(z3);
                    return;
                }
                return;
            case 27:
                ((it2) obj2).b0((TL_account.TL_birthday) obj);
                return;
            default:
                ((xx2) obj2).a1((Pair) obj);
                return;
        }
    }
}
