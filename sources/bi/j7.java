package bi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.q11;
public final class j7 {
    public float A;
    public float B;
    public q11 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final td G;
    public final org.telegram.ui.Components.xc H;
    public final org.telegram.ui.Components.xc I;
    public final org.telegram.ui.Components.xc J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public MessageObject R;
    public boolean S;
    public final oe.e T;
    public a4 U;
    public a4 V;
    public final int f4875a;
    public final View f4876b;
    public final org.telegram.ui.ActionBar.u6 f4877c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.r5 e;
    public int f4879g;
    public RadialGradient h;
    public final zh.j1 f4881j;
    public TL_stars.starGiftAttributeBackdrop f4882k;
    public TL_stars.starGiftAttributePattern f4883l;
    public TL_stars.starGiftAttributeModel f4884m;
    public boolean f4887p;
    public float f4888q;
    public q11 f4889r;
    public float f4890s;
    public q11 f4891t;
    public float f4892u;
    public float v;
    public float f4894x;
    public final zh.j0 f4895y;
    public boolean f4896z;
    public final Paint f4878f = new Paint(1);
    public final Matrix f4880i = new Matrix();
    public final RectF f4885n = new RectF();
    public final Path f4886o = new Path();
    public final ArrayList f4893w = new ArrayList();

    public j7(int i10, View view, org.telegram.ui.ActionBar.u6 u6Var) {
        zh.j0 j0Var = new zh.j0();
        this.f4895y = j0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new td(1, 25);
        this.K = new RectF();
        this.T = new oe.e(0, new a1.c(this, 8), ds.h, 320L);
        this.f4875a = i10;
        this.f4876b = view;
        this.f4877c = u6Var;
        this.f4881j = new zh.j1(view);
        this.H = new org.telegram.ui.Components.xc(view);
        this.I = new org.telegram.ui.Components.xc(view);
        this.J = new org.telegram.ui.Components.xc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.r5(AndroidUtilities.dp(28.0f), view);
        j0Var.f53066r = view;
        j0Var.d.setParentView(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.onAttachedToWindow();
            this.e.a();
            this.f4895y.d.onAttachedToWindow();
        }
    }

