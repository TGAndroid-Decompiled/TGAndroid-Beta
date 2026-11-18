package mi;

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
import bg.t;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;
public final class b extends FrameLayout implements c6 {
    public final i6 f21011a;
    public final q9 f21012b;
    public final TextView f21013c;
    public final TextView d;
    public final ImageView f21014e;

    public b(Context context, i6 i6Var) {
        super(context);
        this.f21011a = i6Var;
        q9 q9Var = new q9(context);
        this.f21012b = q9Var;
        q9Var.setRoundRadius(g0.L(7.3125f));
        addView(q9Var, ma.d(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f21013c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, ma.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ma.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, ma.d(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.f21014e = imageView;
        imageView.setImageResource(2131232191);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, ma.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i7, TLRPC.Chat chat) {
        int i10;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull P0 = mp.u1(i7).P0(chat.f28405id);
        setTitle(n5.u(chat));
        if (P0 != null) {
            i10 = P0.linked_peers.size();
        } else {
            i10 = 0;
        }
        setSubtitle(gd.G(i10, "CommunityWithChats", new Object[0]));
        this.f21012b.f(chat, new b9(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.f29807z6));
        hashSet.add(Integer.valueOf(n6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        Drawable drawable = n6.S0;
        q9 q9Var = this.f21012b;
        t.a(canvas, drawable, (q9Var.getWidth() / 2.0f) + q9Var.getLeft(), (q9Var.getHeight() / 2.0f) + q9Var.getTop(), q9Var.getHeight());
        super.dispatchDraw(canvas);
        i6 i6Var = this.f21011a;
        if (i6Var != null) {
            paint = i6Var.g("paintDivider");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = n6.f29519k0;
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
        this.f21013c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = n6.f29807z6;
        i6 i6Var = this.f21011a;
        this.f21014e.setColorFilter(n6.w0(i7, i6Var));
        this.f21013c.setTextColor(n6.w0(n6.G6, i6Var));
        this.d.setTextColor(n6.w0(i7, i6Var));
    }
}
