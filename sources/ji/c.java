package ji;

import android.content.Context;
import android.graphics.Canvas;
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
public final class c extends FrameLayout implements c6 {
    public final h6 f17077a;
    public final k9 f17078b;
    public final TextView f17079c;
    public final TextView d;
    public final ImageView f17080e;

    public c(Context context, h6 h6Var) {
        super(context);
        this.f17077a = h6Var;
        k9 k9Var = new k9(context);
        this.f17078b = k9Var;
        k9Var.setRoundRadius(g0.L(9.0f));
        addView(k9Var, ha.d(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f17079c = textView;
        textView.setTypeface(g0.o());
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
        addView(linearLayout, ha.d(-1, -2.0f, 19, 67.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.f17080e = imageView;
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
        this.f17078b.e(chat, new v8(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f28300z6));
        hashSet.add(Integer.valueOf(m6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = m6.S0;
        k9 k9Var = this.f17078b;
        s.a(canvas, drawable, (k9Var.getWidth() / 2.0f) + k9Var.getLeft(), (k9Var.getHeight() / 2.0f) + k9Var.getTop(), k9Var.getHeight());
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(g0.L(60.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f17079c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = m6.f28300z6;
        h6 h6Var = this.f17077a;
        this.f17080e.setColorFilter(m6.w0(i7, h6Var));
        this.f17079c.setTextColor(m6.w0(m6.G6, h6Var));
        this.d.setTextColor(m6.w0(i7, h6Var));
    }
}
