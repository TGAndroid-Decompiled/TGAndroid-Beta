package hi;

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
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.z41;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.kw;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class t6 implements x10 {
    public final int f15413a;
    public final Object f15414b;

    public t6(Object obj, int i7) {
        this.f15413a = i7;
        this.f15414b = obj;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User c22;
        boolean z10;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User c23;
        TL_account.TL_businessBotRights makeDefault;
        boolean z11;
        z41 z41Var;
        z41 z41Var2;
        boolean z12;
        Editable editable;
        oi.a aVar;
        String str;
        z41 z41Var3;
        int i7;
        float f10;
        float f11;
        switch (this.f15413a) {
            case 0:
                v6 v6Var = (v6) this.f15414b;
                Long l10 = (Long) obj;
                boolean z13 = false;
                v6Var.A2 = false;
                if (l10 == null) {
                    c22 = null;
                } else {
                    c22 = mp.u1(v6Var.f30187a).c2(l10);
                }
                v6Var.f15601z2 = c22;
                if (c22 == null) {
                    z13 = true;
                }
                v6Var.B2 = z13;
                if (c22 != null) {
                    v6Var.h1();
                    return;
                }
                return;
            case 1:
                l7 l7Var = (l7) this.f15414b;
                tg.h0 h0Var = (tg.h0) obj;
                if (h0Var == null) {
                    l7Var.f1();
                    return;
                }
                l7Var.f14950k2 = h0Var.f57895e;
                l7Var.f14949j2 = h0Var.f57896f;
                return;
            case 2:
                ((h8) this.f15414b).f14733n.f14952a0.C1 = ((Integer) obj).intValue();
                return;
            case 3:
                ((q9) this.f15414b).h((x10) obj);
                return;
            case 4:
                ((jg.m) this.f15414b).M((TLRPC.User) obj);
                return;
            case 5:
                TLRPC.User user = (TLRPC.User) obj;
                km0 km0Var = (km0) ((jg.h0) this.f15414b);
                kw kwVar = km0Var.L0;
                if (user != null) {
                    cx cxVar = kwVar.M0;
                    if (cxVar != null) {
                        cxVar.W3();
                    }
                    mp.u1(kwVar.K0).E3(null, user, null, 0, null, false, false);
                    km0Var.Q(user.f28552id, user);
                    return;
                }
                return;
            case 6:
                ((ji.m) ((xi.e) this.f15414b).d).k(obj);
                return;
            case 7:
                kg.n nVar = (kg.n) this.f15414b;
                if (((Integer) obj).intValue() > org.telegram.messenger.g0.L(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (nVar.G != z10) {
                    nVar.G = z10;
                    if (!z10) {
                        nVar.f33530a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Object[] objArr = (Object[]) obj;
                org.telegram.messenger.g0.d0(((kg.g0) this.f15414b).f18319s, new fi.e(3));
                return;
            case 9:
                kg.t0 t0Var = (kg.t0) this.f15414b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                t0Var.H = connectedbots;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = t0Var.H.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                t0Var.I = tL_connectedBot;
                if (tL_connectedBot == null) {
                    c23 = null;
                } else {
                    c23 = t0Var.getMessagesController().c2(Long.valueOf(t0Var.I.bot_id));
                }
                t0Var.N = c23;
                TL_account.TL_connectedBot tL_connectedBot2 = t0Var.I;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                t0Var.K = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = t0Var.I;
                if (tL_connectedBot3 != null) {
                    z11 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z11 = true;
                }
                t0Var.J = z11;
                kg.a0 a0Var = t0Var.f18482w;
                if (a0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    a0Var.i(tL_businessBotRecipients);
                }
                e51 e51Var = t0Var.f18476c;
                if (e51Var != null && (z41Var = e51Var.f34607g3) != null) {
                    z41Var.O(true);
                }
                t0Var.d0(true);
                t0Var.U = true;
                return;
            case 10:
                kg.v0 v0Var = (kg.v0) this.f15414b;
                v0Var.f18505w = v0Var.d[((Integer) obj).intValue()];
                v0Var.a0(true);
                return;
            case 11:
                kg.t1 t1Var = (kg.t1) this.f15414b;
                t1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", t1Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                bn bnVar = new bn(bundle);
                bnVar.Z9 = true;
                t1Var.presentFragment(bnVar);
                return;
            case 12:
                org.telegram.messenger.g0.v1((kg.a1) this.f15414b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                return;
            case 13:
                ki.r rVar = (ki.r) this.f15414b;
                ArrayList arrayList = rVar.f18851b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                e51 e51Var2 = rVar.f18850a;
                if (e51Var2 != null && (z41Var2 = e51Var2.f34607g3) != null) {
                    z41Var2.O(true);
                    return;
                }
                return;
            case 14:
                li.g gVar = (li.g) this.f15414b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = gVar.f19933n;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                gVar.f19933n = arrayList2;
                e51 e51Var3 = gVar.f19932f;
                if (e51Var3 != null) {
                    e51Var3.f34607g3.O(z12);
                    return;
                }
                return;
            case 15:
                oi.j3 j3Var = (oi.j3) this.f15414b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = j3Var.f22122b;
                int i11 = j3Var.f22121a;
                oi.s3 s3Var = j3Var.f22124e;
                if (richMessage != null) {
                    ArrayList arrayList4 = s3Var.f22342t3;
                    ArrayList arrayList5 = s3Var.f22342t3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        oi.e2 e2Var = s3Var.R3;
                        if (e2Var != null) {
                            e2Var.d();
                        }
                        oi.g3 g3Var = s3Var.f22346v3;
                        if (g3Var != null) {
                            g3Var.f(false);
                        }
                        oi.a aVar2 = (oi.a) arrayList5.get(i11);
                        oi.a aVar3 = (oi.a) arrayList5.get(i10);
                        CharSequence charSequence = "";
                        if (!oi.s3.D3(aVar2.f21907b)) {
                            editable = "";
                        } else {
                            editable = s3Var.P4(aVar2);
                        }
                        if (oi.s3.D3(aVar3.f21907b)) {
                            charSequence = s3Var.P4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(j3Var.f22123c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(j3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList6 = new ArrayList();
                        oi.s3.Z2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            oi.z5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new oi.a(pageblockparagraph, aVar2.f21908c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                oi.a aVar4 = (oi.a) arrayList6.get(0);
                                if (oi.s3.D3(aVar4.f21907b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) oi.z5.A(aVar4.f21907b));
                                    oi.z5.d(aVar4.f21907b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    oi.z5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new oi.a(pageblockparagraph2, aVar2.f21908c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                oi.a aVar5 = (oi.a) i5.c.h(1, arrayList6);
                                if (oi.s3.D3(aVar5.f21907b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(oi.z5.A(aVar5.f21907b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    oi.z5.d(aVar5.f21907b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    oi.z5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new oi.a(pageblockparagraph3, aVar3.f21908c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = s3Var.f22340s3;
                        if (richMessage2 == null) {
                            s3Var.f22340s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                s3Var.f22340s3.documents.addAll(arrayList8);
                            }
                        }
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            s3Var.y4((oi.a) arrayList6.get(i12));
                        }
                        while (i10 >= i11) {
                            arrayList5.remove(i10);
                            i10--;
                        }
                        arrayList5.addAll(i11, arrayList6);
                        s3Var.v4();
                        s3Var.f34607g3.O(false);
                        oi.e2 e2Var2 = s3Var.R3;
                        if (e2Var2 != null) {
                            e2Var2.h();
                        }
                        s3Var.f22334p3.onContentChanged();
                        if (arrayList6.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (oi.a) i5.c.h(1, arrayList6);
                        }
                        s3Var.post(new oi.s2(2, j3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((oi.k) this.f15414b).f22126a.f22207r.Y1((TL_iv.RichMessage) obj);
                return;
            case 17:
                ((oi.z1) this.f15414b).Q.Y1((TL_iv.RichMessage) obj);
                return;
            case 18:
                oi.s3 s3Var2 = (oi.s3) this.f15414b;
                String str2 = (String) obj;
                s3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    s3Var2.V1(pageblockmath);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f15414b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = w0Var.G;
                w0Var.f30124a0 = false;
                w0Var.f30132f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                w0Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = w0Var.f30135n;
                if (matrix == null) {
                    w0Var.f30135n = new Matrix();
                } else {
                    matrix.reset();
                }
                w0Var.f30135n.postScale(8.0f, 8.0f);
                Matrix matrix2 = w0Var.f30135n;
                int[] iArr = w0Var.f30136r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                w0Var.h.setLocalMatrix(w0Var.f30135n);
                paint.setShader(w0Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                w0Var.invalidate();
                return;
            case 20:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f15414b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    u1Var.getClass();
                    return;
                }
                if (u1Var.G0 == null) {
                    u1Var.G0 = new Paint(1);
                }
                u1Var.D0 = bitmap2;
                Bitmap bitmap3 = u1Var.D0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                u1Var.F0 = bitmapShader;
                u1Var.G0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                u1Var.E0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = u1Var.E0;
                int[] iArr2 = u1Var.f30068y0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                u1Var.F0.setLocalMatrix(u1Var.E0);
                u1Var.f30029b1.invalidate();
                return;
            case 21:
                org.telegram.messenger.g0.v1((mt) this.f15414b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                return;
            case 22:
                org.telegram.ui.web.s0 s0Var = ((BotWebViewContainer$WebViewProxy) this.f15414b).f53045b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb2.append(str);
                sb2.append(")");
                s0Var.d(sb2.toString());
                return;
            case 23:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f15414b;
                x0Var.f53349f = (ArrayList) obj;
                bi.c6 c6Var = x0Var.f33530a;
                if (c6Var.H) {
                    c6Var.f34607g3.O(true);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.f15414b;
                n1Var.f53211r = ((ArrayList) obj).size();
                bi.c6 c6Var2 = n1Var.f33530a;
                if (c6Var2 != null && (z41Var3 = c6Var2.f34607g3) != null && c6Var2.H) {
                    z41Var3.O(true);
                    return;
                }
                return;
            case 25:
                rh.h hVar = (rh.h) this.f15414b;
                if (((rh.b) obj) == rh.b.d && ((i7 = hVar.f56610s) == 2 || i7 == 3)) {
                    hVar.f56610s = 1;
                }
                hVar.h.run();
                return;
            case 26:
                sg.v vVar = (sg.v) this.f15414b;
                sg.x0 x0Var2 = (sg.x0) obj;
                sg.u0 u0Var = vVar.f57367a;
                if (x0Var2 != null) {
                    float currentWeight = u0Var.getCurrentWeight();
                    x0Var2.f57401f = currentWeight;
                    double d = vVar.f57380p;
                    if (d > 0.0d) {
                        x0Var2.f57401f = (float) ((d / vVar.f57381q) * currentWeight);
                    }
                    if (x0Var2.f57397a.o() == 4) {
                        x0Var2.f57405k *= x0Var2.f57401f;
                    }
                }
                sg.i0 painting = u0Var.getPainting();
                if (painting.L == null) {
                    painting.f57225f.f(new sg.d0(painting, x0Var2, 1));
                    return;
                }
                return;
            case 27:
                sh.c cVar = (sh.c) this.f15414b;
                sh.d dVar = (sh.d) obj;
                cVar.h = dVar;
                cVar.f57424c.b(dVar, true);
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(cVar, 15), 200L);
                return;
            case 28:
                b5 b5Var = (b5) this.f15414b;
                TextureView textureView = (TextureView) obj;
                b5Var.f58146x0 = textureView;
                if (textureView != null) {
                    b5Var.f58140r0.addView(textureView, 0);
                    return;
                }
                return;
            default:
                tg.k2 k2Var = (tg.k2) this.f15414b;
                k2Var.f57992n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                k2Var.f57994s = paint2;
                Bitmap bitmap4 = k2Var.f57992n;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode3, tileMode3);
                k2Var.f57993r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f10 = 0.08f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix2, f10);
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f11);
                k2Var.f57994s.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                k2Var.f57995w = new Matrix();
                return;
        }
    }
}
