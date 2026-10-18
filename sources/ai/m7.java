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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d11;
import org.telegram.ui.LaunchActivity;
public final class m7 {
    public float A;
    public float B;
    public d11 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final de G;
    public final org.telegram.ui.Components.yc H;
    public final org.telegram.ui.Components.yc I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public TLRPC.TL_messageActionStarGiftUnique N;
    public MessageObject O;
    public boolean P;
    public final ne.e Q;
    public e4 R;
    public final int f1818a;
    public final View f1819b;
    public final org.telegram.ui.ActionBar.d6 f1820c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.p5 e;
    public int f1822g;
    public RadialGradient h;
    public final yh.j1 f1824j;
    public TL_stars.starGiftAttributeBackdrop f1825k;
    public TL_stars.starGiftAttributePattern f1826l;
    public TL_stars.starGiftAttributeModel f1827m;
    public boolean f1830p;
    public float f1831q;
    public d11 f1832r;
    public float f1833s;
    public d11 f1834t;
    public float f1835u;
    public float v;
    public float f1837x;
    public final yh.j0 f1838y;
    public boolean f1839z;
    public final Paint f1821f = new Paint(1);
    public final Matrix f1823i = new Matrix();
    public final RectF f1828n = new RectF();
    public final Path f1829o = new Path();
    public final ArrayList f1836w = new ArrayList();

    public m7(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        yh.j0 j0Var = new yh.j0();
        this.f1838y = j0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new de(1, 25);
        this.Q = new ne.e(0, new a1.c(this, 6), bs.h, 320L);
        this.f1818a = i10;
        this.f1819b = view;
        this.f1820c = d6Var;
        this.f1824j = new yh.j1(view);
        this.H = new org.telegram.ui.Components.yc(view);
        this.I = new org.telegram.ui.Components.yc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.p5(AndroidUtilities.dp(28.0f), view);
        j0Var.f50315r = view;
        j0Var.d.setParentView(view);
    }

    public final void a() {
        this.P = true;
        if (this.N != null) {
            this.d.onAttachedToWindow();
            this.e.a();
            this.f1838y.d.onAttachedToWindow();
        }
    }

