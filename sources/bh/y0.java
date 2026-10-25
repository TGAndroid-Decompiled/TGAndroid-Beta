package bh;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.t5;
import org.telegram.ui.mm;
public final class y0 {
    public static int Z;
    public MessageObject A;
    public u6 B;
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
    public v0 S;
    public boolean T;
    public a1.f U;
    public float f4215a;
    public boolean f4216b;
    public int f4217c;
    public int d;
    public float e;
    public float f4218f;
    public float f4219g;
    public float h;
    public boolean f4220i;
    public boolean f4221j;
    public boolean f4222k;
    public boolean f4223l;
    public int f4224m;
    public int f4226o;
    public int f4227p;
    public int f4228q;
    public int f4229r;
    public boolean f4230s;
    public final float f4231t;
    public int f4232u;
    public final org.telegram.ui.Cells.z f4236z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final t0 f4212a0 = new Object();
    public static int f4213b0 = 1;
    public static final a4.d f4214c0 = new a4.d(2);
    public final ArrayList v = new ArrayList();
    public final ArrayList f4233w = new ArrayList();
    public final HashMap f4234x = new HashMap();
    public final HashMap f4235y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int f4225n = UserConfig.selectedAccount;

    public y0(org.telegram.ui.Cells.z zVar) {
        this.f4236z = zVar;
        o(this.B);
        this.f4231t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
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
            return ((TLRPC.User) tLObject).f22174id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f22027id;
        }
        return 0L;
    }

    public static void o(u6 u6Var) {
        V.setColor(y6.w0(y6.ie, u6Var));
        int w02 = y6.w0(y6.Sh, u6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(w02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        l9 l9Var;
        int i10;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.f4235y;
        hashMap.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.f4233w;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((v0) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.f4234x);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i12 >= arrayList2.size()) {
                break;
            }
            v0 v0Var = (v0) arrayList2.get(i12);
            String str = v0Var.f4181o;
            gr grVar = v0Var.F;
            v0 v0Var2 = (v0) hashMap.get(str);
            if (v0Var2 != null && v0Var.f4165b != v0Var2.f4165b) {
                v0Var2 = null;
            }
            if (v0Var2 != null) {
                hashMap.remove(v0Var.f4181o);
                int i13 = v0Var.f4189x;
                int i14 = v0Var2.f4189x;
                if (i13 == i14 && v0Var.f4190y == v0Var2.f4190y && v0Var.A == v0Var2.A && v0Var.f4188w == v0Var2.f4188w && v0Var.f4182p == v0Var2.f4182p && v0Var.T == null && v0Var2.T == null) {
                    v0Var.f4167c = 0;
                    i12++;
                } else {
                    v0Var.d = i14;
                    v0Var.e = v0Var2.f4190y;
                    v0Var.f4171f = v0Var2.A;
                    v0Var.f4175i = v0Var2.N;
                    v0Var.f4173g = v0Var2.O;
                    v0Var.h = v0Var2.P;
                    v0Var.f4167c = 3;
                    int i15 = v0Var.f4188w;
                    int i16 = v0Var2.f4188w;
                    if (i15 != i16 && grVar != null) {
                        grVar.c(i16, false);
                        grVar.c(v0Var.f4188w, true);
                    }
                    l9 l9Var2 = v0Var.T;
                    if (l9Var2 != null || v0Var2.T != null) {
                        if (l9Var2 == null) {
                            v0Var.p(new ArrayList());
                        }
                        if (v0Var2.T == null) {
                            v0Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = v0Var2.U;
                        ArrayList arrayList4 = v0Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i17);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i17);
                                if (tLObject != null && tLObject2 != null && k(tLObject) == k(tLObject2)) {
                                }
                            }
                        }
                        l9 l9Var3 = v0Var.T;
                        if (l9Var3 != null && (l9Var = v0Var2.T) != null) {
                            ValueAnimator valueAnimator = l9Var.f30110f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (l9Var3.f30125w) {
                                    l9Var3.f30125w = false;
                                    l9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.f4225n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = l9Var3.f30108b[i18].h;
                                l9Var3.l(i18, l9Var.f30108b[i18].h, i10);
                                i18++;
                            }
                            l9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                l9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            l9Var3.d = true;
                            l9Var3.b(true, false);
                        }
                    }
                }
            } else {
                v0Var.f4167c = 1;
            }
            z10 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((v0) arrayList.get(i20)).f4178l = ((v0) arrayList.get(i20)).f4180n;
                ((v0) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.f4220i) {
            float f7 = this.f4219g;
            if (f7 != this.f4217c || this.h != this.d) {
                this.f4221j = true;
                this.e = f7;
                this.f4218f = this.h;
                z10 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.f4228q) {
            this.f4222k = true;
            this.f4229r = i21;
            z10 = true;
        }
        int i22 = this.I;
        if (i22 != this.f4227p) {
            this.f4223l = true;
            this.J = i22;
            return true;
        }
        return z10;
    }

    public final void b(x0 x0Var) {
        int i10 = 0;
        if (x0Var.f4209g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(x0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.f4236z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f4225n).getReactionsMap().get(x0Var.f4208f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(x0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || x0Var.f4209g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (x0Var.f(((v0) arrayList.get(i10)).f4184r)) {
                    ((v0) arrayList.get(i10)).q();
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
        if (this.f4230s || this.f4216b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Cells.z zVar = this.f4236z;
        if (c3.h0.t(zVar)) {
            y3 -= zVar.getPaddingTop();
            if (zVar instanceof org.telegram.ui.Cells.v0) {
                x9 -= ((org.telegram.ui.Cells.v0) zVar).f25525j0 / 2.0f;
            }
        }
        float f7 = x9 - this.f4217c;
        float f10 = y3 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (f7 > ((v0) arrayList.get(i10)).f4189x && f7 < ((v0) arrayList.get(i10)).f4189x + ((v0) arrayList.get(i10)).A && f10 > ((v0) arrayList.get(i10)).f4190y && f10 < ((v0) arrayList.get(i10)).f4190y + ((v0) arrayList.get(i10)).B) {
                    this.Q = motionEvent.getX();
                    this.R = y3;
                    this.S = (v0) arrayList.get(i10);
                    a1.f fVar = this.U;
                    if (fVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(fVar);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    a1.f fVar2 = new a1.f(26, this, this.S);
                    this.U = fVar2;
                    AndroidUtilities.runOnUIThread(fVar2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f11 = this.f4231t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f11) || Math.abs(y3 - this.R) > f11) {
                this.T = false;
                v0 v0Var = this.S;
                if (v0Var != null) {
                    v0Var.Y.c(false);
                }
                this.S = null;
                a1.f fVar3 = this.U;
                if (fVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(fVar3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            a1.f fVar4 = this.U;
            if (fVar4 != null) {
                AndroidUtilities.cancelRunOnUIThread(fVar4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.f4163a;
                float x10 = motionEvent.getX();
                if (c3.h0.t(zVar)) {
                    ((s4) zVar).d(reactionCount, false, x10, y3);
                }
            }
            this.T = false;
            v0 v0Var2 = this.S;
            if (v0Var2 != null) {
                v0Var2.Y.c(false);
            }
            this.S = null;
        }
        return this.T;
    }

    public final void d(Canvas canvas, float f7, Integer num) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        Canvas canvas2 = canvas;
        boolean z11 = this.f4230s;
        ArrayList arrayList = this.f4233w;
        if (!z11 || !arrayList.isEmpty()) {
            float f13 = this.f4217c;
            float f14 = this.d;
            if (this.f4230s) {
                f13 = this.f4219g;
                f14 = this.h;
            } else if (this.f4221j) {
                float f15 = 1.0f - f7;
                f13 = (f13 * f7) + (this.e * f15);
                f14 = (f14 * f7) + (this.f4218f * f15);
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
                v0 v0Var = (v0) arrayList2.get(i11);
                if (this.C == null && num == null && this.D < 0.5f) {
                    v0Var.c();
                }
                if (!Integer.valueOf(v0Var.f4184r.hashCode()).equals(this.C) && (num == null || v0Var.f4184r.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f18 = v0Var.f4189x;
                    float f19 = v0Var.f4190y;
                    int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i12 != 0 && v0Var.f4167c == 3) {
                        float f20 = 1.0f - f7;
                        f18 = (f18 * f7) + (v0Var.d * f20);
                        f19 = (f19 * f7) + (v0Var.e * f20);
                    }
                    if (i12 != 0 && v0Var.f4167c == 1) {
                        float f21 = (f7 * 0.5f) + 0.5f;
                        canvas2.scale(f21, f21, (v0Var.A / 2.0f) + f16 + f18, (v0Var.B / 2.0f) + f17 + f19);
                        f10 = f7;
                    } else {
                        f10 = 1.0f;
                    }
                    float f22 = f18 + f16;
                    float f23 = f19 + f17;
                    if (v0Var.f4167c == 3) {
                        f11 = f10;
                        f12 = f7;
                    } else {
                        f11 = f10;
                        f12 = 1.0f;
                    }
                    if (num != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v0Var.d(canvas2, f22, f23, f12, f11, z10, this.E, this.D);
                    canvas2.restore();
                }
                i11++;
            }
            while (i10 < arrayList.size()) {
                v0 v0Var2 = (v0) arrayList.get(i10);
                float f24 = 1.0f - f7;
                float f25 = (f24 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f25, f25, (v0Var2.A / 2.0f) + v0Var2.f4189x + f16, (v0Var2.B / 2.0f) + v0Var2.f4190y + f17);
                ((v0) arrayList.get(i10)).d(canvas2, v0Var2.f4189x + f16, v0Var2.f4190y + f17, 1.0f, f24, false, this.E, this.D);
                canvas.restore();
                i10++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(Canvas canvas, float f7) {
        v0 v0Var;
        boolean z10;
        float f10;
        boolean z11 = this.f4230s;
        ArrayList arrayList = this.f4233w;
        if (!z11 || !arrayList.isEmpty()) {
            float f11 = this.f4217c;
            float f12 = this.d;
            float f13 = 1.0f;
            if (this.f4230s) {
                f11 = this.f4219g;
                f12 = this.h;
            } else if (this.f4221j) {
                float f14 = 1.0f - f7;
                f11 = (f11 * f7) + (this.e * f14);
                f12 = (f12 * f7) + (this.f4218f * f14);
            }
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                ArrayList arrayList2 = this.v;
                if (i10 >= arrayList2.size()) {
                    break;
                }
                v0 v0Var2 = (v0) arrayList2.get(i10);
                if (!v0Var2.f4179m) {
                    f10 = f13;
                } else {
                    canvas.save();
                    float f15 = v0Var2.f4189x;
                    float f16 = v0Var2.f4190y;
                    int i11 = (f7 > f13 ? 1 : (f7 == f13 ? 0 : -1));
                    if (i11 != 0) {
                        f10 = f13;
                        if (v0Var2.f4167c == 3) {
                            float f17 = f10 - f7;
                            f15 = (f15 * f7) + (v0Var2.d * f17);
                            f16 = (f16 * f7) + (v0Var2.e * f17);
                        }
                    } else {
                        f10 = f13;
                    }
                    if (i11 != 0 && v0Var2.f4167c == 1) {
                        float f18 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f18, f18, (v0Var2.A / 2.0f) + f11 + f15, (v0Var2.B / 2.0f) + f12 + f16);
                    }
                    if (!z12 && !v0Var2.g(canvas, f15 + f11, f16 + f12)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    canvas.restore();
                }
                i10++;
                f13 = f10;
            }
            float f19 = f13;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((v0) arrayList.get(i12)).f4179m) {
                    float f20 = ((f19 - f7) * 0.5f) + 0.5f;
                    canvas.save();
                    canvas.scale(f20, f20, (v0Var.A / 2.0f) + v0Var.f4189x + f11, (v0Var.B / 2.0f) + v0Var.f4190y + f12);
                    if (!z12 && !((v0) arrayList.get(i12)).g(canvas, v0Var.f4189x + f11, v0Var.f4190y + f12)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    canvas.restore();
                    z12 = z10;
                }
            }
        }
    }

    public final void f(mm mmVar, Canvas canvas, int i10, Integer num) {
        int i11;
        if (!this.f4230s || !this.f4233w.isEmpty()) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.v;
                if (i12 < arrayList.size()) {
                    v0 v0Var = (v0) arrayList.get(i12);
                    if ((num == null || v0Var.f4184r.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(v0Var.f4186t);
                        float dp = AndroidUtilities.dp(140.0f);
                        float dp2 = AndroidUtilities.dp(14.0f);
                        org.telegram.ui.Cells.z zVar = this.f4236z;
                        if (zVar instanceof s1) {
                            i11 = ((s1) zVar).getParentWidth();
                        } else {
                            i11 = AndroidUtilities.displaySize.x;
                        }
                        float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), (i11 - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        float f7 = rectF.top - dp2;
                        float f10 = i10;
                        float f11 = f7 + f10;
                        RectF rectF2 = this.O;
                        rectF2.set(clamp, (f7 - dp) + f10, dp + clamp, f11);
                        float interpolation = ds.h.getInterpolation(this.D);
                        AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                        int i13 = v0Var.V;
                        x0 x0Var = v0Var.f4185s;
                        View view = v0Var.W;
                        if (v0Var.f4172f0 == null && v0Var.f4174g0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (v0Var.f4184r != null && !x0Var.f4205a) {
                                if (x0Var.f4208f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(x0Var.f4208f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, y6.f23297a7, 1.0f);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        v0Var.f4172f0 = imageReceiver;
                                        imageReceiver.setLayerNum(7);
                                        v0Var.f4172f0.onAttachedToWindow();
                                        v0Var.f4172f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        v0Var.f4172f0.setAllowStartLottieAnimation(true);
                                        v0Var.f4172f0.setAllowStartAnimation(true);
                                        v0Var.f4172f0.setAutoRepeat(1);
                                        v0Var.f4172f0.setAllowDecodeSingleFrame(true);
                                        v0Var.f4172f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                                    }
                                } else if (x0Var.f4209g != 0) {
                                    t5 t5Var = new t5(24, i13, x0Var.f4209g);
                                    v0Var.f4174g0 = t5Var;
                                    t5Var.a(view);
                                }
                            }
                        }
                        this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver2 = v0Var.f4172f0;
                            if (imageReceiver2 != null) {
                                imageReceiver2.setImageCoords(rectF2);
                                v0Var.f4172f0.setAlpha(interpolation);
                                v0Var.f4172f0.draw(canvas);
                            } else {
                                t5 t5Var2 = v0Var.f4174g0;
                                if (t5Var2 != null) {
                                    t5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    v0Var.f4174g0.setAlpha((int) (interpolation * 255.0f));
                                    v0Var.f4174g0.draw(canvas);
                                }
                            }
                            mmVar.invalidate();
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
        if (this.f4223l) {
            return (this.f4227p * f7) + ((1.0f - f7) * this.J);
        }
        return this.f4227p;
    }

    public final float j(float f7) {
        if (this.f4222k) {
            return (this.f4228q * f7) + ((1.0f - f7) * this.f4229r);
        }
        return this.f4228q;
    }

    public final v0 l(x0 x0Var) {
        String l4;
        if (x0Var.f4205a) {
            l4 = "stars";
        } else {
            String str = x0Var.f4208f;
            if (str != null) {
                l4 = str;
            } else {
                l4 = Long.toString(x0Var.f4209g);
            }
        }
        return m(l4);
    }

    public final v0 m(String str) {
        boolean z10 = this.f4216b;
        HashMap hashMap = this.f4234x;
        if (z10) {
            v0 v0Var = (v0) hashMap.get(str + "_");
            if (v0Var != null) {
                return v0Var;
            }
        }
        return (v0) hashMap.get(str);
    }

    public final boolean n() {
        if (this.L) {
            if ((!this.f4230s || !this.f4233w.isEmpty()) && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
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
        this.f4226o = 0;
        this.f4228q = 0;
        this.f4224m = 0;
        this.f4227p = 0;
        if (this.f4230s) {
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
            v0 v0Var = (v0) arrayList.get(i13);
            boolean z10 = v0Var.f4165b;
            r6 r6Var = v0Var.G;
            gr grVar = v0Var.F;
            if (z10) {
                v0Var.A = AndroidUtilities.dp(14.0f);
                v0Var.B = AndroidUtilities.dp(14.0f);
            } else if (v0Var.S) {
                v0Var.A = AndroidUtilities.dp(42.0f);
                v0Var.B = AndroidUtilities.dp(26.0f);
                if (v0Var.f4187u) {
                    v0Var.A = (int) (r6Var.d + AndroidUtilities.dp(8.0f) + v0Var.A);
                } else if (grVar != null && v0Var.f4188w > 1) {
                    v0Var.A = org.telegram.messenger.t.D(8.0f, (int) Math.ceil(grVar.f28690m), v0Var.A);
                }
            } else {
                int dp2 = AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (v0Var.D != null) {
                    f10 = 6.0f;
                } else {
                    f10 = 4.0f;
                }
                v0Var.A = AndroidUtilities.dp(f10) + dp2;
                if (v0Var.T != null && v0Var.U.size() > 0) {
                    v0Var.U.size();
                    if (v0Var.U.size() > 1) {
                        i12 = v0Var.U.size() - 1;
                    } else {
                        i12 = 0;
                    }
                    v0Var.A = (int) ((AndroidUtilities.dp(20.0f) * i12 * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + v0Var.A);
                    v0Var.T.f30118o = AndroidUtilities.dp(26.0f);
                } else if (v0Var.f4187u) {
                    v0Var.A = (int) (r6Var.d + AndroidUtilities.dp(8.0f) + v0Var.A);
                } else if (((int) Math.ceil(grVar.f28690m)) > 0) {
                    v0Var.A = org.telegram.messenger.t.D(8.0f, (int) Math.ceil(grVar.f28690m), v0Var.A);
                } else {
                    v0Var.A -= AndroidUtilities.dp(1.0f);
                }
                v0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (v0Var.A + i14 > i10) {
                arrayList2.add(Integer.valueOf(i14));
                i16 = org.telegram.messenger.t.D(4.0f, v0Var.B, i16);
                i17++;
                i14 = 0;
            }
            v0Var.f4189x = i14;
            v0Var.f4190y = i16;
            v0Var.f4191z = i17;
            i14 = org.telegram.messenger.t.D(4.0f, v0Var.A, i14);
            if (i14 > i15) {
                i15 = i14;
            }
            i13++;
        }
        arrayList2.add(Integer.valueOf(i14));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i18 = ((v0) arrayList.get(0)).f4190y;
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((v0) arrayList.get(i20)).f4190y != i18) {
                    int i21 = i20 - 1;
                    int i22 = i10 - (((v0) arrayList.get(i21)).f4189x + ((v0) arrayList.get(i21)).A);
                    while (i19 < i20) {
                        ((v0) arrayList.get(i19)).f4189x += i22;
                        i19++;
                    }
                    i19 = i20;
                }
            }
            int size = arrayList.size() - 1;
            int i23 = i10 - (((v0) arrayList.get(size)).f4189x + ((v0) arrayList.get(size)).A);
            while (i19 <= size) {
                ((v0) arrayList.get(i19)).f4189x += i23;
                i19++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                v0 v0Var2 = (v0) arrayList.get(i24);
                int i25 = v0Var2.f4191z;
                if (i25 >= 0 && i25 < arrayList2.size()) {
                    f7 = ((Integer) arrayList2.get(v0Var2.f4191z)).intValue();
                } else {
                    f7 = 0.0f;
                }
                v0Var2.f4189x = (int) c3.h0.B(i10, f7, 2.0f, v0Var2.f4189x);
            }
        }
        this.f4232u = i14;
        if (i11 != 5 && i11 != 1) {
            this.f4228q = i15;
        } else {
            this.f4228q = i10;
        }
        if (arrayList.size() == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(26.0f);
        }
        this.f4226o = i16 + dp;
        this.f4215a = 0.0f;
    }

    public final void q() {
        int i10 = 0;
        this.G = false;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((v0) arrayList.get(i10)).b();
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
        HashMap hashMap = this.f4234x;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                hashMap.put(((v0) arrayList.get(i10)).f4181o, (v0) arrayList.get(i10));
                i10++;
            } else {
                this.f4220i = !this.f4230s;
                this.f4219g = this.f4217c;
                this.h = this.d;
                this.F = this.f4228q;
                this.I = this.f4227p;
                return;
            }
        }
    }

    public final void s(org.telegram.messenger.MessageObject r20, boolean r21, boolean r22, org.telegram.ui.ActionBar.u6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: bh.y0.s(org.telegram.messenger.MessageObject, boolean, boolean, org.telegram.ui.ActionBar.u6):void");
    }
}
