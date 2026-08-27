package hh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.LaunchActivity;

public final class k5 {
    public float A;
    public float B;
    public pz0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final bb G;
    public final nc H;
    public final nc I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public TLRPC.TL_messageActionStarGiftUnique N;
    public MessageObject O;
    public boolean P;
    public final ud.c Q;
    public gh.q0 R;

    public final int f9581a;

    public final View f9582b;

    public final org.telegram.ui.ActionBar.c6 f9583c;
    public final ImageReceiver d;

    public final org.telegram.ui.Components.i5 f9584e;

    public int f9586g;
    public RadialGradient h;

    public final gh.e2 f9588j;

    public TL_stars.starGiftAttributeBackdrop f9589k;

    public TL_stars.starGiftAttributePattern f9590l;

    public TL_stars.starGiftAttributeModel f9591m;

    public boolean f9594p;

    public float f9595q;

    public pz0 f9596r;

    public float f9597s;

    public pz0 f9598t;

    public float f9599u;
    public float v;

    public float f9601x;

    public final gh.y0 f9602y;

    public boolean f9603z;

    public final Paint f9585f = new Paint(1);

    public final Matrix f9587i = new Matrix();

    public final RectF f9592n = new RectF();

    public final Path f9593o = new Path();

    public final ArrayList f9600w = new ArrayList();

    public k5(int i10, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        gh.y0 y0Var = new gh.y0();
        this.f9602y = y0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new bb(1, 25);
        this.Q = new ud.c(0, new h3.x(this, 8), er.h, 320L);
        this.f9581a = i10;
        this.f9582b = view;
        this.f9583c = c6Var;
        this.f9588j = new gh.e2(view);
        this.H = new nc(view);
        this.I = new nc(view);
        this.d = new ImageReceiver(view);
        this.f9584e = new org.telegram.ui.Components.i5(AndroidUtilities.dp(28.0f), view);
        y0Var.f7649r = view;
        y0Var.d.setParentView(view);
    }

