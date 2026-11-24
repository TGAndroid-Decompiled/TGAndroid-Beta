package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class nw {
    public TextPaint a;
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public final SparseArray g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray i = new SparseArray();
    public final SparseArray j = new SparseArray();
    public final SparseArray k = new SparseArray();
    public final SparseArray l = new SparseArray();
    public final SparseArray m = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseArray o = new SparseArray();
    public final SparseArray p = new SparseArray();
    public final SparseArray q = new SparseArray();
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseArray t = new SparseArray();
    public final SparseArray u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray w = new SparseArray();
    public final SparseArray x = new SparseArray();
    public final SparseArray y = new SparseArray();
    public final SparseArray z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(vg5 vg5Var, SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(bkb.w0(null, bkb.F6, false));
                } else {
                    textPaint.setColor(bkb.w0(null, bkb.I6, false));
                }
            }
        }
    }

    public static void b(int i, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        if ((i & 1) != 0) {
            if ((i & 2) != 0) {
                textPaint.setTypeface(typeface2);
            } else {
                textPaint.setTypeface(typeface3);
            }
        } else if ((i & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else if ((i & 4) != 0) {
        } else {
            textPaint.setTypeface(typeface);
        }
    }
}
