package ah;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.uq;
import org.telegram.ui.um;
public final class k1 {
    public static int Z;
    public MessageObject A;
    public f6 B;
    public Integer C;
    public float D;
    public boolean E;
    public int F;
    public boolean G;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public float Q;
    public float R;
    public h1 S;
    public boolean T;
    public a1.e U;
    public float f606a;
    public boolean f607b;
    public int f608c;
    public int d;
    public float f609e;
    public float f610f;
    public float f611g;
    public float h;
    public boolean f612i;
    public boolean f613j;
    public boolean f614k;
    public boolean f615l;
    public int f616m;
    public int f618o;
    public int f619p;
    public int f620q;
    public int f621r;
    public boolean f622s;
    public final float f623t;
    public int f624u;
    public final org.telegram.ui.Cells.a0 f628z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final f1 f603a0 = new Object();
    public static int f604b0 = 1;
    public static final a4.e f605c0 = new a4.e(1);
    public final ArrayList v = new ArrayList();
    public final ArrayList f625w = new ArrayList();
    public final HashMap f626x = new HashMap();
    public final HashMap f627y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int f617n = UserConfig.selectedAccount;

    public k1(org.telegram.ui.Cells.a0 a0Var) {
        this.f628z = a0Var;
        o(this.B);
        this.f623t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || !(reaction2 instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id) {
            return false;
        }
        return true;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        float f7;
        path.rewind();
        float f10 = rectF.left;
        rectF2.set(f10, rectF.top, AndroidUtilities.dp(12.0f) + f10, rectF.top + AndroidUtilities.dp(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - AndroidUtilities.dp(12.0f), rectF.left + AndroidUtilities.dp(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        if (rectF.height() > AndroidUtilities.dp(26.0f)) {
            f7 = 1.4f;
        } else {
            f7 = 0.0f;
        }
        float dpf2 = rectF.right - AndroidUtilities.dpf2(9.09f);
        float dpf22 = dpf2 - AndroidUtilities.dpf2(0.056f);
        float dpf23 = AndroidUtilities.dpf2(1.22f) + dpf2;
        float dpf24 = AndroidUtilities.dpf2(3.07f) + dpf2;
        float dpf25 = AndroidUtilities.dpf2(2.406f) + dpf2;
        float dpf26 = AndroidUtilities.dpf2(8.27f + f7) + dpf2;
        float dpf27 = AndroidUtilities.dpf2(8.923f + f7) + dpf2;
        float dpf28 = AndroidUtilities.dpf2(1.753f) + rectF.top;
        float dpf29 = rectF.bottom - AndroidUtilities.dpf2(1.753f);
        float dpf210 = AndroidUtilities.dpf2(0.663f) + rectF.top;
        float dpf211 = rectF.bottom - AndroidUtilities.dpf2(0.663f);
        float f11 = 10.263f + f7;
        float dpf212 = AndroidUtilities.dpf2(f11) + rectF.top;
        float dpf213 = rectF.bottom - AndroidUtilities.dpf2(f11);
        float f12 = f7 + 11.333f;
        float dpf214 = AndroidUtilities.dpf2(f12) + rectF.top;
        float dpf215 = rectF.bottom - AndroidUtilities.dpf2(f12);
        path.lineTo(dpf22, rectF.bottom);
        path.cubicTo(dpf23, rectF.bottom, dpf25, dpf211, dpf24, dpf29);
        path.lineTo(dpf26, dpf213);
        path.cubicTo(dpf27, dpf215, dpf27, dpf214, dpf26, dpf212);
        path.lineTo(dpf24, dpf28);
        float f13 = rectF.top;
        path.cubicTo(dpf25, dpf210, dpf23, f13, dpf22, f13);
        path.close();
    }

    public static long k(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).f20016id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f19869id;
        }
        return 0L;
    }

    public static void o(f6 f6Var) {
        V.setColor(j6.v0(j6.f20761ie, f6Var));
        int v02 = j6.v0(j6.Sh, f6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(v02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        k9 k9Var;
        int i10;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.f627y;
        hashMap.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.f625w;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((h1) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.f626x);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i12 >= arrayList2.size()) {
                break;
            }
            h1 h1Var = (h1) arrayList2.get(i12);
            String str = h1Var.f571o;
            uq uqVar = h1Var.F;
            h1 h1Var2 = (h1) hashMap.get(str);
            if (h1Var2 != null && h1Var.f554b != h1Var2.f554b) {
                h1Var2 = null;
            }
            if (h1Var2 != null) {
                hashMap.remove(h1Var.f571o);
                int i13 = h1Var.f579x;
                int i14 = h1Var2.f579x;
                if (i13 == i14 && h1Var.f580y == h1Var2.f580y && h1Var.A == h1Var2.A && h1Var.f578w == h1Var2.f578w && h1Var.f572p == h1Var2.f572p && h1Var.T == null && h1Var2.T == null) {
                    h1Var.f556c = 0;
                    i12++;
                } else {
                    h1Var.d = i14;
                    h1Var.f559e = h1Var2.f580y;
                    h1Var.f561f = h1Var2.A;
                    h1Var.f565i = h1Var2.N;
                    h1Var.f563g = h1Var2.O;
                    h1Var.h = h1Var2.P;
                    h1Var.f556c = 3;
                    int i15 = h1Var.f578w;
                    int i16 = h1Var2.f578w;
                    if (i15 != i16 && uqVar != null) {
                        uqVar.c(i16, false);
                        uqVar.c(h1Var.f578w, true);
                    }
                    k9 k9Var2 = h1Var.T;
                    if (k9Var2 != null || h1Var2.T != null) {
                        if (k9Var2 == null) {
                            h1Var.p(new ArrayList());
                        }
                        if (h1Var2.T == null) {
                            h1Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = h1Var2.U;
                        ArrayList arrayList4 = h1Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i17);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i17);
                                if (tLObject != null && tLObject2 != null && k(tLObject) == k(tLObject2)) {
                                }
                            }
                        }
                        k9 k9Var3 = h1Var.T;
                        if (k9Var3 != null && (k9Var = h1Var2.T) != null) {
                            ValueAnimator valueAnimator = k9Var.f27760f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (k9Var3.f27775w) {
                                    k9Var3.f27775w = false;
                                    k9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.f617n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = k9Var3.f27757b[i18].h;
                                k9Var3.l(i18, k9Var.f27757b[i18].h, i10);
                                i18++;
                            }
                            k9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                k9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            k9Var3.d = true;
                            k9Var3.b(true, false);
                        }
                    }
                }
            } else {
                h1Var.f556c = 1;
            }
            z10 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((h1) arrayList.get(i20)).f568l = ((h1) arrayList.get(i20)).f570n;
                ((h1) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.f612i) {
            float f7 = this.f611g;
            if (f7 != this.f608c || this.h != this.d) {
                this.f613j = true;
                this.f609e = f7;
                this.f610f = this.h;
                z10 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.f620q) {
            this.f614k = true;
            this.f621r = i21;
            z10 = true;
        }
        int i22 = this.I;
        if (i22 != this.f619p) {
            this.f615l = true;
            this.J = i22;
            return true;
        }
        return z10;
    }

