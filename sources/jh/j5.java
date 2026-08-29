package jh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
public final class j5 {
    public float A;
    public float B;
    public zz0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final va G;
    public final uc H;
    public final uc I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public TLRPC.TL_messageActionStarGiftUnique N;
    public MessageObject O;
    public boolean P;
    public final vd.c Q;
    public ih.o0 R;
    public final int f12316a;
    public final View f12317b;
    public final org.telegram.ui.ActionBar.c6 f12318c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.n5 f12319e;
    public int f12321g;
    public RadialGradient h;
    public final ih.b2 f12323j;
    public TL_stars.starGiftAttributeBackdrop f12324k;
    public TL_stars.starGiftAttributePattern f12325l;
    public TL_stars.starGiftAttributeModel f12326m;
    public boolean f12329p;
    public float f12330q;
    public zz0 f12331r;
    public float f12332s;
    public zz0 f12333t;
    public float f12334u;
    public float v;
    public float f12336x;
    public final ih.w0 f12337y;
    public boolean f12338z;
    public final Paint f12320f = new Paint(1);
    public final Matrix f12322i = new Matrix();
    public final RectF f12327n = new RectF();
    public final Path f12328o = new Path();
    public final ArrayList f12335w = new ArrayList();

    public j5(int i10, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        ih.w0 w0Var = new ih.w0();
        this.f12337y = w0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new va(1, 25);
        this.Q = new vd.c(0, new eg.n(this, 21), jr.h, 320L);
        this.f12316a = i10;
        this.f12317b = view;
        this.f12318c = c6Var;
        this.f12323j = new ih.b2(view);
        this.H = new uc(view);
        this.I = new uc(view);
        this.d = new ImageReceiver(view);
        this.f12319e = new org.telegram.ui.Components.n5(AndroidUtilities.dp(28.0f), view);
        w0Var.f9480r = view;
        w0Var.d.setParentView(view);
    }

