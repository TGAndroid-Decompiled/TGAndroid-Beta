package bh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.zz0;
public final class j extends Drawable implements DownloadController.FileDownloadProgressListener, vn0 {
    public String A;
    public String B;
    public boolean C;
    public MessageObject D;
    public double E;
    public int F;
    public final wn0 G;
    public float H;
    public float I;
    public SvgHelper.SvgDrawable J;
    public yp K;
    public Drawable L;
    public a M;
    public boolean N;
    public boolean O;
    public TLRPC.MessageMedia P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int W;
    public int X;
    public final int Z;
    public final vd.a f2670a;
    public int f2671a0;
    public final ImageReceiver f2672b;
    public int f2673b0;
    public final int f2674c;
    public int f2675c0;
    public final s1 d;
    public String f2676e;
    public String f2677f;
    public String h;
    public zz0 f2678n;
    public zz0 f2679r;
    public zz0 f2680s;
    public zz0 v;
    public final RadialProgress2 f2682x;
    public final boolean f2683y;
    public final Paint f2681w = new Paint(1);
    public int V = 0;
    public int Y = 255;

    public j(int i10, s1 s1Var, c6 c6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.f2672b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.f2674c = i10;
        this.f2683y = z10;
        this.f2682x = new RadialProgress2(s1Var, c6Var);
        this.d = s1Var;
        wn0 wn0Var = new wn0(s1Var);
        this.G = wn0Var;
        wn0Var.h = this;
        this.f2670a = new vd.a(s1Var, ud.a.f49172a, 180L);
        this.Z = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a() {
        this.f2672b.onAttachedToWindow();
        this.f2682x.e();
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        zz0 zz0Var = this.f2678n;
        if (zz0Var != null) {
            if (z10) {
                i11 = g6.Fb;
            } else {
                i11 = g6.Dd;
            }
            zz0Var.o(g6.w0(null, i11, false));
        }
        this.f2681w.setColor(1711276032);
        zz0 zz0Var2 = this.v;
        if (zz0Var2 != null) {
            zz0Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.J;
        if (svgDrawable != null) {
            if (z10) {
                i10 = g6.Pb;
            } else {
                i10 = g6.f23300qe;
            }
            svgDrawable.setColorKey(i10);
        }
        boolean z11 = this.T;
        RadialProgress2 radialProgress2 = this.f2682x;
        if (!z11 && !this.S) {
            radialProgress2.g(g6.f23213le, g6.f23230me, g6.f23249ne, g6.f23267oe);
            return;
        }
        wn0 wn0Var = this.G;
        if (z10) {
            int w02 = g6.w0(null, g6.f23406wb, false);
            int w03 = g6.w0(null, g6.xb, false);
            int i12 = g6.f23455zb;
            wn0Var.h(w02, w03, g6.w0(null, i12, false), g6.w0(null, i12, false), g6.w0(null, g6.f23437yb, false));
            radialProgress2.g(g6.Nb, g6.Ob, g6.Pa, g6.Qa);
            return;
        }
        radialProgress2.g(g6.f23160ie, g6.f23178je, g6.f23371uc, g6.f23389vc);
        int w04 = g6.w0(null, g6.f23372ud, false);
        int w05 = g6.w0(null, g6.f23390vd, false);
        int i13 = g6.xd;
        wn0Var.h(w04, w05, g6.w0(null, i13, false), g6.w0(null, i13, false), g6.w0(null, g6.f23408wd, false));
    }

    @Override
    public final void c(float f9) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f9);
            n(true);
        }
    }

    @Override
    public final void d(float f9) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f9;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f9);
            n(true);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int dp2;
        int i10;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.Y != 0 && !bounds.isEmpty()) {
            int i11 = 0;
            f(false);
            boolean z10 = this.S;
            int i12 = 2;
            RadialProgress2 radialProgress2 = this.f2682x;
            if (!z10 && !this.T) {
                ImageReceiver imageReceiver = this.f2672b;
                imageReceiver.setAlpha(this.Y / 255.0f);
                imageReceiver.setImageCoords(bounds);
                imageReceiver.draw(canvas);
                if (this.U && (drawable = this.L) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.L.getIntrinsicHeight() * 0.8f);
                    int A = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - jr.f29804k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                    this.L.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                    this.L.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                    this.L.draw(canvas);
                }
                radialProgress2.q(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
                if (this.C && this.v != null) {
                    canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.f35462c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.f2681w);
                    this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
                }
            } else {
                int i13 = bounds.left;
                boolean z11 = this.f2683y;
                if (z11) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                int i14 = i13 + dp;
                int i15 = bounds.top;
                if (z11) {
                    dp2 = 0;
                } else {
                    dp2 = AndroidUtilities.dp(3.0f);
                }
                int i16 = i15 + dp2;
                if (!this.T) {
                    i11 = AndroidUtilities.dp(3.0f);
                }
                zz0 zz0Var = this.f2678n;
                if (zz0Var != null) {
                    zz0Var.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(15.0f) + i16 + i11);
                }
                if (this.T) {
                    float f9 = this.f2670a.f49505e;
                    if (this.f2679r != null && f9 < 1.0f) {
                        canvas.save();
                        float f10 = 1.0f - f9;
                        int i17 = i16 + i11;
                        canvas.scale(f10, f10, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        this.f2679r.f35460a.setAlpha((int) (f10 * 255.0f));
                        this.f2679r.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        canvas.restore();
                    }
                    if (f9 > 0.0f) {
                        wn0 wn0Var = this.G;
                        wn0Var.f34463t = f9;
                        wn0Var.j(org.telegram.ui.b.u(56.0f, i14, bounds.right), AndroidUtilities.dp(30.0f));
                        canvas.save();
                        float dp3 = AndroidUtilities.dp(45.0f) + i14;
                        this.H = dp3;
                        float dp4 = AndroidUtilities.dp(21.0f) + i16 + i11;
                        this.I = dp4;
                        canvas.translate(dp3, dp4);
                        wn0Var.b(canvas);
                        canvas.restore();
                    }
                }
                zz0 zz0Var2 = this.f2680s;
                if (zz0Var2 != null) {
                    float dp5 = AndroidUtilities.dp(56.0f) + i14;
                    int i18 = i11 + i16;
                    if (this.T) {
                        i10 = 20;
                    } else {
                        i10 = 2;
                    }
                    zz0Var2.e(canvas, dp5, AndroidUtilities.dp(i10 + 34) + i18);
                }
                int dp6 = AndroidUtilities.dp(2.0f) + i14;
                this.W = dp6;
                int dp7 = AndroidUtilities.dp(5.0f) + i16;
                this.X = dp7;
                radialProgress2.q(dp6, dp7, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(2.0f) + i14, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(5.0f) + i16);
            }
            if (!this.U) {
                MessageObject messageObject = this.D;
                if (messageObject != null && messageObject.isSending()) {
                    if (ImageLoader.getInstance().getFileProgressSizes(this.B) == null) {
                        radialProgress2.o(1.0f, true);
                        if (this.T) {
                            l(6, true);
                        } else {
                            k(6);
                        }
                    }
                } else {
                    a aVar = this.M;
                    if (aVar != null && aVar.f2646g) {
                        if (this.T) {
                            l(3, true);
                        } else {
                            k(3);
                        }
                    } else if (this.T) {
                        if (aVar != null && aVar.f2645f) {
                            i12 = 4;
                        }
                        l(i12, true);
                    } else {
                        k(g());
                    }
                }
                if (this.T) {
                    k(g());
                }
                radialProgress2.draw(canvas);
            }
        }
    }

    public final void e() {
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z10) {
        float f9;
        int width = getBounds().width();
        if (this.f2683y) {
            f9 = 64.0f;
        } else {
            f9 = 72.0f;
        }
        int dp = width - AndroidUtilities.dp(f9);
        if (this.V != dp || z10) {
            this.V = dp;
            String str = this.f2676e;
            if (str != null) {
                if (this.f2678n == null) {
                    this.f2678n = new zz0(str, 15.0f, AndroidUtilities.bold());
                }
                zz0 zz0Var = this.f2678n;
                zz0Var.r(TextUtils.ellipsize(this.f2676e, zz0Var.f35460a, dp, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f2677f;
            if (str2 != null) {
                if (this.f2679r == null) {
                    this.f2679r = new zz0(str2, 14.0f, null);
                }
                zz0 zz0Var2 = this.f2679r;
                zz0Var2.r(TextUtils.ellipsize(this.f2677f, zz0Var2.f35460a, dp, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f2680s == null) {
                    this.f2680s = new zz0(str3, 12.0f, null);
                }
                zz0 zz0Var3 = this.f2680s;
                zz0Var3.r(TextUtils.ellipsize(this.h, zz0Var3.f35460a, dp, TextUtils.TruncateAt.END));
            }
            if (this.C && this.v == null) {
                this.v = new zz0(AndroidUtilities.formatLongDuration(this.F), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.T;
        if (z10 && this.f2670a.f49506f) {
            return !MediaController.getInstance().isMessagePaused();
        }
        if (!this.C && !z10) {
            if (this.S) {
                a aVar = this.M;
                if (aVar != null && aVar.f2645f) {
                    return 5;
                }
                return 2;
            }
            return 4;
        }
        return 0;
    }

    @Override
    public final int getAlpha() {
        return this.Y;
    }

    @Override
    public final int getObserverTag() {
        return this.Z;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i10) {
        int i11;
        if (this.T) {
            return AndroidUtilities.dp(63.0f);
        }
        if (this.S) {
            return AndroidUtilities.dp(56.0f);
        }
        int i12 = this.Q;
        if (i12 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        int round = Math.round((i10 / i12) * this.R);
        if (this.f2683y) {
            i11 = (i10 * 4) / 5;
        } else {
            i11 = (i10 * 5) / 4;
        }
        return Math.min(round, i11);
    }

    public final boolean i() {
        if (this.T && MediaController.getInstance().isPlayingMessage(this.D) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.f2683y) {
            return true;
        }
        return false;
    }

    public final boolean j(float f9, float f10, int i10) {
        if (!this.T || this.f2673b0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            int i11 = this.W + dp2;
            if (f9 >= i11 && f9 <= i11 + dp) {
                int i12 = this.X + dp2;
                if (f10 >= i12 && f10 <= i12 + dp) {
                    this.N = true;
                    return true;
                }
            }
        }
        boolean z10 = this.N;
        if (z10) {
            if (i10 == 1) {
                a aVar = this.M;
                if (aVar != null) {
                    TLRPC.Document document = aVar.f2642b;
                    int i13 = aVar.f2641a;
                    if (aVar.f2646g) {
                        FileLoader.getInstance(i13).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f2645f) {
                        FileLoader.getInstance(i13).loadFile(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    e();
                }
                this.N = false;
                return true;
            } else if (i10 == 3) {
                this.N = false;
                return true;
            }
        }
        return z10;
    }

    public final void k(int i10) {
        if (this.f2671a0 != i10) {
            this.f2671a0 = i10;
            this.f2682x.setIcon(i10, true, true);
        }
    }

    public final void l(int i10, boolean z10) {
        if (this.f2673b0 != i10) {
            this.f2673b0 = i10;
            this.f2682x.k(i10, true, z10);
        }
    }

    public final void m(org.telegram.messenger.MessageObject r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.MessageObject r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: bh.j.m(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, int, java.lang.String, boolean):void");
    }

    public final void n(boolean z10) {
        int i10;
        if (this.T && this.D != null) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            boolean i11 = i();
            this.f2670a.a(i11, z10);
            if (playingMessageObject != null && i11) {
                i10 = playingMessageObject.audioProgressSec;
                wn0 wn0Var = this.G;
                if (!wn0Var.f34449e) {
                    wn0Var.i(playingMessageObject.audioProgress);
                    wn0Var.f34460q = playingMessageObject.bufferedProgress;
                }
                wn0Var.k(playingMessageObject);
            } else {
                i10 = 0;
            }
            if (this.f2675c0 != i10) {
                this.f2675c0 = i10;
                this.h = AndroidUtilities.formatShortDuration(i10, (int) this.E);
                f(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        e();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f2682x.o(min, true);
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        int i10 = 3;
        if (this.T) {
            if (min >= 1.0f) {
                i10 = 4;
            }
            l(i10, true);
        } else {
            if (min >= 1.0f) {
                i10 = g();
            }
            k(i10);
        }
        this.d.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f2682x.o(min, true);
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        int i10 = 3;
        if (this.T) {
            if (min >= 1.0f) {
                i10 = 4;
            }
            l(i10, true);
        } else {
            if (min >= 1.0f) {
                i10 = g();
            }
            k(i10);
        }
        this.d.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
        e();
    }

    @Override
    public final void setAlpha(int i10) {
        this.Y = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
