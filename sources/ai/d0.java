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
import fi.b5;
import fi.g5;
import fi.j5;
import fi.s7;
import hi.f4;
import hi.f6;
import hi.g4;
import hi.ga;
import hi.m3;
import hi.nb;
import hi.pa;
import hi.v5;
import hi.w7;
import hi.x7;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.q5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ProfileActivity;
public final class d0 implements w10 {
    public final int f1159a;
    public final Object f1160b;

    public d0(Object obj, int i7) {
        this.f1159a = i7;
        this.f1160b = obj;
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
        switch (this.f1159a) {
            case 0:
                l0 l0Var = (l0) this.f1160b;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (l0Var.f1350r == 3) {
                        String charSequence2 = charSequence.toString();
                        if (!charSequence2.equals(l0Var.x())) {
                            if (l0Var.J == null) {
                                l0Var.J = l0Var.x();
                            }
                            l0Var.B(false);
                            l0Var.u(charSequence2);
                            l0Var.f1357w.setRevert(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                l0Var.getClass();
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                ((n3) this.f1160b).a();
                return;
            case 2:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f1160b;
                if (!((Boolean) obj).booleanValue()) {
                    l4.t(2131749595, tL_starGiftUnique);
                    return;
                }
                return;
            case 3:
                ((hi.e) this.f1160b).setLoading(((Boolean) obj).booleanValue());
                return;
            case 4:
                ((Boolean) obj).getClass();
                e8 e8Var = ((k8) this.f1160b).d;
                if (e8Var != null) {
                    e8Var.run();
                    return;
                }
                return;
            case 5:
                wg.h.j(((f9) this.f1160b).getContext(), (TLRPC.TL_error) obj);
                return;
            case 6:
                ci.s sVar = (ci.s) this.f1160b;
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
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f1160b;
                Long l10 = (Long) obj;
                if (!g2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        g2Var.presentFragment(ProfileActivity.D4(l10.longValue()), true);
                        return;
                    } else {
                        org.telegram.messenger.g0.g3(new k(7));
                        return;
                    }
                }
                return;
            case 8:
                ci.o0 o0Var = (ci.o0) this.f1160b;
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
                        Utilities.f22877e.c(new e0(str3, new ci.q0(z0Var, str3, 0)));
                    }
                    z0Var.setLinkExpires(tL_exportedContactToken.expires);
                    return;
                }
                return;
            case 9:
                ci.z0 z0Var2 = (ci.z0) this.f1160b;
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
                di.h1 h1Var = (di.h1) this.f1160b;
                Integer num = (Integer) obj;
                h1Var.f8890e2.g();
                h1Var.f8892g2.O(true);
                return;
            case 11:
                k4 k4Var = (k4) this.f1160b;
                k4Var.getClass();
                k4Var.f9143s = new Matrix();
                k4Var.f9144w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                k4Var.f9142r = bitmapShader;
                Paint paint = k4Var.f9138c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 12:
                y8.a((y8) this.f1160b, (TL_stars.StarGifts) obj);
                return;
            case 13:
                ((w2) this.f1160b).a(((Boolean) obj).booleanValue());
                return;
            case 14:
                TextView textView = (TextView) this.f1160b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        if (starGift.availability_remains <= 0) {
                            str = gd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = gd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + gd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        return;
                    }
                    int i11 = starGift.availability_remains;
                    if (i11 <= 0) {
                        K = gd.H(',', "Gift2Availability2ValueNone", starGift.availability_total);
                    } else {
                        K = gd.K("Gift2Availability4Value", i11, ',', gd.E(starGift.availability_total, ','));
                    }
                    textView.setText(K);
                    return;
                }
                return;
            case 15:
                fi.c1 c1Var = (fi.c1) this.f1160b;
                if (((Boolean) obj).booleanValue() && !c1Var.f11807x) {
                    c1Var.f11803n = true;
                    c1Var.J = true;
                    c1Var.u(false);
                    fi.c1.X = c1Var;
                    c1Var.K = NativeInstance.createVideoCapturer(c1Var.I, c1Var.J ? 1 : 0);
                    if (c1Var.F != null) {
                        q5 q5Var = Utilities.f22877e;
                        NativeInstance nativeInstance = c1Var.F;
                        Objects.requireNonNull(nativeInstance);
                        q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                        c1Var.N.clear();
                        c1Var.F = null;
                    }
                    c1Var.c();
                    c1Var.k();
                    ks.f(c1Var.f11801e).k(176, Long.valueOf(c1Var.f11802f.f28509id));
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f1160b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (u0Var != null) {
                    u0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    return;
                }
                return;
            case 17:
                fi.f9 f9Var = (fi.f9) this.f1160b;
                Boolean bool2 = (Boolean) obj;
                f9Var.f11984k1 = false;
                f9Var.V();
                return;
            case 18:
                b5 b5Var = (b5) obj;
                j5 j5Var = ((g5) this.f1160b).f12021e;
                while (true) {
                    ArrayList arrayList2 = j5Var.H;
                    if (i10 < arrayList2.size()) {
                        if (b5Var != arrayList2.get(i10)) {
                            ((b5) arrayList2.get(i10)).getClass();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 19:
                s7 s7Var = (s7) this.f1160b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                s7Var.f12550p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    s7Var.f12547m = true;
                    s7Var.f12546l = str2;
                    s7Var.f12541f = TextUtils.isEmpty(str2);
                    View view = s7Var.f12552r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = s7Var.f12553s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                gi.q qVar = (gi.q) this.f1160b;
                String str5 = (String) obj;
                ArrayList arrayList3 = qVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    qVar.i(true);
                }
                org.telegram.messenger.g0.h3(new fi.l4(21, qVar, str5), 120L);
                return;
            case 21:
                ((hi.n) this.f1160b).x(((Integer) obj).intValue());
                return;
            case 22:
                hi.n0 n0Var = (hi.n0) this.f1160b;
                n0Var.f14979k0.f14875n.P = ((Float) obj).floatValue();
                hi.m0 m0Var = n0Var.f14979k0;
                hi.l0 l0Var2 = m0Var.d;
                if (l0Var2 != null) {
                    l0Var2.setVolume(m0Var.f14875n.P);
                    return;
                }
                return;
            case 23:
                hi.a1 a1Var = (hi.a1) this.f1160b;
                d20 d20Var = (d20) obj;
                fj fjVar = a1Var.f14178c;
                if (fjVar != null) {
                    fjVar.f24101r0 = d20Var;
                    MediaController.B().h0(a1Var.f14178c, false, true, false);
                    return;
                }
                return;
            case 24:
                hi.w2 w2Var = (hi.w2) this.f1160b;
                w2Var.h(-1.0f);
                org.telegram.messenger.g0.h3(new hi.c(4, w2Var, (Runnable) obj), 80L);
                return;
            case 25:
                ((m3) this.f1160b).f14904s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.g0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f29066w).start();
                return;
            case 26:
                g4 g4Var = (g4) this.f1160b;
                View view2 = (View) obj;
                i6 i6Var = g4Var.f14529b;
                if (view2 instanceof f4) {
                    i6Var.getClass();
                    int R = RecyclerView.R(view2);
                    n41 G = i6Var.f35323g3.G(R);
                    if (G != null) {
                        f4 f4Var = (f4) view2;
                        f4Var.setPosition(g4Var.b(R));
                        if (g4Var.f14532f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f4Var.b(z10, true);
                        boolean contains = g4Var.f14531e.contains(Integer.valueOf(G.d));
                        if (f4Var.h != contains) {
                            f4Var.h = contains;
                            f4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                i6 i6Var2 = (i6) this.f1160b;
                View view3 = (View) obj;
                if (view3 instanceof f4) {
                    ga gaVar = (ga) i6Var2.f3703o3;
                    gaVar.f14529b.getClass();
                    ((f4) view3).setPosition(gaVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 28:
                pa paVar = (pa) ((v5) this.f1160b);
                nb nbVar = paVar.f15198o2;
                nbVar.Y0.q((fj) obj);
                x7 x7Var = nbVar.L1;
                if (x7Var != null && nbVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(x7Var.f15782y);
                    boolean z11 = !isEmpty;
                    ((ve0) nbVar.f15089k1.f15678c).a(!nbVar.Y0.k(), false);
                    nbVar.f15089k1.setVisibility(0);
                    ViewPropertyAnimator animate = nbVar.f15089k1.animate();
                    if (!isEmpty) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).withEndAction(new ch.k(9, paVar, z11)).start();
                }
                if (nbVar.B0.j()) {
                    ArrayList arrayList4 = nbVar.B0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i10 < size) {
                            Object obj2 = arrayList4.get(i10);
                            i10++;
                            x7 x7Var2 = ((hi.m0) obj2).f14875n;
                            if (x7Var2 != null && x7Var2.K) {
                                if (!TextUtils.isEmpty(nbVar.L1.f15782y)) {
                                    i7 = 2;
                                }
                            }
                        }
                    }
                }
                i7 = -1;
                nbVar.k0(i7, true, true);
                return;
            default:
                w7 w7Var = (w7) obj;
                x51 x51Var = ((f6) this.f1160b).f14461n;
                if (x51Var != null) {
                    x51Var.setHDRInfo(w7Var);
                    return;
                }
                return;
        }
    }
}
