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
public final class zn2 extends FrameLayout implements snb {
    public final vnb a;
    public final de0 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public zn2(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(7.3125f));
        addView(de0Var, tre.d(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, tre.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, tre.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, tre.d(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(2131232194);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i, TLRPC.Chat chat) {
        int i2;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull N0 = uc7.s1(i).N0(chat.id);
        setTitle(wf3.t(chat));
        if (N0 != null) {
            i2 = N0.linked_peers.size();
        } else {
            i2 = 0;
        }
        setSubtitle(ob6.G(i2, "CommunityWithChats", new Object[0]));
        this.b.f(chat, new rb0(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        Drawable drawable = aob.R0;
        de0 de0Var = this.b;
        br3.a(canvas, drawable, (de0Var.getWidth() / 2.0f) + de0Var.getLeft(), (de0Var.getHeight() / 2.0f) + de0Var.getTop(), de0Var.getHeight());
        super.dispatchDraw(canvas);
        vnb vnbVar = this.a;
        if (vnbVar != null) {
            paint = vnbVar.d("paintDivider");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = aob.j0;
        }
        canvas.drawLine(hl.L(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i = aob.z6;
        vnb vnbVar = this.a;
        this.e.setColorFilter(aob.v0(i, vnbVar));
        this.c.setTextColor(aob.v0(aob.G6, vnbVar));
        this.d.setTextColor(aob.v0(i, vnbVar));
    }
}
