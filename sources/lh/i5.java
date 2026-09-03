package lh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.LaunchActivity;
public final class i5 {
    public float A;
    public float B;
    public k01 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final wa G;
    public final rc H;
    public final rc I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public TLRPC.TL_messageActionStarGiftUnique N;
    public MessageObject O;
    public boolean P;
    public final xd.c Q;
    public kh.n0 R;
    public final int f12572a;
    public final View f12573b;
    public final org.telegram.ui.ActionBar.f6 f12574c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.j5 e;
    public int f12576g;
    public RadialGradient h;
    public final kh.a2 f12578j;
    public TL_stars.starGiftAttributeBackdrop f12579k;
    public TL_stars.starGiftAttributePattern f12580l;
    public TL_stars.starGiftAttributeModel f12581m;
    public boolean f12584p;
    public float f12585q;
    public k01 f12586r;
    public float f12587s;
    public k01 f12588t;
    public float f12589u;
    public float v;
    public float f12591x;
    public final kh.v0 f12592y;
    public boolean f12593z;
    public final Paint f12575f = new Paint(1);
    public final Matrix f12577i = new Matrix();
    public final RectF f12582n = new RectF();
    public final Path f12583o = new Path();
    public final ArrayList f12590w = new ArrayList();

    public i5(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        kh.v0 v0Var = new kh.v0();
        this.f12592y = v0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new wa(1, 25);
        this.Q = new xd.c(0, new gg.f(this, 29), mr.h, 320L);
        this.f12572a = i10;
        this.f12573b = view;
        this.f12574c = f6Var;
        this.f12578j = new kh.a2(view);
        this.H = new rc(view);
        this.I = new rc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.j5(AndroidUtilities.dp(28.0f), view);
        v0Var.f10995r = view;
        v0Var.d.setParentView(view);
    }

