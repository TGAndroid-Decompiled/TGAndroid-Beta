package ch;

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
public final class c extends bh.h {
    public final String f3484b;
    public final Uri f3485c;
    public final String d;
    public final long f3486e;
    public final String f3487f;
    public final Drawable h;
    public final StaticLayout f3488n;

    public c(String str) {
        long j10;
        this.f3484b = str;
        this.f3485c = null;
        File file = new File(str);
        try {
            j10 = file.length();
        } catch (Throwable unused) {
            j10 = 0;
        }
        this.f3486e = j10;
        String name = file.getName();
        this.d = name;
        String[] split = name.split("\\.");
        String str2 = split.length > 1 ? split[split.length - 1] : "?";
        this.f3487f = str2;
        int thumbForNameOrMime = AndroidUtilities.getThumbForNameOrMime(name, str2, false);
        if (thumbForNameOrMime != 0) {
            this.h = ApplicationLoader.applicationContext.getResources().getDrawable(thumbForNameOrMime);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(g6.w0(null, g6.Bi, false));
            this.f3488n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, AndroidUtilities.dp(34.0f), TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f3488n = null;
    }

    public static b d(View view, String str, String str2, TLRPC.Document document, MessageObject messageObject) {
        b bVar = new b();
        bVar.f3474a.setColor(g6.w0(null, g6.G6, false));
        bVar.f3475b.setColor(g6.w0(null, g6.f23433y6, false));
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        bVar.f3476c = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(21.0f));
        bVar.f3476c.g(g6.f23160ie, g6.f23178je, g6.f23371uc, g6.f23389vc);
        if (MessageObject.isMusicDocument(document)) {
            if (MessageObject.isDocumentHasThumb(document)) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
                bVar.f3476c.j(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize, true), closestPhotoSizeWithSize, document, messageObject);
            } else {
                String artworkUrl = MessageObject.getArtworkUrl(document, true);
                if (!TextUtils.isEmpty(artworkUrl)) {
                    bVar.f3476c.h(artworkUrl);
                } else {
                    bVar.f3476c.i(null, null, null);
                }
            }
            bVar.f3476c.setIcon(0, false, false);
        } else {
            bVar.f3476c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        bVar.d = str;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f3477e = str2;
        bVar.f3483l = -1;
        bVar.f3478f = null;
        bVar.f3479g = null;
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
            this.f3488n.draw(canvas);
            canvas.restore();
        }
    }

    public c(Uri uri) {
        this.f3484b = null;
        this.f3485c = uri;
        String fileName = MediaController.getFileName(uri);
        fileName = fileName == null ? "?" : fileName;
        this.d = fileName;
        String[] split = fileName.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f3487f = str;
        this.f3486e = 0L;
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
            this.f3488n = new StaticLayout(TextUtils.ellipsize(str, textPaint, AndroidUtilities.dp(34.0f), TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f3488n = null;
    }
}
