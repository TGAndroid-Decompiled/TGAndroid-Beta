package c8;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
public abstract class mc {
    public static p0.c a(m.a1 a1Var) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return new p0.c(d1.f.p(a1Var));
        }
        TextPaint textPaint = new TextPaint(a1Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = a1Var.getBreakStrategy();
        int hyphenationFrequency = a1Var.getHyphenationFrequency();
        if (a1Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z9 = true;
            if (i7 >= 28 && (a1Var.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(d1.f.h(androidx.emoji2.text.w.e(a1Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (a1Var.getLayoutDirection() != 1) {
                    z9 = false;
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
                        if (z9) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            }
        }
        return new p0.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void b(TextView textView, int i7) {
        int i10;
        if (i7 >= 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                d1.f.w(textView, i7);
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i10 = fontMetricsInt.top;
            } else {
                i10 = fontMetricsInt.ascent;
            }
            if (i7 > Math.abs(i10)) {
                textView.setPadding(textView.getPaddingLeft(), i7 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(TextView textView, int i7) {
        int i10;
        if (i7 >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i10 = fontMetricsInt.bottom;
            } else {
                i10 = fontMetricsInt.descent;
            }
            if (i7 > Math.abs(i10)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        if ((callback instanceof u0.i) && Build.VERSION.SDK_INT >= 26) {
            return ((u0.i) callback).f56175a;
        }
        return callback;
    }

    public static ActionMode.Callback e(ActionMode.Callback callback, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && i7 <= 27 && !(callback instanceof u0.i) && callback != null) {
            return new u0.i(callback, textView);
        }
        return callback;
    }
}
