package org.telegram.messenger.wallpaper;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.List;

public class WallpaperGiftBitmapDrawable extends BitmapDrawable {
    public final List patternPositions;

    public WallpaperGiftBitmapDrawable(Bitmap bitmap, List list) {
        super(bitmap);
        this.patternPositions = list;
    }

    public static BitmapDrawable create(Bitmap bitmap, List list) {
        if (bitmap == null) {
            return null;
        }
        if (list == null || list.isEmpty()) {
            return new BitmapDrawable(bitmap);
        }
        return new WallpaperGiftBitmapDrawable(bitmap, list);
    }
}