    public final void a(Canvas canvas) {
        ud.c cVar = this.Q;
        float f10 = cVar.f48502e;
        float f11 = f10 / 2.0f;
        float f12 = this.M;
        RectF rectF = this.f9592n;
        rectF.set(0.0f, 0.0f, f10, f12);
        int iHeight = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f9589k != null && (this.h == null || this.f9586g != iHeight)) {
            this.f9586g = iHeight;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f9589k;
            this.h = new RadialGradient(0.0f, 0.0f, iHeight, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f9585f;
        if (radialGradient != null) {
            Matrix matrix = this.f9587i;
            matrix.reset();
            matrix.postTranslate(f11, f11);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f9593o;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.save();
        float fA = this.I.a(0.0125f);
        canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f11, AndroidUtilities.dp(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f9589k;
        org.telegram.ui.Components.i5 i5Var = this.f9584e;
        if (stargiftattributebackdrop2 != null) {
            i5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        y0.a(canvas, 1, i5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        float fDp = f11 - (AndroidUtilities.dp(110.0f) / 2.0f);
        float fDp2 = AndroidUtilities.dp(10.0f);
        float fDp3 = AndroidUtilities.dp(110.0f);
        float fDp4 = AndroidUtilities.dp(110.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(fDp, fDp2, fDp3, fDp4);
        imageReceiver.draw(canvas);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f9589k;
        if (stargiftattributebackdrop3 != null) {
            iL1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i10 = iL1;
        this.f9596r.f31708p = cVar.f48502e - AndroidUtilities.dp(12.0f);
        pz0 pz0Var = this.f9596r;
        pz0Var.c(f11 - (pz0Var.f31697c / 2.0f), this.f9595q, 1.0f, -1, canvas);
        this.f9598t.f31708p = cVar.f48502e - AndroidUtilities.dp(12.0f);
        pz0 pz0Var2 = this.f9598t;
        Canvas canvas2 = canvas;
        int i11 = i10;
        pz0Var2.c(f11 - (pz0Var2.f31697c / 2.0f), this.f9597s, 1.0f, i11, canvas2);
        if (this.f9603z) {
            gh.y0 y0Var = this.f9602y;
            int i12 = y0Var.f7651t;
            int i13 = y0Var.f7652u;
            int i14 = (int) (f11 - (i12 / 2.0f));
            int i15 = (int) this.f9601x;
            y0Var.setBounds(i14, i15, i12 + i14, i13 + i15);
            y0Var.draw(canvas2);
        } else {
            float fDp5 = this.f9599u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f9600w;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                j5 j5Var = (j5) arrayList.get(i16);
                pz0 pz0Var3 = j5Var.f9528b;
                float f13 = f11 - (fDp5 / 2.0f);
                pz0Var3.c((f13 + this.f9599u) - pz0Var3.f31697c, j5Var.f9527a, 1.0f, i11, canvas2);
                canvas2 = canvas;
                j5Var.f9529c.c(f13 + this.f9599u + AndroidUtilities.dp(9.0f), j5Var.f9527a, 1.0f, -1, canvas2);
                i11 = i11;
                i16 = i17;
            }
        }
        int i18 = i11;
        if (!this.f9594p) {
            float fDp6 = f11 - ((this.C.f31697c + AndroidUtilities.dp(30.0f)) / 2.0f);
            float f14 = this.A;
            float fC = i0.a.c(this.C.f31697c, AndroidUtilities.dp(30.0f), 2.0f, f11);
            float f15 = this.A + this.B;
            RectF rectF2 = this.D;
            rectF2.set(fDp6, f14, fC, f15);
            Path path2 = this.E;
            path2.rewind();
            float f16 = this.B / 2.0f;
            path2.addRoundRect(rectF2, f16, f16, Path.Direction.CW);
            int iL2 = org.telegram.ui.ActionBar.g6.l1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(iL2);
            float fA2 = this.H.a(0.075f);
            canvas2.scale(fA2, fA2, rectF2.centerX(), rectF2.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            int iDp = ((int) rectF.right) - AndroidUtilities.dp(46.67f);
            int iDp2 = ((int) rectF.top) - AndroidUtilities.dp(1.33f);
            int iDp3 = AndroidUtilities.dp(1.33f) + ((int) rectF.right);
            int iDp4 = AndroidUtilities.dp(46.67f) + ((int) rectF.top);
            gh.e2 e2Var = this.f9588j;
            e2Var.setBounds(iDp, iDp2, iDp3, iDp4);
            e2Var.h = i18;
            e2Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void b(Canvas canvas) {
        if (this.f9594p) {
            return;
        }
        canvas.save();
        float fA = this.I.a(0.0125f);
        RectF rectF = this.f9592n;
        canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
        float fA2 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(fA2, fA2, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        bb bbVar = this.G;
        bbVar.g(rectF2);
        bbVar.d();
        bbVar.a(canvas, org.telegram.ui.ActionBar.g6.l1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f9582b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).K();
        } else {
            view.invalidate();
        }
    }

    public final float c() {
        return this.Q.f48502e;
    }

    public final boolean d() {
        return this.N != null;
    }

    public final boolean e(float f10, float f11, MotionEvent motionEvent) {
        boolean z10;
        boolean zContains = this.D.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        boolean zContains2 = this.f9592n.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        int action = motionEvent.getAction();
        nc ncVar = this.H;
        nc ncVar2 = this.I;
        if (action == 0) {
            ncVar2.c(zContains2 && !zContains);
            ncVar.c(zContains);
        } else if (motionEvent.getAction() == 2) {
            if (ncVar.h && !zContains) {
                ncVar.c(false);
            } else if (ncVar2.h && !zContains2) {
                ncVar2.c(false);
            }
        } else {
            if (motionEvent.getAction() == 1 && ((z10 = ncVar.h) || ncVar2.h)) {
                gh.q0 q0Var = this.R;
                if (q0Var != null) {
                    if (z10) {
                        q0Var.run();
                    }
                } else if (this.J) {
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    if (n2VarU != null) {
                        org.telegram.messenger.y1.q(R.string.UniqueGiftNotFoundBurned, mc.a0(n2VarU), R.raw.fire_on, 36);
                    }
                } else {
                    i5 i5Var = new i5(this.f9582b.getContext(), this.f9581a, this.O.getDialogId(), this.f9583c, null);
                    i5Var.i2(this.O, null);
                    i5Var.show();
                }
                ncVar.c(false);
                ncVar2.c(false);
                return true;
            }
            if (motionEvent.getAction() == 3 && (ncVar.h || ncVar2.h)) {
                ncVar.c(false);
                ncVar2.c(false);
                return true;
            }
        }
        return ncVar.h || ncVar2.h;
    }

    public final void f(MessageObject messageObject, boolean z10) {
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique;
        TLRPC.Message message;
        this.K = false;
        this.O = messageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            tL_messageActionStarGiftUnique = null;
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            } else {
                tL_messageActionStarGiftUnique = null;
            }
        }
        if (tL_messageActionStarGiftUnique == null || tL_messageActionStarGiftUnique.refunded || !(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
            tL_messageActionStarGiftUnique = null;
        }
        boolean z11 = this.P;
        org.telegram.ui.Components.i5 i5Var = this.f9584e;
        ImageReceiver imageReceiver = this.d;
        if (z11 && tL_messageActionStarGiftUnique != null && this.N == null) {
            imageReceiver.onAttachedToWindow();
            i5Var.a();
            this.f9602y.d.onAttachedToWindow();
        }
        this.N = tL_messageActionStarGiftUnique;
        this.f9594p = messageObject != null && messageObject.isRepostPreview;
        if (tL_messageActionStarGiftUnique == null) {
            return;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
        this.f9589k = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f9590l = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = this.f9591m;
        this.f9591m = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        this.h = null;
        this.f9585f.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = this.f9590l;
        if (stargiftattributepattern != null) {
            i5Var.i(stargiftattributepattern.document, z10);
        } else {
            i5Var.g(null, z10);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = this.f9591m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f22386id != stargiftattributemodel2.document.f22386id)) {
            if (this.f9594p) {
                imageReceiver.setAllowStartLottieAnimation(true);
                imageReceiver.setAllowStartAnimation(true);
                imageReceiver.setAutoRepeat(1);
            } else {
                imageReceiver.setAutoRepeatCount(0);
                imageReceiver.clearDecorators();
                imageReceiver.setAutoRepeat(0);
            }
            oa.Z0(imageReceiver, this.f9591m.document, 110);
        }
        boolean z12 = tL_starGiftUnique.burned;
        this.J = z12;
        gh.e2 e2Var = this.f9588j;
        if (z12) {
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, this.f9583c);
            Paint paint = e2Var.f28431a;
            paint.setShader(null);
            paint.setColor(iV0);
            e2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            e2Var.d(this.f9589k, true, false);
            e2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (this.f9594p) {
            this.L = AndroidUtilities.dp(200.0f);
        } else {
            this.L = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
            if (!AndroidUtilities.isTablet()) {
                this.L = (int) (this.L * 1.2f);
            }
            this.L -= AndroidUtilities.dp(8.0f);
        }
        g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
        ud.c cVar = this.Q;
        if (!z10) {
            cVar.c(this.L);
            return;
        }
        int iRound = Math.round(cVar.f48504g ? cVar.f48503f : cVar.f48502e);
        int i10 = this.L;
        if (iRound != i10) {
            cVar.a(i10);
        }
    }

    public final void g(MessageObject messageObject, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        float f10;
        float f11;
        float f12;
        int iDp;
        float f13 = this.L;
        boolean zIsOutOwner = messageObject.isOutOwner();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i10 = this.f9581a;
        long clientUserId = z10 == zIsOutOwner ? UserConfig.getInstance(i10).getClientUserId() : messageObject.getDialogId();
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            clientUserId = DialogObject.getPeerDialogId(peer);
        }
        String shortName = DialogObject.getShortName(clientUserId);
        float fDp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        if (this.f9594p) {
            this.f9596r = new pz0(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer != null || UserObject.isService(messageObject.getDialogId())) {
            this.f9596r = new pz0(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        } else if (messageObject.getDialogId() != UserConfig.getInstance(i10).getClientUserId()) {
            this.f9596r = new pz0(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
        } else if (tL_starGiftUnique.crafted) {
            this.f9596r = new pz0(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
            this.f9596r = new pz0(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
        } else {
            this.f9596r = new pz0(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
        }
        this.f9595q = (this.f9596r.j() / 2.0f) + fDp;
        float fJ = this.f9596r.j() + fDp + AndroidUtilities.dp(3.0f);
        TLObject userOrChat = null;
        if (this.f9594p) {
            f10 = 10.0f;
            f11 = 3.0f;
            this.f9598t = new pz0(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f12 = 2.0f;
        } else {
            f10 = 10.0f;
            f11 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f12 = 2.0f;
            this.f9598t = new pz0(i0.a.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f9597s = (this.f9598t.j() / f12) + fJ;
        float fJ2 = this.f9598t.j() + fJ + AndroidUtilities.dp(this.f9594p ? 14.0f : 11.0f);
        ArrayList arrayList = this.f9600w;
        arrayList.clear();
        this.f9599u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        gh.y0 y0Var = this.f9602y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = y0Var.f7636c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false);
            Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
            if (!tL_messageActionStarGiftUnique.name_hidden) {
                userOrChat = tL_messageActionStarGiftUnique.from_id != null ? MessagesController.getInstance(i10).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.from_id)) : MessagesController.getInstance(i10).getUserOrChat(messageObject.getFromChatId());
            }
            this.f9603z = true;
            y0Var.c(userOrChat);
            y0Var.f7644m = spannableReplaceAnimatedEmoji;
            y0Var.f7650s = -1;
            y0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.K) {
                StaticLayout staticLayout = y0Var.f7645n;
                if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                    this.K = true;
                    StaticLayout staticLayout2 = y0Var.f7645n;
                    this.L = (int) ((Math.min(0.4f, ((staticLayout2 != null ? staticLayout2.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.L);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float fDp2 = fJ2 + AndroidUtilities.dp(4.0f);
            this.f9601x = fDp2;
            fJ2 = fDp2 + y0Var.f7652u + AndroidUtilities.dp(f11);
        } else {
            this.f9603z = false;
            y0Var.c(null);
            y0Var.f7644m = null;
            y0Var.f7650s = -1;
            if (this.f9591m != null) {
                if (!arrayList.isEmpty()) {
                    fJ2 += AndroidUtilities.dp(6.0f);
                }
                j5 j5Var = new j5(fJ2, LocaleController.getString(R.string.Gift2AttributeModel), this.f9591m.name);
                arrayList.add(j5Var);
                float f14 = f13 * 0.5f;
                pz0 pz0Var = j5Var.f9528b;
                pz0Var.f31708p = f14;
                this.f9599u = Math.max(this.f9599u, pz0Var.f31697c);
                pz0 pz0Var2 = j5Var.f9529c;
                pz0Var2.f31708p = f14;
                this.v = Math.max(this.v, pz0Var2.f31697c);
                fJ2 += j5Var.a();
            }
            if (this.f9589k != null) {
                if (!arrayList.isEmpty()) {
                    fJ2 += AndroidUtilities.dp(6.0f);
                }
                j5 j5Var2 = new j5(fJ2, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f9589k.name);
                arrayList.add(j5Var2);
                float f15 = f13 * 0.5f;
                pz0 pz0Var3 = j5Var2.f9528b;
                pz0Var3.f31708p = f15;
                this.f9599u = Math.max(this.f9599u, pz0Var3.f31697c);
                pz0 pz0Var4 = j5Var2.f9529c;
                pz0Var4.f31708p = f15;
                this.v = Math.max(this.v, pz0Var4.f31697c);
                fJ2 = j5Var2.a() + fJ2;
            }
            if (this.f9590l != null) {
                if (!arrayList.isEmpty()) {
                    fJ2 += AndroidUtilities.dp(6.0f);
                }
                j5 j5Var3 = new j5(fJ2, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f9590l.name);
                arrayList.add(j5Var3);
                float f16 = f13 * 0.5f;
                pz0 pz0Var5 = j5Var3.f9528b;
                pz0Var5.f31708p = f16;
                this.f9599u = Math.max(this.f9599u, pz0Var5.f31697c);
                pz0 pz0Var6 = j5Var3.f9529c;
                pz0Var6.f31708p = f16;
                this.v = Math.max(this.v, pz0Var6.f31697c);
                fJ2 += j5Var3.a();
            }
        }
        float fDp3 = fJ2 + AndroidUtilities.dp(11.66f);
        if (this.f9594p) {
            iDp = AndroidUtilities.dp(f10);
        } else {
            this.A = fDp3;
            this.C = new pz0(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
            float fDp4 = AndroidUtilities.dp(30.0f);
            this.B = fDp4;
            fDp3 += fDp4;
            iDp = AndroidUtilities.dp(11.0f);
        }
        this.M = (int) (fDp3 + iDp);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spannable spannableReplaceAnimatedEmoji;
        float f10 = this.L;
        float fDp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        pz0 pz0Var = new pz0(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j10)), 14.0f, AndroidUtilities.bold());
        this.f9596r = pz0Var;
        this.f9595q = (pz0Var.j() / 2.0f) + fDp;
        float fJ = this.f9596r.j() + fDp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        pz0 pz0Var2 = new pz0(i0.a.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.f9598t = pz0Var2;
        this.f9597s = (pz0Var2.j() / 2.0f) + fJ;
        float fJ2 = this.f9598t.j() + fJ + AndroidUtilities.dp(11.0f);
        this.f9600w.clear();
        this.f9599u = 0.0f;
        this.v = 0.0f;
        gh.y0 y0Var = this.f9602y;
        TextPaint textPaint = y0Var.f7636c;
        if (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.GiftMessageHint));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder.length(), 33);
            spannableReplaceAnimatedEmoji = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false);
            spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
        }
        TLObject userOrChat = j10 != 0 ? MessagesController.getInstance(this.f9581a).getUserOrChat(j10) : null;
        this.f9603z = true;
        y0Var.c(userOrChat);
        y0Var.f7644m = spannableReplaceAnimatedEmoji;
        y0Var.f7650s = -1;
        y0Var.b(((int) f10) - AndroidUtilities.dp(24.0f));
        if (!this.K) {
            StaticLayout staticLayout = y0Var.f7645n;
            if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                this.K = true;
                StaticLayout staticLayout2 = y0Var.f7645n;
                this.L = (int) ((Math.min(0.4f, ((staticLayout2 != null ? staticLayout2.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.L);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float fDp2 = fJ2 + AndroidUtilities.dp(4.0f);
        this.f9601x = fDp2;
        float fDp3 = fDp2 + y0Var.f7652u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = fDp3;
        this.C = new pz0(str, 14.0f, AndroidUtilities.bold());
        float fDp4 = AndroidUtilities.dp(30.0f);
        this.B = fDp4;
        this.M = (int) (fDp3 + fDp4 + AndroidUtilities.dp(11.0f));
    }
}
