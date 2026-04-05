package org.telegram.messenger.utils;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public abstract class DrawableUtils {
    private static final Rect tmpRect = new Rect();
    private static final RectF tmpRectF = new RectF();

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

    public static void setBoundsIncreasePadding(Drawable drawable, Rect rect) {
        Rect rect2 = tmpRect;
        if (drawable.getPadding(rect2)) {
            drawable.setBounds(rect.left - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        } else {
            drawable.setBounds(rect);
        }
    }

    public static void setBounds(Drawable drawable, float f, float f2, int i) {
        if (drawable == null) {
            return;
        }
        setBounds(drawable, f, f2, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), i);
    }

    public static void setBounds(Drawable drawable, float f, float f2, int i, int i2, int i3) {
        int iRound;
        int iRound2;
        if (drawable == null) {
            return;
        }
        int i4 = i3 & 7;
        if (i4 == 3) {
            iRound = Math.round(f);
        } else if (i4 == 5) {
            iRound = Math.round(f - i);
        } else {
            iRound = Math.round(f - (i / 2.0f));
        }
        int i5 = i3 & 112;
        if (i5 == 48) {
            iRound2 = Math.round(f2);
        } else if (i5 == 80) {
            iRound2 = Math.round(f2 - i2);
        } else {
            iRound2 = Math.round(f2 - (i2 / 2.0f));
        }
        drawable.setBounds(iRound, iRound2, i + iRound, i2 + iRound2);
    }
}
