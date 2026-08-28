package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
public abstract class o0 extends LinearLayout implements xg.a, td.i {
    public final b6 f18002a;
    public final FrameLayout f18003b;
    public TLRPC.TL_replyKeyboardMarkup f18004c;
    public l0 d;
    public int f18005e;
    public boolean f18006f;
    public int h;
    public final ArrayList f18007n;
    public final ScrollView f18008r;
    public int f18009s;
    public final GradientDrawable v;
    public int f18010w;
    public final td.j f18011x;

    public o0(Context context, b6 b6Var) {
        super(context);
        this.f18007n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f18011x = new td.j(this, gr.h, 320L);
        this.f18002a = b6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f18008r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18003b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void a(int i9) {
        if (this.f18009s == i9) {
            return;
        }
        this.f18009s = i9;
        ScrollView scrollView = this.f18008r;
        if (scrollView.getPaddingBottom() != i9) {
            scrollView.setPadding(0, 0, 0, i9);
        }
        invalidate();
    }

    @Override
    public final void c(td.j jVar) {
        Iterator it = this.f18011x.iterator();
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f47783a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((n0) obj).setAlpha(c10);
            ((n0) obj).setScaleX(lerp);
            ((n0) obj).setScaleY(lerp);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f18009s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = f6.l1(navigationBarThirdButtonsFactor, f6.v0(f6.He, this.f18002a));
            int i9 = this.f18010w;
            GradientDrawable gradientDrawable = this.v;
            if (i9 != l1) {
                gradientDrawable.setColors(new int[]{l1, f6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.f18010w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f18009s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f18008r, f6.v0(f6.He, this.f18002a));
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f18007n;
            if (i9 < arrayList.size()) {
                ((m0) arrayList.get(i9)).a();
                i9++;
            } else {
                invalidate();
                return;
            }
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f18004c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f18006f) {
            return this.f18005e;
        }
        return org.telegram.messenger.l0.D(4.0f, this.f18004c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: mh.o0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(l0 l0Var) {
        this.d = l0Var;
    }

    public void setPanelHeight(int i9) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.f18005e = i9;
        if (this.f18006f && (tL_replyKeyboardMarkup = this.f18004c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f18006f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (ll.A(4.0f, this.f18004c.rows.size() - 1, this.f18005e - AndroidUtilities.dp(16.0f)) / this.f18004c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f18011x.iterator();
            while (it.hasNext()) {
                td.e eVar = (td.e) it.next();
                int childCount = ((n0) eVar.f47783a).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ((n0) eVar.f47783a).getChildAt(i10);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.height != dp) {
                        layoutParams.height = dp;
                        childAt.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    @Override
    public final void b() {
    }

    @Override
    public final void d(float f10) {
    }
}
