package k2;

import android.app.PictureInPictureParams;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import android.util.Rational;
public final class n0 {
    public final Object f14802a;
    public Object f14803b;

    public n0() {
        this.f14802a = new Rect();
        this.f14803b = new Point();
    }

    public PictureInPictureParams.Builder a() {
        int i10;
        Rational rational;
        Rect rect = (Rect) this.f14802a;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = (Point) this.f14803b;
        int i11 = point.x;
        if (i11 > 0 && (i10 = point.y) > 0) {
            double d = i11 / i10;
            if (d < 0.45d) {
                rational = new Rational(45, 100);
            } else if (d > 2.35d) {
                rational = new Rational(235, 100);
            } else {
                rational = new Rational(point.x, point.y);
            }
            builder.setAspectRatio(rational);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(rational);
            }
        } else {
            builder.setAspectRatio(null);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(null);
            }
        }
        if (!rect.isEmpty()) {
            builder.setSourceRectHint(rect);
            return builder;
        }
        builder.setSourceRectHint(null);
        return builder;
    }

    public h b(b2.f fVar, b2.w wVar) {
        boolean booleanValue;
        boolean z10;
        wVar.getClass();
        int i10 = wVar.L;
        fVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && i10 != -1) {
            Context context = (Context) this.f14802a;
            Boolean bool = (Boolean) this.f14803b;
            boolean z11 = false;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    String parameters = c2.i.e(context).getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f14803b = Boolean.valueOf(z10);
                } else {
                    this.f14803b = Boolean.FALSE;
                }
                booleanValue = ((Boolean) this.f14803b).booleanValue();
            }
            String str = wVar.f4135s;
            str.getClass();
            int c10 = b2.v0.c(str, wVar.f4127k);
            if (c10 != 0 && i11 >= e2.m0.s(c10)) {
                int t10 = e2.m0.t(wVar.K);
                if (t10 == 0) {
                    return h.d;
                }
                try {
                    AudioFormat build = new AudioFormat.Builder().setSampleRate(i10).setChannelMask(t10).setEncoding(c10).build();
                    if (i11 >= 33) {
                        int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, fVar.b());
                        if ((directPlaybackSupport & 1) == 0) {
                            return h.d;
                        }
                        if ((directPlaybackSupport & 3) == 3) {
                            z11 = true;
                        }
                        ?? obj = new Object();
                        obj.f4253a = true;
                        obj.f4254b = z11;
                        obj.f4255c = booleanValue;
                        return obj.a();
                    } else if (i11 >= 31) {
                        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, fVar.b());
                        if (playbackOffloadSupport == 0) {
                            return h.d;
                        }
                        ?? obj2 = new Object();
                        if (i11 > 32 && playbackOffloadSupport == 2) {
                            z11 = true;
                        }
                        obj2.f4253a = true;
                        obj2.f4254b = z11;
                        obj2.f4255c = booleanValue;
                        return obj2.a();
                    } else if (!AudioManager.isOffloadedPlaybackSupported(build, fVar.b())) {
                        return h.d;
                    } else {
                        ?? obj3 = new Object();
                        obj3.f4253a = true;
                        obj3.f4255c = booleanValue;
                        return obj3.a();
                    }
                } catch (IllegalArgumentException unused) {
                    return h.d;
                }
            }
            return h.d;
        }
        return h.d;
    }

    public boolean c() {
        if (!((Rect) this.f14802a).isEmpty()) {
            Point point = (Point) this.f14803b;
            if (point.x > 0 && point.y > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean d(int i10, int i11) {
        Point point = (Point) this.f14803b;
        if (point.x == i10 && point.y == i11) {
            return false;
        }
        point.set(i10, i11);
        return true;
    }

    public n0(Context context) {
        this.f14802a = context == null ? null : context.getApplicationContext();
    }
}
