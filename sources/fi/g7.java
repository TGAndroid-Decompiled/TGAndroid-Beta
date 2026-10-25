package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zq;
public final class g7 extends View {
    public f7 E;
    public View F;
    public Object G;
    public Runnable H;
    public String I;
    public final int[] J;
    public final int[] K;
    public boolean L;
    public final int f10908a;
    public final p9 f10909b;
    public q9 f10910c;
    public final org.telegram.ui.Components.h6 d;
    public final RectF e;
    public final RectF f10911f;
    public final ImageReceiver h;
    public boolean f10912n;
    public q11 f10913r;
    public q11 f10914s;
    public final Path v;
    public final Paint f10915w;
    public final xc f10916x;
    public boolean f10917y;

    public g7(Activity activity, int i10, p9 p9Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.h6(this, 0L, 320L, ds.h);
        this.e = new RectF();
        this.f10911f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.f10915w = new Paint(1);
        this.f10916x = new xc(this);
        this.J = new int[2];
        this.K = new int[2];
        this.f10908a = i10;
        this.f10909b = p9Var;
    }

    public final void a() {
        f7 f7Var = this.E;
        if (f7Var == null) {
            return;
        }
        this.f10913r = new q11(f7Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.E.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            zq zqVar = new zq(R.drawable.settings_arrow, 0);
            zqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(zqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f10914s = new q11(spannableStringBuilder, 14.0f, null);
        this.E.d(this.h);
        this.f10912n = true;
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
        float e = this.d.e(this.f10917y);
        q11 q11Var = this.f10913r;
        if (q11Var != null && this.f10914s != null && e > 0.0f) {
            q11Var.f31798p = getWidth() * 0.7f;
            this.f10914s.f31798p = getWidth() * 0.7f;
            float dp = AndroidUtilities.dp(5.0f);
            float dp2 = AndroidUtilities.dp(10.0f);
            float dp3 = AndroidUtilities.dp(32.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            float dp5 = AndroidUtilities.dp(11.0f);
            float min = Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f);
            if (this.f10912n) {
                f7 = dp5 + dp3 + dp5;
            } else {
                f7 = 0.0f;
            }
            float max = Math.max(min, Math.max(this.f10913r.f31788c, this.f10914s.f31788c) + f7 + dp + AndroidUtilities.dp(15.0f) + dp);
            if (this.f10912n) {
                f10 = dp3;
            } else {
                f10 = 0.0f;
            }
            float max2 = Math.max(f10, this.f10914s.j() + this.f10913r.j() + dp4) + dp2 + dp2;
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e) * this.f10916x.a(0.05f);
            float dp6 = (1.0f - e) * AndroidUtilities.dp(15.0f);
            RectF rectF = this.e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f10911f;
            rectF2.set(rectF);
            AndroidUtilities.scaleRect(rectF2, lerp);
            rectF2.offset(0.0f, dp6);
            int i10 = Build.VERSION.SDK_INT;
            Paint paint = this.f10915w;
            if (i10 >= 29 && (obj = this.G) != null && this.F != null) {
                RenderNode c10 = org.telegram.messenger.d.c(obj);
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
                paint.setColor(org.telegram.ui.ActionBar.y6.o1(e, 1879048192));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            } else {
                f11 = dp;
                f12 = 2.0f;
                paint.setColor(org.telegram.ui.ActionBar.y6.o1(e, -587202560));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            }
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(0.0f, dp6);
            canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
            if (this.f10912n) {
                float f15 = dp3 / f12;
                ImageReceiver imageReceiver = this.h;
                imageReceiver.setRoundRadius((int) f15);
                imageReceiver.setImageCoords(rectF.left + f11 + dp5, rectF.centerY() - f15, dp3, dp3);
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
            }
            float centerY = rectF.centerY() - ((this.f10914s.j() + (this.f10913r.j() + dp4)) / f12);
            q11 q11Var2 = this.f10913r;
            float f16 = rectF.left;
            if (this.f10912n) {
                f13 = dp5 + dp3 + dp5;
            } else {
                f13 = 0.0f;
            }
            q11Var2.c(f16 + f13 + f11, (q11Var2.j() / f12) + centerY, e, -1, canvas);
            q11 q11Var3 = this.f10914s;
            float f17 = rectF.left;
            if (this.f10912n) {
                f14 = dp3 + dp5 + dp5;
            }
            q11Var3.c(f17 + f14 + f11, this.f10913r.j() + centerY + dp4 + (this.f10914s.j() / f12), e, org.telegram.ui.ActionBar.y6.v(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        q9 q9Var;
        boolean z10 = this.f10917y;
        xc xcVar = this.f10916x;
        if (z10 && this.E != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.L = true;
                    xcVar.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (xcVar.f34687i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    xcVar.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (xcVar.f34687i && (q9Var = this.f10910c) != null && this.E != null) {
                    q9Var.run(new c7(this, 1));
                }
                xcVar.c(false);
                this.L = false;
            } else if (motionEvent.getAction() == 3) {
                xcVar.c(false);
                this.L = false;
            }
            if (!this.L && !xcVar.f34687i) {
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
        p9 p9Var = this.f10909b;
        Runnable runnable = null;
        if (isEmpty) {
            Runnable runnable2 = this.H;
            if (runnable2 != null) {
                runnable2.run();
                this.H = null;
            }
            if (this.f10917y) {
                invalidate();
            }
            this.f10917y = false;
            this.I = null;
            if (p9Var != null) {
                p9Var.run();
                return;
            }
            return;
        }
        f7 f7Var = this.E;
        if ((f7Var == null && this.H == null) || (f7Var != null && !TextUtils.equals(f7Var.f10866a, str) && !TextUtils.equals(this.I, str))) {
            Runnable runnable3 = this.H;
            if (runnable3 != null) {
                runnable3.run();
                this.H = null;
            }
            this.E = null;
            this.I = str;
            int i10 = this.f10908a;
            c7 c7Var = new c7(this, 0);
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
                                c7Var.run(new d7(str, (TLRPC.User) userOrChat));
                            } else if (userOrChat instanceof TLRPC.Chat) {
                                c7Var.run(new e7(str, (TLRPC.Chat) userOrChat));
                            }
                        }
                        runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new bi.v3(c7Var, messagesController, str, 4));
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                c7Var.run(runnable);
            }
            this.H = runnable;
            return;
        }
        f7 f7Var2 = this.E;
        if (f7Var2 != null && !this.f10917y && TextUtils.equals(f7Var2.f10866a, str)) {
            this.f10917y = true;
            a();
            invalidate();
            if (p9Var != null) {
                p9Var.run();
            }
        }
    }
}
