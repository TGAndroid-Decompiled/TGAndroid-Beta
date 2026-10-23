package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.RadialProgress2;
public final class z0 extends a0 implements org.telegram.ui.ActionBar.b6, n9, l0, DownloadController.FileDownloadProgressListener {
    public final ImageReceiver E;
    public final k0 F;
    public final int G;
    public final int H;
    public final int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public StaticLayout Q;
    public StaticLayout R;
    public r3 S;
    public MessageObject T;
    public TLRPC.Document U;
    public int V;
    public boolean W;
    public int f15736a0;
    public final int f15737n;
    public final org.telegram.ui.ActionBar.g6 f15738r;
    public final Paint f15739s;
    public final Paint v;
    public final TextPaint f15740w;
    public final TextPaint f15741x;
    public final RadialProgress2 f15742y;

    public z0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f15739s = new Paint(1);
        this.v = new Paint(1);
        this.f15740w = new TextPaint(1);
        this.f15741x = new TextPaint(1);
        int dp = AndroidUtilities.dp(10.0f);
        this.H = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.I = dp2;
        this.J = AndroidUtilities.dp(16.0f);
        this.K = AndroidUtilities.dp(16.0f);
        this.V = -1;
        this.f15736a0 = r6.f21817b;
        this.f15737n = i10;
        this.f15738r = g6Var;
        setWillNotDraw(false);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        this.G = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, g6Var);
        this.f15742y = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.J;
        radialProgress2.r(i11, dp, i11 + dp2, dp2 + dp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        k0 k0Var = new k0(context, g6Var, new k2.w0(this, 1));
        this.F = k0Var;
        addView(k0Var.f15411a, w7.z5.e(-2, -2, 51));
        updateColors();
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.F.f(i10, i11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f21507uf));
    }

    @Override
    public final void b() {
        this.F.i();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.F.c(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11 = this.f15736a0;
        int i12 = r6.f21817b;
        if (i11 != i12) {
            this.f15736a0 = i12;
            try {
                RadialProgress2 radialProgress2 = this.f15742y;
                org.telegram.ui.ActionBar.g6 g6Var = this.f15738r;
                if (radialProgress2 != null && (i10 = this.V) >= 0) {
                    radialProgress2.d = k6.w0(i10, g6Var);
                }
                if (this.W && (getBackground() instanceof a2)) {
                    ((a2) getBackground()).a(k6.w0(k6.f21183d6, g6Var));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        super.draw(canvas);
    }

    @Override
    public final void e(int i10) {
        int i11;
        int dp = AndroidUtilities.dp(16.0f);
        if (this.M) {
            i10 = 0;
        }
        int i12 = dp + i10;
        this.K = i12;
        if (this.L) {
            i12 += AndroidUtilities.dp(21.0f);
        }
        this.J = i12;
        if (this.L) {
            i11 = AndroidUtilities.dp(31.0f);
        } else {
            i11 = this.H;
        }
        int i13 = this.J;
        int i14 = this.I;
        this.f15742y.r(i13, i11, i13 + i14, i14 + i11);
        requestLayout();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.F.e(arrayList);
    }

    public final void g(TLRPC.Document document) {
        String str;
        File file;
        String str2;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        MessageObject messageObject;
        String str3;
        t tVar;
        a aVar = this.f15157a;
        ImageLocation imageLocation = null;
        if (aVar != null && (tVar = aVar.f15144g) != null) {
            str = tVar.e;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            file = null;
        } else {
            file = new File(str);
        }
        if (document != null && (str3 = document.mime_type) != null) {
            str2 = str3.toLowerCase();
        } else {
            str2 = "";
        }
        if (i() && file != null && file.exists() && (str2.startsWith("image/") || str2.equals("video/mp4"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
        if (!z10 && !isDocumentHasThumb) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.L = z11;
        int dp = AndroidUtilities.dp(16.0f);
        if (this.M) {
            i10 = 0;
        } else {
            i10 = this.f15159c;
        }
        int i12 = dp + i10;
        this.K = i12;
        if (this.L) {
            i12 += AndroidUtilities.dp(21.0f);
        }
        this.J = i12;
        if (this.L) {
            i11 = AndroidUtilities.dp(31.0f);
        } else {
            i11 = this.H;
        }
        int i13 = this.J;
        int i14 = this.I;
        this.f15742y.r(i13, i11, i13 + i14, i14 + i11);
        ImageReceiver imageReceiver = this.E;
        if (z10) {
            imageReceiver.setImageCoords(this.K, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            this.E.setImage(ImageLocation.getForPath(str), "86_86", null, null, document, 1);
        } else if (isDocumentHasThumb) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
            r3 r3Var = this.S;
            if (r3Var == null) {
                messageObject = null;
            } else {
                messageObject = r3Var.f15548a.f15658j3;
            }
            imageReceiver.setImageCoords(this.K, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            if (closestPhotoSizeWithSize != null) {
                imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            ImageLocation imageLocation2 = imageLocation;
            Drawable createStripedBitmap = ImageLoader.createStripedBitmap(document.thumbs);
            if (messageObject == null) {
                messageObject = this.T;
            }
            this.E.setImage(imageLocation2, "86_86", createStripedBitmap, null, messageObject, 1);
        } else {
            imageReceiver.clearImage();
        }
    }

    @Override
    public h1 getCaptionEditText() {
        return this.F.f15411a;
    }

    @Override
    public int getObserverTag() {
        return this.G;
    }

    @Override
    public a getRow() {
        return this.f15157a;
    }

    public final TLRPC.Document h() {
        t tVar;
        a aVar = this.f15157a;
        if (aVar != null && (tVar = aVar.f15144g) != null) {
            return tVar.h;
        }
        return null;
    }

    public final boolean i() {
        t tVar;
        a aVar = this.f15157a;
        if (aVar != null && (tVar = aVar.f15144g) != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public final void j() {
        int i10;
        float f7;
        int i11;
        int i12;
        t tVar;
        TLRPC.Document h = h();
        if (h == null) {
            return;
        }
        if (this.L) {
            i10 = this.K;
            f7 = 97.0f;
        } else {
            i10 = this.J;
            f7 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f7) + i10;
        int dp2 = AndroidUtilities.dp(40.0f);
        if (getMeasuredWidth() > 0) {
            i11 = getMeasuredWidth();
        } else {
            i11 = AndroidUtilities.displaySize.x;
        }
        int dp3 = (i11 - dp) - AndroidUtilities.dp(16.0f);
        if (this.M) {
            i12 = this.f15159c;
        } else {
            i12 = 0;
        }
        int max = Math.max(dp2, dp3 - i12);
        TextPaint textPaint = this.f15740w;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = this.f15741x;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        String documentFileName = FileLoader.getDocumentFileName(h);
        if (TextUtils.isEmpty(documentFileName) && (tVar = this.f15157a.f15144g) != null && !TextUtils.isEmpty(tVar.e)) {
            documentFileName = new File(this.f15157a.f15144g.e).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(documentFileName, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j10 = h.size;
        if (j10 <= 0) {
            t tVar2 = this.f15157a.f15144g;
            if (tVar2 != null && !TextUtils.isEmpty(tVar2.e)) {
                j10 = new File(this.f15157a.f15144g.e).length();
            } else {
                j10 = 0;
            }
        }
        this.R = new StaticLayout(AndroidUtilities.formatFileSize(j10), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: ki.z0.k(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        this.f15742y.n(this);
        this.E.onAttachedToWindow();
        k(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = false;
        this.E.onDetachedFromWindow();
        DownloadController.getInstance(this.f15737n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        int height;
        o9 textSelectionHelper;
        int i11;
        float f10;
        if (h() != null) {
            boolean z10 = this.L;
            org.telegram.ui.ActionBar.g6 g6Var = this.f15738r;
            if (z10 && !this.E.draw(canvas)) {
                int w02 = k6.w0(k6.Gd, g6Var);
                Paint paint = this.v;
                paint.setColor(w02);
                canvas.drawRoundRect(this.K, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.K, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            this.f15742y.draw(canvas);
            if (this.L) {
                i10 = this.K;
                f7 = 97.0f;
            } else {
                i10 = this.J;
                f7 = 54.0f;
            }
            int dp = AndroidUtilities.dp(f7) + i10;
            this.f15740w.setColor(k6.w0(k6.Dd, g6Var));
            int dp2 = AndroidUtilities.dp(12.0f);
            if (this.Q != null) {
                canvas.save();
                canvas.translate(dp, dp2);
                this.Q.draw(canvas);
                canvas.restore();
            }
            this.f15741x.setColor(k6.w0(k6.f21373nd, g6Var));
            StaticLayout staticLayout = this.Q;
            int i12 = 0;
            if (staticLayout == null) {
                height = 0;
            } else {
                height = staticLayout.getHeight();
            }
            int dp3 = AndroidUtilities.dp(2.0f) + dp2 + height;
            if (this.R != null) {
                canvas.save();
                canvas.translate(dp, dp3);
                this.R.draw(canvas);
                canvas.restore();
            }
            if (this.S != null && (getParent() instanceof RecyclerView) && (textSelectionHelper = this.S.f15548a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R > textSelectionHelper.f22861p0 && R <= textSelectionHelper.f22864s0) {
                    if (this.M) {
                        i11 = 0;
                    } else {
                        i11 = this.f15159c;
                    }
                    float dp4 = AndroidUtilities.dp(8.0f) + i11;
                    float dp5 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.M) {
                        i12 = this.f15159c;
                    }
                    float dp6 = (width - i12) - AndroidUtilities.dp(8.0f);
                    if (this.L) {
                        f10 = 104.0f;
                    } else {
                        f10 = 64.0f;
                    }
                    canvas.drawRoundRect(dp4, dp5, dp6, AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f15739s);
                }
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        k(true);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        boolean z11 = this.M;
        int i15 = 0;
        if (z11) {
            i14 = 0;
        } else {
            i14 = this.f15159c;
        }
        if (z11) {
            i15 = this.f15159c;
        }
        int i16 = i12 - i10;
        if (this.L) {
            f7 = 106.0f;
        } else {
            f7 = 66.0f;
        }
        this.F.g(i14, i15, i16, AndroidUtilities.dp(f7));
        j();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.M;
        int i13 = 0;
        if (z10) {
            i12 = 0;
        } else {
            i12 = this.f15159c;
        }
        if (z10) {
            i13 = this.f15159c;
        }
        int h = this.F.h(i12, i13, size);
        if (this.L) {
            f7 = 106.0f;
        } else {
            f7 = 66.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f7) + h);
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        if (j11 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f15742y.p(min, true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f15742y.p(1.0f, true);
        k(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: ki.z0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        this.f15739s.setColor(k6.w0(k6.f21507uf, this.f15738r));
        k0 k0Var = this.F;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
