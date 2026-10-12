package di;

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
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h11;
public final class s7 extends View {
    public r7 E;
    public View F;
    public Object G;
    public Runnable H;
    public String I;
    public final int[] J;
    public final int[] K;
    public boolean L;
    public final int f7772a;
    public final ga f7773b;
    public ha f7774c;
    public final org.telegram.ui.Components.g6 d;
    public final RectF e;
    public final RectF f7775f;
    public final ImageReceiver h;
    public boolean f7776n;
    public h11 f7777r;
    public h11 f7778s;
    public final Path v;
    public final Paint f7779w;
    public final org.telegram.ui.Components.ad f7780x;
    public boolean f7781y;

    public s7(Activity activity, int i10, ga gaVar) {
        super(activity);
        this.d = new org.telegram.ui.Components.g6(this, 0L, 320L, es.h);
        this.e = new RectF();
        this.f7775f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.f7779w = new Paint(1);
        this.f7780x = new org.telegram.ui.Components.ad(this);
        this.J = new int[2];
        this.K = new int[2];
        this.f7772a = i10;
        this.f7773b = gaVar;
    }

    public final void a() {
        r7 r7Var = this.E;
        if (r7Var == null) {
            return;
        }
        this.f7777r = new h11(r7Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.E.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            br brVar = new br(R.drawable.settings_arrow, 0);
            brVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(brVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f7778s = new h11(spannableStringBuilder, 14.0f, null);
        this.E.d(this.h);
        this.f7776n = true;
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
        float e = this.d.e(this.f7781y);
        h11 h11Var = this.f7777r;
        if (h11Var != null && this.f7778s != null && e > 0.0f) {
            h11Var.f25483p = getWidth() * 0.7f;
            this.f7778s.f25483p = getWidth() * 0.7f;
            float dp = AndroidUtilities.dp(5.0f);
            float dp2 = AndroidUtilities.dp(10.0f);
            float dp3 = AndroidUtilities.dp(32.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            float dp5 = AndroidUtilities.dp(11.0f);
            float min = Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f);
            if (this.f7776n) {
                f7 = dp5 + dp3 + dp5;
            } else {
                f7 = 0.0f;
            }
            float max = Math.max(min, Math.max(this.f7777r.f25473c, this.f7778s.f25473c) + f7 + dp + AndroidUtilities.dp(15.0f) + dp);
            if (this.f7776n) {
                f10 = dp3;
            } else {
                f10 = 0.0f;
            }
            float max2 = Math.max(f10, this.f7778s.j() + this.f7777r.j() + dp4) + dp2 + dp2;
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e) * this.f7780x.a(0.05f);
            float dp6 = (1.0f - e) * AndroidUtilities.dp(15.0f);
            RectF rectF = this.e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f7775f;
            rectF2.set(rectF);
            AndroidUtilities.scaleRect(rectF2, lerp);
            rectF2.offset(0.0f, dp6);
            int i10 = Build.VERSION.SDK_INT;
            Paint paint = this.f7779w;
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
                paint.setColor(org.telegram.ui.ActionBar.g6.m1(e, 1879048192));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            } else {
                f11 = dp;
                f12 = 2.0f;
                paint.setColor(org.telegram.ui.ActionBar.g6.m1(e, -587202560));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            }
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(0.0f, dp6);
            canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
            if (this.f7776n) {
                float f15 = dp3 / f12;
                ImageReceiver imageReceiver = this.h;
                imageReceiver.setRoundRadius((int) f15);
                imageReceiver.setImageCoords(rectF.left + f11 + dp5, rectF.centerY() - f15, dp3, dp3);
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
            }
            float centerY = rectF.centerY() - ((this.f7778s.j() + (this.f7777r.j() + dp4)) / f12);
            h11 h11Var2 = this.f7777r;
            float f16 = rectF.left;
            if (this.f7776n) {
                f13 = dp5 + dp3 + dp5;
            } else {
                f13 = 0.0f;
            }
            h11Var2.c(f16 + f13 + f11, (h11Var2.j() / f12) + centerY, e, -1, canvas);
            h11 h11Var3 = this.f7778s;
            float f17 = rectF.left;
            if (this.f7776n) {
                f14 = dp3 + dp5 + dp5;
            }
            h11Var3.c(f17 + f14 + f11, this.f7777r.j() + centerY + dp4 + (this.f7778s.j() / f12), e, org.telegram.ui.ActionBar.g6.v(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ha haVar;
        boolean z10 = this.f7781y;
        org.telegram.ui.Components.ad adVar = this.f7780x;
        if (z10 && this.E != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.L = true;
                    adVar.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (adVar.f23522i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    adVar.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (adVar.f23522i && (haVar = this.f7774c) != null && this.E != null) {
                    haVar.run(new o7(this, 1));
                }
                adVar.c(false);
                this.L = false;
            } else if (motionEvent.getAction() == 3) {
                adVar.c(false);
                this.L = false;
            }
            if (!this.L && !adVar.f23522i) {
                return false;
            }
            return true;
        }
        this.L = false;
        adVar.c(false);
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
        ga gaVar = this.f7773b;
        Runnable runnable = null;
        if (isEmpty) {
            Runnable runnable2 = this.H;
            if (runnable2 != null) {
                runnable2.run();
                this.H = null;
            }
            if (this.f7781y) {
                invalidate();
            }
            this.f7781y = false;
            this.I = null;
            if (gaVar != null) {
                gaVar.run();
                return;
            }
            return;
        }
        r7 r7Var = this.E;
        if ((r7Var == null && this.H == null) || (r7Var != null && !TextUtils.equals(r7Var.f7719a, str) && !TextUtils.equals(this.I, str))) {
            Runnable runnable3 = this.H;
            if (runnable3 != null) {
                runnable3.run();
                this.H = null;
            }
            this.E = null;
            this.I = str;
            int i10 = this.f7772a;
            o7 o7Var = new o7(this, 0);
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
                                o7Var.run(new p7(str, (TLRPC.User) userOrChat));
                            } else if (userOrChat instanceof TLRPC.Chat) {
                                o7Var.run(new q7(str, (TLRPC.Chat) userOrChat));
                            }
                        }
                        runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new bi.q4(o7Var, messagesController, str, 3));
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                o7Var.run(runnable);
            }
            this.H = runnable;
            return;
        }
        r7 r7Var2 = this.E;
        if (r7Var2 != null && !this.f7781y && TextUtils.equals(r7Var2.f7719a, str)) {
            this.f7781y = true;
            a();
            invalidate();
            if (gaVar != null) {
                gaVar.run();
            }
        }
    }
}
