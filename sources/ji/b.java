package ji;

import ag.v;
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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
public final class b extends FrameLayout implements p6 {
    public final u6 f15972a;
    public final y9 f15973b;
    public final TextView f15974c;
    public final TextView d;
    public final ImageView e;

    public b(Context context, u6 u6Var) {
        super(context);
        this.f15972a = u6Var;
        y9 y9Var = new y9(context);
        this.f15973b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(7.3125f));
        addView(y9Var, gb1.h(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f15974c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, gb1.r(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, gb1.o(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, gb1.h(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        int i11;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f22027id);
        setTitle(DialogObject.getShortName(chat));
        if (chatFull != null) {
            i11 = chatFull.linked_peers.size();
        } else {
            i11 = 0;
        }
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", i11, new Object[0]));
        this.f15973b.f(chat, new j9(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.f23765z6));
        hashSet.add(Integer.valueOf(y6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        Drawable drawable = y6.S0;
        y9 y9Var = this.f15973b;
        v.a(canvas, drawable, (y9Var.getWidth() / 2.0f) + y9Var.getLeft(), (y9Var.getHeight() / 2.0f) + y9Var.getTop(), y9Var.getHeight());
        super.dispatchDraw(canvas);
        u6 u6Var = this.f15972a;
        if (u6Var != null) {
            paint = u6Var.d("paintDivider");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = y6.f23476k0;
        }
        canvas.drawLine(AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f15974c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i10 = y6.f23765z6;
        u6 u6Var = this.f15972a;
        this.e.setColorFilter(y6.w0(i10, u6Var));
        this.f15974c.setTextColor(y6.w0(y6.G6, u6Var));
        this.d.setTextColor(y6.w0(i10, u6Var));
    }
}
