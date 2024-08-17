package org.telegram.messenger;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_photoPathSize;
import org.telegram.tgnet.TLRPC$TL_photoSize;
import org.telegram.tgnet.TLRPC$TL_wallPaper;
import org.telegram.tgnet.TLRPC$ThemeSettings;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.ui.ActionBar.Theme;

public class DocumentObject {

    public static class ThemeDocument extends TLRPC$TL_document {
        public Theme.ThemeAccent accent;
        public Theme.ThemeInfo baseTheme;
        public TLRPC$ThemeSettings themeSettings;
        public TLRPC$Document wallpaper;

        public ThemeDocument(TLRPC$ThemeSettings tLRPC$ThemeSettings) {
            this.themeSettings = tLRPC$ThemeSettings;
            Theme.ThemeInfo theme = Theme.getTheme(Theme.getBaseThemeKey(tLRPC$ThemeSettings));
            this.baseTheme = theme;
            this.accent = theme.createNewAccent(tLRPC$ThemeSettings);
            TLRPC$WallPaper tLRPC$WallPaper = this.themeSettings.wallpaper;
            if (tLRPC$WallPaper instanceof TLRPC$TL_wallPaper) {
                TLRPC$Document tLRPC$Document = ((TLRPC$TL_wallPaper) tLRPC$WallPaper).document;
                this.wallpaper = tLRPC$Document;
                this.id = tLRPC$Document.id;
                this.access_hash = tLRPC$Document.access_hash;
                this.file_reference = tLRPC$Document.file_reference;
                this.user_id = tLRPC$Document.user_id;
                this.date = tLRPC$Document.date;
                this.file_name = tLRPC$Document.file_name;
                this.mime_type = tLRPC$Document.mime_type;
                this.size = tLRPC$Document.size;
                this.thumbs = tLRPC$Document.thumbs;
                this.version = tLRPC$Document.version;
                this.dc_id = tLRPC$Document.dc_id;
                this.key = tLRPC$Document.key;
                this.iv = tLRPC$Document.iv;
                this.attributes = tLRPC$Document.attributes;
                return;
            }
            this.id = -2147483648L;
            this.dc_id = Integer.MIN_VALUE;
        }
    }

    public static boolean containsPhotoSizeType(ArrayList<TLRPC$PhotoSize> arrayList, String str) {
        if (str == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(arrayList.get(i).type)) {
                return true;
            }
        }
        return false;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(ArrayList<TLRPC$PhotoSize> arrayList, int i, float f) {
        return getSvgThumb(arrayList, i, f, false);
    }

    public static SvgHelper.SvgDrawable getSvgThumb(ArrayList<TLRPC$PhotoSize> arrayList, int i, float f, boolean z) {
        int size = arrayList.size();
        int i2 = 512;
        TLRPC$TL_photoPathSize tLRPC$TL_photoPathSize = null;
        int i3 = 512;
        for (int i4 = 0; i4 < size; i4++) {
            TLRPC$PhotoSize tLRPC$PhotoSize = arrayList.get(i4);
            if (tLRPC$PhotoSize instanceof TLRPC$TL_photoPathSize) {
                tLRPC$TL_photoPathSize = (TLRPC$TL_photoPathSize) tLRPC$PhotoSize;
            } else if ((tLRPC$PhotoSize instanceof TLRPC$TL_photoSize) && z) {
                i2 = tLRPC$PhotoSize.w;
                i3 = tLRPC$PhotoSize.h;
            }
        }
        if (tLRPC$TL_photoPathSize == null || i2 == 0 || i3 == 0) {
            return null;
        }
        SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(tLRPC$TL_photoPathSize.svgPath, i2, i3);
        if (drawableByPath != null) {
            drawableByPath.setupGradient(i, f, false);
        }
        return drawableByPath;
    }

    public static SvgHelper.SvgDrawable getCircleThumb(float f, int i, float f2) {
        return getCircleThumb(f, i, null, f2);
    }

    public static SvgHelper.SvgDrawable getCircleThumb(float f, int i, Theme.ResourcesProvider resourcesProvider, float f2) {
        try {
            SvgHelper.SvgDrawable svgDrawable = new SvgHelper.SvgDrawable();
            SvgHelper.Circle circle = new SvgHelper.Circle(256.0f, 256.0f, f * 512.0f);
            svgDrawable.commands.add(circle);
            svgDrawable.paints.put(circle, new Paint(1));
            svgDrawable.width = 512;
            svgDrawable.height = 512;
            svgDrawable.setupGradient(i, f2, false);
            return svgDrawable;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static SvgHelper.SvgDrawable getSvgThumb(TLRPC$Document tLRPC$Document, int i, float f) {
        return getSvgThumb(tLRPC$Document, i, f, 1.0f, null);
    }

    public static SvgHelper.SvgDrawable getSvgRectThumb(int i, float f) {
        Path path = new Path();
        path.addRect(0.0f, 0.0f, 512.0f, 512.0f, Path.Direction.CW);
        path.close();
        SvgHelper.SvgDrawable svgDrawable = new SvgHelper.SvgDrawable();
        svgDrawable.commands.add(path);
        svgDrawable.paints.put(path, new Paint(1));
        svgDrawable.width = 512;
        svgDrawable.height = 512;
        svgDrawable.setupGradient(i, f, false);
        return svgDrawable;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(TLRPC$Document tLRPC$Document, int i, float f, float f2, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        int i3;
        SvgHelper.SvgDrawable svgDrawable = null;
        if (tLRPC$Document == null) {
            return null;
        }
        int size = tLRPC$Document.thumbs.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            TLRPC$PhotoSize tLRPC$PhotoSize = tLRPC$Document.thumbs.get(i4);
            if (tLRPC$PhotoSize instanceof TLRPC$TL_photoPathSize) {
                int size2 = tLRPC$Document.attributes.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i5);
                    if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo)) {
                        i2 = tLRPC$DocumentAttribute.w;
                        i3 = tLRPC$DocumentAttribute.h;
                        break;
                    }
                }
                i2 = 512;
                i3 = 512;
                if (i2 != 0 && i3 != 0 && (svgDrawable = SvgHelper.getDrawableByPath(((TLRPC$TL_photoPathSize) tLRPC$PhotoSize).svgPath, (int) (i2 * f2), (int) (i3 * f2))) != null) {
                    svgDrawable.setupGradient(i, resourcesProvider, f, false);
                }
            } else {
                i4++;
            }
        }
        return svgDrawable;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(int i, int i2, float f) {
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(i, -65536);
        if (drawable != null) {
            drawable.setupGradient(i2, f, false);
        }
        return drawable;
    }
}
