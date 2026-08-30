package eg;

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
public final class u2 extends FrameLayout implements x0, NotificationCenter.NotificationCenterDelegate {
    public static final float[] R = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean B;
    public boolean C;
    public float D;
    public t2 E;
    public final r2 F;
    public final TextureView G;
    public final j0.a H;
    public final org.telegram.ui.Components.voip.g I;
    public float J;
    public final p2 K;
    public final n2 L;
    public p M;
    public final da.a N;
    public final TLRPC.Document O;
    public int P;
    public long Q;
    public final SvgHelper.SvgDrawable f5520a;
    public final Paint f5521b;
    public final Paint f5522c;
    public final boolean d;
    public File e;
    public float f5523f;
    public final String h;
    public final ImageReceiver f5524n;
    public ef.e f5525r;
    public final int f5526s;
    public final int v;
    public boolean f5527w;
    public boolean f5528x;
    public boolean f5529y;

    public u2(android.content.Context r18, org.telegram.messenger.SvgHelper.SvgDrawable r19, int r20, int r21, org.telegram.ui.ActionBar.f6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: eg.u2.<init>(android.content.Context, org.telegram.messenger.SvgHelper$SvgDrawable, int, int, org.telegram.ui.ActionBar.f6):void");
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || SharedConfig.streamMedia) {
            File file2 = this.e;
            if (file2 != null && file2.exists()) {
                if ((NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & 512) != 0) {
                    ef.e eVar = this.f5525r;
                    if (eVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                    }
                    ef.e eVar2 = new ef.e(this, 6);
                    this.f5525r = eVar2;
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(this.e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f5523f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f5523f = 0.671f;
                }
            } else {
                this.f5523f = 0.671f;
            }
            if (this.B) {
                b();
            }
        }
        this.f5525r = null;
    }

    public final void b() {
        Uri uri;
        int i10 = this.f5526s;
        if ((this.e != null || SharedConfig.streamMedia) && this.E == null) {
            this.F.a(this.f5523f, 0);
            t2 t2Var = new t2(this, 0);
            this.E = t2Var;
            TextureView textureView = this.G;
            t2Var.with(textureView);
            File file = this.e;
            if (file != null && file.exists()) {
                uri = Uri.fromFile(this.e);
            } else {
                try {
                    StringBuilder sb = new StringBuilder("?account=");
                    sb.append(i10);
                    sb.append("&id=");
                    sb.append(this.O.f19190id);
                    sb.append("&hash=");
                    sb.append(this.O.access_hash);
                    sb.append("&dc=");
                    sb.append(this.O.dc_id);
                    sb.append("&size=");
                    sb.append(this.O.size);
                    sb.append("&mime=");
                    sb.append(URLEncoder.encode(this.O.mime_type, "UTF-8"));
                    sb.append("&rid=");
                    sb.append(FileLoader.getInstance(i10).getFileReference(MediaDataController.getInstance(i10).getPremiumPromo()));
                    sb.append("&name=");
                    sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(this.O), "UTF-8"));
                    sb.append("&reference=");
                    byte[] bArr = this.O.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb.append(Utilities.bytesToHex(bArr));
                    String sb2 = sb.toString();
                    uri = Uri.parse("tg://" + this.h + sb2);
                } catch (Exception unused) {
                    uri = null;
                }
            }
            if (uri == null) {
                return;
            }
            this.E.preparePlayer(uri, false, 1.0f);
            if (!this.C) {
                this.f5524n.stopAnimation();
                textureView.setAlpha(0.0f);
            }
            this.E.seekTo(this.Q + 60);
            this.E.play();
        }
    }

    public final void c() {
        boolean z4;
        if (this.f5527w && this.f5528x) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f5529y != z4) {
            this.f5529y = z4;
            ImageReceiver imageReceiver = this.f5524n;
            if (z4) {
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
                this.e = (File) objArr[1];
                a();
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: eg.u2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5528x = true;
        c();
        if (!this.C) {
            a();
        }
        NotificationCenter.getInstance(this.f5526s).addObserver(this, NotificationCenter.fileLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5528x = false;
        c();
        NotificationCenter.getInstance(this.f5526s).removeObserver(this, NotificationCenter.fileLoaded);
        p pVar = this.M;
        if (pVar != null) {
            HashMap hashMap = (HashMap) pVar.f5418f;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.M = null;
        }
        t2 t2Var = this.E;
        if (t2Var != null) {
            this.Q = t2Var.getCurrentPosition();
            this.E.release(new cg.n0(5));
            this.E = null;
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            AndroidUtilities.rectTmp.set(measuredWidth2, -this.J, getMeasuredWidth() - measuredWidth2, min);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.J);
        }
        if (this.P != measuredWidth) {
            this.P = measuredWidth;
            da.a aVar = this.N;
            if (aVar != null) {
                RectF rectF = (RectF) aVar.f4303c;
                ((Rect) aVar.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(AndroidUtilities.rectTmp);
                rectF.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
            p2 p2Var = this.K;
            if (p2Var != null) {
                RectF rectF2 = p2Var.f5429c;
                RectF rectF3 = p2Var.f5427a;
                int i14 = this.v;
                if (i14 != 6 && i14 != 9 && i14 != 3 && i14 != 7 && i14 != 24 && i14 != 43 && i14 != 11 && i14 != 4) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    p2Var.f5428b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                }
                p2Var.f();
                rectF2.set(AndroidUtilities.rectTmp);
                rectF2.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            }
            n2 n2Var = this.L;
            if (n2Var != null) {
                RectF rectF5 = n2Var.f5373a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                n2Var.f5374b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = n2Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((m2) arrayList.get(i15)).a(currentTimeMillis, true);
                }
            }
            p pVar = this.M;
            if (pVar != null) {
                ((RectF) pVar.f5419g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.M.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.M.f5419g).inset(AndroidUtilities.dp(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.M.e;
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
        float f10 = size;
        float f11 = (f10 - (0.671f * min)) / 2.0f;
        this.J = 0.0671f * min;
        r2 r2Var = this.F;
        r2Var.invalidateOutline();
        if (this.d) {
            AndroidUtilities.rectTmp.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            AndroidUtilities.rectTmp.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = r2Var.getLayoutParams();
        RectF rectF = AndroidUtilities.rectTmp;
        layoutParams.width = (int) rectF.width();
        r2Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) r2Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) r2Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i10, i11);
    }

    @Override
    public void setOffset(float f10) {
        boolean z4;
        boolean z10 = this.d;
        boolean z11 = false;
        if (f10 < 0.0f) {
            float measuredWidth = (-f10) / getMeasuredWidth();
            setAlpha((Utilities.clamp(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z10) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.D = Math.abs(measuredWidth);
            if (measuredWidth < 1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (measuredWidth < 0.1f) {
                z11 = true;
            }
        } else {
            float measuredWidth2 = (-f10) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z10) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            if (measuredWidth2 > -1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (measuredWidth2 > -0.1f) {
                z11 = true;
            }
            this.D = Math.abs(measuredWidth2);
        }
        if (z4 != this.f5527w) {
            this.f5527w = z4;
            c();
        }
        if (z11 != this.B) {
            this.B = z11;
            ImageReceiver imageReceiver = this.f5524n;
            imageReceiver.setAllowStartAnimation(z11);
            if (this.B) {
                imageReceiver.startAnimation();
                b();
                return;
            }
            t2 t2Var = this.E;
            if (t2Var != null) {
                this.Q = t2Var.getCurrentPosition();
                this.E.release(new cg.n0(5));
                this.E = null;
            }
            imageReceiver.stopAnimation();
        }
    }
}
