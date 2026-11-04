package ai;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ci.e9;
import ei.c8;
import ei.r9;
import gi.f7;
import gi.m7;
import gi.o9;
import gi.va;
import gi.x9;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.ProfileActivity;
public final class v2 implements u10 {
    public final int f1034a;
    public final Object f1035b;

    public v2(Object obj, int i3) {
        this.f1034a = i3;
        this.f1035b = obj;
    }

    @Override
    public final void a(Object obj) {
        String K;
        String str;
        String str2;
        boolean z10;
        int i3;
        float f10;
        TLRPC.User user = null;
        int i10 = 0;
        boolean z11 = false;
        int i11 = 0;
        switch (this.f1034a) {
            case 0:
                Boolean bool = (Boolean) obj;
                ((w2) this.f1035b).a();
                return;
            case 1:
                ((i6) this.f1035b).j0(((Boolean) obj).booleanValue());
                return;
            case 2:
                ((Boolean) obj).getClass();
                a6 a6Var = ((g6) this.f1035b).d;
                if (a6Var != null) {
                    a6Var.run();
                    return;
                }
                return;
            case 3:
                xg.j.j(((d7) this.f1035b).getContext(), (TLRPC.TL_error) obj);
                return;
            case 4:
                bi.s sVar = (bi.s) this.f1035b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (sVar.E == null) {
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                        sVar.E = tL_messages_stickerSet;
                    } else {
                        sVar.G = true;
                    }
                    sVar.e();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f1035b;
                Long l10 = (Long) obj;
                if (!d2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        d2Var.presentFragment(ProfileActivity.A4(l10.longValue()), true);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(new y1(1));
                        return;
                    }
                }
                return;
            case 6:
                bi.o0 o0Var = (bi.o0) this.f1035b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                bi.a1 a1Var = o0Var.f3807b;
                if (!o0Var.F && tL_exportedContactToken != null) {
                    o0Var.f3812r = tL_exportedContactToken;
                    o0Var.f3813s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = o0Var.f3808c.f3793b;
                    if (!TextUtils.equals(a1Var.f3446f, str4) || a1Var.h) {
                        a1Var.f3446f = str4;
                        a1Var.h = false;
                        a1Var.I5 = null;
                        a1Var.J5 = 0;
                    }
                    if (!TextUtils.equals(a1Var.d, str3)) {
                        a1Var.d = str3;
                        Utilities.f21387e.c(new a1.f(20, str3, new bi.r0(a1Var, str3, 0)));
                    }
                    a1Var.setLinkExpires(tL_exportedContactToken.expires);
                    return;
                }
                return;
            case 7:
                bi.a1 a1Var2 = (bi.a1) this.f1035b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    a1Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        a1Var2.f3559q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                a1Var2.invalidate();
                return;
            case 8:
                ci.t0 t0Var = (ci.t0) this.f1035b;
                int i12 = ci.t0.f5995q2[((Integer) obj).intValue()];
                if (t0Var.f6002h2 != i12) {
                    t0Var.f6002h2 = i12;
                    t0Var.Z1.setText(bd.G(i12 / 3600, "GiftOfferHours", new Object[0]));
                }
                t0Var.e1(true);
                return;
            case 9:
                ci.p1 p1Var = (ci.p1) this.f1035b;
                Integer num = (Integer) obj;
                p1Var.f5723b2.g();
                p1Var.f5724d2.O(true);
                return;
            case 10:
                ci.q4 q4Var = (ci.q4) this.f1035b;
                q4Var.getClass();
                q4Var.f5817s = new Matrix();
                q4Var.f5818w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                q4Var.f5816r = bitmapShader;
                Paint paint = q4Var.f5812c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 11:
                e9.a((e9) this.f1035b, (TL_stars.StarGifts) obj);
                return;
            case 12:
                ((org.telegram.ui.ActionBar.t2) this.f1035b).a(((Boolean) obj).booleanValue());
                return;
            case 13:
                TextView textView = (TextView) this.f1035b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        if (starGift.availability_remains <= 0) {
                            str = bd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = bd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + bd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        return;
                    }
                    int i13 = starGift.availability_remains;
                    if (i13 <= 0) {
                        K = bd.H(',', "Gift2Availability2ValueNone", starGift.availability_total);
                    } else {
                        K = bd.K("Gift2Availability4Value", i13, ',', bd.E(starGift.availability_total, ','));
                    }
                    textView.setText(K);
                    return;
                }
                return;
            case 14:
                ei.g1 g1Var = (ei.g1) this.f1035b;
                if (((Boolean) obj).booleanValue() && !g1Var.f10305x) {
                    g1Var.f10301n = true;
                    g1Var.J = true;
                    g1Var.u(false);
                    ei.g1.X = g1Var;
                    g1Var.K = NativeInstance.createVideoCapturer(g1Var.I, g1Var.J ? 1 : 0);
                    if (g1Var.F != null) {
                        org.telegram.messenger.p5 p5Var = Utilities.f21387e;
                        NativeInstance nativeInstance = g1Var.F;
                        Objects.requireNonNull(nativeInstance);
                        p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
                        g1Var.N.clear();
                        g1Var.F = null;
                    }
                    g1Var.c();
                    g1Var.k();
                    hs.f(g1Var.f10299e).k(176, Long.valueOf(g1Var.f10300f.f27018id));
                    return;
                }
                return;
            case 15:
                r9 r9Var = (r9) this.f1035b;
                Boolean bool2 = (Boolean) obj;
                r9Var.f10935l1 = false;
                r9Var.d0();
                return;
            case 16:
                ei.k5 k5Var = (ei.k5) obj;
                ei.s5 s5Var = ((ei.p5) this.f1035b).f10770e;
                while (true) {
                    ArrayList arrayList2 = s5Var.H;
                    if (i10 < arrayList2.size()) {
                        if (k5Var != arrayList2.get(i10)) {
                            ((ei.k5) arrayList2.get(i10)).getClass();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 17:
                c8 c8Var = (c8) this.f1035b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                c8Var.f10174p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    c8Var.f10171m = true;
                    c8Var.f10170l = str2;
                    c8Var.f10165f = TextUtils.isEmpty(str2);
                    View view = c8Var.f10176r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = c8Var.f10177s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                fi.q qVar = (fi.q) this.f1035b;
                String str5 = (String) obj;
                ArrayList arrayList3 = qVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    qVar.i(true);
                }
                org.telegram.messenger.g0.i3(new ei.b0(29, qVar, str5), 120L);
                return;
            case 19:
                ((gi.m) this.f1035b).x(((Integer) obj).intValue());
                return;
            case 20:
                gi.e0 e0Var = (gi.e0) this.f1035b;
                e0Var.f12632k0.f12544n.P = ((Float) obj).floatValue();
                gi.d0 d0Var = e0Var.f12632k0;
                gi.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f12544n.P);
                    return;
                }
                return;
            case 21:
                gi.q0 q0Var = (gi.q0) this.f1035b;
                b20 b20Var = (b20) obj;
                zi ziVar = q0Var.f13413c;
                if (ziVar != null) {
                    ziVar.f26886p0 = b20Var;
                    MediaController.B().h0(q0Var.f13413c, false, true, false);
                    return;
                }
                return;
            case 22:
                gi.n2 n2Var = (gi.n2) this.f1035b;
                n2Var.h(-1.0f);
                org.telegram.messenger.g0.i3(new g2.c(10, n2Var, (Runnable) obj), 80L);
                return;
            case 23:
                ((gi.d3) this.f1035b).f12576s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.g0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.f27551w).start();
                return;
            case 24:
                gi.y3 y3Var = (gi.y3) this.f1035b;
                View view2 = (View) obj;
                h4 h4Var = y3Var.f13923b;
                if (view2 instanceof gi.x3) {
                    h4Var.getClass();
                    int R = RecyclerView.R(view2);
                    r31 G = h4Var.f35594g3.G(R);
                    if (G != null) {
                        gi.x3 x3Var = (gi.x3) view2;
                        x3Var.setPosition(y3Var.b(R));
                        if (y3Var.f13926f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x3Var.b(z10, true);
                        boolean contains = y3Var.f13925e.contains(Integer.valueOf(G.d));
                        if (x3Var.h != contains) {
                            x3Var.h = contains;
                            x3Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                h4 h4Var2 = (h4) this.f1035b;
                View view3 = (View) obj;
                if (view3 instanceof gi.x3) {
                    o9 o9Var = (o9) h4Var2.f679o3;
                    o9Var.f13923b.getClass();
                    ((gi.x3) view3).setPosition(o9Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 26:
                x9 x9Var = (x9) ((gi.m5) this.f1035b);
                va vaVar = x9Var.f13872k2;
                vaVar.Y0.q((zi) obj);
                f7 f7Var = vaVar.L1;
                if (f7Var != null && vaVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(f7Var.f12751y);
                    boolean z12 = !isEmpty;
                    ((je0) vaVar.k1.f13304c).a(!vaVar.Y0.k(), false);
                    vaVar.k1.setVisibility(0);
                    ViewPropertyAnimator animate = vaVar.k1.animate();
                    if (!isEmpty) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).withEndAction(new ci.e1(9, x9Var, z12)).start();
                }
                if (vaVar.B0.j()) {
                    ArrayList arrayList4 = vaVar.B0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            f7 f7Var2 = ((gi.d0) obj2).f12544n;
                            if (f7Var2 != null && f7Var2.K) {
                                if (!TextUtils.isEmpty(vaVar.L1.f12751y)) {
                                    i3 = 2;
                                }
                            }
                        }
                    }
                }
                i3 = -1;
                vaVar.k0(i3, true, true);
                return;
            case 27:
                gi.e7 e7Var = (gi.e7) obj;
                b51 b51Var = ((gi.y5) this.f1035b).f13953n;
                if (b51Var != null) {
                    b51Var.setHDRInfo(e7Var);
                    return;
                }
                return;
            case 28:
                gi.x6 x6Var = (gi.x6) this.f1035b;
                Long l11 = (Long) obj;
                x6Var.f13866x2 = false;
                if (l11 != null) {
                    user = hp.s1(x6Var.f28583a).a2(l11);
                }
                x6Var.f13865w2 = user;
                if (user == null) {
                    z11 = true;
                }
                x6Var.f13867y2 = z11;
                if (user != null) {
                    x6Var.g1();
                    return;
                }
                return;
            default:
                m7 m7Var = (m7) this.f1035b;
                ug.g0 g0Var = (ug.g0) obj;
                if (g0Var == null) {
                    m7Var.e1();
                    return;
                }
                m7Var.f13260h2 = g0Var.f56011e;
                m7Var.f13259g2 = g0Var.f56012f;
                return;
        }
    }
}
