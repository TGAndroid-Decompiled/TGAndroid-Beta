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
public final class tv extends View implements fkb {
    public TL_iv.pageBlockEmbedPost E;
    public final ui5 a;
    public final ey b;
    public final ImageReceiver c;
    public final pc0 d;
    public bx e;
    public bx f;
    public bx h;
    public bx n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public tv(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.q0(gm.L(20.0f));
        imageReceiver.i0(gm.L(32.0f), gm.L(8.0f), gm.L(40.0f), gm.L(40.0f));
        this.d = new pc0((ylb) null);
    }

    @Override
    public final void k(ArrayList arrayList) {
        bx bxVar = this.f;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        bx bxVar2 = this.e;
        if (bxVar2 != null) {
            arrayList.add(bxVar2);
        }
        bx bxVar3 = this.h;
        if (bxVar3 != null) {
            arrayList.add(bxVar3);
        }
        bx bxVar4 = this.n;
        if (bxVar4 != null) {
            arrayList.add(bxVar4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.f;
        if (bxVar != null) {
            bxVar.i(this);
        }
        bx bxVar2 = this.e;
        if (bxVar2 != null) {
            bxVar2.i(this);
        }
        bx bxVar3 = this.h;
        if (bxVar3 != null) {
            bxVar3.i(this);
        }
        bx bxVar4 = this.n;
        if (bxVar4 != null) {
            bxVar4.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.f;
        if (bxVar != null) {
            bxVar.f(this);
        }
        bx bxVar2 = this.e;
        if (bxVar2 != null) {
            bxVar2.f(this);
        }
        bx bxVar3 = this.h;
        if (bxVar3 != null) {
            bxVar3.f(this);
        }
        bx bxVar4 = this.n;
        if (bxVar4 != null) {
            bxVar4.f(this);
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
            boolean z = pageblockembedpost instanceof ux;
            ui5 ui5Var = this.a;
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
                    float L = gm.L(i2 + 32);
                    if (this.e != null) {
                        f = 10.0f;
                    } else {
                        f = 19.0f;
                    }
                    canvas.translate(L, gm.L(f));
                    o.s(ui5Var, canvas, this, 0);
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
                    canvas.translate(gm.L(i4 + 32), gm.L(29.0f));
                    o.s(ui5Var, canvas, this, i);
                    this.e.d(canvas, this);
                    canvas.restore();
                    i++;
                }
                float L2 = gm.L(18.0f);
                float L3 = gm.L(6.0f);
                float L4 = gm.L(20.0f);
                int i5 = this.y;
                if (this.E.level == 0) {
                    i3 = gm.L(6.0f);
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
                o.s(ui5Var, canvas2, this, i3);
                this.h.d(canvas2, this);
                canvas2.restore();
                i3++;
            }
            if (this.n != null) {
                canvas2.save();
                canvas2.translate(this.s, this.w + this.x);
                o.s(ui5Var, canvas2, this, i3);
                this.n.d(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(jb6.M0(2131754866, null));
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv.onMeasure(int, int):void");
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
