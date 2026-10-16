package hi;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import w7.z5;
import zf.q;
public final class b extends FrameLayout implements x5 {
    public final c6 f10824a;
    public final z9 f10825b;
    public final TextView f10826c;
    public final TextView d;
    public final ImageView e;

    public b(Context context, c6 c6Var) {
        super(context);
        this.f10824a = c6Var;
        z9 z9Var = new z9(context);
        this.f10825b = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(7.3125f));
        addView(z9Var, z5.a(26.0f, 16.0f, 0.0f, 0.0f, 0.0f, 26, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f10826c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, z5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, z5.a(-2.0f, 58.0f, 0.0f, 48.0f, 1.0f, -1, 19));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, z5.a(24.0f, 0.0f, 0.0f, 11.0f, 0.0f, 24, 21));
        d();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        int i11;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f18916id);
        setTitle(DialogObject.getShortName(chat));
        if (chatFull != null) {
            i11 = chatFull.linked_peers.size();
        } else {
            i11 = 0;
        }
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", i11, new Object[0]));
        this.f10825b.e(chat, new k9(chat));
    }

    @Override
    public final void d() {
        int i10 = g6.f20005z6;
        c6 c6Var = this.f10824a;
        this.e.setColorFilter(g6.w0(i10, c6Var));
        this.f10826c.setTextColor(g6.w0(g6.G6, c6Var));
        this.d.setTextColor(g6.w0(i10, c6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        Drawable drawable = g6.S0;
        z9 z9Var = this.f10825b;
        q.a(canvas, drawable, (z9Var.getWidth() / 2.0f) + z9Var.getLeft(), (z9Var.getHeight() / 2.0f) + z9Var.getTop(), z9Var.getHeight());
        super.dispatchDraw(canvas);
        c6 c6Var = this.f10824a;
        if (c6Var != null) {
            paint = c6Var.F("paintDivider");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = g6.f19722k0;
        }
        canvas.drawLine(AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
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
        this.f10826c.setText(charSequence);
    }
}
