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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f11;
public final class n7 {
    public float A;
    public float B;
    public f11 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final de G;
    public final org.telegram.ui.Components.yc H;
    public final org.telegram.ui.Components.yc I;
    public final org.telegram.ui.Components.yc J;
    public final RectF K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public TLRPC.TL_messageActionStarGiftUnique P;
    public MessageObject Q;
    public boolean R;
    public final ne.e S;
    public f4 T;
    public f4 U;
    public final int f1878a;
    public final View f1879b;
    public final org.telegram.ui.ActionBar.d6 f1880c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.p5 e;
    public int f1882g;
    public RadialGradient h;
    public final yh.j1 f1884j;
    public TL_stars.starGiftAttributeBackdrop f1885k;
    public TL_stars.starGiftAttributePattern f1886l;
    public TL_stars.starGiftAttributeModel f1887m;
    public boolean f1890p;
    public float f1891q;
    public f11 f1892r;
    public float f1893s;
    public f11 f1894t;
    public float f1895u;
    public float v;
    public float f1897x;
    public final yh.j0 f1898y;
    public boolean f1899z;
    public final Paint f1881f = new Paint(1);
    public final Matrix f1883i = new Matrix();
    public final RectF f1888n = new RectF();
    public final Path f1889o = new Path();
    public final ArrayList f1896w = new ArrayList();

    public n7(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        yh.j0 j0Var = new yh.j0();
        this.f1898y = j0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new de(1, 25);
        this.K = new RectF();
        this.S = new ne.e(0, new a1.c(this, 6), bs.h, 320L);
        this.f1878a = i10;
        this.f1879b = view;
        this.f1880c = d6Var;
        this.f1884j = new yh.j1(view);
        this.H = new org.telegram.ui.Components.yc(view);
        this.I = new org.telegram.ui.Components.yc(view);
        this.J = new org.telegram.ui.Components.yc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.p5(AndroidUtilities.dp(28.0f), view);
        j0Var.f50321r = view;
        j0Var.d.setParentView(view);
    }

    public final void a() {
        this.R = true;
        if (this.P != null) {
            this.d.onAttachedToWindow();
            this.e.a();
            this.f1898y.d.onAttachedToWindow();
        }
    }

