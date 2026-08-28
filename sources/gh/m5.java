package gh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.LaunchActivity;
public final class m5 {
    public float A;
    public float B;
    public nz0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final bb G;
    public final pc H;
    public final pc I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public TLRPC.TL_messageActionStarGiftUnique N;
    public MessageObject O;
    public boolean P;
    public final td.c Q;
    public fh.s0 R;
    public final int f8546a;
    public final View f8547b;
    public final org.telegram.ui.ActionBar.b6 f8548c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.i5 f8549e;
    public int f8551g;
    public RadialGradient h;
    public final fh.i2 f8553j;
    public TL_stars.starGiftAttributeBackdrop f8554k;
    public TL_stars.starGiftAttributePattern f8555l;
    public TL_stars.starGiftAttributeModel f8556m;
    public boolean f8559p;
    public float f8560q;
    public nz0 f8561r;
    public float f8562s;
    public nz0 f8563t;
    public float f8564u;
    public float v;
    public float f8566x;
    public final fh.a1 f8567y;
    public boolean f8568z;
    public final Paint f8550f = new Paint(1);
    public final Matrix f8552i = new Matrix();
    public final RectF f8557n = new RectF();
    public final Path f8558o = new Path();
    public final ArrayList f8565w = new ArrayList();

    public m5(int i9, View view, org.telegram.ui.ActionBar.b6 b6Var) {
        fh.a1 a1Var = new fh.a1();
        this.f8567y = a1Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new bb(1, 25);
        this.Q = new td.c(0, new i3(this, 2), gr.h, 320L);
        this.f8546a = i9;
        this.f8547b = view;
        this.f8548c = b6Var;
        this.f8553j = new fh.i2(view);
        this.H = new pc(view);
        this.I = new pc(view);
        this.d = new ImageReceiver(view);
        this.f8549e = new org.telegram.ui.Components.i5(AndroidUtilities.dp(28.0f), view);
        a1Var.f6346r = view;
        a1Var.d.setParentView(view);
    }

