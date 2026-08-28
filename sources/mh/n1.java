package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import g7.i6;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RadioButton;
public final class n1 extends FrameLayout {
    public final String f17993a;
    public final RadioButton f17994b;
    public final boolean f17995c;

    public n1(o1 o1Var, boolean z10, Context context) {
        super(context);
        this.f17993a = o1Var.f18012a;
        RadioButton radioButton = new RadioButton(context);
        this.f17994b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(f6.w0(null, f6.D5, false), f6.w0(null, f6.E5, false));
        addView(radioButton, e6.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = i6.b(context, 16.0f, f6.G6, true, null);
        b10.setText(o1Var.f18014c);
        addView(b10, e6.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = i6.b(context, 14.0f, f6.f23369y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(o1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(o1Var.d / 1000)))));
        addView(b11, e6.t(-1, -2, 7, 62, 32, 8, 0));
        this.f17995c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f17995c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, f6.f23121k0);
        }
    }
}
