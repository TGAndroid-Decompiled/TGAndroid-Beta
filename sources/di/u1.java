package di;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.RadioButton;
import w7.a6;
import w7.e6;
public final class u1 extends FrameLayout {
    public final String f6938a;
    public final RadioButton f6939b;
    public final boolean f6940c;

    public u1(v1 v1Var, boolean z10, Context context) {
        super(context);
        this.f6938a = v1Var.f6957a;
        RadioButton radioButton = new RadioButton(context);
        this.f6939b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(j6.w0(null, j6.D5, false), j6.w0(null, j6.E5, false));
        addView(radioButton, a6.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = e6.b(context, 16.0f, j6.G6, true, null);
        b10.setText(v1Var.f6959c);
        addView(b10, a6.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = e6.b(context, 14.0f, j6.f18306y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(v1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(v1Var.d / 1000)))));
        addView(b11, a6.t(-1, -2, 7, 62, 32, 8, 0));
        this.f6940c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f6940c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, j6.f18049k0);
        }
    }
}
