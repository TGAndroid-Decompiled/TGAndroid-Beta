package hg;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.lq;
import org.telegram.ui.im;
public final class s0 {
    public static int Z;
    public MessageObject A;
    public b6 B;
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
    public p0 S;
    public boolean T;
    public h3.g0 U;
    public float f10733a;
    public boolean f10734b;
    public int f10735c;
    public int d;
    public float f10736e;
    public float f10737f;
    public float f10738g;
    public float h;
    public boolean f10739i;
    public boolean f10740j;
    public boolean f10741k;
    public boolean f10742l;
    public int f10743m;
    public int f10745o;
    public int f10746p;
    public int f10747q;
    public int f10748r;
    public boolean f10749s;
    public final float f10750t;
    public int f10751u;
    public final org.telegram.ui.Cells.a0 f10755z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final o0 f10730a0 = new Object();
    public static int f10731b0 = 1;
    public static final a5.e f10732c0 = new a5.e(20);
    public final ArrayList v = new ArrayList();
    public final ArrayList f10752w = new ArrayList();
    public final HashMap f10753x = new HashMap();
    public final HashMap f10754y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int f10744n = UserConfig.selectedAccount;

    public s0(org.telegram.ui.Cells.a0 a0Var) {
        this.f10755z = a0Var;
        o(this.B);
        this.f10750t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
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
        float f10;
        path.rewind();
        float f11 = rectF.left;
        rectF2.set(f11, rectF.top, AndroidUtilities.dp(12.0f) + f11, rectF.top + AndroidUtilities.dp(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - AndroidUtilities.dp(12.0f), rectF.left + AndroidUtilities.dp(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        if (rectF.height() > AndroidUtilities.dp(26.0f)) {
            f10 = 1.4f;
        } else {
            f10 = 0.0f;
        }
        float dpf2 = rectF.right - AndroidUtilities.dpf2(9.09f);
        float dpf22 = dpf2 - AndroidUtilities.dpf2(0.056f);
        float dpf23 = AndroidUtilities.dpf2(1.22f) + dpf2;
        float dpf24 = AndroidUtilities.dpf2(3.07f) + dpf2;
        float dpf25 = AndroidUtilities.dpf2(2.406f) + dpf2;
        float dpf26 = AndroidUtilities.dpf2(8.27f + f10) + dpf2;
        float dpf27 = AndroidUtilities.dpf2(8.923f + f10) + dpf2;
        float dpf28 = AndroidUtilities.dpf2(1.753f) + rectF.top;
        float dpf29 = rectF.bottom - AndroidUtilities.dpf2(1.753f);
        float dpf210 = AndroidUtilities.dpf2(0.663f) + rectF.top;
        float dpf211 = rectF.bottom - AndroidUtilities.dpf2(0.663f);
        float f12 = 10.263f + f10;
        float dpf212 = AndroidUtilities.dpf2(f12) + rectF.top;
        float dpf213 = rectF.bottom - AndroidUtilities.dpf2(f12);
        float f13 = f10 + 11.333f;
        float dpf214 = AndroidUtilities.dpf2(f13) + rectF.top;
        float dpf215 = rectF.bottom - AndroidUtilities.dpf2(f13);
        path.lineTo(dpf22, rectF.bottom);
        path.cubicTo(dpf23, rectF.bottom, dpf25, dpf211, dpf24, dpf29);
        path.lineTo(dpf26, dpf213);
        path.cubicTo(dpf27, dpf215, dpf27, dpf214, dpf26, dpf212);
        path.lineTo(dpf24, dpf28);
        float f14 = rectF.top;
        path.cubicTo(dpf25, dpf210, dpf23, f14, dpf22, f14);
        path.close();
    }

    public static long k(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).f22527id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f22380id;
        }
        return 0L;
    }

    public static void o(b6 b6Var) {
        V.setColor(f6.v0(f6.f23099ie, b6Var));
        int v02 = f6.v0(f6.Sh, b6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(v02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        b9 b9Var;
        int i9;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.f10754y;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            arrayList = this.f10752w;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((p0) arrayList.get(i10)).b();
            i10++;
        }
        arrayList.clear();
        hashMap.putAll(this.f10753x);
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i11 >= arrayList2.size()) {
                break;
            }
            p0 p0Var = (p0) arrayList2.get(i11);
            String str = p0Var.f10700o;
            lq lqVar = p0Var.F;
            p0 p0Var2 = (p0) hashMap.get(str);
            if (p0Var2 != null && p0Var.f10683b != p0Var2.f10683b) {
                p0Var2 = null;
            }
            if (p0Var2 != null) {
                hashMap.remove(p0Var.f10700o);
                int i12 = p0Var.f10708x;
                int i13 = p0Var2.f10708x;
                if (i12 == i13 && p0Var.f10709y == p0Var2.f10709y && p0Var.A == p0Var2.A && p0Var.f10707w == p0Var2.f10707w && p0Var.f10701p == p0Var2.f10701p && p0Var.T == null && p0Var2.T == null) {
                    p0Var.f10685c = 0;
                    i11++;
                } else {
                    p0Var.d = i13;
                    p0Var.f10688e = p0Var2.f10709y;
                    p0Var.f10690f = p0Var2.A;
                    p0Var.f10694i = p0Var2.N;
                    p0Var.f10692g = p0Var2.O;
                    p0Var.h = p0Var2.P;
                    p0Var.f10685c = 3;
                    int i14 = p0Var.f10707w;
                    int i15 = p0Var2.f10707w;
                    if (i14 != i15 && lqVar != null) {
                        lqVar.c(i15, false);
                        lqVar.c(p0Var.f10707w, true);
                    }
                    b9 b9Var2 = p0Var.T;
                    if (b9Var2 != null || p0Var2.T != null) {
                        if (b9Var2 == null) {
                            p0Var.p(new ArrayList());
                        }
                        if (p0Var2.T == null) {
                            p0Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = p0Var2.U;
                        ArrayList arrayList4 = p0Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i16);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i16);
                                if (tLObject != null && tLObject2 != null && k(tLObject) == k(tLObject2)) {
                                }
                            }
                        }
                        b9 b9Var3 = p0Var.T;
                        if (b9Var3 != null && (b9Var = p0Var2.T) != null) {
                            ValueAnimator valueAnimator = b9Var.f27078f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (b9Var3.f27093w) {
                                    b9Var3.f27093w = false;
                                    b9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i17 = 0;
                            while (true) {
                                i9 = this.f10744n;
                                if (i17 >= 3) {
                                    break;
                                }
                                tLObjectArr[i17] = b9Var3.f27075b[i17].h;
                                b9Var3.l(i17, b9Var.f27075b[i17].h, i9);
                                i17++;
                            }
                            b9Var3.b(false, true);
                            for (int i18 = 0; i18 < 3; i18++) {
                                b9Var3.l(i18, tLObjectArr[i18], i9);
                            }
                            b9Var3.d = true;
                            b9Var3.b(true, false);
                        }
                    }
                }
            } else {
                p0Var.f10685c = 1;
            }
            z10 = true;
            i11++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                ((p0) arrayList.get(i19)).f10697l = ((p0) arrayList.get(i19)).f10699n;
                ((p0) arrayList.get(i19)).a();
            }
            z10 = true;
        }
        if (this.f10739i) {
            float f10 = this.f10738g;
            if (f10 != this.f10735c || this.h != this.d) {
                this.f10740j = true;
                this.f10736e = f10;
                this.f10737f = this.h;
                z10 = true;
            }
        }
        int i20 = this.F;
        if (i20 != this.f10747q) {
            this.f10741k = true;
            this.f10748r = i20;
            z10 = true;
        }
        int i21 = this.I;
        if (i21 != this.f10746p) {
            this.f10742l = true;
            this.J = i21;
            return true;
        }
        return z10;
    }

    public final void b(r0 r0Var) {
        int i9 = 0;
        if (r0Var.f10718g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(r0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.f10755z);
                int i10 = Z;
                Z = i10 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i10));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f10744n).getReactionsMap().get(r0Var.f10717f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(r0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || r0Var.f10718g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i9 < arrayList.size()) {
                if (r0Var.f(((p0) arrayList.get(i9)).f10703r)) {
                    ((p0) arrayList.get(i9)).q();
                    return;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        MessageObject messageObject;
        TLRPC.Message message;
        int i9 = 0;
        if (this.f10749s || this.f10734b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.f10755z;
        if (e2.c.v(a0Var)) {
            y10 -= a0Var.getPaddingTop();
            if (a0Var instanceof w0) {
                x10 -= ((w0) a0Var).f25840f0 / 2.0f;
            }
        }
        float f10 = x10 - this.f10735c;
        float f11 = y10 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i9 >= size) {
                    break;
                } else if (f10 > ((p0) arrayList.get(i9)).f10708x && f10 < ((p0) arrayList.get(i9)).f10708x + ((p0) arrayList.get(i9)).A && f11 > ((p0) arrayList.get(i9)).f10709y && f11 < ((p0) arrayList.get(i9)).f10709y + ((p0) arrayList.get(i9)).B) {
                    this.Q = motionEvent.getX();
                    this.R = y10;
                    this.S = (p0) arrayList.get(i9);
                    h3.g0 g0Var = this.U;
                    if (g0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(g0Var);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    h3.g0 g0Var2 = new h3.g0(6, this, this.S);
                    this.U = g0Var2;
                    AndroidUtilities.runOnUIThread(g0Var2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                } else {
                    i9++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f12 = this.f10750t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f12) || Math.abs(y10 - this.R) > f12) {
                this.T = false;
                p0 p0Var = this.S;
                if (p0Var != null) {
                    p0Var.Y.c(false);
                }
                this.S = null;
                h3.g0 g0Var3 = this.U;
                if (g0Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(g0Var3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            h3.g0 g0Var4 = this.U;
            if (g0Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(g0Var4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.f10681a;
                float x11 = motionEvent.getX();
                if (e2.c.v(a0Var)) {
                    ((o4) a0Var).f(reactionCount, false, x11, y10);
                }
            }
            this.T = false;
            p0 p0Var2 = this.S;
            if (p0Var2 != null) {
                p0Var2.Y.c(false);
            }
            this.S = null;
        }
        return this.T;
    }

    public final void d(Canvas canvas, float f10, Integer num) {
        float f11;
        float f12;
        boolean z10;
        Canvas canvas2 = canvas;
        boolean z11 = this.f10749s;
        ArrayList arrayList = this.f10752w;
        if (!z11 || !arrayList.isEmpty()) {
            float f13 = this.f10735c;
            float f14 = this.d;
            if (this.f10749s) {
                f13 = this.f10738g;
                f14 = this.h;
            } else if (this.f10740j) {
                float f15 = 1.0f - f10;
                f13 = (f13 * f10) + (this.f10736e * f15);
                f14 = (f14 * f10) + (this.f10737f * f15);
            }
            float f16 = f13;
            float f17 = f14;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.v;
                if (i10 >= arrayList2.size()) {
                    break;
                }
                p0 p0Var = (p0) arrayList2.get(i10);
                if (this.C == null && num == null && this.D < 0.5f) {
                    p0Var.c();
                }
                if (!Integer.valueOf(p0Var.f10703r.hashCode()).equals(this.C) && (num == null || p0Var.f10703r.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f18 = p0Var.f10708x;
                    float f19 = p0Var.f10709y;
                    int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    if (i11 != 0 && p0Var.f10685c == 3) {
                        float f20 = 1.0f - f10;
                        f18 = (f18 * f10) + (p0Var.d * f20);
                        f19 = (f19 * f10) + (p0Var.f10688e * f20);
                    }
                    if (i11 != 0 && p0Var.f10685c == 1) {
                        float f21 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f21, f21, (p0Var.A / 2.0f) + f16 + f18, (p0Var.B / 2.0f) + f17 + f19);
                        f11 = f10;
                    } else {
                        f11 = 1.0f;
                    }
                    float f22 = f18 + f16;
                    float f23 = f19 + f17;
                    if (p0Var.f10685c == 3) {
                        f12 = f10;
                    } else {
                        f12 = 1.0f;
                    }
                    if (num != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p0Var.d(canvas2, f22, f23, f12, f11, z10, this.E, this.D);
                    canvas2.restore();
                }
                i10++;
            }
            while (i9 < arrayList.size()) {
                p0 p0Var2 = (p0) arrayList.get(i9);
                float f24 = 1.0f - f10;
                float f25 = (f24 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f25, f25, (p0Var2.A / 2.0f) + p0Var2.f10708x + f16, (p0Var2.B / 2.0f) + p0Var2.f10709y + f17);
                ((p0) arrayList.get(i9)).d(canvas2, p0Var2.f10708x + f16, p0Var2.f10709y + f17, 1.0f, f24, false, this.E, this.D);
                canvas.restore();
                i9++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(android.graphics.Canvas r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: hg.s0.e(android.graphics.Canvas, float):void");
    }

    public final void f(im imVar, Canvas canvas, int i9, Integer num) {
        int i10;
        if (!this.f10749s || !this.f10752w.isEmpty()) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.v;
                if (i11 < arrayList.size()) {
                    p0 p0Var = (p0) arrayList.get(i11);
                    if ((num == null || p0Var.f10703r.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(p0Var.f10705t);
                        float dp = AndroidUtilities.dp(140.0f);
                        float dp2 = AndroidUtilities.dp(14.0f);
                        org.telegram.ui.Cells.a0 a0Var = this.f10755z;
                        if (a0Var instanceof t1) {
                            i10 = ((t1) a0Var).getParentWidth();
                        } else {
                            i10 = AndroidUtilities.displaySize.x;
                        }
                        float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), (i10 - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        float f10 = rectF.top - dp2;
                        float f11 = i9;
                        float f12 = f10 + f11;
                        RectF rectF2 = this.O;
                        rectF2.set(clamp, (f10 - dp) + f11, dp + clamp, f12);
                        float interpolation = gr.h.getInterpolation(this.D);
                        AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                        int i12 = p0Var.V;
                        r0 r0Var = p0Var.f10704s;
                        View view = p0Var.W;
                        if (p0Var.f10691f0 == null && p0Var.f10693g0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (p0Var.f10703r != null && !r0Var.f10713a) {
                                if (r0Var.f10717f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i12).getReactionsMap().get(r0Var.f10717f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, f6.f22947a7, 1.0f);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        p0Var.f10691f0 = imageReceiver;
                                        imageReceiver.setLayerNum(7);
                                        p0Var.f10691f0.onAttachedToWindow();
                                        p0Var.f10691f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        p0Var.f10691f0.setAllowStartLottieAnimation(true);
                                        p0Var.f10691f0.setAllowStartAnimation(true);
                                        p0Var.f10691f0.setAutoRepeat(1);
                                        p0Var.f10691f0.setAllowDecodeSingleFrame(true);
                                        p0Var.f10691f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                                    }
                                } else if (r0Var.f10718g != 0) {
                                    k5 k5Var = new k5(24, i12, r0Var.f10718g);
                                    p0Var.f10693g0 = k5Var;
                                    k5Var.a(view);
                                }
                            }
                        }
                        this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver2 = p0Var.f10691f0;
                            if (imageReceiver2 != null) {
                                imageReceiver2.setImageCoords(rectF2);
                                p0Var.f10691f0.setAlpha(interpolation);
                                p0Var.f10691f0.draw(canvas);
                            } else {
                                k5 k5Var2 = p0Var.f10693g0;
                                if (k5Var2 != null) {
                                    k5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    p0Var.f10693g0.setAlpha((int) (interpolation * 255.0f));
                                    p0Var.f10693g0.draw(canvas);
                                }
                            }
                            imVar.invalidate();
                        }
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final float i(float f10) {
        if (this.f10742l) {
            return (this.f10746p * f10) + ((1.0f - f10) * this.J);
        }
        return this.f10746p;
    }

    public final float j(float f10) {
        if (this.f10741k) {
            return (this.f10747q * f10) + ((1.0f - f10) * this.f10748r);
        }
        return this.f10747q;
    }

    public final p0 l(r0 r0Var) {
        String l10;
        if (r0Var.f10713a) {
            l10 = "stars";
        } else {
            String str = r0Var.f10717f;
            if (str != null) {
                l10 = str;
            } else {
                l10 = Long.toString(r0Var.f10718g);
            }
        }
        return m(l10);
    }

    public final p0 m(String str) {
        boolean z10 = this.f10734b;
        HashMap hashMap = this.f10753x;
        if (z10) {
            p0 p0Var = (p0) hashMap.get(str + "_");
            if (p0Var != null) {
                return p0Var;
            }
        }
        return (p0) hashMap.get(str);
    }

    public final boolean n() {
        if (this.L) {
            if ((!this.f10749s || !this.f10752w.isEmpty()) && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p(int i9, int i10) {
        ArrayList arrayList;
        float f10;
        int dp;
        float f11;
        int i11;
        this.f10745o = 0;
        this.f10747q = 0;
        this.f10743m = 0;
        this.f10746p = 0;
        if (this.f10749s) {
            return;
        }
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.v;
            if (i12 >= arrayList.size()) {
                break;
            }
            p0 p0Var = (p0) arrayList.get(i12);
            boolean z10 = p0Var.f10683b;
            i6 i6Var = p0Var.G;
            lq lqVar = p0Var.F;
            if (z10) {
                p0Var.A = AndroidUtilities.dp(14.0f);
                p0Var.B = AndroidUtilities.dp(14.0f);
            } else if (p0Var.S) {
                p0Var.A = AndroidUtilities.dp(42.0f);
                p0Var.B = AndroidUtilities.dp(26.0f);
                if (p0Var.f10706u) {
                    p0Var.A = (int) (i6Var.d + AndroidUtilities.dp(8.0f) + p0Var.A);
                } else if (lqVar != null && p0Var.f10707w > 1) {
                    p0Var.A = org.telegram.messenger.l0.C(8.0f, (int) Math.ceil(lqVar.f30524m), p0Var.A);
                }
            } else {
                int dp2 = AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (p0Var.D != null) {
                    f11 = 6.0f;
                } else {
                    f11 = 4.0f;
                }
                p0Var.A = AndroidUtilities.dp(f11) + dp2;
                if (p0Var.T != null && p0Var.U.size() > 0) {
                    p0Var.U.size();
                    if (p0Var.U.size() > 1) {
                        i11 = p0Var.U.size() - 1;
                    } else {
                        i11 = 0;
                    }
                    p0Var.A = (int) ((AndroidUtilities.dp(20.0f) * i11 * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + p0Var.A);
                    p0Var.T.f27086o = AndroidUtilities.dp(26.0f);
                } else if (p0Var.f10706u) {
                    p0Var.A = (int) (i6Var.d + AndroidUtilities.dp(8.0f) + p0Var.A);
                } else if (((int) Math.ceil(lqVar.f30524m)) > 0) {
                    p0Var.A = org.telegram.messenger.l0.C(8.0f, (int) Math.ceil(lqVar.f30524m), p0Var.A);
                } else {
                    p0Var.A -= AndroidUtilities.dp(1.0f);
                }
                p0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (p0Var.A + i13 > i9) {
                arrayList2.add(Integer.valueOf(i13));
                i15 = org.telegram.messenger.l0.C(4.0f, p0Var.B, i15);
                i16++;
                i13 = 0;
            }
            p0Var.f10708x = i13;
            p0Var.f10709y = i15;
            p0Var.f10710z = i16;
            i13 = org.telegram.messenger.l0.C(4.0f, p0Var.A, i13);
            if (i13 > i14) {
                i14 = i13;
            }
            i12++;
        }
        arrayList2.add(Integer.valueOf(i13));
        if (i10 == 5 && !arrayList.isEmpty()) {
            int i17 = ((p0) arrayList.get(0)).f10709y;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((p0) arrayList.get(i19)).f10709y != i17) {
                    int i20 = i19 - 1;
                    int i21 = i9 - (((p0) arrayList.get(i20)).f10708x + ((p0) arrayList.get(i20)).A);
                    while (i18 < i19) {
                        ((p0) arrayList.get(i18)).f10708x += i21;
                        i18++;
                    }
                    i18 = i19;
                }
            }
            int size = arrayList.size() - 1;
            int i22 = i9 - (((p0) arrayList.get(size)).f10708x + ((p0) arrayList.get(size)).A);
            while (i18 <= size) {
                ((p0) arrayList.get(i18)).f10708x += i22;
                i18++;
            }
        } else if (i10 == 1 && !arrayList.isEmpty()) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                p0 p0Var2 = (p0) arrayList.get(i23);
                int i24 = p0Var2.f10710z;
                if (i24 >= 0 && i24 < arrayList2.size()) {
                    f10 = ((Integer) arrayList2.get(p0Var2.f10710z)).intValue();
                } else {
                    f10 = 0.0f;
                }
                p0Var2.f10708x = (int) e2.c.A(i9, f10, 2.0f, p0Var2.f10708x);
            }
        }
        this.f10751u = i13;
        if (i10 != 5 && i10 != 1) {
            this.f10747q = i14;
        } else {
            this.f10747q = i9;
        }
        if (arrayList.size() == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(26.0f);
        }
        this.f10745o = i15 + dp;
        this.f10733a = 0.0f;
    }

    public final void q() {
        int i9 = 0;
        this.G = false;
        while (true) {
            ArrayList arrayList = this.v;
            if (i9 >= arrayList.size()) {
                break;
            }
            ((p0) arrayList.get(i9)).b();
            i9++;
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
        HashMap hashMap = this.f10753x;
        hashMap.clear();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i9 < arrayList.size()) {
                hashMap.put(((p0) arrayList.get(i9)).f10700o, (p0) arrayList.get(i9));
                i9++;
            } else {
                this.f10739i = !this.f10749s;
                this.f10738g = this.f10735c;
                this.h = this.d;
                this.F = this.f10747q;
                this.I = this.f10746p;
                return;
            }
        }
    }

    public final void s(org.telegram.messenger.MessageObject r20, boolean r21, boolean r22, org.telegram.ui.ActionBar.b6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: hg.s0.s(org.telegram.messenger.MessageObject, boolean, boolean, org.telegram.ui.ActionBar.b6):void");
    }
}
