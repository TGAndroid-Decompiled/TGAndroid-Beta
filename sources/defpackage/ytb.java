package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ytb extends FrameLayout implements tjb {
    public final be0 a;
    public final TextView b;
    public TLRPC.TL_forumTopic c;
    public boolean d;

    public ytb(Context context) {
        super(context);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        TextView textView = new TextView(context);
        this.b = textView;
        tb4.w(textView, bkb.F6, null, 1, 16.0f);
        if (k96.a0) {
            addView(be0Var, nme.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, nme.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
            return;
        }
        addView(be0Var, nme.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
        addView(textView, nme.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int L = gl.L(56.0f);
            if (k96.a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, bkb.j0);
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, bkb.j0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.c;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        String str = tL_forumTopic.title;
        TextView textView = this.b;
        if (isEmpty) {
            textView.setText(gl.A2(str));
        } else {
            textView.setText(gl.u1(gl.A2(str), tL_forumTopic.searchQuery, null));
        }
        be0 be0Var = this.a;
        mm4.q(be0Var, tL_forumTopic, false, false, null);
        if (be0Var != null && be0Var.getImageReceiver() != null && (be0Var.getImageReceiver().t() instanceof lm4)) {
            ((lm4) be0Var.getImageReceiver().t()).a(bkb.w0(null, bkb.b9, false));
        }
    }

    @Override
    public final void updateColors() {
        be0 be0Var = this.a;
        if (be0Var != null) {
            try {
                if (be0Var.getImageReceiver() != null && (be0Var.getImageReceiver().t() instanceof lm4)) {
                    ((lm4) be0Var.getImageReceiver().t()).a(bkb.w0(null, bkb.b9, false));
                    be0Var.invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
