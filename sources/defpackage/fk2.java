package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.HashMap;
public final class fk2 extends CharacterStyle {
    public final int a;

    public fk2(int i) {
        this.a = i;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i;
        HashMap hashMap = xm8.b;
        int i2 = this.a & 255;
        switch (i2) {
            case 8:
            case 18:
                i2 = 1;
                break;
            case 9:
            case 10:
            case 14:
            case 15:
                i2 = 3;
                break;
            case 11:
            case 13:
                i2 = 7;
                break;
            case 12:
            case 16:
            case 17:
            case 19:
                i2 = 4;
                break;
            case 20:
                i2 = 6;
                break;
            case 21:
                i2 = 2;
                break;
        }
        switch (i2) {
            case 1:
                i = aob.zl;
                break;
            case 2:
                i = aob.Al;
                break;
            case 3:
                i = aob.Bl;
                break;
            case 4:
                i = aob.Cl;
                break;
            case 5:
                i = aob.Dl;
                break;
            case 6:
                i = aob.El;
                break;
            case 7:
                i = aob.Fl;
                break;
            default:
                i = -1;
                break;
        }
        if (i >= 0) {
            textPaint.setColor(aob.w0(null, i, false));
        }
    }
}
