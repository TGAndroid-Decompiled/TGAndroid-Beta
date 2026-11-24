package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.o;
public final class cv extends FrameLayout implements sp3, eib {
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public TLRPC.PhotoSize I;
    public String J;
    public TLRPC.PhotoSize K;
    public String L;
    public TLRPC.Photo M;
    public final int N;
    public TL_iv.pageBlockPhoto O;
    public TLObject P;
    public TL_iv.PageBlock Q;
    public boolean R;
    public c27 S;
    public Drawable T;
    public boolean U;
    public final vg5 a;
    public final dx b;
    public bw c;
    public bw d;
    public final ImageReceiver e;
    public final RadialProgress2 f;
    public final eu h;
    public final byte n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public cv(Context context, vg5 vg5Var, dx dxVar, int i) {
        super(context);
        this.a = vg5Var;
        this.b = dxVar;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        eu euVar = new eu(context, vg5Var, dxVar, 1);
        this.h = euVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.N = up3.q(((o) vg5Var).Y).k();
        addView(euVar, nme.c(-2.0f, -1));
        this.n = i;
    }

    private int getIconForCurrentState() {
        int i = this.G;
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        return 4;
    }

    @Override
    public final void B(boolean z) {
        b(false);
    }

    @Override
    public final void N(String str) {
        this.f.o(true, 1.0f);
        b(true);
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z, boolean z2) {
        this.Q = null;
        this.O = pageblockphoto;
        this.P = tLObject;
        this.R = z;
        this.r = z2;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.O.url)) {
            this.T = getResources().getDrawable(2131232196);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.O;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = cx.d(pageblockphoto2.photo_id, this.P);
            if (d != null) {
                this.I = ba4.w(d.sizes, gl.Y0(false), false, null, false);
            } else {
                this.I = null;
            }
        } else {
            this.I = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z) {
        boolean z2;
        int i = ((o) this.a).Y;
        String r = ba4.r(null, this.I);
        ba4.G(i);
        File J = ba4.J(this.I, null, true, true);
        ba4.G(i);
        File J2 = ba4.J(this.I, null, false, true);
        if (!J.exists() && (J2 == null || !J2.exists())) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(r);
        RadialProgress2 radialProgress2 = this.f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z2) {
            up3.q(i).v(this);
            this.G = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z);
        } else {
            up3.q(i).a(r, null, this);
            float f = 0.0f;
            if (!this.U && !ba4.G(i).S(r)) {
                this.G = 0;
            } else {
                this.G = 1;
                Float s = fl5.z().s(r);
                if (s != null) {
                    f = s.floatValue();
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z);
            radialProgress2.o(false, f);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.h;
    }

    public TL_iv.pageBlockPhoto getCurrentBlock() {
        return this.O;
    }

    public TLObject getCurrentPage() {
        return this.P;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override
    public int getObserverTag() {
        return this.N;
    }

    @Override
    public final void i(long j, long j2) {
        this.f.o(true, Math.min(1.0f, ((float) j) / ((float) j2)));
        if (this.G != 1) {
            b(true);
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.I();
        b(false);
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.K();
        up3.q(((o) this.a).Y).v(this);
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.O == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver.B() && imageReceiver.i1 == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x(), o.q1);
        }
        imageReceiver.h(canvas2, null);
        if (imageReceiver.R0) {
            this.f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.O.url) && !(this.M instanceof btc)) {
            int measuredWidth = getMeasuredWidth() - gl.L(35.0f);
            int L = (int) (imageReceiver.M0 + gl.L(11.0f));
            this.T.setBounds(measuredWidth, L, gl.L(24.0f) + measuredWidth, gl.L(24.0f) + L);
            this.T.draw(canvas2);
        }
        bw bwVar = this.c;
        vg5 vg5Var = this.a;
        int i = 0;
        if (bwVar != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w);
            o.s(vg5Var, canvas2, this, 0);
            this.c.d(canvas2, this);
            canvas2.restore();
            i = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w + this.x);
            o.s(vg5Var, canvas2, this, i);
            this.d.d(canvas2, this);
            canvas2.restore();
        }
        o.r(canvas2, vg5Var, this.O, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(k96.M0(2131753945, null));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.Q = pageBlock;
        dx dxVar = this.b;
        if (dxVar != null && (pageblockchannel = dxVar.G) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            eu euVar = this.h;
            euVar.setBlock(pageblockchannel);
            euVar.setVisibility(0);
        }
    }

    @Override
    public final void l(long j, long j2) {
    }
}
