package org.telegram.messenger;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public class DocumentObject {

    public static class ThemeDocument extends TLRPC.TL_document {
        public org.telegram.ui.ActionBar.d6 accent;
        public org.telegram.ui.ActionBar.e6 baseTheme;
        public TLRPC.ThemeSettings themeSettings;
        public TLRPC.Document wallpaper;

        public ThemeDocument(TLRPC.ThemeSettings themeSettings) {
            this.themeSettings = themeSettings;
            org.telegram.ui.ActionBar.e6 N0 = org.telegram.ui.ActionBar.f6.N0(org.telegram.ui.ActionBar.f6.q0(themeSettings));
            this.baseTheme = N0;
            N0.getClass();
            org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
            org.telegram.ui.ActionBar.e6.i(d6Var, themeSettings);
            d6Var.f22867b = N0;
            this.accent = d6Var;
            TLRPC.WallPaper wallPaper = this.themeSettings.wallpaper;
            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                TLRPC.Document document = ((TLRPC.TL_wallPaper) wallPaper).document;
                this.wallpaper = document;
                this.f22386id = document.f22386id;
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
                return;
            }
            this.f22386id = -2147483648L;
            this.dc_id = Integer.MIN_VALUE;
        }
    }

    public static boolean containsPhotoSizeType(ArrayList<TLRPC.PhotoSize> arrayList, String str) {
        if (str == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (str.equalsIgnoreCase(arrayList.get(i9).type)) {
                return true;
            }
        }
        return false;
    }

    public static SvgHelper.SvgDrawable getCircleThumb(float f10, int i9, float f11) {
        return getCircleThumb(f10, i9, null, f11);
    }

    public static SvgHelper.SvgDrawable getSvgRectThumb(int i9, float f10) {
        Path path = new Path();
        path.addRect(0.0f, 0.0f, 512.0f, 512.0f, Path.Direction.CW);
        path.close();
        SvgHelper.SvgDrawable svgDrawable = new SvgHelper.SvgDrawable();
        svgDrawable.commands.add(path);
        svgDrawable.paints.put(path, new Paint(1));
        svgDrawable.width = 512;
        svgDrawable.height = 512;
        svgDrawable.setupGradient(i9, f10, false);
        return svgDrawable;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(ArrayList<TLRPC.PhotoSize> arrayList, int i9, float f10) {
        return getSvgThumb(arrayList, i9, f10, false);
    }

    public static SvgHelper.SvgDrawable getCircleThumb(float f10, int i9, org.telegram.ui.ActionBar.b6 b6Var, float f11) {
        try {
            SvgHelper.SvgDrawable svgDrawable = new SvgHelper.SvgDrawable();
            SvgHelper.Circle circle = new SvgHelper.Circle(256.0f, 256.0f, f10 * 512.0f);
            svgDrawable.commands.add(circle);
            svgDrawable.paints.put(circle, new Paint(1));
            svgDrawable.width = 512;
            svgDrawable.height = 512;
            svgDrawable.setupGradient(i9, f11, false);
            return svgDrawable;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static SvgHelper.SvgDrawable getSvgThumb(ArrayList<TLRPC.PhotoSize> arrayList, int i9, float f10, boolean z10) {
        int size = arrayList.size();
        int i10 = 512;
        TLRPC.TL_photoPathSize tL_photoPathSize = null;
        int i11 = 512;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PhotoSize photoSize = arrayList.get(i12);
            if (photoSize instanceof TLRPC.TL_photoPathSize) {
                tL_photoPathSize = (TLRPC.TL_photoPathSize) photoSize;
            } else if ((photoSize instanceof TLRPC.TL_photoSize) && z10) {
                i10 = photoSize.f22405w;
                i11 = photoSize.h;
            }
        }
        if (tL_photoPathSize == null || i10 == 0 || i11 == 0) {
            return null;
        }
        SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(tL_photoPathSize.svgPath, i10, i11);
        if (drawableByPath != null) {
            drawableByPath.setupGradient(i9, f10, false);
        }
        return drawableByPath;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(TLRPC.Document document, int i9, float f10) {
        return getSvgThumb(document, i9, f10, 1.0f, null);
    }

    public static SvgHelper.SvgDrawable getSvgThumb(TLRPC.Document document, int i9, float f10, float f11, org.telegram.ui.ActionBar.b6 b6Var) {
        int i10;
        int i11;
        if (document == null) {
            return null;
        }
        int size = document.thumbs.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            TLRPC.PhotoSize photoSize = document.thumbs.get(i12);
            if (photoSize instanceof TLRPC.TL_photoPathSize) {
                int size2 = document.attributes.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i10 = documentAttribute.f22387w;
                        i11 = documentAttribute.h;
                        break;
                    }
                }
                i10 = 512;
                i11 = 512;
                if (i10 != 0 && i11 != 0) {
                    SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(((TLRPC.TL_photoPathSize) photoSize).svgPath, (int) (i10 * f11), (int) (i11 * f11));
                    if (drawableByPath != null) {
                        drawableByPath.setupGradient(i9, b6Var, f10, false);
                    }
                    return drawableByPath;
                }
            } else {
                i12++;
            }
        }
        return null;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(int i9, int i10, float f10) {
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(i9, -65536);
        if (drawable != null) {
            drawable.setupGradient(i10, f10, false);
        }
        return drawable;
    }
}
