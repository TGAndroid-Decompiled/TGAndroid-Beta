package lh;

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
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;

public final class i7 extends View {
    public h7 A;
    public View B;
    public Object C;
    public Runnable D;
    public String E;
    public final int[] F;
    public final int[] G;
    public boolean H;

    public final int f16117a;

    public final s9 f16118b;

    public t9 f16119c;
    public final org.telegram.ui.Components.y5 d;

    public final RectF f16120e;

    public final RectF f16121f;
    public final ImageReceiver h;

    public boolean f16122n;

    public pz0 f16123r;

    public pz0 f16124s;
    public final Path v;

    public final Paint f16125w;

    public final org.telegram.ui.Components.nc f16126x;

    public boolean f16127y;

    public i7(Activity activity, int i10, s9 s9Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.y5(this, 0L, 320L, er.h);
        this.f16120e = new RectF();
        this.f16121f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.f16125w = new Paint(1);
        this.f16126x = new org.telegram.ui.Components.nc(this);
        this.F = new int[2];
        this.G = new int[2];
        this.f16117a = i10;
        this.f16118b = s9Var;
    }

    public final void a() {
        h7 h7Var = this.A;
        if (h7Var == null) {
            return;
        }
        this.f16123r = new pz0(h7Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.A.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            cq cqVar = new cq(R.drawable.settings_arrow, 0);
            cqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(cqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f16124s = new pz0(spannableStringBuilder, 14.0f, null);
        this.A.d(this.h);
        this.f16122n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Object obj;
        float fE = this.d.e(this.f16127y);
        pz0 pz0Var = this.f16123r;
        if (pz0Var == null || this.f16124s == null || fE <= 0.0f) {
            return;
        }
        pz0Var.f31708p = getWidth() * 0.7f;
        this.f16124s.f31708p = getWidth() * 0.7f;
        float fDp = AndroidUtilities.dp(5.0f);
        float fDp2 = AndroidUtilities.dp(10.0f);
        float fDp3 = AndroidUtilities.dp(32.0f);
        float fDp4 = AndroidUtilities.dp(2.0f);
        float fDp5 = AndroidUtilities.dp(11.0f);
        float fMax = Math.max(Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f), Math.max(this.f16123r.f31697c, this.f16124s.f31697c) + (this.f16122n ? fDp5 + fDp3 + fDp5 : 0.0f) + fDp + AndroidUtilities.dp(15.0f) + fDp);
        float fMax2 = Math.max(this.f16122n ? fDp3 : 0.0f, this.f16124s.j() + this.f16123r.j() + fDp4) + fDp2 + fDp2;
        float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, fE) * this.f16126x.a(0.05f);
        float fDp6 = (1.0f - fE) * AndroidUtilities.dp(15.0f);
        float width = (getWidth() - fMax) / 2.0f;
        float height = (getHeight() - fMax2) / 2.0f;
        float width2 = (getWidth() + fMax) / 2.0f;
        float height2 = (getHeight() + fMax2) / 2.0f;
        RectF rectF = this.f16120e;
        rectF.set(width, height, width2, height2);
        RectF rectF2 = this.f16121f;
        rectF2.set(rectF);
        AndroidUtilities.scaleRect(rectF2, fLerp);
        rectF2.offset(0.0f, fDp6);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.f16125w;
        if (i10 < 29 || (obj = this.C) == null || this.B == null) {
            f10 = 2.0f;
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(fE, -587202560));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        } else {
            RenderNode renderNodeC = org.telegram.messenger.b.c(obj);
            Path path = this.v;
            path.rewind();
            f10 = 2.0f;
            path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            int[] iArr = this.F;
            getLocationOnScreen(iArr);
            View view = this.B;
            int[] iArr2 = this.G;
            view.getLocationOnScreen(iArr2);
            canvas.saveLayerAlpha(rectF2, (int) (255.0f * fE), 31);
            canvas.clipPath(path);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            float fMax3 = Math.max(this.B.getWidth() / renderNodeC.getWidth(), this.B.getHeight() / renderNodeC.getHeight());
            canvas.scale(fMax3, fMax3);
            canvas.drawRenderNode(renderNodeC);
            canvas.restore();
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(fE, 1879048192));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        canvas.save();
        canvas.translate(0.0f, fDp6);
        canvas.scale(fLerp, fLerp, rectF.centerX(), rectF.centerY());
        if (this.f16122n) {
            float f11 = fDp3 / f10;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.setRoundRadius((int) f11);
            imageReceiver.setImageCoords(rectF.left + fDp + fDp5, rectF.centerY() - f11, fDp3, fDp3);
            imageReceiver.setAlpha(fE);
            imageReceiver.draw(canvas);
        }
        float fCenterY = rectF.centerY() - ((this.f16124s.j() + (this.f16123r.j() + fDp4)) / f10);
        pz0 pz0Var2 = this.f16123r;
        pz0Var2.c(rectF.left + (this.f16122n ? fDp5 + fDp3 + fDp5 : 0.0f) + fDp, (pz0Var2.j() / f10) + fCenterY, fE, -1, canvas);
        this.f16124s.c(rectF.left + (this.f16122n ? fDp3 + fDp5 + fDp5 : 0.0f) + fDp, this.f16123r.j() + fCenterY + fDp4 + (this.f16124s.j() / f10), fE, org.telegram.ui.ActionBar.g6.v(-16777216, -1610612737), canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t9 t9Var;
        boolean z10 = this.f16127y;
        org.telegram.ui.Components.nc ncVar = this.f16126x;
        if (!z10 || this.A == null) {
            this.H = false;
            ncVar.c(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.f16120e;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.H = true;
                ncVar.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (ncVar.h && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                ncVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (ncVar.h && (t9Var = this.f16119c) != null && this.A != null) {
                t9Var.run(new e7(this, 1));
            }
            ncVar.c(false);
            this.H = false;
        } else if (motionEvent.getAction() == 3) {
            ncVar.c(false);
            this.H = false;
        }
        return this.H || ncVar.h;
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
        boolean zIsEmpty = TextUtils.isEmpty(str);
        s9 s9Var = this.f16118b;
        Runnable runnableResolve = null;
        if (zIsEmpty) {
            Runnable runnable = this.D;
            if (runnable != null) {
                runnable.run();
                this.D = null;
            }
            if (this.f16127y) {
                invalidate();
            }
            this.f16127y = false;
            this.E = null;
            if (s9Var != null) {
                s9Var.run();
                return;
            }
            return;
        }
        h7 h7Var = this.A;
        if (!(h7Var == null && this.D == null) && (h7Var == null || TextUtils.equals(h7Var.f16075a, str) || TextUtils.equals(this.E, str))) {
            h7 h7Var2 = this.A;
            if (h7Var2 == null || this.f16127y || !TextUtils.equals(h7Var2.f16075a, str)) {
                return;
            }
            this.f16127y = true;
            a();
            invalidate();
            if (s9Var != null) {
                s9Var.run();
                return;
            }
            return;
        }
        Runnable runnable2 = this.D;
        if (runnable2 != null) {
            runnable2.run();
            this.D = null;
        }
        this.A = null;
        this.E = str;
        int i10 = this.f16117a;
        e7 e7Var = new e7(this, 0);
        try {
            MessagesController messagesController = MessagesController.getInstance(i10);
            String str2 = messagesController.linkPrefix;
            Uri uri = Uri.parse(str);
            if (TextUtils.equals(uri.getHost(), str2)) {
                List<String> pathSegments = uri.getPathSegments();
                if (!pathSegments.isEmpty()) {
                    String str3 = pathSegments.get(0);
                    String queryParameter = uri.getQueryParameter("ref");
                    if (TextUtils.isEmpty(queryParameter)) {
                        TLObject userOrChat = messagesController.getUserOrChat(str3);
                        if (userOrChat instanceof TLRPC.User) {
                            e7Var.run(new f7(str, (TLRPC.User) userOrChat));
                        } else if (userOrChat instanceof TLRPC.Chat) {
                            e7Var.run(new g7(str, (TLRPC.Chat) userOrChat));
                        } else {
                            runnableResolve = messagesController.getUserNameResolver().resolve(str3, queryParameter, new ag.o0(e7Var, messagesController, str, 1));
                        }
                    } else {
                        runnableResolve = messagesController.getUserNameResolver().resolve(str3, queryParameter, new ag.o0(e7Var, messagesController, str, 1));
                    }
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            e7Var.run(runnableResolve);
        }
        this.D = runnableResolve;
    }
}
