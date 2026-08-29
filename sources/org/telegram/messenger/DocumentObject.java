package org.telegram.messenger;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public class DocumentObject {

    public static class ThemeDocument extends TLRPC.TL_document {
        public org.telegram.ui.ActionBar.e6 accent;
        public org.telegram.ui.ActionBar.f6 baseTheme;
        public TLRPC.ThemeSettings themeSettings;
        public TLRPC.Document wallpaper;

        public ThemeDocument(TLRPC.ThemeSettings themeSettings) {
            this.themeSettings = themeSettings;
            org.telegram.ui.ActionBar.f6 N0 = org.telegram.ui.ActionBar.g6.N0(org.telegram.ui.ActionBar.g6.q0(themeSettings));
            this.baseTheme = N0;
            N0.getClass();
            org.telegram.ui.ActionBar.e6 e6Var = new org.telegram.ui.ActionBar.e6();
            org.telegram.ui.ActionBar.f6.i(e6Var, themeSettings);
            e6Var.f22903b = N0;
            this.accent = e6Var;
            TLRPC.WallPaper wallPaper = this.themeSettings.wallpaper;
            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                TLRPC.Document document = ((TLRPC.TL_wallPaper) wallPaper).document;
                this.wallpaper = document;
                this.f22398id = document.f22398id;
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
            this.f22398id = -2147483648L;
            this.dc_id = Integer.MIN_VALUE;
        }
    }

    public static boolean containsPhotoSizeType(ArrayList<TLRPC.PhotoSize> arrayList, String str) {
        if (str == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(arrayList.get(i10).type)) {
                return true;
            }
        }
        return false;
    }

    public static SvgHelper.SvgDrawable getCircleThumb(float f9, int i10, float f10) {
        return getCircleThumb(f9, i10, null, f10);
    }

    public static SvgHelper.SvgDrawable getSvgRectThumb(int i10, float f9) {
        Path path = new Path();
        path.addRect(0.0f, 0.0f, 512.0f, 512.0f, Path.Direction.CW);
        path.close();
        SvgHelper.SvgDrawable svgDrawable = new SvgHelper.SvgDrawable();
        svgDrawable.commands.add(path);
        svgDrawable.paints.put(path, new Paint(1));
        svgDrawable.width = 512;
        svgDrawable.height = 512;
        svgDrawable.setupGradient(i10, f9, false);
        return svgDrawable;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(ArrayList<TLRPC.PhotoSize> arrayList, int i10, float f9) {
        return getSvgThumb(arrayList, i10, f9, false);
    }

    public static SvgHelper.SvgDrawable getCircleThumb(float f9, int i10, org.telegram.ui.ActionBar.c6 c6Var, float f10) {
        try {
            SvgHelper.SvgDrawable svgDrawable = new SvgHelper.SvgDrawable();
            SvgHelper.Circle circle = new SvgHelper.Circle(256.0f, 256.0f, f9 * 512.0f);
            svgDrawable.commands.add(circle);
            svgDrawable.paints.put(circle, new Paint(1));
            svgDrawable.width = 512;
            svgDrawable.height = 512;
            svgDrawable.setupGradient(i10, f10, false);
            return svgDrawable;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static SvgHelper.SvgDrawable getSvgThumb(ArrayList<TLRPC.PhotoSize> arrayList, int i10, float f9, boolean z10) {
        int size = arrayList.size();
        int i11 = 512;
        TLRPC.TL_photoPathSize tL_photoPathSize = null;
        int i12 = 512;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PhotoSize photoSize = arrayList.get(i13);
            if (photoSize instanceof TLRPC.TL_photoPathSize) {
                tL_photoPathSize = (TLRPC.TL_photoPathSize) photoSize;
            } else if ((photoSize instanceof TLRPC.TL_photoSize) && z10) {
                i11 = photoSize.f22417w;
                i12 = photoSize.h;
            }
        }
        if (tL_photoPathSize == null || i11 == 0 || i12 == 0) {
            return null;
        }
        SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(tL_photoPathSize.svgPath, i11, i12);
        if (drawableByPath != null) {
            drawableByPath.setupGradient(i10, f9, false);
        }
        return drawableByPath;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(TLRPC.Document document, int i10, float f9) {
        return getSvgThumb(document, i10, f9, 1.0f, null);
    }

    public static SvgHelper.SvgDrawable getSvgThumb(TLRPC.Document document, int i10, float f9, float f10, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        int i12;
        if (document == null) {
            return null;
        }
        int size = document.thumbs.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                break;
            }
            TLRPC.PhotoSize photoSize = document.thumbs.get(i13);
            if (photoSize instanceof TLRPC.TL_photoPathSize) {
                int size2 = document.attributes.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i11 = documentAttribute.f22399w;
                        i12 = documentAttribute.h;
                        break;
                    }
                }
                i11 = 512;
                i12 = 512;
                if (i11 != 0 && i12 != 0) {
                    SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(((TLRPC.TL_photoPathSize) photoSize).svgPath, (int) (i11 * f10), (int) (i12 * f10));
                    if (drawableByPath != null) {
                        drawableByPath.setupGradient(i10, c6Var, f9, false);
                    }
                    return drawableByPath;
                }
            } else {
                i13++;
            }
        }
        return null;
    }

    public static SvgHelper.SvgDrawable getSvgThumb(int i10, int i11, float f9) {
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(i10, -65536);
        if (drawable != null) {
            drawable.setupGradient(i11, f9, false);
        }
        return drawable;
    }
}
