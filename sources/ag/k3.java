package ag;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b6;
public final class k3 extends LinearLayout implements k6 {
    public final int f614a = 0;
    public final p6 f615b;
    public final TextView f616c;
    public final View d;
    public final TextView e;

    public k3(Activity activity, int i10, long j10, String str, p6 p6Var) {
        super(activity);
        setOrientation(1);
        this.f615b = p6Var;
        TextView textView = new TextView(activity);
        this.f616c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextAlignment(4);
        textView.setLineSpacing(org.telegram.messenger.i0.L(1.66f), 1.0f);
        textView.setGravity(17);
        j3 j3Var = new j3(activity, 0);
        this.d = j3Var;
        j3Var.setTextAlignment(4);
        j3Var.setGravity(17);
        j3Var.setTextSize(1, 12.0f);
        j3Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        j3Var.setGravity(1);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        j3Var.setMaxWidth(org.telegram.messenger.i0.L(160.0f));
        int i11 = 22;
        if (i10 == 9) {
            imageView.setImageResource(2131231607);
            textView.setText(cd.L0(2131742922, null));
            j3Var.setText(cd.L0(2131742923, null));
            j3Var.setMaxWidth(Math.min(org.telegram.messenger.i0.L(160.0f), vh.p2.a(j3Var.getText(), j3Var.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231607);
            textView.setText(cd.L0(2131752765, null));
            j3Var.setText(cd.L0(2131752766, null));
            j3Var.setMaxWidth(Math.min(org.telegram.messenger.i0.L(160.0f), vh.p2.a(j3Var.getText(), j3Var.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231604);
            textView.setText(cd.L0(2131752833, null));
            j3Var.setText(cd.L0(2131752834, null));
            j3Var.setMaxWidth(Math.min(org.telegram.messenger.i0.L(160.0f), vh.p2.a(j3Var.getText(), j3Var.getPaint())));
        } else {
            if (i10 == 5) {
                imageView.setImageResource(2131231615);
                h3 c10 = i3.f(d20.f15147s0).c(j10);
                String str2 = c10 == null ? str : c10.f552b;
                textView.setText(cd.L0(2131752667, null));
                j3Var.setMaxWidth(org.telegram.messenger.i0.L(208.0f));
                j3Var.setTextAlignment(2);
                j3Var.setGravity(3);
                j3Var.setText(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131752669, str2)));
                j3Var.setPadding(org.telegram.messenger.i0.L(28.0f), 0, 0, 0);
                j3 j3Var2 = new j3(activity, 0);
                this.e = j3Var2;
                j3Var2.setMaxWidth(org.telegram.messenger.i0.L(208.0f));
                j3Var2.setTextAlignment(2);
                j3Var2.setGravity(3);
                j3Var2.setTextSize(1, 13.0f);
                j3Var2.setText(org.telegram.messenger.i0.W2(cd.L0(2131752668, null)));
                j3Var2.setPadding(org.telegram.messenger.i0.L(28.0f), 0, 0, 0);
            }
            i11 = 12;
        }
        int i12 = i11;
        addView(imageView, b6.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, b6.t(-2, -2, 49, 20, 0, 20, 6));
        addView(j3Var, b6.t(-2, -2, 49, i12, 0, i12, ((j3) this.e) == null ? 19 : 9));
        View view = (j3) this.e;
        if (view != null) {
            addView(view, b6.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.f614a) {
            case 0:
                return;
            default:
                hashSet.add(Integer.valueOf(t6.G6));
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f614a) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.f614a) {
            case 0:
                j3 j3Var = (j3) this.d;
                TextView textView = this.f616c;
                if (textView != null && j3Var != null) {
                    int i10 = t6.Wc;
                    p6 p6Var = this.f615b;
                    textView.setTextColor(t6.w0(i10, p6Var));
                    j3Var.setTextColor(t6.w0(i10, p6Var));
                    j3 j3Var2 = (j3) this.e;
                    if (j3Var2 != null) {
                        j3Var2.setTextColor(t6.w0(i10, p6Var));
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = t6.G6;
                p6 p6Var2 = this.f615b;
                ((ImageView) this.d).setColorFilter(new PorterDuffColorFilter(t6.w0(i11, p6Var2), PorterDuff.Mode.SRC_IN));
                this.f616c.setTextColor(t6.w0(i11, p6Var2));
                this.e.setTextColor(t6.r1(0.75f, t6.w0(i11, p6Var2)));
                return;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public k3(Context context, bi.p0 p0Var, p6 p6Var) {
        super(context);
        this.f615b = p6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, b6.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f616c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, b6.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), b6.p(0, -2, 1.0f, 119));
        addView(textView2, b6.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(p0Var.f3272a);
        textView.setText(p0Var.f3273b);
        textView2.setText((CharSequence) p0Var.f3274c.get(0));
        updateColors();
    }
}
