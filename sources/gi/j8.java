package gi;

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
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hp;
import org.telegram.messenger.lc;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.xs;
import org.telegram.ui.cw;
import org.telegram.ui.uw;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.wm;
public final class j8 implements u10 {
    public final int f13017a;
    public final Object f13018b;

    public j8(Object obj, int i3) {
        this.f13017a = i3;
        this.f13018b = obj;
    }

    @Override
    public final void a(Object obj) {
        f41 f41Var;
        boolean z10;
        boolean z11;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User a22;
        TL_account.TL_businessBotRights makeDefault;
        boolean z12;
        f41 f41Var2;
        Editable editable;
        mi.a aVar;
        String str;
        f41 f41Var3;
        int i3;
        float f10;
        float f11;
        switch (this.f13017a) {
            case 0:
                ((k8) this.f13018b).f13043n.f13340a0.f13635z1 = ((Integer) obj).intValue();
                return;
            case 1:
                ((s9) this.f13018b).h((u10) obj);
                return;
            case 2:
                ii.s sVar = (ii.s) this.f13018b;
                ArrayList arrayList = sVar.f15208b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                l41 l41Var = sVar.f15207a;
                if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
                    f41Var.O(true);
                    return;
                }
                return;
            case 3:
                ji.e eVar = (ji.e) this.f13018b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = eVar.f16298n;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                eVar.f16298n = arrayList2;
                l41 l41Var2 = eVar.f16297f;
                if (l41Var2 != null) {
                    l41Var2.f35594g3.O(z10);
                    return;
                }
                return;
            case 4:
                ((kg.m) this.f13018b).M((TLRPC.User) obj);
                return;
            case 5:
                TLRPC.User user = (TLRPC.User) obj;
                bm0 bm0Var = (bm0) ((kg.e0) this.f13018b);
                cw cwVar = bm0Var.L0;
                if (user != null) {
                    uw uwVar = cwVar.M0;
                    if (uwVar != null) {
                        uwVar.W3();
                    }
                    hp.s1(cwVar.K0).x3(null, user, null, 0, null, false, false);
                    bm0Var.Q(user.f27150id, user);
                    return;
                }
                return;
            case 6:
                lg.m mVar = (lg.m) this.f13018b;
                if (((Integer) obj).intValue() > org.telegram.messenger.g0.L(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (mVar.G != z11) {
                    mVar.G = z11;
                    if (!z11) {
                        mVar.f34298a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                Object[] objArr = (Object[]) obj;
                org.telegram.messenger.g0.d0(((lg.h0) this.f13018b).f18322s, new ei.e(3));
                return;
            case 8:
                lg.r0 r0Var = (lg.r0) this.f13018b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                r0Var.H = connectedbots;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = r0Var.H.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                r0Var.I = tL_connectedBot;
                if (tL_connectedBot == null) {
                    a22 = null;
                } else {
                    a22 = r0Var.getMessagesController().a2(Long.valueOf(r0Var.I.bot_id));
                }
                r0Var.N = a22;
                TL_account.TL_connectedBot tL_connectedBot2 = r0Var.I;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                r0Var.K = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = r0Var.I;
                if (tL_connectedBot3 != null) {
                    z12 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z12 = true;
                }
                r0Var.J = z12;
                lg.b0 b0Var = r0Var.f18446w;
                if (b0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    b0Var.i(tL_businessBotRecipients);
                }
                l41 l41Var3 = r0Var.f18440c;
                if (l41Var3 != null && (f41Var2 = l41Var3.f35594g3) != null) {
                    f41Var2.O(true);
                }
                r0Var.d0(true);
                r0Var.U = true;
                return;
            case 9:
                lg.t0 t0Var = (lg.t0) this.f13018b;
                t0Var.f18472w = t0Var.d[((Integer) obj).intValue()];
                t0Var.a0(true);
                return;
            case 10:
                lg.r1 r1Var = (lg.r1) this.f13018b;
                r1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", r1Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                wm wmVar = new wm(bundle);
                wmVar.W9 = true;
                r1Var.presentFragment(wmVar);
                return;
            case 11:
                org.telegram.messenger.g0.v1((lg.y0) this.f13018b);
                org.telegram.messenger.g0.i3((Runnable) obj, 80L);
                return;
            case 12:
                mi.k3 k3Var = (mi.k3) this.f13018b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = k3Var.f19725b;
                int i11 = k3Var.f19724a;
                mi.t3 t3Var = k3Var.f19727e;
                if (richMessage != null) {
                    ArrayList arrayList4 = t3Var.f19924t3;
                    ArrayList arrayList5 = t3Var.f19924t3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        mi.g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        mi.h3 h3Var = t3Var.f19928v3;
                        if (h3Var != null) {
                            h3Var.f(false);
                        }
                        mi.a aVar2 = (mi.a) arrayList5.get(i11);
                        mi.a aVar3 = (mi.a) arrayList5.get(i10);
                        CharSequence charSequence = "";
                        if (!mi.t3.D3(aVar2.f19431b)) {
                            editable = "";
                        } else {
                            editable = t3Var.P4(aVar2);
                        }
                        if (mi.t3.D3(aVar3.f19431b)) {
                            charSequence = t3Var.P4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(k3Var.f19726c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(k3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList6 = new ArrayList();
                        mi.t3.Z2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            mi.b6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new mi.a(pageblockparagraph, aVar2.f19432c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                mi.a aVar4 = (mi.a) arrayList6.get(0);
                                if (mi.t3.D3(aVar4.f19431b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) mi.b6.A(aVar4.f19431b));
                                    mi.b6.d(aVar4.f19431b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    mi.b6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new mi.a(pageblockparagraph2, aVar2.f19432c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                mi.a aVar5 = (mi.a) k2.p1.h(1, arrayList6);
                                if (mi.t3.D3(aVar5.f19431b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(mi.b6.A(aVar5.f19431b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    mi.b6.d(aVar5.f19431b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    mi.b6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new mi.a(pageblockparagraph3, aVar3.f19432c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = t3Var.f19922s3;
                        if (richMessage2 == null) {
                            t3Var.f19922s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                t3Var.f19922s3.documents.addAll(arrayList8);
                            }
                        }
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            t3Var.y4((mi.a) arrayList6.get(i12));
                        }
                        while (i10 >= i11) {
                            arrayList5.remove(i10);
                            i10--;
                        }
                        arrayList5.addAll(i11, arrayList6);
                        t3Var.v4();
                        t3Var.f35594g3.O(false);
                        mi.g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        t3Var.f19916p3.onContentChanged();
                        if (arrayList6.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (mi.a) k2.p1.h(1, arrayList6);
                        }
                        t3Var.post(new m2.s(8, k3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((mi.l) this.f13018b).f19728a.f19793r.Y1((TL_iv.RichMessage) obj);
                return;
            case 14:
                ((mi.c2) this.f13018b).Q.Y1((TL_iv.RichMessage) obj);
                return;
            case 15:
                mi.t3 t3Var2 = (mi.t3) this.f13018b;
                String str2 = (String) obj;
                t3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    t3Var2.V1(pageblockmath);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f13018b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = v0Var.G;
                v0Var.f28713a0 = false;
                v0Var.f28721f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                v0Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = v0Var.f28724n;
                if (matrix == null) {
                    v0Var.f28724n = new Matrix();
                } else {
                    matrix.reset();
                }
                v0Var.f28724n.postScale(8.0f, 8.0f);
                Matrix matrix2 = v0Var.f28724n;
                int[] iArr = v0Var.f28725r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                v0Var.h.setLocalMatrix(v0Var.f28724n);
                paint.setShader(v0Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                v0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.f13018b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    s1Var.getClass();
                    return;
                }
                if (s1Var.I0 == null) {
                    s1Var.I0 = new Paint(1);
                }
                s1Var.F0 = bitmap2;
                Bitmap bitmap3 = s1Var.F0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                s1Var.H0 = bitmapShader;
                s1Var.I0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                s1Var.G0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = s1Var.G0;
                int[] iArr2 = s1Var.A0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                s1Var.H0.setLocalMatrix(s1Var.G0);
                s1Var.f28533d1.invalidate();
                return;
            case 18:
                org.telegram.messenger.g0.v1((xs) this.f13018b);
                org.telegram.messenger.g0.i3((Runnable) obj, 80L);
                return;
            case 19:
                org.telegram.ui.web.t0 t0Var2 = ((BotWebViewContainer$WebViewProxy) this.f13018b).f50803b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb2.append(str);
                sb2.append(")");
                t0Var2.d(sb2.toString());
                return;
            case 20:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f13018b;
                y0Var.f51112f = (ArrayList) obj;
                ai.h4 h4Var = y0Var.f34298a;
                if (h4Var.H) {
                    h4Var.f35594g3.O(true);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.web.m1 m1Var = (org.telegram.ui.web.m1) this.f13018b;
                m1Var.f50952r = ((ArrayList) obj).size();
                ai.h4 h4Var2 = m1Var.f34298a;
                if (h4Var2 != null && (f41Var3 = h4Var2.f35594g3) != null && h4Var2.H) {
                    f41Var3.O(true);
                    return;
                }
                return;
            case 22:
                sh.h hVar = (sh.h) this.f13018b;
                if (((sh.b) obj) == sh.b.d && ((i3 = hVar.f54736s) == 2 || i3 == 3)) {
                    hVar.f54736s = 1;
                }
                hVar.h.run();
                return;
            case 23:
                tg.w wVar = (tg.w) this.f13018b;
                tg.x0 x0Var = (tg.x0) obj;
                tg.u0 u0Var = wVar.f55339a;
                if (x0Var != null) {
                    float currentWeight = u0Var.getCurrentWeight();
                    x0Var.f55368f = currentWeight;
                    double d = wVar.f55352p;
                    if (d > 0.0d) {
                        x0Var.f55368f = (float) ((d / wVar.f55353q) * currentWeight);
                    }
                    if (x0Var.f55364a.o() == 4) {
                        x0Var.f55372k *= x0Var.f55368f;
                    }
                }
                tg.i0 painting = u0Var.getPainting();
                if (painting.L == null) {
                    painting.f55193f.f(new tg.e0(painting, x0Var, 1));
                    return;
                }
                return;
            case 24:
                th.b bVar = (th.b) this.f13018b;
                th.c cVar = (th.c) obj;
                bVar.h = cVar;
                bVar.f55389c.b(cVar, true);
                org.telegram.messenger.g0.i3(new r4.u(bVar, 9), 200L);
                return;
            case 25:
                c5 c5Var = (c5) this.f13018b;
                TextureView textureView = (TextureView) obj;
                c5Var.f56269x0 = textureView;
                if (textureView != null) {
                    c5Var.f56263r0.addView(textureView, 0);
                    return;
                }
                return;
            case 26:
                ug.j2 j2Var = (ug.j2) this.f13018b;
                j2Var.f56106n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                j2Var.f56108s = paint2;
                Bitmap bitmap4 = j2Var.f56106n;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode3, tileMode3);
                j2Var.f56107r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = 0.08f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix2, f10);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f11);
                j2Var.f56108s.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                j2Var.f56109w = new Matrix();
                return;
            case 27:
                ((vg.i0) this.f13018b).y1((HashMap) obj);
                return;
            case 28:
                vg.t1 t1Var = (vg.t1) this.f13018b;
                Boolean bool = (Boolean) obj;
                boolean e10 = lc.e(131072);
                if (t1Var.f56860e != e10) {
                    t1Var.f56860e = e10;
                    t1Var.invalidate();
                    return;
                }
                return;
            default:
                wh.h.d1((wh.h) this.f13018b, (Pair) obj);
                return;
        }
    }
}
