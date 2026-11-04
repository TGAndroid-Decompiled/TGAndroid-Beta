package gi;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class r6 extends View {
    public boolean E;
    public q6 F;
    public View G;
    public Object H;
    public org.telegram.messenger.k7 I;
    public String J;
    public final int[] K;
    public final int[] L;
    public boolean M;
    public final int f13512a;
    public final v8 f13513b;
    public w8 f13514c;
    public final org.telegram.ui.Components.u5 d;
    public final RectF f13515e;
    public final RectF f13516f;
    public final ImageReceiver h;
    public boolean f13517n;
    public ly0 f13518r;
    public ly0 f13519s;
    public final Path f13520w;
    public final Paint f13521x;
    public final gc f13522y;

    public r6(Activity activity, int i3, v8 v8Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.h);
        this.f13515e = new RectF();
        this.f13516f = new RectF();
        this.h = new ImageReceiver(this);
        this.f13520w = new Path();
        this.f13521x = new Paint(1);
        this.f13522y = new gc(this);
        this.K = new int[2];
        this.L = new int[2];
        this.f13512a = i3;
        this.f13513b = v8Var;
    }

    public final void a() {
        q6 q6Var = this.F;
        if (q6Var == null) {
            return;
        }
        this.f13518r = new ly0(q6Var.b(), 16.0f, org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(this.F.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            wp wpVar = new wp(2131232695, 0);
            wpVar.I = 1.25f;
            wpVar.J = 1.25f;
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f13519s = new ly0(spannableStringBuilder, 14.0f, null);
        this.F.d(this.h);
        this.f13517n = true;
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
        float d = this.d.d(this.E);
        ly0 ly0Var = this.f13518r;
        if (ly0Var != null && this.f13519s != null && d > 0.0f) {
            ly0Var.f35929p = getWidth() * 0.7f;
            this.f13519s.f35929p = getWidth() * 0.7f;
            float L = org.telegram.messenger.g0.L(5.0f);
            float L2 = org.telegram.messenger.g0.L(10.0f);
            float L3 = org.telegram.messenger.g0.L(32.0f);
            float L4 = org.telegram.messenger.g0.L(2.0f);
            float L5 = org.telegram.messenger.g0.L(11.0f);
            float min = Math.min(org.telegram.messenger.g0.L(200.0f), getWidth() * 0.8f);
            if (this.f13517n) {
                f10 = L5 + L3 + L5;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(min, Math.max(this.f13518r.f35918c, this.f13519s.f35918c) + f10 + L + org.telegram.messenger.g0.L(15.0f) + L);
            if (this.f13517n) {
                f11 = L3;
            } else {
                f11 = 0.0f;
            }
            float max2 = Math.max(f11, this.f13519s.i() + this.f13518r.i() + L4) + L2 + L2;
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d) * this.f13522y.a(0.05f);
            float L6 = (1.0f - d) * org.telegram.messenger.g0.L(15.0f);
            RectF rectF = this.f13515e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f13516f;
            rectF2.set(rectF);
            org.telegram.messenger.g0.j3(rectF2, T1, rectF2.centerX(), rectF2.centerY());
            rectF2.offset(0.0f, L6);
            int i3 = Build.VERSION.SDK_INT;
            Paint paint = this.f13521x;
            if (i3 >= 29 && (obj = this.H) != null && this.G != null) {
                RenderNode d10 = o4.v0.d(obj);
                Path path = this.f13520w;
                path.rewind();
                f13 = 2.0f;
                f12 = L;
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                getLocationOnScreen(this.K);
                this.G.getLocationOnScreen(this.L);
                canvas.saveLayerAlpha(rectF2, (int) (255.0f * d), 31);
                canvas.clipPath(path);
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                float max3 = Math.max(this.G.getWidth() / d10.getWidth(), this.G.getHeight() / d10.getHeight());
                canvas.scale(max3, max3);
                canvas.drawRenderNode(d10);
                canvas.restore();
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(d, 1879048192));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paint);
            } else {
                f12 = L;
                f13 = 2.0f;
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(d, -587202560));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paint);
            }
            canvas.save();
            float f15 = 0.0f;
            canvas.translate(0.0f, L6);
            canvas.scale(T1, T1, rectF.centerX(), rectF.centerY());
            if (this.f13517n) {
                float f16 = L3 / f13;
                ImageReceiver imageReceiver = this.h;
                imageReceiver.J0((int) f16);
                imageReceiver.y0(rectF.left + f12 + L5, rectF.centerY() - f16, L3, L3);
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
            }
            float centerY = rectF.centerY() - ((this.f13519s.i() + (this.f13518r.i() + L4)) / f13);
            ly0 ly0Var2 = this.f13518r;
            float f17 = rectF.left;
            if (this.f13517n) {
                f14 = L5 + L3 + L5;
            } else {
                f14 = 0.0f;
            }
            ly0Var2.c(f17 + f14 + f12, (ly0Var2.i() / f13) + centerY, d, -1, canvas);
            ly0 ly0Var3 = this.f13519s;
            float f18 = rectF.left;
            if (this.f13517n) {
                f15 = L3 + L5 + L5;
            }
            ly0Var3.c(f18 + f15 + f12, this.f13518r.i() + centerY + L4 + (this.f13519s.i() / f13), d, org.telegram.ui.ActionBar.k6.w(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        w8 w8Var;
        boolean z10 = this.E;
        gc gcVar = this.f13522y;
        if (z10 && this.F != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.f13515e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.M = true;
                    gcVar.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (gcVar.f34049i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    gcVar.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (gcVar.f34049i && (w8Var = this.f13514c) != null && this.F != null) {
                    w8Var.a(new n6(this, 1));
                }
                gcVar.c(false);
                this.M = false;
            } else if (motionEvent.getAction() == 3) {
                gcVar.c(false);
                this.M = false;
            }
            if (!this.M && !gcVar.f34049i) {
                return false;
            }
            return true;
        }
        this.M = false;
        gcVar.c(false);
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.R();
    }

    public void setLink(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        v8 v8Var = this.f13513b;
        org.telegram.messenger.k7 k7Var = null;
        if (isEmpty) {
            org.telegram.messenger.k7 k7Var2 = this.I;
            if (k7Var2 != null) {
                k7Var2.run();
                this.I = null;
            }
            if (this.E) {
                invalidate();
            }
            this.E = false;
            this.J = null;
            if (v8Var != null) {
                v8Var.run();
                return;
            }
            return;
        }
        q6 q6Var = this.F;
        if ((q6Var == null && this.I == null) || (q6Var != null && !TextUtils.equals(q6Var.f13435a, str) && !TextUtils.equals(this.J, str))) {
            org.telegram.messenger.k7 k7Var3 = this.I;
            if (k7Var3 != null) {
                k7Var3.run();
                this.I = null;
            }
            this.F = null;
            this.J = str;
            int i3 = this.f13512a;
            n6 n6Var = new n6(this, 0);
            try {
                hp s12 = hp.s1(i3);
                String str2 = s12.V2;
                Uri parse = Uri.parse(str);
                if (TextUtils.equals(parse.getHost(), str2)) {
                    List<String> pathSegments = parse.getPathSegments();
                    if (!pathSegments.isEmpty()) {
                        String str3 = pathSegments.get(0);
                        String queryParameter = parse.getQueryParameter("ref");
                        if (TextUtils.isEmpty(queryParameter)) {
                            TLObject f22 = s12.f2(str3);
                            if (f22 instanceof TLRPC.User) {
                                n6Var.a(new o6(str, (TLRPC.User) f22));
                            } else if (f22 instanceof TLRPC.Chat) {
                                n6Var.a(new p6(str, (TLRPC.Chat) f22));
                            }
                        }
                        k7Var = s12.d2().a(str3, queryParameter, new ai.m(n6Var, s12, str, 6));
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                n6Var.a(k7Var);
            }
            this.I = k7Var;
            return;
        }
        q6 q6Var2 = this.F;
        if (q6Var2 != null && !this.E && TextUtils.equals(q6Var2.f13435a, str)) {
            this.E = true;
            a();
            invalidate();
            if (v8Var != null) {
                v8Var.run();
            }
        }
    }
}
