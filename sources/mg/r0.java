package mg;

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
import lh.n2;
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
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.tq;
import org.telegram.ui.pm;
public final class r0 {
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
    public o0 S;
    public boolean T;
    public n2 U;
    public float f14113a;
    public boolean f14114b;
    public int f14115c;
    public int d;
    public float e;
    public float f14116f;
    public float f14117g;
    public float h;
    public boolean f14118i;
    public boolean f14119j;
    public boolean f14120k;
    public boolean f14121l;
    public int f14122m;
    public int f14124o;
    public int f14125p;
    public int f14126q;
    public int f14127r;
    public boolean f14128s;
    public final float f14129t;
    public int f14130u;
    public final org.telegram.ui.Cells.a0 f14134z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final n0 f14110a0 = new Object();
    public static int f14111b0 = 1;
    public static final e5.f f14112c0 = new e5.f(21);
    public final ArrayList v = new ArrayList();
    public final ArrayList f14131w = new ArrayList();
    public final HashMap f14132x = new HashMap();
    public final HashMap f14133y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int f14123n = UserConfig.selectedAccount;

    public r0(org.telegram.ui.Cells.a0 a0Var) {
        this.f14134z = a0Var;
        o(this.B);
        this.f14129t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
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
            return ((TLRPC.User) tLObject).f19331id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f19184id;
        }
        return 0L;
    }

    public static void o(f6 f6Var) {
        V.setColor(j6.v0(j6.f20003ie, f6Var));
        int v02 = j6.v0(j6.Sh, f6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(v02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        c9 c9Var;
        int i10;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.f14133y;
        hashMap.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.f14131w;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((o0) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.f14132x);
        int i12 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i12 >= arrayList2.size()) {
                break;
            }
            o0 o0Var = (o0) arrayList2.get(i12);
            String str = o0Var.f14091o;
            tq tqVar = o0Var.F;
            o0 o0Var2 = (o0) hashMap.get(str);
            if (o0Var2 != null && o0Var.f14075b != o0Var2.f14075b) {
                o0Var2 = null;
            }
            if (o0Var2 != null) {
                hashMap.remove(o0Var.f14091o);
                int i13 = o0Var.f14099x;
                int i14 = o0Var2.f14099x;
                if (i13 == i14 && o0Var.f14100y == o0Var2.f14100y && o0Var.A == o0Var2.A && o0Var.f14098w == o0Var2.f14098w && o0Var.f14092p == o0Var2.f14092p && o0Var.T == null && o0Var2.T == null) {
                    o0Var.f14077c = 0;
                    i12++;
                } else {
                    o0Var.d = i14;
                    o0Var.e = o0Var2.f14100y;
                    o0Var.f14081f = o0Var2.A;
                    o0Var.f14085i = o0Var2.N;
                    o0Var.f14083g = o0Var2.O;
                    o0Var.h = o0Var2.P;
                    o0Var.f14077c = 3;
                    int i15 = o0Var.f14098w;
                    int i16 = o0Var2.f14098w;
                    if (i15 != i16 && tqVar != null) {
                        tqVar.c(i16, false);
                        tqVar.c(o0Var.f14098w, true);
                    }
                    c9 c9Var2 = o0Var.T;
                    if (c9Var2 != null || o0Var2.T != null) {
                        if (c9Var2 == null) {
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
                        c9 c9Var3 = o0Var.T;
                        if (c9Var3 != null && (c9Var = o0Var2.T) != null) {
                            ValueAnimator valueAnimator = c9Var.f23925f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (c9Var3.f23940w) {
                                    c9Var3.f23940w = false;
                                    c9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.f14123n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = c9Var3.f23923b[i18].h;
                                c9Var3.l(i18, c9Var.f23923b[i18].h, i10);
                                i18++;
                            }
                            c9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                c9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            c9Var3.d = true;
                            c9Var3.b(true, false);
                        }
                    }
                }
            } else {
                o0Var.f14077c = 1;
            }
            z4 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((o0) arrayList.get(i20)).f14088l = ((o0) arrayList.get(i20)).f14090n;
                ((o0) arrayList.get(i20)).a();
            }
            z4 = true;
        }
        if (this.f14118i) {
            float f10 = this.f14117g;
            if (f10 != this.f14115c || this.h != this.d) {
                this.f14119j = true;
                this.e = f10;
                this.f14116f = this.h;
                z4 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.f14126q) {
            this.f14120k = true;
            this.f14127r = i21;
            z4 = true;
        }
        int i22 = this.I;
        if (i22 != this.f14125p) {
            this.f14121l = true;
            this.J = i22;
            return true;
        }
        return z4;
    }

    public final void b(q0 q0Var) {
        int i10 = 0;
        if (q0Var.f14108g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(q0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.f14134z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f14123n).getReactionsMap().get(q0Var.f14107f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(q0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || q0Var.f14108g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (q0Var.f(((o0) arrayList.get(i10)).f14094r)) {
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
        if (this.f14128s || this.f14114b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.f14134z;
        if (e2.c.s(a0Var)) {
            y10 -= a0Var.getPaddingTop();
            if (a0Var instanceof v0) {
                x10 -= ((v0) a0Var).f22444g0 / 2.0f;
            }
        }
        float f10 = x10 - this.f14115c;
        float f11 = y10 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (f10 > ((o0) arrayList.get(i10)).f14099x && f10 < ((o0) arrayList.get(i10)).f14099x + ((o0) arrayList.get(i10)).A && f11 > ((o0) arrayList.get(i10)).f14100y && f11 < ((o0) arrayList.get(i10)).f14100y + ((o0) arrayList.get(i10)).B) {
                    this.Q = motionEvent.getX();
                    this.R = y10;
                    this.S = (o0) arrayList.get(i10);
                    n2 n2Var = this.U;
                    if (n2Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(n2Var);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    n2 n2Var2 = new n2(21, this, this.S);
                    this.U = n2Var2;
                    AndroidUtilities.runOnUIThread(n2Var2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z4 = this.T;
            float f12 = this.f14129t;
            if ((z4 && Math.abs(motionEvent.getX() - this.Q) > f12) || Math.abs(y10 - this.R) > f12) {
                this.T = false;
                o0 o0Var = this.S;
                if (o0Var != null) {
                    o0Var.Y.c(false);
                }
                this.S = null;
                n2 n2Var3 = this.U;
                if (n2Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(n2Var3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            n2 n2Var4 = this.U;
            if (n2Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(n2Var4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.f14073a;
                float x11 = motionEvent.getX();
                if (e2.c.s(a0Var)) {
                    ((o4) a0Var).f(reactionCount, false, x11, y10);
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

    public final void d(Canvas canvas, float f10, Integer num) {
        float f11;
        float f12;
        boolean z4;
        Canvas canvas2 = canvas;
        boolean z10 = this.f14128s;
        ArrayList arrayList = this.f14131w;
        if (!z10 || !arrayList.isEmpty()) {
            float f13 = this.f14115c;
            float f14 = this.d;
            if (this.f14128s) {
                f13 = this.f14117g;
                f14 = this.h;
            } else if (this.f14119j) {
                float f15 = 1.0f - f10;
                f13 = (f13 * f10) + (this.e * f15);
                f14 = (f14 * f10) + (this.f14116f * f15);
            }
            float f16 = f13;
            float f17 = f14;
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
                if (!Integer.valueOf(o0Var.f14094r.hashCode()).equals(this.C) && (num == null || o0Var.f14094r.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f18 = o0Var.f14099x;
                    float f19 = o0Var.f14100y;
                    int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    if (i12 != 0 && o0Var.f14077c == 3) {
                        float f20 = 1.0f - f10;
                        f18 = (f18 * f10) + (o0Var.d * f20);
                        f19 = (f19 * f10) + (o0Var.e * f20);
                    }
                    if (i12 != 0 && o0Var.f14077c == 1) {
                        float f21 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f21, f21, (o0Var.A / 2.0f) + f16 + f18, (o0Var.B / 2.0f) + f17 + f19);
                        f11 = f10;
                    } else {
                        f11 = 1.0f;
                    }
                    float f22 = f18 + f16;
                    float f23 = f19 + f17;
                    if (o0Var.f14077c == 3) {
                        f12 = f10;
                    } else {
                        f12 = 1.0f;
                    }
                    if (num != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    o0Var.d(canvas2, f22, f23, f12, f11, z4, this.E, this.D);
                    canvas2.restore();
                }
                i11++;
            }
            while (i10 < arrayList.size()) {
                o0 o0Var2 = (o0) arrayList.get(i10);
                float f24 = 1.0f - f10;
                float f25 = (f24 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f25, f25, (o0Var2.A / 2.0f) + o0Var2.f14099x + f16, (o0Var2.B / 2.0f) + o0Var2.f14100y + f17);
                ((o0) arrayList.get(i10)).d(canvas2, o0Var2.f14099x + f16, o0Var2.f14100y + f17, 1.0f, f24, false, this.E, this.D);
                canvas.restore();
                i10++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(android.graphics.Canvas r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: mg.r0.e(android.graphics.Canvas, float):void");
    }

    public final void f(pm pmVar, Canvas canvas, int i10, Integer num) {
        int i11;
        if (!this.f14128s || !this.f14131w.isEmpty()) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.v;
                if (i12 < arrayList.size()) {
                    o0 o0Var = (o0) arrayList.get(i12);
                    if ((num == null || o0Var.f14094r.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(o0Var.f14096t);
                        float dp = AndroidUtilities.dp(140.0f);
                        float dp2 = AndroidUtilities.dp(14.0f);
                        org.telegram.ui.Cells.a0 a0Var = this.f14134z;
                        if (a0Var instanceof t1) {
                            i11 = ((t1) a0Var).getParentWidth();
                        } else {
                            i11 = AndroidUtilities.displaySize.x;
                        }
                        float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), (i11 - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        float f10 = rectF.top - dp2;
                        float f11 = i10;
                        float f12 = f10 + f11;
                        RectF rectF2 = this.O;
                        rectF2.set(clamp, (f10 - dp) + f11, dp + clamp, f12);
                        float interpolation = nr.h.getInterpolation(this.D);
                        AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                        int i13 = o0Var.V;
                        q0 q0Var = o0Var.f14095s;
                        View view = o0Var.W;
                        if (o0Var.f14082f0 == null && o0Var.f14084g0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (o0Var.f14094r != null && !q0Var.f14104a) {
                                if (q0Var.f14107f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(q0Var.f14107f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, j6.f19852a7, 1.0f);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        o0Var.f14082f0 = imageReceiver;
                                        imageReceiver.setLayerNum(7);
                                        o0Var.f14082f0.onAttachedToWindow();
                                        o0Var.f14082f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        o0Var.f14082f0.setAllowStartLottieAnimation(true);
                                        o0Var.f14082f0.setAllowStartAnimation(true);
                                        o0Var.f14082f0.setAutoRepeat(1);
                                        o0Var.f14082f0.setAllowDecodeSingleFrame(true);
                                        o0Var.f14082f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                                    }
                                } else if (q0Var.f14108g != 0) {
                                    l5 l5Var = new l5(24, i13, q0Var.f14108g);
                                    o0Var.f14084g0 = l5Var;
                                    l5Var.a(view);
                                }
                            }
                        }
                        this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver2 = o0Var.f14082f0;
                            if (imageReceiver2 != null) {
                                imageReceiver2.setImageCoords(rectF2);
                                o0Var.f14082f0.setAlpha(interpolation);
                                o0Var.f14082f0.draw(canvas);
                            } else {
                                l5 l5Var2 = o0Var.f14084g0;
                                if (l5Var2 != null) {
                                    l5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    o0Var.f14084g0.setAlpha((int) (interpolation * 255.0f));
                                    o0Var.f14084g0.draw(canvas);
                                }
                            }
                            pmVar.invalidate();
                        }
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    public final float i(float f10) {
        if (this.f14121l) {
            return (this.f14125p * f10) + ((1.0f - f10) * this.J);
        }
        return this.f14125p;
    }

    public final float j(float f10) {
        if (this.f14120k) {
            return (this.f14126q * f10) + ((1.0f - f10) * this.f14127r);
        }
        return this.f14126q;
    }

    public final o0 l(String str) {
        boolean z4 = this.f14114b;
        HashMap hashMap = this.f14132x;
        if (z4) {
            o0 o0Var = (o0) hashMap.get(str + "_");
            if (o0Var != null) {
                return o0Var;
            }
        }
        return (o0) hashMap.get(str);
    }

    public final o0 m(q0 q0Var) {
        String l10;
        if (q0Var.f14104a) {
            l10 = "stars";
        } else {
            String str = q0Var.f14107f;
            if (str != null) {
                l10 = str;
            } else {
                l10 = Long.toString(q0Var.f14108g);
            }
        }
        return l(l10);
    }

    public final boolean n() {
        if (this.L) {
            if ((!this.f14128s || !this.f14131w.isEmpty()) && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p(int i10, int i11) {
        ArrayList arrayList;
        float f10;
        int dp;
        float f11;
        int i12;
        this.f14124o = 0;
        this.f14126q = 0;
        this.f14122m = 0;
        this.f14125p = 0;
        if (this.f14128s) {
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
            boolean z4 = o0Var.f14075b;
            org.telegram.ui.Components.j6 j6Var = o0Var.G;
            tq tqVar = o0Var.F;
            if (z4) {
                o0Var.A = AndroidUtilities.dp(14.0f);
                o0Var.B = AndroidUtilities.dp(14.0f);
            } else if (o0Var.S) {
                o0Var.A = AndroidUtilities.dp(42.0f);
                o0Var.B = AndroidUtilities.dp(26.0f);
                if (o0Var.f14097u) {
                    o0Var.A = (int) (j6Var.d + AndroidUtilities.dp(8.0f) + o0Var.A);
                } else if (tqVar != null && o0Var.f14098w > 1) {
                    o0Var.A = y3.C(8.0f, (int) Math.ceil(tqVar.f29012m), o0Var.A);
                }
            } else {
                int dp2 = AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (o0Var.D != null) {
                    f11 = 6.0f;
                } else {
                    f11 = 4.0f;
                }
                o0Var.A = AndroidUtilities.dp(f11) + dp2;
                if (o0Var.T != null && o0Var.U.size() > 0) {
                    o0Var.U.size();
                    if (o0Var.U.size() > 1) {
                        i12 = o0Var.U.size() - 1;
                    } else {
                        i12 = 0;
                    }
                    o0Var.A = (int) ((AndroidUtilities.dp(20.0f) * i12 * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + o0Var.A);
                    o0Var.T.f23933o = AndroidUtilities.dp(26.0f);
                } else if (o0Var.f14097u) {
                    o0Var.A = (int) (j6Var.d + AndroidUtilities.dp(8.0f) + o0Var.A);
                } else if (((int) Math.ceil(tqVar.f29012m)) > 0) {
                    o0Var.A = y3.C(8.0f, (int) Math.ceil(tqVar.f29012m), o0Var.A);
                } else {
                    o0Var.A -= AndroidUtilities.dp(1.0f);
                }
                o0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (o0Var.A + i14 > i10) {
                arrayList2.add(Integer.valueOf(i14));
                i16 = y3.C(4.0f, o0Var.B, i16);
                i17++;
                i14 = 0;
            }
            o0Var.f14099x = i14;
            o0Var.f14100y = i16;
            o0Var.f14101z = i17;
            i14 = y3.C(4.0f, o0Var.A, i14);
            if (i14 > i15) {
                i15 = i14;
            }
            i13++;
        }
        arrayList2.add(Integer.valueOf(i14));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i18 = ((o0) arrayList.get(0)).f14100y;
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((o0) arrayList.get(i20)).f14100y != i18) {
                    int i21 = i20 - 1;
                    int i22 = i10 - (((o0) arrayList.get(i21)).f14099x + ((o0) arrayList.get(i21)).A);
                    while (i19 < i20) {
                        ((o0) arrayList.get(i19)).f14099x += i22;
                        i19++;
                    }
                    i19 = i20;
                }
            }
            int size = arrayList.size() - 1;
            int i23 = i10 - (((o0) arrayList.get(size)).f14099x + ((o0) arrayList.get(size)).A);
            while (i19 <= size) {
                ((o0) arrayList.get(i19)).f14099x += i23;
                i19++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                o0 o0Var2 = (o0) arrayList.get(i24);
                int i25 = o0Var2.f14101z;
                if (i25 >= 0 && i25 < arrayList2.size()) {
                    f10 = ((Integer) arrayList2.get(o0Var2.f14101z)).intValue();
                } else {
                    f10 = 0.0f;
                }
                o0Var2.f14099x = (int) e2.c.x(i10, f10, 2.0f, o0Var2.f14099x);
            }
        }
        this.f14130u = i14;
        if (i11 != 5 && i11 != 1) {
            this.f14126q = i15;
        } else {
            this.f14126q = i10;
        }
        if (arrayList.size() == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(26.0f);
        }
        this.f14124o = i16 + dp;
        this.f14113a = 0.0f;
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
        HashMap hashMap = this.f14132x;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                hashMap.put(((o0) arrayList.get(i10)).f14091o, (o0) arrayList.get(i10));
                i10++;
            } else {
                this.f14118i = !this.f14128s;
                this.f14117g = this.f14115c;
                this.h = this.d;
                this.F = this.f14126q;
                this.I = this.f14125p;
                return;
            }
        }
    }

    public final void s(org.telegram.messenger.MessageObject r20, boolean r21, boolean r22, org.telegram.ui.ActionBar.f6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: mg.r0.s(org.telegram.messenger.MessageObject, boolean, boolean, org.telegram.ui.ActionBar.f6):void");
    }
}
