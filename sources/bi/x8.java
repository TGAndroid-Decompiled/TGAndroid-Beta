package bi;

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
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.wr;
public final class x8 extends View {
    public w8 E;
    public View F;
    public Object G;
    public Runnable H;
    public String I;
    public final int[] J;
    public final int[] K;
    public boolean L;
    public final int f3920a;
    public final tb f3921b;
    public ub f3922c;
    public final org.telegram.ui.Components.d6 d;
    public final RectF e;
    public final RectF f3923f;
    public final ImageReceiver h;
    public boolean f3924n;
    public t01 f3925r;
    public t01 f3926s;
    public final Path v;
    public final Paint f3927w;
    public final org.telegram.ui.Components.xc f3928x;
    public boolean f3929y;

    public x8(Activity activity, int i10, tb tbVar) {
        super(activity);
        this.d = new org.telegram.ui.Components.d6(this, 0L, 320L, wr.h);
        this.e = new RectF();
        this.f3923f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.f3927w = new Paint(1);
        this.f3928x = new org.telegram.ui.Components.xc(this);
        this.J = new int[2];
        this.K = new int[2];
        this.f3920a = i10;
        this.f3921b = tbVar;
    }

    public final void a() {
        w8 w8Var = this.E;
        if (w8Var == null) {
            return;
        }
        this.f3925r = new t01(w8Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.E.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            uq uqVar = new uq(R.drawable.settings_arrow, 0);
            uqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(uqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f3926s = new t01(spannableStringBuilder, 14.0f, null);
        this.E.d(this.h);
        this.f3924n = true;
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
        float e = this.d.e(this.f3929y);
        t01 t01Var = this.f3925r;
        if (t01Var != null && this.f3926s != null && e > 0.0f) {
            t01Var.f27257p = getWidth() * 0.7f;
            this.f3926s.f27257p = getWidth() * 0.7f;
            float dp = AndroidUtilities.dp(5.0f);
            float dp2 = AndroidUtilities.dp(10.0f);
            float dp3 = AndroidUtilities.dp(32.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            float dp5 = AndroidUtilities.dp(11.0f);
            float min = Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f);
            if (this.f3924n) {
                f7 = dp5 + dp3 + dp5;
            } else {
                f7 = 0.0f;
            }
            float max = Math.max(min, Math.max(this.f3925r.f27247c, this.f3926s.f27247c) + f7 + dp + AndroidUtilities.dp(15.0f) + dp);
            if (this.f3924n) {
                f10 = dp3;
            } else {
                f10 = 0.0f;
            }
            float max2 = Math.max(f10, this.f3926s.j() + this.f3925r.j() + dp4) + dp2 + dp2;
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e) * this.f3928x.a(0.05f);
            float dp6 = (1.0f - e) * AndroidUtilities.dp(15.0f);
            RectF rectF = this.e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f3923f;
            rectF2.set(rectF);
            AndroidUtilities.scaleRect(rectF2, lerp);
            rectF2.offset(0.0f, dp6);
            int i10 = Build.VERSION.SDK_INT;
            Paint paint = this.f3927w;
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
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(e, 1879048192));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            } else {
                f11 = dp;
                f12 = 2.0f;
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(e, -587202560));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            }
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(0.0f, dp6);
            canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
            if (this.f3924n) {
                float f15 = dp3 / f12;
                ImageReceiver imageReceiver = this.h;
                imageReceiver.setRoundRadius((int) f15);
                imageReceiver.setImageCoords(rectF.left + f11 + dp5, rectF.centerY() - f15, dp3, dp3);
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
            }
            float centerY = rectF.centerY() - ((this.f3926s.j() + (this.f3925r.j() + dp4)) / f12);
            t01 t01Var2 = this.f3925r;
            float f16 = rectF.left;
            if (this.f3924n) {
                f13 = dp5 + dp3 + dp5;
            } else {
                f13 = 0.0f;
            }
            t01Var2.c(f16 + f13 + f11, (t01Var2.j() / f12) + centerY, e, -1, canvas);
            t01 t01Var3 = this.f3926s;
            float f17 = rectF.left;
            if (this.f3924n) {
                f14 = dp3 + dp5 + dp5;
            }
            t01Var3.c(f17 + f14 + f11, this.f3925r.j() + centerY + dp4 + (this.f3926s.j() / f12), e, org.telegram.ui.ActionBar.j6.v(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ub ubVar;
        boolean z10 = this.f3929y;
        org.telegram.ui.Components.xc xcVar = this.f3928x;
        if (z10 && this.E != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.L = true;
                    xcVar.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (xcVar.h && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    xcVar.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (xcVar.h && (ubVar = this.f3922c) != null && this.E != null) {
                    ubVar.run(new s8(this, 1));
                }
                xcVar.c(false);
                this.L = false;
            } else if (motionEvent.getAction() == 3) {
                xcVar.c(false);
                this.L = false;
            }
            if (!this.L && !xcVar.h) {
                return false;
            }
            return true;
        }
        this.L = false;
        xcVar.c(false);
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
        tb tbVar = this.f3921b;
        Runnable runnable = null;
        if (isEmpty) {
            Runnable runnable2 = this.H;
            if (runnable2 != null) {
                runnable2.run();
                this.H = null;
            }
            if (this.f3929y) {
                invalidate();
            }
            this.f3929y = false;
            this.I = null;
            if (tbVar != null) {
                tbVar.run();
                return;
            }
            return;
        }
        w8 w8Var = this.E;
        if ((w8Var == null && this.H == null) || (w8Var != null && !TextUtils.equals(w8Var.f3835a, str) && !TextUtils.equals(this.I, str))) {
            Runnable runnable3 = this.H;
            if (runnable3 != null) {
                runnable3.run();
                this.H = null;
            }
            this.E = null;
            this.I = str;
            int i10 = this.f3920a;
            s8 s8Var = new s8(this, 0);
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
                                s8Var.run(new u8(str, (TLRPC.User) userOrChat));
                            } else if (userOrChat instanceof TLRPC.Chat) {
                                s8Var.run(new v8(str, (TLRPC.Chat) userOrChat));
                            }
                        }
                        runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new t8(s8Var, messagesController, str, 0));
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                s8Var.run(runnable);
            }
            this.H = runnable;
            return;
        }
        w8 w8Var2 = this.E;
        if (w8Var2 != null && !this.f3929y && TextUtils.equals(w8Var2.f3835a, str)) {
            this.f3929y = true;
            a();
            invalidate();
            if (tbVar != null) {
                tbVar.run();
            }
        }
    }
}
