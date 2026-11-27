package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.Components.FragmentContextView;
public final class sp4 extends d20 {
    public final byte E;
    public final Context F;
    public final FragmentContextView G;

    public sp4(FragmentContextView fragmentContextView, Context context, Context context2, byte b) {
        super(context);
        this.E = b;
        this.G = fragmentContextView;
        this.F = context2;
    }

    @Override
    public final TextView a() {
        byte b = this.E;
        FragmentContextView fragmentContextView = this.G;
        Context context = this.F;
        switch (b) {
            case 0:
                TextView textView = new TextView(context);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                vnb vnbVar = fragmentContextView.q0;
                int i = fragmentContextView.U;
                if (i != 0 && i != 2) {
                    if (i == 4) {
                        textView.setGravity(51);
                        yob.X(textView, aob.t7, vnbVar);
                        textView.setTypeface(hl.o());
                        textView.setTextSize(1, 15.0f);
                    } else if (i == 1 || i == 3) {
                        textView.setGravity(19);
                        yob.X(textView, aob.A7, vnbVar);
                        textView.setTypeface(hl.o());
                        textView.setTextSize(1, 14.0f);
                    }
                } else {
                    textView.setGravity(19);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextSize(1, 15.0f);
                }
                return textView;
            default:
                TextView textView2 = new TextView(context);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(3);
                textView2.setTextSize(1, 13.0f);
                yob.X(textView2, aob.x7, fragmentContextView.q0);
                return textView2;
        }
    }
}
