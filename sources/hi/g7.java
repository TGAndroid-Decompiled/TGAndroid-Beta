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
import java.util.HashMap;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.an;
import org.telegram.ui.hw;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.yw;
public final class g7 implements z10 {
    public final int f14345a;
    public final Object f14346b;

    public g7(Object obj, int i7) {
        this.f14345a = i7;
        this.f14346b = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User a22;
        TL_account.TL_businessBotRights makeDefault;
        boolean z11;
        p41 p41Var;
        p41 p41Var2;
        boolean z12;
        Editable editable;
        oi.a aVar;
        String str;
        p41 p41Var3;
        int i7;
        float f10;
        float f11;
        switch (this.f14345a) {
            case 0:
                l7 l7Var = (l7) this.f14346b;
                tg.h0 h0Var = (tg.h0) obj;
                if (h0Var == null) {
                    l7Var.e1();
                    return;
                }
                l7Var.f14598k2 = h0Var.f57323e;
                l7Var.f14597j2 = h0Var.f57324f;
                return;
            case 1:
                ((h8) this.f14346b).f14384n.f14600a0.C1 = ((Integer) obj).intValue();
                return;
            case 2:
                ((p9) this.f14346b).h((z10) obj);
                return;
            case 3:
                ((jg.m) this.f14346b).M((TLRPC.User) obj);
                return;
            case 4:
                TLRPC.User user = (TLRPC.User) obj;
                cm0 cm0Var = (cm0) ((jg.h0) this.f14346b);
                hw hwVar = cm0Var.L0;
                if (user != null) {
                    yw ywVar = hwVar.M0;
                    if (ywVar != null) {
                        ywVar.W3();
                    }
                    np.s1(hwVar.K0).x3(null, user, null, 0, null, false, false);
                    cm0Var.Q(user.f28200id, user);
                    return;
                }
                return;
            case 5:
                ((ji.m) ((xi.e) this.f14346b).d).j(obj);
                return;
            case 6:
                kg.n nVar = (kg.n) this.f14346b;
                if (((Integer) obj).intValue() > org.telegram.messenger.g0.L(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (nVar.G != z10) {
                    nVar.G = z10;
                    if (!z10) {
                        nVar.f38880a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                Object[] objArr = (Object[]) obj;
                org.telegram.messenger.g0.d0(((kg.g0) this.f14346b).f17945s, new fi.e(3));
                return;
            case 8:
                kg.q0 q0Var = (kg.q0) this.f14346b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                q0Var.H = connectedbots;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = q0Var.H.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                q0Var.I = tL_connectedBot;
                if (tL_connectedBot == null) {
                    a22 = null;
                } else {
                    a22 = q0Var.getMessagesController().a2(Long.valueOf(q0Var.I.bot_id));
                }
                q0Var.N = a22;
                TL_account.TL_connectedBot tL_connectedBot2 = q0Var.I;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                q0Var.K = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = q0Var.I;
                if (tL_connectedBot3 != null) {
                    z11 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z11 = true;
                }
                q0Var.J = z11;
                kg.a0 a0Var = q0Var.f18067w;
                if (a0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    a0Var.i(tL_businessBotRecipients);
                }
                u41 u41Var = q0Var.f18061c;
                if (u41Var != null && (p41Var = u41Var.f39892g3) != null) {
                    p41Var.O(true);
                }
                q0Var.d0(true);
                q0Var.U = true;
                return;
            case 9:
                kg.s0 s0Var = (kg.s0) this.f14346b;
                s0Var.f18094w = s0Var.d[((Integer) obj).intValue()];
                s0Var.a0(true);
                return;
            case 10:
                kg.r1 r1Var = (kg.r1) this.f14346b;
                r1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", r1Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                an anVar = new an(bundle);
                anVar.Y9 = true;
                r1Var.presentFragment(anVar);
                return;
            case 11:
                org.telegram.messenger.g0.v1((kg.x0) this.f14346b);
                org.telegram.messenger.g0.i3((Runnable) obj, 80L);
                return;
            case 12:
                ki.s sVar = (ki.s) this.f14346b;
                ArrayList arrayList = sVar.f18535b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                u41 u41Var2 = sVar.f18534a;
                if (u41Var2 != null && (p41Var2 = u41Var2.f39892g3) != null) {
                    p41Var2.O(true);
                    return;
                }
                return;
            case 13:
                li.e eVar = (li.e) this.f14346b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = eVar.f19558n;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar.f19558n = arrayList2;
                u41 u41Var3 = eVar.f19557f;
                if (u41Var3 != null) {
                    u41Var3.f39892g3.O(z12);
                    return;
                }
                return;
            case 14:
                oi.h3 h3Var = (oi.h3) this.f14346b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = h3Var.f21728b;
                int i11 = h3Var.f21727a;
                oi.q3 q3Var = h3Var.f21730e;
                if (richMessage != null) {
                    ArrayList arrayList4 = q3Var.f21939t3;
                    ArrayList arrayList5 = q3Var.f21939t3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        oi.d2 d2Var = q3Var.R3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        oi.e3 e3Var = q3Var.f21943v3;
                        if (e3Var != null) {
                            e3Var.f(false);
                        }
                        oi.a aVar2 = (oi.a) arrayList5.get(i11);
                        oi.a aVar3 = (oi.a) arrayList5.get(i10);
                        CharSequence charSequence = "";
                        if (!oi.q3.D3(aVar2.f21544b)) {
                            editable = "";
                        } else {
                            editable = q3Var.P4(aVar2);
                        }
                        if (oi.q3.D3(aVar3.f21544b)) {
                            charSequence = q3Var.P4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(h3Var.f21729c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(h3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList6 = new ArrayList();
                        oi.q3.Z2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            oi.y5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new oi.a(pageblockparagraph, aVar2.f21545c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                oi.a aVar4 = (oi.a) arrayList6.get(0);
                                if (oi.q3.D3(aVar4.f21544b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) oi.y5.A(aVar4.f21544b));
                                    oi.y5.d(aVar4.f21544b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    oi.y5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new oi.a(pageblockparagraph2, aVar2.f21545c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                oi.a aVar5 = (oi.a) i5.c.h(1, arrayList6);
                                if (oi.q3.D3(aVar5.f21544b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(oi.y5.A(aVar5.f21544b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    oi.y5.d(aVar5.f21544b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    oi.y5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new oi.a(pageblockparagraph3, aVar3.f21545c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = q3Var.f21937s3;
                        if (richMessage2 == null) {
                            q3Var.f21937s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                q3Var.f21937s3.documents.addAll(arrayList8);
                            }
                        }
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            q3Var.y4((oi.a) arrayList6.get(i12));
                        }
                        while (i10 >= i11) {
                            arrayList5.remove(i10);
                            i10--;
                        }
                        arrayList5.addAll(i11, arrayList6);
                        q3Var.v4();
                        q3Var.f39892g3.O(false);
                        oi.d2 d2Var2 = q3Var.R3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        q3Var.f21931p3.onContentChanged();
                        if (arrayList6.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (oi.a) i5.c.h(1, arrayList6);
                        }
                        q3Var.post(new kg.t1(29, h3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((oi.k) this.f14346b).f21766a.f21848r.Y1((TL_iv.RichMessage) obj);
                return;
            case 16:
                ((oi.z1) this.f14346b).Q.Y1((TL_iv.RichMessage) obj);
                return;
            case 17:
                oi.q3 q3Var2 = (oi.q3) this.f14346b;
                String str2 = (String) obj;
                q3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    q3Var2.V1(pageblockmath);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f14346b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = w0Var.G;
                w0Var.f29776a0 = false;
                w0Var.f29784f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                w0Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = w0Var.f29787n;
                if (matrix == null) {
                    w0Var.f29787n = new Matrix();
                } else {
                    matrix.reset();
                }
                w0Var.f29787n.postScale(8.0f, 8.0f);
                Matrix matrix2 = w0Var.f29787n;
                int[] iArr = w0Var.f29788r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                w0Var.h.setLocalMatrix(w0Var.f29787n);
                paint.setShader(w0Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                w0Var.invalidate();
                return;
            case 19:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f14346b;
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
                int[] iArr2 = t1Var.f29658y0;
                matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                t1Var.F0.setLocalMatrix(t1Var.E0);
                t1Var.f29619b1.invalidate();
                return;
            case 20:
                org.telegram.messenger.g0.v1((ft) this.f14346b);
                org.telegram.messenger.g0.i3((Runnable) obj, 80L);
                return;
            case 21:
                org.telegram.ui.web.s0 s0Var2 = ((BotWebViewContainer$WebViewProxy) this.f14346b).f52563b;
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
            case 22:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f14346b;
                x0Var.f52869f = (ArrayList) obj;
                bi.v3 v3Var = x0Var.f38880a;
                if (v3Var.H) {
                    v3Var.f39892g3.O(true);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.f14346b;
                n1Var.f52731r = ((ArrayList) obj).size();
                bi.v3 v3Var2 = n1Var.f38880a;
                if (v3Var2 != null && (p41Var3 = v3Var2.f39892g3) != null && v3Var2.H) {
                    p41Var3.O(true);
                    return;
                }
                return;
            case 24:
                rh.h hVar = (rh.h) this.f14346b;
                if (((rh.b) obj) == rh.b.d && ((i7 = hVar.f56036s) == 2 || i7 == 3)) {
                    hVar.f56036s = 1;
                }
                hVar.h.run();
                return;
            case 25:
                sg.v vVar = (sg.v) this.f14346b;
                sg.x0 x0Var2 = (sg.x0) obj;
                sg.u0 u0Var = vVar.f56793a;
                if (x0Var2 != null) {
                    float currentWeight = u0Var.getCurrentWeight();
                    x0Var2.f56827f = currentWeight;
                    double d = vVar.f56806p;
                    if (d > 0.0d) {
                        x0Var2.f56827f = (float) ((d / vVar.f56807q) * currentWeight);
                    }
                    if (x0Var2.f56823a.o() == 4) {
                        x0Var2.f56831k *= x0Var2.f56827f;
                    }
                }
                sg.i0 painting = u0Var.getPainting();
                if (painting.L == null) {
                    painting.f56651f.f(new sg.d0(painting, x0Var2, 1));
                    return;
                }
                return;
            case 26:
                sh.b bVar = (sh.b) this.f14346b;
                sh.c cVar = (sh.c) obj;
                bVar.h = cVar;
                bVar.f56848c.b(cVar, true);
                org.telegram.messenger.g0.i3(new q2.d(bVar, 12), 200L);
                return;
            case 27:
                c5 c5Var = (c5) this.f14346b;
                TextureView textureView = (TextureView) obj;
                c5Var.f57578x0 = textureView;
                if (textureView != null) {
                    c5Var.f57572r0.addView(textureView, 0);
                    return;
                }
                return;
            case 28:
                tg.l2 l2Var = (tg.l2) this.f14346b;
                l2Var.f57427n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                l2Var.f57429s = paint2;
                Bitmap bitmap4 = l2Var.f57427n;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode3, tileMode3);
                l2Var.f57428r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = 0.08f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix2, f10);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f11);
                l2Var.f57429s.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                l2Var.f57430w = new Matrix();
                return;
            default:
                ((ug.j0) this.f14346b).y1((HashMap) obj);
                return;
        }
    }
}
