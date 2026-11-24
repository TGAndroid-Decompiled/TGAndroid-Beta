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
public final class cw extends FrameLayout implements cr3, fkb {
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
    public c47 S;
    public Drawable T;
    public boolean U;
    public final ui5 a;
    public final ey b;
    public bx c;
    public bx d;
    public final ImageReceiver e;
    public final RadialProgress2 f;
    public final ev h;
    public final byte n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public cw(Context context, ui5 ui5Var, ey eyVar, int i) {
        super(context);
        this.a = ui5Var;
        this.b = eyVar;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        ev evVar = new ev(context, ui5Var, eyVar, 1);
        this.h = evVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.N = er3.q(((o) ui5Var).Y).k();
        addView(evVar, qoe.c(-2.0f, -1));
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
    public final void A(boolean z) {
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
            this.T = getResources().getDrawable(2131232197);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.O;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = dy.d(pageblockphoto2.photo_id, this.P);
            if (d != null) {
                this.I = bc4.w(d.sizes, gm.Y0(false), false, null, false);
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
        String r = bc4.r(null, this.I);
        bc4.G(i);
        File J = bc4.J(this.I, null, true, true);
        bc4.G(i);
        File J2 = bc4.J(this.I, null, false, true);
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
            er3.q(i).v(this);
            this.G = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z);
        } else {
            er3.q(i).a(r, null, this);
            float f = 0.0f;
            if (!this.U && !bc4.G(i).S(r)) {
                this.G = 0;
            } else {
                this.G = 1;
                Float s = fn5.z().s(r);
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
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            arrayList.add(bxVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.I();
        b(false);
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.K();
        er3.q(((o) this.a).Y).v(this);
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.f(this);
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
        if (!TextUtils.isEmpty(this.O.url) && !(this.M instanceof cvc)) {
            int measuredWidth = getMeasuredWidth() - gm.L(35.0f);
            int L = (int) (imageReceiver.M0 + gm.L(11.0f));
            this.T.setBounds(measuredWidth, L, gm.L(24.0f) + measuredWidth, gm.L(24.0f) + L);
            this.T.draw(canvas2);
        }
        bx bxVar = this.c;
        ui5 ui5Var = this.a;
        int i = 0;
        if (bxVar != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w);
            o.s(ui5Var, canvas2, this, 0);
            this.c.d(canvas2, this);
            canvas2.restore();
            i = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w + this.x);
            o.s(ui5Var, canvas2, this, i);
            this.d.d(canvas2, this);
            canvas2.restore();
        }
        o.r(canvas2, ui5Var, this.O, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(jb6.M0(2131753913, null));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.Q = pageBlock;
        ey eyVar = this.b;
        if (eyVar != null && (pageblockchannel = eyVar.G) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            ev evVar = this.h;
            evVar.setBlock(pageblockchannel);
            evVar.setVisibility(0);
        }
    }

    @Override
    public final void l(long j, long j2) {
    }
}
