package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import c8.ja;
import di.tb;
import hi.l3;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
public final class w1 extends LinearLayout implements z5 {
    public final int f18133a = 0;
    public final e6 f18134b;
    public final TextView f18135c;
    public final View d;
    public final TextView f18136e;

    public w1(Activity activity, int i7, long j3, String str, e6 e6Var) {
        super(activity);
        setOrientation(1);
        this.f18134b = e6Var;
        TextView textView = new TextView(activity);
        this.f18135c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.66f), 1.0f);
        textView.setGravity(17);
        tb tbVar = new tb(activity, 2);
        this.d = tbVar;
        tbVar.setTextAlignment(4);
        tbVar.setGravity(17);
        tbVar.setTextSize(1, 12.0f);
        tbVar.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        tbVar.setGravity(1);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        tbVar.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
        int i10 = 22;
        if (i7 == 9) {
            imageView.setImageResource(2131231606);
            textView.setText(hd.M0(2131742896, null));
            tbVar.setText(hd.M0(2131742897, null));
            tbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(tbVar.getText(), tbVar.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231606);
            textView.setText(hd.M0(2131752765, null));
            tbVar.setText(hd.M0(2131752766, null));
            tbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(tbVar.getText(), tbVar.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231603);
            textView.setText(hd.M0(2131752833, null));
            tbVar.setText(hd.M0(2131752834, null));
            tbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(tbVar.getText(), tbVar.getPaint())));
        } else {
            if (i7 == 5) {
                imageView.setImageResource(2131231614);
                u1 c10 = v1.f(m10.f24940t0).c(j3);
                String str2 = c10 == null ? str : c10.f18114b;
                textView.setText(hd.M0(2131752667, null));
                tbVar.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                tbVar.setTextAlignment(2);
                tbVar.setGravity(3);
                tbVar.setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752669, str2)));
                tbVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
                tb tbVar2 = new tb(activity, 2);
                this.f18136e = tbVar2;
                tbVar2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                tbVar2.setTextAlignment(2);
                tbVar2.setGravity(3);
                tbVar2.setTextSize(1, 13.0f);
                tbVar2.setText(org.telegram.messenger.g0.X2(hd.M0(2131752668, null)));
                tbVar2.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
            }
            i10 = 12;
        }
        int i11 = i10;
        addView(imageView, ja.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, ja.t(-2, -2, 49, 20, 0, 20, 6));
        addView(tbVar, ja.t(-2, -2, 49, i11, 0, i11, ((tb) this.f18136e) == null ? 19 : 9));
        View view = (tb) this.f18136e;
        if (view != null) {
            addView(view, ja.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.f18133a) {
            case 0:
                return;
            default:
                hashSet.add(Integer.valueOf(j6.G6));
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f18133a) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.f18133a) {
            case 0:
                tb tbVar = (tb) this.d;
                TextView textView = this.f18135c;
                if (textView != null && tbVar != null) {
                    int i7 = j6.Zc;
                    e6 e6Var = this.f18134b;
                    textView.setTextColor(j6.w0(i7, e6Var));
                    tbVar.setTextColor(j6.w0(i7, e6Var));
                    tb tbVar2 = (tb) this.f18136e;
                    if (tbVar2 != null) {
                        tbVar2.setTextColor(j6.w0(i7, e6Var));
                        return;
                    }
                    return;
                }
                return;
            default:
                int i10 = j6.G6;
                e6 e6Var2 = this.f18134b;
                ((ImageView) this.d).setColorFilter(new PorterDuffColorFilter(j6.w0(i10, e6Var2), PorterDuff.Mode.SRC_IN));
                this.f18135c.setTextColor(j6.w0(i10, e6Var2));
                this.f18136e.setTextColor(j6.r1(0.75f, j6.w0(i10, e6Var2)));
                return;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public w1(Context context, oi.j0 j0Var, e6 e6Var) {
        super(context);
        this.f18134b = e6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, ja.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f18135c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.f18136e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, ja.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), ja.p(0, -2, 1.0f, 119));
        addView(textView2, ja.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(j0Var.f21747a);
        textView.setText(j0Var.f21748b);
        textView2.setText((CharSequence) j0Var.f21749c.get(0));
        updateColors();
    }
}
