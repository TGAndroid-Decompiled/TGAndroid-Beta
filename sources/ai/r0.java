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
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.cy;
import org.telegram.ui.lx;
public final class r0 implements Utilities.Callback {
    public final int f2095a;
    public final Object f2096b;

    public r0(Object obj, int i10) {
        this.f2095a = i10;
        this.f2096b = obj;
    }

    @Override
    public final void run(Object obj) {
        String formatPluralStringComma;
        String str;
        String str2;
        boolean z10;
        int i10;
        float f7;
        u61 u61Var;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = true;
        switch (this.f2095a) {
            case 0:
                b1 b1Var = (b1) this.f2096b;
                int i13 = b1.f1002w0[((Integer) obj).intValue()];
                if (b1Var.f1015n0 != i13) {
                    b1Var.f1015n0 = i13;
                    b1Var.f1008f0.setText(LocaleController.formatPluralString("GiftOfferHours", i13 / 3600, new Object[0]));
                }
                b1Var.U(true);
                return;
            case 1:
                a2 a2Var = (a2) this.f2096b;
                Integer num = (Integer) obj;
                a2Var.f933i0.g();
                a2Var.f935k0.N(true);
                return;
            case 2:
                l5 l5Var = (l5) this.f2096b;
                l5Var.getClass();
                l5Var.f1701s = new Matrix();
                l5Var.v = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                l5Var.f1700r = bitmapShader;
                Paint paint = l5Var.f1697c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 3:
                ga.a((ga) this.f2096b, (TL_stars.StarGifts) obj);
                return;
            case 4:
                ((org.telegram.ui.ActionBar.f3) this.f2096b).dismiss(((Boolean) obj).booleanValue());
                return;
            case 5:
                TextView textView = (TextView) this.f2096b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        if (starGift.availability_remains <= 0) {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        return;
                    }
                    int i14 = starGift.availability_remains;
                    if (i14 <= 0) {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability4Value", i14, LocaleController.formatNumber(starGift.availability_total, ','));
                    }
                    textView.setText(formatPluralStringComma);
                    return;
                }
                return;
            case 6:
                ci.h1 h1Var = (ci.h1) this.f2096b;
                if (((Boolean) obj).booleanValue() && !h1Var.f5447w) {
                    h1Var.f5444n = true;
                    h1Var.I = true;
                    h1Var.u(false);
                    ci.h1.W = h1Var;
                    h1Var.J = NativeInstance.createVideoCapturer(h1Var.H, h1Var.I ? 1 : 0);
                    if (h1Var.E != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = h1Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                        h1Var.M.clear();
                        h1Var.E = null;
                    }
                    h1Var.c();
                    h1Var.k();
                    NotificationCenter.getInstance(h1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1Var.f5443f.f20296id));
                    return;
                }
                return;
            case 7:
                ci.aa aaVar = (ci.aa) this.f2096b;
                Boolean bool = (Boolean) obj;
                aaVar.f5199k1 = false;
                aaVar.P();
                return;
            case 8:
                ci.u5 u5Var = (ci.u5) obj;
                ci.c6 c6Var = ((ci.z5) this.f2096b).e;
                while (true) {
                    ArrayList arrayList = c6Var.G;
                    if (i11 < arrayList.size()) {
                        if (u5Var != arrayList.get(i11)) {
                            ((ci.u5) arrayList.get(i11)).getClass();
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            case 9:
                ci.n8 n8Var = (ci.n8) this.f2096b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                n8Var.f5670p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    n8Var.f5667m = true;
                    n8Var.f5666l = str2;
                    n8Var.f5661f = TextUtils.isEmpty(str2);
                    View view = n8Var.f5672r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = n8Var.f5673s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                di.v vVar = (di.v) this.f2096b;
                String str3 = (String) obj;
                ArrayList arrayList2 = vVar.h;
                if (!arrayList2.contains(str3)) {
                    arrayList2.add(str3);
                    vVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ci.v7(12, vVar, str3), 120L);
                return;
            case 11:
                ((ei.m) this.f2096b).x(((Integer) obj).intValue());
                return;
            case 12:
                ei.e0 e0Var = (ei.e0) this.f2096b;
                e0Var.f8929j0.f8875n.P = ((Float) obj).floatValue();
                ei.d0 d0Var = e0Var.f8929j0;
                ei.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f8875n.P);
                    return;
                }
                return;
            case 13:
                ei.r0 r0Var = (ei.r0) this.f2096b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.f9699c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.f9699c);
                    return;
                }
                return;
            case 14:
                ei.s2 s2Var = (ei.s2) this.f2096b;
                s2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ci.v7(25, s2Var, (Runnable) obj), 80L);
                return;
            case 15:
                ((ei.q3) this.f2096b).f9636s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f21635w).start();
                return;
            case 16:
                ei.l4 l4Var = (ei.l4) this.f2096b;
                View view2 = (View) obj;
                ei.g4 g4Var = l4Var.f9365b;
                if (view2 instanceof ei.k4) {
                    g4Var.getClass();
                    int R = RecyclerView.R(view2);
                    h61 G = g4Var.W2.G(R);
                    if (G != null) {
                        ei.k4 k4Var = (ei.k4) view2;
                        k4Var.setPosition(l4Var.b(R));
                        if (l4Var.f9367f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k4Var.b(z10, true);
                        boolean contains = l4Var.e.contains(Integer.valueOf(G.d));
                        if (k4Var.f9305f != contains) {
                            k4Var.f9305f = contains;
                            k4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ei.g4 g4Var2 = (ei.g4) this.f2096b;
                View view3 = (View) obj;
                if (view3 instanceof ei.k4) {
                    ei.ma maVar = g4Var2.f9065d3;
                    maVar.f9365b.getClass();
                    ((ei.k4) view3).setPosition(maVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 18:
                ei.xa xaVar = (ei.xa) ((ei.f6) this.f2096b);
                ei.vb vbVar = xaVar.A2;
                vbVar.X0.q((MessageObject) obj);
                ei.a8 a8Var = vbVar.K1;
                if (a8Var != null && vbVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(a8Var.f8742y);
                    boolean z13 = !isEmpty;
                    ((bh0) vbVar.f9978j1.f9070c).a(!vbVar.X0.k(), false);
                    vbVar.f9978j1.setVisibility(0);
                    ViewPropertyAnimator animate = vbVar.f9978j1.animate();
                    if (!isEmpty) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).withEndAction(new ah.t(9, xaVar, z13)).start();
                }
                if (vbVar.A0.j()) {
                    ArrayList arrayList3 = vbVar.A0.h;
                    int size = arrayList3.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            ei.a8 a8Var2 = ((ei.d0) obj2).f8875n;
                            if (a8Var2 != null && a8Var2.K) {
                                if (!TextUtils.isEmpty(vbVar.K1.f8742y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                vbVar.k0(i10, true, true);
                return;
            case 19:
                ei.z7 z7Var = (ei.z7) obj;
                r71 r71Var = ((ei.r6) this.f2096b).f9721n;
                if (r71Var != null) {
                    r71Var.setHDRInfo(z7Var);
                    return;
                }
                return;
            case 20:
                ei.s7.T((ei.s7) this.f2096b, (Long) obj);
                return;
            case 21:
                ei.j8 j8Var = (ei.j8) this.f2096b;
                rg.n0 n0Var = (rg.n0) obj;
                if (n0Var == null) {
                    j8Var.V();
                    return;
                }
                j8Var.f9280o0 = n0Var.e;
                j8Var.f9279n0 = n0Var.f45523f;
                return;
            case 22:
                ((ei.g9) this.f2096b).f9074n.W.H = ((Integer) obj).intValue();
                return;
            case 23:
                ((ei.qa) this.f2096b).h((Utilities.Callback) obj);
                return;
            case 24:
                gi.t tVar = (gi.t) this.f2096b;
                ArrayList arrayList4 = tVar.f11452b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                c71 c71Var = tVar.f11451a;
                if (c71Var != null && (u61Var = c71Var.W2) != null) {
                    u61Var.N(true);
                    return;
                }
                return;
            case 25:
                ((hg.m) this.f2096b).L((TLRPC.User) obj);
                return;
            case 26:
                TLRPC.User user = (TLRPC.User) obj;
                po0 po0Var = (po0) ((hg.h0) this.f2096b);
                lx lxVar = po0Var.K0;
                if (user != null) {
                    cy cyVar = lxVar.J0;
                    if (cyVar != null) {
                        cyVar.I3();
                    }
                    MessagesController.getInstance(lxVar.H0).openApp(user, 0);
                    po0Var.R(user.f20426id, user);
                    return;
                }
                return;
            case 27:
                hi.f fVar = (hi.f) this.f2096b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.h;
                if (arrayList6 == null || arrayList6.isEmpty()) {
                    z11 = true;
                }
                fVar.h = arrayList5;
                c71 c71Var2 = fVar.e;
                if (c71Var2 != null) {
                    c71Var2.W2.N(z11);
                    return;
                }
                return;
            case 28:
                ig.m mVar = (ig.m) this.f2096b;
                if (((Integer) obj).intValue() <= AndroidUtilities.dp(20.0f)) {
                    z12 = false;
                }
                if (mVar.F != z12) {
                    mVar.F = z12;
                    if (!z12) {
                        mVar.f32359a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((ig.i0) this.f2096b).f12917s, (Utilities.Callback<View>) new ci.e(3));
                return;
        }
    }
}
