package kg;

import ag.f3;
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
import org.telegram.messenger.b8;
import org.telegram.messenger.c00;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
public final class k2 extends FrameLayout implements t0, us {
    public static final float[] U = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean D;
    public boolean E;
    public boolean F;
    public float G;
    public j2 H;
    public final h2 I;
    public final TextureView J;
    public final j0.a K;
    public final fq L;
    public float M;
    public final f2 N;
    public final d2 O;
    public o P;
    public final s0 Q;
    public final TLRPC.Document R;
    public int S;
    public long T;
    public final c00 f11153a;
    public final Paint f11154b;
    public final Paint f11155c;
    public final boolean d;
    public File e;
    public float f11156f;
    public final String h;
    public final ImageReceiver f11157n;
    public gg.c f11158r;
    public final int f11159s;
    public final int f11160w;
    public boolean f11161x;
    public boolean f11162y;

    public k2(android.content.Context r18, org.telegram.messenger.c00 r19, int r20, int r21, org.telegram.ui.ActionBar.p6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: kg.k2.<init>(android.content.Context, org.telegram.messenger.c00, int, int, org.telegram.ui.ActionBar.p6):void");
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || tz.B0) {
            File file2 = this.e;
            if (file2 != null && file2.exists()) {
                if ((zs.e().f19749p & 512) != 0) {
                    gg.c cVar = this.f11158r;
                    if (cVar != null) {
                        org.telegram.messenger.i0.r(cVar);
                    }
                    gg.c cVar2 = new gg.c(this, 27);
                    this.f11158r = cVar2;
                    org.telegram.messenger.i0.h3(cVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(org.telegram.messenger.w0.f19025b, Uri.fromFile(this.e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f11156f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f11156f = 0.671f;
                }
            } else {
                this.f11156f = 0.671f;
            }
            if (this.E) {
                b();
            }
        }
        this.f11158r = null;
    }

    public final void b() {
        Uri uri;
        int i10 = this.f11159s;
        if ((this.e != null || tz.B0) && this.H == null) {
            this.I.a(this.f11156f, 0);
            j2 j2Var = new j2(this, 0);
            this.H = j2Var;
            TextureView textureView = this.J;
            j2Var.with(textureView);
            File file = this.e;
            if (file != null && file.exists()) {
                uri = Uri.fromFile(this.e);
            } else {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i10);
                    sb2.append("&id=");
                    sb2.append(this.R.f19799id);
                    sb2.append("&hash=");
                    sb2.append(this.R.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.R.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.R.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.R.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(b8.G(i10).F(ui.b0(i10).D));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(b8.B(this.R), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.R.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb2.append(Utilities.f(bArr));
                    String sb3 = sb2.toString();
                    uri = Uri.parse("tg://" + this.h + sb3);
                } catch (Exception unused) {
                    uri = null;
                }
            }
            if (uri == null) {
                return;
            }
            this.H.preparePlayer(uri, false, 1.0f);
            if (!this.F) {
                this.f11157n.Q0();
                textureView.setAlpha(0.0f);
            }
            this.H.seekTo(this.T + 60);
            this.H.play();
        }
    }

    public final void c() {
        boolean z10;
        if (this.f11161x && this.f11162y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.D != z10) {
            this.D = z10;
            ImageReceiver imageReceiver = this.f11157n;
            if (z10) {
                imageReceiver.P();
            } else {
                imageReceiver.R();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.Y1) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 != null && str2.equals(str)) {
                this.e = (File) objArr[1];
                a();
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: kg.k2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11162y = true;
        c();
        if (!this.F) {
            a();
        }
        zs.f(this.f11159s).c(this, zs.Y1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11162y = false;
        c();
        zs.f(this.f11159s).n(this, zs.Y1);
        o oVar = this.P;
        if (oVar != null) {
            HashMap hashMap = (HashMap) oVar.f11205f;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.P = null;
        }
        j2 j2Var = this.H;
        if (j2Var != null) {
            this.T = j2Var.getCurrentPosition();
            this.H.release(new f3(7));
            this.H = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            org.telegram.messenger.i0.P.set(measuredWidth2, -this.M, getMeasuredWidth() - measuredWidth2, min);
        } else {
            org.telegram.messenger.i0.P.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.M);
        }
        if (this.S != measuredWidth) {
            this.S = measuredWidth;
            s0 s0Var = this.Q;
            if (s0Var != null) {
                RectF rectF = (RectF) s0Var.f11264c;
                ((Rect) s0Var.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(org.telegram.messenger.i0.P);
                rectF.inset(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
            }
            f2 f2Var = this.N;
            if (f2Var != null) {
                RectF rectF2 = f2Var.f11070c;
                RectF rectF3 = f2Var.f11068a;
                int i14 = this.f11160w;
                if (i14 != 6 && i14 != 9 && i14 != 3 && i14 != 7 && i14 != 24 && i14 != 43 && i14 != 11 && i14 != 4) {
                    RectF rectF4 = org.telegram.messenger.i0.P;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    f2Var.f11069b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f));
                }
                f2Var.f();
                rectF2.set(org.telegram.messenger.i0.P);
                rectF2.inset(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
            }
            d2 d2Var = this.O;
            if (d2Var != null) {
                RectF rectF5 = d2Var.f11033a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                d2Var.f11034b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(org.telegram.messenger.i0.L(100.0f), org.telegram.messenger.i0.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = d2Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((c2) arrayList.get(i15)).a(currentTimeMillis, true);
                }
            }
            o oVar = this.P;
            if (oVar != null) {
                ((RectF) oVar.f11206g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.f11206g).inset(org.telegram.messenger.i0.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.P.e;
                System.currentTimeMillis();
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    ((n) arrayList2.get(i16)).a(i16, true);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f7 = size;
        float f10 = (f7 - (0.671f * min)) / 2.0f;
        this.M = 0.0671f * min;
        h2 h2Var = this.I;
        h2Var.invalidateOutline();
        if (this.d) {
            org.telegram.messenger.i0.P.set(f10, 0.0f, f7 - f10, min);
        } else {
            float f11 = size2;
            org.telegram.messenger.i0.P.set(f10, f11 - min, f7 - f10, f11);
        }
        ViewGroup.LayoutParams layoutParams = h2Var.getLayoutParams();
        RectF rectF = org.telegram.messenger.i0.P;
        layoutParams.width = (int) rectF.width();
        h2Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) h2Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) h2Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i10, i11);
    }

    @Override
    public void setOffset(float f7) {
        boolean z10;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        boolean z11 = this.d;
        boolean z12 = true;
        if (i10 < 0) {
            float measuredWidth = (-f7) / getMeasuredWidth();
            setAlpha((Utilities.i(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z11) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.G = Math.abs(measuredWidth);
            if (measuredWidth < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (measuredWidth >= 0.1f) {
                z12 = false;
            }
        } else {
            float measuredWidth2 = (-f7) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z11) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            if (measuredWidth2 > -1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (measuredWidth2 <= -0.1f) {
                z12 = false;
            }
            this.G = Math.abs(measuredWidth2);
        }
        if (z10 != this.f11161x) {
            this.f11161x = z10;
            c();
        }
        if (z12 != this.E) {
            this.E = z12;
            ImageReceiver imageReceiver = this.f11157n;
            imageReceiver.f14408t0 = z12;
            if (z12) {
                imageReceiver.P0(false);
                b();
                return;
            }
            j2 j2Var = this.H;
            if (j2Var != null) {
                this.T = j2Var.getCurrentPosition();
                this.H.release(new f3(7));
                this.H = null;
            }
            imageReceiver.Q0();
        }
    }
}
