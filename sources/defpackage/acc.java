package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class acc extends FrameLayout implements qr7, gk7 {
    public static final float[] V = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public boolean G;
    public float H;
    public ok2 I;
    public final ybc J;
    public final TextureView K;
    public final bm9 L;
    public final vd1 M;
    public float N;
    public final bra O;
    public final ela P;
    public yd5 Q;
    public final ha R;
    public final TLRPC.Document S;
    public int T;
    public long U;
    public final kcb a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public kbc r;
    public final int s;
    public final byte w;
    public boolean x;
    public boolean y;

    public acc(android.content.Context r19, defpackage.kcb r20, int r21, int r22, defpackage.wjb r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acc.<init>(android.content.Context, kcb, int, int, wjb):void");
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || gba.x0) {
            File file2 = this.e;
            if (file2 != null && file2.exists()) {
                if ((kk7.e().p & 512) != 0) {
                    kbc kbcVar = this.r;
                    if (kbcVar != null) {
                        gl.r(kbcVar);
                    }
                    kbc kbcVar2 = new kbc(this, (byte) 2);
                    this.r = kbcVar2;
                    gl.d3(kbcVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(a.b, Uri.fromFile(this.e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f = 0.671f;
                }
            } else {
                this.f = 0.671f;
            }
            if (this.F) {
                b();
            }
        }
        this.r = null;
    }

    public final void b() {
        Uri uri;
        TLRPC.Document document = this.S;
        int i = this.s;
        if ((this.e != null || gba.x0) && this.I == null) {
            this.J.a(this.f, 0);
            ok2 ok2Var = new ok2(this, (byte) 1);
            this.I = ok2Var;
            TextureView textureView = this.K;
            ok2Var.with(textureView);
            File file = this.e;
            if (file != null && file.exists()) {
                uri = Uri.fromFile(this.e);
            } else {
                try {
                    StringBuilder sb = new StringBuilder("?account=");
                    sb.append(i);
                    sb.append("&id=");
                    sb.append(document.id);
                    sb.append("&hash=");
                    sb.append(document.access_hash);
                    sb.append("&dc=");
                    sb.append(document.dc_id);
                    sb.append("&size=");
                    sb.append(document.size);
                    sb.append("&mime=");
                    sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                    sb.append("&rid=");
                    sb.append(ba4.G(i).F(hq6.d0(i).E));
                    sb.append("&name=");
                    sb.append(URLEncoder.encode(ba4.B(document), "UTF-8"));
                    sb.append("&reference=");
                    byte[] bArr = document.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb.append(Utilities.f(bArr));
                    String sb2 = sb.toString();
                    uri = Uri.parse("tg://" + this.h + sb2);
                } catch (Exception unused) {
                    uri = null;
                }
            }
            if (uri == null) {
                return;
            }
            this.I.preparePlayer(uri, false, 1.0f);
            if (!this.G) {
                this.n.x0();
                textureView.setAlpha(0.0f);
            }
            this.I.seekTo(this.U + 60);
            this.I.play();
        }
    }

    public final void c() {
        boolean z;
        if (this.x && this.y) {
            z = true;
        } else {
            z = false;
        }
        if (this.E != z) {
            this.E = z;
            ImageReceiver imageReceiver = this.n;
            if (z) {
                imageReceiver.I();
            } else {
                imageReceiver.K();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.X1) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 != null && str2.equals(str)) {
                this.e = (File) objArr[1];
                a();
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acc.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        c();
        if (!this.G) {
            a();
        }
        kk7.f(this.s).b(this, kk7.X1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        c();
        kk7.f(this.s).n(this, kk7.X1);
        yd5 yd5Var = this.Q;
        if (yd5Var != null) {
            HashMap hashMap = yd5Var.c;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.Q = null;
        }
        ok2 ok2Var = this.I;
        if (ok2Var != null) {
            this.U = ok2Var.getCurrentPosition();
            this.I.release(new jc((byte) 10));
            this.I = null;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF;
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            rectF = gl.P;
            rectF.set(measuredWidth2, -this.N, getMeasuredWidth() - measuredWidth2, min);
        } else {
            rectF = gl.P;
            rectF.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.N);
        }
        if (this.T != measuredWidth) {
            this.T = measuredWidth;
            ha haVar = this.R;
            if (haVar != null) {
                RectF rectF2 = (RectF) haVar.c;
                ((Rect) haVar.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF2.set(rectF);
                rectF2.inset(gl.L(16.0f), gl.L(16.0f));
            }
            bra braVar = this.O;
            if (braVar != null) {
                RectF rectF3 = braVar.c;
                RectF rectF4 = braVar.a;
                byte b = this.w;
                if (b != 6 && b != 9 && b != 3 && b != 7 && b != 24 && b != 43 && b != 11 && b != 4) {
                    float width = (int) (rectF.width() * 0.4f);
                    rectF4.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    braVar.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF4.inset(gl.L(30.0f), gl.L(30.0f));
                }
                braVar.f();
                rectF3.set(rectF);
                rectF3.inset(gl.L(10.0f), gl.L(10.0f));
            }
            ela elaVar = this.P;
            if (elaVar != null) {
                RectF rectF5 = elaVar.a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                elaVar.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(gl.L(100.0f), gl.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = elaVar.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((dla) arrayList.get(i5)).a(currentTimeMillis, true);
                }
            }
            yd5 yd5Var = this.Q;
            if (yd5Var != null) {
                yd5Var.d.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.Q.e.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.Q.d.inset(gl.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.Q.g;
                System.currentTimeMillis();
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    ((xd5) arrayList2.get(i6)).a(i6, true);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        RectF rectF;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f = size;
        float f2 = (f - (0.671f * min)) / 2.0f;
        this.N = 0.0671f * min;
        ybc ybcVar = this.J;
        ybcVar.invalidateOutline();
        if (this.d) {
            rectF = gl.P;
            rectF.set(f2, 0.0f, f - f2, min);
        } else {
            RectF rectF2 = gl.P;
            float f3 = size2;
            rectF2.set(f2, f3 - min, f - f2, f3);
            rectF = rectF2;
        }
        ybcVar.getLayoutParams().width = (int) rectF.width();
        ybcVar.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) ybcVar.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) ybcVar.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i, i2);
    }

    @Override
    public void setOffset(float f) {
        boolean z;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        boolean z2 = this.d;
        boolean z3 = true;
        float f2 = -f;
        if (i < 0) {
            float measuredWidth = f2 / getMeasuredWidth();
            setAlpha((Utilities.i(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z2) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.H = Math.abs(measuredWidth);
            if (measuredWidth < 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (measuredWidth >= 0.1f) {
                z3 = false;
            }
        } else {
            float measuredWidth2 = f2 / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z2) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            if (measuredWidth2 > -1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (measuredWidth2 <= -0.1f) {
                z3 = false;
            }
            this.H = Math.abs(measuredWidth2);
        }
        if (z != this.x) {
            this.x = z;
            c();
        }
        if (z3 != this.F) {
            this.F = z3;
            ImageReceiver imageReceiver = this.n;
            imageReceiver.u0 = z3;
            if (z3) {
                imageReceiver.w0(false);
                b();
                return;
            }
            ok2 ok2Var = this.I;
            if (ok2Var != null) {
                this.U = ok2Var.getCurrentPosition();
                this.I.release(new jc((byte) 10));
                this.I = null;
            }
            imageReceiver.x0();
        }
    }
}
