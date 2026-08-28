package kh;

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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
public final class k7 extends View {
    public j7 A;
    public View B;
    public Object C;
    public Runnable D;
    public String E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final int f15528a;
    public final v9 f15529b;
    public w9 f15530c;
    public final org.telegram.ui.Components.y5 d;
    public final RectF f15531e;
    public final RectF f15532f;
    public final ImageReceiver h;
    public boolean f15533n;
    public nz0 f15534r;
    public nz0 f15535s;
    public final Path v;
    public final Paint f15536w;
    public final org.telegram.ui.Components.pc f15537x;
    public boolean f15538y;

    public k7(Activity activity, int i9, v9 v9Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.y5(this, 0L, 320L, gr.h);
        this.f15531e = new RectF();
        this.f15532f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.f15536w = new Paint(1);
        this.f15537x = new org.telegram.ui.Components.pc(this);
        this.F = new int[2];
        this.G = new int[2];
        this.f15528a = i9;
        this.f15529b = v9Var;
    }

    public final void a() {
        j7 j7Var = this.A;
        if (j7Var == null) {
            return;
        }
        this.f15534r = new nz0(j7Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.A.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            eq eqVar = new eq(R.drawable.settings_arrow, 0);
            eqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f15535s = new nz0(spannableStringBuilder, 14.0f, null);
        this.A.d(this.h);
        this.f15533n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Object obj;
        int[] iArr;
        int[] iArr2;
        float e10 = this.d.e(this.f15538y);
        nz0 nz0Var = this.f15534r;
        if (nz0Var != null && this.f15535s != null && e10 > 0.0f) {
            nz0Var.f31234p = getWidth() * 0.7f;
            this.f15535s.f31234p = getWidth() * 0.7f;
            float dp = AndroidUtilities.dp(5.0f);
            float dp2 = AndroidUtilities.dp(10.0f);
            float dp3 = AndroidUtilities.dp(32.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            float dp5 = AndroidUtilities.dp(11.0f);
            float min = Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f);
            if (this.f15533n) {
                f10 = dp5 + dp3 + dp5;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(min, Math.max(this.f15534r.f31223c, this.f15535s.f31223c) + f10 + dp + AndroidUtilities.dp(15.0f) + dp);
            if (this.f15533n) {
                f11 = dp3;
            } else {
                f11 = 0.0f;
            }
            float max2 = Math.max(f11, this.f15535s.j() + this.f15534r.j() + dp4) + dp2 + dp2;
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e10) * this.f15537x.a(0.05f);
            float dp6 = (1.0f - e10) * AndroidUtilities.dp(15.0f);
            RectF rectF = this.f15531e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f15532f;
            rectF2.set(rectF);
            AndroidUtilities.scaleRect(rectF2, lerp);
            rectF2.offset(0.0f, dp6);
            int i9 = Build.VERSION.SDK_INT;
            Paint paint = this.f15536w;
            if (i9 >= 29 && (obj = this.C) != null && this.B != null) {
                RenderNode c10 = org.telegram.messenger.b.c(obj);
                Path path = this.v;
                path.rewind();
                f13 = 2.0f;
                f12 = dp;
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                getLocationOnScreen(this.F);
                this.B.getLocationOnScreen(this.G);
                canvas.saveLayerAlpha(rectF2, (int) (255.0f * e10), 31);
                canvas.clipPath(path);
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                float max3 = Math.max(this.B.getWidth() / c10.getWidth(), this.B.getHeight() / c10.getHeight());
                canvas.scale(max3, max3);
                canvas.drawRenderNode(c10);
                canvas.restore();
                paint.setColor(org.telegram.ui.ActionBar.f6.l1(e10, 1879048192));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            } else {
                f12 = dp;
                f13 = 2.0f;
                paint.setColor(org.telegram.ui.ActionBar.f6.l1(e10, -587202560));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            }
            canvas.save();
            float f15 = 0.0f;
            canvas.translate(0.0f, dp6);
            canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
            if (this.f15533n) {
                float f16 = dp3 / f13;
                ImageReceiver imageReceiver = this.h;
                imageReceiver.setRoundRadius((int) f16);
                imageReceiver.setImageCoords(rectF.left + f12 + dp5, rectF.centerY() - f16, dp3, dp3);
                imageReceiver.setAlpha(e10);
                imageReceiver.draw(canvas);
            }
            float centerY = rectF.centerY() - ((this.f15535s.j() + (this.f15534r.j() + dp4)) / f13);
            nz0 nz0Var2 = this.f15534r;
            float f17 = rectF.left;
            if (this.f15533n) {
                f14 = dp5 + dp3 + dp5;
            } else {
                f14 = 0.0f;
            }
            nz0Var2.c(f17 + f14 + f12, (nz0Var2.j() / f13) + centerY, e10, -1, canvas);
            nz0 nz0Var3 = this.f15535s;
            float f18 = rectF.left;
            if (this.f15533n) {
                f15 = dp3 + dp5 + dp5;
            }
            nz0Var3.c(f18 + f15 + f12, this.f15534r.j() + centerY + dp4 + (this.f15535s.j() / f13), e10, org.telegram.ui.ActionBar.f6.v(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        w9 w9Var;
        boolean z10 = this.f15538y;
        org.telegram.ui.Components.pc pcVar = this.f15537x;
        if (z10 && this.A != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.f15531e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.H = true;
                    pcVar.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (pcVar.h && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    pcVar.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (pcVar.h && (w9Var = this.f15530c) != null && this.A != null) {
                    w9Var.run(new f7(this, 1));
                }
                pcVar.c(false);
                this.H = false;
            } else if (motionEvent.getAction() == 3) {
                pcVar.c(false);
                this.H = false;
            }
            if (!this.H && !pcVar.h) {
                return false;
            }
            return true;
        }
        this.H = false;
        pcVar.c(false);
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
        v9 v9Var = this.f15529b;
        Runnable runnable = null;
        if (isEmpty) {
            Runnable runnable2 = this.D;
            if (runnable2 != null) {
                runnable2.run();
                this.D = null;
            }
            if (this.f15538y) {
                invalidate();
            }
            this.f15538y = false;
            this.E = null;
            if (v9Var != null) {
                v9Var.run();
                return;
            }
            return;
        }
        j7 j7Var = this.A;
        if ((j7Var == null && this.D == null) || (j7Var != null && !TextUtils.equals(j7Var.f15475a, str) && !TextUtils.equals(this.E, str))) {
            Runnable runnable3 = this.D;
            if (runnable3 != null) {
                runnable3.run();
                this.D = null;
            }
            this.A = null;
            this.E = str;
            int i9 = this.f15528a;
            f7 f7Var = new f7(this, 0);
            try {
                MessagesController messagesController = MessagesController.getInstance(i9);
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
                                f7Var.run(new h7(str, (TLRPC.User) userOrChat));
                            } else if (userOrChat instanceof TLRPC.Chat) {
                                f7Var.run(new i7(str, (TLRPC.Chat) userOrChat));
                            }
                        }
                        runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new g7(f7Var, messagesController, str, 0));
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                f7Var.run(runnable);
            }
            this.D = runnable;
            return;
        }
        j7 j7Var2 = this.A;
        if (j7Var2 != null && !this.f15538y && TextUtils.equals(j7Var2.f15475a, str)) {
            this.f15538y = true;
            a();
            invalidate();
            if (v9Var != null) {
                v9Var.run();
            }
        }
    }
}
