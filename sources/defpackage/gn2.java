package defpackage;

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
import org.telegram.tgnet.TLRPC;
public final class gn2 extends FrameLayout implements tjb {
    public final wjb a;
    public final be0 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public gn2(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(7.3125f));
        addView(be0Var, nme.d(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, nme.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, nme.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, nme.d(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(2131232194);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i, TLRPC.Chat chat) {
        int i2;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull L0 = na7.q1(i).L0(chat.id);
        setTitle(cf3.t(chat));
        if (L0 != null) {
            i2 = L0.linked_peers.size();
        } else {
            i2 = 0;
        }
        setSubtitle(k96.G(i2, "CommunityWithChats", new Object[0]));
        this.b.f(chat, new pb0(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        Drawable drawable = bkb.R0;
        be0 be0Var = this.b;
        kq3.a(canvas, drawable, (be0Var.getWidth() / 2.0f) + be0Var.getLeft(), (be0Var.getHeight() / 2.0f) + be0Var.getTop(), be0Var.getHeight());
        super.dispatchDraw(canvas);
        wjb wjbVar = this.a;
        if (wjbVar != null) {
            paint = wjbVar.d("paintDivider");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = bkb.j0;
        }
        canvas.drawLine(gl.L(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i = bkb.y6;
        wjb wjbVar = this.a;
        this.e.setColorFilter(bkb.v0(i, wjbVar));
        this.c.setTextColor(bkb.v0(bkb.F6, wjbVar));
        this.d.setTextColor(bkb.v0(i, wjbVar));
    }
}