    public final void a(Canvas canvas) {
        xd.c cVar = this.Q;
        float f10 = cVar.e;
        float f11 = f10 / 2.0f;
        RectF rectF = this.f12582n;
        rectF.set(0.0f, 0.0f, f10, this.M);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f12579k != null && (this.h == null || this.f12576g != height)) {
            this.f12576g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f12579k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f12575f;
        if (radialGradient != null) {
            Matrix matrix = this.f12577i;
            matrix.reset();
            matrix.postTranslate(f11, f11);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f12583o;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.save();
        float a2 = this.I.a(0.0125f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f11, AndroidUtilities.dp(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f12579k;
        org.telegram.ui.Components.j5 j5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            j5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        x0.a(canvas, 1, j5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f11 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f12579k;
        if (stargiftattributebackdrop3 != null) {
            l1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i10 = l1;
        this.f12586r.f26134p = cVar.e - AndroidUtilities.dp(12.0f);
        k01 k01Var = this.f12586r;
        k01Var.c(f11 - (k01Var.f26124c / 2.0f), this.f12585q, 1.0f, -1, canvas);
        this.f12588t.f26134p = cVar.e - AndroidUtilities.dp(12.0f);
        k01 k01Var2 = this.f12588t;
        Canvas canvas2 = canvas;
        int i11 = i10;
        k01Var2.c(f11 - (k01Var2.f26124c / 2.0f), this.f12587s, 1.0f, i11, canvas2);
        if (this.f12593z) {
            kh.v0 v0Var = this.f12592y;
            int i12 = v0Var.f10997t;
            int i13 = v0Var.f10998u;
            int i14 = (int) (f11 - (i12 / 2.0f));
            int i15 = (int) this.f12591x;
            v0Var.setBounds(i14, i15, i12 + i14, i13 + i15);
            v0Var.draw(canvas2);
        } else {
            float dp = this.f12589u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f12590w;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                h5 h5Var = (h5) arrayList.get(i16);
                k01 k01Var3 = h5Var.f12531b;
                float f12 = f11 - (dp / 2.0f);
                k01Var3.c((f12 + this.f12589u) - k01Var3.f26124c, h5Var.f12530a, 1.0f, i11, canvas2);
                canvas2 = canvas;
                h5Var.f12532c.c(f12 + this.f12589u + AndroidUtilities.dp(9.0f), h5Var.f12530a, 1.0f, -1, canvas2);
                i11 = i11;
                i16 = i17;
            }
        }
        int i18 = i11;
        if (!this.f12584p) {
            float f13 = this.A;
            float b10 = kf.k0.b(this.C.f26124c, AndroidUtilities.dp(30.0f), 2.0f, f11);
            float f14 = this.A + this.B;
            RectF rectF2 = this.D;
            rectF2.set(f11 - ((this.C.f26124c + AndroidUtilities.dp(30.0f)) / 2.0f), f13, b10, f14);
            Path path2 = this.E;
            path2.rewind();
            float f15 = this.B / 2.0f;
            path2.addRoundRect(rectF2, f15, f15, Path.Direction.CW);
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(l12);
            float a10 = this.H.a(0.075f);
            canvas2.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            int dp2 = ((int) rectF.right) - AndroidUtilities.dp(46.67f);
            int dp3 = ((int) rectF.top) - AndroidUtilities.dp(1.33f);
            int dp4 = AndroidUtilities.dp(1.33f) + ((int) rectF.right);
            int dp5 = AndroidUtilities.dp(46.67f) + ((int) rectF.top);
            kh.a2 a2Var = this.f12578j;
            a2Var.setBounds(dp2, dp3, dp4, dp5);
            a2Var.h = i18;
            a2Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void b(Canvas canvas) {
        if (this.f12584p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f12582n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        wa waVar = this.G;
        waVar.g(rectF2);
        waVar.d();
        waVar.a(canvas, org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f12573b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).J();
        } else {
            view.invalidate();
        }
    }

    public final float c() {
        return this.Q.e;
    }

    public final boolean d() {
        if (this.N != null) {
            return true;
        }
        return false;
    }

    public final boolean e(float f10, float f11, MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        boolean contains = this.D.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        boolean contains2 = this.f12582n.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        int action = motionEvent.getAction();
        rc rcVar = this.H;
        rc rcVar2 = this.I;
        if (action == 0) {
            if (contains2 && !contains) {
                z10 = true;
            } else {
                z10 = false;
            }
            rcVar2.c(z10);
            rcVar.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (rcVar.h && !contains) {
                rcVar.c(false);
            } else if (rcVar2.h && !contains2) {
                rcVar2.c(false);
            }
        } else if (motionEvent.getAction() == 1 && ((z4 = rcVar.h) || rcVar2.h)) {
            kh.n0 n0Var = this.R;
            if (n0Var != null) {
                if (z4) {
                    n0Var.run();
                }
            } else if (this.J) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    kf.k0.v(R.string.UniqueGiftNotFoundBurned, qc.a0(U), R.raw.fire_on, 36);
                }
            } else {
                g5 g5Var = new g5(this.f12573b.getContext(), this.f12572a, this.O.getDialogId(), this.f12574c, null);
                g5Var.i2(this.O, null);
                g5Var.show();
            }
            rcVar.c(false);
            rcVar2.c(false);
            return true;
        } else if (motionEvent.getAction() == 3 && (rcVar.h || rcVar2.h)) {
            rcVar.c(false);
            rcVar2.c(false);
            return true;
        }
        if (rcVar.h || rcVar2.h) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: lh.i5.f(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void g(MessageObject messageObject, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long dialogId;
        float f10;
        float f11;
        float f12;
        float f13;
        int dp;
        int i10;
        float f14 = this.L;
        boolean isOutOwner = messageObject.isOutOwner();
        boolean z4 = !tL_messageActionStarGiftUnique.upgrade;
        int i11 = this.f12572a;
        if (z4 == isOutOwner) {
            dialogId = UserConfig.getInstance(i11).getClientUserId();
        } else {
            dialogId = messageObject.getDialogId();
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            dialogId = DialogObject.getPeerDialogId(peer);
        }
        String shortName = DialogObject.getShortName(dialogId);
        float dp2 = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        int i12 = 0;
        if (this.f12584p) {
            this.f12586r = new k01(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i11).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f12586r = new k01(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f12586r = new k01(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f12586r = new k01(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f12586r = new k01(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f12586r = new k01(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f12585q = (this.f12586r.j() / 2.0f) + dp2;
        float j10 = this.f12586r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f12584p) {
            f10 = 10.0f;
            f11 = 3.0f;
            this.f12588t = new k01(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f12 = 2.0f;
        } else {
            f10 = 10.0f;
            f11 = 3.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            f12 = 2.0f;
            this.f12588t = new k01(kf.k0.l(tL_starGiftUnique.num, ',', sb), 12.0f, null);
        }
        this.f12587s = (this.f12588t.j() / f12) + j10;
        float j11 = this.f12588t.j() + j10;
        if (this.f12584p) {
            f13 = 14.0f;
        } else {
            f13 = 11.0f;
        }
        float dp3 = j11 + AndroidUtilities.dp(f13);
        ArrayList arrayList = this.f12590w;
        arrayList.clear();
        this.f12589u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        kh.v0 v0Var = this.f12592y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = v0Var.f10983c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false);
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
            if (!tL_messageActionStarGiftUnique.name_hidden) {
                if (tL_messageActionStarGiftUnique.from_id != null) {
                    tLObject = MessagesController.getInstance(i11).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.from_id));
                } else {
                    tLObject = MessagesController.getInstance(i11).getUserOrChat(messageObject.getFromChatId());
                }
            }
            this.f12593z = true;
            v0Var.c(tLObject);
            v0Var.f10990m = replaceAnimatedEmoji;
            v0Var.f10996s = -1;
            v0Var.b(((int) f14) - AndroidUtilities.dp(24.0f));
            if (!this.K) {
                StaticLayout staticLayout = v0Var.f10991n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.K = true;
                    StaticLayout staticLayout2 = v0Var.f10991n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.L = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.L);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f12591x = dp4;
            dp3 = dp4 + v0Var.f10998u + AndroidUtilities.dp(f11);
        } else {
            this.f12593z = false;
            v0Var.c(null);
            v0Var.f10990m = null;
            v0Var.f10996s = -1;
            if (this.f12581m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                h5 h5Var = new h5(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f12581m.name);
                arrayList.add(h5Var);
                float f15 = f14 * 0.5f;
                k01 k01Var = h5Var.f12531b;
                k01Var.f26134p = f15;
                this.f12589u = Math.max(this.f12589u, k01Var.f26124c);
                k01 k01Var2 = h5Var.f12532c;
                k01Var2.f26134p = f15;
                this.v = Math.max(this.v, k01Var2.f26124c);
                dp3 += h5Var.a();
            }
            if (this.f12579k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                h5 h5Var2 = new h5(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f12579k.name);
                arrayList.add(h5Var2);
                float f16 = f14 * 0.5f;
                k01 k01Var3 = h5Var2.f12531b;
                k01Var3.f26134p = f16;
                this.f12589u = Math.max(this.f12589u, k01Var3.f26124c);
                k01 k01Var4 = h5Var2.f12532c;
                k01Var4.f26134p = f16;
                this.v = Math.max(this.v, k01Var4.f26124c);
                dp3 = h5Var2.a() + dp3;
            }
            if (this.f12580l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                h5 h5Var3 = new h5(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f12580l.name);
                arrayList.add(h5Var3);
                float f17 = f14 * 0.5f;
                k01 k01Var5 = h5Var3.f12531b;
                k01Var5.f26134p = f17;
                this.f12589u = Math.max(this.f12589u, k01Var5.f26124c);
                k01 k01Var6 = h5Var3.f12532c;
                k01Var6.f26134p = f17;
                this.v = Math.max(this.v, k01Var6.f26124c);
                dp3 += h5Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f12584p) {
            this.A = dp5;
            this.C = new k01(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
            float dp6 = AndroidUtilities.dp(30.0f);
            this.B = dp6;
            dp5 += dp6;
            dp = AndroidUtilities.dp(11.0f);
        } else {
            dp = AndroidUtilities.dp(f10);
        }
        this.M = (int) (dp5 + dp);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i10;
        float f10 = this.L;
        float dp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        int i11 = 0;
        k01 k01Var = new k01(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j10)), 14.0f, AndroidUtilities.bold());
        this.f12586r = k01Var;
        this.f12585q = (k01Var.j() / 2.0f) + dp;
        float j11 = this.f12586r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        String l10 = kf.k0.l(tL_starGiftUnique.num, ',', sb);
        TLObject tLObject = null;
        k01 k01Var2 = new k01(l10, 12.0f, null);
        this.f12588t = k01Var2;
        this.f12587s = (k01Var2.j() / 2.0f) + j11;
        float j12 = this.f12588t.j() + j11 + AndroidUtilities.dp(11.0f);
        this.f12590w.clear();
        this.f12589u = 0.0f;
        this.v = 0.0f;
        kh.v0 v0Var = this.f12592y;
        TextPaint textPaint = v0Var.f10983c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false);
            spanned = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftMessageHint));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j10 != 0) {
            tLObject = MessagesController.getInstance(this.f12572a).getUserOrChat(j10);
        }
        this.f12593z = true;
        v0Var.c(tLObject);
        v0Var.f10990m = spanned;
        v0Var.f10996s = -1;
        v0Var.b(((int) f10) - AndroidUtilities.dp(24.0f));
        if (!this.K) {
            StaticLayout staticLayout = v0Var.f10991n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.K = true;
                StaticLayout staticLayout2 = v0Var.f10991n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.L = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.L);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j12 + AndroidUtilities.dp(4.0f);
        this.f12591x = dp2;
        float dp3 = dp2 + v0Var.f10998u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new k01(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.M = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