    public final void a(Canvas canvas) {
        td.c cVar = this.Q;
        float f10 = cVar.f47780e;
        float f11 = f10 / 2.0f;
        RectF rectF = this.f8557n;
        rectF.set(0.0f, 0.0f, f10, this.M);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f8554k != null && (this.h == null || this.f8551g != height)) {
            this.f8551g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f8554k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f8550f;
        if (radialGradient != null) {
            Matrix matrix = this.f8552i;
            matrix.reset();
            matrix.postTranslate(f11, f11);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f8558o;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f8554k;
        org.telegram.ui.Components.i5 i5Var = this.f8549e;
        if (stargiftattributebackdrop2 != null) {
            i5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        y0.a(canvas, 1, i5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f11 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f8554k;
        if (stargiftattributebackdrop3 != null) {
            l1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i9 = l1;
        this.f8561r.f31234p = cVar.f47780e - AndroidUtilities.dp(12.0f);
        nz0 nz0Var = this.f8561r;
        nz0Var.c(f11 - (nz0Var.f31223c / 2.0f), this.f8560q, 1.0f, -1, canvas);
        this.f8563t.f31234p = cVar.f47780e - AndroidUtilities.dp(12.0f);
        nz0 nz0Var2 = this.f8563t;
        Canvas canvas2 = canvas;
        int i10 = i9;
        nz0Var2.c(f11 - (nz0Var2.f31223c / 2.0f), this.f8562s, 1.0f, i10, canvas2);
        if (this.f8568z) {
            fh.a1 a1Var = this.f8567y;
            int i11 = a1Var.f6348t;
            int i12 = a1Var.f6349u;
            int i13 = (int) (f11 - (i11 / 2.0f));
            int i14 = (int) this.f8566x;
            a1Var.setBounds(i13, i14, i11 + i13, i12 + i14);
            a1Var.draw(canvas2);
        } else {
            float dp = this.f8564u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f8565w;
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                int i16 = i15 + 1;
                l5 l5Var = (l5) arrayList.get(i15);
                nz0 nz0Var3 = l5Var.f8492b;
                float f12 = f11 - (dp / 2.0f);
                nz0Var3.c((f12 + this.f8564u) - nz0Var3.f31223c, l5Var.f8491a, 1.0f, i10, canvas2);
                canvas2 = canvas;
                l5Var.f8493c.c(f12 + this.f8564u + AndroidUtilities.dp(9.0f), l5Var.f8491a, 1.0f, -1, canvas2);
                i10 = i10;
                i15 = i16;
            }
        }
        int i17 = i10;
        if (!this.f8559p) {
            float f13 = this.A;
            float c10 = j3.r0.c(this.C.f31223c, AndroidUtilities.dp(30.0f), 2.0f, f11);
            float f14 = this.A + this.B;
            RectF rectF2 = this.D;
            rectF2.set(f11 - ((this.C.f31223c + AndroidUtilities.dp(30.0f)) / 2.0f), f13, c10, f14);
            Path path2 = this.E;
            path2.rewind();
            float f15 = this.B / 2.0f;
            path2.addRoundRect(rectF2, f15, f15, Path.Direction.CW);
            int l12 = org.telegram.ui.ActionBar.f6.l1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(l12);
            float a3 = this.H.a(0.075f);
            canvas2.scale(a3, a3, rectF2.centerX(), rectF2.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            int dp2 = ((int) rectF.right) - AndroidUtilities.dp(46.67f);
            int dp3 = ((int) rectF.top) - AndroidUtilities.dp(1.33f);
            int dp4 = AndroidUtilities.dp(1.33f) + ((int) rectF.right);
            int dp5 = AndroidUtilities.dp(46.67f) + ((int) rectF.top);
            fh.i2 i2Var = this.f8553j;
            i2Var.setBounds(dp2, dp3, dp4, dp5);
            i2Var.h = i17;
            i2Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void b(Canvas canvas) {
        if (this.f8559p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f8557n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a3 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a3, a3, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        bb bbVar = this.G;
        bbVar.g(rectF2);
        bbVar.d();
        bbVar.a(canvas, org.telegram.ui.ActionBar.f6.l1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f8547b;
        if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).J();
        } else {
            view.invalidate();
        }
    }

    public final float c() {
        return this.Q.f47780e;
    }

    public final boolean d() {
        if (this.N != null) {
            return true;
        }
        return false;
    }

    public final boolean e(float f10, float f11, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean contains = this.D.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        boolean contains2 = this.f8557n.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        int action = motionEvent.getAction();
        pc pcVar = this.H;
        pc pcVar2 = this.I;
        if (action == 0) {
            if (contains2 && !contains) {
                z11 = true;
            } else {
                z11 = false;
            }
            pcVar2.c(z11);
            pcVar.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (pcVar.h && !contains) {
                pcVar.c(false);
            } else if (pcVar2.h && !contains2) {
                pcVar2.c(false);
            }
        } else if (motionEvent.getAction() == 1 && ((z10 = pcVar.h) || pcVar2.h)) {
            fh.s0 s0Var = this.R;
            if (s0Var != null) {
                if (z10) {
                    s0Var.run();
                }
            } else if (this.J) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.messenger.l0.p(R.string.UniqueGiftNotFoundBurned, oc.a0(U), R.raw.fire_on, 36);
                }
            } else {
                k5 k5Var = new k5(this.f8547b.getContext(), this.f8546a, this.O.getDialogId(), this.f8548c, null);
                k5Var.i2(this.O, null);
                k5Var.show();
            }
            pcVar.c(false);
            pcVar2.c(false);
            return true;
        } else if (motionEvent.getAction() == 3 && (pcVar.h || pcVar2.h)) {
            pcVar.c(false);
            pcVar2.c(false);
            return true;
        }
        if (pcVar.h || pcVar2.h) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: gh.m5.f(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void g(MessageObject messageObject, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long dialogId;
        float f10;
        float f11;
        float f12;
        float f13;
        int dp;
        int i9;
        float f14 = this.L;
        boolean isOutOwner = messageObject.isOutOwner();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i10 = this.f8546a;
        if (z10 == isOutOwner) {
            dialogId = UserConfig.getInstance(i10).getClientUserId();
        } else {
            dialogId = messageObject.getDialogId();
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            dialogId = DialogObject.getPeerDialogId(peer);
        }
        String shortName = DialogObject.getShortName(dialogId);
        float dp2 = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        int i11 = 0;
        if (this.f8559p) {
            this.f8561r = new nz0(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i10).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f8561r = new nz0(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f8561r = new nz0(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f8561r = new nz0(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f8561r = new nz0(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f8561r = new nz0(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f8560q = (this.f8561r.j() / 2.0f) + dp2;
        float j10 = this.f8561r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f8559p) {
            f10 = 10.0f;
            f11 = 3.0f;
            this.f8563t = new nz0(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f12 = 2.0f;
        } else {
            f10 = 10.0f;
            f11 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f12 = 2.0f;
            this.f8563t = new nz0(j3.r0.n(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f8562s = (this.f8563t.j() / f12) + j10;
        float j11 = this.f8563t.j() + j10;
        if (this.f8559p) {
            f13 = 14.0f;
        } else {
            f13 = 11.0f;
        }
        float dp3 = j11 + AndroidUtilities.dp(f13);
        ArrayList arrayList = this.f8565w;
        arrayList.clear();
        this.f8564u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        fh.a1 a1Var = this.f8567y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = a1Var.f6333c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false);
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
            if (!tL_messageActionStarGiftUnique.name_hidden) {
                if (tL_messageActionStarGiftUnique.from_id != null) {
                    tLObject = MessagesController.getInstance(i10).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.from_id));
                } else {
                    tLObject = MessagesController.getInstance(i10).getUserOrChat(messageObject.getFromChatId());
                }
            }
            this.f8568z = true;
            a1Var.c(tLObject);
            a1Var.f6341m = replaceAnimatedEmoji;
            a1Var.f6347s = -1;
            a1Var.b(((int) f14) - AndroidUtilities.dp(24.0f));
            if (!this.K) {
                StaticLayout staticLayout = a1Var.f6342n;
                if (staticLayout != null) {
                    i9 = staticLayout.getLineCount();
                } else {
                    i9 = 0;
                }
                if (i9 > 3) {
                    this.K = true;
                    StaticLayout staticLayout2 = a1Var.f6342n;
                    if (staticLayout2 != null) {
                        i11 = staticLayout2.getLineCount();
                    }
                    this.L = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.L);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f8566x = dp4;
            dp3 = dp4 + a1Var.f6349u + AndroidUtilities.dp(f11);
        } else {
            this.f8568z = false;
            a1Var.c(null);
            a1Var.f6341m = null;
            a1Var.f6347s = -1;
            if (this.f8556m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                l5 l5Var = new l5(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f8556m.name);
                arrayList.add(l5Var);
                float f15 = f14 * 0.5f;
                nz0 nz0Var = l5Var.f8492b;
                nz0Var.f31234p = f15;
                this.f8564u = Math.max(this.f8564u, nz0Var.f31223c);
                nz0 nz0Var2 = l5Var.f8493c;
                nz0Var2.f31234p = f15;
                this.v = Math.max(this.v, nz0Var2.f31223c);
                dp3 += l5Var.a();
            }
            if (this.f8554k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                l5 l5Var2 = new l5(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f8554k.name);
                arrayList.add(l5Var2);
                float f16 = f14 * 0.5f;
                nz0 nz0Var3 = l5Var2.f8492b;
                nz0Var3.f31234p = f16;
                this.f8564u = Math.max(this.f8564u, nz0Var3.f31223c);
                nz0 nz0Var4 = l5Var2.f8493c;
                nz0Var4.f31234p = f16;
                this.v = Math.max(this.v, nz0Var4.f31223c);
                dp3 = l5Var2.a() + dp3;
            }
            if (this.f8555l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                l5 l5Var3 = new l5(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f8555l.name);
                arrayList.add(l5Var3);
                float f17 = f14 * 0.5f;
                nz0 nz0Var5 = l5Var3.f8492b;
                nz0Var5.f31234p = f17;
                this.f8564u = Math.max(this.f8564u, nz0Var5.f31223c);
                nz0 nz0Var6 = l5Var3.f8493c;
                nz0Var6.f31234p = f17;
                this.v = Math.max(this.v, nz0Var6.f31223c);
                dp3 += l5Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f8559p) {
            this.A = dp5;
            this.C = new nz0(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
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
        int i9;
        float f10 = this.L;
        float dp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        int i10 = 0;
        nz0 nz0Var = new nz0(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j10)), 14.0f, AndroidUtilities.bold());
        this.f8561r = nz0Var;
        this.f8560q = (nz0Var.j() / 2.0f) + dp;
        float j11 = this.f8561r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        String n10 = j3.r0.n(tL_starGiftUnique.num, ',', sb2);
        TLObject tLObject = null;
        nz0 nz0Var2 = new nz0(n10, 12.0f, null);
        this.f8563t = nz0Var2;
        this.f8562s = (nz0Var2.j() / 2.0f) + j11;
        float j12 = this.f8563t.j() + j11 + AndroidUtilities.dp(11.0f);
        this.f8565w.clear();
        this.f8564u = 0.0f;
        this.v = 0.0f;
        fh.a1 a1Var = this.f8567y;
        TextPaint textPaint = a1Var.f6333c;
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
            tLObject = MessagesController.getInstance(this.f8546a).getUserOrChat(j10);
        }
        this.f8568z = true;
        a1Var.c(tLObject);
        a1Var.f6341m = spanned;
        a1Var.f6347s = -1;
        a1Var.b(((int) f10) - AndroidUtilities.dp(24.0f));
        if (!this.K) {
            StaticLayout staticLayout = a1Var.f6342n;
            if (staticLayout != null) {
                i9 = staticLayout.getLineCount();
            } else {
                i9 = 0;
            }
            if (i9 > 3) {
                this.K = true;
                StaticLayout staticLayout2 = a1Var.f6342n;
                if (staticLayout2 != null) {
                    i10 = staticLayout2.getLineCount();
                }
                this.L = (int) ((Math.min(0.4f, (i10 - 3) * 0.1f) + 1.0f) * this.L);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j12 + AndroidUtilities.dp(4.0f);
        this.f8566x = dp2;
        float dp3 = dp2 + a1Var.f6349u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new nz0(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.M = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
