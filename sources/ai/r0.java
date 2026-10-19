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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.cy;
import org.telegram.ui.lx;
public final class r0 implements Utilities.Callback {
    public final int f2092a;
    public final Object f2093b;

    public r0(Object obj, int i10) {
        this.f2092a = i10;
        this.f2093b = obj;
    }

    @Override
    public final void run(Object obj) {
        String formatPluralStringComma;
        String str;
        String str2;
        boolean z10;
        int i10;
        float f7;
        t61 t61Var;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = true;
        switch (this.f2092a) {
            case 0:
                b1 b1Var = (b1) this.f2093b;
                int i13 = b1.f993w0[((Integer) obj).intValue()];
                if (b1Var.f1006n0 != i13) {
                    b1Var.f1006n0 = i13;
                    b1Var.f999f0.setText(LocaleController.formatPluralString("GiftOfferHours", i13 / 3600, new Object[0]));
                }
                b1Var.U(true);
                return;
            case 1:
                a2 a2Var = (a2) this.f2093b;
                Integer num = (Integer) obj;
                a2Var.f933i0.g();
                a2Var.f935k0.N(true);
                return;
            case 2:
                k5 k5Var = (k5) this.f2093b;
                k5Var.getClass();
                k5Var.f1630s = new Matrix();
                k5Var.v = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                k5Var.f1629r = bitmapShader;
                Paint paint = k5Var.f1626c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 3:
                ga.a((ga) this.f2093b, (TL_stars.StarGifts) obj);
                return;
            case 4:
                ((org.telegram.ui.ActionBar.f3) this.f2093b).dismiss(((Boolean) obj).booleanValue());
                return;
            case 5:
                TextView textView = (TextView) this.f2093b;
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
                ci.h1 h1Var = (ci.h1) this.f2093b;
                if (((Boolean) obj).booleanValue() && !h1Var.f5449w) {
                    h1Var.f5446n = true;
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
                    NotificationCenter.getInstance(h1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1Var.f5445f.f20292id));
                    return;
                }
                return;
            case 7:
                ci.aa aaVar = (ci.aa) this.f2093b;
                Boolean bool = (Boolean) obj;
                aaVar.f5201k1 = false;
                aaVar.P();
                return;
            case 8:
                ci.u5 u5Var = (ci.u5) obj;
                ci.c6 c6Var = ((ci.z5) this.f2093b).e;
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
                ci.n8 n8Var = (ci.n8) this.f2093b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                n8Var.f5672p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    n8Var.f5669m = true;
                    n8Var.f5668l = str2;
                    n8Var.f5663f = TextUtils.isEmpty(str2);
                    View view = n8Var.f5674r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = n8Var.f5675s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                di.v vVar = (di.v) this.f2093b;
                String str3 = (String) obj;
                ArrayList arrayList2 = vVar.h;
                if (!arrayList2.contains(str3)) {
                    arrayList2.add(str3);
                    vVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ci.v7(12, vVar, str3), 120L);
                return;
            case 11:
                ((ei.m) this.f2093b).x(((Integer) obj).intValue());
                return;
            case 12:
                ei.e0 e0Var = (ei.e0) this.f2093b;
                e0Var.f8931j0.f8877n.P = ((Float) obj).floatValue();
                ei.d0 d0Var = e0Var.f8931j0;
                ei.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f8877n.P);
                    return;
                }
                return;
            case 13:
                ei.r0 r0Var = (ei.r0) this.f2093b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.f9701c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.f9701c);
                    return;
                }
                return;
            case 14:
                ei.s2 s2Var = (ei.s2) this.f2093b;
                s2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ci.v7(25, s2Var, (Runnable) obj), 80L);
                return;
            case 15:
                ((ei.q3) this.f2093b).f9638s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f21631w).start();
                return;
            case 16:
                ei.l4 l4Var = (ei.l4) this.f2093b;
                View view2 = (View) obj;
                ei.g4 g4Var = l4Var.f9367b;
                if (view2 instanceof ei.k4) {
                    g4Var.getClass();
                    int R = RecyclerView.R(view2);
                    g61 G = g4Var.W2.G(R);
                    if (G != null) {
                        ei.k4 k4Var = (ei.k4) view2;
                        k4Var.setPosition(l4Var.b(R));
                        if (l4Var.f9369f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k4Var.b(z10, true);
                        boolean contains = l4Var.e.contains(Integer.valueOf(G.d));
                        if (k4Var.f9307f != contains) {
                            k4Var.f9307f = contains;
                            k4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ei.g4 g4Var2 = (ei.g4) this.f2093b;
                View view3 = (View) obj;
                if (view3 instanceof ei.k4) {
                    ei.ma maVar = g4Var2.f9067d3;
                    maVar.f9367b.getClass();
                    ((ei.k4) view3).setPosition(maVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 18:
                ei.xa xaVar = (ei.xa) ((ei.f6) this.f2093b);
                ei.vb vbVar = xaVar.A2;
                vbVar.X0.q((MessageObject) obj);
                ei.a8 a8Var = vbVar.K1;
                if (a8Var != null && vbVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(a8Var.f8744y);
                    boolean z13 = !isEmpty;
                    ((ah0) vbVar.f9980j1.f9072c).a(!vbVar.X0.k(), false);
                    vbVar.f9980j1.setVisibility(0);
                    ViewPropertyAnimator animate = vbVar.f9980j1.animate();
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
                            ei.a8 a8Var2 = ((ei.d0) obj2).f8877n;
                            if (a8Var2 != null && a8Var2.K) {
                                if (!TextUtils.isEmpty(vbVar.K1.f8744y)) {
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
                q71 q71Var = ((ei.r6) this.f2093b).f9723n;
                if (q71Var != null) {
                    q71Var.setHDRInfo(z7Var);
                    return;
                }
                return;
            case 20:
                ei.s7.T((ei.s7) this.f2093b, (Long) obj);
                return;
            case 21:
                ei.j8 j8Var = (ei.j8) this.f2093b;
                rg.n0 n0Var = (rg.n0) obj;
                if (n0Var == null) {
                    j8Var.V();
                    return;
                }
                j8Var.f9282o0 = n0Var.e;
                j8Var.f9281n0 = n0Var.f45510f;
                return;
            case 22:
                ((ei.g9) this.f2093b).f9076n.W.H = ((Integer) obj).intValue();
                return;
            case 23:
                ((ei.qa) this.f2093b).h((Utilities.Callback) obj);
                return;
            case 24:
                gi.t tVar = (gi.t) this.f2093b;
                ArrayList arrayList4 = tVar.f11454b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                b71 b71Var = tVar.f11453a;
                if (b71Var != null && (t61Var = b71Var.W2) != null) {
                    t61Var.N(true);
                    return;
                }
                return;
            case 25:
                ((hg.m) this.f2093b).L((TLRPC.User) obj);
                return;
            case 26:
                TLRPC.User user = (TLRPC.User) obj;
                oo0 oo0Var = (oo0) ((hg.h0) this.f2093b);
                lx lxVar = oo0Var.K0;
                if (user != null) {
                    cy cyVar = lxVar.J0;
                    if (cyVar != null) {
                        cyVar.I3();
                    }
                    MessagesController.getInstance(lxVar.H0).openApp(user, 0);
                    oo0Var.R(user.f20422id, user);
                    return;
                }
                return;
            case 27:
                hi.f fVar = (hi.f) this.f2093b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.h;
                if (arrayList6 == null || arrayList6.isEmpty()) {
                    z11 = true;
                }
                fVar.h = arrayList5;
                b71 b71Var2 = fVar.e;
                if (b71Var2 != null) {
                    b71Var2.W2.N(z11);
                    return;
                }
                return;
            case 28:
                ig.m mVar = (ig.m) this.f2093b;
                if (((Integer) obj).intValue() <= AndroidUtilities.dp(20.0f)) {
                    z12 = false;
                }
                if (mVar.F != z12) {
                    mVar.F = z12;
                    if (!z12) {
                        mVar.f32027a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((ig.i0) this.f2093b).f12919s, (Utilities.Callback<View>) new ci.e(3));
                return;
        }
    }
}
