package m2;

import android.app.PictureInPictureParams;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import android.util.Rational;
public final class m0 {
    public final Object f18942a;
    public Object f18943b;

    public m0() {
        this.f18942a = new Rect();
        this.f18943b = new Point();
    }

    public PictureInPictureParams.Builder a() {
        int i3;
        Rational rational;
        Rect rect = (Rect) this.f18942a;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = (Point) this.f18943b;
        int i10 = point.x;
        if (i10 > 0 && (i3 = point.y) > 0) {
            double d = i10 / i3;
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

    public f b(d2.f fVar, d2.v vVar) {
        boolean booleanValue;
        boolean z10;
        vVar.getClass();
        int i3 = vVar.L;
        fVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && i3 != -1) {
            Context context = (Context) this.f18942a;
            Boolean bool = (Boolean) this.f18943b;
            boolean z11 = false;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    String parameters = e2.h.e(context).getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f18943b = Boolean.valueOf(z10);
                } else {
                    this.f18943b = Boolean.FALSE;
                }
                booleanValue = ((Boolean) this.f18943b).booleanValue();
            }
            String str = vVar.f8489s;
            str.getClass();
            int c2 = d2.u0.c(str, vVar.f8481k);
            if (c2 != 0 && i10 >= g2.n0.s(c2)) {
                int t10 = g2.n0.t(vVar.K);
                if (t10 == 0) {
                    return f.d;
                }
                try {
                    AudioFormat build = new AudioFormat.Builder().setSampleRate(i3).setChannelMask(t10).setEncoding(c2).build();
                    if (i10 >= 33) {
                        int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, fVar.b());
                        if ((directPlaybackSupport & 1) == 0) {
                            return f.d;
                        }
                        if ((directPlaybackSupport & 3) == 3) {
                            z11 = true;
                        }
                        ?? obj = new Object();
                        obj.f14364a = true;
                        obj.f14365b = z11;
                        obj.f14366c = booleanValue;
                        return obj.a();
                    } else if (i10 >= 31) {
                        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, fVar.b());
                        if (playbackOffloadSupport == 0) {
                            return f.d;
                        }
                        ?? obj2 = new Object();
                        if (i10 > 32 && playbackOffloadSupport == 2) {
                            z11 = true;
                        }
                        obj2.f14364a = true;
                        obj2.f14365b = z11;
                        obj2.f14366c = booleanValue;
                        return obj2.a();
                    } else if (!AudioManager.isOffloadedPlaybackSupported(build, fVar.b())) {
                        return f.d;
                    } else {
                        ?? obj3 = new Object();
                        obj3.f14364a = true;
                        obj3.f14366c = booleanValue;
                        return obj3.a();
                    }
                } catch (IllegalArgumentException unused) {
                    return f.d;
                }
            }
            return f.d;
        }
        return f.d;
    }

    public boolean c() {
        if (!((Rect) this.f18942a).isEmpty()) {
            Point point = (Point) this.f18943b;
            if (point.x > 0 && point.y > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean d(int i3, int i10) {
        Point point = (Point) this.f18943b;
        if (point.x == i3 && point.y == i10) {
            return false;
        }
        point.set(i3, i10);
        return true;
    }

    public m0(Context context) {
        this.f18942a = context == null ? null : context.getApplicationContext();
    }
}
