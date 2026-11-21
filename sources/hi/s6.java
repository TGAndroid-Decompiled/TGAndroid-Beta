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
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ot;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.kw;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class s6 implements x10 {
    public final int f15374a;
    public final Object f15375b;

    public s6(Object obj, int i7) {
        this.f15374a = i7;
        this.f15375b = obj;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User c22;
        boolean z10;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User c23;
        TL_account.TL_businessBotRights makeDefault;
        boolean z11;
        c51 c51Var;
        c51 c51Var2;
        boolean z12;
        Editable editable;
        oi.a aVar;
        String str;
        c51 c51Var3;
        int i7;
        float f10;
        float f11;
        switch (this.f15374a) {
            case 0:
                u6 u6Var = (u6) this.f15375b;
                Long l10 = (Long) obj;
                boolean z13 = false;
                u6Var.A2 = false;
                if (l10 == null) {
                    c22 = null;
                } else {
                    c22 = mp.u1(u6Var.f30170a).c2(l10);
                }
                u6Var.f15568z2 = c22;
                if (c22 == null) {
                    z13 = true;
                }
                u6Var.B2 = z13;
                if (c22 != null) {
                    u6Var.h1();
                    return;
                }
                return;
            case 1:
                k7 k7Var = (k7) this.f15375b;
                tg.i0 i0Var = (tg.i0) obj;
                if (i0Var == null) {
                    k7Var.f1();
                    return;
                }
                k7Var.f14925k2 = i0Var.f57954e;
                k7Var.f14924j2 = i0Var.f57955f;
                return;
            case 2:
                ((g8) this.f15375b).f14718n.f14927a0.C1 = ((Integer) obj).intValue();
                return;
            case 3:
                ((p9) this.f15375b).h((x10) obj);
                return;
            case 4:
                ((jg.m) this.f15375b).M((TLRPC.User) obj);
                return;
            case 5:
                TLRPC.User user = (TLRPC.User) obj;
                nm0 nm0Var = (nm0) ((jg.h0) this.f15375b);
                kw kwVar = nm0Var.L0;
                if (user != null) {
                    cx cxVar = kwVar.M0;
                    if (cxVar != null) {
                        cxVar.W3();
                    }
                    mp.u1(kwVar.K0).E3(null, user, null, 0, null, false, false);
                    nm0Var.Q(user.f28580id, user);
                    return;
                }
                return;
            case 6:
                ((ji.o) ((xi.e) this.f15375b).d).k(obj);
                return;
            case 7:
                kg.n nVar = (kg.n) this.f15375b;
                if (((Integer) obj).intValue() > org.telegram.messenger.g0.L(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (nVar.G != z10) {
                    nVar.G = z10;
                    if (!z10) {
                        nVar.f34683a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Object[] objArr = (Object[]) obj;
                org.telegram.messenger.g0.d0(((kg.h0) this.f15375b).f18362s, new fi.e(3));
                return;
            case 9:
                kg.s0 s0Var = (kg.s0) this.f15375b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                s0Var.H = connectedbots;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = s0Var.H.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                s0Var.I = tL_connectedBot;
                if (tL_connectedBot == null) {
                    c23 = null;
                } else {
                    c23 = s0Var.getMessagesController().c2(Long.valueOf(s0Var.I.bot_id));
                }
                s0Var.N = c23;
                TL_account.TL_connectedBot tL_connectedBot2 = s0Var.I;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                s0Var.K = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = s0Var.I;
                if (tL_connectedBot3 != null) {
                    z11 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z11 = true;
                }
                s0Var.J = z11;
                kg.b0 b0Var = s0Var.f18502w;
                if (b0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    b0Var.i(tL_businessBotRecipients);
                }
                h51 h51Var = s0Var.f18496c;
                if (h51Var != null && (c51Var = h51Var.f35796g3) != null) {
                    c51Var.O(true);
                }
                s0Var.d0(true);
                s0Var.U = true;
                return;
            case 10:
                kg.u0 u0Var = (kg.u0) this.f15375b;
                u0Var.f18529w = u0Var.d[((Integer) obj).intValue()];
                u0Var.a0(true);
                return;
            case 11:
                kg.s1 s1Var = (kg.s1) this.f15375b;
                s1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", s1Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                bn bnVar = new bn(bundle);
                bnVar.Z9 = true;
                s1Var.presentFragment(bnVar);
                return;
            case 12:
                org.telegram.messenger.g0.v1((kg.z0) this.f15375b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                return;
            case 13:
                ki.q qVar = (ki.q) this.f15375b;
                ArrayList arrayList = qVar.f18861b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                h51 h51Var2 = qVar.f18860a;
                if (h51Var2 != null && (c51Var2 = h51Var2.f35796g3) != null) {
                    c51Var2.O(true);
                    return;
                }
                return;
            case 14:
                li.g gVar = (li.g) this.f15375b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = gVar.f19961n;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                gVar.f19961n = arrayList2;
                h51 h51Var3 = gVar.f19960f;
                if (h51Var3 != null) {
                    h51Var3.f35796g3.O(z12);
                    return;
                }
                return;
            case 15:
                oi.k3 k3Var = (oi.k3) this.f15375b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = k3Var.f22209b;
                int i11 = k3Var.f22208a;
                oi.t3 t3Var = k3Var.f22211e;
                if (richMessage != null) {
                    ArrayList arrayList4 = t3Var.f22433t3;
                    ArrayList arrayList5 = t3Var.f22433t3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        oi.g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        oi.h3 h3Var = t3Var.f22437v3;
                        if (h3Var != null) {
                            h3Var.f(false);
                        }
                        oi.a aVar2 = (oi.a) arrayList5.get(i11);
                        oi.a aVar3 = (oi.a) arrayList5.get(i10);
                        CharSequence charSequence = "";
                        if (!oi.t3.D3(aVar2.f21932b)) {
                            editable = "";
                        } else {
                            editable = t3Var.P4(aVar2);
                        }
                        if (oi.t3.D3(aVar3.f21932b)) {
                            charSequence = t3Var.P4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(k3Var.f22210c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(k3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList6 = new ArrayList();
                        oi.t3.Z2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            oi.a6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new oi.a(pageblockparagraph, aVar2.f21933c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                oi.a aVar4 = (oi.a) arrayList6.get(0);
                                if (oi.t3.D3(aVar4.f21932b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) oi.a6.A(aVar4.f21932b));
                                    oi.a6.d(aVar4.f21932b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    oi.a6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new oi.a(pageblockparagraph2, aVar2.f21933c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                oi.a aVar5 = (oi.a) i5.c.h(1, arrayList6);
                                if (oi.t3.D3(aVar5.f21932b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(oi.a6.A(aVar5.f21932b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    oi.a6.d(aVar5.f21932b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    oi.a6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new oi.a(pageblockparagraph3, aVar3.f21933c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = t3Var.f22431s3;
                        if (richMessage2 == null) {
                            t3Var.f22431s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                t3Var.f22431s3.documents.addAll(arrayList8);
                            }
                        }
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            t3Var.y4((oi.a) arrayList6.get(i12));
                        }
                        while (i10 >= i11) {
                            arrayList5.remove(i10);
                            i10--;
                        }
                        arrayList5.addAll(i11, arrayList6);
                        t3Var.v4();
                        t3Var.f35796g3.O(false);
                        oi.g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        t3Var.f22425p3.onContentChanged();
                        if (arrayList6.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (oi.a) i5.c.h(1, arrayList6);
                        }
                        t3Var.post(new oi.t(4, k3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((oi.k) this.f15375b).f22198a.f22267r.Y1((TL_iv.RichMessage) obj);
                return;
            case 17:
                ((oi.b2) this.f15375b).Q.Y1((TL_iv.RichMessage) obj);
                return;
            case 18:
                oi.t3 t3Var2 = (oi.t3) this.f15375b;
                String str2 = (String) obj;
                t3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    t3Var2.V1(pageblockmath);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f15375b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = v0Var.G;
                v0Var.f30107a0 = false;
                v0Var.f30115f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                v0Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = v0Var.f30118n;
                if (matrix == null) {
                    v0Var.f30118n = new Matrix();
                } else {
                    matrix.reset();
                }
                v0Var.f30118n.postScale(8.0f, 8.0f);
                Matrix matrix2 = v0Var.f30118n;
                int[] iArr = v0Var.f30119r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                v0Var.h.setLocalMatrix(v0Var.f30118n);
                paint.setShader(v0Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                v0Var.invalidate();
                return;
            case 20:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f15375b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    t1Var.getClass();
                    return;
                }
                if (t1Var.G0 == null) {
                    t1Var.G0 = new Paint(1);
                }
                t1Var.D0 = bitmap2;
                Bitmap bitmap3 = t1Var.D0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                t1Var.F0 = bitmapShader;
                t1Var.G0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                t1Var.E0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = t1Var.E0;
                int[] iArr2 = t1Var.f30051y0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                t1Var.F0.setLocalMatrix(t1Var.E0);
                t1Var.f30012b1.invalidate();
                return;
            case 21:
                org.telegram.messenger.g0.v1((ot) this.f15375b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                return;
            case 22:
                org.telegram.ui.web.s0 s0Var2 = ((BotWebViewContainer$WebViewProxy) this.f15375b).f53088b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb2.append(str);
                sb2.append(")");
                s0Var2.d(sb2.toString());
                return;
            case 23:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f15375b;
                x0Var.f53392f = (ArrayList) obj;
                bi.g6 g6Var = x0Var.f34683a;
                if (g6Var.H) {
                    g6Var.f35796g3.O(true);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.f15375b;
                n1Var.f53254r = ((ArrayList) obj).size();
                bi.g6 g6Var2 = n1Var.f34683a;
                if (g6Var2 != null && (c51Var3 = g6Var2.f35796g3) != null && g6Var2.H) {
                    c51Var3.O(true);
                    return;
                }
                return;
            case 25:
                rh.h hVar = (rh.h) this.f15375b;
                if (((rh.b) obj) == rh.b.d && ((i7 = hVar.f56651s) == 2 || i7 == 3)) {
                    hVar.f56651s = 1;
                }
                hVar.h.run();
                return;
            case 26:
                sg.v vVar = (sg.v) this.f15375b;
                sg.x0 x0Var2 = (sg.x0) obj;
                sg.u0 u0Var2 = vVar.f57408a;
                if (x0Var2 != null) {
                    float currentWeight = u0Var2.getCurrentWeight();
                    x0Var2.f57442f = currentWeight;
                    double d = vVar.f57421p;
                    if (d > 0.0d) {
                        x0Var2.f57442f = (float) ((d / vVar.f57422q) * currentWeight);
                    }
                    if (x0Var2.f57438a.o() == 4) {
                        x0Var2.f57446k *= x0Var2.f57442f;
                    }
                }
                sg.i0 painting = u0Var2.getPainting();
                if (painting.L == null) {
                    painting.f57266f.f(new sg.d0(painting, x0Var2, 1));
                    return;
                }
                return;
            case 27:
                sh.b bVar = (sh.b) this.f15375b;
                sh.c cVar = (sh.c) obj;
                bVar.h = cVar;
                bVar.f57463c.b(cVar, true);
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(bVar, 15), 200L);
                return;
            case 28:
                a5 a5Var = (a5) this.f15375b;
                TextureView textureView = (TextureView) obj;
                a5Var.f58202x0 = textureView;
                if (textureView != null) {
                    a5Var.f58196r0.addView(textureView, 0);
                    return;
                }
                return;
            default:
                tg.l2 l2Var = (tg.l2) this.f15375b;
                l2Var.f58048n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                l2Var.f58050s = paint2;
                Bitmap bitmap4 = l2Var.f58048n;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode3, tileMode3);
                l2Var.f58049r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f10 = 0.08f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix2, f10);
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f11);
                l2Var.f58050s.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                l2Var.f58051w = new Matrix();
                return;
        }
    }
}
