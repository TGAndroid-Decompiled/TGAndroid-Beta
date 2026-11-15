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
import bi.s5;
import bi.u6;
import bi.v3;
import bi.y5;
import di.h4;
import di.v8;
import fi.c5;
import fi.f6;
import fi.h5;
import fi.i9;
import fi.k5;
import fi.v7;
import hi.c7;
import hi.d3;
import hi.d7;
import hi.l9;
import hi.m5;
import hi.sa;
import hi.u9;
import hi.v6;
import hi.w3;
import hi.x3;
import hi.x5;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.p5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.ProfileActivity;
public final class f0 implements z10 {
    public final int f1202a;
    public final Object f1203b;

    public f0(Object obj, int i7) {
        this.f1202a = i7;
        this.f1203b = obj;
    }

    @Override
    public final void a(Object obj) {
        String K;
        String str;
        String str2;
        boolean z10;
        int i7;
        float f10;
        TLRPC.User user = null;
        boolean z11 = true;
        int i10 = 0;
        switch (this.f1202a) {
            case 0:
                m0 m0Var = (m0) this.f1203b;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (m0Var.f1378r == 3) {
                        String charSequence2 = charSequence.toString();
                        if (!charSequence2.equals(m0Var.t())) {
                            if (m0Var.J == null) {
                                m0Var.J = m0Var.t();
                            }
                            m0Var.v(false);
                            m0Var.p(charSequence2);
                            m0Var.f1385w.setRevert(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                m0Var.getClass();
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                ((bi.n2) this.f1203b).a();
                return;
            case 2:
                ((Boolean) obj).getClass();
                s5 s5Var = ((y5) this.f1203b).d;
                if (s5Var != null) {
                    s5Var.run();
                    return;
                }
                return;
            case 3:
                wg.h.j(((u6) this.f1203b).getContext(), (TLRPC.TL_error) obj);
                return;
            case 4:
                ci.s sVar = (ci.s) this.f1203b;
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
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f1203b;
                Long l10 = (Long) obj;
                if (!e2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        e2Var.presentFragment(ProfileActivity.C4(l10.longValue()), true);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(new o(6));
                        return;
                    }
                }
                return;
            case 6:
                ci.n0 n0Var = (ci.n0) this.f1203b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                ci.z0 z0Var = n0Var.f5440b;
                if (!n0Var.F && tL_exportedContactToken != null) {
                    n0Var.f5445r = tL_exportedContactToken;
                    n0Var.f5446s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = n0Var.f5441c.f5427b;
                    if (!TextUtils.equals(z0Var.f5617f, str4) || z0Var.h) {
                        z0Var.f5617f = str4;
                        z0Var.h = false;
                        z0Var.I5 = null;
                        z0Var.J5 = 0;
                    }
                    if (!TextUtils.equals(z0Var.d, str3)) {
                        z0Var.d = str3;
                        Utilities.f22416e.c(new g0(str3, new ci.q0(z0Var, str3, 0)));
                    }
                    z0Var.setLinkExpires(tL_exportedContactToken.expires);
                    return;
                }
                return;
            case 7:
                ci.z0 z0Var2 = (ci.z0) this.f1203b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    z0Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z0Var2.f5730q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                z0Var2.invalidate();
                return;
            case 8:
                di.p0 p0Var = (di.p0) this.f1203b;
                int i11 = di.p0.f9195t2[((Integer) obj).intValue()];
                if (p0Var.f9205k2 != i11) {
                    p0Var.f9205k2 = i11;
                    p0Var.f9198c2.setText(hd.G(i11 / 3600, "GiftOfferHours", new Object[0]));
                }
                p0Var.e1(true);
                return;
            case 9:
                di.i1 i1Var = (di.i1) this.f1203b;
                Integer num = (Integer) obj;
                i1Var.f8768e2.g();
                i1Var.f8770g2.O(true);
                return;
            case 10:
                h4 h4Var = (h4) this.f1203b;
                h4Var.getClass();
                h4Var.f8674s = new Matrix();
                h4Var.f8675w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                h4Var.f8673r = bitmapShader;
                Paint paint = h4Var.f8669c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 11:
                v8.a((v8) this.f1203b, (TL_stars.StarGifts) obj);
                return;
            case 12:
                ((org.telegram.ui.ActionBar.u2) this.f1203b).a(((Boolean) obj).booleanValue());
                return;
            case 13:
                TextView textView = (TextView) this.f1203b;
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
                    int i12 = starGift.availability_remains;
                    if (i12 <= 0) {
                        K = hd.H(',', "Gift2Availability2ValueNone", starGift.availability_total);
                    } else {
                        K = hd.K("Gift2Availability4Value", i12, ',', hd.E(starGift.availability_total, ','));
                    }
                    textView.setText(K);
                    return;
                }
                return;
            case 14:
                fi.e1 e1Var = (fi.e1) this.f1203b;
                if (((Boolean) obj).booleanValue() && !e1Var.f11662x) {
                    e1Var.f11658n = true;
                    e1Var.J = true;
                    e1Var.u(false);
                    fi.e1.X = e1Var;
                    e1Var.K = NativeInstance.createVideoCapturer(e1Var.I, e1Var.J ? 1 : 0);
                    if (e1Var.F != null) {
                        p5 p5Var = Utilities.f22416e;
                        NativeInstance nativeInstance = e1Var.F;
                        Objects.requireNonNull(nativeInstance);
                        p5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                        e1Var.N.clear();
                        e1Var.F = null;
                    }
                    e1Var.c();
                    e1Var.k();
                    ns.f(e1Var.f11656e).k(176, Long.valueOf(e1Var.f11657f.f28068id));
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f1203b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (u0Var != null) {
                    u0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    return;
                }
                return;
            case 16:
                i9 i9Var = (i9) this.f1203b;
                Boolean bool2 = (Boolean) obj;
                i9Var.f11856k1 = false;
                i9Var.V();
                return;
            case 17:
                c5 c5Var = (c5) obj;
                k5 k5Var = ((h5) this.f1203b).f11775e;
                while (true) {
                    ArrayList arrayList2 = k5Var.H;
                    if (i10 < arrayList2.size()) {
                        if (c5Var != arrayList2.get(i10)) {
                            ((c5) arrayList2.get(i10)).getClass();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 18:
                v7 v7Var = (v7) this.f1203b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                v7Var.f12441p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    v7Var.f12438m = true;
                    v7Var.f12437l = str2;
                    v7Var.f12432f = TextUtils.isEmpty(str2);
                    View view = v7Var.f12443r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = v7Var.f12444s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                gi.q qVar = (gi.q) this.f1203b;
                String str5 = (String) obj;
                ArrayList arrayList3 = qVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    qVar.i(true);
                }
                org.telegram.messenger.g0.i3(new f6(17, qVar, str5), 120L);
                return;
            case 20:
                ((hi.m) this.f1203b).x(((Integer) obj).intValue());
                return;
            case 21:
                hi.e0 e0Var = (hi.e0) this.f1203b;
                e0Var.f14207k0.f14083n.P = ((Float) obj).floatValue();
                hi.d0 d0Var = e0Var.f14207k0;
                hi.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f14083n.P);
                    return;
                }
                return;
            case 22:
                hi.r0 r0Var = (hi.r0) this.f1203b;
                g20 g20Var = (g20) obj;
                gj gjVar = r0Var.f14961c;
                if (gjVar != null) {
                    gjVar.f23845r0 = g20Var;
                    MediaController.B().h0(r0Var.f14961c, false, true, false);
                    return;
                }
                return;
            case 23:
                hi.n2 n2Var = (hi.n2) this.f1203b;
                n2Var.h(-1.0f);
                org.telegram.messenger.g0.i3(new f6(29, n2Var, (Runnable) obj), 80L);
                return;
            case 24:
                ((d3) this.f1203b).f14116s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.g0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f28644w).start();
                return;
            case 25:
                x3 x3Var = (x3) this.f1203b;
                View view2 = (View) obj;
                v3 v3Var = x3Var.f15326b;
                if (view2 instanceof w3) {
                    v3Var.getClass();
                    int R = RecyclerView.R(view2);
                    b41 G = v3Var.f39895g3.G(R);
                    if (G != null) {
                        w3 w3Var = (w3) view2;
                        w3Var.setPosition(x3Var.b(R));
                        if (x3Var.f15329f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w3Var.b(z10, true);
                        boolean contains = x3Var.f15328e.contains(Integer.valueOf(G.d));
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
            case 26:
                v3 v3Var2 = (v3) this.f1203b;
                View view3 = (View) obj;
                if (view3 instanceof w3) {
                    l9 l9Var = (l9) v3Var2.f3935o3;
                    l9Var.f15326b.getClass();
                    ((w3) view3).setPosition(l9Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 27:
                u9 u9Var = (u9) ((m5) this.f1203b);
                sa saVar = u9Var.f15200k2;
                saVar.Y0.q((gj) obj);
                d7 d7Var = saVar.L1;
                if (d7Var != null && saVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(d7Var.f14172y);
                    boolean z12 = !isEmpty;
                    ((ke0) saVar.f15070k1.f14762c).a(!saVar.Y0.k(), false);
                    saVar.f15070k1.setVisibility(0);
                    ViewPropertyAnimator animate = saVar.f15070k1.animate();
                    if (!isEmpty) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).withEndAction(new q(10, u9Var, z12)).start();
                }
                if (saVar.B0.j()) {
                    ArrayList arrayList4 = saVar.B0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i10 < size) {
                            Object obj2 = arrayList4.get(i10);
                            i10++;
                            d7 d7Var2 = ((hi.d0) obj2).f14083n;
                            if (d7Var2 != null && d7Var2.K) {
                                if (!TextUtils.isEmpty(saVar.L1.f14172y)) {
                                    i7 = 2;
                                }
                            }
                        }
                    }
                }
                i7 = -1;
                saVar.k0(i7, true, true);
                return;
            case 28:
                c7 c7Var = (c7) obj;
                k51 k51Var = ((x5) this.f1203b).f15355n;
                if (k51Var != null) {
                    k51Var.setHDRInfo(c7Var);
                    return;
                }
                return;
            default:
                v6 v6Var = (v6) this.f1203b;
                Long l11 = (Long) obj;
                v6Var.A2 = false;
                if (l11 != null) {
                    user = np.s1(v6Var.f29679a).a2(l11);
                }
                v6Var.f15244z2 = user;
                if (user != null) {
                    z11 = false;
                }
                v6Var.B2 = z11;
                if (user != null) {
                    v6Var.g1();
                    return;
                }
                return;
        }
    }
}
