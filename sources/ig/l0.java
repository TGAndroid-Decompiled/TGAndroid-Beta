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
import ei.r5;
import java.util.ArrayList;
import java.util.HashMap;
import ki.c6;
import ki.h2;
import ki.j3;
import ki.n3;
import ki.w3;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import rg.t2;
import yh.f4;
import yh.h4;
import yh.y3;
import yh.y4;
public final class l0 implements Utilities.Callback {
    public final int f12955a;
    public final Object f12956b;

    public l0(Object obj, int i10) {
        this.f12955a = i10;
        this.f12956b = obj;
    }

    @Override
    public final void run(Object obj) {
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z10;
        s61 s61Var;
        Editable editable;
        ki.a aVar;
        String str;
        s61 s61Var2;
        int i10;
        float f7;
        float f10;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z11;
        float f11;
        float f12;
        switch (this.f12955a) {
            case 0:
                t0 t0Var = (t0) this.f12956b;
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
                    z10 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z10 = true;
                }
                t0Var.I = z10;
                a0 a0Var = t0Var.v;
                if (a0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    a0Var.i(tL_businessBotRecipients);
                }
                a71 a71Var = t0Var.f13034c;
                if (a71Var != null && (s61Var = a71Var.W2) != null) {
                    s61Var.N(true);
                }
                t0Var.Y(true);
                t0Var.T = true;
                return;
            case 1:
                v0 v0Var = (v0) this.f12956b;
                v0Var.f13064w = v0Var.e[((Integer) obj).intValue()];
                v0Var.V(true);
                return;
            case 2:
                x1 x1Var = (x1) this.f12956b;
                x1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", x1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                sn snVar = new sn(bundle);
                snVar.C9 = true;
                x1Var.presentFragment(snVar);
                return;
            case 3:
                AndroidUtilities.hideKeyboard((q1) this.f12956b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 4:
                n3 n3Var = (n3) this.f12956b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i11 = n3Var.f15405b;
                int i12 = n3Var.f15404a;
                w3 w3Var = n3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList = w3Var.f15601j3;
                    ArrayList arrayList2 = w3Var.f15601j3;
                    if (i12 < arrayList.size() && i11 < arrayList2.size()) {
                        h2 h2Var = w3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        j3 j3Var = w3Var.f15605l3;
                        if (j3Var != null) {
                            j3Var.f(false);
                        }
                        ki.a aVar2 = (ki.a) arrayList2.get(i12);
                        ki.a aVar3 = (ki.a) arrayList2.get(i11);
                        CharSequence charSequence = "";
                        if (!w3.B3(aVar2.f15096b)) {
                            editable = "";
                        } else {
                            editable = w3Var.N4(aVar2);
                        }
                        if (w3.B3(aVar3.f15096b)) {
                            charSequence = w3Var.N4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(n3Var.f15406c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(n3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList3 = new ArrayList();
                        w3.X2(arrayList3, richMessage.blocks, null);
                        if (arrayList3.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            c6.e(pageblockparagraph, spannableStringBuilder3);
                            arrayList3.add(new ki.a(pageblockparagraph, aVar2.f15097c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ki.a aVar4 = (ki.a) arrayList3.get(0);
                                if (w3.B3(aVar4.f15096b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) c6.A(aVar4.f15096b));
                                    c6.e(aVar4.f15096b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    c6.e(pageblockparagraph2, spannableStringBuilder);
                                    arrayList3.add(0, new ki.a(pageblockparagraph2, aVar2.f15097c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ki.a aVar5 = (ki.a) i2.d.h(1, arrayList3);
                                if (w3.B3(aVar5.f15096b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(c6.A(aVar5.f15096b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    c6.e(aVar5.f15096b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    c6.e(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList3.add(new ki.a(pageblockparagraph3, aVar3.f15097c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = w3Var.f15599i3;
                        if (richMessage2 == null) {
                            w3Var.f15599i3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList4 = richMessage.photos;
                            if (arrayList4 != null) {
                                richMessage2.photos.addAll(arrayList4);
                            }
                            ArrayList<TLRPC.Document> arrayList5 = richMessage.documents;
                            if (arrayList5 != null) {
                                w3Var.f15599i3.documents.addAll(arrayList5);
                            }
                        }
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            w3Var.w4((ki.a) arrayList3.get(i13));
                        }
                        while (i11 >= i12) {
                            arrayList2.remove(i11);
                            i11--;
                        }
                        arrayList2.addAll(i12, arrayList3);
                        w3Var.t4();
                        w3Var.W2.N(false);
                        h2 h2Var2 = w3Var.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        w3Var.f15593f3.onContentChanged();
                        if (arrayList3.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (ki.a) i2.d.h(1, arrayList3);
                        }
                        w3Var.post(new hi.t(24, n3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((ki.l) this.f12956b).f15369a.f15449r.V1((TL_iv.RichMessage) obj);
                return;
            case 6:
                ((ki.d2) this.f12956b).P.V1((TL_iv.RichMessage) obj);
                return;
            case 7:
                w3 w3Var2 = (w3) this.f12956b;
                String str2 = (String) obj;
                w3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    w3Var2.S1(pageblockmath);
                    return;
                }
                return;
            case 8:
                AndroidUtilities.hideKeyboard((iu) this.f12956b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 9:
                org.telegram.ui.web.x0 x0Var = ((BotWebViewContainer$WebViewProxy) this.f12956b).f42529b;
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
            case 10:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f12956b;
                f1Var.e = (ArrayList) obj;
                u61 u61Var = f1Var.f31197a;
                if (u61Var.G) {
                    u61Var.W2.N(true);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.x1 x1Var2 = (org.telegram.ui.web.x1) this.f12956b;
                x1Var2.f42833n = ((ArrayList) obj).size();
                u61 u61Var2 = x1Var2.f31197a;
                if (u61Var2 != null && (s61Var2 = u61Var2.W2) != null && u61Var2.G) {
                    s61Var2.N(true);
                    return;
                }
                return;
            case 12:
                qg.e0 e0Var = (qg.e0) this.f12956b;
                qg.h1 h1Var = (qg.h1) obj;
                qg.e1 e1Var = e0Var.f44533a;
                if (h1Var != null) {
                    float currentWeight = e1Var.getCurrentWeight();
                    h1Var.f44576f = currentWeight;
                    double d = e0Var.f44545p;
                    if (d > 0.0d) {
                        h1Var.f44576f = (float) ((d / e0Var.f44546q) * currentWeight);
                    }
                    if (h1Var.f44573a.o() == 4) {
                        h1Var.f44580k *= h1Var.f44576f;
                    }
                }
                qg.s0 painting = e1Var.getPainting();
                if (painting.L == null) {
                    painting.f44668f.f(new qg.o0(painting, h1Var, 1));
                    return;
                }
                return;
            case 13:
                qh.i iVar = (qh.i) this.f12956b;
                if (((qh.b) obj) == qh.b.d && ((i10 = iVar.f44779s) == 2 || i10 == 3)) {
                    iVar.f44779s = 1;
                }
                iVar.h.run();
                return;
            case 14:
                r5 r5Var = (r5) this.f12956b;
                TextureView textureView = (TextureView) obj;
                r5Var.f45377w0 = textureView;
                if (textureView != null) {
                    r5Var.f45371q0.addView(textureView, 0);
                    return;
                }
                return;
            case 15:
                t2 t2Var = (t2) this.f12956b;
                t2Var.f45694n = (Bitmap) obj;
                Paint paint = new Paint(1);
                t2Var.f45696s = paint;
                Bitmap bitmap = t2Var.f45694n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t2Var.f45695r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (h6.I.q()) {
                    f7 = 0.08f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (h6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                t2Var.f45696s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                t2Var.v = new Matrix();
                return;
            case 16:
                rh.c cVar = (rh.c) this.f12956b;
                rh.e eVar = (rh.e) obj;
                cVar.h = eVar;
                cVar.f45782c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(cVar, 16), 200L);
                return;
            case 17:
                ((sg.j0) this.f12956b).F1((HashMap) obj);
                return;
            case 18:
                sg.w1 w1Var = (sg.w1) this.f12956b;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (w1Var.d != isEnabled) {
                    w1Var.d = isEnabled;
                    w1Var.invalidate();
                    return;
                }
                return;
            case 19:
                MessageObject messageObject = (MessageObject) this.f12956b;
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
                n2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = ug.i.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    yb ybVar = new yb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ybVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        ybVar.f32606b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            ybVar.c(R.raw.forward, 30, 30, new String[0]);
                            ybVar.f32606b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            ybVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            ybVar.f32606b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    ybVar.f32606b.setSingleLine(false);
                    ybVar.f32606b.setMaxLines(2);
                    oc ocVar = new oc(R.getParentActivity(), R.getResourceProvider(), true);
                    ocVar.e(LocaleController.getString(R.string.LearnMore));
                    ocVar.f28925a = new ei.s1(payments_giveawayinfo, z11, b10, j10, tL_messageMediaGiveaway2, R);
                    ybVar.setButton(ocVar);
                    qc.g(R, ybVar, 2750).j();
                    return;
                }
                return;
            case 20:
                ug.r0 r0Var = (ug.r0) this.f12956b;
                r0Var.f47796a0.setLoading(false);
                ug.i.j(r0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 21:
                uh.f.Q((uh.f) this.f12956b, (Pair) obj);
                return;
            case 22:
                HashMap hashMap = ((vg.b) this.f12956b).f48398w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 23:
                ((vg.e) this.f12956b).F((TLObject) obj);
                return;
            case 24:
                HashMap hashMap2 = ((vg.h) this.f12956b).f48423r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 25:
                vh.h hVar = (vh.h) this.f12956b;
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
                if (h6.I.q()) {
                    f11 = 0.08f;
                } else {
                    f11 = 1.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (h6.I.q()) {
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
            case 26:
                Boolean bool2 = (Boolean) obj;
                ((yh.m1) this.f12956b).a();
                return;
            case 27:
                ((h4) this.f12956b).e0(((Boolean) obj).booleanValue());
                return;
            case 28:
                ((Boolean) obj).getClass();
                y3 y3Var = ((f4) this.f12956b).d;
                if (y3Var != null) {
                    y3Var.run();
                    return;
                }
                return;
            default:
                ug.i.j(((y4) this.f12956b).getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
