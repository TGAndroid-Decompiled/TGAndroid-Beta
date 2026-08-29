package kg;

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
import jh.w2;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pq;
import org.telegram.ui.km;
public final class r0 {
    public static int Z;
    public MessageObject A;
    public c6 B;
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
    public o0 S;
    public boolean T;
    public w2 U;
    public float f13831a;
    public boolean f13832b;
    public int f13833c;
    public int d;
    public float f13834e;
    public float f13835f;
    public float f13836g;
    public float h;
    public boolean f13837i;
    public boolean f13838j;
    public boolean f13839k;
    public boolean f13840l;
    public int f13841m;
    public int f13843o;
    public int f13844p;
    public int f13845q;
    public int f13846r;
    public boolean f13847s;
    public final float f13848t;
    public int f13849u;
    public final org.telegram.ui.Cells.a0 f13853z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final n0 f13828a0 = new Object();
    public static int f13829b0 = 1;
    public static final c5.e f13830c0 = new c5.e(21);
    public final ArrayList v = new ArrayList();
    public final ArrayList f13850w = new ArrayList();
    public final HashMap f13851x = new HashMap();
    public final HashMap f13852y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int f13842n = UserConfig.selectedAccount;

    public r0(org.telegram.ui.Cells.a0 a0Var) {
        this.f13853z = a0Var;
        o(this.B);
        this.f13848t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
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
        float f9;
        path.rewind();
        float f10 = rectF.left;
        rectF2.set(f10, rectF.top, AndroidUtilities.dp(12.0f) + f10, rectF.top + AndroidUtilities.dp(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - AndroidUtilities.dp(12.0f), rectF.left + AndroidUtilities.dp(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        if (rectF.height() > AndroidUtilities.dp(26.0f)) {
            f9 = 1.4f;
        } else {
            f9 = 0.0f;
        }
        float dpf2 = rectF.right - AndroidUtilities.dpf2(9.09f);
        float dpf22 = dpf2 - AndroidUtilities.dpf2(0.056f);
        float dpf23 = AndroidUtilities.dpf2(1.22f) + dpf2;
        float dpf24 = AndroidUtilities.dpf2(3.07f) + dpf2;
        float dpf25 = AndroidUtilities.dpf2(2.406f) + dpf2;
        float dpf26 = AndroidUtilities.dpf2(8.27f + f9) + dpf2;
        float dpf27 = AndroidUtilities.dpf2(8.923f + f9) + dpf2;
        float dpf28 = AndroidUtilities.dpf2(1.753f) + rectF.top;
        float dpf29 = rectF.bottom - AndroidUtilities.dpf2(1.753f);
        float dpf210 = AndroidUtilities.dpf2(0.663f) + rectF.top;
        float dpf211 = rectF.bottom - AndroidUtilities.dpf2(0.663f);
        float f11 = 10.263f + f9;
        float dpf212 = AndroidUtilities.dpf2(f11) + rectF.top;
        float dpf213 = rectF.bottom - AndroidUtilities.dpf2(f11);
        float f12 = f9 + 11.333f;
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
            return ((TLRPC.User) tLObject).f22539id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f22392id;
        }
        return 0L;
    }

    public static void o(c6 c6Var) {
        V.setColor(g6.v0(g6.f23160ie, c6Var));
        int v02 = g6.v0(g6.Sh, c6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(v02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        g9 g9Var;
        int i10;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.f13852y;
        hashMap.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.f13850w;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((o0) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.f13851x);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i12 >= arrayList2.size()) {
                break;
            }
            o0 o0Var = (o0) arrayList2.get(i12);
            String str = o0Var.f13809o;
            pq pqVar = o0Var.F;
            o0 o0Var2 = (o0) hashMap.get(str);
            if (o0Var2 != null && o0Var.f13792b != o0Var2.f13792b) {
                o0Var2 = null;
            }
            if (o0Var2 != null) {
                hashMap.remove(o0Var.f13809o);
                int i13 = o0Var.f13817x;
                int i14 = o0Var2.f13817x;
                if (i13 == i14 && o0Var.f13818y == o0Var2.f13818y && o0Var.A == o0Var2.A && o0Var.f13816w == o0Var2.f13816w && o0Var.f13810p == o0Var2.f13810p && o0Var.T == null && o0Var2.T == null) {
                    o0Var.f13794c = 0;
                    i12++;
                } else {
                    o0Var.d = i14;
                    o0Var.f13797e = o0Var2.f13818y;
                    o0Var.f13799f = o0Var2.A;
                    o0Var.f13803i = o0Var2.N;
                    o0Var.f13801g = o0Var2.O;
                    o0Var.h = o0Var2.P;
                    o0Var.f13794c = 3;
                    int i15 = o0Var.f13816w;
                    int i16 = o0Var2.f13816w;
                    if (i15 != i16 && pqVar != null) {
                        pqVar.c(i16, false);
                        pqVar.c(o0Var.f13816w, true);
                    }
                    g9 g9Var2 = o0Var.T;
                    if (g9Var2 != null || o0Var2.T != null) {
                        if (g9Var2 == null) {
                            o0Var.p(new ArrayList());
                        }
                        if (o0Var2.T == null) {
                            o0Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = o0Var2.U;
                        ArrayList arrayList4 = o0Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i17);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i17);
                                if (tLObject != null && tLObject2 != null && k(tLObject) == k(tLObject2)) {
                                }
                            }
                        }
                        g9 g9Var3 = o0Var.T;
                        if (g9Var3 != null && (g9Var = o0Var2.T) != null) {
                            ValueAnimator valueAnimator = g9Var.f28827f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (g9Var3.f28842w) {
                                    g9Var3.f28842w = false;
                                    g9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.f13842n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = g9Var3.f28824b[i18].h;
                                g9Var3.l(i18, g9Var.f28824b[i18].h, i10);
                                i18++;
                            }
                            g9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                g9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            g9Var3.d = true;
                            g9Var3.b(true, false);
                        }
                    }
                }
            } else {
                o0Var.f13794c = 1;
            }
            z10 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((o0) arrayList.get(i20)).f13806l = ((o0) arrayList.get(i20)).f13808n;
                ((o0) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.f13837i) {
            float f9 = this.f13836g;
            if (f9 != this.f13833c || this.h != this.d) {
                this.f13838j = true;
                this.f13834e = f9;
                this.f13835f = this.h;
                z10 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.f13845q) {
            this.f13839k = true;
            this.f13846r = i21;
            z10 = true;
        }
        int i22 = this.I;
        if (i22 != this.f13844p) {
            this.f13840l = true;
            this.J = i22;
            return true;
        }
        return z10;
    }

    public final void b(q0 q0Var) {
        int i10 = 0;
        if (q0Var.f13826g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(q0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.f13853z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f13842n).getReactionsMap().get(q0Var.f13825f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(q0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || q0Var.f13826g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (q0Var.f(((o0) arrayList.get(i10)).f13812r)) {
                    ((o0) arrayList.get(i10)).q();
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
        if (this.f13847s || this.f13832b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.f13853z;
        if (com.google.android.recaptcha.internal.a.u(a0Var)) {
            y8 -= a0Var.getPaddingTop();
            if (a0Var instanceof v0) {
                x4 -= ((v0) a0Var).f25773f0 / 2.0f;
            }
        }
        float f9 = x4 - this.f13833c;
        float f10 = y8 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (f9 > ((o0) arrayList.get(i10)).f13817x && f9 < ((o0) arrayList.get(i10)).f13817x + ((o0) arrayList.get(i10)).A && f10 > ((o0) arrayList.get(i10)).f13818y && f10 < ((o0) arrayList.get(i10)).f13818y + ((o0) arrayList.get(i10)).B) {
                    this.Q = motionEvent.getX();
                    this.R = y8;
                    this.S = (o0) arrayList.get(i10);
                    w2 w2Var = this.U;
                    if (w2Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(w2Var);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    w2 w2Var2 = new w2(19, this, this.S);
                    this.U = w2Var2;
                    AndroidUtilities.runOnUIThread(w2Var2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f11 = this.f13848t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f11) || Math.abs(y8 - this.R) > f11) {
                this.T = false;
                o0 o0Var = this.S;
                if (o0Var != null) {
                    o0Var.Y.c(false);
                }
                this.S = null;
                w2 w2Var3 = this.U;
                if (w2Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(w2Var3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            w2 w2Var4 = this.U;
            if (w2Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(w2Var4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.f13790a;
                float x10 = motionEvent.getX();
                if (com.google.android.recaptcha.internal.a.u(a0Var)) {
                    ((m4) a0Var).f(reactionCount, false, x10, y8);
                }
            }
            this.T = false;
            o0 o0Var2 = this.S;
            if (o0Var2 != null) {
                o0Var2.Y.c(false);
            }
            this.S = null;
        }
        return this.T;
    }

    public final void d(Canvas canvas, float f9, Integer num) {
        float f10;
        float f11;
        boolean z10;
        Canvas canvas2 = canvas;
        boolean z11 = this.f13847s;
        ArrayList arrayList = this.f13850w;
        if (!z11 || !arrayList.isEmpty()) {
            float f12 = this.f13833c;
            float f13 = this.d;
            if (this.f13847s) {
                f12 = this.f13836g;
                f13 = this.h;
            } else if (this.f13838j) {
                float f14 = 1.0f - f9;
                f12 = (f12 * f9) + (this.f13834e * f14);
                f13 = (f13 * f9) + (this.f13835f * f14);
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
                o0 o0Var = (o0) arrayList2.get(i11);
                if (this.C == null && num == null && this.D < 0.5f) {
                    o0Var.c();
                }
                if (!Integer.valueOf(o0Var.f13812r.hashCode()).equals(this.C) && (num == null || o0Var.f13812r.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f17 = o0Var.f13817x;
                    float f18 = o0Var.f13818y;
                    int i12 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
                    if (i12 != 0 && o0Var.f13794c == 3) {
                        float f19 = 1.0f - f9;
                        f17 = (f17 * f9) + (o0Var.d * f19);
                        f18 = (f18 * f9) + (o0Var.f13797e * f19);
                    }
                    if (i12 != 0 && o0Var.f13794c == 1) {
                        float f20 = (f9 * 0.5f) + 0.5f;
                        canvas2.scale(f20, f20, (o0Var.A / 2.0f) + f15 + f17, (o0Var.B / 2.0f) + f16 + f18);
                        f10 = f9;
                    } else {
                        f10 = 1.0f;
                    }
                    float f21 = f17 + f15;
                    float f22 = f18 + f16;
                    if (o0Var.f13794c == 3) {
                        f11 = f9;
                    } else {
                        f11 = 1.0f;
                    }
                    if (num != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o0Var.d(canvas2, f21, f22, f11, f10, z10, this.E, this.D);
                    canvas2.restore();
                }
                i11++;
            }
            while (i10 < arrayList.size()) {
                o0 o0Var2 = (o0) arrayList.get(i10);
                float f23 = 1.0f - f9;
                float f24 = (f23 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f24, f24, (o0Var2.A / 2.0f) + o0Var2.f13817x + f15, (o0Var2.B / 2.0f) + o0Var2.f13818y + f16);
                ((o0) arrayList.get(i10)).d(canvas2, o0Var2.f13817x + f15, o0Var2.f13818y + f16, 1.0f, f23, false, this.E, this.D);
                canvas.restore();
                i10++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(android.graphics.Canvas r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: kg.r0.e(android.graphics.Canvas, float):void");
    }

    public final void f(km kmVar, Canvas canvas, int i10, Integer num) {
        int i11;
        if (!this.f13847s || !this.f13850w.isEmpty()) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.v;
                if (i12 < arrayList.size()) {
                    o0 o0Var = (o0) arrayList.get(i12);
                    if ((num == null || o0Var.f13812r.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(o0Var.f13814t);
                        float dp = AndroidUtilities.dp(140.0f);
                        float dp2 = AndroidUtilities.dp(14.0f);
                        org.telegram.ui.Cells.a0 a0Var = this.f13853z;
                        if (a0Var instanceof s1) {
                            i11 = ((s1) a0Var).getParentWidth();
                        } else {
                            i11 = AndroidUtilities.displaySize.x;
                        }
                        float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), (i11 - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        float f9 = rectF.top - dp2;
                        float f10 = i10;
                        float f11 = f9 + f10;
                        RectF rectF2 = this.O;
                        rectF2.set(clamp, (f9 - dp) + f10, dp + clamp, f11);
                        float interpolation = jr.h.getInterpolation(this.D);
                        AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                        int i13 = o0Var.V;
                        q0 q0Var = o0Var.f13813s;
                        View view = o0Var.W;
                        if (o0Var.f13800f0 == null && o0Var.f13802g0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (o0Var.f13812r != null && !q0Var.f13821a) {
                                if (q0Var.f13825f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(q0Var.f13825f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, g6.f23009a7, 1.0f);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        o0Var.f13800f0 = imageReceiver;
                                        imageReceiver.setLayerNum(7);
                                        o0Var.f13800f0.onAttachedToWindow();
                                        o0Var.f13800f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        o0Var.f13800f0.setAllowStartLottieAnimation(true);
                                        o0Var.f13800f0.setAllowStartAnimation(true);
                                        o0Var.f13800f0.setAutoRepeat(1);
                                        o0Var.f13800f0.setAllowDecodeSingleFrame(true);
                                        o0Var.f13800f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                                    }
                                } else if (q0Var.f13826g != 0) {
                                    p5 p5Var = new p5(24, i13, q0Var.f13826g);
                                    o0Var.f13802g0 = p5Var;
                                    p5Var.a(view);
                                }
                            }
                        }
                        this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver2 = o0Var.f13800f0;
                            if (imageReceiver2 != null) {
                                imageReceiver2.setImageCoords(rectF2);
                                o0Var.f13800f0.setAlpha(interpolation);
                                o0Var.f13800f0.draw(canvas);
                            } else {
                                p5 p5Var2 = o0Var.f13802g0;
                                if (p5Var2 != null) {
                                    p5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    o0Var.f13802g0.setAlpha((int) (interpolation * 255.0f));
                                    o0Var.f13802g0.draw(canvas);
                                }
                            }
                            kmVar.invalidate();
                        }
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    public final float i(float f9) {
        if (this.f13840l) {
            return (this.f13844p * f9) + ((1.0f - f9) * this.J);
        }
        return this.f13844p;
    }

    public final float j(float f9) {
        if (this.f13839k) {
            return (this.f13845q * f9) + ((1.0f - f9) * this.f13846r);
        }
        return this.f13845q;
    }

    public final o0 l(String str) {
        boolean z10 = this.f13832b;
        HashMap hashMap = this.f13851x;
        if (z10) {
            o0 o0Var = (o0) hashMap.get(str + "_");
            if (o0Var != null) {
                return o0Var;
            }
        }
        return (o0) hashMap.get(str);
    }

    public final o0 m(q0 q0Var) {
        String l10;
        if (q0Var.f13821a) {
            l10 = "stars";
        } else {
            String str = q0Var.f13825f;
            if (str != null) {
                l10 = str;
            } else {
                l10 = Long.toString(q0Var.f13826g);
            }
        }
        return l(l10);
    }

    public final boolean n() {
        if (this.L) {
            if ((!this.f13847s || !this.f13850w.isEmpty()) && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p(int i10, int i11) {
        ArrayList arrayList;
        float f9;
        int dp;
        float f10;
        int i12;
        this.f13843o = 0;
        this.f13845q = 0;
        this.f13841m = 0;
        this.f13844p = 0;
        if (this.f13847s) {
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
            o0 o0Var = (o0) arrayList.get(i13);
            boolean z10 = o0Var.f13792b;
            n6 n6Var = o0Var.G;
            pq pqVar = o0Var.F;
            if (z10) {
                o0Var.A = AndroidUtilities.dp(14.0f);
                o0Var.B = AndroidUtilities.dp(14.0f);
            } else if (o0Var.S) {
                o0Var.A = AndroidUtilities.dp(42.0f);
                o0Var.B = AndroidUtilities.dp(26.0f);
                if (o0Var.f13815u) {
                    o0Var.A = (int) (n6Var.d + AndroidUtilities.dp(8.0f) + o0Var.A);
                } else if (pqVar != null && o0Var.f13816w > 1) {
                    o0Var.A = x3.C(8.0f, (int) Math.ceil(pqVar.f31741m), o0Var.A);
                }
            } else {
                int dp2 = AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (o0Var.D != null) {
                    f10 = 6.0f;
                } else {
                    f10 = 4.0f;
                }
                o0Var.A = AndroidUtilities.dp(f10) + dp2;
                if (o0Var.T != null && o0Var.U.size() > 0) {
                    o0Var.U.size();
                    if (o0Var.U.size() > 1) {
                        i12 = o0Var.U.size() - 1;
                    } else {
                        i12 = 0;
                    }
                    o0Var.A = (int) ((AndroidUtilities.dp(20.0f) * i12 * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + o0Var.A);
                    o0Var.T.f28835o = AndroidUtilities.dp(26.0f);
                } else if (o0Var.f13815u) {
                    o0Var.A = (int) (n6Var.d + AndroidUtilities.dp(8.0f) + o0Var.A);
                } else if (((int) Math.ceil(pqVar.f31741m)) > 0) {
                    o0Var.A = x3.C(8.0f, (int) Math.ceil(pqVar.f31741m), o0Var.A);
                } else {
                    o0Var.A -= AndroidUtilities.dp(1.0f);
                }
                o0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (o0Var.A + i14 > i10) {
                arrayList2.add(Integer.valueOf(i14));
                i16 = x3.C(4.0f, o0Var.B, i16);
                i17++;
                i14 = 0;
            }
            o0Var.f13817x = i14;
            o0Var.f13818y = i16;
            o0Var.f13819z = i17;
            i14 = x3.C(4.0f, o0Var.A, i14);
            if (i14 > i15) {
                i15 = i14;
            }
            i13++;
        }
        arrayList2.add(Integer.valueOf(i14));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i18 = ((o0) arrayList.get(0)).f13818y;
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((o0) arrayList.get(i20)).f13818y != i18) {
                    int i21 = i20 - 1;
                    int i22 = i10 - (((o0) arrayList.get(i21)).f13817x + ((o0) arrayList.get(i21)).A);
                    while (i19 < i20) {
                        ((o0) arrayList.get(i19)).f13817x += i22;
                        i19++;
                    }
                    i19 = i20;
                }
            }
            int size = arrayList.size() - 1;
            int i23 = i10 - (((o0) arrayList.get(size)).f13817x + ((o0) arrayList.get(size)).A);
            while (i19 <= size) {
                ((o0) arrayList.get(i19)).f13817x += i23;
                i19++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                o0 o0Var2 = (o0) arrayList.get(i24);
                int i25 = o0Var2.f13819z;
                if (i25 >= 0 && i25 < arrayList2.size()) {
                    f9 = ((Integer) arrayList2.get(o0Var2.f13819z)).intValue();
                } else {
                    f9 = 0.0f;
                }
                o0Var2.f13817x = (int) com.google.android.recaptcha.internal.a.A(i10, f9, 2.0f, o0Var2.f13817x);
            }
        }
        this.f13849u = i14;
        if (i11 != 5 && i11 != 1) {
            this.f13845q = i15;
        } else {
            this.f13845q = i10;
        }
        if (arrayList.size() == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(26.0f);
        }
        this.f13843o = i16 + dp;
        this.f13831a = 0.0f;
    }

    public final void q() {
        int i10 = 0;
        this.G = false;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((o0) arrayList.get(i10)).b();
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
        HashMap hashMap = this.f13851x;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                hashMap.put(((o0) arrayList.get(i10)).f13809o, (o0) arrayList.get(i10));
                i10++;
            } else {
                this.f13837i = !this.f13847s;
                this.f13836g = this.f13833c;
                this.h = this.d;
                this.F = this.f13845q;
                this.I = this.f13844p;
                return;
            }
        }
    }

    public final void s(org.telegram.messenger.MessageObject r20, boolean r21, boolean r22, org.telegram.ui.ActionBar.c6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: kg.r0.s(org.telegram.messenger.MessageObject, boolean, boolean, org.telegram.ui.ActionBar.c6):void");
    }
}
