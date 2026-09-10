package hi;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.RadialProgress2;
public final class c1 extends b0 implements org.telegram.ui.ActionBar.a6, r9, n0, DownloadController.FileDownloadProgressListener {
    public final ImageReceiver E;
    public final m0 F;
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
    public u3 S;
    public MessageObject T;
    public TLRPC.Document U;
    public final int f9485n;
    public final org.telegram.ui.ActionBar.f6 f9486r;
    public final Paint f9487s;
    public final Paint v;
    public final TextPaint f9488w;
    public final TextPaint f9489x;
    public final RadialProgress2 f9490y;

    public c1(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f9487s = new Paint(1);
        this.v = new Paint(1);
        this.f9488w = new TextPaint(1);
        this.f9489x = new TextPaint(1);
        int dp = AndroidUtilities.dp(10.0f);
        this.H = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.I = dp2;
        this.J = AndroidUtilities.dp(16.0f);
        this.K = AndroidUtilities.dp(16.0f);
        this.f9485n = i10;
        this.f9486r = f6Var;
        setWillNotDraw(false);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        this.G = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.f9490y = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.J;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        m0 m0Var = new m0(context, f6Var, new a6.i(this, 22));
        this.F = m0Var;
        addView(m0Var.f9738a, w7.a6.e(-2, -2, 51));
        e();
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.F.f(i10, i11);
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
    public final void e() {
        this.f9487s.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18245uf, this.f9486r));
        m0 m0Var = this.F;
        if (m0Var != null) {
            m0Var.a();
        }
    }

    @Override
    public final void f(int i10) {
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
        this.f9490y.q(i13, i11, i13 + i14, i14 + i11);
        requestLayout();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.F.e(arrayList);
    }

    @Override
    public k1 getCaptionEditText() {
        return this.F.f9738a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.G;
    }

    @Override
    public a getRow() {
        return this.f9464a;
    }

    public final void h(TLRPC.Document document) {
        String str;
        File file;
        String str2;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        MessageObject messageObject;
        String str3;
        v vVar;
        a aVar = this.f9464a;
        ImageLocation imageLocation = null;
        if (aVar != null && (vVar = aVar.f9424g) != null) {
            str = vVar.e;
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
        if (j() && file != null && file.exists() && (str2.startsWith("image/") || str2.equals("video/mp4"))) {
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
            i10 = this.f9466c;
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
        this.f9490y.q(i13, i11, i13 + i14, i14 + i11);
        ImageReceiver imageReceiver = this.E;
        if (z10) {
            imageReceiver.setImageCoords(this.K, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            this.E.setImage(ImageLocation.getForPath(str), "86_86", null, null, document, 1);
        } else if (isDocumentHasThumb) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
            u3 u3Var = this.S;
            if (u3Var == null) {
                messageObject = null;
            } else {
                messageObject = u3Var.f9889a.f10003i3;
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

    public final TLRPC.Document i() {
        v vVar;
        a aVar = this.f9464a;
        if (aVar != null && (vVar = aVar.f9424g) != null) {
            return vVar.h;
        }
        return null;
    }

    public final boolean j() {
        v vVar;
        a aVar = this.f9464a;
        if (aVar != null && (vVar = aVar.f9424g) != null && vVar.a()) {
            return true;
        }
        return false;
    }

    public final void k() {
        int i10;
        float f7;
        int i11;
        int i12;
        v vVar;
        TLRPC.Document i13 = i();
        if (i13 == null) {
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
            i12 = this.f9466c;
        } else {
            i12 = 0;
        }
        int max = Math.max(dp2, dp3 - i12);
        TextPaint textPaint = this.f9488w;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = this.f9489x;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        String documentFileName = FileLoader.getDocumentFileName(i13);
        if (TextUtils.isEmpty(documentFileName) && (vVar = this.f9464a.f9424g) != null && !TextUtils.isEmpty(vVar.e)) {
            documentFileName = new File(this.f9464a.f9424g.e).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(documentFileName, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j3 = i13.size;
        if (j3 <= 0) {
            v vVar2 = this.f9464a.f9424g;
            if (vVar2 != null && !TextUtils.isEmpty(vVar2.e)) {
                j3 = new File(this.f9464a.f9424g.e).length();
            } else {
                j3 = 0;
            }
        }
        this.R = new StaticLayout(AndroidUtilities.formatFileSize(j3), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void l(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: hi.c1.l(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        this.f9490y.m(this);
        this.E.onAttachedToWindow();
        l(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = false;
        this.E.onDetachedFromWindow();
        DownloadController.getInstance(this.f9485n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        int height;
        s9 textSelectionHelper;
        int i11;
        float f10;
        if (i() != null) {
            boolean z10 = this.L;
            org.telegram.ui.ActionBar.f6 f6Var = this.f9486r;
            if (z10 && !this.E.draw(canvas)) {
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gd, f6Var);
                Paint paint = this.v;
                paint.setColor(v02);
                canvas.drawRoundRect(this.K, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.K, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            this.f9490y.draw(canvas);
            if (this.L) {
                i10 = this.K;
                f7 = 97.0f;
            } else {
                i10 = this.J;
                f7 = 54.0f;
            }
            int dp = AndroidUtilities.dp(f7) + i10;
            this.f9488w.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Dd, f6Var));
            int dp2 = AndroidUtilities.dp(12.0f);
            if (this.Q != null) {
                canvas.save();
                canvas.translate(dp, dp2);
                this.Q.draw(canvas);
                canvas.restore();
            }
            this.f9489x.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18115nd, f6Var));
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
            if (this.S != null && (getParent() instanceof RecyclerView) && (textSelectionHelper = this.S.f9889a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R > textSelectionHelper.f20047u0 && R <= textSelectionHelper.f20050x0) {
                    if (this.M) {
                        i11 = 0;
                    } else {
                        i11 = this.f9466c;
                    }
                    float dp4 = AndroidUtilities.dp(8.0f) + i11;
                    float dp5 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.M) {
                        i12 = this.f9466c;
                    }
                    float dp6 = (width - i12) - AndroidUtilities.dp(8.0f);
                    if (this.L) {
                        f10 = 104.0f;
                    } else {
                        f10 = 64.0f;
                    }
                    canvas.drawRoundRect(dp4, dp5, dp6, AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f9487s);
                }
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        l(true);
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
            i14 = this.f9466c;
        }
        if (z11) {
            i15 = this.f9466c;
        }
        int i16 = i12 - i10;
        if (this.L) {
            f7 = 106.0f;
        } else {
            f7 = 66.0f;
        }
        this.F.g(i14, i15, i16, AndroidUtilities.dp(f7));
        k();
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
            i12 = this.f9466c;
        }
        if (z10) {
            i13 = this.f9466c;
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
    public final void onProgressDownload(String str, long j3, long j10) {
        float min;
        if (j10 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.f9490y.o(min, true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f9490y.o(1.0f, true);
        l(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: hi.c1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