    public final void a(Canvas canvas) {
        vd.c cVar = this.Q;
        float f9 = cVar.f49510e;
        float f10 = f9 / 2.0f;
        RectF rectF = this.f12327n;
        rectF.set(0.0f, 0.0f, f9, this.M);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f12324k != null && (this.h == null || this.f12321g != height)) {
            this.f12321g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f12324k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f12320f;
        if (radialGradient != null) {
            Matrix matrix = this.f12322i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f12328o;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f12324k;
        org.telegram.ui.Components.n5 n5Var = this.f12319e;
        if (stargiftattributebackdrop2 != null) {
            n5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        x0.a(canvas, 1, n5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f10 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f12324k;
        if (stargiftattributebackdrop3 != null) {
            l1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i10 = l1;
        this.f12331r.f35473p = cVar.f49510e - AndroidUtilities.dp(12.0f);
        zz0 zz0Var = this.f12331r;
        zz0Var.c(f10 - (zz0Var.f35462c / 2.0f), this.f12330q, 1.0f, -1, canvas);
        this.f12333t.f35473p = cVar.f49510e - AndroidUtilities.dp(12.0f);
        zz0 zz0Var2 = this.f12333t;
        Canvas canvas2 = canvas;
        int i11 = i10;
        zz0Var2.c(f10 - (zz0Var2.f35462c / 2.0f), this.f12332s, 1.0f, i11, canvas2);
        if (this.f12338z) {
            ih.w0 w0Var = this.f12337y;
            int i12 = w0Var.f9482t;
            int i13 = w0Var.f9483u;
            int i14 = (int) (f10 - (i12 / 2.0f));
            int i15 = (int) this.f12336x;
            w0Var.setBounds(i14, i15, i12 + i14, i13 + i15);
            w0Var.draw(canvas2);
        } else {
            float dp = this.f12334u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f12335w;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                i5 i5Var = (i5) arrayList.get(i16);
                zz0 zz0Var3 = i5Var.f12250b;
                float f11 = f10 - (dp / 2.0f);
                zz0Var3.c((f11 + this.f12334u) - zz0Var3.f35462c, i5Var.f12249a, 1.0f, i11, canvas2);
                canvas2 = canvas;
                i5Var.f12251c.c(f11 + this.f12334u + AndroidUtilities.dp(9.0f), i5Var.f12249a, 1.0f, -1, canvas2);
                i11 = i11;
                i16 = i17;
            }
        }
        int i18 = i11;
        if (!this.f12329p) {
            float f12 = this.A;
            float c3 = j7.l1.c(this.C.f35462c, AndroidUtilities.dp(30.0f), 2.0f, f10);
            float f13 = this.A + this.B;
            RectF rectF2 = this.D;
            rectF2.set(f10 - ((this.C.f35462c + AndroidUtilities.dp(30.0f)) / 2.0f), f12, c3, f13);
            Path path2 = this.E;
            path2.rewind();
            float f14 = this.B / 2.0f;
            path2.addRoundRect(rectF2, f14, f14, Path.Direction.CW);
            int l12 = org.telegram.ui.ActionBar.g6.l1(0.13f, -16777216);
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
            ih.b2 b2Var = this.f12323j;
            b2Var.setBounds(dp2, dp3, dp4, dp5);
            b2Var.h = i18;
            b2Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void b(Canvas canvas) {
        if (this.f12329p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f12327n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        va vaVar = this.G;
        vaVar.g(rectF2);
        vaVar.d();
        vaVar.a(canvas, org.telegram.ui.ActionBar.g6.l1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f12317b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).J();
        } else {
            view.invalidate();
        }
    }

    public final float c() {
        return this.Q.f49510e;
    }

    public final boolean d() {
        if (this.N != null) {
            return true;
        }
        return false;
    }

    public final boolean e(float f9, float f10, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean contains = this.D.contains(motionEvent.getX() - f9, motionEvent.getY() - f10);
        boolean contains2 = this.f12327n.contains(motionEvent.getX() - f9, motionEvent.getY() - f10);
        int action = motionEvent.getAction();
        uc ucVar = this.H;
        uc ucVar2 = this.I;
        if (action == 0) {
            if (contains2 && !contains) {
                z11 = true;
            } else {
                z11 = false;
            }
            ucVar2.c(z11);
            ucVar.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (ucVar.h && !contains) {
                ucVar.c(false);
            } else if (ucVar2.h && !contains2) {
                ucVar2.c(false);
            }
        } else if (motionEvent.getAction() == 1 && ((z10 = ucVar.h) || ucVar2.h)) {
            ih.o0 o0Var = this.R;
            if (o0Var != null) {
                if (z10) {
                    o0Var.run();
                }
            } else if (this.J) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    j7.l1.v(R.string.UniqueGiftNotFoundBurned, tc.a0(U), R.raw.fire_on, 36);
                }
            } else {
                h5 h5Var = new h5(this.f12317b.getContext(), this.f12316a, this.O.getDialogId(), this.f12318c, null);
                h5Var.i2(this.O, null);
                h5Var.show();
            }
            ucVar.c(false);
            ucVar2.c(false);
            return true;
        } else if (motionEvent.getAction() == 3 && (ucVar.h || ucVar2.h)) {
            ucVar.c(false);
            ucVar2.c(false);
            return true;
        }
        if (ucVar.h || ucVar2.h) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: jh.j5.f(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void g(MessageObject messageObject, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long dialogId;
        float f9;
        float f10;
        float f11;
        float f12;
        int dp;
        int i10;
        float f13 = this.L;
        boolean isOutOwner = messageObject.isOutOwner();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i11 = this.f12316a;
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
        if (this.f12329p) {
            this.f12331r = new zz0(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i11).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f12331r = new zz0(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f12331r = new zz0(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f12331r = new zz0(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f12331r = new zz0(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f12331r = new zz0(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f12330q = (this.f12331r.j() / 2.0f) + dp2;
        float j10 = this.f12331r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f12329p) {
            f9 = 10.0f;
            f10 = 3.0f;
            this.f12333t = new zz0(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f11 = 2.0f;
        } else {
            f9 = 10.0f;
            f10 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f11 = 2.0f;
            this.f12333t = new zz0(j7.l1.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f12332s = (this.f12333t.j() / f11) + j10;
        float j11 = this.f12333t.j() + j10;
        if (this.f12329p) {
            f12 = 14.0f;
        } else {
            f12 = 11.0f;
        }
        float dp3 = j11 + AndroidUtilities.dp(f12);
        ArrayList arrayList = this.f12335w;
        arrayList.clear();
        this.f12334u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        ih.w0 w0Var = this.f12337y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = w0Var.f9467c;
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
            this.f12338z = true;
            w0Var.c(tLObject);
            w0Var.f9475m = replaceAnimatedEmoji;
            w0Var.f9481s = -1;
            w0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.K) {
                StaticLayout staticLayout = w0Var.f9476n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.K = true;
                    StaticLayout staticLayout2 = w0Var.f9476n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.L = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.L);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f12336x = dp4;
            dp3 = dp4 + w0Var.f9483u + AndroidUtilities.dp(f10);
        } else {
            this.f12338z = false;
            w0Var.c(null);
            w0Var.f9475m = null;
            w0Var.f9481s = -1;
            if (this.f12326m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                i5 i5Var = new i5(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f12326m.name);
                arrayList.add(i5Var);
                float f14 = f13 * 0.5f;
                zz0 zz0Var = i5Var.f12250b;
                zz0Var.f35473p = f14;
                this.f12334u = Math.max(this.f12334u, zz0Var.f35462c);
                zz0 zz0Var2 = i5Var.f12251c;
                zz0Var2.f35473p = f14;
                this.v = Math.max(this.v, zz0Var2.f35462c);
                dp3 += i5Var.a();
            }
            if (this.f12324k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                i5 i5Var2 = new i5(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f12324k.name);
                arrayList.add(i5Var2);
                float f15 = f13 * 0.5f;
                zz0 zz0Var3 = i5Var2.f12250b;
                zz0Var3.f35473p = f15;
                this.f12334u = Math.max(this.f12334u, zz0Var3.f35462c);
                zz0 zz0Var4 = i5Var2.f12251c;
                zz0Var4.f35473p = f15;
                this.v = Math.max(this.v, zz0Var4.f35462c);
                dp3 = i5Var2.a() + dp3;
            }
            if (this.f12325l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                i5 i5Var3 = new i5(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f12325l.name);
                arrayList.add(i5Var3);
                float f16 = f13 * 0.5f;
                zz0 zz0Var5 = i5Var3.f12250b;
                zz0Var5.f35473p = f16;
                this.f12334u = Math.max(this.f12334u, zz0Var5.f35462c);
                zz0 zz0Var6 = i5Var3.f12251c;
                zz0Var6.f35473p = f16;
                this.v = Math.max(this.v, zz0Var6.f35462c);
                dp3 += i5Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f12329p) {
            this.A = dp5;
            this.C = new zz0(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
            float dp6 = AndroidUtilities.dp(30.0f);
            this.B = dp6;
            dp5 += dp6;
            dp = AndroidUtilities.dp(11.0f);
        } else {
            dp = AndroidUtilities.dp(f9);
        }
        this.M = (int) (dp5 + dp);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i10;
        float f9 = this.L;
        float dp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        int i11 = 0;
        zz0 zz0Var = new zz0(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j10)), 14.0f, AndroidUtilities.bold());
        this.f12331r = zz0Var;
        this.f12330q = (zz0Var.j() / 2.0f) + dp;
        float j11 = this.f12331r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        String m10 = j7.l1.m(tL_starGiftUnique.num, ',', sb2);
        TLObject tLObject = null;
        zz0 zz0Var2 = new zz0(m10, 12.0f, null);
        this.f12333t = zz0Var2;
        this.f12332s = (zz0Var2.j() / 2.0f) + j11;
        float j12 = this.f12333t.j() + j11 + AndroidUtilities.dp(11.0f);
        this.f12335w.clear();
        this.f12334u = 0.0f;
        this.v = 0.0f;
        ih.w0 w0Var = this.f12337y;
        TextPaint textPaint = w0Var.f9467c;
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
            tLObject = MessagesController.getInstance(this.f12316a).getUserOrChat(j10);
        }
        this.f12338z = true;
        w0Var.c(tLObject);
        w0Var.f9475m = spanned;
        w0Var.f9481s = -1;
        w0Var.b(((int) f9) - AndroidUtilities.dp(24.0f));
        if (!this.K) {
            StaticLayout staticLayout = w0Var.f9476n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.K = true;
                StaticLayout staticLayout2 = w0Var.f9476n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.L = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.L);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j12 + AndroidUtilities.dp(4.0f);
        this.f12336x = dp2;
        float dp3 = dp2 + w0Var.f9483u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new zz0(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.M = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
