package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.d6;
import h7.z5;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadioButton;

public final class m1 extends FrameLayout {

    public final String f18810a;

    public final RadioButton f18811b;

    public final boolean f18812c;

    public m1(n1 n1Var, boolean z10, Context context) {
        super(context);
        this.f18810a = n1Var.f18832a;
        RadioButton radioButton = new RadioButton(context);
        this.f18811b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(g6.w0(null, g6.D5, false), g6.w0(null, g6.E5, false));
        addView(radioButton, z5.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView textViewB = d6.b(context, 16.0f, g6.G6, true, null);
        textViewB.setText(n1Var.f18834c);
        addView(textViewB, z5.t(-1, -2, 7, 62, 9, 8, 0));
        TextView textViewB2 = d6.b(context, 14.0f, g6.f23423y6, false, null);
        textViewB2.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(n1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(n1Var.d / 1000)))));
        addView(textViewB2, z5.t(-1, -2, 7, 62, 32, 8, 0));
        this.f18812c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f18812c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, g6.f23175k0);
        }
    }
}
