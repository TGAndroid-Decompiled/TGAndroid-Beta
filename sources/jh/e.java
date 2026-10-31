package jh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import rf.o;
public final class e extends ih.f implements Drawable.Callback, fe.e {
    public final String f10405b;
    public final Drawable d;
    public final kp f10407f;
    public ih.e h;
    public TLRPC.WebPage f10408n;
    public final fe.b f10409r;
    public final fe.b f10410s;
    public final a5.a f10406c = new a5.a((char) 0, 16);
    public final Paint e = new Paint(1);

    public e(String str) {
        kp kpVar = new kp(-1);
        this.f10407f = kpVar;
        gr grVar = gr.h;
        this.f10409r = new fe.b(0, this, grVar, 320L, false);
        this.f10410s = new fe.b(0, this, grVar, 320L, false);
        this.f10405b = str;
        this.f8536a.J0(i0.L(7.0f));
        this.d = i0.a.f(w0.f19025b, 2131231744);
        kpVar.setCallback(this);
        kpVar.b(t6.x0(null, t6.f21135o7, false));
        kpVar.f27861a = i0.L(15.0f);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (ih.e) view;
    }

    @Override
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        float f7 = i10;
        float f10 = i11;
        ImageReceiver imageReceiver = this.f8536a;
        imageReceiver.y0(0.0f, 0.0f, f7, f10);
        imageReceiver.h(canvas, null);
        kp kpVar = this.f10407f;
        kpVar.setBounds(0, 0, i10, i11);
        int x02 = t6.x0(null, t6.f20872a7, false);
        fe.b bVar = this.f10410s;
        int f11 = i0.b.f(bVar.e, x02, 1073741824);
        Paint paint = this.e;
        paint.setColor(f11);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, i0.L(7.0f), i0.L(7.0f), paint);
        int f12 = i0.b.f(bVar.e, t6.x0(null, t6.f21135o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.f10406c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.f282c) == null || aVar.f281b != f12 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.f282c = new PorterDuffColorFilter(f12, mode);
            aVar.f281b = f12;
            aVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) aVar.f282c);
        o.e(this.d, f7 / 2.0f, f10 / 2.0f, i0.L(24.0f), i0.L(24.0f), 17);
        fe.b bVar2 = this.f10409r;
        o.b(canvas, drawable, 1.0f - bVar2.e);
        o.b(canvas, kpVar, bVar2.e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        ih.e eVar = this.h;
        if (eVar != null) {
            eVar.invalidate();
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        ih.e eVar = this.h;
        if (eVar != null) {
            eVar.invalidate();
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