    public final void b(Canvas canvas) {
        ne.e eVar = this.Q;
        float f7 = eVar.e;
        float f10 = f7 / 2.0f;
        RectF rectF = this.f1828n;
        rectF.set(0.0f, 0.0f, f7, this.M);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f1825k != null && (this.h == null || this.f1822g != height)) {
            this.f1822g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f1825k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f1821f;
        if (radialGradient != null) {
            Matrix matrix = this.f1823i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f1829o;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f1825k;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f1825k;
        if (stargiftattributebackdrop3 != null) {
            m12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i10 = m12;
        this.f1832r.f25447p = eVar.e - AndroidUtilities.dp(12.0f);
        d11 d11Var = this.f1832r;
        d11Var.c(f10 - (d11Var.f25437c / 2.0f), this.f1831q, 1.0f, -1, canvas);
        this.f1834t.f25447p = eVar.e - AndroidUtilities.dp(12.0f);
        d11 d11Var2 = this.f1834t;
        Canvas canvas2 = canvas;
        int i11 = i10;
        d11Var2.c(f10 - (d11Var2.f25437c / 2.0f), this.f1833s, 1.0f, i11, canvas2);
        if (this.f1839z) {
            yh.j0 j0Var = this.f1838y;
            int i12 = j0Var.f50317t;
            int i13 = j0Var.f50318u;
            int i14 = (int) (f10 - (i12 / 2.0f));
            int i15 = (int) this.f1837x;
            j0Var.setBounds(i14, i15, i12 + i14, i13 + i15);
            j0Var.draw(canvas2);
        } else {
            float f11 = 9.0f;
            float dp = this.f1835u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f1836w;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                l7 l7Var = (l7) arrayList.get(i16);
                d11 d11Var3 = l7Var.f1767b;
                float f12 = f10 - (dp / 2.0f);
                float f13 = f11;
                d11Var3.c((f12 + this.f1835u) - d11Var3.f25437c, l7Var.f1766a, 1.0f, i11, canvas2);
                canvas2 = canvas;
                l7Var.f1768c.c(f12 + this.f1835u + AndroidUtilities.dp(f13), l7Var.f1766a, 1.0f, -1, canvas2);
                i11 = i11;
                i16 = i17;
                f11 = f13;
            }
        }
        int i18 = i11;
        if (!this.f1830p) {
            float f14 = this.A;
            float a10 = org.telegram.messenger.g0.a(this.C.f25437c, AndroidUtilities.dp(30.0f), 2.0f, f10);
            float f15 = this.A + this.B;
            RectF rectF2 = this.D;
            rectF2.set(f10 - ((this.C.f25437c + AndroidUtilities.dp(30.0f)) / 2.0f), f14, a10, f15);
            Path path2 = this.E;
            path2.rewind();
            float f16 = this.B / 2.0f;
            path2.addRoundRect(rectF2, f16, f16, Path.Direction.CW);
            int m13 = org.telegram.ui.ActionBar.h6.m1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(m13);
            float a11 = this.H.a(0.075f);
            canvas2.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            int dp2 = ((int) rectF.right) - AndroidUtilities.dp(46.67f);
            int dp3 = ((int) rectF.top) - AndroidUtilities.dp(1.33f);
            int dp4 = AndroidUtilities.dp(1.33f) + ((int) rectF.right);
            int dp5 = AndroidUtilities.dp(46.67f) + ((int) rectF.top);
            yh.j1 j1Var = this.f1824j;
            j1Var.setBounds(dp2, dp3, dp4, dp5);
            j1Var.f50325x = i18;
            j1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f1830p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f1828n;
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
        View view = this.f1819b;
        if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).N();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.Q.e;
    }

    public final boolean e(float f7, float f10, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean contains = this.D.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        boolean contains2 = this.f1828n.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        int action = motionEvent.getAction();
        org.telegram.ui.Components.yc ycVar = this.H;
        org.telegram.ui.Components.yc ycVar2 = this.I;
        if (action == 0) {
            if (contains2 && !contains) {
                z11 = true;
            } else {
                z11 = false;
            }
            ycVar2.c(z11);
            ycVar.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (ycVar.f32606i && !contains) {
                ycVar.c(false);
            } else if (ycVar2.f32606i && !contains2) {
                ycVar2.c(false);
            }
        } else if (motionEvent.getAction() == 1 && ((z10 = ycVar.f32606i) || ycVar2.f32606i)) {
            e4 e4Var = this.R;
            if (e4Var != null) {
                if (z10) {
                    e4Var.run();
                }
            } else if (this.J) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.messenger.g0.q(R.string.UniqueGiftNotFoundBurned, org.telegram.ui.Components.xc.a0(U), R.raw.fire_on, 36);
                }
            } else {
                k7 k7Var = new k7(this.f1819b.getContext(), this.f1818a, this.O.getDialogId(), this.f1820c, null);
                k7Var.E2(this.O, null);
                k7Var.show();
            }
            ycVar.c(false);
            ycVar2.c(false);
            return true;
        } else if (motionEvent.getAction() == 3 && (ycVar.f32606i || ycVar2.f32606i)) {
            ycVar.c(false);
            ycVar2.c(false);
            return true;
        }
        if (ycVar.f32606i || ycVar2.f32606i) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.m7.f(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void g(MessageObject messageObject, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long dialogId;
        float f7;
        float f10;
        float f11;
        float f12;
        int dp;
        int i10;
        float f13 = this.L;
        boolean isOutOwner = messageObject.isOutOwner();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i11 = this.f1818a;
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
        if (this.f1830p) {
            this.f1832r = new d11(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i11).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f1832r = new d11(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f1832r = new d11(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f1832r = new d11(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f1832r = new d11(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f1832r = new d11(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f1831q = (this.f1832r.j() / 2.0f) + dp2;
        float j10 = this.f1832r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f1830p) {
            f7 = 10.0f;
            f10 = 3.0f;
            this.f1834t = new d11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f11 = 2.0f;
        } else {
            f7 = 10.0f;
            f10 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f11 = 2.0f;
            this.f1834t = new d11(org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f1833s = (this.f1834t.j() / f11) + j10;
        float j11 = this.f1834t.j() + j10;
        if (this.f1830p) {
            f12 = 14.0f;
        } else {
            f12 = 11.0f;
        }
        float dp3 = j11 + AndroidUtilities.dp(f12);
        ArrayList arrayList = this.f1836w;
        arrayList.clear();
        this.f1835u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        yh.j0 j0Var = this.f1838y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = j0Var.f50303c;
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
            this.f1839z = true;
            j0Var.c(tLObject);
            j0Var.f50310m = replaceAnimatedEmoji;
            j0Var.f50316s = -1;
            j0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.K) {
                StaticLayout staticLayout = j0Var.f50311n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.K = true;
                    StaticLayout staticLayout2 = j0Var.f50311n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.L = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.L);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f1837x = dp4;
            dp3 = dp4 + j0Var.f50318u + AndroidUtilities.dp(f10);
        } else {
            this.f1839z = false;
            j0Var.c(null);
            j0Var.f50310m = null;
            j0Var.f50316s = -1;
            if (this.f1827m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                l7 l7Var = new l7(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f1827m.name);
                arrayList.add(l7Var);
                float f14 = f13 * 0.5f;
                d11 d11Var = l7Var.f1767b;
                d11Var.f25447p = f14;
                this.f1835u = Math.max(this.f1835u, d11Var.f25437c);
                d11 d11Var2 = l7Var.f1768c;
                d11Var2.f25447p = f14;
                this.v = Math.max(this.v, d11Var2.f25437c);
                dp3 += l7Var.a();
            }
            if (this.f1825k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                l7 l7Var2 = new l7(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f1825k.name);
                arrayList.add(l7Var2);
                float f15 = f13 * 0.5f;
                d11 d11Var3 = l7Var2.f1767b;
                d11Var3.f25447p = f15;
                this.f1835u = Math.max(this.f1835u, d11Var3.f25437c);
                d11 d11Var4 = l7Var2.f1768c;
                d11Var4.f25447p = f15;
                this.v = Math.max(this.v, d11Var4.f25437c);
                dp3 = l7Var2.a() + dp3;
            }
            if (this.f1826l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                l7 l7Var3 = new l7(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f1826l.name);
                arrayList.add(l7Var3);
                float f16 = f13 * 0.5f;
                d11 d11Var5 = l7Var3.f1767b;
                d11Var5.f25447p = f16;
                this.f1835u = Math.max(this.f1835u, d11Var5.f25437c);
                d11 d11Var6 = l7Var3.f1768c;
                d11Var6.f25447p = f16;
                this.v = Math.max(this.v, d11Var6.f25437c);
                dp3 += l7Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f1830p) {
            this.A = dp5;
            this.C = new d11(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
            float dp6 = AndroidUtilities.dp(30.0f);
            this.B = dp6;
            dp5 += dp6;
            dp = AndroidUtilities.dp(11.0f);
        } else {
            dp = AndroidUtilities.dp(f7);
        }
        this.M = (int) (dp5 + dp);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i10;
        float f7 = this.L;
        float dp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        int i11 = 0;
        d11 d11Var = new d11(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j10)), 14.0f, AndroidUtilities.bold());
        this.f1832r = d11Var;
        this.f1831q = (d11Var.j() / 2.0f) + dp;
        float j11 = this.f1832r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        String h = org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2);
        TLObject tLObject = null;
        d11 d11Var2 = new d11(h, 12.0f, null);
        this.f1834t = d11Var2;
        this.f1833s = (d11Var2.j() / 2.0f) + j11;
        float j12 = this.f1834t.j() + j11 + AndroidUtilities.dp(11.0f);
        this.f1836w.clear();
        this.f1835u = 0.0f;
        this.v = 0.0f;
        yh.j0 j0Var = this.f1838y;
        TextPaint textPaint = j0Var.f50303c;
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
            tLObject = MessagesController.getInstance(this.f1818a).getUserOrChat(j10);
        }
        this.f1839z = true;
        j0Var.c(tLObject);
        j0Var.f50310m = spanned;
        j0Var.f50316s = -1;
        j0Var.b(((int) f7) - AndroidUtilities.dp(24.0f));
        if (!this.K) {
            StaticLayout staticLayout = j0Var.f50311n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.K = true;
                StaticLayout staticLayout2 = j0Var.f50311n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.L = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.L);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j12 + AndroidUtilities.dp(4.0f);
        this.f1837x = dp2;
        float dp3 = dp2 + j0Var.f50318u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new d11(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.M = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
