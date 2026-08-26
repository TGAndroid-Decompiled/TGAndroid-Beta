package org.telegram.messenger.utils;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public abstract class DrawableUtils {
    public static final Rect tmpRect = new Rect();

    static {
        new RectF();
    }

    public static void drawCommunityCardDrawable(Canvas canvas, Drawable drawable, float f, float f2, float f3) {
        float fDpf2 = f - AndroidUtilities.dpf2(36.0f);
        float fDpf3 = f2 - AndroidUtilities.dpf2(36.0f);
        float fDpf4 = f3 / AndroidUtilities.dpf2(72.0f);
        setBounds(drawable, AndroidUtilities.dpf2(9.66f) + fDpf2, AndroidUtilities.dpf2(4.66f) + fDpf3, 53);
        canvas.save();
        canvas.scale(fDpf4, fDpf4, f, f2);
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void drawWithScale(Canvas canvas, Drawable drawable, float f) {
        if (drawable == null || f == 0.0f) {
            return;
        }
        if (f == 1.0f) {
            drawable.draw(canvas);
            return;
        }
        canvas.save();
        canvas.scale(f, f, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void setBounds(Drawable drawable, float f, float f2, int i) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Rect rect = tmpRect;
        setBounds(rect, f, f2, intrinsicWidth, intrinsicHeight, i);
        drawable.setBounds(rect);
    }

    public static void setBounds(ImageReceiver imageReceiver, float f, float f2, int i, int i2) {
        if (imageReceiver != null) {
            Rect rect = tmpRect;
            setBounds(rect, f, f2, i, i2, 17);
            imageReceiver.setImageCoords(rect);
        }
    }

    public static void setBounds(Rect rect, float f, float f2, int i, int i2, int i3) {
        int iRound;
        int iRound2;
        int i4 = i3 & 7;
        if (i4 == 3) {
            iRound = Math.round(f);
        } else if (i4 != 5) {
            iRound = Math.round(f - (i / 2.0f));
        } else {
            iRound = Math.round(f - i);
        }
        int i5 = i3 & 112;
        if (i5 == 48) {
            iRound2 = Math.round(f2);
        } else if (i5 != 80) {
            iRound2 = Math.round(f2 - (i2 / 2.0f));
        } else {
            iRound2 = Math.round(f2 - i2);
        }
        rect.set(iRound, iRound2, i + iRound, i2 + iRound2);
    }
}
