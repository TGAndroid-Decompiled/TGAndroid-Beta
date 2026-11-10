package ji;

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
import bg.s;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;
public final class b extends FrameLayout implements c6 {
    public final h6 f17073a;
    public final k9 f17074b;
    public final TextView f17075c;
    public final TextView d;
    public final ImageView f17076e;

    public b(Context context, h6 h6Var) {
        super(context);
        this.f17073a = h6Var;
        k9 k9Var = new k9(context);
        this.f17074b = k9Var;
        k9Var.setRoundRadius(g0.L(7.3125f));
        addView(k9Var, ha.d(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f17075c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ha.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, ha.d(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.f17076e = imageView;
        imageView.setImageResource(2131232189);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, ha.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i7, TLRPC.Chat chat) {
        int i10;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull N0 = qp.s1(i7).N0(chat.f26960id);
        setTitle(m5.u(chat));
        if (N0 != null) {
            i10 = N0.linked_peers.size();
        } else {
            i10 = 0;
        }
        setSubtitle(id.G(i10, "CommunityWithChats", new Object[0]));
        this.f17074b.e(chat, new v8(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f28300z6));
        hashSet.add(Integer.valueOf(m6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        Drawable drawable = m6.S0;
        k9 k9Var = this.f17074b;
        s.a(canvas, drawable, (k9Var.getWidth() / 2.0f) + k9Var.getLeft(), (k9Var.getHeight() / 2.0f) + k9Var.getTop(), k9Var.getHeight());
        super.dispatchDraw(canvas);
        h6 h6Var = this.f17073a;
        if (h6Var != null) {
            paint = h6Var.d("paintDivider");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = m6.f28013k0;
        }
        canvas.drawLine(g0.L(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(g0.L(56.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f17075c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = m6.f28300z6;
        h6 h6Var = this.f17073a;
        this.f17076e.setColorFilter(m6.w0(i7, h6Var));
        this.f17075c.setTextColor(m6.w0(m6.G6, h6Var));
        this.d.setTextColor(m6.w0(i7, h6Var));
    }
}
