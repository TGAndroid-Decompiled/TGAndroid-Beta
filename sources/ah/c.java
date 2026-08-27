package ah;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadialProgress2;

public final class c extends zg.e {

    public final String f751b;

    public final Uri f752c;
    public final String d;

    public final long f753e;

    public final String f754f;
    public final Drawable h;

    public final StaticLayout f755n;

    public c(String str) {
        long length;
        this.f751b = str;
        this.f752c = null;
        File file = new File(str);
        try {
            length = file.length();
        } catch (Throwable unused) {
            length = 0;
        }
        this.f753e = length;
        String name = file.getName();
        this.d = name;
        String[] strArrSplit = name.split("\\.");
        String str2 = strArrSplit.length > 1 ? strArrSplit[strArrSplit.length - 1] : "?";
        this.f754f = str2;
        int thumbForNameOrMime = AndroidUtilities.getThumbForNameOrMime(name, str2, false);
        if (thumbForNameOrMime != 0) {
            this.h = ApplicationLoader.applicationContext.getResources().getDrawable(thumbForNameOrMime);
        } else {
            this.h = null;
        }
        if (TextUtils.isEmpty(str2)) {
            this.f755n = null;
            return;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(g6.w0(null, g6.Bi, false));
        this.f755n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, AndroidUtilities.dp(34.0f), TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    public static b d(View view, String str, String str2, TLRPC.Document document, MessageObject messageObject) {
        b bVar = new b();
        bVar.f741a.setColor(g6.w0(null, g6.G6, false));
        bVar.f742b.setColor(g6.w0(null, g6.f23423y6, false));
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        bVar.f743c = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(21.0f));
        bVar.f743c.g(g6.f23152ie, g6.f23170je, g6.f23363uc, g6.f23379vc);
        if (MessageObject.isMusicDocument(document)) {
            if (MessageObject.isDocumentHasThumb(document)) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
                bVar.f743c.j(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize, true), closestPhotoSizeWithSize, document, messageObject);
            } else {
                String artworkUrl = MessageObject.getArtworkUrl(document, true);
                if (TextUtils.isEmpty(artworkUrl)) {
                    bVar.f743c.i(null, null, null);
                } else {
                    bVar.f743c.h(artworkUrl);
                }
            }
            bVar.f743c.setIcon(0, false, false);
        } else {
            bVar.f743c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        bVar.d = str;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f744e = str2;
        bVar.f750l = -1;
        bVar.f745f = null;
        bVar.f746g = null;
        bVar.invalidateSelf();
        view.addOnAttachStateChangeListener(new a(bVar));
        return bVar;
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i10 - AndroidUtilities.dp(34.0f)) / 2.0f, AndroidUtilities.dp(15.0f));
            this.f755n.draw(canvas);
            canvas.restore();
        }
    }

    public c(Uri uri) {
        this.f751b = null;
        this.f752c = uri;
        String fileName = MediaController.getFileName(uri);
        fileName = fileName == null ? "?" : fileName;
        this.d = fileName;
        String[] strArrSplit = fileName.split("\\.");
        String str = strArrSplit.length > 1 ? strArrSplit[strArrSplit.length - 1] : "?";
        this.f754f = str;
        this.f753e = 0L;
        int thumbForNameOrMime = AndroidUtilities.getThumbForNameOrMime(fileName, str, false);
        if (thumbForNameOrMime != 0) {
            this.h = ApplicationLoader.applicationContext.getResources().getDrawable(thumbForNameOrMime);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(g6.w0(null, g6.Bi, false));
            this.f755n = new StaticLayout(TextUtils.ellipsize(str, textPaint, AndroidUtilities.dp(34.0f), TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f755n = null;
    }
}
