package ai;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.ea;
import bi.j5;
import bi.w1;
import di.c8;
import di.l5;
import di.q5;
import di.q9;
import di.t5;
import fi.a4;
import fi.b4;
import fi.d7;
import fi.e7;
import fi.f3;
import fi.j8;
import fi.m7;
import fi.n9;
import fi.o5;
import fi.p2;
import fi.r9;
import fi.va;
import fi.w3;
import fi.w6;
import fi.x9;
import fi.y5;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.j20;
import org.telegram.messenger.p5;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.y31;
import org.telegram.ui.ProfileActivity;
public final class i implements c20 {
    public final int f1236a;
    public final Object f1237b;

    public i(Object obj, int i7) {
        this.f1236a = i7;
        this.f1237b = obj;
    }

    @Override
    public final void a(Object obj) {
        String K;
        String str;
        String str2;
        boolean z9;
        int i7;
        float f10;
        m41 m41Var;
        TLRPC.User user = null;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        switch (this.f1236a) {
            case 0:
                x xVar = (x) this.f1237b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (xVar.D == null) {
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                        xVar.D = tL_messages_stickerSet;
                    } else {
                        xVar.F = true;
                    }
                    xVar.e();
                    return;
                }
                return;
            case 1:
                f2 f2Var = (f2) this.f1237b;
                Long l10 = (Long) obj;
                if (!f2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        f2Var.presentFragment(ProfileActivity.D4(l10.longValue()), true);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(new m0(0));
                        return;
                    }
                }
                return;
            case 2:
                y0 y0Var = (y0) this.f1237b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                l1 l1Var = y0Var.f1690b;
                if (!y0Var.E && tL_exportedContactToken != null) {
                    y0Var.f1695r = tL_exportedContactToken;
                    y0Var.f1696s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = y0Var.f1691c.f1666b;
                    if (!TextUtils.equals(l1Var.f1370f, str4) || l1Var.h) {
                        l1Var.f1370f = str4;
                        l1Var.h = false;
                        l1Var.H5 = null;
                        l1Var.I5 = 0;
                    }
                    if (!TextUtils.equals(l1Var.d, str3)) {
                        l1Var.d = str3;
                        Utilities.f21336e.c(new a1.e(18, str3, new b1(l1Var, str3, 0)));
                    }
                    l1Var.setLinkExpires(tL_exportedContactToken.expires);
                    return;
                }
                return;
            case 3:
                l1 l1Var2 = (l1) this.f1237b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    l1Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        l1Var2.f1473p8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                l1Var2.invalidate();
                return;
            case 4:
                bi.a1 a1Var = (bi.a1) this.f1237b;
                int i12 = bi.a1.f3420p2[((Integer) obj).intValue()];
                if (a1Var.f3426g2 != i12) {
                    a1Var.f3426g2 = i12;
                    a1Var.Y1.setText(id.G(i12 / 3600, "GiftOfferHours", new Object[0]));
                }
                a1Var.e1(true);
                return;
            case 5:
                w1 w1Var = (w1) this.f1237b;
                Integer num = (Integer) obj;
                w1Var.f4933a2.g();
                w1Var.f4935c2.O(true);
                return;
            case 6:
                j5 j5Var = (j5) this.f1237b;
                j5Var.getClass();
                j5Var.f4091s = new Matrix();
                j5Var.f4092w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                j5Var.f4090r = bitmapShader;
                Paint paint = j5Var.f4086c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                ea.a((ea) this.f1237b, (TL_stars.StarGifts) obj);
                return;
            case 8:
                ((v2) this.f1237b).a(((Boolean) obj).booleanValue());
                return;
            case 9:
                TextView textView = (TextView) this.f1237b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        if (starGift.availability_remains <= 0) {
                            str = id.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = id.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + id.H(',', "Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        return;
                    }
                    int i13 = starGift.availability_remains;
                    if (i13 <= 0) {
                        K = id.H(',', "Gift2Availability2ValueNone", starGift.availability_total);
                    } else {
                        K = id.K("Gift2Availability4Value", i13, ',', id.E(starGift.availability_total, ','));
                    }
                    textView.setText(K);
                    return;
                }
                return;
            case 10:
                di.g1 g1Var = (di.g1) this.f1237b;
                if (((Boolean) obj).booleanValue() && !g1Var.f9006x) {
                    g1Var.f9002n = true;
                    g1Var.I = true;
                    g1Var.u(false);
                    di.g1.W = g1Var;
                    g1Var.J = NativeInstance.createVideoCapturer(g1Var.H, g1Var.I ? 1 : 0);
                    if (g1Var.E != null) {
                        p5 p5Var = Utilities.f21336e;
                        NativeInstance nativeInstance = g1Var.E;
                        Objects.requireNonNull(nativeInstance);
                        p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
                        g1Var.M.clear();
                        g1Var.E = null;
                    }
                    g1Var.c();
                    g1Var.k();
                    qs.f(g1Var.f9000e).k(176, Long.valueOf(g1Var.f9001f.f26973id));
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f1237b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (q0Var != null) {
                    q0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    return;
                }
                return;
            case 12:
                q9 q9Var = (q9) this.f1237b;
                Boolean bool = (Boolean) obj;
                q9Var.f9618j1 = false;
                q9Var.V();
                return;
            case 13:
                l5 l5Var = (l5) obj;
                t5 t5Var = ((q5) this.f1237b).f9578e;
                while (true) {
                    ArrayList arrayList2 = t5Var.G;
                    if (i10 < arrayList2.size()) {
                        if (l5Var != arrayList2.get(i10)) {
                            ((l5) arrayList2.get(i10)).getClass();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 14:
                c8 c8Var = (c8) this.f1237b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                c8Var.f8896p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    c8Var.f8893m = true;
                    c8Var.f8892l = str2;
                    c8Var.f8887f = TextUtils.isEmpty(str2);
                    View view = c8Var.f8898r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = c8Var.f8899s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ei.r rVar = (ei.r) this.f1237b;
                String str5 = (String) obj;
                ArrayList arrayList3 = rVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    rVar.i(true);
                }
                org.telegram.messenger.g0.i3(new di.z0(29, rVar, str5), 120L);
                return;
            case 16:
                ((fi.m) this.f1237b).x(((Integer) obj).intValue());
                return;
            case 17:
                fi.e0 e0Var = (fi.e0) this.f1237b;
                e0Var.f11836j0.f11779n.P = ((Float) obj).floatValue();
                fi.d0 d0Var = e0Var.f11836j0;
                fi.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f11779n.P);
                    return;
                }
                return;
            case 18:
                fi.q0 q0Var2 = (fi.q0) this.f1237b;
                j20 j20Var = (j20) obj;
                ij ijVar = q0Var2.f12639c;
                if (ijVar != null) {
                    ijVar.f23280p0 = j20Var;
                    MediaController.B().h0(q0Var2.f12639c, false, true, false);
                    return;
                }
                return;
            case 19:
                p2 p2Var = (p2) this.f1237b;
                p2Var.h(-1.0f);
                org.telegram.messenger.g0.i3(new f2.h(4, p2Var, (Runnable) obj), 80L);
                return;
            case 20:
                ((f3) this.f1237b).f11972s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.g0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f27519w).start();
                return;
            case 21:
                b4 b4Var = (b4) this.f1237b;
                View view2 = (View) obj;
                w3 w3Var = b4Var.f11667b;
                if (view2 instanceof a4) {
                    w3Var.getClass();
                    int R = RecyclerView.R(view2);
                    y31 G = w3Var.f37556f3.G(R);
                    if (G != null) {
                        a4 a4Var = (a4) view2;
                        a4Var.setPosition(b4Var.b(R));
                        if (b4Var.f11670f == G.d) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        a4Var.b(z9, true);
                        boolean contains = b4Var.f11669e.contains(Integer.valueOf(G.d));
                        if (a4Var.h != contains) {
                            a4Var.h = contains;
                            a4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                w3 w3Var2 = (w3) this.f1237b;
                View view3 = (View) obj;
                if (view3 instanceof a4) {
                    n9 n9Var = (n9) w3Var2.f13028n3;
                    n9Var.f11667b.getClass();
                    ((a4) view3).setPosition(n9Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 23:
                x9 x9Var = (x9) ((o5) this.f1237b);
                va vaVar = x9Var.f13102j2;
                vaVar.X0.q((ij) obj);
                e7 e7Var = vaVar.K1;
                if (e7Var != null && vaVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(e7Var.f11925y);
                    boolean z11 = !isEmpty;
                    ((ie0) vaVar.f12966j1.f12596c).a(!vaVar.X0.k(), false);
                    vaVar.f12966j1.setVisibility(0);
                    ViewPropertyAnimator animate = vaVar.f12966j1.animate();
                    if (!isEmpty) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).withEndAction(new bi.k1(9, x9Var, z11)).start();
                }
                if (vaVar.A0.j()) {
                    ArrayList arrayList4 = vaVar.A0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            e7 e7Var2 = ((fi.d0) obj2).f11779n;
                            if (e7Var2 != null && e7Var2.K) {
                                if (!TextUtils.isEmpty(vaVar.K1.f11925y)) {
                                    i7 = 2;
                                }
                            }
                        }
                    }
                }
                i7 = -1;
                vaVar.k0(i7, true, true);
                return;
            case 24:
                d7 d7Var = (d7) obj;
                i51 i51Var = ((y5) this.f1237b).f13179n;
                if (i51Var != null) {
                    i51Var.setHDRInfo(d7Var);
                    return;
                }
                return;
            case 25:
                w6 w6Var = (w6) this.f1237b;
                Long l11 = (Long) obj;
                w6Var.f13054w2 = false;
                if (l11 != null) {
                    user = qp.s1(w6Var.f28621a).a2(l11);
                }
                w6Var.f13053v2 = user;
                if (user == null) {
                    z10 = true;
                }
                w6Var.f13055x2 = z10;
                if (user != null) {
                    w6Var.g1();
                    return;
                }
                return;
            case 26:
                m7 m7Var = (m7) this.f1237b;
                tg.h0 h0Var = (tg.h0) obj;
                if (h0Var == null) {
                    m7Var.e1();
                    return;
                }
                m7Var.f12461g2 = h0Var.f55723e;
                m7Var.f12460f2 = h0Var.f55724f;
                return;
            case 27:
                ((j8) this.f1237b).f12241n.W.f12816y1 = ((Integer) obj).intValue();
                return;
            case 28:
                ((r9) this.f1237b).h((c20) obj);
                return;
            default:
                hi.q qVar = (hi.q) this.f1237b;
                ArrayList arrayList5 = qVar.f14875b;
                arrayList5.clear();
                arrayList5.addAll((ArrayList) obj);
                r41 r41Var = qVar.f14874a;
                if (r41Var != null && (m41Var = r41Var.f37556f3) != null) {
                    m41Var.O(true);
                    return;
                }
                return;
        }
    }
}
