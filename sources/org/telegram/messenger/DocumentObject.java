package org.telegram.messenger;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class DocumentObject {

    public static class ThemeDocument extends TLRPC.TL_document {
        public Theme.ThemeAccent accent;
        public Theme.ThemeInfo baseTheme;
        public TLRPC.ThemeSettings themeSettings;
        public TLRPC.Document wallpaper;

        public ThemeDocument(TLRPC.ThemeSettings themeSettings) {
            this.themeSettings = themeSettings;
            Theme.ThemeInfo theme = Theme.getTheme(Theme.getBaseThemeKey(themeSettings));
            this.baseTheme = theme;
            this.accent = theme.createNewAccent(themeSettings);
            TLRPC.WallPaper wallPaper = this.themeSettings.wallpaper;
            if (!(wallPaper instanceof TLRPC.TL_wallPaper)) {
                this.id = -2147483648L;
                this.dc_id = Integer.MIN_VALUE;
                return;
            }
            TLRPC.Document document = ((TLRPC.TL_wallPaper) wallPaper).document;
            this.wallpaper = document;
            this.id = document.id;
            this.access_hash = document.access_hash;
            this.file_reference = document.file_reference;
            this.user_id = document.user_id;
            this.date = document.date;
            this.file_name = document.file_name;
            this.mime_type = document.mime_type;
            this.size = document.size;
            this.thumbs = document.thumbs;
            this.version = document.version;
            this.dc_id = document.dc_id;
            this.key = document.key;
            this.iv = document.iv;
            this.attributes = document.attributes;
        }
    }

    public static boolean containsPhotoSizeType(ArrayList<TLRPC.PhotoSize> arrayList, String str) {
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

    public static SvgHelper.SvgDrawable getSvgThumb(int i, int i2, float f) {
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(i, -65536);
        if (drawable != null) {
            drawable.setupGradient(i2, f, false);
        }
        return drawable;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(ArrayList<TLRPC.PhotoSize> arrayList, int i, float f) {
        return getSvgThumb(arrayList, i, f, false);
    }

    public static SvgHelper.SvgDrawable getSvgThumb(ArrayList<TLRPC.PhotoSize> arrayList, int i, float f, boolean z) {
        int size = arrayList.size();
        int i2 = 512;
        TLRPC.TL_photoPathSize tL_photoPathSize = null;
        int i3 = 512;
        for (int i4 = 0; i4 < size; i4++) {
            TLRPC.PhotoSize photoSize = arrayList.get(i4);
            if (photoSize instanceof TLRPC.TL_photoPathSize) {
                tL_photoPathSize = (TLRPC.TL_photoPathSize) photoSize;
            } else if ((photoSize instanceof TLRPC.TL_photoSize) && z) {
                i2 = photoSize.w;
                i3 = photoSize.h;
            }
        }
        if (tL_photoPathSize == null || i2 == 0 || i3 == 0) {
            return null;
        }
        SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(tL_photoPathSize.svgPath, i2, i3);
        if (drawableByPath != null) {
            drawableByPath.setupGradient(i, f, false);
        }
        return drawableByPath;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(TLRPC.Document document, int i, float f) {
        return getSvgThumb(document, i, f, 1.0f, null);
    }

    public static SvgHelper.SvgDrawable getSvgThumb(TLRPC.Document document, int i, float f, float f2, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        int i3;
        SvgHelper.SvgDrawable svgDrawable = null;
        if (document == null) {
            return null;
        }
        int size = document.thumbs.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            TLRPC.PhotoSize photoSize = document.thumbs.get(i4);
            if (photoSize instanceof TLRPC.TL_photoPathSize) {
                int size2 = document.attributes.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i5);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i2 = documentAttribute.w;
                        i3 = documentAttribute.h;
                        break;
                    }
                }
                i2 = 512;
                i3 = 512;
                if (i2 != 0 && i3 != 0 && (svgDrawable = SvgHelper.getDrawableByPath(((TLRPC.TL_photoPathSize) photoSize).svgPath, (int) (i2 * f2), (int) (i3 * f2))) != null) {
                    svgDrawable.setupGradient(i, resourcesProvider, f, false);
                }
            } else {
                i4++;
            }
        }
        return svgDrawable;
    }
}
