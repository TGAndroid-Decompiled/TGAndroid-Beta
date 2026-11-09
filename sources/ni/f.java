package ni;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import org.telegram.ui.ActionBar.l6;
public final class f extends CharacterStyle {
    public final int f20622a;

    public f(int i7) {
        this.f20622a = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7;
        HashMap hashMap = t.f20658b;
        int i10 = this.f20622a & 255;
        switch (i10) {
            case 8:
            case 18:
                i10 = 1;
                break;
            case 9:
            case 10:
            case 14:
            case 15:
                i10 = 3;
                break;
            case 11:
            case 13:
                i10 = 7;
                break;
            case 12:
            case 16:
            case 17:
            case 19:
                i10 = 4;
                break;
            case 20:
                i10 = 6;
                break;
            case 21:
                i10 = 2;
                break;
        }
        switch (i10) {
            case 1:
                i7 = l6.wl;
                break;
            case 2:
                i7 = l6.xl;
                break;
            case 3:
                i7 = l6.yl;
                break;
            case 4:
                i7 = l6.zl;
                break;
            case 5:
                i7 = l6.Al;
                break;
            case 6:
                i7 = l6.Bl;
                break;
            case 7:
                i7 = l6.Cl;
                break;
            default:
                i7 = -1;
                break;
        }
        if (i7 >= 0) {
            textPaint.setColor(l6.x0(null, i7, false));
        }
    }
}
