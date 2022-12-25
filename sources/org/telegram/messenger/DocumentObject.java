package org.telegram.messenger;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.SvgHelper;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$TL_photoPathSize;
import org.telegram.tgnet.TLRPC$TL_wallPaper;
import org.telegram.tgnet.TLRPC$ThemeSettings;
import org.telegram.tgnet.TLRPC$WallPaper;

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
                this.f856id = tLRPC$Document.f856id;
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
                this.f857iv = tLRPC$Document.f857iv;
                this.attributes = tLRPC$Document.attributes;
                return;
            }
            this.f856id = -2147483648L;
            this.dc_id = Integer.MIN_VALUE;
        }
    }

    public static SvgHelper.SvgDrawable getSvgThumb(ArrayList<TLRPC$PhotoSize> arrayList, String str, float f) {
        int size = arrayList.size();
        TLRPC$TL_photoPathSize tLRPC$TL_photoPathSize = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC$PhotoSize tLRPC$PhotoSize = arrayList.get(i3);
            if (tLRPC$PhotoSize instanceof TLRPC$TL_photoPathSize) {
                tLRPC$TL_photoPathSize = (TLRPC$TL_photoPathSize) tLRPC$PhotoSize;
            } else {
                i = tLRPC$PhotoSize.f879w;
                i2 = tLRPC$PhotoSize.f878h;
            }
            if (tLRPC$TL_photoPathSize != null && i != 0 && i2 != 0) {
                SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(SvgHelper.decompress(tLRPC$TL_photoPathSize.bytes), i, i2);
                if (drawableByPath != null) {
                    drawableByPath.setupGradient(str, f, false);
                }
                return drawableByPath;
            }
        }
        return null;
    }

    public static SvgHelper.SvgDrawable getCircleThumb(float f, String str, float f2) {
        return getCircleThumb(f, str, null, f2);
    }

    public static SvgHelper.SvgDrawable getCircleThumb(float f, String str, Theme.ResourcesProvider resourcesProvider, float f2) {
        try {
            SvgHelper.SvgDrawable svgDrawable = new SvgHelper.SvgDrawable();
            SvgHelper.Circle circle = new SvgHelper.Circle(256.0f, 256.0f, f * 512.0f);
            svgDrawable.commands.add(circle);
            svgDrawable.paints.put(circle, new Paint(1));
            svgDrawable.width = 512;
            svgDrawable.height = 512;
            svgDrawable.setupGradient(str, f2, false);
            return svgDrawable;
        } catch (Exception e) {
            FileLog.m31e(e);
            return null;
        }
    }

    public static SvgHelper.SvgDrawable getSvgThumb(TLRPC$Document tLRPC$Document, String str, float f) {
        return getSvgThumb(tLRPC$Document, str, f, 1.0f);
    }

    public static SvgHelper.SvgDrawable getSvgRectThumb(String str, float f) {
        Path path = new Path();
        path.addRect(0.0f, 0.0f, 512.0f, 512.0f, Path.Direction.CW);
        path.close();
        SvgHelper.SvgDrawable svgDrawable = new SvgHelper.SvgDrawable();
        svgDrawable.commands.add(path);
        svgDrawable.paints.put(path, new Paint(1));
        svgDrawable.width = 512;
        svgDrawable.height = 512;
        svgDrawable.setupGradient(str, f, false);
        return svgDrawable;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(TLRPC$Document tLRPC$Document, String str, float f, float f2) {
        int i;
        int i2;
        SvgHelper.SvgDrawable svgDrawable = null;
        if (tLRPC$Document == null) {
            return null;
        }
        int size = tLRPC$Document.thumbs.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            TLRPC$PhotoSize tLRPC$PhotoSize = tLRPC$Document.thumbs.get(i3);
            if (tLRPC$PhotoSize instanceof TLRPC$TL_photoPathSize) {
                int size2 = tLRPC$Document.attributes.size();
                int i4 = 0;
                while (true) {
                    i = 512;
                    if (i4 >= size2) {
                        i2 = 512;
                        break;
                    }
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i4);
                    if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) {
                        int i5 = tLRPC$DocumentAttribute.f859w;
                        int i6 = tLRPC$DocumentAttribute.f858h;
                        i = i5;
                        i2 = i6;
                        break;
                    }
                    i4++;
                }
                if (i != 0 && i2 != 0 && (svgDrawable = SvgHelper.getDrawableByPath(SvgHelper.decompress(tLRPC$PhotoSize.bytes), (int) (i * f2), (int) (i2 * f2))) != null) {
                    svgDrawable.setupGradient(str, f, false);
                }
            } else {
                i3++;
            }
        }
        return svgDrawable;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(int i, String str, float f) {
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(i, -65536);
        if (drawable != null) {
            drawable.setupGradient(str, f, false);
        }
        return drawable;
    }
}
