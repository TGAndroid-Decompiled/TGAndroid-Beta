package nh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;
public final class y6 extends View {
    public x6 A;
    public View B;
    public Object C;
    public Runnable D;
    public String E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final int f18879a;
    public final g9 f18880b;
    public h9 f18881c;
    public final org.telegram.ui.Components.d6 d;
    public final RectF f18882e;
    public final RectF f18883f;
    public final ImageReceiver h;
    public boolean f18884n;
    public zz0 f18885r;
    public zz0 f18886s;
    public final Path v;
    public final Paint f18887w;
    public final uc f18888x;
    public boolean f18889y;

    public y6(Activity activity, int i10, g9 g9Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.d6(this, 0L, 320L, jr.h);
        this.f18882e = new RectF();
        this.f18883f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.f18887w = new Paint(1);
        this.f18888x = new uc(this);
        this.F = new int[2];
        this.G = new int[2];
        this.f18879a = i10;
        this.f18880b = g9Var;
    }

    public final void a() {
        x6 x6Var = this.A;
        if (x6Var == null) {
            return;
        }
        this.f18885r = new zz0(x6Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.A.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            iq iqVar = new iq(R.drawable.settings_arrow, 0);
            iqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(iqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f18886s = new zz0(spannableStringBuilder, 14.0f, null);
        this.A.d(this.h);
        this.f18884n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        Object obj;
        int[] iArr;
        int[] iArr2;
        float e10 = this.d.e(this.f18889y);
        zz0 zz0Var = this.f18885r;
        if (zz0Var != null && this.f18886s != null && e10 > 0.0f) {
            zz0Var.f35473p = getWidth() * 0.7f;
            this.f18886s.f35473p = getWidth() * 0.7f;
            float dp = AndroidUtilities.dp(5.0f);
            float dp2 = AndroidUtilities.dp(10.0f);
            float dp3 = AndroidUtilities.dp(32.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            float dp5 = AndroidUtilities.dp(11.0f);
            float min = Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f);
            if (this.f18884n) {
                f9 = dp5 + dp3 + dp5;
            } else {
                f9 = 0.0f;
            }
            float max = Math.max(min, Math.max(this.f18885r.f35462c, this.f18886s.f35462c) + f9 + dp + AndroidUtilities.dp(15.0f) + dp);
            if (this.f18884n) {
                f10 = dp3;
            } else {
                f10 = 0.0f;
            }
            float max2 = Math.max(f10, this.f18886s.j() + this.f18885r.j() + dp4) + dp2 + dp2;
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e10) * this.f18888x.a(0.05f);
            float dp6 = (1.0f - e10) * AndroidUtilities.dp(15.0f);
            RectF rectF = this.f18882e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f18883f;
            rectF2.set(rectF);
            AndroidUtilities.scaleRect(rectF2, lerp);
            rectF2.offset(0.0f, dp6);
            int i10 = Build.VERSION.SDK_INT;
            Paint paint = this.f18887w;
            if (i10 >= 29 && (obj = this.C) != null && this.B != null) {
                RenderNode c3 = org.telegram.messenger.b.c(obj);
                Path path = this.v;
                path.rewind();
                f12 = 2.0f;
                f11 = dp;
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                getLocationOnScreen(this.F);
                this.B.getLocationOnScreen(this.G);
                canvas.saveLayerAlpha(rectF2, (int) (255.0f * e10), 31);
                canvas.clipPath(path);
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                float max3 = Math.max(this.B.getWidth() / c3.getWidth(), this.B.getHeight() / c3.getHeight());
                canvas.scale(max3, max3);
                canvas.drawRenderNode(c3);
                canvas.restore();
                paint.setColor(org.telegram.ui.ActionBar.g6.l1(e10, 1879048192));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            } else {
                f11 = dp;
                f12 = 2.0f;
                paint.setColor(org.telegram.ui.ActionBar.g6.l1(e10, -587202560));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            }
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(0.0f, dp6);
            canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
            if (this.f18884n) {
                float f15 = dp3 / f12;
                ImageReceiver imageReceiver = this.h;
                imageReceiver.setRoundRadius((int) f15);
                imageReceiver.setImageCoords(rectF.left + f11 + dp5, rectF.centerY() - f15, dp3, dp3);
                imageReceiver.setAlpha(e10);
                imageReceiver.draw(canvas);
            }
            float centerY = rectF.centerY() - ((this.f18886s.j() + (this.f18885r.j() + dp4)) / f12);
            zz0 zz0Var2 = this.f18885r;
            float f16 = rectF.left;
            if (this.f18884n) {
                f13 = dp5 + dp3 + dp5;
            } else {
                f13 = 0.0f;
            }
            zz0Var2.c(f16 + f13 + f11, (zz0Var2.j() / f12) + centerY, e10, -1, canvas);
            zz0 zz0Var3 = this.f18886s;
            float f17 = rectF.left;
            if (this.f18884n) {
                f14 = dp3 + dp5 + dp5;
            }
            zz0Var3.c(f17 + f14 + f11, this.f18885r.j() + centerY + dp4 + (this.f18886s.j() / f12), e10, org.telegram.ui.ActionBar.g6.v(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h9 h9Var;
        boolean z10 = this.f18889y;
        uc ucVar = this.f18888x;
        if (z10 && this.A != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.f18882e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.H = true;
                    ucVar.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (ucVar.h && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    ucVar.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (ucVar.h && (h9Var = this.f18881c) != null && this.A != null) {
                    h9Var.run(new u6(this, 1));
                }
                ucVar.c(false);
                this.H = false;
            } else if (motionEvent.getAction() == 3) {
                ucVar.c(false);
                this.H = false;
            }
            if (!this.H && !ucVar.h) {
                return false;
            }
            return true;
        }
        this.H = false;
        ucVar.c(false);
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.onDetachedFromWindow();
    }

    public void setLink(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        g9 g9Var = this.f18880b;
        Runnable runnable = null;
        if (isEmpty) {
            Runnable runnable2 = this.D;
            if (runnable2 != null) {
                runnable2.run();
                this.D = null;
            }
            if (this.f18889y) {
                invalidate();
            }
            this.f18889y = false;
            this.E = null;
            if (g9Var != null) {
                g9Var.run();
                return;
            }
            return;
        }
        x6 x6Var = this.A;
        if ((x6Var == null && this.D == null) || (x6Var != null && !TextUtils.equals(x6Var.f18832a, str) && !TextUtils.equals(this.E, str))) {
            Runnable runnable3 = this.D;
            if (runnable3 != null) {
                runnable3.run();
                this.D = null;
            }
            this.A = null;
            this.E = str;
            int i10 = this.f18879a;
            u6 u6Var = new u6(this, 0);
            try {
                MessagesController messagesController = MessagesController.getInstance(i10);
                String str2 = messagesController.linkPrefix;
                Uri parse = Uri.parse(str);
                if (TextUtils.equals(parse.getHost(), str2)) {
                    List<String> pathSegments = parse.getPathSegments();
                    if (!pathSegments.isEmpty()) {
                        String str3 = pathSegments.get(0);
                        String queryParameter = parse.getQueryParameter("ref");
                        if (TextUtils.isEmpty(queryParameter)) {
                            TLObject userOrChat = messagesController.getUserOrChat(str3);
                            if (userOrChat instanceof TLRPC.User) {
                                u6Var.run(new v6(str, (TLRPC.User) userOrChat));
                            } else if (userOrChat instanceof TLRPC.Chat) {
                                u6Var.run(new w6(str, (TLRPC.Chat) userOrChat));
                            }
                        }
                        runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new cg.f0(u6Var, messagesController, str, 1));
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                u6Var.run(runnable);
            }
            this.D = runnable;
            return;
        }
        x6 x6Var2 = this.A;
        if (x6Var2 != null && !this.f18889y && TextUtils.equals(x6Var2.f18832a, str)) {
            this.f18889y = true;
            a();
            invalidate();
            if (g9Var != null) {
                g9Var.run();
            }
        }
    }
}
