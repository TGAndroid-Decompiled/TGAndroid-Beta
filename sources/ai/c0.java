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
import bi.e8;
import bi.f9;
import bi.i6;
import bi.k8;
import bi.l4;
import bi.n3;
import di.k4;
import di.y8;
import fi.a5;
import fi.a6;
import fi.f5;
import fi.i5;
import fi.s7;
import hi.c7;
import hi.d3;
import hi.d7;
import hi.l5;
import hi.m9;
import hi.ta;
import hi.v9;
import hi.w3;
import hi.w5;
import hi.x3;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.q5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.ProfileActivity;
public final class c0 implements y10 {
    public final int f1145a;
    public final Object f1146b;

    public c0(Object obj, int i7) {
        this.f1145a = i7;
        this.f1146b = obj;
    }

    @Override
    public final void a(Object obj) {
        String K;
        String str;
        String str2;
        boolean z10;
        int i7;
        float f10;
        int i10 = 0;
        switch (this.f1145a) {
            case 0:
                k0 k0Var = (k0) this.f1146b;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (k0Var.f1335r == 3) {
                        String charSequence2 = charSequence.toString();
                        if (!charSequence2.equals(k0Var.z())) {
                            if (k0Var.J == null) {
                                k0Var.J = k0Var.z();
                            }
                            k0Var.D(false);
                            k0Var.v(charSequence2);
                            k0Var.f1342w.setRevert(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                k0Var.getClass();
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                ((n3) this.f1146b).a();
                return;
            case 2:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f1146b;
                if (!((Boolean) obj).booleanValue()) {
                    l4.t(2131749595, tL_starGiftUnique);
                    return;
                }
                return;
            case 3:
                ((hi.d) this.f1146b).setLoading(((Boolean) obj).booleanValue());
                return;
            case 4:
                ((Boolean) obj).getClass();
                e8 e8Var = ((k8) this.f1146b).d;
                if (e8Var != null) {
                    e8Var.run();
                    return;
                }
                return;
            case 5:
                wg.h.j(((f9) this.f1146b).getContext(), (TLRPC.TL_error) obj);
                return;
            case 6:
                ci.s sVar = (ci.s) this.f1146b;
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
            case 7:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f1146b;
                Long l10 = (Long) obj;
                if (!g2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        g2Var.presentFragment(ProfileActivity.D4(l10.longValue()), true);
                        return;
                    } else {
                        org.telegram.messenger.g0.g3(new i(7));
                        return;
                    }
                }
                return;
            case 8:
                ci.o0 o0Var = (ci.o0) this.f1146b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                ci.z0 z0Var = o0Var.f5724b;
                if (!o0Var.F && tL_exportedContactToken != null) {
                    o0Var.f5729r = tL_exportedContactToken;
                    o0Var.f5730s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = o0Var.f5725c.f5710b;
                    if (!TextUtils.equals(z0Var.f5895f, str4) || z0Var.h) {
                        z0Var.f5895f = str4;
                        z0Var.h = false;
                        z0Var.I5 = null;
                        z0Var.J5 = 0;
                    }
                    if (!TextUtils.equals(z0Var.d, str3)) {
                        z0Var.d = str3;
                        Utilities.f22774e.c(new d0(str3, new ci.q0(z0Var, str3, 0)));
                    }
                    z0Var.setLinkExpires(tL_exportedContactToken.expires);
                    return;
                }
                return;
            case 9:
                ci.z0 z0Var2 = (ci.z0) this.f1146b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    z0Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z0Var2.f6008q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                z0Var2.invalidate();
                return;
            case 10:
                di.h1 h1Var = (di.h1) this.f1146b;
                Integer num = (Integer) obj;
                h1Var.f8894e2.g();
                h1Var.f8896g2.O(true);
                return;
            case 11:
                k4 k4Var = (k4) this.f1146b;
                k4Var.getClass();
                k4Var.f9147s = new Matrix();
                k4Var.f9148w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                k4Var.f9146r = bitmapShader;
                Paint paint = k4Var.f9142c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 12:
                y8.a((y8) this.f1146b, (TL_stars.StarGifts) obj);
                return;
            case 13:
                ((w2) this.f1146b).a(((Boolean) obj).booleanValue());
                return;
            case 14:
                TextView textView = (TextView) this.f1146b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        if (starGift.availability_remains <= 0) {
                            str = hd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = hd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + hd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        return;
                    }
                    int i11 = starGift.availability_remains;
                    if (i11 <= 0) {
                        K = hd.H(',', "Gift2Availability2ValueNone", starGift.availability_total);
                    } else {
                        K = hd.K("Gift2Availability4Value", i11, ',', hd.E(starGift.availability_total, ','));
                    }
                    textView.setText(K);
                    return;
                }
                return;
            case 15:
                fi.c1 c1Var = (fi.c1) this.f1146b;
                if (((Boolean) obj).booleanValue() && !c1Var.f11794x) {
                    c1Var.f11790n = true;
                    c1Var.J = true;
                    c1Var.u(false);
                    fi.c1.X = c1Var;
                    c1Var.K = NativeInstance.createVideoCapturer(c1Var.I, c1Var.J ? 1 : 0);
                    if (c1Var.F != null) {
                        q5 q5Var = Utilities.f22774e;
                        NativeInstance nativeInstance = c1Var.F;
                        Objects.requireNonNull(nativeInstance);
                        q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                        c1Var.N.clear();
                        c1Var.F = null;
                    }
                    c1Var.c();
                    c1Var.k();
                    ls.f(c1Var.f11788e).k(176, Long.valueOf(c1Var.f11789f.f28415id));
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f1146b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (t0Var != null) {
                    t0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    return;
                }
                return;
            case 17:
                fi.f9 f9Var = (fi.f9) this.f1146b;
                Boolean bool2 = (Boolean) obj;
                f9Var.f11973k1 = false;
                f9Var.V();
                return;
            case 18:
                a5 a5Var = (a5) obj;
                i5 i5Var = ((f5) this.f1146b).f11936e;
                while (true) {
                    ArrayList arrayList2 = i5Var.H;
                    if (i10 < arrayList2.size()) {
                        if (a5Var != arrayList2.get(i10)) {
                            ((a5) arrayList2.get(i10)).getClass();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 19:
                s7 s7Var = (s7) this.f1146b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                s7Var.f12539p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    s7Var.f12536m = true;
                    s7Var.f12535l = str2;
                    s7Var.f12530f = TextUtils.isEmpty(str2);
                    View view = s7Var.f12541r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = s7Var.f12542s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                gi.q qVar = (gi.q) this.f1146b;
                String str5 = (String) obj;
                ArrayList arrayList3 = qVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    qVar.i(true);
                }
                org.telegram.messenger.g0.h3(new a6(19, qVar, str5), 120L);
                return;
            case 21:
                ((hi.m) this.f1146b).x(((Integer) obj).intValue());
                return;
            case 22:
                hi.f0 f0Var = (hi.f0) this.f1146b;
                f0Var.f14574k0.f14494n.P = ((Float) obj).floatValue();
                hi.e0 e0Var = f0Var.f14574k0;
                hi.d0 d0Var = e0Var.d;
                if (d0Var != null) {
                    d0Var.setVolume(e0Var.f14494n.P);
                    return;
                }
                return;
            case 23:
                hi.r0 r0Var = (hi.r0) this.f1146b;
                f20 f20Var = (f20) obj;
                gj gjVar = r0Var.f15286c;
                if (gjVar != null) {
                    gjVar.f24205r0 = f20Var;
                    MediaController.B().h0(r0Var.f15286c, false, true, false);
                    return;
                }
                return;
            case 24:
                hi.n2 n2Var = (hi.n2) this.f1146b;
                n2Var.h(-1.0f);
                org.telegram.messenger.g0.h3(new hi.q1(1, n2Var, (Runnable) obj), 80L);
                return;
            case 25:
                ((d3) this.f1146b).f14350s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.g0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f28971w).start();
                return;
            case 26:
                x3 x3Var = (x3) this.f1146b;
                View view2 = (View) obj;
                i6 i6Var = x3Var.f15669b;
                if (view2 instanceof w3) {
                    i6Var.getClass();
                    int R = RecyclerView.R(view2);
                    o41 G = i6Var.f35742g3.G(R);
                    if (G != null) {
                        w3 w3Var = (w3) view2;
                        w3Var.setPosition(x3Var.b(R));
                        if (x3Var.f15672f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w3Var.b(z10, true);
                        boolean contains = x3Var.f15671e.contains(Integer.valueOf(G.d));
                        if (w3Var.h != contains) {
                            w3Var.h = contains;
                            w3Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                i6 i6Var2 = (i6) this.f1146b;
                View view3 = (View) obj;
                if (view3 instanceof w3) {
                    m9 m9Var = (m9) i6Var2.f3703o3;
                    m9Var.f15669b.getClass();
                    ((w3) view3).setPosition(m9Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 28:
                v9 v9Var = (v9) ((l5) this.f1146b);
                ta taVar = v9Var.f15569k2;
                taVar.Y0.q((gj) obj);
                d7 d7Var = taVar.L1;
                if (d7Var != null && taVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(d7Var.f14411y);
                    boolean z11 = !isEmpty;
                    ((we0) taVar.f15422k1.f15016c).a(!taVar.Y0.k(), false);
                    taVar.f15422k1.setVisibility(0);
                    ViewPropertyAnimator animate = taVar.f15422k1.animate();
                    if (!isEmpty) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).withEndAction(new ch.k(9, v9Var, z11)).start();
                }
                if (taVar.B0.j()) {
                    ArrayList arrayList4 = taVar.B0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i10 < size) {
                            Object obj2 = arrayList4.get(i10);
                            i10++;
                            d7 d7Var2 = ((hi.e0) obj2).f14494n;
                            if (d7Var2 != null && d7Var2.K) {
                                if (!TextUtils.isEmpty(taVar.L1.f14411y)) {
                                    i7 = 2;
                                }
                            }
                        }
                    }
                }
                i7 = -1;
                taVar.k0(i7, true, true);
                return;
            default:
                c7 c7Var = (c7) obj;
                y51 y51Var = ((w5) this.f1146b).f15611n;
                if (y51Var != null) {
                    y51Var.setHDRInfo(c7Var);
                    return;
                }
                return;
        }
    }
}
