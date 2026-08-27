package lh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.TextureView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.lt;
import org.telegram.ui.gy;
import org.telegram.ui.px;
import org.telegram.ui.rn;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

public final class n6 implements Utilities.Callback {

    public final int f16434a;

    public final Object f16435b;

    public n6(Object obj, int i10) {
        this.f16434a = i10;
        this.f16435b = obj;
    }

    @Override
    public final void run(Object obj) {
        b51 b51Var;
        b51 b51Var2;
        b51 b51Var3;
        int i10;
        switch (this.f16434a) {
            case 0:
                y7 y7Var = (y7) obj;
                a61 a61Var = ((q6) this.f16435b).f16575n;
                if (a61Var != null) {
                    a61Var.setHDRInfo(y7Var);
                }
                break;
            case 1:
                j8 j8Var = (j8) this.f16435b;
                zf.m0 m0Var = (zf.m0) obj;
                if (m0Var == null) {
                    j8Var.U();
                } else {
                    j8Var.f16205k0 = m0Var.f50571e;
                    j8Var.f16204j0 = m0Var.f50572f;
                }
                break;
            case 2:
                ((f9) this.f16435b).f16010n.S.D = ((Integer) obj).intValue();
                break;
            case 3:
                ((oa) this.f16435b).g((Utilities.Callback) obj);
                break;
            case 4:
                nh.s sVar = (nh.s) this.f16435b;
                ArrayList arrayList = sVar.f18938b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                k51 k51Var = sVar.f18937a;
                if (k51Var != null && (b51Var = k51Var.U2) != null) {
                    b51Var.N(true);
                    break;
                }
                break;
            case 5:
                oh.f fVar = (oh.f) this.f16435b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = fVar.h;
                boolean z10 = arrayList3 == null || arrayList3.isEmpty();
                fVar.h = arrayList2;
                k51 k51Var2 = fVar.f19480e;
                if (k51Var2 != null) {
                    k51Var2.U2.N(z10);
                }
                break;
            case 6:
                AndroidUtilities.hideKeyboard((lt) this.f16435b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 7:
                org.telegram.ui.web.w0 w0Var = ((BotWebViewContainer$WebViewProxy) this.f16435b).f43766b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                w0Var.d(sb2.toString());
                break;
            case 8:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f16435b;
                d1Var.f43806e = (ArrayList) obj;
                e51 e51Var = d1Var.f28261a;
                if (e51Var.C) {
                    e51Var.U2.N(true);
                }
                break;
            case 9:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f16435b;
                v1Var.f44019n = ((ArrayList) obj).size();
                e51 e51Var2 = v1Var.f28261a;
                if (e51Var2 != null && (b51Var2 = e51Var2.U2) != null && e51Var2.C) {
                    b51Var2.N(true);
                    break;
                }
                break;
            case 10:
                ((pf.k) this.f16435b).L((TLRPC.User) obj);
                break;
            case 11:
                TLRPC.User user = (TLRPC.User) obj;
                cn0 cn0Var = (cn0) ((pf.z) this.f16435b);
                px pxVar = cn0Var.G0;
                if (user != null) {
                    gy gyVar = pxVar.F0;
                    if (gyVar != null) {
                        gyVar.K3();
                    }
                    MessagesController.getInstance(pxVar.D0).openApp(user, 0);
                    cn0Var.R(user.f22527id, user);
                    break;
                }
                break;
            case 12:
                qf.m mVar = (qf.m) this.f16435b;
                boolean z11 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (mVar.B != z11) {
                    mVar.B = z11;
                    if (!z11) {
                        mVar.f28261a.x0(0);
                    }
                    break;
                }
                break;
            case 13:
                AndroidUtilities.forEachViews((RecyclerView) ((qf.e0) this.f16435b).f46280s, (d5.d) new j4.w0(16));
                break;
            case 14:
                qf.m0 m0Var2 = (qf.m0) this.f16435b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                m0Var2.C = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : m0Var2.C.connected_bots.get(0);
                m0Var2.D = tL_connectedBot;
                m0Var2.I = tL_connectedBot == null ? null : m0Var2.getMessagesController().getUser(Long.valueOf(m0Var2.D.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = m0Var2.D;
                m0Var2.F = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = m0Var2.D;
                m0Var2.E = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                qf.x xVar = m0Var2.v;
                if (xVar != null) {
                    xVar.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                k51 k51Var3 = m0Var2.f46372c;
                if (k51Var3 != null && (b51Var3 = k51Var3.U2) != null) {
                    b51Var3.N(true);
                }
                m0Var2.Y(true);
                m0Var2.P = true;
                break;
            case 15:
                qf.o0 o0Var = (qf.o0) this.f16435b;
                o0Var.f46408w = o0Var.f46403e[((Integer) obj).intValue()];
                o0Var.V(true);
                break;
            case 16:
                qf.n1 n1Var = (qf.n1) this.f16435b;
                n1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", n1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                rn rnVar = new rn(bundle);
                rnVar.f42286y9 = true;
                n1Var.presentFragment(rnVar);
                break;
            case 17:
                AndroidUtilities.hideKeyboard((qf.h1) this.f16435b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 18:
                rh.g3 g3Var = (rh.g3) this.f16435b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i11 = g3Var.f47154b;
                int i12 = g3Var.f47153a;
                rh.p3 p3Var = g3Var.f47156e;
                if (richMessage != null) {
                    ArrayList arrayList4 = p3Var.f47348h3;
                    ArrayList arrayList5 = p3Var.f47348h3;
                    if (i12 < arrayList4.size() && i11 < arrayList5.size()) {
                        rh.b2 b2Var = p3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        rh.d3 d3Var = p3Var.f47352j3;
                        if (d3Var != null) {
                            d3Var.f(false);
                        }
                        rh.a aVar = (rh.a) arrayList5.get(i12);
                        rh.a aVar2 = (rh.a) arrayList5.get(i11);
                        CharSequence charSequenceM4 = rh.p3.A3(aVar.f47028b) ? p3Var.M4(aVar) : "";
                        CharSequence charSequenceM5 = rh.p3.A3(aVar2.f47028b) ? p3Var.M4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceM4.subSequence(0, Math.max(0, Math.min(g3Var.f47155c, charSequenceM4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequenceM5.subSequence(Math.max(0, Math.min(g3Var.d, charSequenceM5.length())), charSequenceM5.length()));
                        ArrayList arrayList6 = new ArrayList();
                        rh.p3.W2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            rh.t5.e(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new rh.a(pageblockparagraph, aVar.f47029c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                rh.a aVar3 = (rh.a) arrayList6.get(0);
                                if (rh.p3.A3(aVar3.f47028b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) rh.t5.A(aVar3.f47028b));
                                    rh.t5.e(aVar3.f47028b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    rh.t5.e(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new rh.a(pageblockparagraph2, aVar.f47029c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                rh.a aVar4 = (rh.a) i0.a.i(1, arrayList6);
                                if (rh.p3.A3(aVar4.f47028b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(rh.t5.A(aVar4.f47028b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    rh.t5.e(aVar4.f47028b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    rh.t5.e(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new rh.a(pageblockparagraph3, aVar2.f47029c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = p3Var.f47346g3;
                        if (richMessage2 == null) {
                            p3Var.f47346g3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                p3Var.f47346g3.documents.addAll(arrayList8);
                            }
                        }
                        for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                            p3Var.v4((rh.a) arrayList6.get(i13));
                        }
                        while (i11 >= i12) {
                            arrayList5.remove(i11);
                            i11--;
                        }
                        arrayList5.addAll(i12, arrayList6);
                        p3Var.s4();
                        p3Var.U2.N(false);
                        rh.b2 b2Var2 = p3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        p3Var.f47340d3.onContentChanged();
                        p3Var.post(new rh.o2(1, g3Var, arrayList6.isEmpty() ? null : (rh.a) i0.a.i(1, arrayList6)));
                        break;
                    }
                }
                break;
            case 19:
                ((rh.k) this.f16435b).f47228a.f47324r.U1((TL_iv.RichMessage) obj);
                break;
            case 20:
                ((rh.x1) this.f16435b).L.U1((TL_iv.RichMessage) obj);
                break;
            case 21:
                rh.p3 p3Var2 = (rh.p3) this.f16435b;
                String str = (String) obj;
                p3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    p3Var2.R1(pageblockmath);
                    break;
                }
                break;
            case 22:
                yf.d0 d0Var = (yf.d0) this.f16435b;
                yf.e1 e1Var = (yf.e1) obj;
                yf.b1 b1Var = d0Var.f49896a;
                if (e1Var != null) {
                    float currentWeight = b1Var.getCurrentWeight();
                    e1Var.f49925f = currentWeight;
                    double d = d0Var.f49909p;
                    if (d > 0.0d) {
                        e1Var.f49925f = (float) ((d / d0Var.f49910q) * ((double) currentWeight));
                    }
                    if (e1Var.f49921a.o() == 4) {
                        e1Var.f49929k *= e1Var.f49925f;
                    }
                }
                yf.p0 painting = b1Var.getPainting();
                if (painting.L == null) {
                    painting.f50015f.f(new yf.l0(painting, e1Var, 1));
                    break;
                }
                break;
            case 23:
                yg.i iVar = (yg.i) this.f16435b;
                if (((yg.b) obj) == yg.b.d && ((i10 = iVar.f50161s) == 2 || i10 == 3)) {
                    iVar.f50161s = 1;
                }
                iVar.h.run();
                break;
            case 24:
                r5 r5Var = (r5) this.f16435b;
                TextureView textureView = (TextureView) obj;
                r5Var.f50393s0 = textureView;
                if (textureView != null) {
                    r5Var.m0.addView(textureView, 0);
                }
                break;
            case 25:
                zf.t2 t2Var = (zf.t2) this.f16435b;
                t2Var.f50710n = (Bitmap) obj;
                Paint paint = new Paint(1);
                t2Var.f50712s = paint;
                Bitmap bitmap = t2Var.f50710n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t2Var.f50711r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.07f);
                t2Var.f50712s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                t2Var.v = new Matrix();
                break;
            default:
                zg.c cVar = (zg.c) this.f16435b;
                zg.e eVar = (zg.e) obj;
                cVar.h = eVar;
                cVar.f50806c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new qf.b(cVar, 28), 200L);
                break;
        }
    }
}
