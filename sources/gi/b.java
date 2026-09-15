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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.u9;
import w7.x5;
import yf.p;
public final class b extends FrameLayout implements z5 {
    public final e6 f10014a;
    public final u9 f10015b;
    public final TextView f10016c;
    public final TextView d;
    public final ImageView e;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f10014a = e6Var;
        u9 u9Var = new u9(context);
        this.f10015b = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(7.3125f));
        addView(u9Var, x5.d(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f10016c = textView;
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
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f18112id);
        setTitle(DialogObject.getShortName(chat));
        if (chatFull != null) {
            i11 = chatFull.linked_peers.size();
        } else {
            i11 = 0;
        }
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", i11, new Object[0]));
        this.f10015b.e(chat, new f9(chat));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        Drawable drawable = i6.S0;
        u9 u9Var = this.f10015b;
        p.a(canvas, drawable, (u9Var.getWidth() / 2.0f) + u9Var.getLeft(), (u9Var.getHeight() / 2.0f) + u9Var.getTop(), u9Var.getHeight());
        super.dispatchDraw(canvas);
        e6 e6Var = this.f10014a;
        if (e6Var != null) {
            paint = e6Var.G("paintDivider");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = i6.f18958k0;
        }
        canvas.drawLine(AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
    }

    @Override
    public final void e() {
        int i10 = i6.f19237z6;
        e6 e6Var = this.f10014a;
        this.e.setColorFilter(i6.v0(i10, e6Var));
        this.f10016c.setTextColor(i6.v0(i6.G6, e6Var));
        this.d.setTextColor(i6.v0(i10, e6Var));
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
        this.f10016c.setText(charSequence);
    }
}
