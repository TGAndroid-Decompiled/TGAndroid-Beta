package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class zxb extends FrameLayout implements snb {
    public final de0 a;
    public final TextView b;
    public TLRPC.TL_forumTopic c;
    public boolean d;

    public zxb(Context context) {
        super(context);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        TextView textView = new TextView(context);
        this.b = textView;
        qd4.w(textView, aob.G6, null, 1, 16.0f);
        if (ob6.a0) {
            addView(de0Var, tre.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, tre.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
            return;
        }
        addView(de0Var, tre.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
        addView(textView, tre.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int L = hl.L(56.0f);
            if (ob6.a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, aob.j0);
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, aob.j0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.c;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        String str = tL_forumTopic.title;
        TextView textView = this.b;
        if (isEmpty) {
            textView.setText(hl.A2(str));
        } else {
            textView.setText(hl.u1(hl.A2(str), tL_forumTopic.searchQuery, null));
        }
        de0 de0Var = this.a;
        ro4.q(de0Var, tL_forumTopic, false, false, null);
        if (de0Var != null && de0Var.getImageReceiver() != null && (de0Var.getImageReceiver().t() instanceof qo4)) {
            ((qo4) de0Var.getImageReceiver().t()).a(aob.w0(null, aob.c9, false));
        }
    }

    @Override
    public final void updateColors() {
        de0 de0Var = this.a;
        if (de0Var != null) {
            try {
                if (de0Var.getImageReceiver() != null && (de0Var.getImageReceiver().t() instanceof qo4)) {
                    ((qo4) de0Var.getImageReceiver().t()).a(aob.w0(null, aob.c9, false));
                    de0Var.invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
