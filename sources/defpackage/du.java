package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class du extends View implements zlb, ew {
    public final xi5 a;
    public final ex b;
    public cw c;
    public int d;
    public final int e;
    public TL_iv.pageBlockAuthorDate f;

    public du(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.e = hl.L(8.0f);
        this.a = xi5Var;
        this.b = exVar;
    }

    @Override
    public int getBoundLeft() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        int i = cwVar.s;
        return ik8.h(this.a, 18.0f, cwVar.k() + i);
    }

    @Override
    public int getBoundRight() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        int i = cwVar.s;
        return ik8.C(this.a, 18.0f, cwVar.l() + i);
    }

    @Override
    public int getLastLineBoundRight() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        int i = cwVar.s;
        return ik8.C(this.a, 18.0f, cwVar.m() + i);
    }

    public int getMinWidth() {
        return ik8.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f != null && this.c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            o.s(this.a, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        cw cwVar = this.c;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, cwVar));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        TLRPC.WebPage webPage;
        Spannable spannable;
        MetricAffectingSpan[] metricAffectingSpanArr;
        ?? r4;
        int indexOf;
        int L;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f;
        int i4 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            HashSet hashSet = o.d1;
            ex exVar = this.b;
            if (exVar != null) {
                webPage = exVar.F;
            } else {
                webPage = null;
            }
            CharSequence z = o.z(this.a, webPage, this, richText, richText, pageblockauthordate, size);
            i3 = size;
            if (z instanceof Spannable) {
                spannable = (Spannable) z;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable.getSpans(0, z.length(), MetricAffectingSpan.class);
            } else {
                spannable = null;
                metricAffectingSpanArr = null;
            }
            if (this.f.published_date != 0 && !TextUtils.isEmpty(z)) {
                r4 = ob6.a0(null, null, 2131754033, ob6.D0().h0().format(this.f.published_date * 1000), z);
            } else if (!TextUtils.isEmpty(z)) {
                r4 = ob6.a0(null, null, 2131754049, z);
            } else {
                r4 = ob6.D0().h0().format(this.f.published_date * 1000);
            }
            if (metricAffectingSpanArr != null) {
                try {
                    if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf((CharSequence) r4, z)) != -1) {
                        r4 = Spannable.Factory.getInstance().newSpannable(r4);
                        for (int i5 = 0; i5 < metricAffectingSpanArr.length; i5++) {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i5];
                            r4.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i5]) + indexOf, 33);
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            cw m = o.m(this.a, this, r4, null, i3 - hl.L(36.0f), this.e, this.f, this.b);
            this.c = m;
            if (m != null) {
                int height = this.c.d.getHeight() + hl.L(16.0f);
                if (exVar != null && exVar.H) {
                    L = (int) Math.floor(((i3 - this.c.d.getLineLeft(0)) - this.c.d.getLineWidth(0)) - hl.L(16.0f));
                    this.d = L;
                } else {
                    L = hl.L(18.0f);
                    this.d = L;
                }
                cw cwVar = this.c;
                cwVar.s = L;
                cwVar.w = this.e;
                i4 = height;
            } else {
                i4 = 0;
            }
        } else {
            i3 = size;
        }
        setMeasuredDimension(i3, i4);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f = pageblockauthordate;
        requestLayout();
    }
}
