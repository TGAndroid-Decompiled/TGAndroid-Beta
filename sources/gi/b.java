package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import w7.x5;
import yf.p;
public final class b extends FrameLayout implements y5 {
    public final d6 f10001a;
    public final w9 f10002b;
    public final TextView f10003c;
    public final TextView d;
    public final ImageView e;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f10001a = d6Var;
        w9 w9Var = new w9(context);
        this.f10002b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(7.3125f));
        addView(w9Var, x5.d(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f10003c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, x5.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, x5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, x5.d(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, x5.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        e();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        int i11;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f18083id);
        setTitle(DialogObject.getShortName(chat));
        if (chatFull != null) {
            i11 = chatFull.linked_peers.size();
        } else {
            i11 = 0;
        }
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", i11, new Object[0]));
        this.f10002b.e(chat, new h9(chat));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        Drawable drawable = h6.S0;
        w9 w9Var = this.f10002b;
        p.a(canvas, drawable, (w9Var.getWidth() / 2.0f) + w9Var.getLeft(), (w9Var.getHeight() / 2.0f) + w9Var.getTop(), w9Var.getHeight());
        super.dispatchDraw(canvas);
        d6 d6Var = this.f10001a;
        if (d6Var != null) {
            paint = d6Var.G("paintDivider");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = h6.f18910k0;
        }
        canvas.drawLine(AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
    }

    @Override
    public final void e() {
        int i10 = h6.f19189z6;
        d6 d6Var = this.f10001a;
        this.e.setColorFilter(h6.v0(i10, d6Var));
        this.f10003c.setTextColor(h6.v0(h6.G6, d6Var));
        this.d.setTextColor(h6.v0(i10, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10003c.setText(charSequence);
    }
}
