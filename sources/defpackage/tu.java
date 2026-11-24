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
public final class tu extends View implements eib {
    public TL_iv.pageBlockEmbedPost E;
    public final vg5 a;
    public final dx b;
    public final ImageReceiver c;
    public final pb0 d;
    public bw e;
    public bw f;
    public bw h;
    public bw n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public tu(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.q0(gl.L(20.0f));
        imageReceiver.i0(gl.L(32.0f), gl.L(8.0f), gl.L(40.0f), gl.L(40.0f));
        this.d = new pb0((wjb) null);
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.f;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.e;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
        bw bwVar3 = this.h;
        if (bwVar3 != null) {
            arrayList.add(bwVar3);
        }
        bw bwVar4 = this.n;
        if (bwVar4 != null) {
            arrayList.add(bwVar4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.f;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.e;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
        bw bwVar3 = this.h;
        if (bwVar3 != null) {
            bwVar3.i(this);
        }
        bw bwVar4 = this.n;
        if (bwVar4 != null) {
            bwVar4.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.f;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.e;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
        bw bwVar3 = this.h;
        if (bwVar3 != null) {
            bwVar3.f(this);
        }
        bw bwVar4 = this.n;
        if (bwVar4 != null) {
            bwVar4.f(this);
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
            boolean z = pageblockembedpost instanceof uw;
            vg5 vg5Var = this.a;
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
                    float L = gl.L(i2 + 32);
                    if (this.e != null) {
                        f = 10.0f;
                    } else {
                        f = 19.0f;
                    }
                    canvas.translate(L, gl.L(f));
                    o.s(vg5Var, canvas, this, 0);
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
                    canvas.translate(gl.L(i4 + 32), gl.L(29.0f));
                    o.s(vg5Var, canvas, this, i);
                    this.e.d(canvas, this);
                    canvas.restore();
                    i++;
                }
                float L2 = gl.L(18.0f);
                float L3 = gl.L(6.0f);
                float L4 = gl.L(20.0f);
                int i5 = this.y;
                if (this.E.level == 0) {
                    i3 = gl.L(6.0f);
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
                o.s(vg5Var, canvas2, this, i3);
                this.h.d(canvas2, this);
                canvas2.restore();
                i3++;
            }
            if (this.n != null) {
                canvas2.save();
                canvas2.translate(this.s, this.w + this.x);
                o.s(vg5Var, canvas2, this, i3);
                this.n.d(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(k96.M0(2131754866, null));
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu.onMeasure(int, int):void");
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
