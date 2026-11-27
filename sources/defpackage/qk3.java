package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import org.telegram.ui.PhotoViewer;
public final class qk3 implements ViewSwitcher.ViewFactory {
    public final byte a;
    public final Object b;

    public qk3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final View makeView() {
        int i;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                TextView textView = new TextView((Context) obj);
                yob.X(textView, aob.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setLineSpacing(hl.L(2.0f), 1.0f);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                textView2.setPadding(hl.L(16.0f), hl.L(12.0f), hl.L(16.0f), hl.L(12.0f));
                textView2.setTextSize(1, 16.0f);
                yob.X(textView2, aob.G6, null);
                yob.D(textView2, aob.H6, null);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                if (ob6.a0) {
                    i = 5;
                } else {
                    i = 3;
                }
                textView2.setGravity(i | 1);
                return textView2;
            case 2:
                TextView textView3 = new TextView((Context) obj);
                yob.X(textView3, aob.D6, null);
                textView3.setGravity(1);
                textView3.setLineSpacing(hl.L(2.0f), 1.0f);
                textView3.setTextSize(1, 15.0f);
                return textView3;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                return new vc8(photoViewer.F, photoViewer.U1, photoViewer.R, new ga8(photoViewer, (byte) 0), new ih6(photoViewer, (byte) 1));
        }
    }
}
