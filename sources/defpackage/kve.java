package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
public abstract class kve {
    public static zf8 a(sq sqVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new zf8(fo.r(sqVar));
        }
        TextPaint textPaint = new TextPaint(sqVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = sqVar.getBreakStrategy();
        int hyphenationFrequency = sqVar.getHyphenationFrequency();
        if (sqVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z = true;
            if (i >= 28 && (sqVar.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(fo.h(kh0.h(sqVar.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (sqVar.getLayoutDirection() != 1) {
                    z = false;
                }
                switch (sqVar.getTextDirection()) {
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
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            }
        }
        return new zf8(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void b(TextView textView, int i) {
        int i2;
        if (i >= 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                fo.y(textView, i);
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.top;
            } else {
                i2 = fontMetricsInt.ascent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
                return;
            }
            return;
        }
        sc8.e();
    }

    public static void c(TextView textView, int i) {
        int i2;
        if (i >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.bottom;
            } else {
                i2 = fontMetricsInt.descent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
                return;
            }
            return;
        }
        sc8.e();
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        if ((callback instanceof yib) && Build.VERSION.SDK_INT >= 26) {
            return ((yib) callback).a;
        }
        return callback;
    }

    public static ActionMode.Callback e(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof yib) && callback != null) {
            return new yib(callback, textView);
        }
        return callback;
    }
}
