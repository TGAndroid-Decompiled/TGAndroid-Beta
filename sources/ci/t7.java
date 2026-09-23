package ci;

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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rr;
public final class t7 extends View {
    public s7 E;
    public View F;
    public Object G;
    public Runnable H;
    public String I;
    public final int[] J;
    public final int[] K;
    public boolean L;
    public final int f5556a;
    public final ha f5557b;
    public ia f5558c;
    public final org.telegram.ui.Components.e6 d;
    public final RectF e;
    public final RectF f5559f;
    public final ImageReceiver h;
    public boolean f5560n;
    public f01 f5561r;
    public f01 f5562s;
    public final Path v;
    public final Paint f5563w;
    public final org.telegram.ui.Components.yc f5564x;
    public boolean f5565y;

    public t7(Activity activity, int i10, ha haVar) {
        super(activity);
        this.d = new org.telegram.ui.Components.e6(this, 0L, 320L, rr.h);
        this.e = new RectF();
        this.f5559f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.f5563w = new Paint(1);
        this.f5564x = new org.telegram.ui.Components.yc(this);
        this.J = new int[2];
        this.K = new int[2];
        this.f5556a = i10;
        this.f5557b = haVar;
    }

    public final void a() {
        s7 s7Var = this.E;
        if (s7Var == null) {
            return;
        }
        this.f5561r = new f01(s7Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.E.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            pq pqVar = new pq(R.drawable.settings_arrow, 0);
            pqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(pqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f5562s = new f01(spannableStringBuilder, 14.0f, null);
        this.E.d(this.h);
        this.f5560n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        Object obj;
        int[] iArr;
        int[] iArr2;
        float e = this.d.e(this.f5565y);
        f01 f01Var = this.f5561r;
        if (f01Var != null && this.f5562s != null && e > 0.0f) {
            f01Var.f23795p = getWidth() * 0.7f;
            this.f5562s.f23795p = getWidth() * 0.7f;
            float dp = AndroidUtilities.dp(5.0f);
            float dp2 = AndroidUtilities.dp(10.0f);
            float dp3 = AndroidUtilities.dp(32.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            float dp5 = AndroidUtilities.dp(11.0f);
            float min = Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f);
            if (this.f5560n) {
                f7 = dp5 + dp3 + dp5;
            } else {
                f7 = 0.0f;
            }
            float max = Math.max(min, Math.max(this.f5561r.f23785c, this.f5562s.f23785c) + f7 + dp + AndroidUtilities.dp(15.0f) + dp);
            if (this.f5560n) {
                f10 = dp3;
            } else {
                f10 = 0.0f;
            }
            float max2 = Math.max(f10, this.f5562s.j() + this.f5561r.j() + dp4) + dp2 + dp2;
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e) * this.f5564x.a(0.05f);
            float dp6 = (1.0f - e) * AndroidUtilities.dp(15.0f);
            RectF rectF = this.e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f5559f;
            rectF2.set(rectF);
            AndroidUtilities.scaleRect(rectF2, lerp);
            rectF2.offset(0.0f, dp6);
            int i10 = Build.VERSION.SDK_INT;
            Paint paint = this.f5563w;
            if (i10 >= 29 && (obj = this.G) != null && this.F != null) {
                RenderNode c10 = org.telegram.messenger.b.c(obj);
                Path path = this.v;
                path.rewind();
                f12 = 2.0f;
                f11 = dp;
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                getLocationOnScreen(this.J);
                this.F.getLocationOnScreen(this.K);
                canvas.saveLayerAlpha(rectF2, (int) (255.0f * e), 31);
                canvas.clipPath(path);
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                float max3 = Math.max(this.F.getWidth() / c10.getWidth(), this.F.getHeight() / c10.getHeight());
                canvas.scale(max3, max3);
                canvas.drawRenderNode(c10);
                canvas.restore();
                paint.setColor(org.telegram.ui.ActionBar.h6.l1(e, 1879048192));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            } else {
                f11 = dp;
                f12 = 2.0f;
                paint.setColor(org.telegram.ui.ActionBar.h6.l1(e, -587202560));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            }
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(0.0f, dp6);
            canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
            if (this.f5560n) {
                float f15 = dp3 / f12;
                ImageReceiver imageReceiver = this.h;
                imageReceiver.setRoundRadius((int) f15);
                imageReceiver.setImageCoords(rectF.left + f11 + dp5, rectF.centerY() - f15, dp3, dp3);
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
            }
            float centerY = rectF.centerY() - ((this.f5562s.j() + (this.f5561r.j() + dp4)) / f12);
            f01 f01Var2 = this.f5561r;
            float f16 = rectF.left;
            if (this.f5560n) {
                f13 = dp5 + dp3 + dp5;
            } else {
                f13 = 0.0f;
            }
            f01Var2.c(f16 + f13 + f11, (f01Var2.j() / f12) + centerY, e, -1, canvas);
            f01 f01Var3 = this.f5562s;
            float f17 = rectF.left;
            if (this.f5560n) {
                f14 = dp3 + dp5 + dp5;
            }
            f01Var3.c(f17 + f14 + f11, this.f5561r.j() + centerY + dp4 + (this.f5562s.j() / f12), e, org.telegram.ui.ActionBar.h6.v(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ia iaVar;
        boolean z10 = this.f5565y;
        org.telegram.ui.Components.yc ycVar = this.f5564x;
        if (z10 && this.E != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.L = true;
                    ycVar.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (ycVar.h && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    ycVar.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (ycVar.h && (iaVar = this.f5558c) != null && this.E != null) {
                    iaVar.run(new p7(this, 1));
                }
                ycVar.c(false);
                this.L = false;
            } else if (motionEvent.getAction() == 3) {
                ycVar.c(false);
                this.L = false;
            }
            if (!this.L && !ycVar.h) {
                return false;
            }
            return true;
        }
        this.L = false;
        ycVar.c(false);
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
        ha haVar = this.f5557b;
        Runnable runnable = null;
        if (isEmpty) {
            Runnable runnable2 = this.H;
            if (runnable2 != null) {
                runnable2.run();
                this.H = null;
            }
            if (this.f5565y) {
                invalidate();
            }
            this.f5565y = false;
            this.I = null;
            if (haVar != null) {
                haVar.run();
                return;
            }
            return;
        }
        s7 s7Var = this.E;
        if ((s7Var == null && this.H == null) || (s7Var != null && !TextUtils.equals(s7Var.f5496a, str) && !TextUtils.equals(this.I, str))) {
            Runnable runnable3 = this.H;
            if (runnable3 != null) {
                runnable3.run();
                this.H = null;
            }
            this.E = null;
            this.I = str;
            int i10 = this.f5556a;
            p7 p7Var = new p7(this, 0);
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
                                p7Var.run(new q7(str, (TLRPC.User) userOrChat));
                            } else if (userOrChat instanceof TLRPC.Chat) {
                                p7Var.run(new r7(str, (TLRPC.Chat) userOrChat));
                            }
                        }
                        runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new ai.c5(p7Var, messagesController, str, 3));
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                p7Var.run(runnable);
            }
            this.H = runnable;
            return;
        }
        s7 s7Var2 = this.E;
        if (s7Var2 != null && !this.f5565y && TextUtils.equals(s7Var2.f5496a, str)) {
            this.f5565y = true;
            a();
            invalidate();
            if (haVar != null) {
                haVar.run();
            }
        }
    }
}
