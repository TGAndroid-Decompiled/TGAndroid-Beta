package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class sr0 extends FrameLayout implements u0d, yi5 {
    public boolean E;
    public boolean F;
    public boolean G;
    public final int a;
    public final long b;
    public final vnb c;
    public final or0 d;
    public final v0d e;
    public final yc f;
    public final tb h;
    public final FrameLayout n;
    public final c51 r;
    public final int s;
    public q0d w;
    public final Rect x;
    public int y;

    public sr0(Context context, int i, long j, vnb vnbVar, or0 or0Var) {
        super(context);
        this.x = new Rect();
        this.F = true;
        this.a = i;
        this.b = j;
        this.c = vnbVar;
        this.d = or0Var;
        this.e = new v0d(this, hl.p);
        this.s = aob.v0(aob.d6, vnbVar);
        yc ycVar = new yc(context, or0Var);
        this.f = ycVar;
        ycVar.setFillViewport(true);
        ycVar.setVerticalScrollBarEnabled(false);
        ycVar.setOverScrollMode(2);
        tb tbVar = new tb((byte) 2, context, this);
        this.h = tbVar;
        ycVar.addView(tbVar, new FrameLayout.LayoutParams(-1, -2));
        addView(ycVar, tre.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        c51 i2 = xnb.i(24, vnbVar, context, true);
        this.r = i2;
        i2.setOnClickListener(new k1(this, (byte) 22));
        frameLayout.addView(i2, tre.d(-1, 48.0f, 119, 16.0f, 12.0f, 16.0f, 12.0f));
        addView(frameLayout, tre.e(-1, -2, 80));
        k();
    }

    @Override
    public final void a(qeb qebVar, RectF rectF) {
        qebVar.b = true;
    }

    @Override
    public final void b(boolean z) {
        this.f.requestDisallowInterceptTouchEvent(z);
    }

    public final void c() {
        i();
        q0d q0dVar = this.w;
        if (q0dVar != null) {
            h0d g = k0d.g(q0dVar);
            if (g != null) {
                g.p = null;
            }
            q0d q0dVar2 = this.w;
            h0d g2 = k0d.g(q0dVar2);
            if (g2 != null && g2.o) {
                k0d.i();
                g2.p = null;
                k0d.a.remove(g2.a);
                q0dVar2.n();
                q0dVar2.f = null;
                q0dVar2.g = null;
                q0dVar2.d = null;
                k0d.F();
            }
            this.w = null;
        }
        this.e.r();
    }

    public final void e() {
        boolean o;
        String d;
        String str;
        if (!this.G && this.w != null && this.E && this.F && getWidth() > 0 && getHeight() > 0) {
            this.G = true;
            this.w.m(getWidth());
            j();
            q0d q0dVar = this.w;
            int[] iArr = c1d.a;
            vnb vnbVar = this.c;
            if (vnbVar != null) {
                o = vnbVar.a();
            } else {
                o = aob.I.o();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                if (o) {
                    str = "dark";
                } else {
                    str = "light";
                }
                jSONObject.put("colorScheme", str);
                JSONObject u = xw0.u(vnbVar, true);
                if (u != null) {
                    jSONObject.put("params", u);
                }
                JSONObject f = c1d.f();
                f.put("padding", "8px 16px");
                jSONObject.put("text", f);
                d = jSONObject.toString();
            } catch (Exception e) {
                cc4.g(e, true);
                d = c1d.d(o);
            }
            q0dVar.k(d);
            q0d q0dVar2 = this.w;
            v0d v0dVar = this.e;
            v0dVar.b(q0dVar2);
            v0dVar.q(true);
            h0d g = k0d.g(this.w);
            if (g != null) {
                g.p = this;
            }
            k0d.u(this.w);
            tb tbVar = this.h;
            tbVar.requestLayout();
            tbVar.invalidate();
        }
    }

    @Override
    public final void f() {
        this.h.invalidate();
        this.d.a();
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        canvas.drawColor(this.s);
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        tb tbVar = this.h;
        int left = tbVar.getLeft();
        yc ycVar = this.f;
        canvas.translate(left - ycVar.getScrollX(), tbVar.getTop() - ycVar.getScrollY());
        this.e.c(canvas, tbVar.getWidth());
        canvas.restore();
    }

    public View getBottomBar() {
        return this.n;
    }

    public View getWidgetView() {
        return this.h;
    }

    @Override
    public final void h() {
        this.h.requestLayout();
    }

    public final void i() {
        if (this.G) {
            this.G = false;
            v0d v0dVar = this.e;
            v0dVar.q(false);
            v0dVar.r();
            q0d q0dVar = this.w;
            if (q0dVar != null) {
                k0d.r(q0dVar);
            }
        }
    }

    public final void j() {
        if (this.w != null && getHeight() > 0) {
            float f = hl.p;
            q0d q0dVar = this.w;
            Rect rect = this.x;
            float f2 = rect.top / f;
            float f3 = rect.bottom / f;
            float f4 = rect.left / f;
            float f5 = rect.right / f;
            float f6 = this.y / f;
            float L = hl.L(72.0f) / f;
            float height = getHeight() / f;
            synchronized (q0dVar) {
                String format = String.format(Locale.US, "{\"device\":{\"top\":%.2f,\"right\":%.2f,\"bottom\":%.2f,\"left\":%.2f},\"content\":{\"top\":%.2f,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":0},\"viewportHeight\":%.2f}", Float.valueOf(f2), Float.valueOf(f5), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f6), Float.valueOf(L), Float.valueOf(height));
                if (format.equals(q0dVar.w)) {
                    return;
                }
                q0dVar.w = format;
                q0dVar.x = true;
                hl.c3(new p0d(q0dVar, (byte) 1));
            }
        }
    }

    public final void k() {
        String M0;
        or0 or0Var = this.d;
        rr0 rr0Var = or0Var.a;
        TLRPC.Dialog S0 = rr0Var.getMessagesController().S0(rr0Var.a);
        if (S0 != null && S0.top_message != 0 && !or0Var.a.d0()) {
            rr0 rr0Var2 = or0Var.a;
            TLRPC.User X1 = rr0Var2.getMessagesController().X1(Long.valueOf(rr0Var2.a));
            if (X1 != null && X1.bot_has_main_app) {
                M0 = ob6.M0(2131746435, null);
            } else {
                M0 = ob6.M0(2131752993, null);
            }
        } else {
            M0 = ob6.M0(2131744572, null);
        }
        this.r.i(M0, false, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E = false;
        i();
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        q0d q0dVar = this.w;
        if (q0dVar != null && this.G) {
            q0dVar.m(i);
            j();
        }
        hl.c3(new pz(this, (byte) 24));
    }

    public void setActive(boolean z) {
        if (this.F == z) {
            return;
        }
        this.F = z;
        if (z) {
            e();
        } else {
            i();
        }
    }

    public void setChromeTop(int i) {
        if (this.y == i) {
            return;
        }
        this.y = i;
        j();
    }

    public void setWidget(TL_bots.TL_botProfileWidget tL_botProfileWidget) {
        q0d q0dVar;
        ConcurrentHashMap concurrentHashMap = k0d.a;
        if (tL_botProfileWidget != null && tL_botProfileWidget.payload != null) {
            StringBuilder sb = new StringBuilder("tg-widget:profile/");
            int i = this.a;
            sb.append(i);
            sb.append("/");
            long j = this.b;
            sb.append(j);
            sb.append("/");
            sb.append(Arrays.hashCode(tL_botProfileWidget.payload));
            sb.append("/");
            sb.append(tL_botProfileWidget.can_query ? 1 : 0);
            sb.append(tL_botProfileWidget.background_query ? 1 : 0);
            String sb2 = sb.toString();
            ConcurrentHashMap concurrentHashMap2 = k0d.a;
            h0d h0dVar = (h0d) concurrentHashMap2.get(sb2);
            if (h0dVar == null) {
                h0d h0dVar2 = new h0d(sb2, i, j, tL_botProfileWidget);
                concurrentHashMap2.put(sb2, h0dVar2);
                jf7 Y = jf7.Y(h0dVar2.b);
                Y.a.c(new cxc(Y, h0dVar2, (byte) 11));
            } else {
                h0dVar.s = tL_botProfileWidget.public_data_hash;
                k0d.a(h0dVar, k0d.D(tL_botProfileWidget.chat_data), k0d.D(tL_botProfileWidget.public_data));
            }
            q0dVar = k0d.h(sb2);
        } else {
            q0dVar = null;
        }
        if (q0dVar == this.w) {
            return;
        }
        c();
        this.w = q0dVar;
        e();
    }

    @Override
    public final void d() {
    }

    @Override
    public void setCursor(String str) {
    }
}
