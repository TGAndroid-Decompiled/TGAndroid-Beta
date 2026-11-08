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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class q6 extends View {
    public boolean D;
    public p6 E;
    public View F;
    public Object G;
    public org.telegram.messenger.l7 H;
    public String I;
    public final int[] J;
    public final int[] K;
    public boolean L;
    public final int f12664a;
    public final u8 f12665b;
    public v8 f12666c;
    public final org.telegram.ui.Components.w5 d;
    public final RectF f12667e;
    public final RectF f12668f;
    public final ImageReceiver h;
    public boolean f12669n;
    public my0 f12670r;
    public my0 f12671s;
    public final Path f12672w;
    public final Paint f12673x;
    public final ic f12674y;

    public q6(Activity activity, int i7, u8 u8Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.h);
        this.f12667e = new RectF();
        this.f12668f = new RectF();
        this.h = new ImageReceiver(this);
        this.f12672w = new Path();
        this.f12673x = new Paint(1);
        this.f12674y = new ic(this);
        this.J = new int[2];
        this.K = new int[2];
        this.f12664a = i7;
        this.f12665b = u8Var;
    }

    public final void a() {
        p6 p6Var = this.E;
        if (p6Var == null) {
            return;
        }
        this.f12670r = new my0(p6Var.b(), 16.0f, org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(this.E.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            wp wpVar = new wp(2131232697, 0);
            wpVar.H = 1.25f;
            wpVar.I = 1.25f;
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f12671s = new my0(spannableStringBuilder, 14.0f, null);
        this.E.d(this.h);
        this.f12669n = true;
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
        float d = this.d.d(this.D);
        my0 my0Var = this.f12670r;
        if (my0Var != null && this.f12671s != null && d > 0.0f) {
            my0Var.f36158p = getWidth() * 0.7f;
            this.f12671s.f36158p = getWidth() * 0.7f;
            float L = org.telegram.messenger.g0.L(5.0f);
            float L2 = org.telegram.messenger.g0.L(10.0f);
            float L3 = org.telegram.messenger.g0.L(32.0f);
            float L4 = org.telegram.messenger.g0.L(2.0f);
            float L5 = org.telegram.messenger.g0.L(11.0f);
            float min = Math.min(org.telegram.messenger.g0.L(200.0f), getWidth() * 0.8f);
            if (this.f12669n) {
                f10 = L5 + L3 + L5;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(min, Math.max(this.f12670r.f36147c, this.f12671s.f36147c) + f10 + L + org.telegram.messenger.g0.L(15.0f) + L);
            if (this.f12669n) {
                f11 = L3;
            } else {
                f11 = 0.0f;
            }
            float max2 = Math.max(f11, this.f12671s.i() + this.f12670r.i() + L4) + L2 + L2;
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d) * this.f12674y.a(0.05f);
            float L6 = (1.0f - d) * org.telegram.messenger.g0.L(15.0f);
            RectF rectF = this.f12667e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f12668f;
            rectF2.set(rectF);
            org.telegram.messenger.g0.j3(rectF2, T1, rectF2.centerX(), rectF2.centerY());
            rectF2.offset(0.0f, L6);
            int i7 = Build.VERSION.SDK_INT;
            Paint paint = this.f12673x;
            if (i7 >= 29 && (obj = this.G) != null && this.F != null) {
                RenderNode e10 = ni.a.e(obj);
                Path path = this.f12672w;
                path.rewind();
                f13 = 2.0f;
                f12 = L;
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                getLocationOnScreen(this.J);
                this.F.getLocationOnScreen(this.K);
                canvas.saveLayerAlpha(rectF2, (int) (255.0f * d), 31);
                canvas.clipPath(path);
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                float max3 = Math.max(this.F.getWidth() / e10.getWidth(), this.F.getHeight() / e10.getHeight());
                canvas.scale(max3, max3);
                canvas.drawRenderNode(e10);
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
            if (this.f12669n) {
                float f16 = L3 / f13;
                ImageReceiver imageReceiver = this.h;
                imageReceiver.J0((int) f16);
                imageReceiver.y0(rectF.left + f12 + L5, rectF.centerY() - f16, L3, L3);
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
            }
            float centerY = rectF.centerY() - ((this.f12671s.i() + (this.f12670r.i() + L4)) / f13);
            my0 my0Var2 = this.f12670r;
            float f17 = rectF.left;
            if (this.f12669n) {
                f14 = L5 + L3 + L5;
            } else {
                f14 = 0.0f;
            }
            my0Var2.c(f17 + f14 + f12, (my0Var2.i() / f13) + centerY, d, -1, canvas);
            my0 my0Var3 = this.f12671s;
            float f18 = rectF.left;
            if (this.f12669n) {
                f15 = L3 + L5 + L5;
            }
            my0Var3.c(f18 + f15 + f12, this.f12670r.i() + centerY + L4 + (this.f12671s.i() / f13), d, org.telegram.ui.ActionBar.k6.w(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        v8 v8Var;
        boolean z9 = this.D;
        ic icVar = this.f12674y;
        if (z9 && this.E != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.f12667e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.L = true;
                    icVar.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (icVar.f34629i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    icVar.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (icVar.f34629i && (v8Var = this.f12666c) != null && this.E != null) {
                    v8Var.a(new m6(this, 1));
                }
                icVar.c(false);
                this.L = false;
            } else if (motionEvent.getAction() == 3) {
                icVar.c(false);
                this.L = false;
            }
            if (!this.L && !icVar.f34629i) {
                return false;
            }
            return true;
        }
        this.L = false;
        icVar.c(false);
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
        u8 u8Var = this.f12665b;
        org.telegram.messenger.l7 l7Var = null;
        if (isEmpty) {
            org.telegram.messenger.l7 l7Var2 = this.H;
            if (l7Var2 != null) {
                l7Var2.run();
                this.H = null;
            }
            if (this.D) {
                invalidate();
            }
            this.D = false;
            this.I = null;
            if (u8Var != null) {
                u8Var.run();
                return;
            }
            return;
        }
        p6 p6Var = this.E;
        if ((p6Var == null && this.H == null) || (p6Var != null && !TextUtils.equals(p6Var.f12599a, str) && !TextUtils.equals(this.I, str))) {
            org.telegram.messenger.l7 l7Var3 = this.H;
            if (l7Var3 != null) {
                l7Var3.run();
                this.H = null;
            }
            this.E = null;
            this.I = str;
            int i7 = this.f12664a;
            m6 m6Var = new m6(this, 0);
            try {
                qp s12 = qp.s1(i7);
                String str2 = s12.U2;
                Uri parse = Uri.parse(str);
                if (TextUtils.equals(parse.getHost(), str2)) {
                    List<String> pathSegments = parse.getPathSegments();
                    if (!pathSegments.isEmpty()) {
                        String str3 = pathSegments.get(0);
                        String queryParameter = parse.getQueryParameter("ref");
                        if (TextUtils.isEmpty(queryParameter)) {
                            TLObject f22 = s12.f2(str3);
                            if (f22 instanceof TLRPC.User) {
                                m6Var.a(new n6(str, (TLRPC.User) f22));
                            } else if (f22 instanceof TLRPC.Chat) {
                                m6Var.a(new o6(str, (TLRPC.Chat) f22));
                            }
                        }
                        l7Var = s12.d2().a(str3, queryParameter, new bi.v3(m6Var, s12, str, 4));
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                m6Var.a(l7Var);
            }
            this.H = l7Var;
            return;
        }
        p6 p6Var2 = this.E;
        if (p6Var2 != null && !this.D && TextUtils.equals(p6Var2.f12599a, str)) {
            this.D = true;
            a();
            invalidate();
            if (u8Var != null) {
                u8Var.run();
            }
        }
    }
}