    public final void b(Canvas canvas) {
        boolean z10 = this.L;
        zh.j1 j1Var = this.f4881j;
        if (z10 && j1Var != null) {
            int i10 = this.M;
            int i11 = org.telegram.ui.ActionBar.f7.f22628b;
            if (i10 != i11) {
                this.M = i11;
                try {
                    int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23598q7, this.f4877c);
                    Paint paint = (Paint) j1Var.f27245b;
                    paint.setShader(null);
                    paint.setColor(w02);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        oe.e eVar = this.T;
        float f7 = eVar.f19334f;
        float f10 = f7 / 2.0f;
        RectF rectF = this.f4885n;
        rectF.set(0.0f, 0.0f, f7, this.P);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f4882k != null && (this.h == null || this.f4879g != height)) {
            this.f4879g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f4882k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint2 = this.f4878f;
        if (radialGradient != null) {
            Matrix matrix = this.f4880i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint2.setShader(this.h);
        }
        Path path = this.f4886o;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f4882k;
        org.telegram.ui.Components.r5 r5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            r5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        l1.a(canvas, 1, r5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f10 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f4882k;
        if (stargiftattributebackdrop3 != null) {
            o12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i12 = o12;
        this.f4889r.f31800p = eVar.f19334f - AndroidUtilities.dp(12.0f);
        q11 q11Var = this.f4889r;
        q11Var.c(f10 - (q11Var.f31790c / 2.0f), this.f4888q, 1.0f, -1, canvas);
        this.f4891t.f31800p = eVar.f19334f - AndroidUtilities.dp(12.0f);
        q11 q11Var2 = this.f4891t;
        Canvas canvas2 = canvas;
        int i13 = i12;
        q11Var2.c(f10 - (q11Var2.f31790c / 2.0f), this.f4890s, 1.0f, i13, canvas2);
        if (this.f4896z) {
            zh.j0 j0Var = this.f4895y;
            int i14 = j0Var.f53068t;
            int i15 = j0Var.f53069u;
            int i16 = (int) (f10 - (i14 / 2.0f));
            int i17 = (int) this.f4894x;
            int i18 = i14 + i16;
            j0Var.setBounds(i16, i17, i18, i17 + i15);
            float f11 = this.f4894x;
            RectF rectF2 = this.K;
            rectF2.set(i16, f11, i18, i15 + f11);
            float a10 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            j0Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f12 = 9.0f;
            float dp = this.f4892u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f4893w;
            int size = arrayList.size();
            int i19 = 0;
            while (i19 < size) {
                int i20 = i19 + 1;
                i7 i7Var = (i7) arrayList.get(i19);
                q11 q11Var3 = i7Var.f4830b;
                float f13 = f10 - (dp / 2.0f);
                float f14 = f12;
                q11Var3.c((f13 + this.f4892u) - q11Var3.f31790c, i7Var.f4829a, 1.0f, i13, canvas2);
                canvas2 = canvas;
                i7Var.f4831c.c(f13 + this.f4892u + AndroidUtilities.dp(f14), i7Var.f4829a, 1.0f, -1, canvas2);
                i13 = i13;
                i19 = i20;
                f12 = f14;
            }
        }
        int i21 = i13;
        if (!this.f4887p) {
            float f15 = this.A;
            float b10 = org.telegram.messenger.t.b(this.C.f31790c, AndroidUtilities.dp(30.0f), 2.0f, f10);
            float f16 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f10 - ((this.C.f31790c + AndroidUtilities.dp(30.0f)) / 2.0f), f15, b10, f16);
            Path path2 = this.E;
            path2.rewind();
            float f17 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f17, f17, Path.Direction.CW);
            int o13 = org.telegram.ui.ActionBar.y6.o1(0.13f, -16777216);
            Paint paint3 = this.F;
            paint3.setColor(o13);
            float a11 = this.H.a(0.075f);
            canvas2.scale(a11, a11, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint3);
            canvas2.restore();
            j1Var.setBounds(((int) rectF.right) - AndroidUtilities.dp(46.67f), ((int) rectF.top) - AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f) + ((int) rectF.right), AndroidUtilities.dp(46.67f) + ((int) rectF.top));
            j1Var.f53076x = i21;
            j1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f4887p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f4885n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        td tdVar = this.G;
        tdVar.g(rectF2);
        tdVar.d();
        tdVar.a(canvas, org.telegram.ui.ActionBar.y6.o1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f4876b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).M();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f19334f;
    }

    public final boolean e(float r18, float r19, android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: bi.j7.e(float, float, android.view.MotionEvent):boolean");
    }

    public final void f(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: bi.j7.f(org.telegram.messenger.MessageObject, boolean):void");
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
        int i11 = this.f4875a;
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
        if (this.f4887p) {
            this.f4889r = new q11(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i11).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f4889r = new q11(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f4889r = new q11(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f4889r = new q11(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f4889r = new q11(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f4889r = new q11(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f4888q = (this.f4889r.j() / 2.0f) + dp2;
        float j10 = this.f4889r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f4887p) {
            f7 = 10.0f;
            f10 = 3.0f;
            this.f4891t = new q11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f11 = 2.0f;
        } else {
            f7 = 10.0f;
            f10 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f11 = 2.0f;
            this.f4891t = new q11(org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f4890s = (this.f4891t.j() / f11) + j10;
        float j11 = this.f4891t.j() + j10;
        if (this.f4887p) {
            f12 = 14.0f;
        } else {
            f12 = 11.0f;
        }
        float dp3 = j11 + AndroidUtilities.dp(f12);
        ArrayList arrayList = this.f4893w;
        arrayList.clear();
        this.f4892u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        zh.j0 j0Var = this.f4895y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = j0Var.f53054c;
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
            this.f4896z = true;
            j0Var.c(tLObject);
            j0Var.f53061m = replaceAnimatedEmoji;
            j0Var.f53067s = -1;
            j0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = j0Var.f53062n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.N = true;
                    StaticLayout staticLayout2 = j0Var.f53062n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.O = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.O);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f4894x = dp4;
            dp3 = dp4 + j0Var.f53069u + AndroidUtilities.dp(f10);
        } else {
            this.f4896z = false;
            j0Var.c(null);
            j0Var.f53061m = null;
            j0Var.f53067s = -1;
            if (this.f4884m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                i7 i7Var = new i7(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f4884m.name);
                arrayList.add(i7Var);
                float f14 = f13 * 0.5f;
                q11 q11Var = i7Var.f4830b;
                q11Var.f31800p = f14;
                this.f4892u = Math.max(this.f4892u, q11Var.f31790c);
                q11 q11Var2 = i7Var.f4831c;
                q11Var2.f31800p = f14;
                this.v = Math.max(this.v, q11Var2.f31790c);
                dp3 += i7Var.a();
            }
            if (this.f4882k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                i7 i7Var2 = new i7(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f4882k.name);
                arrayList.add(i7Var2);
                float f15 = f13 * 0.5f;
                q11 q11Var3 = i7Var2.f4830b;
                q11Var3.f31800p = f15;
                this.f4892u = Math.max(this.f4892u, q11Var3.f31790c);
                q11 q11Var4 = i7Var2.f4831c;
                q11Var4.f31800p = f15;
                this.v = Math.max(this.v, q11Var4.f31790c);
                dp3 = i7Var2.a() + dp3;
            }
            if (this.f4883l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                i7 i7Var3 = new i7(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f4883l.name);
                arrayList.add(i7Var3);
                float f16 = f13 * 0.5f;
                q11 q11Var5 = i7Var3.f4830b;
                q11Var5.f31800p = f16;
                this.f4892u = Math.max(this.f4892u, q11Var5.f31790c);
                q11 q11Var6 = i7Var3.f4831c;
                q11Var6.f31800p = f16;
                this.v = Math.max(this.v, q11Var6.f31790c);
                dp3 += i7Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f4887p) {
            this.A = dp5;
            this.C = new q11(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
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
        q11 q11Var = new q11(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j10)), 14.0f, AndroidUtilities.bold());
        this.f4889r = q11Var;
        this.f4888q = (q11Var.j() / 2.0f) + dp;
        float j11 = this.f4889r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        String i12 = org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2);
        TLObject tLObject = null;
        q11 q11Var2 = new q11(i12, 12.0f, null);
        this.f4891t = q11Var2;
        this.f4890s = (q11Var2.j() / 2.0f) + j11;
        float j12 = this.f4891t.j() + j11 + AndroidUtilities.dp(11.0f);
        this.f4893w.clear();
        this.f4892u = 0.0f;
        this.v = 0.0f;
        zh.j0 j0Var = this.f4895y;
        TextPaint textPaint = j0Var.f53054c;
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
            tLObject = MessagesController.getInstance(this.f4875a).getUserOrChat(j10);
        }
        this.f4896z = true;
        j0Var.c(tLObject);
        j0Var.f53061m = spanned;
        j0Var.f53067s = -1;
        j0Var.b(((int) f7) - AndroidUtilities.dp(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = j0Var.f53062n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.N = true;
                StaticLayout staticLayout2 = j0Var.f53062n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.O = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j12 + AndroidUtilities.dp(4.0f);
        this.f4894x = dp2;
        float dp3 = dp2 + j0Var.f53069u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new q11(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.P = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
