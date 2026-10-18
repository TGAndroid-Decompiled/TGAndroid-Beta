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
    public final Object f14764a;
    public Object f14765b;

    public n0() {
        this.f14764a = new Rect();
        this.f14765b = new Point();
    }

    public PictureInPictureParams.Builder a() {
        int i10;
        Rational rational;
        Rect rect = (Rect) this.f14764a;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = (Point) this.f14765b;
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

    public g b(b2.f fVar, b2.w wVar) {
        boolean booleanValue;
        boolean z10;
        wVar.getClass();
        int i10 = wVar.L;
        fVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && i10 != -1) {
            Context context = (Context) this.f14764a;
            Boolean bool = (Boolean) this.f14765b;
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
                    this.f14765b = Boolean.valueOf(z10);
                } else {
                    this.f14765b = Boolean.FALSE;
                }
                booleanValue = ((Boolean) this.f14765b).booleanValue();
            }
            String str = wVar.f4132s;
            str.getClass();
            int c10 = b2.v0.c(str, wVar.f4124k);
            if (c10 != 0 && i11 >= e2.m0.s(c10)) {
                int t10 = e2.m0.t(wVar.K);
                if (t10 == 0) {
                    return g.d;
                }
                try {
                    AudioFormat build = new AudioFormat.Builder().setSampleRate(i10).setChannelMask(t10).setEncoding(c10).build();
                    if (i11 >= 33) {
                        int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, fVar.b());
                        if ((directPlaybackSupport & 1) == 0) {
                            return g.d;
                        }
                        if ((directPlaybackSupport & 3) == 3) {
                            z11 = true;
                        }
                        ?? obj = new Object();
                        obj.f4250a = true;
                        obj.f4251b = z11;
                        obj.f4252c = booleanValue;
                        return obj.a();
                    } else if (i11 >= 31) {
                        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, fVar.b());
                        if (playbackOffloadSupport == 0) {
                            return g.d;
                        }
                        ?? obj2 = new Object();
                        if (i11 > 32 && playbackOffloadSupport == 2) {
                            z11 = true;
                        }
                        obj2.f4250a = true;
                        obj2.f4251b = z11;
                        obj2.f4252c = booleanValue;
                        return obj2.a();
                    } else if (!AudioManager.isOffloadedPlaybackSupported(build, fVar.b())) {
                        return g.d;
                    } else {
                        ?? obj3 = new Object();
                        obj3.f4250a = true;
                        obj3.f4252c = booleanValue;
                        return obj3.a();
                    }
                } catch (IllegalArgumentException unused) {
                    return g.d;
                }
            }
            return g.d;
        }
        return g.d;
    }

    public boolean c() {
        if (!((Rect) this.f14764a).isEmpty()) {
            Point point = (Point) this.f14765b;
            if (point.x > 0 && point.y > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean d(int i10, int i11) {
        Point point = (Point) this.f14765b;
        if (point.x == i10 && point.y == i11) {
            return false;
        }
        point.set(i10, i11);
        return true;
    }

    public n0(Context context) {
        this.f14764a = context == null ? null : context.getApplicationContext();
    }
}
