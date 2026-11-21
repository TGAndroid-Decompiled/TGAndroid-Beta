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
import bi.c8;
import bi.d9;
import bi.g6;
import bi.i4;
import bi.i8;
import bi.l3;
import di.k4;
import di.y8;
import fi.b5;
import fi.f9;
import fi.g5;
import fi.j5;
import fi.l4;
import fi.s7;
import hi.b7;
import hi.c7;
import hi.d3;
import hi.k5;
import hi.l9;
import hi.sa;
import hi.u9;
import hi.v3;
import hi.v5;
import hi.w3;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e20;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.q5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.ProfileActivity;
public final class h0 implements x10 {
    public final int f1215a;
    public final Object f1216b;

    public h0(Object obj, int i7) {
        this.f1215a = i7;
        this.f1216b = obj;
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
        switch (this.f1215a) {
            case 0:
                p0 p0Var = (p0) this.f1216b;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (p0Var.f1399r == 3) {
                        String charSequence2 = charSequence.toString();
                        if (!charSequence2.equals(p0Var.z())) {
                            if (p0Var.J == null) {
                                p0Var.J = p0Var.z();
                            }
                            p0Var.D(false);
                            p0Var.v(charSequence2);
                            p0Var.f1406w.setRevert(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                p0Var.getClass();
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                ((l3) this.f1216b).a();
                return;
            case 2:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f1216b;
                if (!((Boolean) obj).booleanValue()) {
                    i4.t(2131749595, tL_starGiftUnique);
                    return;
                }
                return;
            case 3:
                ((hi.e) this.f1216b).setLoading(((Boolean) obj).booleanValue());
                return;
            case 4:
                ((Boolean) obj).getClass();
                c8 c8Var = ((i8) this.f1216b).d;
                if (c8Var != null) {
                    c8Var.run();
                    return;
                }
                return;
            case 5:
                wg.h.j(((d9) this.f1216b).getContext(), (TLRPC.TL_error) obj);
                return;
            case 6:
                ci.s sVar = (ci.s) this.f1216b;
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
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f1216b;
                Long l10 = (Long) obj;
                if (!g2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        g2Var.presentFragment(ProfileActivity.D4(l10.longValue()), true);
                        return;
                    } else {
                        org.telegram.messenger.g0.g3(new n(7));
                        return;
                    }
                }
                return;
            case 8:
                ci.o0 o0Var = (ci.o0) this.f1216b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                ci.z0 z0Var = o0Var.f5758b;
                if (!o0Var.F && tL_exportedContactToken != null) {
                    o0Var.f5763r = tL_exportedContactToken;
                    o0Var.f5764s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = o0Var.f5759c.f5744b;
                    if (!TextUtils.equals(z0Var.f5929f, str4) || z0Var.h) {
                        z0Var.f5929f = str4;
                        z0Var.h = false;
                        z0Var.I5 = null;
                        z0Var.J5 = 0;
                    }
                    if (!TextUtils.equals(z0Var.d, str3)) {
                        z0Var.d = str3;
                        Utilities.f22807e.c(new i0(str3, new ci.q0(z0Var, str3, 0)));
                    }
                    z0Var.setLinkExpires(tL_exportedContactToken.expires);
                    return;
                }
                return;
            case 9:
                ci.z0 z0Var2 = (ci.z0) this.f1216b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    z0Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z0Var2.f6042q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                z0Var2.invalidate();
                return;
            case 10:
                di.h1 h1Var = (di.h1) this.f1216b;
                Integer num = (Integer) obj;
                h1Var.f8926e2.g();
                h1Var.f8928g2.O(true);
                return;
            case 11:
                k4 k4Var = (k4) this.f1216b;
                k4Var.getClass();
                k4Var.f9179s = new Matrix();
                k4Var.f9180w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                k4Var.f9178r = bitmapShader;
                Paint paint = k4Var.f9174c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 12:
                y8.a((y8) this.f1216b, (TL_stars.StarGifts) obj);
                return;
            case 13:
                ((org.telegram.ui.ActionBar.w2) this.f1216b).a(((Boolean) obj).booleanValue());
                return;
            case 14:
                TextView textView = (TextView) this.f1216b;
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
                fi.c1 c1Var = (fi.c1) this.f1216b;
                if (((Boolean) obj).booleanValue() && !c1Var.f11842x) {
                    c1Var.f11838n = true;
                    c1Var.J = true;
                    c1Var.u(false);
                    fi.c1.X = c1Var;
                    c1Var.K = NativeInstance.createVideoCapturer(c1Var.I, c1Var.J ? 1 : 0);
                    if (c1Var.F != null) {
                        q5 q5Var = Utilities.f22807e;
                        NativeInstance nativeInstance = c1Var.F;
                        Objects.requireNonNull(nativeInstance);
                        q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                        c1Var.N.clear();
                        c1Var.F = null;
                    }
                    c1Var.c();
                    c1Var.k();
                    ks.f(c1Var.f11836e).k(176, Long.valueOf(c1Var.f11837f.f28448id));
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f1216b;
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
                f9 f9Var = (f9) this.f1216b;
                Boolean bool2 = (Boolean) obj;
                f9Var.f12019k1 = false;
                f9Var.V();
                return;
            case 18:
                b5 b5Var = (b5) obj;
                j5 j5Var = ((g5) this.f1216b).f12056e;
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
                s7 s7Var = (s7) this.f1216b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                s7Var.f12585p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    s7Var.f12582m = true;
                    s7Var.f12581l = str2;
                    s7Var.f12576f = TextUtils.isEmpty(str2);
                    View view = s7Var.f12587r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = s7Var.f12588s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                gi.q qVar = (gi.q) this.f1216b;
                String str5 = (String) obj;
                ArrayList arrayList3 = qVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    qVar.i(true);
                }
                org.telegram.messenger.g0.h3(new l4(21, qVar, str5), 120L);
                return;
            case 21:
                ((hi.o) this.f1216b).x(((Integer) obj).intValue());
                return;
            case 22:
                hi.g0 g0Var = (hi.g0) this.f1216b;
                g0Var.f14677k0.f14623n.P = ((Float) obj).floatValue();
                hi.f0 f0Var = g0Var.f14677k0;
                hi.e0 e0Var = f0Var.d;
                if (e0Var != null) {
                    e0Var.setVolume(f0Var.f14623n.P);
                    return;
                }
                return;
            case 23:
                hi.s0 s0Var = (hi.s0) this.f1216b;
                e20 e20Var = (e20) obj;
                fj fjVar = s0Var.f15361c;
                if (fjVar != null) {
                    fjVar.f24021r0 = e20Var;
                    MediaController.B().h0(s0Var.f15361c, false, true, false);
                    return;
                }
                return;
            case 24:
                hi.n2 n2Var = (hi.n2) this.f1216b;
                n2Var.h(-1.0f);
                org.telegram.messenger.g0.h3(new hi.c(3, n2Var, (Runnable) obj), 80L);
                return;
            case 25:
                ((d3) this.f1216b).f14501s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.g0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f29002w).start();
                return;
            case 26:
                w3 w3Var = (w3) this.f1216b;
                View view2 = (View) obj;
                g6 g6Var = w3Var.f15694b;
                if (view2 instanceof v3) {
                    g6Var.getClass();
                    int R = RecyclerView.R(view2);
                    o41 G = g6Var.f35796g3.G(R);
                    if (G != null) {
                        v3 v3Var = (v3) view2;
                        v3Var.setPosition(w3Var.b(R));
                        if (w3Var.f15697f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v3Var.b(z10, true);
                        boolean contains = w3Var.f15696e.contains(Integer.valueOf(G.d));
                        if (v3Var.h != contains) {
                            v3Var.h = contains;
                            v3Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                g6 g6Var2 = (g6) this.f1216b;
                View view3 = (View) obj;
                if (view3 instanceof v3) {
                    l9 l9Var = (l9) g6Var2.f3682o3;
                    l9Var.f15694b.getClass();
                    ((v3) view3).setPosition(l9Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 28:
                u9 u9Var = (u9) ((k5) this.f1216b);
                sa saVar = u9Var.f15581k2;
                saVar.Y0.q((fj) obj);
                c7 c7Var = saVar.L1;
                if (c7Var != null && saVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(c7Var.f14384y);
                    boolean z11 = !isEmpty;
                    ((we0) saVar.f15416k1.f15003c).a(!saVar.Y0.k(), false);
                    saVar.f15416k1.setVisibility(0);
                    ViewPropertyAnimator animate = saVar.f15416k1.animate();
                    if (!isEmpty) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).withEndAction(new ch.k(9, u9Var, z11)).start();
                }
                if (saVar.B0.j()) {
                    ArrayList arrayList4 = saVar.B0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i10 < size) {
                            Object obj2 = arrayList4.get(i10);
                            i10++;
                            c7 c7Var2 = ((hi.f0) obj2).f14623n;
                            if (c7Var2 != null && c7Var2.K) {
                                if (!TextUtils.isEmpty(saVar.L1.f14384y)) {
                                    i7 = 2;
                                }
                            }
                        }
                    }
                }
                i7 = -1;
                saVar.k0(i7, true, true);
                return;
            default:
                b7 b7Var = (b7) obj;
                y51 y51Var = ((v5) this.f1216b).f15633n;
                if (y51Var != null) {
                    y51Var.setHDRInfo(b7Var);
                    return;
                }
                return;
        }
    }
}
