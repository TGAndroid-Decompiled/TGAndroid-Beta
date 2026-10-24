package ai;

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
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.zr;
public final class n7 {
    public float A;
    public float B;
    public h11 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final ee G;
    public final org.telegram.ui.Components.wc H;
    public final org.telegram.ui.Components.wc I;
    public final org.telegram.ui.Components.wc J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public MessageObject R;
    public boolean S;
    public final ne.e T;
    public f4 U;
    public f4 V;
    public final int f1868a;
    public final View f1869b;
    public final org.telegram.ui.ActionBar.g6 f1870c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.n5 e;
    public int f1872g;
    public RadialGradient h;
    public final yh.j1 f1874j;
    public TL_stars.starGiftAttributeBackdrop f1875k;
    public TL_stars.starGiftAttributePattern f1876l;
    public TL_stars.starGiftAttributeModel f1877m;
    public boolean f1880p;
    public float f1881q;
    public h11 f1882r;
    public float f1883s;
    public h11 f1884t;
    public float f1885u;
    public float v;
    public float f1887x;
    public final yh.j0 f1888y;
    public boolean f1889z;
    public final Paint f1871f = new Paint(1);
    public final Matrix f1873i = new Matrix();
    public final RectF f1878n = new RectF();
    public final Path f1879o = new Path();
    public final ArrayList f1886w = new ArrayList();

    public n7(int i10, View view, org.telegram.ui.ActionBar.g6 g6Var) {
        yh.j0 j0Var = new yh.j0();
        this.f1888y = j0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new ee(1, 25);
        this.K = new RectF();
        this.T = new ne.e(0, new a1.c(this, 6), zr.h, 320L);
        this.f1868a = i10;
        this.f1869b = view;
        this.f1870c = g6Var;
        this.f1874j = new yh.j1(view);
        this.H = new org.telegram.ui.Components.wc(view);
        this.I = new org.telegram.ui.Components.wc(view);
        this.J = new org.telegram.ui.Components.wc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.n5(AndroidUtilities.dp(28.0f), view);
        j0Var.f50776r = view;
        j0Var.d.setParentView(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.onAttachedToWindow();
            this.e.a();
            this.f1888y.d.onAttachedToWindow();
        }
    }

