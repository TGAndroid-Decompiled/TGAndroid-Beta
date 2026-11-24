package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.o;
public final class xw extends FrameLayout implements cr3, fkb {
    public static final int W = 0;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public boolean K;
    public final int L;
    public TL_iv.pageBlockVideo M;
    public yw N;
    public TL_iv.PageBlock O;
    public TLRPC.Document P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public c47 U;
    public boolean V;
    public final ui5 a;
    public final ey b;
    public bx c;
    public bx d;
    public final ImageReceiver e;
    public final FrameLayout f;
    public final jy h;
    public final TextureView n;
    public final RadialProgress2 r;
    public final ev s;
    public final byte w;
    public boolean x;
    public int y;

    public xw(Context context, ui5 ui5Var, ey eyVar, int i) {
        super(context);
        this.a = ui5Var;
        this.b = eyVar;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.G0 = true;
        imageReceiver.H0 = true;
        this.w = i;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.L = er3.q(((o) ui5Var).Y).k();
        ev evVar = new ev(context, ui5Var, eyVar, 1);
        this.s = evVar;
        jy jyVar = new jy(context);
        this.h = jyVar;
        jyVar.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f = frameLayout;
        jyVar.addView(textureView, qoe.e(-1, -2, 1));
        frameLayout.addView(jyVar, qoe.e(-1, -1, 17));
        addView(frameLayout, qoe.c(-2.0f, -1));
        addView(evVar, qoe.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i = this.J;
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 8;
        }
        if (i == 3) {
            return 0;
        }
        return 4;
    }

    @Override
    public final void A(boolean z) {
        e(false);
    }

    @Override
    public final void N(String str) {
        this.r.o(true, 1.0f);
        if (this.Q) {
            this.J = 2;
            a();
            return;
        }
        e(true);
    }

    public final void a() {
        int i = ((o) this.a).Y;
        int i2 = this.J;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.r;
        if (i2 == 0) {
            this.T = false;
            radialProgress2.o(false, 0.0f);
            boolean z = this.Q;
            ey eyVar = this.b;
            if (z) {
                imageReceiver.Z(gn5.b(this.P), null, gn5.c(bc4.w(this.P.thumbs, 40, false, null, false), this.P), "80_80_b", null, this.P.size, null, eyVar.F, 1);
            } else {
                bc4.G(i).X(this.P, eyVar.F, 1, 1);
            }
            this.J = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
        } else if (i2 == 1) {
            this.T = true;
            if (this.Q) {
                imageReceiver.c();
            } else {
                bc4.G(i).f(this.P);
            }
            this.J = 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i2 == 2) {
            imageReceiver.u0 = true;
            imageReceiver.w0(false);
            this.J = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
        }
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, yw ywVar, boolean z, boolean z2) {
        boolean z3;
        ui5 ui5Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.M;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (ui5Var = this.a).x) != null && ui5Var.y == this) {
            vh6 vh6Var = ui5Var.E;
            long j = pageblockvideo2.video_id;
            yw a = yw.a(videoPlayerHolderBase, this);
            this.N = a;
            vh6Var.k(a, j);
        }
        this.M = pageblockvideo;
        this.N = ywVar;
        TLRPC.Document document = null;
        this.O = null;
        this.R = z;
        ey eyVar = this.b;
        if (eyVar != null) {
            document = dy.a(eyVar.F, pageblockvideo.video_id);
            this.P = document;
        } else {
            this.P = null;
        }
        if (!k47.J4(document) && !k47.s3(this.P, false)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.Q = z3;
        this.x = z2;
        this.s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(yw ywVar) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        yw ywVar2 = this.N;
        if (ywVar2 != null && (bitmap2 = ywVar.b) != null && (bitmap3 = ywVar2.b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            ywVar2 = this.N;
            ywVar2.b = null;
        }
        if (ywVar2 != null && ywVar.b == null && (bitmap = ywVar2.b) != null) {
            ywVar.a = ywVar2.a;
            ywVar.b = bitmap;
        }
        this.N = ywVar;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (!this.V) {
                this.V = true;
                imageReceiver.I();
                e(false);
            }
        } else if (!this.V) {
        } else {
            this.V = false;
            TL_iv.pageBlockVideo pageblockvideo = this.M;
            ui5 ui5Var = this.a;
            if (pageblockvideo != null && (videoPlayerHolderBase = ui5Var.x) != null && ui5Var.y == this) {
                vh6 vh6Var = ui5Var.E;
                long j = pageblockvideo.video_id;
                yw a = yw.a(videoPlayerHolderBase, this);
                c(a);
                vh6Var.k(a, j);
            }
            imageReceiver.K();
            er3.q(((o) ui5Var).Y).v(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(boolean z) {
        boolean z2;
        int i = ((o) this.a).Y;
        String r = bc4.r(null, this.P);
        bc4.G(i);
        File I = bc4.I(this.P);
        bc4.G(i);
        boolean z3 = true;
        File J = bc4.J(this.P, null, true, true);
        if (!I.exists() && !J.exists()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(r);
        RadialProgress2 radialProgress2 = this.r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z2) {
            er3.q(i).v(this);
            if (!this.Q) {
                this.J = 3;
            } else {
                this.J = -1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z);
        } else {
            er3.q(i).a(r, null, this);
            yw ywVar = this.N;
            float f = 0.0f;
            if (ywVar != null && ywVar.b != null) {
                this.J = -1;
            } else {
                if (!bc4.G(i).S(r)) {
                    if (!this.T && this.S && this.Q) {
                        this.J = 1;
                    } else {
                        this.J = 0;
                    }
                } else {
                    this.J = 1;
                    Float s = fn5.z().s(r);
                    if (s != null) {
                        f = s.floatValue();
                    }
                }
                radialProgress2.setIcon(getIconForCurrentState(), z3, z);
                radialProgress2.o(false, f);
            }
            z3 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z3, z);
            radialProgress2.o(false, f);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.M;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override
    public int getObserverTag() {
        return this.L;
    }

    public TextureView getTextureView() {
        return this.n;
    }

    @Override
    public final void i(long j, long j2) {
        this.r.o(true, Math.min(1.0f, ((float) j) / ((float) j2)));
        if (this.J != 1) {
            e(true);
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
        d();
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
        d();
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
        if (this.M != null) {
            ImageReceiver imageReceiver = this.e;
            if (!imageReceiver.B() || imageReceiver.i1 != 1.0f) {
                canvas.drawRect(imageReceiver.Q0, o.q1);
            }
            imageReceiver.h(canvas, null);
            bx bxVar = this.c;
            ui5 ui5Var = this.a;
            int i = 0;
            if (bxVar != null) {
                canvas.save();
                canvas.translate(this.y, this.E);
                o.s(ui5Var, canvas, this, 0);
                this.c.d(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.y, this.E + this.F);
                o.s(ui5Var, canvas, this, i);
                this.d.d(canvas, this);
                canvas.restore();
            }
            o.r(canvas, ui5Var, this.M, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.R0) {
                this.r.draw(canvas);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(jb6.M0(2131753898, null));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override
    public final void onMeasure(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }

    @Override
    public final void l(long j, long j2) {
    }
}
