package cg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w2 extends FrameLayout implements y0, NotificationCenter.NotificationCenterDelegate {
    public static final float[] Q = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean A;
    public boolean B;
    public float C;
    public v2 D;
    public final t2 E;
    public final TextureView F;
    public final j0.a G;
    public final org.telegram.ui.Components.voip.g H;
    public float I;
    public final r2 J;
    public final p2 K;
    public p L;
    public final ba.a M;
    public final TLRPC.Document N;
    public int O;
    public long P;
    public final SvgHelper.SvgDrawable f3445a;
    public final Paint f3446b;
    public final Paint f3447c;
    public final boolean d;
    public File f3448e;
    public float f3449f;
    public final String h;
    public final ImageReceiver f3450n;
    public m2 f3451r;
    public final int f3452s;
    public final int v;
    public boolean f3453w;
    public boolean f3454x;
    public boolean f3455y;

    public w2(android.content.Context r18, org.telegram.messenger.SvgHelper.SvgDrawable r19, int r20, int r21, org.telegram.ui.ActionBar.c6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: cg.w2.<init>(android.content.Context, org.telegram.messenger.SvgHelper$SvgDrawable, int, int, org.telegram.ui.ActionBar.c6):void");
    }

    public final void a() {
        File file = this.f3448e;
        if ((file != null && file.exists()) || SharedConfig.streamMedia) {
            File file2 = this.f3448e;
            if (file2 != null && file2.exists()) {
                if ((NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & 512) != 0) {
                    m2 m2Var = this.f3451r;
                    if (m2Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(m2Var);
                    }
                    m2 m2Var2 = new m2(this, 1);
                    this.f3451r = m2Var2;
                    AndroidUtilities.runOnUIThread(m2Var2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(this.f3448e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f3449f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f3449f = 0.671f;
                }
            } else {
                this.f3449f = 0.671f;
            }
            if (this.A) {
                b();
            }
        }
        this.f3451r = null;
    }

    public final void b() {
        Uri uri;
        int i10 = this.f3452s;
        if ((this.f3448e != null || SharedConfig.streamMedia) && this.D == null) {
            this.E.a(this.f3449f, 0);
            v2 v2Var = new v2(this, 0);
            this.D = v2Var;
            TextureView textureView = this.F;
            v2Var.with(textureView);
            File file = this.f3448e;
            if (file != null && file.exists()) {
                uri = Uri.fromFile(this.f3448e);
            } else {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i10);
                    sb2.append("&id=");
                    sb2.append(this.N.f22398id);
                    sb2.append("&hash=");
                    sb2.append(this.N.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.N.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.N.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.N.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(FileLoader.getInstance(i10).getFileReference(MediaDataController.getInstance(i10).getPremiumPromo()));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(this.N), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.N.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb2.append(Utilities.bytesToHex(bArr));
                    String sb3 = sb2.toString();
                    uri = Uri.parse("tg://" + this.h + sb3);
                } catch (Exception unused) {
                    uri = null;
                }
            }
            if (uri == null) {
                return;
            }
            this.D.preparePlayer(uri, false, 1.0f);
            if (!this.B) {
                this.f3450n.stopAnimation();
                textureView.setAlpha(0.0f);
            }
            this.D.seekTo(this.P + 60);
            this.D.play();
        }
    }

    public final void c() {
        boolean z10;
        if (this.f3453w && this.f3454x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f3455y != z10) {
            this.f3455y = z10;
            ImageReceiver imageReceiver = this.f3450n;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver.onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 != null && str2.equals(str)) {
                this.f3448e = (File) objArr[1];
                a();
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: cg.w2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3454x = true;
        c();
        if (!this.B) {
            a();
        }
        NotificationCenter.getInstance(this.f3452s).addObserver(this, NotificationCenter.fileLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3454x = false;
        c();
        NotificationCenter.getInstance(this.f3452s).removeObserver(this, NotificationCenter.fileLoaded);
        p pVar = this.L;
        if (pVar != null) {
            HashMap hashMap = (HashMap) pVar.f3255f;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.L = null;
        }
        v2 v2Var = this.D;
        if (v2Var != null) {
            this.P = v2Var.getCurrentPosition();
            this.D.release(new ag.o0(4));
            this.D = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            AndroidUtilities.rectTmp.set(measuredWidth2, -this.I, getMeasuredWidth() - measuredWidth2, min);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.I);
        }
        if (this.O != measuredWidth) {
            this.O = measuredWidth;
            ba.a aVar = this.M;
            if (aVar != null) {
                RectF rectF = (RectF) aVar.f2028c;
                ((Rect) aVar.f2029e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(AndroidUtilities.rectTmp);
                rectF.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
            r2 r2Var = this.J;
            if (r2Var != null) {
                RectF rectF2 = r2Var.f3332c;
                RectF rectF3 = r2Var.f3330a;
                int i14 = this.v;
                if (i14 != 6 && i14 != 9 && i14 != 3 && i14 != 7 && i14 != 24 && i14 != 43 && i14 != 11 && i14 != 4) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    r2Var.f3331b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                }
                r2Var.f();
                rectF2.set(AndroidUtilities.rectTmp);
                rectF2.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            }
            p2 p2Var = this.K;
            if (p2Var != null) {
                RectF rectF5 = p2Var.f3273a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                p2Var.f3274b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = p2Var.f3276e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((o2) arrayList.get(i15)).a(currentTimeMillis, true);
                }
            }
            p pVar = this.L;
            if (pVar != null) {
                ((RectF) pVar.f3256g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.L.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.L.f3256g).inset(AndroidUtilities.dp(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.L.f3254e;
                System.currentTimeMillis();
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    ((o) arrayList2.get(i16)).a(i16, true);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f9 = size;
        float f10 = (f9 - (0.671f * min)) / 2.0f;
        this.I = 0.0671f * min;
        t2 t2Var = this.E;
        t2Var.invalidateOutline();
        if (this.d) {
            AndroidUtilities.rectTmp.set(f10, 0.0f, f9 - f10, min);
        } else {
            float f11 = size2;
            AndroidUtilities.rectTmp.set(f10, f11 - min, f9 - f10, f11);
        }
        ViewGroup.LayoutParams layoutParams = t2Var.getLayoutParams();
        RectF rectF = AndroidUtilities.rectTmp;
        layoutParams.width = (int) rectF.width();
        t2Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) t2Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) t2Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i10, i11);
    }

    @Override
    public void setOffset(float f9) {
        boolean z10;
        boolean z11 = this.d;
        boolean z12 = false;
        if (f9 < 0.0f) {
            float measuredWidth = (-f9) / getMeasuredWidth();
            setAlpha((Utilities.clamp(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z11) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.C = Math.abs(measuredWidth);
            if (measuredWidth < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (measuredWidth < 0.1f) {
                z12 = true;
            }
        } else {
            float measuredWidth2 = (-f9) / getMeasuredWidth();
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
            if (measuredWidth2 > -0.1f) {
                z12 = true;
            }
            this.C = Math.abs(measuredWidth2);
        }
        if (z10 != this.f3453w) {
            this.f3453w = z10;
            c();
        }
        if (z12 != this.A) {
            this.A = z12;
            ImageReceiver imageReceiver = this.f3450n;
            imageReceiver.setAllowStartAnimation(z12);
            if (this.A) {
                imageReceiver.startAnimation();
                b();
                return;
            }
            v2 v2Var = this.D;
            if (v2Var != null) {
                this.P = v2Var.getCurrentPosition();
                this.D.release(new ag.o0(4));
                this.D = null;
            }
            imageReceiver.stopAnimation();
        }
    }
}
