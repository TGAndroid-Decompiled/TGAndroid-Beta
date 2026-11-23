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
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.jw;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class c7 implements w10 {
    public final int f14275a;
    public final Object f14276b;

    public c7(Object obj, int i7) {
        this.f14275a = i7;
        this.f14276b = obj;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User c22;
        boolean z10;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User c23;
        TL_account.TL_businessBotRights makeDefault;
        boolean z11;
        b51 b51Var;
        b51 b51Var2;
        boolean z12;
        Editable editable;
        oi.a aVar;
        String str;
        b51 b51Var3;
        int i7;
        float f10;
        float f11;
        switch (this.f14275a) {
            case 0:
                e7 e7Var = (e7) this.f14276b;
                Long l10 = (Long) obj;
                boolean z13 = false;
                e7Var.A2 = false;
                if (l10 == null) {
                    c22 = null;
                } else {
                    c22 = mp.u1(e7Var.f30223a).c2(l10);
                }
                e7Var.f14399z2 = c22;
                if (c22 == null) {
                    z13 = true;
                }
                e7Var.B2 = z13;
                if (c22 != null) {
                    e7Var.h1();
                    return;
                }
                return;
            case 1:
                f8 f8Var = (f8) this.f14276b;
                tg.m0 m0Var = (tg.m0) obj;
                if (m0Var == null) {
                    f8Var.f1();
                    return;
                }
                f8Var.f14493k2 = m0Var.f58075e;
                f8Var.f14492j2 = m0Var.f58076f;
                return;
            case 2:
                ((b9) this.f14276b).f14237n.f14495a0.C1 = ((Integer) obj).intValue();
                return;
            case 3:
                ((ka) this.f14276b).h((w10) obj);
                return;
            case 4:
                ((jg.m) this.f14276b).M((TLRPC.User) obj);
                return;
            case 5:
                TLRPC.User user = (TLRPC.User) obj;
                mm0 mm0Var = (mm0) ((jg.h0) this.f14276b);
                jw jwVar = mm0Var.L0;
                if (user != null) {
                    bx bxVar = jwVar.M0;
                    if (bxVar != null) {
                        bxVar.W3();
                    }
                    mp.u1(jwVar.K0).E3(null, user, null, 0, null, false, false);
                    mm0Var.Q(user.f28641id, user);
                    return;
                }
                return;
            case 6:
                ((ji.n) ((xi.e) this.f14276b).d).j(obj);
                return;
            case 7:
                kg.n nVar = (kg.n) this.f14276b;
                if (((Integer) obj).intValue() > org.telegram.messenger.g0.L(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (nVar.G != z10) {
                    nVar.G = z10;
                    if (!z10) {
                        nVar.f34213a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Object[] objArr = (Object[]) obj;
                org.telegram.messenger.g0.d0(((kg.h0) this.f14276b).f18422s, new fi.e(3));
                return;
            case 9:
                kg.s0 s0Var = (kg.s0) this.f14276b;
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
                kg.b0 b0Var = s0Var.f18562w;
                if (b0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    b0Var.i(tL_businessBotRecipients);
                }
                g51 g51Var = s0Var.f18556c;
                if (g51Var != null && (b51Var = g51Var.f35323g3) != null) {
                    b51Var.O(true);
                }
                s0Var.d0(true);
                s0Var.U = true;
                return;
            case 10:
                kg.u0 u0Var = (kg.u0) this.f14276b;
                u0Var.f18593w = u0Var.d[((Integer) obj).intValue()];
                u0Var.a0(true);
                return;
            case 11:
                kg.t1 t1Var = (kg.t1) this.f14276b;
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
                org.telegram.messenger.g0.v1((kg.z0) this.f14276b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                return;
            case 13:
                ki.q qVar = (ki.q) this.f14276b;
                ArrayList arrayList = qVar.f18935b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                g51 g51Var2 = qVar.f18934a;
                if (g51Var2 != null && (b51Var2 = g51Var2.f35323g3) != null) {
                    b51Var2.O(true);
                    return;
                }
                return;
            case 14:
                li.f fVar = (li.f) this.f14276b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = fVar.f20027n;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                fVar.f20027n = arrayList2;
                g51 g51Var3 = fVar.f20026f;
                if (g51Var3 != null) {
                    g51Var3.f35323g3.O(z12);
                    return;
                }
                return;
            case 15:
                oi.k3 k3Var = (oi.k3) this.f14276b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = k3Var.f22281b;
                int i11 = k3Var.f22280a;
                oi.t3 t3Var = k3Var.f22283e;
                if (richMessage != null) {
                    ArrayList arrayList4 = t3Var.f22503t3;
                    ArrayList arrayList5 = t3Var.f22503t3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        oi.g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        oi.h3 h3Var = t3Var.f22507v3;
                        if (h3Var != null) {
                            h3Var.f(false);
                        }
                        oi.a aVar2 = (oi.a) arrayList5.get(i11);
                        oi.a aVar3 = (oi.a) arrayList5.get(i10);
                        CharSequence charSequence = "";
                        if (!oi.t3.D3(aVar2.f22001b)) {
                            editable = "";
                        } else {
                            editable = t3Var.P4(aVar2);
                        }
                        if (oi.t3.D3(aVar3.f22001b)) {
                            charSequence = t3Var.P4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(k3Var.f22282c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(k3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList6 = new ArrayList();
                        oi.t3.Z2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            oi.a6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new oi.a(pageblockparagraph, aVar2.f22002c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                oi.a aVar4 = (oi.a) arrayList6.get(0);
                                if (oi.t3.D3(aVar4.f22001b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) oi.a6.A(aVar4.f22001b));
                                    oi.a6.d(aVar4.f22001b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    oi.a6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new oi.a(pageblockparagraph2, aVar2.f22002c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                oi.a aVar5 = (oi.a) i5.c.h(1, arrayList6);
                                if (oi.t3.D3(aVar5.f22001b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(oi.a6.A(aVar5.f22001b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    oi.a6.d(aVar5.f22001b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    oi.a6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new oi.a(pageblockparagraph3, aVar3.f22002c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = t3Var.f22501s3;
                        if (richMessage2 == null) {
                            t3Var.f22501s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                t3Var.f22501s3.documents.addAll(arrayList8);
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
                        t3Var.f35323g3.O(false);
                        oi.g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        t3Var.f22495p3.onContentChanged();
                        if (arrayList6.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (oi.a) i5.c.h(1, arrayList6);
                        }
                        t3Var.post(new n2.c0(6, k3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((oi.l) this.f14276b).f22285a.f22367r.Y1((TL_iv.RichMessage) obj);
                return;
            case 17:
                ((oi.b2) this.f14276b).Q.Y1((TL_iv.RichMessage) obj);
                return;
            case 18:
                oi.t3 t3Var2 = (oi.t3) this.f14276b;
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
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f14276b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = v0Var.G;
                v0Var.f30170a0 = false;
                v0Var.f30178f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                v0Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = v0Var.f30181n;
                if (matrix == null) {
                    v0Var.f30181n = new Matrix();
                } else {
                    matrix.reset();
                }
                v0Var.f30181n.postScale(8.0f, 8.0f);
                Matrix matrix2 = v0Var.f30181n;
                int[] iArr = v0Var.f30182r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                v0Var.h.setLocalMatrix(v0Var.f30181n);
                paint.setShader(v0Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                v0Var.invalidate();
                return;
            case 20:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.f14276b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    t1Var2.getClass();
                    return;
                }
                if (t1Var2.G0 == null) {
                    t1Var2.G0 = new Paint(1);
                }
                t1Var2.D0 = bitmap2;
                Bitmap bitmap3 = t1Var2.D0;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                t1Var2.F0 = bitmapShader;
                t1Var2.G0.setShader(bitmapShader);
                Matrix matrix3 = new Matrix();
                t1Var2.E0 = matrix3;
                matrix3.postScale(8.0f, 8.0f);
                Matrix matrix4 = t1Var2.E0;
                int[] iArr2 = t1Var2.f30112y0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                t1Var2.F0.setLocalMatrix(t1Var2.E0);
                t1Var2.f30073b1.invalidate();
                return;
            case 21:
                org.telegram.messenger.g0.v1((mt) this.f14276b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                return;
            case 22:
                org.telegram.ui.web.s0 s0Var2 = ((BotWebViewContainer$WebViewProxy) this.f14276b).f53320b;
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
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f14276b;
                x0Var.f53632f = (ArrayList) obj;
                bi.i6 i6Var = x0Var.f34213a;
                if (i6Var.H) {
                    i6Var.f35323g3.O(true);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.f14276b;
                n1Var.f53493r = ((ArrayList) obj).size();
                bi.i6 i6Var2 = n1Var.f34213a;
                if (i6Var2 != null && (b51Var3 = i6Var2.f35323g3) != null && i6Var2.H) {
                    b51Var3.O(true);
                    return;
                }
                return;
            case 25:
                rh.h hVar = (rh.h) this.f14276b;
                if (((rh.b) obj) == rh.b.d && ((i7 = hVar.f56733s) == 2 || i7 == 3)) {
                    hVar.f56733s = 1;
                }
                hVar.h.run();
                return;
            case 26:
                sg.v vVar = (sg.v) this.f14276b;
                sg.w0 w0Var = (sg.w0) obj;
                sg.t0 t0Var = vVar.f57487a;
                if (w0Var != null) {
                    float currentWeight = t0Var.getCurrentWeight();
                    w0Var.f57516f = currentWeight;
                    double d = vVar.f57500p;
                    if (d > 0.0d) {
                        w0Var.f57516f = (float) ((d / vVar.f57501q) * currentWeight);
                    }
                    if (w0Var.f57512a.o() == 4) {
                        w0Var.f57520k *= w0Var.f57516f;
                    }
                }
                sg.h0 painting = t0Var.getPainting();
                if (painting.L == null) {
                    painting.f57343f.f(new sg.d0(painting, w0Var, 1));
                    return;
                }
                return;
            case 27:
                sh.b bVar = (sh.b) this.f14276b;
                sh.c cVar = (sh.c) obj;
                bVar.h = cVar;
                bVar.f57543c.b(cVar, true);
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(bVar, 15), 200L);
                return;
            case 28:
                l5 l5Var = (l5) this.f14276b;
                TextureView textureView = (TextureView) obj;
                l5Var.f58318y0 = textureView;
                if (textureView != null) {
                    l5Var.f58312s0.addView(textureView, 0);
                    return;
                }
                return;
            default:
                tg.o2 o2Var = (tg.o2) this.f14276b;
                o2Var.f58157n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                o2Var.f58159s = paint2;
                Bitmap bitmap4 = o2Var.f58157n;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode3, tileMode3);
                o2Var.f58158r = bitmapShader2;
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
                o2Var.f58159s.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                o2Var.f58160w = new Matrix();
                return;
        }
    }
}
