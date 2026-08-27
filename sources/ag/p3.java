package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.PremiumPreviewFragment;

public final class p3 extends FrameLayout implements l1, NotificationCenter.NotificationCenterDelegate {
    public static final float[] Q = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean A;
    public boolean B;
    public float C;
    public o3 D;
    public final m3 E;
    public final TextureView F;
    public final j0.a G;
    public final org.telegram.ui.Components.voip.g H;
    public float I;
    public final j3 J;
    public final h3 K;
    public r L;
    public final aa.a M;
    public final TLRPC.Document N;
    public int O;
    public long P;

    public final SvgHelper.SvgDrawable f598a;

    public final Paint f599b;

    public final Paint f600c;
    public final boolean d;

    public File f601e;

    public float f602f;
    public final String h;

    public final ImageReceiver f603n;

    public af.e f604r;

    public final int f605s;
    public final int v;

    public boolean f606w;

    public boolean f607x;

    public boolean f608y;

    public p3(Context context, SvgHelper.SvgDrawable svgDrawable, int i10, int i11, c6 c6Var) {
        boolean[] zArr;
        super(context);
        Paint paint = new Paint(1);
        this.f599b = paint;
        Paint paint2 = new Paint(1);
        this.f600c = paint2;
        this.d = false;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f603n = imageReceiver;
        this.f605s = i10;
        this.v = i11;
        this.f598a = svgDrawable;
        paint.setColor(-16777216);
        paint2.setColor(i0.b.d(0.5f, g6.v0(g6.Mj, c6Var), -16777216));
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i10).getPremiumPromo();
        String strL0 = PremiumPreviewFragment.l0(i11);
        if (premiumPromo != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= premiumPromo.video_sections.size()) {
                    i12 = -1;
                    break;
                } else if (premiumPromo.video_sections.get(i12).equals(strL0)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 >= 0) {
                TLRPC.Document document = premiumPromo.videos.get(i12);
                n3 n3Var = null;
                for (int i13 = 0; i13 < document.thumbs.size(); i13++) {
                    if (document.thumbs.get(i13) instanceof TLRPC.TL_photoStrippedSize) {
                        this.G = new j0.a(getResources(), ImageLoader.getStrippedPhotoBitmap(document.thumbs.get(i13).bytes, "b"));
                        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                        hVar.f33597m = 4.0f;
                        hVar.f33592g = 3.5f;
                        hVar.f33596l = true;
                        SvgHelper.SvgDrawable svgDrawable2 = this.f598a;
                        hVar.f33599o = this;
                        this.H = new org.telegram.ui.Components.voip.g(hVar, svgDrawable2);
                        n3Var = new n3(this, this.G, this.H);
                        n3Var.f27828w = true;
                    }
                }
                this.h = FileLoader.getAttachFileName(document);
                zArr = null;
                this.f603n.setImage(null, null, n3Var, null, premiumPromo, 1);
                FileLoader.getInstance(this.f605s).loadFile(document, premiumPromo, 3, 0);
                this.N = document;
                Utilities.globalQueue.postRunnable(new a1.e(6, this, document));
            } else {
                zArr = null;
            }
        } else {
            zArr = null;
        }
        if (i11 == 1) {
            aa.a aVar = new aa.a(2);
            aVar.f201c = new RectF();
            ?? r10 = new Bitmap[16];
            aVar.d = r10;
            aVar.f202e = new Rect();
            aVar.h = new Paint();
            this.M = aVar;
            aVar.f200b = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = new TextPaint(65);
            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            textPaint.setTextSize(aVar.f200b);
            textPaint.setColor(i0.b.k(g6.w0(zArr, g6.Zj, false), 30));
            textPaint.setTextAlign(Paint.Align.CENTER);
            int i14 = 0;
            while (i14 < 16) {
                int i15 = i14 < 10 ? i14 + 48 : i14 + 55;
                int i16 = aVar.f200b;
                r10[i14] = Bitmap.createBitmap(i16, i16, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(r10[i14]);
                String string = Character.toString((char) i15);
                int i17 = aVar.f200b;
                canvas.drawText(string, i17 >> 1, i17, textPaint);
                i14++;
            }
        } else if (i11 == 6 || i11 == 9 || i11 == 3 || i11 == 7 || i11 == 11 || i11 == 4 || i11 == 24 || i11 == 43) {
            j3 j3Var = new j3(40);
            this.J = j3Var;
            j3Var.f511o = 3.0f;
            j3Var.N = i11;
            if (i11 == 3 || i11 == 24 || i11 == 43) {
                j3Var.f514r = 14;
                j3Var.f515s = 18;
                j3Var.f516t = 18;
            } else {
                j3Var.f514r = 14;
                j3Var.f515s = 16;
                j3Var.f516t = 15;
            }
            if (i11 == 43) {
                j3Var.G = true;
            }
            j3Var.f518w = 0.98f;
            j3Var.v = 0.98f;
            j3Var.f517u = 0.98f;
            j3Var.f511o = 4.0f;
            j3Var.O = c6Var;
            j3Var.P = g6.Zj;
            j3Var.c();
        } else if (i11 == 2) {
            h3 h3Var = new h3();
            this.K = h3Var;
            ArrayList arrayList = h3Var.f421e;
            if (arrayList.isEmpty()) {
                for (int i18 = 0; i18 < h3Var.f423g; i18++) {
                    arrayList.add(new g3(h3Var));
                }
            }
            int iK = i0.b.k(g6.w0(zArr, g6.Zj, false), 80);
            if (h3Var.f424i != iK) {
                h3Var.f424i = iK;
                h3Var.f420c.setColor(iK);
            }
        } else if (i11 == 13) {
            r rVar = new r();
            this.L = rVar;
            ArrayList arrayList2 = rVar.f630e;
            if (arrayList2.isEmpty()) {
                for (int i19 = 0; i19 < rVar.f629c; i19++) {
                    arrayList2.add(new q(rVar));
                }
            }
        } else {
            j3 j3Var2 = new j3(SharedConfig.getDevicePerformanceClass() == 2 ? 800 : SharedConfig.getDevicePerformanceClass() == 1 ? 400 : 100);
            this.J = j3Var2;
            j3Var2.O = c6Var;
            j3Var2.P = g6.Zj;
            j3Var2.f514r = 4;
            j3Var2.f518w = 0.98f;
            j3Var2.v = 0.98f;
            j3Var2.f517u = 0.98f;
            j3Var2.G = true;
            j3Var2.f511o = 4.0f;
            j3Var2.H = true;
            j3Var2.I = true;
            j3Var2.K = true;
            j3Var2.M = false;
            j3Var2.c();
        }
        if (i11 == 1 || i11 == 3 || i11 == 11) {
            this.d = true;
        }
        m3 m3Var = new m3(this, context);
        this.E = m3Var;
        m3Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.F = textureView;
        m3Var.addView(textureView);
        setWillNotDraw(false);
        addView(m3Var);
    }

    public final void a() {
        File file = this.f601e;
        if ((file != null && file.exists()) || SharedConfig.streamMedia) {
            File file2 = this.f601e;
            if (file2 == null || !file2.exists()) {
                this.f602f = 0.671f;
            } else {
                if ((NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & 512) != 0) {
                    af.e eVar = this.f604r;
                    if (eVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                    }
                    af.e eVar2 = new af.e(this, 6);
                    this.f604r = eVar2;
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(this.f601e));
                    int i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int i11 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f602f = i10 / i11;
                } catch (Exception unused) {
                    this.f602f = 0.671f;
                }
            }
            if (this.A) {
                b();
            }
        }
        this.f604r = null;
    }

    public final void b() {
        Uri uriFromFile;
        int i10 = this.f605s;
        if ((this.f601e != null || SharedConfig.streamMedia) && this.D == null) {
            this.E.a(this.f602f, 0);
            o3 o3Var = new o3(this, 0);
            this.D = o3Var;
            TextureView textureView = this.F;
            o3Var.with(textureView);
            File file = this.f601e;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i10);
                    sb2.append("&id=");
                    sb2.append(this.N.f22386id);
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
                    uriFromFile = Uri.parse("tg://" + this.h + sb2.toString());
                } catch (Exception unused) {
                    uriFromFile = null;
                }
            } else {
                uriFromFile = Uri.fromFile(this.f601e);
            }
            if (uriFromFile == null) {
                return;
            }
            this.D.preparePlayer(uriFromFile, false, 1.0f);
            if (!this.B) {
                this.f603n.stopAnimation();
                textureView.setAlpha(0.0f);
            }
            this.D.seekTo(this.P + 60);
            this.D.play();
        }
    }

    public final void c() {
        boolean z10 = this.f606w && this.f607x;
        if (this.f608y != z10) {
            this.f608y = z10;
            ImageReceiver imageReceiver = this.f603n;
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
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            this.f601e = (File) objArr[1];
            a();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        j1[][] j1VarArr;
        int i10;
        float f13;
        int i11;
        int i12;
        float f14;
        int i13;
        ArrayList arrayList;
        int i14;
        k1 k1Var;
        int iMin;
        int iMax;
        float f15;
        float f16;
        int i15;
        aa.a aVar;
        int i16;
        int i17;
        ArrayList arrayList2;
        int i18;
        float fClamp;
        j1 j1Var;
        aa.a aVar2;
        long j10;
        float fClamp2;
        int i19;
        aa.a aVar3 = this.M;
        h3 h3Var = this.K;
        int i20 = 0;
        j3 j3Var = this.J;
        if (j3Var == null && h3Var == null && this.L == null && aVar3 == null) {
            f10 = 0.9f;
            f11 = 2.0f;
        } else {
            float f17 = this.C;
            if (f17 < 0.5f) {
                float fPow = (float) Math.pow(1.0f - f17, 2.0d);
                canvas.save();
                canvas.scale(fPow, fPow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (aVar3 != null) {
                    Rect rect = (Rect) aVar3.f202e;
                    int iWidth = rect.width() / aVar3.f200b;
                    int iHeight = rect.height() / aVar3.f200b;
                    if (iWidth == 0 || iHeight == 0) {
                        f10 = 0.9f;
                        f11 = 2.0f;
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) aVar3.f203f;
                        int i21 = 4;
                        if (arrayListArr != null) {
                            f10 = 0.9f;
                            if (arrayListArr.length != iWidth + 1) {
                            }
                            f11 = 2.0f;
                            j1VarArr = (j1[][]) aVar3.f204g;
                            i10 = 16;
                            if (j1VarArr != null) {
                                f13 = 0.2f;
                                if (j1VarArr.length == iWidth + 1 || j1VarArr[0].length != iHeight + 1) {
                                }
                                f14 = 1.0f;
                                i13 = 0;
                                while (i13 <= iWidth) {
                                    arrayList = ((ArrayList[]) aVar3.f203f)[i13];
                                    i14 = 0;
                                    while (i14 < arrayList.size()) {
                                        k1Var = (k1) arrayList.get(i14);
                                        if (jCurrentTimeMillis - k1Var.f528c > 50) {
                                            i19 = k1Var.f526a + 1;
                                            k1Var.f526a = i19;
                                            k1Var.f528c = jCurrentTimeMillis;
                                            if (i19 - k1Var.f527b >= iHeight) {
                                                if (arrayList.size() == 1) {
                                                    k1Var.f526a = i20;
                                                    k1Var.f528c = jCurrentTimeMillis;
                                                    k1Var.f527b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i21;
                                                } else {
                                                    arrayList.remove(k1Var);
                                                    i14--;
                                                }
                                            }
                                            if (k1Var.f526a > k1Var.f527b && i14 == arrayList.size() - 1 && Math.abs(Utilities.fastRandom.nextInt(i21)) == 0) {
                                                k1 k1Var2 = new k1();
                                                k1Var2.f526a = i20;
                                                k1Var2.f528c = jCurrentTimeMillis;
                                                k1Var2.f527b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i21;
                                                arrayList.add(k1Var2);
                                            }
                                        }
                                        iMin = Math.min(k1Var.f526a, iHeight + 1);
                                        iMax = Math.max(i20, k1Var.f526a - k1Var.f527b);
                                        while (iMax < iMin) {
                                            int i22 = aVar3.f200b;
                                            f15 = i22 * i13;
                                            f16 = i22 * iMax;
                                            if (((RectF) aVar3.f201c).contains(f15, f16)) {
                                                i15 = i13;
                                                aVar = aVar3;
                                                i16 = iMax;
                                                i17 = iHeight;
                                                arrayList2 = arrayList;
                                                i18 = iWidth;
                                            } else {
                                                i15 = i13;
                                                i16 = iMax;
                                                fClamp = Utilities.clamp(((f14 - ((k1Var.f526a - iMax) / (k1Var.f527b - 1))) * 0.8f) + f13, 1.0f, 0.0f);
                                                j1Var = ((j1[][]) aVar3.f204g)[i15][i16];
                                                aVar2 = (aa.a) j1Var.d;
                                                i17 = iHeight;
                                                arrayList2 = arrayList;
                                                j10 = j1Var.f489b - jCurrentTimeMillis;
                                                aVar = aVar3;
                                                if (j10 < 150) {
                                                    fClamp2 = Utilities.clamp(1.0f - (j10 / 150.0f), 1.0f, 0.0f);
                                                    Paint paint = (Paint) aVar2.h;
                                                    Bitmap[] bitmapArr = (Bitmap[]) aVar2.d;
                                                    i18 = iWidth;
                                                    paint.setAlpha((int) org.telegram.messenger.y1.z(1.0f, fClamp2, fClamp, 255.0f));
                                                    canvas.drawBitmap(bitmapArr[j1Var.f488a], f15, f16, paint);
                                                    paint.setAlpha((int) (fClamp * fClamp2 * 255.0f));
                                                    canvas.drawBitmap(bitmapArr[j1Var.f490c], f15, f16, paint);
                                                    paint.setAlpha(255);
                                                    if (fClamp2 >= 1.0f) {
                                                        j1Var.f488a = j1Var.f490c;
                                                        j1Var.f490c = pa.f(Utilities.fastRandom, 16);
                                                        j1Var.f489b = ((long) pa.f(Utilities.fastRandom, 300)) + jCurrentTimeMillis + 150;
                                                    }
                                                } else {
                                                    i18 = iWidth;
                                                    ((Paint) aVar2.h).setAlpha((int) (fClamp * 255.0f));
                                                    canvas.drawBitmap(((Bitmap[]) aVar2.d)[j1Var.f488a], f15, f16, (Paint) aVar2.h);
                                                }
                                                iMax = i16 + 1;
                                                i13 = i15;
                                                iHeight = i17;
                                                arrayList = arrayList2;
                                                aVar3 = aVar;
                                                iWidth = i18;
                                                f14 = 1.0f;
                                            }
                                            iMax = i16 + 1;
                                            i13 = i15;
                                            iHeight = i17;
                                            arrayList = arrayList2;
                                            aVar3 = aVar;
                                            iWidth = i18;
                                            f14 = 1.0f;
                                        }
                                        i14++;
                                        iHeight = iHeight;
                                        aVar3 = aVar3;
                                        i20 = 0;
                                        i21 = 4;
                                        f14 = 1.0f;
                                    }
                                    i13++;
                                    iHeight = iHeight;
                                    aVar3 = aVar3;
                                    i20 = 0;
                                    i21 = 4;
                                    f14 = 1.0f;
                                }
                            } else {
                                f13 = 0.2f;
                            }
                            aVar3.f204g = new j1[iWidth + 1][];
                            i11 = 0;
                            while (i11 <= iWidth) {
                                ((j1[][]) aVar3.f204g)[i11] = new j1[iHeight + 1];
                                i12 = 0;
                                while (i12 <= iHeight) {
                                    j1[][] j1VarArr2 = (j1[][]) aVar3.f204g;
                                    j1[] j1VarArr3 = j1VarArr2[i11];
                                    j1 j1Var2 = new j1();
                                    j1Var2.d = aVar3;
                                    j1VarArr3[i12] = j1Var2;
                                    j1 j1Var3 = j1VarArr2[i11][i12];
                                    j1Var3.getClass();
                                    j1Var3.f488a = pa.f(Utilities.fastRandom, i10);
                                    j1Var3.f490c = pa.f(Utilities.fastRandom, i10);
                                    j1Var3.f489b = ((long) pa.f(Utilities.fastRandom, 300)) + jCurrentTimeMillis + 150;
                                    i12++;
                                    i10 = 16;
                                }
                                i11++;
                                i10 = 16;
                            }
                            f14 = 1.0f;
                            i13 = 0;
                            while (i13 <= iWidth) {
                                arrayList = ((ArrayList[]) aVar3.f203f)[i13];
                                i14 = 0;
                                while (i14 < arrayList.size()) {
                                    k1Var = (k1) arrayList.get(i14);
                                    if (jCurrentTimeMillis - k1Var.f528c > 50) {
                                        i19 = k1Var.f526a + 1;
                                        k1Var.f526a = i19;
                                        k1Var.f528c = jCurrentTimeMillis;
                                        if (i19 - k1Var.f527b >= iHeight) {
                                            if (arrayList.size() == 1) {
                                                k1Var.f526a = i20;
                                                k1Var.f528c = jCurrentTimeMillis;
                                                k1Var.f527b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i21;
                                            } else {
                                                arrayList.remove(k1Var);
                                                i14--;
                                            }
                                        }
                                        if (k1Var.f526a > k1Var.f527b) {
                                            k1 k1Var3 = new k1();
                                            k1Var3.f526a = i20;
                                            k1Var3.f528c = jCurrentTimeMillis;
                                            k1Var3.f527b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i21;
                                            arrayList.add(k1Var3);
                                        }
                                    }
                                    iMin = Math.min(k1Var.f526a, iHeight + 1);
                                    iMax = Math.max(i20, k1Var.f526a - k1Var.f527b);
                                    while (iMax < iMin) {
                                        int i23 = aVar3.f200b;
                                        f15 = i23 * i13;
                                        f16 = i23 * iMax;
                                        if (((RectF) aVar3.f201c).contains(f15, f16)) {
                                            i15 = i13;
                                            i16 = iMax;
                                            fClamp = Utilities.clamp(((f14 - ((k1Var.f526a - iMax) / (k1Var.f527b - 1))) * 0.8f) + f13, 1.0f, 0.0f);
                                            j1Var = ((j1[][]) aVar3.f204g)[i15][i16];
                                            aVar2 = (aa.a) j1Var.d;
                                            i17 = iHeight;
                                            arrayList2 = arrayList;
                                            j10 = j1Var.f489b - jCurrentTimeMillis;
                                            aVar = aVar3;
                                            if (j10 < 150) {
                                                fClamp2 = Utilities.clamp(1.0f - (j10 / 150.0f), 1.0f, 0.0f);
                                                Paint paint2 = (Paint) aVar2.h;
                                                Bitmap[] bitmapArr2 = (Bitmap[]) aVar2.d;
                                                i18 = iWidth;
                                                paint2.setAlpha((int) org.telegram.messenger.y1.z(1.0f, fClamp2, fClamp, 255.0f));
                                                canvas.drawBitmap(bitmapArr2[j1Var.f488a], f15, f16, paint2);
                                                paint2.setAlpha((int) (fClamp * fClamp2 * 255.0f));
                                                canvas.drawBitmap(bitmapArr2[j1Var.f490c], f15, f16, paint2);
                                                paint2.setAlpha(255);
                                                if (fClamp2 >= 1.0f) {
                                                    j1Var.f488a = j1Var.f490c;
                                                    j1Var.f490c = pa.f(Utilities.fastRandom, 16);
                                                    j1Var.f489b = ((long) pa.f(Utilities.fastRandom, 300)) + jCurrentTimeMillis + 150;
                                                }
                                            } else {
                                                i18 = iWidth;
                                                ((Paint) aVar2.h).setAlpha((int) (fClamp * 255.0f));
                                                canvas.drawBitmap(((Bitmap[]) aVar2.d)[j1Var.f488a], f15, f16, (Paint) aVar2.h);
                                            }
                                            iMax = i16 + 1;
                                            i13 = i15;
                                            iHeight = i17;
                                            arrayList = arrayList2;
                                            aVar3 = aVar;
                                            iWidth = i18;
                                            f14 = 1.0f;
                                        } else {
                                            i15 = i13;
                                            aVar = aVar3;
                                            i16 = iMax;
                                            i17 = iHeight;
                                            arrayList2 = arrayList;
                                            i18 = iWidth;
                                        }
                                        iMax = i16 + 1;
                                        i13 = i15;
                                        iHeight = i17;
                                        arrayList = arrayList2;
                                        aVar3 = aVar;
                                        iWidth = i18;
                                        f14 = 1.0f;
                                    }
                                    i14++;
                                    iHeight = iHeight;
                                    aVar3 = aVar3;
                                    i20 = 0;
                                    i21 = 4;
                                    f14 = 1.0f;
                                }
                                i13++;
                                iHeight = iHeight;
                                aVar3 = aVar3;
                                i20 = 0;
                                i21 = 4;
                                f14 = 1.0f;
                            }
                        } else {
                            f10 = 0.9f;
                        }
                        aVar3.f203f = new ArrayList[iWidth + 1];
                        for (int i24 = 0; i24 <= iWidth; i24++) {
                            ((ArrayList[]) aVar3.f203f)[i24] = new ArrayList();
                            k1 k1Var4 = new k1();
                            k1Var4.f526a = pa.f(Utilities.fastRandom, iHeight);
                            k1Var4.f528c = jCurrentTimeMillis;
                            k1Var4.f527b = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                            ((ArrayList[]) aVar3.f203f)[i24].add(k1Var4);
                        }
                        f11 = 2.0f;
                        j1VarArr = (j1[][]) aVar3.f204g;
                        i10 = 16;
                        if (j1VarArr != null) {
                            f13 = 0.2f;
                            if (j1VarArr.length == iWidth + 1) {
                            }
                            f14 = 1.0f;
                            i13 = 0;
                            while (i13 <= iWidth) {
                                arrayList = ((ArrayList[]) aVar3.f203f)[i13];
                                i14 = 0;
                                while (i14 < arrayList.size()) {
                                    k1Var = (k1) arrayList.get(i14);
                                    if (jCurrentTimeMillis - k1Var.f528c > 50) {
                                        i19 = k1Var.f526a + 1;
                                        k1Var.f526a = i19;
                                        k1Var.f528c = jCurrentTimeMillis;
                                        if (i19 - k1Var.f527b >= iHeight) {
                                            if (arrayList.size() == 1) {
                                                k1Var.f526a = i20;
                                                k1Var.f528c = jCurrentTimeMillis;
                                                k1Var.f527b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i21;
                                            } else {
                                                arrayList.remove(k1Var);
                                                i14--;
                                            }
                                        }
                                        if (k1Var.f526a > k1Var.f527b) {
                                            k1 k1Var5 = new k1();
                                            k1Var5.f526a = i20;
                                            k1Var5.f528c = jCurrentTimeMillis;
                                            k1Var5.f527b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i21;
                                            arrayList.add(k1Var5);
                                        }
                                    }
                                    iMin = Math.min(k1Var.f526a, iHeight + 1);
                                    iMax = Math.max(i20, k1Var.f526a - k1Var.f527b);
                                    while (iMax < iMin) {
                                        int i25 = aVar3.f200b;
                                        f15 = i25 * i13;
                                        f16 = i25 * iMax;
                                        if (((RectF) aVar3.f201c).contains(f15, f16)) {
                                            i15 = i13;
                                            i16 = iMax;
                                            fClamp = Utilities.clamp(((f14 - ((k1Var.f526a - iMax) / (k1Var.f527b - 1))) * 0.8f) + f13, 1.0f, 0.0f);
                                            j1Var = ((j1[][]) aVar3.f204g)[i15][i16];
                                            aVar2 = (aa.a) j1Var.d;
                                            i17 = iHeight;
                                            arrayList2 = arrayList;
                                            j10 = j1Var.f489b - jCurrentTimeMillis;
                                            aVar = aVar3;
                                            if (j10 < 150) {
                                                fClamp2 = Utilities.clamp(1.0f - (j10 / 150.0f), 1.0f, 0.0f);
                                                Paint paint3 = (Paint) aVar2.h;
                                                Bitmap[] bitmapArr3 = (Bitmap[]) aVar2.d;
                                                i18 = iWidth;
                                                paint3.setAlpha((int) org.telegram.messenger.y1.z(1.0f, fClamp2, fClamp, 255.0f));
                                                canvas.drawBitmap(bitmapArr3[j1Var.f488a], f15, f16, paint3);
                                                paint3.setAlpha((int) (fClamp * fClamp2 * 255.0f));
                                                canvas.drawBitmap(bitmapArr3[j1Var.f490c], f15, f16, paint3);
                                                paint3.setAlpha(255);
                                                if (fClamp2 >= 1.0f) {
                                                    j1Var.f488a = j1Var.f490c;
                                                    j1Var.f490c = pa.f(Utilities.fastRandom, 16);
                                                    j1Var.f489b = ((long) pa.f(Utilities.fastRandom, 300)) + jCurrentTimeMillis + 150;
                                                }
                                            } else {
                                                i18 = iWidth;
                                                ((Paint) aVar2.h).setAlpha((int) (fClamp * 255.0f));
                                                canvas.drawBitmap(((Bitmap[]) aVar2.d)[j1Var.f488a], f15, f16, (Paint) aVar2.h);
                                            }
                                            iMax = i16 + 1;
                                            i13 = i15;
                                            iHeight = i17;
                                            arrayList = arrayList2;
                                            aVar3 = aVar;
                                            iWidth = i18;
                                            f14 = 1.0f;
                                        } else {
                                            i15 = i13;
                                            aVar = aVar3;
                                            i16 = iMax;
                                            i17 = iHeight;
                                            arrayList2 = arrayList;
                                            i18 = iWidth;
                                        }
                                        iMax = i16 + 1;
                                        i13 = i15;
                                        iHeight = i17;
                                        arrayList = arrayList2;
                                        aVar3 = aVar;
                                        iWidth = i18;
                                        f14 = 1.0f;
                                    }
                                    i14++;
                                    iHeight = iHeight;
                                    aVar3 = aVar3;
                                    i20 = 0;
                                    i21 = 4;
                                    f14 = 1.0f;
                                }
                                i13++;
                                iHeight = iHeight;
                                aVar3 = aVar3;
                                i20 = 0;
                                i21 = 4;
                                f14 = 1.0f;
                            }
                        } else {
                            f13 = 0.2f;
                        }
                        aVar3.f204g = new j1[iWidth + 1][];
                        i11 = 0;
                        while (i11 <= iWidth) {
                            ((j1[][]) aVar3.f204g)[i11] = new j1[iHeight + 1];
                            i12 = 0;
                            while (i12 <= iHeight) {
                                j1[][] j1VarArr4 = (j1[][]) aVar3.f204g;
                                j1[] j1VarArr5 = j1VarArr4[i11];
                                j1 j1Var4 = new j1();
                                j1Var4.d = aVar3;
                                j1VarArr5[i12] = j1Var4;
                                j1 j1Var5 = j1VarArr4[i11][i12];
                                j1Var5.getClass();
                                j1Var5.f488a = pa.f(Utilities.fastRandom, i10);
                                j1Var5.f490c = pa.f(Utilities.fastRandom, i10);
                                j1Var5.f489b = ((long) pa.f(Utilities.fastRandom, 300)) + jCurrentTimeMillis + 150;
                                i12++;
                                i10 = 16;
                            }
                            i11++;
                            i10 = 16;
                        }
                        f14 = 1.0f;
                        i13 = 0;
                        while (i13 <= iWidth) {
                            arrayList = ((ArrayList[]) aVar3.f203f)[i13];
                            i14 = 0;
                            while (i14 < arrayList.size()) {
                                k1Var = (k1) arrayList.get(i14);
                                if (jCurrentTimeMillis - k1Var.f528c > 50) {
                                    i19 = k1Var.f526a + 1;
                                    k1Var.f526a = i19;
                                    k1Var.f528c = jCurrentTimeMillis;
                                    if (i19 - k1Var.f527b >= iHeight) {
                                        if (arrayList.size() == 1) {
                                            k1Var.f526a = i20;
                                            k1Var.f528c = jCurrentTimeMillis;
                                            k1Var.f527b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i21;
                                        } else {
                                            arrayList.remove(k1Var);
                                            i14--;
                                        }
                                    }
                                    if (k1Var.f526a > k1Var.f527b) {
                                        k1 k1Var6 = new k1();
                                        k1Var6.f526a = i20;
                                        k1Var6.f528c = jCurrentTimeMillis;
                                        k1Var6.f527b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i21;
                                        arrayList.add(k1Var6);
                                    }
                                }
                                iMin = Math.min(k1Var.f526a, iHeight + 1);
                                iMax = Math.max(i20, k1Var.f526a - k1Var.f527b);
                                while (iMax < iMin) {
                                    int i26 = aVar3.f200b;
                                    f15 = i26 * i13;
                                    f16 = i26 * iMax;
                                    if (((RectF) aVar3.f201c).contains(f15, f16)) {
                                        i15 = i13;
                                        i16 = iMax;
                                        fClamp = Utilities.clamp(((f14 - ((k1Var.f526a - iMax) / (k1Var.f527b - 1))) * 0.8f) + f13, 1.0f, 0.0f);
                                        j1Var = ((j1[][]) aVar3.f204g)[i15][i16];
                                        aVar2 = (aa.a) j1Var.d;
                                        i17 = iHeight;
                                        arrayList2 = arrayList;
                                        j10 = j1Var.f489b - jCurrentTimeMillis;
                                        aVar = aVar3;
                                        if (j10 < 150) {
                                            fClamp2 = Utilities.clamp(1.0f - (j10 / 150.0f), 1.0f, 0.0f);
                                            Paint paint4 = (Paint) aVar2.h;
                                            Bitmap[] bitmapArr4 = (Bitmap[]) aVar2.d;
                                            i18 = iWidth;
                                            paint4.setAlpha((int) org.telegram.messenger.y1.z(1.0f, fClamp2, fClamp, 255.0f));
                                            canvas.drawBitmap(bitmapArr4[j1Var.f488a], f15, f16, paint4);
                                            paint4.setAlpha((int) (fClamp * fClamp2 * 255.0f));
                                            canvas.drawBitmap(bitmapArr4[j1Var.f490c], f15, f16, paint4);
                                            paint4.setAlpha(255);
                                            if (fClamp2 >= 1.0f) {
                                                j1Var.f488a = j1Var.f490c;
                                                j1Var.f490c = pa.f(Utilities.fastRandom, 16);
                                                j1Var.f489b = ((long) pa.f(Utilities.fastRandom, 300)) + jCurrentTimeMillis + 150;
                                            }
                                        } else {
                                            i18 = iWidth;
                                            ((Paint) aVar2.h).setAlpha((int) (fClamp * 255.0f));
                                            canvas.drawBitmap(((Bitmap[]) aVar2.d)[j1Var.f488a], f15, f16, (Paint) aVar2.h);
                                        }
                                        iMax = i16 + 1;
                                        i13 = i15;
                                        iHeight = i17;
                                        arrayList = arrayList2;
                                        aVar3 = aVar;
                                        iWidth = i18;
                                        f14 = 1.0f;
                                    } else {
                                        i15 = i13;
                                        aVar = aVar3;
                                        i16 = iMax;
                                        i17 = iHeight;
                                        arrayList2 = arrayList;
                                        i18 = iWidth;
                                    }
                                    iMax = i16 + 1;
                                    i13 = i15;
                                    iHeight = i17;
                                    arrayList = arrayList2;
                                    aVar3 = aVar;
                                    iWidth = i18;
                                    f14 = 1.0f;
                                }
                                i14++;
                                iHeight = iHeight;
                                aVar3 = aVar3;
                                i20 = 0;
                                i21 = 4;
                                f14 = 1.0f;
                            }
                            i13++;
                            iHeight = iHeight;
                            aVar3 = aVar3;
                            i20 = 0;
                            i21 = 4;
                            f14 = 1.0f;
                        }
                    }
                } else {
                    f10 = 0.9f;
                    f11 = 2.0f;
                    if (j3Var != null) {
                        j3Var.d(canvas);
                    } else if (h3Var != null) {
                        o3 o3Var = this.D;
                        if (o3Var != null) {
                            float fClamp3 = Utilities.clamp(o3Var.getCurrentPosition() / this.D.getDuration(), 1.0f, 0.0f);
                            float f18 = 1.0f / 9;
                            int i27 = (int) (fClamp3 / f18);
                            int i28 = i27 + 1;
                            float fW = com.google.android.recaptcha.internal.a.w(i27, f18, fClamp3, f18);
                            float[] fArr = Q;
                            f12 = i28 < 10 ? (fArr[i28] * fW) + ((1.0f - fW) * fArr[i27]) : fArr[i27];
                        } else {
                            f12 = 0.2f;
                        }
                        h3Var.f422f = (((1.0f - Utilities.clamp(this.C / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f12;
                        ArrayList arrayList3 = h3Var.f421e;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        for (int i29 = 0; i29 < arrayList3.size(); i29++) {
                            g3 g3Var = (g3) arrayList3.get(i29);
                            h3 h3Var2 = g3Var.f405g;
                            float[] fArr2 = h3Var2.d;
                            int i30 = i29 * 4;
                            float f19 = g3Var.f400a;
                            fArr2[i30] = f19;
                            fArr2[i30 + 1] = g3Var.f401b;
                            fArr2[i30 + 2] = (AndroidUtilities.dp(30.0f) * g3Var.f402c) + f19;
                            fArr2[i30 + 3] = (AndroidUtilities.dp(30.0f) * g3Var.d) + g3Var.f401b;
                            float fDp = AndroidUtilities.dp(4.0f);
                            float f20 = h3Var2.f425j;
                            float f21 = (f20 / 660.0f) * fDp * h3Var2.f422f;
                            float f22 = (g3Var.f402c * f21) + g3Var.f400a;
                            g3Var.f400a = f22;
                            float f23 = (g3Var.d * f21) + g3Var.f401b;
                            g3Var.f401b = f23;
                            float f24 = g3Var.f404f;
                            if (f24 != 1.0f) {
                                float f25 = (f20 / 200.0f) + f24;
                                g3Var.f404f = f25;
                                if (f25 > 1.0f) {
                                    g3Var.f404f = 1.0f;
                                }
                            }
                            if (jCurrentTimeMillis2 > g3Var.f403e || !h3Var.f419b.contains(f22, f23)) {
                                g3Var.a(jCurrentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(h3Var.d, h3Var.f420c);
                    } else {
                        r rVar = this.L;
                        if (rVar != null) {
                            ArrayList arrayList4 = rVar.f630e;
                            System.currentTimeMillis();
                            for (int i31 = 0; i31 < arrayList4.size(); i31++) {
                                q qVar = (q) arrayList4.get(i31);
                                r rVar2 = qVar.f619m;
                                Paint paint5 = (Paint) rVar2.f633i;
                                float f26 = qVar.f618l;
                                if (f26 != 1.0f) {
                                    float f27 = (rVar2.f628b / qVar.f616j) + f26;
                                    qVar.f618l = f27;
                                    if (f27 > 1.0f) {
                                        qVar.f618l = 1.0f;
                                    }
                                }
                                if (qVar.f613f != null) {
                                    canvas.save();
                                    float fPow2 = 1.0f - (((float) Math.pow(qVar.f618l - 0.5f, 2.0d)) * 4.0f);
                                    float fB = com.google.android.recaptcha.internal.a.B(fPow2, 0.4f, 0.7f, qVar.f617k / rVar2.f627a);
                                    canvas.translate(qVar.f610b - (qVar.h / 2.0f), qVar.f611c - (qVar.f615i / 2.0f));
                                    canvas.scale(fB, fB, qVar.h / 2.0f, qVar.f615i / 2.0f);
                                    paint5.setAlpha((int) (qVar.d * fPow2));
                                    canvas.drawBitmap(qVar.f613f, 0.0f, 0.0f, paint5);
                                    canvas.restore();
                                }
                                if (qVar.f618l >= 1.0f) {
                                    qVar.a(i31, false);
                                }
                            }
                        }
                    }
                }
                canvas.restore();
                invalidate();
            } else {
                f10 = 0.9f;
                f11 = 2.0f;
            }
        }
        float fMin = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f10);
        float measuredWidth = (getMeasuredWidth() - (0.671f * fMin)) / f11;
        float f28 = 0.0671f * fMin;
        this.I = f28;
        boolean z10 = this.d;
        if (z10) {
            AndroidUtilities.rectTmp.set(measuredWidth, -f28, getMeasuredWidth() - measuredWidth, fMin);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth, getMeasuredHeight() - fMin, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.I);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF, this.I + AndroidUtilities.dp(3.0f), this.I + AndroidUtilities.dp(3.0f), this.f600c);
        rectF.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        float f29 = this.I;
        Paint paint6 = this.f599b;
        canvas.drawRoundRect(rectF, f29, f29, paint6);
        if (z10) {
            rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, fMin);
        } else {
            rectF.set(measuredWidth, getMeasuredHeight() - fMin, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
        }
        float fDp2 = this.I - AndroidUtilities.dp(3.0f);
        this.I = fDp2;
        j0.a aVar4 = this.G;
        if (aVar4 != null) {
            Paint paint7 = aVar4.d;
            if (aVar4.f12277g != fDp2) {
                if (fDp2 > 0.05f) {
                    paint7.setShader(aVar4.f12275e);
                } else {
                    paint7.setShader(null);
                }
                aVar4.f12277g = fDp2;
                aVar4.invalidateSelf();
            }
        }
        org.telegram.ui.Components.voip.g gVar = this.H;
        if (gVar != null) {
            gVar.f33563a = this.I;
        }
        ImageReceiver imageReceiver = this.f603n;
        if (z10) {
            int i32 = (int) this.I;
            imageReceiver.setRoundRadius(0, 0, i32, i32);
        } else {
            int i33 = (int) this.I;
            imageReceiver.setRoundRadius(i33, i33, 0, 0);
        }
        if (!this.B) {
            imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
            imageReceiver.draw(canvas);
        }
        super.dispatchDraw(canvas);
        if (z10) {
            return;
        }
        canvas.drawCircle(imageReceiver.getCenterX(), imageReceiver.getImageY() + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), paint6);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f607x = true;
        c();
        if (!this.B) {
            a();
        }
        NotificationCenter.getInstance(this.f605s).addObserver(this, NotificationCenter.fileLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f607x = false;
        c();
        NotificationCenter.getInstance(this.f605s).removeObserver(this, NotificationCenter.fileLoaded);
        r rVar = this.L;
        if (rVar != null) {
            HashMap map = (HashMap) rVar.f631f;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            map.clear();
            this.L = null;
        }
        o3 o3Var = this.D;
        if (o3Var != null) {
            this.P = o3Var.getCurrentPosition();
            this.D.release(new l3(0));
            this.D = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float fMin = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * fMin)) / 2.0f;
        if (this.d) {
            AndroidUtilities.rectTmp.set(measuredWidth2, -this.I, getMeasuredWidth() - measuredWidth2, fMin);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth2, getMeasuredHeight() - fMin, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.I);
        }
        if (this.O != measuredWidth) {
            this.O = measuredWidth;
            aa.a aVar = this.M;
            if (aVar != null) {
                RectF rectF = (RectF) aVar.f201c;
                ((Rect) aVar.f202e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(AndroidUtilities.rectTmp);
                rectF.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
            j3 j3Var = this.J;
            if (j3Var != null) {
                RectF rectF2 = j3Var.f501c;
                RectF rectF3 = j3Var.f499a;
                int i14 = this.v;
                if (i14 == 6 || i14 == 9 || i14 == 3 || i14 == 7 || i14 == 24 || i14 == 43 || i14 == 11 || i14 == 4) {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                } else {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float fWidth = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - fWidth, rectF4.centerY() - fWidth, rectF4.centerX() + fWidth, rectF4.centerY() + fWidth);
                    j3Var.f500b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                j3Var.f();
                rectF2.set(AndroidUtilities.rectTmp);
                rectF2.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            }
            h3 h3Var = this.K;
            if (h3Var != null) {
                RectF rectF5 = h3Var.f418a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                h3Var.f419b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = h3Var.f421e;
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((g3) arrayList.get(i15)).a(jCurrentTimeMillis, true);
                }
            }
            r rVar = this.L;
            if (rVar != null) {
                ((RectF) rVar.f632g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.L.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.L.f632g).inset(AndroidUtilities.dp(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.L.f630e;
                System.currentTimeMillis();
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    ((q) arrayList2.get(i16)).a(i16, true);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float fMin = (int) (Math.min(size2, size) * 0.9f);
        float f10 = size;
        float f11 = (f10 - (0.671f * fMin)) / 2.0f;
        this.I = 0.0671f * fMin;
        m3 m3Var = this.E;
        m3Var.invalidateOutline();
        if (this.d) {
            AndroidUtilities.rectTmp.set(f11, 0.0f, f10 - f11, fMin);
        } else {
            float f12 = size2;
            AndroidUtilities.rectTmp.set(f11, f12 - fMin, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = m3Var.getLayoutParams();
        RectF rectF = AndroidUtilities.rectTmp;
        layoutParams.width = (int) rectF.width();
        m3Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) m3Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) m3Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i10, i11);
    }

    @Override
    public void setOffset(float f10) {
        boolean z10;
        boolean z11 = this.d;
        boolean z12 = false;
        if (f10 < 0.0f) {
            float measuredWidth = (-f10) / getMeasuredWidth();
            setAlpha((Utilities.clamp(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z11) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.C = Math.abs(measuredWidth);
            z10 = measuredWidth < 1.0f;
            if (measuredWidth < 0.1f) {
                z12 = true;
            }
        } else {
            float measuredWidth2 = (-f10) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z11) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            z10 = measuredWidth2 > -1.0f;
            z12 = measuredWidth2 > -0.1f;
            this.C = Math.abs(measuredWidth2);
        }
        if (z10 != this.f606w) {
            this.f606w = z10;
            c();
        }
        if (z12 != this.A) {
            this.A = z12;
            ImageReceiver imageReceiver = this.f603n;
            imageReceiver.setAllowStartAnimation(z12);
            if (this.A) {
                imageReceiver.startAnimation();
                b();
                return;
            }
            o3 o3Var = this.D;
            if (o3Var != null) {
                this.P = o3Var.getCurrentPosition();
                this.D.release(new l3(0));
                this.D = null;
            }
            imageReceiver.stopAnimation();
        }
    }
}
