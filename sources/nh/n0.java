package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import h7.b6;
import h7.z5;
import java.util.ArrayList;
import java.util.Iterator;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;

public abstract class n0 extends LinearLayout implements yg.a, ud.i {

    public final c6 f18822a;

    public final FrameLayout f18823b;

    public TLRPC.TL_replyKeyboardMarkup f18824c;
    public k0 d;

    public int f18825e;

    public boolean f18826f;
    public int h;

    public final ArrayList f18827n;

    public final ScrollView f18828r;

    public int f18829s;
    public final GradientDrawable v;

    public int f18830w;

    public final ud.j f18831x;

    public n0(Context context, c6 c6Var) {
        super(context);
        this.f18827n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f18831x = new ud.j(this, er.h, 320L);
        this.f18822a = c6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f18828r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18823b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void a(int i10) {
        if (this.f18829s == i10) {
            return;
        }
        this.f18829s = i10;
        ScrollView scrollView = this.f18828r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override
    public final void c(ud.j jVar) {
        for (ud.e eVar : this.f18831x) {
            float fC = eVar.c();
            Object obj = eVar.f48505a;
            float fLerp = AndroidUtilities.lerp(0.7f, 1.0f, fC);
            ((m0) obj).setAlpha(fC);
            ((m0) obj).setScaleX(fLerp);
            ((m0) obj).setScaleY(fLerp);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f18829s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int iL1 = g6.l1(navigationBarThirdButtonsFactor, g6.v0(g6.He, this.f18822a));
            int i10 = this.f18830w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != iL1) {
                gradientDrawable.setColors(new int[]{iL1, g6.l1(0.66f, iL1), i0.b.k(iL1, 0)});
                this.f18830w = iL1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f18829s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f18828r, g6.v0(g6.He, this.f18822a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f18827n;
            if (i10 >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((l0) arrayList.get(i10)).a();
                i10++;
            }
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f18824c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f18826f) {
            return this.f18825e;
        }
        return org.telegram.messenger.y1.D(4.0f, this.f18824c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup) {
        int objectSize;
        int objectSize2;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup2 = this.f18824c;
        if (tL_replyKeyboardMarkup == tL_replyKeyboardMarkup2) {
            return;
        }
        if (tL_replyKeyboardMarkup != null && tL_replyKeyboardMarkup2 != null && (objectSize = tL_replyKeyboardMarkup.getObjectSize()) == (objectSize2 = tL_replyKeyboardMarkup2.getObjectSize())) {
            try {
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
                tL_replyKeyboardMarkup.serializeToStream(nativeByteBuffer);
                nativeByteBuffer.rewind();
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(objectSize2);
                tL_replyKeyboardMarkup2.serializeToStream(nativeByteBuffer2);
                nativeByteBuffer2.rewind();
                while (true) {
                    if (objectSize < 8) {
                        while (objectSize > 0) {
                            if (nativeByteBuffer.readByte(true) != nativeByteBuffer2.readByte(true)) {
                                break;
                            } else {
                                objectSize--;
                            }
                        }
                        return;
                    }
                    if (nativeByteBuffer.readInt64(true) != nativeByteBuffer2.readInt64(true)) {
                        break;
                    } else {
                        objectSize -= 8;
                    }
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        this.f18824c = tL_replyKeyboardMarkup;
        ArrayList arrayList = this.f18827n;
        arrayList.clear();
        ScrollView scrollView = this.f18828r;
        float scrollY = scrollView.getScrollY();
        ud.j jVar = this.f18831x;
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) ((ud.e) it.next()).f48505a;
            m0Var.setTranslationY(m0Var.getTranslationY() - scrollY);
        }
        int i10 = 0;
        scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup == null || this.f18824c.rows.isEmpty()) {
            jVar.f48521a.r(null, true);
            return;
        }
        m0 m0Var2 = new m0(getContext());
        m0Var2.setOrientation(1);
        m0Var2.setAlpha(0.0f);
        this.f18823b.addView(m0Var2);
        boolean z10 = tL_replyKeyboardMarkup.resize;
        this.f18826f = !z10;
        this.h = z10 ? 44 : (int) Math.max(44.0f, (rl.z(4.0f, this.f18824c.rows.size() - 1, this.f18825e - AndroidUtilities.dp(16.0f)) / this.f18824c.rows.size()) / AndroidUtilities.density);
        int i11 = 0;
        while (i11 < tL_replyKeyboardMarkup.rows.size()) {
            TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i11);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i10);
            m0Var2.addView(linearLayout, z5.k(8.0f, i11 == 0 ? 8.0f : 4.0f, 8.0f, i11 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : 0.0f, -1, this.h));
            float size = 1.0f / keyboardButtonRow.buttons.size();
            int i12 = 0;
            while (i12 < keyboardButtonRow.buttons.size()) {
                l0 l0Var = new l0(this, getContext(), keyboardButtonRow.buttons.get(i12));
                boolean z11 = i12 == 0;
                boolean z12 = i11 == 0;
                boolean z13 = i12 == keyboardButtonRow.buttons.size() - 1;
                boolean z14 = i11 == tL_replyKeyboardMarkup.rows.size() - 1;
                l0Var.d = z11;
                l0Var.f18796e = z12;
                l0Var.f18797f = z13;
                l0Var.h = z14;
                l0Var.a();
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.addView(l0Var, z5.c(-1.0f, -1));
                linearLayout.addView(frameLayout, z5.m(size, 0, -1, 0, i12 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                l0Var.setOnClickListener(new c5(this, 5));
                b6.b(l0Var, 0.02f, 1.5f);
                arrayList.add(l0Var);
                l0Var.a();
                i12++;
            }
            i11++;
            i10 = 0;
        }
        jVar.i(m0Var2, true);
    }

    public void setDelegate(k0 k0Var) {
        this.d = k0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.f18825e = i10;
        if (!this.f18826f || (tL_replyKeyboardMarkup = this.f18824c) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        int iMax = !this.f18826f ? 44 : (int) Math.max(44.0f, (rl.z(4.0f, this.f18824c.rows.size() - 1, this.f18825e - AndroidUtilities.dp(16.0f)) / this.f18824c.rows.size()) / AndroidUtilities.density);
        this.h = iMax;
        int iDp = AndroidUtilities.dp(iMax);
        for (ud.e eVar : this.f18831x) {
            int childCount = ((m0) eVar.f48505a).getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ((m0) eVar.f48505a).getChildAt(i11);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != iDp) {
                    layoutParams.height = iDp;
                    childAt.setLayoutParams(layoutParams);
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
