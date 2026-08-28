package kh;

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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ai1;
import org.telegram.ui.dy;
import org.telegram.ui.mx;
import org.telegram.ui.qn;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class i9 implements Utilities.Callback {
    public final int f15432a;
    public final Object f15433b;

    public i9(Object obj, int i9) {
        this.f15432a = i9;
        this.f15433b = obj;
    }

    @Override
    public final void run(Object obj) {
        z41 z41Var;
        boolean z10;
        String str;
        z41 z41Var2;
        boolean z11;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z12;
        z41 z41Var3;
        Editable editable;
        qh.a aVar;
        int i9;
        float f10;
        float f11;
        switch (this.f15432a) {
            case 0:
                ((j9) this.f15433b).f15484n.S.D = ((Integer) obj).intValue();
                return;
            case 1:
                ((ra) this.f15433b).g((Utilities.Callback) obj);
                return;
            case 2:
                mh.t tVar = (mh.t) this.f15433b;
                ArrayList arrayList = tVar.f18122b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                i51 i51Var = tVar.f18121a;
                if (i51Var != null && (z41Var = i51Var.U2) != null) {
                    z41Var.N(true);
                    return;
                }
                return;
            case 3:
                nh.f fVar = (nh.f) this.f15433b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = fVar.h;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                fVar.h = arrayList2;
                i51 i51Var2 = fVar.f18631e;
                if (i51Var2 != null) {
                    i51Var2.U2.N(z10);
                    return;
                }
                return;
            case 4:
                ((of.m) this.f15433b).L((TLRPC.User) obj);
                return;
            case 5:
                TLRPC.User user2 = (TLRPC.User) obj;
                an0 an0Var = (an0) ((of.f0) this.f15433b);
                mx mxVar = an0Var.G0;
                if (user2 != null) {
                    dy dyVar = mxVar.F0;
                    if (dyVar != null) {
                        dyVar.K3();
                    }
                    MessagesController.getInstance(mxVar.D0).openApp(user2, 0);
                    an0Var.R(user2.f22527id, user2);
                    return;
                }
                return;
            case 6:
                AndroidUtilities.hideKeyboard((mt) this.f15433b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 7:
                org.telegram.ui.web.v0 v0Var = ((BotWebViewContainer$WebViewProxy) this.f15433b).f43788b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb2.append(str);
                sb2.append(")");
                v0Var.d(sb2.toString());
                return;
            case 8:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f15433b;
                c1Var.f43819e = (ArrayList) obj;
                c51 c51Var = c1Var.f27658a;
                if (c51Var.C) {
                    c51Var.U2.N(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f15433b;
                u1Var.f44032n = ((ArrayList) obj).size();
                c51 c51Var2 = u1Var.f27658a;
                if (c51Var2 != null && (z41Var2 = c51Var2.U2) != null && c51Var2.C) {
                    z41Var2.N(true);
                    return;
                }
                return;
            case 10:
                pf.l lVar = (pf.l) this.f15433b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (lVar.B != z11) {
                    lVar.B = z11;
                    if (!z11) {
                        lVar.f27658a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((pf.e0) this.f15433b).f45609s, (d5.d) new ih.e(16));
                return;
            case 12:
                pf.m0 m0Var = (pf.m0) this.f15433b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                m0Var.C = connectedbots;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = m0Var.C.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                m0Var.D = tL_connectedBot;
                if (tL_connectedBot == null) {
                    user = null;
                } else {
                    user = m0Var.getMessagesController().getUser(Long.valueOf(m0Var.D.bot_id));
                }
                m0Var.I = user;
                TL_account.TL_connectedBot tL_connectedBot2 = m0Var.D;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                m0Var.F = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = m0Var.D;
                if (tL_connectedBot3 != null) {
                    z12 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z12 = true;
                }
                m0Var.E = z12;
                pf.x xVar = m0Var.v;
                if (xVar != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    xVar.i(tL_businessBotRecipients);
                }
                i51 i51Var3 = m0Var.f45702c;
                if (i51Var3 != null && (z41Var3 = i51Var3.U2) != null) {
                    z41Var3.N(true);
                }
                m0Var.X(true);
                m0Var.P = true;
                return;
            case 13:
                pf.o0 o0Var = (pf.o0) this.f15433b;
                o0Var.f45738w = o0Var.f45733e[((Integer) obj).intValue()];
                o0Var.U(true);
                return;
            case 14:
                pf.n1 n1Var = (pf.n1) this.f15433b;
                n1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", n1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                qn qnVar = new qn(bundle);
                qnVar.f42150y9 = true;
                n1Var.presentFragment(qnVar);
                return;
            case 15:
                AndroidUtilities.hideKeyboard((pf.h1) this.f15433b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 16:
                qh.f3 f3Var = (qh.f3) this.f15433b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = f3Var.f46382b;
                int i11 = f3Var.f46381a;
                qh.o3 o3Var = f3Var.f46384e;
                if (richMessage != null) {
                    ArrayList arrayList4 = o3Var.f46573h3;
                    ArrayList arrayList5 = o3Var.f46573h3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        qh.b2 b2Var = o3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        qh.c3 c3Var = o3Var.f46577j3;
                        if (c3Var != null) {
                            c3Var.f(false);
                        }
                        qh.a aVar2 = (qh.a) arrayList5.get(i11);
                        qh.a aVar3 = (qh.a) arrayList5.get(i10);
                        CharSequence charSequence = "";
                        if (!qh.o3.A3(aVar2.f46269b)) {
                            editable = "";
                        } else {
                            editable = o3Var.M4(aVar2);
                        }
                        if (qh.o3.A3(aVar3.f46269b)) {
                            charSequence = o3Var.M4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(f3Var.f46383c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(f3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList6 = new ArrayList();
                        qh.o3.W2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            qh.s5.e(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new qh.a(pageblockparagraph, aVar2.f46270c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                qh.a aVar4 = (qh.a) arrayList6.get(0);
                                if (qh.o3.A3(aVar4.f46269b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) qh.s5.A(aVar4.f46269b));
                                    qh.s5.e(aVar4.f46269b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    qh.s5.e(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new qh.a(pageblockparagraph2, aVar2.f46270c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                qh.a aVar5 = (qh.a) j3.r0.j(1, arrayList6);
                                if (qh.o3.A3(aVar5.f46269b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(qh.s5.A(aVar5.f46269b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    qh.s5.e(aVar5.f46269b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    qh.s5.e(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new qh.a(pageblockparagraph3, aVar3.f46270c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = o3Var.f46571g3;
                        if (richMessage2 == null) {
                            o3Var.f46571g3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                o3Var.f46571g3.documents.addAll(arrayList8);
                            }
                        }
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            o3Var.v4((qh.a) arrayList6.get(i12));
                        }
                        while (i10 >= i11) {
                            arrayList5.remove(i10);
                            i10--;
                        }
                        arrayList5.addAll(i11, arrayList6);
                        o3Var.s4();
                        o3Var.U2.N(false);
                        qh.b2 b2Var2 = o3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        o3Var.f46565d3.onContentChanged();
                        if (arrayList6.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (qh.a) j3.r0.j(1, arrayList6);
                        }
                        o3Var.post(new ai1(24, f3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((qh.k) this.f15433b).f46471a.f46606r.U1((TL_iv.RichMessage) obj);
                return;
            case 18:
                ((qh.x1) this.f15433b).L.U1((TL_iv.RichMessage) obj);
                return;
            case 19:
                qh.o3 o3Var2 = (qh.o3) this.f15433b;
                String str2 = (String) obj;
                o3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    o3Var2.R1(pageblockmath);
                    return;
                }
                return;
            case 20:
                xf.d0 d0Var = (xf.d0) this.f15433b;
                xf.f1 f1Var = (xf.f1) obj;
                xf.c1 c1Var2 = d0Var.f49189a;
                if (f1Var != null) {
                    float currentWeight = c1Var2.getCurrentWeight();
                    f1Var.f49223f = currentWeight;
                    double d = d0Var.f49202p;
                    if (d > 0.0d) {
                        f1Var.f49223f = (float) ((d / d0Var.f49203q) * currentWeight);
                    }
                    if (f1Var.f49219a.o() == 4) {
                        f1Var.f49227k *= f1Var.f49223f;
                    }
                }
                xf.q0 painting = c1Var2.getPainting();
                if (painting.L == null) {
                    painting.f49314f.f(new xf.l0(painting, f1Var, 1));
                    return;
                }
                return;
            case 21:
                xg.i iVar = (xg.i) this.f15433b;
                if (((xg.b) obj) == xg.b.d && ((i9 = iVar.f49448s) == 2 || i9 == 3)) {
                    iVar.f49448s = 1;
                }
                iVar.h.run();
                return;
            case 22:
                s5 s5Var = (s5) this.f15433b;
                TextureView textureView = (TextureView) obj;
                s5Var.f49798s0 = textureView;
                if (textureView != null) {
                    s5Var.m0.addView(textureView, 0);
                    return;
                }
                return;
            case 23:
                yf.t2 t2Var = (yf.t2) this.f15433b;
                t2Var.f50115n = (Bitmap) obj;
                Paint paint = new Paint(1);
                t2Var.f50117s = paint;
                Bitmap bitmap = t2Var.f50115n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t2Var.f50116r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f10 = 0.08f;
                } else {
                    f10 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                t2Var.f50117s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                t2Var.v = new Matrix();
                return;
            case 24:
                yg.c cVar = (yg.c) this.f15433b;
                yg.e eVar = (yg.e) obj;
                cVar.h = eVar;
                cVar.f50210c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new pf.o1(cVar, 21), 200L);
                return;
            case 25:
                ((zf.j0) this.f15433b).E1((HashMap) obj);
                return;
            default:
                zf.w1 w1Var = (zf.w1) this.f15433b;
                Boolean bool = (Boolean) obj;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (w1Var.d != isEnabled) {
                    w1Var.d = isEnabled;
                    w1Var.invalidate();
                    return;
                }
                return;
        }
    }
}