    public final void b(Canvas canvas) {
        boolean z10 = this.L;
        yh.j1 j1Var = this.f1874j;
        if (z10 && j1Var != null) {
            int i10 = this.M;
            int i11 = org.telegram.ui.ActionBar.r6.f21818b;
            if (i10 != i11) {
                this.M = i11;
                try {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21422q7, this.f1870c);
                    Paint paint = (Paint) j1Var.f33024b;
                    paint.setShader(null);
                    paint.setColor(w02);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        ne.e eVar = this.T;
        float f7 = eVar.e;
        float f10 = f7 / 2.0f;
        RectF rectF = this.f1878n;
        rectF.set(0.0f, 0.0f, f7, this.P);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f1875k != null && (this.h == null || this.f1872g != height)) {
            this.f1872g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f1875k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint2 = this.f1871f;
        if (radialGradient != null) {
            Matrix matrix = this.f1873i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint2.setShader(this.h);
        }
        Path path = this.f1879o;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.save();
        float a2 = this.I.a(0.0125f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint2);
        canvas.save();
        canvas.translate(f10, AndroidUtilities.dp(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f1875k;
        org.telegram.ui.Components.n5 n5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            n5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        m1.a(canvas, 1, n5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f10 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f1875k;
        if (stargiftattributebackdrop3 != null) {
            o12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i12 = o12;
        this.f1882r.f26853p = eVar.e - AndroidUtilities.dp(12.0f);
        h11 h11Var = this.f1882r;
        h11Var.c(f10 - (h11Var.f26843c / 2.0f), this.f1881q, 1.0f, -1, canvas);
        this.f1884t.f26853p = eVar.e - AndroidUtilities.dp(12.0f);
        h11 h11Var2 = this.f1884t;
        Canvas canvas2 = canvas;
        int i13 = i12;
        h11Var2.c(f10 - (h11Var2.f26843c / 2.0f), this.f1883s, 1.0f, i13, canvas2);
        if (this.f1889z) {
            yh.j0 j0Var = this.f1888y;
            int i14 = j0Var.f50778t;
            int i15 = j0Var.f50779u;
            int i16 = (int) (f10 - (i14 / 2.0f));
            int i17 = (int) this.f1887x;
            int i18 = i14 + i16;
            j0Var.setBounds(i16, i17, i18, i17 + i15);
            float f11 = this.f1887x;
            RectF rectF2 = this.K;
            rectF2.set(i16, f11, i18, i15 + f11);
            float a10 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            j0Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f12 = 9.0f;
            float dp = this.f1885u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f1886w;
            int size = arrayList.size();
            int i19 = 0;
            while (i19 < size) {
                int i20 = i19 + 1;
                m7 m7Var = (m7) arrayList.get(i19);
                h11 h11Var3 = m7Var.f1815b;
                float f13 = f10 - (dp / 2.0f);
                float f14 = f12;
                h11Var3.c((f13 + this.f1885u) - h11Var3.f26843c, m7Var.f1814a, 1.0f, i13, canvas2);
                canvas2 = canvas;
                m7Var.f1816c.c(f13 + this.f1885u + AndroidUtilities.dp(f14), m7Var.f1814a, 1.0f, -1, canvas2);
                i13 = i13;
                i19 = i20;
                f12 = f14;
            }
        }
        int i21 = i13;
        if (!this.f1880p) {
            float f15 = this.A;
            float a11 = org.telegram.messenger.v0.a(this.C.f26843c, AndroidUtilities.dp(30.0f), 2.0f, f10);
            float f16 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f10 - ((this.C.f26843c + AndroidUtilities.dp(30.0f)) / 2.0f), f15, a11, f16);
            Path path2 = this.E;
            path2.rewind();
            float f17 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f17, f17, Path.Direction.CW);
            int o13 = org.telegram.ui.ActionBar.k6.o1(0.13f, -16777216);
            Paint paint3 = this.F;
            paint3.setColor(o13);
            float a12 = this.H.a(0.075f);
            canvas2.scale(a12, a12, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint3);
            canvas2.restore();
            j1Var.setBounds(((int) rectF.right) - AndroidUtilities.dp(46.67f), ((int) rectF.top) - AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f) + ((int) rectF.right), AndroidUtilities.dp(46.67f) + ((int) rectF.top));
            j1Var.f50786x = i21;
            j1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f1880p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f1878n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        ee eeVar = this.G;
        eeVar.g(rectF2);
        eeVar.d();
        eeVar.a(canvas, org.telegram.ui.ActionBar.k6.o1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f1869b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).M();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.e;
    }

    public final boolean e(float r18, float r19, android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: ai.n7.e(float, float, android.view.MotionEvent):boolean");
    }

    public final void f(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.n7.f(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void g(MessageObject messageObject, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long dialogId;
        float f7;
        float f10;
        float f11;
        float f12;
        int dp;
        int i10;
        float f13 = this.O;
        boolean isOutOwner = messageObject.isOutOwner();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i11 = this.f1868a;
        if (z10 == isOutOwner) {
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
        if (this.f1880p) {
            this.f1882r = new h11(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i11).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f1882r = new h11(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f1882r = new h11(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f1882r = new h11(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f1882r = new h11(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f1882r = new h11(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f1881q = (this.f1882r.j() / 2.0f) + dp2;
        float j10 = this.f1882r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f1880p) {
            f7 = 10.0f;
            f10 = 3.0f;
            this.f1884t = new h11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f11 = 2.0f;
        } else {
            f7 = 10.0f;
            f10 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f11 = 2.0f;
            this.f1884t = new h11(i2.o1.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f1883s = (this.f1884t.j() / f11) + j10;
        float j11 = this.f1884t.j() + j10;
        if (this.f1880p) {
            f12 = 14.0f;
        } else {
            f12 = 11.0f;
        }
        float dp3 = j11 + AndroidUtilities.dp(f12);
        ArrayList arrayList = this.f1886w;
        arrayList.clear();
        this.f1885u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        yh.j0 j0Var = this.f1888y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = j0Var.f50764c;
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
            this.f1889z = true;
            j0Var.c(tLObject);
            j0Var.f50771m = replaceAnimatedEmoji;
            j0Var.f50777s = -1;
            j0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = j0Var.f50772n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.N = true;
                    StaticLayout staticLayout2 = j0Var.f50772n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.O = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.O);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f1887x = dp4;
            dp3 = dp4 + j0Var.f50779u + AndroidUtilities.dp(f10);
        } else {
            this.f1889z = false;
            j0Var.c(null);
            j0Var.f50771m = null;
            j0Var.f50777s = -1;
            if (this.f1877m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                m7 m7Var = new m7(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f1877m.name);
                arrayList.add(m7Var);
                float f14 = f13 * 0.5f;
                h11 h11Var = m7Var.f1815b;
                h11Var.f26853p = f14;
                this.f1885u = Math.max(this.f1885u, h11Var.f26843c);
                h11 h11Var2 = m7Var.f1816c;
                h11Var2.f26853p = f14;
                this.v = Math.max(this.v, h11Var2.f26843c);
                dp3 += m7Var.a();
            }
            if (this.f1875k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                m7 m7Var2 = new m7(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f1875k.name);
                arrayList.add(m7Var2);
                float f15 = f13 * 0.5f;
                h11 h11Var3 = m7Var2.f1815b;
                h11Var3.f26853p = f15;
                this.f1885u = Math.max(this.f1885u, h11Var3.f26843c);
                h11 h11Var4 = m7Var2.f1816c;
                h11Var4.f26853p = f15;
                this.v = Math.max(this.v, h11Var4.f26843c);
                dp3 = m7Var2.a() + dp3;
            }
            if (this.f1876l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                m7 m7Var3 = new m7(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f1876l.name);
                arrayList.add(m7Var3);
                float f16 = f13 * 0.5f;
                h11 h11Var5 = m7Var3.f1815b;
                h11Var5.f26853p = f16;
                this.f1885u = Math.max(this.f1885u, h11Var5.f26843c);
                h11 h11Var6 = m7Var3.f1816c;
                h11Var6.f26853p = f16;
                this.v = Math.max(this.v, h11Var6.f26843c);
                dp3 += m7Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f1880p) {
            this.A = dp5;
            this.C = new h11(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
            float dp6 = AndroidUtilities.dp(30.0f);
            this.B = dp6;
            dp5 += dp6;
            dp = AndroidUtilities.dp(11.0f);
        } else {
            dp = AndroidUtilities.dp(f7);
        }
        this.P = (int) (dp5 + dp);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i10;
        float f7 = this.O;
        float dp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        int i11 = 0;
        h11 h11Var = new h11(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j10)), 14.0f, AndroidUtilities.bold());
        this.f1882r = h11Var;
        this.f1881q = (h11Var.j() / 2.0f) + dp;
        float j11 = this.f1882r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        String m10 = i2.o1.m(tL_starGiftUnique.num, ',', sb2);
        TLObject tLObject = null;
        h11 h11Var2 = new h11(m10, 12.0f, null);
        this.f1884t = h11Var2;
        this.f1883s = (h11Var2.j() / 2.0f) + j11;
        float j12 = this.f1884t.j() + j11 + AndroidUtilities.dp(11.0f);
        this.f1886w.clear();
        this.f1885u = 0.0f;
        this.v = 0.0f;
        yh.j0 j0Var = this.f1888y;
        TextPaint textPaint = j0Var.f50764c;
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
            tLObject = MessagesController.getInstance(this.f1868a).getUserOrChat(j10);
        }
        this.f1889z = true;
        j0Var.c(tLObject);
        j0Var.f50771m = spanned;
        j0Var.f50777s = -1;
        j0Var.b(((int) f7) - AndroidUtilities.dp(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = j0Var.f50772n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.N = true;
                StaticLayout staticLayout2 = j0Var.f50772n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.O = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j12 + AndroidUtilities.dp(4.0f);
        this.f1887x = dp2;
        float dp3 = dp2 + j0Var.f50779u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new h11(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.P = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
