package g7;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
public abstract class r7 {
    public static p0.c a(m.a1 a1Var) {
        int i9;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return new p0.c(d1.f.p(a1Var));
        }
        TextPaint textPaint = new TextPaint(a1Var.getPaint());
        boolean z10 = false;
        if (i11 >= 23) {
            i9 = 1;
            i10 = 1;
        } else {
            i9 = 0;
            i10 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i11 >= 23) {
            i9 = e0.b.c(a1Var);
            i10 = e0.b.g(a1Var);
        }
        if (a1Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i11 >= 28 && (a1Var.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(d1.f.h(androidx.emoji2.text.v.e(a1Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        } else {
            if (a1Var.getLayoutDirection() == 1) {
                z10 = true;
            }
            switch (a1Var.getTextDirection()) {
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
                    if (z10) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    break;
            }
        }
        return new p0.c(textPaint, textDirectionHeuristic, i9, i10);
    }

    public static void b(int i9, TextView textView) {
        int i10;
        if (i9 >= 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                d1.f.v(i9, textView);
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i10 = fontMetricsInt.top;
            } else {
                i10 = fontMetricsInt.ascent;
            }
            if (i9 > Math.abs(i10)) {
                textView.setPadding(textView.getPaddingLeft(), i9 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(int i9, TextView textView) {
        int i10;
        if (i9 >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i10 = fontMetricsInt.bottom;
            } else {
                i10 = fontMetricsInt.descent;
            }
            if (i9 > Math.abs(i10)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i9 - i10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        if ((callback instanceof u0.i) && Build.VERSION.SDK_INT >= 26) {
            return ((u0.i) callback).f47954a;
        }
        return callback;
    }

    public static ActionMode.Callback e(ActionMode.Callback callback, TextView textView) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && i9 <= 27 && !(callback instanceof u0.i) && callback != null) {
            return new u0.i(callback, textView);
        }
        return callback;
    }
}
