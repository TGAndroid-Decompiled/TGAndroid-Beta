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
import bi.md;
import c8.ha;
import fi.m3;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
public final class u1 extends LinearLayout implements b6 {
    public final int f17556a = 0;
    public final g6 f17557b;
    public final TextView f17558c;
    public final View d;
    public final TextView f17559e;

    public u1(Activity activity, int i7, long j3, String str, g6 g6Var) {
        super(activity);
        setOrientation(1);
        this.f17557b = g6Var;
        TextView textView = new TextView(activity);
        this.f17558c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.66f), 1.0f);
        textView.setGravity(17);
        md mdVar = new md(activity, 4);
        this.d = mdVar;
        mdVar.setTextAlignment(4);
        mdVar.setGravity(17);
        mdVar.setTextSize(1, 12.0f);
        mdVar.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        mdVar.setGravity(1);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        mdVar.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
        int i10 = 22;
        if (i7 == 9) {
            imageView.setImageResource(2131231606);
            textView.setText(id.M0(2131742896, null));
            mdVar.setText(id.M0(2131742897, null));
            mdVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), m3.a(mdVar.getText(), mdVar.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231606);
            textView.setText(id.M0(2131752765, null));
            mdVar.setText(id.M0(2131752766, null));
            mdVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), m3.a(mdVar.getText(), mdVar.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231603);
            textView.setText(id.M0(2131752833, null));
            mdVar.setText(id.M0(2131752834, null));
            mdVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), m3.a(mdVar.getText(), mdVar.getPaint())));
        } else {
            if (i7 == 5) {
                imageView.setImageResource(2131231614);
                s1 c10 = t1.f(p10.f24470s0).c(j3);
                String str2 = c10 == null ? str : c10.f17533b;
                textView.setText(id.M0(2131752667, null));
                mdVar.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                mdVar.setTextAlignment(2);
                mdVar.setGravity(3);
                mdVar.setText(org.telegram.messenger.g0.X2(id.a0(null, null, 2131752669, str2)));
                mdVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
                md mdVar2 = new md(activity, 4);
                this.f17559e = mdVar2;
                mdVar2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                mdVar2.setTextAlignment(2);
                mdVar2.setGravity(3);
                mdVar2.setTextSize(1, 13.0f);
                mdVar2.setText(org.telegram.messenger.g0.X2(id.M0(2131752668, null)));
                mdVar2.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
            }
            i10 = 12;
        }
        int i11 = i10;
        addView(imageView, ha.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, ha.t(-2, -2, 49, 20, 0, 20, 6));
        addView(mdVar, ha.t(-2, -2, 49, i11, 0, i11, ((md) this.f17559e) == null ? 19 : 9));
        View view = (md) this.f17559e;
        if (view != null) {
            addView(view, ha.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.f17556a) {
            case 0:
                return;
            default:
                hashSet.add(Integer.valueOf(l6.G6));
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f17556a) {
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
        switch (this.f17556a) {
            case 0:
                md mdVar = (md) this.d;
                TextView textView = this.f17558c;
                if (textView != null && mdVar != null) {
                    int i7 = l6.Wc;
                    g6 g6Var = this.f17557b;
                    textView.setTextColor(l6.w0(i7, g6Var));
                    mdVar.setTextColor(l6.w0(i7, g6Var));
                    md mdVar2 = (md) this.f17559e;
                    if (mdVar2 != null) {
                        mdVar2.setTextColor(l6.w0(i7, g6Var));
                        return;
                    }
                    return;
                }
                return;
            default:
                int i10 = l6.G6;
                g6 g6Var2 = this.f17557b;
                ((ImageView) this.d).setColorFilter(new PorterDuffColorFilter(l6.w0(i10, g6Var2), PorterDuff.Mode.SRC_IN));
                this.f17558c.setTextColor(l6.w0(i10, g6Var2));
                this.f17559e.setTextColor(l6.r1(0.75f, l6.w0(i10, g6Var2)));
                return;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public u1(Context context, li.l0 l0Var, g6 g6Var) {
        super(context);
        this.f17557b = g6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, ha.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f17558c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.f17559e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, ha.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), ha.p(0, -2, 1.0f, 119));
        addView(textView2, ha.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(l0Var.f18679a);
        textView.setText(l0Var.f18680b);
        textView2.setText((CharSequence) l0Var.f18681c.get(0));
        updateColors();
    }
}
