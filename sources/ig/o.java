package ig;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.TextureView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fi.q5;
import java.util.ArrayList;
import java.util.HashMap;
import li.d6;
import li.f2;
import li.j3;
import li.m3;
import li.v3;
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
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.mx;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.wn;
import sg.u2;
public final class o implements Utilities.Callback {
    public final int f14188a;
    public final Object f14189b;

    public o(Object obj, int i10) {
        this.f14188a = i10;
        this.f14189b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z12;
        k71 k71Var;
        Editable editable;
        li.a aVar;
        String str;
        k71 k71Var2;
        int i10;
        float f7;
        float f10;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z13;
        float f11;
        float f12;
        switch (this.f14188a) {
            case 0:
                TLRPC.User user2 = (TLRPC.User) obj;
                xo0 xo0Var = (xo0) ((i0) this.f14189b);
                mx mxVar = xo0Var.K0;
                if (user2 != null) {
                    ey eyVar = mxVar.L0;
                    if (eyVar != null) {
                        eyVar.S3();
                    }
                    MessagesController.getInstance(mxVar.J0).openApp(user2, 0);
                    xo0Var.Q(user2.f22177id, user2);
                    return;
                }
                return;
            case 1:
                ii.f fVar = (ii.f) this.f14189b;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = fVar.f14341n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                fVar.f14341n = arrayList;
                s71 s71Var = fVar.f14340f;
                if (s71Var != null) {
                    s71Var.f32504g3.O(z10);
                    return;
                }
                return;
            case 2:
                jg.n nVar = (jg.n) this.f14189b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (nVar.F != z11) {
                    nVar.F = z11;
                    if (!z11) {
                        nVar.f30764a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((jg.i0) this.f14189b).f15728s, (Utilities.Callback<View>) new di.e(3));
                return;
            case 4:
                jg.t0 t0Var = (jg.t0) this.f14189b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                t0Var.G = connectedbots;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = t0Var.G.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                t0Var.H = tL_connectedBot;
                if (tL_connectedBot == null) {
                    user = null;
                } else {
                    user = t0Var.getMessagesController().getUser(Long.valueOf(t0Var.H.bot_id));
                }
                t0Var.M = user;
                TL_account.TL_connectedBot tL_connectedBot2 = t0Var.H;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                t0Var.J = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = t0Var.H;
                if (tL_connectedBot3 != null) {
                    z12 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z12 = true;
                }
                t0Var.I = z12;
                jg.b0 b0Var = t0Var.v;
                if (b0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    b0Var.i(tL_businessBotRecipients);
                }
                s71 s71Var2 = t0Var.f15848c;
                if (s71Var2 != null && (k71Var = s71Var2.f32504g3) != null) {
                    k71Var.O(true);
                }
                t0Var.Z(true);
                t0Var.T = true;
                return;
            case 5:
                jg.v0 v0Var = (jg.v0) this.f14189b;
                v0Var.v = v0Var.d[((Integer) obj).intValue()];
                v0Var.W(true);
                return;
            case 6:
                jg.z1 z1Var = (jg.z1) this.f14189b;
                z1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", z1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                wn wnVar = new wn(bundle);
                wnVar.S9 = true;
                z1Var.presentFragment(wnVar);
                return;
            case 7:
                AndroidUtilities.hideKeyboard((jg.s1) this.f14189b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 8:
                m3 m3Var = (m3) this.f14189b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i11 = m3Var.f17362b;
                int i12 = m3Var.f17361a;
                v3 v3Var = m3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList3 = v3Var.f17564t3;
                    ArrayList arrayList4 = v3Var.f17564t3;
                    if (i12 < arrayList3.size() && i11 < arrayList4.size()) {
                        f2 f2Var = v3Var.R3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        j3 j3Var = v3Var.f17568v3;
                        if (j3Var != null) {
                            j3Var.f(false);
                        }
                        li.a aVar2 = (li.a) arrayList4.get(i12);
                        li.a aVar3 = (li.a) arrayList4.get(i11);
                        CharSequence charSequence = "";
                        if (!v3.G3(aVar2.f17053b)) {
                            editable = "";
                        } else {
                            editable = v3Var.S4(aVar2);
                        }
                        if (v3.G3(aVar3.f17053b)) {
                            charSequence = v3Var.S4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(m3Var.f17363c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(m3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList5 = new ArrayList();
                        v3.c3(arrayList5, richMessage.blocks, null);
                        if (arrayList5.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            d6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList5.add(new li.a(pageblockparagraph, aVar2.f17054c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                li.a aVar4 = (li.a) arrayList5.get(0);
                                if (v3.G3(aVar4.f17053b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) d6.z(aVar4.f17053b));
                                    d6.d(aVar4.f17053b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    d6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList5.add(0, new li.a(pageblockparagraph2, aVar2.f17054c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                li.a aVar5 = (li.a) ic.a.g(1, arrayList5);
                                if (v3.G3(aVar5.f17053b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(d6.z(aVar5.f17053b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    d6.d(aVar5.f17053b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    d6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList5.add(new li.a(pageblockparagraph3, aVar3.f17054c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = v3Var.f17562s3;
                        if (richMessage2 == null) {
                            v3Var.f17562s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList6 = richMessage.photos;
                            if (arrayList6 != null) {
                                richMessage2.photos.addAll(arrayList6);
                            }
                            ArrayList<TLRPC.Document> arrayList7 = richMessage.documents;
                            if (arrayList7 != null) {
                                v3Var.f17562s3.documents.addAll(arrayList7);
                            }
                        }
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            v3Var.B4((li.a) arrayList5.get(i13));
                        }
                        while (i11 >= i12) {
                            arrayList4.remove(i11);
                            i11--;
                        }
                        arrayList4.addAll(i12, arrayList5);
                        v3Var.y4();
                        v3Var.f32504g3.O(false);
                        f2 f2Var2 = v3Var.R3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        v3Var.f17556p3.onContentChanged();
                        if (arrayList5.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (li.a) ic.a.g(1, arrayList5);
                        }
                        v3Var.post(new k2.e0(6, m3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((li.l) this.f14189b).f17335a.f17417r.a2((TL_iv.RichMessage) obj);
                return;
            case 10:
                ((li.b2) this.f14189b).P.a2((TL_iv.RichMessage) obj);
                return;
            case 11:
                v3 v3Var2 = (v3) this.f14189b;
                String str2 = (String) obj;
                v3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    v3Var2.X1(pageblockmath);
                    return;
                }
                return;
            case 12:
                AndroidUtilities.hideKeyboard((ju) this.f14189b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 13:
                org.telegram.ui.web.x0 x0Var = ((BotWebViewContainer$WebViewProxy) this.f14189b).f44656b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb2.append(str);
                sb2.append(")");
                x0Var.d(sb2.toString());
                return;
            case 14:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f14189b;
                f1Var.f44741f = (ArrayList) obj;
                m71 m71Var = f1Var.f30764a;
                if (m71Var.G) {
                    m71Var.f32504g3.O(true);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.f14189b;
                y1Var.f44975r = ((ArrayList) obj).size();
                m71 m71Var2 = y1Var.f30764a;
                if (m71Var2 != null && (k71Var2 = m71Var2.f32504g3) != null && m71Var2.G) {
                    k71Var2.O(true);
                    return;
                }
                return;
            case 16:
                rg.e0 e0Var = (rg.e0) this.f14189b;
                rg.f1 f1Var2 = (rg.f1) obj;
                rg.c1 c1Var = e0Var.f47426a;
                if (f1Var2 != null) {
                    float currentWeight = c1Var.getCurrentWeight();
                    f1Var2.f47453f = currentWeight;
                    double d = e0Var.f47438p;
                    if (d > 0.0d) {
                        f1Var2.f47453f = (float) ((d / e0Var.f47439q) * currentWeight);
                    }
                    if (f1Var2.f47450a.o() == 4) {
                        f1Var2.f47457k *= f1Var2.f47453f;
                    }
                }
                rg.q0 painting = c1Var.getPainting();
                if (painting.L == null) {
                    painting.f47541f.f(new rg.m0(painting, f1Var2, 1));
                    return;
                }
                return;
            case 17:
                rh.i iVar = (rh.i) this.f14189b;
                if (((rh.b) obj) == rh.b.d && ((i10 = iVar.f47660s) == 2 || i10 == 3)) {
                    iVar.f47660s = 1;
                }
                iVar.h.run();
                return;
            case 18:
                q5 q5Var = (q5) this.f14189b;
                TextureView textureView = (TextureView) obj;
                q5Var.f48244w0 = textureView;
                if (textureView != null) {
                    q5Var.f48238q0.addView(textureView, 0);
                    return;
                }
                return;
            case 19:
                u2 u2Var = (u2) this.f14189b;
                u2Var.f48565n = (Bitmap) obj;
                Paint paint = new Paint(1);
                u2Var.f48567s = paint;
                Bitmap bitmap = u2Var.f48565n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                u2Var.f48566r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (y6.I.q()) {
                    f7 = 0.08f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (y6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                u2Var.f48567s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                u2Var.v = new Matrix();
                return;
            case 20:
                sh.c cVar = (sh.c) this.f14189b;
                sh.e eVar = (sh.e) obj;
                cVar.h = eVar;
                cVar.f48655c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(cVar, 20), 200L);
                return;
            case 21:
                ((tg.j0) this.f14189b).I1((HashMap) obj);
                return;
            case 22:
                tg.x1 x1Var = (tg.x1) this.f14189b;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (x1Var.e != isEnabled) {
                    x1Var.e = isEnabled;
                    x1Var.invalidate();
                    return;
                }
                return;
            case 23:
                MessageObject messageObject = (MessageObject) this.f14189b;
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
                long j10 = 1000 * messageObject.messageOwner.date;
                r2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = vg.j.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    yb ybVar = new yb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ybVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        ybVar.f35028b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            ybVar.c(R.raw.forward, 30, 30, new String[0]);
                            ybVar.f35028b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            ybVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            ybVar.f35028b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    ybVar.f35028b.setSingleLine(false);
                    ybVar.f35028b.setMaxLines(2);
                    oc ocVar = new oc(R.getParentActivity(), R.getResourceProvider(), true);
                    ocVar.e(LocaleController.getString(R.string.LearnMore));
                    ocVar.f31259b = new fi.r1(payments_giveawayinfo, z13, b10, j10, tL_messageMediaGiveaway2, R);
                    ybVar.setButton(ocVar);
                    qc.g(R, ybVar, 2750).j();
                    return;
                }
                return;
            case 24:
                vg.s0 s0Var = (vg.s0) this.f14189b;
                s0Var.f50290a0.setLoading(false);
                vg.j.j(s0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 25:
                vh.f.P((vh.f) this.f14189b, (Pair) obj);
                return;
            case 26:
                HashMap hashMap = ((wg.b) this.f14189b).f51233w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 27:
                ((wg.e) this.f14189b).F((TLObject) obj);
                return;
            case 28:
                HashMap hashMap2 = ((wg.h) this.f14189b).f51258r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            default:
                wh.h hVar = (wh.h) this.f14189b;
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
                if (y6.I.q()) {
                    f11 = 0.08f;
                } else {
                    f11 = 1.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (y6.I.q()) {
                    f12 = 0.02f;
                } else {
                    f12 = -0.15f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                hVar.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                matrix.reset();
                matrix.setScale(15.0f, 15.0f);
                hVar.J.setLocalMatrix(matrix);
                return;
        }
    }
}
