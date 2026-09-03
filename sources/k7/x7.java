package k7;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
public abstract class x7 {
    public static p0.c a(m.z0 z0Var) {
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            return new p0.c(d1.f.p(z0Var));
        }
        TextPaint textPaint = new TextPaint(z0Var.getPaint());
        boolean z4 = false;
        if (i12 >= 23) {
            i10 = 1;
            i11 = 1;
        } else {
            i10 = 0;
            i11 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i12 >= 23) {
            i10 = e0.b.c(z0Var);
            i11 = e0.b.g(z0Var);
        }
        if (z0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i12 >= 28 && (z0Var.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(d1.f.h(androidx.emoji2.text.x.e(z0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        } else {
            if (z0Var.getLayoutDirection() == 1) {
                z4 = true;
            }
            switch (z0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z4) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    break;
            }
        }
        return new p0.c(textPaint, textDirectionHeuristic, i10, i11);
    }

    public static void b(int i10, TextView textView) {
        int i11;
        if (i10 >= 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                d1.f.w(i10, textView);
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i11 = fontMetricsInt.top;
            } else {
                i11 = fontMetricsInt.ascent;
            }
            if (i10 > Math.abs(i11)) {
                textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(int i10, TextView textView) {
        int i11;
        if (i10 >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i11 = fontMetricsInt.bottom;
            } else {
                i11 = fontMetricsInt.descent;
            }
            if (i10 > Math.abs(i11)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        if ((callback instanceof u0.i) && Build.VERSION.SDK_INT >= 26) {
            return ((u0.i) callback).f48257a;
        }
        return callback;
    }

    public static ActionMode.Callback e(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27 && !(callback instanceof u0.i) && callback != null) {
            return new u0.i(callback, textView);
        }
        return callback;
    }
}
