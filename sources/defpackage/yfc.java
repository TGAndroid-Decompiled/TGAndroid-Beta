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
public final class yfc extends FrameLayout implements wu7, fn7 {
    public static final float[] V = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public boolean G;
    public float H;
    public il2 I;
    public final wfc J;
    public final TextureView K;
    public final qp9 L;
    public final ee1 M;
    public float N;
    public final dva O;
    public final bpa P;
    public zf5 Q;
    public final ia R;
    public final TLRPC.Document S;
    public int T;
    public long U;
    public final ggb a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public azb r;
    public final int s;
    public final byte w;
    public boolean x;
    public boolean y;

    public yfc(android.content.Context r18, defpackage.ggb r19, int r20, int r21, defpackage.vnb r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfc.<init>(android.content.Context, ggb, int, int, vnb):void");
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || xea.x0) {
            File file2 = this.e;
            if (file2 != null && file2.exists()) {
                if ((jn7.e().p & 512) != 0) {
                    azb azbVar = this.r;
                    if (azbVar != null) {
                        hl.r(azbVar);
                    }
                    azb azbVar2 = new azb(this, (byte) 19);
                    this.r = azbVar2;
                    hl.d3(azbVar2, 300L);
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
        if ((this.e != null || xea.x0) && this.I == null) {
            this.J.a(this.f, 0);
            il2 il2Var = new il2(this, (byte) 1);
            this.I = il2Var;
            TextureView textureView = this.K;
            il2Var.with(textureView);
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
                    sb.append(xb4.G(i).F(ls6.d0(i).E));
                    sb.append("&name=");
                    sb.append(URLEncoder.encode(xb4.B(document), "UTF-8"));
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
        if (i == jn7.Y1) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfc.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        c();
        if (!this.G) {
            a();
        }
        jn7.f(this.s).b(this, jn7.Y1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        c();
        jn7.f(this.s).n(this, jn7.Y1);
        zf5 zf5Var = this.Q;
        if (zf5Var != null) {
            HashMap hashMap = zf5Var.c;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.Q = null;
        }
        il2 il2Var = this.I;
        if (il2Var != null) {
            this.U = il2Var.getCurrentPosition();
            this.I.release(new kc((byte) 10));
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
            rectF = hl.P;
            rectF.set(measuredWidth2, -this.N, getMeasuredWidth() - measuredWidth2, min);
        } else {
            rectF = hl.P;
            rectF.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.N);
        }
        if (this.T != measuredWidth) {
            this.T = measuredWidth;
            ia iaVar = this.R;
            if (iaVar != null) {
                RectF rectF2 = (RectF) iaVar.c;
                ((Rect) iaVar.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF2.set(rectF);
                rectF2.inset(hl.L(16.0f), hl.L(16.0f));
            }
            dva dvaVar = this.O;
            if (dvaVar != null) {
                RectF rectF3 = dvaVar.c;
                RectF rectF4 = dvaVar.a;
                byte b = this.w;
                if (b != 6 && b != 9 && b != 3 && b != 7 && b != 24 && b != 43 && b != 11 && b != 4) {
                    float width = (int) (rectF.width() * 0.4f);
                    rectF4.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    dvaVar.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF4.inset(hl.L(30.0f), hl.L(30.0f));
                }
                dvaVar.f();
                rectF3.set(rectF);
                rectF3.inset(hl.L(10.0f), hl.L(10.0f));
            }
            bpa bpaVar = this.P;
            if (bpaVar != null) {
                RectF rectF5 = bpaVar.a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                bpaVar.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(hl.L(100.0f), hl.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = bpaVar.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((apa) arrayList.get(i5)).a(currentTimeMillis, true);
                }
            }
            zf5 zf5Var = this.Q;
            if (zf5Var != null) {
                zf5Var.d.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.Q.e.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.Q.d.inset(hl.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.Q.g;
                System.currentTimeMillis();
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    ((yf5) arrayList2.get(i6)).a(i6, true);
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
        wfc wfcVar = this.J;
        wfcVar.invalidateOutline();
        if (this.d) {
            rectF = hl.P;
            rectF.set(f2, 0.0f, f - f2, min);
        } else {
            RectF rectF2 = hl.P;
            float f3 = size2;
            rectF2.set(f2, f3 - min, f - f2, f3);
            rectF = rectF2;
        }
        wfcVar.getLayoutParams().width = (int) rectF.width();
        wfcVar.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) wfcVar.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) wfcVar.getLayoutParams()).topMargin = (int) rectF.top;
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
            il2 il2Var = this.I;
            if (il2Var != null) {
                this.U = il2Var.getCurrentPosition();
                this.I.release(new kc((byte) 10));
                this.I = null;
            }
            imageReceiver.x0();
        }
    }
}