    public final void b(j1 j1Var) {
        int i10 = 0;
        if (j1Var.f598g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(j1Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.f628z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f617n).getReactionsMap().get(j1Var.f597f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(j1Var, imageReceiver);
                return;
            }
        }
        if (!this.M || j1Var.f598g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (j1Var.f(((h1) arrayList.get(i10)).f574r)) {
                    ((h1) arrayList.get(i10)).q();
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        MessageObject messageObject;
        TLRPC.Message message;
        int i10 = 0;
        if (this.f622s || this.f607b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.f628z;
        if (e2.u(a0Var)) {
            y3 -= a0Var.getPaddingTop();
            if (a0Var instanceof org.telegram.ui.Cells.w0) {
                x10 -= ((org.telegram.ui.Cells.w0) a0Var).f23426j0 / 2.0f;
            }
        }
        float f7 = x10 - this.f608c;
        float f10 = y3 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (f7 > ((h1) arrayList.get(i10)).f579x && f7 < ((h1) arrayList.get(i10)).f579x + ((h1) arrayList.get(i10)).A && f10 > ((h1) arrayList.get(i10)).f580y && f10 < ((h1) arrayList.get(i10)).f580y + ((h1) arrayList.get(i10)).B) {
                    this.Q = motionEvent.getX();
                    this.R = y3;
                    this.S = (h1) arrayList.get(i10);
                    a1.e eVar = this.U;
                    if (eVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    a1.e eVar2 = new a1.e(10, this, this.S);
                    this.U = eVar2;
                    AndroidUtilities.runOnUIThread(eVar2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f11 = this.f623t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f11) || Math.abs(y3 - this.R) > f11) {
                this.T = false;
                h1 h1Var = this.S;
                if (h1Var != null) {
                    h1Var.Y.c(false);
                }
                this.S = null;
                a1.e eVar3 = this.U;
                if (eVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(eVar3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            a1.e eVar4 = this.U;
            if (eVar4 != null) {
                AndroidUtilities.cancelRunOnUIThread(eVar4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.f552a;
                float x11 = motionEvent.getX();
                if (e2.u(a0Var)) {
                    ((n4) a0Var).f(reactionCount, false, x11, y3);
                }
            }
            this.T = false;
            h1 h1Var2 = this.S;
            if (h1Var2 != null) {
                h1Var2.Y.c(false);
            }
            this.S = null;
        }
        return this.T;
    }

    public final void d(Canvas canvas, float f7, Integer num) {
        float f10;
        float f11;
        boolean z10;
        Canvas canvas2 = canvas;
        boolean z11 = this.f622s;
        ArrayList arrayList = this.f625w;
        if (!z11 || !arrayList.isEmpty()) {
            float f12 = this.f608c;
            float f13 = this.d;
            if (this.f622s) {
                f12 = this.f611g;
                f13 = this.h;
            } else if (this.f613j) {
                float f14 = 1.0f - f7;
                f12 = (f12 * f7) + (this.f609e * f14);
                f13 = (f13 * f7) + (this.f610f * f14);
            }
            float f15 = f12;
            float f16 = f13;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = this.v;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                h1 h1Var = (h1) arrayList2.get(i11);
                if (this.C == null && num == null && this.D < 0.5f) {
                    h1Var.c();
                }
                if (!Integer.valueOf(h1Var.f574r.hashCode()).equals(this.C) && (num == null || h1Var.f574r.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f17 = h1Var.f579x;
                    float f18 = h1Var.f580y;
                    int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i12 != 0 && h1Var.f556c == 3) {
                        float f19 = 1.0f - f7;
                        f17 = (f17 * f7) + (h1Var.d * f19);
                        f18 = (f18 * f7) + (h1Var.f559e * f19);
                    }
                    if (i12 != 0 && h1Var.f556c == 1) {
                        float f20 = (f7 * 0.5f) + 0.5f;
                        canvas2.scale(f20, f20, (h1Var.A / 2.0f) + f15 + f17, (h1Var.B / 2.0f) + f16 + f18);
                        f10 = f7;
                    } else {
                        f10 = 1.0f;
                    }
                    float f21 = f17 + f15;
                    float f22 = f18 + f16;
                    if (h1Var.f556c == 3) {
                        f11 = f7;
                    } else {
                        f11 = 1.0f;
                    }
                    if (num != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h1Var.d(canvas2, f21, f22, f11, f10, z10, this.E, this.D);
                    canvas2.restore();
                }
                i11++;
            }
            while (i10 < arrayList.size()) {
                h1 h1Var2 = (h1) arrayList.get(i10);
                float f23 = 1.0f - f7;
                float f24 = (f23 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f24, f24, (h1Var2.A / 2.0f) + h1Var2.f579x + f15, (h1Var2.B / 2.0f) + h1Var2.f580y + f16);
                ((h1) arrayList.get(i10)).d(canvas2, h1Var2.f579x + f15, h1Var2.f580y + f16, 1.0f, f23, false, this.E, this.D);
                canvas.restore();
                i10++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(android.graphics.Canvas r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: ah.k1.e(android.graphics.Canvas, float):void");
    }

    public final void f(um umVar, Canvas canvas, int i10, Integer num) {
        int i11;
        if (!this.f622s || !this.f625w.isEmpty()) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.v;
                if (i12 < arrayList.size()) {
                    h1 h1Var = (h1) arrayList.get(i12);
                    if ((num == null || h1Var.f574r.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(h1Var.f576t);
                        float dp = AndroidUtilities.dp(140.0f);
                        float dp2 = AndroidUtilities.dp(14.0f);
                        org.telegram.ui.Cells.a0 a0Var = this.f628z;
                        if (a0Var instanceof t1) {
                            i11 = ((t1) a0Var).getParentWidth();
                        } else {
                            i11 = AndroidUtilities.displaySize.x;
                        }
                        float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), (i11 - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        float f7 = rectF.top - dp2;
                        float f10 = i10;
                        float f11 = f7 + f10;
                        RectF rectF2 = this.O;
                        rectF2.set(clamp, (f7 - dp) + f10, dp + clamp, f11);
                        float interpolation = pr.h.getInterpolation(this.D);
                        AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                        int i13 = h1Var.V;
                        j1 j1Var = h1Var.f575s;
                        View view = h1Var.W;
                        if (h1Var.f562f0 == null && h1Var.f564g0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (h1Var.f574r != null && !j1Var.f593a) {
                                if (j1Var.f597f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(j1Var.f597f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, j6.f20607a7, 1.0f);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        h1Var.f562f0 = imageReceiver;
                                        imageReceiver.setLayerNum(7);
                                        h1Var.f562f0.onAttachedToWindow();
                                        h1Var.f562f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        h1Var.f562f0.setAllowStartLottieAnimation(true);
                                        h1Var.f562f0.setAllowStartAnimation(true);
                                        h1Var.f562f0.setAutoRepeat(1);
                                        h1Var.f562f0.setAllowDecodeSingleFrame(true);
                                        h1Var.f562f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                                    }
                                } else if (j1Var.f598g != 0) {
                                    q5 q5Var = new q5(24, i13, j1Var.f598g);
                                    h1Var.f564g0 = q5Var;
                                    q5Var.a(view);
                                }
                            }
                        }
                        this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver2 = h1Var.f562f0;
                            if (imageReceiver2 != null) {
                                imageReceiver2.setImageCoords(rectF2);
                                h1Var.f562f0.setAlpha(interpolation);
                                h1Var.f562f0.draw(canvas);
                            } else {
                                q5 q5Var2 = h1Var.f564g0;
                                if (q5Var2 != null) {
                                    q5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    h1Var.f564g0.setAlpha((int) (interpolation * 255.0f));
                                    h1Var.f564g0.draw(canvas);
                                }
                            }
                            umVar.invalidate();
                        }
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    public final float i(float f7) {
        if (this.f615l) {
            return (this.f619p * f7) + ((1.0f - f7) * this.J);
        }
        return this.f619p;
    }

    public final float j(float f7) {
        if (this.f614k) {
            return (this.f620q * f7) + ((1.0f - f7) * this.f621r);
        }
        return this.f620q;
    }

    public final h1 l(j1 j1Var) {
        String l4;
        if (j1Var.f593a) {
            l4 = "stars";
        } else {
            String str = j1Var.f597f;
            if (str != null) {
                l4 = str;
            } else {
                l4 = Long.toString(j1Var.f598g);
            }
        }
        return m(l4);
    }

    public final h1 m(String str) {
        boolean z10 = this.f607b;
        HashMap hashMap = this.f626x;
        if (z10) {
            h1 h1Var = (h1) hashMap.get(str + "_");
            if (h1Var != null) {
                return h1Var;
            }
        }
        return (h1) hashMap.get(str);
    }

    public final boolean n() {
        if (this.L) {
            if ((!this.f622s || !this.f625w.isEmpty()) && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p(int i10, int i11) {
        ArrayList arrayList;
        float f7;
        int dp;
        float f10;
        int i12;
        this.f618o = 0;
        this.f620q = 0;
        this.f616m = 0;
        this.f619p = 0;
        if (this.f622s) {
            return;
        }
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            arrayList = this.v;
            if (i13 >= arrayList.size()) {
                break;
            }
            h1 h1Var = (h1) arrayList.get(i13);
            boolean z10 = h1Var.f554b;
            p6 p6Var = h1Var.G;
            uq uqVar = h1Var.F;
            if (z10) {
                h1Var.A = AndroidUtilities.dp(14.0f);
                h1Var.B = AndroidUtilities.dp(14.0f);
            } else if (h1Var.S) {
                h1Var.A = AndroidUtilities.dp(42.0f);
                h1Var.B = AndroidUtilities.dp(26.0f);
                if (h1Var.f577u) {
                    h1Var.A = (int) (p6Var.d + AndroidUtilities.dp(8.0f) + h1Var.A);
                } else if (uqVar != null && h1Var.f578w > 1) {
                    h1Var.A = w1.C(8.0f, (int) Math.ceil(uqVar.f30945m), h1Var.A);
                }
            } else {
                int dp2 = AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (h1Var.D != null) {
                    f10 = 6.0f;
                } else {
                    f10 = 4.0f;
                }
                h1Var.A = AndroidUtilities.dp(f10) + dp2;
                if (h1Var.T != null && h1Var.U.size() > 0) {
                    h1Var.U.size();
                    if (h1Var.U.size() > 1) {
                        i12 = h1Var.U.size() - 1;
                    } else {
                        i12 = 0;
                    }
                    h1Var.A = (int) ((AndroidUtilities.dp(20.0f) * i12 * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + h1Var.A);
                    h1Var.T.f27768o = AndroidUtilities.dp(26.0f);
                } else if (h1Var.f577u) {
                    h1Var.A = (int) (p6Var.d + AndroidUtilities.dp(8.0f) + h1Var.A);
                } else if (((int) Math.ceil(uqVar.f30945m)) > 0) {
                    h1Var.A = w1.C(8.0f, (int) Math.ceil(uqVar.f30945m), h1Var.A);
                } else {
                    h1Var.A -= AndroidUtilities.dp(1.0f);
                }
                h1Var.B = AndroidUtilities.dp(26.0f);
            }
            if (h1Var.A + i14 > i10) {
                arrayList2.add(Integer.valueOf(i14));
                i16 = w1.C(4.0f, h1Var.B, i16);
                i17++;
                i14 = 0;
            }
            h1Var.f579x = i14;
            h1Var.f580y = i16;
            h1Var.f581z = i17;
            i14 = w1.C(4.0f, h1Var.A, i14);
            if (i14 > i15) {
                i15 = i14;
            }
            i13++;
        }
        arrayList2.add(Integer.valueOf(i14));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i18 = ((h1) arrayList.get(0)).f580y;
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((h1) arrayList.get(i20)).f580y != i18) {
                    int i21 = i20 - 1;
                    int i22 = i10 - (((h1) arrayList.get(i21)).f579x + ((h1) arrayList.get(i21)).A);
                    while (i19 < i20) {
                        ((h1) arrayList.get(i19)).f579x += i22;
                        i19++;
                    }
                    i19 = i20;
                }
            }
            int size = arrayList.size() - 1;
            int i23 = i10 - (((h1) arrayList.get(size)).f579x + ((h1) arrayList.get(size)).A);
            while (i19 <= size) {
                ((h1) arrayList.get(i19)).f579x += i23;
                i19++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                h1 h1Var2 = (h1) arrayList.get(i24);
                int i25 = h1Var2.f581z;
                if (i25 >= 0 && i25 < arrayList2.size()) {
                    f7 = ((Integer) arrayList2.get(h1Var2.f581z)).intValue();
                } else {
                    f7 = 0.0f;
                }
                h1Var2.f579x = (int) e2.A(i10, f7, 2.0f, h1Var2.f579x);
            }
        }
        this.f624u = i14;
        if (i11 != 5 && i11 != 1) {
            this.f620q = i15;
        } else {
            this.f620q = i10;
        }
        if (arrayList.size() == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(26.0f);
        }
        this.f618o = i16 + dp;
        this.f606a = 0.0f;
    }

    public final void q() {
        int i10 = 0;
        this.G = false;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((h1) arrayList.get(i10)).b();
            i10++;
        }
        HashMap hashMap = this.H;
        if (!hashMap.isEmpty()) {
            for (ImageReceiver imageReceiver : hashMap.values()) {
                imageReceiver.onDetachedFromWindow();
            }
        }
        hashMap.clear();
    }

    public final void r() {
        HashMap hashMap = this.f626x;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                hashMap.put(((h1) arrayList.get(i10)).f571o, (h1) arrayList.get(i10));
                i10++;
            } else {
                this.f612i = !this.f622s;
                this.f611g = this.f608c;
                this.h = this.d;
                this.F = this.f620q;
                this.I = this.f619p;
                return;
            }
        }
    }

    public final void s(org.telegram.messenger.MessageObject r20, boolean r21, boolean r22, org.telegram.ui.ActionBar.f6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: ah.k1.s(org.telegram.messenger.MessageObject, boolean, boolean, org.telegram.ui.ActionBar.f6):void");
    }
}
