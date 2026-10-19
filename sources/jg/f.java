package jg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import t7.u;
import u2.f0;
public final class f {
    public boolean f14427a;
    public int f14428b;
    public Object f14429c;
    public Object d;
    public final Object e;
    public Object f14430f;
    public Object f14431g;

    public f(c3.m mVar, u uVar) {
        this.f14429c = mVar;
        this.f14431g = uVar;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f14427a = true;
        this.f14428b = 3;
    }

    public static void a(f fVar) {
        c3.m mVar = (c3.m) fVar.f14429c;
        synchronized (mVar) {
            mVar.f4654f = 1;
        }
    }

    public f0 b(int i10) {
        d9.u uVar;
        d9.u oVar;
        HashMap hashMap = (HashMap) this.e;
        f0 f0Var = (f0) hashMap.get(Integer.valueOf(i10));
        if (f0Var != null) {
            return f0Var;
        }
        HashMap hashMap2 = (HashMap) this.d;
        d9.u uVar2 = (d9.u) hashMap2.get(Integer.valueOf(i10));
        if (uVar2 == null) {
            final qf.b bVar = (qf.b) this.f14430f;
            bVar.getClass();
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                oVar = new d9.u() {
                                    @Override
                                    public final Object get() {
                                        switch (r3) {
                                            case 0:
                                                return q.e((Class) this, bVar);
                                            case 1:
                                                return q.e((Class) this, bVar);
                                            case 2:
                                                return q.e((Class) this, bVar);
                                            default:
                                                return new x0(bVar, (c3.m) ((jg.f) this).f14429c);
                                        }
                                    }
                                };
                            } else {
                                throw new IllegalArgumentException(i2.e.j(i10, "Unrecognized contentType: "));
                            }
                        } else {
                            oVar = new i2.o(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.class), 3);
                        }
                        uVar2 = oVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(f0.class);
                        uVar = new d9.u() {
                            @Override
                            public final Object get() {
                                switch (r3) {
                                    case 0:
                                        return q.e((Class) asSubclass, bVar);
                                    case 1:
                                        return q.e((Class) asSubclass, bVar);
                                    case 2:
                                        return q.e((Class) asSubclass, bVar);
                                    default:
                                        return new x0(bVar, (c3.m) ((jg.f) asSubclass).f14429c);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(f0.class);
                    uVar = new d9.u() {
                        @Override
                        public final Object get() {
                            switch (r3) {
                                case 0:
                                    return q.e((Class) asSubclass2, bVar);
                                case 1:
                                    return q.e((Class) asSubclass2, bVar);
                                case 2:
                                    return q.e((Class) asSubclass2, bVar);
                                default:
                                    return new x0(bVar, (c3.m) ((jg.f) asSubclass2).f14429c);
                            }
                        }
                    };
                }
                uVar2 = uVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(f0.class);
                uVar2 = new d9.u() {
                    @Override
                    public final Object get() {
                        switch (r3) {
                            case 0:
                                return q.e((Class) asSubclass3, bVar);
                            case 1:
                                return q.e((Class) asSubclass3, bVar);
                            case 2:
                                return q.e((Class) asSubclass3, bVar);
                            default:
                                return new x0(bVar, (c3.m) ((jg.f) asSubclass3).f14429c);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i10), uVar2);
        }
        f0 f0Var2 = (f0) uVar2.get();
        f0Var2.d((u) this.f14431g);
        f0Var2.b(this.f14427a);
        f0Var2.c(this.f14428b);
        hashMap.put(Integer.valueOf(i10), f0Var2);
        return f0Var2;
    }

    public Bitmap c(int i10, int i11) {
        RectF rectF = (RectF) this.e;
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f14428b || this.f14427a) {
            this.f14427a = false;
            this.f14428b = i12;
            this.f14429c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.d = new Canvas((Bitmap) this.f14429c);
            rectF.set(0.0f, 0.0f, i11, i10);
            ((Canvas) this.d).drawColor(h6.w0(h6.f20989d6, (d6) this.f14431g));
            ((Canvas) this.d).drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), (Paint) this.f14430f);
        }
        return (Bitmap) this.f14429c;
    }

    public f(d6 d6Var) {
        this.e = new RectF();
        Paint paint = new Paint(1);
        this.f14430f = paint;
        this.f14428b = 0;
        this.f14427a = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f14431g = d6Var;
    }
}
