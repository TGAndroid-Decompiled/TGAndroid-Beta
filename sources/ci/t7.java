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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.l11;
public final class t7 extends View {
    public s7 E;
    public View F;
    public Object G;
    public Runnable H;
    public String I;
    public final int[] J;
    public final int[] K;
    public boolean L;
    public final int f6010a;
    public final ha f6011b;
    public ia f6012c;
    public final org.telegram.ui.Components.g6 d;
    public final RectF f6013e;
    public final RectF f6014f;
    public final ImageReceiver h;
    public boolean f6015n;
    public l11 f6016r;
    public l11 f6017s;
    public final Path v;
    public final Paint f6018w;
    public final org.telegram.ui.Components.bd f6019x;
    public boolean f6020y;

    public t7(Activity activity, int i10, ha haVar) {
        super(activity);
        this.d = new org.telegram.ui.Components.g6(this, 0L, 320L, hs.h);
        this.f6013e = new RectF();
        this.f6014f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.f6018w = new Paint(1);
        this.f6019x = new org.telegram.ui.Components.bd(this);
        this.J = new int[2];
        this.K = new int[2];
        this.f6010a = i10;
        this.f6011b = haVar;
    }

    public final void a() {
        s7 s7Var = this.E;
        if (s7Var == null) {
            return;
        }
        this.f6016r = new l11(s7Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.E.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            er erVar = new er(R.drawable.settings_arrow, 0);
            erVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(erVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f6017s = new l11(spannableStringBuilder, 14.0f, null);
        this.E.d(this.h);
        this.f6015n = true;
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
        float e7 = this.d.e(this.f6020y);
        l11 l11Var = this.f6016r;
        if (l11Var != null && this.f6017s != null && e7 > 0.0f) {
            l11Var.f28233p = getWidth() * 0.7f;
            this.f6017s.f28233p = getWidth() * 0.7f;
            float dp = AndroidUtilities.dp(5.0f);
            float dp2 = AndroidUtilities.dp(10.0f);
            float dp3 = AndroidUtilities.dp(32.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            float dp5 = AndroidUtilities.dp(11.0f);
            float min = Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f);
            if (this.f6015n) {
                f7 = dp5 + dp3 + dp5;
            } else {
                f7 = 0.0f;
            }
            float max = Math.max(min, Math.max(this.f6016r.f28222c, this.f6017s.f28222c) + f7 + dp + AndroidUtilities.dp(15.0f) + dp);
            if (this.f6015n) {
                f10 = dp3;
            } else {
                f10 = 0.0f;
            }
            float max2 = Math.max(f10, this.f6017s.j() + this.f6016r.j() + dp4) + dp2 + dp2;
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e7) * this.f6019x.a(0.05f);
            float dp6 = (1.0f - e7) * AndroidUtilities.dp(15.0f);
            RectF rectF = this.f6013e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f6014f;
            rectF2.set(rectF);
            AndroidUtilities.scaleRect(rectF2, lerp);
            rectF2.offset(0.0f, dp6);
            int i10 = Build.VERSION.SDK_INT;
            Paint paint = this.f6018w;
            if (i10 >= 29 && (obj = this.G) != null && this.F != null) {
                RenderNode c10 = org.telegram.messenger.b.c(obj);
                Path path = this.v;
                path.rewind();
                f12 = 2.0f;
                f11 = dp;
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                getLocationOnScreen(this.J);
                this.F.getLocationOnScreen(this.K);
                canvas.saveLayerAlpha(rectF2, (int) (255.0f * e7), 31);
                canvas.clipPath(path);
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                float max3 = Math.max(this.F.getWidth() / c10.getWidth(), this.F.getHeight() / c10.getHeight());
                canvas.scale(max3, max3);
                canvas.drawRenderNode(c10);
                canvas.restore();
                paint.setColor(org.telegram.ui.ActionBar.i6.m1(e7, 1879048192));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            } else {
                f11 = dp;
                f12 = 2.0f;
                paint.setColor(org.telegram.ui.ActionBar.i6.m1(e7, -587202560));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            }
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(0.0f, dp6);
            canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
            if (this.f6015n) {
                float f15 = dp3 / f12;
                ImageReceiver imageReceiver = this.h;
                imageReceiver.setRoundRadius((int) f15);
                imageReceiver.setImageCoords(rectF.left + f11 + dp5, rectF.centerY() - f15, dp3, dp3);
                imageReceiver.setAlpha(e7);
                imageReceiver.draw(canvas);
            }
            float centerY = rectF.centerY() - ((this.f6017s.j() + (this.f6016r.j() + dp4)) / f12);
            l11 l11Var2 = this.f6016r;
            float f16 = rectF.left;
            if (this.f6015n) {
                f13 = dp5 + dp3 + dp5;
            } else {
                f13 = 0.0f;
            }
            l11Var2.c(f16 + f13 + f11, (l11Var2.j() / f12) + centerY, e7, -1, canvas);
            l11 l11Var3 = this.f6017s;
            float f17 = rectF.left;
            if (this.f6015n) {
                f14 = dp3 + dp5 + dp5;
            }
            l11Var3.c(f17 + f14 + f11, this.f6016r.j() + centerY + dp4 + (this.f6017s.j() / f12), e7, org.telegram.ui.ActionBar.i6.v(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ia iaVar;
        boolean z10 = this.f6020y;
        org.telegram.ui.Components.bd bdVar = this.f6019x;
        if (z10 && this.E != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.f6013e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.L = true;
                    bdVar.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (bdVar.f24977i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    bdVar.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (bdVar.f24977i && (iaVar = this.f6012c) != null && this.E != null) {
                    iaVar.run(new p7(this, 1));
                }
                bdVar.c(false);
                this.L = false;
            } else if (motionEvent.getAction() == 3) {
                bdVar.c(false);
                this.L = false;
            }
            if (!this.L && !bdVar.f24977i) {
                return false;
            }
            return true;
        }
        this.L = false;
        bdVar.c(false);
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
        ha haVar = this.f6011b;
        Runnable runnable = null;
        if (isEmpty) {
            Runnable runnable2 = this.H;
            if (runnable2 != null) {
                runnable2.run();
                this.H = null;
            }
            if (this.f6020y) {
                invalidate();
            }
            this.f6020y = false;
            this.I = null;
            if (haVar != null) {
                haVar.run();
                return;
            }
            return;
        }
        s7 s7Var = this.E;
        if ((s7Var == null && this.H == null) || (s7Var != null && !TextUtils.equals(s7Var.f5957a, str) && !TextUtils.equals(this.I, str))) {
            Runnable runnable3 = this.H;
            if (runnable3 != null) {
                runnable3.run();
                this.H = null;
            }
            this.E = null;
            this.I = str;
            int i10 = this.f6010a;
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
                        runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new ai.d5(p7Var, messagesController, str, 3));
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                p7Var.run(runnable);
            }
            this.H = runnable;
            return;
        }
        s7 s7Var2 = this.E;
        if (s7Var2 != null && !this.f6020y && TextUtils.equals(s7Var2.f5957a, str)) {
            this.f6020y = true;
            a();
            invalidate();
            if (haVar != null) {
                haVar.run();
            }
        }
    }
}
