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
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ot;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.kw;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class t6 implements y10 {
    public final int f15380a;
    public final Object f15381b;

    public t6(Object obj, int i7) {
        this.f15380a = i7;
        this.f15381b = obj;
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
        switch (this.f15380a) {
            case 0:
                v6 v6Var = (v6) this.f15381b;
                Long l10 = (Long) obj;
                boolean z13 = false;
                v6Var.A2 = false;
                if (l10 == null) {
                    c22 = null;
                } else {
                    c22 = np.u1(v6Var.f30139a).c2(l10);
                }
                v6Var.f15556z2 = c22;
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
                l7 l7Var = (l7) this.f15381b;
                tg.i0 i0Var = (tg.i0) obj;
                if (i0Var == null) {
                    l7Var.f1();
                    return;
                }
                l7Var.f14940k2 = i0Var.f57923e;
                l7Var.f14939j2 = i0Var.f57924f;
                return;
            case 2:
                ((h8) this.f15381b).f14692n.f14942a0.C1 = ((Integer) obj).intValue();
                return;
            case 3:
                ((q9) this.f15381b).h((y10) obj);
                return;
            case 4:
                ((jg.m) this.f15381b).M((TLRPC.User) obj);
                return;
            case 5:
                TLRPC.User user = (TLRPC.User) obj;
                mm0 mm0Var = (mm0) ((jg.h0) this.f15381b);
                kw kwVar = mm0Var.L0;
                if (user != null) {
                    cx cxVar = kwVar.M0;
                    if (cxVar != null) {
                        cxVar.W3();
                    }
                    np.u1(kwVar.K0).E3(null, user, null, 0, null, false, false);
                    mm0Var.Q(user.f28547id, user);
                    return;
                }
                return;
            case 6:
                ((ji.n) ((xi.e) this.f15381b).d).k(obj);
                return;
            case 7:
                kg.n nVar = (kg.n) this.f15381b;
                if (((Integer) obj).intValue() > org.telegram.messenger.g0.L(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (nVar.G != z10) {
                    nVar.G = z10;
                    if (!z10) {
                        nVar.f34671a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Object[] objArr = (Object[]) obj;
                org.telegram.messenger.g0.d0(((kg.h0) this.f15381b).f18326s, new fi.e(3));
                return;
            case 9:
                kg.t0 t0Var = (kg.t0) this.f15381b;
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
                kg.b0 b0Var = t0Var.f18481w;
                if (b0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    b0Var.i(tL_businessBotRecipients);
                }
                h51 h51Var = t0Var.f18475c;
                if (h51Var != null && (c51Var = h51Var.f35742g3) != null) {
                    c51Var.O(true);
                }
                t0Var.d0(true);
                t0Var.U = true;
                return;
            case 10:
                kg.v0 v0Var = (kg.v0) this.f15381b;
                v0Var.f18504w = v0Var.d[((Integer) obj).intValue()];
                v0Var.a0(true);
                return;
            case 11:
                kg.t1 t1Var = (kg.t1) this.f15381b;
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
                org.telegram.messenger.g0.v1((kg.a1) this.f15381b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                return;
            case 13:
                ki.q qVar = (ki.q) this.f15381b;
                ArrayList arrayList = qVar.f18830b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                h51 h51Var2 = qVar.f18829a;
                if (h51Var2 != null && (c51Var2 = h51Var2.f35742g3) != null) {
                    c51Var2.O(true);
                    return;
                }
                return;
            case 14:
                li.g gVar = (li.g) this.f15381b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = gVar.f19930n;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                gVar.f19930n = arrayList2;
                h51 h51Var3 = gVar.f19929f;
                if (h51Var3 != null) {
                    h51Var3.f35742g3.O(z12);
                    return;
                }
                return;
            case 15:
                oi.j3 j3Var = (oi.j3) this.f15381b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = j3Var.f22151b;
                int i11 = j3Var.f22150a;
                oi.s3 s3Var = j3Var.f22153e;
                if (richMessage != null) {
                    ArrayList arrayList4 = s3Var.f22373t3;
                    ArrayList arrayList5 = s3Var.f22373t3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        oi.e2 e2Var = s3Var.R3;
                        if (e2Var != null) {
                            e2Var.d();
                        }
                        oi.g3 g3Var = s3Var.f22377v3;
                        if (g3Var != null) {
                            g3Var.f(false);
                        }
                        oi.a aVar2 = (oi.a) arrayList5.get(i11);
                        oi.a aVar3 = (oi.a) arrayList5.get(i10);
                        CharSequence charSequence = "";
                        if (!oi.s3.D3(aVar2.f21901b)) {
                            editable = "";
                        } else {
                            editable = s3Var.P4(aVar2);
                        }
                        if (oi.s3.D3(aVar3.f21901b)) {
                            charSequence = s3Var.P4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(j3Var.f22152c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(j3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList6 = new ArrayList();
                        oi.s3.Z2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            oi.z5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new oi.a(pageblockparagraph, aVar2.f21902c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                oi.a aVar4 = (oi.a) arrayList6.get(0);
                                if (oi.s3.D3(aVar4.f21901b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) oi.z5.A(aVar4.f21901b));
                                    oi.z5.d(aVar4.f21901b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    oi.z5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new oi.a(pageblockparagraph2, aVar2.f21902c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                oi.a aVar5 = (oi.a) i5.c.h(1, arrayList6);
                                if (oi.s3.D3(aVar5.f21901b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(oi.z5.A(aVar5.f21901b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    oi.z5.d(aVar5.f21901b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    oi.z5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new oi.a(pageblockparagraph3, aVar3.f21902c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = s3Var.f22371s3;
                        if (richMessage2 == null) {
                            s3Var.f22371s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                s3Var.f22371s3.documents.addAll(arrayList8);
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
                        s3Var.f35742g3.O(false);
                        oi.e2 e2Var2 = s3Var.R3;
                        if (e2Var2 != null) {
                            e2Var2.h();
                        }
                        s3Var.f22365p3.onContentChanged();
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
                ((oi.k) this.f15381b).f22155a.f22237r.Y1((TL_iv.RichMessage) obj);
                return;
            case 17:
                ((oi.a2) this.f15381b).Q.Y1((TL_iv.RichMessage) obj);
                return;
            case 18:
                oi.s3 s3Var2 = (oi.s3) this.f15381b;
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
                org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) this.f15381b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = v0Var2.G;
                v0Var2.f30076a0 = false;
                v0Var2.f30084f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                v0Var2.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = v0Var2.f30087n;
                if (matrix == null) {
                    v0Var2.f30087n = new Matrix();
                } else {
                    matrix.reset();
                }
                v0Var2.f30087n.postScale(8.0f, 8.0f);
                Matrix matrix2 = v0Var2.f30087n;
                int[] iArr = v0Var2.f30088r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                v0Var2.h.setLocalMatrix(v0Var2.f30087n);
                paint.setShader(v0Var2.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                v0Var2.invalidate();
                return;
            case 20:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.f15381b;
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
                int[] iArr2 = t1Var2.f30020y0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                t1Var2.F0.setLocalMatrix(t1Var2.E0);
                t1Var2.f29981b1.invalidate();
                return;
            case 21:
                org.telegram.messenger.g0.v1((ot) this.f15381b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                return;
            case 22:
                org.telegram.ui.web.s0 s0Var = ((BotWebViewContainer$WebViewProxy) this.f15381b).f53055b;
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
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f15381b;
                x0Var.f53360f = (ArrayList) obj;
                bi.i6 i6Var = x0Var.f34671a;
                if (i6Var.H) {
                    i6Var.f35742g3.O(true);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.f15381b;
                n1Var.f53222r = ((ArrayList) obj).size();
                bi.i6 i6Var2 = n1Var.f34671a;
                if (i6Var2 != null && (c51Var3 = i6Var2.f35742g3) != null && i6Var2.H) {
                    c51Var3.O(true);
                    return;
                }
                return;
            case 25:
                rh.h hVar = (rh.h) this.f15381b;
                if (((rh.b) obj) == rh.b.d && ((i7 = hVar.f56620s) == 2 || i7 == 3)) {
                    hVar.f56620s = 1;
                }
                hVar.h.run();
                return;
            case 26:
                sg.v vVar = (sg.v) this.f15381b;
                sg.x0 x0Var2 = (sg.x0) obj;
                sg.u0 u0Var = vVar.f57377a;
                if (x0Var2 != null) {
                    float currentWeight = u0Var.getCurrentWeight();
                    x0Var2.f57411f = currentWeight;
                    double d = vVar.f57390p;
                    if (d > 0.0d) {
                        x0Var2.f57411f = (float) ((d / vVar.f57391q) * currentWeight);
                    }
                    if (x0Var2.f57407a.o() == 4) {
                        x0Var2.f57415k *= x0Var2.f57411f;
                    }
                }
                sg.i0 painting = u0Var.getPainting();
                if (painting.L == null) {
                    painting.f57235f.f(new sg.d0(painting, x0Var2, 1));
                    return;
                }
                return;
            case 27:
                sh.b bVar = (sh.b) this.f15381b;
                sh.c cVar = (sh.c) obj;
                bVar.h = cVar;
                bVar.f57432c.b(cVar, true);
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.i1(bVar, 14), 200L);
                return;
            case 28:
                b5 b5Var = (b5) this.f15381b;
                TextureView textureView = (TextureView) obj;
                b5Var.f58171x0 = textureView;
                if (textureView != null) {
                    b5Var.f58165r0.addView(textureView, 0);
                    return;
                }
                return;
            default:
                tg.l2 l2Var = (tg.l2) this.f15381b;
                l2Var.f58017n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                l2Var.f58019s = paint2;
                Bitmap bitmap4 = l2Var.f58017n;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode3, tileMode3);
                l2Var.f58018r = bitmapShader2;
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
                l2Var.f58019s.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                l2Var.f58020w = new Matrix();
                return;
        }
    }
}
