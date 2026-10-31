package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.mg0;
import org.telegram.ui.ng0;
import rf.w;
public final class e extends View {
    public final int f8533a = 1;
    public final int f8534b;
    public final Object f8535c;
    public final Object d;
    public Object e;

    public e(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f8535c = new ArrayList();
        this.e = new mg0(this, 0);
        this.d = viewGroup;
        this.f8534b = i10;
    }

    public void a() {
        mg0 mg0Var = (mg0) this.e;
        ArrayList arrayList = (ArrayList) this.f8535c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f8534b;
        if (isEmpty && getVisibility() != 8) {
            zs.f(i10).e.remove(mg0Var);
            zs.f(i10).d(mg0Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            zs.f(i10).e.remove(mg0Var);
            setVisibility(0);
        }
    }

    public void b(f fVar, boolean z10) {
        boolean z11;
        f fVar2;
        f fVar3;
        fe.b bVar = (fe.b) this.d;
        if (fVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, z10);
        if (isAttachedToWindow() && (fVar3 = (f) this.e) != null) {
            fVar3.b();
        }
        this.e = fVar;
        if (isAttachedToWindow() && (fVar2 = (f) this.e) != null) {
            fVar2.a(this);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f8533a) {
            case 0:
                super.onAttachedToWindow();
                f fVar = (f) this.e;
                if (fVar != null) {
                    fVar.a(this);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f8533a) {
            case 0:
                super.onDetachedFromWindow();
                f fVar = (f) this.e;
                if (fVar != null) {
                    fVar.b();
                    return;
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f8533a) {
            case 0:
                super.onDraw(canvas);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f7 = ((fe.b) this.d).e;
                if (f7 < 1.0f) {
                    canvas.save();
                    float f10 = 1.0f - f7;
                    canvas.scale(f10, f10, width, height);
                    ((Drawable) this.f8535c).draw(canvas);
                    canvas.restore();
                }
                if (f7 > 0.0f) {
                    float f11 = this.f8534b;
                    int L = i0.L(f11);
                    canvas.save();
                    canvas.translate((getWidth() - L) / 2, (getHeight() - L) / 2);
                    canvas.scale(f7, f7, i0.L(f11) / 2.0f, i0.L(f11) / 2.0f);
                    f fVar = (f) this.e;
                    if (fVar != null) {
                        fVar.c(canvas, i0.L(f11), i0.L(f11));
                    }
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                w wVar = (w) this.d;
                p6 p6Var = (p6) this.f8535c;
                int i10 = this.f8534b;
                wVar.b(t6.r1(0.5f, t6.w0(i10, p6Var)));
                wVar.draw(canvas);
                w wVar2 = (w) this.e;
                wVar2.b(t6.r1(0.95f, t6.w0(i10, p6Var)));
                wVar2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f8535c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((ng0) arrayList.get(i11)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f8533a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int L = i0.L(24.0f);
                int i14 = (i10 - L) / 2;
                int i15 = (i11 - L) / 2;
                ((Drawable) this.f8535c).setBounds(i14, i15, i14 + L, L + i15);
                return;
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                int i16 = i0.f16020m;
                w wVar = (w) this.d;
                wVar.c(i0.L(12.0f) + i16, 0);
                wVar.setBounds(0, 0, i10, i0.L(52.0f) + i16);
                w wVar2 = (w) this.e;
                wVar2.c(i16 / 3, 0);
                wVar2.setBounds(0, 0, i10, i16);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public e(Context context, int i10) {
        super(context);
        this.d = new fe.b(this, gr.h, 380L);
        this.f8534b = i10;
        Drawable f7 = i0.a.f(context, 2131232488);
        this.f8535c = f7;
        a7.y(this, f7, t6.f21135o7, null, PorterDuff.Mode.SRC_IN);
    }

    public e(int i10, Context context, p6 p6Var) {
        super(context);
        this.d = new w(2);
        this.e = new w(2);
        this.f8535c = p6Var;
        this.f8534b = i10;
    }
}
