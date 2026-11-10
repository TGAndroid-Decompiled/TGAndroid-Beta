package ii;

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
import fi.e5;
import fi.w3;
import java.util.ArrayList;
import java.util.HashMap;
import kg.q0;
import kg.q1;
import kg.s0;
import kg.x0;
import li.a6;
import li.b2;
import li.f2;
import li.g3;
import li.j3;
import li.k3;
import li.t3;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Components.zb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.iw;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.web.o1;
import org.telegram.ui.web.u0;
import org.telegram.ui.web.z0;
import org.telegram.ui.zw;
import sg.v0;
import sg.y0;
import tg.i2;
public final class c implements c20 {
    public final int f15497a;
    public final Object f15498b;

    public c(Object obj, int i7) {
        this.f15497a = i7;
        this.f15498b = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User a22;
        TL_account.TL_businessBotRights makeDefault;
        boolean z10;
        boolean z11;
        m41 m41Var;
        Editable editable;
        m41 m41Var2;
        int i7;
        float f10;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        boolean z12;
        float f11;
        int i10 = this.f15497a;
        String str = "";
        float f12 = 0.08f;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        li.a aVar = null;
        boolean z13 = false;
        Object obj2 = this.f15498b;
        switch (i10) {
            case 0:
                f fVar = (f) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = fVar.f15529n;
                z13 = (arrayList2 == null || arrayList2.isEmpty()) ? true : true;
                fVar.f15529n = arrayList;
                r41 r41Var = fVar.f15528f;
                if (r41Var != null) {
                    r41Var.f37496f3.O(z13);
                    return;
                }
                return;
            case 1:
                ((jg.n) obj2).M((TLRPC.User) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                yl0 yl0Var = (yl0) ((jg.h0) obj2);
                iw iwVar = yl0Var.K0;
                if (user != null) {
                    zw zwVar = iwVar.L0;
                    if (zwVar != null) {
                        zwVar.W3();
                    }
                    qp.s1(iwVar.J0).x3(null, user, null, 0, null, false, false);
                    yl0Var.Q(user.f27109id, user);
                    return;
                }
                return;
            case 3:
                kg.m mVar = (kg.m) obj2;
                if (((Integer) obj).intValue() > org.telegram.messenger.g0.L(20.0f)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (mVar.F != z9) {
                    mVar.F = z9;
                    if (!z9) {
                        mVar.f36518a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Object[] objArr = (Object[]) obj;
                org.telegram.messenger.g0.d0(((kg.g0) obj2).f17386s, new di.e(3));
                return;
            case 5:
                q0 q0Var = (q0) obj2;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                q0Var.G = connectedbots;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = q0Var.G.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                q0Var.H = tL_connectedBot;
                if (tL_connectedBot == null) {
                    a22 = null;
                } else {
                    a22 = q0Var.getMessagesController().a2(Long.valueOf(q0Var.H.bot_id));
                }
                q0Var.M = a22;
                TL_account.TL_connectedBot tL_connectedBot2 = q0Var.H;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                q0Var.J = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = q0Var.H;
                if (tL_connectedBot3 != null) {
                    z10 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z10 = true;
                }
                q0Var.I = z10;
                kg.a0 a0Var = q0Var.f17511w;
                if (a0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    a0Var.i(tL_businessBotRecipients);
                }
                r41 r41Var2 = q0Var.f17505c;
                if (r41Var2 != null && (m41Var = r41Var2.f37496f3) != null) {
                    z11 = true;
                    m41Var.O(true);
                } else {
                    z11 = true;
                }
                q0Var.d0(z11);
                q0Var.T = z11;
                return;
            case 6:
                s0 s0Var = (s0) obj2;
                s0Var.f17534w = s0Var.d[((Integer) obj).intValue()];
                s0Var.a0(true);
                return;
            case 7:
                q1 q1Var = (q1) obj2;
                q1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", q1Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                cn cnVar = new cn(bundle);
                cnVar.X9 = true;
                q1Var.presentFragment(cnVar);
                return;
            case 8:
                org.telegram.messenger.g0.v1((x0) obj2);
                org.telegram.messenger.g0.i3((Runnable) obj, 80L);
                return;
            case 9:
                k3 k3Var = (k3) obj2;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i11 = k3Var.f18677b;
                int i12 = k3Var.f18676a;
                t3 t3Var = k3Var.f18679e;
                if (richMessage != null) {
                    ArrayList arrayList3 = t3Var.f18900s3;
                    ArrayList arrayList4 = t3Var.f18900s3;
                    if (i12 < arrayList3.size() && i11 < arrayList4.size()) {
                        f2 f2Var = t3Var.Q3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        g3 g3Var = t3Var.f18904u3;
                        if (g3Var != null) {
                            g3Var.f(false);
                        }
                        li.a aVar2 = (li.a) arrayList4.get(i12);
                        li.a aVar3 = (li.a) arrayList4.get(i11);
                        if (!t3.D3(aVar2.f18395b)) {
                            editable = "";
                        } else {
                            editable = t3Var.P4(aVar2);
                        }
                        Editable editable2 = str;
                        if (t3.D3(aVar3.f18395b)) {
                            editable2 = t3Var.P4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(k3Var.f18678c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(editable2.subSequence(Math.max(0, Math.min(k3Var.d, editable2.length())), editable2.length()));
                        ArrayList arrayList5 = new ArrayList();
                        t3.Z2(arrayList5, richMessage.blocks, null);
                        if (arrayList5.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            a6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList5.add(new li.a(pageblockparagraph, aVar2.f18396c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                li.a aVar4 = (li.a) arrayList5.get(0);
                                if (t3.D3(aVar4.f18395b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) a6.A(aVar4.f18395b));
                                    a6.d(aVar4.f18395b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    a6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList5.add(0, new li.a(pageblockparagraph2, aVar2.f18396c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                li.a aVar5 = (li.a) jg.g.i(1, arrayList5);
                                if (t3.D3(aVar5.f18395b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(a6.A(aVar5.f18395b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    a6.d(aVar5.f18395b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    a6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList5.add(new li.a(pageblockparagraph3, aVar3.f18396c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = t3Var.f18898r3;
                        if (richMessage2 == null) {
                            t3Var.f18898r3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList6 = richMessage.photos;
                            if (arrayList6 != null) {
                                richMessage2.photos.addAll(arrayList6);
                            }
                            ArrayList<TLRPC.Document> arrayList7 = richMessage.documents;
                            if (arrayList7 != null) {
                                t3Var.f18898r3.documents.addAll(arrayList7);
                            }
                        }
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            t3Var.y4((li.a) arrayList5.get(i13));
                        }
                        while (i11 >= i12) {
                            arrayList4.remove(i11);
                            i11--;
                        }
                        arrayList4.addAll(i12, arrayList5);
                        t3Var.v4();
                        t3Var.f37496f3.O(false);
                        f2 f2Var2 = t3Var.Q3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        t3Var.f18893o3.onContentChanged();
                        if (!arrayList5.isEmpty()) {
                            aVar = (li.a) jg.g.i(1, arrayList5);
                        }
                        t3Var.post(new j3(0, k3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((li.l) obj2).f18681a.f18763r.Y1((TL_iv.RichMessage) obj);
                return;
            case 11:
                ((b2) obj2).P.Y1((TL_iv.RichMessage) obj);
                return;
            case 12:
                t3 t3Var2 = (t3) obj2;
                String str2 = (String) obj;
                t3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    t3Var2.V1(pageblockmath);
                    return;
                }
                return;
            case 13:
                w0 w0Var = (w0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = w0Var.F;
                w0Var.W = false;
                w0Var.f28660f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                w0Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = w0Var.f28662n;
                if (matrix == null) {
                    w0Var.f28662n = new Matrix();
                } else {
                    matrix.reset();
                }
                w0Var.f28662n.postScale(8.0f, 8.0f);
                Matrix matrix2 = w0Var.f28662n;
                int[] iArr = w0Var.f28663r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                w0Var.h.setLocalMatrix(w0Var.f28662n);
                paint.setShader(w0Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                w0Var.invalidate();
                return;
            case 14:
                u1 u1Var = (u1) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    u1Var.getClass();
                    return;
                }
                if (u1Var.F0 == null) {
                    u1Var.F0 = new Paint(1);
                }
                u1Var.C0 = bitmap2;
                Bitmap bitmap3 = u1Var.C0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                u1Var.E0 = bitmapShader;
                u1Var.F0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                u1Var.D0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = u1Var.D0;
                int[] iArr2 = u1Var.f28578x0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                u1Var.E0.setLocalMatrix(u1Var.D0);
                u1Var.f28539a1.invalidate();
                return;
            case 15:
                org.telegram.messenger.g0.v1((ys) obj2);
                org.telegram.messenger.g0.i3((Runnable) obj, 80L);
                return;
            case 16:
                u0 u0Var = ((BotWebViewContainer$WebViewProxy) obj2).f51015b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                String str3 = str;
                if (!((Boolean) obj).booleanValue()) {
                    str3 = "'abort'";
                }
                sb2.append(str3);
                sb2.append(")");
                u0Var.d(sb2.toString());
                return;
            case 17:
                z0 z0Var = (z0) obj2;
                z0Var.f51347f = (ArrayList) obj;
                w3 w3Var = z0Var.f36518a;
                if (w3Var.G) {
                    w3Var.f37496f3.O(true);
                    return;
                }
                return;
            case 18:
                o1 o1Var = (o1) obj2;
                o1Var.f51198r = ((ArrayList) obj).size();
                w3 w3Var2 = o1Var.f36518a;
                if (w3Var2 != null && (m41Var2 = w3Var2.f37496f3) != null && w3Var2.G) {
                    m41Var2.O(true);
                    return;
                }
                return;
            case 19:
                rh.h hVar = (rh.h) obj2;
                if (((rh.b) obj) == rh.b.d && ((i7 = hVar.f54564s) == 2 || i7 == 3)) {
                    hVar.f54564s = 1;
                }
                hVar.h.run();
                return;
            case 20:
                sg.w wVar = (sg.w) obj2;
                y0 y0Var = (y0) obj;
                v0 v0Var = wVar.f55244a;
                if (y0Var != null) {
                    float currentWeight = v0Var.getCurrentWeight();
                    y0Var.f55278f = currentWeight;
                    double d = wVar.f55257p;
                    if (d > 0.0d) {
                        y0Var.f55278f = (float) ((d / wVar.f55258q) * currentWeight);
                    }
                    if (y0Var.f55274a.o() == 4) {
                        y0Var.f55282k *= y0Var.f55278f;
                    }
                }
                sg.j0 painting = v0Var.getPainting();
                if (painting.L == null) {
                    painting.f55102f.f(new sg.e0(painting, y0Var, 1));
                    return;
                }
                return;
            case 21:
                sh.c cVar = (sh.c) obj2;
                sh.d dVar = (sh.d) obj;
                cVar.h = dVar;
                cVar.f55296c.b(dVar, true);
                org.telegram.messenger.g0.i3(new sh.b(cVar, 0), 200L);
                return;
            case 22:
                e5 e5Var = (e5) obj2;
                TextureView textureView = (TextureView) obj;
                e5Var.f55979w0 = textureView;
                if (textureView != null) {
                    e5Var.f55973q0.addView(textureView, 0);
                    return;
                }
                return;
            case 23:
                i2 i2Var = (i2) obj2;
                i2Var.f55772n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                i2Var.f55774s = paint2;
                Bitmap bitmap4 = i2Var.f55772n;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode3, tileMode3);
                i2Var.f55773r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (!m6.I.q()) {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix2, f12);
                if (m6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f10);
                i2Var.f55774s.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                i2Var.f55775w = new Matrix();
                return;
            case 24:
                ((ug.i0) obj2).y1((HashMap) obj);
                return;
            case 25:
                ug.q1 q1Var2 = (ug.q1) obj2;
                Boolean bool = (Boolean) obj;
                boolean e10 = sc.e(131072);
                if (q1Var2.f56808e != e10) {
                    q1Var2.f56808e = e10;
                    q1Var2.invalidate();
                    return;
                }
                return;
            case 26:
                vh.g.d1((vh.g) obj2, (Pair) obj);
                return;
            case 27:
                ij ijVar = (ij) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = ijVar.f23266k.media;
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
                long j3 = ijVar.f23266k.date * 1000;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    String b10 = wg.h.b(ijVar);
                    TLRPC.Chat M0 = qp.s1(p10.f24474s0).M0(Long.valueOf(-ijVar.Z0()));
                    if (M0 != null && org.telegram.messenger.t3.V(M0)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    jb jbVar = new jb(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        jbVar.c(2131623981, 30, 30, new String[0]);
                        jbVar.f34883b.setText(id.M0(2131753371, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            jbVar.c(2131624028, 30, 30, new String[0]);
                            jbVar.f34883b.setText(id.M0(2131753369, null));
                        } else {
                            jbVar.c(2131623981, 30, 30, new String[0]);
                            jbVar.f34883b.setText(id.M0(2131753370, null));
                        }
                    }
                    jbVar.f34883b.setSingleLine(false);
                    jbVar.f34883b.setMaxLines(2);
                    zb zbVar = new zb(Q.getParentActivity(), Q.getResourceProvider(), true);
                    zbVar.e(id.M0(2131749010, null));
                    zbVar.f40908b = new fi.q1(payments_giveawayinfo, z12, b10, j3, tL_messageMediaGiveaway2, Q);
                    jbVar.setButton(zbVar);
                    bc.g(Q, jbVar, 2750).j();
                    return;
                }
                return;
            case 28:
                wg.q0 q0Var2 = (wg.q0) obj2;
                q0Var2.V1.setLoading(false);
                wg.h.j(q0Var2.getContext(), (TLRPC.TL_error) obj);
                return;
            default:
                wh.h hVar2 = (wh.h) obj2;
                Bitmap bitmap5 = (Bitmap) obj;
                Matrix matrix5 = hVar2.K;
                if (hVar2.T) {
                    hVar2.I.recycle();
                    return;
                }
                hVar2.I = bitmap5;
                Bitmap bitmap6 = hVar2.I;
                Shader.TileMode tileMode4 = Shader.TileMode.CLAMP;
                hVar2.J = new BitmapShader(bitmap6, tileMode4, tileMode4);
                Paint paint3 = new Paint(2);
                hVar2.L = paint3;
                paint3.setShader(hVar2.J);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (!m6.I.q()) {
                    f12 = 1.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix3, f12);
                if (m6.I.q()) {
                    f11 = 0.02f;
                } else {
                    f11 = -0.15f;
                }
                org.telegram.messenger.g0.h(colorMatrix3, f11);
                hVar2.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                matrix5.reset();
                matrix5.setScale(15.0f, 15.0f);
                hVar2.J.setLocalMatrix(matrix5);
                return;
        }
    }
}