    public final void b(Canvas canvas) {
        ne.e eVar = this.S;
        float f7 = eVar.e;
        float f10 = f7 / 2.0f;
        RectF rectF = this.f1888n;
        rectF.set(0.0f, 0.0f, f7, this.O);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f1885k != null && (this.h == null || this.f1882g != height)) {
            this.f1882g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f1885k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f1881f;
        if (radialGradient != null) {
            Matrix matrix = this.f1883i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f1889o;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.save();
        float a2 = this.I.a(0.0125f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f10, AndroidUtilities.dp(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f1885k;
        org.telegram.ui.Components.p5 p5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            p5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        m1.a(canvas, 1, p5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f10 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f1885k;
        if (stargiftattributebackdrop3 != null) {
            m12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i10 = m12;
        this.f1892r.f26031p = eVar.e - AndroidUtilities.dp(12.0f);
        f11 f11Var = this.f1892r;
        f11Var.c(f10 - (f11Var.f26021c / 2.0f), this.f1891q, 1.0f, -1, canvas);
        this.f1894t.f26031p = eVar.e - AndroidUtilities.dp(12.0f);
        f11 f11Var2 = this.f1894t;
        Canvas canvas2 = canvas;
        int i11 = i10;
        f11Var2.c(f10 - (f11Var2.f26021c / 2.0f), this.f1893s, 1.0f, i11, canvas2);
        if (this.f1899z) {
            yh.j0 j0Var = this.f1898y;
            int i12 = j0Var.f50323t;
            int i13 = j0Var.f50324u;
            int i14 = (int) (f10 - (i12 / 2.0f));
            int i15 = (int) this.f1897x;
            int i16 = i12 + i14;
            j0Var.setBounds(i14, i15, i16, i15 + i13);
            float f11 = this.f1897x;
            RectF rectF2 = this.K;
            rectF2.set(i14, f11, i16, i13 + f11);
            float a10 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            j0Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f12 = 9.0f;
            float dp = this.f1895u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f1896w;
            int size = arrayList.size();
            int i17 = 0;
            while (i17 < size) {
                int i18 = i17 + 1;
                m7 m7Var = (m7) arrayList.get(i17);
                f11 f11Var3 = m7Var.f1820b;
                float f13 = f10 - (dp / 2.0f);
                float f14 = f12;
                f11Var3.c((f13 + this.f1895u) - f11Var3.f26021c, m7Var.f1819a, 1.0f, i11, canvas2);
                canvas2 = canvas;
                m7Var.f1821c.c(f13 + this.f1895u + AndroidUtilities.dp(f14), m7Var.f1819a, 1.0f, -1, canvas2);
                i11 = i11;
                i17 = i18;
                f12 = f14;
            }
        }
        int i19 = i11;
        if (!this.f1890p) {
            float f15 = this.A;
            float a11 = org.telegram.messenger.g0.a(this.C.f26021c, AndroidUtilities.dp(30.0f), 2.0f, f10);
            float f16 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f10 - ((this.C.f26021c + AndroidUtilities.dp(30.0f)) / 2.0f), f15, a11, f16);
            Path path2 = this.E;
            path2.rewind();
            float f17 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f17, f17, Path.Direction.CW);
            int m13 = org.telegram.ui.ActionBar.h6.m1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(m13);
            float a12 = this.H.a(0.075f);
            canvas2.scale(a12, a12, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            int dp2 = ((int) rectF.right) - AndroidUtilities.dp(46.67f);
            int dp3 = ((int) rectF.top) - AndroidUtilities.dp(1.33f);
            int dp4 = AndroidUtilities.dp(1.33f) + ((int) rectF.right);
            int dp5 = AndroidUtilities.dp(46.67f) + ((int) rectF.top);
            yh.j1 j1Var = this.f1884j;
            j1Var.setBounds(dp2, dp3, dp4, dp5);
            j1Var.f50331x = i19;
            j1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f1890p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f1888n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        de deVar = this.G;
        deVar.g(rectF2);
        deVar.d();
        deVar.a(canvas, org.telegram.ui.ActionBar.h6.m1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f1879b;
        if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).N();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.S.e;
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
        float f13 = this.N;
        boolean isOutOwner = messageObject.isOutOwner();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i11 = this.f1878a;
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
        if (this.f1890p) {
            this.f1892r = new f11(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i11).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f1892r = new f11(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f1892r = new f11(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f1892r = new f11(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f1892r = new f11(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f1892r = new f11(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f1891q = (this.f1892r.j() / 2.0f) + dp2;
        float j10 = this.f1892r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f1890p) {
            f7 = 10.0f;
            f10 = 3.0f;
            this.f1894t = new f11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f11 = 2.0f;
        } else {
            f7 = 10.0f;
            f10 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f11 = 2.0f;
            this.f1894t = new f11(org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f1893s = (this.f1894t.j() / f11) + j10;
        float j11 = this.f1894t.j() + j10;
        if (this.f1890p) {
            f12 = 14.0f;
        } else {
            f12 = 11.0f;
        }
        float dp3 = j11 + AndroidUtilities.dp(f12);
        ArrayList arrayList = this.f1896w;
        arrayList.clear();
        this.f1895u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        yh.j0 j0Var = this.f1898y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = j0Var.f50309c;
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
            this.f1899z = true;
            j0Var.c(tLObject);
            j0Var.f50316m = replaceAnimatedEmoji;
            j0Var.f50322s = -1;
            j0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.M) {
                StaticLayout staticLayout = j0Var.f50317n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.M = true;
                    StaticLayout staticLayout2 = j0Var.f50317n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.N = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.N);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f1897x = dp4;
            dp3 = dp4 + j0Var.f50324u + AndroidUtilities.dp(f10);
        } else {
            this.f1899z = false;
            j0Var.c(null);
            j0Var.f50316m = null;
            j0Var.f50322s = -1;
            if (this.f1887m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                m7 m7Var = new m7(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f1887m.name);
                arrayList.add(m7Var);
                float f14 = f13 * 0.5f;
                f11 f11Var = m7Var.f1820b;
                f11Var.f26031p = f14;
                this.f1895u = Math.max(this.f1895u, f11Var.f26021c);
                f11 f11Var2 = m7Var.f1821c;
                f11Var2.f26031p = f14;
                this.v = Math.max(this.v, f11Var2.f26021c);
                dp3 += m7Var.a();
            }
            if (this.f1885k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                m7 m7Var2 = new m7(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f1885k.name);
                arrayList.add(m7Var2);
                float f15 = f13 * 0.5f;
                f11 f11Var3 = m7Var2.f1820b;
                f11Var3.f26031p = f15;
                this.f1895u = Math.max(this.f1895u, f11Var3.f26021c);
                f11 f11Var4 = m7Var2.f1821c;
                f11Var4.f26031p = f15;
                this.v = Math.max(this.v, f11Var4.f26021c);
                dp3 = m7Var2.a() + dp3;
            }
            if (this.f1886l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                m7 m7Var3 = new m7(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f1886l.name);
                arrayList.add(m7Var3);
                float f16 = f13 * 0.5f;
                f11 f11Var5 = m7Var3.f1820b;
                f11Var5.f26031p = f16;
                this.f1895u = Math.max(this.f1895u, f11Var5.f26021c);
                f11 f11Var6 = m7Var3.f1821c;
                f11Var6.f26031p = f16;
                this.v = Math.max(this.v, f11Var6.f26021c);
                dp3 += m7Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f1890p) {
            this.A = dp5;
            this.C = new f11(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
            float dp6 = AndroidUtilities.dp(30.0f);
            this.B = dp6;
            dp5 += dp6;
            dp = AndroidUtilities.dp(11.0f);
        } else {
            dp = AndroidUtilities.dp(f7);
        }
        this.O = (int) (dp5 + dp);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i10;
        float f7 = this.N;
        float dp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        int i11 = 0;
        f11 f11Var = new f11(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j10)), 14.0f, AndroidUtilities.bold());
        this.f1892r = f11Var;
        this.f1891q = (f11Var.j() / 2.0f) + dp;
        float j11 = this.f1892r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        String h = org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2);
        TLObject tLObject = null;
        f11 f11Var2 = new f11(h, 12.0f, null);
        this.f1894t = f11Var2;
        this.f1893s = (f11Var2.j() / 2.0f) + j11;
        float j12 = this.f1894t.j() + j11 + AndroidUtilities.dp(11.0f);
        this.f1896w.clear();
        this.f1895u = 0.0f;
        this.v = 0.0f;
        yh.j0 j0Var = this.f1898y;
        TextPaint textPaint = j0Var.f50309c;
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
            tLObject = MessagesController.getInstance(this.f1878a).getUserOrChat(j10);
        }
        this.f1899z = true;
        j0Var.c(tLObject);
        j0Var.f50316m = spanned;
        j0Var.f50322s = -1;
        j0Var.b(((int) f7) - AndroidUtilities.dp(24.0f));
        if (!this.M) {
            StaticLayout staticLayout = j0Var.f50317n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.M = true;
                StaticLayout staticLayout2 = j0Var.f50317n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.N = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.N);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j12 + AndroidUtilities.dp(4.0f);
        this.f1897x = dp2;
        float dp3 = dp2 + j0Var.f50324u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new f11(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.O = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
