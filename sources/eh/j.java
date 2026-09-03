package eh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.pr;
public final class j extends Drawable implements DownloadController.FileDownloadProgressListener, fo0 {
    public String B;
    public String C;
    public boolean D;
    public MessageObject E;
    public double F;
    public int G;
    public final go0 H;
    public float I;
    public float J;
    public SvgHelper.SvgDrawable K;
    public eq L;
    public Drawable M;
    public a N;
    public boolean O;
    public boolean P;
    public TLRPC.MessageMedia Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int X;
    public int Y;
    public final xd.a f5639a;
    public final int f5640a0;
    public final ImageReceiver f5641b;
    public int f5642b0;
    public final int f5643c;
    public int f5644c0;
    public final t1 d;
    public int f5645d0;
    public String f5646e;
    public String f5647f;
    public String h;
    public k01 f5648n;
    public k01 f5649r;
    public k01 f5650s;
    public k01 v;
    public final RadialProgress2 f5652x;
    public final boolean f5653y;
    public final Paint f5651w = new Paint(1);
    public int W = 0;
    public int Z = 255;

    public j(int i10, t1 t1Var, g6 g6Var, boolean z4) {
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.f5641b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.f5643c = i10;
        this.f5653y = z4;
        this.f5652x = new RadialProgress2(t1Var, g6Var);
        this.d = t1Var;
        go0 go0Var = new go0(t1Var);
        this.H = go0Var;
        go0Var.h = this;
        this.f5639a = new xd.a(t1Var, wd.a.f49529a, 180L);
        this.f5640a0 = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a() {
        this.f5641b.onAttachedToWindow();
        this.f5652x.e();
    }

    @Override
    public final void b(float f10) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
            n(true);
        }
    }

    public final void c(boolean z4) {
        int i10;
        int i11;
        k01 k01Var = this.f5648n;
        if (k01Var != null) {
            if (z4) {
                i11 = k6.Fb;
            } else {
                i11 = k6.Dd;
            }
            k01Var.o(k6.w0(null, i11, false));
        }
        this.f5651w.setColor(1711276032);
        k01 k01Var2 = this.v;
        if (k01Var2 != null) {
            k01Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.K;
        if (svgDrawable != null) {
            if (z4) {
                i10 = k6.Pb;
            } else {
                i10 = k6.f21903qe;
            }
            svgDrawable.setColorKey(i10);
        }
        boolean z10 = this.U;
        RadialProgress2 radialProgress2 = this.f5652x;
        if (!z10 && !this.T) {
            radialProgress2.g(k6.f21813le, k6.f21830me, k6.f21848ne, k6.f21866oe);
            return;
        }
        go0 go0Var = this.H;
        if (z4) {
            int w02 = k6.w0(null, k6.f22005wb, false);
            int w03 = k6.w0(null, k6.f22024xb, false);
            int i12 = k6.zb;
            go0Var.h(w02, w03, k6.w0(null, i12, false), k6.w0(null, i12, false), k6.w0(null, k6.f22043yb, false));
            radialProgress2.g(k6.Nb, k6.Ob, k6.Pa, k6.Qa);
            return;
        }
        radialProgress2.g(k6.f21759ie, k6.f21776je, k6.f21969uc, k6.f21987vc);
        int w04 = k6.w0(null, k6.f21970ud, false);
        int w05 = k6.w0(null, k6.f21988vd, false);
        int i13 = k6.f22026xd;
        go0Var.h(w04, w05, k6.w0(null, i13, false), k6.w0(null, i13, false), k6.w0(null, k6.f22007wd, false));
    }

    @Override
    public final void d(float f10) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f10;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f10);
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
        if (this.Z != 0 && !bounds.isEmpty()) {
            int i11 = 0;
            f(false);
            boolean z4 = this.T;
            int i12 = 2;
            RadialProgress2 radialProgress2 = this.f5652x;
            if (!z4 && !this.U) {
                ImageReceiver imageReceiver = this.f5641b;
                imageReceiver.setAlpha(this.Z / 255.0f);
                imageReceiver.setImageCoords(bounds);
                imageReceiver.draw(canvas);
                if (this.V && (drawable = this.M) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.M.getIntrinsicHeight() * 0.8f);
                    int x10 = (int) e2.c.x(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - pr.f30172k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                    this.M.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                    this.M.setBounds(x10, imageHeight, intrinsicWidth + x10, intrinsicHeight + imageHeight);
                    this.M.draw(canvas);
                }
                radialProgress2.q(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
                if (this.D && this.v != null) {
                    canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.f28227c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.f5651w);
                    this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
                }
            } else {
                int i13 = bounds.left;
                boolean z10 = this.f5653y;
                if (z10) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                int i14 = i13 + dp;
                int i15 = bounds.top;
                if (z10) {
                    dp2 = 0;
                } else {
                    dp2 = AndroidUtilities.dp(3.0f);
                }
                int i16 = i15 + dp2;
                if (!this.U) {
                    i11 = AndroidUtilities.dp(3.0f);
                }
                k01 k01Var = this.f5648n;
                if (k01Var != null) {
                    k01Var.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(15.0f) + i16 + i11);
                }
                if (this.U) {
                    float f10 = this.f5639a.f50541e;
                    if (this.f5649r != null && f10 < 1.0f) {
                        canvas.save();
                        float f11 = 1.0f - f10;
                        int i17 = i16 + i11;
                        canvas.scale(f11, f11, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        this.f5649r.f28225a.setAlpha((int) (f11 * 255.0f));
                        this.f5649r.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        canvas.restore();
                    }
                    if (f10 > 0.0f) {
                        go0 go0Var = this.H;
                        go0Var.f27221t = f10;
                        go0Var.j(org.telegram.ui.b.t(56.0f, i14, bounds.right), AndroidUtilities.dp(30.0f));
                        canvas.save();
                        float dp3 = AndroidUtilities.dp(45.0f) + i14;
                        this.I = dp3;
                        float dp4 = AndroidUtilities.dp(21.0f) + i16 + i11;
                        this.J = dp4;
                        canvas.translate(dp3, dp4);
                        go0Var.b(canvas);
                        canvas.restore();
                    }
                }
                k01 k01Var2 = this.f5650s;
                if (k01Var2 != null) {
                    float dp5 = AndroidUtilities.dp(56.0f) + i14;
                    int i18 = i11 + i16;
                    if (this.U) {
                        i10 = 20;
                    } else {
                        i10 = 2;
                    }
                    k01Var2.e(canvas, dp5, AndroidUtilities.dp(i10 + 34) + i18);
                }
                int dp6 = AndroidUtilities.dp(2.0f) + i14;
                this.X = dp6;
                int dp7 = AndroidUtilities.dp(5.0f) + i16;
                this.Y = dp7;
                radialProgress2.q(dp6, dp7, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(2.0f) + i14, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(5.0f) + i16);
            }
            if (!this.V) {
                MessageObject messageObject = this.E;
                if (messageObject != null && messageObject.isSending()) {
                    if (ImageLoader.getInstance().getFileProgressSizes(this.C) == null) {
                        radialProgress2.o(1.0f, true);
                        if (this.U) {
                            l(6, true);
                        } else {
                            k(6);
                        }
                    }
                } else {
                    a aVar = this.N;
                    if (aVar != null && aVar.f5615g) {
                        if (this.U) {
                            l(3, true);
                        } else {
                            k(3);
                        }
                    } else if (this.U) {
                        if (aVar != null && aVar.f5614f) {
                            i12 = 4;
                        }
                        l(i12, true);
                    } else {
                        k(g());
                    }
                }
                if (this.U) {
                    k(g());
                }
                radialProgress2.draw(canvas);
            }
        }
    }

    public final void e() {
        a aVar = this.N;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z4) {
        float f10;
        int width = getBounds().width();
        if (this.f5653y) {
            f10 = 64.0f;
        } else {
            f10 = 72.0f;
        }
        int dp = width - AndroidUtilities.dp(f10);
        if (this.W != dp || z4) {
            this.W = dp;
            String str = this.f5646e;
            if (str != null) {
                if (this.f5648n == null) {
                    this.f5648n = new k01(str, 15.0f, AndroidUtilities.bold());
                }
                k01 k01Var = this.f5648n;
                k01Var.r(TextUtils.ellipsize(this.f5646e, k01Var.f28225a, dp, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f5647f;
            if (str2 != null) {
                if (this.f5649r == null) {
                    this.f5649r = new k01(str2, 14.0f, null);
                }
                k01 k01Var2 = this.f5649r;
                k01Var2.r(TextUtils.ellipsize(this.f5647f, k01Var2.f28225a, dp, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f5650s == null) {
                    this.f5650s = new k01(str3, 12.0f, null);
                }
                k01 k01Var3 = this.f5650s;
                k01Var3.r(TextUtils.ellipsize(this.h, k01Var3.f28225a, dp, TextUtils.TruncateAt.END));
            }
            if (this.D && this.v == null) {
                this.v = new k01(AndroidUtilities.formatLongDuration(this.G), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z4 = this.U;
        if (z4 && this.f5639a.f50542f) {
            return !MediaController.getInstance().isMessagePaused();
        }
        if (!this.D && !z4) {
            if (this.T) {
                a aVar = this.N;
                if (aVar != null && aVar.f5614f) {
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
        return this.Z;
    }

    @Override
    public final int getObserverTag() {
        return this.f5640a0;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i10) {
        int i11;
        if (this.U) {
            return AndroidUtilities.dp(63.0f);
        }
        if (this.T) {
            return AndroidUtilities.dp(56.0f);
        }
        int i12 = this.R;
        if (i12 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        int round = Math.round((i10 / i12) * this.S);
        if (this.f5653y) {
            i11 = (i10 * 4) / 5;
        } else {
            i11 = (i10 * 5) / 4;
        }
        return Math.min(round, i11);
    }

    public final boolean i() {
        if (this.U && MediaController.getInstance().isPlayingMessage(this.E) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.f5653y) {
            return true;
        }
        return false;
    }

    public final boolean j(float f10, float f11, int i10) {
        if (!this.U || this.f5644c0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            int i11 = this.X + dp2;
            if (f10 >= i11 && f10 <= i11 + dp) {
                int i12 = this.Y + dp2;
                if (f11 >= i12 && f11 <= i12 + dp) {
                    this.O = true;
                    return true;
                }
            }
        }
        boolean z4 = this.O;
        if (z4) {
            if (i10 == 1) {
                a aVar = this.N;
                if (aVar != null) {
                    TLRPC.Document document = aVar.f5611b;
                    int i13 = aVar.f5610a;
                    if (aVar.f5615g) {
                        FileLoader.getInstance(i13).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f5614f) {
                        FileLoader.getInstance(i13).loadFile(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    e();
                }
                this.O = false;
                return true;
            } else if (i10 == 3) {
                this.O = false;
                return true;
            }
        }
        return z4;
    }

    public final void k(int i10) {
        if (this.f5642b0 != i10) {
            this.f5642b0 = i10;
            this.f5652x.setIcon(i10, true, true);
        }
    }

    public final void l(int i10, boolean z4) {
        if (this.f5644c0 != i10) {
            this.f5644c0 = i10;
            this.f5652x.k(i10, true, z4);
        }
    }

    public final void m(org.telegram.messenger.MessageObject r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.MessageObject r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: eh.j.m(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, int, java.lang.String, boolean):void");
    }

    public final void n(boolean z4) {
        int i10;
        if (this.U && this.E != null) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            boolean i11 = i();
            this.f5639a.a(i11, z4);
            if (playingMessageObject != null && i11) {
                i10 = playingMessageObject.audioProgressSec;
                go0 go0Var = this.H;
                if (!go0Var.f27207e) {
                    go0Var.i(playingMessageObject.audioProgress);
                    go0Var.f27218q = playingMessageObject.bufferedProgress;
                }
                go0Var.k(playingMessageObject);
            } else {
                i10 = 0;
            }
            if (this.f5645d0 != i10) {
                this.f5645d0 = i10;
                this.h = AndroidUtilities.formatShortDuration(i10, (int) this.F);
                f(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
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
        this.f5652x.o(min, true);
        a aVar = this.N;
        if (aVar != null) {
            aVar.a();
        }
        int i10 = 3;
        if (this.U) {
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
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f5652x.o(min, true);
        a aVar = this.N;
        if (aVar != null) {
            aVar.a();
        }
        int i10 = 3;
        if (this.U) {
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
        this.Z = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
