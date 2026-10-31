package ag;

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
import bi.d4;
import bi.q3;
import bi.q6;
import bi.u3;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.sc;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import vh.s3;
public final class l implements q20 {
    public final int f617a;
    public final Object f618b;

    public l(Object obj, int i10) {
        this.f617a = i10;
        this.f618b = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User Z1;
        TL_account.TL_businessBotRights makeDefault;
        boolean z11;
        boolean z12;
        p51 p51Var;
        Editable editable;
        int i10;
        float f7;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z13;
        float f10;
        p51 p51Var2;
        int i11 = this.f617a;
        float f11 = 0.08f;
        String str = "";
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        bi.a aVar = null;
        Object obj2 = this.f618b;
        switch (i11) {
            case 0:
                w wVar = (w) obj2;
                if (((Integer) obj).intValue() > org.telegram.messenger.i0.L(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (wVar.F != z10) {
                    wVar.F = z10;
                    if (!z10) {
                        wVar.f29837a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Object[] objArr = (Object[]) obj;
                org.telegram.messenger.i0.d0(((h1) obj2).f542s, new z0(0));
                return;
            case 2:
                t1 t1Var = (t1) obj2;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                t1Var.G = connectedbots;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = t1Var.G.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                t1Var.H = tL_connectedBot;
                if (tL_connectedBot == null) {
                    Z1 = null;
                } else {
                    Z1 = t1Var.getMessagesController().Z1(Long.valueOf(t1Var.H.bot_id));
                }
                t1Var.M = Z1;
                TL_account.TL_connectedBot tL_connectedBot2 = t1Var.H;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                t1Var.J = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = t1Var.H;
                if (tL_connectedBot3 != null) {
                    z11 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z11 = true;
                }
                t1Var.I = z11;
                x0 x0Var = t1Var.f734w;
                if (x0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    x0Var.i(tL_businessBotRecipients);
                }
                u51 u51Var = t1Var.f729c;
                if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
                    z12 = true;
                    p51Var.O(true);
                } else {
                    z12 = true;
                }
                t1Var.c0(z12);
                t1Var.T = z12;
                return;
            case 3:
                v1 v1Var = (v1) obj2;
                v1Var.f755w = v1Var.d[((Integer) obj).intValue()];
                v1Var.Z(true);
                return;
            case 4:
                z2 z2Var = (z2) obj2;
                z2Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", z2Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                un unVar = new un(bundle);
                unVar.V9 = true;
                z2Var.presentFragment(unVar);
                return;
            case 5:
                org.telegram.messenger.i0.v1((a2) obj2);
                org.telegram.messenger.i0.h3((Runnable) obj, 80L);
                return;
            case 6:
                u3 u3Var = (u3) obj2;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i12 = u3Var.f3383b;
                int i13 = u3Var.f3382a;
                d4 d4Var = u3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList = d4Var.f2946s3;
                    ArrayList arrayList2 = d4Var.f2946s3;
                    if (i13 < arrayList.size() && i12 < arrayList2.size()) {
                        bi.o2 o2Var = d4Var.Q3;
                        if (o2Var != null) {
                            o2Var.d();
                        }
                        q3 q3Var = d4Var.f2950u3;
                        if (q3Var != null) {
                            q3Var.f(false);
                        }
                        bi.a aVar2 = (bi.a) arrayList2.get(i13);
                        bi.a aVar3 = (bi.a) arrayList2.get(i12);
                        if (!d4.D3(aVar2.f2818b)) {
                            editable = "";
                        } else {
                            editable = d4Var.P4(aVar2);
                        }
                        Editable editable2 = str;
                        if (d4.D3(aVar3.f2818b)) {
                            editable2 = d4Var.P4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(u3Var.f3384c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(editable2.subSequence(Math.max(0, Math.min(u3Var.d, editable2.length())), editable2.length()));
                        ArrayList arrayList3 = new ArrayList();
                        d4.Z2(arrayList3, richMessage.blocks, null);
                        if (arrayList3.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            q6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList3.add(new bi.a(pageblockparagraph, aVar2.f2819c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                bi.a aVar4 = (bi.a) arrayList3.get(0);
                                if (d4.D3(aVar4.f2818b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) q6.A(aVar4.f2818b));
                                    q6.d(aVar4.f2818b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    q6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList3.add(0, new bi.a(pageblockparagraph2, aVar2.f2819c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                bi.a aVar5 = (bi.a) i0.a.g(1, arrayList3);
                                if (d4.D3(aVar5.f2818b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(q6.A(aVar5.f2818b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    q6.d(aVar5.f2818b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    q6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList3.add(new bi.a(pageblockparagraph3, aVar3.f2819c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = d4Var.f2944r3;
                        if (richMessage2 == null) {
                            d4Var.f2944r3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList4 = richMessage.photos;
                            if (arrayList4 != null) {
                                richMessage2.photos.addAll(arrayList4);
                            }
                            ArrayList<TLRPC.Document> arrayList5 = richMessage.documents;
                            if (arrayList5 != null) {
                                d4Var.f2944r3.documents.addAll(arrayList5);
                            }
                        }
                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                            d4Var.y4((bi.a) arrayList3.get(i14));
                        }
                        while (i12 >= i13) {
                            arrayList2.remove(i12);
                            i12--;
                        }
                        arrayList2.addAll(i13, arrayList3);
                        d4Var.v4();
                        d4Var.f30819f3.O(false);
                        bi.o2 o2Var2 = d4Var.Q3;
                        if (o2Var2 != null) {
                            o2Var2.h();
                        }
                        d4Var.f2938o3.onContentChanged();
                        if (!arrayList3.isEmpty()) {
                            aVar = (bi.a) i0.a.g(1, arrayList3);
                        }
                        d4Var.post(new a1.f(22, u3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((bi.p) obj2).f3271a.f3350r.X1((TL_iv.RichMessage) obj);
                return;
            case 8:
                ((bi.k2) obj2).P.X1((TL_iv.RichMessage) obj);
                return;
            case 9:
                d4 d4Var2 = (d4) obj2;
                String str2 = (String) obj;
                d4Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    d4Var2.U1(pageblockmath);
                    return;
                }
                return;
            case 10:
                hh.i iVar = (hh.i) obj2;
                if (((hh.b) obj) == hh.b.d && ((i10 = iVar.f7701s) == 2 || i10 == 3)) {
                    iVar.f7701s = 1;
                }
                iVar.h.run();
                return;
            case 11:
                ig.a0 a0Var = (ig.a0) obj2;
                ig.f1 f1Var = (ig.f1) obj;
                ig.c1 c1Var = a0Var.f8246a;
                if (f1Var != null) {
                    float currentWeight = c1Var.getCurrentWeight();
                    f1Var.f8302f = currentWeight;
                    double d = a0Var.f8258p;
                    if (d > 0.0d) {
                        f1Var.f8302f = (float) ((d / a0Var.f8259q) * currentWeight);
                    }
                    if (f1Var.f8299a.o() == 4) {
                        f1Var.f8306k *= f1Var.f8302f;
                    }
                }
                ig.q0 painting = c1Var.getPainting();
                if (painting.L == null) {
                    painting.f8413f.f(new ig.l0(painting, f1Var, 1));
                    return;
                }
                return;
            case 12:
                ih.d dVar = (ih.d) obj2;
                ih.f fVar = (ih.f) obj;
                dVar.h = fVar;
                dVar.f8525c.b(fVar, true);
                org.telegram.messenger.i0.h3(new gg.c(dVar, 10), 200L);
                return;
            case 13:
                s3 s3Var = (s3) obj2;
                TextureView textureView = (TextureView) obj;
                s3Var.f10061w0 = textureView;
                if (textureView != null) {
                    s3Var.f10055q0.addView(textureView, 0);
                    return;
                }
                return;
            case 14:
                jg.d3 d3Var = (jg.d3) obj2;
                d3Var.f9935n = (Bitmap) obj;
                Paint paint = new Paint(1);
                d3Var.f9937s = paint;
                Bitmap bitmap = d3Var.f9935n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                d3Var.f9936r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (!t6.I.q()) {
                    f11 = 0.25f;
                }
                org.telegram.messenger.i0.i(colorMatrix, f11);
                if (t6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.07f;
                }
                org.telegram.messenger.i0.h(colorMatrix, f7);
                d3Var.f9937s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                d3Var.f9938w = new Matrix();
                return;
            case 15:
                ((kg.q0) obj2).y1((HashMap) obj);
                return;
            case 16:
                kg.g2 g2Var = (kg.g2) obj2;
                Boolean bool = (Boolean) obj;
                boolean e = sc.e(131072);
                if (g2Var.e != e) {
                    g2Var.e = e;
                    g2Var.invalidate();
                    return;
                }
                return;
            case 17:
                lh.g.d1((lh.g) obj2, (Pair) obj);
                return;
            case 18:
                jj jjVar = (jj) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = jjVar.f16337k.media;
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
                long j10 = jjVar.f16337k.date * 1000;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    String b10 = mg.p.b(jjVar);
                    TLRPC.Chat L0 = vp.r1(d20.f15147s0).L0(Long.valueOf(-jjVar.Z0()));
                    if (L0 != null && w3.V(L0)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    eb ebVar = new eb(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ebVar.c(2131623981, 30, 30, new String[0]);
                        ebVar.f25745b.setText(cd.L0(2131753371, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            ebVar.c(2131624027, 30, 30, new String[0]);
                            ebVar.f25745b.setText(cd.L0(2131753369, null));
                        } else {
                            ebVar.c(2131623981, 30, 30, new String[0]);
                            ebVar.f25745b.setText(cd.L0(2131753370, null));
                        }
                    }
                    ebVar.f25745b.setSingleLine(false);
                    ebVar.f25745b.setMaxLines(2);
                    ub ubVar = new ub(Q.getParentActivity(), Q.getResourceProvider(), true);
                    ubVar.e(cd.L0(2131749020, null));
                    ubVar.f30890b = new n0(payments_giveawayinfo, z13, b10, j10, tL_messageMediaGiveaway2, Q);
                    ebVar.setButton(ubVar);
                    wb.g(Q, ebVar, 2750).j();
                    return;
                }
                return;
            case 19:
                mg.o1 o1Var = (mg.o1) obj2;
                o1Var.S1.setLoading(false);
                mg.p.j(o1Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 20:
                mh.j jVar = (mh.j) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = jVar.K;
                if (jVar.T) {
                    jVar.I.recycle();
                    return;
                }
                jVar.I = bitmap2;
                Bitmap bitmap3 = jVar.I;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                jVar.J = new BitmapShader(bitmap3, tileMode2, tileMode2);
                Paint paint2 = new Paint(2);
                jVar.L = paint2;
                paint2.setShader(jVar.J);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (!t6.I.q()) {
                    f11 = 1.25f;
                }
                org.telegram.messenger.i0.i(colorMatrix2, f11);
                if (t6.I.q()) {
                    f10 = 0.02f;
                } else {
                    f10 = -0.15f;
                }
                org.telegram.messenger.i0.h(colorMatrix2, f10);
                jVar.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                matrix.reset();
                matrix.setScale(15.0f, 15.0f);
                jVar.J.setLocalMatrix(matrix);
                return;
            case 21:
                HashMap hashMap = ((ng.b) obj2).f13767x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 22:
                ((ng.f) obj2).F((TLObject) obj);
                return;
            case 23:
                HashMap hashMap2 = ((ng.i) obj2).f13795r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 24:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                Paint paint3 = y0Var.F;
                y0Var.W = false;
                y0Var.f21545f = bitmap4;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                y0Var.h = new BitmapShader(bitmap4, tileMode3, tileMode3);
                Matrix matrix2 = y0Var.f21547n;
                if (matrix2 == null) {
                    y0Var.f21547n = new Matrix();
                } else {
                    matrix2.reset();
                }
                y0Var.f21547n.postScale(8.0f, 8.0f);
                Matrix matrix3 = y0Var.f21547n;
                int[] iArr = y0Var.f21548r;
                matrix3.postTranslate(-iArr[0], -iArr[1]);
                y0Var.h.setLocalMatrix(y0Var.f21547n);
                paint3.setShader(y0Var.h);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                org.telegram.messenger.i0.i(colorMatrix3, -0.2f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                y0Var.invalidate();
                return;
            case 25:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj2;
                Bitmap bitmap5 = (Bitmap) obj;
                if (bitmap5 == null) {
                    x1Var.getClass();
                    return;
                }
                if (x1Var.H0 == null) {
                    x1Var.H0 = new Paint(1);
                }
                x1Var.E0 = bitmap5;
                Bitmap bitmap6 = x1Var.E0;
                Shader.TileMode tileMode4 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap6, tileMode4, tileMode4);
                x1Var.G0 = bitmapShader2;
                x1Var.H0.setShader(bitmapShader2);
                Matrix matrix4 = new Matrix();
                x1Var.F0 = matrix4;
                matrix4.postScale(8.0f, 8.0f);
                Matrix matrix5 = x1Var.F0;
                int[] iArr2 = x1Var.f21513z0;
                matrix5.postTranslate(-iArr2[0], -iArr2[1]);
                x1Var.G0.setLocalMatrix(x1Var.F0);
                x1Var.f21476c1.invalidate();
                return;
            case 26:
                org.telegram.messenger.i0.v1((mt) obj2);
                org.telegram.messenger.i0.h3((Runnable) obj, 80L);
                return;
            case 27:
                org.telegram.ui.web.v0 v0Var = ((BotWebViewContainer$WebViewProxy) obj2).f42977b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                String str3 = str;
                if (!((Boolean) obj).booleanValue()) {
                    str3 = "'abort'";
                }
                sb2.append(str3);
                sb2.append(")");
                v0Var.d(sb2.toString());
                return;
            case 28:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj2;
                b1Var.f42995f = (ArrayList) obj;
                ii iiVar = b1Var.f29837a;
                if (iiVar.G) {
                    iiVar.f30819f3.O(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.web.p1 p1Var = (org.telegram.ui.web.p1) obj2;
                p1Var.f43164r = ((ArrayList) obj).size();
                ii iiVar2 = p1Var.f29837a;
                if (iiVar2 != null && (p51Var2 = iiVar2.f30819f3) != null && iiVar2.G) {
                    p51Var2.O(true);
                    return;
                }
                return;
        }
    }
}
