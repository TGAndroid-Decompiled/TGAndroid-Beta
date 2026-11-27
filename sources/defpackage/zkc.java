package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
public final class zkc extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public kjc n;
    public TextPaint r;

    public final void a(int i, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        ykc ykcVar = new ykc(getContext(), this.n, i);
        ykcVar.a = str2;
        int L = hl.q.x - hl.L(120.0f);
        TextView textView = ykcVar.c;
        StaticLayout c = o0b.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c != null) {
            L = 0;
            for (int i2 = 0; i2 < c.getLineCount(); i2++) {
                L = (int) Math.max(L, Math.ceil(c.getLineWidth(i2)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        ykcVar.b.setImageResource(i);
        hashMap.put(str2, ykcVar);
        if (this.e) {
            this.b.add(ykcVar);
            return;
        }
        this.f = true;
        addView(ykcVar, tre.t(-2, -2, 1, 4, 0, 0, 4));
    }

    public final CharSequence b(String str) {
        if (str == null) {
            return "";
        }
        return TextUtils.ellipsize(str, this.r, hl.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        ykc ykcVar = (ykc) this.a.remove(str);
        this.n.m.remove(ykcVar);
        if (ykcVar != null) {
            if (this.e) {
                if (!this.b.remove(ykcVar)) {
                    this.c.add(ykcVar);
                    return;
                }
                return;
            }
            this.f = true;
            removeView(ykcVar);
        }
    }

    public int getChildsHight() {
        int i;
        int childCount = getChildCount();
        if (childCount > 0) {
            i = hl.L(16.0f);
        } else {
            i = 0;
        }
        return uh9.y(32.0f, childCount, i);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
