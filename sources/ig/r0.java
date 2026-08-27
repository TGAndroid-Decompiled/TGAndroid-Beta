package ig;

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
import hh.m5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.k5;
import org.telegram.ui.jm;

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
    public m5 U;

    public float f11418a;

    public boolean f11419b;

    public int f11420c;
    public int d;

    public float f11421e;

    public float f11422f;

    public float f11423g;
    public float h;

    public boolean f11424i;

    public boolean f11425j;

    public boolean f11426k;

    public boolean f11427l;

    public int f11428m;

    public int f11430o;

    public int f11431p;

    public int f11432q;

    public int f11433r;

    public boolean f11434s;

    public final float f11435t;

    public int f11436u;

    public final org.telegram.ui.Cells.a0 f11440z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);

    public static final n0 f11415a0 = new n0();

    public static int f11416b0 = 1;

    public static final a5.f f11417c0 = new a5.f(21);
    public final ArrayList v = new ArrayList();

    public final ArrayList f11437w = new ArrayList();

    public final HashMap f11438x = new HashMap();

    public final HashMap f11439y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();

    public final int f11429n = UserConfig.selectedAccount;

    public r0(org.telegram.ui.Cells.a0 a0Var) {
        this.f11440z = a0Var;
        o(this.B);
        this.f11435t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon);
        }
        return (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        path.rewind();
        float f10 = rectF.left;
        rectF2.set(f10, rectF.top, AndroidUtilities.dp(12.0f) + f10, rectF.top + AndroidUtilities.dp(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - AndroidUtilities.dp(12.0f), rectF.left + AndroidUtilities.dp(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        float f11 = rectF.height() > ((float) AndroidUtilities.dp(26.0f)) ? 1.4f : 0.0f;
        float fDpf2 = rectF.right - AndroidUtilities.dpf2(9.09f);
        float fDpf3 = fDpf2 - AndroidUtilities.dpf2(0.056f);
        float fDpf4 = AndroidUtilities.dpf2(1.22f) + fDpf2;
        float fDpf5 = AndroidUtilities.dpf2(3.07f) + fDpf2;
        float fDpf6 = AndroidUtilities.dpf2(2.406f) + fDpf2;
        float fDpf7 = AndroidUtilities.dpf2(8.27f + f11) + fDpf2;
        float fDpf8 = AndroidUtilities.dpf2(8.923f + f11) + fDpf2;
        float fDpf9 = AndroidUtilities.dpf2(1.753f) + rectF.top;
        float fDpf10 = rectF.bottom - AndroidUtilities.dpf2(1.753f);
        float fDpf11 = AndroidUtilities.dpf2(0.663f) + rectF.top;
        float fDpf12 = rectF.bottom - AndroidUtilities.dpf2(0.663f);
        float f12 = 10.263f + f11;
        float fDpf13 = AndroidUtilities.dpf2(f12) + rectF.top;
        float fDpf14 = rectF.bottom - AndroidUtilities.dpf2(f12);
        float f13 = f11 + 11.333f;
        float fDpf15 = AndroidUtilities.dpf2(f13) + rectF.top;
        float fDpf16 = rectF.bottom - AndroidUtilities.dpf2(f13);
        path.lineTo(fDpf3, rectF.bottom);
        path.cubicTo(fDpf4, rectF.bottom, fDpf6, fDpf12, fDpf5, fDpf10);
        path.lineTo(fDpf7, fDpf14);
        path.cubicTo(fDpf8, fDpf16, fDpf8, fDpf15, fDpf7, fDpf13);
        path.lineTo(fDpf5, fDpf9);
        float f14 = rectF.top;
        path.cubicTo(fDpf6, fDpf11, fDpf4, f14, fDpf3, f14);
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

    public static void o(c6 c6Var) {
        V.setColor(g6.v0(g6.f23152ie, c6Var));
        int iV0 = g6.v0(g6.Sh, c6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(iV0);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        a9 a9Var;
        a9 a9Var2;
        ValueAnimator valueAnimator;
        TLObject[] tLObjectArr;
        int i10;
        int i11;
        int i12;
        if (this.A == null) {
            return false;
        }
        HashMap map = this.f11439y;
        map.clear();
        int i13 = 0;
        while (true) {
            arrayList = this.f11437w;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((o0) arrayList.get(i13)).b();
            i13++;
        }
        arrayList.clear();
        map.putAll(this.f11438x);
        int i14 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i14 >= arrayList2.size()) {
                break;
            }
            o0 o0Var = (o0) arrayList2.get(i14);
            String str = o0Var.f11396o;
            jq jqVar = o0Var.F;
            o0 o0Var2 = (o0) map.get(str);
            if (o0Var2 != null && o0Var.f11379b != o0Var2.f11379b) {
                o0Var2 = null;
            }
            if (o0Var2 != null) {
                map.remove(o0Var.f11396o);
                int i15 = o0Var.f11404x;
                int i16 = o0Var2.f11404x;
                if (i15 == i16 && o0Var.f11405y == o0Var2.f11405y && o0Var.A == o0Var2.A && o0Var.f11403w == o0Var2.f11403w && o0Var.f11397p == o0Var2.f11397p && o0Var.T == null && o0Var2.T == null) {
                    o0Var.f11381c = 0;
                } else {
                    o0Var.d = i16;
                    o0Var.f11384e = o0Var2.f11405y;
                    o0Var.f11386f = o0Var2.A;
                    o0Var.f11390i = o0Var2.N;
                    o0Var.f11388g = o0Var2.O;
                    o0Var.h = o0Var2.P;
                    o0Var.f11381c = 3;
                    int i17 = o0Var.f11403w;
                    int i18 = o0Var2.f11403w;
                    if (i17 != i18 && jqVar != null) {
                        jqVar.c(i18, false);
                        jqVar.c(o0Var.f11403w, true);
                    }
                    a9 a9Var3 = o0Var.T;
                    if (a9Var3 != null || o0Var2.T != null) {
                        if (a9Var3 == null) {
                            o0Var.p(new ArrayList());
                        }
                        if (o0Var2.T == null) {
                            o0Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = o0Var2.U;
                        ArrayList arrayList4 = o0Var.U;
                        if (arrayList3 == null || arrayList4 == null || arrayList3.size() != arrayList4.size()) {
                            a9Var = o0Var.T;
                            if (a9Var != null && (a9Var2 = o0Var2.T) != null) {
                                valueAnimator = a9Var2.f26666f;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    if (a9Var.f26681w) {
                                        a9Var.f26681w = false;
                                        a9Var.n();
                                    }
                                }
                                tLObjectArr = new TLObject[3];
                                i10 = 0;
                                while (true) {
                                    i11 = this.f11429n;
                                    if (i10 < 3) {
                                        break;
                                    }
                                    tLObjectArr[i10] = a9Var.f26663b[i10].h;
                                    a9Var.l(i10, a9Var2.f26663b[i10].h, i11);
                                    i10++;
                                }
                                a9Var.b(false, true);
                                for (i12 = 0; i12 < 3; i12++) {
                                    a9Var.l(i12, tLObjectArr[i12], i11);
                                }
                                a9Var.d = true;
                                a9Var.b(true, false);
                            }
                        } else {
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList3.size()) {
                                    TLObject tLObject = (TLObject) arrayList3.get(i19);
                                    TLObject tLObject2 = (TLObject) arrayList4.get(i19);
                                    if (tLObject == null || tLObject2 == null || k(tLObject) != k(tLObject2)) {
                                        a9Var = o0Var.T;
                                        if (a9Var != null) {
                                            valueAnimator = a9Var2.f26666f;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                                if (a9Var.f26681w) {
                                                    a9Var.f26681w = false;
                                                    a9Var.n();
                                                }
                                            }
                                            tLObjectArr = new TLObject[3];
                                            i10 = 0;
                                            while (true) {
                                                i11 = this.f11429n;
                                                if (i10 < 3) {
                                                    break;
                                                    break;
                                                }
                                                tLObjectArr[i10] = a9Var.f26663b[i10].h;
                                                a9Var.l(i10, a9Var2.f26663b[i10].h, i11);
                                                i10++;
                                            }
                                            a9Var.b(false, true);
                                            while (i12 < 3) {
                                                a9Var.l(i12, tLObjectArr[i12], i11);
                                            }
                                            a9Var.d = true;
                                            a9Var.b(true, false);
                                        }
                                    } else {
                                        i19++;
                                    }
                                }
                            }
                        }
                    }
                }
                i14++;
            } else {
                o0Var.f11381c = 1;
            }
            z10 = true;
            i14++;
        }
        if (!map.isEmpty()) {
            arrayList.addAll(map.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((o0) arrayList.get(i20)).f11393l = ((o0) arrayList.get(i20)).f11395n;
                ((o0) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.f11424i) {
            float f10 = this.f11423g;
            if (f10 != this.f11420c || this.h != this.d) {
                this.f11425j = true;
                this.f11421e = f10;
                this.f11422f = this.h;
                z10 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.f11432q) {
            this.f11426k = true;
            this.f11433r = i21;
            z10 = true;
        }
        int i22 = this.I;
        if (i22 == this.f11431p) {
            return z10;
        }
        this.f11427l = true;
        this.J = i22;
        return true;
    }

    public final void b(q0 q0Var) {
        int i10 = 0;
        if (q0Var.f11413g == 0) {
            HashMap map = this.H;
            if (map.get(q0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.f11440z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f11429n).getReactionsMap().get(q0Var.f11412f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                map.put(q0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || q0Var.f11413g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (q0Var.f(((o0) arrayList.get(i10)).f11399r)) {
                ((o0) arrayList.get(i10)).q();
                return;
            }
            i10++;
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        MessageObject messageObject;
        TLRPC.Message message;
        if (this.f11434s || this.f11419b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.f11440z;
        if (com.google.android.recaptcha.internal.a.u(a0Var)) {
            y10 -= a0Var.getPaddingTop();
            if (a0Var instanceof v0) {
                x8 -= ((v0) a0Var).f25743f0 / 2.0f;
            }
        }
        float f10 = x8 - this.f11420c;
        float f11 = y10 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (f10 > ((o0) arrayList.get(i10)).f11404x && f10 < ((o0) arrayList.get(i10)).f11404x + ((o0) arrayList.get(i10)).A && f11 > ((o0) arrayList.get(i10)).f11405y && f11 < ((o0) arrayList.get(i10)).f11405y + ((o0) arrayList.get(i10)).B) {
                    this.Q = motionEvent.getX();
                    this.R = y10;
                    this.S = (o0) arrayList.get(i10);
                    m5 m5Var = this.U;
                    if (m5Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(m5Var);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    m5 m5Var2 = new m5(12, this, this.S);
                    this.U = m5Var2;
                    AndroidUtilities.runOnUIThread(m5Var2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                    break;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f12 = this.f11435t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f12) || Math.abs(y10 - this.R) > f12) {
                this.T = false;
                o0 o0Var = this.S;
                if (o0Var != null) {
                    o0Var.Y.c(false);
                }
                this.S = null;
                m5 m5Var3 = this.U;
                if (m5Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(m5Var3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            m5 m5Var4 = this.U;
            if (m5Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(m5Var4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.f11377a;
                float x10 = motionEvent.getX();
                if (com.google.android.recaptcha.internal.a.u(a0Var)) {
                    ((l4) a0Var).f(reactionCount, false, x10, y10);
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
        Canvas canvas2 = canvas;
        boolean z10 = this.f11434s;
        ArrayList arrayList = this.f11437w;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f12 = this.f11420c;
        float f13 = this.d;
        if (this.f11434s) {
            f12 = this.f11423g;
            f13 = this.h;
        } else if (this.f11425j) {
            float f14 = 1.0f - f10;
            f12 = (f12 * f10) + (this.f11421e * f14);
            f13 = (f13 * f10) + (this.f11422f * f14);
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
            if (!Integer.valueOf(o0Var.f11399r.hashCode()).equals(this.C) && (num == null || o0Var.f11399r.hashCode() == num.intValue())) {
                canvas2.save();
                float f17 = o0Var.f11404x;
                float f18 = o0Var.f11405y;
                if (f10 != 1.0f && o0Var.f11381c == 3) {
                    float f19 = 1.0f - f10;
                    f17 = (f17 * f10) + (o0Var.d * f19);
                    f18 = (f18 * f10) + (o0Var.f11384e * f19);
                }
                if (f10 == 1.0f || o0Var.f11381c != 1) {
                    f11 = 1.0f;
                } else {
                    float f20 = (f10 * 0.5f) + 0.5f;
                    canvas2.scale(f20, f20, (o0Var.A / 2.0f) + f15 + f17, (o0Var.B / 2.0f) + f16 + f18);
                    f11 = f10;
                }
                o0Var.d(canvas2, f17 + f15, f18 + f16, o0Var.f11381c == 3 ? f10 : 1.0f, f11, num != null, this.E, this.D);
                canvas2.restore();
            }
            i11++;
        }
        while (i10 < arrayList.size()) {
            o0 o0Var2 = (o0) arrayList.get(i10);
            float f21 = 1.0f - f10;
            float f22 = (f21 * 0.5f) + 0.5f;
            canvas2.save();
            canvas2.scale(f22, f22, (o0Var2.A / 2.0f) + o0Var2.f11404x + f15, (o0Var2.B / 2.0f) + o0Var2.f11405y + f16);
            ((o0) arrayList.get(i10)).d(canvas2, o0Var2.f11404x + f15, o0Var2.f11405y + f16, 1.0f, f21, false, this.E, this.D);
            canvas.restore();
            i10++;
            canvas2 = canvas;
        }
    }

    public final void e(Canvas canvas, float f10) {
        boolean z10 = this.f11434s;
        ArrayList arrayList = this.f11437w;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f11 = this.f11420c;
        float f12 = this.d;
        float f13 = 1.0f;
        if (this.f11434s) {
            f11 = this.f11423g;
            f12 = this.h;
        } else if (this.f11425j) {
            float f14 = 1.0f - f10;
            f11 = (f11 * f10) + (this.f11421e * f14);
            f12 = (f12 * f10) + (this.f11422f * f14);
        }
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i10 >= arrayList2.size()) {
                break;
            }
            o0 o0Var = (o0) arrayList2.get(i10);
            if (o0Var.f11394m) {
                canvas.save();
                float f15 = o0Var.f11404x;
                float f16 = o0Var.f11405y;
                if (f10 != f13 && o0Var.f11381c == 3) {
                    float f17 = 1.0f - f10;
                    f15 = (f15 * f10) + (o0Var.d * f17);
                    f16 = (f16 * f10) + (o0Var.f11384e * f17);
                }
                if (f10 != f13 && o0Var.f11381c == 1) {
                    float f18 = (f10 * 0.5f) + 0.5f;
                    canvas.scale(f18, f18, (o0Var.A / 2.0f) + f11 + f15, (o0Var.B / 2.0f) + f12 + f16);
                }
                z11 = z11 || o0Var.g(canvas, f15 + f11, f16 + f12);
                canvas.restore();
            }
            i10++;
            f13 = 1.0f;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            o0 o0Var2 = (o0) arrayList.get(i11);
            if (o0Var2.f11394m) {
                float f19 = ((1.0f - f10) * 0.5f) + 0.5f;
                canvas.save();
                canvas.scale(f19, f19, (o0Var2.A / 2.0f) + o0Var2.f11404x + f11, (o0Var2.B / 2.0f) + o0Var2.f11405y + f12);
                boolean z12 = z11 || ((o0) arrayList.get(i11)).g(canvas, ((float) o0Var2.f11404x) + f11, ((float) o0Var2.f11405y) + f12);
                canvas.restore();
                z11 = z12;
            }
        }
    }

    public final void f(jm jmVar, Canvas canvas, int i10, Integer num) {
        if (this.f11434s && this.f11437w.isEmpty()) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i11 >= arrayList.size()) {
                return;
            }
            o0 o0Var = (o0) arrayList.get(i11);
            if ((num == null || o0Var.f11399r.hashCode() == num.intValue()) && num != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(o0Var.f11401t);
                float fDp = AndroidUtilities.dp(140.0f);
                float fDp2 = AndroidUtilities.dp(14.0f);
                org.telegram.ui.Cells.a0 a0Var = this.f11440z;
                float fClamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), ((a0Var instanceof s1 ? ((s1) a0Var).getParentWidth() : AndroidUtilities.displaySize.x) - fDp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                float f10 = rectF.top - fDp2;
                float f11 = i10;
                float f12 = f10 + f11;
                RectF rectF2 = this.O;
                rectF2.set(fClamp, (f10 - fDp) + f11, fDp + fClamp, f12);
                float interpolation = er.h.getInterpolation(this.D);
                AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                int i12 = o0Var.V;
                q0 q0Var = o0Var.f11400s;
                View view = o0Var.W;
                if (o0Var.f11387f0 == null && o0Var.f11389g0 == null) {
                    if (view != null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    if (o0Var.f11399r != null && !q0Var.f11408a) {
                        if (q0Var.f11412f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i12).getReactionsMap().get(q0Var.f11412f);
                            if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, g6.f22999a7, 1.0f);
                                ImageReceiver imageReceiver = new ImageReceiver(view);
                                o0Var.f11387f0 = imageReceiver;
                                imageReceiver.setLayerNum(7);
                                o0Var.f11387f0.onAttachedToWindow();
                                o0Var.f11387f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                o0Var.f11387f0.setAllowStartLottieAnimation(true);
                                o0Var.f11387f0.setAllowStartAnimation(true);
                                o0Var.f11387f0.setAutoRepeat(1);
                                o0Var.f11387f0.setAllowDecodeSingleFrame(true);
                                o0Var.f11387f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                            }
                        } else if (q0Var.f11413g != 0) {
                            k5 k5Var = new k5(24, i12, q0Var.f11413g);
                            o0Var.f11389g0 = k5Var;
                            k5Var.a(view);
                        }
                    }
                }
                this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (interpolation > 0.0f) {
                    ImageReceiver imageReceiver2 = o0Var.f11387f0;
                    if (imageReceiver2 != null) {
                        imageReceiver2.setImageCoords(rectF2);
                        o0Var.f11387f0.setAlpha(interpolation);
                        o0Var.f11387f0.draw(canvas);
                    } else {
                        k5 k5Var2 = o0Var.f11389g0;
                        if (k5Var2 != null) {
                            k5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            o0Var.f11389g0.setAlpha((int) (interpolation * 255.0f));
                            o0Var.f11389g0.draw(canvas);
                        }
                    }
                    jmVar.invalidate();
                }
            }
            i11++;
        }
    }

    public final float i(float f10) {
        if (!this.f11427l) {
            return this.f11431p;
        }
        return (this.f11431p * f10) + ((1.0f - f10) * this.J);
    }

    public final float j(float f10) {
        if (!this.f11426k) {
            return this.f11432q;
        }
        return (this.f11432q * f10) + ((1.0f - f10) * this.f11433r);
    }

    public final o0 l(q0 q0Var) {
        String string;
        if (q0Var.f11408a) {
            string = "stars";
        } else {
            String str = q0Var.f11412f;
            string = str != null ? str : Long.toString(q0Var.f11413g);
        }
        return m(string);
    }

    public final o0 m(String str) {
        boolean z10 = this.f11419b;
        HashMap map = this.f11438x;
        if (z10) {
            o0 o0Var = (o0) map.get(str + "_");
            if (o0Var != null) {
                return o0Var;
            }
        }
        return (o0) map.get(str);
    }

    public final boolean n() {
        if (this.L) {
            return !(this.f11434s && this.f11437w.isEmpty()) && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072);
        }
        return false;
    }

    public final void p(int i10, int i11) {
        ArrayList arrayList;
        this.f11430o = 0;
        this.f11432q = 0;
        this.f11428m = 0;
        this.f11431p = 0;
        if (this.f11434s) {
            return;
        }
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        int i12 = 0;
        int iC = 0;
        int i13 = 0;
        int iC2 = 0;
        int i14 = 0;
        while (true) {
            arrayList = this.v;
            if (i12 >= arrayList.size()) {
                break;
            }
            o0 o0Var = (o0) arrayList.get(i12);
            boolean z10 = o0Var.f11379b;
            i6 i6Var = o0Var.G;
            jq jqVar = o0Var.F;
            if (z10) {
                o0Var.A = AndroidUtilities.dp(14.0f);
                o0Var.B = AndroidUtilities.dp(14.0f);
            } else if (o0Var.S) {
                o0Var.A = AndroidUtilities.dp(42.0f);
                o0Var.B = AndroidUtilities.dp(26.0f);
                if (o0Var.f11402u) {
                    o0Var.A = (int) (i6Var.d + AndroidUtilities.dp(8.0f) + o0Var.A);
                } else if (jqVar != null && o0Var.f11403w > 1) {
                    o0Var.A = y1.C(8.0f, (int) Math.ceil(jqVar.f29785m), o0Var.A);
                }
            } else {
                o0Var.A = AndroidUtilities.dp(o0Var.D != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (o0Var.T != null && o0Var.U.size() > 0) {
                    o0Var.U.size();
                    o0Var.A = (int) ((AndroidUtilities.dp(20.0f) * (o0Var.U.size() > 1 ? o0Var.U.size() - 1 : 0) * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + o0Var.A);
                    o0Var.T.f26674o = AndroidUtilities.dp(26.0f);
                } else if (o0Var.f11402u) {
                    o0Var.A = (int) (i6Var.d + AndroidUtilities.dp(8.0f) + o0Var.A);
                } else if (((int) Math.ceil(jqVar.f29785m)) > 0) {
                    o0Var.A = y1.C(8.0f, (int) Math.ceil(jqVar.f29785m), o0Var.A);
                } else {
                    o0Var.A -= AndroidUtilities.dp(1.0f);
                }
                o0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (o0Var.A + iC > i10) {
                arrayList2.add(Integer.valueOf(iC));
                iC2 = y1.C(4.0f, o0Var.B, iC2);
                i14++;
                iC = 0;
            }
            o0Var.f11404x = iC;
            o0Var.f11405y = iC2;
            o0Var.f11406z = i14;
            iC = y1.C(4.0f, o0Var.A, iC);
            if (iC > i13) {
                i13 = iC;
            }
            i12++;
        }
        arrayList2.add(Integer.valueOf(iC));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i15 = ((o0) arrayList.get(0)).f11405y;
            int i16 = 0;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (((o0) arrayList.get(i17)).f11405y != i15) {
                    int i18 = i17 - 1;
                    int i19 = i10 - (((o0) arrayList.get(i18)).f11404x + ((o0) arrayList.get(i18)).A);
                    while (i16 < i17) {
                        ((o0) arrayList.get(i16)).f11404x += i19;
                        i16++;
                    }
                    i16 = i17;
                }
            }
            int size = arrayList.size() - 1;
            int i20 = i10 - (((o0) arrayList.get(size)).f11404x + ((o0) arrayList.get(size)).A);
            while (i16 <= size) {
                ((o0) arrayList.get(i16)).f11404x += i20;
                i16++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                o0 o0Var2 = (o0) arrayList.get(i21);
                int i22 = o0Var2.f11406z;
                o0Var2.f11404x = (int) com.google.android.recaptcha.internal.a.A(i10, (i22 < 0 || i22 >= arrayList2.size()) ? 0.0f : ((Integer) arrayList2.get(o0Var2.f11406z)).intValue(), 2.0f, o0Var2.f11404x);
            }
        }
        this.f11436u = iC;
        if (i11 == 5 || i11 == 1) {
            this.f11432q = i10;
        } else {
            this.f11432q = i13;
        }
        this.f11430o = iC2 + (arrayList.size() == 0 ? 0 : AndroidUtilities.dp(26.0f));
        this.f11418a = 0.0f;
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
        HashMap map = this.H;
        if (!map.isEmpty()) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).onDetachedFromWindow();
            }
        }
        map.clear();
    }

    public final void r() {
        HashMap map = this.f11438x;
        map.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                this.f11424i = !this.f11434s;
                this.f11423g = this.f11420c;
                this.h = this.d;
                this.F = this.f11432q;
                this.I = this.f11431p;
                return;
            }
            map.put(((o0) arrayList.get(i10)).f11396o, (o0) arrayList.get(i10));
            i10++;
        }
    }

    public final void s(MessageObject messageObject, boolean z10, boolean z11, c6 c6Var) {
        boolean z12;
        TLRPC.ReactionCount tL_reactionCount;
        o0 o0Var;
        int i10;
        int i11;
        r0 r0Var = this;
        boolean z13 = z10;
        boolean z14 = z11;
        r0Var.B = c6Var;
        r0Var.f11419b = z13;
        r0Var.M = z14;
        r0Var.A = messageObject;
        ArrayList arrayList = r0Var.v;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ?? r10 = 0;
        r0Var.K = false;
        r0Var.L = false;
        arrayList.clear();
        if (messageObject != null) {
            long dialogId = messageObject.getDialogId();
            n0 n0Var = f11415a0;
            n0Var.f11375a = dialogId;
            TLRPC.TL_messageReactions tL_messageReactions = messageObject.messageOwner.reactions;
            if (tL_messageReactions == null || tL_messageReactions.results == null) {
                break;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < messageObject.messageOwner.reactions.results.size(); i13++) {
                i12 += messageObject.messageOwner.reactions.results.get(i13).count;
            }
            int i14 = r0Var.f11429n;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(-messageObject.getDialogId());
            if (z13 || messageObject.messageOwner.reactions.results.isEmpty() || chatFull == null || !chatFull.paid_reactions_available) {
                z12 = false;
            } else {
                boolean z15 = false;
                for (int i15 = 0; i15 < messageObject.messageOwner.reactions.results.size(); i15++) {
                    TLRPC.Reaction reaction = messageObject.messageOwner.reactions.results.get(i15).reaction;
                    if (reaction instanceof TLRPC.TL_reactionPaid) {
                        z15 = true;
                    }
                    if (reaction instanceof TLRPC.TL_reactionEmoji) {
                        String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                        TextUtils.equals("👍", str);
                        TextUtils.equals("👎", str);
                    }
                }
                if (z15) {
                    z12 = false;
                } else {
                    z12 = true;
                }
            }
            ArrayList arrayList3 = new ArrayList();
            if (z12) {
                arrayList3.add(new TLRPC.TL_reactionPaid());
            }
            int i16 = -arrayList3.size();
            while (true) {
                if (i16 >= messageObject.messageOwner.reactions.results.size()) {
                    break;
                    break;
                }
                if (i16 < 0) {
                    tL_reactionCount = new TLRPC.TL_reactionCount();
                    tL_reactionCount.reaction = (TLRPC.Reaction) arrayList3.get(arrayList3.size() + i16);
                    tL_reactionCount.chosen = r10;
                    tL_reactionCount.count = r10;
                } else {
                    tL_reactionCount = messageObject.messageOwner.reactions.results.get(i16);
                }
                TLRPC.ReactionCount reactionCount = tL_reactionCount;
                int i17 = 0;
                while (true) {
                    if (i17 >= arrayList2.size()) {
                        o0Var = null;
                        break;
                    }
                    o0Var = (o0) arrayList2.get(i17);
                    if (o0Var.f11399r.equals(reactionCount.reaction)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                p0 p0Var = new p0(r0Var, o0Var, reactionCount, z13, z14);
                p0Var.R = messageObject.hasValidGroupId();
                arrayList.add(p0Var);
                r0Var.L = r0Var.L || p0Var.f11394m;
                if (z10 || z11 || messageObject.messageOwner.reactions.recent_reactions == null) {
                    i10 = i12;
                    i11 = i14;
                } else {
                    if (messageObject.getDialogId() > 0 && !UserObject.isReplyUser(messageObject.getDialogId())) {
                        ArrayList arrayList4 = new ArrayList();
                        TLRPC.User currentUser = UserConfig.getInstance(i14).getCurrentUser();
                        TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(messageObject.getDialogId()));
                        if (reactionCount.count == 2) {
                            if (currentUser != null) {
                                arrayList4.add(currentUser);
                            }
                            if (user != null) {
                                arrayList4.add(user);
                            }
                        } else if (reactionCount.chosen) {
                            if (currentUser != null) {
                                arrayList4.add(currentUser);
                            }
                        } else if (user != null) {
                            arrayList4.add(user);
                        }
                        p0Var.p(arrayList4);
                        if (!arrayList4.isEmpty()) {
                            p0Var.f11403w = 0;
                            p0Var.F.c(0, false);
                        }
                    } else if (reactionCount.count <= 3 && i12 <= 3) {
                        ArrayList arrayList5 = null;
                        int i18 = 0;
                        while (i18 < messageObject.messageOwner.reactions.recent_reactions.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = messageObject.messageOwner.reactions.recent_reactions.get(i18);
                            q0 q0VarD = q0.d(messagePeerReaction.reaction);
                            q0 q0VarD2 = q0.d(reactionCount.reaction);
                            int i19 = i12;
                            int i20 = i14;
                            TLObject userOrChat = MessagesController.getInstance(i14).getUserOrChat(MessageObject.getPeerId(messagePeerReaction.peer_id));
                            if (q0VarD.equals(q0VarD2) && userOrChat != null) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(userOrChat);
                            }
                            i18++;
                            i12 = i19;
                            i14 = i20;
                        }
                        i10 = i12;
                        i11 = i14;
                        p0Var.p(arrayList5);
                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                            p0Var.f11403w = 0;
                            p0Var.F.c(0, false);
                        }
                    }
                    i10 = i12;
                    i11 = i14;
                }
                if (!z10) {
                    r0Var = this;
                    if (!z10 && i16 == 2) {
                        break;
                    }
                    if (r0Var.G) {
                        p0Var.a();
                    }
                    i16++;
                    z13 = z10;
                    z14 = z11;
                    i12 = i10;
                    i14 = i11;
                    r10 = 0;
                } else if (reactionCount.count <= 1) {
                    r0Var = this;
                    if (!z10) {
                    }
                    if (r0Var.G) {
                        p0Var.a();
                    }
                    i16++;
                    z13 = z10;
                    z14 = z11;
                    i12 = i10;
                    i14 = i11;
                    r10 = 0;
                } else {
                    if (reactionCount.chosen) {
                        r0Var = this;
                        p0 p0Var2 = new p0(r0Var, null, reactionCount, z10, z11);
                        p0Var2.R = messageObject.hasValidGroupId();
                        arrayList.add(p0Var2);
                        ((o0) arrayList.get(0)).Q = false;
                        ((o0) arrayList.get(1)).Q = true;
                        ((o0) arrayList.get(0)).f11391j = 1;
                        ((o0) arrayList.get(1)).f11391j = 1;
                        ((o0) arrayList.get(1)).f11396o = a9.p.p(new StringBuilder(), ((o0) arrayList.get(1)).f11396o, "_");
                        break;
                    }
                    r0Var = this;
                    if (!z10) {
                    }
                    if (r0Var.G) {
                        p0Var.a();
                    }
                    i16++;
                    z13 = z10;
                    z14 = z11;
                    i12 = i10;
                    i14 = i11;
                    r10 = 0;
                }
            }
            if (!z10 && !arrayList.isEmpty()) {
                Collections.sort(arrayList, n0Var);
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    TLRPC.ReactionCount reactionCount2 = ((o0) arrayList.get(i21)).f11377a;
                    int i22 = f11416b0;
                    f11416b0 = i22 + 1;
                    reactionCount2.lastDrawnPosition = i22;
                }
            }
            r0Var.K = MessageObject.hasUnreadReactions(messageObject.messageOwner);
        }
        for (int i23 = 0; i23 < arrayList2.size(); i23++) {
            ((o0) arrayList2.get(i23)).b();
        }
        r0Var.f11434s = arrayList.isEmpty();
    }
}
