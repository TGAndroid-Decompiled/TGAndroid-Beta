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
import com.google.android.gms.internal.play_billing.k3;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.r5;
import org.telegram.ui.km;
public final class j1 {
    public static int Z;
    public MessageObject A;
    public g6 B;
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
    public g1 S;
    public boolean T;
    public a1.f U;
    public float f792a;
    public boolean f793b;
    public int f794c;
    public int d;
    public float e;
    public float f795f;
    public float f796g;
    public float h;
    public boolean f797i;
    public boolean f798j;
    public boolean f799k;
    public boolean f800l;
    public int f801m;
    public int f803o;
    public int f804p;
    public int f805q;
    public int f806r;
    public boolean f807s;
    public final float f808t;
    public int f809u;
    public final org.telegram.ui.Cells.z f813z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final e1 f789a0 = new Object();
    public static int f790b0 = 1;
    public static final a4.d f791c0 = new a4.d(2);
    public final ArrayList v = new ArrayList();
    public final ArrayList f810w = new ArrayList();
    public final HashMap f811x = new HashMap();
    public final HashMap f812y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int f802n = UserConfig.selectedAccount;

    public j1(org.telegram.ui.Cells.z zVar) {
        this.f813z = zVar;
        o(this.B);
        this.f808t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
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
            return ((TLRPC.User) tLObject).f20490id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f20343id;
        }
        return 0L;
    }

    public static void o(g6 g6Var) {
        V.setColor(k6.w0(k6.f21279ie, g6Var));
        int w02 = k6.w0(k6.Sh, g6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(w02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        j9 j9Var;
        int i10;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.f812y;
        hashMap.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.f810w;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((g1) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.f811x);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i12 >= arrayList2.size()) {
                break;
            }
            g1 g1Var = (g1) arrayList2.get(i12);
            String str = g1Var.f759o;
            er erVar = g1Var.F;
            g1 g1Var2 = (g1) hashMap.get(str);
            if (g1Var2 != null && g1Var.f743b != g1Var2.f743b) {
                g1Var2 = null;
            }
            if (g1Var2 != null) {
                hashMap.remove(g1Var.f759o);
                int i13 = g1Var.f767x;
                int i14 = g1Var2.f767x;
                if (i13 == i14 && g1Var.f768y == g1Var2.f768y && g1Var.A == g1Var2.A && g1Var.f766w == g1Var2.f766w && g1Var.f760p == g1Var2.f760p && g1Var.T == null && g1Var2.T == null) {
                    g1Var.f745c = 0;
                    i12++;
                } else {
                    g1Var.d = i14;
                    g1Var.e = g1Var2.f768y;
                    g1Var.f749f = g1Var2.A;
                    g1Var.f753i = g1Var2.N;
                    g1Var.f751g = g1Var2.O;
                    g1Var.h = g1Var2.P;
                    g1Var.f745c = 3;
                    int i15 = g1Var.f766w;
                    int i16 = g1Var2.f766w;
                    if (i15 != i16 && erVar != null) {
                        erVar.c(i16, false);
                        erVar.c(g1Var.f766w, true);
                    }
                    j9 j9Var2 = g1Var.T;
                    if (j9Var2 != null || g1Var2.T != null) {
                        if (j9Var2 == null) {
                            g1Var.p(new ArrayList());
                        }
                        if (g1Var2.T == null) {
                            g1Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = g1Var2.U;
                        ArrayList arrayList4 = g1Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i17);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i17);
                                if (tLObject != null && tLObject2 != null && k(tLObject) == k(tLObject2)) {
                                }
                            }
                        }
                        j9 j9Var3 = g1Var.T;
                        if (j9Var3 != null && (j9Var = g1Var2.T) != null) {
                            ValueAnimator valueAnimator = j9Var.f27612f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (j9Var3.f27627w) {
                                    j9Var3.f27627w = false;
                                    j9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.f802n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = j9Var3.f27610b[i18].h;
                                j9Var3.l(i18, j9Var.f27610b[i18].h, i10);
                                i18++;
                            }
                            j9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                j9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            j9Var3.d = true;
                            j9Var3.b(true, false);
                        }
                    }
                }
            } else {
                g1Var.f745c = 1;
            }
            z10 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((g1) arrayList.get(i20)).f756l = ((g1) arrayList.get(i20)).f758n;
                ((g1) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.f797i) {
            float f7 = this.f796g;
            if (f7 != this.f794c || this.h != this.d) {
                this.f798j = true;
                this.e = f7;
                this.f795f = this.h;
                z10 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.f805q) {
            this.f799k = true;
            this.f806r = i21;
            z10 = true;
        }
        int i22 = this.I;
        if (i22 != this.f804p) {
            this.f800l = true;
            this.J = i22;
            return true;
        }
        return z10;
    }

    public final void b(i1 i1Var) {
        int i10 = 0;
        if (i1Var.f785g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(i1Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.f813z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f802n).getReactionsMap().get(i1Var.f784f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(i1Var, imageReceiver);
                return;
            }
        }
        if (!this.M || i1Var.f785g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (i1Var.f(((g1) arrayList.get(i10)).f762r)) {
                    ((g1) arrayList.get(i10)).q();
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
        if (this.f807s || this.f793b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Cells.z zVar = this.f813z;
        if (k3.s(zVar)) {
            y3 -= zVar.getPaddingTop();
            if (zVar instanceof org.telegram.ui.Cells.v0) {
                x10 -= ((org.telegram.ui.Cells.v0) zVar).f23782j0 / 2.0f;
            }
        }
        float f7 = x10 - this.f794c;
        float f10 = y3 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (f7 > ((g1) arrayList.get(i10)).f767x && f7 < ((g1) arrayList.get(i10)).f767x + ((g1) arrayList.get(i10)).A && f10 > ((g1) arrayList.get(i10)).f768y && f10 < ((g1) arrayList.get(i10)).f768y + ((g1) arrayList.get(i10)).B) {
                    this.Q = motionEvent.getX();
                    this.R = y3;
                    this.S = (g1) arrayList.get(i10);
                    a1.f fVar = this.U;
                    if (fVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(fVar);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    a1.f fVar2 = new a1.f(12, this, this.S);
                    this.U = fVar2;
                    AndroidUtilities.runOnUIThread(fVar2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f11 = this.f808t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f11) || Math.abs(y3 - this.R) > f11) {
                this.T = false;
                g1 g1Var = this.S;
                if (g1Var != null) {
                    g1Var.Y.c(false);
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
                TLRPC.ReactionCount reactionCount = this.S.f741a;
                float x11 = motionEvent.getX();
                if (k3.s(zVar)) {
                    ((n4) zVar).e(reactionCount, false, x11, y3);
                }
            }
            this.T = false;
            g1 g1Var2 = this.S;
            if (g1Var2 != null) {
                g1Var2.Y.c(false);
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
        boolean z11 = this.f807s;
        ArrayList arrayList = this.f810w;
        if (!z11 || !arrayList.isEmpty()) {
            float f13 = this.f794c;
            float f14 = this.d;
            if (this.f807s) {
                f13 = this.f796g;
                f14 = this.h;
            } else if (this.f798j) {
                float f15 = 1.0f - f7;
                f13 = (f13 * f7) + (this.e * f15);
                f14 = (f14 * f7) + (this.f795f * f15);
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
                g1 g1Var = (g1) arrayList2.get(i11);
                if (this.C == null && num == null && this.D < 0.5f) {
                    g1Var.c();
                }
                if (!Integer.valueOf(g1Var.f762r.hashCode()).equals(this.C) && (num == null || g1Var.f762r.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f18 = g1Var.f767x;
                    float f19 = g1Var.f768y;
                    int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i12 != 0 && g1Var.f745c == 3) {
                        float f20 = 1.0f - f7;
                        f18 = (f18 * f7) + (g1Var.d * f20);
                        f19 = (f19 * f7) + (g1Var.e * f20);
                    }
                    if (i12 != 0 && g1Var.f745c == 1) {
                        float f21 = (f7 * 0.5f) + 0.5f;
                        canvas2.scale(f21, f21, (g1Var.A / 2.0f) + f16 + f18, (g1Var.B / 2.0f) + f17 + f19);
                        f10 = f7;
                    } else {
                        f10 = 1.0f;
                    }
                    float f22 = f18 + f16;
                    float f23 = f19 + f17;
                    if (g1Var.f745c == 3) {
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
                    g1Var.d(canvas2, f22, f23, f12, f11, z10, this.E, this.D);
                    canvas2.restore();
                }
                i11++;
            }
            while (i10 < arrayList.size()) {
                g1 g1Var2 = (g1) arrayList.get(i10);
                float f24 = 1.0f - f7;
                float f25 = (f24 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f25, f25, (g1Var2.A / 2.0f) + g1Var2.f767x + f16, (g1Var2.B / 2.0f) + g1Var2.f768y + f17);
                ((g1) arrayList.get(i10)).d(canvas2, g1Var2.f767x + f16, g1Var2.f768y + f17, 1.0f, f24, false, this.E, this.D);
                canvas.restore();
                i10++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(Canvas canvas, float f7) {
        g1 g1Var;
        boolean z10;
        float f10;
        boolean z11 = this.f807s;
        ArrayList arrayList = this.f810w;
        if (!z11 || !arrayList.isEmpty()) {
            float f11 = this.f794c;
            float f12 = this.d;
            float f13 = 1.0f;
            if (this.f807s) {
                f11 = this.f796g;
                f12 = this.h;
            } else if (this.f798j) {
                float f14 = 1.0f - f7;
                f11 = (f11 * f7) + (this.e * f14);
                f12 = (f12 * f7) + (this.f795f * f14);
            }
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                ArrayList arrayList2 = this.v;
                if (i10 >= arrayList2.size()) {
                    break;
                }
                g1 g1Var2 = (g1) arrayList2.get(i10);
                if (!g1Var2.f757m) {
                    f10 = f13;
                } else {
                    canvas.save();
                    float f15 = g1Var2.f767x;
                    float f16 = g1Var2.f768y;
                    int i11 = (f7 > f13 ? 1 : (f7 == f13 ? 0 : -1));
                    if (i11 != 0) {
                        f10 = f13;
                        if (g1Var2.f745c == 3) {
                            float f17 = f10 - f7;
                            f15 = (f15 * f7) + (g1Var2.d * f17);
                            f16 = (f16 * f7) + (g1Var2.e * f17);
                        }
                    } else {
                        f10 = f13;
                    }
                    if (i11 != 0 && g1Var2.f745c == 1) {
                        float f18 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f18, f18, (g1Var2.A / 2.0f) + f11 + f15, (g1Var2.B / 2.0f) + f12 + f16);
                    }
                    if (!z12 && !g1Var2.g(canvas, f15 + f11, f16 + f12)) {
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
                if (((g1) arrayList.get(i12)).f757m) {
                    float f20 = ((f19 - f7) * 0.5f) + 0.5f;
                    canvas.save();
                    canvas.scale(f20, f20, (g1Var.A / 2.0f) + g1Var.f767x + f11, (g1Var.B / 2.0f) + g1Var.f768y + f12);
                    if (!z12 && !((g1) arrayList.get(i12)).g(canvas, g1Var.f767x + f11, g1Var.f768y + f12)) {
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

    public final void f(km kmVar, Canvas canvas, int i10, Integer num) {
        int i11;
        if (!this.f807s || !this.f810w.isEmpty()) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.v;
                if (i12 < arrayList.size()) {
                    g1 g1Var = (g1) arrayList.get(i12);
                    if ((num == null || g1Var.f762r.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(g1Var.f764t);
                        float dp = AndroidUtilities.dp(140.0f);
                        float dp2 = AndroidUtilities.dp(14.0f);
                        org.telegram.ui.Cells.z zVar = this.f813z;
                        if (zVar instanceof t1) {
                            i11 = ((t1) zVar).getParentWidth();
                        } else {
                            i11 = AndroidUtilities.displaySize.x;
                        }
                        float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), (i11 - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        float f7 = rectF.top - dp2;
                        float f10 = i10;
                        float f11 = f7 + f10;
                        RectF rectF2 = this.O;
                        rectF2.set(clamp, (f7 - dp) + f10, dp + clamp, f11);
                        float interpolation = bs.h.getInterpolation(this.D);
                        AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                        int i13 = g1Var.V;
                        i1 i1Var = g1Var.f763s;
                        View view = g1Var.W;
                        if (g1Var.f750f0 == null && g1Var.f752g0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (g1Var.f762r != null && !i1Var.f781a) {
                                if (i1Var.f784f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(i1Var.f784f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, k6.f21125a7, 1.0f);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        g1Var.f750f0 = imageReceiver;
                                        imageReceiver.setLayerNum(7);
                                        g1Var.f750f0.onAttachedToWindow();
                                        g1Var.f750f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        g1Var.f750f0.setAllowStartLottieAnimation(true);
                                        g1Var.f750f0.setAllowStartAnimation(true);
                                        g1Var.f750f0.setAutoRepeat(1);
                                        g1Var.f750f0.setAllowDecodeSingleFrame(true);
                                        g1Var.f750f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                                    }
                                } else if (i1Var.f785g != 0) {
                                    r5 r5Var = new r5(24, i13, i1Var.f785g);
                                    g1Var.f752g0 = r5Var;
                                    r5Var.a(view);
                                }
                            }
                        }
                        this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver2 = g1Var.f750f0;
                            if (imageReceiver2 != null) {
                                imageReceiver2.setImageCoords(rectF2);
                                g1Var.f750f0.setAlpha(interpolation);
                                g1Var.f750f0.draw(canvas);
                            } else {
                                r5 r5Var2 = g1Var.f752g0;
                                if (r5Var2 != null) {
                                    r5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    g1Var.f752g0.setAlpha((int) (interpolation * 255.0f));
                                    g1Var.f752g0.draw(canvas);
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

    public final float i(float f7) {
        if (this.f800l) {
            return (this.f804p * f7) + ((1.0f - f7) * this.J);
        }
        return this.f804p;
    }

    public final float j(float f7) {
        if (this.f799k) {
            return (this.f805q * f7) + ((1.0f - f7) * this.f806r);
        }
        return this.f805q;
    }

    public final g1 l(i1 i1Var) {
        String l4;
        if (i1Var.f781a) {
            l4 = "stars";
        } else {
            String str = i1Var.f784f;
            if (str != null) {
                l4 = str;
            } else {
                l4 = Long.toString(i1Var.f785g);
            }
        }
        return m(l4);
    }

    public final g1 m(String str) {
        boolean z10 = this.f793b;
        HashMap hashMap = this.f811x;
        if (z10) {
            g1 g1Var = (g1) hashMap.get(str + "_");
            if (g1Var != null) {
                return g1Var;
            }
        }
        return (g1) hashMap.get(str);
    }

    public final boolean n() {
        if (this.L) {
            if ((!this.f807s || !this.f810w.isEmpty()) && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
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
        this.f803o = 0;
        this.f805q = 0;
        this.f801m = 0;
        this.f804p = 0;
        if (this.f807s) {
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
            g1 g1Var = (g1) arrayList.get(i13);
            boolean z10 = g1Var.f743b;
            p6 p6Var = g1Var.G;
            er erVar = g1Var.F;
            if (z10) {
                g1Var.A = AndroidUtilities.dp(14.0f);
                g1Var.B = AndroidUtilities.dp(14.0f);
            } else if (g1Var.S) {
                g1Var.A = AndroidUtilities.dp(42.0f);
                g1Var.B = AndroidUtilities.dp(26.0f);
                if (g1Var.f765u) {
                    g1Var.A = (int) (p6Var.d + AndroidUtilities.dp(8.0f) + g1Var.A);
                } else if (erVar != null && g1Var.f766w > 1) {
                    g1Var.A = org.telegram.messenger.v0.C(8.0f, (int) Math.ceil(erVar.f26040m), g1Var.A);
                }
            } else {
                int dp2 = AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (g1Var.D != null) {
                    f10 = 6.0f;
                } else {
                    f10 = 4.0f;
                }
                g1Var.A = AndroidUtilities.dp(f10) + dp2;
                if (g1Var.T != null && g1Var.U.size() > 0) {
                    g1Var.U.size();
                    if (g1Var.U.size() > 1) {
                        i12 = g1Var.U.size() - 1;
                    } else {
                        i12 = 0;
                    }
                    g1Var.A = (int) ((AndroidUtilities.dp(20.0f) * i12 * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + g1Var.A);
                    g1Var.T.f27620o = AndroidUtilities.dp(26.0f);
                } else if (g1Var.f765u) {
                    g1Var.A = (int) (p6Var.d + AndroidUtilities.dp(8.0f) + g1Var.A);
                } else if (((int) Math.ceil(erVar.f26040m)) > 0) {
                    g1Var.A = org.telegram.messenger.v0.C(8.0f, (int) Math.ceil(erVar.f26040m), g1Var.A);
                } else {
                    g1Var.A -= AndroidUtilities.dp(1.0f);
                }
                g1Var.B = AndroidUtilities.dp(26.0f);
            }
            if (g1Var.A + i14 > i10) {
                arrayList2.add(Integer.valueOf(i14));
                i16 = org.telegram.messenger.v0.C(4.0f, g1Var.B, i16);
                i17++;
                i14 = 0;
            }
            g1Var.f767x = i14;
            g1Var.f768y = i16;
            g1Var.f769z = i17;
            i14 = org.telegram.messenger.v0.C(4.0f, g1Var.A, i14);
            if (i14 > i15) {
                i15 = i14;
            }
            i13++;
        }
        arrayList2.add(Integer.valueOf(i14));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i18 = ((g1) arrayList.get(0)).f768y;
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((g1) arrayList.get(i20)).f768y != i18) {
                    int i21 = i20 - 1;
                    int i22 = i10 - (((g1) arrayList.get(i21)).f767x + ((g1) arrayList.get(i21)).A);
                    while (i19 < i20) {
                        ((g1) arrayList.get(i19)).f767x += i22;
                        i19++;
                    }
                    i19 = i20;
                }
            }
            int size = arrayList.size() - 1;
            int i23 = i10 - (((g1) arrayList.get(size)).f767x + ((g1) arrayList.get(size)).A);
            while (i19 <= size) {
                ((g1) arrayList.get(i19)).f767x += i23;
                i19++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                g1 g1Var2 = (g1) arrayList.get(i24);
                int i25 = g1Var2.f769z;
                if (i25 >= 0 && i25 < arrayList2.size()) {
                    f7 = ((Integer) arrayList2.get(g1Var2.f769z)).intValue();
                } else {
                    f7 = 0.0f;
                }
                g1Var2.f767x = (int) k3.z(i10, f7, 2.0f, g1Var2.f767x);
            }
        }
        this.f809u = i14;
        if (i11 != 5 && i11 != 1) {
            this.f805q = i15;
        } else {
            this.f805q = i10;
        }
        if (arrayList.size() == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(26.0f);
        }
        this.f803o = i16 + dp;
        this.f792a = 0.0f;
    }

    public final void q() {
        int i10 = 0;
        this.G = false;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((g1) arrayList.get(i10)).b();
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
        HashMap hashMap = this.f811x;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                hashMap.put(((g1) arrayList.get(i10)).f759o, (g1) arrayList.get(i10));
                i10++;
            } else {
                this.f797i = !this.f807s;
                this.f796g = this.f794c;
                this.h = this.d;
                this.F = this.f805q;
                this.I = this.f804p;
                return;
            }
        }
    }

    public final void s(org.telegram.messenger.MessageObject r20, boolean r21, boolean r22, org.telegram.ui.ActionBar.g6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: ah.j1.s(org.telegram.messenger.MessageObject, boolean, boolean, org.telegram.ui.ActionBar.g6):void");
    }
}
