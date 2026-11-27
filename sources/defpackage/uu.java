package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class uu extends View implements zlb {
    public TL_iv.pageBlockEmbedPost E;
    public final xi5 a;
    public final ex b;
    public final ImageReceiver c;
    public final rb0 d;
    public cw e;
    public cw f;
    public cw h;
    public cw n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public uu(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.q0(hl.L(20.0f));
        imageReceiver.i0(hl.L(32.0f), hl.L(8.0f), hl.L(40.0f), hl.L(40.0f));
        this.d = new rb0((vnb) null);
    }

    @Override
    public final void k(ArrayList arrayList) {
        cw cwVar = this.f;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
        cw cwVar2 = this.e;
        if (cwVar2 != null) {
            arrayList.add(cwVar2);
        }
        cw cwVar3 = this.h;
        if (cwVar3 != null) {
            arrayList.add(cwVar3);
        }
        cw cwVar4 = this.n;
        if (cwVar4 != null) {
            arrayList.add(cwVar4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.f;
        if (cwVar != null) {
            cwVar.i(this);
        }
        cw cwVar2 = this.e;
        if (cwVar2 != null) {
            cwVar2.i(this);
        }
        cw cwVar3 = this.h;
        if (cwVar3 != null) {
            cwVar3.i(this);
        }
        cw cwVar4 = this.n;
        if (cwVar4 != null) {
            cwVar4.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.f;
        if (cwVar != null) {
            cwVar.f(this);
        }
        cw cwVar2 = this.e;
        if (cwVar2 != null) {
            cwVar2.f(this);
        }
        cw cwVar3 = this.h;
        if (cwVar3 != null) {
            cwVar3.f(this);
        }
        cw cwVar4 = this.n;
        if (cwVar4 != null) {
            cwVar4.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        int i2;
        float f;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.E;
        if (pageblockembedpost != null) {
            boolean z = pageblockembedpost instanceof vw;
            xi5 xi5Var = this.a;
            int i3 = 0;
            if (!z) {
                if (this.r) {
                    this.c.h(canvas, null);
                }
                int i4 = 54;
                if (this.f != null) {
                    canvas.save();
                    if (this.r) {
                        i2 = 54;
                    } else {
                        i2 = 0;
                    }
                    float L = hl.L(i2 + 32);
                    if (this.e != null) {
                        f = 10.0f;
                    } else {
                        f = 19.0f;
                    }
                    canvas.translate(L, hl.L(f));
                    o.s(xi5Var, canvas, this, 0);
                    this.f.d(canvas, this);
                    canvas.restore();
                    i = 1;
                } else {
                    i = 0;
                }
                if (this.e != null) {
                    canvas.save();
                    if (!this.r) {
                        i4 = 0;
                    }
                    canvas.translate(hl.L(i4 + 32), hl.L(29.0f));
                    o.s(xi5Var, canvas, this, i);
                    this.e.d(canvas, this);
                    canvas.restore();
                    i++;
                }
                float L2 = hl.L(18.0f);
                float L3 = hl.L(6.0f);
                float L4 = hl.L(20.0f);
                int i5 = this.y;
                if (this.E.level == 0) {
                    i3 = hl.L(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(L2, L3, L4, i5 - i3, o.s1);
                i3 = i;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.s, this.w);
                o.s(xi5Var, canvas2, this, i3);
                this.h.d(canvas2, this);
                canvas2.restore();
                i3++;
            }
            if (this.n != null) {
                canvas2.save();
                canvas2.translate(this.s, this.w + this.x);
                o.s(xi5Var, canvas2, this, i3);
                this.n.d(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(ob6.M0(2131754862, null));
        if (this.f != null) {
            sb.append(", ");
            sb.append(this.f.d.getText());
        }
        if (this.e != null) {
            sb.append(", ");
            sb.append(this.e.d.getText());
        }
        if (this.h != null) {
            sb.append(", ");
            sb.append(this.h.d.getText());
        }
        if (this.n != null) {
            sb.append(", ");
            sb.append(this.n.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onMeasure(int r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o.i(this.a, this.b, motionEvent, this, this.h, this.s, this.w)) {
            if (!o.i(this.a, this.b, motionEvent, this, this.n, this.s, this.w + this.x) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.E = pageblockembedpost;
        requestLayout();
    }
}
