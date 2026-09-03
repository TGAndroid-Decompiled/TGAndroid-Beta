package fg;

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
public final class t2 extends FrameLayout implements x0, NotificationCenter.NotificationCenterDelegate {
    public static final float[] R = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean B;
    public boolean C;
    public float D;
    public s2 E;
    public final q2 F;
    public final TextureView G;
    public final j0.a H;
    public final org.telegram.ui.Components.voip.g I;
    public float J;
    public final o2 K;
    public final m2 L;
    public p M;
    public final da.a N;
    public final TLRPC.Document O;
    public int P;
    public long Q;
    public final SvgHelper.SvgDrawable f6557a;
    public final Paint f6558b;
    public final Paint f6559c;
    public final boolean d;
    public File f6560e;
    public float f6561f;
    public final String h;
    public final ImageReceiver f6562n;
    public eh.m f6563r;
    public final int f6564s;
    public final int v;
    public boolean f6565w;
    public boolean f6566x;
    public boolean f6567y;

    public t2(android.content.Context r18, org.telegram.messenger.SvgHelper.SvgDrawable r19, int r20, int r21, org.telegram.ui.ActionBar.g6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: fg.t2.<init>(android.content.Context, org.telegram.messenger.SvgHelper$SvgDrawable, int, int, org.telegram.ui.ActionBar.g6):void");
    }

    public final void a() {
        File file = this.f6560e;
        if ((file != null && file.exists()) || SharedConfig.streamMedia) {
            File file2 = this.f6560e;
            if (file2 != null && file2.exists()) {
                if ((NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & 512) != 0) {
                    eh.m mVar = this.f6563r;
                    if (mVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(mVar);
                    }
                    eh.m mVar2 = new eh.m(this, 9);
                    this.f6563r = mVar2;
                    AndroidUtilities.runOnUIThread(mVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(this.f6560e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f6561f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f6561f = 0.671f;
                }
            } else {
                this.f6561f = 0.671f;
            }
            if (this.B) {
                b();
            }
        }
        this.f6563r = null;
    }

    public final void b() {
        Uri uri;
        int i10 = this.f6564s;
        if ((this.f6560e != null || SharedConfig.streamMedia) && this.E == null) {
            this.F.a(this.f6561f, 0);
            s2 s2Var = new s2(this, 0);
            this.E = s2Var;
            TextureView textureView = this.G;
            s2Var.with(textureView);
            File file = this.f6560e;
            if (file != null && file.exists()) {
                uri = Uri.fromFile(this.f6560e);
            } else {
                try {
                    StringBuilder sb = new StringBuilder("?account=");
                    sb.append(i10);
                    sb.append("&id=");
                    sb.append(this.O.f20851id);
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
                this.f6562n.stopAnimation();
                textureView.setAlpha(0.0f);
            }
            this.E.seekTo(this.Q + 60);
            this.E.play();
        }
    }

    public final void c() {
        boolean z4;
        if (this.f6565w && this.f6566x) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f6567y != z4) {
            this.f6567y = z4;
            ImageReceiver imageReceiver = this.f6562n;
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
                this.f6560e = (File) objArr[1];
                a();
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: fg.t2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6566x = true;
        c();
        if (!this.C) {
            a();
        }
        NotificationCenter.getInstance(this.f6564s).addObserver(this, NotificationCenter.fileLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6566x = false;
        c();
        NotificationCenter.getInstance(this.f6564s).removeObserver(this, NotificationCenter.fileLoaded);
        p pVar = this.M;
        if (pVar != null) {
            HashMap hashMap = (HashMap) pVar.f6478f;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.M = null;
        }
        s2 s2Var = this.E;
        if (s2Var != null) {
            this.Q = s2Var.getCurrentPosition();
            this.E.release(new ag.f(7));
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
                RectF rectF = (RectF) aVar.f4383c;
                ((Rect) aVar.f4384e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(AndroidUtilities.rectTmp);
                rectF.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
            o2 o2Var = this.K;
            if (o2Var != null) {
                RectF rectF2 = o2Var.f6453c;
                RectF rectF3 = o2Var.f6451a;
                int i14 = this.v;
                if (i14 != 6 && i14 != 9 && i14 != 3 && i14 != 7 && i14 != 24 && i14 != 43 && i14 != 11 && i14 != 4) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    o2Var.f6452b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                }
                o2Var.f();
                rectF2.set(AndroidUtilities.rectTmp);
                rectF2.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            }
            m2 m2Var = this.L;
            if (m2Var != null) {
                RectF rectF5 = m2Var.f6396a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                m2Var.f6397b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = m2Var.f6399e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((l2) arrayList.get(i15)).a(currentTimeMillis, true);
                }
            }
            p pVar = this.M;
            if (pVar != null) {
                ((RectF) pVar.f6479g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.M.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.M.f6479g).inset(AndroidUtilities.dp(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.M.f6477e;
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
        q2 q2Var = this.F;
        q2Var.invalidateOutline();
        if (this.d) {
            AndroidUtilities.rectTmp.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            AndroidUtilities.rectTmp.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = q2Var.getLayoutParams();
        RectF rectF = AndroidUtilities.rectTmp;
        layoutParams.width = (int) rectF.width();
        q2Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) q2Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) q2Var.getLayoutParams()).topMargin = (int) rectF.top;
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
        if (z4 != this.f6565w) {
            this.f6565w = z4;
            c();
        }
        if (z11 != this.B) {
            this.B = z11;
            ImageReceiver imageReceiver = this.f6562n;
            imageReceiver.setAllowStartAnimation(z11);
            if (this.B) {
                imageReceiver.startAnimation();
                b();
                return;
            }
            s2 s2Var = this.E;
            if (s2Var != null) {
                this.Q = s2Var.getCurrentPosition();
                this.E.release(new ag.f(7));
                this.E = null;
            }
            imageReceiver.stopAnimation();
        }
    }
}
