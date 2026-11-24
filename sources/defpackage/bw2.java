package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.PhotoViewer;
public final class bw2 extends FrameLayout implements sp3 {
    public int E;
    public StaticLayout F;
    public final int G;
    public StaticLayout H;
    public final int I;
    public StaticLayout J;
    public TLRPC.BotInlineResult K;
    public TLRPC.User L;
    public TLRPC.Document M;
    public int N;
    public TLRPC.Photo O;
    public TLRPC.PhotoSize P;
    public byte Q;
    public boolean R;
    public k27 S;
    public AnimatorSet T;
    public final Paint U;
    public final int V;
    public int W;
    public final ImageReceiver a;
    public final RadialProgress2 a0;
    public boolean b;
    public boolean b0;
    public final o06 c;
    public final wf2 c0;
    public final int d;
    public aw2 d0;
    public Object e;
    public n41 e0;
    public final wjb f;
    public boolean f0;
    public String g0;
    public qvc h;
    public boolean h0;
    public float i0;
    public final v10 j0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public bw2(wjb wjbVar, Context context, boolean z) {
        super(context);
        int i = y6c.t0;
        this.d = i;
        this.G = gl.L(7.0f);
        this.I = gl.L(27.0f);
        this.i0 = 1.0f;
        this.j0 = new v10(this, (byte) 2);
        this.f = wjbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.m0(1);
        imageReceiver.w0 = true;
        this.c = new o06(0, wjbVar);
        this.a0 = new RadialProgress2(this, null);
        this.V = up3.q(i).k();
        setFocusable(true);
        if (z) {
            Paint paint = new Paint();
            this.U = paint;
            int i2 = bkb.Bi;
            paint.setColor(bkb.v0(i2, wjbVar));
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.c0 = wf2Var;
            wf2Var.setVisibility(4);
            wf2Var.b(-1, i2, bkb.j7);
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(1);
            addView(wf2Var, nme.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    private int getIconForCurrentState() {
        byte b = this.Q;
        RadialProgress2 radialProgress2 = this.a0;
        if (b != 3 && b != 5) {
            radialProgress2.g(bkb.bf, bkb.cf, bkb.df, bkb.ef);
            if (this.W != 1) {
                return 4;
            }
            return 10;
        }
        radialProgress2.g(bkb.Ye, bkb.Ze, bkb.kd, bkb.ld);
        int i = this.W;
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void B(boolean z) {
        f(true, z);
    }

    @Override
    public final void N(String str) {
        this.h0 = true;
        this.a0.o(true, 1.0f);
        f(false, true);
    }

    public final void a() {
        int i;
        byte b = this.Q;
        if (b == 3 || b == 5) {
            int i2 = this.W;
            RadialProgress2 radialProgress2 = this.a0;
            if (i2 == 0) {
                if (MediaController.w().R(this.S)) {
                    this.W = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else if (i2 == 1) {
                if (MediaController.w().Q(this.S, true)) {
                    this.W = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else {
                int i3 = this.d;
                if (i2 == 2) {
                    radialProgress2.o(false, 0.0f);
                    if (this.M != null) {
                        ba4.G(i3).X(this.M, this.K, 1, 0);
                    } else if (this.K.content instanceof TLRPC.TL_webDocument) {
                        i = 4;
                        ba4.G(i3).W(null, null, usc.c(this.K.content), null, null, null, null, 0L, 3, 1);
                        this.W = i;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                    i = 4;
                    this.W = i;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                } else if (i2 == 4) {
                    if (this.M != null) {
                        ba4.G(i3).f(this.M);
                    } else if (this.K.content instanceof TLRPC.TL_webDocument) {
                        ba4.G(i3).e(null, null, usc.c(this.K.content), null, null, null);
                    }
                    this.W = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        }
    }

    public final void b() {
        String str;
        String str2;
        this.S = null;
        this.Q = (byte) 0;
        TLRPC.Document document = this.M;
        if (document != null) {
            if (k27.s3(document, false)) {
                this.Q = (byte) 2;
            } else if (!k27.t4(this.M) && !k27.K2(this.M, true)) {
                if (k27.J3(this.M)) {
                    this.Q = (byte) 5;
                } else if (k27.P4(this.M)) {
                    this.Q = (byte) 3;
                }
            } else {
                this.Q = (byte) 6;
            }
        } else {
            TLRPC.BotInlineResult botInlineResult = this.K;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.Q = (byte) 7;
                } else if (botInlineResult.type.equals("audio")) {
                    this.Q = (byte) 5;
                } else if (this.K.type.equals("voice")) {
                    this.Q = (byte) 3;
                }
            }
        }
        byte b = this.Q;
        if (b != 3 && b != 5) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.id = -Utilities.b.nextInt();
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        int i = this.d;
        long e = y6c.h(i).e();
        tL_peerUser.user_id = e;
        peer.user_id = e;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        String str3 = "";
        tL_message.message = "";
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = new TLRPC.TL_document();
        TLRPC.MessageMedia messageMedia = tL_message.media;
        messageMedia.document.file_reference = new byte[0];
        tL_message.flags |= 768;
        TLRPC.Document document2 = this.M;
        if (document2 != null) {
            messageMedia.document = document2;
            tL_message.attachPath = "";
        } else {
            String str4 = this.K.content.url;
            String str5 = "ogg";
            if (this.Q != 5) {
                str = "ogg";
            } else {
                str = "mp3";
            }
            String x = fl5.x(str4, str);
            TLRPC.Document document3 = tL_message.media.document;
            document3.id = 0L;
            document3.access_hash = 0L;
            document3.date = tL_message.date;
            document3.mime_type = b00.h("audio/", x);
            TLRPC.Document document4 = tL_message.media.document;
            document4.size = 0L;
            document4.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.duration = k27.f1(this.K);
            TLRPC.BotInlineResult botInlineResult2 = this.K;
            String str6 = botInlineResult2.title;
            if (str6 == null) {
                str6 = "";
            }
            tL_documentAttributeAudio.title = str6;
            String str7 = botInlineResult2.description;
            if (str7 != null) {
                str3 = str7;
            }
            tL_documentAttributeAudio.performer = str3;
            tL_documentAttributeAudio.flags |= 3;
            if (this.Q == 3) {
                tL_documentAttributeAudio.voice = true;
            }
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            StringBuilder sb = new StringBuilder();
            sb.append(Utilities.a(this.K.content.url));
            sb.append(".");
            String str8 = this.K.content.url;
            if (this.Q != 5) {
                str2 = "ogg";
            } else {
                str2 = "mp3";
            }
            sb.append(fl5.x(str8, str2));
            tL_documentAttributeFilename.file_name = sb.toString();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            File z = ba4.z(4);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Utilities.a(this.K.content.url));
            sb2.append(".");
            String str9 = this.K.content.url;
            if (this.Q == 5) {
                str5 = "mp3";
            }
            sb2.append(fl5.x(str9, str5));
            tL_message.attachPath = new File(z, sb2.toString()).getAbsolutePath();
        }
        this.S = new k27(i, tL_message, false, true);
    }

    public final void c(boolean z, boolean z2) {
        wf2 wf2Var = this.c0;
        if (wf2Var == null) {
            return;
        }
        if (wf2Var.getVisibility() != 0) {
            wf2Var.setVisibility(0);
        }
        wf2Var.a(z, z2);
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.T = null;
        }
        float f = 1.0f;
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.T = animatorSet2;
            if (z) {
                f = 0.81f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.j0, f));
            this.T.setDuration(200L);
            this.T.addListener(new y7((byte) 25, this, z));
            this.T.start();
            return;
        }
        if (z) {
            f = 0.85f;
        }
        this.i0 = f;
        invalidate();
    }

    public final void d(int i, Object obj, TLRPC.Document document) {
        this.n = false;
        this.s = false;
        this.N = i;
        this.K = null;
        this.e = obj;
        this.M = document;
        this.O = null;
        this.R = true;
        this.y = true;
        b();
        this.Q = (byte) 2;
        requestLayout();
        this.g0 = null;
        this.h0 = false;
        this.f0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z, boolean z2, boolean z3, boolean z4) {
        qvc qvcVar;
        this.n = z2;
        this.s = z3;
        this.L = user;
        this.K = botInlineResult;
        this.e = botInlineResult;
        if (botInlineResult != null) {
            this.M = botInlineResult.document;
            this.O = botInlineResult.photo;
        } else {
            this.M = null;
            this.O = null;
        }
        this.R = z;
        this.y = z4;
        qvc qvcVar2 = this.h;
        if (qvcVar2 != null && qvcVar2.r) {
            qvcVar2.r = false;
            qvcVar2.h.q(false);
            qvcVar2.h.r();
            vvc.r(qvcVar2.c);
        }
        if (botInlineResult != null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) {
            qvcVar = new qvc(this, this.d, botInlineResult, this.f);
        } else {
            qvcVar = null;
        }
        this.h = qvcVar;
        b();
        if (z4) {
            this.Q = (byte) 2;
        }
        requestLayout();
        this.g0 = null;
        this.h0 = false;
        this.f0 = false;
        f(false, false);
    }

    public final void f(boolean z, boolean z2) {
        boolean containsKey;
        String str = this.g0;
        if (str == null && !this.f0) {
            this.f0 = true;
            Utilities.g.c(new zv2(this, z));
            this.a0.setIcon(4, z, false);
        } else if (TextUtils.isEmpty(str)) {
            this.W = -1;
            this.a0.setIcon(4, z, false);
        } else {
            if (this.M != null) {
                containsKey = ba4.G(this.d).S(this.g0);
            } else {
                fl5 z3 = fl5.z();
                containsKey = z3.C.containsKey(this.g0);
            }
            if (!containsKey && this.h0) {
                up3.q(this.d).v(this);
                byte b = this.Q;
                if (b != 5 && b != 3) {
                    this.W = -1;
                } else {
                    boolean D = MediaController.w().D(this.S);
                    if (D && (!D || !MediaController.w().C())) {
                        this.W = 1;
                    } else {
                        this.W = 0;
                    }
                    this.a0.o(z2, 1.0f);
                }
            } else {
                up3.q(this.d).a(this.g0, null, this);
                byte b2 = this.Q;
                float f = 0.0f;
                if (b2 != 5 && b2 != 3) {
                    this.W = 1;
                    Float s = fl5.z().s(this.g0);
                    if (s != null) {
                        f = s.floatValue();
                    }
                    this.a0.o(false, f);
                } else if (!containsKey) {
                    this.W = 2;
                } else {
                    this.W = 4;
                    Float s2 = fl5.z().s(this.g0);
                    RadialProgress2 radialProgress2 = this.a0;
                    if (s2 != null) {
                        radialProgress2.o(z2, s2.floatValue());
                    } else {
                        radialProgress2.o(z2, 0.0f);
                    }
                }
            }
            this.a0.setIcon(getIconForCurrentState(), z, z2);
            invalidate();
        }
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.K;
    }

    public int getDate() {
        return this.N;
    }

    public TLRPC.Document getDocument() {
        return this.M;
    }

    public TLRPC.User getInlineBot() {
        return this.L;
    }

    public k27 getMessageObject() {
        return this.S;
    }

    @Override
    public int getObserverTag() {
        return this.V;
    }

    public Object getParentObject() {
        return this.e;
    }

    public ImageReceiver getPhotoImage() {
        return this.a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.K;
    }

    @Override
    public final void i(long j, long j2) {
        this.a0.o(true, Math.min(1.0f, ((float) j) / ((float) j2)));
        byte b = this.Q;
        if (b != 3 && b != 5) {
            if (this.W != 1) {
                f(false, true);
            }
        } else if (this.W != 4) {
            f(false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        if (this.a.I()) {
            f(false, false);
        }
        this.a0.e();
        if (this.h != null && getMeasuredWidth() > 0) {
            qvc qvcVar = this.h;
            int measuredWidth = getMeasuredWidth();
            if (this.R) {
                f = 4.0f;
            } else {
                f = 16.0f;
            }
            qvcVar.a(measuredWidth - gl.L(f));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        this.a0.f();
        up3.q(this.d).v(this);
        qvc qvcVar = this.h;
        if (qvcVar != null && qvcVar.r) {
            qvcVar.r = false;
            qvcVar.h.q(false);
            qvcVar.h.r();
            vvc.r(qvcVar.c);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b;
        TLRPC.BotInlineResult botInlineResult;
        int i;
        float f;
        float f2;
        int i2;
        qvc qvcVar = this.h;
        float f3 = 8.0f;
        float f4 = 2.0f;
        if (qvcVar != null) {
            if (this.R) {
                f3 = 2.0f;
            }
            float L = gl.L(f3);
            if (!this.R) {
                f4 = 6.0f;
            }
            float L2 = gl.L(f4);
            Paint paint = qvcVar.e;
            Path path = qvcVar.f;
            bwc bwcVar = qvcVar.c;
            if (bwcVar != null && (i2 = qvcVar.n) > 0) {
                int min = Math.min(vvc.c(qvcVar.b, bwcVar, i2), gl.L(320.0f));
                float L3 = gl.L(gba.U0);
                canvas.save();
                canvas.translate(L, L2);
                path.rewind();
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, qvcVar.n, min);
                path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(bkb.v0(bkb.qb, qvcVar.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                gwc gwcVar = qvcVar.h;
                if (gwcVar != null && gwcVar.c(canvas, qvcVar.n)) {
                    qvcVar.a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (this.n && !this.R) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, bkb.j0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.a;
        wf2 wf2Var = this.c0;
        if (wf2Var != null && (wf2Var.a.q || !imageReceiver.B() || imageReceiver.i1 != 1.0f || PhotoViewer.P0((k27) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.U);
        }
        if (this.H != null) {
            canvas.save();
            if (k96.a0) {
                f2 = 8.0f;
            } else {
                f2 = gl.C;
            }
            canvas.translate(gl.L(f2), this.G);
            this.H.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.J;
        wjb wjbVar = this.f;
        if (staticLayout != null) {
            bkb.f3.setColor(bkb.v0(bkb.y6, wjbVar));
            canvas.save();
            if (k96.a0) {
                f = 8.0f;
            } else {
                f = gl.C;
            }
            canvas.translate(gl.L(f), this.I);
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.F != null) {
            bkb.f3.setColor(bkb.v0(bkb.I6, wjbVar));
            canvas.save();
            if (!k96.a0) {
                f3 = gl.C;
            }
            canvas.translate(gl.L(f3), this.E);
            this.F.draw(canvas);
            canvas.restore();
        }
        boolean z = this.R;
        RadialProgress2 radialProgress2 = this.a0;
        if (!z) {
            boolean z2 = this.b;
            o06 o06Var = this.c;
            if (z2 && !PhotoViewer.R0(this.K)) {
                o06Var.setAlpha((int) ((1.0f - imageReceiver.i1) * 255.0f));
            } else {
                o06Var.setAlpha(255);
            }
            byte b2 = this.Q;
            if (b2 != 3 && b2 != 5) {
                TLRPC.BotInlineResult botInlineResult2 = this.K;
                if (botInlineResult2 != null && botInlineResult2.type.equals("file")) {
                    int intrinsicWidth = bkb.l4.getIntrinsicWidth();
                    int intrinsicHeight = bkb.l4.getIntrinsicHeight();
                    int L4 = (int) (imageReceiver.L0 + ((gl.L(52.0f) - intrinsicWidth) / 2));
                    int L5 = (int) (imageReceiver.M0 + ((gl.L(52.0f) - intrinsicHeight) / 2));
                    float f5 = imageReceiver.L0;
                    canvas.drawRect(f5, imageReceiver.M0, gl.L(52.0f) + f5, imageReceiver.M0 + gl.L(52.0f), o06.k);
                    bkb.l4.setBounds(L4, L5, intrinsicWidth + L4, intrinsicHeight + L5);
                    bkb.l4.draw(canvas);
                } else {
                    TLRPC.BotInlineResult botInlineResult3 = this.K;
                    if (botInlineResult3 != null && (botInlineResult3.type.equals("audio") || this.K.type.equals("voice"))) {
                        int intrinsicWidth2 = bkb.m4.getIntrinsicWidth();
                        int intrinsicHeight2 = bkb.m4.getIntrinsicHeight();
                        int L6 = (int) (imageReceiver.L0 + ((gl.L(52.0f) - intrinsicWidth2) / 2));
                        int L7 = (int) (imageReceiver.M0 + ((gl.L(52.0f) - intrinsicHeight2) / 2));
                        float f6 = imageReceiver.L0;
                        canvas.drawRect(f6, imageReceiver.M0, gl.L(52.0f) + f6, imageReceiver.M0 + gl.L(52.0f), o06.k);
                        bkb.m4.setBounds(L6, L7, intrinsicWidth2 + L6, intrinsicHeight2 + L7);
                        bkb.m4.draw(canvas);
                    } else {
                        TLRPC.BotInlineResult botInlineResult4 = this.K;
                        if (botInlineResult4 != null && (botInlineResult4.type.equals("venue") || this.K.type.equals("geo"))) {
                            int intrinsicWidth3 = bkb.n4.getIntrinsicWidth();
                            int intrinsicHeight3 = bkb.n4.getIntrinsicHeight();
                            int L8 = (int) (imageReceiver.L0 + ((gl.L(52.0f) - intrinsicWidth3) / 2));
                            int L9 = (int) (imageReceiver.M0 + ((gl.L(52.0f) - intrinsicHeight3) / 2));
                            float f7 = imageReceiver.L0;
                            canvas.drawRect(f7, imageReceiver.M0, gl.L(52.0f) + f7, imageReceiver.M0 + gl.L(52.0f), o06.k);
                            bkb.n4.setBounds(L8, L9, intrinsicWidth3 + L8, intrinsicHeight3 + L9);
                            bkb.n4.draw(canvas);
                        } else {
                            o06Var.draw(canvas);
                        }
                    }
                }
            } else {
                if (this.r) {
                    i = bkb.Zd;
                } else {
                    i = bkb.Yd;
                }
                radialProgress2.d = bkb.v0(i, wjbVar);
                radialProgress2.draw(canvas);
            }
        } else {
            TLRPC.BotInlineResult botInlineResult5 = this.K;
            if (botInlineResult5 != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult5.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth4 = bkb.n4.getIntrinsicWidth();
                    int intrinsicHeight4 = bkb.n4.getIntrinsicHeight();
                    float f8 = imageReceiver.L0;
                    float f9 = imageReceiver.N0;
                    int z3 = (int) oo1.z(f9, intrinsicWidth4, 2.0f, f8);
                    float f10 = imageReceiver.M0;
                    float f11 = imageReceiver.O0;
                    int z4 = (int) oo1.z(f11, intrinsicHeight4, 2.0f, f10);
                    canvas.drawRect(f8, f10, f9 + f8, f10 + f11, o06.k);
                    bkb.n4.setBounds(z3, z4, intrinsicWidth4 + z3, intrinsicHeight4 + z4);
                    bkb.n4.draw(canvas);
                }
            }
        }
        if (this.b) {
            if (this.K != null) {
                imageReceiver.v0(!PhotoViewer.R0(botInlineResult), false);
            }
            canvas.save();
            float f12 = this.i0;
            n41 n41Var = this.e0;
            if (n41Var != null) {
                f12 *= n41Var.a(0.1f);
            }
            canvas.scale(f12, f12, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        if (this.R && ((b = this.Q) == 7 || b == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.n && !this.R) {
            if (k96.a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - gl.L(gl.C), getMeasuredHeight() - 1, bkb.j0);
            } else {
                canvas.drawLine(gl.L(gl.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, bkb.j0);
            }
        }
        if (this.s) {
            bkb.o4.setBounds(0, 0, getMeasuredWidth(), gl.L(3.0f));
            bkb.o4.draw(canvas);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        boolean z2;
        String M0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        switch (this.Q) {
            case 1:
                sb.append(k96.M0(2131753972, null));
                break;
            case 2:
                sb.append(k96.M0(2131753968, null));
                break;
            case 3:
                sb.append(k96.M0(2131753979, null));
                break;
            case 4:
                sb.append(k96.M0(2131753930, null));
                break;
            case 5:
                sb.append(k96.M0(2131753949, null));
                break;
            case 6:
                sb.append(k96.M0(2131753933, null));
                break;
            case 7:
                sb.append(k96.M0(2131753945, null));
                break;
        }
        StaticLayout staticLayout = this.H;
        if (staticLayout != null && !TextUtils.isEmpty(staticLayout.getText())) {
            z = true;
        } else {
            z = false;
        }
        StaticLayout staticLayout2 = this.J;
        if (staticLayout2 != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.Q == 5 && z && z2) {
            sb.append(", ");
            sb.append(k96.a0("AccDescrMusicInfo", null, 2131754831, this.J.getText(), this.H.getText()));
        } else {
            if (z) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.H.getText());
            }
            if (z2) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.J.getText());
            }
        }
        accessibilityNodeInfo.setText(sb);
        wf2 wf2Var = this.c0;
        if (wf2Var != null && wf2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        byte b = this.Q;
        if (b != 3 && b != 5) {
            return;
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    M0 = k96.M0(2131754929, "AccActionPlay");
                } else {
                    M0 = k96.M0(2131754941, "AccActionCancelDownload");
                }
            } else {
                M0 = k96.M0(2131754938, "AccActionDownload");
            }
        } else {
            M0 = k96.M0(2131754930, "AccActionPause");
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, M0));
    }

    @Override
    public final void onMeasure(int r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (!this.R && this.d0 != null && this.K != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Typeface typeface = gl.a;
            byte b = this.Q;
            o06 o06Var = this.c;
            boolean z = true;
            if (b != 3 && b != 5) {
                TLRPC.BotInlineResult botInlineResult = this.K;
                if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                    if (motionEvent.getAction() == 0) {
                        if (o06Var.getBounds().contains(x, y)) {
                            this.r = true;
                        }
                    } else if (this.r) {
                        if (motionEvent.getAction() == 1) {
                            this.r = false;
                            playSoundEffect(0);
                            ((zy6) this.d0).a.W.b.k(getResult());
                        } else if (motionEvent.getAction() == 3) {
                            this.r = false;
                        } else if (motionEvent.getAction() == 2 && !o06Var.getBounds().contains(x, y)) {
                            this.r = false;
                        }
                    }
                }
                z = false;
            } else {
                boolean contains = o06Var.getBounds().contains(x, y);
                int action = motionEvent.getAction();
                RadialProgress2 radialProgress2 = this.a0;
                if (action == 0) {
                    if (contains) {
                        this.r = true;
                        radialProgress2.n(true, false);
                        invalidate();
                    }
                } else if (this.r) {
                    if (motionEvent.getAction() == 1) {
                        this.r = false;
                        playSoundEffect(0);
                        a();
                        invalidate();
                    } else if (motionEvent.getAction() == 3) {
                        this.r = false;
                        invalidate();
                    } else if (motionEvent.getAction() == 2 && !contains) {
                        this.r = false;
                        invalidate();
                    }
                    radialProgress2.n(this.r, false);
                }
                z = false;
            }
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
            return z;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        byte b;
        if (i == 16 && ((b = this.Q) == 3 || b == 5)) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setCanPreviewGif(boolean z) {
        this.w = z;
    }

    public void setDelegate(aw2 aw2Var) {
        this.d0 = aw2Var;
    }

    public void setIsKeyboard(boolean z) {
        this.x = z;
    }

    @Override
    public void setPressed(boolean z) {
        boolean z2;
        super.setPressed(z);
        n41 n41Var = this.e0;
        if (n41Var != null) {
            if (!z && !this.b0) {
                z2 = false;
            } else {
                z2 = true;
            }
            n41Var.c(z2);
        }
    }

    public void setScaled(boolean z) {
        boolean z2;
        this.b0 = z;
        n41 n41Var = this.e0;
        if (n41Var != null) {
            if (!isPressed() && !this.b0) {
                z2 = false;
            } else {
                z2 = true;
            }
            n41Var.c(z2);
        }
    }

    @Override
    public final void l(long j, long j2) {
    }

    public bw2(Context context) {
        this(null, context, false);
    }
}
